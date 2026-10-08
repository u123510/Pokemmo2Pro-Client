package cn.pokemmo.comparator;

import f.GR;
import java.util.Comparator;

public class MonsterDisplayNameComparator implements Comparator {
    public static final MonsterDisplayNameComparator INSTANCE = new MonsterDisplayNameComparator();

    @Override
    public int compare(Object object, Object object2) {
        GR gR = (GR) object;
        return gR.oV().DR.compareTo(((GR) object2).oV().DR);
    }
}
