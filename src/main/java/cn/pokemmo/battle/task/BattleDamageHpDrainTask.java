package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleDamageHpDrainTask extends N60 {
    public long Fp;
    public final ML0 ms0;
    public final LD A20;

    public BattleDamageHpDrainTask(LD data, ML0 state) {
        this.A20 = data;
        this.ms0 = state;
        this.Fp = -1L;
    }

    @Override
    public final void ii() {
        this.ms0.yd0.Pl0 = this.A20.pC0;
        int index = 0;
        while (index < this.A20.uo0.length) {
            PF slot = this.ms0.yd0.Ce((byte) index, (byte) 0);
            if (slot != null) {
                slot.q40.j70 = this.A20.uo0[index];
                slot.q40.Tv0 = (byte) -1;
            }
            index = (byte) (index + 1);
        }
        L5 contest = (L5) this.ms0;
        byte[] values = this.A20.l3;
        index = 0;
        while (index < contest.MC.wI0.length) {
            PF slot = contest.MC.Ce((byte) index, (byte) 0);
            if (slot != null) {
                slot.q40.nG = values[index];
                slot.q40.LX = (short) 0;
            }
            index = (byte) (index + 1);
        }
        contest.COm3();
        contest.X60(false);
    }

    @Override
    public final boolean lPt1() {
        if (this.Fp == -1L) {
            this.Fp = hk0_1.KG;
        }
        return hk0_1.KG - this.Fp > 1000L;
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}
