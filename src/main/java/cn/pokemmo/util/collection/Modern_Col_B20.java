package cn.pokemmo.util.collection;

import f.*;
import java.io.Serializable;

/**
 * 现代化重构类 - 原始混淆类: f.b2_0
 */
public class Modern_Col_B20
implements Serializable {

    public float ID0;
    public float uQ;
    public float vX;

    public Modern_Col_B20() {
    }

    public Modern_Col_B20(float f, float f2, float f3) {
        this.ID0 = f;
        this.uQ = f2;
        this.vX = f3;
    }

    public Modern_Col_B20(Bp0 bp0, float f) {
        this.ID0 = bp0.x;
        this.uQ = bp0.y;
        this.vX = f;
    }

    public Modern_Col_B20(b2_0 b2_02) {
        this.ID0 = this.ID0;
        this.uQ = this.uQ;
        this.vX = this.vX;
    }

    public Modern_Col_B20(Bp0 bp0, Bp0 bp02) {
        float f;
        float f2;
        this.ID0 = f2 = bp0.x;
        this.uQ = f = bp0.y;
        this.vX = Bp0.S40(f2 - bp02.x, f - bp02.y);
    }

    public final boolean XK(float f, float f2) {
        // b2_0 b2_02 = this;
        f = this.ID0 - f;
        float f3 = this.uQ - f2;
        float f4 = f;
        f = f4 * f4;
        float f5 = this.vX;
        return f3 * f3 + f <= f5 * f5;
    }

    public final String toString() {
        return this.ID0 + "," + this.uQ + "," + this.vX;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object != null && object.getClass() == b2_0.class) {
            object = (b2_0)object;
            return this.ID0 == ((b2_0)object).ID0 && this.uQ == ((b2_0)object).uQ && this.vX == ((b2_0)object).vX;
        }
        return false;
    }

    public final int hashCode() {
        // b2_0 b2_02 = this;
        int n = 41;
        n = (Float.floatToRawIntBits(this.vX) + n) * 41;
        n = (Float.floatToRawIntBits(this.ID0) + n) * 41;
        return Float.floatToRawIntBits(this.uQ) + n;
    }
}


