package cn.pokemmo.entity;

import f.av_1;
import f.cd0_2;
import java.util.Comparator;

public class RankedEntityComparatorEntry {
    public static final Comparator<RankedEntityComparatorEntry> iu0 = RankedEntityComparatorEntry::t6;
    public static final Comparator<RankedEntityComparatorEntry> CQ = RankedEntityComparatorEntry::Xx0;
    public static final Comparator<RankedEntityComparatorEntry> Gj = RankedEntityComparatorEntry::i3;
    public final int rA0;
    public final int PF0;
    public final cd0_2[] G60;
    public final int oc;
    public final av_1 ei;

    public RankedEntityComparatorEntry(int first, av_1 type, int second, int order, cd0_2[] values) {
        this.rA0 = first;
        this.PF0 = second;
        this.oc = order;
        this.G60 = values;
        this.ei = type;
    }

    public static int i3(RankedEntityComparatorEntry first, RankedEntityComparatorEntry second) {
        if (first.ei.Lq == second.ei.Lq) {
            return 0;
        }
        return first.ei.Lq > second.ei.Lq ? 1 : -1;
    }

    public static int Xx0(RankedEntityComparatorEntry first, RankedEntityComparatorEntry second) {
        if (first.PF0 == second.PF0) {
            return 0;
        }
        return first.PF0 > second.PF0 ? 1 : -1;
    }

    public static int t6(RankedEntityComparatorEntry first, RankedEntityComparatorEntry second) {
        if (first.oc == second.oc) {
            return 0;
        }
        return first.oc < second.oc ? 1 : -1;
    }
}
