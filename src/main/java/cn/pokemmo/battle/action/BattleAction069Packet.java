package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction069Packet extends Nt implements eb0_0 {
    public final byte rj;
    public final short vH;
    public final byte Zd;

    public BattleAction069Packet(byte var1, byte var2, short var3) {
        this.rj = var1;
        this.vH = var3;
        this.Zd = var2;
    }

    @Override
    public final byte BL0() {
        return 69;
    }


    @Override
    public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
        var1.X70(this.rj, this.Zd, this.vH);
        var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, var7.yd0.QX(688, var1), new String[]{var1.A60(), sm0_0.c0(this.vH + 110000)}), "", null);
    }
}
