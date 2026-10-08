package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction046Packet extends Nt implements eb0_0 {
    public final byte FW;
    public final short HG;

    public BattleAction046Packet(byte fw, short hg) {
        super();
        this.FW = fw;
        this.HG = hg;
    }

    @Override
    public final byte BL0() {
        return 46;
    }

    @Override
    public final void IE0(PF first, PF target, boolean b3, boolean b4, short s5,
                          boolean b6, ML0 context, qn_1 qn) {
        if (this.FW == 2) {
            context.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                    context.yd0.QX(598, target), new String[]{target.A60()}), "", null);
            target.S20 = -1;
        } else if (this.FW == 1) {
            context.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                    context.yd0.QX(595, target),
                    new String[]{target.A60(), sm0_0.c0(this.HG + 110000)}), "", null);
        } else if (this.FW == 0) {
            context.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                    context.yd0.QX(592, target),
                    new String[]{target.A60(), sm0_0.c0(this.HG + 110000)}), "", null);
            target.S20 = this.HG;
        }
    }
}
