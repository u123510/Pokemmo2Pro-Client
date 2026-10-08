package cn.pokemmo.ui.window.market;

import f.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 友好商店NPC道具商店窗口
 *
 * 原混淆类: f.Uo
 */
public class ItemShopWindow extends cx_0 implements tr_1  {
    public final Uo asBridge() {
        return (Uo) (Object) this;
    }

   public static final Comparator<lpt2__5> WP = Uo::oB;
   public static final Comparator<lpt2__5> jC0 = Comparator.comparing(lpt2__5::d9);
   public final BU tm0;
   public final fy_2 Jf;
   public final fy_2 BF0;
   public final fy_2 Wy0;
   public final P8 Px0;
   public final lo0_0 VC;
   public final lo0_0 uP;
   public final xe_1 Sv;
   public final Aj kT;
   public final Gh0 ze;
   public final xe_1 J;
   public final cn_0 PQ;
   public final cn_0 nz;
   public final cn_0 E6;
   public final cn_0 dM;
   public final cn_0 MG0;
   public final cn_0 hk;
   public final lo0_0 a;
   public final lf0_2 bo0;
   public lpt2__5 M5;
   public ez_1 iW;
   public int xe = 0;
   public int Q5 = -1;
   public xe_1[] XE0;
   public final xe_1[] v0;
   public final xe_1[] tR;
   public final int PO;
   public final CH0 GT;
   public final boolean NUl;
   public final boolean HN;

