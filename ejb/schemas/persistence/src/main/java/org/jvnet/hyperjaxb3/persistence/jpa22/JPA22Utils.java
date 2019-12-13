package org.jvnet.hyperjaxb3.persistence.jpa22;

import org.jvnet.hyperjaxb3.persistence.util.PersistenceUtils;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JPA22Utils {

    public static Marshaller createMarshaller() throws JAXBException {
        final Marshaller marshaller = PersistenceUtils.CONTEXT
                .createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,
                JPA22Constants.SCHEMA_LOCATION);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper",
                PersistenceUtils.NAMESPACE_PREFIX_MAPPER);

        return marshaller;
    }
}
