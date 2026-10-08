package cn.pokemmo.world.entity;

import f.*;

public abstract class AbstractMapEntityIndex {
    public boolean cOM1;
    public final cn.pokemmo.collection.map.LongObjectMap AG0;
    public int fp;
    public int z90;
    public boolean Yh0;

    public AbstractMapEntityIndex(cn.pokemmo.collection.map.LongObjectMap owner) {
        super();
        this.Yh0 = true;
        this.AG0 = owner;
        this.Gf();
    }

    public final void Gf() {
        this.z90 = -2;
        this.fp = -1;
        if (this.AG0.Wx) {
            this.cOM1 = true;
        } else {
            this.Gn0();
        }
    }

    public final void Gn0() {
        long[] keys = this.AG0.sm0;
        int length = keys.length;
        int index = this.fp + 1;
        this.fp = index;
        while (index < length) {
            if (keys[index] != 0L) {
                this.cOM1 = true;
                return;
            }
            index++;
            this.fp = index;
        }
        this.cOM1 = false;
    }

    public final void remove() {
        int removed = this.z90;
        if (removed == -1) {
            cn.pokemmo.collection.map.LongObjectMap map = this.AG0;
            if (map.Wx) {
                map.Wx = false;
                map.qL = null;
                this.z90 = -2;
                map.Qm0--;
                return;
            }
        } else if (removed >= 0) {
            long[] keys = this.AG0.sm0;
            Object[] values = this.AG0.Tj0;
            int mask = this.AG0.Nw0;
            int slot = (removed + 1) & mask;
            while (keys[slot] != 0L) {
                long key = keys[slot];
                int ideal = (int) ((key ^ (key >>> 32)) * -7046029254386353131L
                        >>> this.AG0.lPT7);
                if (((slot - ideal) & mask) > ((removed - ideal) & mask)) {
                    keys[removed] = key;
                    values[removed] = values[slot];
                    removed = slot;
                }
                slot = (slot + 1) & mask;
            }
            keys[removed] = 0L;
            values[removed] = null;
            if (this.z90 != removed) {
                this.fp--;
            }
            this.z90 = -2;
            this.AG0.Qm0--;
            return;
        }
        if (removed < 0) {
            throw new IllegalStateException("next must be called before remove.");
        }
    }
}
