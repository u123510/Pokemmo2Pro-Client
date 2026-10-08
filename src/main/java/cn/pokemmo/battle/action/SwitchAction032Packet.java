package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchAction032Packet extends Nt implements eb0_0 {
    public final byte YH0;

    public SwitchAction032Packet(byte value) {
        this.YH0 = value;
    }

    @Override
    public final byte BL0() {
        return 32;
    }

    @Override
    public final void IE0(PF first, PF second, boolean firstFlag, boolean secondFlag,
                          short ignored, boolean thirdFlag, ML0 battle, qn_1 context) {
        switch (this.YH0) {
            case 0:
                battle.I1(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(327, second), new String[]{second.A60()}), "", null);
                break;
            case 1:
                battle.I1(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(336, second), new String[]{second.A60()}), "", null);
                break;
            case 2:
                battle.I1(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(333, second),
                        new String[]{first.A60(), second.A60()}), "", null);
                battle.lZ.add(new kw_0((byte) 0, new Wg(second).vv(second)));
                break;
            case 3:
                battle.I1(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(339, second), new String[]{second.A60()}), "", null);
                break;
            default:
                break;
        }
    }
}
