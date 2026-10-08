package cn.pokemmo.comparator;

import f.GR;
import java.util.Comparator;

public class MonsterTimestampComparator implements Comparator {
    public static final MonsterTimestampComparator INSTANCE = new MonsterTimestampComparator();

    @Override
    public int compare(Object object, Object object2) {
        GR gR = (GR) object;
        object = (GR) object2;
        int n = gR.oV().gw;
        int n2 = ((GR) object).oV().gw;
        if (gR.qc) {
            n = (int) ((double) System.currentTimeMillis() / 1000.0);
        }
        if (((GR) object).qc) {
            n2 = (int) ((double) System.currentTimeMillis() / 1000.0);
        }
        return n - n2;
    }
}
