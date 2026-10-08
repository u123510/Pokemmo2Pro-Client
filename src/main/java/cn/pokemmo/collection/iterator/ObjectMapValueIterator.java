package cn.pokemmo.collection.iterator;

import f.cf_2;
import f.nf_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ObjectMapValueIterator implements Iterable, Iterator {
    public final cn.pokemmo.collection.map.LinearObjectMap Da0;
    public int LJ;
    public boolean gn0 = true;

    public ObjectMapValueIterator(cn.pokemmo.collection.map.LinearObjectMap cf_22) {
        this.Da0 = cf_22;
    }

    @Override
    public final boolean hasNext() {
        if (this.gn0) {
            return this.LJ < this.Da0.tb0;
        }
        throw new nf_1("#iterator() cannot be used nested.");
    }

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public Object next() {
        int n = this.LJ;
        cn.pokemmo.collection.map.LinearObjectMap cf_22 = this.Da0;
        if (n < cf_22.tb0) {
            if (this.gn0) {
                this.LJ = n + 1;
                return cf_22.ev[n];
            }
            throw new nf_1("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException(String.valueOf(this.LJ));
    }

    @Override
    public void remove() {
        int n;
        this.LJ = n = this.LJ - 1;
        this.Da0.cq(n);
    }
}
