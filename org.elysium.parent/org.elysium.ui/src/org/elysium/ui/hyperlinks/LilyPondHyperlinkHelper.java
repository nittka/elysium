package org.elysium.ui.hyperlinks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.views.file.Activator;
import org.eclipse.ui.views.file.FileView;
import org.eclipse.ui.views.file.IFileViewType;
import org.eclipse.ui.views.pdf.PdfAnnotation;
import org.eclipse.ui.views.pdf.PdfViewPage;
import org.eclipse.ui.views.pdf.PdfViewType;
import org.eclipse.util.DocumentUtils;
import org.eclipse.util.UiUtils;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.ui.score.ScoreViewType;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Provides hyperlinks in LilyPond source editors.
 */
public class LilyPondHyperlinkHelper extends HyperlinkHelper {

	@Inject
	private Provider<XtextHyperlink> hyperlinkProvider;

	@Inject
	ImportUriResolver uriResolver;

	@Override
	public IHyperlink[] createHyperlinksByOffset(XtextResource xtextResource, int offset, boolean createMultipleHyperlinks) {
		List<IHyperlink> hyperlinks = new ArrayList<IHyperlink>();
		// Get default hyperlinks
		IHyperlink[] defaultHyperlinks = super.createHyperlinksByOffset(xtextResource, offset, createMultipleHyperlinks);
		if (defaultHyperlinks != null) {
			hyperlinks.addAll(Arrays.asList(defaultHyperlinks));
		}
		// Add hyperlinks
		ILeafNode node = NodeModelUtils.findLeafNodeAtOffset(xtextResource.getParseResult().getRootNode(), offset);
		if (node != null) {
			EObject object = NodeModelUtils.findActualSemanticObjectFor(node);
			int nodeOffset = node.getOffset();
			int nodeLength = node.getLength();
			// Include -> File
			if ((object instanceof Include) && NodeModelUtils.findNodesForFeature(object, LilypondPackage.Literals.INCLUDE__IMPORT_URI).contains(node)) {
				
				Include include = (Include)object;
				String includeUri=uriResolver.resolve(include);
				URI uriToOpen=URI.createURI(includeUri);
				if(!uriToOpen.isFile() || uriToOpen.isRelative()){
					uriToOpen=null;
					Resource includedEResource=EcoreUtil2.getResource(xtextResource, includeUri);
					if(includedEResource!=null){
						IResource includedResource = ResourceUtils.convertEResourceToPlatformResource(includedEResource);
						if (includedResource != null) {
							uriToOpen = includedEResource.getURI();
						}
					}
				}
				if(uriToOpen!=null){
					int linkOffset = nodeOffset + 1; // Ignore the surrounding quotation marks
					int linkLength = nodeLength - 2;
					if ((linkOffset <= offset) && (offset < (linkOffset + linkLength))) {
						XtextHyperlink hyperlink = hyperlinkProvider.get();
						hyperlink.setHyperlinkRegion(new Region(linkOffset, linkLength));
						hyperlink.setHyperlinkText("Open included file");
						hyperlink.setURI(uriToOpen);
						hyperlinks.add(hyperlink);
					}
				}
			}
			// Source -> Score
			else {
				IResource resource = ResourceUtils.convertEResourceToPlatformResource(xtextResource);
				if (resource != null) {
					IViewPart view = UiUtils.getWorkbenchPage().findView(ScoreViewType.ID);
					if (view instanceof FileView) {
						FileView fileView = (FileView)view;
						IFileViewType<?> fileViewType = fileView.getType();
						if (fileViewType instanceof PdfViewType) {
							PdfViewType pdfViewType = (PdfViewType)fileViewType;
							PdfViewPage pdfViewPage = pdfViewType.getPage();
							if (pdfViewPage != null) {
								for (int page = 1; page <= pdfViewPage.getPageCount(); page++) {
									PdfAnnotation[] pdfAnnotations = pdfViewPage.getAnnotationsOnPage(page);
									for (PdfAnnotation pdfAnnotation : pdfAnnotations) {
										IFile targetFile = pdfAnnotation.file;
										if (resource.equals(targetFile)) {
											try {
												int annotationOffset = DocumentUtils.getOffsetOfPosition(DocumentUtils.getDocumentFromFile(targetFile), pdfAnnotation.lineNumber, pdfAnnotation.columnNumber, 1);
												if ((nodeOffset <= annotationOffset) && (annotationOffset < (nodeOffset + nodeLength))) { // TODO smarter hyperlink region
													SourceToScoreHyperlink hyperlink = new SourceToScoreHyperlink(pdfViewPage, pdfAnnotation);
													hyperlink.setHyperlinkRegion(new Region(nodeOffset, nodeLength));
													hyperlinks.add(hyperlink);
												}
											} catch (Exception e) {
												Activator.logError("Error while calculating hyperlink offset", e);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (hyperlinks.isEmpty()) { // Must return null instead of empty array if there are no hyperlinks
			return null;
		} else {
			return Iterables.toArray(hyperlinks, IHyperlink.class);
		}
	}

}