package cn.pokemmo.collection.iterator;

import f.PS;
import cn.pokemmo.collection.map.IntIntMap;
import f.cu_0;
import f.nf_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class OrderedMapEntryIterator implements Iterable, Iterator {
    public boolean Tu0;
    public final IntIntMap M20;
    public int Iy0;
    public int S3;
    public boolean wK;
    public final cu_0 vr;

    public OrderedMapEntryIterator(IntIntMap map) {
        super();
        this.wK = true;
        this.M20 = map;
        this.nA();
        this.vr = new cu_0();
    }

    @Override
    public final boolean hasNext() {
        if (!this.wK) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        return this.Tu0;
    }

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public Object next() {
        if (!this.Tu0) {
            throw new NoSuchElementException();
        }
        if (!this.wK) {
            throw new nf_1("#iterator() cannot be used nested.");
        }
        IntIntMap map = this.M20;
        int[] keys = map.oY;
        int index = this.Iy0;
        this.S3 = index;
        if (index == -1) {
            this.vr.cI = 0;
            this.vr.zz = map.LPT3;
        } else {
            this.vr.cI = keys[index];
            this.vr.zz = map.xA[index];
        }
        int length = keys.length;
        while (true) {
            index++;
            this.Iy0 = index;
            if (index >= length) {
                this.Tu0 = false;
                break;
            }
            if (keys[index] != 0) {
                this.Tu0 = true;
                break;
            }
        }
        return this.vr;
    }

    public final void nA() {
        this.S3 = -2;
        this.Iy0 = -1;
        IntIntMap map = this.M20;
        if (map.mD0) {
            this.Tu0 = true;
            return;
        }
        int[] keys = map.oY;
        int length = keys.length;
        int index = 0;
        while (++this.Iy0 < length && keys[this.Iy0] == 0) {
            index++;
        }
        this.Tu0 = this.Iy0 < length;
    }

    @Override
    public void remove() {
        this.o();
    }

    public final void o() {
        int removed = this.S3;
        IntIntMap map = this.M20;
        if (removed == -1 && map.mD0) {
            map.mD0 = false;
        } else {
            if (removed < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            int[] keys = map.oY;
            int[] values = map.xA;
            int mask = map.jy0;
            int slot = (removed + 1) & mask;
            while (keys[slot] != 0) {
                int key = keys[slot];
                int ideal = (int) ((long) key * -7046029254386353131L >>> map.qe);
                if (((slot - ideal) & mask) <= ((removed - ideal) & mask)) {
                    slot = (slot + 1) & mask;
                    continue;
                }
                keys[removed] = key;
                values[removed] = values[slot];
                removed = slot;
                slot = (slot + 1) & mask;
            }
            keys[removed] = 0;
            if (removed != this.S3) {
                this.Iy0--;
            }
        }
        this.S3 = -2;
        map.gW--;
    }
}
