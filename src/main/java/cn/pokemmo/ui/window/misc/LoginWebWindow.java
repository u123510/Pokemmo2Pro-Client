package cn.pokemmo.ui.window.misc;

import f.*;

/**
 * 登录Web网页集成窗口
 *
 * 原混淆类: f.y4_0
 */
public class LoginWebWindow extends R90 {
    public final y4_0 asBridge() {
        return (y4_0) (Object) this;
    }

    public final fy_2 Ok;
    public final cn_0 Vv;
    public final cn_0 Bw0;
    public final cg_0 nt0;
    public final cg_0 Aa0;
    public final xe_1 F9;
    public final xe_1 Ur;

    public LoginWebWindow() {
        bD(false);
        Hy(sm0_0.c0(1030));
        uf("login-window");

        this.Vv = new cn_0();
        this.nt0 = new cg_0();
        this.nt0.I7();
        this.nt0.pw0(false);

        this.Aa0 = new cg_0();
        this.Aa0.ef0(8);
        this.Aa0.Bl(xw_1.Ww);
        this.Aa0.Yr0(y4_0::WA0);
        this.Aa0.Ii(this::Cv0);

        this.Bw0 = new cn_0(sm0_0.c0(1031));
        this.Bw0.kl();
        cn_0 v5 = new cn_0(sm0_0.c0(1032));
        v5.kl();

        this.F9 = new xe_1(sm0_0.c0(1033));
        this.F9.RR(this::n60);

        this.Ur = new xe_1(sm0_0.c0(1035));
        this.Ur.RR(y4_0::L);

        this.Ok = new fy_2();
        ya_1 col1 = this.Ok.hb(new le0_2[] { this.Bw0, v5 });
        ya_1 col2 = this.Ok.hb(new le0_2[] { this.nt0, this.Aa0 });

        this.Ok.WQ(this.Ok.lo0().X20(this.Ok.C7(new le0_2[] { this.Vv }))
                .X20(this.Ok.bx0(new ya_1[] { col1, col2 }))
                .X20(this.Ok.C7(new le0_2[] { this.Ur }).Ze0().Kn0(this.F9)));

        this.Ok.x40(this.Ok.H10().X20(this.Ok.hb(new le0_2[] { this.Vv })).VY(20, 20, 20)
                .X20(this.Ok.hb(new le0_2[] { this.Bw0, this.nt0 }))
                .X20(this.Ok.hb(new le0_2[] { v5, this.Aa0 }))
                .X20(this.Ok.hb(new le0_2[] { this.Ur, this.F9 })));

        SL(this.Ok);
    }

    public static void L() {
        String lang = "?local=" + dw_2.con;
        lg_0.lv0.Lf("https://pokemmo.com/account_change_email/" + lang);
        lg_0.k.T0 = false;
    }

    public static boolean WA0(int i0) {
        return i0 >= 48 && i0 <= 57;
    }

    @Override
    public final void Ll(boolean i1) {
        super.Ll(i1);
        if (i1 && this.z70 != null) {
            this.z70.Q4(this::WD);
        }
    }

    public final void WD() {
        lg_0.k.lPT5(this::hH);
    }

    public final void hH() {
        if (this.eE) {
            this.Aa0.BL();
        }
    }

    public final void n60() {
        String code = ((wn0_0) this.Aa0.dI0).YA.toString();
        if (code.length() < 6) {
            Qy0.yI0.dk(-1, sm0_0.c0(1036));
            return;
        }
        this.Aa0.pw0(false);
        this.F9.pw0(false);
        qt_2 qt = tw0_0.d7;
        if (qt != null) {
            qt.cp0.E8(new Y2(code));
        }
    }

    public final void Cv0(int i1) {
        if (i1 == 66) {
            a7_0.bH(this.F9.ER.Fc0);
        }
    }
}
