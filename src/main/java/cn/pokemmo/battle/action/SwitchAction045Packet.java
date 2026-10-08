package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchAction045Packet extends Nt implements eb0_0 {
    public final byte qi0;

    public SwitchAction045Packet(byte value) {
        super();
        this.qi0 = value;
    }

    @Override
    public final byte BL0() {
        return 45;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        switch (this.qi0) {
            case 2:
                second.Yo = false;
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(583, second), new String[]{second.A60()}), "", null);
                return;
            case 1:
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(580, first), new String[]{first.A60()}), "", null);
                return;
            case 0:
            default:
                second.Yo = true;
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(577, second), new String[]{second.A60()}), "", null);
                return;
        }
    }
}
