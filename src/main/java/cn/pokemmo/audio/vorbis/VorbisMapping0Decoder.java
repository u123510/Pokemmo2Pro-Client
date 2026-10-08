package cn.pokemmo.audio.vorbis;

import f.*;

public class VorbisMapping0Decoder extends DY {

    public VorbisMapping0Decoder() {
        super();
    }

    @Override
    public final Object Pl(i30_0 v1, IH0 v2) {
        lv_0 lv = new lv_0();
        lv.RB = v2.IQ(8);
        lv.FL = v2.IQ(16);
        lv.P6 = v2.IQ(16);
        lv.iu = v2.IQ(6);
        lv.hT = v2.IQ(8);
        int gp = v2.IQ(4) + 1;
        lv.gp = gp;
        if (lv.RB < 1 || lv.FL < 1 || lv.P6 < 1 || gp < 1) {
            return null;
        }
        for (int i = 0; i < lv.gp; i++) {
            lv.LPT1[i] = v2.IQ(8);
            int book = lv.LPT1[i];
            if (book < 0 || book >= v1.LT) {
                return null;
            }
        }
        return lv;
    }

    @Override
    public final Object d9(Lz0 v1, d4_0 v2, Object v3) {
        i30_0 sg = v1.sg;
        lv_0 lv = (lv_0) v3;
        a30_0 a30 = new a30_0();
        a30.DE = lv.RB;
        a30.qw = sg.u5[v2.Fx] / 2;
        int p6 = lv.P6;
        a30.J = p6;
        a30.Q20 = lv;

        z9_0 z9 = a30.sx0.Od0;
        int i4 = p6 * 2;
        z9.getClass();
        float[] trigcache = new float[p6 * 6];
        int[] splitcache = new int[32];
        if (i4 != 1) {
            int i5 = 0;
            int i6 = -1;
            int i7 = 0;
            int i8 = 101;
            int i9 = i4;
            while (true) {
                if (i8 == 101) {
                    i6++;
                    if (i6 < 4) {
                        i5 = z9_0.UH0[i6];
                    } else {
                        i5 += 2;
                    }
                }
                int rem = i9 / i5;
                if (i9 - rem * i5 != 0) {
                    i8 = 101;
                    continue;
                }
                splitcache[i7 + 2] = i5;
                i7++;
                if (i5 == 2) {
                    if (i7 != 1) {
                        for (int m = 1; m < i7; m++) {
                            int idx = i7 - m;
                            splitcache[idx + 2] = splitcache[idx + 1];
                        }
                        splitcache[2] = 2;
                    }
                    i9 = rem;
                } else {
                    i9 = rem;
                }
                if (i9 == 1) {
                    break;
                }
                i8 = 104;
            }
            splitcache[0] = i4;
            splitcache[1] = i7;
            float f5 = 6.2831855f / (float) i4;
            int i6_val = 0;
            i7--;
            int i8_val = 1;
            if (i7 != 0) {
                for (int i9_val = 0; i9_val < i7; i9_val++) {
                    int factor = splitcache[i9_val + 2];
                    int i11 = i8_val * factor;
                    int i12 = i4 / i11;
                    int i13 = i12 - 1;
                    for (int i14 = 0; i14 < i13; i14++) {
                        int i10 = 0;
                        i10 += i8_val;
                        float f15 = (float) i10 * f5;
                        float f16 = 0.0f;
                        int i18 = i6_val;
                        for (int i17 = 2; i17 < i12; i17 += 2) {
                            f16 += 1.0f;
                            double d21 = (double) (f16 * f15);
                            int i19 = i18 + 1;
                            int i20 = i18 + 1 + i4;
                            trigcache[i20] = (float) Math.cos(d21);
                            i18 += 2;
                            trigcache[i19 + i4] = (float) Math.sin(d21);
                        }
                        i6_val += i12;
                    }
                    i8_val = i11;
                }
            }
        }

        float f0 = (float) ((double) lv.FL / 2.0);
        double d4 = 13.1 * Math.atan(0.00074 * (double) f0);
        d4 += 2.24 * Math.atan(0.0000000185 * (double) (f0 * f0));
        d4 += 0.0001 * (double) f0;
        float f0_scale = (float) a30.J / (float) d4;

        a30.W80 = new int[a30.qw];
        for (int i2 = 0; i2 < a30.qw; i2++) {
            float f4 = (float) (((double) lv.FL / 2.0 / (double) a30.qw) * (double) i2);
            double d5 = 13.1 * Math.atan(0.00074 * (double) f4);
            d5 += 2.24 * Math.atan(0.0000000185 * (double) (f4 * f4));
            d5 += 0.0001 * (double) f4;
            int i4_val = (int) Math.floor((double) ((float) d5 * f0_scale));
            if (i4_val >= a30.J) {
                i4_val = a30.J;
            }
            a30.W80[i2] = i4_val;
        }
        return a30;
    }

    @Override
    public final void tX() {
    }

