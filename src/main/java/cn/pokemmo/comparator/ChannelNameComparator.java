package cn.pokemmo.comparator;

import f.Yr0;
import java.util.Comparator;

public class ChannelNameComparator implements Comparator {
    @Override
    public int compare(Object object, Object object2) {
        Yr0 yr0 = (Yr0) object;
        return yr0.W90().compareTo(((Yr0) object2).W90());
    }
}
