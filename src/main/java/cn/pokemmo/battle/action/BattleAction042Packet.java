package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction042Packet extends Nt implements eb0_0 {
    public final short Hw;


    public BattleAction042Packet(short var1) {
        this.Hw = var1;
    }

    @Override
    public final byte BL0() {
        return 42;
    }


    @Override
    public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
        int var9 = (this.Hw == 353 || this.Hw == 3353) ? 1077 : 1074;
        var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, var7.yd0.QX(var9, var1), new String[]{var1.A60()}), "", null);
    }
}
