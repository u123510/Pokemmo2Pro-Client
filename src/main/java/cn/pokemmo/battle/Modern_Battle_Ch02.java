package cn.pokemmo.battle;

import f.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 现代化重构类 - 原始混淆类: f.ch0_2
 */
public class Modern_Battle_Ch02 {

   public static final List mv0 = Collections.emptyList();
   public final e30_0 Pc0;
   public final qe0_2 n4;
   public vl_1 GT;
   public Collection Uk0;

   public Modern_Battle_Ch02(e30_0 var1, qe0_2 var2) {
      this.Pc0 = var1;
      this.n4 = var2;
      this.Uk0 = mv0;
   }

   public final e30_0 sm() {
      return this.Pc0;
   }

   public final CE a00(byte var1) {
      Iterator var3 = this.Uk0.iterator();

      while (var3.hasNext()) {
         CE var2;
         if ((var2 = (CE)var3.next()).ou0 == var1) {
            return var2;
         }
      }

      return null;
   }

   public final vl_1 qr0() {
      return this.GT;
   }

   public final boolean Xm() {
      return this.Pc0.eo0();
   }
}

