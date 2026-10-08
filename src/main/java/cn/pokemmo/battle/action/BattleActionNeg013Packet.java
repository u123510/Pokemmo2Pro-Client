package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg013Packet extends Nt implements eb0_0 {
   public final short jB;

   public BattleActionNeg013Packet(short var1) {
      this.jB = var1;
   }

   public final byte BL0() {
      return -13;
   }

   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      mc0_1 var10 = gu0.l2.lPT6(this.jB);
      PF var11;
      if (tw0_0.PK0 != null && tw0_0.LD0.he0 != null && (var11 = tw0_0.PK0.nd0(var2.Zo0())) != null) {
         var11.bv0(this.jB);
         tw0_0.LD0.he0.N10.Hi(var11).Ny();
      }

      String[] var10002 = new String[2];
      byte var9 = 0;
      var10002[var9] = var2.nz0(true);
      var10002[1] = sm0_0.c0(var10.Nl);
      var7.wJ(sm0_0.Bx(6062, var10002), "", (Runnable)null);
   }
}
