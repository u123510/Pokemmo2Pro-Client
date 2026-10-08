package cn.pokemmo.collection.iterator;

import f.cf_2;
import f.nf_1;
import f.xn_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ObjectMapEntryIterator implements Iterable<Object>, Iterator<Object> {
    public final cn.pokemmo.collection.map.LinearObjectMap ku;
    public final xn_1 tl;
    public int Dn;
    public boolean zn;

    public ObjectMapEntryIterator(cn.pokemmo.collection.map.LinearObjectMap owner) {
        super();
        this.tl = new xn_1();
        this.zn = true;
        this.ku = owner;
    }

    @Override
    public final boolean hasNext() {
        if (!this.zn) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        return this.Dn < this.ku.tb0;
    }

    @Override
    public Iterator<Object> iterator() {
        return this;
    }

    @Override
    public void remove() {
        int index = this.Dn - 1;
        this.Dn = index;
        this.ku.cq(index);
    }

    @Override
    public Object next() {
        int index = this.Dn;
        if (index >= this.ku.tb0) {
            throw new NoSuchElementException(String.valueOf(this.Dn));
        }
        if (!this.zn) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        this.tl.I20 = this.ku.ev[index];
        this.tl.kM = this.ku.hv[index];
        this.Dn = index + 1;
        return this.tl;
    }
}
