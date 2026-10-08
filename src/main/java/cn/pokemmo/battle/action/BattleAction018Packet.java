package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction018Packet extends ka_0 {
    public final byte OD0;

    public BattleAction018Packet(short base, byte mode) {
        super(base);
        this.OD0 = mode;
    }

    @Override
    public final byte BL0() {
        return (byte) 18;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 model, qn_1 callback) {
        if (this.OD0 != 0) {
            return;
        }
        second.F(this.rA);
        model.lZ.add(new ii_1(second, model.Hi(second), null, false, false));
        lpt6__2 format = lpt6__2.Q80;
        int slot = model.yd0.QX(1071, second);
        model.wJ(sm0_0.fg0((byte) 2, format, 14, slot,
                new String[]{second.A60()}), "", null);
        model.lZ.add(new kw_0((byte) 0, new vd0_0(second).vv(first)));
    }
}
