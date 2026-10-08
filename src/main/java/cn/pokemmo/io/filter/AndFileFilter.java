package cn.pokemmo.io.filter;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class AndFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 7215974688563965257L;
    public final ArrayList filters;

    public AndFileFilter(ArrayList source) {
        super();
        this.filters = new ArrayList(source);
    }

    @Override
    public boolean accept(File file) {
        if (this.filters.isEmpty()) {
            return false;
        }
        for (Object value : this.filters) {
            if (!((IOFileFilter) value).accept(file)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean accept(File file, String name) {
        if (this.filters.isEmpty()) {
            return false;
        }
        for (Object value : this.filters) {
            if (!((IOFileFilter) value).accept(file, name)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(getClass().getSimpleName()).append('(');
        if (this.filters != null) {
            for (int i = 0; i < this.filters.size(); i++) {
                if (i > 0) {
                    result.append(',');
                }
                Object value = this.filters.get(i);
                result.append(value == null ? "null" : value.toString());
            }
        }
        return result.append(')').toString();
    }
}
