package cn.pokemmo.io.filter;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class OrFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 5767770777065432721L;
    public final ArrayList filters;

    public OrFileFilter(ArrayList filters) {
        super();
        this.filters = new ArrayList(filters);
    }

    @Override
    public boolean accept(File file) {
        for (Object value : this.filters) {
            if (((IOFileFilter) value).accept(file)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File file, String name) {
        for (Object value : this.filters) {
            if (((IOFileFilter) value).accept(file, name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append(getClass().getSimpleName()).append('(');
        if (this.filters != null) {
            for (int i = 0; i < this.filters.size(); i++) {
                if (i > 0) {
                    out.append(',');
                }
                Object value = this.filters.get(i);
                out.append(value == null ? "null" : value.toString());
            }
        }
        return out.append(')').toString();
    }
}
