package cn.pokemmo.util.collection;

import f.*;

public class PrimitiveShortArrayList {
   public short[] mi0;
   public int Sd0;
   public final boolean kU;

   public PrimitiveShortArrayList() {
      this(true, 16);
   }

   public PrimitiveShortArrayList(int var1) {
      this(true, var1);
   }

   public PrimitiveShortArrayList(boolean var1, int var2) {
      this.kU = var1;
      this.mi0 = new short[var2];
   }

   public PrimitiveShortArrayList(PrimitiveShortArrayList var1) {
      super();
      this.kU = var1.kU;
      this.Sd0 = var1.Sd0;
      this.mi0 = new short[this.Sd0];
      System.arraycopy(var1.mi0, 0, this.mi0, 0, this.Sd0);
   }

   public PrimitiveShortArrayList(short[] var1) {
      this(true, var1, 0, var1.length);
   }

   public PrimitiveShortArrayList(boolean var1, short[] var2, int var3, int var4) {
      this(var1, var4);
      this.Sd0 = var4;
      System.arraycopy(var2, var3, this.mi0, 0, var4);
   }

   public final void n20(int var1) {
      short[] var2 = this.mi0;
      int var3;
      if ((var3 = this.Sd0) == var2.length) {
         int var5;
         short[] var7;
         short[] var10001 = var7 = new short[var5 = Math.max(8, (int)((float)var3 * 1.75F))];
         short[] var10002 = this.mi0;
         var5 = Math.min(this.Sd0, var5);
         System.arraycopy(var10002, 0, var7, 0, var5);
         this.mi0 = var10001;
         var2 = var7;
      }

      int var4;
      this.Sd0 = (var4 = this.Sd0) + 1;
      var2[var4] = (short)var1;
   }

   public final void e80(short var1) {
      short[] var2 = this.mi0;
      int var3;
      if ((var3 = this.Sd0) == var2.length) {
         int var5;
         short[] var7;
         short[] var10001 = var7 = new short[var5 = Math.max(8, (int)((float)var3 * 1.75F))];
         short[] var10002 = this.mi0;
         var5 = Math.min(this.Sd0, var5);
         System.arraycopy(var10002, 0, var7, 0, var5);
         this.mi0 = var10001;
         var2 = var7;
      }

      int var4;
      this.Sd0 = (var4 = this.Sd0) + 1;
      var2[var4] = var1;
   }

   public final short Ez0(int var1) {
      if (var1 < this.Sd0) {
         return this.mi0[var1];
      } else {
         throw new IndexOutOfBoundsException(CO.go("index can't be >= size: ", var1, " >= ").append(this.Sd0).toString());
      }
   }

   public final int hashCode() {
      if (!this.kU) {
         return super.hashCode();
      } else {
         short[] var4 = this.mi0;
         int var1 = 1;
         int var2 = 0;

         for(int var3 = this.Sd0; var2 < var3; ++var2) {
            var1 = var1 * 31 + var4[var2];
         }

         return var1;
      }
   }

   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!this.kU) {
         return false;
      } else if (!(var1 instanceof PrimitiveShortArrayList)) {
         return false;
      } else {
         PrimitiveShortArrayList var7 = (PrimitiveShortArrayList)var1;
         if (!var7.kU) {
            return false;
         } else {
            int var2;
            if ((var2 = this.Sd0) != var7.Sd0) {
               return false;
            } else {
               short[] var4 = this.mi0;
               short[] var6 = var7.mi0;

               for(int var3 = 0; var3 < var2; ++var3) {
                  if (var4[var3] != var6[var3]) {
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   public final String toString() {
      if (this.Sd0 == 0) {
         return "[]";
      } else {
         short[] var1 = this.mi0;
         b3_0 var2 = new b3_0(32);
         var2.GC0('[');
         var2.on(var1[0]);

         for(int var3 = 1; var3 < this.Sd0; ++var3) {
            var2.sV(", ");
            var2.on(var1[var3]);
         }

         var2.GC0(']');
         return var2.toString();
      }
   }

   public final void Wf(int var1) {
      if (var1 >= 0) {
         if ((var1 = this.Sd0 + var1) > this.mi0.length) {
            PrimitiveShortArrayList var10000 = this;
            short[] var2;
            int var5;
            short[] var10001 = var2 = new short[var5 = Math.max(Math.max(8, var1), (int)((float)this.Sd0 * 1.75F))];
            short[] var10002 = this.mi0;
            int var3 = Math.min(this.Sd0, var5);
            System.arraycopy(var10002, 0, var2, 0, var3);
            var10000.mi0 = var10001;
         }

      } else {
         throw new IllegalArgumentException(yr_1.pG("additionalCapacity must be >= 0: ", var1));
      }
   }
}
