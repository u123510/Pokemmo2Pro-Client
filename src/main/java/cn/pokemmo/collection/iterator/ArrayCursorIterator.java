package cn.pokemmo.collection.iterator;

import f.*;
import f.r50_0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 现代化集合类 - 原始类: f.XT
 */
public class ArrayCursorIterator implements Iterator {

    public r50_0 oL;

    public ArrayCursorIterator(r50_0 r50_02) {
        this.oL = r50_02;
    }

    @Override
    public final boolean hasNext() {
        return this.oL != null;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Not supported");
    }

    public final Object next() {
        r50_0 r50_02 = this.oL;
        if (r50_02 != null) {
            this.oL = r50_02.g9;
            return r50_02.Wo0;
        }
        throw new NoSuchElementException();
    }
}

