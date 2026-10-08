package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg006Packet extends Nt implements eb0_0 {
    public final GV t50;
    public final short fM0;

    public BattleActionNeg006Packet(GV v1, short i2) {
        this.t50 = v1;
        this.fM0 = i2;
    }


    public final byte BL0() {
        return -6;
    }


    public final void IE0(PF v1, PF v2, boolean i3, boolean i4, short i5, boolean i6, ML0 v7, qn_1 v8) {
        if (this.t50 == GV.Uu0) {
            String[] strArr = new String[]{
                v2.A60(),
                sm0_0.c0(210000 + this.fM0)
            };
            String msg = sm0_0.Bx(5042, strArr);
            v7.wJ("", msg, (Runnable) null);
        }
    }
}
