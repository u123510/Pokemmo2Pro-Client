package cn.pokemmo.comparator;

import f.e70_0;
import java.util.Comparator;

public class StringKeyComparator implements Comparator {
    public static final StringKeyComparator INSTANCE = new StringKeyComparator();

    @Override
    public int compare(Object object, Object object2) {
        e70_0 e70_02 = (e70_0) object;
        return e70_02.zJ0.compareTo(((e70_0) object2).zJ0);
    }
}
