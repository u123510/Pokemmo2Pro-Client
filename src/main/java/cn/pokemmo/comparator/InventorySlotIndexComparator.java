package cn.pokemmo.comparator;

import f.ce0_0;
import java.util.Comparator;

public class InventorySlotIndexComparator implements Comparator {
    public static final InventorySlotIndexComparator INSTANCE = new InventorySlotIndexComparator();

    @Override
    public int compare(Object object, Object object2) {
        ce0_0 ce0_02 = (ce0_0) object;
        return ce0_02.ED - ((ce0_0) object2).ED;
    }
}
