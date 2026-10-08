package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction003Packet extends ka_0 {
    public BattleAction003Packet(short value) {
        super(value);
    }

    @Override
    public final byte BL0() {
        return 3;
    }

    @Override
    public final void IE0(PF first, PF target, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 model, qn_1 callback) {
        target.F(this.rA);
        int messageId = model.yd0.QX(261, target);
        model.I1(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, messageId,
                new String[]{target.A60()}), "", null);
        model.lZ.add(new kw_0((byte) 0, new EE0(target).vv(target)));
        model.lZ.add(new ii_1(target, model.Hi(target), null, false, false));
    }
}
