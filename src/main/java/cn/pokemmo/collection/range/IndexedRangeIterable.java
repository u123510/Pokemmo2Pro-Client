package cn.pokemmo.collection.range;

import f.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 现代化集合类 - 原始类: f.ZY
 */
public class IndexedRangeIterable implements Iterable {

    public final int B;
    public int Lx0;
    public int coN;
    public int LPT9;
    public final HashMap px0;

    public IndexedRangeIterable(int i1) {
        this.px0 = new HashMap();
        this.B = i1;
    }

    public final boolean equals(Object v1) {
        if (this == v1) {
            return true;
        }
        if (!(v1 instanceof ZY)) {
            return false;
        }
        return ((ZY) v1).B == this.B;
    }

    public final ch0_2 HW(CH0 v1) {
        return (ch0_2) this.px0.get(v1);
    }

    public final int hashCode() {
        return this.B;
    }

    public final Iterator iterator() {
        return this.px0.values().iterator();
    }

    public final int size() {
        return this.px0.size();
    }
}
