package cn.pokemmo.rom.nds.graphics;

import f.Ae;
import f.LPT4_;
import f.Rz0;
import f.ft_1;
import f.j50_0;
import f.jf0_1;
import f.zd_0;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class NitroPaletteResource extends zd_0 {
   public final int Sn;
   public final Ae ao0;
   public Rz0 Zc0;
   public final jf0_1 SW = new jf0_1();
   public final j50_0 NP = new j50_0();

   public NitroPaletteResource(Ae var1) {
      this.ao0 = var1;
      this.Sn = var1.Vh0;
      this.Of();
   }

   public final void Of() {
      ByteBuffer var1;
      ByteBuffer var10000 = var1 = this.ao0.MH(false);
      int var2 = var10000.position();
      Rz0 var3 = new Rz0(var1);
      this.Zc0 = var3;
      var3.Kn(1313033298);
      byte[] var17 = new byte[4];
      this.SW.getClass();
      var10000.get(var17);
      this.SW.MA0 = var1.getInt();
      jf0_1 var18 = this.SW;
      int var4 = var10000.getShort();
      ft_1[] var5 = ft_1.hM;
      int var6 = ft_1.hM.length;
      int var7 = 0;

      ft_1 var8;
      while (true) {
         if (var7 >= var6) {
            var8 = null;
            break;
         }

         if ((var8 = var5[var7]).oJ0 == var4) {
            break;
         }

         var7++;
      }

      var18.ry = var8;
      jf0_1 var44 = this.SW;
      var1.getShort();
      var44.getClass();
      jf0_1 var45 = this.SW;
      var1.getInt();
      var45.getClass();
      this.SW.yb = var1.getInt();
      jf0_1 var19 = this.SW;
      var4 = this.SW.yb;
      if (this.SW.yb == 0 || var4 > var19.MA0) {
         var19.yb = var19.MA0 - 24;
      }

      int var20 = var1.getInt();
      jf0_1 var24 = this.SW;
      short var29;
      if (this.SW.ry == ft_1.LPT2) {
         var29 = 16;
      } else {
         var29 = 256;
      }

      var24.ee0 = var29;
      var6 = var24.yb;
      if ((var7 = var24.yb / 2) < var29) {
         var24.ee0 = var7;
      }

      var24.Gx0 = new LPT4_[var6 / (var24.ee0 * 2)][];
      ((Buffer)var1).position(var2 + 24 + var20);
      int var21 = 0;

      while (true) {
         jf0_1 var25 = this.SW;
         LPT4_[][] var30 = this.SW.Gx0;
         if (var21 >= this.SW.Gx0.length) {
            if (this.Zc0.rv0 != 1 && var1.position() - var2 < this.Sn) {
               byte[] var14 = new byte[4];
               this.NP.getClass();
               var1.get(var14);
               j50_0 var49 = this.NP;
               var1.getInt();
               var49.getClass();
               j50_0 var50 = this.NP;
               var1.getShort();
               var50.getClass();
               j50_0 var51 = this.NP;
               var1.getShort();
               var51.getClass();
               j50_0 var52 = this.NP;
               var1.getInt();
               var52.getClass();
               this.NP.qN = var1.getShort();
               short var12 = this.NP.qN;
               LPT4_[][] var15;
               LPT4_[][] var53 = var15 = this.SW.Gx0;
               LPT4_[][] var13 = new LPT4_[var12 + var15.length][];
               int var22 = 0;
               var4 = var53.length;

               for (int var31 = 0; var31 < var4; var31++) {
                  var13[this.NP.qN + var22++] = var15[var31];
               }

               for (int var16 = 0; var16 < this.NP.qN; var16++) {
                  var13[var16] = this.SW.Gx0[0];
               }

               this.SW.Gx0 = var13;
               super.dc0 = var13;
               return;
            }

            super.dc0 = this.SW.Gx0;
            return;
         }

         short var26;
         if (var25.ry == ft_1.LPT2) {
            var26 = 16;
         } else {
            var26 = 256;
         }

         LPT4_[] var27 = new LPT4_[var26];
         var6 = Math.min(var26, var1.remaining() / 2);

         for (int var35 = 0; var35 < var6; var35++) {
            int var47 = var1.getShort() & '\uffff';
            int var36 = var47 / 1024;
            int var48 = var47 - var36 * 1024;
            int var9 = var48 / 32;
            int var10 = var48 - var9 * 32;
            if (var10 > 31) {
               var10 = 31;
            }

            if (var9 > 31) {
               var9 = 31;
            }

            if (var36 > 31) {
               var36 = 31;
            }

            int var37 = var10 * 8;
            int var38 = var9 * 8;
            int var43 = var36 * 8;
            LPT4_ var11 = new LPT4_(var37, var38, var43, var35 == 0 ? 0 : 255);
            var27[var35] = var11;
         }

         var30[var21] = var27;
         var21++;
      }
   }
}

