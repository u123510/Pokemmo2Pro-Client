package cn.pokemmo.ui.window.dialog;

import f.*;

/**
 * 带输入框确认对话框基类
 *
 * 原混淆类: f.ox_1
 */
public class InputConfirmDialogWindow extends cx_0 implements tr_1  {
    public final ox_1 asBridge() {
        return (ox_1) (Object) this;
    }

    public final fy_2 dG0;
    public final xe_1 Jz;
    public final cg_0 Pw;

    public InputConfirmDialogWindow(String string, int i, lpt5__1 lpt51) {
        super(tw0_0.kz0(), true);
        this.uf("confirm-widget");
        fy_2 panel = new fy_2();
        this.dG0 = panel;
        panel.uf("confirm-panel");
        cn_0 label = new cn_0(string);
        cg_0 input = new cg_0();
        this.Pw = input;
        label.kl();
        input.ef0(i);
        xe_1 btnOk = new xe_1(sm0_0.c0(nf0_0.BA));
        this.Jz = btnOk;
        btnOk.RR(() -> this.VI(lpt51));
        xe_1 btnCancel = new xe_1(sm0_0.c0(nf0_0.Bq0));
        btnCancel.RR(this::xe0);
        panel.x40(panel.H10().Kn0(label).X20(panel.lo0().LPt3(input)).X20(panel.H10().LPt3(btnOk, btnCancel)).Ze0());
        panel.WQ(panel.lo0().Kn0(label).X20(panel.H10().LPt3(input)).X20(panel.lo0().Kn0(btnOk).Kn0(btnCancel)));
        this.SL(panel);
    }

    public final void Uj0() {
        this.Pw.BL();
    }

    @Override
    public final void C(zk0_1 zk01) {
        super.C(zk01);
        this.Pw.BL();
    }

    @Override
    public final void K8() {
        super.K8();
        this.dG0.lt0();
        this.kh0();
        this.dG0.vf(pa0_0.Ol);
    }

    @Override
    public final boolean nd0(i70_0 i700) {
        if (E00.ZU(i700.zu) && this.Pw.Of()) {
            this.Pw.nd0(i700);
            return true;
        }
        return super.nd0(i700);
    }

    public final void VI(lpt5__1 lpt51) {
        this.xe0();
        lpt51.xj(this.Pw.dI0.toString());
    }
}
