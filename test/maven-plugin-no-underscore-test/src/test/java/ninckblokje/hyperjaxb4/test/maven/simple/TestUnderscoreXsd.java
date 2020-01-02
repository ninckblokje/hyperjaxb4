package ninckblokje.hyperjaxb4.test.maven.simple;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import static ninckblokje.hyperjaxb4.test.support.util.TestHelper.assertJavaFile;
import static org.junit.Assert.assertTrue;

public class TestUnderscoreXsd {

    private static final String EXPECTATIONS_DIR = "src/test/resources/noUnderscore";
    private static final String GENERATED_DIR = "target/generated-sources/xjc/ninckblokje/hyperjaxb4/schema/no/underscore";

    @Test
    public void testNoUnderscoreType() throws IOException {
        assertJavaFile(
                Paths.get(
                        EXPECTATIONS_DIR,
                        "expectedNoUnderscoreType.java.txt"
                ),
                Paths.get(
                        GENERATED_DIR,
                        "NoUnderscoreType.java"
                )
        );

        assertTrue(new File("target/generated-sources/xjc/META-INF/persistence.xml").exists());
    }
}
