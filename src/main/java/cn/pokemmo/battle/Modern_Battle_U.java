package cn.pokemmo.battle;

import f.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 现代化重构类 - 原始混淆类: f.U
 */
public class Modern_Battle_U {

   public final HashMap yp;

   public Modern_Battle_U() {
      HashMap var1;
      var1 = new HashMap();
      this.yp = var1;
   }

   public final void BL(CH0 var1, lq0 var2, CH0 var3) {
      Map byCategory = (Map)this.yp.computeIfAbsent(var1, key -> Dg0((CH0)key));
      List entries = (List)byCategory.computeIfAbsent(var2, key -> VD0((lq0)key));
      entries.add(var3);
   }

   public final HashMap W1() {
      HashMap result = new HashMap();
      this.yp.forEach((category, byType) -> xF0(result, (CH0)category, (Map)byType));
      return result;
   }

   public static void xF0(HashMap result, CH0 category, Map byType) {
      byType.forEach((type, entries) -> zx0(result, (lq0)type, (List)entries));
   }

   public static void zx0(HashMap result, lq0 type, List entries) {
      entries.forEach(entry -> xD0(result, type, (CH0)entry));
   }

   public static void xD0(HashMap result, lq0 type, CH0 entry) {
      ((List)result.computeIfAbsent(entry, key -> v10((CH0)key))).add(type);
   }

   public static List v10(CH0 ignored) {
      return new ArrayList();
   }

   public static List VD0(lq0 ignored) {
      return new ArrayList(1);
   }

   public static Map Dg0(CH0 ignored) {
      return new HashMap();
   }
}

