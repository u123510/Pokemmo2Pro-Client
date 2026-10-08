package cn.pokemmo.ui.window.settings;

import f.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 角色时装与外观自定义窗口
 *
 * 原混淆类: f.j20
 */
public class AvatarCustomizationWindow extends cx_0 implements tr_1  {
    public final j20 asBridge() {
        return (j20) (Object) this;
    }

   public static final byte[] UK0 = new byte[]{2, 0, 1, 3, 4};
   public final ry_0 vs;
   public final byte Du0;
   public final fy_2 Pf0;
   public final xe_1 Pw;
   public final xe_1 fj0;
   public final qj_2[] nj0;
   public final zc0_1 Dp;
   public final M30[] wn;
   public final X6[] NU;
   public final cn_0[] CF0;
   public final fy_2 finally$;
   public final xe_1[] rG0;
   public int catch$;
   public final qj_2 gJ;
   public final qj_2 xc;
   public qe0_2 Fi;
   public final qe0_2 CE;
   public int Jz0;
   public q10_0 nz;
   public byte k60;
   public final Mm II0;
   public CH0 B50;
   public byte kE0;
   public cg_0 PV;
   public xe_1 qA0;
   public final X6 t3;
   public final X6 a70;
   public X6 zc0;
   public final ArrayList iA;
   public final HashMap sL0;
   public int T4;
   public byte private$;
   public boolean pb;
   public xe_1 BZ;

   public final void Cb0() {
      this.pb = true;
      q10_0[] var1 = q10_0.Pn0;
      int var2 = q10_0.Pn0.length;

      for (int var3 = 0; var3 < var2; var3++) {
         q10_0 var4 = var1[var3];
         byte var5 = var4.iL;
         short var6 = this.CE.pr[var4.iL];
         byte var7 = this.CE.iu0[var5];
         if (var4.xB0 && var6 == -1) {
            this.NU[var5].Bd(0);
         } else {
            X90 var8;
            if ((var8 = (X90)var4.Fk.f5(var6)) != null) {
               if (this.vs == ry_0.zm) {
                  qj_2 var16 = this.nj0[var5];
                  boolean var14;
                  if (!var8.yt() || var4 != q10_0.VI && var4 != q10_0.rg0 && var4 != q10_0.uz) {
                     var14 = false;
                  } else {
                     var14 = true;
                  }

                  var16.Ll(var14);
               } else {
                  this.nj0[var5].Ll(var8.yt());
               }

               for (int var15 = 0; var15 < this.wn[var5].ul0(); var15++) {
                  if (var6 == ((xn_0)this.wn[var5].YS(var15)).VD0) {
                     ((xn_0)this.wn[var5].YS(var15)).Xz0 = var7;
                     this.NU[var5].Bd(var15);
                     break;
                  }
               }
            }
         }
      }

      M30[] var9 = this.wn;
      if (this.wn.length > 0) {
         q10_0 var10 = q10_0.VI;
         byte var13 = q10_0.VI.iL;
         X90 var11;
         boolean var12;
         if ((var11 = (X90)var10.Fk.f5(((xn_0)var9[q10_0.VI.iL].YS(this.NU[var13].mu0.Mw0)).VD0)) != null && !var11.wk(65536)) {
            var12 = false;
         } else {
            var12 = true;
         }

         this.NU[q10_0.Bj0.iL].pw0(var12 ^ true);
      }

      this.pb = false;
   }

   public final void zV() {
      int var1 = 640;
      short var2;
      short var3;
      if (tw0_0.kz0()) {
         var2 = 520;
         var3 = 400;
         if (this.vs.mo0() || this.finally$.eE) {
            var3 = 550;
         }
      } else {
         var1 = 440;
         if (this.finally$.eE) {
            var3 = 500;
            var2 = 350;
            var1 = super.Mx / 2 - 175;
         } else if (this.vs == ry_0.J30) {
            var1 = 460;
            var3 = 450;
            var2 = 200;
         } else {
            var3 = 550;
            var2 = 220;
         }
      }

      if (this.finally$.eE) {
         var1 = super.Mx / 2 - var2 / 2 - this.gJ.Mx / 2;
      }

      this.gJ.E40(super.A20 + var1, super.SB0 + var3);
      this.xc.E40(super.A20 + var1 + var2, super.SB0 + var3);
   }

   public final le0_2 q5() {
      if (this.T4 < 0) {
         this.T4 = 0;
      }

      if (this.T4 >= this.iA.size()) {
         this.T4 = this.iA.size() - 1;
      }

      return (le0_2)this.iA.get(this.T4);
   }

   public final void ga0() {
      BR var1 = tw0_0.rl;
      CH0 var2 = this.B50;
      ry_0 var3 = this.vs;
      byte var4 = this.Du0;
      qe0_2 var5 = this.CE;
      byte var6 = (byte)this.t3.mu0.Mw0;
      var1.fk0.uQ(new Sq0(var2, var3, var4, var5, var6));
   }

   public final void yz0() {
      BR var1 = tw0_0.rl;
      CH0 var2 = this.B50;
      ry_0 var3 = this.vs;
      byte var4 = this.Du0;
      qe0_2 var5 = this.CE;
      byte var6 = (byte)this.t3.mu0.Mw0;
      var1.fk0.uQ(new Sq0(var2, var3, var4, var5, var6));
   }

   public final void PB() {
      a7_0.bH(this.fj0.ER.Fc0);
   }

