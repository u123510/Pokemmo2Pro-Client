package cn.pokemmo.io.filter;

import java.io.File;
import java.io.Serializable;

public class DirectoryFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -5148237843784525732L;
    public static final DirectoryFileFilter DIRECTORY = new DirectoryFileFilter();
    public static final DirectoryFileFilter INSTANCE = DIRECTORY;

    @Override
    public boolean accept(File file) {
        return file.isDirectory();
    }
}
