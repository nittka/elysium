package org.elysium.test.regression;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.junit.validation.ValidationTestHelper;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.elysium.LilyPondInjectorProvider;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilyPond;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.io.Files;

@RunWith(XtextRunner.class)
@InjectWith(LilyPondInjectorProvider.class)
public class IncludeTests {

	@Inject
	ParseHelper<LilyPond> parseHelper;
	@Inject
	ValidationTestHelper validator;

	@Test
	public void uriResolution() throws Exception{
		//this test does not cover the entire range of URI resolution of the LilyPondImportUriResolver
		//as this is no plugin test, there is no workspace and the resource URI is not platform
		//as a consequence the branches for getting files outside the workspace (relatively) included
		//and turning absolute includes within the workspace into platform URIs are not covered

		File file=new File("resources/includeResolution/theProject/score.ly");
		if(file.exists()){
			//good, Oomph setup properly populated the test project for includes
			String scoreWithAllIncludesEnabled=Files.toString(file, StandardCharsets.UTF_8).replaceAll("%\\\\include", "\\\\include");
			LilyPond model = parseHelper.parse(scoreWithAllIncludesEnabled, org.eclipse.emf.common.util.URI.createURI(file.toURI().toString()), new XtextResourceSet());
			List<Include> includes = EcoreUtil2.getAllContentsOfType(model, Include.class);
			Assert.assertTrue(includes.size()>4);
			validator.assertNoIssues(model);
		}
	}
}
