package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.WarnStatus;
import ch.qos.logback.core.util.FileUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.Future;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Compressor extends ContextAwareBase {
   static final int BUFFER_SIZE = 8192;
   final CompressionMode compressionMode;

   public Compressor(CompressionMode var1) {
      this.compressionMode = var1;
   }

   private void zipCompress(String nameOfFile2Compress, String nameOfCompressedFile, String innerEntryName) {
      File file2Compress = new File(nameOfFile2Compress);
      if (!file2Compress.exists()) {
         addStatus(new WarnStatus("The file to compress named [" + nameOfFile2Compress + "] does not exist.", this));
         return;
      }
      if (innerEntryName == null) {
         addStatus(new WarnStatus("The innerEntryName parameter cannot be null", this));
         return;
      }
      if (!nameOfCompressedFile.endsWith(".zip")) {
         nameOfCompressedFile = nameOfCompressedFile + ".zip";
      }
      File targetFile = new File(nameOfCompressedFile);
      if (targetFile.exists()) {
         addStatus(new WarnStatus("The target compressed file named [" + nameOfCompressedFile + "] exist already.", this));
         return;
      }
      addInfo("ZIP compressing [" + nameOfFile2Compress + "] as [" + nameOfCompressedFile + "]");
      createMissingTargetDirsIfNecessary(targetFile);
      try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nameOfFile2Compress));
           ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(nameOfCompressedFile))) {
         zos.putNextEntry(computeZipEntry(innerEntryName));
         byte[] buf = new byte[BUFFER_SIZE];
         int len;
         while ((len = bis.read(buf)) != -1) {
            zos.write(buf, 0, len);
         }
         zos.closeEntry();
         addInfo("Done ZIP compressing [" + nameOfFile2Compress + "] as [" + nameOfCompressedFile + "]");
      } catch (Exception e) {
         addStatus(new ErrorStatus("Error occurred while compressing [" + nameOfFile2Compress + "] into [" + nameOfCompressedFile + "].", this, e));
      }
      if (!file2Compress.delete()) {
         addStatus(new WarnStatus("Could not delete [" + nameOfFile2Compress + "].", this));
      }
   }

   private void gzCompress(String nameOfFile2Compress, String nameOfCompressedFile) {
      File file2Compress = new File(nameOfFile2Compress);
      if (!file2Compress.exists()) {
         addStatus(new WarnStatus("The file to compress named [" + nameOfFile2Compress + "] does not exist.", this));
         return;
      }
      if (!nameOfCompressedFile.endsWith(".gz")) {
         nameOfCompressedFile = nameOfCompressedFile + ".gz";
      }
      File targetFile = new File(nameOfCompressedFile);
      if (targetFile.exists()) {
         addWarn("The target compressed file named [" + nameOfCompressedFile + "] exist already. Aborting file compression.");
         return;
      }
      addInfo("GZ compressing [" + nameOfFile2Compress + "] as [" + nameOfCompressedFile + "]");
      createMissingTargetDirsIfNecessary(targetFile);
      try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nameOfFile2Compress));
           GZIPOutputStream gzos = new GZIPOutputStream(new FileOutputStream(nameOfCompressedFile))) {
         byte[] buf = new byte[BUFFER_SIZE];
         int len;
         while ((len = bis.read(buf)) != -1) {
            gzos.write(buf, 0, len);
         }
         addInfo("Done GZ compressing [" + nameOfFile2Compress + "] as [" + nameOfCompressedFile + "]");
      } catch (Exception e) {
         addStatus(new ErrorStatus("Error occurred while compressing [" + nameOfFile2Compress + "] into [" + nameOfCompressedFile + "].", this, e));
      }
      if (!file2Compress.delete()) {
         addStatus(new WarnStatus("Could not delete [" + nameOfFile2Compress + "].", this));
      }
   }

   public static String computeFileNameStrWithoutCompSuffix(String var0, CompressionMode var1) {
      int var2 = var0.length();
      switch (var1) {
         case GZ:
            return var0.endsWith(".gz") ? var0.substring(0, var2 - 3) : var0;
         case ZIP:
            return var0.endsWith(".zip") ? var0.substring(0, var2 - 4) : var0;
         case NONE:
            return var0;
         default:
            throw new IllegalStateException("Execution should not reach this point");
      }
   }

   public void compress(String var1, String var2, String var3) {
      switch (this.compressionMode) {
         case GZ:
            this.gzCompress(var1, var2);
            break;
         case ZIP:
            this.zipCompress(var1, var2, var3);
            break;
         case NONE:
            throw new UnsupportedOperationException("compress method called in NONE compression mode");
      }
   }

   public ZipEntry computeZipEntry(File var1) {
      return this.computeZipEntry(var1.getName());
   }

   public ZipEntry computeZipEntry(String var1) {
      String var2 = computeFileNameStrWithoutCompSuffix(var1, this.compressionMode);
      return new ZipEntry(var2);
   }

   public void createMissingTargetDirsIfNecessary(File var1) {
      if (!FileUtil.createMissingParentDirectories(var1)) {
         this.addError("Failed to create parent directories for [" + var1.getAbsolutePath() + "]");
      }
   }

   public String toString() {
      return this.getClass().getName();
   }

   public Future<?> asyncCompress(String nameOfFile2Compress, String nameOfCompressedFile, String innerEntryName) {
      return super.context.getExecutorService().submit(new CompressionRunnable(nameOfFile2Compress, nameOfCompressedFile, innerEntryName));
   }

   private class CompressionRunnable implements Runnable {
      final String nameOfFile2Compress;
      final String nameOfCompressedFile;
      final String innerEntryName;

      CompressionRunnable(String nameOfFile2Compress, String nameOfCompressedFile, String innerEntryName) {
         this.nameOfFile2Compress = nameOfFile2Compress;
         this.nameOfCompressedFile = nameOfCompressedFile;
         this.innerEntryName = innerEntryName;
      }

      public void run() {
         compress(nameOfFile2Compress, nameOfCompressedFile, innerEntryName);
      }
   }
}