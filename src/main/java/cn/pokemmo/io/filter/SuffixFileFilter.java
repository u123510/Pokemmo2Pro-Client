package cn.pokemmo.io.filter;

import f.uj0_0;
import java.io.File;
import java.io.Serializable;

public class SuffixFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -3389157631240246157L;
    public final String[] suffixes;
    public final uj0_0 caseSensitivity;

    public SuffixFileFilter(String[] suffixes) {
        super();
        this.suffixes = new String[suffixes.length];
        System.arraycopy(suffixes, 0, this.suffixes, 0, suffixes.length);
        this.caseSensitivity = uj0_0.Bn;
    }

    @Override
    public boolean accept(File file) {
        String name = file.getName();
        for (String suffix : this.suffixes) {
            int length = suffix.length();
            if (name.regionMatches(!this.caseSensitivity.kH, name.length() - length, suffix, 0, length)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File file, String name) {
        for (String suffix : this.suffixes) {
            int length = suffix.length();
            if (name.regionMatches(!this.caseSensitivity.kH, name.length() - length, suffix, 0, length)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(getClass().getSimpleName()).append('(');
        if (this.suffixes != null) {
            for (int index = 0; index < this.suffixes.length; index++) {
                if (index > 0) {
                    result.append(',');
                }
                result.append(this.suffixes[index]);
            }
        }
        return result.append(')').toString();
    }
}