   public final void iB0(yb_1 var1) {
      byte var2 = var1.at0;
      this.k60 = var1.at0;
      Mm var3;
      (var3 = this.II0).QA0[var3.zJ.iL] = var2;
   }

   public final void b50(q10_0 var1) {
      if (!this.pb) {
         byte var2 = var1.iL;
         short var3 = -1;
         byte var4 = -1;
         int var5 = this.NU[var2].mu0.Mw0;
         if (this.NU[var2].mu0.Mw0 >= 0) {
            xn_0 var10000 = (xn_0)this.wn[var2].YS(var5);
            var3 = var10000.VD0;
            var4 = var10000.Xz0;
         }

         X90 var10;
         if ((var10 = (X90)q10_0.Pt0(var2).Fk.f5(var3)) == null) {
            this.nj0[var2].Ll(false);
            byte var6 = -1;
            var2 = -1;
            byte var8;
            this.CE.pr[var8 = var1.iL] = var6;
            this.CE.iu0[var8] = var2;
         } else {
            if (var1 == q10_0.VI) {
               this.NU[q10_0.Bj0.iL].pw0(var10.wk(65536) ^ true);
            }

            this.nj0[var2].Ll(var10.yt());
            if (this.vs.mo0()) {
               if (!var10.yt()) {
                  var4 = -1;
               } else if (var4 < 0) {
                  var4 = (byte)rg0_2.r4(yb_1.Mh.length);
               }
            }

            byte var7 = var1.iL;
            this.CE.pr[var1.iL] = var3;
            this.CE.iu0[var7] = var4;
         }
      }
   }

   public final void ot0(ry_0 var1, byte var2, Qy0 var3, CH0 var4) {
      if (this.finally$.eE) {
         this.Qz();
      } else {
         if (var1 == ry_0.zm || var1 == ry_0.w30) {
            tw0_0.rl.ze0(var2, (byte)0);
         }

         var3.da0(null, var4, (byte)0);
         if (var1 == ry_0.Rz0) {
            BR var5 = tw0_0.rl;
            if (tw0_0.rl != null) {
               var5.m9();
            }

            Qy0.yI0.kN();
         }
      }
   }

   public final void kI0(boolean var1) {
      if (var1) {
         this.CE.Fw = (byte)rg0_2.r4(5);
      }

      q10_0[] var2 = q10_0.Pn0;
      int var3 = q10_0.Pn0.length;

      for (int var4 = 0; var4 < var3; var4++) {
         q10_0 var5;
         if ((var5 = var2[var4]) == q10_0.finally$) {
            short var13 = (short)-1;
            this.CE.KA0((byte)0, var5, var13);
         } else {
            ArrayList var6;
            ArrayList var10000 = var6 = this.q9(var5);
            wx_2 var7;
            var7 = new wx_2(var6.size());
            Iterator var8 = var10000.iterator();

            while (var8.hasNext()) {
               var7.TI0(((xn_0)var8.next()).VD0);
            }

            if (var6.isEmpty()) {
               short var12 = (short)-1;
               byte var14 = 0;
               byte var11;
               this.CE.pr[var11 = var5.iL] = var12;
               this.CE.iu0[var11] = var14;
            } else {
               byte var15 = var5.iL;
               short var9 = this.CE.pr[var5.iL];
               byte var16 = this.CE.iu0[var15];
               if (var1 || var9 == -1 || !var7.bL0(var9)) {
                  if (var5 == q10_0.rg0) {
                     var9 = (short)-1;
                  } else {
                     var9 = ((xn_0)var6.get(rg0_2.r4(var6.size()))).VD0;
                  }
               }

               if (var9 == -1 || !var5.Yy(var9)) {
                  var16 = 0;
               } else if (var1) {
                  var16 = (byte)rg0_2.r4(yb_1.Mh.length);
               }

               byte var10;
               this.CE.pr[var10 = var5.iL] = var9;
               this.CE.iu0[var10] = var16;
            }
         }
      }
   }

