package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ItemAction127Packet extends Nt implements eb0_0 {
    public ItemAction127Packet() {
        super();
    }

    @Override
    public final byte BL0() {
        return (byte) 127;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        mc0_1 item = gu0.l2.lPT6((short) 5288);
        int localized = battle.yd0.eH0(1111, first, second);
        String[] arguments = {first.A60(), second.A60(), sm0_0.c0(item.Nl)};
        battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, localized, arguments), "", null);

        if (tw0_0.PK0 == null || tw0_0.LD0.he0 == null) {
            return;
        }
        PF target = tw0_0.PK0.nd0(second.Zo0());
        if (target != null) {
            target.bv0((short) 0);
            tw0_0.LD0.he0.N10.Hi(target).Ny();
        }
        target = tw0_0.PK0.nd0(first.Zo0());
        if (target != null) {
            target.bv0((short) 5288);
            tw0_0.LD0.he0.N10.Hi(target).Ny();
        }
    }
}
