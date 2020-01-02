package org.jvnet.hyperjaxb3.ejb.strategy.processor;

import org.jcp.xmlns.xml.ns.persistence.Persistence;

public class PersistenceFactory {

	public Persistence createPersistence() {
		final Persistence persistence = new Persistence();
		persistence.setVersion(getVersion());
		return persistence;
	}

	protected String getVersion() {
		return "2.2";
	}

}
