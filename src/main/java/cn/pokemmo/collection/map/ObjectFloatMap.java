package cn.pokemmo.collection.map;

import f.Gx0;
import f.af_1;
import java.util.Iterator;

public class ObjectFloatMap implements Iterable {
    public int xz;
    public Object[] Cu;
    public float[] lJ0;
    public final float tC0;
    public int Ou;
    public int nd0;
    public int s3;
    public transient Gx0 C2;
    public transient Gx0 vF0;

    public final int Fm0(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        Object[] table = this.Cu;
        int index = (int) ((long) object.hashCode() * -7046029254386353131L >>> this.nd0);
        while (true) {
            Object key = table[index];
            if (key == null) {
                return -(index + 1);
            }
            if (key.equals(object)) {
                return index;
            }
            index = index + 1 & this.s3;
        }
    }

    @Override
    public int hashCode() {
        int h = this.xz;
        Object[] keys = this.Cu;
        float[] values = this.lJ0;
        for (int i = 0, n = keys.length; i < n; i++) {
            Object key = keys[i];
            if (key != null) {
                h += key.hashCode() + Float.floatToRawIntBits(values[i]);
            }
        }
        return h;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ObjectFloatMap)) {
            return false;
        }
        ObjectFloatMap map = (ObjectFloatMap) other;
        if (map.xz != this.xz) {
            return false;
        }
        Object[] keys = this.Cu;
        float[] values = this.lJ0;
        for (int i = 0, n = keys.length; i < n; i++) {
            Object key = keys[i];
            if (key == null) {
                continue;
            }
            float value = 0.0f;
            int index = map.Fm0(key);
            if (index >= 0) {
                value = map.lJ0[index];
            }
            if (value == 0.0f && map.Fm0(key) < 0) {
                return false;
            }
            if (value != values[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        if (this.xz == 0) {
            return "{}";
        }
        StringBuilder builder = new StringBuilder(32);
        builder.append('{');
        Object[] keys = this.Cu;
        float[] values = this.lJ0;
        int i = keys.length;
        Object key;
        while (true) {
            i--;
            if (i <= 0) {
                break;
            }
            key = keys[i];
            if (key == null) {
                continue;
            }
            builder.append(key);
            builder.append('=');
            builder.append(values[i]);
            break;
        }
        while (true) {
            i--;
            if (i <= 0) {
                break;
            }
            key = keys[i];
            if (key == null) {
                continue;
            }
            builder.append(", ");
            builder.append(key);
            builder.append('=');
            builder.append(values[i]);
        }
        builder.append('}');
        return builder.toString();
    }

    public final Gx0 dR() {
        if (this.C2 == null) {
            this.C2 = new Gx0((f.IY) this);
            this.vF0 = new Gx0((f.IY) this);
        }
        if (!this.C2.lT) {
            this.C2.x50();
            this.C2.lT = true;
            this.vF0.lT = false;
            return this.C2;
        }
        this.vF0.x50();
        this.vF0.lT = true;
        this.C2.lT = false;
        return this.vF0;
    }

    @Override
    public Iterator iterator() {
        return this.dR();
    }

    public ObjectFloatMap() {
        this(51, 0.8f);
    }

    public ObjectFloatMap(int n) {
        this(n, 0.8f);
    }

    public ObjectFloatMap(int n, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f);
        }
        this.tC0 = f;
        n = af_1.NK(n, f);
        this.Ou = (int) ((float) n * f);
        this.s3 = n - 1;
        this.nd0 = Long.numberOfLeadingZeros(this.s3);
        this.Cu = new Object[n];
        this.lJ0 = new float[n];
    }

    public ObjectFloatMap(ObjectFloatMap other) {
        this((int) Math.floor((float) other.Cu.length * other.tC0), other.tC0);
        System.arraycopy(other.Cu, 0, this.Cu, 0, other.Cu.length);
        System.arraycopy(other.lJ0, 0, this.lJ0, 0, other.lJ0.length);
        this.xz = other.xz;
    }
}
