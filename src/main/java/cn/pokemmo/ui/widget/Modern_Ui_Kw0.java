package cn.pokemmo.ui.widget;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Kw0
 */
public class Modern_Ui_Kw0 extends dg0_0 {

    public Modern_Ui_Kw0() {
        super();
    }

   @Override
   public final void zl() {
      super.W10.Ll(true);
      super.C5.Ll(true);
      super.J90.Ll(true);
      super.Hh.Ll(true);
      super.Xt.Ll(true);
   }

   @Override
   public final void Ol0() {
      super.Ol0();
      int var2;
      P10 var10000;
      int var10001;
      Br0 var10002;
      if (tw0_0.kz0()) {
         super.J90.og.EJ0 = 2.0F;
         super.Hh.og.EJ0 = 1.5F;
         P10 var1;
         if (!super.W10.hi0() && super.C5.hi0()) {
            var1 = super.C5;
         } else {
            var1 = super.W10;
         }

         var10000 = super.Hh;
         int var3 = var1.A20 + 4;
         var2 = var1.SB0;
         var10001 = var3;
         var10002 = var1.og;
      } else {
         P10 var5;
         label24: {
            if (!super.W10.hi0()) {
               if (super.C5.hi0()) {
                  var5 = super.C5;
                  break label24;
               }

               if (super.Xt.hi0()) {
                  var5 = super.Xt;
                  break label24;
               }
            }

            var5 = super.W10;
         }

         var10000 = super.Hh;
         int var4 = var5.A20 + 2;
         var2 = var5.SB0;
         var10001 = var4;
         var10002 = var5.og;
      }

      var10000.E40(var10001, var10002.yH0() + var2 + 1);
   }

   @Override
   public final void Dw0(zk0_1 var1) {
      if (!super.XW) {
         super.Dw0(var1);
      }
   }
}

