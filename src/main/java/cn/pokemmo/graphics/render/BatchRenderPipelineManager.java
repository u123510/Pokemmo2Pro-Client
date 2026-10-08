package cn.pokemmo.graphics.render;

import f.*;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BatchRenderPipelineManager {
    public final h20_0 eE0;
    public Object Op;
    public int B8;
    public int SB;
    public final ArrayList yK0;
    public final j1_0 FU;
    public final ArrayList oI;
    public j1_0 CC0;
    public boolean wc0;
    public float[] HA;
    public float[] oF0;
    public float[] cl;
    public float[] FO;
    public float D60;
    public float zN;
    public float Zo;
    public float DC0;
    public float[] ub0;
    public float[] gf0;
    public float[] W8;
    public float[] PG;
    public float[] WC0;
    public float[] ET;
    public vl0_0 Xf0;
    public vl0_0 bL0;
    public vl0_0 gr0;
    public vl0_0 ts0;
    public int MP;
    public int lpT7;

    public BatchRenderPipelineManager(ok_0 ok) {
        this.yK0 = new ArrayList(4);
        this.oI = new ArrayList(2);
        this.wc0 = true;
        this.MP = 1;
        this.lpT7 = 1;
        this.eE0 = ok;
        this.FU = ok.aM((bk_2) this);
        this.FU.i50();
    }

    public static float L10(IT i, j1_0 j) {
        if (i == null) return 0.0f;
        float f = i.Sw0(j);
        h20_0.RV.getClass();
        return f;
    }

    public static float i2(IT i, j1_0 j) {
        if (i == null) return 0.0f;
        float f = i.Sw0(j);
        h20_0.RV.getClass();
        return f;
    }

    public static float[] El0(int n, float[] arr) {
        if (arr != null && arr.length >= n) {
            Arrays.fill(arr, 0, n, 0.0f);
            return arr;
        }
        return new float[n];
    }

    public final void la0() {
        int n = 0;
        for (int i = this.yK0.size() - 1; i >= 0; i--) {
            j1_0 j = (j1_0)this.yK0.get(i);
            if (j.Hs) break;
            n = j.d80.intValue() + n;
        }
        this.B8 = Math.max(this.B8, n);
        this.SB++;
        ((j1_0)this.yK0.get(this.yK0.size() - 1)).Hs = true;
        ((tk0_0)this.Op).COm3();
    }

    public final float a9(IT i) {
        if (i == null) return 0.0f;
        float f = i.tK();
        h20_0.RV.getClass();
        return f;
    }

    public final float kI0(IT i) {
        if (i == null) return 0.0f;
        float f = i.tK();
        h20_0.RV.getClass();
        return f;
    }

    public final void Gc0() {
        this.wc0 = false;
        ArrayList list = this.yK0;
        if (list.size() > 0 && !((j1_0)list.get(list.size() - 1)).Hs) {
            this.la0();
        }
        this.HA = El0(this.B8, this.HA);
        this.oF0 = El0(this.SB, this.oF0);
        this.cl = El0(this.B8, this.cl);
        this.FO = El0(this.SB, this.FO);
        this.ub0 = El0(this.B8, this.ub0);
        this.gf0 = El0(this.SB, this.gf0);
        this.W8 = El0(this.B8, this.W8);
        this.PG = El0(this.SB, this.PG);
        float f2 = 0.0f;
        for (int i = 0, n = list.size(); i < n; i++) {
            j1_0 j = (j1_0)list.get(i);
            if (j.zw.booleanValue()) continue;
            if (j.i8.intValue() != 0) {
                if (this.PG[j.pr] == 0.0f) {
                    this.PG[j.pr] = j.i8.intValue();
                }
            }
            if (j.d80.intValue() == 1 && j.Hb0.intValue() != 0) {
                if (this.W8[j.Fu0] == 0.0f) {
                    this.W8[j.Fu0] = j.Hb0.intValue();
                }
            }
            float f5 = L10(j.Ek0, j);
            f2 = j.Fu0 == 0 ? 0.0f : Math.max(0.0f, L10(j.wv, j) - f2);
            j.KW = f5 + f2;
            j.hB0 = i2(j.Yg, j);
            int gZ = j.gZ;
            if (gZ != -1) {
                j1_0 parent = (j1_0)list.get(gZ);
                j.hB0 = Math.max(0.0f, i2(j.IJ0, j) - i2(parent.FI0, parent)) + j.hB0;
            }
            f2 = L10(j.rN, j);
            f5 = L10(j.J90, j);
            float f6 = j.Fu0 + j.d80.intValue() == this.B8 ? 0.0f : f2;
            j.Yw = f5 + f6;
            f5 = i2(j.ck0, j);
            f6 = j.pr == this.SB - 1 ? 0.0f : i2(j.FI0, j);
            j.Hd = f5 + f6;
            f5 = L10(j.Mu, j);
            f6 = i2(j.CoM5, j);
            float f7 = L10(j.sn0, j);
            float f8 = i2(j.jQ, j);
            float f9 = L10(j.Nk0, j);
            float f10 = i2(j.xK, j);
            if (f5 < f7) f5 = f7;
            if (f6 < f8) f6 = f8;
            if (!(f9 > 0.0f) || !(f5 > f9)) f9 = f5;
            if (!(f10 > 0.0f) || !(f6 > f10)) f10 = f6;
            if (j.d80.intValue() == 1) {
                float f11 = j.KW + j.Yw;
                int idx = j.Fu0;
                this.cl[idx] = Math.max(this.cl[idx], f9 + f11);
                this.HA[idx] = Math.max(this.HA[idx], f7 + f11);
            }
            float f11 = j.hB0 + j.Hd;
            int idx = j.pr;
            this.FO[idx] = Math.max(this.FO[idx], f10 + f11);
            this.oF0[idx] = Math.max(this.oF0[idx], f8 + f11);
        }
        for (int i = 0, n = list.size(); i < n; i++) {
            j1_0 j = (j1_0)list.get(i);
            if (j.zw.booleanValue() || j.Hb0.intValue() == 0) continue;
            int end = j.Fu0 + j.d80.intValue();
            boolean empty = true;
            for (int k = j.Fu0; k < end; k++) {
                if (this.W8[k] != 0.0f) {
                    empty = false;
                    break;
                }
            }
            if (!empty) continue;
            for (int k = j.Fu0; k < end; k++) {
                this.W8[k] = j.Hb0.intValue();
            }
        }
        for (int i = 0, n = list.size(); i < n; i++) {
            j1_0 j = (j1_0)list.get(i);
            if (j.zw.booleanValue() || j.d80.intValue() == 1) continue;
            float f11 = L10(j.sn0, j);
            float f12 = L10(j.Mu, j);
            float f13 = L10(j.Nk0, j);
            if (f12 < f11) f12 = f11;
            if (!(f13 > 0.0f) || !(f12 > f13)) f13 = f12;
            f12 = -(j.KW + j.Yw);
            float f14 = f12;
            for (int k = j.Fu0; k < j.Fu0 + j.d80.intValue(); k++) {
                f12 += this.HA[k];
                f14 += this.cl[k];
            }
            float f15 = 0.0f;
            for (int k = j.Fu0; k < j.Fu0 + j.d80.intValue(); k++) {
                f15 += this.W8[k];
            }
            f11 = Math.max(0.0f, f11 - f12);
            f12 = Math.max(0.0f, f13 - f14);
            for (int k = j.Fu0; k < j.Fu0 + j.d80.intValue(); k++) {
                float f16 = f15 == 0.0f ? 1.0f / (float)j.d80.intValue() : this.W8[k] / f15;
                this.HA[k] = f11 * f16 + this.HA[k];
                this.cl[k] = f12 * f16 + this.cl[k];
            }
        }
        float haMax = 0.0f;
        float clMax = 0.0f;
        float oF0Max = 0.0f;
        float foMax = 0.0f;
        for (int i = 0, n = list.size(); i < n; i++) {
            j1_0 j = (j1_0)list.get(i);
            if (j.zw.booleanValue()) continue;
            if (j.or0 != null && j.or0.booleanValue() && j.d80.intValue() == 1) {
                float s = j.KW + j.Yw;
                haMax = Math.max(haMax, this.HA[j.Fu0] - s);
                clMax = Math.max(clMax, this.cl[j.Fu0] - s);
            }
            if (j.OI != null && j.OI.booleanValue()) {
                float s = j.hB0 + j.Hd;
                oF0Max = Math.max(oF0Max, this.oF0[j.pr] - s);
                foMax = Math.max(foMax, this.FO[j.pr] - s);
            }
        }
        if (clMax > 0.0f || foMax > 0.0f) {
            for (int i = 0, n = list.size(); i < n; i++) {
                j1_0 j = (j1_0)list.get(i);
                if (j.zw.booleanValue()) continue;
                if (clMax > 0.0f && j.or0 != null && j.or0.booleanValue() && j.d80.intValue() == 1) {
                    float s = j.KW + j.Yw;
                    int idx = j.Fu0;
                    this.HA[idx] = haMax + s;
                    this.cl[idx] = clMax + s;
                }
                if (foMax > 0.0f && j.OI != null && j.OI.booleanValue()) {
                    float s = j.hB0 + j.Hd;
                    int idx = j.pr;
                    this.oF0[idx] = oF0Max + s;
                    this.FO[idx] = foMax + s;
                }
            }
        }
        this.D60 = 0.0f;
        this.zN = 0.0f;
        this.Zo = 0.0f;
        this.DC0 = 0.0f;
        for (int i = 0; i < this.B8; i++) {
            this.D60 += this.HA[i];
            this.Zo += this.cl[i];
        }
        for (int i = 0; i < this.SB; i++) {
            float f = this.oF0[i];
            this.zN += f;
            this.DC0 = Math.max(f, this.FO[i]) + this.DC0;
        }
        float f31 = this.a9(this.bL0) + this.a9(this.ts0);
        float f18 = this.kI0(this.Xf0) + this.kI0(this.gr0);
        this.D60 = this.D60 + f31;
        this.zN += f18;
        this.Zo = Math.max(this.Zo + f31, this.D60);
        this.DC0 = Math.max(this.DC0 + f18, this.zN);
    }

    public final j1_0 vx0(Object object) {
        j1_0 j = this.eE0.aM((bk_2) this);
        j.kh0 = object;
        if (this.yK0.size() > 0) {
            j1_0 last = (j1_0)this.yK0.get(this.yK0.size() - 1);
            if (!last.Hs) {
                j.Fu0 = last.Fu0 + last.d80.intValue();
                j.pr = last.pr;
            } else {
                j.Fu0 = 0;
                j.pr = last.pr + 1;
            }
            if (j.pr > 0) {
                outer:
                for (int i = this.yK0.size() - 1; i >= 0; i--) {
                    j1_0 prev = (j1_0)this.yK0.get(i);
                    int start = prev.Fu0;
                    int end = prev.Fu0 + prev.d80.intValue();
                    for (int k = start; k < end; k++) {
                        if (k == j.Fu0) {
                            j.gZ = i;
                            break outer;
                        }
                    }
                }
            }
        } else {
            j.Fu0 = 0;
            j.pr = 0;
        }
        this.yK0.add(j);
        j1_0 fu = this.FU;
        j.sn0 = fu.sn0;
        j.jQ = fu.jQ;
        j.Mu = fu.Mu;
        j.CoM5 = fu.CoM5;
        j.Nk0 = fu.Nk0;
        j.xK = fu.xK;
        j.IJ0 = fu.IJ0;
        j.wv = fu.wv;
        j.FI0 = fu.FI0;
        j.rN = fu.rN;
        j.Yg = fu.Yg;
        j.Ek0 = fu.Ek0;
        j.ck0 = fu.ck0;
        j.J90 = fu.J90;
        j.rs0 = fu.rs0;
        j.LPt7 = fu.LPt7;
        j.mA = fu.mA;
        j.Hb0 = fu.Hb0;
        j.i8 = fu.i8;
        j.zw = fu.zw;
        j.d80 = fu.d80;
        j.or0 = fu.or0;
        j.OI = fu.OI;
        if (j.Fu0 < this.oI.size() && (fu = (j1_0)this.oI.get(j.Fu0)) != null) {
            j.K70(fu);
        }
        j.K70(this.CC0);
        if (object != null) {
            this.eE0.getClass();
            le0_2 op = (le0_2)this.Op;
            op.F9(op.fU(), (le0_2)object);
        }
        return j;
    }

    public final j1_0 Rg() {
        if (this.yK0.size() > 0) {
            this.la0();
        }
        if (this.CC0 != null) {
            this.eE0.getClass();
        }
        this.CC0 = this.eE0.aM((bk_2) this);
        this.CC0.jW();
        return this.CC0;
    }

    public final j1_0 yu0(int n) {
        j1_0 j = this.oI.size() > n ? (j1_0)this.oI.get(n) : null;
        if (j == null) {
            j = this.eE0.aM((bk_2) this);
            j.jW();
            if (n >= this.oI.size()) {
                for (int i = this.oI.size(); i < n; i++) {
                    this.oI.add(null);
                }
                this.oI.add(j);
            } else {
                this.oI.set(n, j);
            }
        }
        return j;
    }

    public final void x7() {
        this.OO();
        this.Xf0 = null;
        this.bL0 = null;
        this.gr0 = null;
        this.ts0 = null;
        this.MP = 1;
        int n = 1;
        if (this.lpT7 != 1) {
            this.eE0.S50((A40)this);
        }
        this.lpT7 = n;
        this.FU.i50();
        for (int i = 0, size = this.oI.size(); i < size; i++) {
            if ((j1_0)this.oI.get(i) == null) continue;
            this.eE0.getClass();
        }
        this.oI.clear();
    }

    public final void OO() {
        for (int i = this.yK0.size() - 1; i >= 0; i--) {
            Object o = ((j1_0)this.yK0.get(i)).kh0;
            if (o != null) {
                this.eE0.getClass();
                ((le0_2)this.Op).u3((le0_2)o);
            }
            this.eE0.getClass();
        }
        this.yK0.clear();
        this.SB = 0;
        this.B8 = 0;
        if (this.CC0 != null) {
            this.eE0.getClass();
        }
        this.CC0 = null;
        ((tk0_0)this.Op).COm3();
    }

    public final j1_0 pz(Object object) {
        for (int i = 0, n = this.yK0.size(); i < n; i++) {
            j1_0 j = (j1_0)this.yK0.get(i);
            if (j.kh0 == object) return j;
        }
        return null;
    }

    public final void Fp0(Object object) {
        this.Op = object;
    }

    public final j1_0 yI() {
        return this.FU;
    }

    public BatchRenderPipelineManager rx0(float f) {
        this.Xf0 = new vl0_0(f);
        this.wc0 = true;
        return this;
    }

    public BatchRenderPipelineManager qE0(float f) {
        this.bL0 = new vl0_0(f);
        this.wc0 = true;
        return this;
    }

    public BatchRenderPipelineManager Dr0(float f) {
        this.ts0 = new vl0_0(f);
        this.wc0 = true;
        return this;
    }

    public BatchRenderPipelineManager YI0() {
        this.MP = 1;
        return this;
    }

    public BatchRenderPipelineManager uc() {
        this.MP = (this.MP | 2) & 0xFFFFFFFB;
        return this;
    }

    public final void EF(float f) {
        this.Xf0 = new vl0_0(f);
        this.bL0 = new vl0_0(f);
        this.gr0 = new vl0_0(f);
        this.ts0 = new vl0_0(f);
        this.wc0 = true;
    }

    public final void qf(float f) {
        this.gr0 = new vl0_0(f);
        this.wc0 = true;
    }

    public final void X0() {
        this.MP = (this.MP | 8) & 0xFFFFFFEF;
    }
}
