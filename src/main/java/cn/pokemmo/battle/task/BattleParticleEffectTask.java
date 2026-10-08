package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.ArrayList;
import java.util.Arrays;

public class BattleParticleEffectTask extends N60 {
    public final String public$;
    public final ZJ sp0;
    public final ArrayList su;

    public BattleParticleEffectTask(String name, ZJ owner, Runnable... tasks) {
        super();
        this.su = new ArrayList();
        this.public$ = name;
        this.sp0 = owner;
        this.su.addAll(Arrays.asList(tasks));
    }

    @Override
    public final boolean lPt1() {
        for (Object value : this.su) {
            if (value != null) {
                ((Runnable) value).run();
            }
        }
        this.su.clear();
        return true;
    }

    @Override
    public final boolean NJ() {
        return false;
    }

    @Override
    public final void ii() {
        this.sp0.dr.add(new dc0_1(this.public$));
    }

    @Override
    public final NU gJ0() {
        return NU.ST;
    }
}
