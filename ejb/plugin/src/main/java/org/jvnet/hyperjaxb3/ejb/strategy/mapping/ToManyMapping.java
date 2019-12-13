package org.jvnet.hyperjaxb3.ejb.strategy.mapping;

import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.FieldOutline;
import org.jcp.xmlns.xml.ns.persistence.orm.ManyToMany;
import org.jcp.xmlns.xml.ns.persistence.orm.OneToMany;

public class ToManyMapping implements FieldOutlineMapping<Object> {

	public Object process(Mapping context, FieldOutline fieldOutline,
			Options options) {

		final Object ToMany = context.getCustomizing().getToMany(fieldOutline);

		if (ToMany instanceof ManyToMany) {
			return context.getManyToManyMapping().process(context,
					fieldOutline, options);
		} else if (ToMany instanceof OneToMany) {
			return context.getOneToManyMapping().process(context, fieldOutline,
					options);
		} else {
			throw new AssertionError(
					"Either one-to-many or many-to-many mappings are expected.");
		}
	}

}
