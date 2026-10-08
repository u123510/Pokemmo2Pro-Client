package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.D
 */
public class Modern_Battle_D {

   public static final bm0_1 q1 = new bm0_1();
   public final byte nX;

   public Modern_Battle_D(byte var1) {
      this.nX = var1;
   }

   static {
      D var0;
      var0 = new D((byte)0);
      D var1;
      var1 = new D((byte)1);
      D var2;
      var2 = new D((byte)2);
      D[] var4;
      D[] var10000 = var4 = (D[])new D[]{var0, var1, var2}.clone();
      int var5 = var10000.length;

      for (int var6 = 0; var6 < var5; var6++) {
         D var3 = var4[var6];
         q1.gE0(var3.nX, var3);
      }
   }
}

