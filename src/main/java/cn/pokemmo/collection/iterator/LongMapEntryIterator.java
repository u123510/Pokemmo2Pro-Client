package cn.pokemmo.collection.iterator;

import f.J7;
import f.W3;
import f.a70_0;
import f.nf_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LongMapEntryIterator extends a70_0 implements Iterable, Iterator {
    public final W3 wF;

    public LongMapEntryIterator(cn.pokemmo.collection.map.LongObjectMap owner) {
        super(owner);
        this.wF = new W3();
    }

    @Override
    public final boolean hasNext() {
        if (!this.Yh0) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        return this.cOM1;
    }

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public Object next() {
        if (!this.cOM1) {
            throw new NoSuchElementException();
        }
        if (!this.Yh0) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        if (this.fp == -1) {
            this.wF.JL0 = 0L;
            this.wF.uG0 = this.AG0.qL;
        } else {
            this.wF.JL0 = this.AG0.sm0[this.fp];
            this.wF.uG0 = this.AG0.Tj0[this.fp];
        }
        this.z90 = this.fp;
        this.Gn0();
        return this.wF;
    }
}
