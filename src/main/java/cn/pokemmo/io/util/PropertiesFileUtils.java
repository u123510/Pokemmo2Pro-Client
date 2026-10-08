package cn.pokemmo.io.util;

import cn.pokemmo.io.filter.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Properties;

public abstract class PropertiesFileUtils {
    public static Properties[] loadDirectoryProperties(File directory) {
        String[] suffixes = new String[]{"properties"};
        String[] dotSuffixes = new String[]{"." + suffixes[0]};
        SuffixFileFilter propertyFilter = new SuffixFileFilter(dotSuffixes);
        AndFileFilter filesOnly = new AndFileFilter(FileFilterUtils.toList(propertyFilter, new NotFileFilter(DirectoryFileFilter.INSTANCE)));
        AndFileFilter unused = new AndFileFilter(FileFilterUtils.toList(FalseFileFilter.INSTANCE, new NotFileFilter(DirectoryFileFilter.INSTANCE)));
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("Parameter 'directory' is not a directory: " + directory);
        }

        LinkedList<File> files = new LinkedList<>();
        FileUtils.findFiles(files, directory, new OrFileFilter(FileFilterUtils.toList(filesOnly, unused)));
        File[] discovered = files.toArray(new File[0]);
        Properties[] result = new Properties[discovered.length];
        for (int index = 0; index < discovered.length; index++) {
            FileInputStream input = null;
            try {
                File file = discovered[index];
                input = new FileInputStream(file);
                Properties properties = new Properties();
                InputStreamReader reader = new InputStreamReader(input);
                properties.load(reader);
                input.close();
                result[index] = properties;
            } catch (IOException error) {
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException ignored) {
                    }
                }
            }
        }
        return result;
    }
}
