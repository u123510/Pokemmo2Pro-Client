package cn.pokemmo.battle;

import f.*;
import java.util.Random;

/**
 * 现代化重构类 - 原始混淆类: f.Lk
 */
public class Modern_Battle_Lk extends Random {

    private static final long serialVersionUID = 1L;

    public final com4__1 dG;

    public Modern_Battle_Lk() {
        this.dG = new com4__1();
    }

    @Override
    public final int next(int bits) {
        xl_2 state = (xl_2) this.dG.get();
        long seed = (state.yt0 * 25214903917L + 11L) & 281474976710655L;
        state.yt0 = seed;
        return (int) (seed >>> (48 - bits));
    }

    @Override
    public final void setSeed(long seed) {
        com4__1 states = this.dG;
        if (states != null) {
            ((xl_2) states.get()).G20(seed);
        }
    }
}

