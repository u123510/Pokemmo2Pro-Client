package cn.pokemmo.collection.iterator;

import f.oe_0;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NodeSequenceIterator implements Iterator, Iterable {
    public oe_0 COM8;
    public oe_0 yv0;
    public final cn.pokemmo.collection.node.JsonElementNode ck;

    public NodeSequenceIterator(cn.pokemmo.collection.node.JsonElementNode oe_02) {
        this.ck = oe_02;
        this.COM8 = oe_02.dz0;
    }

    @Override
    public final boolean hasNext() {
        return this.COM8 != null;
    }

    @Override
    public void remove() {
        oe_0 oe_02 = this.yv0;
        oe_0 oe_03 = oe_02.cA;
        if (oe_03 == null) {
            oe_0 oe_04 = oe_02;
            this.ck.dz0 = oe_03 = oe_04.Uu;
            if (oe_03 != null) {
                oe_03.cA = null;
            }
        } else {
            oe_03.Uu = oe_02.Uu;
            oe_02 = oe_02.Uu;
            if (oe_02 != null) {
                oe_02.cA = oe_03;
            }
        }
        --this.ck.lpt3;
    }

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public Object next() {
        oe_0 oe_02;
        this.yv0 = oe_02 = this.COM8;
        if (oe_02 != null) {
            this.COM8 = oe_02.Uu;
            return oe_02;
        }
        throw new NoSuchElementException();
    }
}
