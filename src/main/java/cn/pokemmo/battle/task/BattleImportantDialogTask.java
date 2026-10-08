package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleImportantDialogTask extends N60 {
    public final b30_0 fm0;
    public final PF hC;

    public BattleImportantDialogTask(PF state, b30_0 value) {
        super();
        System.currentTimeMillis();
        this.hC = state;
        this.fm0 = value;
    }

    @Override
    public final boolean lPt1() {
        return true;
    }

    @Override
    public final void ii() {
        a10_0 current = tw0_0.PK0;
        if (current == null) {
            return;
        }
        this.hC.wb0(this.fm0.Pp0 == current.Ez0());
        this.hC.ZI(this.hC.COm2(), true);
        this.hC.qi.yJ = this.hC.vF(current);
        this.hC.qi.tX = this.hC.h90(current);
        this.hC.r10.Wb();
    }

    @Override
    public final NU gJ0() {
        return NU.ha0;
    }
}
