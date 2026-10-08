package ch.qos.logback.classic.net;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.pattern.SyslogStartConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.net.SyslogAppenderBase;
import ch.qos.logback.core.net.SyslogOutputStream;
import ch.qos.logback.core.pattern.PatternLayoutBase;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SyslogAppender extends SyslogAppenderBase {
   public static final String DEFAULT_SUFFIX_PATTERN = "[%thread] %logger %msg";
   public static final String DEFAULT_STACKTRACE_PATTERN = "\t";
   PatternLayout stackTraceLayout;
   String stackTracePattern;
   boolean throwableExcluded;

   public SyslogAppender() {



      super();
      PatternLayout var1;
      var1 = new PatternLayout();
      this.stackTraceLayout = var1;
      this.stackTracePattern = "\t";
      this.throwableExcluded = false;
   }

   private void handleThrowableFirstLine(OutputStream var1, IThrowableProxy var2, String var3, boolean var4) throws IOException {
      StringBuilder var5 = (new StringBuilder()).append(var3);
      if (!var4) {
         var5.append("Caused by: ");
      }

      var5.append(var2.getClassName()).append(": ").append(var2.getMessage());
      var1.write(var5.toString().getBytes());
      var1.flush();
   }

   private void setupStackTraceLayout() {
      this.stackTraceLayout.getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
      PatternLayout var10002 = this.stackTraceLayout;
      String var10003 = this.getPrefixPattern();
      ((PatternLayoutBase)var10002).setPattern(var10003 + this.stackTracePattern);
      this.stackTraceLayout.setContext(((ContextAwareBase)this).getContext());
      this.stackTraceLayout.start();
   }

   public void start() {
      super.start();
      this.setupStackTraceLayout();
   }

   public String getPrefixPattern() {
      return "%syslogStart{" + ((SyslogAppenderBase)this).getFacility() + "}%nopex{}";
   }

   public SyslogOutputStream createOutputStream() throws UnknownHostException, SocketException {
      String host = this.getSyslogHost();
      return new SyslogOutputStream(host, this.getPort());
   }

   public int getSeverityForEvent(Object var1) {
      return LevelToSyslogSeverity.convert((ILoggingEvent)var1);
   }

   public void postProcess(Object var1, OutputStream var2) {
      if (this.throwableExcluded) {
         return;
      }
      ILoggingEvent event = (ILoggingEvent)var1;
      IThrowableProxy tp = event.getThrowableProxy();
      if (tp == null) {
         return;
      }
      String stackTrace = this.stackTraceLayout.doLayout(event);
      boolean firstLine = true;
      while (tp != null) {
         StackTraceElementProxy[] stepArray = tp.getStackTraceElementProxyArray();
         try {
            this.handleThrowableFirstLine(var2, tp, stackTrace, firstLine);
         } catch (IOException e) {
            return;
         }
         firstLine = false;
         for (int i = 0; i < stepArray.length; i++) {
            try {
               StackTraceElementProxy step = stepArray[i];
               var2.write(new StringBuilder().append(stackTrace).append(step).toString().getBytes());
               var2.flush();
            } catch (IOException e) {
               return;
            }
         }
         tp = tp.getCause();
      }
   }

   public boolean stackTraceHeaderLine(StringBuilder var1, boolean var2) {
      return false;
   }

   public Layout buildLayout() {
      PatternLayout var1;
      PatternLayout var10001 = var1 = new PatternLayout();
      ((PatternLayoutBase)var10001).getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
      if (super.suffixPattern == null) {
         super.suffixPattern = "[%thread] %logger %msg";
      }

      String var10005 = this.getPrefixPattern();
      ((PatternLayoutBase)var1).setPattern(var10005 + super.suffixPattern);
      ((LayoutBase)var1).setContext(((ContextAwareBase)this).getContext());
      ((PatternLayoutBase)var1).start();
      return var1;
   }

   public boolean isThrowableExcluded() {
      return this.throwableExcluded;
   }

   public void setThrowableExcluded(boolean var1) {
      this.throwableExcluded = var1;
   }

   public String getStackTracePattern() {
      return this.stackTracePattern;
   }

   public void setStackTracePattern(String var1) {
      this.stackTracePattern = var1;
   }
}
