package cn.pokemmo.ui.widget;

import f.*;
import cn.pokemmo.ui.widget.slot.PartyPokemonSlotWidget;

/**
 * 现代化重构类 - 原始混淆类: f.Qp0
 */
public class Modern_Ui_Qp0 implements uw_0 {

    public final /* synthetic */ K5 Ne;
    public final /* synthetic */ PartyPokemonSlotWidget w9;

    public Modern_Ui_Qp0(PartyPokemonSlotWidget u70_02, K5 k5) {
        this.w9 = u70_02;
        this.Ne = k5;
    }

    @Override
    public final void Q(int n) {
        Modern_Ui_Qp0 qp0 = this;
        hl0_0 hl0_02 = this.Ne.nn;
        short s = hl0_02.wQ;
        short s2 = (short)n;
        qp0.w9.Uj0(hl0_02.N50, s, s2);
        qp0.w9.qi = this.Ne.nn.Br;
        lpt6__0.v90(qp0.w9);
    }

    @Override
    public final void run() {
    }
}

