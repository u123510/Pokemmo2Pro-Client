package cn.pokemmo.comparator;

import f.HV;
import java.util.Comparator;

public class MoveSortDescendingComparator implements Comparator {
    @Override
    public int compare(Object object, Object object2) {
        HV hV = (HV) object;
        object = (HV) object2;
        int n = ((HV) object).yx0 - hV.yx0;
        if (n != 0) return n;
        n = hV.ME;
        int n2 = ((HV) object).ME;
        if (n != n2) {
            return n2 - n;
        }
        n = hV.wG;
        n2 = ((HV) object).wG;
        if (n == n2) return ((HV) object).Lpt3 - hV.Lpt3;
        return n2 - n;
    }
}
