package cn.pokemmo.collection.wrapper;

import f.bk_0;
import f.bp_2;
import java.util.Comparator;

public class RankedComparatorEntry {
    public static final bp_2 Vy = new bp_2(2, bk_0.kd);
    public final Comparator Zp;
    public final int ex0;

    public RankedComparatorEntry(int n, Comparator comparator) {
        this.ex0 = n;
        this.Zp = comparator;
    }
}
