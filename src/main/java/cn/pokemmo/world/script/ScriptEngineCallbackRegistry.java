package cn.pokemmo.world.script;

import f.*;

public class ScriptEngineCallbackRegistry {
    public final byte Tp0;
    public final W9[] jw;
    public final le0_2[] TH0;

    public ScriptEngineCallbackRegistry(byte type, e30_0 settings) {
        this.Tp0 = type;
        cn_0 title = new cn_0(sm0_0.c0(type + 1350));
        title.uf("label-settings-title");
        le0_2 valueLabel = new le0_2();
        valueLabel.uf("label-settings-value");
        this.jw = new W9[3];
        this.TH0 = new le0_2[4];
        this.TH0[0] = title;

        for (byte index = 0; index < 3; index++) {
            W9 toggle = new W9();
            this.jw[index] = toggle;
            boolean enabled = settings != null && settings.wv(type, index);
            toggle.k50(enabled);

            boolean special = type == 1 && index == 1;
            if ((type == 3 && index == 2) || special) {
                toggle.k50(false);
                toggle.pw0(false);
            }

            rs_0 small = new rs_0(toggle);
            small.uf("label-settings-value-small");
            this.TH0[index + 1] = small;
        }
    }

    public final int ff0() {
        int result = 0;
        for (int index = 0; index < this.jw.length; index++) {
            if (this.jw[index].ER.U20()) {
                result |= 1 << (this.Tp0 * 3 + index);
            }
        }
        return result;
    }

    public final le0_2[] Lv0() {
        return this.TH0;
    }
}
