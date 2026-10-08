package cn.pokemmo.collection.map;

import f.*;

import java.util.Arrays;
import java.util.Iterator;

public class IntIntMap implements Iterable {
   public int gW;
   public int[] oY;
   public int[] xA;
   public int LPT3;
   public boolean mD0;
   public final float xL0;
   public int ZI;
   public int qe;
   public int jy0;
   public transient cr_1 lPT4;
   public transient cr_1 const$;

   public IntIntMap() {
      this(51, 0.8F);
   }

   public IntIntMap(int var1) {
      this(var1, 0.8F);
   }

   public IntIntMap(int var1, float var2) {
      if (!(var2 <= 0.0F) && !(var2 >= 1.0F)) {
         IntIntMap var10000 = this;
         IntIntMap var10001 = this;
         IntIntMap var10002 = this;
         this.xL0 = var2;
         int var4;
         int var10004 = var4 = af_1.NK(var1, var2);
         this.ZI = (int)((float)var4 * var2);
         int var3;
         this.jy0 = var3 = var10004 - 1;
         var10002.qe = Long.numberOfLeadingZeros((long)var3);
         var10001.oY = new int[var4];
         var10000.xA = new int[var4];
      } else {
         throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + var2);
      }
   }

   public IntIntMap(IntIntMap var1) {
      this((int)Math.floor((float)var1.oY.length * var1.xL0), var1.xL0);
      int[] var2 = var1.oY;
      System.arraycopy(var2, 0, this.oY, 0, var2.length);
      var2 = var1.xA;
      System.arraycopy(var2, 0, this.xA, 0, var2.length);
      this.gW = var1.gW;
      this.LPT3 = var1.LPT3;
      this.mD0 = var1.mD0;
   }

   public IntIntMap(PS var1) {
      this((int)((float)var1.oY.length * var1.xL0), var1.xL0);
      System.arraycopy(var1.oY, 0, this.oY, 0, var1.oY.length);
      System.arraycopy(var1.xA, 0, this.xA, 0, var1.xA.length);
      this.gW = var1.gW;
      this.LPT3 = var1.LPT3;
      this.mD0 = var1.mD0;
   }

   public final void m9(int var1, int var2) {
      if (var1 == 0) {
         this.LPT3 = var2;
         if (!this.mD0) {
            this.mD0 = true;
            ++this.gW;
         }

      } else {
         int var3;
         if ((var3 = this.tl(var1)) >= 0) {
            this.xA[var3] = var2;
         } else {
            var3 = -(var3 + 1);
            int[] var4;
            (var4 = this.oY)[var3] = var1;
            this.xA[var3] = var2;
            if (++this.gW >= this.ZI) {
               int var10000 = var4.length << 1;
               var1 = var4.length;
               this.ZI = (int)((float)var10000 * this.xL0);
               this.qe = Long.numberOfLeadingZeros((long)(this.jy0 = var10000 - 1));
               int[] var10 = this.oY;
               int[] var12 = this.xA;
               this.oY = new int[var10000];
               this.xA = new int[var10000];
               if (this.gW > 0) {
                  for(int var13 = 0; var13 < var1; ++var13) {
                     int var5;
                     if ((var5 = var10[var13]) != 0) {
                        int var6 = var12[var13];
                        int[] var7 = this.oY;

                        int var8;
                        for(var8 = (int)((long)var5 * -7046029254386353131L >>> this.qe); var7[var8] != 0; var8 = var8 + 1 & this.jy0) {
                        }

                        var7[var8] = var5;
                        this.xA[var8] = var6;
                     }
                  }
               }
            }

         }
      }
   }

   public final int Ol(int var1, int var2) {
      if (var1 == 0) {
         if (this.mD0) {
            var2 = this.LPT3;
         }

         return var2;
      } else {
         if ((var1 = this.tl(var1)) >= 0) {
            var2 = this.xA[var1];
         }

         return var2;
      }
   }

   public final void clear() {
      if (this.gW != 0) {
         Arrays.fill(this.oY, 0);
         this.gW = 0;
         this.mD0 = false;
      }
   }

   public final int hashCode() {
      int var1 = this.gW;
      if (this.mD0) {
         var1 += this.LPT3;
      }

      int[] var2;
      int[] var10000 = var2 = this.oY;
      int[] var6 = this.xA;
      int var3 = 0;

      for(int var4 = var10000.length; var3 < var4; ++var3) {
         int var5;
         if ((var5 = var2[var3]) != 0) {
            var1 += var5 * 31 + var6[var3];
         }
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof IntIntMap)) {
         return false;
      } else {
         IntIntMap other = (IntIntMap)var1;
         if (other.gW != this.gW) {
         return false;
         }
         boolean var2;
         if (other.mD0 != (var2 = this.mD0)) {
            return false;
         } else if (var2 && other.LPT3 != this.LPT3) {
            return false;
         } else {
            int[] var9;
            int[] var10000 = var9 = this.oY;
            int[] var7 = this.xA;
            int var3 = 0;
            int var4 = var10000.length;

            while(true) {
               if (var3 >= var4) {
                  return true;
               }

               int var5;
               if ((var5 = var9[var3]) != 0) {
                  int var6;
                  if ((var6 = other.Ol(var5, 0)) == 0) {
                     if (var5 == 0) {
                        if (!other.mD0) {
                           break;
                        }
                     } else if (other.tl(var5) < 0) {
                        break;
                     }
                  }

                  if (var6 != var7[var3]) {
                     return false;
                  }
               }

               ++var3;
            }

            return false;
         }
      }
   }

   public final String toString() {
      if (this.gW == 0) {
         return "[]";
      } else {
         StringBuilder var1;
          StringBuilder var10002 = var1 = new StringBuilder(32);
         var10002.append('[');
         int[] var2;
         int[] var10001 = var2 = this.oY;
         int[] var3 = this.xA;
         int var4 = var10001.length;
         if (this.mD0) {
            var1.append("0=");
            var1.append(this.LPT3);
         } else {
            while(true) {
               int var10000 = var4;
               var4 += -1;
               if (var10000 <= 0) {
                  break;
               }

               int var5;
               if ((var5 = var2[var4]) != 0) {
                  var1.append(var5);
                  var1.append('=');
                  var1.append(var3[var4]);
                  break;
               }
            }
         }

         while(true) {
            int var7 = var4;
            var4 += -1;
            if (var7 <= 0) {
               var1.append(']');
               return var1.toString();
            }

            int var6;
            if ((var6 = var2[var4]) != 0) {
               var1.append(", ");
               var1.append(var6);
               var1.append('=');
               var1.append(var3[var4]);
            }
         }
      }
   }

   public final Iterator iterator() {
      if (this.lPT4 == null) {
         cr_1 var1;
         var1 = new cr_1(this);
         this.lPT4 = var1;
         var1 = new cr_1(this);
         this.const$ = var1;
      }

      cr_1 var2;
      cr_1 var4;
      if (!(var4 = this.lPT4).wK) {
         IntIntMap var10000 = this;
         var4.nA();
         (var2 = this.lPT4).wK = true;
         var10000.const$.wK = false;
      } else {
         IntIntMap var5 = this;
         this.const$.nA();
         (var2 = this.const$).wK = true;
         var5.lPT4.wK = false;
      }

      return var2;
   }

   public final int tl(int var1) {
      int[] var2 = this.oY;

      int var3;
      int var4;
      for(var3 = (int)((long)var1 * -7046029254386353131L >>> this.qe); (var4 = var2[var3]) != 0; var3 = var3 + 1 & this.jy0) {
         if (var4 == var1) {
            return var3;
         }
      }

      return -(var3 + 1);
   }
}

