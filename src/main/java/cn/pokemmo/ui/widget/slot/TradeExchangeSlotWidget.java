package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

public class TradeExchangeSlotWidget extends BaseItemSlotWidget {
   // $FF: synthetic field
   public final qf0_1 wB0;

   public TradeExchangeSlotWidget(qf0_1 var1) {
      super((short)0, CH0.j1, (short)0, (short)0, true);
      this.wB0 = var1;
      super.ge = 12;
      super.ej0 = 6;
      ((le0_2)this).uf("item-slot");
   }

   public final void Uj0(byte var1, short var2, short var3) {
      super.Uj0((byte)var1, var2, var3);
      qf0_1 var4 = this.wB0;
      if (this != var4.fD) {
         int var5 = 0;
         switch (var4.qa0.wE0) {
            case 5485:
               var5 = 5493;
               break;
            case 5486:
               var5 = 5494;
               break;
            case 5487:
               var5 = 5498;
               break;
            case 5488:
               var5 = 5497;
               break;
            case 5489:
               var5 = 5496;
               break;
            case 5490:
               var5 = 5492;
               break;
            case 5491:
               var5 = 5495;
         }

         if (var5 < 1) {
            var4.ij0(0, (short)0);
         } else {
            var4.ij0(gu0.l2.lPT6((short)var5).TD, (short)var5);
         }
      }

   }

   public final void UR(K5 var1) {
      if (this != this.wB0.fD) {
         if (var1 != null) {
            mc0_1 var2;
            if ((var2 = var1.cL) == null) {
               return;
            }

            hl0_0 var3;
            short var4;
            if ((var4 = (var3 = var1.nn).PA0) > 1) {
               uf0_0 var8 = (uf0_0)jq0_0.tK0(Qy0.yI0, uf0_0.class);
               if (var8 != null) {
                  lpt6__0.v90(var8);
                  return;
               }

               String var6 = sm0_0.wa0(8583, sm0_0.c0(var2.Nl));
               uf0_0 var7 = new uf0_0(var6, var4, new Cw0(this, var1), (le0_2)null);
               Qy0 var10 = Qy0.yI0;
               ((le0_2)var10).F9(((le0_2)var10).fU(), var7);
            } else {
               TradeExchangeSlotWidget var11 = this;
               TradeExchangeSlotWidget var10002 = this;
               short var5 = var3.wQ;
               this.Uj0(var3.N50, var5, var4);
               lpt6__0.v90(this.wB0.Ip0);
            }
         } else {
            this.Uj0((byte)0, (short)0, (short)0);
         }

      }
   }

   public final void a80(Jn0 var1) {
      this.K8();
   }

   public final void K8() {
      ((le0_2)this).RY(48, 48);
      ((le0_2)this).g2(48, 48);
      ((le0_2)this).oY(48, 48);
   }
}
