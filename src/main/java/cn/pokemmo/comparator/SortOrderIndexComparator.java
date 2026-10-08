package cn.pokemmo.comparator;

import f.MV;
import java.util.Comparator;

public class SortOrderIndexComparator implements Comparator {
    @Override
    public int compare(Object object, Object object2) {
        MV mV = (MV) object;
        return mV.KZ.coM3 - ((MV) object2).KZ.coM3;
    }
}
