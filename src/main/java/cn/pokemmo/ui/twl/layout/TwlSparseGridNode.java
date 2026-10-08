package cn.pokemmo.ui.twl.layout;

import f.*;
import cn.pokemmo.ui.twl.core.*;

import java.util.Arrays;

/**
 * 稀疏网格节点 (SparseGrid.Node)
 */
public class TwlSparseGridNode extends cw0_0 {
   // $FF: synthetic field
   public static final boolean LL0 = fa_1.class.desiredAssertionStatus() ^ true;
   public final cw0_0[] Sp0;
   public int l1;
   public A50 x50;
   public A50 uw;

   public TwlSparseGridNode(int var1) {
      this.Sp0 = new cw0_0[var1];
   }

   public final boolean aF0(int var1, NH0 var2) {
      if ((var1 = var1 + -1) == 0) {
         var1 = var2.pt0;
         int var12 = var2.Sr0;
         int var15 = this.l1;
         boolean var10000;
         if ((var1 = this.zd(var1, var12, var15)) < this.l1) {
            cw0_0 var13 = this.Sp0[var1];
            boolean var10001 = LL0;
            if (!var10001 && var13.getClass() == A50.class) {
               throw new AssertionError();
            }

            int var5 = var2.pt0;
            int var6 = var2.Sr0;
            if ((var5 = var13.pt0 - var5) == 0) {
               var5 = var13.Sr0 - var6;
            }

            if (var5 == 0) {
               this.Sp0[var1] = var2;
               var10000 = true;
               return var10000;
            }

            if (!var10001 && var5 <= 0) {
               throw new AssertionError();
            }
         }

         if (this.l1 == this.Sp0.length) {
            var10000 = false;
         } else {
            this.Ug0(var1, var2);
            var10000 = true;
         }

         return var10000;
      } else {
         while(true) {
            int var3 = var2.pt0;
            int var4 = var2.Sr0;
            var3 = this.zd(var3, var4, this.l1 - 1);
            if (!LL0 && var3 >= this.l1) {
               throw new AssertionError();
            }

            A50 var14;
            if ((var14 = (A50)this.Sp0[var3]).aF0(var1, var2)) {
               this.Di();
               return true;
            }

            if (this.l1 == this.Sp0.length) {
               return false;
            }

            int var10001 = var3;
            A50 var11 = var14.F7();
            this.Ug0(var10001 + 1, var11);
         }
      }
   }

   public final cw0_0 J20(int var1, int var2, int var3) {
      if ((var3 = var3 + -1) != 0) {
         int var17 = this.l1 - 1;
         var17 = this.zd(var1, var2, var17);
         if (!LL0 && var17 >= this.l1) {
            throw new AssertionError();
         } else {
            A50 var5;
            cw0_0 var11;
            if ((var11 = (var5 = (A50)this.Sp0[var17]).J20(var1, var2, var3)) != null) {
               if (var5.l1 == 0) {
                  this.Ck0(var17);
               } else if (var5.sz() && (var2 = this.l1) != 0 && var2 != 1) {
                  if (var2 != 2) {
                     if (var17 + 1 == var2) {
                        this.GX(var17 - 1);
                     } else if (var17 == 0) {
                        this.GX(1);
                     } else {
                        this.GX(var17);
                     }
                  } else {
                     this.lPT3();
                  }
               }

               this.Di();
            }

            return var11;
         }
      } else {
         var3 = this.l1;
         cw0_0 var6;
         if ((var3 = this.zd(var1, var2, var3)) != this.l1) {
            cw0_0 var4 = this.Sp0[var3];
            if (!LL0 && var4.getClass() == A50.class) {
               throw new AssertionError();
            }

            if ((var1 = var4.pt0 - var1) == 0) {
               var1 = var4.Sr0 - var2;
            }

            if (var1 == 0) {
               var1 = this.l1 - 1;
               this.l1 = var1;
               cw0_0[] var10001 = this.Sp0;
               int var10003 = var1;
               var1 = var3 + 1;
               var2 = var10003 - var3;
               System.arraycopy(var10001, var1, var10001, var3, var2);
               this.Sp0[var1 = this.l1] = null;
               if (var3 == var1 && var1 > 0) {
                  this.Di();
               }

               var6 = var4;
               return var6;
            }
         }

         var6 = null;
         return var6;
      }
   }

   public final int zd(int var1, int var2, int var3) {
      int var4 = 0;

      while(var4 < var3) {
         int var5 = var4 + var3 >>> 1;
         cw0_0 var6;
         int var7;
         if ((var7 = (var6 = this.Sp0[var5]).pt0 - var1) == 0) {
            var7 = var6.Sr0 - var2;
         }

         if (var7 > 0) {
            var3 = var5;
         } else {
            if (var7 >= 0) {
               return var5;
            }

            var4 = var5 + 1;
         }
      }

      return var4;
   }

