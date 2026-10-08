package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.text.tag.CombatTurnTagLabel;

/**
 * 现代化重构类 - 原始混淆类: f.UD0
 */
public class Modern_Ui_UD0 implements Runnable {

    public final /* synthetic */ HD0 TR;
    public final /* synthetic */ K5 Zm;
    public final /* synthetic */ jc_2 yW;
    public final /* synthetic */ CombatTurnTagLabel o60;

    public Modern_Ui_UD0(CombatTurnTagLabel p70_02, HD0 hD0, K5 k5, jc_2 jc_22) {
        this.o60 = p70_02;
        this.TR = hD0;
        this.Zm = k5;
        this.yW = jc_22;
    }

    @Override
    public final void run() {
        if (tw0_0.kz0()) {
            this.TR.rL0(this.Zm);
            return;
        }
        Modern_Ui_UD0 uD0 = this;
        K5 k5 = uD0.Zm;
        CombatTurnTagLabel p70_02 = this.o60;
        int n = p70_02.A20 + 25;
        UA.rL(this.yW.UX(k5, uD0.o60), p70_02, n, p70_02.SB0 + 25);
    }
}

