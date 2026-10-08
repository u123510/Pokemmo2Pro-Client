package cn.pokemmo.order;

import f.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrderedItemCategoryGroup implements Comparable {
    public final mc0_1 TG0;
    public K5 Qy0;
    public int OC0;
    public final ArrayList<K5> rw0;

    public OrderedItemCategoryGroup(mc0_1 mc0_1) {
        this.rw0 = new ArrayList<>();
        this.TG0 = mc0_1;
    }

    public final void Dk(K5 k5) {
        this.rw0.add(k5);
        this.OC0 += k5.nn.PA0;
    }

    public final void p7() {
        Collections.sort(this.rw0, Comparator.comparing(K5::I7));
        this.Qy0 = (K5) this.rw0.get(0);
    }

    public final void xH0() {
        this.OC0 = this.rw0.stream().mapToInt(K5::I7).sum();
    }

    public final int r40() {
        return this.OC0;
    }

    @Override
    public final int compareTo(Object obj) {
        OrderedItemCategoryGroup other = (OrderedItemCategoryGroup) obj;
        K5 k5 = this.Qy0;
        if (k5.cL.Yt0 == l5_0.hB) {
            short s1 = X4.gA0(k5.nn.wQ);
            short s2 = X4.gA0(other.Qy0.nn.wQ);
            int idx1 = (s1 == 5001) ? Integer.MAX_VALUE : S.BA(X4.gA0(this.Qy0.nn.wQ), n70_0.l3);
            int idx2 = (s2 == 5001) ? Integer.MAX_VALUE : S.BA(X4.gA0(other.Qy0.nn.wQ), n70_0.l3);
            return Integer.compare(idx1, idx2);
        }
        return String.CASE_INSENSITIVE_ORDER.compare(k5.Ua(), other.Qy0.Ua());
    }
}
