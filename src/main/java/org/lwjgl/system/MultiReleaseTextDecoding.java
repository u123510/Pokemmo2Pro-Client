package org.lwjgl.system;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


final class MultiReleaseTextDecoding {
   private MultiReleaseTextDecoding() {
   }

   public static String decodeUTF8(long var0, int var2) {
      if (var2 <= 0) {
         return "";
      } else if (Checks.DEBUG) {
         return jdkFallback(var0, var2);
      } else {
         char[] var3;
         if (var2 <= MemoryUtil.ARRAY_TLC_SIZE) {
            var3 = (char[])MemoryUtil.ARRAY_TLC_CHAR.get();
         } else {
            var3 = new char[var2];
         }

         int var4 = 0;

         int var15;
         for(int var5 = 0; var5 < var2; var5 = var15) {
            int var7 = var5 + 1;
            long var8 = var0 + (long)var5;
            int var9;
            byte var23;
            if ((var9 = (var23 = MemoryUtil.memGetByte(var8)) & 255) < 128) {
               var5 = (char)var9;
               var15 = var7;
            } else {
               int var20 = var5 + 2;
               long var24 = var0 + (long)var7;
               int var25 = MemoryUtil.memGetByte(var24) & 63;
               if ((var23 & 224) == 192) {
                  var5 = (char)((var23 & 31) << 6 | var25);
                  var15 = var20;
               } else {
                  var7 = var5 + 3;
                  long var10 = var0 + (long)var20;
                  int var26 = MemoryUtil.memGetByte(var10) & 63;
                  if ((var23 & 240) == 224) {
                     var5 = (char)((var23 & 15) << 12 | var25 << 6 | var26);
                     var15 = var7;
                  } else {
                     var5 += 4;
                     long var16 = var0 + (long)var7;
                     int var17 = MemoryUtil.memGetByte(var16) & 63;
                     var17 = (var23 & 7) << 18 | var25 << 12 | var26 << 6 | var17;
                     if (var4 < var2) {
                        var3[var4++] = (char)((var17 >>> 10) + 'ퟀ');
                     }

                     var17 = (char)((var17 & 1023) + '\udc00');
                     var15 = var5;
                     var5 = var17;
                  }
               }
            }

            if (var4 < var2) {
               var7 = var4 + 1;
               var3[var4] = (char)var5;
               var4 = var7;
            }
         }

         int var12 = Math.min(var4, var2);
         return new String(var3, 0, var12);
      }
   }

   private static String jdkFallback(long var0, int var2) {
      byte[] var3;
      if (var2 <= MemoryUtil.ARRAY_TLC_SIZE) {
         var3 = (byte[])MemoryUtil.ARRAY_TLC_BYTE.get();
      } else {
         var3 = new byte[var2];
      }

      MemoryUtil.memByteBuffer(var0, var2).get(var3, 0, var2);
      Charset var4 = StandardCharsets.UTF_8;
      return new String(var3, 0, var2, var4);
   }
}
