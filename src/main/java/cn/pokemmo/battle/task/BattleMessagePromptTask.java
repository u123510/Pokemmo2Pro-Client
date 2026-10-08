/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.JH0;
import f.ML0;
import f.N60;
import f.NU;
import f.PF;
import f.hk0_1;
import f.tw0_0;

/*
 * Renamed from f.bV
 */
public class BattleMessagePromptTask
extends N60 {
    public final ML0 vk;
    public final PF J6;
    public final byte Dm0;

    public BattleMessagePromptTask(ML0 mL0, PF pF, byte by) {
        this.vk = mL0;
        this.J6 = pF;
        this.Dm0 = by;
    }

    @Override
    public final void ii() {
        this.J6.q40.j70 = this.Dm0;
        this.vk.X60(true);
        long l = hk0_1.KG;
        if (l - JH0.uZ > 100L) {
            JH0.uZ = l;
            tw0_0.RE0.Hq0((byte)1, (short)36);
        }
    }

    @Override
    public final boolean lPt1() {
        return this.vk.rp0();
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}

