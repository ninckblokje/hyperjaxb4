package org.jvnet.hyperjaxb3.persistence.jpa22;

import org.jvnet.hyperjaxb3.persistence.util.PersistenceConstants;

public class JPA22Constants {

    private JPA22Constants() { }

    public static final String SCHEMA_LOCATION = PersistenceConstants.PERSISTENCE_NAMESPACE_URI
            + " https://raw.githubusercontent.com/jakarta-ee/persistence-spec/master/src/main/resources/javax/persistence/persistence_2_2.xsd\n"
            + PersistenceConstants.ORM_NAMESPACE_URI
            + " https://raw.githubusercontent.com/jakarta-ee/persistence-spec/master/src/main/resources/javax/persistence/orm_2_2.xsd";
}
