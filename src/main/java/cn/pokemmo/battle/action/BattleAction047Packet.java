package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction047Packet extends Nt implements eb0_0 {
    public final short RE0;

    public BattleAction047Packet(short var1) {
        this.RE0 = var1;
    }

    public final byte BL0() {
        return 47;
    }

    public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
        if (this.RE0 != -1) {
            var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, var7.yd0.QX(559, var2), new String[]{var2.A60()}), "", null);
            var2.zr0 = this.RE0;
        } else {
            var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, var7.yd0.QX(562, var2), new String[]{var2.A60()}), "", null);
            if (var2.zr0 > 0) {
                var2.zr0 = -1;
            }
        }
    }
}
