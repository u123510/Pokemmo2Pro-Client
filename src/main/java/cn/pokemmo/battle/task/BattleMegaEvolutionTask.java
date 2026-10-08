package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleMegaEvolutionTask extends N60 {
    public final L5 bc;
    public boolean df0;

    public BattleMegaEvolutionTask(L5 v1) {
        super();
        this.df0 = false;
        this.bc = v1;
    }

    public final boolean lPt1() {
        return this.df0;
    }

    public final void ii() {
        if (!this.df0) {
            this.df0 = true;
            cj_0 cj = this.bc.MC;
            if (cj.A3 >= 5) {
                cj.A3 = 0;
                this.bc.X60(false);
            }
        }
    }

    public final NU gJ0() {
        return NU.Yt;
    }
}
