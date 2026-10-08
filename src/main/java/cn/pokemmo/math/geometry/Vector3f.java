package cn.pokemmo.math.geometry;

import f.*;

import com.badlogic.gdx.math.Matrix4;
import java.io.Serializable;

public class Vector3f implements Serializable, lt_2 {
   private static final long serialVersionUID = 3840054589595372522L;
   public static final C8 X = new C8(1.0F, 0.0F, 0.0F);
   public static final C8 Y = new C8(0.0F, 1.0F, 0.0F);
   public static final C8 Z = new C8(0.0F, 0.0F, 1.0F);
   public static final C8 Zero = new C8(0.0F, 0.0F, 0.0F);
   private static final Matrix4 tmpMat = new Matrix4();
   public float x;
   public float y;
   public float z;

   public Vector3f() {
   }

   public Vector3f(float var1, float var2, float var3) {
      this.mf0(var1, var2, var3);
   }

   public Vector3f(Vector3f var1) {
      this.np(var1);
   }

   public Vector3f(float[] var1) {
      float var3 = var1[0];
      float var4 = var1[1];
      float var2 = var1[2];
      this.mf0(var3, var4, var2);
   }

   public Vector3f(Bp0 var1, float var2) {
      float var3 = var1.x;
      this.mf0(var3, var1.y, var2);
   }

   public final C8 mf0(float var1, float var2, float var3) {
      this.x = var1;
      this.y = var2;
      this.z = var3;
      return (C8) this;
   }

   public final C8 np(Vector3f var1) {
      float var3 = var1.x;
      float var4 = var1.y;
      float var2 = var1.z;
      this.x = var3;
      this.y = var4;
      this.z = var2;
      return (C8) this;
   }

   public final C8 q40() {
      return new C8(this);
   }

   public final C8 na(float var1, float var2, float var3) {
      float var10004 = this.x + var1;
      float var4 = this.y + var2;
      var1 = this.z + var3;
      this.x = var10004;
      this.y = var4;
      this.z = var1;
      return (C8) this;
   }

   public final C8 Vy(float var1, float var2, float var3) {
      float var10004 = this.x - var1;
      float var4 = this.y - var2;
      var1 = this.z - var3;
      this.x = var10004;
      this.y = var4;
      this.z = var1;
      return (C8) this;
   }

   public final C8 Fg0(float var1) {
      float var10004 = this.x * var1;
      float var2 = this.y * var1;
      var1 = this.z * var1;
      this.x = var10004;
      this.y = var2;
      this.z = var1;
      return (C8) this;
   }

   public final C8 hn0(float var1, float var2, float var3) {
      float var10004 = this.x * var1;
      float var4 = this.y * var2;
      var1 = this.z * var3;
      this.x = var10004;
      this.y = var4;
      this.z = var1;
      return (C8) this;
   }

   public final float Am0() {
      float var1 = this.x * this.x;
      float var2 = this.y * this.y + var1;
      return (float)Math.sqrt(this.z * this.z + var2);
   }

   public final float SH0(C8 var1) {
      float var5 = var1.x - this.x;
      float var2 = var1.y - this.y;
      float var6 = var1.z - this.z;
      float var3 = var5 * var5;
      float var4 = var2 * var2 + var3;
      return (float)Math.sqrt(var6 * var6 + var4);
   }

   public final float Ir(float var1, float var2, float var3) {
      float var4 = var1 - this.x;
      var1 = var2 - this.y;
      float var10000 = var3 - this.z;
      float var8 = var3 - this.z;
      float var5 = var4 * var4;
      float var6 = var1 * var1 + var5;
      return (float)Math.sqrt(var10000 * var8 + var6);
   }

   public final float Lk(C8 var1) {
      float var5 = var1.x - this.x;
      float var2 = var1.y - this.y;
      float var6 = var1.z - this.z;
      float var3 = var5 * var5;
      float var4 = var2 * var2 + var3;
      return var6 * var6 + var4;
   }

   public final C8 KM() {
      float var1 = this.x * this.x;
      var1 = this.y * this.y + var1;
      float var3;
      return (var3 = this.z * this.z + var1) != 0.0F && var3 != 1.0F ? this.Fg0(1.0F / (float)Math.sqrt(var3)) : (C8) this;
   }

   public final float S60(C8 var1) {
      float var2 = this.x * var1.x;
      float var3 = this.y * var1.y + var2;
      return this.z * var1.z + var3;
   }

   public final C8 Xv0(C8 var1) {
      float var7;
      float var10006 = var7 = this.y;
      float var2 = var1.z;
      float var3 = var10006 * var1.z;
      float var4;
      float var13 = var4 = this.z;
      float var9;
      var3 -= var4 * (var9 = var1.y);
      float var5 = var13 * (var4 = var1.x);
      float var6 = this.x;
      float var10 = var5 - var6 * var2;
      float var8 = var6 * var9 - var7 * var4;
      this.x = var3;
      this.y = var10;
      this.z = var8;
      return (C8) this;
   }

   public final C8 cu(Matrix4 var1) {
      float[] var5 = var1.EW;
      float var7;
      float var2 = (var7 = this.x) * var5[0];
      float var3;
      var2 = (var3 = this.y) * var5[4] + var2;
      float var4;
      float var15 = var4 = this.z;
      float var8 = var4 * var5[8] + var2 + var5[12];
      var2 = var7 * var5[1];
      var2 = var3 * var5[5] + var2;
      var2 = var4 * var5[9] + var2 + var5[13];
      float var13 = var7 * var5[2];
      var3 = var3 * var5[6] + var13;
      float var6 = var15 * var5[10] + var3 + var5[14];
      this.x = var8;
      this.y = var2;
      this.z = var6;
      return (C8) this;
   }

