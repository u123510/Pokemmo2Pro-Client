package cn.pokemmo.ui.window.admin;

import f.*;

/**
 * 玩家快捷惩罚与操作面板
 *
 * 原混淆类: f.sk0_2
 */
public class PlayerActionsWindow extends R90 {
    public final tk0_0 xS;
    public final cn_0 K6;
    public final cg_0 E6;

    public PlayerActionsWindow(le0_2 v1) {
        uf("admin-small-frame");
        Hy("Player Actions");
        Pb0(() -> v1.u3(this));
        tk0_0 table = new tk0_0();
        this.xS = table;
        cn_0 label = new cn_0("Player Name:");
        this.K6 = label;
        label.uf("label-title");
        cg_0 field = new cg_0();
        this.E6 = field;
        field.I7();
        SL(table);
    }

    public static void Wx() {
        yt_1.l00 = CH0.j1;
    }

    public final void C(zk0_1 v1) {
        tw0_0.rl.fk0.uQ(new dl0_0());
    }

    public final void Xx(op0_0[] v1) {
        this.xS.em();
        this.xS.gg0.uc();
        this.xS.gg0.Rg().Yg = new vl0_0(15.0f);
        tk0_0 v2 = new tk0_0(new A40());
        v2.gg0.vx0(this.K6).goto$();
        v2.gg0.vx0(this.E6).sn0 = new vl0_0(170.0f);
        j1_0 cell = this.xS.gg0.vx0(v2);
        cell.d80 = 2;
        cell.goto$();
        for (int i = 0; i < v1.length; ++i) {
            if (i % 2 == 0) {
                this.xS.gg0.Rg();
            }
            this.xS.gg0.vx0(vA(v1[i])).goto$();
        }
        xe_1 resetBtn = new xe_1("Reset highlight");
        resetBtn.RR(sk0_2::Wx);
        this.xS.gg0.vx0(resetBtn).rs0 = Float.valueOf(1.0f);
    }

    public final xe_1 vA(op0_0 v1) {
        xe_1 btn = new xe_1(v1.sp);
        btn.RR(() -> sf(v1, btn));
        return btn;
    }

    public final void sf(op0_0 v1, xe_1 v2) {
        String text = v1.sp.trim() + " " + ((wn0_0) this.E6.dI0).YA.toString().trim();
        if (v1.qR.length == 0) {
            tw0_0.rl.getClass();
            tw0_0.rl.Cp(zo_0.Pk, text, "", true);
            v2.f00();
        } else {
            xj_1 dialog = new xj_1(text, v1.qR, v1.p60, xj_1.qa0);
            xn0_0.Lt.SL(dialog.iX());
        }
    }

    public final /* synthetic */ void IL(le0_2 v1) {
        v1.u3(this);
    }
}
