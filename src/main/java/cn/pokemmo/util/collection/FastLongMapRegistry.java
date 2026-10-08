package cn.pokemmo.util.collection;

import f.*;

public class FastLongMapRegistry {
    public V9[] E2;
    public int lP;
    public ie_1 B3;

    public FastLongMapRegistry() {
    }

    public final Object B20(Object key) {
        FastLongMapRegistry current = this;
        V9 found = null;
        while (current != null) {
            V9[] table = current.E2;
            if (table != null) {
                found = (V9) a9_0.i40(table, key);
                if (found != null) {
                    break;
                }
            }
            current = current.B3;
        }
        return found == null ? null : found.T60;
    }

    public final Object t40(Object key, Object value) {
        if (key == null) {
            throw new NullPointerException("key");
        }
        Object previous = null;
        V9[] table = this.E2;
        if (table != null) {
            V9 found = (V9) a9_0.i40(table, key);
            if (found != null) {
                previous = found.T60;
                found.T60 = value;
                return previous;
            }
        }
        FastLongMapRegistry parent = this.B3;
        if (parent != null) {
            previous = parent.B20(key);
        }
        this.DD(key, value);
        return previous;
    }

    public final void zR(ie_1 replacement) {
        FastLongMapRegistry current = this.B3;
        if (current != null) {
            do {
                V9[] table = current.E2;
                if (table != null) {
                    for (V9 entry : table) {
                        V9 node = entry;
                        while (node != null) {
                            if (a9_0.i40(this.E2, node.qm) == null) {
                                this.DD(node.qm, node.T60);
                            }
                            node = (V9) node.Qk;
                        }
                    }
                }
                current = current.B3;
            } while (current != null);
            this.B3 = null;
        }
        this.B3 = replacement;
    }

    public final void DD(Object key, Object value) {
        if (this.E2 == null) {
            this.E2 = new V9[16];
        }
        this.E2 = (V9[]) a9_0.bj(this.E2, ++this.lP);
        V9 entry = new V9(key, value);
        V9[] table = this.E2;
        int index = entry.Yj0 & (table.length - 1);
        entry.Qk = table[index];
        table[index] = entry;
    }
}
