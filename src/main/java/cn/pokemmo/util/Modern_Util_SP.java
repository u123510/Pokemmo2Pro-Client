package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.SP
 */
public abstract class Modern_Util_SP implements mu_0 {

    public Modern_Util_SP() {
        super();
    }

   public te0_0 ay0;

   public abstract boolean Nq0();

   @Override
   public final void bL() {
      this.ay0 = null;
   }

   @Override
   public final String toString() {
      int var1;
      String var2;
      if ((var1 = (var2 = SP.class.getName()).lastIndexOf(46)) != -1) {
         var2 = var2.substring(var1 + 1);
      }

      if (var2.endsWith("Action")) {
         var2 = var2.substring(0, var2.length() - 6);
      }

      return var2;
   }
}

