package org.jvnet.hyperjaxb3.ejb.strategy.mapping;

import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.FieldOutline;
import org.jcp.xmlns.xml.ns.persistence.orm.Embedded;
import org.jcp.xmlns.xml.ns.persistence.orm.ManyToOne;
import org.jcp.xmlns.xml.ns.persistence.orm.OneToOne;

public class ToOneMapping implements FieldOutlineMapping<Object> {

	public Object process(Mapping context, FieldOutline fieldOutline,
			Options options) {

		final Object toOne = context.getCustomizing().getToOne(fieldOutline);

		if (toOne instanceof ManyToOne) {
			return context.getManyToOneMapping().process(context, fieldOutline,
					options);
		} else if (toOne instanceof OneToOne) {
			return context.getOneToOneMapping().process(context, fieldOutline,
					options);
		} else if (toOne instanceof Embedded) {
			return context.getEmbeddedMapping().process(context, fieldOutline,
					options);
		} else {
			throw new AssertionError(
					"Either many-to-one or one-to-one mappings are expected.");
		}
	}

}
