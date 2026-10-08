package cn.pokemmo.graphics.render;

import f.*;

public class DynamicMeshBatch extends p6_0 {
   public static final MD0 U80;
   public final nf0_2 Il;
   public final ol0_2 mu0;
   public Runnable[] Yi0;
   public final String zG;
   public int t;

   public DynamicMeshBatch() {
      super();
      this.zG = "";
      this.t = -1;
      this.Il = new nf0_2((X6) this, this.Ed0());
      this.mu0 = new ol0_2();
      this.Wt.VJ().l40(new a5_0((X6) this));
      this.mu0.mJ0(new U90((X6) this));
      this.lK0.uf("comboboxPopup");
      this.lK0.SL(this.mu0);
      this.SL(this.Il);
   }

   static {
      U80 = MD0.cB("error");
   }

   public DynamicMeshBatch(M30 var1) {
      this();
      this.r30(var1);
   }

   @Override
   public final String Ck() {
      return "combobox";
   }

   public final void Rm0(Runnable var1) {
      this.Yi0 = (Runnable[])a7_0.gE(this.Yi0, var1, Runnable.class);
   }

   public final void Bd(int var1) {
      this.mu0.RK0(var1, true, jr_0.J60);
      this.WI0();
   }

   public final void hK(Object var1) {
      M30 var2 = this.mu0.KB;
      for (int var3 = 0; var3 < this.mu0.zJ; var3++) {
         if (var2.YS(var3).equals(var1)) {
            this.mu0.RK0(var3, true, jr_0.J60);
            this.WI0();
            break;
         }
      }
   }

   public final int ao() {
      return this.mu0.Mw0;
   }

   public final Object Vh0() {
      int var1 = this.mu0.Mw0;
      if (var1 == -1) {
         return null;
      }

      M30 var2 = this.mu0.KB;
      return var2 == null ? null : var2.YS(var1);
   }

   @Override
   public boolean if0() {
      if (!this.lK0.c3()) {
         return false;
      }

      this.oJ0();
      this.lK0.Iu();
      this.t = this.mu0.Mw0;
      this.mu0.RK0(this.t, true, jr_0.J60);
      return true;
   }

   public String RA(int var1) {
      return String.valueOf(this.mu0.KB.YS(var1));
   }

   public final void WI0() {
      int var1 = this.mu0.Mw0;
      if (var1 == -1) {
         this.Il.Sk(this.zG);
      } else {
         this.Il.Sk(this.RA(var1));
      }

      this.Il.M.j70(U80, false);
      this.COm3();
   }

   @Override
   public final void Ib(Jn0 var1) {
      super.Ib(var1);
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      if (super.nd0(var1)) {
         return true;
      }

      if (!var1.iT()) {
         return false;
      }

      int var2 = dp0.r9(var1.finally$);
      if (var2 == 62 || var2 == 66) {
         this.if0();
         return true;
      }

      if (var2 == 3 || var2 == 123 || var2 == 19 || var2 == 20) {
         this.mu0.nd0(var1);
         return true;
      }

      return false;
   }

   public final void r30(M30 var1) {
      this.mu0.P8(var1);
   }
}
