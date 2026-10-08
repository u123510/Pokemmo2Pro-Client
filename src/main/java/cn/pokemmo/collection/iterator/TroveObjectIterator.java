package cn.pokemmo.collection.iterator;

import f.iw_2;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TroveObjectIterator implements Iterator {
    public final iw_2 ep;
    public final iw_2 S3;
    public int ok0;
    public int UE;
    public final iw_2 rf;

    public TroveObjectIterator(iw_2 source) {
        this.S3 = source;
        this.ok0 = source.Rv;
        this.UE = source.uT();
        this.ep = source;
        this.rf = source;
    }

    public Object Sx(int index) {
        Object value = this.rf.Yw[index];
        return value == iw_2.VW || value == iw_2.J80 ? null : value;
    }

    public final int qi0() {
        if (this.ok0 != this.S3.Rv) {
            throw new ConcurrentModificationException();
        }

        Object[] values = this.ep.Yw;
        int index = this.UE;
        while (--index > 0) {
            Object value = values[index];
            if (value != iw_2.VW && value != iw_2.J80) {
                break;
            }
        }
        return index;
    }

    @Override
    public final Object next() {
        this.zC0();
        return this.Sx(this.UE);
    }

    @Override
    public final boolean hasNext() {
        return this.RV();
    }

    public final void XI() {
        if (this.ok0 != this.S3.Rv) {
            throw new ConcurrentModificationException();
        }

        iw_2 source = this.S3;
        try {
            source.o00 = true;
            source.tq0(this.UE);
        } finally {
            source.o00 = false;
        }
        --this.ok0;
    }

    @Override
    public void remove() {
        this.XI();
    }

    public final boolean RV() {
        return this.qi0() >= 0;
    }

    public final void zC0() {
        int index = this.qi0();
        this.UE = index;
        if (index < 0) {
            throw new NoSuchElementException();
        }
    }
}
