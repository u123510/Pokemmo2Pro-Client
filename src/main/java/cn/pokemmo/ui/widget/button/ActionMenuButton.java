package cn.pokemmo.ui.widget.button;

import f.*;

public class ActionMenuButton extends Fs {
    public Gp0 bk;
    public boolean Uo;
    public ws_2 VP;
    public uo_1 SH0;
    public final boolean BI;

    public ActionMenuButton() {
        this.BI = true;
        k7();
    }

    public ActionMenuButton(te0_0 te0_0Var, Gp0 gp0) {
        this.BI = true;
        k7();
        COm1(te0_0Var);
        g90(gp0);
        DC(uq0(), Tn0());
    }

    public ActionMenuButton(te0_0 te0_0Var, A3 a3) {
        this(te0_0Var, (Gp0) a3.NQ(Gp0.class));
    }

    public ActionMenuButton(te0_0 te0_0Var, A3 a3, String str) {
        this(te0_0Var, (Gp0) a3.Ip(Gp0.class, str));
    }

    public ActionMenuButton(Gp0 gp0) {
        this.BI = true;
        k7();
        g90(gp0);
        DC(uq0(), Tn0());
    }

    public ActionMenuButton(A3 a3) {
        super(a3);
        this.BI = true;
        k7();
        g90((Gp0) a3.NQ(Gp0.class));
        DC(uq0(), Tn0());
    }

    public ActionMenuButton(A3 a3, String str) {
        super(a3);
        this.BI = true;
        k7();
        g90((Gp0) a3.Ip(Gp0.class, str));
        DC(uq0(), Tn0());
    }

    public ActionMenuButton(YA ya) {
        this(new Gp0(ya, null, null));
    }

    public ActionMenuButton(YA ya, YA ya2) {
        this(new Gp0(ya, ya2, null));
    }

    public ActionMenuButton(YA ya, YA ya2, YA ya3) {
        this(new Gp0(ya, ya2, ya3));
    }

    public final void k7() {
        this.nx0 = cs_0.FU;
        uo_1 uo_1Var = new uo_1((jg0_0) this);
        this.SH0 = uo_1Var;
        wF0(uo_1Var);
    }

    public final boolean m9() {
        uo_1 uo_1Var = this.SH0;
        if (uo_1Var.Si0) {
            return true;
        }
        long j = uo_1Var.com1;
        if (j <= 0) {
            return false;
        }
        if (j > System.currentTimeMillis()) {
            return true;
        }
        uo_1Var.com1 = 0L;
        return false;
    }

    public final boolean sR() {
        uo_1 uo_1Var = this.SH0;
        return uo_1Var.dt0 || uo_1Var.Si0;
    }

