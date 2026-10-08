/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.math;

import f.*;


import com.badlogic.gdx.math.Matrix4;
import f.C8;
import f.LW;
import java.io.Serializable;

/*
 * Renamed from f.me0
 */
public class GdxQuaternion
implements Serializable {
    private static final long serialVersionUID = -7661875440774897168L;
    public static final GdxQuaternion Bq = new GdxQuaternion(0.0f, 0.0f, 0.0f, 0.0f);
    public static final GdxQuaternion Aux = new GdxQuaternion(0.0f, 0.0f, 0.0f, 0.0f);
    public float m1;
    public float ao0;
    public float th;
    public float Au0;

    public GdxQuaternion(float f, float f2, float f3, float f4) {
        GdxQuaternion me0_22 = this;
        me0_22.U3(f, f2, f3, f4);
    }

    public GdxQuaternion() {
        GdxQuaternion me0_22 = this;
        me0_22.Rx0();
    }

    public GdxQuaternion(me0_2 me0_22) {
        GdxQuaternion me0_23 = this;
        me0_23.CA0(me0_22);
    }

    public GdxQuaternion(C8 c8, float f) {
        GdxQuaternion me0_22 = this;
        me0_22.Ox0(c8, f);
    }

    public GdxQuaternion CA0(me0_2 me0_22) {
        me0_2 me0_23 = me0_22;
        float f = me0_23.m1;
        float f2 = me0_23.ao0;
        float f3 = me0_23.th;
        float f4 = me0_23.Au0;
        this.m1 = f;
        this.ao0 = f2;
        this.th = f3;
        this.Au0 = f4;
        return this;
    }

    public final String toString() {
        return "[" + this.m1 + "|" + this.ao0 + "|" + this.th + "|" + this.Au0 + "]";
    }

    public GdxQuaternion Cx() {
        GdxQuaternion me0_22 = this;
        float f = me0_22.m1;
        float f2 = f * f;
        float f3 = me0_22.ao0;
        f2 = f3 * f3 + f2;
        float f4 = me0_22.th;
        f2 = f4 * f4 + f2;
        float f5 = me0_22.Au0;
        if ((f2 = f5 * f5 + f2) != 0.0f && !LW.LH0(f2, 1.0f)) {
            GdxQuaternion me0_23 = this;
            f2 = (float)Math.sqrt(f2);
            me0_23.Au0 /= f2;
            me0_23.m1 /= f2;
            me0_23.ao0 /= f2;
            me0_23.th /= f2;
        }
        return this;
    }

    public GdxQuaternion Z80(float f, float f2, float f3, float f4) {
        GdxQuaternion me0_22 = this;
        float f5 = me0_22.Au0;
        float f6 = f5;
        float f7 = f4;
        float f8 = f6 * f;
        float f9 = this.m1;
        GdxQuaternion me0_23 = this;
        float f10 = f9 * f4 + f8;
        f8 = me0_23.ao0;
        f10 = f8 * f3 + f10;
        float f11 = me0_23.th;
        float f12 = f4;
        float f13 = f4;
        f10 -= f11 * f2;
        f4 = f6 * f2;
        f4 = f8 * f13 + f4;
        f4 = f11 * f + f4 - f9 * f3;
        f6 *= f3;
        f6 = f11 * f12 + f6;
        f6 = f9 * f2 + f6 - f8 * f;
        f = f5 * f7 - f9 * f - f8 * f2 - f11 * f3;
        me0_22.m1 = f10;
        me0_22.ao0 = f4;
        me0_22.th = f6;
        me0_22.Au0 = f;
        return me0_22;
    }

    public GdxQuaternion p1(me0_2 me0_22) {
        float f = me0_22.Au0;
        float f2 = f;
        float f3 = this.m1;
        float f4 = f2 * f3;
        float f5 = me0_22.m1;
        me0_2 me0_23 = me0_22;
        float f6 = this.Au0;
        f4 = f5 * f6 + f4;
        float f7 = me0_23.ao0;
        float f8 = this.th;
        f4 = f7 * f8 + f4;
        float f9 = me0_23.th;
        float f10 = f2;
        float f11 = f2;
        float f12 = this.ao0;
        f2 = f4 - f9 * f12;
        f4 = f11 * f12;
        f4 = f7 * f6 + f4;
        f4 = f9 * f3 + f4 - f5 * f8;
        float f13 = f10 * f8;
        f13 = f9 * f6 + f13;
        f13 = f5 * f12 + f13 - f7 * f3;
        f12 = f * f6 - f5 * f3 - f7 * f12 - f9 * f8;
        this.m1 = f2;
        this.ao0 = f4;
        this.th = f13;
        this.Au0 = f12;
        return this;
    }

    public GdxQuaternion Rx0() {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        this.m1 = f;
        this.ao0 = f2;
        this.th = f3;
        this.Au0 = f4;
        return this;
    }

    public GdxQuaternion h50(float f, float f2, float f3, float f4) {
        float f5 = f3;
        float f6 = f2;
        float f7 = f;
        float f8 = f7 * f7;
        f8 = f6 * f6 + f8;
        if ((f8 = (float)Math.sqrt(f5 * f5 + f8)) == 0.0f) {
            return this.Rx0();
        }
        f8 = 1.0f / f8;
        f4 = (f4 < 0.0f ? (float)Math.PI * 2 - -f4 % ((float)Math.PI * 2) : f4 % ((float)Math.PI * 2)) / 2.0f;
        float f9 = f3;
        float f10 = f2;
        float f11 = f;
        double d = f4;
        float f12 = (float)Math.sin(d);
        f = (float)Math.cos(d);
        f2 = f8 * f11 * f12;
        f3 = f8 * f10 * f12;
        f12 = f8 * f9 * f12;
        this.m1 = f2;
        this.ao0 = f3;
        this.th = f12;
        this.Au0 = f;
        return this.Cx();
    }

    public GdxQuaternion et0(boolean bl, Matrix4 matrix4) {
        float f = matrix4.EW[0];
        float f2 = matrix4.EW[4];
        float f3 = matrix4.EW[8];
        float f4 = matrix4.EW[1];
        float f5 = matrix4.EW[5];
        float f6 = matrix4.EW[9];
        float f7 = matrix4.EW[2];
        float f8 = matrix4.EW[6];
        float f9 = matrix4.EW[10];
        return this.WA0(bl, f, f2, f3, f4, f5, f6, f7, f8, f9);
    }

    public GdxQuaternion WA0(boolean bl, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (bl) {
            float f11 = f6;
            float f12 = f5;
            float f13 = f4;
            float f14 = f3;
            float f15 = f2;
            float f16 = f;
            float f17 = f3;
            float f18 = f2;
            float f19 = f;
            float f20 = f19 * f19;
            f20 = f18 * f18 + f20;
            f20 = 1.0f / (float)Math.sqrt(f17 * f17 + f20);
            float f21 = f6;
            float f22 = f5;
            float f23 = f4;
            f = f23 * f23;
            f = f22 * f22 + f;
            f = 1.0f / (float)Math.sqrt(f21 * f21 + f);
            float f24 = f9;
            float f25 = f8;
            float f26 = f7;
            f2 = f26 * f26;
            f2 = f25 * f25 + f2;
            f2 = 1.0f / (float)Math.sqrt(f24 * f24 + f2);
            f3 = f16 * f20;
            f4 = f15 * f20;
            f20 = f14 * f20;
            f5 = f13 * f;
            f6 = f12 * f;
            f = f11 * f;
            f7 *= f2;
            f8 *= f2;
            f9 *= f2;
            float f27 = f3;
            float f28 = f6;
            f2 = f4;
            f4 = f5;
            f3 = f20;
            f6 = f;
            f5 = f28;
            f = f27;
        }
        float f29 = f + f5 + f9;
        if (f29 >= 0.0f) {
            f29 = (float)Math.sqrt(f29 + 1.0f);
            this.Au0 = f29 * 0.5f;
            f29 = 0.5f / f29;
            this.m1 = (f8 - f6) * f29;
            this.ao0 = (f3 - f7) * f29;
            this.th = (f4 - f2) * f29;
        } else if (f > f5 && f > f9) {
            f29 = (float)Math.sqrt((double)f + 1.0 - (double)f5 - (double)f9);
            this.m1 = f29 * 0.5f;
            f29 = 0.5f / f29;
            this.ao0 = (f4 + f2) * f29;
            this.th = (f3 + f7) * f29;
            this.Au0 = (f8 - f6) * f29;
        } else if (f5 > f9) {
            f29 = (float)Math.sqrt((double)f5 + 1.0 - (double)f - (double)f9);
            this.ao0 = f29 * 0.5f;
            f29 = 0.5f / f29;
            this.m1 = (f4 + f2) * f29;
            this.th = (f8 + f6) * f29;
            this.Au0 = (f3 - f7) * f29;
        } else {
            f29 = (float)Math.sqrt((double)f9 + 1.0 - (double)f - (double)f5);
            this.th = f29 * 0.5f;
            f29 = 0.5f / f29;
            this.m1 = (f3 + f7) * f29;
            this.ao0 = (f8 + f6) * f29;
            this.Au0 = (f4 - f2) * f29;
        }
        return this;
    }

    public final int hashCode() {
        GdxQuaternion me0_22 = this;
        int n = 31;
        n = (Float.floatToRawIntBits(me0_22.Au0) + n) * 31;
        n = (Float.floatToRawIntBits(me0_22.m1) + n) * 31;
        n = (Float.floatToRawIntBits(me0_22.ao0) + n) * 31;
        return Float.floatToRawIntBits(me0_22.th) + n;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof me0_2)) {
            return false;
        }
        object = (me0_2)object;
        return Float.floatToRawIntBits(this.Au0) == Float.floatToRawIntBits(((me0_2)object).Au0) && Float.floatToRawIntBits(this.m1) == Float.floatToRawIntBits(((me0_2)object).m1) && Float.floatToRawIntBits(this.ao0) == Float.floatToRawIntBits(((me0_2)object).ao0) && Float.floatToRawIntBits(this.th) == Float.floatToRawIntBits(((me0_2)object).th);
    }

    public final float al(C8 c8) {
        float f;
        C8 c82 = c8;
        float f2 = c82.x;
        float f3 = c82.y;
        float f4 = c82.z;
        float f5 = f4;
        float f6 = f3;
        float f7 = f2;
        GdxQuaternion me0_22 = this;
        float f8 = me0_22.m1;
        float f9 = me0_22.ao0;
        f2 = f8 * f2;
        f2 = f9 * f3 + f2;
        f2 = me0_22.th * f5 + f2;
        f3 = f7 * f2;
        f5 = f6 * f2;
        f8 = f4 * f2;
        float f10 = this.Au0;
        float f11 = f8;
        float f12 = f5;
        float f13 = f3;
        f3 = f13 * f13;
        f3 = f12 * f12 + f3;
        f3 = f11 * f11 + f3;
        if (LW.iF(f3 = f10 * f10 + f3)) {
            f = 0.0f;
        } else {
            double d = 2.0;
            f = (float)(Math.acos(LW.r1((float)((double)(f2 < 0.0f ? -this.Au0 : this.Au0) / Math.sqrt(f3)), -1.0f, 1.0f)) * d);
        }
        return f * 57.295776f;
    }

    public final void U3(float f, float f2, float f3, float f4) {
        GdxQuaternion me0_22 = this;
        me0_22.m1 = f;
        me0_22.ao0 = f2;
        me0_22.th = f3;
        me0_22.Au0 = f4;
    }

    public final void Ox0(C8 c8, float f) {
        float f2 = f;
        C8 c82 = c8;
        float f3 = c82.x;
        float f4 = c82.y;
        f = c82.z;
        float f5 = f2 * ((float)Math.PI / 180);
        this.h50(f3, f4, f, f5);
    }

    public final void Jg() {
        GdxQuaternion me0_22 = this;
        me0_22.m1 = -me0_22.m1;
        me0_22.ao0 = -me0_22.ao0;
        me0_22.th = -me0_22.th;
    }

    public final void Oa(C8 c8, float f) {
        float f2 = f;
        C8 c82 = c8;
        float f3 = c82.x;
        float f4 = c82.y;
        f = c82.z;
        float f5 = f2 * ((float)Math.PI / 180);
        this.h50(f3, f4, f, f5);
    }

    public final void ZI(me0_2 me0_22, float f) {
        GdxQuaternion me0_23 = this;
        float f3 = me0_23.m1 * me0_22.m1;
        f3 = me0_23.ao0 * me0_22.ao0 + f3;
        f3 = me0_23.th * me0_22.th + f3;
        f3 = me0_23.Au0 * me0_22.Au0 + f3;
        float f4 = f3 < 0.0f ? -f3 : f3;
        float f5 = 1.0f - f;
        if ((double)(1.0f - f4) > 0.1) {
            float f6 = f;
            f = (float)Math.acos(f4);
            f4 = 1.0f / (float)Math.sin(f);
            f5 = (float)Math.sin(f5 * f) * f4;
            f = (float)Math.sin(f6 * f) * f4;
        }
        if (f3 < 0.0f) {
            f = -f;
        }
        float f7 = f5 * this.m1;
        this.m1 = f * me0_22.m1 + f7;
        f7 = f5 * this.ao0;
        this.ao0 = f * me0_22.ao0 + f7;
        f7 = f5 * this.th;
        this.th = f * me0_22.th + f7;
        f7 = f5 * this.Au0;
        this.Au0 = f * me0_22.Au0 + f7;
    }
}

