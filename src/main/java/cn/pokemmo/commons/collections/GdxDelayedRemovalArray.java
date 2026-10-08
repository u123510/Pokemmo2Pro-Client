package cn.pokemmo.commons.collections;

import f.*;


import com.badlogic.gdx.graphics.Color;
import java.util.Arrays;

public class GdxDelayedRemovalArray {
    public final sc_0 fu0;
    public boolean Ln0;
    public final es_1 NG;
    public final es_1 Hh;
    public int vG0;
    public float so;
    public float EV;
    public final Color pk;
    public float[][] mK;
    public int[] a6;
    public Nn0[] t7;
    public int[] AC0;

    public GdxDelayedRemovalArray(sc_0 sc_0Var) {
        this(sc_0Var, sc_0Var.yR());
    }

    public GdxDelayedRemovalArray(sc_0 sc_0Var, boolean z) {
        this.NG = new es_1();
        this.Hh = new es_1();
        this.pk = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.fu0 = sc_0Var;
        this.Ln0 = z;
        int i = sc_0Var.aa.KB;
        if (i == 0) {
            throw new IllegalArgumentException("The specified font must contain at least one texture page.");
        }
        this.mK = new float[i][];
        this.a6 = new int[i];
        if (i > 1) {
            this.t7 = new Nn0[i];
            for (int i2 = 0; i2 < this.t7.length; i2++) {
                this.t7[i2] = new Nn0();
            }
        }
        this.AC0 = new int[i];
    }

    public final void Y40(int i, int i2) {
        if (this.t7 != null) {
            Nn0 nn0 = this.t7[i];
            if (i2 > nn0.bR.length) {
                int i3 = i2 - nn0.Ml;
                if (i3 < 0) {
                    throw new IllegalArgumentException(yr_1.pG("additionalCapacity must be >= 0: ", i3));
                }
                int i4 = nn0.Ml + i3;
                if (i4 > nn0.bR.length) {
                    nn0.Wn(Math.max(Math.max(8, i4), (int) (((float) nn0.Ml) * 1.75f)));
                }
            }
        }
        int i5 = this.a6[i];
        int i6 = (i2 * 20) + i5;
        float[] fArr = this.mK[i];
        if (fArr == null) {
            this.mK[i] = new float[i6];
        } else if (fArr.length < i6) {
            float[] fArr2 = new float[i6];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            this.mK[i] = fArr2;
        }
    }

    public final void xT() {
        this.so = 0.0f;
        this.EV = 0.0f;
        ju_0 obtain = UE0.TL0(lpt3__5.class);
        if (this.Hh == null) {
            throw new IllegalArgumentException("objects cannot be null.");
        }
        obtain.freeAll(this.Hh);
        this.Hh.clear();
        this.NG.clear();
        for (int i = 0; i < this.a6.length; i++) {
            if (this.t7 != null) {
                this.t7[i].Ml = 0;
            }
            this.a6[i] = 0;
        }
    }

