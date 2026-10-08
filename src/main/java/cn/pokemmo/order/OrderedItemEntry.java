package cn.pokemmo.order;

import f.*;

public class OrderedItemEntry implements Comparable {
    public final int I4;
    public final mc0_1 G9;

    public OrderedItemEntry(mc0_1 v1) {
        this.G9 = v1;
        this.I4 = S.os0(v1.rX(), n70_0.l3);
    }

    public final String toString() {
        return sm0_0.c0(this.G9.Nl);
    }

    public final int compareTo(Object v1) {
        return Integer.compare(this.I4, ((OrderedItemEntry) v1).I4);
    }
}
