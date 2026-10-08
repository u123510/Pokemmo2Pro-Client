package cn.pokemmo.ui.widget.dialog;

import f.*;

public class SessionConfirmDialog extends jw_0 {
   public final zv0_0 SZ;
   public final String XC;
   public final int Ig0;
   public final int Ge0;
   public ft0_0 Cs0;

   public SessionConfirmDialog(ay_0 var1, zv0_0 var2, String var3, int var4, int var5, boolean var6) {
      super(var1);
      Y30 var7 = var2.GS;
      this.SZ = var2;
      this.XC = var3;
      this.Ig0 = var4;
      this.Ge0 = var5;
      if (var6) {
         ft0_0 var8 = this.Cs0;
         if (this.Cs0 == null) {
            this.Cs0 = ((zb0_2)var7).getFont().dq();
         } else {
            var8.xT();
         }

         ft0_0 var9 = this.Cs0;
         lpt3__5 var10;
         super.J = (int)(var10 = ((zb0_2)var7).cacheText(var9, var3, var4, var5)).PRN;
         super.Nm0 = (int)var10.gv0;
      } else {
         super.Nm0 = ((zb0_2)var7).getLineHeight();
      }

      if (this.Cs0 == null) {
         super.J = ((zb0_2)var7).computeTextWidth(var3, var4, var5);
      }
   }

   @Override
   public final void dr(Hq0 var1) {
      zv0_0 var2 = this.SZ;
      gn_0 var6;
      if (super.lo) {
         var6 = var2.sm0;
      } else {
         var6 = var2.TQ;
      }

      if (var6 != null) {
         pc0_1 var10003 = var1.eH0;
         float var4 = var6.HH();
         float var5 = var6.W1();
         float var7 = var6.eD0();
         float var3 = var6.bh();
         ((qq_0)var10003).g50 = ((qq_0)var10003).g50.j60(var4, var5, var7, var3);
         this.ky(var1);
         ((qq_0)var1.eH0).kY();
      } else {
         this.ky(var1);
      }
   }

   @Override
   public final void final$() {
      ft0_0 var1 = this.Cs0;
      if (this.Cs0 != null) {
         var1.xT();
         this.Cs0 = null;
      }
   }

   public final void ky(Hq0 var1) {
      KG0 var2;
      if (super.lo) {
         var2 = var1.jb;
      } else {
         var2 = var1.Ha0;
      }

      ft0_0 var3 = this.Cs0;
      if (this.Cs0 != null) {
         int var5 = super.rs0 + var1.ZB;
         int var7 = super.D10 + var1.B60;
         zb0_2 var4;
         zb0_2 var15 = var4 = (zb0_2)this.SZ.GS;
         int var8 = var7 - var4.getBaseLine();
         var15.drawFromCache(var3, var2, var5, var8);
      } else {
         int var12 = super.rs0 + var1.ZB;
         int var9 = super.D10 + var1.B60;
         zb0_2 var13;
         zb0_2 var16 = var13 = (zb0_2)this.SZ.GS;
         int var6 = var9 - var13.getBaseLine();
         String var10 = this.XC;
         int var11 = this.Ig0;
         int var14 = this.Ge0;
         var16.drawText(var2, var12, var6, var10, var11, var14);
      }
   }
}
