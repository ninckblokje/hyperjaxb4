package org.jvnet.hyperjaxb3.ejb.strategy.processor;

import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.fmt.JTextFile;
import org.jcp.xmlns.xml.ns.persistence.Persistence;
import org.jvnet.hyperjaxb3.persistence.jpa22.JPA22Utils;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.io.Writer;

public class PersistenceMarshaller {

	protected Marshaller getMarshaller() throws JAXBException {
		return JPA22Utils.createMarshaller();
	}

	public void marshallPersistence(JCodeModel codeModel,
			Persistence persistence) throws Exception {

		// final JPackage defaultPackage = codeModel._package("");
		final JPackage metaInfPackage = codeModel._package("META-INF");

		final JTextFile persistenceXmlFile = new JTextFile("persistence.xml");

		metaInfPackage.addResourceFile(persistenceXmlFile);

		final Writer writer = new StringWriter();
		getMarshaller().marshal(persistence, writer);
		persistenceXmlFile.setContents(writer.toString());

	}
}
