package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction126Packet extends Nt implements eb0_0 {
   @Override
   public final byte BL0() {
      return 126;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      if (var2 != null && !var2.zi0.hf0()) {
         lpt6__2 var9 = lpt6__2.Q80;
         byte var11 = 14;
         int var12 = var7.yd0.QX(195, var2);
         String[] var13;
         String[] var10001 = var13 = new String[1];
         byte var14 = 0;
         var10001[var14] = var2.A60();
         var7.wJ(sm0_0.fg0((byte)2, var9, var11, var12, var13), "", null);
         Oz0 var10;
         Oz0 var10000 = var10 = tw0_0.LD0.he0;
         var2.Ah();
         if (var10000 != null) {
            var10.N10.Hi(var2).XO();
         }
      }
   }
}
