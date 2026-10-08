package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleSubstituteDisplayTask extends N60 {
    public long Gf;
    public final PF coN;
    public boolean ID;

    public BattleSubstituteDisplayTask(PF v1) {
        this.Gf = System.currentTimeMillis();
        this.ID = false;
        this.coN = v1;
    }

    public final boolean lPt1() {
        return this.ID && (System.currentTimeMillis() - this.Gf > 1250L);
    }

    public final void ii() {
        if (!this.ID) {
            this.Gf = System.currentTimeMillis();
            ii0_2 this_fo0 = this.coN.Fo;
            this_fo0.nE0 = true;
            lpt5__5.hL.ZD(new il0_0(this_fo0, 180, 6), 20L);
            this.ID = true;
        }
    }

    public final NU gJ0() {
        return NU.Yt;
    }
}
