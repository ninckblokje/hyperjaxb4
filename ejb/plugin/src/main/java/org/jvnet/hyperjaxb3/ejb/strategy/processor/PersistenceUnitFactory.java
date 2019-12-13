package org.jvnet.hyperjaxb3.ejb.strategy.processor;

import java.util.Collection;

import com.sun.tools.xjc.outline.ClassOutline;
import org.jcp.xmlns.xml.ns.persistence.Persistence;

public interface PersistenceUnitFactory {
	
	public Persistence.PersistenceUnit createPersistenceUnit(Collection<ClassOutline> includedClasses);

}
