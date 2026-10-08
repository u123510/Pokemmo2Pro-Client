package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
import java.time.Instant;
import java.util.concurrent.Future;

public class TimeBasedArchiveRemover extends ContextAwareBase implements ArchiveRemover {
   protected static final long UNINITIALIZED = -1L;
   protected static final long INACTIVITY_TOLERANCE_IN_MILLIS = 2764800000L;
   static final int MAX_VALUE_FOR_INACTIVITY_PERIODS = 336;
   final FileNamePattern fileNamePattern;
   final RollingCalendar rc;
   private int maxHistory = 0;
   private long totalSizeCap = 0L;
   final boolean parentClean;
   long lastHeartBeat = -1L;
   int callCount = 0;

   public TimeBasedArchiveRemover(FileNamePattern var1, RollingCalendar var2) {
      this.fileNamePattern = var1;
      this.rc = var2;
      this.parentClean = this.computeParentCleaningFlag(var1);
   }

   private boolean fileExistsAndIsFile(File var1) {
      return var1.exists() && var1.isFile();
   }

   private boolean checkAndDeleteFile(File var1) {
      ((ContextAwareBase)this).addInfo("deleting " + String.valueOf(var1));
      if (var1 == null) {
         ((ContextAwareBase)this).addWarn("Cannot delete empty file");
         return false;
      } else if (!var1.exists()) {
         ((ContextAwareBase)this).addWarn("Cannot delete non existent file");
         return false;
      } else {
         boolean var2;
         if (!(var2 = var1.delete())) {
            ((ContextAwareBase)this).addWarn("Failed to delete file " + var1.toString());
         }

         return var2;
      }
   }

   private void removeFolderIfEmpty(File var1, int var2) {
      if (var2 < 3) {
         if (var1.isDirectory() && FileFilterUtil.isEmptyDirectory(var1)) {
            ((ContextAwareBase)this).addInfo("deleting folder [" + String.valueOf(var1) + "]");
            this.checkAndDeleteFile(var1);
            this.removeFolderIfEmpty(var1.getParentFile(), var2 + 1);
         }

      }
   }

   public Future cleanAsynchronously(Instant var1) {
      ArchiveRemoverRunnable var2;
      var2 = new ArchiveRemoverRunnable(this, var1);
      return super.context.getAlternateExecutorService().submit(var2);
   }

   public void clean(Instant var1) {
      long var2;
      int var4;
      int var10000 = var4 = this.computeElapsedPeriodsSinceLastClean(var2 = var1.toEpochMilli());
      this.lastHeartBeat = var2;
      if (var10000 > 1) {
         ((ContextAwareBase)this).addInfo("Multiple periods, i.e. " + var4 + " periods, seem to have elapsed. This is expected at application start.");
      }

      for(int var5 = 0; var5 < var4; ++var5) {
         int var3 = this.getPeriodOffsetForDeletionTarget() - var5;
         this.cleanPeriod(this.rc.getEndOfNextNthPeriod(var1, var3));
      }

   }

   public File[] getFilesInPeriod(Instant var1) {

      String var2 = this.fileNamePattern.convert(var1);
      File var3;
      File var10001 = var3 = new File(var2);
      return this.fileExistsAndIsFile(var10001) ? new File[]{var3} : new File[0];
   }

   public void cleanPeriod(Instant var1) {
      File[] var4;
      int var2 = (var4 = this.getFilesInPeriod(var1)).length;

      for(int var3 = 0; var3 < var2; ++var3) {
         this.checkAndDeleteFile(var4[var3]);
      }

      if (this.parentClean && var4.length > 0) {
         this.removeFolderIfEmpty(this.getParentDir(var4[0]));
      }

   }

   public void capTotalSize(Instant var1) {
      long var2 = 0L;
      long var4 = 0L;
      int var6 = 0;
      int var7 = 0;

      for(int var8 = 0; var8 < this.maxHistory; ++var8) {
         Instant var9 = this.rc.getEndOfNextNthPeriod(var1, -var8);
         File[] var10 = this.getFilesInPeriod(var9);
         this.descendingSort(var10, var9);
         int var17 = var10.length;

         for(int var11 = 0; var11 < var17; ++var11) {
            long var12;
            long var14 = var2 + (var12 = var10[var11].length());
            if (var14 > this.totalSizeCap) {
               this.addInfo("Deleting [" + var10[var11] + "] of size " + String.valueOf(new FileSize(var12)));
               if (this.checkAndDeleteFile(var10[var11])) {
                  ++var6;
                  var4 += var12;
               } else {
                  ++var7;
               }
            }

            var2 = var14;
         }
      }

      if (var6 + var7 == 0) {
         this.addInfo("No removal attempts were made.");
      } else {
         this.addInfo("Removed  " + String.valueOf(new FileSize(var4)) + " of files in " + var6 + " files.");
         if (var7 != 0) {
            this.addInfo("There were " + var7 + " failed deletion attempts.");
         }
      }

   }

   public void descendingSort(File[] var1, Instant var2) {
   }

   public File getParentDir(File var1) {
      return var1.getAbsoluteFile().getParentFile();
   }

   public int computeElapsedPeriodsSinceLastClean(long var1) {
      long var3;
      long var10000;
      if ((var3 = this.lastHeartBeat) == -1L) {
         ((ContextAwareBase)this).addInfo("first clean up after appender initialization");
         var10000 = Math.min(this.rc.periodBarriersCrossed(var1, var1 + 2764800000L), 336L);
      } else {
         var10000 = this.rc.periodBarriersCrossed(var3, var1);
      }

      return (int)var10000;
   }

   public boolean computeParentCleaningFlag(FileNamePattern var1) {
      if (var1.getPrimaryDateTokenConverter().getDatePattern().indexOf(47) != -1) {
         return true;
      } else {
         Converter var2 = var1.headTokenConverter;

         for(; var2 != null && !(var2 instanceof DateTokenConverter); var2 = var2.getNext()) {
         }

         while(var2 != null) {
            if (var2 instanceof LiteralConverter && var2.convert((Object)null).indexOf(47) != -1) {
               return true;
            }

            var2 = var2.getNext();
         }

         return false;
      }
   }

   public void removeFolderIfEmpty(File var1) {
      this.removeFolderIfEmpty(var1, 0);
   }

   public void setMaxHistory(int var1) {
      this.maxHistory = var1;
   }

   public int getPeriodOffsetForDeletionTarget() {
      return -this.maxHistory - 1;
   }

   public void setTotalSizeCap(long var1) {
      this.totalSizeCap = var1;
   }

   public String toString() {
      return "c.q.l.core.rolling.helper.TimeBasedArchiveRemover";
   }

   private static class ArchiveRemoverRunnable implements Runnable {
      final TimeBasedArchiveRemover remover;
      final Instant now;

      ArchiveRemoverRunnable(TimeBasedArchiveRemover remover, Instant now) {
         this.remover = remover;
         this.now = now;
      }

      public void run() {
         this.remover.clean(this.now);
         long var2 = this.remover.totalSizeCap;
         if (var2 != 0L && var2 > 0L) {
            this.remover.capTotalSize(this.now);
         }
      }
   }
}
