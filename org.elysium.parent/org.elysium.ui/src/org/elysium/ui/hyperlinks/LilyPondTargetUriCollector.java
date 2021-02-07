package org.elysium.ui.hyperlinks;

import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.xtext.findReferences.TargetURICollector;
import org.eclipse.xtext.findReferences.TargetURIs;

public class LilyPondTargetUriCollector extends TargetURICollector {

	@Override
	protected void doAdd(EObject object, TargetURIs targetURIs) {
		super.doAdd(object, targetURIs);
		Set<URI> uris = targetURIs.asSet();
		for (URI uri : uris) {
			//if target URI is file uri, it may still be opened in an editor with platform uri
			//so check if file exists in workspace and add as search URI
			if(uri.isFile()) {
				String fragment = uri.fragment();
				//TODO similar findFilesForLocationURI for file URIS is now used in LilyPondProposalProvider, LilyPondHyperlinkHelper, LilyPondLanguageSpecificURIEditorOpener, ProblemParser and here
				List<IResource> files = ResourceUtils.findPlatformResources(java.net.URI.create(uri.toString()));
				for (IResource iFile : files) {
					if(iFile instanceof IFile) {
						URI uriToAdd = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
						if(fragment!=null) {
							uriToAdd=uriToAdd.appendFragment(fragment);
						}
						targetURIs.addURI(uriToAdd);
					}
				}
			}
		}
	}
}