   public final void iM(int var1, int var2, int var3) {
      if ((var3 = var3 + -1) > 0) {
         int var4 = this.l1;

         while(true) {
            int var10000 = var4;
            var4 += -1;
            A50 var5;
            if (var10000 <= 0 || (var5 = (A50)this.Sp0[var4]).pt0 < var1) {
               break;
            }

            var5.iM(var1, var2, var3);
         }
      } else {
         var3 = this.l1;

         while(true) {
            int var10 = var3;
            var3 += -1;
            cw0_0 var8;
            int var9;
            if (var10 <= 0 || (var9 = (var8 = this.Sp0[var3]).pt0) < var1) {
               break;
            }

            var8.pt0 = var9 + var2;
         }
      }

      this.Di();
   }

   public final boolean Com5(int var1, int var2, int var3) {
      if ((var3 = var3 + -1) > 0) {
         boolean var4 = false;
         int var5 = this.l1;

         label57:
         while(true) {
            int var10000 = var5;
            var5 += -1;
            A50 var6;
            if (var10000 <= 0 || (var6 = (A50)this.Sp0[var5]).pt0 < var1) {
               if (var4 && (var1 = this.l1) > 1) {
                  if (var1 == 2) {
                     this.lPT3();
                  } else {
                     --var1;

                     while(true) {
                        var2 = var1 + -1;
                        if (var1 <= 1) {
                           break label57;
                        }

                        if (this.GX(var2)) {
                           var1 -= 2;
                        } else {
                           var1 = var2;
                        }
                     }
                  }
               }
               break;
            }

            if (var6.Com5(var1, var2, var3)) {
               this.Ck0(var5);
            } else {
               var4 |= var6.sz();
            }
         }
      } else {
         var3 = this.l1;

         while(true) {
            int var15 = var3 + -1;
            int var7;
            cw0_0[] var16;
            cw0_0 var17;
            if (var3 <= 0 || (var7 = (var17 = (var16 = this.Sp0)[var15]).pt0) < var1) {
               break;
            }

            if ((var17.pt0 = var7 - var2) < var1) {
               int var13;
               int var10003 = var13 = this.l1 - 1;
               this.l1 = var13;
               int var14 = var10003 - var15;
               System.arraycopy(var16, var3, var16, var15, var14);
               this.Sp0[this.l1] = null;
            }

            var3 = var15;
         }
      }

      if (this.l1 == 0) {
         return true;
      } else {
         this.Di();
         return false;
      }
   }

   public final void Ug0(int var1, cw0_0 var2) {
      int var10000 = var1;
      cw0_0[] var3;
      cw0_0[] var10004 = var3 = this.Sp0;
      int var4 = var1 + 1;
      int var5 = this.l1 - var1;
      System.arraycopy(var10004, var1, var3, var4, var5);
      this.Sp0[var1] = var2;
      this.l1 = (var1 = this.l1) + 1;
      if (var10000 == var1) {
         this.Di();
      }

   }

   public final void Ck0(int var1) {
      cw0_0[] var2;
      A50 var3;
      A50 var4;
      if ((var4 = (var3 = (A50)(var2 = this.Sp0)[var1]).x50) != null) {
         var4.uw = var3.uw;
      }

      A50 var5;
      if ((var5 = var3.uw) != null) {
         var5.x50 = var4;
      }

      var3.x50 = null;
      var3.uw = null;
      int var6;
      int var10002 = var6 = this.l1 - 1;
      this.l1 = var6;
      var6 = var1 + 1;
      int var8 = var10002 - var1;
      System.arraycopy(var2, var6, var2, var1, var8);
      this.Sp0[this.l1] = null;
   }

   public final boolean sz() {
      return this.l1 * 2 < this.Sp0.length;
   }

   public final A50 F7() {
      A50 var1 = new A50(this.Sp0.length);
      int var10011 = this.l1;
      int var2 = var10011 / 2;
      int var3 = var10011 - var2;
      System.arraycopy(this.Sp0, var2, var1.Sp0, 0, var3);
      Arrays.fill(this.Sp0, var2, this.l1, (Object)null);
      var1.l1 = var3;
      var1.Di();
      var1.uw = (A50) this;
      var1.x50 = this.x50;
      this.l1 = var2;
      this.Di();
      this.x50 = var1;
      if (var1.x50 != null) {
         var1.x50.uw = var1;
      }

      return var1;
   }

