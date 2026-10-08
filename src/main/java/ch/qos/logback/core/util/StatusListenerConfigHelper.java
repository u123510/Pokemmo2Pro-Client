package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.OnPrintStreamStatusListenerBase;
import ch.qos.logback.core.status.StatusListener;

public class StatusListenerConfigHelper {
   public static void installIfAsked(Context var0) {
      String var1;
      if (!OptionHelper.isNullOrEmptyOrAllSpaces(var1 = OptionHelper.getSystemProperty("logback.statusListenerClass"))) {
         addStatusListener(var0, var1);
      }

   }

   private static void addStatusListener(Context var0, String var1) {
      Object var2;
      if (!"SYSOUT".equalsIgnoreCase(var1) && !"STDOUT".equalsIgnoreCase(var1)) {
         var2 = createListenerPerClassName(var0, var1);
      } else {
         var2 = new OnConsoleStatusListener();
      }

      initAndAddListener(var0, (StatusListener)var2);
   }

   private static void initAndAddListener(Context var0, StatusListener var1) {
      if (var1 != null) {
         if (var1 instanceof ContextAware) {
            ((ContextAware)var1).setContext(var0);
         }

         if (var0.getStatusManager().add(var1) && var1 instanceof LifeCycle) {
            ((LifeCycle)var1).start();
         }
      }

   }

   private static StatusListener createListenerPerClassName(Context var0, String var1) {
      try {
         return (StatusListener)OptionHelper.instantiateByClassName(var1, StatusListener.class, var0);
      } catch (Exception var2) {
         ((Throwable)var2).printStackTrace();
         return null;
      }
   }

   public static void addOnConsoleListenerInstance(Context var0, OnConsoleStatusListener var1) {
      ((ContextAwareBase)var1).setContext(var0);
      if (var0.getStatusManager().add(var1)) {
         ((OnPrintStreamStatusListenerBase)var1).start();
      }

   }
}
