package cn.pokemmo.io.filter;

import java.io.File;

public abstract class AbstractFileFilter implements IOFileFilter {
    @Override
    public boolean accept(File file, String name) {
        return accept(new File(file, name));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
