package cn.pokemmo.comparator;

import f.DA;
import f.HV;
import java.util.Comparator;

public class MoveActionPriorityComparator implements Comparator {
    public MoveActionPriorityComparator() {
        super();
    }

    @Override
    public int compare(Object v1, Object v2) {
        HV h1 = (HV) v1;
        HV h2 = (HV) v2;
        DA d1 = h1.dE0;
        DA d2 = h2.dE0;
        boolean b1 = (d1 == null);
        boolean b2 = (d2 == null);
        if (b1 != b2) {
            int i0 = (d2 != null) ? 1 : 0;
            int i1 = (d1 != null) ? 1 : 0;
            return i0 - i1;
        }
        int w1 = h1.wG;
        int w2 = h2.wG;
        if (w1 != w2) {
            return w2 - w1;
        }
        return h2.Lpt3 - h1.Lpt3;
    }
}
