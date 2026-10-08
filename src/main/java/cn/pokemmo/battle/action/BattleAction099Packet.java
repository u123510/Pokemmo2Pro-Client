package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction099Packet extends Nt implements eb0_0 {
    public final short eB;

    public BattleAction099Packet(short value) {
        this.eB = value;
    }

    public final byte BL0() {
        return 99;
    }

    public final void IE0(PF first, PF second, boolean unused1, boolean unused2, short action, boolean unused3, ML0 context, qn_1 unused4) {
        short value = this.eB;
        mc0_1 creature = gu0.l2.lPT6(value);
        int actionIndex = context.yd0.eH0(1111, second, first);
        String[] arguments = {second.A60(), first.A60(), sm0_0.c0(creature.Nl)};
        context.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, actionIndex, arguments), "", null);
        if (tw0_0.PK0 != null && tw0_0.LD0.he0 != null) {
            PF firstEntity = tw0_0.PK0.nd0(first.Zo0());
            if (firstEntity != null) {
                firstEntity.bv0((short) 0);
                tw0_0.LD0.he0.N10.Hi(firstEntity).Ny();
            }
            PF secondEntity = tw0_0.PK0.nd0(second.Zo0());
            if (secondEntity != null) {
                secondEntity.bv0(value);
                tw0_0.LD0.he0.N10.Hi(secondEntity).Ny();
            }
            if (action == 361) {
                context.lZ.add(new kw_0((byte) 0, new of_2(first).vv(second)));
            }
        }
    }
}
