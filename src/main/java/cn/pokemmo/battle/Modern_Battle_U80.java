package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.U80
 */
public class Modern_Battle_U80 {

   public static final JN[] catch$ = new JN[0];
   public final short Cb0;
   public byte kX;
   public CH0 uL0;
   public JN[] GZ;
   public JN e40 = null;
   public final int Io;

   public Modern_Battle_U80(short var1, short var2) {
      this(var1, (short)-1, (byte)0, CH0.j1, catch$);
   }

   public Modern_Battle_U80(short var1, short var2, byte var3, CH0 var4, JN[] var5) {
      this.Cb0 = (short)var1;
      this.kX = var3;
      this.uL0 = var4;
      this.GZ = var5;
      int length = var5.length;

      for (int var7 = 0; var7 < length; var7++) {
         JN var8;
         if ((var8 = var5[var7]) != null && var8.ik() == var2) {
            this.e40 = var8;
         }
      }

      this.Io = var2 >= 0 && this.e40 == null ? var2 : -1;
   }
}

