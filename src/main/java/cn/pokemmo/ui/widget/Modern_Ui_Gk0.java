package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.slot.BreedingDaycareSlotWidget;

/**
 * 现代化重构类 - 原始混淆类: f.GK0
 */
public class Modern_Ui_Gk0 implements uw_0 {

    public final /* synthetic */ K5 kw;
    public final /* synthetic */ BreedingDaycareSlotWidget hI;

    public Modern_Ui_Gk0(BreedingDaycareSlotWidget hK0, K5 k5) {
        this.hI = hK0;
        this.kw = k5;
    }

    @Override
    public final void Q(int n) {
        hl0_0 hl0_02 = this.kw.nn;
        short s = hl0_02.wQ;
        short s2 = (short)n;
        this.hI.Uj0(hl0_02.N50, s, s2);
        this.hI.Gu0 = this.kw.nn.Br;
    }

    @Override
    public final void run() {
    }
}

