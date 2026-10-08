package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.cd0_2
 */
public class Modern_Util_Cd02 {

   public String DR;
   public int gw;
   public byte ZQ = 0;
   public short[] X3 = new short[]{-1, -1, -1, -1};
   public byte[] YZ = new byte[4];

   public Modern_Util_Cd02(byte var1, int var2, String var3) {
      this.DR = var3;
      this.gw = var2;
   }

   public final byte MY() {
      return this.ZQ;
   }

   public final void c80(q10_0 var1, short var2) {
      short[] var6 = this.X3;
      byte var3 = var1.NUl;
      short var4;
      if ((var4 = (short)(var2 & 1023)) == 1023) {
         var4 = -1;
      }

      var6[var3] = var4;
      byte[] var5 = this.YZ;
      byte var7;
      if ((var7 = (byte)((var2 & '\uffff') >> 10)) == 63) {
         var7 = -1;
      }

      var5[var3] = var7;
   }
}

