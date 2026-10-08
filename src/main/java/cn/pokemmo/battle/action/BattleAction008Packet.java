package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction008Packet extends Nt implements eb0_0 {
    public final boolean Yl0;

    public BattleAction008Packet(boolean enabled) {
        this.Yl0 = enabled;
    }

    public final byte BL0() {
        return 8;
    }

    public final void IE0(PF source, PF target, boolean first, boolean second, short value,
                          boolean third, ML0 battle, qn_1 context) {
        if (!this.Yl0) {
            lpt6__2 messageType = lpt6__2.Q80;
            int messageId = battle.yd0.QX(276, target);
            String[] args = {target.A60()};
            battle.I1(sm0_0.fg0((byte)2, messageType, 14, messageId, args), "", null);
            battle.lZ.add(new kw_0((byte)0, new Xn0(target).vv(source)));
        }
    }
}
