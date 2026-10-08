package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg021Packet extends Nt implements eb0_0 {
    public final byte[] Fn0;

    public BattleActionNeg021Packet(byte[] value) {
        super();
        this.Fn0 = value;
    }

    @Override
    public final byte BL0() {
        return (byte) -21;
    }

    @Override
    public final void IE0(PF first, PF target, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        target.h30(this.Fn0);
        target.r10.Wb();
        jn_0 loader = tw0_0.LD0;
        if (loader.he0 != null) {
            loader.he0.N10.Hi(target).XO();
        }
        String message = sm0_0.Bx(16807028,
                target.nz0(true), first.nz0(true));
        battle.wJ(message, "", null);
    }
}
