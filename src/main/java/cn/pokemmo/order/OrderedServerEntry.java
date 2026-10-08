/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.order;

import f.*;

import f.QO;
import f.yj_2;
import f.ys_0;

public class OrderedServerEntry
implements Comparable {
    public final ys_0 KZ;
    public final yj_2 wp0;

    public OrderedServerEntry(ys_0 ys_02) {
        this.KZ = ys_02;
        this.wp0 = QO.YL0().xW(ys_02.CS());
    }

    public final int compareTo(Object object) {
        OrderedServerEntry mV2 = (OrderedServerEntry)object;
        return this.wp0.FL0().toLowerCase().compareTo(mV2.wp0.FL0().toLowerCase());
    }
}
