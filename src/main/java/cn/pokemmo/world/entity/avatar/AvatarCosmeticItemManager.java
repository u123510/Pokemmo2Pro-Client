package cn.pokemmo.world.entity.avatar;

import f.*;

public class AvatarCosmeticItemManager {
    public final jn_0 fB;
    public float We0;
    public byte tC;
    public ir_0 pz0;
    public X5 G9;
    public Bp0 cOM2;
    public yb0_0 Nf0;
    public yb0_0 qx;
    public boolean ob0;
    public YA[] xF0;
    public he_2 NM;
    public A3 Ml0;
    public final boolean[] B;
    public boolean kY;
    public float KH;
    public float cE;
    public boolean Ze0;
    public boolean wq;
    public boolean Nd;
    public boolean aM0;
    public PC0 eC0;
    public yh0_0 Mm;
    public ui_1 AuX;
    public final Bp0 IG;

    static {
        Cq0.E1(AvatarCosmeticItemManager.class);
    }

    public AvatarCosmeticItemManager(ga0_0 v1) {
        this.ob0 = false;
        this.B = new boolean[6];
        this.KH = 1.0f;
        this.cE = 1.0f;
        int unused = dw_2.ff;
        this.IG = new Bp0();
        this.fB = v1;
    }

    public final void oK0() {
        this.Mm.Yw0(lg_0.S4.Kr0(), lg_0.S4.sD0());
        this.kY = dw_2.Yj;
        this.KH = dw_2.jq0;
        float f1 = dw_2.Lu;
        this.cE = f1;
        float f1_sz = f1 * 250.0f;
        this.G9.Ig(25.0f, 25.0f, f1_sz, f1_sz);
        X5 v1 = this.G9;
        float halfR = (this.cE * 250.0f) / 2.0f;
        float f2 = Math.min(halfR, halfR) * dw_2.N90;
        if (f2 < 0.0f) {
            v1.getClass();
            throw new IllegalArgumentException("deadzoneRadius must be > 0");
        }
        v1.Fp0 = f2;
        v1.du0 = true;
        this.Nf0.DC(this.KH * 120.0f, this.KH * 120.0f);
        this.qx.DC(this.KH * 120.0f, this.KH * 120.0f);
        this.G9.P20(100.0f, (float) ((int) this.Mm.eY) - this.G9.TK0 - 100.0f);
        if (!dw_2.Yj) {
            this.Nf0.P20(
                (float) ((int) this.Mm.qj) - this.Nf0.E20 - 30.0f - this.qx.E20 - 150.0f,
                (float) ((int) this.Mm.eY - 220)
            );
            this.qx.P20(
                (float) ((int) this.Mm.qj) - this.qx.E20 - 30.0f - 120.0f,
                (float) ((int) this.Mm.eY - 220)
            );
        } else {
            float f3 = this.qx.E20;
            this.qx.P20(
                (float) ((int) this.Mm.qj) - f3 - 30.0f - f3 - 150.0f,
                (float) ((int) this.Mm.eY - 120) - this.qx.TK0
            );
            this.Nf0.P20(
                (float) ((int) this.Mm.qj) - this.Nf0.E20 - 30.0f - 120.0f,
                (float) ((int) this.Mm.eY - 120) - this.qx.TK0
            );
        }
    }

    public final void Ef() {
        boolean i1 = this.ob0 && this.Nf0.m9();
        boolean i2 = this.ob0 && this.qx.m9();
        if (this.B[0] != i1) {
            this.B[0] = i1;
            tw0_0.Xl0.Xl(dw_2.JU, i1);
        }
        if (this.B[1] != i2) {
            this.B[1] = i2;
            tw0_0.Xl0.Xl(dw_2.RM, i2);
        }
        this.Ze0 = false;
        this.wq = false;
        this.Nd = false;
        this.aM0 = false;
        if (this.ob0) {
            float f1 = this.G9.O20.x;
            float f2 = this.G9.O20.y;
            this.cOM2.x = f1;
            this.cOM2.y = f2;
            float angle = (float) Math.atan2(f2, f1) * 57.295776f;
            if (angle < 0.0f) {
                angle += 360.0f;
            }
            this.We0 = angle;
        } else {
            this.We0 = 0.0f;
        }
        if (this.We0 > 0.0f) {
            if (bl0(dw_2.Se)) {
                this.wq = true;
                this.tC = 3;
                this.NM.va0 = this.xF0[3];
            } else if (bl0(dw_2.Ze)) {
                this.Nd = true;
                this.tC = 2;
                this.NM.va0 = this.xF0[1];
            } else if (bl0(dw_2.KC)) {
                this.tC = 1;
                this.aM0 = true;
                this.NM.va0 = this.xF0[2];
            } else if (bl0(dw_2.Fk)) {
                this.tC = 0;
                this.Ze0 = true;
                this.NM.va0 = this.xF0[4];
            }
        }
        if (this.B[2] != this.Ze0) {
            this.B[2] = this.Ze0;
            tw0_0.Xl0.Xl(dw_2.Fk, this.Ze0);
        } else if (this.B[3] != this.wq) {
            this.B[3] = this.wq;
            tw0_0.Xl0.Xl(dw_2.Se, this.wq);
        } else if (this.B[4] != this.Nd) {
            this.B[4] = this.Nd;
            tw0_0.Xl0.Xl(dw_2.Ze, this.Nd);
        } else if (this.B[5] != this.aM0) {
            this.B[5] = this.aM0;
            tw0_0.Xl0.Xl(dw_2.KC, this.aM0);
        }
        if (!this.wq && !this.Ze0 && !this.Nd && !this.aM0) {
            this.NM.va0 = this.xF0[0];
            this.tC = -1;
            this.B[2] = false;
            this.B[3] = false;
            this.B[4] = false;
            this.B[5] = false;
        }
    }

    public final boolean bl0(int i1) {
        byte i2 = this.tC;
        int i3 = (i2 == -1) ? 0 : dw_2.hx0;
        if (i1 == dw_2.Se) {
            if (i2 == 3 && this.We0 >= (float) (46 - i3) && this.We0 <= (float) (135 + i3)) {
                return true;
            }
            if (this.We0 >= (float) (45 + i3) && this.We0 <= (float) (136 - i3)) {
                return true;
            }
        } else if (i1 == dw_2.Ze) {
            if (i2 == 2 && this.We0 >= (float) (136 - i3) && this.We0 <= (float) (225 + i3)) {
                return true;
            }
            if (this.We0 >= (float) (135 + i3) && this.We0 <= (float) (226 - i3)) {
                return true;
            }
        } else if (i1 == dw_2.KC) {
            if (i2 == 1 && (this.We0 >= (float) (316 - i3) || this.We0 <= (float) (45 + i3))) {
                return true;
            }
            if (this.We0 >= (float) (315 + i3) || this.We0 <= (float) (46 - i3)) {
                return true;
            }
        } else if (i1 == dw_2.Fk) {
            if (i2 == 0 && this.We0 >= (float) (226 - i3) && this.We0 <= (float) (315 + i3)) {
                return true;
            }
            if (this.We0 >= (float) (225 + i3) && this.We0 <= (float) (316 - i3)) {
                return true;
            }
        }
        return false;
    }
}
