package cn.pokemmo.comparator;

import f.K40;
import java.util.Comparator;

public class AscendingOrderWithMaxDefaultComparator implements Comparator {
    @Override
    public int compare(Object object, Object object2) {
        int n;
        K40 k40 = (K40) object2;
        int n2 = ((K40) object).Nl;
        if (n2 == -1) {
            n2 = Integer.MAX_VALUE;
        }
        if ((n = k40.Nl) == -1) {
            n = Integer.MAX_VALUE;
        }
        return n2 - n;
    }
}
