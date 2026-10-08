package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleTurnCounterModifier extends TC0 {
    public final int Rd;

    public BattleTurnCounterModifier() {
        super();
        this.Rd = 2750;
    }

    public BattleTurnCounterModifier(int i) {
        super();
        this.Rd = 3500;
    }

    public final void QC(ML0 ml0) {
        ml0.lZ.add(new tq_2((pf0_2) this));
    }
}
