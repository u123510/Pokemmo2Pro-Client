/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.rolling.RolloverFailure;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileStoreUtil {
    static final String PATH_CLASS_STR = "java.nio.file.Path";
    static final String FILES_CLASS_STR = "java.nio.file.Files";

    public static boolean areOnSameFileStore(File file, File file2) {
        if (file.exists()) {
            if (file2.exists()) {
                try {
                    return Files.getFileStore(file.toPath()).equals(Files.getFileStore(file2.toPath()));
                }
                catch (Exception exception) {
                    throw new RolloverFailure("Failed to check file store equality for [" + String.valueOf(file) + "] and [" + String.valueOf(file2) + "]", exception);
                }
            }
            throw new IllegalArgumentException("File [" + String.valueOf(file2) + "] does not exist.");
        }
        throw new IllegalArgumentException("File [" + String.valueOf(file) + "] does not exist.");
    }
}