package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction078Packet extends Nt implements eb0_0 {
    public final byte aA;


    public BattleAction078Packet(byte var1) {
        this.aA = var1;
    }

    @Override
    public final byte BL0() {
        return 78;
    }


    @Override
    public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
        var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, var7.yd0.QX(721, var2), new String[]{var2.A60(), fp0_0.uD(new StringBuilder(), this.aA, "")}), "", null);
    }
}
