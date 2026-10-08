package cn.pokemmo.io.filter;

import f.uj0_0;
import java.io.File;
import java.io.Serializable;

public class WildcardFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 176844364689077340L;
    public final String[] names;
    public final uj0_0 caseSensitivity;

    public WildcardFileFilter(String name) {
        this.names = new String[]{name};
        this.caseSensitivity = uj0_0.Bn;
    }

    public WildcardFileFilter(String[] names) {
        this.names = names;
        this.caseSensitivity = uj0_0.Bn;
    }

    @Override
    public boolean accept(File file) {
        String name = file.getName();
        for (String value : this.names) {
            if (name == null || value == null) {
                throw new NullPointerException("The strings must not be null");
            }
            if (this.caseSensitivity.kH ? name.equals(value) : name.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File directory, String name) {
        for (String value : this.names) {
            if (name == null || value == null) {
                throw new NullPointerException("The strings must not be null");
            }
            if (this.caseSensitivity.kH ? name.equals(value) : name.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getClass().getSimpleName()).append("(");
        if (this.names != null) {
            for (int index = 0; index < this.names.length; index++) {
                if (index > 0) {
                    builder.append(",");
                }
                builder.append(this.names[index]);
            }
        }
        builder.append(")");
        return builder.toString();
    }
}
