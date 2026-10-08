package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.slot.StorageBoxSlotWidget;

/**
 * 现代化重构类 - 原始混淆类: f.Dy0
 */
public class Modern_Ui_Dy0 implements uw_0 {

    public final /* synthetic */ K5 bw0;
    public final /* synthetic */ StorageBoxSlotWidget B70;

    public Modern_Ui_Dy0(StorageBoxSlotWidget sK0, K5 k5) {
        this.B70 = sK0;
        this.bw0 = k5;
    }

    @Override
    public final void Q(int n) {
        hl0_0 hl0_02 = this.bw0.nn;
        short s = hl0_02.wQ;
        short s2 = (short)n;
        this.B70.Uj0(hl0_02.N50, s, s2);
        this.B70.ks = this.bw0.nn.Br;
    }

    @Override
    public final void run() {
    }
}

