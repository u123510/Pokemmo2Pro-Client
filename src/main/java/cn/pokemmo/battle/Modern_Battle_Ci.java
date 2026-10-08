package cn.pokemmo.battle;

import f.*;
import f.org.json.N7;

/**
 * 现代化重构类 - 原始混淆类: f.CI
 */
public class Modern_Battle_Ci {

   public final kt_2 A5;
   public final int II0;
   public final int ev;
   public boolean Mr0;

   public Modern_Battle_Ci(kt_2 var1, int var2, int var3) {
      this.A5 = var1;
      this.II0 = var2;
      this.ev = var3;
   }

   public Modern_Battle_Ci() {
      this.A5 = kt_2.nC;
      this.II0 = 0;
      this.ev = 0;
      this.Mr0 = true;
   }

   public final N7 HE0() {
      N7 var1 = new N7();
      String var3 = "type";
      var1.D50(Integer.valueOf(this.A5.Dg0), var3);
      String var4 = "primary_value";
      var1.D50(this.II0, var4);
      String var5 = "secondary_value";
      var1.D50(this.ev, var5);
      String var6 = "end_battle";
      Boolean var2;
      if (this.Mr0) {
         var2 = Boolean.TRUE;
      } else {
         var2 = Boolean.FALSE;
      }

      var1.D50(var2, var6);
      return var1;
   }
}

