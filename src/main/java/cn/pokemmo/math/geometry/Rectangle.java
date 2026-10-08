package cn.pokemmo.math.geometry;

import java.io.Serializable;

public class Rectangle implements Serializable {
    public static final Rectangle SI = new Rectangle();
    private static final long serialVersionUID = 5733252015138115702L;
    public float j80;
    public float Wm0;
    public float IA;
    public float Eu0;

    public Rectangle() {
    }

    public Rectangle(float f, float f2, float f3, float f4) {
        this.j80 = f;
        this.Wm0 = f2;
        this.IA = f3;
        this.Eu0 = f4;
    }

    public Rectangle(Rectangle ql_02) {
        this.j80 = ql_02.j80;
        this.Wm0 = ql_02.Wm0;
        this.IA = ql_02.IA;
        this.Eu0 = ql_02.Eu0;
    }

    public boolean Ur0(float f, float f2) {
        float f3 = this.j80;
        if (!(f3 <= f)) return false;
        if (!(f3 + this.IA >= f)) return false;
        float f4 = this.Wm0;
        if (!(f4 <= f2)) return false;
        if (!(f4 + this.Eu0 >= f2)) return false;
        return true;
    }

    public boolean contains(float x, float y) {
        return Ur0(x, y);
    }

    public void set(float x, float y, float width, float height) {
        this.j80 = x;
        this.Wm0 = y;
        this.IA = width;
        this.Eu0 = height;
    }

    @Override
    public String toString() {
        return "[" + this.j80 + "," + this.Wm0 + "," + this.IA + "," + this.Eu0 + "]";
    }

    @Override
    public int hashCode() {
        int n = 31;
        n = (Float.floatToRawIntBits(this.Eu0) + n) * 31;
        n = (Float.floatToRawIntBits(this.IA) + n) * 31;
        n = (Float.floatToRawIntBits(this.j80) + n) * 31;
        return Float.floatToRawIntBits(this.Wm0) + n;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof Rectangle)) {
            return false;
        }
        Rectangle other = (Rectangle)object;
        if (Float.floatToRawIntBits(this.Eu0) != Float.floatToRawIntBits(other.Eu0)) {
            return false;
        }
        if (Float.floatToRawIntBits(this.IA) != Float.floatToRawIntBits(other.IA)) {
            return false;
        }
        if (Float.floatToRawIntBits(this.j80) != Float.floatToRawIntBits(other.j80)) {
            return false;
        }
        return Float.floatToRawIntBits(this.Wm0) == Float.floatToRawIntBits(other.Wm0);
    }
}
