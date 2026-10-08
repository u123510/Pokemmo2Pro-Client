package cn.pokemmo.collection.iterator;

import f.RC0;
import f.Xy0;
import cn.pokemmo.collection.map.ObjectIntMap;
import f.nf_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SecondaryMapIterator implements Iterable, Iterator {
    public boolean iy;
    public final ObjectIntMap vs;
    public int Ic;
    public int da0;
    public boolean Zq;
    public final RC0 tY;

    public SecondaryMapIterator(ObjectIntMap map) {
        super();
        this.Zq = true;
        this.vs = map;
        this.Gb();
        this.tY = new RC0();
    }

    @Override
    public final boolean hasNext() {
        if (this.Zq) {
            return this.iy;
        }
        throw new nf_1("#iterator() cannot be used nested.");
    }

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public Object next() {
        if (!this.iy) {
            throw new NoSuchElementException();
        }
        if (!this.Zq) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        cn.pokemmo.collection.map.ObjectIntMap map = this.vs;
        Object[] keys = map.z00;
        int index = this.Ic;
        this.tY.Rp0 = keys[index];
        this.tY.Jy0 = map.V5[index];
        this.da0 = index;
        int length = keys.length;
        int next = index + 1;
        this.Ic = next;
        while (next < length && keys[next] == null) {
            next++;
            this.Ic = next;
        }
        this.iy = next < length;
        return this.tY;
    }

    public final void Gb() {
        this.da0 = -1;
        this.Ic = -1;
        Object[] keys = this.vs.z00;
        int length = keys.length;
        int next = this.Ic + 1;
        this.Ic = next;
        while (next < length && keys[next] == null) {
            next++;
            this.Ic = next;
        }
        this.iy = next < length;
    }

    public final void PRN() {
        int removed = this.da0;
        if (removed < 0) {
            throw new IllegalStateException("next must be called before remove.");
        }
        Object[] keys = this.vs.z00;
        int[] values = this.vs.V5;
        int mask = this.vs.HZ;
        int slot = (removed + 1) & mask;
        while (keys[slot] != null) {
            Object key = keys[slot];
            int ideal = (int)((long)key.hashCode() * -7046029254386353131L >>> this.vs.i00);
            if (((slot - ideal) & mask) > ((removed - ideal) & mask)) {
                keys[removed] = key;
                values[removed] = values[slot];
                removed = slot;
            }
            slot = (slot + 1) & mask;
        }
        keys[removed] = null;
        this.vs.xF--;
        if (removed != this.da0) {
            this.Ic--;
        }
        this.da0 = -1;
    }

    @Override
    public void remove() {
        this.PRN();
    }
}
