package cn.pokemmo.ui.widget.component;

import f.*;

public class CompactActionToolbar extends dg0_0 {
    public CompactActionToolbar() {
        super();
        if (tw0_0.kz0()) {
            this.sl().Gy0(12, 5);
            this.sl().nq0(36, 36);
        } else {
            this.xf0(0, 0);
            this.sl().Gy0(16, 0);
        }
        this.Hv0();
    }

    public final void zl() {
        this.W10.Ll(true);
        this.Xt.Ll(true);
        this.C5.Ll(true);
        this.J90.Ll(true);
    }

    public final void Ol0() {
        if (tw0_0.kz0()) {
            int y = this.SB0;
            this.W10.E40(this.A20 + 90, y);
            this.W10.og.EJ0 = 2.0F;
            this.W10.og.gY = 0;
            this.W10.og.a4 = -5;
            this.J90.E40(this.A20 + 68, y);
            this.J90.og.EJ0 = 2.0F;
            this.J90.og.gY = 0;
            this.J90.og.a4 = -3;
            this.Xt.og.EJ0 = 2.0F;
            this.Xt.E40(this.A20 + 90, y);
            this.Xt.og.gY = 0;
            this.Xt.og.a4 = 19;
            if (this.J90.hi0()) {
                this.C5.E40(this.A20 + 66, y);
                this.C5.og.gY = 0;
                this.C5.og.a4 = 18;
            } else {
                this.C5.E40(this.A20 + 66, y);
                this.C5.og.gY = 0;
                this.C5.og.a4 = -2;
            }
            this.C5.og.EJ0 = 2.0F;
        } else {
            this.W10.E40(this.A20 + 48, this.SB0 + 3);
            this.J90.E40(this.A20 + 2, this.SB0 + 4);
            this.Xt.E40(this.A20 + 1, this.SB0 + 16);
            if (this.W10.hi0()) {
                this.C5.E40(this.A20 + 48, this.SB0 + 18);
            } else {
                this.C5.E40(this.A20 + 48, this.SB0 + 3);
            }
        }
    }

    public final void TG0(i70_0 event) {
        if (event.nA0 == 1) {
            VU target = this.AG;
            if (target != null) {
                BU.T50.FI(target, this.K20, qo_1.DL, false);
            }
        }
    }
}
