package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.text.NumberFormat;

public class BattleTargetSelectModifier extends TC0 {
   public final byte is0;
   public final SZ[] nn;
   public final SZ[] ww;
   public final int cl;
   public final int Oh;
   public final SZ[] eK;

   public BattleTargetSelectModifier(byte var1, SZ[] var2, SZ[] var3, int var4, int var5, SZ[] var6) {
      this.is0 = var1;
      this.nn = var2;
      this.ww = var3;
      this.cl = var4;
      this.Oh = var5;
      this.eK = var6;
   }

   public final void QC(ML0 var1) {
      a10_0 var2 = var1.yd0;
      byte var3 = var1.yd0.Ez0();
      byte var4 = this.is0;
      byte var5 = (byte)(this.is0 == 0 ? 1 : 0);
      O8 var15;
      O8 var10000 = var15 = var2.mn(var4);
      O8 var6 = var2.mn((byte)var5);
      if (var10000 != null) {
         String var7 = var15.M2();
         var15.ho0();
         boolean var8 = false;
         if (!var2.m40 || var5 == var3) {
            SZ[] var20 = this.nn;
            var8 = var6.pq(var1, false, var7, var20, this.cl);
         }

         if (!var2.m40 || this.is0 == var3) {
            SZ[] var16 = this.ww;
            var8 |= var15.pq(var1, true, var7, var16, this.cl);
         }

         if (var8 || this.Oh > 0) {
            var4 = this.is0;
            if (this.is0 == var3 && (var2.a40 || var4 == var3)) {
               bu_0 var24 = tw0_0.RE0;
               byte var11 = var6.Mo();
               var24.Eh(var11, var6.cd(), true, false);
            }
         }

         if (this.Oh > 0) {
            lpt6__2 var25 = lpt6__2.Q80;
            byte var12 = 15;
            var4 = 59;
            String[] var22;
            String[] var10002 = var22 = new String[2];
            var10002[0] = var7;
            var10002[1] = NumberFormat.getInstance().format(this.Oh);
            var1.wJ(sm0_0.fg0((byte)2, var25, var12, var4, var22), "", null);
         }

         if (this.is0 == var3) {
            SZ[] var9;
            int var13 = (var9 = this.eK).length;

            for (int var14 = 0; var14 < var13; var14++) {
               SZ var19;
               if ((var19 = var9[var14]) != null) {
                  var1.Yn0(var19);
               }
            }
         }

         DM var10 = new DM();
         var1.lZ.add(var10);
      }
   }
}