    @Override
    public final Object T80(w90_0 v1, Object v2, Object v3) {
        a30_0 a30 = (a30_0) v2;
        lv_0 lv = a30.Q20;
        float[] v4 = null;
        if (v3 instanceof float[]) {
            v4 = (float[]) v3;
        }
        int amp = v1.bj0.IQ(lv.iu);
        if (amp <= 0) {
            return null;
        }
        int maxAmp = (1 << lv.iu) - 1;
        float f3 = ((float) amp / (float) maxAmp) * (float) lv.hT;
        int i5 = v1.bj0.IQ(MB.iY(lv.gp));
        if (i5 == -1 || i5 >= lv.gp) {
            return null;
        }
        DP b = v1.cq0.xY[lv.LPT1[i5]];
        float f5 = 0.0f;
        if (v4 == null || v4.length < a30.DE + 1) {
            v4 = new float[a30.DE + 1];
        } else {
            for (int i6 = 0; i6 < v4.length; i6++) {
                v4[i6] = 0.0f;
            }
        }
        int i6 = 0;
        while (i6 < a30.DE) {
            IH0 v7 = v1.bj0;
            int i8 = b.yJ0;
            int i9 = 0;
            while (i9 < i8) {
                int i10 = b.FP(v7);
                if (i10 == -1) {
                    return null;
                }
                i10 *= b.yJ0;
                int i11 = 0;
                while (i11 < b.yJ0) {
                    v4[i6 + i9++] = b.cd[i10 + i11++];
                }
            }
            i6 += b.yJ0;
        }
        int i1 = 0;
        while (i1 < a30.DE) {
            for (int k = 0; k < b.yJ0; k++) {
                v4[i1] += f5;
                i1++;
            }
            f5 = v4[i1 - 1];
        }
        v4[a30.DE] = f3;
        return v4;
    }

    @Override
    public final int TG0(w90_0 v1, Object v2, Object v3, float[] v4) {
        a30_0 a30 = (a30_0) v2;
        lv_0 lv = a30.Q20;
        if (v3 != null) {
            float[] lsp = (float[]) v3;
            int de = a30.DE;
            float f3 = lsp[de];
            int[] w80 = a30.W80;
            int qw = a30.qw;
            int j = a30.J;
            float f1 = (float) lv.hT;
            float f7 = 3.1415927f / (float) j;
            for (int i8 = 0; i8 < de; i8++) {
                double d9 = (double) lsp[i8] * 40.74366592;
                int i11 = (int) d9;
                float[] j_tbl = ta0_1.j;
                float f9 = j_tbl[i11];
                float f10 = (float) (d9 - (double) i11);
                lsp[i8] = fe_2.Ga0(j_tbl[i11 + 1], f9, f10, f9);
            }
            int i8 = (de / 2) * 2;
            int i9 = 0;
            while (i9 < qw) {
                int i10 = w80[i9];
                float f11 = 0.70710677f;
                float f12 = 0.70710677f;
                double d13 = (double) (f7 * (float) i10) * 40.74366592;
                int i15 = (int) d13;
                float[] j_tbl = ta0_1.j;
                float f13 = j_tbl[i15];
                float f14 = (float) (d13 - (double) i15);
                f13 = fe_2.Ga0(j_tbl[i15 + 1], f13, f14, f13);
                for (int i14 = 0; i14 < i8; i14 += 2) {
                    f12 *= lsp[i14] - f13;
                    f11 *= lsp[i14 + 1] - f13;
                }
                if ((de & 1) != 0) {
                    float val = lsp[de - 1] - f13;
                    f12 = (f12 * val) * (f12 * val);
                    f11 = (1.0f - f13 * f13) * f11 * f11;
                } else {
                    f12 = (f13 + 1.0f) * f12 * f12;
                    f11 = (1.0f - f13) * f11 * f11;
                }
                f11 = f12 + f11;
                int i12 = Float.floatToIntBits(f11);
                int i13 = i12 & 0x7FFFFFFF;
                int i14_exp = 0;
                if (i13 < 0x7F800000 && i13 != 0) {
                    if (i13 < 0x800000) {
                        f11 = (float) ((double) f11 * 33554432.0);
                        i12 = Float.floatToIntBits(f11);
                        i13 = i12 & 0x7FFFFFFF;
                        i14_exp = -25;
                    }
                    i14_exp += (i13 >>> 23) - 126;
                    f11 = Float.intBitsToFloat((i12 & 0x807FFFFF) | 0x3F000000);
                }
                double d11 = (double) (f11 * 64.0f - 32.0f);
                int i13_tbl = (int) d11;
                float[] nx = ta0_1.Nx;
                float f11_interp = nx[i13_tbl];
                float f12_frac = (float) (d11 - (double) i13_tbl);
                float curve = ((nx[i13_tbl + 1] - f11_interp) * f12_frac + f11_interp) * f3;
                float t2_val = ta0_1.T2[i14_exp + de - (-32)];
                int i11_idx = (int) ((curve * t2_val - f1) * -8.0f);
                float final_f11;
                if (i11_idx < 0) {
                    final_f11 = 1.0f;
                } else if (i11_idx >= 1120) {
                    final_f11 = 0.0f;
                } else {
                    final_f11 = ta0_1.eJ0[i11_idx >>> 5] * ta0_1.o4[i11_idx & 31];
                }
                while (true) {
                    int i12_next = i9 + 1;
                    v4[i9] *= final_f11;
                    if (i12_next >= qw || w80[i12_next] != i10) {
                        i9 = i12_next;
                        break;
                    }
                    i9 = i12_next;
                }
            }
            return 1;
        }
        for (int i1 = 0; i1 < a30.qw; i1++) {
            v4[i1] = 0.0f;
        }
        return 0;
    }
}
