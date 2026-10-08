package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction121Packet extends Nt implements eb0_0 {
   public final short Kh0;

   public BattleAction121Packet(short var1) {
      this.Kh0 = var1;
   }

   @Override
   public final byte BL0() {
      return 121;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      short var9;
      ML0 var10000;
      String var10001;
      if ((var9 = this.Kh0) != 215) {
         if (var9 != 1048) {
            var10000 = var7;
            byte var10 = 15;
            byte var12 = 112;
            String[] var14 = sm0_0.zb0;
            var10001 = sm0_0.Bw((byte)2, lpt6__2.Q80, var10, var12, var14);
         } else {
            var10000 = var7;
            var10001 = sm0_0.c0(200410);
         }
      } else {
         var10000 = var7;
         byte var11 = 15;
         byte var13 = 111;
         String[] var15 = sm0_0.zb0;
         var10001 = sm0_0.Bw((byte)2, lpt6__2.Q80, var11, var13, var15);
      }

      var10000.wJ(var10001, "", null);
   }
}
