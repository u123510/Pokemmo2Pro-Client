package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.LoggerComparator;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.classic.spi.LoggerContextVO;
import ch.qos.logback.classic.spi.TurboFilterList;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.classic.util.LoggerNameUtil;
import ch.qos.logback.core.ContextBase;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.SequenceNumberGenerator;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import f.HA0;
import f.KV;
import f.Sm0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

public class LoggerContext extends ContextBase implements KV, LifeCycle {
   public static final boolean DEFAULT_PACKAGING_DATA = false;
   final Logger root;
   private int size;
   private int noAppenderWarning = 0;
   private final List loggerContextListenerList = new ArrayList();
   private Map loggerCache = new ConcurrentHashMap();
   private LoggerContextVO loggerContextRemoteView = new LoggerContextVO(this);
   private final TurboFilterList turboFilterList = new TurboFilterList();
   private boolean packagingDataEnabled = false;
   SequenceNumberGenerator sequenceNumberGenerator = null;
   Sm0 mdcAdapter;
   private int maxCallerDataDepth = 8;
   int resetCount = 0;
   private List frameworkPackages;

   public LoggerContext() {
      this.loggerCache = new ConcurrentHashMap();
      this.loggerContextRemoteView = new LoggerContextVO(this);
      this.root = new Logger("ROOT", (Logger)null, this);
      this.root.setLevel(Level.DEBUG);
      this.loggerCache.put("ROOT", this.root);
      this.initEvaluatorMap();
      this.size = 1;
      this.frameworkPackages = new ArrayList();
   }

   private void updateLoggerContextVO() {
      this.loggerContextRemoteView = new LoggerContextVO(this);
   }

   private void incSize() {
      ++this.size;
   }

   private void cancelScheduledTasks() {
      Iterator var1 = super.scheduledFutures.iterator();

      while(var1.hasNext()) {
         ((ScheduledFuture)var1.next()).cancel(false);
      }

      super.scheduledFutures.clear();
   }

   private void resetStatusListenersExceptResetResistant() {
      StatusManager var1 = super.getStatusManager();
      Iterator var2 = var1.getCopyOfStatusListenerList().iterator();

      while(var2.hasNext()) {
         StatusListener var3 = (StatusListener)var2.next();
         if (!var3.isResetResistant()) {
            var1.remove(var3);
         }
      }

   }

   private void resetListenersExceptResetResistant() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.loggerContextListenerList.iterator();

      while(var2.hasNext()) {
         LoggerContextListener var3 = (LoggerContextListener)var2.next();
         if (var3.isResetResistant()) {
            var1.add(var3);
         }
      }

