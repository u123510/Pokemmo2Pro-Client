package cn.pokemmo.collection.iterator;

import f.lf_1;
import f.nf_1;
import f.nl_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntMapValueIterator extends lf_1 implements Iterable, Iterator {
    public IntMapValueIterator(cn.pokemmo.collection.map.IntObjectMap nl_12) {
        super(nl_12);
    }

    @Override
    public final boolean hasNext() {
        if (this.nw0) {
            return this.hf0;
        }
        throw new nf_1("#iterator() cannot be used nested.");
    }

    @Override
    public Object next() {
        if (this.hf0) {
            if (this.nw0) {
                int n = this.L40;
                Object object = n == -1 ? this.iu0.Nc0 : this.iu0.Com9[n];
                this.Pp0 = n;
                this.XS();
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
