package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattlePartyListModifier extends TC0 {
    public final VU ys0;

    public BattlePartyListModifier(VU value) {
        this.ys0 = value;
    }

    @Override
    public final void QC(ML0 value) {
        BR client = tw0_0.rl;
        BU panel = client.lZ.zK0;
        if (panel != null) {
            panel.FI(this.ys0, null, qo_1.DL, false);
        }
    }
}
