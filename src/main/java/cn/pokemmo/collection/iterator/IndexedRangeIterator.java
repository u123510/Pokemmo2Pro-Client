package cn.pokemmo.collection.iterator;

import f.*;
import f.ineter.pm_1;
import f.wv_0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 现代化集合类 - 原始类: f.ta0_2
 */
public class IndexedRangeIterator implements Iterator {

    public final AtomicLong Iz;
    public final long Mm;

    public IndexedRangeIterator(wv_0 wv_02) {
        this.Iz = new AtomicLong(wv_02.iG0.kw());
        this.Mm = wv_02.r30.kw();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.Iz.get() <= this.Mm;
    }

    public final Object next() {
        long l = this.Iz.getAndIncrement();
        if (l <= this.Mm) {
            int n = (int)l;
            return new pm_1(n);
        }
        throw new NoSuchElementException();
    }
}

