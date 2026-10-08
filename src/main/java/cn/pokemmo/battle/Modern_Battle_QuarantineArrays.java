package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.QuarantineArrays
 */
public class Modern_Battle_QuarantineArrays {

   protected Modern_Battle_QuarantineArrays() {
   }

   public static Object obj(Class<?> owner, String name) {
      try {
         Class.forName(owner.getName(), true, owner.getClassLoader());
         java.lang.reflect.Field f = owner.getDeclaredField(name);
         return f.get((Object)null);
      } catch (Exception var2) {
         return null;
      }
   }

   public static int[] ints(Class<?> owner, String name) {
      Object v = obj(owner, name);
      return v instanceof int[] ? (int[])v : new int[0];
   }

   public static Object field(Object target, String name) {
      try {
         java.lang.reflect.Field f = target.getClass().getDeclaredField(name);
         f.setAccessible(true);
         return f.get(target);
      } catch (Exception var2) {
         return null;
      }
   }
}

