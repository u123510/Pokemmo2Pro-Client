package cn.pokemmo.ui.widget.component;

import f.I5;
import f.W9;
import f.cn_0;
import f.le0_2;
import f.rs_0;
import f.sm0_0;

public class ToggleSettingGroup {
    public W9 qm0;
    public cn_0 Cm0;
    public le0_2[] mJ;

    public ToggleSettingGroup(int id) {
        this(sm0_0.c0(id));
    }

    public ToggleSettingGroup() {
        this("V-Sync");
    }

    public ToggleSettingGroup(String title) {
        this.J70(title);
    }

    public void uK0(boolean value) {
        this.qm0.ER.lK0(value);
    }

    public boolean aq() {
        return this.qm0.ER.U20();
    }

    public void bh() {
        this.qm0.pw0(false);
    }

    public le0_2[] LD() {
        return this.mJ;
    }

    public void yO(String value) {
        this.Cm0.GH0 = 100;
        this.Cm0.yj0 = value;
        this.Cm0.yB0();
    }

    public void J70(String title) {
        this.Cm0 = I5.df(null, 0, title);
        this.Cm0.uf("label-settings-title");
        this.qm0 = new W9();
        rs_0 help = new rs_0(new le0_2[]{this.qm0});
        this.mJ = new le0_2[]{this.Cm0, help};
    }
}