   public ItemShopWindow(BU var1, int var2, CH0 var3, boolean var4, boolean var5, boolean var6) {
      super(tw0_0.kz0());
      lf0_2 var7 = tw0_0.rl.bj0();
      this.bo0 = var7;
      this.tm0 = var1;
      this.PO = var2;
      this.GT = var3;
      this.NUl = var5;
      this.HN = var6;
      ((R90)this).Pb0(var1::ig);
      N1 var11 = new N1(asBridge(), new gn_0((byte)-1, (byte)-1, (byte)-1, (byte)-1));
      ((le0_2)this).LPT8(var11);
      if (tw0_0.kz0()) {
         if (tw0_0.LD0.wL() != null) {
            tw0_0.LD0.wL().KU(false, var3);
         }

         ((le0_2)this).uf("itemshop-mobile");
      } else {
         ((le0_2)this).uf("itemshop");
      }

      if (var7.T60() > 0) {
         ((R90)this).Hy(sm0_0.c0(var7.T60()));
      } else {
         ((R90)this).Hy(sm0_0.c0(0) + " MART");
      }

      ((R90)this).ff0(1);
      ((R90)this).bD(true);
      fy_2 var12 = new fy_2();
      this.Jf = var12;
      var12.uf("itemshop-dialoglayout-left");
      ((le0_2)this).SL(var12);
      P8 var13 = new P8();
      this.Px0 = var13;
      var13.I6(false);
      lo0_0 var14 = new lo0_0();
      this.VC = var14;
      byte var15 = 2;
      var14.Qs0(2);
      lo0_0 var23 = new lo0_0();
      this.uP = var23;
      var23.Qs0(var15);
      cn_0 var24 = new cn_0("$ " + sm0_0.c0(1137));
      this.PQ = var24;
      fy_2 var25 = new fy_2();
      I7 var27 = var25.H10();
      Hm0 var30 = var25.lo0();
      cn_0 var34 = new cn_0("");
      this.nz = var34;
      var34 = new cn_0("");
      this.E6 = var34;
      cn_0 var8 = new cn_0("");
      this.dM = var8;
      String var9 = sm0_0.c0(var7.Ri0() > 0 ? var7.Ri0() : 56);
      xe_1 var45 = new xe_1(var9);
      this.Sv = var45;
      var45.pw0(false);
      cn_0 var40 = new cn_0(sm0_0.wa0(1925, "0"));
      this.MG0 = var40;
      cn_0 var41 = new cn_0();
      this.hk = var41;
      lo0_0 var42 = new lo0_0();
      this.a = var42;
      var42.Qs0(var15);
      var42.AH0(var34);
      var45.RR(new oj0_0(asBridge()));
      Aj var16 = new Aj(1, 999, 1);
      this.kT = var16;
      Gh0 var36 = new Gh0(var16);
      this.ze = var36;
      var36.Da0(this::hA);
      xe_1 var17 = new xe_1(sm0_0.c0(8117));
      this.J = var17;
      var17.RR(this::com4);
      lpt2__5[] var18;
      int var37 = (var18 = var7.f90()).length;
      int var43 = 0;

      label93:
      while(true) {
         if (var43 < var37) {
            lpt2__5 var46;
            if ((var46 = var18[var43]).gk() != null && var46.gk().Zq() >= 1) {
               ++var43;
               continue;
            }

            Arrays.sort(var18, jC0);
            break;
         }

         Arrays.sort(var18, WP);
         var37 = 0;

         while(true) {
            if (var37 >= var18.length) {
               break label93;
            }

            var18[var37].hG(var37);
            ++var37;
         }
      }

      this.v0 = new OB[var18.length];
      var37 = 0;

      for(lpt2__5 var48 : var18) {
         if (this.bo0.ez0() != cr_0.Xz0 || !((ArrayList)var48.wv0()).isEmpty()) {
            OB var10 = new OB(var48, false);
            var10.RR(() -> this.il0(var48));
            this.v0[var37++] = var10;
         }
      }

      ((ya_1)var27).LPt3(this.v0);
      var30.LPt3(this.v0);
      var25.x40(var27);
      var25.WQ(var30);
      this.VC.AH0(var25);
      fy_2 var19 = new fy_2();
      this.BF0 = var19;
      if (tw0_0.kz0()) {
         var19.WQ(var19.lo0().Xq(new ya_1[]{var19.H10().LPt3(new le0_2[]{this.Px0})}));
      } else {
         var19.WQ(var19.lo0().Xq(new ya_1[]{var19.H10().qd(300).LPt3(new le0_2[]{this.Px0})}));
      }

      var19.x40(var19.H10().Xq(new ya_1[]{var19.lo0().LPt3(new le0_2[]{this.Px0})}));
      ((le0_2)this).SL(var19);
      var19 = new fy_2();
      var25 = new fy_2();
      fy_2 var28 = new fy_2();
      this.Wy0 = var28;
      var28.uf("label-area-market");
      var19.SL(var28);
      if (tw0_0.kz0()) {
         var28.x40(XZ.BC0(var28.lo0(), new ya_1[]{var28.C7(new le0_2[]{this.nz}).Ze0(), var28.C7(new le0_2[]{this.a}).Ze0()}, var28).Xq(new ya_1[]{var28.hb(new le0_2[]{this.nz}), var28.hb(new le0_2[]{this.a})}));
         ((le0_2)var19).SL(this.dM);
      } else {
         Hm0 var61 = var28.lo0();
         ya_1[] var62 = new ya_1[3];
         var62[0] = var28.C7(new le0_2[]{this.nz});
         var62[1] = var28.C7(new le0_2[]{this.a});
         var62[2] = var28.C7(new le0_2[]{this.dM});
         var28.x40(XZ.BC0(var61, var62, var28).Xq(new ya_1[]{var28.hb(new le0_2[]{this.nz}), var28.hb(new le0_2[]{this.a})}).Ze0().Xq(new ya_1[]{var28.hb(new le0_2[]{this.dM})}));
      }

      var25.x40(XZ.BC0(var25.lo0(), new ya_1[]{var25.H10().qd(10).LPt3(new le0_2[]{this.VC})}, var25).Xq(new ya_1[]{var25.lo0().LPt3(new le0_2[]{this.VC})}));
      var28 = new fy_2();
      var28.x40(XZ.BC0(var28.lo0(), new ya_1[]{var28.H10().qd(10).LPt3(new le0_2[]{this.uP})}, var28).Xq(new ya_1[]{var28.lo0().LPt3(new le0_2[]{this.uP})}));
      this.Sv.RY(90, 25);
      this.Sv.oY(90, 25);
      this.J.RY(90, 25);
      this.J.oY(90, 25);
      ((le0_2)var19).SL(this.ze);
      ((le0_2)var19).SL(this.J);
      ((le0_2)var19).SL(this.Sv);
      ((le0_2)var19).SL(this.MG0);
      ((le0_2)var19).SL(this.hk);
      xe_1[] var32;
      xe_1[] var52 = var32 = new xe_1[4];
      Gh0 var10003 = this.ze;
      var32[0] = var10003.aB0;
      var52[1] = var10003.BA0;
      var52[2] = this.J;
      var52[3] = this.Sv;
      this.tR = var32;
      if (tw0_0.kz0() || this.bo0.ez0() != cr_0.u90) {
         ((le0_2)var19).SL(this.PQ);
      }

      ((le0_2)this).SL(var19);
      P8 var21 = this.Px0;
      String var33 = sm0_0.c0(this.bo0.Ri0() > 0 ? this.bo0.Ri0() : 56);
      var21.Wq(var25, var33).Kj(this::ck0);
      if (var4) {
         this.XH0();
         this.Px0.Wq(var28, sm0_0.c0(62)).Kj(this::ck0);
      }

      ((le0_2)this).RY(600, 140);
      ((le0_2)this).oY(600, 140);
      this.b5();
      if (tw0_0.kz0()) {
         this.u3(super.Lr0);
         ((le0_2)this).SL(super.Lr0);
      }

   }

