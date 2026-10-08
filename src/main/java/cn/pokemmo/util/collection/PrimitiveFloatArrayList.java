package cn.pokemmo.util.collection;

import f.*;

public class PrimitiveFloatArrayList {
   public float[] iS;
   public int Or;
   public final boolean Y1;

   public PrimitiveFloatArrayList() {
      this(true, 16);
   }

   public PrimitiveFloatArrayList(int var1) {
      this(true, var1);
   }

   public PrimitiveFloatArrayList(boolean var1, int var2) {
      this.Y1 = var1;
      this.iS = new float[var2];
   }

   public PrimitiveFloatArrayList(UJ0 var1) {
      this.Y1 = var1.Y1;
      int var3;
      int var10002 = var3 = var1.Or;
      this.Or = var3;
      float[] var2;
      this.iS = var2 = new float[var10002];
      System.arraycopy(var1.iS, 0, var2, 0, var3);
   }

   public PrimitiveFloatArrayList(float[] var1) {
      this(true, var1, 0, var1.length);
   }

   public PrimitiveFloatArrayList(boolean var1, float[] var2, int var3, int var4) {
      this(var1, var4);
      this.Or = var4;
      System.arraycopy(var2, var3, this.iS, 0, var4);
   }

   public final void O6(float var1) {
      float[] var2 = this.iS;
      int var3 = this.Or;
      if (this.Or == var2.length) {
         var2 = this.TT(Math.max(8, (int)(var3 * 1.75F)));
      }

      int var4;
      this.Or = (var4 = this.Or) + 1;
      var2[var4] = var1;
   }

   public final float QJ0(int var1) {
      if (var1 < this.Or) {
         return this.iS[var1];
      } else {
         throw new IndexOutOfBoundsException(CO.go("index can't be >= size: ", var1, " >= ").append(this.Or).toString());
      }
   }

   public final float[] TT(int var1) {
      float[] var2;
      float[] var10000 = var2 = new float[var1];
      float[] var10003 = this.iS;
      int var3 = Math.min(this.Or, var1);
      System.arraycopy(var10003, 0, var2, 0, var3);
      this.iS = var2;
      return var10000;
   }

   @Override
   public final int hashCode() {
      if (!this.Y1) {
         return super.hashCode();
      }

      float[] var4 = this.iS;
      int var1 = 1;
      int var2 = 0;

      for (int var3 = this.Or; var2 < var3; var2++) {
         var1 *= 31;
         var1 = Float.floatToRawIntBits(var4[var2]) + var1;
      }

      return var1;
   }

   @Override
   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!this.Y1) {
         return false;
      }

      if (!(var1 instanceof UJ0)) {
         return false;
      }

      UJ0 var5 = (UJ0)var1;
      if (!var5.Y1) {
         return false;
      }

      int var2 = this.Or;
      if (this.Or != var5.Or) {
         return false;
      }

      float[] var4 = this.iS;
      float[] var6 = var5.iS;

      for (int var3 = 0; var3 < var2; var3++) {
         if (var4[var3] != var6[var3]) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final String toString() {
      if (this.Or == 0) {
         return "[]";
      }

      float[] var1 = this.iS;
      b3_0 var2 = new b3_0(32);
      var2.GC0('[');
      var2.sV(Float.toString(var1[0]));

      for (int var3 = 1; var3 < this.Or; var3++) {
         var2.sV(", ");
         var2.sV(Float.toString(var1[var3]));
      }

      var2.GC0(']');
      return var2.toString();
   }

   public final void KN(int var1, int var2, float[] var3) {
      float[] var4 = this.iS;
      int var5;
      if ((var5 = this.Or + var2) > var4.length) {
         var4 = this.TT(Math.max(Math.max(8, var5), (int)(this.Or * 1.75F)));
      }

      System.arraycopy(var3, var1, var4, this.Or, var2);
      this.Or += var2;
   }

   public final void bD(int var1) {
      if (var1 >= 0) {
         if ((var1 = this.Or + var1) > this.iS.length) {
            this.TT(Math.max(Math.max(8, var1), (int)(this.Or * 1.75F)));
         }
      } else {
         throw new IllegalArgumentException(yr_1.pG("additionalCapacity must be >= 0: ", var1));
      }
   }
}
