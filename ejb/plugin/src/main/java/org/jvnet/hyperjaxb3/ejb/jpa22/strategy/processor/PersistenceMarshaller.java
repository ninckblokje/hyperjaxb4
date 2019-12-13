package org.jvnet.hyperjaxb3.ejb.jpa22.strategy.processor;

import org.jvnet.hyperjaxb3.persistence.jpa22.JPA22Utils;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class PersistenceMarshaller extends
		org.jvnet.hyperjaxb3.ejb.strategy.processor.PersistenceMarshaller {

	@Override
	protected Marshaller getMarshaller() throws JAXBException {
		return JPA22Utils.createMarshaller();
	}

}
