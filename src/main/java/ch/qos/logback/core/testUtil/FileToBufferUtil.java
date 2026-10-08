package ch.qos.logback.core.testUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class FileToBufferUtil {
    public FileToBufferUtil() {
    }

    public static void readIntoList(File file, List list) throws IOException {
        if (file.getName().endsWith(".gz")) {
            gzFileReadIntoList(file, list);
        } else if (file.getName().endsWith(".zip")) {
            zipFileReadIntoList(file, list);
        } else {
            regularReadIntoList(file, list);
        }
    }

    private static void zipFileReadIntoList(File file, List list) throws IOException {
        System.out.println("Reading zip file [" + file + "]");
        ZipFile zipFile = new ZipFile(file);
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            if (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                readInputStream(zipFile.getInputStream(entry), list);
            }
            zipFile.close();
        } catch (Throwable failure) {
            try {
                zipFile.close();
            } catch (Throwable closeFailure) {
                failure.addSuppressed(closeFailure);
            }
            throw failure;
        }
    }

    public static void readInputStream(InputStream inputStream, List list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) list.add(line);
        reader.close();
    }

    public static void regularReadIntoList(File file, List list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line;
        while ((line = reader.readLine()) != null) list.add(line);
        reader.close();
    }

    public static void gzFileReadIntoList(File file, List list) throws IOException {
        FileInputStream input = new FileInputStream(file);
        readInputStream(new GZIPInputStream(input), list);
    }
}