      this.loggerContextListenerList.retainAll(var1);
   }

   private void resetAllListeners() {
      this.loggerContextListenerList.clear();
   }

   private void fireOnReset() {
      Iterator var1 = this.loggerContextListenerList.iterator();

      while(var1.hasNext()) {
         ((LoggerContextListener)var1.next()).onReset(this);
      }

   }

   private void fireOnStart() {
      Iterator var1 = this.loggerContextListenerList.iterator();

      while(var1.hasNext()) {
         ((LoggerContextListener)var1.next()).onStart(this);
      }

   }

   private void fireOnStop() {
      Iterator var1 = this.loggerContextListenerList.iterator();

      while(var1.hasNext()) {
         ((LoggerContextListener)var1.next()).onStop(this);
      }

   }

   public void initEvaluatorMap() {
      this.putObject("EVALUATOR_MAP", new HashMap());
   }

   public void putProperty(String var1, String var2) {
      super.putProperty(var1, var2);
      this.updateLoggerContextVO();
   }

   public void setName(String var1) {
      super.setName(var1);
      this.updateLoggerContextVO();
   }

   public final Logger getLogger(Class var1) {
      return this.getLogger(var1.getName());
   }

   public Logger getLogger(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("name argument cannot be null");
      } else if ("ROOT".equalsIgnoreCase(var1)) {
         return this.root;
      } else {
         int var2 = 0;
         Logger var3 = this.root;
         Logger var4 = (Logger)this.loggerCache.get(var1);
         if (var4 != null) {
            return var4;
         }

         while(true) {
            var2 = LoggerNameUtil.getSeparatorIndexOf(var1, var2);
            String var6;
            if (var2 == -1) {
               var6 = var1;
            } else {
               var6 = var1.substring(0, var2);
            }

            int var5 = var2 + 1;
            synchronized(var3) {
               Logger var7 = var3.getChildByName(var6);
               if (var7 == null) {
                  var7 = var3.createChildByName(var6);
                  this.loggerCache.put(var6, var7);
                  this.incSize();
               }

               var4 = var7;
            }

            if (var2 == -1) {
               return var4;
            }

            var2 = var5;
            var3 = var4;
         }
      }
   }

   public int size() {
      return this.size;
   }

   public Logger exists(String var1) {
      return (Logger)this.loggerCache.get(var1);
   }

   public final void noAppenderDefinedWarning(Logger var1) {
      if (this.noAppenderWarning++ == 0) {
         super.getStatusManager().add(new WarnStatus("No appenders present in context [" + super.getName() + "] for logger [" + var1.getName() + "].", var1));
      }

   }

   public List getLoggerList() {
      Collection var1 = this.loggerCache.values();
      ArrayList var2 = new ArrayList(var1);
      Collections.sort(var2, new LoggerComparator());
      return var2;
   }

   public LoggerContextVO getLoggerContextRemoteView() {
      return this.loggerContextRemoteView;
   }

   public void setPackagingDataEnabled(boolean var1) {
      this.packagingDataEnabled = var1;
   }

   public boolean isPackagingDataEnabled() {
      return this.packagingDataEnabled;
   }

   public TurboFilterList getTurboFilterList() {
      return this.turboFilterList;
   }

   public void addTurboFilter(TurboFilter var1) {
      this.turboFilterList.add(var1);
   }

   public void resetTurboFilterList() {
      Iterator var1 = this.turboFilterList.iterator();

      while(var1.hasNext()) {
         ((TurboFilter)var1.next()).stop();
      }

      this.turboFilterList.clear();
   }

   public final FilterReply getTurboFilterChainDecision_0_3OrMore(HA0 var1, Logger var2, Level var3, String var4, Object[] var5, Throwable var6) {
      return this.turboFilterList.size() == 0 ? FilterReply.NEUTRAL : this.turboFilterList.getTurboFilterChainDecision(var1, var2, var3, var4, var5, var6);
   }

   public final FilterReply getTurboFilterChainDecision_1(HA0 var1, Logger var2, Level var3, String var4, Object var5, Throwable var6) {
      if (this.turboFilterList.size() == 0) {
         return FilterReply.NEUTRAL;
      } else {
         Object[] var7 = new Object[]{var5};
         return this.turboFilterList.getTurboFilterChainDecision(var1, var2, var3, var4, var7, var6);
      }
   }

   public final FilterReply getTurboFilterChainDecision_2(HA0 var1, Logger var2, Level var3, String var4, Object var5, Object var6, Throwable var7) {
      if (this.turboFilterList.size() == 0) {
         return FilterReply.NEUTRAL;
      } else {
         Object[] var8 = new Object[]{var5, var6};
         return this.turboFilterList.getTurboFilterChainDecision(var1, var2, var3, var4, var8, var7);
      }
   }

   public void addListener(LoggerContextListener var1) {
      this.loggerContextListenerList.add(var1);
   }

   public void removeListener(LoggerContextListener var1) {
      this.loggerContextListenerList.remove(var1);
   }

   public List getCopyOfListenerList() {
      return new ArrayList(this.loggerContextListenerList);
   }

   public void fireOnLevelChange(Logger var1, Level var2) {
      Iterator var3 = this.loggerContextListenerList.iterator();

      while(var3.hasNext()) {
         ((LoggerContextListener)var3.next()).onLevelChange(var1, var2);
      }

   }

   public void start() {
      super.start();
      this.fireOnStart();
   }

   public void stop() {
      this.reset();
      this.fireOnStop();
      this.resetAllListeners();
      super.stop();
   }

   public void reset() {
      ++this.resetCount;
      super.reset();
      this.initEvaluatorMap();
      super.initCollisionMaps();
      this.root.recursiveReset();
      this.resetTurboFilterList();
      this.cancelScheduledTasks();
      this.fireOnReset();
      this.resetListenersExceptResetResistant();
      this.resetStatusListenersExceptResetResistant();
   }

   public String toString() {
      return this.getClass().getName() + "[" + super.getName() + "]";
   }

   public int getMaxCallerDataDepth() {
      return this.maxCallerDataDepth;
   }

   public void setMaxCallerDataDepth(int var1) {
      this.maxCallerDataDepth = var1;
   }

   public List getFrameworkPackages() {
      return this.frameworkPackages;
   }

   public void setSequenceNumberGenerator(SequenceNumberGenerator var1) {
      this.sequenceNumberGenerator = var1;
   }

   public SequenceNumberGenerator getSequenceNumberGenerator() {
      return this.sequenceNumberGenerator;
   }

   public Sm0 getMDCAdapter() {
      return this.mdcAdapter;
   }

   public void setMDCAdapter(Sm0 var1) {
      if (this.mdcAdapter != null) {
         super.getStatusManager().add(new WarnStatus("mdcAdapter being reset a second time", this));
      }

      this.mdcAdapter = var1;
   }
}
