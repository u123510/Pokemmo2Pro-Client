package cn.pokemmo.graphics.particle;

import f.*;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParticleEmitterAffector extends Kq0 {
   public float X4;
   public float qE0;
   public float i20 = 100.0F;
   public float Zd;
   public float uo = 1.0F;
   public ei_0 MI;
   public yq_1 Et0;
   public final String wm0 = "%.2f";
   public final Locale fU;
   public dc_1 kD;

   public ParticleEmitterAffector() {
      this.fU = Locale.ENGLISH;
      this.kD = null;
      ((le0_2)this).uf("valueadjuster");
      ((Kq0)this).mH();
      super.Ly0.Bl(xw_1.Ww);
      this.qR();
   }

   public ParticleEmitterAffector(ei_0 var1) {
      this.fU = Locale.ENGLISH;
      this.kD = null;
      ((le0_2)this).uf("valueadjuster");
      this.nk(var1);
      super.Ly0.Bl(xw_1.Ww);
      this.qR();
   }

   public final String Ck() {
      return "valueadjusterfloat";
   }

   public final void ld0(dc_1 var1) {
      this.kD = var1;
   }

   public final void tt(float var1, float var2) {
      if (!(var2 < var1)) {
         this.qE0 = var1;
         this.i20 = var2;
         this.Zb0(this.X4);
      } else {
         throw new IllegalArgumentException("maxValue < minValue");
      }
   }

   public final void Zb0(float var1) {
      float var2;
      if (var1 > (var2 = this.i20) || var1 < (var2 = this.qE0)) {
         var1 = var2;
      }

      if (this.X4 != var1) {
         this.X4 = var1;
         ei_0 var5;
         if ((var5 = this.MI) != null) {
            var5.MK0(var1);
         }

         ((Kq0)this).mH();
         dc_1 var3;
         if ((var3 = this.kD) != null) {
            var3.y90(var1);
         }
      }

   }

   public final String UG() {
      return this.Tz();
   }

   public final boolean AZ(String var1) {
      try {
         this.Zb0(NumberFormat.getNumberInstance(this.fU).parse(var1).floatValue());
         return true;
      } catch (ParseException var2) {
         return false;
      }
   }

   public final String XF0(String var1) {
      try {
         NumberFormat.getNumberInstance(this.fU).parse(var1).floatValue();
      } catch (ParseException var2) {
         return var2.toString();
      }

      return null;
   }

   public final void q8() {
   }

   public final boolean kk(char var1) {
      return var1 >= '0' && var1 <= '9' || var1 == '-' || var1 == '.';
   }

   public final void br() {
      this.Zd = this.X4;
   }

   public final void qL0(int var1) {
      int var10001 = var1;
      float var3 = Math.max(1.0E-4F, Math.abs(this.i20 - this.qE0));
      float var2 = this.Zd;
      this.Zb0((float)var10001 / Math.max(3.0F, (float)super.Mx / var3) + var2);
   }

   public final void w50() {
      this.Zb0(this.Zd);
   }

   public final void aux() {
      this.Zb0(this.X4 - this.uo);
   }

   public final void yv0() {
      this.Zb0(this.X4 + this.uo);
   }

   public final String Tz() {
      return String.format(this.fU, this.wm0, this.X4);
   }

   public final void UO() {
      ((Kq0)this).sS();
      this.qE0 = this.MI.Uu();
      this.i20 = this.MI.vB();
      this.X4 = this.MI.ff();
      ((Kq0)this).mH();
   }

   public final void C(zk0_1 var1) {
      com8__3 var2 = new com8__3(var1);
      super.be = var2;
      var2.bm0 = super.Jc0;
      var2.ad0 = true;
      if (this.MI != null && super.Em0 != null) {
         if (this.Et0 == null) {
            yq_1 var3;
            var3 = new yq_1(this);
            this.Et0 = var3;
         }

         this.MI.Kj(this.Et0);
         this.UO();
      }

   }

   public final void N00(zk0_1 var1) {
      yq_1 var2;
      ei_0 var3;
      if ((var3 = this.MI) != null && (var2 = this.Et0) != null) {
         var3.RD0 = (Runnable[])a7_0.tp0(var2, var3.RD0);
      }

      com8__3 var4;
      if ((var4 = super.be) != null) {
         var4.wg0();
      }

      super.be = null;
   }

   public final void qR() {
      super.aB0.RR(new ZX((Ay0) this));
      super.BA0.RR(new wz_2((Ay0) this));
   }

   public final void nk(ei_0 var1) {
      ei_0 var2;
      if ((var2 = this.MI) != var1) {
         yq_1 var3;
         if (var2 != null && (var3 = this.Et0) != null) {
            var2.RD0 = (Runnable[])a7_0.tp0(var3, var2.RD0);
         }

         this.MI = var1;
         if (var1 != null) {
            this.qE0 = var1.Uu();
            this.i20 = var1.vB();
            if (this.MI != null && super.Em0 != null) {
               if (this.Et0 == null) {
                  yq_1 var4;
                  var4 = new yq_1(this);
                  this.Et0 = var4;
               }

               this.MI.Kj(this.Et0);
               this.UO();
            }
         }
      }

   }

   public final void yx() {
      this.uo = 0.01F;
   }
}
