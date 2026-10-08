package cn.pokemmo.collection.iterator;

import f.nb_2;
import java.util.Iterator;

public abstract class AbstractIntMapIterator implements Iterable<Object>, Iterator<Object> {
    public boolean Fs;
    public final cn.pokemmo.collection.map.FastObjectMap Xw0;
    public int PL0;
    public int QX;
    public boolean X10;

    public AbstractIntMapIterator(cn.pokemmo.collection.map.FastObjectMap owner) {
        super();
        this.X10 = true;
        this.Xw0 = owner;
        this.NF0();
    }

    public void NF0() {
        this.QX = -1;
        this.PL0 = -1;
        this.iC0();
    }

    public final void iC0() {
        Object[] keys = this.Xw0.z40;
        int length = keys.length;
        int index = this.PL0 + 1;
        this.PL0 = index;
        while (index < length) {
            if (keys[index] != null) {
                this.Fs = true;
                return;
            }
            index++;
            this.PL0 = index;
        }
        this.Fs = false;
    }

    @Override
    public void remove() {
        int removed = this.QX;
        if (removed < 0) {
            throw new IllegalStateException("next must be called before remove.");
        }
        Object[] keys = this.Xw0.z40;
        Object[] values = this.Xw0.Pr;
        int mask = this.Xw0.u2;
        int slot = (removed + 1) & mask;
        while (keys[slot] != null) {
            Object key = keys[slot];
            int ideal = (int) ((long) key.hashCode() * -7046029254386353131L
                    >>> this.Xw0.qs0);
            if (((slot - ideal) & mask) > ((removed - ideal) & mask)) {
                keys[removed] = key;
                values[removed] = values[slot];
                removed = slot;
            }
            slot = (slot + 1) & mask;
        }
        keys[removed] = null;
        values[removed] = null;
        this.Xw0.Va0--;
        if (this.QX != removed) {
            this.PL0--;
        }
        this.QX = -1;
    }
}