   public final void qp() {
      ry_0 var1 = this.vs;
      if (this.vs != ry_0.zm && var1 != ry_0.w30) {
         if (var1 == ry_0.J30) {
            if (!tw0_0.Ll0.cOM4(this.private$)) {
               Qy0.yI0.dk(-1, sm0_0.c0(2108));
               return;
            }

            this.fj0.pw0(false);
            this.PV.pw0(false);
            BR var14;
            BR var10000 = var14 = tw0_0.rl;
            String var17 = ((wn0_0)this.PV.dI0).YA.toString();
            byte var19 = this.kE0;
            byte var21 = this.private$;
            qe0_2 var13 = this.CE;
            if (var10000.n2() == 3) {
               var14.fk0.uQ(new Mn0(var17, var19, var21, var13));
            }
         } else if (var1 == ry_0.Rz0) {
            Qy0.yI0.sr0(new lpt3__4(sm0_0.c0(2890), this::yz0, asBridge()));
         } else if (var1.mo0()) {
            Qy0.yI0.sr0(new lpt3__4(sm0_0.c0(2891), this::ga0, asBridge()));
         } else {
            E90 var15 = tw0_0.e60.jB0;
            if (tw0_0.e60.jB0 == null) {
               return;
            }

            qe0_2 var16 = var15.J1.rh;
            q10_0[] var18 = q10_0.Pn0;
            int var20 = q10_0.Pn0.length;

            for (int var22 = 0; var22 < var20; var22++) {
               q10_0 var5 = var18[var22];
               byte var6 = var5.iL;
               X6 var7;
               int var26;
               if ((var7 = this.NU[var5.iL]).OI && (var26 = var7.mu0.Mw0) >= 0) {
                  xn_0 var24 = (xn_0)this.wn[var6].YS(var26);
                  short var27;
                  X90 var28;
                  byte var29;
                  if ((var27 = this.CE.pr[var5.iL]) >= 0 && (var28 = (X90)var5.Fk.f5(var27)) != null && var28.yt()) {
                     var29 = this.CE.iu0[var5.iL];
                  } else {
                     var29 = -1;
                  }

                  byte var8 = var5.iL;
                  if (var16.pr[var5.iL] != this.CE.pr[var8] || (var8 = var16.iu0[var8]) != var29 && (var8 > 0 || var29 > 0)) {
                     CH0 var32 = CH0.j1;
                     Iterator var9 = var24.Jq0.iterator();

                     while (var9.hasNext()) {
                        hl0_0 var10;
                        byte var11;
                        if ((var11 = (var10 = ((K5)var9.next()).nn).N50) == var29 || var11 <= 0 && var29 <= 0) {
                           var32 = var10.Br;
                        }
                     }

                     if (var32.Sa == 0L && !var24.Jq0.isEmpty()) {
                        var32 = ((K5)var24.Jq0.get(0)).nn.Br;
                     }

                     BR var23 = tw0_0.rl;
                     var6 = var5.iL;
                     short var30 = var24.VD0;
                     boolean var33 = var24.dz;
                     var23.fk0.uQ(new C6(var6, var32, var30, var33));
                  }
               }
            }

            Qy0.yI0.da0(null, CH0.j1, (byte)0);
         }
      } else {
         CH0 var2 = this.B50;
         byte var3 = this.Du0;
         qe0_2 var4 = this.CE;
         byte var12 = (byte)this.t3.mu0.Mw0;
         tw0_0.rl.fk0.uQ(new Sq0(var2, var1, var3, var4, var12));
         Qy0.yI0.da0(null, CH0.j1, (byte)0);
      }
   }

   public final void Pi0(q10_0 var1) {
      if (this.finally$ != null) {
         int var2 = var1.iL;
         int var3 = this.NU[var1.iL].mu0.Mw0;
         xn_0 var4 = null;
         if (this.NU[var1.iL].mu0.Mw0 >= 0) {
            var4 = (xn_0)this.wn[var2].YS(var3);
         }

         short var17 = this.CE.pr[var1.iL];
         X90 var12;
         if ((var12 = (X90)var1.Fk.f5(var17)) != null && var12.yt()) {
            this.nz = var1;
            byte var7;
            this.k60 = var7 = this.CE.iu0[var1.iL];
            short var8 = var12.ax;
            this.II0.qd(var7, var12.SG, var8);
            yb_1[] var9 = yb_1.Mh;
            var2 = yb_1.Mh.length;

            for (int var14 = 0; var14 < var2; var14++) {
               yb_1 var5 = var9[var14];
               byte var15;
               xe_1 var6 = this.rG0[var15 = var5.at0];
               boolean var16;
               if (var4 == null || !this.vs.mo0() && (var15 < 0 || !var4.ML.get(var15))) {
                  var16 = false;
               } else {
                  var16 = true;
               }

               var6.pw0(var16);
            }

            this.finally$.Ll(true);
            this.Pw.Ll(true);
            this.fj0.Ll(false);
            this.Pf0.Ll(false);
            byte var10 = this.k60;
            this.catch$ = this.k60;
            lpt6__0.v90(this.rG0[var10]);
         }

         this.zV();
      }
   }

   public final void Vo0(q10_0 var1) {
      this.Pi0(var1);
   }

   public final void Qz() {
      fy_2 var1 = this.finally$;
      if (this.finally$ != null) {
         var1.Ll(false);
         this.Pw.Ll(false);
         var1 = this.Pf0;
         if (!this.Pf0.eE) {
            var1.Ll(true);
         }

         xe_1 var6 = this.fj0;
         if (!this.fj0.eE) {
            var6.Ll(true);
         }

         q10_0 var7 = this.nz;
         if (this.nz != null) {
            byte var2 = var7.iL;
            short var3 = this.CE.pr[var7.iL];
            byte var4 = this.k60;
            this.CE.pr[var2] = var3;
            this.CE.iu0[var2] = var4;
            this.II0.qd(var4, var7, var3);
         }

         this.nz = null;
         this.k60 = 0;
         this.zV();
         lpt6__0.v90(this.q5());
      }
   }

   public final void nu(int var1) {
      int var2 = this.Jz0;
      if (this.Jz0 == 0 && var1 < 0) {
         this.Jz0 = 4;
      } else {
         this.Jz0 = (var2 + var1) % 5;
      }

      var1 = this.Jz0;
      Mm var10000;
      ew0_0 var10001;
      if (this.Jz0 == 4) {
         Mm var4 = this.II0;
         byte var7;
         if (tw0_0.kz0()) {
            var7 = 4;
         } else {
            var7 = 3;
         }

         var4.Ta = var7;
         var10000 = this.II0;
         var10001 = ew0_0.XI0;
      } else if (var1 == 3) {
         Mm var5 = this.II0;
         byte var8;
         if (tw0_0.kz0()) {
            var8 = 4;
         } else {
            var8 = 3;
         }

         var5.Ta = var8;
         var10000 = this.II0;
         var10001 = ew0_0.a;
      } else {
         Mm var6 = this.II0;
         byte var9;
         if (tw0_0.kz0()) {
            var9 = 5;
         } else {
            var9 = 4;
         }

         var6.Ta = var9;
         var10000 = this.II0;
         var10001 = ew0_0.C1;
      }

      var10000.OD0 = var10001;
   }