   public static int oB(lpt2__5 var0, lpt2__5 var1) {
      Comparator var2 = Comparator.comparingInt(i40_0::o6);
      Comparator var3 = Comparator.comparing(Uo::Aq0);
      ec0_2 var10000 = ec0_2.Sx();
      short var4 = var0.XH0.wb0;
      vk0_1 var6;
      vk0_1 var10 = var6 = (vk0_1)var10000.f4.f5(var4);
      ec0_2 var10001 = ec0_2.Sx();
      short var5 = var1.XH0.wb0;
      vk0_1 var8 = (vk0_1)var10001.f4.f5(var5);
      if (var10 != null && var8 != null) {
         i40_0 var7;
         i40_0 var9;
         return (var7 = var6.oG((CE)null, (d70_0)null)) != (var9 = var8.oG((CE)null, (d70_0)null)) ? var2.compare(var7, var9) : var3.compare(var0, var1);
      } else {
         return var3.compare(var0, var1);
      }
   }

   public static String Aq0(lpt2__5 var0) {
      return sm0_0.c0(var0.XH0.Nl);
   }

   public static int QG0(cr_0 var0) {
      BR var1 = tw0_0.rl;
      if (var1 == null || var1.k0 == null) {
         return 0;
      }

      if (var0 == cr_0.u90) {
         return var1.k0.il;
      }

      if (var0 == cr_0.l3) {
         return var1.k0.HI;
      }

      return var0 == cr_0.Lk0 ? var1.k0.Lpt5 : 0;
   }

