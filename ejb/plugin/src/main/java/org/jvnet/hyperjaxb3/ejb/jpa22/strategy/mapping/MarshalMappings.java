package org.jvnet.hyperjaxb3.ejb.jpa22.strategy.mapping;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.jcp.xmlns.xml.ns.persistence.orm.EntityMappings;
import org.jvnet.hyperjaxb3.persistence.jpa22.JPA22Utils;

public class MarshalMappings extends
		org.jvnet.hyperjaxb3.ejb.strategy.mapping.MarshalMappings {

	@Override
	protected Marshaller getMarshaller() throws JAXBException {
		return JPA22Utils.createMarshaller();
	}

	@Override
	protected EntityMappings createEntityMappings() {
		final EntityMappings entityMappings = new EntityMappings();
		entityMappings.setVersion("2.2");
		return entityMappings;
	}

}
