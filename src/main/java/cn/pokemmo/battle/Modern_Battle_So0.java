package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.So0
 */
public class Modern_Battle_So0 {

   public static final ff0_2 vT = new ff0_2('+', '/');

   public static byte[] P3(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;
      if (var2 % 4 != 0) {
         throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
      }

      while (var2 > 0 && var1[var2 - 1] == '=') {
         var2--;
      }

      int var3 = var2 * 3 / 4;
      byte[] var4 = new byte[var3];
      byte[] var5 = vT.ss;
      int var6 = 0;
      int var7 = 0;
      while (var6 < var2) {
         int var8 = var1[var6++];
         int var9 = var1[var6++];
         int var10 = var6 < var2 ? var1[var6++] : 'A';
         int var11 = var6 < var2 ? var1[var6++] : 'A';
         if (var8 > 127 || var9 > 127 || var10 > 127 || var11 > 127) {
            throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
         }
         int var12 = var5[var8];
         int var13 = var5[var9];
         int var14 = var5[var10];
         int var15 = var5[var11];
         if (var12 < 0 || var13 < 0 || var14 < 0 || var15 < 0) {
            throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
         }
         var4[var7++] = (byte)(var12 << 2 | var13 >>> 4);
         if (var7 < var3) {
            var4[var7++] = (byte)((var13 & 15) << 4 | var14 >>> 2);
         }
         if (var7 < var3) {
            var4[var7++] = (byte)((var14 & 3) << 6 | var15);
         }
      }
      return var4;
   }

   protected Modern_Battle_So0() {
   }

   static {
      new ff0_2('-', '_');
   }
}

