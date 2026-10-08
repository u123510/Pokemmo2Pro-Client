package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction083Packet extends Nt implements eb0_0 {
    public final short mI;
    public final short N20;

    public BattleAction083Packet(short id, short slot) {
        super();
        this.N20 = id;
        this.mI = slot;
    }

    @Override
    public final byte BL0() {
        return 83;
    }

    @Override
    public final void IE0(PF first, PF ignored, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 panel, qn_1 context) {
        mc0_1 move = gu0.l2.lPT6(this.mI);
        lpt6__2 format = lpt6__2.Q80;
        int messageId = panel.yd0.QX(914, first);
        String message = sm0_0.fg0((byte) 2, format, 14, messageId,
            new String[]{first.A60(), sm0_0.c0(move.Nl)});
        panel.I1(message, "", () -> this.j2(first, panel));
    }

    public final void j2(PF first, ML0 panel) {
        first.F(this.N20);
        panel.lZ.add(new yk0_1(first, panel.Hi(first)));
    }
}
