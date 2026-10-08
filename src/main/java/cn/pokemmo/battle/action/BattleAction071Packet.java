package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction071Packet extends Nt implements eb0_0 {
    public final short Zf0;

    public BattleAction071Packet(short value) {
        super();
        this.Zf0 = value;
    }

    @Override
    public final byte BL0() {
        return (byte) 71;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        mc0_1 type = gu0.l2.lPT6(this.Zf0);
        int messageId = battle.yd0.eH0(1050, first, second);
        String[] args = {first.A60(), second.A60(), sm0_0.c0(type.Nl)};
        battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, messageId, args), "", null);

        if (tw0_0.PK0 == null || tw0_0.LD0.he0 == null) {
            return;
        }
        PF target = tw0_0.PK0.nd0(second.Zo0());
        if (target != null) {
            target.bv0((short) 0);
            tw0_0.LD0.he0.N10.Hi(target).Ny();
        }
    }
}
