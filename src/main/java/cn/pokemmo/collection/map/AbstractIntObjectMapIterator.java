package cn.pokemmo.collection.map;

import f.*;

public abstract class AbstractIntObjectMapIterator {
    public boolean hf0;
    public final cn.pokemmo.collection.map.IntObjectMap iu0;
    public int L40;
    public int Pp0;
    public boolean nw0;

    public AbstractIntObjectMapIterator(cn.pokemmo.collection.map.IntObjectMap owner) {
        super();
        this.nw0 = true;
        this.iu0 = owner;
        this.bu();
    }

    public final void bu() {
        this.Pp0 = -2;
        this.L40 = -1;
        if (this.iu0.Bu) {
            this.hf0 = true;
        } else {
            this.XS();
        }
    }

    public final void XS() {
        int[] keys = this.iu0.Qu0;
        int length = keys.length;
        int index = this.L40 + 1;
        this.L40 = index;
        while (index < length) {
            if (keys[index] != 0) {
                this.hf0 = true;
                return;
            }
            index++;
            this.L40 = index;
        }
        this.hf0 = false;
    }

    public final void remove() {
        int removed = this.Pp0;
        if (removed == -1) {
            cn.pokemmo.collection.map.IntObjectMap map = this.iu0;
            if (map.Bu) {
                map.Bu = false;
                map.Nc0 = null;
                this.Pp0 = -2;
                map.SZ--;
                return;
            }
        } else if (removed >= 0) {
            int[] keys = this.iu0.Qu0;
            Object[] values = this.iu0.Com9;
            int mask = this.iu0.It0;
            int slot = (removed + 1) & mask;
            while (keys[slot] != 0) {
                int key = keys[slot];
                int ideal = (int) ((long) key * -7046029254386353131L
                        >>> this.iu0.f8);
                if (((slot - ideal) & mask) > ((removed - ideal) & mask)) {
                    keys[removed] = key;
                    values[removed] = values[slot];
                    removed = slot;
                }
                slot = (slot + 1) & mask;
            }
            keys[removed] = 0;
            values[removed] = null;
            if (this.Pp0 != removed) {
                this.L40--;
            }
            this.Pp0 = -2;
            this.iu0.SZ--;
            return;
        }
        if (removed < 0) {
            throw new IllegalStateException("next must be called before remove.");
        }
    }
}
