/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.audio.dsp;

import f.*;

import f.IH0;
import f.Sj0;
import f.kq_0;
import f.lu_0;

public class AudioResamplingFilter {
    public int yJ0;
    public int hU;
    public lu_0 SH = new lu_0();
    public float[] cd;
    public Sj0 Ic;
    public int[] aF0 = new int[15];

    public final synchronized int S50(float[] fArray, int n, IH0 iH0, int n2) {
        int n3;
        int n4;
        if (this.aF0.length < (n2 /= this.yJ0)) {
            this.aF0 = new int[n2];
        }
        for (n4 = 0; n4 < n2; ++n4) {
            n3 = this.FP(iH0);
            if (n3 == -1) {
                return -1;
            }
            this.aF0[n4] = n3 * this.yJ0;
        }
        int n5 = 0;
        n4 = 0;
        while (n5 < this.yJ0) {
            for (n3 = 0; n3 < n2; ++n3) {
                int n6 = n + n4 + n3;
                fArray[n6] = fArray[n6] + this.cd[this.aF0[n3] + n5];
            }
            ++n5;
            n4 += n2;
        }
        return 0;
    }

    public final int FP(IH0 iH0) {
        int n = 0;
        Sj0 sj0 = this.Ic;
        int n2 = sj0.Ob0;
        iH0.getClass();
        int n3 = IH0.nuL[n2];
        int n4 = iH0.Hm0;
        int n5 = n2 + n4;
        int n6 = iH0.AS;
        int n7 = iH0.rE0;
        if (n6 + 4 >= n7 && kq_0.lpT2(n5, 1, 8, n6) >= n7) {
            n3 = -1;
        } else {
            byte[] byArray = iH0.Yl;
            int n8 = iH0.n;
            int n9 = (iH0.Yl[n8] & 0xFF) >>> n4;
            if (n5 > 8) {
                n9 |= (byArray[n8 + 1] & 0xFF) << 8 - n4;
                if (n5 > 16) {
                    n9 |= (byArray[n8 + 2] & 0xFF) << 16 - n4;
                    if (n5 > 24) {
                        n9 |= (byArray[n8 + 3] & 0xFF) << 24 - n4;
                        if (n5 > 32 && n4 != 0) {
                            n9 |= (byArray[n8 + 4] & 0xFF) << 32 - n4;
                        }
                    }
                }
            }
            n3 &= n9;
        }
        if (n3 >= 0) {
            n = sj0.JL0[n3];
            int n10 = sj0.mi0[n3] + n4;
            n3 = n10;
            iH0.n = n4 = iH0.n + (n3 /= 8);
            iH0.AS = n6 + n3;
            iH0.Hm0 = n10 & 7;
            if (n <= 0) {
                return -n;
            }
        }
        do {
            if ((n3 = iH0.AS) >= iH0.rE0) {
                n4 = -1;
                if (++iH0.Hm0 > 7) {
                    iH0.Hm0 = 0;
                    ++iH0.n;
                    iH0.AS = n3 + 1;
                }
            } else {
                n4 = iH0.n;
                n5 = iH0.Hm0;
                n6 = iH0.Yl[n4] >> n5 & 1;
                iH0.Hm0 = n5 + 1;
                if (iH0.Hm0 > 7) {
                    iH0.Hm0 = 0;
                    iH0.n = n4 + 1;
                    iH0.AS = n3 + 1;
                }
                n4 = n6;
            }
            if (n4 != 0) {
                if (n4 != 1) {
                    return -1;
                }
                n = sj0.e60[n];
                continue;
            }
            n = sj0.Zc0[n];
        } while (n > 0);
        return -n;
    }
}

