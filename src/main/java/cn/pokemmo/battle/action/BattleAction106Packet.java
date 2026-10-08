package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction106Packet extends Nt implements eb0_0 {
    public final byte HJ;
    public final byte[] qF0;

    public BattleAction106Packet(byte var1, byte[] var2) {
        this.HJ = var1;
        this.qF0 = var2;
    }

    public final byte BL0() {
        return 106;
    }

    public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
        a10_0 var9 = var7.yd0;
        PF[] var10 = var9.wI0[this.HJ];
        PF[] var11 = new PF[var10.length];
        for (int var12 = 0; var12 < var10.length; ++var12) {
            PF var13 = var10[this.qF0[var12]];
            if (var13 != null) {
                var13.Kj0 = (byte)var12;
            }
            var11[var12] = var13;
        }

        PF[][] var14 = var9.wI0;
        if (var14 != null) {
            var14[this.HJ] = var11;
        }
        var7.lZ.add(new q0_0((vq_0) this, var7, var11));
    }

    public final boolean Hm() {
        return false;
    }
}
