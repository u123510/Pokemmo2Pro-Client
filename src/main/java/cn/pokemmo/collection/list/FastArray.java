package cn.pokemmo.collection.list;

import f.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class FastArray implements Iterable {
    public Object[] rZ;
    public int KB;
    public boolean yT;
    public vu_1 Yk0;

    public FastArray() {
        this(true, 16);
    }

    public FastArray(int capacity) {
        this(true, capacity);
    }

    public FastArray(boolean ordered, int capacity) {
        this.yT = ordered;
        this.rZ = new Object[capacity];
    }

    public FastArray(boolean ordered, int capacity, Class arrayType) {
        this.yT = ordered;
        this.rZ = (Object[]) iy0_0.ix(arrayType, capacity);
    }

    public FastArray(Class arrayType) {
        this(true, 16, arrayType);
    }

    public FastArray(FastArray array) {
        this(array.yT, array.KB, array.rZ.getClass().getComponentType());
        this.KB = array.KB;
        System.arraycopy(array.rZ, 0, this.rZ, 0, this.KB);
    }

    public FastArray(es_1 array) {
        this(array.yT, array.KB, array.rZ.getClass().getComponentType());
        int size = array.KB;
        this.KB = size;
        System.arraycopy(array.rZ, 0, this.rZ, 0, size);
    }

    public FastArray(Object[] array) {
        this(true, array, 0, array.length);
    }

    public FastArray(boolean ordered, Object[] array, int start, int count) {
        this(ordered, count, array.getClass().getComponentType());
        this.KB = count;
        System.arraycopy(array, start, this.rZ, 0, count);
    }

    public static FastArray r30(Object... array) {
        return new FastArray(array);
    }

    public final void Ue0(Object value) {
        Object[] items = this.rZ;
        int size = this.KB;
        if (size == items.length) {
            items = lPt8(Math.max(8, (int) (size * 1.75f)));
        }
        items[this.KB++] = value;
    }

    public final void E3(FastArray array) {
        G6(array.rZ, 0, array.KB);
    }

    public final void uL(FastArray array, int start, int count) {
        if (start + count > array.KB) {
            throw new IllegalArgumentException("start + count must be <= size: " + start + " + " + count + " <= " + array.KB);
        }
        G6(array.rZ, start, count);
    }

    public final void Lpt7(Object... array) {
        G6(array, 0, array.length);
    }

    public final void G6(Object[] array, int start, int count) {
        Object[] items = this.rZ;
        int sizeNeeded = this.KB + count;
        if (sizeNeeded > items.length) {
            items = lPt8(Math.max(Math.max(8, sizeNeeded), (int) (this.KB * 1.75f)));
        }
        System.arraycopy(array, start, items, this.KB, count);
        this.KB = sizeNeeded;
    }

    public final Object get(int index) {
        if (index >= this.KB) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + index + " >= " + this.KB);
        }
        return this.rZ[index];
    }

    public void c0(int index, Object value) {
        if (index >= this.KB) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + index + " >= " + this.KB);
        }
        this.rZ[index] = value;
    }

    public void P6(int index, Object value) {
        int size = this.KB;
        if (index > size) {
            throw new IndexOutOfBoundsException("index can't be > size: " + index + " > " + this.KB);
        }
        Object[] items = this.rZ;
        if (size == items.length) {
            items = lPt8(Math.max(8, (int) (size * 1.75f)));
        }
        if (this.yT) {
            System.arraycopy(items, index, items, index + 1, this.KB - index);
        } else {
            items[this.KB] = items[index];
        }
        items[index] = value;
        this.KB++;
    }

    public final boolean j4(Object value, boolean identity) {
        Object[] items = this.rZ;
        int i = this.KB - 1;
        if (!identity && value != null) {
            while (i >= 0) {
                if (value.equals(items[i--])) {
                    return true;
                }
            }
        } else {
            while (i >= 0) {
                if (items[i--] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int E8(Object value, boolean identity) {
        Object[] items = this.rZ;
        if (!identity && value != null) {
            for (int i = 0, n = this.KB; i < n; i++) {
                if (value.equals(items[i])) {
                    return i;
                }
            }
        } else {
            for (int i = 0, n = this.KB; i < n; i++) {
                if (items[i] == value) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean sj0(Object value, boolean identity) {
        Object[] items = this.rZ;
        if (!identity && value != null) {
            for (int i = 0, n = this.KB; i < n; i++) {
                if (value.equals(items[i])) {
                    Tx0(i);
                    return true;
                }
            }
        } else {
            for (int i = 0, n = this.KB; i < n; i++) {
                if (items[i] == value) {
                    Tx0(i);
                    return true;
                }
            }
        }
        return false;
    }

    public Object Tx0(int index) {
        int size = this.KB;
        if (index >= size) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + index + " >= " + this.KB);
        }
        Object[] items = this.rZ;
        Object value = items[index];
        this.KB = --size;
        if (this.yT) {
            System.arraycopy(items, index + 1, items, index, size - index);
        } else {
            items[index] = items[size];
        }
        items[this.KB] = null;
        return value;
    }

    public boolean fp0(FastArray array, boolean identity) {
        int size = this.KB;
        int startSize = size;
        Object[] items = this.rZ;
        if (identity) {
            for (int i = 0, n = array.KB; i < n; i++) {
                Object item = array.get(i);
                for (int ii = 0; ii < size; ii++) {
                    if (item == items[ii]) {
                        Tx0(ii);
                        size--;
                        break;
                    }
                }
            }
        } else {
            for (int i = 0, n = array.KB; i < n; i++) {
                Object item = array.get(i);
                for (int ii = 0; ii < size; ii++) {
                    if (item.equals(items[ii])) {
                        Tx0(ii);
                        size--;
                        break;
                    }
                }
            }
        }
        return size != startSize;
    }

    public Object rq0() {
        int size = this.KB;
        if (size == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        int index = --this.KB;
        Object[] items = this.rZ;
        Object item = items[index];
        items[index] = null;
        return item;
    }

    public final Object GH0() {
        int size = this.KB;
        if (size == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        return this.rZ[size - 1];
    }

    public final Object KI() {
        if (this.KB == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        return this.rZ[0];
    }

    public final boolean isEmpty() {
        return this.KB == 0;
    }

    public void clear() {
        Arrays.fill(this.rZ, 0, this.KB, null);
        this.KB = 0;
    }

    public final Object[] lPt8(int newSize) {
        Object[] items = this.rZ;
        Object[] newItems = (Object[]) Array.newInstance(items.getClass().getComponentType(), newSize);
        System.arraycopy(items, 0, newItems, 0, Math.min(this.KB, newItems.length));
        this.rZ = newItems;
        return newItems;
    }

    public void sort(Comparator comparator) {
        if (e4_0.II == null) {
            e4_0.II = new e4_0();
        }
        e4_0 e4 = e4_0.II;
        Object[] a = this.rZ;
        int left = 0;
        int right = this.KB;
        if (e4.K1 == null) {
            e4.K1 = new b7_0();
        }
        b7_0 timSort = e4.K1;
        timSort.nf0 = 0;
        int remaining = right;
        if (remaining < 2) {
            return;
        }
        if (remaining < 32) {
            int initRunLen = b7_0.pn0(left, right, comparator, a);
            b7_0.B9(a, left, right, left + initRunLen, comparator);
            return;
        }
        timSort.dd = a;
        timSort.HD0 = comparator;
        timSort.y70 = 0;
        int minRun = 0;
        int n = remaining;
        while (n >= 32) {
            minRun |= (n & 1);
            n >>= 1;
        }
        minRun += n;
        int cursor = left;
        int remainingRuns = remaining;
        do {
            int runLen = b7_0.pn0(cursor, right, comparator, a);
            if (runLen < minRun) {
                int force = (remainingRuns <= minRun) ? remainingRuns : minRun;
                b7_0.B9(a, cursor, cursor + force, cursor + runLen, comparator);
                runLen = force;
            }
            timSort.Y2[timSort.nf0] = cursor;
            timSort.BD0[timSort.nf0] = runLen;
            timSort.nf0++;
            while (timSort.nf0 > 1) {
                int n_stack = timSort.nf0 - 2;
                if (n_stack >= 1 && timSort.BD0[timSort.nf0 - 3] <= timSort.BD0[n_stack] + timSort.BD0[timSort.nf0 - 1]
                        || n_stack >= 2 && timSort.BD0[timSort.nf0 - 4] <= timSort.BD0[n_stack] + timSort.BD0[timSort.nf0 - 3]) {
                    if (timSort.BD0[timSort.nf0 - 3] < timSort.BD0[timSort.nf0 - 1]) {
                        n_stack = timSort.nf0 - 3;
                    }
                } else if (timSort.BD0[n_stack] > timSort.BD0[timSort.nf0 - 1]) {
                    break;
                }
                timSort.eL(n_stack);
            }
            cursor += runLen;
            remainingRuns -= runLen;
        } while (remainingRuns != 0);

        while (timSort.nf0 > 1) {
            int n_stack = timSort.nf0 - 2;
            if (n_stack > 0 && timSort.BD0[timSort.nf0 - 3] < timSort.BD0[timSort.nf0 - 1]) {
                n_stack = timSort.nf0 - 3;
            }
            timSort.eL(n_stack);
        }
        timSort.dd = null;
        timSort.HD0 = null;
        Object[] mh = timSort.MH;
        for (int i = 0; i < timSort.y70; i++) {
            mh[i] = null;
        }
    }

    public void Qe0() {
        Object[] items = this.rZ;
        int lastIndex = this.KB - 1;
        int n = this.KB / 2;
        for (int i = 0; i < n; i++) {
            int ii = lastIndex - i;
            Object temp = items[i];
            items[i] = items[ii];
            items[ii] = temp;
        }
    }

    public final I2 ZD() {
        if (this.Yk0 == null) {
            this.Yk0 = new vu_1(this);
        }
        return this.Yk0.Mm0();
    }

    public void fu0(int newSize) {
        if (newSize < 0) {
            throw new IllegalArgumentException("newSize must be >= 0: " + newSize);
        }
        if (this.KB <= newSize) {
            return;
        }
        for (int i = newSize; i < this.KB; i++) {
            this.rZ[i] = null;
        }
        this.KB = newSize;
    }

    public final Object[] toArray() {
        return Mo0(this.rZ.getClass().getComponentType());
    }

    public final Object[] Mo0(Class type) {
        Object[] result = (Object[]) Array.newInstance(type, this.KB);
        System.arraycopy(this.rZ, 0, result, 0, this.KB);
        return result;
    }

    public final int hashCode() {
        if (!this.yT) {
            return super.hashCode();
        }
        Object[] items = this.rZ;
        int h = 1;
        for (int i = 0, n = this.KB; i < n; i++) {
            h = h * 31;
            Object item = items[i];
            if (item != null) {
                h += item.hashCode();
            }
        }
        return h;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!this.yT) {
            return false;
        }
        if (!(object instanceof FastArray)) {
            return false;
        }
        FastArray array = (FastArray) object;
        if (!array.yT) {
            return false;
        }
        int n = this.KB;
        if (n != array.KB) {
            return false;
        }
        Object[] items1 = this.rZ;
        Object[] items2 = array.rZ;
        for (int i = 0; i < n; i++) {
            Object o1 = items1[i];
            Object o2 = items2[i];
            if (o1 == null) {
                if (o2 != null) {
                    return false;
                }
            } else if (!o1.equals(o2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        if (this.KB == 0) {
            return "[]";
        }
        Object[] items = this.rZ;
        b3_0 buffer = new b3_0(32);
        buffer.GC0('[');
        buffer.Rs(items[0]);
        for (int i = 1; i < this.KB; i++) {
            buffer.sV(", ");
            buffer.Rs(items[i]);
        }
        buffer.GC0(']');
        return buffer.toString();
    }

    @Override
    public final Iterator iterator() {
        return ZD();
    }

    public void cB(int end) {
        int start = 0;
        int size = this.KB;
        if (end >= size) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + end + " >= " + this.KB);
        }
        if (end < 0) {
            throw new IndexOutOfBoundsException("start can't be > end: 0 > " + end);
        }
        Object[] items = this.rZ;
        int count = end + 1;
        int remaining = size - count;
        if (this.yT) {
            System.arraycopy(items, count, items, start, size - count);
        } else {
            int lastIndex = size - Math.max(remaining, end + 1);
            System.arraycopy(items, lastIndex, items, start, remaining);
        }
        for (int i = remaining; i < size; i++) {
            items[i] = null;
        }
        this.KB = remaining;
    }

    public final void Bv(int additionalCapacity) {
        if (additionalCapacity < 0) {
            throw new IllegalArgumentException("additionalCapacity must be >= 0: " + additionalCapacity);
        }
        int sizeNeeded = this.KB + additionalCapacity;
        if (sizeNeeded > this.rZ.length) {
            lPt8(Math.max(Math.max(8, sizeNeeded), (int) (this.KB * 1.75f)));
        }
    }
}
