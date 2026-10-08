package cn.pokemmo.collection.iterator;

import f.cf_2;
import f.nf_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ObjectMapKeyIterator implements Iterable, Iterator {
    public final cn.pokemmo.collection.map.LinearObjectMap PJ0;
    public int KJ;
    public boolean Zj = true;

    public ObjectMapKeyIterator(cn.pokemmo.collection.map.LinearObjectMap cf_22) {
        this.PJ0 = cf_22;
    }

    @Override
    public final boolean hasNext() {
        if (this.Zj) {
            return this.KJ < this.PJ0.tb0;
        }
        throw new nf_1("#iterator() cannot be used nested.");
    }

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public Object next() {
        int n = this.KJ;
        cn.pokemmo.collection.map.LinearObjectMap cf_22 = this.PJ0;
        if (n < cf_22.tb0) {
            if (this.Zj) {
                this.KJ = n + 1;
                return cf_22.hv[n];
            }
            throw new nf_1("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException(String.valueOf(this.KJ));
    }

    @Override
    public void remove() {
        int n;
        this.KJ = n = this.KJ - 1;
        this.PJ0.cq(n);
    }
}
