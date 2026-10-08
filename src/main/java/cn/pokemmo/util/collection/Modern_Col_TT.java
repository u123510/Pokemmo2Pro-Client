package cn.pokemmo.util.collection;

import f.*;
import java.util.HashMap;

/**
 * 现代化重构类 - 原始混淆类: f.TT
 */
public class Modern_Col_TT {

   public final HashMap r0;

   public Modern_Col_TT() {
      HashMap hashmap;
      hashmap = new HashMap();
      this.r0 = hashmap;
   }

   public final Im op0(byte var1, av_1 var2) {
      if (!var2.k10) {
         var1 = 0;
      }

      int i = var2.NR;
      i = var1 * 16 + i;
      Im im;
      if ((im = (Im)this.r0.get(i)) == null) {
         im = new Im(var2, var1);
         this.r0.put(i, im);
      }

      return im;
   }
}

