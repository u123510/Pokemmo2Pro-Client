/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

import f.E00;
import f.cn_0;
import f.i70_0;
import f.rn0_0;

/*
 * Renamed from f.Jd
 */
public class RadioButtonWidget extends BaseButton {
    public final /* synthetic */ rn0_0 Bj;

    public RadioButtonWidget(rn0_0 rn0_02) {
        this.Bj = rn0_02;
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        int n = i70_02.zu;
        if (E00.C10(n) && n == 5) {
            this.Bj.getClass();
            rn0_0.jd();
            return true;
        }
        return super.nd0(i70_02);
    }
}