   public final void Di() {
      if (this.l1 <= 0) {
         return;
      }
      A50 var10000 = (A50) this;
      cw0_0 var1;
      super.pt0 = (var1 = this.Sp0[this.l1 - 1]).pt0;
      var10000.Sr0 = var1.Sr0;
   }

   public final void lPT3() {
      cw0_0[] var10000 = this.Sp0;
      A50 var1 = (A50)var10000[0];
      int var2 = 1;
      A50 var3 = (A50)var10000[1];
      if (var1.sz() || var3.sz()) {
         int var4;
         int var5;
         int var6;
         if ((var6 = (var4 = var1.l1) + (var5 = var3.l1)) < this.Sp0.length) {
            System.arraycopy(var3.Sp0, 0, var1.Sp0, var4, var5);
            var1.l1 = var6;
            var1.Di();
            this.Ck0(var2);
         } else {
            A50 var10001 = var1;
            Object[] var7;
            Object[] var10002 = var7 = new Object[var6];
            A50 var10005 = var1;
            Object[] var10006 = var7;
            A50 var10007 = var1;
            A50 var10008 = var1;
            A50 var10011 = var1;
            System.arraycopy(var1.Sp0, 0, var7, 0, var4);
            int var11 = var1.l1;
            var2 = var3.l1;
            System.arraycopy(var3.Sp0, 0, var7, var11, var2);
            int var8;
            var10011.l1 = var8 = var6 / 2;
            var3.l1 = var6 - var8;
            cw0_0[] var9 = var10008.Sp0;
            var11 = var10007.l1;
            System.arraycopy(var10006, 0, var9, 0, var11);
            int var10 = var10005.l1;
            cw0_0[] var13 = var3.Sp0;
            var2 = var3.l1;
            System.arraycopy(var10002, var10, var13, 0, var2);
            var10001.Di();
            var3.Di();
         }
      }

   }

   public final boolean GX(int var1) {
      Object[] var10000 = this.Sp0;
      A50 var2 = (A50)var10000[var1 - 1];
      A50 var3 = (A50)var10000[var1];
      int var4;
      A50 var5 = (A50)var10000[var4 = var1 + 1];
      if (var2.sz() || var3.sz() || var5.sz()) {
         int var6;
         int var7;
         int var8;
         if ((var8 = (var6 = var2.l1) + (var7 = var3.l1) + var5.l1) < this.Sp0.length) {
            int var31 = var1;
            A50 var33 = (A50)this;
            System.arraycopy(var3.Sp0, 0, var2.Sp0, var6, var7);
            cw0_0[] var15 = var2.Sp0;
            var1 = var2.l1 + var3.l1;
            int var23 = var5.l1;
            System.arraycopy(var5.Sp0, 0, var15, var1, var23);
            var2.l1 = var8;
            var2.Di();
            var33.Ck0(var4);
            this.Ck0(var31);
            return true;
         }

         Object[] var16 = new Object[var8];
         System.arraycopy(var2.Sp0, 0, var16, 0, var6);
         var6 = var2.l1;
         var7 = var3.l1;
         System.arraycopy(var3.Sp0, 0, var16, var6, var7);
         var6 = var2.l1 + var3.l1;
         var7 = var5.l1;
         System.arraycopy(var5.Sp0, 0, var16, var6, var7);
         if (var8 < this.Sp0.length * 2) {
            A50 var10002 = var3;
            Object[] var10003 = var16;
            var3.l1 = var8 - (var2.l1 = var8 / 2);
            int var9 = var2.l1;
            System.arraycopy(var16, 0, var2.Sp0, 0, var9);
            var9 = var2.l1;
            cw0_0[] var17 = var3.Sp0;
            int var21 = var3.l1;
            System.arraycopy(var10003, var9, var17, 0, var21);
            var2.Di();
            var10002.Di();
            this.Ck0(var4);
         } else {
            A50 var10001 = var3;
            Object[] var32 = var16;
            Object[] var10005 = var16;
            int var11;
            var3.l1 = var11 = (var8 - (var2.l1 = var8 / 3)) / 2;
            var5.l1 = var8 - (var2.l1 + var11);
            var11 = var2.l1;
            System.arraycopy(var16, 0, var2.Sp0, 0, var11);
            var11 = var2.l1;
            cw0_0[] var18 = var3.Sp0;
            var4 = var3.l1;
            System.arraycopy(var10005, var11, var18, 0, var4);
            var11 = var2.l1 + var3.l1;
            var18 = var5.Sp0;
            int var22 = var5.l1;
            System.arraycopy(var32, var11, var18, 0, var22);
            var2.Di();
            var10001.Di();
            var5.Di();
         }
      }

      return false;
   }
}
