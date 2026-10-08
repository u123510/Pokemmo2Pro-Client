package cn.pokemmo.ui.widget.label;

import f.*;

public class StyledDynamicTextLabel extends dz_2 {
   public boolean sn0;
   public le0_2 mY;
   public zs_1[] eJ0;
   public boolean GC0;

   public StyledDynamicTextLabel() {
      this(null, 0);
   }

   public StyledDynamicTextLabel(KG0 var1) {
      this(var1, 0);
   }

   public StyledDynamicTextLabel(KG0 var1, int var2) {
      super(var1, false);
      this.sn0 = true;
   }

   public StyledDynamicTextLabel(String var1) {
      this();
      this.Sk(var1);
   }

   public String Ck() {
      return "label";
   }

   public final void ZZ(zs_1 var1) {
      this.eJ0 = (zs_1[])a7_0.gE(this.eJ0, var1, zs_1.class);
   }

   public final void H3() {
      this.sn0 = false;
   }

   public final void df(Y30 var1) {
      super.df(var1);
      if (this.sn0) {
         this.COm3();
      }
   }

   public final String kl() {
      return this.j50.toString();
   }

   public void Sk(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      if (!var1.equals(this.j50.toString())) {
         this.B(var1);
         if (this.sn0) {
            this.COm3();
         }
      }
   }

   public final Object AR() {
      Object var1 = this.yj0;
      return var1 == null && this.mY != null ? this.mY.AR() : var1;
   }

   public final void coM8(le0_2 var1) {
      if (var1 == this) {
         throw new IllegalArgumentException("labelFor == this");
      }
      this.mY = var1;
   }

   public void Ib(Jn0 var1) {
      super.Ib(var1);
      LC0 var2 = (LC0)var1;
      String var3 = (String)var2.N30("text", false, String.class, null);
      if (var3 != null) {
         this.Sk(var3);
      }

      Y30 var4 = (Y30)var2.N30("font", false, Y30.class, null);
      if (var4 != null) {
         this.df(var4);
      }
   }

   public final boolean BL() {
      return this.mY != null ? this.mY.BL() : super.BL();
   }

   public int R1() {
      return Math.max(super.R1(), this.m0());
   }

   public int Se() {
      return Math.max(super.Se(), this.rm0());
   }

   public boolean nd0(i70_0 var1) {
      this.k50(var1);
      int var2 = var1.zu;
      if (!E00.C10(var2)) {
         return false;
      }
      if (this.GC0) {
         return false;
      }
      if (var2 == 5) {
         if (var1.kA == 1) {
            a7_0.COM8(this.eJ0, e90_0.VG);
         } else if (var1.kA == 2) {
            a7_0.COM8(this.eJ0, e90_0.kz0);
         }
      }
      return var1.zu != 8;
   }

   public final void fn0() {
      this.GC0 = true;
   }
}
