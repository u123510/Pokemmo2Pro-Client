package cn.pokemmo.io.util;

import cn.pokemmo.io.filter.IOFileFilter;
import java.io.File;
import java.io.FileFilter;
import java.math.BigInteger;
import java.util.LinkedList;

public abstract class FileUtils {
    public static final int j5 = 0;

    static {
        BigInteger value = BigInteger.valueOf(1024L);
        value.multiply(value)
                .multiply(value)
                .multiply(value)
                .multiply(value)
                .multiply(value);

        BigInteger limit = BigInteger.valueOf(1152921504606846976L);
        limit.multiply(BigInteger.valueOf(1024L))
                .multiply(BigInteger.valueOf(1024L));
    }

    public static void findFiles(LinkedList<File> files, File directory, IOFileFilter filter) {
        File[] children = directory.listFiles((FileFilter) filter);
        if (children == null) {
            return;
        }

        for (File child : children) {
            if (child.isDirectory()) {
                findFiles(files, child, filter);
            } else {
                files.add(child);
            }
        }
    }
}
