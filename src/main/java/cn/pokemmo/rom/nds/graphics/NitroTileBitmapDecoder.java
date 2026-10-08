package cn.pokemmo.rom.nds.graphics;

import f.XG0;
import f.i4_0;
import f.i8_0;
import f.ix0_0;
import f.kd_2;
import f.si0_0;
import f.tx_1;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class NitroTileBitmapDecoder {
   public final byte[] rH0;
   public final XG0 Sc0;
   public final int mg;

   public NitroTileBitmapDecoder(int var1, int var2, int var3, XG0 var4, ByteBuffer var5) {
      this.mg = var2;
      if (var4 == XG0.hi0) {
         ((Buffer)var5).position(var1);
         if (tx_1.T30(var5, kd_2.Gu0) > 0) {
            this.rH0 = tx_1.Gi(var1, var5);
         } else {
            byte[] var6;
            this.rH0 = var6 = new byte[var2 * var3 * 32];
            var5.get(var6);
         }
      } else {
         if (var4 != XG0.fP) {
            throw new RuntimeException("uhhh");
         }

         ((Buffer)var5).position(var1);
         if (tx_1.T30(var5, kd_2.Gu0) > 0) {
            this.rH0 = tx_1.Gi(var1, var5);
         } else {
            byte[] var7;
            this.rH0 = var7 = new byte[var2 * var3 * 64];
            var5.get(var7);
         }
      }

      this.Sc0 = var4;
   }

   public final i4_0 MO(i8_0 var1) {
      i4_0 var2;
      if (this.Sc0 == XG0.hi0) {
         int var3 = this.mg;
         i4_0 var10000 = var2 = new i4_0(this.mg * 8, this.rH0.length / 2 / var3 * 8 / 16, ix0_0.Vw);
         var3 = 0;
         int var4 = 0;
         int var5 = 0;

         while (true) {
            byte[] var6 = this.rH0;
            if (var5 >= this.rH0.length) {
               break;
            }

            int var7;
            byte var17;
            int var29 = var7 = (var17 = var6[var5]) & 15;
            int var18 = var17 >> 4 & 15;
            if (var29 > 0) {
               var7 = var1.ax[var7];
               var2.XF.XS(var3, var4, var7);
            }

            if (var18 > 0) {
               var7 = var3 + 1;
               int var19 = var1.ax[var18];
               var2.XF.XS(var7, var4, var19);
            }

            int var20;
            if ((var20 = var3 + 2) % 8 == 0) {
               if ((var7 = var4 + 1) % 8 == 0) {
                  var7 = var4 + -7;
               } else {
                  var20 = var3 + -6;
               }

               if (var20 == this.mg * 8) {
                  var3 = var7 + 8;
                  byte var13 = 0;
                  var4 = var3;
                  var3 = var13;
               } else {
                  var4 = var7;
                  var3 = var20;
               }
            } else {
               var3 = var20;
            }

            var5++;
         }
      } else {
         int var10 = this.mg;
         i4_0 var31 = var2 = new i4_0(this.mg * 8, this.rH0.length / 4 / var10 * 8 / 16, ix0_0.Vw);
         var10 = 0;
         int var14 = 0;
         int var16 = 0;

         while (true) {
            byte[] var21 = this.rH0;
            if (var16 >= this.rH0.length) {
               break;
            }

            int var22 = var21[var16] & 255;
            int var23 = var1.ax[var22];
            var2.XF.XS(var10, var14, var23);
            int var24;
            if ((var24 = var10 + 1) % 8 == 0) {
               int var28;
               if ((var28 = var14 + 1) % 8 == 0) {
                  var28 = var14 + -7;
               } else {
                  var24 = var10 + -7;
               }

               if (var24 == this.mg * 8) {
                  var10 = var28 + 8;
                  byte var15 = 0;
                  var14 = var10;
                  var10 = var15;
               } else {
                  var14 = var28;
                  var10 = var24;
               }
            } else {
               var10 = var24;
            }

            var16++;
         }
      }

      return var2;
   }

   public final void xx0(i4_0 var1, int var2, int var3, int var4, i8_0 var5, int var6, boolean var7, boolean var8) {
      int var9 = 64;
      int var10;
      if (this.Sc0 == XG0.hi0) {
         var10 = 2;
      } else {
         var10 = 1;
      }

      int var17 = var9 / var10;
      var9 = 0;
      var10 = 0;
      int var11 = var4 * var17;

      for (int var12 = var11; var12 < var11 + var17; var12++) {
         byte[] var13 = this.rH0;
         if (var12 >= this.rH0.length) {
            break;
         }

         if (this.Sc0 == XG0.hi0) {
            int var14;
            byte var22;
            int var40 = var14 = (var22 = var13[var12]) & 15;
            int var23 = var22 >> 4 & 15;
            if (var40 > 0) {
               int var15;
               if (var7) {
                  var15 = 7 - var9;
               } else {
                  var15 = var9;
               }

               var15 = var2 + var15;
               int var16;
               if (var8) {
                  var16 = 7 - var10;
               } else {
                  var16 = var10;
               }

               int var26 = var3 + var16;
               var16 = var14 + var6;
               var16 = var5.ax[var16];
               var1.XF.XS(var15, var26, var16);
            }

            if (var23 > 0) {
               if (var7) {
                  var14 = 7 - (var9 + 1);
               } else {
                  var14 = var9 + 1;
               }

               var14 = var2 + var14;
               int var32;
               if (var8) {
                  var32 = 7 - var10;
               } else {
                  var32 = var10;
               }

               int var24 = var3 + var32;
               var32 = var23 + var6;
               var32 = var5.ax[var32];
               var1.XF.XS(var14, var24, var32);
            }

            var9 += 2;
         } else {
            int var29;
            if (var7) {
               var29 = 7 - var9;
            } else {
               var29 = var9;
            }

            var29 = var2 + var29;
            int var35;
            if (var8) {
               var35 = 7 - var10;
            } else {
               var35 = var10;
            }

            int var25 = var3 + var35;
            var35 = (var13[var12] & 255) + var6;
            var35 = var5.ax[var35];
            var1.XF.XS(var29, var25, var35);
            var9++;
         }

         if (var9 == 8) {
            var9 = var10 + 1;
            byte var21 = 0;
            var10 = (byte)var9;
            var9 = var21;
         }
      }
   }

   public final i4_0 SQ(int var1, i8_0 var2) {
      if (this.Sc0 == XG0.hi0) {
         boolean var10 = false;
         i4_0 var12;
         ix0_0 var13 = ix0_0.Vw;
         i4_0 var26 = var12 = new i4_0(8, 8, var13);

         for (int var14 = 0; var14 < 8; var14++) {
            for (int var17 = 0; var17 < 4; var17++) {
               int var18;
               int var27 = var18 = si0_0.Fz(var14, 4, var1 * 32, var17);
               byte[] var8 = this.rH0;
               int var19;
               if (var27 >= this.rH0.length) {
                  var19 = 0;
               } else {
                  var19 = var8[var18];
               }

               int var22;
               int var28 = var22 = var19 & 15;
               var19 = var19 >> 4 & 15;
               if (var28 > 0) {
                  var10 = true;
                  int var9 = var17 * 2;
                  int var23 = var2.ax[var22];
                  var12.XF.XS(var9, var14, var23);
               }

               if (var19 > 0) {
                  var10 = true;
                  int var24 = var17 * 2 + 1;
               var19 = var2.ax[var19];
                  var12.XF.XS(var24, var14, var19);
               }
            }
         }

         if (!var10) {
            var12.dispose();
            var12 = null;
         }

         return var12;
      } else {
         i4_0 var3;
         ix0_0 var4 = ix0_0.Vw;
         i4_0 var10000 = var3 = new i4_0(8, 8, var4);

         for (int var11 = 0; var11 < 8; var11++) {
            for (int var5 = 0; var5 < 8; var5++) {
               int var6;
               int var25 = var6 = si0_0.Fz(var11, 8, var1 * 64, var5);
               byte[] var7 = this.rH0;
               var6 = (var25 >= this.rH0.length ? 0 : var7[var6]) & 255;
               var6 = var2.ax[var6];
               var3.XF.XS(var5, var11, var6);
            }
         }

         return var3;
      }
   }
}

