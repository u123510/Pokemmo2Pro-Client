package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.slot.CosmeticDressSlotWidget;

/**
 * 现代化重构类 - 原始混淆类: f.ig0_1
 */
public class Modern_Ui_Ig01 implements Runnable {

    public final /* synthetic */ K5 vb;
    public final /* synthetic */ CosmeticDressSlotWidget com9;

    public Modern_Ui_Ig01(CosmeticDressSlotWidget vr0_02, K5 k5) {
        this.com9 = vr0_02;
        this.vb = k5;
    }

    @Override
    public final void run() {
        this.com9.UR(this.vb);
    }
}

