package ch.qos.logback.core.util;

import java.lang.module.ModuleDescriptor;

public class EnvUtil {
   private EnvUtil() {
   }

   public static String logbackVersion() {
      String var0;
      if ((var0 = logbackVersionByModule()) != null) {
         return var0;
      } else {
         Package var1;
         return (var1 = EnvUtil.class.getPackage()) == null ? null : var1.getImplementationVersion();
      }
   }

   private static String logbackVersionByModule() {
      Module var0;
      if ((var0 = EnvUtil.class.getModule()) == null) {
         return null;
      } else {
         ModuleDescriptor var1;
         return (var1 = var0.getDescriptor()) == null ? null : var1.rawVersion().orElse(null);
      }
   }

   public static int getJDKVersion(String var0) {
      int var5 = 0;
      char[] var1;
      int var2 = (var1 = var0.toCharArray()).length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var4;
         if (Character.isDigit(var4 = var1[var3])) {
            int var6 = var5 * 10;
            var5 = var4 - 48 + var6;
         } else {
            if (var5 != 1) {
               break;
            }

            var5 = 0;
         }
      }

      return var5;
   }

   private static boolean isJDK_N_OrHigher(int var0) {
      String var1;
      if ((var1 = System.getProperty("java.version", "")).isEmpty()) {
         return false;
      } else {
         int var2;
         return (var2 = getJDKVersion(var1)) > 0 && var0 <= var2;
      }
   }

   public static boolean isJDK5() {
      return isJDK_N_OrHigher(5);
   }

   public static boolean isJDK6OrHigher() {
      return isJDK_N_OrHigher(6);
   }

   public static boolean isJDK7OrHigher() {
      return isJDK_N_OrHigher(7);
   }

   public static boolean isJDK16OrHigher() {
      return isJDK_N_OrHigher(16);
   }

   public static boolean isJDK18OrHigher() {
      return isJDK_N_OrHigher(18);
   }

   public static boolean isJDK21OrHigher() {
      return isJDK_N_OrHigher(21);
   }

   public static boolean isJaninoAvailable() {
      try {
         Class var2 = EnvUtil.class.getClassLoader().loadClass("org.codehaus.janino.ScriptEvaluator");
         return var2 != null;
      } catch (ClassNotFoundException var1) {
         return false;
      }
   }

   public static boolean isWindows() {
      return System.getProperty("os.name").startsWith("Windows");
   }

   public static boolean isClassAvailable(Class var0, String var1) {
      try {
         Class var3 = Loader.getClassLoaderOfClass(var0).loadClass(var1);
         return var3 != null;
      } catch (ClassNotFoundException var2) {
         return false;
      }
   }
}