   public final void XH0() {
      BR var10000 = tw0_0.rl;
      RJ0 var32 = ((Ge0)var10000).Bb(var10000.u40);
      ArrayList<K5> var1 = new ArrayList<>();
      K5[] var2;
      int var3 = (var2 = var32.KL()).length;

      for(int var4 = 0; var4 < var3; ++var4) {
         K5 var5;
         mc0_1 var6;
         l5_0 var7;
         if ((var7 = (var6 = (var5 = var2[var4]).cL).Yt0) != l5_0.Jy && var7 != l5_0.Hj && !var6.nI()) {
            lf0_2 var26;
            cr_0 var30;
            if ((var30 = (var26 = this.bo0).Zh) == cr_0.u90) {
               mc0_1 var27;
               if (!pro.pokemmo2.shop.service.ShopClient.nativeHasSellPrice(
                     this.bo0, var5.nn.wQ)
                     && ((var27 = var5.cL).TD < 1 || var27.gQ() < 1)) {
                  continue;
               }
            } else if (var30 == cr_0.Xz0) {
               short var28 = var5.nn.wQ;
               if (var26.ib.bL0(var28) && this.bo0.xe(var5.nn.wQ).qs.isEmpty()) {
                  continue;
               }
            }

            var1.add(var5);
         }
      }

      Collections.sort(var1);
      ArrayList<lpt2__5> var12 = new ArrayList<>();
      var3 = 0;
      cr_0 var18;
      if ((var18 = this.bo0.Zh) == cr_0.u90) {
         for(K5 var19 : var1) {
            var12.add(new ie0_2(var19, this.bo0.Zh, var3,
                  pro.pokemmo2.shop.service.ShopClient.nativeSellPrice(
                        this.bo0, var19.nn.wQ)));
            ++var3;
         }
      } else if (var18 == cr_0.Xz0) {
         for(K5 var20 : var1) {
            short var23 = var20.nn.wQ;
            lpt2__5 var24;
            if (this.bo0.ib.bL0(var23) && !(var24 = this.bo0.xe(var20.nn.wQ)).qs.isEmpty()) {
               ie0_2 var25 = new ie0_2(var20, this.bo0.Zh, var3);

                for(Object var10001 : var24.qs) {
                   E5 var10002 = (E5)var10001;
                   short var29 = var10002.OW;
                   short var31 = (short)((byte)var10002.Io);
                  var25.qs.add(new E5(var29, var31));
               }

               var12.add(var25);
               ++var3;
            }
         }
      }

      this.XE0 = new OB[var12.size()];
      int var10 = 0;

      for(lpt2__5 var16 : var12) {
         OB var22 = new OB(var16, true);
         var22.RR(() -> this.WF(var16));
         var22.pw0(this.HN);
         this.XE0[var10++] = var22;
      }

      fy_2 var11 = new fy_2();
      I7 var14 = new I7(var11);
      Hm0 var17 = new Hm0(var11);
      var14.LPt3(this.XE0);
      var17.LPt3(this.XE0);
      var11.x40(var14);
      var11.WQ(var17);
      this.uP.AH0(var11);
   }

   public final void ck0() {
      this.pC0((lpt2__5)null);
      if (this.Px0.Bb() == 0) {
         xe_1 var1 = this.Sv;
         int var2;
         if ((var2 = this.bo0.qA) <= 0) {
            var2 = 56;
         }

         var1.SU(sm0_0.c0(var2));
         this.Sv.pw0(false);
      } else {
         this.Sv.SU(sm0_0.c0(62));
         this.Sv.pw0(false);
      }

   }

   public final boolean u3(le0_2 var1) {
      if (var1 == this.iW) {
         this.iW = null;
      }

      return super.u3(var1);
   }

   public final void mJ() {
      xe_1 var1;
      if ((var1 = this.Q30()) != null) {
         lpt6__0.v90(var1);
         a7_0.bH(var1.ER.Fc0);
         this.VC.Rn(var1);
         this.uP.Rn(var1);
      }
   }

   public final void pC0(lpt2__5 var1) {
      this.M5 = var1;
      this.ze.case$(1);
      Aj var2 = this.kT;
      short var3;
      if (var1 == null) {
         var3 = 99;
      } else {
         var3 = var1.Sv0();
      }

      var2.Cw0 = var3;
      this.b5();
   }

