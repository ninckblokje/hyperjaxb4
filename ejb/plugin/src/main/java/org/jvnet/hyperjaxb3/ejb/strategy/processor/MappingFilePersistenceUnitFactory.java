package org.jvnet.hyperjaxb3.ejb.strategy.processor;

import java.util.Collection;

import org.jcp.xmlns.xml.ns.persistence.Persistence;
import org.jvnet.jaxb2_commons.util.OutlineUtils;

import com.sun.tools.xjc.outline.ClassOutline;

public class MappingFilePersistenceUnitFactory implements
		PersistenceUnitFactory {

	public Persistence.PersistenceUnit createPersistenceUnit(
			final Collection<ClassOutline> includedClasses) {
		final Persistence.PersistenceUnit persistenceUnit = new Persistence.PersistenceUnit();
		for (final ClassOutline classOutline : includedClasses) {
			final String className = OutlineUtils.getClassName(classOutline);
			persistenceUnit.getMappingFile().add(
					className.replace('.', '/') + ".orm.xml");
		}
		return persistenceUnit;

	}
}
