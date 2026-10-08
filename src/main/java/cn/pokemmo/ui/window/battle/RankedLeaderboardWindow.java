package cn.pokemmo.ui.window.battle;

import f.*;

/**
 * 天梯排行榜与高分天梯榜窗口
 *
 * 原混淆类: f.xy0_0
 */
public class RankedLeaderboardWindow extends cx_0 implements tr_1  {
    public final xy0_0 asBridge() {
        return (xy0_0) (Object) this;
    }

    public final BU Df0;
    public final k80_0 gb;

    public RankedLeaderboardWindow(BU bu, k80_0 k80_0Var, ad_2[] ad_2Arr) {
        super(tw0_0.kz0());
        this.Df0 = bu;
        this.gb = k80_0Var;
        uf("high-score-window");
        Hy(sm0_0.wa0(1129, k80_0Var.toString()));
        ff0(1);
        Pb0(bu::gZ);
        lo0_0 lo0_0Var = new lo0_0();
        er_0 er_0Var = new er_0();
        er_0Var.uf("high-score-table");
        er_0Var.private$(new ul_1(k80_0Var, ad_2Arr));
        S3 s3 = new S3();
        er_0Var.Vo0(ia0_1.class, s3);
        lo0_0Var.AH0(er_0Var);
        fy_2 fy_2Var = new fy_2();
        if (tw0_0.kz0()) {
            fy_2Var.WQ(fy_2Var.H10().Kn0(lo0_0Var));
        } else {
            int i = zb0_2.bigCJKFontSizes() ? 0 : 32;
            fy_2Var.WQ(fy_2Var.H10().qd(i).Kn0(lo0_0Var).qd(i));
        }
        fy_2Var.x40(fy_2Var.H10().Xq(new ya_1[] { fy_2Var.lo0().LPt3(new le0_2[] { lo0_0Var }) }));
        SL(fy_2Var);
    }

    public final void C(zk0_1 zk0_1Var) {
        super.C(zk0_1Var);
        lpt6__0.v90(this);
    }

    public final void K8() {
        if (tw0_0.kz0()) {
            kh0();
        }
        super.K8();
    }

    public final boolean nd0(i70_0 i70_0Var) {
        if (E00.ZU(i70_0Var.zu) && i70_0Var.iT()) {
            int i = i70_0Var.finally$;
            rp_0 rp_0Var = rp_0.nK0;
            int i2 = dw_2.ff;
            if (rp_0Var != null && rp_0Var.Ov(i)) {
                this.Df0.gZ();
                return true;
            }
        }
        return super.nd0(i70_0Var);
    }
}