   public final void b5() {
      lf0_2 var1;
      if ((var1 = this.bo0) != null) {
         cr_0 var50;
         if ((var50 = var1.Zh).V1 > 0) {
            this.Jf.Ll(true);
            this.PQ.Sk(sm0_0.wa0(var50.V1, NumberFormat.getInstance().format((long)QG0(var50))));
         } else {
            this.Jf.Ll(false);
            this.PQ.Sk("");
         }

         lpt2__5 var2;
         if ((var2 = this.M5) == null) {
            this.Q5 = -1;
            this.nz.Sk("");
            this.E6.Sk("");
            this.dM.Sk("");
            int var59;
            if ((var59 = var50.sQ) < 1) {
               this.MG0.Sk("");
            } else {
               this.MG0.Sk(sm0_0.wa0(var59, "0"));
            }

            this.hk.Sk("");
            this.Sv.pw0(false);
         } else {
            var50 = var2.sp;
            if (this.Px0.Bb() != 0 || (var50 != cr_0.u90 || this.M5.oF0() <= tw0_0.rl.k0.il) && (var50 != cr_0.l3 || this.M5.oF0() <= tw0_0.rl.k0.HI) && (var50 != cr_0.Lk0 || this.M5.oF0() <= tw0_0.rl.k0.Lpt5)) {
               this.Sv.pw0(this.NUl);
            } else {
               this.Sv.pw0(false);
            }

            if (this.xe == 0) {
               this.Q5 = this.M5.PrN;
            }

            this.nz.Sk(this.M5.fJ + "x " + this.M5.JJ0());
            this.E6.Sk(this.M5.i60());
            int var63;
            if ((var63 = var50.sQ) < 1) {
               this.MG0.Sk("");
            } else {
               this.MG0.Sk(sm0_0.wa0(var63, NumberFormat.getInstance().format((long)(this.M5.oF0() * this.ze.eB0))));
            }

            if (this.Px0.Bb() == 1) {
               if ((var50 = this.bo0.Zh) == cr_0.u90) {
                  this.dM.Sk(sm0_0.wa0(1930, NumberFormat.getInstance().format((long)this.M5.oF0())));
                  this.hk.Sk(sm0_0.wa0(1929, NumberFormat.getInstance().format((long)this.M5.Sv0())));
               } else if (var50 == cr_0.Xz0) {
                  ArrayList var57;
                  if ((var57 = this.M5.qs).size() < 1) {
                     this.dM.Ll(false);
                  } else {
                     this.dM.Ll(true);
                     E5 var58 = (E5)var57.get(0);
                     this.dM.Sk(sm0_0.Bx(1937, new String[]{Short.toString(var58.Io), sm0_0.c0(var58.db.Nl)}));
                  }
               }
            } else {
               if (this.M5.Na0.isEmpty()) {
                  this.dM.Sk(sm0_0.wa0(var50.Iy, NumberFormat.getInstance().format((long)this.M5.oF0())));
               } else {
                  cn_0 var52 = this.dM;
                  lpt2__5 var10000 = this.M5;
                  var10000.getClass();
                  StringBuilder var64 = new StringBuilder();
                  var64.append(sm0_0.c0(1948));

                   for(Object var4 : var10000.Na0) {
                      E5 var5 = (E5)var4;
                      var64.append("\n");
                      var64.append(NumberFormat.getInstance().format((long)var5.Io)).append("x ");
                      var64.append(sm0_0.c0(var5.db.Nl));
                  }

                  var64.append("\n");
                  var52.Sk(var64.toString());
               }

               lpt2__5 var53;
               if ((var53 = this.M5).XH0 != null) {
                  BR var75 = tw0_0.rl;
                  int var55 = ((Ge0)var75).Bb(var75.u40).a90(this.M5.FE());
                  this.hk.Sk(sm0_0.wa0(1929, NumberFormat.getInstance().format((long)var55)));
                  this.hk.Ll(true);
                } else if (var53.h5 != null) {
                   ib_0 var68 = tw0_0.rl.coM2(gl_2.SR);
                   short var54 = this.M5.FE();
                   short var66 = 0;
                   synchronized(var68.oS) {
                      for(Object var5 : var68.oS.values()) {
                         MV var67 = (MV)var5;
                         if (var67 != null && var67.KZ.coM3 == var54) {
                            ++var66;
                         }
                      }
                   }

                  this.hk.Sk(sm0_0.wa0(1929, NumberFormat.getInstance().format((long)var66)));
                  this.hk.Ll(true);
               } else {
                  this.hk.Ll(false);
               }
            }
         }

         if (this.Px0.Bb() == 0) {
            lpt2__5 var60;
            if ((var60 = this.M5) != null && var60.sp == cr_0.Xz0) {
               this.Sv.SU(sm0_0.c0(1931));
            } else {
               mc0_1 var61;
               if (var60 == null || var60.lq0 != null || var60.h5 != null || (var61 = var60.XH0) != null && var61.Iq == null) {
                  xe_1 var62 = this.Sv;
                  int var49;
                  if ((var49 = this.bo0.qA) <= 0) {
                     var49 = 56;
                  }

                  var62.SU(sm0_0.c0(var49));
               } else {
                  this.Sv.SU(sm0_0.c0(3006));
                  this.Sv.pw0(true);
               }
            }
         } else {
            this.Sv.SU(sm0_0.c0(62));
         }

      }
   }

