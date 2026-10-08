package ch.qos.logback.core;

import ch.qos.logback.core.spi.ConfigurationEvent;
import ch.qos.logback.core.spi.ConfigurationEventListener;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.LogbackLock;
import ch.qos.logback.core.spi.SequenceNumberGenerator;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.ExecutorServiceUtil;
import ch.qos.logback.core.util.NetworkAddressUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;

public class ContextBase implements Context, LifeCycle {
   private long birthTime = System.currentTimeMillis();
   private String name;
   private StatusManager sm = new BasicStatusManager();
   Map propertyMap = new HashMap();
   Map objectMap = new ConcurrentHashMap();
   LogbackLock configurationLock = new LogbackLock();
   private final List configurationEventListenerList = new CopyOnWriteArrayList();
   private ScheduledExecutorService scheduledExecutorService;
   private ThreadPoolExecutor threadPoolExecutor;
   private ExecutorService alternateExecutorService;
   protected List scheduledFutures = new ArrayList(1);
   private LifeCycleManager lifeCycleManager;
   private SequenceNumberGenerator sequenceNumberGenerator;
   private boolean started;

   public ContextBase() {
      this.initCollisionMaps();
   }

   private String lazyGetHostname() {
      String var1;
      if ((var1 = (String)this.propertyMap.get("HOSTNAME")) == null) {
         this.putHostnameProperty(var1 = (new NetworkAddressUtil(this)).safelyGetLocalHostName());
      }

      return var1;
   }

   private void putHostnameProperty(String var1) {
      if ((String)this.propertyMap.get("HOSTNAME") == null) {
         this.propertyMap.put("HOSTNAME", var1);
      }

   }

   private synchronized void stopExecutorServices() {
      ExecutorServiceUtil.shutdown(this.scheduledExecutorService);
      this.scheduledExecutorService = null;
      ExecutorServiceUtil.shutdown(this.threadPoolExecutor);
      this.threadPoolExecutor = null;
   }

   private void removeShutdownHook() {
      Thread var1 = (Thread)this.getObject("SHUTDOWN_HOOK");
      if (var1 != null) {
         this.removeObject("SHUTDOWN_HOOK");

         try {
            this.sm.add(new InfoStatus("Removing shutdownHook " + String.valueOf(var1), this));
            boolean var4 = Runtime.getRuntime().removeShutdownHook(var1);
            this.sm.add(new InfoStatus("ShutdownHook removal result: " + var4, this));
         } catch (IllegalStateException var3) {
         }
      }

   }

   public StatusManager getStatusManager() {
      return this.sm;
   }

   public void setStatusManager(StatusManager var1) {
      if (var1 != null) {
         this.sm = var1;
      } else {
         throw new IllegalArgumentException("null StatusManager not allowed");
      }
   }

   public Map getCopyOfPropertyMap() {
      return new HashMap(this.propertyMap);
   }

   public void putProperty(String var1, String var2) {
      if ("HOSTNAME".equalsIgnoreCase(var1)) {
         this.putHostnameProperty(var2);
      } else {
         this.propertyMap.put(var1, var2);
      }

   }

   public void initCollisionMaps() {


      HashMap var1;
      var1 = new HashMap();
      this.putObject("FA_FILENAMES_MAP", var1);
      var1 = new HashMap();
      this.putObject("RFA_FILENAME_PATTERN_COLLISION_MAP", var1);
   }

   public void addSubstitutionProperty(String var1, String var2) {
      if (var1 != null && var2 != null) {

         String var3 = var2.trim();
         this.propertyMap.put(var1, var3);
      }
   }

   public String getProperty(String var1) {
      if ("CONTEXT_NAME".equals(var1)) {
         return this.getName();
      } else {
         return "HOSTNAME".equalsIgnoreCase(var1) ? this.lazyGetHostname() : (String)this.propertyMap.get(var1);
      }
   }

   public Object getObject(String var1) {
      return this.objectMap.get(var1);
   }

   public void putObject(String var1, Object var2) {
      this.objectMap.put(var1, var2);
   }

   public void removeObject(String var1) {
      this.objectMap.remove(var1);
   }

   public String getName() {
      return this.name;
   }

   public void start() {
      this.started = true;
   }

   public void stop() {
      this.stopExecutorServices();
      this.started = false;
   }

   public boolean isStarted() {
      return this.started;
   }

   public void reset() {
      this.removeShutdownHook();
      this.getLifeCycleManager().reset();
      this.propertyMap.clear();
      this.objectMap.clear();
   }

   public void setName(String var1) {
      if (var1 == null || !var1.equals(this.name)) {
         String var2;
         if ((var2 = this.name) != null && !"default".equals(var2)) {
            throw new IllegalStateException("Context has been already given a name");
         } else {
            this.name = var1;
         }
      }
   }

   public long getBirthTime() {
      return this.birthTime;
   }

   public Object getConfigurationLock() {
      return this.configurationLock;
   }

   public synchronized ExecutorService getExecutorService() {
      if (this.threadPoolExecutor == null) {
         this.threadPoolExecutor = ExecutorServiceUtil.newThreadPoolExecutor();
      }

      return this.threadPoolExecutor;
   }

   public synchronized ExecutorService getAlternateExecutorService() {
      if (this.alternateExecutorService == null) {
         this.alternateExecutorService = ExecutorServiceUtil.newAlternateThreadPoolExecutor();
      }

      return this.alternateExecutorService;
   }

   public synchronized ScheduledExecutorService getScheduledExecutorService() {
      if (this.scheduledExecutorService == null) {
         this.scheduledExecutorService = ExecutorServiceUtil.newScheduledExecutorService();
      }

      return this.scheduledExecutorService;
   }

   public void register(LifeCycle var1) {
      this.getLifeCycleManager().register(var1);
   }

   public synchronized LifeCycleManager getLifeCycleManager() {
      if (this.lifeCycleManager == null) {
         LifeCycleManager var1;
         var1 = new LifeCycleManager();
         this.lifeCycleManager = var1;
      }

      return this.lifeCycleManager;
   }

   public String toString() {
      return this.name;
   }

   public void addScheduledFuture(ScheduledFuture var1) {
      this.scheduledFutures.add(var1);
   }

   /** @deprecated */
   @Deprecated
   public List getScheduledFutures() {
      return this.getCopyOfScheduledFutures();
   }

   public List getCopyOfScheduledFutures() {
      return new ArrayList(this.scheduledFutures);
   }

   public SequenceNumberGenerator getSequenceNumberGenerator() {
      return this.sequenceNumberGenerator;
   }

   public void setSequenceNumberGenerator(SequenceNumberGenerator var1) {
      this.sequenceNumberGenerator = var1;
   }

   public void addConfigurationEventListener(ConfigurationEventListener var1) {
      this.configurationEventListenerList.add(var1);
   }

   public void fireConfigurationEvent(ConfigurationEvent var1) {
      this.configurationEventListenerList.forEach((var1x) -> ((ConfigurationEventListener) var1x).listen(var1));
   }
}
