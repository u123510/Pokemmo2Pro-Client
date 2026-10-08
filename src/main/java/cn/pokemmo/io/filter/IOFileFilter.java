package cn.pokemmo.io.filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public interface IOFileFilter extends FileFilter, FilenameFilter {
    @Override
    boolean accept(File file);

    @Override
    boolean accept(File dir, String name);
}
