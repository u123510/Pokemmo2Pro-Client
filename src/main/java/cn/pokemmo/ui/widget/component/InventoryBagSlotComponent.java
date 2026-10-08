package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class InventoryBagSlotComponent extends BaseComponent {
   public final tk0_0 A5;
   public final tk0_0 nq0;
   public Mm rI;
   public byte xB0;

   public InventoryBagSlotComponent() {
      super();
      ((le0_2)this).uf("hall-of-fame");
      tk0_0 var2 = new tk0_0();
      this.A5 = var2;
      tk0_0 var1 = new tk0_0();
      this.nq0 = var1;
      ((le0_2)this).SL(var2);
      ((le0_2)this).Oq0(true);
   }

   public final void K8() {
      ((le0_2)this).kh0();
   }

   public final void HP(zk0_1 var1) {
      super.HP(var1);
      if (this.rI != null) {
         byte var4;
         if (tw0_0.kz0()) {
            var4 = 4;
         } else {
            var4 = 6;
         }

         InventoryBagSlotComponent var10000 = this;
         Mm var10001 = this.rI;
         byte var10002 = this.xB0;
         InventoryBagSlotComponent var10003 = this;
         int var3;
         int var2 = super.Mx / 2 - (var3 = var4 * 80 / 2);
         var10001.eQ(var10002, var2, var10003.OB / 2 - var3);
         var10000.rI.Ta = var4;
      }

   }
}
