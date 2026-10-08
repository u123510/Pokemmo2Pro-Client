package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public abstract class NumericValueLabel extends BaseLabel implements tr_1 {
   public static NumericValueLabel fH;
   public int iL;
   public boolean Vt = false;

   public NumericValueLabel(rp_0 var1) {
      this.uf("button");
      this.Xy0(var1.wu());
      this.RR(this::TR);
   }

   public final void TR() {
      NumericValueLabel var1 = fH;
      if (fH != null) {
         var1.Xy0(-1);
         fH = null;
      } else {
         this.SU(sm0_0.c0(1323));
         this.Vt = true;
         fH = this;
      }
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      if (this.Vt && E00.ZU(var1.zu)) {
         int var2 = var1.finally$;
         if (var1.finally$ >= 0 && var2 <= 255) {
            this.Xy0(var2);
            this.Vt = false;
            fH = null;
            return true;
         }
      }

      if (var1.nA0 == 1 && var1.zu == 4) {
         this.Xy0(0);
      }

      return super.nd0(var1);
   }

   @Override
   public final void Bt() {
      if (this.Vt) {
         this.Xy0(-1);
         this.Vt = false;
         fH = null;
      }
   }

   @Override
   public final void N00(zk0_1 var1) {
      if (this.Vt) {
         this.Xy0(-1);
         fH = null;
      }

      super.N00(var1);
   }

   public abstract void Xy0(int var1);
}
