package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleCriticalHitTask extends N60 {
    public final b30_0 il;
    public final PF tw;

    public BattleCriticalHitTask(PF value, b30_0 type) {
        super();
        System.currentTimeMillis();
        this.tw = value;
        this.il = type;
    }

    @Override
    public final boolean lPt1() {
        return true;
    }

    @Override
    public final void ii() {
        a10_0 state = tw0_0.PK0;
        if (state == null) {
            return;
        }
        this.tw.wb0(this.il.Pp0 == state.Ez0());
        this.tw.ZI(this.tw.COm2(), true);
        this.tw.qi.yJ = this.tw.vF(state);
        this.tw.qi.tX = this.tw.h90(state);
        this.tw.r10.Wb();
    }

    @Override
    public final NU gJ0() {
        return NU.ha0;
    }

    @Override
    public final boolean gL0() {
        return true;
    }
}
