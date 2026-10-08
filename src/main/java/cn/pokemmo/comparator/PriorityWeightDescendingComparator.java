package cn.pokemmo.comparator;

import f.ch0_2;
import java.util.Comparator;

public class PriorityWeightDescendingComparator implements Comparator {
    @Override
    public int compare(Object object, Object object2) {
        ch0_2 ch0_22 = (ch0_2) object;
        return ((ch0_2) object2).Pc0.HM - ch0_22.Pc0.HM;
    }
}
