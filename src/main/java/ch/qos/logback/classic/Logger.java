package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.util.LoggerNameUtil;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import f.Cq0;
import f.HA0;
import f.P4;
import f.am0_1;
import f.bj_2;
import f.ce_1;
import f.dl_1;
import f.lw_0;
import f.t4_0;
import f.z50_0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class Logger implements dl_1, ce_1, AppenderAttachable, Serializable {
   private static final long serialVersionUID = 5454405123156820674L;
   public static final String FQCN = "ch.qos.logback.classic.Logger";
   private String name;
   private transient Level level;
   private transient int effectiveLevelInt;
   private transient Logger parent;
   private transient List childrenList;
   private transient AppenderAttachableImpl aai;
   private transient boolean additive = true;
   final transient LoggerContext loggerContext;

   public Level getEffectiveLevel() {
      return Level.toLevel(this.effectiveLevelInt);
   }

   public int getEffectiveLevelInt() {
      return this.effectiveLevelInt;
   }

   public Level getLevel() {
      return this.level;
   }

   public String getName() {
      return this.name;
   }

   public Logger getChildByName(String var1) {
      List var2;
      if ((var2 = this.childrenList) == null) {
         return null;
      } else {
         int var5 = var2.size();

         for(int var3 = 0; var3 < var5; ++var3) {
            Logger var4;
            if (var1.equals((var4 = (Logger)this.childrenList.get(var3)).getName())) {
               return var4;
            }
         }

         return null;
      }
   }

   public synchronized void setLevel(Level var1) {
      if (this.level != var1) {
         if (var1 == null && this.isRootLogger()) {
            throw new IllegalArgumentException("The level of the root logger cannot be set to null");
         } else {
            this.level = var1;
            if (var1 == null) {
               Logger var10000 = this.parent;
               this.effectiveLevelInt = this.effectiveLevelInt;
               var1 = this.getEffectiveLevel();
            } else {
               this.effectiveLevelInt = var1.levelInt;
            }

            List var2;
            if ((var2 = this.childrenList) != null) {
               int var4 = var2.size();

               for(int var3 = 0; var3 < var4; ++var3) {
                  ((Logger)this.childrenList.get(var3)).handleParentLevelChange(this.effectiveLevelInt);
               }
            }

            this.loggerContext.fireOnLevelChange(this, var1);
         }
      }
   }

   public void detachAndStopAllAppenders() {
      AppenderAttachableImpl var1;
      if ((var1 = this.aai) != null) {
         var1.detachAndStopAllAppenders();
      }

   }

   public boolean detachAppender(String var1) {
      AppenderAttachableImpl var2;
      return (var2 = this.aai) == null ? false : var2.detachAppender(var1);
   }

   public synchronized void addAppender(Appender var1) {
      if (this.aai == null) {
         AppenderAttachableImpl var2;
         var2 = new AppenderAttachableImpl();
         this.aai = var2;
      }

      this.aai.addAppender(var1);
   }

   public boolean isAttached(Appender var1) {
      AppenderAttachableImpl var2;
      return (var2 = this.aai) == null ? false : var2.isAttached(var1);
   }

   public Iterator iteratorForAppenders() {
      AppenderAttachableImpl var1;
      return (var1 = this.aai) == null ? Collections.EMPTY_LIST.iterator() : var1.iteratorForAppenders();
   }

   public Appender getAppender(String var1) {
      AppenderAttachableImpl var2;
      return (var2 = this.aai) == null ? null : var2.getAppender(var1);
   }

   public void callAppenders(ILoggingEvent var1) {
      int var2 = 0;

      for(Logger var3 = this; var3 != null; var3 = var3.parent) {
         var2 += var3.appendLoopOnAppenders(var1);
         if (!var3.additive) {
            break;
         }
      }

      if (var2 == 0) {
         this.loggerContext.noAppenderDefinedWarning(this);
      }

   }

   public boolean detachAppender(Appender var1) {
      AppenderAttachableImpl var2;
      return (var2 = this.aai) == null ? false : var2.detachAppender(var1);
   }

   public Logger createChildByLastNamePart(String var1) {
      if (LoggerNameUtil.getFirstSeparatorIndexOf(var1) == -1) {
         if (this.childrenList == null) {
            CopyOnWriteArrayList var2;
            var2 = new CopyOnWriteArrayList();
            this.childrenList = var2;
         }

         Logger var5;
         if (this.isRootLogger()) {
            var5 = new Logger(var1, this, this.loggerContext);
         } else {
            var1 = this.name + "." + var1;
            var5 = new Logger(var1, this, this.loggerContext);
         }

         this.childrenList.add(var5);
         var5.effectiveLevelInt = this.effectiveLevelInt;
         return var5;
      } else {
         throw new IllegalArgumentException("Child name [" + var1 + " passed as parameter, may not include [.]");
      }
   }

   public void recursiveReset() {
      this.detachAndStopAllAppenders();
      this.localLevelReset();
      this.additive = true;
      List var1;
      if ((var1 = this.childrenList) != null) {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            ((Logger)var2.next()).recursiveReset();
         }

      }
   }

   public Logger createChildByName(String var1) {
      if (LoggerNameUtil.getSeparatorIndexOf(var1, this.name.length() + 1) == -1) {
         if (this.childrenList == null) {
            CopyOnWriteArrayList var2;
            var2 = new CopyOnWriteArrayList();
            this.childrenList = var2;
         }

         Logger var3;
         Logger var10000 = var3 = new Logger(var1, this, this.loggerContext);
         this.childrenList.add(var3);
         var3.effectiveLevelInt = this.effectiveLevelInt;
         return var10000;
      } else {
         String var10002 = this.name;
         throw new IllegalArgumentException("For logger [" + var10002 + "] child name [" + var1 + " passed as parameter, may not include '.' after index" + (this.name.length() + 1));
      }
   }

   public void trace(String var1) {

      String var3 = FQCN;
      Level var2 = Level.TRACE;
      this.filterAndLog_0_Or3Plus(var3, (HA0)null, var2, var1, (Object[])null, (Throwable)null);
   }

   public void trace(String var1, Object var2) {

      String var4 = FQCN;
      Level var3 = Level.TRACE;
      this.filterAndLog_1(var4, (HA0)null, var3, var1, var2, (Throwable)null);
   }

   public void trace(String var1, Object var2, Object var3) {

      String var5 = FQCN;
      Level var4 = Level.TRACE;
      this.filterAndLog_2(var5, (HA0)null, var4, var1, var2, var3, (Throwable)null);
   }

   public void trace(String var1, Object... var2) {

      String var4 = FQCN;
      Level var3 = Level.TRACE;
      this.filterAndLog_0_Or3Plus(var4, (HA0)null, var3, var1, var2, (Throwable)null);
   }

   public void trace(String var1, Throwable var2) {

      String var4 = FQCN;
      Level var3 = Level.TRACE;
      this.filterAndLog_0_Or3Plus(var4, (HA0)null, var3, var1, (Object[])null, var2);
   }

   public void trace(HA0 var1, String var2) {

      String var4 = FQCN;
      Level var3 = Level.TRACE;
      this.filterAndLog_0_Or3Plus(var4, var1, var3, var2, (Object[])null, (Throwable)null);
   }

   public void trace(HA0 var1, String var2, Object var3) {

      String var5 = FQCN;
      Level var4 = Level.TRACE;
      this.filterAndLog_1(var5, var1, var4, var2, var3, (Throwable)null);
   }

   public void trace(HA0 var1, String var2, Object var3, Object var4) {

      String var6 = FQCN;
      Level var5 = Level.TRACE;
      this.filterAndLog_2(var6, var1, var5, var2, var3, var4, (Throwable)null);
   }

   public void trace(HA0 var1, String var2, Object... var3) {

      String var5 = FQCN;
      Level var4 = Level.TRACE;
      this.filterAndLog_0_Or3Plus(var5, var1, var4, var2, var3, (Throwable)null);
   }

   public void trace(HA0 var1, String var2, Throwable var3) {

      String var5 = FQCN;
      Level var4 = Level.TRACE;
      this.filterAndLog_0_Or3Plus(var5, var1, var4, var2, (Object[])null, var3);
   }

   public boolean isDebugEnabled() {
      return this.isDebugEnabled((HA0)null);
   }

   public boolean isDebugEnabled(HA0 var1) {
      FilterReply var2;
      if ((var2 = this.callTurboFilters(var1, Level.DEBUG)) == FilterReply.NEUTRAL) {
         return this.effectiveLevelInt <= 10000;
      } else if (var2 == FilterReply.DENY) {
         return false;
      } else if (var2 == FilterReply.ACCEPT) {
         return true;
      } else {
         throw new IllegalStateException("Unknown FilterReply value: " + String.valueOf(var2));
      }
   }

   public void debug(String var1) {

      String var3 = FQCN;
      Level var2 = Level.DEBUG;
      this.filterAndLog_0_Or3Plus(var3, (HA0)null, var2, var1, (Object[])null, (Throwable)null);
   }

   public void debug(String var1, Object var2) {

      String var4 = FQCN;
      Level var3 = Level.DEBUG;
      this.filterAndLog_1(var4, (HA0)null, var3, var1, var2, (Throwable)null);
   }

   public void debug(String var1, Object var2, Object var3) {

      String var5 = FQCN;
      Level var4 = Level.DEBUG;
      this.filterAndLog_2(var5, (HA0)null, var4, var1, var2, var3, (Throwable)null);
   }

   public void debug(String var1, Object... var2) {

      String var4 = FQCN;
      Level var3 = Level.DEBUG;
      this.filterAndLog_0_Or3Plus(var4, (HA0)null, var3, var1, var2, (Throwable)null);
   }

   public void debug(String var1, Throwable var2) {

      String var4 = FQCN;
      Level var3 = Level.DEBUG;
      this.filterAndLog_0_Or3Plus(var4, (HA0)null, var3, var1, (Object[])null, var2);
   }

   public void debug(HA0 var1, String var2) {

      String var4 = FQCN;
      Level var3 = Level.DEBUG;
      this.filterAndLog_0_Or3Plus(var4, var1, var3, var2, (Object[])null, (Throwable)null);
   }

   public void debug(HA0 var1, String var2, Object var3) {

      String var5 = FQCN;
      Level var4 = Level.DEBUG;
      this.filterAndLog_1(var5, var1, var4, var2, var3, (Throwable)null);
   }

   public void debug(HA0 var1, String var2, Object var3, Object var4) {

      String var6 = FQCN;
      Level var5 = Level.DEBUG;
      this.filterAndLog_2(var6, var1, var5, var2, var3, var4, (Throwable)null);
   }

   public void debug(HA0 var1, String var2, Object... var3) {

      String var5 = FQCN;
      Level var4 = Level.DEBUG;
      this.filterAndLog_0_Or3Plus(var5, var1, var4, var2, var3, (Throwable)null);
   }

   public void debug(HA0 var1, String var2, Throwable var3) {

      String var5 = FQCN;
      Level var4 = Level.DEBUG;
      this.filterAndLog_0_Or3Plus(var5, var1, var4, var2, (Object[])null, var3);
   }

   public void error(String var1) {

      String var3 = FQCN;
      Level var2 = Level.ERROR;
      this.filterAndLog_0_Or3Plus(var3, (HA0)null, var2, var1, (Object[])null, (Throwable)null);
   }

   public void error(String var1, Object var2) {

      String var4 = FQCN;
      Level var3 = Level.ERROR;
      this.filterAndLog_1(var4, (HA0)null, var3, var1, var2, (Throwable)null);
   }

   public void error(String var1, Object var2, Object var3) {

      String var5 = FQCN;
      Level var4 = Level.ERROR;
      this.filterAndLog_2(var5, (HA0)null, var4, var1, var2, var3, (Throwable)null);
   }

   public void error(String var1, Object... var2) {

      String var4 = FQCN;
      Level var3 = Level.ERROR;
      this.filterAndLog_0_Or3Plus(var4, (HA0)null, var3, var1, var2, (Throwable)null);
   }

   public void error(String var1, Throwable var2) {

      String var4 = FQCN;
      Level var3 = Level.ERROR;
      this.filterAndLog_0_Or3Plus(var4, (HA0)null, var3, var1, (Object[])null, var2);
   }

   public void error(HA0 var1, String var2) {

      String var4 = FQCN;
      Level var3 = Level.ERROR;
      this.filterAndLog_0_Or3Plus(var4, var1, var3, var2, (Object[])null, (Throwable)null);
   }

   public void error(HA0 var1, String var2, Object var3) {

      String var5 = FQCN;
      Level var4 = Level.ERROR;
      this.filterAndLog_1(var5, var1, var4, var2, var3, (Throwable)null);
   }

   public void error(HA0 var1, String var2, Object var3, Object var4) {

      String var6 = FQCN;
      Level var5 = Level.ERROR;
      this.filterAndLog_2(var6, var1, var5, var2, var3, var4, (Throwable)null);
   }

   public void error(HA0 var1, String var2, Object... var3) {

      String var5 = FQCN;
      Level var4 = Level.ERROR;
      this.filterAndLog_0_Or3Plus(var5, var1, var4, var2, var3, (Throwable)null);
   }

   public void error(HA0 var1, String var2, Throwable var3) {

      String var5 = FQCN;
      Level var4 = Level.ERROR;
      this.filterAndLog_0_Or3Plus(var5, var1, var4, var2, (Object[])null, var3);
   }

   public boolean isInfoEnabled() {
      return this.isInfoEnabled((HA0)null);
   }

   public boolean isInfoEnabled(HA0 var1) {
      FilterReply var2;
      if ((var2 = this.callTurboFilters(var1, Level.INFO)) == FilterReply.NEUTRAL) {
         return this.effectiveLevelInt <= 20000;
      } else if (var2 == FilterReply.DENY) {
         return false;
      } else if (var2 == FilterReply.ACCEPT) {
         return true;
      } else {
         throw new IllegalStateException("Unknown FilterReply value: " + String.valueOf(var2));
      }
   }

   public void info(String var1) {

      String var3 = FQCN;
      Level var2 = Level.INFO;
      this.filterAndLog_0_Or3Plus(var3, (HA0)null, var2, var1, (Object[])null, (Throwable)null);
   }

   public void info(String var1, Object var2) {

      String var4 = FQCN;
      Level var3 = Level.INFO;
      this.filterAndLog_1(var4, (HA0)null, var3, var1, var2, (Throwable)null);
   }

   public void info(String var1, Object var2, Object var3) {

      String var5 = FQCN;
      Level var4 = Level.INFO;
      this.filterAndLog_2(var5, (HA0)null, var4, var1, var2, var3, (Throwable)null);
   }

   public void info(String var1, Object... var2) {

      String var4 = FQCN;
      Level var3 = Level.INFO;
      this.filterAndLog_0_Or3Plus(var4, (HA0)null, var3, var1, var2, (Throwable)null);
   }

   public void info(String var1, Throwable var2) {

      String var4 = FQCN;
      Level var3 = Level.INFO;
      this.filterAndLog_0_Or3Plus(var4, (HA0)null, var3, var1, (Object[])null, var2);
   }

   public void info(HA0 var1, String var2) {

      String var4 = FQCN;
      Level var3 = Level.INFO;
      this.filterAndLog_0_Or3Plus(var4, var1, var3, var2, (Object[])null, (Throwable)null);
   }

   public void info(HA0 var1, String var2, Object var3) {

      String var5 = FQCN;
      Level var4 = Level.INFO;
      this.filterAndLog_1(var5, var1, var4, var2, var3, (Throwable)null);
   }

   public void info(HA0 var1, String var2, Object var3, Object var4) {

      String var6 = FQCN;
      Level var5 = Level.INFO;
      this.filterAndLog_2(var6, var1, var5, var2, var3, var4, (Throwable)null);
   }

   public void info(HA0 var1, String var2, Object... var3) {

      String var5 = FQCN;
      Level var4 = Level.INFO;
      this.filterAndLog_0_Or3Plus(var5, var1, var4, var2, var3, (Throwable)null);
   }

   public void info(HA0 var1, String var2, Throwable var3) {

      String var5 = FQCN;
      Level var4 = Level.INFO;
      this.filterAndLog_0_Or3Plus(var5, var1, var4, var2, (Object[])null, var3);
   }

   public boolean isTraceEnabled() {
      return this.isTraceEnabled((HA0)null);
   }

   public boolean isTraceEnabled(HA0 var1) {
      FilterReply var2;
      if ((var2 = this.callTurboFilters(var1, Level.TRACE)) == FilterReply.NEUTRAL) {
         return this.effectiveLevelInt <= 5000;
      } else if (var2 == FilterReply.DENY) {
         return false;
      } else if (var2 == FilterReply.ACCEPT) {
         return true;
      } else {
         throw new IllegalStateException("Unknown FilterReply value: " + String.valueOf(var2));
      }
   }

   public boolean isErrorEnabled() {
      return this.isErrorEnabled((HA0)null);
   }

   public boolean isErrorEnabled(HA0 var1) {
      FilterReply var2;
      if ((var2 = this.callTurboFilters(var1, Level.ERROR)) == FilterReply.NEUTRAL) {
         return this.effectiveLevelInt <= 40000;
      } else if (var2 == FilterReply.DENY) {
         return false;
      } else if (var2 == FilterReply.ACCEPT) {
         return true;
      } else {
         throw new IllegalStateException("Unknown FilterReply value: " + String.valueOf(var2));
      }
   }

   public boolean isWarnEnabled() {
      return this.isWarnEnabled((HA0)null);
   }

   public boolean isWarnEnabled(HA0 var1) {
      FilterReply var2;
      if ((var2 = this.callTurboFilters(var1, Level.WARN)) == FilterReply.NEUTRAL) {
         return this.effectiveLevelInt <= 30000;
      } else if (var2 == FilterReply.DENY) {
         return false;
      } else if (var2 == FilterReply.ACCEPT) {
         return true;
      } else {
         throw new IllegalStateException("Unknown FilterReply value: " + String.valueOf(var2));
      }
   }

   public boolean isEnabledFor(HA0 var1, Level var2) {
      FilterReply var3;
      if ((var3 = this.callTurboFilters(var1, var2)) == FilterReply.NEUTRAL) {
         return this.effectiveLevelInt <= var2.levelInt;
      } else if (var3 == FilterReply.DENY) {
         return false;
      } else if (var3 == FilterReply.ACCEPT) {
         return true;
      } else {
         throw new IllegalStateException("Unknown FilterReply value: " + String.valueOf(var3));
      }
   }

   public boolean isEnabledFor(Level var1) {
      return this.isEnabledFor((HA0)null, var1);
   }

   public void warn(String var1) {

      String var3 = FQCN;
      Level var2 = Level.WARN;
      this.filterAndLog_0_Or3Plus(var3, (HA0)null, var2, var1, (Object[])null, (Throwable)null);
   }

   public void warn(String var1, Throwable var2) {

      String var4 = FQCN;
      Level var3 = Level.WARN;
      this.filterAndLog_0_Or3Plus(var4, (HA0)null, var3, var1, (Object[])null, var2);
   }

   public void warn(String var1, Object var2) {

      String var4 = FQCN;
      Level var3 = Level.WARN;
      this.filterAndLog_1(var4, (HA0)null, var3, var1, var2, (Throwable)null);
   }

   public void warn(String var1, Object var2, Object var3) {

      String var5 = FQCN;
      Level var4 = Level.WARN;
      this.filterAndLog_2(var5, (HA0)null, var4, var1, var2, var3, (Throwable)null);
   }

   public void warn(String var1, Object... var2) {

      String var4 = FQCN;
      Level var3 = Level.WARN;
      this.filterAndLog_0_Or3Plus(var4, (HA0)null, var3, var1, var2, (Throwable)null);
   }

   public void warn(HA0 var1, String var2) {

      String var4 = FQCN;
      Level var3 = Level.WARN;
      this.filterAndLog_0_Or3Plus(var4, var1, var3, var2, (Object[])null, (Throwable)null);
   }

   public void warn(HA0 var1, String var2, Object var3) {

      String var5 = FQCN;
      Level var4 = Level.WARN;
      this.filterAndLog_1(var5, var1, var4, var2, var3, (Throwable)null);
   }

   public void warn(HA0 var1, String var2, Object... var3) {

      String var5 = FQCN;
      Level var4 = Level.WARN;
      this.filterAndLog_0_Or3Plus(var5, var1, var4, var2, var3, (Throwable)null);
   }

   public void warn(HA0 var1, String var2, Object var3, Object var4) {

      String var6 = FQCN;
      Level var5 = Level.WARN;
      this.filterAndLog_2(var6, var1, var5, var2, var3, var4, (Throwable)null);
   }

   public void warn(HA0 var1, String var2, Throwable var3) {

      String var5 = FQCN;
      Level var4 = Level.WARN;
      this.filterAndLog_0_Or3Plus(var5, var1, var4, var2, (Object[])null, var3);
   }

   public boolean isAdditive() {
      return this.additive;
   }

   public void setAdditive(boolean var1) {
      this.additive = var1;
   }

   public String toString() {
      return "Logger[" + this.name + "]";
   }

   public LoggerContext getLoggerContext() {
      return this.loggerContext;
   }

   public am0_1 makeLoggingEventBuilder(bj_2 var1) {
      return new z50_0();
   }

   public void log(HA0 var1, String var2, int var3, String var4, Object[] var5, Throwable var6) {

      Level var7 = Level.fromLocationAwareLoggerInteger(var3);
      this.filterAndLog_0_Or3Plus(var2, var1, var7, var4, var5, var6);
   }

   public void log(P4 var1) {
      t4_0 var10000 = (t4_0)var1;
      t4_0 var6;
      Level var2 = Level.convertAnSLF4JLevel((var6 = (t4_0)var1).fw0);
      String var3 = FQCN;
      LoggingEvent var4;
      LoggingEvent var10001 = var4 = new LoggingEvent();
      String var10002 = var3;
      t4_0 var10003 = var6;
      t4_0 var10004 = var6;
      String var7 = var6.XG;
      Throwable var9 = var6.tM;
      Object[] var5 = var6.J5;

      ArrayList var8;
      if ((var8 = var6.wj0) != null) {
         var8.forEach((var1x) -> var4.addMarker((HA0)var1x));
      }

      var4.setKeyValuePairs((List)null);
      this.callAppenders(var4);
   }

   public Object readResolve() {
      return Cq0.t00(this.getName());
   }

   public am0_1 atLevel(bj_2 var1) {
      return (am0_1)(this.isEnabledForLevel(var1) ? this.makeLoggingEventBuilder(var1) : lw_0.qV);
   }

   public am0_1 atTrace() {
      return (am0_1)(this.isTraceEnabled() ? this.makeLoggingEventBuilder(bj_2.qu) : lw_0.qV);
   }

   public am0_1 atDebug() {
      return (am0_1)(this.isDebugEnabled() ? this.makeLoggingEventBuilder(bj_2.LU) : lw_0.qV);
   }

   public am0_1 atInfo() {
      return (am0_1)(this.isInfoEnabled() ? this.makeLoggingEventBuilder(bj_2.LPT2) : lw_0.qV);
   }

   public am0_1 atWarn() {
      return (am0_1)(this.isWarnEnabled() ? this.makeLoggingEventBuilder(bj_2.SM) : lw_0.qV);
   }

   public am0_1 atError() {
      return (am0_1)(this.isErrorEnabled() ? this.makeLoggingEventBuilder(bj_2.f90) : lw_0.qV);
   }

   public Logger(String var1, Logger var2, LoggerContext var3) {
      this.name = var1;
      this.parent = var2;
      this.loggerContext = var3;
   }

   private boolean isRootLogger() {
      return this.parent == null;
   }

   private synchronized void handleParentLevelChange(int var1) {
      if (this.level == null) {
         this.effectiveLevelInt = var1;
         List var2;
         if ((var2 = this.childrenList) != null) {
            int var4 = var2.size();

            for(int var3 = 0; var3 < var4; ++var3) {
               ((Logger)this.childrenList.get(var3)).handleParentLevelChange(var1);
            }
         }
      }

   }

   private int appendLoopOnAppenders(ILoggingEvent var1) {
      AppenderAttachableImpl var2;
      return (var2 = this.aai) != null ? var2.appendLoopOnAppenders(var1) : 0;
   }

   private void localLevelReset() {
      this.effectiveLevelInt = 10000;
      if (this.isRootLogger()) {
         this.level = Level.DEBUG;
      } else {
         this.level = null;
      }

   }

   private void filterAndLog_0_Or3Plus(String var1, HA0 var2, Level var3, String var4, Object[] var5, Throwable var6) {
      FilterReply var7;
      if ((var7 = this.loggerContext.getTurboFilterChainDecision_0_3OrMore(var2, this, var3, var4, var5, var6)) == FilterReply.NEUTRAL) {
         if (this.effectiveLevelInt > var3.levelInt) {
            return;
         }
      } else if (var7 == FilterReply.DENY) {
         return;
      }

      this.buildLoggingEventAndAppend(var1, var2, var3, var4, var5, var6);
   }

   private void filterAndLog_1(String var1, HA0 var2, Level var3, String var4, Object var5, Throwable var6) {
      FilterReply var7;
      if ((var7 = this.loggerContext.getTurboFilterChainDecision_1(var2, this, var3, var4, var5, var6)) == FilterReply.NEUTRAL) {
         if (this.effectiveLevelInt > var3.levelInt) {
            return;
         }
      } else if (var7 == FilterReply.DENY) {
         return;
      }

      Object[] var8;
      (var8 = new Object[1])[0] = var5;
      this.buildLoggingEventAndAppend(var1, var2, var3, var4, var8, var6);
   }

   private void filterAndLog_2(String var1, HA0 var2, Level var3, String var4, Object var5, Object var6, Throwable var7) {
      FilterReply var8;
      if ((var8 = this.loggerContext.getTurboFilterChainDecision_2(var2, this, var3, var4, var5, var6, var7)) == FilterReply.NEUTRAL) {
         if (this.effectiveLevelInt > var3.levelInt) {
            return;
         }
      } else if (var8 == FilterReply.DENY) {
         return;
      }

      Object[] var9;
      Object[] var10001 = var9 = new Object[2];
      var10001[0] = var5;
      var10001[1] = var6;
      this.buildLoggingEventAndAppend(var1, var2, var3, var4, var9, var7);
   }

   private void buildLoggingEventAndAppend(String var1, HA0 var2, Level var3, String var4, Object[] var5, Throwable var6) {
      LoggingEvent var7;
      LoggingEvent var10001 = var7 = new LoggingEvent(var1, this, var3, var4, var6, var5);
      var7.addMarker(var2);
      this.callAppenders(var7);
   }

   private FilterReply callTurboFilters(HA0 var1, Level var2) {
      return this.loggerContext.getTurboFilterChainDecision_0_3OrMore(var1, this, var2, (String)null, (Object[])null, (Throwable)null);
   }
}
