package cn.pokemmo.collection.iterator;

import f.cd_1;
import f.tb0_0;
import java.util.Iterator;

public class PooledEntryIterator implements Iterator {
    public tb0_0 tD;
    public tb0_0 sc0;
    public final cd_1 ew0;

    public PooledEntryIterator(cd_1 cd_12) {
        this.ew0 = cd_12;
        this.Rm();
    }

    @Override
    public final boolean hasNext() {
        return this.tD != null;
    }

    @Override
    public final void remove() {
        tb0_0 cur = this.sc0;
        if (cur != null) {
            if (cur == this.ew0.vk0) {
                this.ew0.vk0 = this.tD;
            } else {
                tb0_0 prev = cur.Zw0;
                tb0_0 next = this.tD;
                prev.AL = next;
                if (next != null) {
                    next.Zw0 = prev;
                }
            }
        }
    }

    public PooledEntryIterator Rm() {
        this.tD = this.ew0.vk0;
        this.sc0 = null;
        return this;
    }

    @Override
    public final Object next() {
        tb0_0 tb0_02 = this.tD;
        this.sc0 = tb0_02;
        this.tD = tb0_02.AL;
        return tb0_02;
    }
}
