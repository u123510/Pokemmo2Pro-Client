package cn.pokemmo.graphics.gdx.model;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;

public class GdxBoneWeightsManager extends mg_0 {
    public com3__3 coM1;
    public Ou0 nj0;
    public byte LpT6;
    public short ku0;
    public ht_0 Gh;
    public Wr Lpt3 = null;
    public Texture G50;
    public ej_1 rG;
    public boolean a10 = false;
    public boolean V0 = false;
    public int xv0;
    public int F2;
    public boolean xz = false;
    public long xg0 = 0L;

    public GdxBoneWeightsManager(E90 e90) {
        super(e90);
        this.Lpt3 = null;
        this.a10 = false;
        this.V0 = false;
        this.xz = false;
        this.xg0 = 0L;
    }

    @Override
    public final boolean N30(hl0_1 hl0_1Var, int i, boolean z) {
        if (this.V0 && this.ku0 == 285) {
            i = (int) ((hk0_1.KG / 60L) % 8L);
        }
        this.a10 = false;
        if ((dw_2.Is0 || this.LpT6 == 4) && tw0_0.Ll0.t1 != null && !(QI.Py.kN(this.LpT6, this.ku0, false) instanceof IH)) {
            Wr v5 = tw0_0.Ll0.t1.v5(this.LpT6, this.ku0, (short) i);
            this.Lpt3 = v5;
            this.a10 = v5 != null;
        }
        if (!this.a10) {
            ht_0 kN = QI.Py.kN(this.LpT6, this.ku0, false);
            this.Gh = kN;
            this.Lpt3 = kN.li0(i);
        }
        Wr wr = this.Lpt3;
        if (wr == null) {
            return true;
        }
        this.G50 = wr.H8();
        this.xv0 = (int) this.VH.x;
        this.F2 = (int) this.VH.y;
        if (this.a10 || this.V0) {
            wH0(255, hl0_1Var);
            float f = (this.xv0 + 0.5f) - ((this.G50.getWidth() * 0.75f - 16.0f) / 2.0f);
            float f2 = this.F2 - (this.G50.getHeight() * 0.75f - 16.0f);
            hl0_1Var.QB0(this.G50, f, f2, this.G50.getWidth() * 0.75f, this.G50.getHeight() * 0.75f, this.G50.getWidth(), this.G50.getHeight(), z, false);
        } else {
            ht_0 ht_0Var = this.Gh;
            if (ht_0Var == null || ht_0Var.Lx0() != -1) {
                wH0(255, hl0_1Var);
                float f3 = this.xv0 - ((this.G50.getWidth() - 16) / 2);
                float f4 = this.F2 - (this.G50.getHeight() - 16);
                hl0_1Var.QB0(this.G50, f3, f4, this.G50.getWidth(), this.G50.getHeight(), this.G50.getWidth(), this.G50.getHeight(), z, false);
            }
        }
        return true;
    }

    @Override
    public final boolean jq0(BJ0 bj0, ER er, U5 u5, int i, boolean z) {
        if (tw0_0.Ll0.Qz0 == null) {
            return true;
        }
        if (this.V0 && this.ku0 == 285) {
            i = (int) ((hk0_1.KG / 60L) % 8L);
        }
        UT.oV().getClass();
        if (UT.Ce0(this.LpT6, this.ku0)) {
            if (this.nj0 == null) {
                this.nj0 = UT.oV().jK(this.ku0);
            }
            this.nj0.eo0(this.VH);
            er.Lh0(this.nj0, u5);
            xD(bj0, er, u5, false, true);
            return true;
        }
        if (this.V0) {
            ht_0 kN = QI.Py.kN(this.LpT6, this.ku0, false);
            this.Gh = kN;
            Wr li0 = kN.li0(i);
            this.Lpt3 = li0;
            if (li0 == null) {
                return true;
            }
            if (this.coM1 == null) {
                this.coM1 = new com3__3(32, 32, new LPT6_(li0.H8()), false);
            }
            this.Lpt3.Ik = hk0_1.KG;
            this.coM1.qq0(vo_2.z0);
            this.coM1.OF0(0.011f);
            this.coM1.Vg();
            this.coM1.bq0.I3.uj = this.Lpt3.H8();
            this.coM1.QG(ZD() == 3);
            this.coM1.qr0(this.VH);
            this.coM1.DB0(this.n80, this.qv0.St0);
            er.Lh0(this.coM1, u5);
            xD(bj0, er, u5, false, false);
            return true;
        }
        ej_1 AF = tw0_0.Ll0.Qz0.AF(this.ku0);
        this.rG = AF;
        if (AF == ej_1.RR) {
            return true;
        }
        if (AF.Ky0 != 0) {
            xD(bj0, er, u5, false, false);
        }
        byte b = this.rG.JZ;
        if (b == 1) {
            Wr gs0 = this.rG.gs0(ZD(), this.ui0);
            this.Lpt3 = gs0;
            if (gs0 == null) {
                return true;
            }
            if (this.coM1 == null) {
                this.coM1 = new com3__3(32, 32, new LPT6_(gs0.H8()), false);
            }
            this.Lpt3.Ik = hk0_1.KG;
            this.coM1.qq0(vo_2.z0);
            if (this.rG.Z80 == 2) {
                this.coM1.OF0(0.022f);
                this.coM1.Vg();
                this.VH.y += 0.16f;
            } else {
                this.coM1.OF0(0.011f);
                this.coM1.Vg();
            }
            this.coM1.bq0.I3.uj = this.Lpt3.H8();
            byte b2 = this.rG.vd;
            boolean z2 = (b2 == 5 || b2 == 12 || b2 == 13) && (ZD() == 3);
            this.coM1.QG(z2);
            this.coM1.qr0(this.VH);
            this.coM1.DB0(this.n80, this.qv0.St0);
            er.Lh0(this.coM1, u5);
        } else if (b == 2) {
            Ou0 rH = fi_0.xL().rH(this.rG.vq);
            Matrix4 matrix4 = rH.ho;
            bg0.x = 1.0f;
            bg0.y = 1.0f;
            bg0.z = 1.0f;
            matrix4.oF0(this.VH, this.fl0, bg0);
            rH.ho.el0(this.rG.Oy0 / 64.0f, this.rG.io0 / 64.0f, this.rG.pE0 / 64.0f);
            er.Lh0(rH, u5);
        }
        return true;
    }

    @Override
    public final int ji() {
        return 16;
    }

    @Override
    public final int CoM5() {
        return 32;
    }

    @Override
    public final void Oq(boolean z, boolean z2) {
        this.xz = z;
        if (!z && z2) {
            this.xg0 = hk0_1.KG + 2500L;
        } else if (!z2) {
            this.xg0 = 0L;
        }
    }

    @Override
    public final boolean wJ0() {
        return this.xz && hk0_1.KG > this.xg0;
    }
}
