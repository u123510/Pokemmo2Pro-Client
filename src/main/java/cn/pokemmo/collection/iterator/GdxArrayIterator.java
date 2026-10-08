package cn.pokemmo.collection.iterator;

import f.es_1;
import f.nf_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GdxArrayIterator implements Iterator, Iterable {
    public final cn.pokemmo.collection.list.FastArray An0;
    public final boolean F6;
    public int g40;
    public boolean Y20 = true;

    public GdxArrayIterator(cn.pokemmo.collection.list.FastArray es_12) {
        this(es_12, true);
    }

    public GdxArrayIterator(cn.pokemmo.collection.list.FastArray es_12, boolean bl) {
        this.An0 = es_12;
        this.F6 = bl;
    }

    @Override
    public final boolean hasNext() {
        if (this.Y20) {
            return this.g40 < this.An0.KB;
        }
        throw new nf_1("#iterator() cannot be used nested.");
    }

    @Override
    public Object next() {
        int n = this.g40;
        cn.pokemmo.collection.list.FastArray es_12 = this.An0;
        if (n < es_12.KB) {
            if (this.Y20) {
                this.g40 = n + 1;
                return es_12.rZ[n];
            }
            throw new nf_1("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException(String.valueOf(this.g40));
    }

    @Override
    public void remove() {
        if (this.F6) {
            int n = this.g40 - 1;
            this.g40 = n;
            this.An0.Tx0(n);
            return;
        }
        throw new nf_1("Remove not allowed.");
    }

    @Override
    public Iterator iterator() {
        return this;
    }
}
