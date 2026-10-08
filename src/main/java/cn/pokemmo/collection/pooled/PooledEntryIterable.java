package cn.pokemmo.collection.pooled;

import f.*;
import java.util.Iterator;

/**
 * 现代化集合类 - 原始类: f.cd_1
 */
public class PooledEntryIterable implements Iterable {

   public final dz0_0 sp0;
   public transient Bq0 CX;
   public tb0_0 vk0;

   public PooledEntryIterable() {
      this.sp0 = new dz0_0();
   }

   @Override
   public final Iterator iterator() {
      Bq0 var1 = this.CX;
      if (var1 == null) {
         var1 = new Bq0((cd_1) this);
         this.CX = var1;
         return var1;
      }

      return var1.Rm();
   }
}
