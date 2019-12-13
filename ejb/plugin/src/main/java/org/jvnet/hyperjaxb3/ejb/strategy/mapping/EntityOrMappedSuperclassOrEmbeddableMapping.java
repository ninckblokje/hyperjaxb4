package org.jvnet.hyperjaxb3.ejb.strategy.mapping;

import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.ClassOutline;
import org.jcp.xmlns.xml.ns.persistence.orm.Embeddable;
import org.jcp.xmlns.xml.ns.persistence.orm.Entity;
import org.jcp.xmlns.xml.ns.persistence.orm.MappedSuperclass;

public class EntityOrMappedSuperclassOrEmbeddableMapping implements
		ClassOutlineMapping<Object> {

	public Object process(Mapping context, ClassOutline classOutline,
			Options options) {
		final Object entityOrMappedSuperclass = context.getCustomizing()
				.getEntityOrMappedSuperclassOrEmbeddable(classOutline);

		if (entityOrMappedSuperclass instanceof Entity) {
			return context.getEntityMapping().process(context, classOutline,
					options);
		} else if (entityOrMappedSuperclass instanceof MappedSuperclass) {
			return context.getMappedSuperclassMapping().process(context,
					classOutline, options);
		} else if (entityOrMappedSuperclass instanceof Embeddable) {
			return context.getEmbeddableMapping().process(context,
					classOutline, options);
		} else {
			throw new AssertionError(
					"Either one-to-many or many-to-many mappings are expected.");
		}
	}

}
