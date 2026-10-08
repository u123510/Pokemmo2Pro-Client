package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleCombatLayoutModifier extends TC0 {
    public final b30_0 br0;
    public final iz_1 SC0;

    public BattleCombatLayoutModifier(b30_0 v1, iz_1 v2) {
        super();
        this.br0 = v1;
        this.SC0 = v2;
    }

    public final void QC(ML0 v1) {
        v1.fr = this.br0;
        v1.lZ.add(new AK0(this.SC0));
        v1.yd0.rg0 = false;
        v1.yd0.p1 = 0;
    }
}
