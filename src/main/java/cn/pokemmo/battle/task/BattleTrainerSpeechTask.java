/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.BR;
import f.N60;
import f.NU;
import f.tw0_0;
import f.zo_0;

/*
 * Renamed from f.sw
 */
public class BattleTrainerSpeechTask
extends N60 {
    public final String qd0;

    public BattleTrainerSpeechTask(String string) {
        this.qd0 = string;
    }

    @Override
    public final boolean lPt1() {
        return true;
    }

    @Override
    public final void ii() {
        BR bR = tw0_0.rl;
        if (bR != null) {
            bR.jC(this.qd0, zo_0.n4);
        }
    }

    @Override
    public final NU gJ0() {
        return NU.ST;
    }
}

