package cn.pokemmo.util.collection;

import f.*;

public class PrimitiveIntOpenHashSet {
    public int dC0;
    public int[] Ms;
    public boolean wv;
    public final float ac;
    public int PI0;
    public int LS;
    public int Ws;
    public transient gq_0 pc;
    public transient gq_0 cOM4;

    public PrimitiveIntOpenHashSet() {
        this(51, 0.8f);
    }

    public PrimitiveIntOpenHashSet(int initialCapacity) {
        this(initialCapacity, 0.8f);
    }

    public PrimitiveIntOpenHashSet(int initialCapacity, float loadFactor) {
        if (loadFactor <= 0.0f || loadFactor >= 1.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + loadFactor);
        }
        this.ac = loadFactor;
        int capacity = af_1.NK(initialCapacity, loadFactor);
        this.PI0 = (int) (capacity * loadFactor);
        this.Ws = capacity - 1;
        this.LS = Long.numberOfLeadingZeros((long) this.Ws);
        this.Ms = new int[capacity];
    }

    public PrimitiveIntOpenHashSet(PrimitiveIntOpenHashSet set) {
        this((int) (set.Ms.length * set.ac), set.ac);
        System.arraycopy(set.Ms, 0, this.Ms, 0, this.Ms.length);
        this.dC0 = set.dC0;
        this.wv = set.wv;
    }

    public final void o40(int value) {
        if (value == 0) {
            if (this.wv) {
                return;
            }
            this.wv = true;
            this.dC0++;
            return;
        }

        int[] table = this.Ms;
        int index = (int) ((value * -7046029254386353131L) >>> this.LS);
        int cur = table[index];
        if (cur == 0) {
            index = -(index + 1);
        } else if (cur != value) {
            while (true) {
                index = (index + 1) & this.Ws;
                cur = table[index];
                if (cur == 0) {
                    index = -(index + 1);
                    break;
                }
                if (cur == value) {
                    break;
                }
            }
        }

        if (index >= 0) {
            return;
        }

        int insertIndex = -(index + 1);
        this.Ms[insertIndex] = value;
        if (++this.dC0 >= this.PI0) {
            int oldCapacity = table.length;
            int newCapacity = oldCapacity << 1;
            this.PI0 = (int) (newCapacity * this.ac);
            this.Ws = newCapacity - 1;
            this.LS = Long.numberOfLeadingZeros((long) this.Ws);
            int[] oldTable = this.Ms;
            this.Ms = new int[newCapacity];
            if (this.dC0 > 0) {
                for (int i = 0; i < oldCapacity; i++) {
                    int val = oldTable[i];
                    if (val != 0) {
                        int[] newTable = this.Ms;
                        int newIndex = (int) ((val * -7046029254386353131L) >>> this.LS);
                        while (newTable[newIndex] != 0) {
                            newIndex = (newIndex + 1) & this.Ws;
                        }
                        newTable[newIndex] = val;
                    }
                }
            }
        }
    }

    public final boolean q8(int value) {
        if (value == 0) {
            return this.wv;
        }
        int[] table = this.Ms;
        int index = (int) ((value * -7046029254386353131L) >>> this.LS);
        int cur = table[index];
        if (cur == 0) {
            index = -(index + 1);
        } else if (cur != value) {
            while (true) {
                index = (index + 1) & this.Ws;
                cur = table[index];
                if (cur == 0) {
                    index = -(index + 1);
                    break;
                }
                if (cur == value) {
                    break;
                }
            }
        }
        return index >= 0;
    }

    @Override
    public final int hashCode() {
        int hash = this.dC0;
        int[] table = this.Ms;
        int len = table.length;
        for (int i = 0; i < len; i++) {
            int val = table[i];
            if (val != 0) {
                hash += val;
            }
        }
        return hash;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof z5)) {
            return false;
        }
        z5 other = (z5) o;
        if (other.dC0 != this.dC0 || other.wv != this.wv) {
            return false;
        }
        int[] table = this.Ms;
        int len = table.length;
        for (int i = 0; i < len; i++) {
            int val = table[i];
            if (val != 0 && !other.q8(val)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final String toString() {
        if (this.dC0 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        int[] table = this.Ms;
        int i = table.length;
        if (this.wv) {
            sb.append("0");
        } else {
            while (i-- > 0) {
                int val = table[i];
                if (val != 0) {
                    sb.append(val);
                    break;
                }
            }
        }
        while (i-- > 0) {
            int val = table[i];
            if (val != 0) {
                sb.append(", ");
                sb.append(val);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public final gq_0 ME0() {
        if (this.pc == null) {
            this.pc = new gq_0((z5) this);
            this.cOM4 = new gq_0((z5) this);
        }
        if (!this.pc.jF0) {
            this.pc.YP();
            this.pc.jF0 = true;
            this.cOM4.jF0 = false;
            return this.pc;
        }
        this.cOM4.YP();
        this.cOM4.jF0 = true;
        this.pc.jF0 = false;
        return this.cOM4;
    }
}
