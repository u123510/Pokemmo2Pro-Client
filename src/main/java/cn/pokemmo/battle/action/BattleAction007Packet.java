package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction007Packet extends Nt implements eb0_0 {
    public final boolean b3;

    public BattleAction007Packet(boolean value) {
        super();
        this.b3 = value;
    }

    @Override
    public final byte BL0() {
        return 7;
    }

    @Override
    public final void IE0(PF first, PF second, boolean b1, boolean b2, short s, boolean b3, ML0 model, qn_1 queue) {
        if (this.b3) {
            lpt6__2 mode = lpt6__2.Q80;
            int slot = model.yd0.QX(309, second);
            String[] args = {second.A60()};
            model.I1(sm0_0.fg0((byte) 2, mode, 14, slot, args), "", null);
            model.lZ.add(new kw_0((byte) 0, new F6(second).vv(first)));
        } else {
            lpt6__2 mode = lpt6__2.Q80;
            int slot = model.yd0.QX(312, second);
            String[] args = {second.A60()};
            model.wJ(sm0_0.fg0((byte) 2, mode, 14, slot, args), "", null);
            model.lZ.add(new fk_0(model, second, (byte) 0));
        }
    }
}
