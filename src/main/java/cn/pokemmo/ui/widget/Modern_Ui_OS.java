package cn.pokemmo.ui.widget;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.OS
 */
public class Modern_Ui_OS {

    public cn_0 kA;
    public le0_2[] f60;
    public cw_0 ZG;

    public Modern_Ui_OS(int titleId, gc0_0 context, rp_0 actions) {
        super();
        this.IG(sm0_0.c0(titleId), context, actions);
    }

    public Modern_Ui_OS(String title, gc0_0 context, rp_0 actions) {
        super();
        this.IG(title, context, actions);
    }

    public final le0_2[] aP() {
        return this.f60;
    }

    public final cw_0 T() {
        return this.ZG;
    }

    public final void IG(String title, gc0_0 context, rp_0 actions) {
        this.kA = I5.df(null, 0, title);
        this.kA.uf("label-settings-title");
        this.ZG = new cw_0(context, actions);
        rs_0 row = new rs_0(new le0_2[]{this.ZG});
        this.f60 = new le0_2[]{this.kA, row};
    }
}

