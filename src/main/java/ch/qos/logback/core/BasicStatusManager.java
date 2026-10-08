package ch.qos.logback.core;

import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.spi.LogbackLock;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.status.StatusManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicStatusManager implements StatusManager {
   public static final int MAX_HEADER_COUNT = 150;
   public static final int TAIL_SIZE = 150;
   int count;
   protected final List statusList;
   protected final CyclicBuffer tailBuffer;
   protected final LogbackLock statusListLock;
   int level;
   protected final List statusListenerList;
   protected final LogbackLock statusListenerListLock;

   public BasicStatusManager() {
      this.count = 0;
      this.statusList = new ArrayList();
      this.tailBuffer = new CyclicBuffer(150);
      this.statusListLock = new LogbackLock();
      this.level = 0;
      this.statusListenerList = new ArrayList();
      this.statusListenerListLock = new LogbackLock();
   }

   private void fireStatusAddEvent(Status var1) {
      synchronized(this.statusListenerListLock) {
         Iterator var2 = this.statusListenerList.iterator();

         while(var2.hasNext()) {
            ((StatusListener)var2.next()).addStatusEvent(var1);
         }

      }
   }

   private boolean checkForPresence(List var1, Class var2) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         if (((StatusListener)var3.next()).getClass() == var2) {
            return true;
         }
      }

      return false;
   }

   public void add(Status var1) {
      this.fireStatusAddEvent(var1);
      int var10002 = this.count++;
      if (var1.getLevel() > this.level) {
         this.level = var1.getLevel();
      }

      synchronized(this.statusListLock) {
         if (this.statusList.size() < 150) {
            this.statusList.add(var1);
         } else {
            this.tailBuffer.add(var1);
         }

      }
   }

   public List getCopyOfStatusList() {
      synchronized(this.statusListLock) {
         ArrayList var2;
         var2 = new ArrayList(this.statusList);
         var2.addAll(this.tailBuffer.asList());
         return var2;
      }
   }

   public void clear() {
      synchronized(this.statusListLock) {
         this.count = 0;
         this.statusList.clear();
         this.tailBuffer.clear();
      }
   }

   public int getLevel() {
      return this.level;
   }

   public int getCount() {
      return this.count;
   }

   public boolean add(StatusListener var1) {
      synchronized(this.statusListenerListLock) {
         if (var1 instanceof OnConsoleStatusListener && this.checkForPresence(this.statusListenerList, var1.getClass())) {
            return false;
         }

         this.statusListenerList.add(var1);
         return true;
      }
   }

   public void remove(StatusListener var1) {
      synchronized(this.statusListenerListLock) {
         this.statusListenerList.remove(var1);
      }
   }

   public List getCopyOfStatusListenerList() {
      synchronized(this.statusListenerListLock) {
         return new ArrayList(this.statusListenerList);
      }
   }
}
