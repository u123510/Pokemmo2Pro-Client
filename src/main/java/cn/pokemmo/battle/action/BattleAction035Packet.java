package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction035Packet extends Nt implements eb0_0 {
    public final boolean zD0;

    public BattleAction035Packet(boolean mobile) {
        this.zD0 = mobile;
    }

    @Override
    public final byte BL0() {
        return 35;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2, short value,
                          boolean flag3, ML0 context, qn_1 options) {
        if (this.zD0) {
            int textId = context.yd0.QX(568, second);
            String message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, textId,
                    new String[]{second.A60()});
            context.wJ(message, "", null);
        }
        if (!this.zD0) {
            int textId = context.yd0.QX(574, second);
            String message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, textId,
                    new String[]{second.A60()});
            context.wJ(message, "", null);
        }
        second.cf0 = this.zD0;
    }
}
