package cn.pokemmo.ui.window.misc;

import f.*;

/**
 * 副本地图信息悬浮窗
 *
 * 原混淆类: f.wr0
 */
public class InstanceInfoWindow extends cx_0 implements tr_1  {
    public final wr0 asBridge() {
        return (wr0) (Object) this;
    }

    public final YJ0 H90;

    public InstanceInfoWindow(BU bu) {
        super(tw0_0.kz0());
        uf("instance-window");
        Hy(sm0_0.c0(7900));
        ff0(1);
        Pb0(bu::Cn0);
        YJ0 yj0 = new YJ0();
        this.H90 = yj0;
        yj0.DA0();
        fy_2 fy_2Var = new fy_2();
        if (tw0_0.kz0()) {
            fy_2Var.WQ(fy_2Var.H10().Ze0().Kn0(yj0).Ze0());
            fy_2Var.x40(fy_2Var.H10().qd(70).Kn0(yj0));
        } else {
            fy_2Var.WQ(fy_2Var.H10().Kn0(yj0));
            fy_2Var.x40(fy_2Var.H10().Kn0(yj0));
        }
        SL(fy_2Var);
        if (tw0_0.kz0()) {
            oY(tw0_0.LD0.ew0(), tw0_0.LD0.Hv0());
            g2(tw0_0.LD0.ew0(), tw0_0.LD0.Hv0());
        } else {
            g2(550, 370);
            oY(550, 370);
            sy((tw0_0.LD0.ew0() / 2) - (R00() / 2), (tw0_0.LD0.Hv0() / 2) - (RR() / 2));
        }
    }

    public final void update() {
        lg_0.k.lPT5(this.H90::DA0);
    }

    public final void x00() {
        lpt6__0.v90(this);
    }

    public final void K8() {
        super.K8();
    }

    public final boolean nd0(i70_0 i70_0Var) {
        if (E00.ZU(i70_0Var.zu) && i70_0Var.iT()) {
            if (Qy0.af(this)) {
                return super.nd0(i70_0Var);
            }
            int i = i70_0Var.finally$;
            rp_0 rp_0Var = rp_0.nK0;
            int i2 = dw_2.ff;
            if (rp_0Var != null && rp_0Var.Ov(i)) {
                BU.T50.Cn0();
                return true;
            }
        }
        return super.nd0(i70_0Var);
    }
}
