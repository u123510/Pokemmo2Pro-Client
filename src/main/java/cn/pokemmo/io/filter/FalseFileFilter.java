package cn.pokemmo.io.filter;

import java.io.File;
import java.io.Serializable;

public class FalseFileFilter implements IOFileFilter, Serializable {
    private static final long serialVersionUID = 6210271677940926200L;
    public static final FalseFileFilter FALSE = new FalseFileFilter();
    public static final FalseFileFilter INSTANCE = FALSE;

    @Override
    public boolean accept(File file) {
        return false;
    }

    @Override
    public boolean accept(File file, String name) {
        return false;
    }
}
