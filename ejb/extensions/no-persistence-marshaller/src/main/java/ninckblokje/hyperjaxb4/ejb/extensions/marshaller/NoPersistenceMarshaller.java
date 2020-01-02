package ninckblokje.hyperjaxb4.ejb.extensions.marshaller;

import com.sun.codemodel.JCodeModel;
import org.jcp.xmlns.xml.ns.persistence.Persistence;
import org.jvnet.hyperjaxb3.ejb.strategy.processor.PersistenceMarshaller;

public class NoPersistenceMarshaller extends PersistenceMarshaller {

    @Override
    public void marshallPersistence(JCodeModel codeModel, Persistence persistence) throws Exception {
        // do nothing
    }
}
