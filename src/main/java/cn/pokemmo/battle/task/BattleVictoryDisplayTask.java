package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleVictoryDisplayTask extends N60 {
    public long ed0;
    public final PF Lv;
    public boolean LO;

    public BattleVictoryDisplayTask(PF owner) {
        super();
        this.ed0 = System.currentTimeMillis();
        this.LO = false;
        this.Lv = owner;
    }

    @Override
    public final boolean lPt1() {
        return this.LO && System.currentTimeMillis() - this.ed0 > 1250L;
    }

    @Override
    public final void ii() {
        a10_0 state = tw0_0.PK0;
        if (state == null || this.LO) {
            return;
        }
        this.ed0 = System.currentTimeMillis();
        jk_0 control = this.Lv.qi;
        control.yJ = -80;
        control.tX = this.Lv.h90(state);
        this.Lv.Fo.nE0 = true;
        lpt5__5.hL.ZD(new il0_0(this.Lv.Fo, 5, 2), 20L);
        this.LO = true;
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}
