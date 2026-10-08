package cn.pokemmo.ui.window.admin;

import f.*;

/**
 * 传送方向选择浮窗
 *
 * 原混淆类: f.o40_0
 */
public class TeleportDirectionWindow extends R90 {
    public final xn0_0 oA0;

    public TeleportDirectionWindow(xn0_0 xn0_0Var) {
        this.oA0 = xn0_0Var;
        Hy("Teleport");
        Pb0(xn0_0Var::lp);
        Pb0(this::xS);
        ff0(1);
        uf("tp-direction-widget");
        fy_2 fy_2Var = new fy_2();
        fy_2Var.WQ(fy_2Var.lo0());
        fy_2Var.x40(fy_2Var.H10());
        xe_1 xe_1Var = new xe_1("-");
        xe_1Var.uf("button-symbol");
        xe_1 xe_1Var2 = new xe_1("↖");
        xe_1Var2.uf("button-symbol");
        xe_1Var2.RR(o40_0::Rh);
        xe_1 xe_1Var3 = new xe_1("↑");
        xe_1Var3.uf("button-symbol");
        xe_1Var3.RR(o40_0::ZG0);
        xe_1 xe_1Var4 = new xe_1("↗");
        xe_1Var4.uf("button-symbol");
        xe_1Var4.RR(o40_0::S60);
        xe_1 xe_1Var5 = new xe_1("←");
        xe_1Var5.uf("button-symbol");
        xe_1Var5.RR(o40_0::fg);
        xe_1 xe_1Var6 = new xe_1("→");
        xe_1Var6.uf("button-symbol");
        xe_1Var6.RR(o40_0::XF);
        xe_1 xe_1Var7 = new xe_1("↙");
        xe_1Var7.uf("button-symbol");
        xe_1Var7.RR(o40_0::hP);
        xe_1 xe_1Var8 = new xe_1("↓");
        xe_1Var8.uf("button-symbol");
        xe_1Var8.RR(o40_0::Iu0);
        xe_1 xe_1Var9 = new xe_1("↘");
        xe_1Var9.uf("button-symbol");
        xe_1Var9.RR(o40_0::BF0);
        qj_2 qj_2Var = new qj_2("", 16, 16);
        qj_2Var.uf("tooltip-button2");
        qj_2Var.Bb(0);
        qj_2Var.Xr0("Keyboard shortcut: CTRL+SHIFT+(↓ ↑ ← →)");
        tk0_0 tk0_0Var = new tk0_0();
        if (tw0_0.H30()) {
            tk0_0Var.SL(new le0_2());
            tk0_0Var.SL(new le0_2());
            tk0_0Var.SL(qj_2Var);
            tk0_0Var.Nu();
        }
        tk0_0Var.SL(xe_1Var2);
        tk0_0Var.SL(xe_1Var3);
        tk0_0Var.SL(xe_1Var4);
        tk0_0Var.Nu();
        tk0_0Var.SL(xe_1Var5);
        tk0_0Var.SL(xe_1Var);
        tk0_0Var.SL(xe_1Var6);
        tk0_0Var.Nu();
        tk0_0Var.SL(xe_1Var7);
        tk0_0Var.SL(xe_1Var8);
        tk0_0Var.SL(xe_1Var9);
        SL(tk0_0Var);
    }

    public static void BF0() {
        tw0_0.rl.Cp(zo_0.Pk, "//moveclose 1 1", "", true);
    }

    public static void Iu0() {
        if (tw0_0.e60.jB0.ba0.B5 == tw0_0.e60.N60().BJ) {
            tw0_0.rl.uh0((byte) 0, true, false);
        } else {
            tw0_0.rl.Cp(zo_0.Pk, "//moveclose 0 1", "", true);
        }
    }

    public static void hP() {
        tw0_0.rl.Cp(zo_0.Pk, "//moveclose -1 1", "", true);
    }

    public static void XF() {
        if (tw0_0.e60.jB0.ba0.Lq0 == tw0_0.e60.N60().zC0) {
            tw0_0.rl.uh0((byte) 3, true, false);
        } else {
            tw0_0.rl.Cp(zo_0.Pk, "//moveclose 1 0", "", true);
        }
    }

    public static void fg() {
        if (tw0_0.e60.jB0.ba0.Lq0 == 0) {
            tw0_0.rl.uh0((byte) 2, true, false);
        } else {
            tw0_0.rl.Cp(zo_0.Pk, "//moveclose -1 0", "", true);
        }
    }

    public static void S60() {
        tw0_0.rl.Cp(zo_0.Pk, "//moveclose 1 -1", "", true);
    }

    public static void ZG0() {
        if (tw0_0.e60.jB0.ba0.B5 == 0) {
            tw0_0.rl.uh0((byte) 1, true, false);
        } else {
            tw0_0.rl.Cp(zo_0.Pk, "//moveclose 0 -1", "", true);
        }
    }

    public static void Rh() {
        tw0_0.rl.Cp(zo_0.Pk, "//moveclose -1 -1", "", true);
    }

    @Override
    public final void K8() {
        super.K8();
    }

    @Override
    public final void C(zk0_1 zk0_1Var) {
        if (dw_2.ww0 >= tw0_0.LD0.ew0() - this.Mx) {
            dw_2.ww0 = -1;
        }
        if (dw_2.i0 >= tw0_0.LD0.Hv0() - this.OB) {
            dw_2.i0 = -1;
        }
        if (tw0_0.kz0()) {
            this.oA0.Sn0();
        }
        if (dw_2.ww0 > -1 && dw_2.i0 > -1) {
            lg_0.k.lPT5(this::do$);
        } else {
            lg_0.k.lPT5(this::Fl);
        }
        lg_0.k.lPT5(this::Jw);
    }

    public final /* synthetic */ void Jw() {
        lpt6__0.v90(this);
    }

    public final void Fl() {
        E40(tw0_0.LD0.ew0() / 2 - this.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.OB / 2);
    }

    public final void do$() {
        E40(dw_2.ww0, dw_2.i0);
    }

    public final void xS() {
        dw_2.ww0 = this.A20;
        dw_2.i0 = this.SB0;
        dw_2.Va = true;
    }
}