   public final void HH0() {
      this.nu(1);
   }

   public final void d1() {
      this.nu(-1);
   }

   @Override
   public final void Dw0(zk0_1 var1) {
      short var9 = 610;
      short var2 = 40;
      if (tw0_0.kz0()) {
         if (this.vs.mo0() || this.finally$.eE) {
            var2 = 190;
         }
      } else {
         var9 = 680;
         var2 = 90;
         if (this.vs == ry_0.J30 || this.finally$.eE) {
            var9 = 750;
            var2 = 200;
         }
      }

      if (this.finally$.eE) {
         var9 = 310;
      }

      for (int var3 = 0; var3 < 3; var3++) {
         int var4 = this.Jz0;
         if (this.Jz0 != 3 && var4 != 4 || var3 == 1) {
            int var5;
            if (this.finally$.eE) {
               var4 = super.Mx / 2 - 280;
               var4 = var3 * 160 + var4;
               var5 = var2 + 50;
            } else {
               var4 = var9 - 200;
               var5 = var2 - 80;
               var5 = var3 * 160 + var5;
            }

            if (tw0_0.kz0()) {
               var4 = var3 * 200 + var9;
               var5 = var2 + 80;
               if (this.finally$.eE) {
                  var4 = super.Mx / 2 - 380;
                  var4 = var3 * 220 + var4;
               }
            }

            byte var6 = 0;
            int var7 = this.Jz0;
            switch (this.Jz0) {
               case 0:
               case 1:
               case 2:
                  var6 = T10.pv0[var7 * 3 + var3][T10.h8.gZ()];
                  break;
               case 3:
                  var6 = this.kE0;
                  break;
               case 4:
                  var6 = T10.yP[T10.xh0.gZ()];
            }

            if (!this.finally$.eE) {
               Mm var10000 = this.II0;
               Mm var10001 = this.II0;
               Mm var10002 = this.II0;
               qe0_2 var14 = this.CE;
               byte var10003 = this.CE.Fw;
               short[] var15 = (short[])var14.pr.clone();
               byte[] var8 = (byte[])this.CE.iu0.clone();
               var10002.pR = var10003;
               var10001.NF = var15;
               var10000.QA0 = var8;
            }

            this.II0.eQ((byte)var6, var4, var5);
         }
      }

      this.zV();
   }

   @Override
   public final void K8() {
      if (tw0_0.kz0()) {
         int var1 = 0;
         this.E40(0, var1);
         var1 = tw0_0.LD0.Hv0();
         this.oY(tw0_0.LD0.ew0(), var1);
      }

      this.Pf0.lt0();
      super.K8();
      if (tw0_0.kz0()) {
         this.finally$.oY(tw0_0.LD0.ew0(), tw0_0.LD0.Hv0());
      } else {
         fy_2 var3 = this.finally$;
         if (this.finally$.eE) {
            var3.oY(super.Mx, super.OB);
         } else if (!tw0_0.kz0()) {
            this.RY(740, 680);
            int var10000 = tw0_0.LD0.ew0() / 2 - super.Mx / 2;
            int var4 = tw0_0.LD0.Hv0() / 2 - super.OB / 2;
            this.E40(var10000, var4);
         }
      }

      this.Pw.oY(150, 50);
      this.Pw.E40(super.Mx / 2 + super.A20 - this.Pw.Mx / 2, super.SB0 + 200);
      if (tw0_0.kz0()) {
         this.fj0.lt0();
         this.fj0.A20(pa0_0.Mk, -68, 0);
         xe_1 var5 = this.BZ;
         if (this.BZ != null) {
            var5.lt0();
            this.BZ.vf(pa0_0.Ht0);
         }
      } else {
         this.fj0.oY(this.a3() - this.Dp.Mx, 50);
         this.fj0.E40(super.A20 + this.Dp.Mx, this.VM() - this.fj0.OB);
      }

      this.zV();
      if (!tw0_0.kz0()) {
         this.N80(pa0_0.Ol);
      }
   }

   @Override
   public final void x00() {
      lg_0.k.lPT5(this::fI);
   }

   public final void fI() {
      lpt6__0.v90(this.q5());
   }

