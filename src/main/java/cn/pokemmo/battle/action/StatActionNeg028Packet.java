package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Arrays;

public class StatActionNeg028Packet extends Nt implements eb0_0 {
    public StatActionNeg028Packet() {
        super();
    }

    public static void Aa(ML0 battle, PF value) {
        battle.lZ.add(new kw_0((byte) 0, new ax_0(value)));
        byte[] copy = Arrays.copyOf(value.sL0, value.sL0.length);
        for (int i = 0; i < copy.length; i++) {
            copy[i] = (byte) (copy[i] * -1);
        }
        value.h30(copy);
        battle.Hi(value).XO();
    }

    @Override
    public final byte BL0() {
        return (byte) -28;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2, short value,
                          boolean flag3, ML0 battle, qn_1 context) {
        String label = sm0_0.wa0(200522, second.Yp());
        battle.I1(label, "", () -> Aa(battle, second));
    }
}
