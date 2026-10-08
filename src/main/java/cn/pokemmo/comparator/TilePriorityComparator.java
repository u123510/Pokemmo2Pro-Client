package cn.pokemmo.comparator;

import f.jr0_0;
import java.util.Comparator;

public class TilePriorityComparator implements Comparator {
    @Override
    public int compare(Object object, Object object2) {
        jr0_0 jr0_02 = (jr0_0) object;
        object = (jr0_0) object2;
        byte by = jr0_02.v;
        byte by2 = ((jr0_0) object).v;
        return by != by2 ? by - by2 : jr0_02.ye0 - ((jr0_0) object).ye0;
    }
}
