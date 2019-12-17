package ninckblokje.hyperjaxb4.test.maven.util;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.printer.PrettyPrinter;
import com.github.javaparser.printer.PrettyPrinterConfiguration;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertTrue;

public class TestHelper {

    public static void assertJavaFile(Path expectedJavaFile, Path generatedJavaFile) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(generatedJavaFile);

        PrettyPrinterConfiguration config = new PrettyPrinterConfiguration();
        config.setPrintComments(false);

        PrettyPrinter prettyPrinter = new PrettyPrinter(config);
        String generatedJavaContent = prettyPrinter.print(cu);

        String expectedJavaContent = new String(Files.readAllBytes(expectedJavaFile), "UTF-8");

        boolean equals = IOUtils.contentEqualsIgnoreEOL(
                new StringReader(expectedJavaContent),
                new StringReader(generatedJavaContent)
        );

        if (!equals) {
            System.err.println("Expected Java file:");
            System.err.println("---");
            System.err.println(expectedJavaContent);
            System.err.println("---");
            System.err.println("Generated Java file:");
            System.err.println("---");
            System.err.println(generatedJavaContent);
            System.err.println("---");
        }

        assertTrue(equals);
    }
}
