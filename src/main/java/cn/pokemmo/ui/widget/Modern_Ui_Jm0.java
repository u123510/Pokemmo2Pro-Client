package cn.pokemmo.ui.widget;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Jm0
 */
public class Modern_Ui_Jm0 extends W9 {

   public int z00 = 0;
   public int eK0 = 0;
   public final Br0 Fg;

   public Modern_Ui_Jm0(int var1, int var2) {
      this(var1, var2, 0);
   }

   public Modern_Ui_Jm0(int var1, int var2, int var3) {
      super("");
      this.Fg = new Br0(this);
      this.uf("spritetogglebutton");
      this.z00 = var1;
      this.eK0 = var2;
      this.RY(var1, var2);
      this.g2(var1, var2);
      this.oY(var1, var2);
   }

   public final Br0 l10() {
      return this.Fg;
   }

   @Override
   public final void a80(Jn0 var1) {
      int var2;
      int var10000 = var2 = ((LC0)var1).H10(0, "maxWidth");
      int var3 = ((LC0)var1).H10(0, "maxHeight");
      if (var10000 > 0) {
         this.z00 = var2;
      }

      if (var3 > 0) {
         this.eK0 = var3;
      }
   }

   @Override
   public final void el0(Jn0 var1) {
   }

   @Override
   public final void Kz0(Jn0 var1) {
   }

   @Override
   public final int R1() {
      return this.z00;
   }

   @Override
   public final int Se() {
      return this.eK0;
   }

   public final void aux(int var1, int var2) {
      this.z00 = 64;
      this.eK0 = 64;
   }

   @Override
   public final void K8() {
      int var1 = this.z00;
      this.RY(var1, this.eK0);
      int var2 = this.z00;
      this.g2(var2, this.eK0);
      int var3 = this.z00;
      this.oY(var3, this.eK0);
   }

   @Override
   public final void Dw0(zk0_1 var1) {
      this.Fg.oC0(super.ER.U20() ? 1 : 0);
   }
}

