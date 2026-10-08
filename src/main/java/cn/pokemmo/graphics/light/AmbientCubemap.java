/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.light;

import f.*;

import f.nf_1;

/*
 * Renamed from f.id
 */
public class AmbientCubemap {
    public final float[] l3;

    public AmbientCubemap() {
        this.l3 = new float[18];
    }

    public AmbientCubemap(float[] fArray) {
        if (fArray.length == 18) {
            fArray = new float[fArray.length];
            this.l3 = fArray;
            int n = fArray.length;
            System.arraycopy(fArray, 0, fArray, 0, n);
            return;
        }
        throw new nf_1("Incorrect array size");
    }

    public AmbientCubemap(id_2 id_22) {
        this(id_22.l3);
    }

    public AmbientCubemap Ve0(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f4;
        float f8 = f7 * f7;
        float f9 = f6;
        float f10 = f5;
        float f11 = f10 * f10;
        float f12 = f9 * f9;
        float f13 = f8 + f11 + f12;
        if (f13 == 0.0f) {
            return this;
        }
        float f14 = f3;
        float f15 = f2;
        float f16 = f;
        f = 1.0f / f13;
        f = (f13 + 1.0f) * f;
        f2 = f16 * f;
        f3 = f15 * f;
        f = f14 * f;
        int n = f4 > 0.0f ? 0 : 3;
        float[] fArray = this.l3;
        float f17 = f8;
        float f18 = f8;
        float f19 = f8;
        f8 = fArray[n];
        fArray[n] = f19 * f2 + f8;
        int n2 = n + 1;
        f13 = fArray[n2];
        fArray[n2] = f18 * f3 + f13;
        float f20 = fArray[n += 2];
        this.l3[n] = f17 * f + f20;
        n = f5 > 0.0f ? 6 : 9;
        float f21 = f6;
        f6 = fArray[n];
        fArray[n] = f11 * f2 + f6;
        int n3 = n + 1;
        f20 = fArray[n3];
        fArray[n3] = f11 * f3 + f20;
        float f22 = fArray[n += 2];
        fArray[n] = f11 * f + f22;
        n = f21 > 0.0f ? 12 : 15;
        float f23 = f;
        float f24 = fArray[n];
        fArray[n] = f12 * f2 + f24;
        int n4 = n + 1;
        f = fArray[n4];
        fArray[n4] = f12 * f3 + f;
        n4 = n + 2;
        f = fArray[n4];
        fArray[n4] = f12 * f23 + f;
        return this;
    }

    public final String toString() {
        String string = "";
        for (int j = 0; j < this.l3.length; j += 3) {
            string = string + Float.toString(this.l3[j]) + ", " + Float.toString(this.l3[j + 1]) + ", " + Float.toString(this.l3[j + 2]) + "\n";
        }
        return string;
    }
}

