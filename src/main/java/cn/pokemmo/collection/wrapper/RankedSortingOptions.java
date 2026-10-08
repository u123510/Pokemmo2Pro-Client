package cn.pokemmo.collection.wrapper;

import f.ef_1;
import f.n80;
import f.ss_0;
import java.util.Comparator;

public class RankedSortingOptions {
    public static RankedSortingOptions po;
    public static RankedSortingOptions[] cl0;
    public final Comparator sG0;
    public final int Rc0;

    public RankedSortingOptions(int i1, Comparator v2) {
        this.Rc0 = i1;
        this.sG0 = v2;
    }

    static {
        if (f.ud_1.po == null) {
            try {
                Class.forName(f.ud_1.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
