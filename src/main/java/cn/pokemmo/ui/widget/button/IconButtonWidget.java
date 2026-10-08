package cn.pokemmo.ui.widget.button;

import f.*;

public class IconButtonWidget extends mi_0 {
    public IconButtonWidget() {
        super();
        if (tw0_0.kz0()) {
            this.xf0(100, 100);
            this.sl().Gy0(14, 4);
            this.sl().dA(2.0f);
        } else {
            this.xf0(48, 48);
            this.sl().Gy0(6, 5);
        }
        if (tw0_0.kz0()) {
            this.Xt.JH().dA(2.0f);
            this.W10.JH().dA(2.0f);
            this.W10.VA(32, 32);
            this.C5.JH().dA(2.0f);
            this.C5.VA(32, 32);
        }
    }

    @Override
    public void zl() {
        this.W10.Ll(true);
        this.Xt.Ll(true);
        this.C5.Ll(true);
    }

    public final void x8(short s) {
        this.Db(null);
        this.Cv((byte) -1, s, (short) 0);
    }

    public final void av(byte b, short s, short s2) {
        this.Db(null);
        this.Cv(b, s, s2);
    }

    public void Ol0() {
        this.nA();
        this.W10.E40(this.A20 + 1, this.SB0 + 1);
    }

    public final void Cv(byte b, short s, short s2) {
        if ((s2 & 9) != 0) {
            Br0 br0 = this.W10.og;
            LPT6_ lpt6_ = (s2 & 8) != 0 ? fn_0.qz0().EB : fn_0.qz0().tj0;
            br0.r8(new LPT6_[]{lpt6_});
        }
        if ((s2 & 2) != 0) {
            this.Xt.og.r8(new LPT6_[]{fn_0.qz0().yp0});
        }
        boolean isShiny = (s2 & 4) != 0;
        int curX = this.W10.A20;
        int curY = this.W10.SB0;
        P10[] arr = new P10[]{this.W10, this.C5, this.Xt};
        for (int i = 0; i < 3; i++) {
            if (i != 0) {
                P10 prev = arr[i - 1];
                if (!prev.og.AU() && prev.eE) {
                    curX += 14;
                }
                P10 cur = arr[i];
                int y = (cur == this.Xt) ? curY + 1 : curY;
                cur.E40(curX, y);
            }
        }
        this.E1(yh_0.Xm0.qC0(yh_0.Ed((byte) 0, s), (byte) 0, isShiny)[0]);
        cq_0 cq0 = mp_1.vf0().W50(s);
        String tooltip;
        if (cq0 == null) {
            tooltip = "";
        } else {
            tooltip = cq0.Ay(false) + "\n" + sm0_0.c0(1840) + " " + b;
        }
        this.yj0 = tooltip;
        this.yB0();
    }
}
