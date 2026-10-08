package cn.pokemmo.comparator;

import f.K5;
import java.util.Comparator;

public class CaseInsensitiveNameComparator implements Comparator {
    public CaseInsensitiveNameComparator() {
        super();
    }

    @Override
    public int compare(Object firstObject, Object secondObject) {
        K5 first = (K5) firstObject;
        K5 second = (K5) secondObject;
        int result = String.CASE_INSENSITIVE_ORDER.compare(second.Fh0(), first.Fh0());
        if (result == 0) {
            result = first.Fh0().compareTo(second.Fh0());
        }
        return result;
    }
}
