package cn.pokemmo.io.filter;

import java.io.File;
import java.io.Serializable;

public class NotFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 6131563330944994230L;
    public final IOFileFilter filter;

    public NotFileFilter(IOFileFilter filter) {
        if (filter != null) {
            this.filter = filter;
            return;
        }
        throw new IllegalArgumentException("The filter must not be null");
    }

    @Override
    public boolean accept(File file) {
        return !this.filter.accept(file);
    }

    @Override
    public boolean accept(File file, String name) {
        return !this.filter.accept(file, name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + this.filter.toString() + ")";
    }
}
