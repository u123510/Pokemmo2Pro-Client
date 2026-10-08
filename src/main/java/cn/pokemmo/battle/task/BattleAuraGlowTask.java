package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.ArrayList;

public class BattleAuraGlowTask extends N60 {
    public final String mf0;
    public final ZJ eL0;
    public final ArrayList fF0;
    public boolean LPt6;

    public BattleAuraGlowTask(String name, ZJ state, Runnable callback) {
        super();
        this.fF0 = new ArrayList();
        this.LPt6 = false;
        this.mf0 = name;
        this.eL0 = state;
        if (callback != null) {
            this.fF0.add(callback);
        }
    }

    @Override
    public final boolean lPt1() {
        if (!this.eL0.Eg0()) {
            return false;
        }
        if (this.LPt6) {
            return true;
        }
        this.LPt6 = true;
        for (Object value : this.fF0) {
            Runnable callback = (Runnable) value;
            if (callback != null) {
                callback.run();
            }
        }
        return true;
    }

    @Override
    public final boolean NJ() {
        return false;
    }

    @Override
    public final void ii() {
        this.eL0.dr.add(new dc0_1(this.mf0));
    }

    @Override
    public final NU gJ0() {
        return NU.ST;
    }
}