    public final lpt3__5 hG0(CharSequence charSequence, float f, float f2, int i, int i2, float f3, int i3, boolean z, String str) {
        lpt3__5 lpt3__5Var = (lpt3__5) UE0.TL0(lpt3__5.class).obtain();
        this.Hh.Ue0(lpt3__5Var);
        lpt3__5Var.cc(this.fu0, charSequence, i, i2, this.pk, f3, i3, z, str);
        float f4 = f2 + this.fu0.U5.sB0;
        int i4 = lpt3__5Var.ld0.KB;
        if (i4 == 0) {
            return lpt3__5Var;
        }
        if (this.mK.length < this.fu0.aa.KB) {
            int i5 = this.fu0.aa.KB;
            float[][] fArr = new float[i5][];
            System.arraycopy(this.mK, 0, fArr, 0, this.mK.length);
            this.mK = fArr;
            int[] iArr = new int[i5];
            System.arraycopy(this.a6, 0, iArr, 0, this.a6.length);
            this.a6 = iArr;
            Nn0[] nn0Arr = new Nn0[i5];
            int length = 0;
            if (this.t7 != null) {
                length = this.t7.length;
                System.arraycopy(this.t7, 0, nn0Arr, 0, this.t7.length);
            }
            while (length < i5) {
                nn0Arr[length] = new Nn0();
                length++;
            }
            this.t7 = nn0Arr;
            this.AC0 = new int[i5];
        }
        this.NG.Ue0(lpt3__5Var);
        if (this.mK.length == 1) {
            Y40(0, lpt3__5Var.pX);
        } else {
            Arrays.fill(this.AC0, 0);
            for (int i6 = 0; i6 < lpt3__5Var.ld0.KB; i6++) {
                hz_1 hz_1Var = (hz_1) lpt3__5Var.ld0.get(i6);
                Object[] objArr = hz_1Var.A30.rZ;
                int i7 = hz_1Var.A30.KB;
                for (int i8 = 0; i8 < i7; i8++) {
                    int i9 = ((th_1) objArr[i8]).qc0;
                    this.AC0[i9] = this.AC0[i9] + 1;
                }
            }
            for (int i10 = 0; i10 < this.AC0.length; i10++) {
                Y40(i10, this.AC0[i10]);
            }
        }
        Nn0 nn0 = lpt3__5Var.Ti;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        float f5 = 0.0f;
        for (int i14 = 0; i14 < i4; i14++) {
            hz_1 hz_1Var2 = (hz_1) lpt3__5Var.ld0.get(i14);
            Object[] objArr2 = hz_1Var2.A30.rZ;
            float[] fArr2 = hz_1Var2.TA0.iS;
            float f6 = hz_1Var2.S + f;
            float f7 = hz_1Var2.Vg0 + f4;
            int i15 = hz_1Var2.A30.KB;
            for (int i16 = 0; i16 < i15; i16++) {
                int i17 = i13 + 1;
                if (i13 == i12) {
                    f5 = Float.intBitsToFloat(nn0.X8(i11 + 1) & -16777217);
                    int i18 = i11 + 2;
                    if (i18 < nn0.Ml) {
                        i12 = nn0.X8(i18);
                    } else {
                        i12 = -1;
                    }
                    i11 = i18;
                }
                float f8 = f6 + fArr2[i16];
                th_1 th_1Var = (th_1) objArr2[i16];
                float f9 = (th_1Var.kJ0 * this.fu0.U5.o3) + f8;
                float f10 = (th_1Var.iM * this.fu0.U5.eL) + f7;
                float f11 = th_1Var.k * this.fu0.U5.o3;
                float f12 = th_1Var.pz0 * this.fu0.U5.eL;
                float f13 = th_1Var.DG;
                float f14 = th_1Var.En0;
                float f15 = th_1Var.A60;
                float f16 = th_1Var.Dj0;
                if (this.Ln0) {
                    f9 = Math.round(f9);
                    f10 = Math.round(f10);
                    f11 = Math.round(f11);
                    f12 = Math.round(f12);
                }
                float f17 = f9 + f11;
                float f18 = f10 + f12;
                int i19 = th_1Var.qc0;
                int i20 = this.a6[i19];
                this.a6[i19] = i20 + 20;
                if (this.t7 != null) {
                    this.t7[i19].ja0(this.vG0++);
                }
                float[] fArr3 = this.mK[i19];
                int i21 = i20 + 1;
                fArr3[i20] = f9;
                int i22 = i21 + 1;
                fArr3[i21] = f10;
                int i23 = i22 + 1;
                fArr3[i22] = f5;
                int i24 = i23 + 1;
                fArr3[i23] = f13;
                int i25 = i24 + 1;
                fArr3[i24] = f15;
                int i26 = i25 + 1;
                fArr3[i25] = f9;
                int i27 = i26 + 1;
                fArr3[i26] = f18;
                int i28 = i27 + 1;
                fArr3[i27] = f5;
                int i29 = i28 + 1;
                fArr3[i28] = f13;
                int i30 = i29 + 1;
                fArr3[i29] = f16;
                int i31 = i30 + 1;
                fArr3[i30] = f17;
                int i32 = i31 + 1;
                fArr3[i31] = f18;
                int i33 = i32 + 1;
                fArr3[i32] = f5;
                int i34 = i33 + 1;
                fArr3[i33] = f14;
                int i35 = i34 + 1;
                fArr3[i34] = f16;
                int i36 = i35 + 1;
                fArr3[i35] = f17;
                int i37 = i36 + 1;
                fArr3[i36] = f10;
                int i38 = i37 + 1;
                fArr3[i37] = f5;
                fArr3[i38] = f14;
                fArr3[i38 + 1] = f15;
                i13 = i17;
                f6 = f8;
            }
        }
        return lpt3__5Var;
    }

    public final void uq(ui_1 ui_1Var) {
        es_1 es_1Var = this.fu0.aa;
        for (int i = 0; i < this.mK.length; i++) {
            if (this.a6[i] > 0) {
                ui_1Var.Il0(((LPT6_) es_1Var.get(i)).OB, this.mK[i], this.a6[i]);
            }
        }
    }
}
