package org.jvnet.hyperjaxb3.maven2.ejb.test.tests;

import java.io.File;

import org.jvnet.hyperjaxb3.maven2.ejb.test.RunEjbHyperjaxb3Mojo;

public class EjbHyperjaxb3MojoTest extends RunEjbHyperjaxb3Mojo {

	@Override
	public File getSchemaDirectory() {
		return new File(getBaseDir(), "src/test/resources");
	}

}
