/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.ML0;
import f.N60;
import f.NN;
import f.NU;
import f.le0_2;
import f.sc_2;
import f.tw0_0;
import f.ut_2;

public class BattleFaintAnimationTask
extends N60 {
    public final ut_2 cK0;

    public BattleFaintAnimationTask(ut_2 ut_22) {
        this.cK0 = ut_22;
    }

    @Override
    public final boolean lPt1() {
        sc_2 sc_22 = tw0_0.LD0.he0.N10.GH0;
        return (sc_22 != null && sc_22.eE) ^ true;
    }

    @Override
    public final boolean NJ() {
        return false;
    }

    @Override
    public final void ii() {
        ML0 mL0 = tw0_0.LD0.he0.N10;
        Object object = this.cK0;
        mL0.g9();
        mL0.GH0 = new sc_2(mL0, (ut_2)object);
        if (tw0_0.kz0() ^ true) {
            ML0 mL02 = mL0;
            object = mL02.GH0;
            mL02.F9(mL02.fU(), (le0_2)object);
        } else {
            ML0 mL03 = mL0;
            mL03.ke();
            mL03.Hd = new NN(mL0.GH0);
            object = mL03.Hd;
            mL03.F9(mL03.fU(), (le0_2)object);
        }
    }

    @Override
    public final NU gJ0() {
        return NU.kB0;
    }
}

