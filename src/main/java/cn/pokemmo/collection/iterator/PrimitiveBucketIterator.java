package cn.pokemmo.collection.iterator;

import f.af_1;
import cn.pokemmo.collection.set.FastObjectSet;
import f.nf_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PrimitiveBucketIterator implements Iterable, Iterator {
    public boolean f4;
    public final FastObjectSet Gu;
    public int Qw0;
    public int uV;
    public boolean hz0;

    public PrimitiveBucketIterator(FastObjectSet owner) {
        this.hz0 = true;
        this.Gu = owner;
        this.GT();
    }

    public final void GT() {
        this.uV = -1;
        this.Qw0 = -1;
        Object[] values = this.Gu.if$;
        int length = values.length;
        int index;
        while ((index = this.Qw0 + 1) < length) {
            this.Qw0 = index;
            if (values[index] != null) {
                this.f4 = true;
                return;
            }
        }
        this.f4 = false;
    }

    @Override
    public void remove() {
        int removed = this.uV;
        if (removed < 0) {
            throw new IllegalStateException("next must be called before remove.");
        }
        Object[] values = this.Gu.if$;
        int mask = this.Gu.com9;
        int index = (removed + 1) & mask;
        while (values[index] != null) {
            Object value = values[index];
            int home = (int)(value.hashCode() * -7046029254386353131L >>> this.Gu.mr);
            if (((index - home) & mask) > ((removed - home) & mask)) {
                values[removed] = value;
                removed = index;
            }
            index = (index + 1) & mask;
        }
        values[removed] = null;
        this.Gu.g1--;
        if (removed != this.uV) {
            this.Qw0--;
        }
        this.uV = -1;
    }

    @Override
    public final boolean hasNext() {
        if (!this.hz0) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        return this.f4;
    }

    @Override
    public Object next() {
        if (!this.f4) {
            throw new NoSuchElementException();
        }
        if (!this.hz0) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        Object[] values = this.Gu.if$;
        Object result = values[this.Qw0];
        this.uV = this.Qw0;
        int length = values.length;
        int index;
        while ((index = this.Qw0 + 1) < length) {
            this.Qw0 = index;
            if (values[index] != null) {
                this.f4 = true;
                return result;
            }
        }
        this.f4 = false;
        return result;
    }

    @Override
    public Iterator iterator() {
        return this;
    }
}
