package cn.pokemmo.util.collection;

import f.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 现代化重构类 - 原始混淆类: f.KX
 */
public class Modern_Col_Kx {

   public final ThreadLocal hK0;

   public Modern_Col_Kx() {
      this.hK0 = new ThreadLocal();
   }

   public final void Wm0(String var1, String var2) {
      if (var1 != null) {
         Map var3;
         if ((var3 = (Map)this.hK0.get()) == null) {
            var3 = new HashMap();
            this.hK0.set(var3);
         }

         Deque var4;
         if ((var4 = (Deque)var3.get(var1)) == null) {
            var4 = new ArrayDeque();
         }

         var4.push(var2);
         var3.put(var1, var4);
      }
   }

   public final String WL0(String var1) {
      if (var1 == null) {
         return null;
      }

      Map var2;
      if ((var2 = (Map)this.hK0.get()) == null) {
         return null;
      }

      Deque var3;
      return (var3 = (Deque)var2.get(var1)) == null ? null : (String)var3.pop();
   }

   public final ArrayDeque dm(String var1) {
      if (var1 == null) {
         return null;
      }

      Map var2;
      if ((var2 = (Map)this.hK0.get()) == null) {
         return null;
      }

      Deque var3;
      return (var3 = (Deque)var2.get(var1)) == null ? null : new ArrayDeque(var3);
   }

   public final void OB(String var1) {
      if (var1 != null) {
         Map var2;
         if ((var2 = (Map)this.hK0.get()) != null) {
            Deque var3;
            if ((var3 = (Deque)var2.get(var1)) != null) {
               var3.clear();
            }
         }
      }
   }
}

