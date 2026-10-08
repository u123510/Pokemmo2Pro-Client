package cn.pokemmo.order;

import f.*;

public class OrderedBoxLayoutSpec implements Comparable {
   public lq_2 uj;
   public eb0_1 xQ;
   public eb0_1 Rb0;
   public a00_0 Zk0;
   public a00_0 HH;

   public OrderedBoxLayoutSpec(lq_2 var1, eb0_1 var2, eb0_1 var3, a00_0 var4, a00_0 var5) {
      this.uj = null;
      this.Td0(var1, var2, var3, var4, var5);
   }

   public OrderedBoxLayoutSpec(lq_2 var1) {
      this(var1, (eb0_1)null, (eb0_1)null, (a00_0)null, (a00_0)null);
   }

   public OrderedBoxLayoutSpec() {
      this.uj = null;
   }

   public final void Td0(lq_2 var1, eb0_1 var2, eb0_1 var3, a00_0 var4, a00_0 var5) {
      this.uj = var1;
      this.xQ = var2;
      this.Rb0 = var3;
      this.Zk0 = var4;
      this.HH = var5;
   }

   public final void h1(OrderedBoxLayoutSpec var1) {
      this.uj = var1.uj;
      this.xQ = var1.xQ;
      this.Rb0 = var1.Rb0;
      this.Zk0 = var1.Zk0;
      this.HH = var1.HH;
   }

   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OrderedBoxLayoutSpec)) {
         return false;
      } else {
         OrderedBoxLayoutSpec var2;
         return (var2 = (OrderedBoxLayoutSpec)var1).uj == this.uj && var2.xQ == this.xQ && var2.Rb0 == this.Rb0 && var2.Zk0 == this.Zk0 && var2.HH == this.HH;
      }
   }

   public final int hashCode() {
      lq_2 var1;
      long var2 = (long)((var1 = this.uj) == null ? 0 : var1.glTarget);
      var2 *= 811L;
      long var4 = (long)(var1 == null ? 0 : var1.getTextureObjectHandle());
      long var8 = (var2 + var4) * 811L;
      eb0_1 var3;
      int var13;
      if ((var3 = this.xQ) == null) {
         var13 = 0;
      } else {
         var13 = var3.vv0;
      }

      var8 = (var8 + (long)var13) * 811L;
      eb0_1 var14;
      int var15;
      if ((var14 = this.Rb0) == null) {
         var15 = 0;
      } else {
         var15 = var14.vv0;
      }

      var8 = (var8 + (long)var15) * 811L;
      a00_0 var16;
      int var17;
      if ((var16 = this.Zk0) == null) {
         var17 = 0;
      } else {
         var17 = var16.kj;
      }

      var8 = (var8 + (long)var17) * 811L;
      a00_0 var6;
      int var7;
      if ((var6 = this.HH) == null) {
         var7 = 0;
      } else {
         var7 = var6.kj;
      }

      return (int)(var8 + (long)var7 ^ var8 + (long)var7 >> 32);
   }

   public final int kC(OrderedBoxLayoutSpec var1) {
      if (var1 == this) {
         return 0;
      } else {
         lq_2 var2;
         int var3;
         if ((var2 = this.uj) == null) {
            var3 = 0;
         } else {
            var3 = var2.glTarget;
         }

         lq_2 var4;
         int var24;
         if ((var4 = var1.uj) == null) {
            var24 = 0;
         } else {
            var24 = var4.glTarget;
         }

         if (var3 != var24) {
            return var3 - var24;
         } else {
            int var15;
            if (var2 == null) {
               var15 = 0;
            } else {
               var15 = var2.getTextureObjectHandle();
            }

            lq_2 var19;
            int var20;
            if ((var19 = var1.uj) == null) {
               var20 = 0;
            } else {
               var20 = var19.getTextureObjectHandle();
            }

            if (var15 != var20) {
               return var15 - var20;
            } else {
               eb0_1 var16;
               eb0_1 var21;
               if ((var16 = this.xQ) != (var21 = var1.xQ)) {
                  int var9;
                  if (var16 == null) {
                     var9 = 0;
                  } else {
                     var9 = var16.vv0;
                  }

                  int var14;
                  if (var21 == null) {
                     var14 = 0;
                  } else {
                     var14 = var21.vv0;
                  }

                  return var9 - var14;
               } else if ((var16 = this.Rb0) != (var21 = var1.Rb0)) {
                  int var8;
                  if (var16 == null) {
                     var8 = 0;
                  } else {
                     var8 = var16.vv0;
                  }

                  int var13;
                  if (var21 == null) {
                     var13 = 0;
                  } else {
                     var13 = var21.vv0;
                  }

                  return var8 - var13;
               } else {
                  a00_0 var18;
                  a00_0 var23;
                  if ((var18 = this.Zk0) != (var23 = var1.Zk0)) {
                     int var7;
                     if (var18 == null) {
                        var7 = 0;
                     } else {
                        var7 = var18.kj;
                     }

                     int var12;
                     if (var23 == null) {
                        var12 = 0;
                     } else {
                        var12 = var23.kj;
                     }

                     return var7 - var12;
                  } else {
                     a00_0 var5;
                     a00_0 var10;
                     if ((var5 = this.HH) != (var10 = var1.HH)) {
                        int var6;
                        if (var5 == null) {
                           var6 = 0;
                        } else {
                           var6 = var5.kj;
                        }

                        int var11;
                        if (var10 == null) {
                           var11 = 0;
                        } else {
                           var11 = var10.kj;
                        }

                        return var6 - var11;
                     } else {
                        return 0;
                     }
                  }
               }
            }
         }
      }
   }

   public final int compareTo(Object var1) {
      return this.kC((OrderedBoxLayoutSpec)var1);
   }
}
