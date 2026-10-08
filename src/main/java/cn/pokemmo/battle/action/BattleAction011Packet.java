package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction011Packet extends Nt implements eb0_0 {
    public final byte hx;

    public BattleAction011Packet(byte value) {
        super();
        this.hx = value;
    }

    @Override
    public final byte BL0() {
        return 11;
    }

    @Override
    public final void IE0(PF first, PF second, boolean b1, boolean b2, short s, boolean b3,
                          ML0 model, qn_1 context) {
        lpt6__2 type = lpt6__2.Q80;
        model.wJ(sm0_0.fg0((byte) 2, type, 15, 192,
                new String[]{second.A60()}), "", null);

        byte kind = this.hx;
        if (kind == 4) {
            kw_0 entry = new kw_0((byte) 1, new jr_2(first).vv(second));
            model.lZ.add(entry);
            model.wJ(sm0_0.wa0(200363, second.A60()), "", null);
        } else if (kind == 2) {
            model.lZ.add(new kw_0((byte) 1, new jr_2(first).vv(second)));
            model.wJ(sm0_0.fg0((byte) 2, type, 15, 80, new String[0]), "", null);
        } else if (kind == 0) {
            int id = model.yd0.QX(445, second);
            model.wJ(sm0_0.fg0((byte) 2, type, 14, id,
                    new String[]{second.A60()}), "", null);
        }
    }
}
