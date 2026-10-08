package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchAction058Packet extends Nt implements eb0_0 {
    public final byte Tn;

    public SwitchAction058Packet(byte value) {
        this.Tn = value;
    }

    @Override
    public final byte BL0() {
        return 58;
    }

    @Override
    public final void IE0(PF first, PF second, boolean b1, boolean b2, short s,
                          boolean b3, ML0 battle, qn_1 context) {
        switch (this.Tn) {
            case 0:
                battle.lZ.add(new Q8(second, true));
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(785, second), new String[]{second.A60()}), "", null);
                return;
            case 1:
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(788, second), new String[]{second.A60()}), "", null);
                return;
            case 2:
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(791, second), new String[]{second.A60()}), "", null);
                return;
            case 3:
                battle.lZ.add(new Q8(second, false));
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(794, second), new String[]{second.A60()}), "", null);
                return;
            case 4:
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 123, new String[0]), "", null);
                return;
            case 5:
                battle.lZ.add(new Q8(second, false));
                battle.wJ(sm0_0.Bx(16807039,
                        new String[]{second.A60(), first.A60()}), "", null);
                return;
            default:
                return;
        }
    }
}
