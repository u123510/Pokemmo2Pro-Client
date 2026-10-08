package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg016Packet extends Nt implements eb0_0 {
    public final byte Fm;
    public final boolean AA0;

    public BattleActionNeg016Packet(byte value, boolean enabled) {
        super();
        this.Fm = value;
        this.AA0 = enabled;
    }

    @Override
    public final byte BL0() {
        return (byte) -16;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 model, qn_1 callback) {
        O8 entry = model.yd0.mn(this.Fm);
        if (this.AA0) {
            model.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 38,
                    new String[]{entry.M2()}), "", null);
        } else {
            model.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 40,
                    new String[]{entry.M2()}), "", null);
        }
        model.lZ.add(new sa_2((lu0_0) this, model, this.AA0));
    }
}