   public final void K8() {
      if (tw0_0.kz0()) {
         int var10000 = tw0_0.LD0.ew0();
         int var1 = tw0_0.LD0.Hv0();
         ((le0_2)this).oY(var10000, var1);
         super.K8();
         this.ze.lt0();
         pa0_0 var4;
         this.ze.A20(var4 = pa0_0.Ht0, -200, -30);
         this.J.oY(150, 65);
         this.J.A20(var4, -480, -30);
         this.Sv.A20(var4, -30, -30);
         this.BF0.oY(480, tw0_0.LD0.Hv0() - 200);
         this.BF0.vf(pa0_0.Mk);
         this.Jf.oY(340, 50);
         this.Jf.A20(var4 = pa0_0.qQ, 2, 2);
         this.Wy0.oY(tw0_0.LD0.ew0(), 200);
         this.Wy0.vf(pa0_0.L00);
         lo0_0 var8 = this.a;
         int var2 = this.dM.A20 - var8.A20;
         ((le0_2)var8).g2(var2, var8.G4);
         lpt2__5 var7;
         if ((var7 = this.M5) != null && var7.sp == cr_0.Xz0) {
            this.dM.A20(var4, 395, 620);
         } else {
            this.dM.A20(var4 = pa0_0.rr0, 655, -180);
            this.MG0.A20(var4, 655, -150);
            this.hk.A20(var4, 655, -120);
         }

         fy_2 var3;
         this.PQ.E40((var3 = this.Jf).A20 + 20, var3.SB0 + 25);
      } else {
         ((le0_2)this).oY(510, 390);
         this.BF0.oY(170, 270);
         this.ze.oY(135, 25);
         this.ze.E40(super.A20 + 20, super.SB0 + 322);
         this.Sv.oY(135, 25);
         this.Sv.E40(super.A20 + 160, super.SB0 + 350);
         this.Wy0.oY(290, 240);
         this.Wy0.E40(super.A20 + 10, super.SB0 + 57);
         this.MG0.E40(super.A20 + 164, super.SB0 + 310);
         this.PQ.E40(super.A20 + 164, super.SB0 + 333);
         this.hk.E40(super.A20 + 20, super.SB0 + 310);
         this.J.oY(135, 25);
         this.J.E40(super.A20 + 20, super.SB0 + 350);
         super.K8();
         this.Jf.vi(5, 5, 5, 5);
         this.Jf.E40(super.A20 + 10, super.SB0 + 293);
         this.Jf.oY(290, 91);
      }

   }

   public final void x00() {
      this.Q5 = 0;
      this.mJ();
   }

   public final boolean nd0(i70_0 var1) {
      if (E00.ZU(var1.zu) && var1.iT()) {
         int var2 = var1.finally$;
         if (this.xe == 0) {
            rp_0 var3;
            rp_0 var10000 = var3 = rp_0.kC0;
            int var10001 = dw_2.ff;
            if (var10000 != null && var3.Ov(var2)) {
               int var7;
               if ((var7 = this.Q5) > 0) {
                  this.Q5 = var7 - 1;
                  this.mJ();
               }

               return true;
            }

            if ((var3 = rp_0.synchronized$) != null && var3.Ov(var2)) {
               ++this.Q5;
               this.mJ();
               return true;
            }

            if ((var3 = rp_0.I90) != null && var3.Ov(var2)) {
               if (this.Px0.Bb() == 1) {
                  this.Px0.Lb(-1);
               }

               this.Q5 = 0;
               this.mJ();
               return true;
            }

            if ((var3 = rp_0.Ni) != null && var3.Ov(var2)) {
               if (this.Px0.Bb() == 0) {
                  this.Px0.Lb(1);
               }

               this.Q5 = 0;
               this.mJ();
               return true;
            }

            if ((var3 = rp_0.sJ0) != null && var3.Ov(var2)) {
               if (this.Q30() != null) {
                  this.xe = 1;
                  xe_1[] var19 = this.tR;
                  lpt6__0.v90(var19[this.Q5 = var19.length - 1]);
               }

               return true;
            }

            if ((var3 = rp_0.nK0) != null && var3.Ov(var2)) {
               this.tm0.ig();
               return true;
            }
         }

         if (this.xe == 1) {
            rp_0 var14;
            rp_0 var18 = var14 = rp_0.I90;
            int var20 = dw_2.ff;
            if (var18 != null && var14.Ov(var2)) {
               int var5;
               if ((var5 = this.Q5) < 1) {
                  return true;
               }

               --var5;
               this.Q5 = var5;
               lpt6__0.v90(this.tR[var5]);
               return true;
            }

            if ((var14 = rp_0.Ni) != null && var14.Ov(var2)) {
               int var4;
               xe_1[] var8;
               if ((var4 = this.Q5) >= (var8 = this.tR).length - 1) {
                  return true;
               }

               lpt6__0.v90(var8[this.Q5 = var4 + 1]);
               return true;
            }

            if ((var14 = rp_0.sJ0) != null && var14.Ov(var2)) {
               if (this.Q30() != null) {
                  a7_0.bH(this.Q30().ER.Fc0);
               }

               return true;
            }

            if ((var14 = rp_0.nK0) != null && var14.Ov(var2)) {
               this.xe = 0;
               this.Q5 = -1;
               this.VC.Xr0(0);
               this.uP.Xr0(0);
               this.pC0((lpt2__5)null);
               this.Sv.f00();
               lpt6__0.v90(this);
               return true;
            }
         }
      }

      return super.nd0(var1);
   }

