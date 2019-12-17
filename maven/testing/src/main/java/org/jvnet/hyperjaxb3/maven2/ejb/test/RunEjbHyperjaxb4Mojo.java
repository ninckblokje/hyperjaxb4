package org.jvnet.hyperjaxb3.maven2.ejb.test;

import org.apache.maven.project.MavenProject;
import org.jvnet.hyperjaxb3.maven2.Hyperjaxb4Mojo;
import org.jvnet.jaxb2.maven2.AbstractXJC2Mojo;
import org.jvnet.jaxb2.maven2.test.RunXJC2Mojo;

public class RunEjbHyperjaxb4Mojo extends RunXJC2Mojo {

	@Override
	protected AbstractXJC2Mojo createMojo() {
		return new Hyperjaxb4Mojo();
	}

	@Override
	protected void configureMojo(AbstractXJC2Mojo mojo) {
		super.configureMojo(mojo);
		configureHyperjaxb3Mojo((Hyperjaxb4Mojo) mojo);

	}

	protected void configureHyperjaxb3Mojo(Hyperjaxb4Mojo mojo) {
		final MavenProject project = new MavenProject();
		mojo.setProject(project);
		mojo.setExtension(true);
		mojo.setDebug(true);
		// mojo.setBvariant = "ejb";
		mojo.setForceRegenerate(true);
	}

}
