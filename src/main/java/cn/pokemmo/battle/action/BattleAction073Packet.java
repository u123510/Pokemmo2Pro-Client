package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction073Packet extends Nt implements eb0_0 {
    public final short Ia0;

    public BattleAction073Packet(short var1) {
        this.Ia0 = var1;
    }

    @Override
    public final byte BL0() {
        return 73;
    }

    @Override
    public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
        if (var2 != null) {
            if (this.Ia0 == 193 || this.Ia0 == 316) {
                var2.fl0 = true;
            } else if (this.Ia0 == 357) {
                var2.f50 = true;
            }

            var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, var7.yd0.QX(369, var2), new String[]{var2.A60()}), "", null);
        }
    }
}
