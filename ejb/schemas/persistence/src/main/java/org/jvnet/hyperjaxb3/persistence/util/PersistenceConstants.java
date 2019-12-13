package org.jvnet.hyperjaxb3.persistence.util;

import org.jcp.xmlns.xml.ns.persistence.Persistence;
import org.jcp.xmlns.xml.ns.persistence.orm.Entity;

public class PersistenceConstants {

	private PersistenceConstants() {
	}

	public static final String CONTEXT_PATH = Persistence.class.getPackage()
			.getName()
			+ ":" + Entity.class.getPackage().getName();

	public static final String PERSISTENCE_NAMESPACE_URI = "http://xmlns.jcp.org/xml/ns/persistence";

	public static final String ORM_NAMESPACE_URI = "http://xmlns.jcp.org/xml/ns/persistence/orm";

}
