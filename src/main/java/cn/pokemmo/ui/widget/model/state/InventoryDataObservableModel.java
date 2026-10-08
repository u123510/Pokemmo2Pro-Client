package cn.pokemmo.ui.widget.model.state;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import cn.pokemmo.ui.widget.model.state.BaseObservableStateModel;

public class InventoryDataObservableModel extends BaseObservableStateModel implements E7 {
   public final X1 s90;
   public le0_2 to0;
   public Runnable HA;
   public final P8 Kl0;

   public InventoryDataObservableModel(P8 var1) {
      this.Kl0 = var1;
      this.s90 = new X1(this);
   }

   public final boolean getValue() {
      return this.Kl0.bC == this;
   }

   public final void Dc0(boolean var1) {
      if (var1) {
         this.Kl0.Zd((com2__3) this);
      }
   }

   public final void gn(le0_2 var1) {
      le0_2 var2 = this.to0;
      if (var2 != var1) {
         if (var2 != null) {
            this.Kl0.Qf.u3(var2);
         }
         this.to0 = var1;
         if (var1 != null) {
            var1.Ll(this.getValue());
            this.Kl0.Qf.F9(this.Kl0.Qf.fU(), var1);
         }
      }
   }

   public final void PI0(String var1) {
      this.s90.uf(var1);
      this.s90.yI();
   }

   public final void fK0(Runnable var1) {
      this.HA = var1;
   }

   public final void hI() {
      if (this.to0 != null) {
         this.to0.Ll(this.getValue());
      }
      a7_0.bH(this.RD0);
   }
}
