package ninckblokje.hyperjaxb4.test.maven.simple;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import static ninckblokje.hyperjaxb4.test.support.util.TestHelper.assertJavaFile;
import static org.junit.Assert.assertFalse;

public class TestPersistenceXsd {

    private static final String EXPECTATIONS_DIR = "src/test/resources/noPersistence";
    private static final String GENERATED_DIR = "target/generated-sources/xjc/ninckblokje/hyperjaxb4/schema/no/persistence";

    @Test
    public void testNoPersistenceType() throws IOException {
        assertJavaFile(
                Paths.get(
                        EXPECTATIONS_DIR,
                        "expectedNoPersistenceType.java.txt"
                ),
                Paths.get(
                        GENERATED_DIR,
                        "NoPersistenceType.java"
                )
        );

        assertFalse(new File("target/generated-sources/xjc/META-INF/persistence.xml").exists());
    }
}
