package cn.pokemmo.graphics.gdx.scene2d;

import f.*;


import com.badlogic.gdx.math.Matrix4;

public class GdxTreeActor extends te0_0 implements Cp0 {
    public static final Bp0 UE0 = new Bp0();
    public final KU jL0;
    public final F20 x4;
    public final Matrix4 lE0;
    public final Matrix4 dq0;
    public boolean p4;
    public ql_0 yh;

    public GdxTreeActor() {
        this.jL0 = new KU(true, 4, te0_0.class);
        this.x4 = new F20();
        this.lE0 = new Matrix4();
        this.dq0 = new Matrix4();
        this.p4 = true;
    }

    @Override
    public void yE0(float f) {
        super.yE0(f);
        te0_0[] te0_0Array = (te0_0[]) this.jL0.pa();
        int i = 0;
        int i2 = this.jL0.KB;
        while (i < i2) {
            te0_0Array[i].yE0(f);
            i++;
        }
        this.jL0.Gj0();
    }

    public final Matrix4 IJ0() {
        F20 f20Obj = this.x4;
        float f = this.cM0 + 0.0f;
        float f2 = this.iG + 0.0f;
        float f3 = this.uf0;
        float f4 = this.cz0;
        float f5 = this.SE0;
        f20Obj.Ua0 = f;
        f20Obj.vD = f2;
        if (f3 == 0.0f) {
            f20Obj.oV = f4;
            f20Obj.IP = 0.0f;
            f20Obj.aC = 0.0f;
            f20Obj.Jt0 = f5;
        } else {
            float f6 = LW.Om(f3);
            float f7 = LW.gc0(f3);
            f20Obj.oV = f7 * f4;
            f20Obj.IP = -f6 * f5;
            f20Obj.aC = f6 * f4;
            f20Obj.Jt0 = f7 * f5;
        }
        xv_0 xv_02 = this.xO;
        while (xv_02 != null) {
            if (xv_02.p4) {
                break;
            }
            xv_02 = xv_02.xO;
        }
        if (xv_02 != null) {
            F20 f20_2 = xv_02.x4;
            float f8 = f20_2.oV;
            float f9 = f20Obj.oV;
            float f10 = f8 * f9;
            float f11 = f20_2.IP;
            float f12 = f20Obj.aC;
            float f13 = f10 + f11 * f12;
            float f14 = f20Obj.IP;
            float f15 = f8 * f14;
            float f16 = f20Obj.Jt0;
            float f17 = f15 + f11 * f16;
            float f18 = f20Obj.Ua0;
            float f19 = f8 * f18;
            float f20 = f20Obj.vD;
            float f21 = f19 + f11 * f20 + f20_2.Ua0;
            float f22 = f20_2.aC;
            float f23 = f20_2.Jt0;
            float f24 = f22 * f9 + f23 * f12;
            float f25 = f22 * f14 + f23 * f16;
            float f26 = f22 * f18 + f23 * f20 + f20_2.vD;
            f20Obj.oV = f13;
            f20Obj.IP = f17;
            f20Obj.Ua0 = f21;
            f20Obj.aC = f24;
            f20Obj.Jt0 = f25;
            f20Obj.vD = f26;
        }
        float[] fArray = this.lE0.EW;
        fArray[0] = f20Obj.oV;
        fArray[1] = f20Obj.aC;
        fArray[2] = 0.0f;
        fArray[3] = 0.0f;
        fArray[4] = f20Obj.IP;
        fArray[5] = f20Obj.Jt0;
        fArray[6] = 0.0f;
        fArray[7] = 0.0f;
        fArray[8] = 0.0f;
        fArray[9] = 0.0f;
        fArray[10] = 1.0f;
        fArray[11] = 0.0f;
        fArray[12] = f20Obj.Ua0;
        fArray[13] = f20Obj.vD;
        fArray[14] = 0.0f;
        fArray[15] = 1.0f;
        return this.lE0;
    }

    @Override
    public te0_0 nX(float f, float f2, boolean z) {
        if (z && this.nx0 == cs_0.Mh) {
            return null;
        }
        if (!this.On0) {
            return null;
        }
        Bp0 bp0 = UE0;
        te0_0[] te0_0Array = (te0_0[]) this.jL0.rZ;
        for (int i = this.jL0.KB - 1; i >= 0; i--) {
            te0_0 te0_02 = te0_0Array[i];
            bp0.x = f;
            bp0.y = f2;
            te0_02.lf(bp0);
            te0_0 nX = te0_02.nX(bp0.x, bp0.y, z);
            if (nX != null) {
                return nX;
            }
        }
        return super.nX(f, f2, z);
    }

    public void E3() {
    }

    public void KD0(te0_0 te0_02) {
        xv_0 xv_02 = te0_02.xO;
        if (xv_02 != null) {
            if (xv_02 == this) {
                return;
            }
            xv_02.throws$(te0_02, false);
        }
        this.jL0.Ue0(te0_02);
        te0_02.xO = (xv_0) this;
        te0_02.BA(this.uP);
        this.E3();
    }

    public boolean throws$(te0_0 te0_02, boolean z) {
        int i = this.jL0.E8(te0_02, true);
        if (i == -1) {
            return false;
        }
        this.u7(i, z);
        return true;
    }

