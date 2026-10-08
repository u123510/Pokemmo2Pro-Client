package cn.pokemmo.ui.window.battle;

import f.*;

/**
 * 官方锦标赛计分板窗口
 *
 * 原混淆类: f.ic_0
 */
public class TournamentScoreboardWindow extends cx_0 implements tr_1  {
    public final ic_0 asBridge() {
        return (ic_0) (Object) this;
    }

    public final BU km0;
    public final lo0_0 Lp0;

    public TournamentScoreboardWindow(BU bu, int i, int[] iArr, int[] iArr2, iz0_0[] iz0_0Arr) {
        super(tw0_0.kz0());
        this.km0 = bu;
        uf("scoreboard-window");
        Hy(sm0_0.wa0(16805053, sm0_0.c0(i)));
        ff0(1);
        Pb0(bu::g2);
        lo0_0 lo0_0Var = new lo0_0();
        this.Lp0 = lo0_0Var;
        er_0 er_0Var = new er_0();
        er_0Var.uf("scoreboard-table");
        er_0Var.private$(new i2_0(iArr, iArr2, iz0_0Arr));
        er_0Var.Vo0(String.class, new Ox0());
        lo0_0Var.AH0(er_0Var);
        fy_2 fy_2Var = new fy_2();
        fy_2Var.WQ(fy_2Var.H10().Kn0(lo0_0Var));
        fy_2Var.x40(fy_2Var.H10().Xq(new ya_1[] { fy_2Var.lo0().LPt3(new le0_2[] { lo0_0Var }) }));
        SL(fy_2Var);
    }

    @Override
    public final void C(zk0_1 zk0_1Var) {
        super.C(zk0_1Var);
        lpt6__0.v90(this);
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            kh0();
        } else {
            this.Lp0.oY(this.Mx, this.OB);
        }
        super.K8();
    }

    @Override
    public final boolean nd0(i70_0 i70_0Var) {
        if (E00.ZU(i70_0Var.zu) && i70_0Var.iT()) {
            int key = i70_0Var.finally$;
            rp_0 rp_0Var = rp_0.nK0;
            int unused = dw_2.ff;
            if (rp_0Var != null && rp_0Var.Ov(key)) {
                this.km0.g2();
                return true;
            }
        }
        return super.nd0(i70_0Var);
    }
}
