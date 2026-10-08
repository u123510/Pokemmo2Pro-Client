package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction013Packet extends ka_0 {
    public final d70_0 coM8;

    public BattleAction013Packet(d70_0 mode, short value) {
        super(value);
        this.coM8 = mode;
    }

    @Override
    public final byte BL0() {
        return 13;
    }

    @Override
    public final void IE0(PF source, PF target, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 model, qn_1 callback) {
        target.F(this.rA);
        model.lZ.add(new ii_1(target, model.Hi(target), null, false, false));
        if (this.coM8 == d70_0.gh) {
            model.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                    model.yd0.QX(396, target), new String[]{target.A60()}), "", null);
        }
    }
}
