package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public abstract class BaseScrollablePanelComponent extends BaseComponent {
    public fy_2 EG;
    public xe_1 H3;
    public xe_1 Co;
    public W9 o80;
    public cn_0 Va0;
    public X6 extends$;
    public fy_2 gI;
    public xe_1[] Ut0;
    public Mm Lpt3;
    public xe_1 GF0;

    public BaseScrollablePanelComponent(q10_0 v1, short i2, int i3) {
        Mm mm = new Mm(this, tw0_0.e60.at(), v1, i2);
        this.Lpt3 = mm;
        if (tw0_0.kz0()) {
            mm.CF0(tw0_0.kz0() ? 4 : 3);
        }
    }

    public BaseScrollablePanelComponent(q10_0 v1, short i2) {
        Mm mm = new Mm(this, tw0_0.e60.at(), v1, i2);
        this.Lpt3 = mm;
        xe_1 xe1 = new xe_1(sm0_0.c0(56));
        this.H3 = xe1;
        xe_1 xe2 = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.Co = xe2;
        if (tw0_0.kz0()) {
            mm.CF0(tw0_0.kz0() ? 4 : 3);
        }
        W9 w9 = new W9();
        this.o80 = w9;
        w9.RR(this::Ar0);
        w9.k50(v1 == q10_0.VI);
        w9.Ll(v1 != q10_0.Bj0);
        mm.JQ(w9.VZ());
        cn_0 cn0 = new cn_0(sm0_0.c0(3007));
        this.Va0 = cn0;
        cn0.Ll(v1 != q10_0.Bj0);
        this.Co.RY(120, 30);
        this.Co.oY(120, 30);
        this.H3.RY(120, 30);
        this.H3.oY(120, 30);
        w9.RY(30, 30);
        w9.oY(30, 30);
        if (v1 != q10_0.Qh0) {
            this.extends$ = new X6(new pg0_2(new String[]{
                sm0_0.c0(2987),
                sm0_0.c0(2986),
                sm0_0.c0(2985),
                sm0_0.c0(2984),
                sm0_0.c0(2983),
                sm0_0.c0(2998),
                sm0_0.c0(2988)
            }));
            this.extends$.Rm0(this::XT);
        } else {
            this.extends$ = new X6(new pg0_2(new String[]{sm0_0.c0(2985)}));
            this.extends$.Ll(false);
            mm.tg();
        }
        this.extends$.Bd(0);
        X90 x90 = v1 != null ? v1.R00(i2) : null;
        if (x90 != null && x90.wk(16384)) {
            xe_1 xe = new xe_1(sm0_0.c0(2989));
            this.GF0 = xe;
            xe.RR(() -> f3(v1, i2));
        }
        fy_2 fy2 = new fy_2();
        this.gI = fy2;
        fy2.uf("preview-color-dialog");
        fy2.WQ(fy2.H10());
        fy2.x40(fy2.lo0());
        Hm0 hm0 = fy2.lo0();
        I7 i7 = fy2.H10();
        yb_1[] yb1Arr = yb_1.Mh;
        this.Ut0 = new xe_1[yb1Arr.length];
        int i6 = 0;
        for (yb_1 yb : yb1Arr) {
            xe_1 btn = new qj_2();
            this.Ut0[i6] = btn;
            btn.uf("color-button");
            btn.LPT8(new N1(btn, new gn_0(yb.Q2().rR())));
            btn.RR(() -> y(yb));
            hm0.Kn0(btn);
            i7.Kn0(btn);
            i6++;
            if (i6 % 3 == 0) {
                this.gI.kl0().X20(hm0);
                this.gI.nt0().X20(i7);
                hm0 = this.gI.lo0();
                i7 = this.gI.H10();
            }
        }
        this.gI.kl0().X20(hm0);
        this.gI.nt0().X20(i7);
        if (v1 != null && v1.Yy(i2)) {
            this.Ut0[0].VJ().aq0();
        } else {
            this.gI.Ll(false);
        }
    }

    @Override
    public void Dw0(zk0_1 v1) {
        int i3;
        int i4;
        if (tw0_0.kz0()) {
            i3 = this.Lpt3.OD0 == ew0_0.C1 ? -40 : 40;
            i4 = this.gI.eE ? this.gI.OB : 0;
        } else {
            i3 = this.Lpt3.OD0 == ew0_0.C1 ? 0 : 80;
            i4 = this.gI.eE ? this.gI.OB : 0;
        }
        this.Lpt3.Si = i3;
        this.Lpt3.Zx0 = i4 + 10;
        if (this.Lpt3.OD0 != ew0_0.a) {
            this.Lpt3.PC0();
        } else {
            this.Lpt3.eQ(tw0_0.e60.jB0.Vv, this.Lpt3.Si, this.Lpt3.Zx0);
        }
        super.Dw0(v1);
    }

    public final void y(yb_1 v1) {
        this.Lpt3.EU(v1.at0);
    }

    public final void f3(q10_0 v1, short i2) {
        this.Lpt3.Xc[v1.iL].Mj0(i2, 1.0f);
    }

    public final void XT() {
        int i = this.extends$.mu0.Mw0;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                this.Lpt3.EA0 = i;
                this.Lpt3.OD0 = ew0_0.C1;
                this.Lpt3.Ta = tw0_0.kz0() ? 4 : 3;
                break;
            case 5:
                this.Lpt3.OD0 = ew0_0.a;
                this.Lpt3.Ta = tw0_0.kz0() ? 3 : 2;
                break;
            case 6:
                this.Lpt3.OD0 = ew0_0.XI0;
                this.Lpt3.Ta = 2;
                break;
            default:
                break;
        }
        if (this.GF0 != null) {
            this.GF0.Ll(this.extends$.mu0.Mw0 == 0);
        }
    }

    public final void Ar0() {
        this.Lpt3.Gr0 ^= true;
    }
}
