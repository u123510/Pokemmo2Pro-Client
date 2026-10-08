/*
 * Reconstructed from bytecode (javap -c -p). CFR 0.152 failed: "Back jump on a try block".
 */
package cn.pokemmo.graphics.animation;

import f.*;

public class AnimationTimelineEvaluator {
    public float[][] BV = new float[0][];
    public final IH0 bj0 = new IH0();
    public int Y3;
    public int ki0;
    public int SJ;
    public int gY;
    public int Nm;
    public int wA;
    public long O9;
    public long Hs;
    public Lz0 cq0;

    public AnimationTimelineEvaluator(Lz0 lz0) {
        this.cq0 = lz0;
    }

    public final int BH(hj_0 hj_0_) {
        i30_0 i30_0_ = this.cq0.sg;
        IH0 ih0 = this.bj0;
        byte[] byArray = hj_0_.Xf0;
        int n = hj_0_.Hm;
        int n2 = hj_0_.Uf;
        ih0.n = n;
        ih0.Yl = byArray;
        ih0.AS = 0;
        ih0.Hm0 = 0;
        ih0.rE0 = n2;
        if (ih0.IQ(1) != 0) {
            return -1;
        }
        int n3 = this.bj0.IQ(this.cq0.H0);
        if (n3 == -1) {
            return -1;
        }
        this.Nm = n3;
        if ((this.ki0 = i30_0_.mE[n3].Fx) != 0) {
            this.Y3 = this.bj0.IQ(1);
            if ((this.SJ = this.bj0.IQ(1)) == -1) {
                return -1;
            }
        }
        else {
            this.Y3 = 0;
            this.SJ = 0;
        }
        long l = hj_0_.mE;
        this.O9 = l;
        l = hj_0_.Gl0 - 3L;
        this.Hs = l;
        this.wA = hj_0_.A00;
        this.gY = i30_0_.u5[this.ki0];
        int n4;
        if (this.BV.length < (n4 = i30_0_.OF)) {
            this.BV = new float[n4][];
        }
        for (int n5 = 0; n5 < i30_0_.OF; n5++) {
            float[] f = this.BV[n5];
            if (f != null && f.length >= this.gY) {
                for (int n6 = 0; n6 < this.gY; n6++) {
                    this.BV[n5][n6] = 0.0f;
                }
            }
            else {
                this.BV[n5] = new float[this.gY];
            }
        }
        yl0_1 yl0_1_ = yl0_1.qF0[i30_0_.AA[i30_0_.mE[this.Nm].switch$]];
        Object object = this.cq0.TS[this.Nm];
        Yn0 yn0 = (Yn0)yl0_1_;
        synchronized (yn0) {
            Lz0 lz0 = this.cq0;
            i30_0_ = lz0.sg;
            az_0 az_0_ = (az_0)object;
            vZ vZ = az_0_.f90;
            d4_0 d4_0_ = az_0_.Zi;
            int n7 = i30_0_.u5[this.ki0];
            this.gY = n7;
            float[] f6 = lz0.EF0[this.ki0][this.Y3][this.SJ][d4_0_.JM];
            if (yn0.XG0 == null || yn0.XG0.length < i30_0_.OF) {
                yn0.XG0 = new float[i30_0_.OF][];
                yn0.q70 = new int[i30_0_.OF];
                yn0.HA0 = new int[i30_0_.OF];
                yn0.qK0 = new Object[i30_0_.OF];
            }
            for (int n8 = 0; n8 < i30_0_.OF; n8++) {
                float[] f = this.BV[n8];
                int n9 = vZ.e9[n8];
                DY dy = az_0_.uD0[n9];
                Object obj = az_0_.cv0[n9];
                Object qk = yn0.qK0[n8];
                yn0.qK0[n8] = dy.T80((w90_0) this, obj, qk);
                yn0.q70[n8] = yn0.qK0[n8] == null ? 0 : 1;
                for (int n10 = 0; n10 < n7 / 2; n10++) {
                    f[n10] = 0.0f;
                }
            }
            for (int n8 = 0; n8 < vZ.op; n8++) {
                int[] q70 = yn0.q70;
                int n9 = vZ.SH0[n8];
                if (q70[n9] != 0 || q70[vZ.Q5[n8]] != 0) {
                    q70[n9] = 1;
                    q70[vZ.Q5[n8]] = 1;
                }
            }
            for (int n8 = 0; n8 < vZ.a7; n8++) {
                int n9 = 0;
                for (int n10 = 0; n10 < i30_0_.OF; n10++) {
                    if (vZ.e9[n10] == n8) {
                        yn0.HA0[n9] = yn0.q70[n10] != 0 ? 1 : 0;
                        yn0.XG0[n9++] = this.BV[n10];
                    }
                }
                az_0_.Lj0[n8].rJ((w90_0) this, az_0_.GI[n8], yn0.XG0, yn0.HA0, n9);
            }
            for (int n8 = vZ.op - 1; n8 >= 0; n8--) {
                float[] f9 = this.BV[vZ.SH0[n8]];
                float[] f10 = this.BV[vZ.Q5[n8]];
                for (int n11 = 0; n11 < n7 / 2; n11++) {
                    float f12 = f9[n11];
                    float f13 = f10[n11];
                    if (f12 > 0.0f) {
                        if (f13 > 0.0f) {
                            f9[n11] = f12;
                            f10[n11] = f12 - f13;
                        }
                        else {
                            f10[n11] = f12;
                            f9[n11] = f12 + f13;
                        }
                    }
                    else if (f13 > 0.0f) {
                        f9[n11] = f12;
                        f10[n11] = f12 + f13;
                    }
                    else {
                        f10[n11] = f12;
                        f9[n11] = f12 - f13;
                    }
                }
            }
            for (int n8 = 0; n8 < i30_0_.OF; n8++) {
                float[] f = this.BV[n8];
                int n9 = vZ.e9[n8];
                DY dy = az_0_.uD0[n9];
                Object qk = yn0.qK0[n8];
                dy.TG0((w90_0) this, az_0_.cv0[n9], qk, f);
            }
            for (int n8 = 0; n8 < i30_0_.OF; n8++) {
                float[] f = this.BV[n8];
                ((on_2)lz0.dH[this.ki0][0]).mQ(f, f);
            }
            for (int n8 = 0; n8 < i30_0_.OF; n8++) {
                float[] f = this.BV[n8];
                if (yn0.q70[n8] != 0) {
                    for (int n9 = 0; n9 < n7; n9++) {
                        f[n9] = f[n9] * f6[n9];
                    }
                }
                else {
                    for (int n9 = 0; n9 < n7; n9++) {
                        f[n9] = 0.0f;
                    }
                }
            }
        }
        return 0;
    }
}
