package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction062Packet extends Nt implements eb0_0 {
   public final i40_0 O3;
   public final i40_0 XQ;
   public final short UB;

   public BattleAction062Packet(i40_0 var1, i40_0 var2, short var3) {
      this.O3 = var1;
      this.XQ = var2;
      this.UB = var3;
   }

   @Override
   public final byte BL0() {
      return 62;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      if (var2 == null) {
         return;
      }

      short var9 = this.UB;
      if (var9 < 0) {
         short var10 = (short)(var9 * -1);
         if (var10 != 161) {
            i40_0 var11 = var10 == 521 ? this.XQ : this.O3;
            String[] var12 = new String[]{var2.A60(), var11.BT()};
            int var13 = var7.yd0.QX(896, var2);
            var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, var13, var12), "", null);
         }
      } else if (var9 != 513) {
         String[] var14 = new String[]{var2.A60(), this.O3.BT()};
         int var15 = var7.yd0.QX(896, var2);
         var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, var15, var14), "", null);
      } else {
         String[] var16 = new String[2];
         var16[0] = var1 == null ? "" : var1.A60();
         var16[1] = var2.A60();
         int var17 = var7.yd0.eH0(1089, var1, var2);
         var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, var17, var16), "", null);
      }

      var2.gp = this.O3;
      var2.Qj = this.XQ;
      var7.Hi(var2).XO();
   }
}
