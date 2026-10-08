package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction005Packet extends Nt implements eb0_0 {
    public final boolean Gz0;

    public BattleAction005Packet(boolean value) {
        super();
        this.Gz0 = value;
    }

    @Override
    public final byte BL0() {
        return 5;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean b1, boolean b2, short s, boolean b3, ML0 menu, qn_1 ignored) {
        if (this.Gz0) {
            int index = menu.yd0.QX(288, pF2);
            String label = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, index, new String[]{pF2.A60()});
            menu.I1(label, "", null);
            menu.lZ.add(new kw_0((byte) 0, new oa_1(pF).vv(pF2)));
        } else {
            int index = menu.yd0.QX(294, pF2);
            String label = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, index, new String[]{pF2.A60()});
            menu.wJ(label, "", null);
            menu.lZ.add(new fk_0(menu, pF2, (byte) 0));
        }
    }
}