   public final void nw0() {
      int var1 = this.catch$;
      xe_1[] var2;
      if (this.catch$ >= 0 && var1 < (var2 = this.rG0).length) {
         lpt6__0.v90(var2[var1]);
      }
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public final boolean nd0(i70_0 var1) {
      if (E00.ZU(var1.zu) && var1.iT()) {
         cg_0 var2 = this.PV;
         if (this.PV != null && var2.Of()) {
            return super.nd0(var1);
         }

         int var25 = var1.finally$;
         if (this.finally$.eE) {
            rp_0 var14 = rp_0.kC0;
            if (rp_0.kC0 != null && var14.Ov(var25)) {
               if (this.Pw.Of()) {
                  this.nw0();
               } else {
                  int var24 = this.catch$;
                  if (this.catch$ % 3 > 0) {
                     this.catch$ = var24 - 1;
                     this.nw0();
                  }
               }

               return true;
            }

            rp_0 var15 = rp_0.synchronized$;
            if (rp_0.synchronized$ != null && var15.Ov(var25)) {
               int var23 = this.catch$;
               if (this.catch$ < this.rG0.length && var23 % 3 != 2) {
                  this.catch$ = var23 + 1;
                  this.nw0();
               } else {
                  lpt6__0.v90(this.Pw);
               }

               return true;
            }

            rp_0 var16 = rp_0.I90;
            if (rp_0.I90 != null && var16.Ov(var25)) {
               if (!this.Pw.Of()) {
                  int var22 = this.catch$;
                  if (this.catch$ >= 3) {
                     this.catch$ = var22 - 3;
                     this.nw0();
                  }
               }

               return true;
            }

            rp_0 var17 = rp_0.Ni;
            if (rp_0.Ni != null && var17.Ov(var25)) {
               int var21;
               if (!this.Pw.Of() && (var21 = this.catch$ + 3) < this.rG0.length) {
                  this.catch$ = var21;
                  this.nw0();
               }

               return true;
            }

            rp_0 var18 = rp_0.sJ0;
            if (rp_0.sJ0 != null && var18.Ov(var25)) {
               if (this.Pw.Of()) {
                  a7_0.bH(this.Pw.ER.Fc0);
               } else {
                  int var20 = this.catch$;
                  xe_1[] var8;
                  xe_1 var9;
                  if (this.catch$ > 0 && var20 < (var8 = this.rG0).length && (var9 = var8[var20]).OI) {
                     a7_0.bH(var9.ER.Fc0);
                  }
               }

               return true;
            }

            rp_0 var19 = rp_0.nK0;
            if (rp_0.nK0 != null && var19.Ov(var25)) {
               this.Qz();
               return true;
            }

            return true;
         }

         rp_0 var3 = rp_0.kC0;
         if (rp_0.kC0 != null && var3.Ov(var25)) {
            do {
               this.T4--;
               lpt6__0.v90(this.q5());
            } while (this.q5() != null && !this.q5().eE);

            return true;
         }

         var3 = rp_0.synchronized$;
         if (rp_0.synchronized$ != null && var3.Ov(var25)) {
            do {
               this.T4++;
               lpt6__0.v90(this.q5());
            } while (this.q5() != null && !this.q5().eE);

            return true;
         }

         var3 = rp_0.I90;
         if (rp_0.I90 != null && var3.Ov(var25)) {
             le0_2 var6 = this.q5();
             if (var6.OI && var6 instanceof X6) {
                X6 var13 = (X6)var6;
                int var26 = var13.mu0.Mw0;
                if (var26 > 0) {
                   var13.Bd(var26 - 1);
                }
            }

            return true;
         }

         var3 = rp_0.Ni;
         if (rp_0.Ni != null && var3.Ov(var25)) {
             le0_2 var4 = this.q5();
             if (var4.OI && var4 instanceof X6) {
                X6 var12 = (X6)var4;
                ol0_2 var13 = var12.mu0;
                if (var13.Mw0 + 1 < var13.KB.ul0()) {
                   var12.Bd(var13.Mw0 + 1);
                }
            }

            return true;
         }

         var3 = rp_0.sJ0;
         if (rp_0.sJ0 != null && var3.Ov(var25)) {
            if (this.sL0.containsKey(this.T4)) {
               ((Runnable)this.sL0.get(this.T4)).run();
            }

            return true;
         }

         var3 = rp_0.nK0;
         if (rp_0.nK0 != null && var3.Ov(var25)) {
            if (tw0_0.kz0()) {
               a7_0.bH(this.fj0.ER.Fc0);
            } else {
               xe_1 var10 = this.qA0;
               if (this.qA0 != null && this.vs == ry_0.J30) {
                  a7_0.bH(var10.ER.Fc0);
               } else {
                  ry_0 var11 = this.vs;
                  if (this.vs == ry_0.zm || var11 == ry_0.w30) {
                     tw0_0.rl.ze0(this.Du0, (byte)0);
                  }

                  Qy0.yI0.da0(null, CH0.j1, (byte)0);
               }
            }

            return true;
         }
      }

      return super.nd0(var1);
   }

   public final void U1() {
      this.private$ = UK0[this.zc0.mu0.Mw0];
   }

   public final void fp() {
      this.CE.Fw = (byte)this.a70.mu0.Mw0;
   }

   public final void Gd0(q10_0 var1) {
      this.Pi0(var1);
   }

   public final void BC() {
      int var1 = this.t3.mu0.Mw0;
      if (this.kE0 != this.t3.mu0.Mw0) {
         this.kE0 = (byte)var1;
         this.pb = true;
         boolean var7;
         if (this.vs == ry_0.J30) {
            var7 = true;
         } else {
            var7 = false;
         }

         this.kI0(var7);
         this.a70.Bd(this.CE.Fw);
         q10_0[] var8 = q10_0.Pn0;
         int var2 = q10_0.Pn0.length;

         for (int var3 = 0; var3 < var2; var3++) {
            q10_0 var4;
            byte var5 = (var4 = var8[var3]).iL;
            M30[] var10003 = this.wn;
            pg0_2 var6;
            var6 = new pg0_2(this.q9(var4));
            var10003[var5] = var6;
            this.NU[var5].r30(this.wn[var5]);
            X6 var9 = this.NU[var5];
            boolean var10;
            if (this.wn[var5].ul0() > 1) {
               var10 = true;
            } else {
               var10 = false;
            }

            var9.pw0(var10);
         }

         this.Cb0();
      }
   }

   public final ArrayList q9(q10_0 var1) {
      ArrayList var2;
      var2 = new ArrayList();
      if (var1.xB0) {
         xn_0 var3;
         var3 = new xn_0(asBridge(), sm0_0.c0(2803));
         var2.add(var3);
      }

      if (this.vs.mo0()) {
         w7_0 var10 = var1.Fk;
         var1.Fk.getClass();
         new M(var10);
         V3 var4;
         var4 = new V3(var10);

         while (var4.hasNext()) {
            int var5;
            X90 var11;
            if ((((var5 = (var11 = (X90)var4.u7()).Sf) & 1) == 0 && (var5 & 2) == 0 || ((var5 & 1) != 0 ? 0 : ((var5 & 2) != 0 ? 1 : -1)) == this.kE0)
               && !var11.wk(4)
               && (var11.SG != q10_0.uz || var11.ax >= 2)
               && (var11.Sf & 1024) == 0) {
               var2.add(new xn_0(asBridge(), var11, this.CE.iu0[var1.iL]));
            }
         }
      } else {
         boolean var12 = false;
         w7_0 var14 = var1.Fk;
         var1.Fk.getClass();
         new M(var14);
         V3 var17;
         var17 = new V3(var14);

         while (var17.hasNext()) {
            X90 var15 = (X90)var17.u7();
            qe0_2 var6 = this.Fi;
            if (this.Fi != null) {
               byte var7 = var1.iL;
               if (var6.pr[var1.iL] == var15.ax) {
                  var2.add(new xn_0(asBridge(), var15, var6.iu0[var7]));
                  continue;
               }
            }

            if ((var15.SG != q10_0.uz || var15.ax >= 2) && (var15.Sf & 1024) == 0) {
               BR var19 = tw0_0.rl;
               if (tw0_0.rl != null && var19.yh0.Ny((byte)4, (short)2409) && (var1 == q10_0.Bj0 && var15.ax == 39 || var1 == q10_0.bb && var15.ax == 8)) {
                  var2.clear();
                  xn_0 var22 = new xn_0(asBridge(), var15, (byte)-1);
                  var22.dz = true;
                  var2.add(var22);
                  var12 = true;
               }
            } else {
               xn_0 var10001 = new xn_0(asBridge(), var15, (byte)-1);
               var10001.dz = true;
               var2.add(var10001);
            }
         }

         if (!var12) {
            HashMap var13;
            var13 = new HashMap();
            K5[] var16;
            int var18 = (var16 = tw0_0.rl.NC[1].do$(l5_0.Hj)).length;

            for (int var20 = 0; var20 < var18; var20++) {
               X90 var8;
               K5 var21;
               if ((var8 = (var21 = var16[var20]).cL.Iq) != null && var8.SG == var1) {
                  xn_0 var9;
                  if ((var9 = (xn_0)var13.get(var8.ax)) == null) {
                     var9 = new xn_0(asBridge(), var8, (byte)-1);
                     var13.put(var8.ax, var9);
                     var2.add(var9);
                  }

                  var9.Jq0.add(var21);
                  var9.fv0(var21.nn.N50);
               }
            }
         }
      }

      Collections.sort(var2);
      return var2;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public AvatarCustomizationWindow(ry_0 var1, byte var2, Qy0 var3, CH0 var4) {
      super(tw0_0.kz0());
      fy_2 var5;
      var5 = new fy_2();
      this.finally$ = var5;
      this.catch$ = 0;
      this.Jz0 = -1;
      this.nz = null;
      ArrayList var46;
      var46 = new ArrayList();
      this.iA = var46;
      HashMap var6;
      var6 = new HashMap();
      this.sL0 = var6;
      this.T4 = 0;
      this.private$ = UK0[0];
      this.pb = false;
      this.Du0 = var2;
      this.vs = var1;
      this.uf("customize-widget");
      this.ff0(1);
      this.Hy(sm0_0.c0(var1.Com6()));
      this.Pb0(() -> this.ot0(var1, var2, var3, var4));
      fy_2 var18;
      var18 = new fy_2();
      this.Pf0 = var18;
      if (var1 == ry_0.J30) {
            this.kE0 = (byte)rg0_2.r4(2);
      } else if (var1 == ry_0.Rz0 || var1 == ry_0.zm || var1 == ry_0.w30) {
            if (tw0_0.rl.XG0().HW(var4) != null) {
               this.kE0 = tw0_0.rl.XG0().HW(var4).sm().dR();
               this.B50 = var4;
            } else if (tw0_0.rl.ex() != null) {
               this.kE0 = tw0_0.rl.ex().dR();
               this.B50 = tw0_0.rl.ex().yE();
            }
      } else {
            this.kE0 = tw0_0.rl.ex().dR();
      }

      ry_0 var19 = ry_0.J30;
      if (var1 != ry_0.J30 && var1 != ry_0.Rz0) {
         E90 var34 = tw0_0.e60.at();
         if (var1.mo0()) {
            this.CE = var34.Gi().Lh().je0();
            this.kI0(false);
         } else {
            this.Fi = var34.Gi().Lh().je0();
            this.CE = var34.Gi().COM6().je0();
         }
      } else {
         qe0_2 var33;
         var33 = new qe0_2();
         this.CE = var33;
         this.kI0(true);
      }

      Mm var20;
      var20 = new Mm(asBridge(), this.CE.Ih0());
      this.II0 = var20;
      zc0_1 var21;
      var21 = new zc0_1();
      this.Dp = var21;
      cn_0 var35 = new cn_0(sm0_0.c0(1055));
      var35.uf("customization-label");
      pg0_2 var53;
      var53 = new pg0_2(sm0_0.c0(1056), sm0_0.c0(1057));
      X6 var7 = new X6(var53);
      this.t3 = var7;
      var7.Bd(this.kE0);
      var7.Rm0(this::BC);
      if (var1 != var19 && var1 != ry_0.w30) {
         var7.pw0(false);
      } else {
         var7.pw0(true);
         le0_2[] var22;
         le0_2[] var98 = var22 = new le0_2[2];
         var98[0] = var35;
         var98[1] = var7;
         var21.qG0(var22);
         var46.add(var7);
      }

      cn_0 var23 = new cn_0(sm0_0.c0(2870));
      var23.uf("customization-label");
      byte var36 = 5;
      String[] var47 = new String[5];
      int var54 = 0;

      while (var54 < var36) {
         var47[var54] = sm0_0.wa0(2808, "" + ++var54);
      }

      pg0_2 var37;
      var37 = new pg0_2((Object[])var47);
      X6 var48 = new X6(var37);
      this.a70 = var48;
      var48.Rm0(this::fp);
      var48.Bd(this.CE.Ih0());
      this.Dp.qG0(var23, var48);
      this.iA.add(var48);
      boolean var24 = var1.mo0() && var1 != ry_0.zm;
      var48.pw0(var24);
      q10_0[] var79 = q10_0.Pn0;
      q10_0[] var93 = q10_0.Pn0;
      q10_0[] var99 = q10_0.Pn0;
      q10_0[] var25;
      q10_0[] var10003 = var25 = q10_0.Pn0;
      this.wn = new M30[q10_0.Pn0.length];
      this.NU = new X6[var10003.length];
      this.nj0 = new qj_2[var99.length];
      this.CF0 = new cn_0[var93.length];
      int var38 = var79.length;

      for (int var49 = 0; var49 < var38; var49++) {
         q10_0 var55;
         byte var60 = (var55 = var25[var49]).Th0();
         cn_0[] var80 = this.CF0;
         cn_0 var8;
         var8 = new cn_0(sm0_0.c0(var55.DE()));
         var80[var60] = var8;
         this.CF0[var60].uf("customization-label");
         qj_2[] var81 = this.nj0;
         qj_2 var63;
         var63 = new qj_2("");
         var81[var60] = var63;
         this.nj0[var60].sl().r8(fn_0.qz0().wm());
         Br0 var64 = this.nj0[var60].sl();
         float var9;
         if (tw0_0.kz0()) {
            var9 = 2.0F;
         } else {
            var9 = 1.0F;
         }

         var64.dA(var9);
         Br0 var65 = this.nj0[var60].sl();
         byte var71 = 0;
         byte var10;
         if (tw0_0.kz0()) {
            var10 = 6;
         } else {
            var10 = 12;
         }

         var65.Gy0(var71, var10);
         this.nj0[var60].uf("customization-color");
         this.nj0[var60].Ll(false);
         M30[] var82 = this.wn;
         pg0_2 var66;
         var66 = new pg0_2(this.q9(q10_0.Pt0(var60)));
         var82[var60] = var66;
         X6[] var83 = this.NU;
         B40 var67;
         var67 = new B40(this.wn[var60]);
         var83[var60] = var67;
         this.nj0[var60].RR(() -> this.Pi0(var55));
          this.NU[var60].Rm0(() -> this.b50(var55));
         if (this.wn[var60].ul0() < 2) {
            this.NU[var60].pw0(false);
         }

         if (var55 != q10_0.finally$ && (var55 != q10_0.Cw0 || var1 != ry_0.J30)) {
            if (var1 == ry_0.zm) {
               X6 var68 = this.NU[var60];
               q10_0 var72 = q10_0.VI;
               boolean var75;
               if (var55 != q10_0.VI && var55 != q10_0.rg0 && var55 != q10_0.uz) {
                  var75 = false;
               } else {
                  var75 = true;
               }

               var68.pw0(var75);
               qj_2 var69 = this.nj0[var60];
               boolean var73;
               if (var55 != var72 && var55 != q10_0.rg0 && var55 != q10_0.uz) {
                  var73 = false;
               } else {
                  var73 = true;
               }

               var69.pw0(var73);
            }

            this.Dp.qG0(this.CF0[var60], this.NU[var60], this.nj0[var60]);
             this.sL0.put(this.iA.size(), (Runnable)() -> this.Pi0(var55));
            this.iA.add(this.NU[var60]);
         }
      }

      this.Cb0();
      String var39 = sm0_0.c0(var1 == ry_0.J30 ? 1051 : 2802);
      xe_1 var26 = new xe_1(var39);
      this.fj0 = var26;
      var26.uf("button");
      var26.Ll(true);
      var26.RR(this::qp);
      if (tw0_0.kz0()) {
         var26.uf("mobile-save-icon");
         var26.SU("");
      }

      this.finally$.uf("color-dialog");
      this.finally$.WQ(this.finally$.H10());
      this.finally$.x40(this.finally$.lo0());
      Hm0 var27 = this.finally$.lo0();
      I7 var40 = this.finally$.H10();
      yb_1[] var50;
      yb_1[] var84 = var50 = yb_1.Mh;
      this.rG0 = new xe_1[yb_1.Mh.length];
      this.finally$.kl0().Ze0();
      int var56 = 0;
      int var61 = var84.length;

      for (int var70 = 0; var70 < var61; var70++) {
         yb_1 var74 = var50[var70];
         xe_1[] var76 = this.rG0;
         qj_2 var11 = new qj_2(null, (byte)(tw0_0.kz0() ? 70 : 30), (byte)(tw0_0.kz0() ? 70 : 30));
         var76[var56] = var11;
         this.rG0[var56].uf("color-button");
         xe_1 var77;
         xe_1 var100 = var77 = this.rG0[var56];
         gn_0 var78;
         var78 = new gn_0(var74.Q2().rR());
         var100.LPT8(new N1(var77, var78));
         this.rG0[var56].RR(() -> this.iB0(var74));
         var27.Kn0(this.rG0[var56]);
         var40.Kn0(this.rG0[var56]);
         if (++var56 % 3 == 0) {
            this.finally$.kl0().X20(var27);
            this.finally$.nt0().X20(var40);
            var27 = this.finally$.lo0();
            var40 = this.finally$.H10();
         }
      }

      this.finally$.kl0().X20(var27).Ze0();
      this.finally$.nt0().X20(var40);
      this.finally$.Ll(false);
      int var24x;
      if (tw0_0.kz0()) {
         var24x = 128;
      } else {
         var24x = 64;
      }

      qj_2 var41 = (qj_2)new qj_2("", var24x, var24x).sl().r8(fn_0.qz0().sy());
      this.gJ = var41;
      qj_2 var51;
      qj_2 var94 = var51 = (qj_2)new qj_2("", var24x, var24x).sl().r8(fn_0.qz0().a7());
      this.xc = var51;
      var41.sl().nq0(var24x, var24x);
      var51.sl().nq0(var24x, var24x);
      var41.uf("widget");
      var51.uf("widget");
      var41.RR(() -> this.nu(-1));
      var94.RR(() -> this.nu(1));
      this.SL(var41);
      this.SL(var51);
      xe_1 var29 = new xe_1(sm0_0.c0(2801));
      this.Pw = var29;
      var29.uf("button");
      var29.Ll(false);
      var29.RR(this::Qz);
      fy_2 var30;
      var30 = new fy_2();
      if (var1 == ry_0.J30) {
         this.bD(false);
         var30.uf("login-panel");
         cg_0 var42 = new cg_0();
         this.PV = var42;
         var42.ef0(16);
         var42.LPt8("[a-zA-Z]");
         cn_0 var52 = new cn_0(sm0_0.c0(1053));
         var52.coM8(var42);
         var52.uf("customization-label");
         var52.kl();
         xe_1 var43 = new xe_1(sm0_0.c0(nf0_0.Bq0));
         this.qA0 = var43;
          var43.RR(() -> BC(var3));
         cn_0 var31 = new cn_0(sm0_0.c0(1060));
         var31.uf("customization-label");
         ArrayList var44;
         var44 = new ArrayList();

         for (byte var57 = 0; var57 < 5; var57++) {
            var44.add(sm0_0.c0(UK0[var57] + 250000));
         }

         pg0_2 var58;
         var58 = new pg0_2(var44);
         X6 var45 = new X6(var58);
         this.zc0 = var45;
         var45.Rm0(this::U1);
         var45.Bd(0);
         I7 var59 = var30.H10();
         Hm0 var62 = var30.lo0();
         var59.X20(var30.hb(var52, this.PV));
         var62.X20(var30.C7(var52, this.PV));
         var59.X20(var30.hb(var31, var45));
         var62.X20(var30.C7(var31, var45));
         var30.x40(var59);
         var30.WQ(var62);
      }

      Hm0 var15 = this.Pf0.lo0();
      I7 var32;
      I7 var96 = var32 = this.Pf0.H10();
      var15.Kn0(this.Dp);
      var96.Kn0(this.Dp).VY(5, 10, 10);
      if (var1 == ry_0.J30) {
         var15.Kn0(var30);
         var32.Kn0(var30).Ze0();
      }

      this.Pf0.x40(var15);
      this.Pf0.WQ(var32);
      this.SL(this.Pf0);
      this.SL(this.finally$);
      if (!tw0_0.kz0()) {
         this.SL(this.Pw);
      }

      this.SL(this.fj0);
      this.nu(1);
      this.sL0.put(this.iA.size(), (Runnable)this::PB);
      this.iA.add(this.fj0);

      for (int var16 = 0; var16 < this.iA.size(); var16++) {
         if (((le0_2)this.iA.get(var16)).uo()) {
            this.T4 = var16;
            break;
         }
      }

      if (tw0_0.xj0()) {
         xe_1 var17 = new xe_1();
         this.BZ = var17;
          var17.RR(j20::aF);
         var17.uf("mobile-share-icon");
         var17.SU("");
         this.SL(var17);
      }
   }

   public static void BC(Qy0 var1) {
      var1.da0(null, CH0.j1, (byte)0);
   }

   public static void aF() {
      i4_0 var1 = kr_2.R4();
      tw0_0.lM.getClass();
      var1.dispose();
   }
}