    public void g90(Gp0 gp0) {
        if (gp0 == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.bk = gp0;
        Mv0(hx0());
    }

    public final YA hx0() {
        if (m9()) {
            if (this.Uo) {
                YA ya = this.bk.cV;
                if (ya != null) {
                    return ya;
                }
            }
            YA ya2 = this.bk.E40;
            if (ya2 != null) {
                return ya2;
            }
        }
        if (sR()) {
            if (this.Uo) {
                YA ya3 = this.bk.Xe;
                if (ya3 != null) {
                    return ya3;
                }
            }
            YA ya4 = this.bk.gx0;
            if (ya4 != null) {
                return ya4;
            }
        }
        boolean z = this.uP != null && this.uP.sy0 == this;
        if (this.Uo) {
            if (z) {
                YA ya5 = this.bk.a3;
                if (ya5 != null) {
                    return ya5;
                }
            }
            YA ya6 = this.bk.Cy0;
            if (ya6 != null) {
                return ya6;
            }
            if (sR()) {
                YA ya7 = this.bk.gx0;
                if (ya7 != null) {
                    return ya7;
                }
            }
        }
        if (z) {
            YA ya8 = this.bk.NuL;
            if (ya8 != null) {
                return ya8;
            }
        }
        return this.bk.UA0;
    }

    public final void yH0(boolean z, boolean z2) {
        if (this.Uo == z) {
            return;
        }
        ws_2 ws_2Var = this.VP;
        if (ws_2Var != null) {
            if (this.Uo == z) {
                return;
            }
            if (!z) {
                if (ws_2Var.ff.KB <= ws_2Var.RC0) {
                    return;
                }
                ws_2Var.ff.sj0(this, true);
            } else if (ws_2Var.QY != -1 && ws_2Var.ff.KB >= ws_2Var.QY) {
                if (!ws_2Var.Qo) {
                    return;
                }
                int i = 0;
                while (true) {
                    int i2 = ws_2Var.RC0;
                    ws_2Var.RC0 = 0;
                    ws_2Var.nK0.yH0(false, ws_2Var.nK0.BI);
                    ws_2Var.RC0 = i2;
                    if (this.Uo == z) {
                        return;
                    }
                    if (ws_2Var.ff.KB < ws_2Var.QY) {
                        break;
                    }
                    i++;
                    if (i > 10) {
                        return;
                    }
                }
                ws_2Var.ff.Ue0((jg0_0) this);
                ws_2Var.nK0 = (jg0_0) this;
            } else {
                ws_2Var.ff.Ue0((jg0_0) this);
                ws_2Var.nK0 = (jg0_0) this;
            }
        }
        this.Uo = z;
        if (z2) {
            qk_0 qk_0Var = (qk_0) f.UE0.TL0(qk_0.class).obtain();
            if (LC(qk_0Var)) {
                this.Uo = !z;
            }
            f.UE0.P3(qk_0Var);
        }
    }

    @Override
    public void BS(ui_1 ui_1Var, float f) {
        float f2;
        float f3;
        PD0();
        Mv0(hx0());
        if (m9()) {
            f2 = this.bk.Ui0;
            f3 = this.bk.pq0;
        } else if (this.Uo) {
            f2 = this.bk.t;
            f3 = this.bk.Hx0;
        } else {
            f2 = this.bk.at;
            f3 = this.bk.lH0;
        }
        boolean z = (f2 != 0.0f) || (f3 != 0.0f);
        KU ku = this.jL0;
        if (z) {
            for (int i = 0; i < ku.KB; i++) {
                te0_0 te0_0Var = (te0_0) ku.get(i);
                te0_0Var.getClass();
                if (f2 != 0.0f || f3 != 0.0f) {
                    te0_0Var.cM0 += f2;
                    te0_0Var.iG += f3;
                }
            }
        }
        super.BS(ui_1Var, f);
        if (z) {
            for (int i2 = 0; i2 < ku.KB; i2++) {
                te0_0 te0_0Var2 = (te0_0) ku.get(i2);
                float f4 = -f2;
                float f5 = -f3;
                te0_0Var2.getClass();
                if (f4 != 0.0f || f5 != 0.0f) {
                    te0_0Var2.cM0 += f4;
                    te0_0Var2.iG += f5;
                }
            }
        }
        if (this.uP != null && this.uP.uG && m9() != this.SH0.Si0) {
            lg_0.S4.rt0.G20();
        }
    }

    @Override
    public final float uq0() {
        float max = super.uq0();
        YA ya = this.bk.UA0;
        if (ya != null) {
            max = Math.max(max, ((br_1) ya).wv);
        }
        YA ya2 = this.bk.E40;
        if (ya2 != null) {
            max = Math.max(max, ((br_1) ya2).wv);
        }
        YA ya3 = this.bk.Cy0;
        if (ya3 != null) {
            max = Math.max(max, ((br_1) ya3).wv);
        }
        return max;
    }

    @Override
    public final float Tn0() {
        float max = super.Tn0();
        YA ya = this.bk.UA0;
        if (ya != null) {
            max = Math.max(max, ((br_1) ya).u1);
        }
        YA ya2 = this.bk.E40;
        if (ya2 != null) {
            max = Math.max(max, ((br_1) ya2).u1);
        }
        YA ya3 = this.bk.Cy0;
        if (ya3 != null) {
            max = Math.max(max, ((br_1) ya3).u1);
        }
        return max;
    }

    @Override
    public final float Q70() {
        return uq0();
    }

    @Override
    public final float n30() {
        return Tn0();
    }
}
