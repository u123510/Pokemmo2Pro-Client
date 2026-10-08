package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction125Packet extends Nt implements eb0_0 {
   @Override
   public final byte BL0() {
      return 125;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      var7.wJ(sm0_0.Bw((byte)2, lpt6__2.Q80, 15, 101, sm0_0.zb0), "", null);
      if (tw0_0.PK0 != null) {
         Oz0 var9 = tw0_0.LD0.he0;

         for (byte var10 = 0; var10 < (byte)tw0_0.PK0.wI0.length; var10++) {
            PF[] var11 = tw0_0.PK0.wI0[var10];
            int var12 = var11.length;

            for (int var13 = 0; var13 < var12; var13++) {
               PF var14 = var11[var13];
               if (var14 != null && !var14.zi0.hf0()) {
                  var14.Ah();
                  if (var9 != null) {
                     var9.N10.Hi(var14).XO();
                  }
               }
            }
         }
      }
   }
}
