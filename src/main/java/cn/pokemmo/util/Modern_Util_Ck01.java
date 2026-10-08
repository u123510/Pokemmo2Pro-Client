package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.ck0_1
 */
public abstract class Modern_Util_Ck01 {

    public Modern_Util_Ck01() {
        super();
    }

   public final rx_1 fG0 = new rx_1(0);

   public final CH0 vJ() {
      long var1;
      synchronized (this.fG0) {
         var1 = System.currentTimeMillis() - 1325376000000L;
         while (var1 < this.fG0.q9) {
            var1 = System.currentTimeMillis() - 1325376000000L;
         }
         if (var1 == this.fG0.q9) {
            this.fG0.OL = this.fG0.OL + 1L & 4095L;
            while (this.fG0.OL == 0L && var1 <= this.fG0.q9) {
               var1 = System.currentTimeMillis() - 1325376000000L;
            }
         } else {
            this.fG0.OL = 0L;
         }
         this.fG0.q9 = var1;
         var1 = var1 << 22 | this.fG0.fj << 19 | this.fG0.hP << 12 | this.fG0.OL;
      }
      return CH0.Ab(var1);
   }
}

