package cn.pokemmo.collection.iterator;

import f.J7;
import f.a70_0;
import f.nf_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LongMapValueIterator extends a70_0 implements Iterable, Iterator {
    public LongMapValueIterator(cn.pokemmo.collection.map.LongObjectMap j7) {
        super(j7);
    }

    @Override
    public final boolean hasNext() {
        if (this.Yh0) {
            return this.cOM1;
        }
        throw new nf_1("#iterator() cannot be used nested.");
    }

    @Override
    public Object next() {
        if (this.cOM1) {
            if (this.Yh0) {
                int n = this.fp;
                Object object = n == -1 ? this.AG0.qL : this.AG0.Tj0[n];
                this.z90 = n;
                this.Gn0();
                return object;
            }
            throw new nf_1("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException();
    }

    @Override
    public Iterator iterator() {
        return this;
    }
}
