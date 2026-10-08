package cn.pokemmo.ui.widget.component;

import f.cn_0;
import f.le0_2;
import f.rs_0;
import f.xe_1;

public class SettingsRowBuilder {
    public final le0_2[] A40;

    public SettingsRowBuilder(String v1, String v2, Runnable v3) {
        super();
        cn_0 cn = new cn_0(v1);
        cn.uf("label-settings-title");
        xe_1 xe = new xe_1(v2);
        xe.RR(v3);
        rs_0 rs = new rs_0(new le0_2[]{xe});
        this.A40 = new le0_2[]{cn, rs};
    }

    public le0_2[] Q30() {
        return this.A40;
    }
}
