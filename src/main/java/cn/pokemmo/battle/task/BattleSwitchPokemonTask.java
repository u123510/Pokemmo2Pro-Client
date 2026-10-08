package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleSwitchPokemonTask extends N60 {
    public final ML0 qY;
    public final PF OE;
    public final PF[] gv0;
    public boolean Zo;

    public BattleSwitchPokemonTask(ML0 ui, PF primary, PF[] values) {
        this.Zo = false;
        this.qY = ui;
        this.OE = primary;
        this.gv0 = values;
    }

    @Override
    public final boolean lPt1() { return true; }

    @Override
    public final void ii() {
        if (this.Zo) return;
        this.Zo = true;
        wx_2 helper = new wx_2();
        for (PF value : this.gv0) {
            short old = value.p10();
            value.F((short) 0);
            this.qY.lZ.add(new TL0(value, this.qY.Hi(value)));
            this.qY.lZ.add(new gh0_1(new X00(this.qY, value, helper.TI0(old))));
        }
        String[] args = { this.OE.A60(), Integer.toString(this.gv0.length) };
        this.qY.wJ(sm0_0.Bx(200436, args), "", null);
        this.qY.lZ.add(new kw_0(new lpt2__3(this.OE, 0.5f, null)));
    }

    @Override
    public final NU gJ0() { return NU.iN; }
}
