package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleStatusInflictTask extends N60 {
    public boolean AE;
    public final /* synthetic */ VU Vz0;

    public BattleStatusInflictTask(VU v1) {
        super();
        this.Vz0 = v1;
        this.AE = false;
    }

    public final boolean lPt1() {
        return this.AE;
    }

    public final void ii() {
        if (this.AE) {
            return;
        }
        this.AE = true;
        BU bu = tw0_0.rl.lZ.zK0;
        if (bu != null) {
            bu.FI(this.Vz0, null, qo_1.DL, false);
        }
    }

    public final NU gJ0() {
        return NU.zJ;
    }
}
