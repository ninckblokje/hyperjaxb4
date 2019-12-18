package ninckblokje.hyperjaxb4.test.maven.simple;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

import static ninckblokje.hyperjaxb4.test.support.util.TestHelper.assertJavaFile;
import static org.junit.Assert.assertTrue;

public class TestSimpleXsd {

    private static final String EXPECTATIONS_DIR = "src/test/resources/simple";
    private static final String GENERATED_DIR = "target/generated-sources/xjc/ninckblokje/hyperjaxb4/schema/simple";

    @Test
    public void testPersistenceXml() throws IOException {
        assertTrue(IOUtils.contentEqualsIgnoreEOL(
                new FileReader(Paths.get(
                        EXPECTATIONS_DIR,
                        "expectedPersistence.xml.txt"
                ).toFile()),
                new FileReader(Paths.get(
                        "target/generated-sources/xjc/META-INF",
                        "persistence.xml"
                ).toFile())
        ));
    }

    @Test
    public void testAllRequiredType() throws IOException {
        assertJavaFile(
                Paths.get(
                        EXPECTATIONS_DIR,
                        "expectedAllRequiredType.java.txt"
                ),
                Paths.get(
                        GENERATED_DIR,
                        "AllRequiredType.java"
                )
        );
    }

    @Test
    public void testAnnoxType() throws IOException {
        assertJavaFile(
                Paths.get(
                        EXPECTATIONS_DIR,
                        "expectedAnnoxType.java.txt"
                ),
                Paths.get(
                        GENERATED_DIR,
                        "AnnoxType.java"
                )
        );
    }

    @Test
    public void testCustomJpaType() throws IOException {
        assertJavaFile(
                Paths.get(
                        EXPECTATIONS_DIR,
                        "expectedCustomJpaType.java.txt"
                ),
                Paths.get(
                        GENERATED_DIR,
                        "CustomJpaType.java"
                )
        );
    }

    @Test
    public void testListType() throws IOException {
        assertJavaFile(
                Paths.get(
                        EXPECTATIONS_DIR,
                        "expectedListType.java.txt"
                ),
                Paths.get(
                        GENERATED_DIR,
                        "ListType.java"
                )
        );
    }

    @Test
    public void testProjectBaseClassType() throws IOException {
        assertJavaFile(
                Paths.get(
                        EXPECTATIONS_DIR,
                        "expectedProjectBaseClassType.java.txt"
                ),
                Paths.get(
                        GENERATED_DIR,
                        "ProjectBaseClassType.java"
                )
        );
    }
}
