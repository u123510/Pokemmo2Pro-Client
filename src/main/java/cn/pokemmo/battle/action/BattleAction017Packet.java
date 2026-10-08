package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BattleAction017Packet extends Nt implements eb0_0 {
   public final byte ow;
   public final gc_2[] rs;
   public final byte ZW;
   public final byte[][] Cu;

   public BattleAction017Packet(byte var1, gc_2[] var2, byte var3, byte[][] var4) {
      if (!S.ZT(null, var2)) {
         if (var2.length >= 1 && var4.length >= 1) {
            for (byte[] var7 : var4) {
               if (var2.length != var7.length) {
                  throw new RuntimeException();
               }
            }

            this.ow = var1;
            this.rs = var2;
            this.ZW = var3;
            this.Cu = var4;
         } else {
            throw new RuntimeException();
         }
      } else {
         throw null;
      }
   }

   @Override
   public final byte BL0() {
      return 17;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      if (this.ZW != 0) {
         a10_0 var9 = var7.yd0;
         PF[] var10;
         if ((var10 = Arrays.stream(var9.wI0[this.ow]).filter(Objects::nonNull).toArray(PF[]::new)).length >= 1) {
            if (this.Cu.length == gc_2.mi.length) {
               byte var14 = this.ZW;
               String var15 = sm0_0.c0(
                  this.ZW > 0
                     ? (var14 != 1 ? (var14 != 2 ? var7.yd0.Vs0(this.ow, 200549) : var7.yd0.Vs0(this.ow, 200547)) : var7.yd0.Vs0(this.ow, 200545))
                     : (var14 != -2 ? (var14 != -1 ? var7.yd0.Vs0(this.ow, 200555) : var7.yd0.Vs0(this.ow, 200551)) : var7.yd0.Vs0(this.ow, 200553))
               );
               this.zE0(var7, var10, var15);
            } else {
               gc_2[] var11 = this.rs;
               String var12;
               if (this.rs.length > 1) {
                  var12 = sm0_0.Bx(var11.length - -200456, Arrays.stream(var11).map(gc_2::toString).toArray(String[]::new));
               } else {
                  var12 = var11[0].toString();
               }

               byte var16 = this.ZW;
               String var13;
               if (this.ZW > 0) {
                  if (var16 != 1) {
                     if (var16 != 2) {
                        var13 = sm0_0.wa0(var7.yd0.Vs0(this.ow, 200537), var12);
                     } else {
                        var13 = sm0_0.wa0(var7.yd0.Vs0(this.ow, 200535), var12);
                     }
                  } else {
                     var13 = sm0_0.wa0(var7.yd0.Vs0(this.ow, 200533), var12);
                  }
               } else if (var16 != -2) {
                  if (var16 != -1) {
                     var13 = sm0_0.wa0(var7.yd0.Vs0(this.ow, 200543), var12);
                  } else {
                     var13 = sm0_0.wa0(var7.yd0.Vs0(this.ow, 200539), var12);
                  }
               } else {
                  var13 = sm0_0.wa0(var7.yd0.Vs0(this.ow, 200541), var12);
               }

               this.zE0(var7, var10, var13);
            }
         }
      }
   }

   public final void zE0(ML0 var1, PF[] var2, String var3) {
      ArrayList var4;
      var4 = new ArrayList();
      ArrayList var5;
      var5 = new ArrayList();
      int var6 = var2.length;

      for (int var7 = 0; var7 < var6; var7++) {
         PF var8;
         if ((var8 = var2[var7]) != null && !var8.zi0.hf0()) {
            for (int var9 = 0; var9 < this.rs.length; var9++) {
               byte var10;
               if ((var10 = this.Cu[var8.Kj0][var9]) != 0) {
                  if (var10 > 0) {
                     var4.add(var8);
                  } else {
                     var5.add(var8);
                  }

                  var8.yK0(this.rs[var9], this.Cu[var8.Kj0][var9]);
               }
            }
         }
      }

      Runnable var11 = () -> this.gf(var1, var4, var5, var2);
      var1.I1(var3, "", var11);
   }

   public final void gf(ML0 var1, List var2, List var3, PF[] var4) {
      byte var5 = 0;
      bs_1 var6;
      kw_0 var8;
      boolean var7;
      if (this.ow == var1.yd0.Ez0()) {
         var7 = true;
      } else {
         var7 = false;
      }

      var6 = new bs_1(var7, var2, var3);
      var8 = new kw_0(var5, var6);
      var1.lZ.add(var8);
      int var9 = var4.length;

      for (int var10 = 0; var10 < var9; var10++) {
         var1.Hi(var4[var10]).XO();
      }
   }
}
