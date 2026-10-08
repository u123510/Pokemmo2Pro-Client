/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

import f.E00;
import f.cn_0;
import f.i70_0;
import f.ox_0;

public class IconActionButton extends BaseButton {
    public final /* synthetic */ ox_0 aA0;

    public IconActionButton(ox_0 ox_02, String string) {
        super(string);
        this.aA0 = ox_02;
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        int n;
        int n2 = i70_02.zu;
        if (n2 >= 1 && n2 <= 7 && ((n = i70_02.nA0) == 1 || n == 0) && n2 == 3) {
            this.aA0.getClass();
            this.aA0.Gu0 = System.currentTimeMillis();
        }
        return super.nd0(i70_02);
    }
}
