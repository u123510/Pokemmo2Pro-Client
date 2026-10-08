package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction091Packet extends Nt implements eb0_0 {
    public final short oo;

    public BattleAction091Packet(short value) {
        super();
        this.oo = value;
    }

    @Override
    public final byte BL0() {
        return 91;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        mc0_1 message = gu0.l2.lPT6(this.oo);
        if (first == null) {
            return;
        }
        vk0_1 entry = (vk0_1) ec0_2.Sx().f4.f5(value);
        if (entry == null) {
            return;
        }
        String[] arguments = {
                sm0_0.c0(message.Nl),
                sm0_0.c0(entry.bt)
        };
        battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 182, arguments), "", null);
    }
}
