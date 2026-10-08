package cn.pokemmo.graphics.gdx.scene2d;

import f.*;


import com.badlogic.gdx.graphics.Color;

public class GdxActor {
    public ir_0 uP;
    public xv_0 xO;
    public final a0_0 Rn0;
    public final a0_0 fx;
    public final es_1 zz;
    public cs_0 nx0;
    public boolean On0;
    public float cM0;
    public float iG;
    public float E20;
    public float TK0;
    public float cz0;
    public float SE0;
    public float uf0;
    public final Color dC;

    public GdxActor() {
        this.Rn0 = new a0_0(0);
        this.fx = new a0_0(0);
        this.zz = new es_1(0);
        this.nx0 = cs_0.FU;
        this.On0 = true;
        this.cz0 = 1.0f;
        this.SE0 = 1.0f;
        this.dC = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public void yE0(float f) {
        es_1 es_1Var = this.zz;
        if (es_1Var.KB == 0) {
            return;
        }
        if (this.uP != null && this.uP.uG) {
            lg_0.S4.rt0.G20();
        }
        int i = 0;
        try {
            while (i < es_1Var.KB) {
                SP sp = (SP) es_1Var.get(i);
                if (sp.Nq0()) {
                    int i2 = -1;
                    if (i < es_1Var.KB) {
                        if (es_1Var.get(i) == sp) {
                            i2 = i;
                        } else {
                            i2 = es_1Var.E8(sp, true);
                        }
                    }
                    if (i2 != -1) {
                        es_1Var.Tx0(i2);
                        if (sp.ay0 == null) {
                            sp.ay0 = null;
                        }
                        i--;
                    }
                }
                i++;
            }
        } catch (RuntimeException e) {
            String str = toString();
            throw new RuntimeException("Actor: " + str.substring(0, Math.min(128, str.length())), e);
        }
    }

    public final boolean LC(mx0 mx0Var) {
        if (mx0Var.BX == null) {
            mx0Var.BX = this.uP;
        }
        mx0Var.bA = (te0_0) this;
        es_1 obtain = (es_1) UE0.TL0(es_1.class).obtain();
        for (xv_0 xv_0Var = this.xO; xv_0Var != null; xv_0Var = xv_0Var.xO) {
            obtain.Ue0(xv_0Var);
        }
        try {
            Object[] objArr = obtain.rZ;
            for (int i = obtain.KB - 1; i >= 0; i--) {
                ((xv_0) objArr[i]).ZG(mx0Var, true);
                if (mx0Var.s10) {
                    obtain.clear();
                    UE0.P3(obtain);
                    return false;
                }
            }
            ZG(mx0Var, true);
            if (mx0Var.s10) {
                obtain.clear();
                UE0.P3(obtain);
                return false;
            }
            ZG(mx0Var, false);
            if (!mx0Var.qe) {
                obtain.clear();
                UE0.P3(obtain);
                return false;
            }
            if (mx0Var.s10) {
                obtain.clear();
                UE0.P3(obtain);
                return false;
            }
            int i2 = obtain.KB;
            for (int i3 = 0; i3 < i2; i3++) {
                ((xv_0) objArr[i3]).ZG(mx0Var, false);
                if (mx0Var.s10) {
                    obtain.clear();
                    UE0.P3(obtain);
                    return false;
                }
            }
            obtain.clear();
            UE0.P3(obtain);
            return false;
        } catch (Throwable th) {
            obtain.clear();
            UE0.P3(obtain);
            throw th;
        }
    }

    public GdxActor nX(float f, float f2, boolean z) {
        if (z && this.nx0 != cs_0.FU) {
            return null;
        }
        if (!this.On0) {
            return null;
        }
        if (f < 0.0f || f >= this.E20 || f2 < 0.0f || f2 >= this.TK0) {
            return null;
        }
        return this;
    }

    public void BA(ir_0 ir_0Var) {
        this.uP = ir_0Var;
    }

    public final void Ne(cs_0 cs_0Var) {
        this.nx0 = cs_0Var;
    }

    public final void P20(float f, float f2) {
        if (this.cM0 != f || this.iG != f2) {
            this.cM0 = f;
            this.iG = f2;
        }
    }

    public final float Xk0() {
        return this.E20;
    }

    public final float FE0() {
        return this.TK0;
    }

    public void Ne0() {
    }

    public final void DC(float f, float f2) {
        if (this.E20 != f || this.TK0 != f2) {
            this.E20 = f;
            this.TK0 = f2;
            Ne0();
        }
    }

    public final void Ig(float f, float f2, float f3, float f4) {
        if (this.cM0 != f || this.iG != f2) {
            this.cM0 = f;
            this.iG = f2;
        }
        if (this.E20 != f3 || this.TK0 != f4) {
            this.E20 = f3;
            this.TK0 = f4;
            Ne0();
        }
    }

    public final Bp0 Do0(Bp0 bp0) {
        xv_0 xv_0Var = this.xO;
        if (xv_0Var != null) {
            xv_0Var.Do0(bp0);
        }
        lf(bp0);
        return bp0;
    }

    @Override
    public String toString() {
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return name.substring(lastIndexOf + 1);
        }
        return name;
    }

    public void BS(ui_1 ui_1Var, float f) {
    }

    public final void ZG(mx0 mx0Var, boolean z) {
        if (mx0Var.bA == null) {
            throw new IllegalArgumentException("The event target cannot be null.");
        }
        a0_0 a0_0Var = z ? this.fx : this.Rn0;
        int i = a0_0Var.KB;
        if (i == 0) {
            return;
        }
        mx0Var.vB0 = (te0_0) this;
        if (mx0Var.BX == null) {
            mx0Var.BX = this.uP;
        }
        a0_0Var.Lw++;
        try {
            for (int i2 = 0; i2 < i; i2++) {
                if (((ge0_1) a0_0Var.get(i2)).my(mx0Var)) {
                    mx0Var.bC = true;
                }
            }
            a0_0Var.Lu();
        } catch (RuntimeException e) {
            String str = toString();
            throw new RuntimeException("Actor: " + str.substring(0, Math.min(128, str.length())), e);
        }
    }

    public final void wF0(ge0_1 ge0_1Var) {
        if (!this.Rn0.j4(ge0_1Var, true)) {
            this.Rn0.Ue0(ge0_1Var);
        }
    }

    public final void lf(Bp0 bp0) {
        float f = this.uf0;
        float f2 = this.cz0;
        float f3 = this.SE0;
        float f4 = this.cM0;
        float f5 = this.iG;
        if (f == 0.0f) {
            if (f2 == 1.0f && f3 == 1.0f) {
                bp0.x -= f4;
                bp0.y -= f5;
            } else {
                bp0.x = (bp0.x - f4) / f2;
                bp0.y = (bp0.y - f5) / f3;
            }
        } else {
            float cos = (float) Math.cos(((double) f) * 0.01745329238474369d);
            float sin = (float) Math.sin(((double) f) * 0.01745329238474369d);
            float f6 = bp0.x - f4;
            float f7 = bp0.y - f5;
            bp0.x = ((f6 * cos) + (f7 * sin)) / f2;
            bp0.y = ((f6 * (-sin)) + (f7 * cos)) / f3;
        }
    }
}
