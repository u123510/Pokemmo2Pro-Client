package ch.qos.logback.core.spi;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.util.COWArrayList;
import java.util.Iterator;

public class AppenderAttachableImpl implements AppenderAttachable {
   private final COWArrayList appenderList = new COWArrayList(new Appender[0]);

   public void addAppender(Appender var1) {
      if (var1 != null) {
         this.appenderList.addIfAbsent(var1);
      } else {
         throw new IllegalArgumentException("Null argument disallowed");
      }
   }

   public int appendLoopOnAppenders(Object var1) {
      int var5 = 0;
      Appender[] var2;
      int var3 = (var2 = (Appender[])this.appenderList.asTypedArray()).length;

      for(int var4 = 0; var4 < var3; ++var4) {
         var2[var4].doAppend(var1);
         ++var5;
      }

      return var5;
   }

   public Iterator iteratorForAppenders() {
      return this.appenderList.iterator();
   }

   public Appender getAppender(String var1) {
      if (var1 == null) {
         return null;
      } else {
         Iterator var3 = this.appenderList.iterator();

         while(var3.hasNext()) {
            Appender var2;
            if (var1.equals((var2 = (Appender)var3.next()).getName())) {
               return var2;
            }
         }

         return null;
      }
   }

   public boolean isAttached(Appender var1) {
      if (var1 == null) {
         return false;
      } else {
         Iterator var2 = this.appenderList.iterator();

         while(var2.hasNext()) {
            if ((Appender)var2.next() == var1) {
               return true;
            }
         }

         return false;
      }
   }

   public void detachAndStopAllAppenders() {
      Iterator var1 = this.appenderList.iterator();

      while(var1.hasNext()) {
         ((Appender)var1.next()).stop();
      }

      this.appenderList.clear();
   }

   public boolean detachAppender(Appender var1) {
      return var1 == null ? false : this.appenderList.remove(var1);
   }

   public boolean detachAppender(String var1) {
      if (var1 == null) {
         return false;
      } else {
         boolean var2 = false;
         Appender[] var3;
         int var4 = (var3 = (Appender[])this.appenderList.asTypedArray()).length;

         for(int var5 = 0; var5 < var4; ++var5) {
            Appender var6;
            if (var1.equals((var6 = var3[var5]).getName())) {
               var2 = this.appenderList.remove(var6);
               break;
            }
         }

         return var2;
      }
   }
}
