package cn.pokemmo.collection.queue;

import f.CO;
import f.b3_0;
import f.iy0_0;
import f.la_0;
import f.yr_1;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CircularArrayQueue implements Iterable {
    public Object[] GD;
    public int LD0;
    public int VU;
    public int IR;
    public transient la_0 ix0;

    public CircularArrayQueue() {
        this(16);
    }

    public CircularArrayQueue(int i) {
        this.LD0 = 0;
        this.VU = 0;
        this.IR = 0;
        this.GD = new Object[i];
    }

    public CircularArrayQueue(int i, Class<?> cls) {
        this.LD0 = 0;
        this.VU = 0;
        this.IR = 0;
        this.GD = (Object[]) iy0_0.ix(cls, i);
    }

    public final void Uk0(Object obj) {
        Object[] objArr = this.GD;
        if (this.IR == objArr.length) {
            vp(objArr.length << 1);
            objArr = this.GD;
        }
        int i = this.LD0 - 1;
        if (i == -1) {
            i = objArr.length - 1;
        }
        objArr[i] = obj;
        this.LD0 = i;
        this.IR++;
    }

    public final void vp(int i) {
        Object[] objArr = this.GD;
        int i2 = this.LD0;
        int i3 = this.VU;
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        if (i2 < i3) {
            System.arraycopy(objArr, i2, objArr2, 0, i3 - i2);
        } else if (this.IR > 0) {
            int length = objArr.length - i2;
            System.arraycopy(objArr, i2, objArr2, 0, length);
            System.arraycopy(objArr, 0, objArr2, length, i3);
        }
        this.GD = objArr2;
        this.LD0 = 0;
        this.VU = this.IR;
    }

    public final Object zP() {
        int i = this.IR;
        if (i == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }
        Object[] objArr = this.GD;
        int i2 = this.VU - 1;
        if (i2 == -1) {
            i2 = objArr.length - 1;
        }
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.VU = i2;
        this.IR = i - 1;
        return obj;
    }

    public final Object get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(yr_1.pG("index can't be < 0: ", i));
        }
        if (i >= this.IR) {
            throw new IndexOutOfBoundsException(CO.go("index can't be >= size: ", i, " >= ").append(this.IR).toString());
        }
        Object[] objArr = this.GD;
        int i2 = this.LD0 + i;
        if (i2 >= objArr.length) {
            i2 -= objArr.length;
        }
        return objArr[i2];
    }

    @Override
    public Iterator iterator() {
        if (this.ix0 == null) {
            this.ix0 = new la_0((f.y60_0) this);
        }
        return this.ix0.iterator();
    }

    @Override
    public String toString() {
        if (this.IR == 0) {
            return "[]";
        }
        Object[] objArr = this.GD;
        int i = this.LD0;
        int i2 = this.VU;
        b3_0 b3_0 = new b3_0(64);
        b3_0.GC0('[');
        b3_0.Rs(objArr[i]);
        int length = (i + 1) % objArr.length;
        while (length != i2) {
            b3_0.sV(", ");
            b3_0.Rs(objArr[length]);
            length = (length + 1) % objArr.length;
        }
        b3_0.GC0(']');
        return b3_0.toString();
    }

    @Override
    public int hashCode() {
        int i = this.IR;
        Object[] objArr = this.GD;
        int length = objArr.length;
        int i2 = this.LD0;
        int i3 = i + 1;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = objArr[i2];
            i3 *= 31;
            if (obj != null) {
                i3 += obj.hashCode();
            }
            i2++;
            if (i2 == length) {
                i2 = 0;
            }
        }
        return i3;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CircularArrayQueue)) {
            return false;
        }
        CircularArrayQueue y60_0 = (CircularArrayQueue) obj;
        int i = this.IR;
        if (y60_0.IR != i) {
            return false;
        }
        Object[] objArr = this.GD;
        Object[] objArr2 = y60_0.GD;
        int length = objArr.length;
        int length2 = objArr2.length;
        int i2 = this.LD0;
        int i3 = y60_0.LD0;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj2 = objArr[i2];
            Object obj3 = objArr2[i3];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
            i2++;
            i3++;
            if (i2 == length) {
                i2 = 0;
            }
            if (i3 == length2) {
                i3 = 0;
            }
        }
        return true;
    }
}
