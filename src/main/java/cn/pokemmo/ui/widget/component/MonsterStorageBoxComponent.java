package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MonsterStorageBoxComponent extends BaseComponent {
   public static final MD0 Xa0;
   public static final MD0 sy0;
   public static final MD0 Vp0;
   public static final MD0 Uv;
   public static final Bp0 wd0;
   public static final boolean Jt0;
   public final KB nh0;
   public final KB g1;
   public final le0_2 GW;
   public EN wC0;
   public le0_2 Fe;
   public L50 is;
   public L50 q70;
   public L50 t60;
   public boolean hy;
   public boolean wn;
   public boolean Hz0;
   public int ik0;
   public C90 Wc;
   public long Eb;
   public float NUL;
   public float bE0;
   public float PF0;
   public float O9;
   public float ry;
   public float t1;
   public float LQ;
   public boolean Zx;
   public final boolean H3;
   public boolean e30;
   public float C50;
   public final ql_0 QD;
   public float lpt4;
   public boolean mH;
   public int m10 = 1;

   public MonsterStorageBoxComponent() {
      this(null);
   }

   public MonsterStorageBoxComponent(le0_2 var1) {
      L50 var2 = L50.Uy;
      this.is = var2;
      this.q70 = var2;
      this.t60 = var2;
      this.Eb = 0L;
      this.NUL = 0.0F;
      this.Zx = false;
      this.H3 = true;
      this.e30 = true;
      this.C50 = 50.0F;
      ql_0 var6;
      var6 = new ql_0();
      this.QD = var6;
      this.lpt4 = 1.0F;
      this.mH = true;
      KB var7;
      var7 = new KB(1);
      this.nh0 = var7;
      KB var3;
      var3 = new KB(2);
      this.g1 = var3;
      le0_2 var4;
      le0_2 var10000 = var4 = new le0_2();
      this.GW = var4;
      Runnable var5;
      var7.c9(var5 = this::dL0);
      var7.Ll(true);
      var3.c9(var5);
      var3.Ll(true);
      var10000.m00();
      var10000.uf("");
      super.F9(0, var4);
      super.F9(1, var7);
      super.F9(2, var3);
      this.AH0(var1);
      this.Oq0(true);
   }

   public static f.lo0_0 public$(le0_2 var0) {
      le0_2 var1 = var0.K20;
      if (var1 != null && (var1 = var1.K20) instanceof MonsterStorageBoxComponent) {
         MonsterStorageBoxComponent var2 = (MonsterStorageBoxComponent)var1;
         if (MonsterStorageBoxComponent.class.desiredAssertionStatus() && var2.Fe != var0) {
            throw new AssertionError();
         } else {
            return (f.lo0_0)(Object)var2;
         }
      } else {
         return null;
      }
   }

   public static Stream SH0(le0_2 var0) {
      return Arrays.stream(var0.t30.rZ);
   }

   public static le0_2[] Bn0(int var0) {
      return new le0_2[var0];
   }

   static {
      Jt0 = !MonsterStorageBoxComponent.class.desiredAssertionStatus();
      Xa0 = MD0.cB("downArrowArmed");
      sy0 = MD0.cB("rightArrowArmed");
      Vp0 = MD0.cB("horizontalScrollbarVisible");
      Uv = MD0.cB("verticalScrollbarVisible");
      MD0.cB("autoScrollUp");
      MD0.cB("autoScrollDown");
      wd0 = new Bp0();
   }

   public final void iy() {
      long var1 = System.currentTimeMillis();
      this.Eb = var1;
      float var6 = this.NUL;
      if (this.NUL > 0.0F) {
         float var7 = lg_0.S4.uL;
         this.lpt4 = 0.5F;
         float var2 = var6 / 0.5F;
         KB var3 = this.nh0;
         float var4 = this.nh0.VP;
         this.O9 = var4;
         float var5 = this.g1.VP;
         this.e30 = false;
         this.C50 = 0.0F;
         var4 = uj_0.SJ0(this.bE0, var2, var7, var4);
         this.O9 = var4;
         this.ry = uj_0.SJ0(this.PF0, var2, var7, var5);
         if (this.H3) {
            this.nh0.jd0((int)LW.r1(var4, 0.0F, var3.hm), true);
            int var9;
            if (this.e30) {
               var2 = this.C50;
               var9 = (int)LW.r1(this.ry, -this.C50, this.g1.hm + var2);
            } else {
               var9 = (int)LW.r1(this.ry, 0.0F, this.g1.hm);
            }

            this.Xr0(var9);
         }

         var2 = this.O9;
         float var12 = this.C50;
         if (this.O9 == (var4 = -this.C50)) {
            this.bE0 = 0.0F;
         }

         if (var2 >= this.nh0.hm + var12) {
            this.bE0 = 0.0F;
         }

         var2 = this.ry;
         if (this.ry == var4) {
            this.PF0 = 0.0F;
         }

         if (var2 >= this.g1.hm + var12) {
            this.PF0 = 0.0F;
         }

         if ((this.NUL -= var7) <= 0.0F) {
            this.bE0 = 0.0F;
            this.PF0 = 0.0F;
         }
      }
   }

   @Override
   public final String Ck() {
      return "scrollpane";
   }

   @Override
   public final void C(zk0_1 var1) {
      if (this.mH) {
         mh_1 var4 = var1.cL;
         byte var2 = 0;
         C90 var3;
         C90 var10001 = var3 = new C90(new jn_1((f.lo0_0)(Object)this));
         this.Wc = var10001;
         var4.HV.P6(var2, var3);
      }
   }

   @Override
   public final void N00(zk0_1 var1) {
      if (this.mH) {
         mh_1 var2 = var1.cL;
         var2.HV.sj0(this.Wc, true);
      }
   }

   public final void AH0(le0_2 var1) {
      if (this.Fe != null) {
         this.GW.em();
         this.Fe = null;
      }

      if (var1 != null) {
         this.Fe = var1;
         this.GW.SL(var1);
      }
   }

   public final void Xr0(int var1) {
      this.g1.jd0(var1, true);
   }

   public final void Yj0(int var1, int var2, int var3) {
      KB var8;
      (var8 = this.g1).getClass();
      if (var2 > 0) {
         if (var3 < 0) {
            var3 = 0;
         }

         int var9 = var1 + var2;
         int var10001 = var2 = var8.cOm7(var1);
         int var4 = var8.VP;
         int var5;
         if ((var5 = var8.cOm7(var10001 - var3)) < var4) {
            var4 = var5;
         }

         int var6 = var8.YJ0;
         int var7 = var4 + var8.YJ0;
         if ((var3 = var9 + var3) > var7 && (var4 = var8.cOm7(var3 - var6)) > var5) {
            var1 = var9 - var2;
            var4 = var2 - Math.max(0, var8.YJ0 - var1) / 2;
         }

         var8.DL(var4);
      }
   }

   public final void Rn(le0_2 var1) {
      if (var1 != null && var1.Bf0(this)) {
         int var2 = super.SB0 + super.y9;
         int var3 = this.g1.VP;
         int var4;
         if ((var4 = var1.SB0 + var1.y9 - var2 + var3 - this.k5() / 3) < 0) {
            var4 = 0;
         }

         this.Xr0(var4);
      } else {
         this.Xr0(0);
      }
   }

   public final void FR(Predicate var1) {
      le0_2[] var2;
      int var3 = (var2 = (le0_2[])Arrays.stream(this.GW.t30.rZ)
            .filter(Objects::nonNull)
            .flatMap(child -> MonsterStorageBoxComponent.SH0((le0_2)child))
            .toArray(MonsterStorageBoxComponent::Bn0)).length;

      for (int var4 = 0; var4 < var3; var4++) {
         le0_2 var5;
         if (var1.test(var5 = var2[var4])) {
            this.Rn(var5);
            return;
         }
      }

      this.Xr0(0);
   }

   @Override
   public final int R1() {
      int var1 = super.R1();
      int var2 = super.e80 + super.NV;
      if (this.m10 == 2 && this.Fe != null) {
         KB var3 = this.g1;
         int var4;
         if (this.g1.eE) {
            var4 = var3.R1();
         } else {
            var4 = 0;
         }

         var1 = Math.max(var1, this.Fe.R1() + var2 + var4);
      }

      return var1;
   }

   @Override
   public final int Se() {
      int var1 = super.Se();
      int var2 = super.y9 + super.Cz;
      if (this.m10 == 3 && this.Fe != null) {
         KB var3 = this.nh0;
         int var4;
         if (this.nh0.eE) {
            var4 = var3.Se();
         } else {
            var4 = 0;
         }

         var1 = Math.max(var1, this.Fe.Se() + var2 + var4);
      }

      return var1;
   }

   @Override
   public final int pi0() {
      if (this.Fe != null) {
         int var1;
         if ((var1 = J90.Qj(this.m10)) == 1) {
            int var2 = le0_2.du0(this.Fe.R1(), this.Fe.m0(), this.Fe.S2());
            KB var3;
            if ((var3 = this.g1).eE) {
               var2 += var3.R1();
            }

            return var2;
         }

         if (var1 == 2) {
            return this.Fe.m0();
         }
      }

      return 0;
   }

   @Override
   public final int zs0() {
      if (this.Fe != null) {
         int var1;
         if ((var1 = J90.Qj(this.m10)) == 1) {
            return this.Fe.rm0();
         }

         if (var1 == 2) {
            int var2 = le0_2.du0(this.Fe.Se(), this.Fe.rm0(), this.Fe.KC0());
            KB var3;
            if ((var3 = this.nh0).eE) {
               var2 += var3.Se();
            }

            return var2;
         }
      }

      return 0;
   }

   @Override
   public final void em() {
      this.AH0(null);
   }

   @Override
   public final le0_2 fC0(int var1) {
      throw new UnsupportedOperationException("use setContent");
   }

   @Override
   public final void Ib(Jn0 var1) {
      super.Ib(var1);
      LC0 var3;
      LC0 var10000 = var3 = (LC0)var1;
      var3.H10(var3.H10(5, "autoScrollArea") * 2, "autoScrollSpeed");
      L50 var4 = L50.Uy;
      this.is = (L50)var3.N30("hscrollbarOffset", false, L50.class, var4);
      this.q70 = (L50)var3.N30("vscrollbarOffset", false, L50.class, var4);
      this.t60 = (L50)var3.N30("contentScrollbarSpacing", false, L50.class, var4);
      this.Hz0 = var3.SD("scrollbarsAlwaysVisible", false);
      boolean var5;
      if ((var5 = var10000.SD("hasDragButton", false)) && this.wC0 == null) {
         EN var6;
         EN var8 = var6 = new EN();
         this.wC0 = var6;
         var8.uf("dragButton");
         EN var7;
         EN var10001 = var7 = this.wC0;
         zz_0 var2;
         var2 = new zz_0((f.lo0_0)(Object)this);
         var10001.Rk = var2;
         super.F9(3, var7);
      } else if (!var5 && this.wC0 != null) {
         if (MonsterStorageBoxComponent.class.desiredAssertionStatus() && this.qA(3) != this.wC0) {
            throw new AssertionError();
         }

         super.fC0(3);
         this.wC0 = null;
      }
   }

   @Override
   public final void Iu() {
      if (!this.hy) {
         this.hy = true;
         try {
            le0_2 content = this.Fe;
            if (content != null) {
               content.Iu();
            }
            super.Iu();
         } finally {
            this.hy = false;
         }
      }
   }

   @Override
   public final void es(le0_2 var1) {
      if (var1 == this.GW) {
         this.bA0();
      } else {
         this.COm3();
      }
   }

   @Override
   public final void FW(zk0_1 var1) {
      this.ik0 = 0;
   }

   /*
    * Previous bytecode-shaped reconstruction retained for comparison while
    * the ScrollPane layout is expressed in the TWL terms below.
    *
    * This entire block is intentionally disabled; the active implementation
    * follows immediately after it.
   private final void K8Legacy() {
      if (this.Fe != null) {
         int var1 = this.a3();
         int var2 = this.k5();
         int var3 = var1 + this.q70.Com9;
         int var4 = var2 + this.is.Eg0;
         int var5 = this.is.Com9;
         int var6 = this.q70.Eg0;
         int var7 = 0;
         int var8 = 0;
         int var9;
         int var10;
         if ((var9 = J90.Qj(this.m10)) != 1) {
            if (var9 != 2) {
               var9 = this.Fe.m0();
               var10 = this.Fe.rm0();
            } else {
               var9 = this.Fe.m0();
               var10 = var2;
            }
         } else {
            var10 = this.Fe.rm0();
            var9 = var1;
         }

         int var11 = 0;
         int var12 = 0;
         int var13;
         int var14;
         if (var1 > 0 && var2 > 0) {
            var12 = var4;
            var11 = var3;

            while (true) {
               int var47 = 0;
               boolean var50;
               if (this.m10 != 2) {
                  if ((var50 = Math.max(0, var9 - var1)) <= 0 && !this.Hz0 && (this.ik0 & 3) != 3) {
                     var47 = var12;
                     var12 = var50;
                     var50 = var47;
                  } else {
                     boolean var49 = (boolean)(var7 ^ true);
                     boolean var19 = true;
                     var12 = var4 - this.nh0.Se();
                     var7 = Math.max(0, var12 - this.t60.Eg0);
                     var47 = var12;
                     var12 = var50;
                     var7 = var19;
                     var50 = var49;
                     var2 = var7;
                  }
               } else {
                  byte var39 = 0;
                  var47 = var12;
                  var12 = var39;
                  var50 = var47;
                  var9 = var1;
               }

               boolean var54;
               if (this.m10 != 3) {
                  if ((var54 = Math.max(0, var10 - var2)) <= 0 && !this.Hz0 && (this.ik0 & 12) != 12) {
                     var50 = var54;
                     var54 = var50;
                  } else {
                     boolean var52 = (boolean)(var50 | var8 ^ true);
                     boolean var17 = true;
                     var11 = var3 - this.g1.R1();
                     var8 = Math.max(0, var11 - this.t60.Com9);
                     var50 = var54;
                     var8 = var17;
                     var1 = var8;
                     var54 = var52;
                  }
               } else {
                  byte var40 = 0;
                  var50 = var40;
                  var10 = var2;
                  var54 = var50;
               }

               if (!var54) {
                  var13 = var50;
                  var14 = var47;
                  var12 = var11;
                  var11 = var12;
                  break;
               }

               var12 = var47;
            }
         } else {
            var13 = var12;
            var14 = var4;
            var12 = var3;
         }

         if (var7 && !this.nh0.eE) {
            this.ik0 |= 1;
         }

         if (!var7 && this.nh0.eE) {
            this.ik0 |= 2;
         }

         if (var8 && !this.g1.eE) {
            this.ik0 |= 4;
         }

         if (!var8 && this.g1.eE) {
            this.ik0 |= 8;
         }

         boolean var55;
         boolean var63 = (boolean)(var55 = var7 ^ this.nh0.eE);
         boolean var16 = (boolean)(var8 ^ this.g1.eE);
         if (var63 || var16) {
            if ((!var55 || this.m10 != 3) && (!var16 || this.m10 != 2)) {
               this.bA0();
            } else {
               this.COm3();
            }
         }

         le0_2 var56 = this.Fe;
         if (this.Fe instanceof kq_2) {
            var var70 = (Nj & kq_2)var56;
            ((Nj)((kq_2)var56)).getClass();
            var55 = var2 - var70.mq;
         } else {
            var55 = var2;
         }

         this.nh0.Ll((boolean)var7);
         this.nh0.Kx0(var11);
         KB var64 = this.nh0;
         int var23 = Math.max(0, var12 - var5);
         var11 = var4 - var14;
         var64.oY(var23, Math.max(0, var11));
         this.nh0.E40(super.A20 + super.e80 + var5, super.SB0 + super.y9 + var14);
         KB var24 = this.nh0;
         if ((var5 = Math.max(1, var1)) < 1) {
            var24.getClass();
            throw new IllegalArgumentException("pageSize < 1");
         }

         var24.YJ0 = var5;
         if (var24.tE0) {
            var24.Qu();
         }

         KB var25 = this.nh0;
         if ((var5 = Math.max(1, var1 / 10)) < 1) {
            var25.getClass();
            throw new IllegalArgumentException("stepSize < 1");
         }

         var25.MU = var5;
         this.g1.Ll((boolean)var8);
         this.g1.Kx0(var13);
         KB var65 = this.g1;
         var3 -= var12;
         var4 = Math.max(0, var3);
         var5 = var14 - var6;
         var65.oY(var4, Math.max(0, var5));
         this.g1.E40(super.A20 + super.e80 + var12, super.SB0 + super.y9 + var6);
         KB var27 = this.g1;
         if ((var5 = Math.max(1, var55)) < 1) {
            var27.getClass();
            throw new IllegalArgumentException("pageSize < 1");
         }

         var27.YJ0 = var5;
         if (var27.tE0) {
            var27.Qu();
         }

         KB var28 = this.g1;
         if ((var5 = Math.max(1, var55 / 10)) < 1) {
            var28.getClass();
            throw new IllegalArgumentException("stepSize < 1");
         }

         var28.MU = var5;
         EN var29 = this.wC0;
         if (this.wC0 != null) {
            boolean var35;
            if (var7 && var8) {
               var35 = true;
            } else {
               var35 = false;
            }

            var29.Ll(var35);
            this.wC0.oY(Math.max(0, var3), Math.max(0, var11));
            this.wC0.E40(super.A20 + super.e80 + var12, super.SB0 + super.y9 + var14);
         }

         this.GW.E40(super.A20 + super.e80, super.SB0 + super.y9);
         this.GW.oY(var1, var2);
         le0_2 var21 = this.Fe;
         if (this.Fe instanceof com5__5) {
            var3 = this.GW.A20;
            var21.sy(var3, this.GW.SB0);
            this.Fe.oY(var1, var2);
         } else if (this.wn) {
            var1 = Math.max(var1, var9);
            var21.oY(var1, Math.max(var2, var10));
         } else {
            var21.oY(Math.max(0, var9), Math.max(0, var10));
         }

         KG0 var67 = super.M;
         super.M.j70(Vp0, (boolean)var7);
         var67.j70(Uv, (boolean)var8);
         this.dL0();
      } else {
         this.nh0.Ll(false);
         this.g1.Ll(false);
      }
   }

   */

   /*
    * Bytecode-shaped K8 kept as a reference only.
   private final void K8LegacyObfuscated() {
        int n;
        le0_2 le0_22;
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.Fe == null) {
            this.nh0.Ll(false);
            this.g1.Ll(false);
            return;
        }
        int n6 = this.a3();
        int n7 = this.k5();
        L50 l50 = this.q70;
        int n8 = n6 + l50.Com9;
        L50 l502 = this.is;
        int n9 = n7 + l502.Eg0;
        int n10 = l502.Com9;
        int n11 = l50.Eg0;
        int n12 = 0;
        int n13 = 0;
        int n14 = J90.Qj(this.m10);
        if (n14 != 1) {
            if (n14 != 2) {
                n14 = this.Fe.m0();
                n5 = this.Fe.rm0();
            } else {
                n14 = this.Fe.m0();
                n5 = n7;
            }
        } else {
            n5 = this.Fe.rm0();
            n14 = n6;
        }
        int n15 = 0;
        int n16 = 0;
        if (n6 <= 0 || n7 <= 0) {
            n4 = n16;
            n3 = n9;
            n16 = n8;
        } else {
            n16 = n9;
            n15 = n8;
            while (true) {
                n4 = 0;
                if (this.m10 != 2) {
                    n3 = Math.max(0, n14 - n6);
                    if (n3 <= 0 && !this.Hz0 && (this.ik0 & 3) != 3) {
                        int n17 = n4;
                        n4 = n16;
                        n16 = n3;
                        n3 = n17;
                    } else {
                        n4 = n12 ^ 1;
                        n7 = 1;
                        n16 = n9 - this.nh0.Se();
                        int n18 = n12 = Math.max(0, n16 - this.t60.Eg0);
                        int n19 = n4;
                        n4 = n16;
                        n16 = n3;
                        n12 = n7;
                        n3 = n19;
                        n7 = n18;
                    }
                } else {
                    n14 = 0;
                    int n20 = n4;
                    n4 = n16;
                    n16 = n14;
                    n3 = n20;
                    n14 = n6;
                }
                if (this.m10 != 3) {
                    n2 = Math.max(0, n5 - n7);
                    if (n2 <= 0 && !this.Hz0 && (this.ik0 & 0xC) != 12) {
                        int n21 = n3;
                        n3 = n2;
                        n2 = n21;
                    } else {
                        n3 |= n13 ^ 1;
                        n6 = 1;
                        n15 = n8 - this.g1.R1();
                        n13 = Math.max(0, n15 - this.t60.Com9);
                        int n22 = n3;
                        int n23 = n13;
                        n3 = n2;
                        n13 = n6;
                        n6 = n23;
                        n2 = n22;
                    }
                } else {
                    n5 = 0;
                    int n24 = n3;
                    n3 = n5;
                    n5 = n7;
                    n2 = n24;
                }
                if (n2 == 0) {
                    int n25 = n16;
                    int n26 = n4;
                    n4 = n3;
                    n3 = n26;
                    n16 = n15;
                    n15 = n25;
                    break;
                }
                n16 = n4;
            }
        }
        if (n12 != 0 && !this.nh0.eE) {
            this.ik0 |= 1;
        }
        if (n12 == 0 && this.nh0.eE) {
            this.ik0 |= 2;
        }
        if (n13 != 0 && !this.g1.eE) {
            this.ik0 |= 4;
        }
        if (n13 == 0 && this.g1.eE) {
            this.ik0 |= 8;
        }
        boolean horizontalChanged = (n12 != 0) ^ this.nh0.eE;
        boolean verticalChanged = (n13 != 0) ^ this.g1.eE;
        if (horizontalChanged || verticalChanged) {
            if (horizontalChanged && this.m10 == 3 || verticalChanged && this.m10 == 2) {
                this.COm3();
            } else {
                this.bA0();
            }
        }
        if ((le0_22 = this.Fe) instanceof kq_2) {
            Nj nj = (Nj)((kq_2)((Object)le0_22));
            nj.getClass();
            n = n7 - nj.mq;
        } else {
            n = n7;
        }
        this.nh0.Ll(n12 != 0);
        this.nh0.Kx0(n15);
        int n27 = n9;
        n9 = Math.max(0, n16 - n10);
        n15 = n27 - n3;
        this.nh0.oY(n9, Math.max(0, n15));
        this.nh0.E40(this.A20 + this.e80 + n10, this.SB0 + this.y9 + n3);
        KB kB = this.nh0;
        n10 = Math.max(1, n6);
        if (n10 < 1) {
            kB.getClass();
            throw new IllegalArgumentException("pageSize < 1");
        }
        kB.YJ0 = n10;
        if (kB.tE0) {
            kB.Qu();
        }
        kB = this.nh0;
        n10 = Math.max(1, n6 / 10);
        if (n10 < 1) {
            kB.getClass();
            throw new IllegalArgumentException("stepSize < 1");
        }
        kB.MU = n10;
        this.g1.Ll(n13 != 0);
        this.g1.Kx0(n4);
        int n28 = Math.max(0, n8 -= n16);
        n10 = n3 - n11;
        this.g1.oY(n28, Math.max(0, n10));
        this.g1.E40(this.A20 + this.e80 + n16, this.SB0 + this.y9 + n11);
        le0_2 le0_23 = this.g1;
        n10 = Math.max(1, n);
        if (n10 < 1) {
            le0_23.getClass();
            throw new IllegalArgumentException("pageSize < 1");
        }
        ((KB)le0_23).YJ0 = n10;
        if (((KB)le0_23).tE0) {
            ((KB)le0_23).Qu();
        }
        le0_23 = this.g1;
        n10 = Math.max(1, n / 10);
        if (n10 < 1) {
            le0_23.getClass();
            throw new IllegalArgumentException("stepSize < 1");
        }
        ((KB)le0_23).MU = n10;
        le0_23 = this.wC0;
        if (le0_23 != null) {
            n10 = n12 != 0 && n13 != 0 ? 1 : 0;
            ((xe_1)le0_23).Ll(n10 != 0);
            this.wC0.oY(Math.max(0, n8), Math.max(0, n15));
            this.wC0.E40(this.A20 + this.e80 + n16, this.SB0 + this.y9 + n3);
        }
        this.GW.E40(this.A20 + this.e80, this.SB0 + this.y9);
        this.GW.oY(n6, n7);
        le0_2 le0_24 = this.Fe;
        if (le0_24 instanceof com5__5) {
            le0_2 le0_25 = this.GW;
            int n29 = le0_25.A20;
            le0_24.sy(n29, le0_25.SB0);
            this.Fe.oY(n6, n7);
        } else if (this.wn) {
            n6 = Math.max(n6, n14);
            le0_24.oY(n6, Math.max(n7, n5));
        } else {
            le0_24.oY(Math.max(0, n14), Math.max(0, n5));
        }
        KG0 kG0 = this.M;
        kG0.j70(Vp0, n12 != 0);
        kG0.j70(Uv, n13 != 0);
        this.dL0();
   }
   */

   /**
    * ScrollPane layout.  The names follow TWL's ScrollPane.layout(), while
    * the raw m10 values and call order are kept from f/MonsterStorageBoxComponent.class.
    */
   @Override
   public final void K8() {
      if (this.Fe == null) {
         this.nh0.Ll(false);
         this.g1.Ll(false);
         return;
      }

      int availWidth = this.a3();
      int availHeight = this.k5();
      int innerWidth = availWidth + this.q70.Com9;
      int innerHeight = availHeight + this.is.Eg0;
      int scrollbarHX = this.is.Com9;
      int scrollbarHY = innerHeight;
      int scrollbarVX = innerWidth;
      int scrollbarVY = this.q70.Eg0;

      int fixed = J90.Qj(this.m10);
      int requiredWidth;
      int requiredHeight;
      if (fixed == 1) {                 // Fixed.HORIZONTAL
         requiredWidth = availWidth;
         requiredHeight = this.Fe.rm0();
      } else if (fixed == 2) {          // Fixed.VERTICAL
         requiredWidth = this.Fe.m0();
         requiredHeight = availHeight;
      } else {
         requiredWidth = this.Fe.m0();
         requiredHeight = this.Fe.rm0();
      }

      int hScrollbarMax = 0;
      int vScrollbarMax = 0;
      boolean visibleH = false;
      boolean visibleV = false;

      if (availWidth > 0 && availHeight > 0) {
         boolean repeat;
         do {
            repeat = false;

            if (this.m10 != 2) {        // horizontal axis is not fixed
               hScrollbarMax = Math.max(0, requiredWidth - availWidth);
               if (hScrollbarMax > 0 || this.Hz0 || (this.ik0 & 3) == 3) {
                  repeat |= !visibleH;
                  visibleH = true;
                  scrollbarHY = innerHeight - this.nh0.Se();
                  availHeight = Math.max(0, scrollbarHY - this.t60.Eg0);
               }
            } else {
               hScrollbarMax = 0;
               requiredWidth = availWidth;
            }

            if (this.m10 != 3) {        // vertical axis is not fixed
               vScrollbarMax = Math.max(0, requiredHeight - availHeight);
               if (vScrollbarMax > 0 || this.Hz0 || (this.ik0 & 12) == 12) {
                  repeat |= !visibleV;
                  visibleV = true;
                  scrollbarVX = innerWidth - this.g1.R1();
                  availWidth = Math.max(0, scrollbarVX - this.t60.Com9);
               }
            } else {
               vScrollbarMax = 0;
               requiredHeight = availHeight;
            }
         } while (repeat);
      }

      if (visibleH && !this.nh0.eE) {
         this.ik0 |= 1;
      }
      if (!visibleH && this.nh0.eE) {
         this.ik0 |= 2;
      }
      if (visibleV && !this.g1.eE) {
         this.ik0 |= 4;
      }
      if (!visibleV && this.g1.eE) {
         this.ik0 |= 8;
      }

      boolean changedH = visibleH ^ this.nh0.eE;
      boolean changedV = visibleV ^ this.g1.eE;
      if (changedH || changedV) {
         if ((changedH && this.m10 == 3) || (changedV && this.m10 == 2)) {
            this.COm3();
         } else {
            this.bA0();
         }
      }

      int pageSizeY = availHeight;
      if (this.Fe instanceof kq_2) {
         Nj nj = (Nj)this.Fe;
         nj.getClass();
         pageSizeY -= nj.mq;
      }

      this.nh0.Ll(visibleH);
      this.nh0.Kx0(hScrollbarMax);
      this.nh0.oY(Math.max(0, scrollbarVX - scrollbarHX),
            Math.max(0, innerHeight - scrollbarHY));
      this.nh0.E40(this.A20 + this.e80 + scrollbarHX,
            this.SB0 + this.y9 + scrollbarHY);
      this.nh0.YJ0 = Math.max(1, availWidth);
      if (this.nh0.tE0) {
         this.nh0.Qu();
      }
      this.nh0.MU = Math.max(1, availWidth / 10);

      this.g1.Ll(visibleV);
      this.g1.Kx0(vScrollbarMax);
      this.g1.oY(Math.max(0, innerWidth - scrollbarVX),
            Math.max(0, scrollbarHY - scrollbarVY));
      this.g1.E40(this.A20 + this.e80 + scrollbarVX,
            this.SB0 + this.y9 + scrollbarVY);
      this.g1.YJ0 = Math.max(1, pageSizeY);
      if (this.g1.tE0) {
         this.g1.Qu();
      }
      this.g1.MU = Math.max(1, pageSizeY / 10);

      if (this.wC0 != null) {
         this.wC0.Ll(visibleH && visibleV);
         this.wC0.oY(Math.max(0, innerWidth - scrollbarVX),
               Math.max(0, innerHeight - scrollbarHY));
         this.wC0.E40(this.A20 + this.e80 + scrollbarVX,
               this.SB0 + this.y9 + scrollbarHY);
      }

      this.GW.E40(this.A20 + this.e80, this.SB0 + this.y9);
      this.GW.oY(availWidth, availHeight);
      if (this.Fe instanceof com5__5) {
         this.Fe.sy(this.GW.A20, this.GW.SB0);
         this.Fe.oY(availWidth, availHeight);
      } else if (this.wn) {
         this.Fe.oY(Math.max(availWidth, requiredWidth),
               Math.max(availHeight, requiredHeight));
      } else {
         this.Fe.oY(Math.max(0, requiredWidth),
               Math.max(0, requiredHeight));
      }

      this.M.j70(Vp0, visibleH);
      this.M.j70(Uv, visibleV);
      this.dL0();
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      if (E00.ZU(var1.zu)) {
         le0_2 var2 = this.Fe;
         if (this.Fe != null && var2.lv && var2.nd0(var1)) {
            this.Fe.BL();
            return true;
         }
      }

      if (super.nd0(var1)) {
         return true;
      }

      switch (J90.Qj(var1.zu)) {
         case 7:
            KB var5;
            if ((var5 = this.g1).eE) {
               return var5.nd0(var1);
            }

            return false;
         case 8:
         case 9:
            int var6;
            if ((var6 = dp0.r9(var1.finally$)) == 21 || var6 == 22) {
               return this.nh0.nd0(var1);
            } else if (var6 == 19 || var6 == 20 || var6 == 92 || var6 == 93) {
               return this.g1.nd0(var1);
            }
         default:
            if (E00.C10(var1.zu)) {
               le0_2 var3;
               le0_2 var10000 = var3 = this.GW;
               var3.getClass();
               int var4 = var1.f8;
               if (var10000.yv0(var4, var1.AN)) {
                  return true;
               }
            }

            return false;
      }
   }

   @Override
   public final void oa0(zk0_1 var1, int var2, int var3, int var4, int var5) {
      this.iy();
      super.oa0(var1, var2, var3, var4, var5);
   }

   @Override
   public final void HP(zk0_1 var1) {
      this.iy();
      EN var2 = this.wC0;
      if (this.wC0 != null) {
         KG0 var10000 = var2.M;
         var2.M.j70(Xa0, this.g1.TV.ER.sx0());
         var10000.j70(sy0, this.nh0.TV.ER.sx0());
      }

      super.HP(var1);
   }

   public final void dL0() {
      le0_2 var1 = this.Fe;
      if (this.Fe instanceof com5__5) {
         com5__5 var10000 = (com5__5)var1;
         int var3 = this.nh0.VP;
         int var4 = this.g1.VP;
         Nj var2;
         if ((var2 = (Nj)var10000).bs0 != var3 || var2.eL != var4) {
            var2.bs0 = var3;
            var2.eL = var4;
            var2.bA0();
         }
      } else {
         le0_2 var5 = this.GW;
         var1.sy(this.GW.A20 - this.nh0.VP, var5.SB0 - this.g1.VP);
      }
   }

   @Override
   public final void F9(int var1, le0_2 var2) {
      throw new UnsupportedOperationException("use setContent");
   }

   public final void M60() {
      boolean var1 = false;
      if (super.Em0 == null) {
         this.mH = var1;
      } else {
         throw new RuntimeException("set before adding to gui");
      }
   }

   public final void so() {
      boolean var1 = true;
      if (this.wn != var1) {
         this.wn = var1;
         this.bA0();
      }
   }

   public final void Qs0(int var1) {
      if (var1 != 0) {
         if (this.m10 != var1) {
            this.m10 = var1;
            this.COm3();
         }
      } else {
         throw new NullPointerException("fixed");
      }
   }
}
