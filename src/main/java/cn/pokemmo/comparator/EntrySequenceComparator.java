package cn.pokemmo.comparator;

import f.e70_0;
import java.util.Comparator;

public class EntrySequenceComparator implements Comparator {
    public static final EntrySequenceComparator INSTANCE = new EntrySequenceComparator();

    @Override
    public int compare(Object object, Object object2) {
        e70_0 e70_02 = (e70_0) object;
        return e70_02.yc - ((e70_0) object2).yc;
    }
}
