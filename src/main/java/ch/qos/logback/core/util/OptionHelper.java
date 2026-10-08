package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.NodeToStringTransformer;
import java.util.Iterator;
import java.util.Properties;

public class OptionHelper {
   static final String DELIM_START = "${";
   static final char DELIM_STOP = '}';
   static final String DELIM_DEFAULT = ":-";
   static final int DELIM_START_LEN = 2;
   static final int DELIM_STOP_LEN = 1;
   static final int DELIM_DEFAULT_LEN = 2;
   static final String _IS_UNDEFINED = "_IS_UNDEFINED";

   public static Object instantiateByClassName(String var0, Class var1, Context var2) throws IncompatibleClassException, DynamicClassLoadingException {
      return instantiateByClassName(var0, var1, Loader.getClassLoaderOfObject(var2));
   }

   public static Object instantiateByClassNameAndParameter(String var0, Class var1, Context var2, Class var3, Object var4) throws IncompatibleClassException, DynamicClassLoadingException {
      return instantiateByClassNameAndParameter(var0, var1, Loader.getClassLoaderOfObject(var2), var3, var4);
   }

   public static Object instantiateByClassName(String var0, Class var1, ClassLoader var2) throws IncompatibleClassException, DynamicClassLoadingException {
      return instantiateByClassNameAndParameter(var0, var1, (ClassLoader)var2, (Class)null, (Object)null);
   }

   public static Object instantiateByClassNameAndParameter(String className, Class expectedClass, ClassLoader classLoader, Class parameterType, Object parameter) throws IncompatibleClassException, DynamicClassLoadingException {
      try {
         Class loadedClass = classLoader.loadClass(className);
         if (!expectedClass.isAssignableFrom(loadedClass)) {
            throw new IncompatibleClassException(expectedClass, loadedClass);
         }
         if (parameterType == null) {
            return loadedClass.getConstructor().newInstance();
         }
         return loadedClass.getConstructor(parameterType).newInstance(parameter);
      } catch (IncompatibleClassException e) {
         throw e;
      } catch (Throwable e) {
         throw new DynamicClassLoadingException("Failed to instantiate type " + className, e);
      }
   }

   public static String substVars(String var0, PropertyContainer var1) throws ScanException {
      return substVars(var0, var1, (PropertyContainer)null);
   }

   public static String substVars(String var0, PropertyContainer var1, PropertyContainer var2) throws ScanException {
      return NodeToStringTransformer.substituteVariable(var0, var1, var2);
   }

   public static String propertyLookup(String var0, PropertyContainer var1, PropertyContainer var2) {
      String var3;
      if ((var3 = var1.getProperty(var0)) == null && var2 != null) {
         var3 = var2.getProperty(var0);
      }

      if (var3 == null) {
         var3 = getSystemProperty(var0, (String)null);
      }

      if (var3 == null) {
         var3 = getEnv(var0);
      }

      return var3;
   }

   public static String getSystemProperty(String var0, String var1) {
      try {
         return System.getProperty(var0, var1);
      } catch (SecurityException var2) {
         return var1;
      }
   }

   public static String getEnv(String var0) {
      try {
         return System.getenv(var0);
      } catch (SecurityException var1) {
         return null;
      }
   }

   public static String getSystemProperty(String var0) {
      try {
         return System.getProperty(var0);
      } catch (SecurityException var1) {
         return null;
      }
   }

   public static void setSystemProperties(ContextAware contextAware, Properties props) {
      Iterator iterator = props.keySet().iterator();
      while (iterator.hasNext()) {
         String key = (String)iterator.next();
         setSystemProperty(contextAware, key, props.getProperty(key));
      }
   }

   public static void setSystemProperty(ContextAware var0, String var1, String var2) {
      try {
         System.setProperty(var1, var2);
      } catch (SecurityException var3) {
         var0.addError("Failed to set system property [" + var1 + "]", var3);
      }

   }

   public static Properties getSystemProperties() {
      try {
         return System.getProperties();
      } catch (SecurityException var1) {
         return new Properties();
      }
   }

   public static String[] extractDefaultReplacement(String var0) {
      String[] var1 = new String[2];
      if (var0 == null) {
         return var1;
      } else {
         var1[0] = var0;
         int var2;
         if ((var2 = var0.indexOf(":-")) != -1) {
            var1[0] = var0.substring(0, var2);
            var1[1] = var0.substring(var2 + 2);
         }

         return var1;
      }
   }

   public static boolean toBoolean(String var0, boolean var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();
         if ("true".equalsIgnoreCase(var0)) {
            return true;
         } else {
            return "false".equalsIgnoreCase(var0) ? false : var1;
         }
      }
   }

   /** @deprecated */
   public static boolean isEmpty(String var0) {
      return isNullOrEmptyOrAllSpaces(var0);
   }

   public static boolean isNullOrEmpty(String var0) {
      return var0 == null || var0.trim().length() == 0;
   }

   public static boolean isNullOrEmptyOrAllSpaces(String var0) {
      return var0 == null || var0.trim().length() == 0;
   }

   public static final boolean isNullOrEmpty(Object[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static final boolean isNotEmtpy(Object[] var0) {
      return isNullOrEmpty(var0) ^ true;
   }
}