package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg031Packet extends Nt implements eb0_0 {
    public final byte fb0;

    public BattleActionNeg031Packet(byte i1) {
        super();
        this.fb0 = i1;
    }

    @Override
    public final byte BL0() {
        return -31;
    }

    @Override
    public final void IE0(PF v1, PF v2, boolean z3, boolean z4, short i5, boolean z6, ML0 v7, qn_1 v8) {
        if (v2.p10() != 1024) {
            v7.I1(sm0_0.wa0(5077, v2.nz0(true)), "", null);
            new C8(v2.LpT9.j);
            zd0_0 shape = new zd0_0(v2, v2.zi0.Sj);
            v7.lZ.add(new kw_0(shape));
        }
        if (fb0 == 2) {
            v7.I1(sm0_0.wa0(16803005, v2.nz0(true)), "", null);
            kw_0 entry = new kw_0((byte) 0, new n90_0(v2, v2).vv(v2));
            v7.lZ.add(entry);
            return;
        }
        if (fb0 == 1) v7.wJ(sm0_0.c0(5078), "", null);
        v7.yd0.getClass();
        v7.yd0.j6 = zg0_0.ku0;
    }
}
