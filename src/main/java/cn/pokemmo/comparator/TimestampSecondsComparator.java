package cn.pokemmo.comparator;

import f.zp0_0;
import java.util.Comparator;

public class TimestampSecondsComparator implements Comparator {
    public static final TimestampSecondsComparator INSTANCE = new TimestampSecondsComparator();

    @Override
    public int compare(Object object, Object object2) {
        zp0_0 zp0_02 = (zp0_0) object;
        return (int) (zp0_02.th0 / 1000L) - (int) (((zp0_0) object2).th0 / 1000L);
    }
}
