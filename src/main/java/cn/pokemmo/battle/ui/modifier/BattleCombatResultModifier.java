package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleCombatResultModifier extends TC0 {
    public final CH0 fU;
    public CH0 Y00;
    public final Nt ZE;

    public BattleCombatResultModifier(CH0 first, CH0 second, Nt effect) {
        super();
        this.fU = first;
        this.Y00 = second;
        this.ZE = effect;
    }

    @Override
    public final void QC(ML0 ui) {
        if (this.ZE.Ja0((byte) 1)) {
            this.Y00 = this.ZE.jA0;
        }
        a10_0 state = ui.yd0;
        PF target = state.nd0(this.Y00);
        if (target == null && this.ZE.Hm()) {
            ui.wJ("[ERR_SEI] Error finding target for SkillEffect " + this.ZE, "", null);
            return;
        }
        PF source = state.nd0(this.fU);
        if (source == null) {
            source = target;
        }
        ui.aa0(source, target, this.ZE, false, false, (short) 0, false, null);
    }
}
