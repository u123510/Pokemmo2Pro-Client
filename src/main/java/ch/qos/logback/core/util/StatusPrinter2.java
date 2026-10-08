package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.ThrowableToStringArray;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.StatusUtil;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

public class StatusPrinter2 {
   static CachingDateFormatter cachingDateFormat = new CachingDateFormatter("HH:mm:ss,SSS");
   private PrintStream ps;

   public StatusPrinter2() {
      this.ps = System.out;
   }

   private void buildStrFromStatusList(StringBuilder var1, List var2) {
      if (var2 != null) {
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            this.buildStr(var1, "", (Status)var3.next());
         }

      }
   }

   private void appendThrowable(StringBuilder var1, Throwable var2) {
      String[] var5;
      int var6 = (var5 = ThrowableToStringArray.convert(var2)).length;

      for(int var3 = 0; var3 < var6; ++var3) {
         String var4;
         if (!(var4 = var5[var3]).startsWith("Caused by: ")) {
            if (Character.isDigit(var4.charAt(0))) {
               var1.append("\t... ");
            } else {
               var1.append("\tat ");
            }
         }

         var1.append(var4).append(CoreConstants.LINE_SEPARATOR);
      }

   }

   public void setPrintStream(PrintStream var1) {
      this.ps = var1;
   }

   public void printInCaseOfErrorsOrWarnings(Context var1) {
      this.printInCaseOfErrorsOrWarnings(var1, 0L);
   }

   public void printInCaseOfErrorsOrWarnings(Context var1, long var2) {
      if (var1 != null) {
         StatusManager var4;
         if ((var4 = var1.getStatusManager()) == null) {
            this.ps.println("WARN: Context named \"" + var1.getName() + "\" has no status manager");
         } else {
            StatusUtil var5;
            StatusUtil var10000 = var5 = new StatusUtil(var1);
            if (var5.getHighestLevel(var2) >= 1) {
               this.print(var4, var2);
            }
         }

      } else {
         throw new IllegalArgumentException("Context argument cannot be null");
      }
   }

   public void printIfErrorsOccured(Context var1) {
      if (var1 != null) {
         StatusManager var2;
         if ((var2 = var1.getStatusManager()) == null) {
            this.ps.println("WARN: Context named \"" + var1.getName() + "\" has no status manager");
         } else if ((new StatusUtil(var1)).getHighestLevel(0L) == 2) {
            this.print(var2);
         }

      } else {
         throw new IllegalArgumentException("Context argument cannot be null");
      }
   }

   public void print(Context var1) {
      this.print(var1, 0L);
   }

   public void print(Context var1, long var2) {
      if (var1 != null) {
         StatusManager var4;
         if ((var4 = var1.getStatusManager()) == null) {
            this.ps.println("WARN: Context named \"" + var1.getName() + "\" has no status manager");
         } else {
            this.print(var4, var2);
         }

      } else {
         throw new IllegalArgumentException("Context argument cannot be null");
      }
   }

   public void print(StatusManager var1) {
      this.print(var1, 0L);
   }

   public void print(StatusManager var1, long var2) {


      StringBuilder var4;
      StringBuilder var10002 = var4 = new StringBuilder();
      this.buildStrFromStatusList(var10002, StatusUtil.filterStatusListByTimeThreshold(var1.getCopyOfStatusList(), var2));
      this.ps.println(var4.toString());
   }

   public void print(List var1) {


      StringBuilder var2;
      StringBuilder var10002 = var2 = new StringBuilder();
      this.buildStrFromStatusList(var10002, var1);
      this.ps.println(var2.toString());
   }

   public void buildStr(StringBuilder var1, String var2, Status var3) {
      String var4;
      if (var3.hasChildren()) {
         var4 = var2 + "+ ";
      } else {
         var4 = var2 + "|-";
      }

      CachingDateFormatter var5;
      if ((var5 = cachingDateFormat) != null) {
         var1.append(var5.format(var3.getTimestamp())).append(" ");
      }

      var1.append(var4).append(var3).append(CoreConstants.LINE_SEPARATOR);
      if (var3.getThrowable() != null) {
         this.appendThrowable(var1, var3.getThrowable());
      }

      if (var3.hasChildren()) {
         Iterator var6 = var3.iterator();

         while(var6.hasNext()) {
            this.buildStr(var1, var2 + "  ", (Status)var6.next());
         }
      }

   }
}
