/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.audio.vorbis;

import f.*;

/*
 * Renamed from f.on
 */
public class VorbisMdctTransform {
    public int Kc;
    public int V;
    public float[] gI;
    public int[] jM;
    public float[] z40 = new float[1024];
    public float[] fe = new float[1024];

    public final void Gb0(int n) {
        int n2 = n / 4;
        this.jM = new int[n2];
        this.gI = new float[n + n2];
        double d = n;
        this.V = (int)Math.rint(Math.log(d) / Math.log(2.0));
        this.Kc = n;
        int n3 = 1;
        int n4 = n / 2;
        int n5 = n4 + 1;
        int n6 = n4 + n4;
        int n7 = n6 + 1;
        for (int j = 0; j < n2; ++j) {
            VorbisMdctTransform on_22 = this;
            int n8 = j * 2;
            double d2 = Math.PI / d * (double)(j * 4);
            on_22.gI[n8] = (float)Math.cos(d2);
            int n9 = n3 + n8;
            on_22.gI[n9] = (float)(-Math.sin(d2));
            int n10 = n4 + n8;
            double d4 = n * 2;
            d2 = Math.PI / d4 * (double)n9;
            on_22.gI[n10] = (float)Math.cos(d2);
            on_22.gI[n5 + n8] = (float)Math.sin(d2);
        }
        for (n2 = 0; n2 < (n3 = n / 8); ++n2) {
            VorbisMdctTransform on_23 = this;
            n3 = n2 * 2;
            double d5 = Math.PI / d * (double)(n2 * 4 + 2);
            on_23.gI[n6 + n3] = (float)Math.cos(d5);
            on_23.gI[n7 + n3] = (float)(-Math.sin(d5));
        }
        int n11 = this.V;
        n = (1 << n11 - 1) - 1;
        n2 = 1 << n11 - 2;
        for (int j = 0; j < n3; ++j) {
            int n12 = 0;
            n4 = 0;
            while ((n5 = n2 >>> n4) != 0) {
                if ((n5 & j) != 0) {
                    n12 |= 1 << n4;
                }
                ++n4;
            }
            int[] nArray = this.jM;
            int n13 = j * 2;
            nArray[n13] = ~n12 & n;
            this.jM[n13 + 1] = n12;
        }
    }

