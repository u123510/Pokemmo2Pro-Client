package cn.pokemmo.collection.iterator;

import f.nf_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ObjectArrayIterator implements Iterator, Iterable {
    public final Object[] uL;
    public int COm1;
    public boolean f80 = true;

    public ObjectArrayIterator(Object[] objectArray) {
        this.uL = objectArray;
    }

    @Override
    public final boolean hasNext() {
        if (this.f80) {
            return this.COm1 < this.uL.length;
        }
        throw new nf_1("#iterator() cannot be used nested.");
    }

    @Override
    public Object next() {
        int n = this.COm1;
        Object[] objectArray = this.uL;
        if (n < this.uL.length) {
            if (this.f80) {
                this.COm1 = n + 1;
                return objectArray[n];
            }
            throw new nf_1("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException(String.valueOf(this.COm1));
    }

    @Override
    public void remove() {
        throw new nf_1("Remove not allowed.");
    }

    @Override
    public Iterator iterator() {
        return this;
    }
}
