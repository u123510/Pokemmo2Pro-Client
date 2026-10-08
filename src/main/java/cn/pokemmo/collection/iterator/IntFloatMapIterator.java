package cn.pokemmo.collection.iterator;

import f.IY;
import f.nf_1;
import f.te0_2;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntFloatMapIterator implements Iterable, Iterator {
    public boolean IS;
    public final IY aJ0;
    public int n00;
    public int wF0;
    public boolean lT;
    public final te0_2 lpT1;

    public IntFloatMapIterator(IY v1) {
        super();
        this.lT = true;
        this.aJ0 = v1;
        x50();
        this.lpT1 = new te0_2();
    }

    @Override
    public final boolean hasNext() {
        if (lT) return IS;
        throw new nf_1("#iterator() cannot be used nested.");
    }

    @Override
    public Iterator iterator() {
        return this;
    }

    @Override
    public Object next() {
        if (!IS) throw new NoSuchElementException();
        if (!lT) throw new nf_1("#iterator() cannot be used nested.");
        Object[] values = aJ0.Cu;
        int index = n00;
        lpT1.ir = values[index];
        lpT1.R60 = aJ0.lJ0[index];
        wF0 = index;
        int length = values.length;
        do {
            n00++;
            if (n00 >= length) {
                IS = false;
                return lpT1;
            }
        } while (values[n00] == null);
        IS = true;
        return lpT1;
    }

    public final void KQ() {
        int index = wF0;
        if (index < 0) throw new IllegalStateException("next must be called before remove.");
        Object[] values = aJ0.Cu;
        float[] weights = aJ0.lJ0;
        int mask = aJ0.s3;
        int scan = (index + 1) & mask;
        while (values[scan] != null) {
            Object value = values[scan];
            aJ0.getClass();
            int ideal = (int) ((long) value.hashCode() * -7046029254386353131L >>> aJ0.nd0);
            if (((scan - ideal) & mask) > ((index - ideal) & mask)) {
                values[index] = value;
                weights[index] = weights[scan];
                index = scan;
            }
            scan = (scan + 1) & mask;
        }
        values[index] = null;
        aJ0.xz--;
        if (index != wF0) n00--;
        wF0 = -1;
    }

    public final void x50() {
        wF0 = -1;
        n00 = -1;
        Object[] values = aJ0.Cu;
        int length = values.length;
        do {
            n00++;
            if (n00 >= length) {
                IS = false;
                return;
            }
        } while (values[n00] == null);
        IS = true;
    }

    @Override
    public void remove() {
        KQ();
    }
}