   public final C8 Lf0(i00_0 var1) {
      float[] var5 = var1.Z2;
      float var7;
      float var2 = (var7 = this.x) * var5[0];
      float var3;
      var2 = (var3 = this.y) * var5[3] + var2;
      float var4;
      float var15 = var4 = this.z;
      float var6 = var4 * var5[6] + var2;
      float var8 = var7 * var5[1];
      float var9 = var3 * var5[4] + var8;
      float var10 = var4 * var5[7] + var9;
      var2 = var7 * var5[2];
      var2 = var3 * var5[5] + var2;
      var2 = var15 * var5[8] + var2;
      this.x = var6;
      this.y = var10;
      this.z = var2;
      return (C8) this;
   }

   public final boolean eG() {
      return this.x == 0.0F && this.y == 0.0F && this.z == 0.0F;
   }

   public final C8 JA(C8 var1, float var2) {
      float var3 = this.x;
      this.x = fe_2.Ga0(var1.x, var3, var2, var3);
      float var4 = this.y;
      this.y = fe_2.Ga0(var1.y, var4, var2, var4);
      float var5 = this.z;
      this.z = fe_2.Ga0(var1.z, var5, var2, var5);
      return (C8) this;
   }

   @Override
   public final String toString() {
      return "(" + this.x + "," + this.y + "," + this.z + ")";
   }

   @Override
   public final int hashCode() {
      byte var1 = 31;
      int var2 = (Float.floatToIntBits(this.x) + var1) * 31;
      int var3 = (Float.floatToIntBits(this.y) + var2) * 31;
      return Float.floatToIntBits(this.z) + var3;
   }

   @Override
   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (C8.class != var1.getClass()) {
         return false;
      } else {
         C8 var2 = (C8)var1;
         if (Float.floatToIntBits(this.x) != Float.floatToIntBits(var2.x)) {
            return false;
         } else {
            return Float.floatToIntBits(this.y) != Float.floatToIntBits(var2.y) ? false : Float.floatToIntBits(this.z) == Float.floatToIntBits(var2.z);
         }
      }
   }

   public final C8 rB0() {
      this.x = 0.0F;
      this.y = 0.0F;
      this.z = 0.0F;
      return (C8) this;
   }

   @Override
   public final lt_2 G7(float var1) {
      return this.Fg0(var1);
   }

   @Override
   public final lt_2 lY(lt_2 var1) {
      return this.np((C8)var1);
   }

   @Override
   public final lt_2 Xg0(lt_2 var1) {
      C8 var10001 = (C8)var1;
      float var3 = ((C8)var1).x;
      float var4 = ((C8)var1).y;
      float var2 = var10001.z;
      return this.na(var3, var4, var2);
   }

   @Override
   public final lt_2 f10() {
      return new C8(this);
   }

   public final void if$(float var1) {
      float var10003 = this.x + var1;
      float var2 = this.y + var1;
      var1 = this.z + var1;
      this.x = var10003;
      this.y = var2;
      this.z = var1;
   }

   public final void dz0(float var1) {
      float var10003 = this.x - var1;
      float var2 = this.y - var1;
      var1 = this.z - var1;
      this.x = var10003;
      this.y = var2;
      this.z = var1;
   }

   public final void bm0(me0_2 var1) {
      var1.getClass();
      me0_2 var10003 = me0_2.Aux;
      me0_2 var10004 = me0_2.Aux;
      me0_2 var2;
      me0_2 var10005 = var2 = me0_2.Aux;
      me0_2.Aux.CA0(var1);
      var10005.Jg();
      var10005 = me0_2.Bq;
      me0_2 var10006 = me0_2.Bq;
      me0_2 var10007 = me0_2.Bq;
      me0_2 var10008 = me0_2.Bq;
      float var5 = this.x;
      float var3 = this.y;
      float var4 = this.z;
      float var6 = 0.0F;
      me0_2.Bq.m1 = var5;
      var10008.ao0 = var3;
      var10007.th = var4;
      var10006.Au0 = var6;
      var10004.p1(var10005).p1(var1);
      this.x = var10003.m1;
      this.y = var2.ao0;
      this.z = var2.th;
   }

   public final void Ye0(Matrix4 var1) {
      float[] var5 = var1.EW;
      float var7;
      float var2 = (var7 = this.x) * var5[3];
      float var3;
      var2 = (var3 = this.y) * var5[7] + var2;
      float var4;
      float var18 = var4 = this.z;
      float var8 = 1.0F / (var4 * var5[11] + var2 + var5[15]);
      var2 = var7 * var5[0];
      var2 = var3 * var5[4] + var2;
      var2 = (var4 * var5[8] + var2 + var5[12]) * var8;
      float var13 = var7 * var5[1];
      float var14 = var3 * var5[5] + var13;
      float var15 = (var4 * var5[9] + var14 + var5[13]) * var8;
      var4 = var7 * var5[2];
      var4 = var3 * var5[6] + var4;
      float var6 = (var18 * var5[10] + var4 + var5[14]) * var8;
      this.x = var2;
      this.y = var15;
      this.z = var6;
   }

   public final void YO(C8 var1, float var2) {
      Matrix4 var3 = tmpMat;
      tmpMat.CN(var1, var2);
      this.cu(var3);
   }
}
