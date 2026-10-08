package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.slot.HotkeyActionBarSlotWidget;

/**
 * 现代化重构类 - 原始混淆类: f.of0_1
 */
public class Modern_Ui_of0_1 implements uw_0 {

    public final /* synthetic */ K5 Dl;
    public final /* synthetic */ HotkeyActionBarSlotWidget tE0;

    public Modern_Ui_of0_1(HotkeyActionBarSlotWidget ga0_12, K5 k5) {
        this.tE0 = ga0_12;
        this.Dl = k5;
    }

    @Override
    public final void Q(int n) {
        hl0_0 hl0_02 = this.Dl.nn;
        short s = hl0_02.wQ;
        n = (short)n;
        byte by = hl0_02.N50;
        this.tE0.pV(by, hl0_02.Br, s, (short)n);
    }

    @Override
    public final void run() {
    }
}

