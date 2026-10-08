/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.LW;
import f.N60;
import f.NU;
import f.jd0_1;
import f.jh0_0;

public class BattleEvolutionDisplayTask
extends N60 {
    public final jd0_1 lpt1;
    public final float MG;

    public BattleEvolutionDisplayTask(float f, jd0_1 jd0_12) {
        this.MG = f;
        this.lpt1 = jd0_12;
    }

    @Override
    public final boolean lPt1() {
        jd0_1 jd0_12 = this.lpt1;
        jh0_0 jh0_02 = jd0_12.Rg0;
        return jh0_02 == null || LW.LH0(jh0_02.Co0, jh0_02.Com9) || !jd0_12.Rg0.eE;
    }

    @Override
    public final void ii() {
        float f = this.MG;
        jh0_0 jh0_02 = this.lpt1.Rg0;
        if (jh0_02 != null) {
            jh0_0 jh0_03 = jh0_02;
            jh0_02.Co0 = jh0_02.Com9;
            jh0_03.Com9 = f;
            jh0_03.MR = System.currentTimeMillis();
        }
    }

    @Override
    public final NU gJ0() {
        return NU.Gk0;
    }
}
