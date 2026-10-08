package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class PokemonMoveDetailComponent extends BaseComponent implements tr_1 {
    public final fy_2 Ji0;
    public final xe_1 break$;
    public final xe_1 Wy0;
    public final pg0_2 Ea0;
    public final X6 P70;
    public final long qm0;
    public final ae0_1 strictfp$;
    public final short sc;
    public boolean To;
    public final W9 mE;
    public int Wi;

    public PokemonMoveDetailComponent() {
        this.To = false;
        this.Wi = 0;
        uf("channelwidget");
        this.Ji0 = new fy_2();
        if (tw0_0.ng()) {
            this.qm0 = 0L;
            this.sc = 0;
        } else {
            this.qm0 = tw0_0.e60.Cx();
            this.sc = tw0_0.e60.h60();
        }
        this.strictfp$ = new ae0_1();
        byte Lt = tw0_0.e60.N60().Lt();
        int max = Math.max(1, (int) tw0_0.e60.fG0());
        if (tw0_0.Eu(5)) {
            max = 127;
        }
        String[] strArr = new String[max];
        int i = 0;
        for (int i2 = 0; i2 < max; i2++) {
            if (i2 == Lt) {
                strArr[i++] = sm0_0.wa0(1901, (i2 + 1) + "");
            } else {
                strArr[i++] = sm0_0.wa0(1900, (i2 + 1) + "");
            }
        }
        this.Ea0 = new pg0_2(strArr);
        this.P70 = new X6(this.Ea0);
        int i3 = Lt;
        if (i3 < 0 || i3 >= max) {
            i3 = 0;
        }
        this.P70.Bd(i3);

        this.break$ = new xe_1(sm0_0.c0(1902));
        this.break$.RR(new tf0_1((f.YP)(Object)this));

        this.Wy0 = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.Wy0.RR(new lc0_2((f.YP)(Object)this));

        cn_0 cn_0 = new cn_0(sm0_0.c0(1906));
        this.mE = new W9();

        this.Ji0.x40(this.Ji0.H10()
                .Kn0(this.strictfp$)
                .Kn0(this.P70)
                .X20(this.Ji0.lo0().LPt3(new le0_2[]{this.mE, cn_0}))
                .Kn0(this.break$)
                .Kn0(this.Wy0)
                .Ze0());

        this.Ji0.WQ(this.Ji0.lo0()
                .Kn0(this.strictfp$)
                .Kn0(this.P70)
                .X20(this.Ji0.H10().Ze0().LPt3(new le0_2[]{this.mE, cn_0}).Ze0())
                .Kn0(this.break$)
                .Kn0(this.Wy0));

        SL(this.Ji0);
    }

    @Override
    public final void HP(zk0_1 zk0_1) {
        if (this.To) {
            super.HP(zk0_1);
            return;
        }
        float currentTimeMillis = ((float) (this.qm0 - System.currentTimeMillis())) / 1000.0f;
        if (currentTimeMillis > 0.0f) {
            this.strictfp$.aE(currentTimeMillis / (float) this.sc);
            this.strictfp$.B(sm0_0.wa0(1904, ((int) currentTimeMillis) + ""));
            this.break$.pw0(false);
            super.HP(zk0_1);
            return;
        }
        this.To = true;
        this.Ji0.u3(this.strictfp$);
        this.break$.pw0(true);
        super.HP(zk0_1);
    }

    @Override
    public final void C(zk0_1 zk0_1) {
        lpt6__0.v90(SS());
    }

    @Override
    public final boolean nd0(i70_0 i70_0) {
        if (E00.ZU(i70_0.zu) && i70_0.iT()) {
            int i = i70_0.finally$;
            if (rp_0.kC0 != null && rp_0.kC0.Ov(i)) {
                this.Wi--;
                lpt6__0.v90(SS());
                return true;
            } else if (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(i)) {
                this.Wi++;
                lpt6__0.v90(SS());
                return true;
            } else if (rp_0.I90 != null && rp_0.I90.Ov(i)) {
                if (this.Wi == 0) {
                    int i2 = this.P70.mu0.Mw0;
                    if (i2 > 0) {
                        this.P70.Bd(i2 - 1);
                    }
                }
                return true;
            } else if (rp_0.Ni != null && rp_0.Ni.Ov(i)) {
                if (this.Wi == 0 && this.P70.mu0.Mw0 + 1 < this.Ea0.w7.size()) {
                    this.P70.Bd(this.P70.mu0.Mw0 + 1);
                }
                return true;
            } else if (rp_0.sJ0 != null && rp_0.sJ0.Ov(i)) {
                if (SS() instanceof xe_1) {
                    a7_0.bH(((xe_1) SS()).ER.Fc0);
                }
                return true;
            } else if (rp_0.nK0 != null && rp_0.nK0.Ov(i)) {
                this.K20.u3(this);
                return true;
            }
        }
        return super.nd0(i70_0);
    }

    public final void K8() {
        this.break$.RY(this.break$.Mx, 25);
        this.Wy0.RY(this.break$.Mx, 25);
        this.Ji0.lt0();
        le0_2 parent = this.K20;
        int x = kq_0.lpT2(this.Ji0.Mx, 2, parent.a3(), parent.A20 + parent.e80);
        int y = kq_0.lpT2(this.Ji0.OB, 2, parent.k5(), parent.SB0 + parent.y9);
        this.Ji0.E40(x, y);
        this.Ji0.oY(this.Ji0.A20 + this.Ji0.Mx, this.Ji0.SB0 + this.Ji0.OB);
    }

    public final le0_2 SS() {
        if (this.Wi < 0) {
            this.Wi = 0;
        }
        int i = this.Wi;
        if (i == 0) {
            return this.P70;
        }
        if (i == 1) {
            return this.break$;
        }
        return this.Wy0;
    }
}
