package cn.pokemmo.battle.calc;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.calc.BaseDamageCalculator;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public class WeatherDamageModifier extends BaseDamageCalculator {
   public String WP;
   public String r4;

   public WeatherDamageModifier(Ry var1, ByteBuffer var2) {
      super(var2, var1, 7);
   }

   public final void Oj0() {
      this.WP = this.q60();
      this.r4 = this.q60();
   }

   public final void os0() {
      if (this.r4.isEmpty()) {
         String var1 = this.WP;
         ArrayList var2 = vf0_1.a();
         for (Object var4 : var2) {
            RR var3 = (RR)var4;
            if (var3.Ii0.equals(var1)) {
               var2.remove(var3);
               vf0_1.e20(var2);
               break;
            }
         }
      } else {
         RR var1 = new RR(this.WP, this.r4);
         ArrayList var2 = vf0_1.a();
         for (Object var4 : var2) {
            if (((RR)var4).equals(var1)) {
               this.finish();
               return;
            }
         }
         var2.add(var1);
         if (!vf0_1.e20(var2)) {
            String var3 = sm0_0.c0(87);
            ((qt_2)((Ry)this.uk).Al0).getClass();
            Qy0 var4 = Qy0.yI0;
            if (var4 != null) {
               var4.dk(-1, var3);
            }
         }
      }
      this.finish();
   }

   private void finish() {
      ((qt_2)((Ry)this.uk).Al0).getClass();
      lg_0.k.lPT5(new SM());
   }
}
