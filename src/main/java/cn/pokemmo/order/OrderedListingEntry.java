/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.order;

import f.*;

import f.sm0_0;
import f.vk0_1;

/*
 * Renamed from f.qr0
 */
public class OrderedListingEntry
implements Comparable {
    public final boolean A80;
    public final vk0_1 Cm;
    public final int zI0;

    public OrderedListingEntry(vk0_1 vk0_12, boolean bl, int n) {
        this.Cm = vk0_12;
        this.A80 = bl;
        this.zI0 = n;
    }

    public final int compareTo(Object object) {
        object = (OrderedListingEntry)object;
        boolean bl = ((OrderedListingEntry)object).A80;
        boolean bl2 = this.A80;
        return bl != bl2 ? Boolean.compare(bl, bl2) : sm0_0.c0(this.Cm.bt).compareTo(sm0_0.c0(((OrderedListingEntry)object).Cm.bt));
    }
}

