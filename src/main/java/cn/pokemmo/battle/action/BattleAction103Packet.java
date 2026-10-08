package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction103Packet extends Nt implements eb0_0 {
   public final byte MD;

   public BattleAction103Packet(byte var1) {
      this.MD = var1;
   }

   @Override
   public final byte BL0() {
      return 103;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      String var10 = sm0_0.c0(tw0_0.PK0.eI() == this.MD ? 200509 : 200508);
      Runnable var9 = () -> this.NI0(var7, var2);
      var7.wJ(var10, "", var9);
   }

   public final void NI0(ML0 var1, PF var2) {
      Oz0 var5 = tw0_0.LD0.he0;
      a10_0 var6 = var1.yd0;
      PF[] var7;
      int var3 = (var7 = var6.wI0[this.MD]).length;

      for (int var4 = 0; var4 < var3; var4++) {
         if (var7[var4] != null && var5 != null) {
            var5.N10.Hi(var2).XO();
         }
      }
   }
}
