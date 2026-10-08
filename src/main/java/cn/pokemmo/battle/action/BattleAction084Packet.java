package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction084Packet extends Nt implements eb0_0 {
    public final short T70;
    public final CH0 Bk0;

    public BattleAction084Packet(CH0 v1, short i2) {
        super();
        this.T70 = i2;
        this.Bk0 = v1;
    }

    public final byte BL0() {
        return 84;
    }

    public final void IE0(PF v1, PF v2, boolean i3, boolean i4, short i5, boolean i6, ML0 v7, qn_1 v8) {
        tb0_1 tb = v7.yd0.yD0(this.Bk0);
        if (tb != null) {
            tb.B3.Bn.H1 = 0;
            tb.B3.Bn.hB(this.T70);
            tb.Wb();
        }
    }

    public final boolean Hm() {
        return false;
    }
}
