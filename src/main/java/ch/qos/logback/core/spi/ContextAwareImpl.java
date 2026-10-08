package ch.qos.logback.core.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;

public class ContextAwareImpl implements ContextAware {
   private int noContextWarning = 0;
   protected Context context;
   final Object origin;

   public ContextAwareImpl(Context var1, Object var2) {
      this.context = var1;
      this.origin = var2;
   }

   public Object getOrigin() {
      return this.origin;
   }

   public void setContext(Context var1) {
      Context var2;
      if ((var2 = this.context) == null) {
         this.context = var1;
      } else if (var2 != var1) {
         throw new IllegalStateException("Context has been already set");
      }

   }

   public Context getContext() {
      return this.context;
   }

   public StatusManager getStatusManager() {
      Context var1;
      return (var1 = this.context) == null ? null : var1.getStatusManager();
   }

   public void addStatus(Status var1) {
      Context var2;
      if ((var2 = this.context) == null) {
         if (this.noContextWarning++ == 0) {
            System.out.println("LOGBACK: No context given for " + String.valueOf(this));
         }

      } else {
         StatusManager var3;
         if ((var3 = var2.getStatusManager()) != null) {
            var3.add(var1);
         }

      }
   }

   public void addInfo(String var1) {
      InfoStatus var2;
      var2 = new InfoStatus(var1, this.getOrigin());
      this.addStatus(var2);
   }

   public void addInfo(String var1, Throwable var2) {
      InfoStatus var3;
      var3 = new InfoStatus(var1, this.getOrigin(), var2);
      this.addStatus(var3);
   }

   public void addWarn(String var1) {
      WarnStatus var2;
      var2 = new WarnStatus(var1, this.getOrigin());
      this.addStatus(var2);
   }

   public void addWarn(String var1, Throwable var2) {
      WarnStatus var3;
      var3 = new WarnStatus(var1, this.getOrigin(), var2);
      this.addStatus(var3);
   }

   public void addError(String var1) {
      ErrorStatus var2;
      var2 = new ErrorStatus(var1, this.getOrigin());
      this.addStatus(var2);
   }

   public void addError(String var1, Throwable var2) {
      ErrorStatus var3;
      var3 = new ErrorStatus(var1, this.getOrigin(), var2);
      this.addStatus(var3);
   }
}
