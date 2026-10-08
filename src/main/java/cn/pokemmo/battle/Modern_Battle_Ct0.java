package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Ct0
 */
public class Modern_Battle_Ct0 {

   public static final bm0_1 p70 = new bm0_1();
   public static final Ct0[] fE;
   public final byte Du;
   public final int Y1;

   public Modern_Battle_Ct0(byte var1, int var2) {
      this.Y1 = var2;
      this.Du = var1;
   }

   static {
      Ct0 var0;
      var0 = new Ct0((byte)0, 0);
      Ct0 var1;
      var1 = new Ct0((byte)1, 1);
      Ct0 var2;
      var2 = new Ct0((byte)2, 2);
      Ct0 var3;
      var3 = new Ct0((byte)3, 3);
      Ct0 var4;
      var4 = new Ct0((byte)4, 4);
      Ct0 var5;
      var5 = new Ct0((byte)5, 5);
      Ct0 var6;
      var6 = new Ct0((byte)6, 6);
      Ct0 var7;
      var7 = new Ct0((byte)7, 7);
      Ct0 var8;
      var8 = new Ct0((byte)8, 8);
      Ct0 var9;
      var9 = new Ct0((byte)9, 9);
      Ct0 var10;
      var10 = new Ct0((byte)10, 10);
      Ct0[] var10000 = fE = new Ct0[]{var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10};
      Ct0[] var11;
      int var12 = (var11 = (Ct0[])var10000.clone()).length;

      for (int var13 = 0; var13 < var12; var13++) {
         var3 = var11[var13];
         p70.gE0(var3.Du, var3);
      }
   }
}

