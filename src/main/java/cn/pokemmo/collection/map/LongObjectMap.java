package cn.pokemmo.collection.map;

import f.*;

import java.util.Iterator;

public class LongObjectMap implements Iterable {
   public int Qm0;
   public long[] sm0;
   public Object[] Tj0;
   public Object qL;
   public boolean Wx;
   public final float Lpt2;
   public int hE;
   public int lPT7;
   public int Nw0;
   public transient ko_0 gx;
   public transient ko_0 uJ0;
   public transient cj0_0 Lt;
   public transient cj0_0 HE;

   public LongObjectMap() {
      this(51, 0.8F);
   }

   public LongObjectMap(int var1) {
      this(var1, 0.8F);
   }

   public LongObjectMap(int var1, float var2) {
      if (!(var2 <= 0.0F) && !(var2 >= 1.0F)) {
         this.Lpt2 = var2;
         int var4;
         int var10004 = var4 = af_1.NK(var1, var2);
         this.hE = (int)(var4 * var2);
         int var3;
         this.Nw0 = var3 = var10004 - 1;
         this.lPT7 = Long.numberOfLeadingZeros(var3);
         this.sm0 = new long[var4];
         this.Tj0 = new Object[var4];
      } else {
         throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + var2);
      }
   }

   public LongObjectMap(LongObjectMap var1) {
      this((int)Math.floor((float)var1.sm0.length * var1.Lpt2), var1.Lpt2);
      long[] var2 = var1.sm0;
      System.arraycopy(var2, 0, this.sm0, 0, var2.length);
      Object[] var3 = var1.Tj0;
      System.arraycopy(var3, 0, this.Tj0, 0, var3.length);
      this.Qm0 = var1.Qm0;
      this.qL = var1.qL;
      this.Wx = var1.Wx;
   }

   public LongObjectMap(J7 var1) {
      this((int)(var1.sm0.length * var1.Lpt2), var1.Lpt2);
      long[] var5 = this.sm0;
      int var2 = var1.sm0.length;
      System.arraycopy(var1.sm0, 0, var5, 0, var2);
      Object[] var3 = this.Tj0;
      int var6 = var1.Tj0.length;
      System.arraycopy(var1.Tj0, 0, var3, 0, var6);
      this.Qm0 = var1.Qm0;
      this.qL = var1.qL;
      this.Wx = var1.Wx;
   }

   public final void cw(long var1, Object var3) {
      if (var1 == 0L) {
         this.qL = var3;
         if (!this.Wx) {
            this.Wx = true;
            this.Qm0++;
         }
      } else {
         int var4;
         if ((var4 = this.HK0(var1)) >= 0) {
            Object var10001 = this.Tj0[var4];
            this.Tj0[var4] = var3;
         } else {
            var4 = -(var4 + 1);
            long[] var5 = this.sm0;
            this.sm0[var4] = var1;
            this.Tj0[var4] = var3;
            if (++this.Qm0 >= this.hE) {
               int var10000 = var5.length << 1;
               int var10 = var5.length;
               this.hE = (int)(var10000 * this.Lpt2);
               this.lPT7 = Long.numberOfLeadingZeros(this.Nw0 = var10000 - 1);
               long[] var2 = this.sm0;
               Object[] var6 = this.Tj0;
               this.sm0 = new long[var10000];
               this.Tj0 = new Object[var10000];
               if (this.Qm0 > 0) {
                  for (int var13 = 0; var13 < var10; var13++) {
                     long var14;
                     if ((var14 = var2[var13]) != 0L) {
                        Object var7 = var6[var13];
                        long[] var8 = this.sm0;
                        int var9 = (int)((var14 ^ var14 >>> 32) * -7046029254386353131L >>> this.lPT7);

                        while (var8[var9] != 0L) {
                           var9 = var9 + 1 & this.Nw0;
                        }

                        var8[var9] = var14;
                        this.Tj0[var9] = var7;
                     }
                  }
               }
            }
         }
      }
   }

   public final Object Aw(long var1) {
      if (var1 == 0L) {
         return this.Wx ? this.qL : null;
      }

      int var3;
      return (var3 = this.HK0(var1)) >= 0 ? this.Tj0[var3] : null;
   }

   public final void qa0(long var1) {
      if (var1 == 0L) {
         if (this.Wx) {
            this.Wx = false;
            this.qL = null;
            this.Qm0--;
         }
      } else {
         int var9;
         if ((var9 = this.HK0(var1)) >= 0) {
            long[] var2 = this.sm0;
            Object[] var3 = this.Tj0;
            Object var10002 = this.Tj0[var9];
            int var4 = this.Nw0;

            long var6;
            for (int var5 = var9 + 1 & var4; (var6 = var2[var5]) != 0L; var5 = var5 + 1 & var4) {
               int var8;
               if ((var5 - (var8 = (int)((var6 ^ var6 >>> 32) * -7046029254386353131L >>> this.lPT7)) & var4) > (var9 - var8 & var4)) {
                  var2[var9] = var6;
                  var3[var9] = var3[var5];
                  var9 = var5;
               }
            }

            var2[var9] = 0L;
            var3[var9] = null;
            this.Qm0--;
         }
      }
   }

   @Override
   public final int hashCode() {
      int var1 = this.Qm0;
      if (this.Wx) {
         Object var2 = this.qL;
         if (this.qL != null) {
            var1 += var2.hashCode();
         }
      }

      long[] var8;
      long[] var10000 = var8 = this.sm0;
      Object[] var7 = this.Tj0;
      int var3 = 0;

      for (int var4 = var10000.length; var3 < var4; var3++) {
         long var5;
         if ((var5 = var8[var3]) != 0L) {
            long var9 = var1;
            var1 = (int)(var5 * 31L + var9);
            Object var10;
            if ((var10 = var7[var3]) != null) {
               var1 += var10.hashCode();
            }
         }
      }

      return var1;
   }

   @Override
   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof LongObjectMap)) {
         return false;
      }

      LongObjectMap var9 = (LongObjectMap)var1;
      if (var9.Qm0 != this.Qm0) {
         return false;
      }

      boolean var2 = this.Wx;
      if (var9.Wx != this.Wx) {
         return false;
      }

      if (var2) {
         Object var10 = var9.qL;
         if (var9.qL == null) {
            if (this.qL != null) {
               return false;
            }
         } else if (!var10.equals(this.qL)) {
            return false;
         }
      }

      long[] var11;
      long[] var10000 = var11 = this.sm0;
      Object[] var8 = this.Tj0;
      int var3 = 0;

      for (int var4 = var10000.length; var3 < var4; var3++) {
         long var5;
         if ((var5 = var11[var3]) != 0L) {
            Object var7;
            if ((var7 = var8[var3]) == null) {
               var7 = nb_2.Com5;
               if (var5 == 0L) {
                  if (var9.Wx) {
                     var7 = var9.qL;
                  }
               } else {
                  int var12;
                  if ((var12 = var9.HK0(var5)) >= 0) {
                     var7 = var9.Tj0[var12];
                  }
               }

               if (var7 != null) {
                  return false;
               }
            } else if (!var7.equals(var9.Aw(var5))) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public final String toString() {
      if (this.Qm0 == 0) {
         return "[]";
      }

      StringBuilder var1 = new StringBuilder(32);
      var1.append('[');
      long[] var2 = this.sm0;
      Object[] var3 = this.Tj0;
      int var4 = this.sm0.length;
      if (this.Wx) {
         var1.append("0=");
         var1.append(this.qL);
      } else {
         while (true) {
            int var10000 = var4;
            var4 += -1;
            if (var10000 <= 0) {
               break;
            }

            long var5;
            if ((var5 = var2[var4]) != 0L) {
               var1.append(var5);
               var1.append('=');
               var1.append(var3[var4]);
               break;
            }
         }
      }

      while (true) {
         int var8 = var4;
         var4 += -1;
         if (var8 <= 0) {
            var1.append(']');
            return var1.toString();
         }

         long var7;
         if ((var7 = var2[var4]) != 0L) {
            var1.append(", ");
            var1.append(var7);
            var1.append('=');
            var1.append(var3[var4]);
         }
      }
   }

   @Override
   public final Iterator iterator() {
      return this.Lx0();
   }

   public final ko_0 Lx0() {
      if (this.gx == null) {
         ko_0 var1;
         var1 = new ko_0(this);
         this.gx = var1;
         var1 = new ko_0(this);
         this.uJ0 = var1;
      }

      ko_0 var3 = this.gx;
      if (!this.gx.Yh0) {
         var3.Gf();
         ko_0 var4 = this.gx;
         this.gx.Yh0 = true;
         this.uJ0.Yh0 = false;
         return var4;
      } else {
         this.uJ0.Gf();
         ko_0 var10000 = this.uJ0;
         this.uJ0.Yh0 = true;
         this.gx.Yh0 = false;
         return var10000;
      }
   }

   public final int HK0(long var1) {
      long[] var3 = this.sm0;

      int var4;
      long var5;
      for (var4 = (int)((var1 ^ var1 >>> 32) * -7046029254386353131L >>> this.lPT7); (var5 = var3[var4]) != 0L; var4 = var4 + 1 & this.Nw0) {
         if (var5 == var1) {
            return var4;
         }
      }

      return -(var4 + 1);
   }
}
