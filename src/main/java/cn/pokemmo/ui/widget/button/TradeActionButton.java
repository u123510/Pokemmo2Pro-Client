/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

import f.ak0_2;
import f.cn_0;
import f.i70_0;

/*
 * Renamed from f.zw0
 */
public class TradeActionButton extends BaseButton {
    public final ak0_2 ac0;

    public TradeActionButton(ak0_2 ak0_22, String string) {
        super(string);
        this.ac0 = ak0_22;
    }

    public TradeActionButton(ak0_2 ak0_22) {
        this.ac0 = ak0_22;
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        int n = i70_02.zu;
        if (n == 1) {
            this.ac0.k50(i70_02);
        } else if (n == 7) {
            this.ac0.k50(i70_02);
        }
        return this.ac0.nd0(i70_02);
    }
}

