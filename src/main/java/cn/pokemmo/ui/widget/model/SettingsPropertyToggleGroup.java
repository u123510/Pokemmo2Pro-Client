package cn.pokemmo.ui.widget.model;

import f.I5;
import f.cn_0;
import f.ie0_1;
import f.le0_2;
import f.rp_0;
import f.rs_0;
import f.up_0;

public class SettingsPropertyToggleGroup {
    public ie0_1 Ag;
    public cn_0 vI;
    public le0_2[] AI0;
    public up_0[] fj0;
    public rp_0 B0;

    public SettingsPropertyToggleGroup(rp_0 root) {
        this.fj0 = null;
        this.Fb0(root.U7(), root);
    }

    public boolean KI() {
        return this.B0.Zt;
    }

    public boolean Qi0() {
        return this.Ag.iL < 1;
    }

    public le0_2[] Rv() {
        return this.AI0;
    }

    public void bz(up_0[] children) {
        this.fj0 = children;
    }

    public void Fb0(String label, rp_0 setting) {
        this.vI = I5.df(null, 0, label);
        this.vI.uf("label-settings-title");
        this.Ag = new ie0_1((up_0) (Object) this, setting);
        this.B0 = setting;
        rs_0 group = new rs_0(new le0_2[]{this.Ag});
        this.AI0 = new le0_2[]{this.vI, group};
    }
}
