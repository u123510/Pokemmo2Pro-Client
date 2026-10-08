package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction055Packet extends ka_0 {
    public final short Jp;

    public BattleAction055Packet(short first, short second) {
        super(second);
        this.Jp = first;
    }

    @Override
    public final byte BL0() {
        return 55;
    }

    @Override
    public final void IE0(PF first, PF target, boolean flag1, boolean flag2, short unused,
                          boolean notify, ML0 model, qn_1 callback) {
        mc0_1 item = gu0.l2.lPT6(this.Jp);
        target.F(this.rA);
        String message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                model.yd0.QX(908, target),
                new String[]{target.A60(), sm0_0.c0(item.Nl)});
        model.I1(message, "", null);
        model.lZ.add(new ii_1(target, model.Hi(target),
                new u60_0(target).vv(target), false, false));
    }
}
