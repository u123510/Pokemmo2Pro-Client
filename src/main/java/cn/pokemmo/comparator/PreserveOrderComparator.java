package cn.pokemmo.comparator;

import f.X90;
import java.util.Comparator;

public class PreserveOrderComparator implements Comparator {
    public static final PreserveOrderComparator INSTANCE = new PreserveOrderComparator();

    public PreserveOrderComparator() {
    }

    @Override
    public int compare(Object obj1, Object obj2) {
        return -1;
    }
}
