package ch.qos.logback.core.testUtil;

import java.io.File;

public class FileTestUtil {
    public FileTestUtil() {
    }

    public static void makeTestOutputDir() {
        File target = new File("target/");
        if (!target.exists() || !target.isDirectory()) {
            throw new IllegalStateException("target/ does not exist");
        }
        File output = new File("target/test-output/");
        if (!output.exists() && !output.mkdir()) {
            throw new IllegalStateException("Failed to create " + output);
        }
    }
}
