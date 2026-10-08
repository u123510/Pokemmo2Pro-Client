package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg012Packet extends Nt implements eb0_0 {
   public final short c60;

   public BattleActionNeg012Packet(short var1) {
      this.c60 = var1;
   }

   public final byte BL0() {
      return -12;
   }

   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      BattleActionNeg012Packet var10003 = this;
      mc0_1 var9 = gu0.l2.lPT6(this.c60);
      var2.bv0(var10003.c60);
      int var10001 = var7.yd0.QX(200371, var2);
      String[] var10002 = new String[2];
      byte var10 = 0;
      var10002[var10] = var2.nz0(true);
      var10002[1] = sm0_0.c0(var9.Nl);
      var7.wJ(sm0_0.Bx(var10001, var10002), "", (Runnable)null);
   }
}
