package cn.pokemmo.comparator;

import f.X90;
import java.util.Comparator;

public class UiNodeTitleComparator implements Comparator {
    public static final UiNodeTitleComparator INSTANCE = new UiNodeTitleComparator();

    @Override
    public int compare(Object object, Object object2) {
        X90 x90 = (X90) object;
        return x90.HQ().compareTo(((X90) object2).HQ());
    }
}