    public te0_0 u7(int i, boolean z) {
        te0_0 te0_02 = (te0_0) this.jL0.Tx0(i);
        ir_0 ir_02 = this.uP;
        if (ir_02 != null) {
            if (z) {
                ir_02.xe0(te0_02);
            }
            int length = ir_02.eg0.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (te0_02 == ir_02.eg0[i2]) {
                    ir_02.eg0[i2] = null;
                    int i3 = ir_02.aH[i2];
                    int i4 = ir_02.Gi[i2];
                    ir_02.xX(te0_02, i3, i4, i2);
                }
            }
            if (te0_02 == ir_02.a40) {
                ir_02.a40 = null;
                int wm = ir_02.wm;
                int rr0 = ir_02.Rr0;
                ir_02.xX(te0_02, wm, rr0, -1);
            }
        }
        te0_02.xO = null;
        te0_02.BA(null);
        this.E3();
        return te0_02;
    }

    @Override
    public final void BA(ir_0 ir_02) {
        this.uP = ir_02;
        te0_0[] te0_0Array = (te0_0[]) this.jL0.rZ;
        int i = 0;
        int i2 = this.jL0.KB;
        while (i < i2) {
            te0_0Array[i].BA(ir_02);
            i++;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        this.dr0(stringBuilder, 1);
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public final void dr0(StringBuilder stringBuilder, int i) {
        stringBuilder.append(super.toString()).append('\n');
        te0_0[] te0_0Array = (te0_0[]) this.jL0.pa();
        int i2 = 0;
        int i3 = this.jL0.KB;
        while (i2 < i3) {
            for (int i4 = 0; i4 < i; i4++) {
                stringBuilder.append("|  ");
            }
            te0_0 te0_02 = te0_0Array[i2];
            if (te0_02 instanceof xv_0) {
                ((xv_0) te0_02).dr0(stringBuilder, i + 1);
            } else {
                stringBuilder.append(te0_02).append('\n');
            }
            i2++;
        }
        this.jL0.Gj0();
    }

    @Override
    public void BS(ui_1 ui_12, float f) {
        if (this.p4) {
            Matrix4 ij0 = this.IJ0();
            this.dq0.Dd0(ui_12.jP.EW);
            ui_12.Ud(ij0);
        }
        this.Yf0(ui_12, f);
        if (this.p4) {
            ui_12.Ud(this.dq0);
        }
    }

    public final void Yf0(ui_1 ui_12, float f) {
        float f2 = f * this.dC.a;
        KU ku = this.jL0;
        te0_0[] te0_0Array = (te0_0[]) ku.pa();
        ql_0 ql_02 = this.yh;
        if (ql_02 != null) {
            float f3 = ql_02.j80;
            float f4 = f3 + ql_02.IA;
            float f5 = ql_02.Wm0;
            float f6 = f5 + ql_02.Eu0;
            if (this.p4) {
                int i = 0;
                int i2 = ku.KB;
                while (i < i2) {
                    te0_0 te0_02 = te0_0Array[i];
                    if (te0_02.On0) {
                        float f7 = te0_02.cM0;
                        float f8 = te0_02.iG;
                        if (f7 <= f4 && f8 <= f6 && f7 + te0_02.E20 >= f3 && f8 + te0_02.TK0 >= f5) {
                            te0_02.BS(ui_12, f2);
                        }
                    }
                    i++;
                }
            } else {
                float f9 = this.cM0;
                float f10 = this.iG;
                this.cM0 = 0.0f;
                this.iG = 0.0f;
                int i3 = 0;
                int i4 = ku.KB;
                while (i3 < i4) {
                    te0_0 te0_03 = te0_0Array[i3];
                    if (te0_03.On0) {
                        float f11 = te0_03.cM0;
                        float f12 = te0_03.iG;
                        if (f11 <= f4 && f12 <= f6 && f11 + te0_03.E20 >= f3 && f12 + te0_03.TK0 >= f5) {
                            te0_03.cM0 = f11 + f9;
                            te0_03.iG = f12 + f10;
                            te0_03.BS(ui_12, f2);
                            te0_03.cM0 = f11;
                            te0_03.iG = f12;
                        }
                    }
                    i3++;
                }
                this.cM0 = f9;
                this.iG = f10;
            }
        } else if (this.p4) {
            int i5 = 0;
            int i6 = ku.KB;
            while (i5 < i6) {
                te0_0 te0_04 = te0_0Array[i5];
                if (te0_04.On0) {
                    te0_04.BS(ui_12, f2);
                }
                i5++;
            }
        } else {
            float f13 = this.cM0;
            float f14 = this.iG;
            this.cM0 = 0.0f;
            this.iG = 0.0f;
            int i7 = 0;
            int i8 = ku.KB;
            while (i7 < i8) {
                te0_0 te0_05 = te0_0Array[i7];
                if (te0_05.On0) {
                    float f15 = te0_05.cM0;
                    float f16 = te0_05.iG;
                    te0_05.cM0 = f15 + f13;
                    te0_05.iG = f16 + f14;
                    te0_05.BS(ui_12, f2);
                    te0_05.cM0 = f15;
                    te0_05.iG = f16;
                }
                i7++;
            }
            this.cM0 = f13;
            this.iG = f14;
        }
        ku.Gj0();
    }

    public void kl0() {
        te0_0[] te0_0Array = (te0_0[]) this.jL0.pa();
        int i = 0;
        int i2 = this.jL0.KB;
        while (i < i2) {
            te0_0 te0_02 = te0_0Array[i];
            ir_0 ir_02 = this.uP;
            if (ir_02 != null) {
                ir_02.xe0(te0_02);
            }
            te0_02.BA(null);
            te0_02.xO = null;
            i++;
        }
        this.jL0.Gj0();
        this.jL0.clear();
        this.E3();
    }

    public final void j5() {
        this.p4 = false;
    }
}