    public final synchronized void mQ(float[] fArray, float[] fArray2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = this.Kc;
        if (this.z40.length < n6 / 2) {
            this.z40 = new float[n6 / 2];
        }
        if (this.fe.length < n6 / 2) {
            this.fe = new float[n6 / 2];
        }
        int n7 = n6;
        VorbisMdctTransform on_22 = this;
        float[] fArray3 = on_22.z40;
        float[] fArray4 = on_22.fe;
        int n8 = n7 >>> 1;
        int n9 = n7 >>> 2;
        int n10 = n7 >>> 3;
        int n11 = 1;
        int n12 = 0;
        int n13 = n8;
        for (n5 = 0; n5 < n10; ++n5) {
            n4 = n13 + -2;
            n3 = n12 + 1;
            int n14 = n11 + 2;
            float[] fArray5 = this.gI;
            fArray3[n12] = -fArray[n14] * this.gI[n13 += -1] - fArray[n11] * fArray5[n4];
            n12 += 2;
            fArray3[n3] = fArray[n11] * fArray5[n13] - fArray[n14] * fArray5[n4];
            n11 += 4;
            n13 = n4;
        }
        n11 = n8 - 4;
        for (n5 = 0; n5 < n10; ++n5) {
            n4 = n13 + -2;
            n3 = n12 + 1;
            float[] fArray6 = this.gI;
            float f = fArray[n11] * this.gI[n13 += -1];
            n2 = n11 + 2;
            fArray3[n12] = fArray[n2] * fArray6[n4] + f;
            n12 += 2;
            fArray3[n3] = fArray[n11] * fArray6[n4] - fArray[n2] * fArray6[n13];
            n11 -= 4;
            n13 = n4;
        }
        int n15 = this.Kc;
        n11 = 0;
        n13 = n8;
        n5 = n9;
        for (n12 = 0; n12 < n9; n12 += 2) {
            float f;
            float f2 = fArray3[n5];
            float f3 = f = f2;
            f = fArray3[n11];
            float f4 = f3 - f;
            int n16 = n9 + n12;
            n4 = n5 + 1;
            int n17 = n11 + 1;
            fArray4[n16] = f2 + f;
            float f5 = fArray3[n4] - fArray3[n17];
            float f6 = f5;
            n2 = n13 + -4;
            n = n12 + 1;
            float[] fArray7 = this.gI;
            float f7 = f6;
            f6 = f4 * fArray7[n2];
            fArray4[n12] = f7 * fArray7[n13 += -3] + f6;
            fArray4[n] = f5 * this.gI[n2] - f4 * fArray7[n13];
            n13 = n9 + n;
            n5 += 2;
            n11 += 2;
            fArray4[n13] = fArray3[n4] + fArray3[n17];
            n13 = n2;
        }
        for (n11 = 0; n11 < this.V - 3; ++n11) {
            n12 = n15 >>> n11 + 2;
            n5 = 1 << n11 + 3;
            n13 = n8 - 2;
            n4 = 0;
            for (int j = 0; j < n12 >>> 2; ++j) {
                int n18 = n13 - (n12 >> 1);
                float f = this.gI[n4];
                float f8 = this.gI[n4 + 1];
                n = n13 + -2;
                int n19 = n12 + 1;
                for (int k = 0; k < 2 << n11; ++k) {
                    float f9 = fArray4[n13];
                    float f10 = fArray4[n18];
                    float f11 = f9 - f10;
                    fArray3[n13] = f9 + f10;
                    f10 = fArray4[++n13];
                    int n20 = n18 + 1;
                    float f12 = fArray4[n20];
                    float f13 = f10 - f12;
                    fArray3[n13] = f10 + f12;
                    fArray3[n20] = f13 * f - f11 * f8;
                    float f14 = f11 * f;
                    fArray3[n18] = f13 * f8 + f14;
                    n13 -= n19;
                    n18 = n20 - n19;
                }
                n4 += n5;
                n13 = n;
            }
            float[] fArray8 = fArray4;
            fArray4 = fArray3;
            fArray3 = fArray8;
        }
        n11 = 0;
        n12 = 0;
        n5 = n8 - 1;
        for (n13 = 0; n13 < n10; ++n13) {
            int n21 = n11;
            int n22 = n21 + 1;
            int n23 = this.jM[n21];
            n11 += 2;
            n22 = this.jM[n22];
            float f = fArray4[n23];
            float f15 = f;
            float f16 = fArray4[n22 + 1];
            f15 -= f16;
            float f17 = fArray4[n23 - 1];
            float f18 = f16;
            float f19 = fArray4[n22];
            f16 = f17 + f19;
            float f20 = f + f18;
            f19 = f17 - f19;
            float f21 = f16;
            float f22 = f15;
            float[] fArray9 = this.gI;
            float f23 = f16;
            float f24 = fArray9[n15];
            f16 = f15 * f24;
            int n24 = n15 + 1;
            f15 = f23 * f24;
            float f25 = this.gI[n24];
            f17 = f22 * f25;
            n15 += 2;
            f25 = f21 * f25;
            int n25 = n12 + 1;
            fArray3[n12] = (f20 + f17 + f15) * 0.5f;
            n = n5 + -1;
            fArray3[n5] = (-f19 + f25 - f16) * 0.5f;
            n12 += 2;
            fArray3[n25] = (f19 + f25 - f16) * 0.5f;
            n5 -= 2;
            fArray3[n] = (f20 - f17 - f15) * 0.5f;
        }
        int n26 = n9;
        n15 = 0;
        int n27 = n26 - 1;
        n10 = n26 + n8;
        n11 = n10 - 1;
        n5 = n9;
        for (n12 = 0; n12 < n9; ++n12) {
            float f = fArray3[n15];
            float[] fArray10 = this.gI;
            float f26 = this.gI[n8 + 1];
            float f27 = fArray3[n15 + 1];
            float f28 = fArray10[n8];
            float f29 = f * f26 - f27 * f28;
            f *= f28;
            f = -(f27 * f26 + f);
            fArray2[n5] = -f29;
            fArray2[n27] = f29;
            fArray2[n10] = f;
            fArray2[n11] = f;
            ++n5;
            --n27;
            ++n10;
            --n11;
            n15 += 2;
            n8 += 2;
        }
    }
}

