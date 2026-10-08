package cn.pokemmo.math.geometry;

import f.Bp0;
import f.lt_2;
import java.io.Serializable;

public class Vector2f implements Serializable, Vector {
    private static final long serialVersionUID = 913902788239530931L;
    public static final Vector2f X = new Vector2f(1.0f, 0.0f);
    public static final Vector2f Y = new Vector2f(0.0f, 1.0f);
    public static final Vector2f Zero = new Vector2f(0.0f, 0.0f);
    public float x;
    public float y;

    public Vector2f() {
    }

    public Vector2f(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public Vector2f(Vector2f bp0) {
        this.nA0(bp0);
    }

    public static float S40(float f, float f2) {
        return (float)Math.sqrt(f2 * f2 + f * f);
    }

    public Vector2f Jp0() {
        return new Vector2f(this);
    }

    public float ut(Vector2f bp0) {
        float dx = bp0.x - this.x;
        float dy = bp0.y - this.y;
        return (float)Math.sqrt(dy * dy + dx * dx);
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    @Override
    public int hashCode() {
        int n = 31;
        n = (Float.floatToIntBits(this.x) + n) * 31;
        return Float.floatToIntBits(this.y) + n;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof Vector2f)) {
            return false;
        }
        Vector2f other = (Vector2f)object;
        if (Float.floatToIntBits(this.x) != Float.floatToIntBits(other.x)) {
            return false;
        }
        return Float.floatToIntBits(this.y) == Float.floatToIntBits(other.y);
    }

    public boolean SE0(Vector2f bp0) {
        float f = 1.0E-6f;
        if (bp0 == null) return false;
        if (!(Math.abs(bp0.x - this.x) > f)) {
            if (Math.abs(bp0.y - this.y) > f) return false;
            return true;
        }
        return false;
    }

    public boolean Ht(float f, float f2) {
        float eps = 1.0E-6f;
        if (Math.abs(f - this.x) > eps) {
            return false;
        }
        return !(Math.abs(f2 - this.y) > eps);
    }

    @Override
    public lt_2 G7(float f) {
        this.x *= f;
        this.y *= f;
        return (lt_2) this;
    }

    @Override
    public lt_2 Xg0(lt_2 lt_22) {
        Vector2f bp02 = (Vector2f)lt_22;
        this.x += bp02.x;
        this.y += bp02.y;
        return (lt_2) this;
    }

    @Override
    public lt_2 lY(lt_2 lt_22) {
        Vector2f bp02 = (Vector2f)lt_22;
        this.x = bp02.x;
        this.y = bp02.y;
        return (lt_2) this;
    }

    @Override
    public lt_2 f10() {
        return new Bp0(this);
    }

    public void nA0(Vector2f bp0) {
        this.x = bp0.x;
        this.y = bp0.y;
    }

    public void FF(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public void ub0(Vector2f bp0, float f) {
        float dx = this.x - bp0.x;
        float dy = this.y - bp0.y;
        double d = f * ((float)Math.PI / 180);
        float cos = (float)Math.cos(d);
        float sin = (float)Math.sin(d);
        float newX = dx * cos - dy * sin;
        float newY = dx * sin + dy * cos;
        this.x = newX + bp0.x;
        this.y = newY + bp0.y;
    }
}
