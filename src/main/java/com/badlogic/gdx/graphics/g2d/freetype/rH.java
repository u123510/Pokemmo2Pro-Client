package com.badlogic.gdx.graphics.g2d.freetype;

import f.LJ0;
import f.LPT6_;
import f.eb0_1;
import f.es_1;
import f.fy0_0;
import f.hz_1;
import f.mh0_0;
import f.pm_0;
import f.th_1;

public class rH extends mh0_0 implements fy0_0 {
   public es_1 I4;
   public az0 E0;
   public pm_0 AS;
   public FreeType.Stroker yO;
   public LJ0 ko0;
   public es_1 r8;
   public boolean KP;

   public th_1 jm0(char var1) {
      th_1 var2;
      az0 var3;
      if ((var2 = super.jm0(var1)) == null && (var3 = this.E0) != null) {
         var3.ho0(this.AS.ru);
         float var10 = ((super.AZ ? -super.sB0 : super.sB0) + super.g4) / super.eL;
         FreeType.Stroker var11 = this.yO;
         LJ0 var4 = this.ko0;
         if ((var2 = this.E0.dY(var1, this, this.AS, var11, var10, var4)) == null) {
            return super.Rx;
         }

         LPT6_ var12 = (LPT6_)this.I4.get(var2.qc0);
         ((mh0_0)this).Zv(var2, var12);
         ((mh0_0)this).eU(var1, var2);
         this.r8.Ue0(var2);
         this.KP = true;
         FreeType.Face var13 = this.E0.s3;
         if (this.AS.ot) {
            int var14 = var13.kf0(var1);
            int var5 = 0;

            for(int var6 = this.r8.KB; var5 < var6; ++var5) {
               th_1 var7;
               int var8;
               int var9;
               if ((var9 = var13.lI0(var14, var8 = var13.kf0((var7 = (th_1)this.r8.get(var5)).cJ0))) != 0) {
                  int var16 = var7.cJ0;
                  var2.zA(var16, FreeType.gA0(var9));
               }

               if ((var8 = var13.lI0(var8, var14)) != 0) {
                  var7.zA(var1, FreeType.gA0(var8));
               }
            }
         }
      }

      return var2;
   }

   public final void tc0(hz_1 var1, CharSequence var2, int var3, int var4, th_1 var5) {
      LJ0 var6;
      if ((var6 = this.ko0) != null) {
         var6.WJ = true;
      }

      super.tc0(var1, var2, var3, var4, var5);
      if (this.KP) {
         this.KP = false;
         LJ0 var10000 = this.ko0;
         rH var10001 = this;
         es_1 var7 = this.I4;
         pm_0 var10002 = var10001.AS;
         es_1 var9 = var7;
         eb0_1 var8 = var10002.OY;
         var10000.Kr0(var9, var8, var10002.LN);
      }

   }

   public final void dispose() {
      FreeType.Stroker var1;
      if ((var1 = this.yO) != null) {
         var1.dispose();
      }

      LJ0 var2;
      if ((var2 = this.ko0) != null) {
         var2.dispose();
      }

   }
}
