package cn.pokemmo.comparator;

import f.ce0_0;
import java.util.Comparator;

public class ItemTimestampComparator implements Comparator {
    public static final ItemTimestampComparator INSTANCE = new ItemTimestampComparator();

    @Override
    public int compare(Object object, Object object2) {
        ce0_0 ce0_02 = (ce0_0) object;
        object = (ce0_0) object2;
        int n = ce0_02.oV().gw;
        int n2 = ((ce0_0) object).oV().gw;
        if (ce0_02.mo0) {
            n = (int) ((double) System.currentTimeMillis() / 1000.0);
        }
        if (((ce0_0) object).mo0) {
            n2 = (int) ((double) System.currentTimeMillis() / 1000.0);
        }
        return n - n2;
    }
}
