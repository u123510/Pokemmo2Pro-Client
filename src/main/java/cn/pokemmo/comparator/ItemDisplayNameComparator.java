package cn.pokemmo.comparator;

import f.ce0_0;
import java.util.Comparator;

public class ItemDisplayNameComparator implements Comparator {
    public static final ItemDisplayNameComparator INSTANCE = new ItemDisplayNameComparator();

    @Override
    public int compare(Object object, Object object2) {
        ce0_0 ce0_02 = (ce0_0) object;
        return ce0_02.oV().DR.compareTo(((ce0_0) object2).oV().DR);
    }
}
