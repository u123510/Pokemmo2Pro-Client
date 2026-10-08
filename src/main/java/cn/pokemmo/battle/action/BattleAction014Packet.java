package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction014Packet extends Nt implements eb0_0 {
    public final short o2;
    public final b30_0 z3;
    public final short S0;

    public BattleAction014Packet(short value, b30_0 type, short secondaryValue) {
        this.o2 = value;
        this.z3 = type;
        this.S0 = secondaryValue;
    }

    @Override
    public final byte BL0() {
        return (byte) 14;
    }

    @Override
    public final void IE0(PF ignored, PF target, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        target.F(this.o2);
        battle.lZ.add(new ii_1(target, battle.Hi(target), (MU) null, false, false));
        lpt6__2 format = lpt6__2.Q80;
        battle.wJ(sm0_0.fg0((byte) 2, format, 14,
                battle.yd0.QX(610, target), new String[]{target.A60()}), "", null);
        PF other = battle.yd0.Ce(this.z3.Pp0, this.z3.B6);
        if (other != null) {
            other.F(this.S0);
            battle.lZ.add(new ii_1(other, battle.Hi(other), (MU) null, false, false));
        }
    }
}
