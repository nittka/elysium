package org.elysium.importuri;

import static com.google.common.collect.Iterables.transform;

import java.io.File;
import java.io.FileFilter;
import java.net.URI;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * Resolves importURIs by first searching in LilyPond's default include path.
 */
public class LilyPondImportUriResolver extends ImportUriResolver {

	@Inject
	private ILilyPondPathProvider lilyPondPathProvider;

	@Override
	public String resolve(EObject object) {
		String importUri = super.resolve(object);
		if (importUri != null) {
			org.eclipse.emf.common.util.URI currentResourceURI=null;
			if(object.eResource() != null){
				currentResourceURI = object.eResource().getURI();
			}
			LilyPondImportUri lilyPondUri = resolve(currentResourceURI, importUri);
			return lilyPondUri.getUri();
		}
		return importUri;
	}

	public LilyPondImportUri resolve(org.eclipse.emf.common.util.URI resourceURI, String importUri){
		List<URI> searchUris = Lists.newArrayList(transform(lilyPondPathProvider.getSearchPaths(), new Function<String, URI>() {
			@Override
			public URI apply(String path) {
				return stringToUri(path);
			}
		}));
		String lilypondPath = lilyPondPathProvider.getLilyPondPath();
		URI defaultSearchUri = getDefaultSearchUri(lilypondPath);
		searchUris.add(defaultSearchUri);

		for (URI searchUri : searchUris) {
			String resolvedImportUri = saferResolve(searchUri, importUri);
			if (existsFile(resolvedImportUri)) {
				//TODO fileNameCasing may be a problem here
				//TADA exists although file name is tada; LilyPond compilation works, though!
				return potentialPlatformURI(resourceURI, importUri, resolvedImportUri.toString(), true);
			}
		}
		return getFileUriOutsideWorkspace(resourceURI, importUri).or(potentialPlatformURI(resourceURI, importUri, importUri, false));
	}

	//turn absolute uris that are actually located within the workspace into platform URIS
	private LilyPondImportUri potentialPlatformURI(org.eclipse.emf.common.util.URI resourceURI, String originalImportUri, String resolvedUriString, boolean fromSearchPath){
		String uriString=resolvedUriString;
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(resolvedUriString);
		LilyPondImportUri.Type type=fromSearchPath?LilyPondImportUri.Type.searchPath:LilyPondImportUri.Type.relative;
		boolean inWorkspace=true;
		if(Platform.isRunning() && !uri.isRelative()){
			if(Path.fromPortableString(originalImportUri).isAbsolute()){
				type=LilyPondImportUri.Type.absolute;
			}
			String platformString = Platform.getLocation().toString();
			int index = uriString.indexOf(platformString);
			if(index>=0){
				String relative = uriString.substring(index+platformString.length()+1);
				uriString = org.eclipse.emf.common.util.URI.createPlatformResourceURI(relative, false).toString();
			}else{
				inWorkspace=false;
			}
		}
		return new LilyPondImportUri(originalImportUri, uriString, type, inWorkspace);
	}

	String saferResolve(URI base, String importUri){
		IPath importPath = Path.fromPortableString(importUri);
		if(importPath.isAbsolute()){
			return importPath.makeAbsolute().toFile().toURI().toString();
		}else{
			URI resolved = base.resolve(org.eclipse.emf.common.util.URI.encodeOpaquePart(importUri, true));
			return resolved.toString();
		}
	}

	private Optional<LilyPondImportUri> getFileUriOutsideWorkspace(org.eclipse.emf.common.util.URI currentResourceUri, String importUri){
		if(importUri.contains("..")){//$NON-NLS-1$
			if(currentResourceUri!=null && currentResourceUri.isPlatform()){
				IWorkspaceRoot workspaceRoot= ResourcesPlugin.getWorkspace().getRoot();
				IFile currentResourceAsIFile=workspaceRoot.getFile(Path.fromPortableString(currentResourceUri.toPlatformString(false)));
				File currentResourceAsFile = currentResourceAsIFile.getLocation().toFile();
				if (currentResourceAsFile.exists()) {
					String resolvedImportUri = saferResolve(currentResourceAsFile.toURI(), importUri);
					IFile[] importedFileFoundInWorkspace = workspaceRoot.findFilesForLocationURI(new File(URI.create(resolvedImportUri)).toURI());
					if(importedFileFoundInWorkspace.length==0){
						if (existsFile(resolvedImportUri)) {
							//must be relative, because absolute imports have been returned by the search path resolution already
							return Optional.of(new LilyPondImportUri(importUri, resolvedImportUri.toString(), LilyPondImportUri.Type.relative, false));
						}
					}
				}
			}
		}
		return Optional.absent();
	}

	public static URI getDefaultSearchUri(String lilypondPath) {
		return defaultSearchUriCache.getUnchecked(lilypondPath);
	}

	private static LoadingCache<String, URI> defaultSearchUriCache=CacheBuilder.newBuilder().maximumSize(3).build(new CacheLoader<String, URI>(){
		@Override
		public URI load(String key) throws Exception {
			URI lilypondUri = stringToUri(key);
			URI shareBaseUri=lilypondUri.resolve("../share/lilypond/");//$NON-NLS-1$
			final String lyDirectoryName="ly";//$NON-NLS-1$
			File f=new File(shareBaseUri);
			if (f.isDirectory()){
				for (File subDir : f.listFiles()) {
					if(subDir.isDirectory()){
						File[] candidates = subDir.listFiles(new FileFilter() {
							@Override
							public boolean accept(File pathname) {
								return pathname.getName().equals(lyDirectoryName);
							}
						});
						if(candidates.length>0){
							return candidates[0].toURI();
						}
					}
				}
			}
			URI defaultSearchUri = shareBaseUri.resolve("current/"+lyDirectoryName+"/"); //$NON-NLS-1$ //$NON-NLS-2$
			return defaultSearchUri;
		}
	});

	private static URI stringToUri(String lilypondPath) {
		return new File(lilypondPath).toURI();
	}

	private boolean existsFile(String resolvedImport){
		File importedFile = new File(URI.create(resolvedImport));
		return importedFile.exists();
	}

}
