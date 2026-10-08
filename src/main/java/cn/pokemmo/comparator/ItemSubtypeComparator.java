package cn.pokemmo.comparator;

import f.ce0_0;
import java.util.Comparator;

public class ItemSubtypeComparator implements Comparator {
    public static final ItemSubtypeComparator INSTANCE = new ItemSubtypeComparator();

    @Override
    public int compare(Object object, Object object2) {
        ce0_0 ce0_02 = (ce0_0) object;
        return ce0_02.qf0.b8 - ((ce0_0) object2).qf0.b8;
    }
}
