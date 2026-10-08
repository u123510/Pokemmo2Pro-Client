package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileFilterUtil {
    public static void sortFileArrayByName(File[] fileArray) {
        Arrays.sort(fileArray, new Comparator<File>() {
            @Override
            public int compare(File f1, File f2) {
                return f1.getName().compareTo(f2.getName());
            }
        });
    }

    public static void reverseSortFileArrayByName(File[] fileArray) {
        Arrays.sort(fileArray, new Comparator<File>() {
            @Override
            public int compare(File f1, File f2) {
                String f1Name = f1.getName();
                return f2.getName().compareTo(f1Name);
            }
        });
    }

    public static String afterLastSlash(String s) {
        int n = s.lastIndexOf(47);
        if (n == -1) {
            return s;
        }
        return s.substring(n + 1);
    }

    public static boolean isEmptyDirectory(File dir) {
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("[" + String.valueOf(dir) + "] must be a directory");
        }
        String[] files = dir.list();
        return files == null || files.length == 0;
    }

    public static File[] filesInFolderMatchingStemRegex(File file, String stemRegex) {
        if (file == null) {
            return new File[0];
        }
        if (file.exists() && file.isDirectory()) {
            return file.listFiles((dir, name) -> Pattern.compile(stemRegex).matcher(name).matches());
        }
        return new File[0];
    }

    public static int findHighestCounter(File[] matchingFileArray, String stemRegex) {
        int max = Integer.MIN_VALUE;
        for (File file : matchingFileArray) {
            int n = extractCounter(file, stemRegex);
            if (max < n) {
                max = n;
            }
        }
        return max;
    }

    public static int extractCounter(File file, String stemRegex) {
        String name = file.getName();
        Matcher matcher = Pattern.compile(stemRegex).matcher(name);
        if (matcher.matches()) {
            return Integer.parseInt(matcher.group(1));
        }
        throw new IllegalStateException("The regex [" + stemRegex + "] should match [" + name + "]");
    }

    public static String slashify(String s) {
        return s.replace('\\', '/');
    }

    public static void removeEmptyParentDirectories(File file, int depth) {
        if (depth >= 3) {
            return;
        }
        File parent = file.getParentFile();
        if (parent.isDirectory() && isEmptyDirectory(parent)) {
            parent.delete();
            removeEmptyParentDirectories(parent, depth + 1);
        }
    }
}
