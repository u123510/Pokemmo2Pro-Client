package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.helpers.NOPAppender;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ContextAwareImpl;

public class AppenderTracker extends AbstractComponentTracker<Appender> {
   int nopaWarningCount = 0;
   final Context context;
   final AppenderFactory appenderFactory;
   final ContextAwareImpl contextAware;

   public AppenderTracker(Context var1, AppenderFactory var2) {
      this.context = var1;
      this.appenderFactory = var2;
      ContextAwareImpl var3;
      var3 = new ContextAwareImpl(var1, this);
      this.contextAware = var3;
   }

   private NOPAppender buildNOPAppender(String var1) {
      int var2;
      if ((var2 = this.nopaWarningCount) < 4) {
         this.nopaWarningCount = var2 + 1;
         this.contextAware.addError("Building NOPAppender for discriminating value [" + var1 + "]");
      }

      NOPAppender var10000 = new NOPAppender();
      ((ContextAwareBase)var10000).setContext(this.context);
      ((AppenderBase)var10000).start();
      return var10000;
   }

   public void processPriorToRemoval(Appender var1) {
      var1.stop();
   }

   public Appender buildComponent(String var1) {

      Object var2 = null;

      try {
         Appender var4 = this.appenderFactory.buildAppender(this.context, var1);
         var2 = var4;
      } catch (Exception var3) {
         this.contextAware.addError("Error while building appender with discriminating value [" + var1 + "]");
      }

      if (var2 == null) {
         var2 = this.buildNOPAppender(var1);
      }

      return (Appender)var2;
   }

   public boolean isComponentStale(Appender var1) {
      return var1.isStarted() ^ true;
   }
}
