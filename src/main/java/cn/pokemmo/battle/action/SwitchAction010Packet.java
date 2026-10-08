package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchAction010Packet extends Nt implements eb0_0 {
    public final byte ZD0;

    public SwitchAction010Packet(byte value) {
        this.ZD0 = value;
    }

    @Override
    public final byte BL0() { return 10; }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        lpt6__2 format = lpt6__2.Q80;
        String targetName = second.A60();
        switch (this.ZD0) {
            case 0:
                battle.wJ(sm0_0.fg0((byte)2, format, 14, battle.yd0.QX(345, second),
                        new String[]{targetName}), "", null);
                return;
            case 1:
                battle.I1("", "", null);
                battle.lZ.add(new kw_0((byte)0, new wt0_0(first).vv(second)));
                return;
            case 2:
                battle.I1(sm0_0.fg0((byte)2, format, 14, battle.yd0.QX(348, second),
                        new String[]{targetName}), "", null);
                battle.lZ.add(new kw_0((byte)0, new wt0_0(first).vv(second)));
                battle.wJ(sm0_0.fg0((byte)2, format, 15, 80, new String[0]), "", null);
                battle.lZ.add(new kw_0((byte)1, new jr_2(first).vv(second)));
                return;
            case 3:
                battle.wJ(sm0_0.fg0((byte)2, format, 14, battle.yd0.QX(351, second),
                        new String[]{targetName}), "", null);
                return;
            case 4:
                battle.wJ(sm0_0.fg0((byte)2, format, 14, battle.yd0.QX(354, second),
                        new String[]{targetName}), "", null);
                return;
            default:
                return;
        }
    }
}
