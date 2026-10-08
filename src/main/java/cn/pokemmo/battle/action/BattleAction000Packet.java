package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction000Packet extends Nt implements eb0_0 {
    public final short rA;

    public BattleAction000Packet(short value) {
        super();
        this.rA = value;
    }

    @Override
    public byte BL0() {
        return 0;
    }

    @Override
    public void IE0(PF first, PF target, boolean flag1, boolean flag2, short unused,
                          boolean notify, ML0 model, qn_1 callback) {
        if (target.uk() > this.rA) {
            int message = 1380;
            if (callback != null) {
                if (callback.nG0((short) 32)) {
                    message = 1379;
                } else if (callback.nG0((short) 16)) {
                    message = 1381;
                }
            }
            model.lZ.add(new gd_0((byte) 2, (short) message));
        } else if (!this.Ja0((byte) 8) && target.uk() != this.rA && notify) {
            model.lZ.add(new gd_0((byte) 2, (short) 1391));
            if (target.uk() < 1) {
                lpt6__2 format = lpt6__2.Q80;
                int index = model.yd0.QX(3, target);
                String text = sm0_0.Bw((byte) 2, format, 14, index,
                        new String[]{target.A60()});
                model.wJ(text, "", null);
            } else {
                String text = sm0_0.Bw((byte) 2, lpt6__2.Q80, 14, 387,
                        new String[]{target.A60()});
                model.wJ(text, "", null);
            }
        }
        target.F(this.rA);
        model.lZ.add(new l9_0((ka_0) this, target, model.Hi(target), flag1, flag2));
    }
}
