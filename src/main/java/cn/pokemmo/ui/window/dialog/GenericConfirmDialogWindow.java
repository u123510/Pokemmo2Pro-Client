package cn.pokemmo.ui.window.dialog;

import f.*;

/**
 * 通用询问弹窗
 *
 * 原混淆类: f.md0_0
 */
public class GenericConfirmDialogWindow extends cx_0 {
    public final md0_0 asBridge() {
        return (md0_0) (Object) this;
    }

    public final fy_2 Sd0;
    public final xe_1 BJ;
    public final cg_0 R0;

    public GenericConfirmDialogWindow(BU bu, boolean z, short s) {
        super(false, false);
        uf("confirm-widget");
        fy_2 fy_2Var = new fy_2();
        this.Sd0 = fy_2Var;
        fy_2Var.uf("confirm-panel");
        cn_0 titleLabel = new cn_0(sm0_0.c0(100002));
        cg_0 cg_0Var = new cg_0();
        this.R0 = cg_0Var;
        cg_0Var.I7();
        cg_0Var.ef0(16);
        cn_0 subLabel = new cn_0(sm0_0.c0(1053));
        if (z) {
            xe_1 xe_1Var = new xe_1(sm0_0.c0(2991));
            this.BJ = xe_1Var;
            xe_1Var.RR(() -> jc(s));
        } else {
            xe_1 xe_1Var2 = new xe_1(sm0_0.c0(nf0_0.BA));
            this.BJ = xe_1Var2;
            xe_1Var2.RR(() -> PE(bu, s));
        }
        xe_1 cancelBtn = new xe_1(sm0_0.c0(nf0_0.Bq0));
        bu.getClass();
        cancelBtn.RR(bu::aUX);

        ya_1 hGroup = fy_2Var.H10();
        hGroup.Kn0(titleLabel);
        hGroup.X20(fy_2Var.lo0().LPt3(new le0_2[]{subLabel, cg_0Var}));
        hGroup.X20(fy_2Var.H10().LPt3(new le0_2[]{this.BJ, cancelBtn}));
        hGroup.Ze0();
        fy_2Var.x40(hGroup);

        ya_1 vGroup = fy_2Var.lo0();
        vGroup.Kn0(titleLabel);
        vGroup.X20(fy_2Var.H10().LPt3(new le0_2[]{subLabel, cg_0Var}));
        vGroup.X20(fy_2Var.lo0().Kn0(this.BJ).Kn0(cancelBtn));
        fy_2Var.WQ(vGroup);

        SL(fy_2Var);
    }

    @Override
    public final void C(zk0_1 zk0_1Var) {
        super.C(zk0_1Var);
        lpt6__0.v90(this.R0);
    }

    @Override
    public final void K8() {
        super.K8();
        this.Sd0.lt0();
        kh0();
        this.Sd0.vf(pa0_0.Ol);
    }

    public final void PE(BU bu, short s) {
        bu.aUX();
        String str = sm0_0.wa0(100004, ((wn0_0) this.R0.dI0).YA.toString());
        Qy0.yI0.sr0(new lpt3__4(str, () -> rE(s), asBridge()));
    }

    public final void rE(short s) {
        String str = ((wn0_0) this.R0.dI0).YA.toString();
        tw0_0.rl.fk0.uQ(new m60_0(s, str, "", false));
    }

    public final void jc(short s) {
        String str = ((wn0_0) this.R0.dI0).YA.toString();
        tw0_0.rl.fk0.uQ(new m60_0(s, str, "", true));
    }
}
