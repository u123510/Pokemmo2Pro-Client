package cn.pokemmo.ui.widget.button;

import f.*;

public class CheckmarkStateButton extends I30 {
    public boolean BD;
    public boolean ah0;
    public final hh0_1 yR;
    public lpt3__4 Yr;

    public CheckmarkStateButton(boolean value) {
        super();
        this.ah0 = false;
        this.yR = new hh0_1(sm0_0.c0(nf0_0.Bq0), 96, 30);
        this.yR.uf("battle-button-return");
        this.yR.RR(this::KV);
        if (tw0_0.kz0()) {
            this.yR.iv(116, 116);
        }
        this.Nv(value);
        this.SL(this.yR);
    }

    public final void Nc() {
        this.BD = true;
    }

    public final void K8() {
        if (tw0_0.kz0()) {
            this.ZW.oY(tw0_0.LD0.ew0(), 160);
            pa0_0 mode = pa0_0.rr0;
            this.ZW.vf(mode);
            this.El0.oY(tw0_0.LD0.ew0(), 160);
            this.El0.qF0(mode);
            this.El0.E40(this.ZW.A20, this.ZW.SB0);
        } else {
            fc0_2.q70(dw_2.c10, true);
            int width = fc0_2.YQ;
            int x = (fc0_2.On0 - tw0_0.LD0.ew0() - width) / 2;
            int right = width + (int) Math.ceil(50.0F * tw0_0.LD0.Ew);
            this.ZW.oY(width, 115);
            this.ZW.E40(x, right - 115);
            this.El0.qF0(pa0_0.qQ);
            this.El0.E40(this.ZW.A20, this.ZW.SB0);
        }

        if (tw0_0.kz0()) {
            this.yR.lt0();
            this.yR.RY(116, 116);
            this.yR.A20(pa0_0.Ht0, -22, -22);
        } else {
            this.yR.lt0();
            this.yR.RY(128, 24);
            this.yR.E40(this.ZW.cz() - this.yR.Mx, this.ZW.VM() - this.yR.OB);
        }
    }

    public final boolean nd0(i70_0 value) {
        int event = value.finally$;
        rp_0 handler = rp_0.nK0;
        if (handler != null && handler.Ov(event) && E00.ZU(value.zu) && value.iT()) {
            this.KV();
        }
        return super.nd0(value);
    }

    public final void Nv(boolean value) {
        this.ah0 = value;
        this.yR.Ll(value);
    }

    public final void KV() {
        if (this.BD || !this.ah0) {
            return;
        }
        if (!BU.T50.BK.b5.Of()) {
            return;
        }
        if (this.Yr != null && !jq0_0.hA(Qy0.yI0, lpt3__4.class)) {
            Qy0.yI0.sr0(this.Yr);
        }
    }
}
