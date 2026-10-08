package cn.pokemmo.collection.iterator;

import f.*;
import f.zm0_0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 现代化集合类 - 原始类: f.xf0_1
 */
public class IntStepIterator implements Iterator {

    public final AtomicLong P70 = new AtomicLong(0L);
    public final long Xw0;
    public final /* synthetic */ zm0_0 gP;

    public IntStepIterator(zm0_0 zm0_02) {
        this.gP = zm0_02;
        this.Xw0 = zm0_02.d9().longValueExact();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.P70.get() < this.Xw0;
    }

    public final Object next() {
        long l = this.P70.getAndIncrement();
        if (l < this.Xw0) {
            return this.gP.ss0.RS(l);
        }
        throw new NoSuchElementException();
    }
}

