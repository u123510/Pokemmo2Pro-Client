package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.cd0_0
 */
public class Modern_Util_Cd00 implements mu_0 {

   public final C8 l6;
   public final me0_2 M30;
   public final C8 M2;

   public Modern_Util_Cd00() {
       this.l6 = new C8();
       this.M30 = new me0_2();
       this.M2 = new C8(1.0F, 1.0F, 1.0F);
   }

   public final cd0_0 W80(C8 var1, me0_2 var2, C8 var3) {
      C8 var10003 = this.l6;
      C8 var10004 = this.l6;
      C8 var5;
      C8 var10005 = var5 = this.l6;
      var5.getClass();
      float var6 = var1.x;
      float var9 = var1.y;
      float var4 = var1.z;
      var10005.x = var6;
      var10004.y = var9;
      var10003.z = var4;
      this.M30.CA0(var2);
      C8 var7;
      C8 var12 = var7 = this.M2;
      var7.getClass();
      float var8 = var3.x;
      float var10 = var3.y;
      float var11 = var3.z;
      var12.x = var8;
      var12.y = var10;
      var12.z = var11;
      return (cd0_0)this;
   }

   public final void bL() {
      C8 var10002 = this.l6;
      C8 var10003 = this.l6;
      float var2 = 0.0F;
      float var1 = 0.0F;
      this.l6.x = 0.0F;
      var10003.y = var2;
      var10002.z = var1;
      this.M30.Rx0();
      C8 var5 = this.M2;
      float var3 = 1.0F;
      var1 = 1.0F;
      this.M2.x = 1.0F;
      var5.y = var3;
      var5.z = var1;
   }

   @Override
   public final String toString() {
      return this.l6.toString() + " - " + this.M30.toString() + " - " + this.M2.toString();
   }
}

