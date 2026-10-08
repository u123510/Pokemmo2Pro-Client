package cn.pokemmo.battle;

import f.*;
import java.io.Serializable;

/**
 * 现代化重构类 - 原始混淆类: f.I80
 */
public class Modern_Battle_I80
implements Serializable {

    private static final long serialVersionUID = 7381533206532032099L;
    public final float BQ;
    public final float ak0;
    public final float uv;
    public final float rL;

    public Modern_Battle_I80() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Modern_Battle_I80(I80 i80) {
        this.BQ = i80.BQ;
        this.ak0 = i80.ak0;
        this.uv = i80.uv;
        this.rL = i80.rL;
    }

    public Modern_Battle_I80(float f, float f2, float f3, float f4) {
        this.BQ = f;
        this.ak0 = f2;
        this.uv = f3;
        this.rL = f4;
    }

    public Modern_Battle_I80(Bp0 bp0, float f, float f2) {
        this.BQ = bp0.x;
        this.ak0 = bp0.y;
        this.uv = f;
        this.rL = f2;
    }

    public Modern_Battle_I80(Bp0 bp0, Bp0 bp02) {
        this.BQ = bp0.x;
        this.ak0 = bp0.y;
        this.uv = bp02.x;
        this.rL = bp02.y;
    }

    public Modern_Battle_I80(b2_0 b2_02) {
        this.BQ = b2_02.ID0;
        this.ak0 = b2_02.uQ;
        float f = b2_02.vX;
        this.uv = f * 2.0f;
        this.rL = f * 2.0f;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object != null && object.getClass() == I80.class) {
            object = (I80)object;
            return this.BQ == ((I80)object).BQ && this.ak0 == ((I80)object).ak0 && this.uv == ((I80)object).uv && this.rL == ((I80)object).rL;
        }
        return false;
    }

    public final int hashCode() {
        Modern_Battle_I80 i80 = this;
        int n = 53;
        n = (Float.floatToRawIntBits(i80.rL) + n) * 53;
        n = (Float.floatToRawIntBits(i80.uv) + n) * 53;
        n = (Float.floatToRawIntBits(i80.BQ) + n) * 53;
        return Float.floatToRawIntBits(i80.ak0) + n;
    }
}


