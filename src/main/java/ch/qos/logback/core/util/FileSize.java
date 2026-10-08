package ch.qos.logback.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileSize {
   private static final String LENGTH_PART = "([0-9]+)";
   private static final int DOUBLE_GROUP = 1;
   private static final String UNIT_PART = "(|kb|mb|gb)s?";
   private static final int UNIT_GROUP = 2;
   private static final Pattern FILE_SIZE_PATTERN = Pattern.compile("([0-9]+)\\s*(|kb|mb|gb)s?", 2);
   public static final long KB_COEFFICIENT = 1024L;
   public static final long MB_COEFFICIENT = 1048576L;
   public static final long GB_COEFFICIENT = 1073741824L;
   final long size;

   public FileSize(long var1) {
      this.size = var1;
   }

   public static FileSize valueOf(String var0) {
      Matcher var1;
      if ((var1 = FILE_SIZE_PATTERN.matcher(var0)).matches()) {
         var0 = var1.group(1);
         String var7;
         String var10000 = var7 = var1.group(2);
         long var2 = Long.valueOf(var0);
         long var4;
         if (var10000.equalsIgnoreCase("")) {
            var4 = 1L;
         } else if (var7.equalsIgnoreCase("kb")) {
            var4 = 1024L;
         } else if (var7.equalsIgnoreCase("mb")) {
            var4 = 1048576L;
         } else {
            if (!var7.equalsIgnoreCase("gb")) {
               throw new IllegalStateException("Unexpected " + var7);
            }

            var4 = 1073741824L;
         }

         return new FileSize(var2 * var4);
      } else {
         throw new IllegalArgumentException("String value [" + var0 + "] is not in the expected format.");
      }
   }

   public long getSize() {
      return this.size;
   }

   public String toString() {
      long var1;
      long var3;
      if ((var3 = (var1 = this.size) / 1024L) == 0L) {
         return var1 + " Bytes";
      } else {
         long var5;
         if ((var5 = var1 / 1048576L) == 0L) {
            return var3 + " KB";
         } else {
            long var7;
            return (var7 = var1 / 1073741824L) == 0L ? var5 + " MB" : var7 + " GB";
         }
      }
   }
}
