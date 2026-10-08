package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction036Packet extends Nt implements eb0_0 {
    public final short W90;

    public BattleAction036Packet(short s) {
        this.W90 = s;
    }

    @Override
    public final byte BL0() {
        return 36;
    }

    @Override
    public final void IE0(PF pF, PF object, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        lpt6__2 type = lpt6__2.Q80;
        int category = 14;
        int msg = mL0.yd0.QX(571, pF);
        String[] args = new String[2];
        args[0] = pF.A60();
        args[1] = sm0_0.c0(this.W90 + 110000);
        mL0.wJ(sm0_0.fg0((byte) 2, type, category, msg, args), "", null);
    }
}
