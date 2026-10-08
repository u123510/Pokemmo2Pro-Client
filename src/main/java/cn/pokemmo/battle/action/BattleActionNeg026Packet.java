package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg026Packet extends ka_0 {
    public BattleActionNeg026Packet(short value) {
        super(value);
    }

    public static void lpT6(ML0 battle, PF target) {
        battle.lZ.add(new kw_0((byte)0, new IE0(target)));
        battle.lZ.add(new ii_1(target, battle.Hi(target), null, false, false));
    }

    @Override
    public final byte BL0() {
        return -26;
    }

    @Override
    public final void IE0(PF source, PF target, boolean first, boolean second, short value,
                          boolean third, ML0 battle, qn_1 context) {
        target.F(this.rA);
        String message = sm0_0.wa0(200520, target.Yp());
        battle.I1(message, "", () -> lpT6(battle, target));
    }
}