   public final int eh() {
      lpt2__5 var1 = this.M5;
      if (var1.sp != cr_0.Xz0 && var1.oF0() < 1) {
         return 0;
      }

      if (this.Px0.Bb() != 0) {
         return 999;
      }

      int var2 = 0;
      if (var1.sp == cr_0.Xz0) {
         int var3 = Integer.MAX_VALUE;
         for(Object var4 : var1.Na0) {
            E5 var5 = (E5)var4;
            BR var6 = tw0_0.rl;
            var3 = Math.min(((Ge0)var6).Bb(var6.u40).a90(var5.OW) / var5.Io, var3);
         }

         if (var3 != Integer.MAX_VALUE) {
            var2 = var3;
         }
      } else if (var1.sp == cr_0.Lk0) {
         var2 = tw0_0.rl.k0.Lpt5 / var1.oF0();
      } else if (var1.sp == cr_0.l3) {
         var2 = tw0_0.rl.k0.HI / var1.oF0();
      } else if (var1.sp == cr_0.u90) {
         var2 = tw0_0.rl.k0.il / var1.oF0();
      }

      return Math.min(var2, 999);
   }

   public final xe_1 Q30() {
      xe_1[] var1;
      if (this.xe == 0) {
         if (this.Px0.Bb() == 0) {
            var1 = this.v0;
         } else {
            var1 = this.XE0;
         }
      } else {
         var1 = this.tR;
      }

      if (this.Q5 >= var1.length) {
         this.Q5 = var1.length - 1;
      }

      int var2;
      return (var2 = this.Q5) < 0 ? null : var1[var2];
   }

   public final void il0(lpt2__5 var1) {
      this.pC0(var1);
   }

   public final void WF(lpt2__5 var1) {
      this.pC0(var1);
   }

   public final void com4() {
      lpt2__5 var1;
      if ((var1 = this.M5) != null) {
         lpt2__5 var10000 = var1;
         Gh0 var5 = this.ze;
         int var2;
         int var6 = var2 = var10000.Sv0();
         ItemShopWindow var10001 = this;
         byte var4 = 0;
         int var3 = var10001.eh();
         O00 var7 = LW.Yu;
         if (var6 < 0) {
            var2 = var4;
         } else if (var2 > var3) {
            var2 = var3;
         }

         var5.case$(var2);
      }

   }

   public final void hA() {
      if (this.M5 != null) {
         int var1 = this.ze.eB0;
         int var2;
         if (this.Px0.Bb() == 0 && var1 > (var2 = this.eh())) {
            var1 = var2;
         }

         Gh0 var3;
         if (var1 < (var3 = this.ze).eB0) {
            var3.case$(var1);
         }
      }

      if (this.M5 != null) {
         this.b5();
      }
   }
}
