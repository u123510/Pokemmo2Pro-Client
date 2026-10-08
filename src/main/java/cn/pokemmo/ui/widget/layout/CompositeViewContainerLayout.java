package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CompositeViewContainerLayout extends BaseLayoutBox implements vy_2 {
   public static mc0_1 lF0;
   public final ML0 tn0;
   public final lo0_0 hG;
   public final fy_2 b30;
   public final cn_0 Cs;
   public final S70 ZI0;
   public l5_0 uW;
   public final xe_1 I7;
   public final cn_0 nq;
   public final xe_1 h90;
   public final xe_1 Pg;
   public an_1[] COm9;
   public int Bh0 = 0;
   public tf_1 QQ;
   public u2_0 F20;
   public int Rg;
   public int kr;
   public int fj;
   public int jA;
   public final A5 on0;
   public final EnumMap<l5_0, List<ie_2>> R6;
   public List<l5_0> l6;

   public CompositeViewContainerLayout(ML0 var1) {
      EnumMap<l5_0, List<ie_2>> var2;
      var2 = new EnumMap<>(l5_0.class);
      this.R6 = var2;
      this.l6 = Arrays.asList(l5_0.qk0);
      this.tn0 = var1;
      if (tw0_0.kz0()) {
         this.uf("battle-panel");
      } else {
         this.uf("battle-item-usage-panel");
      }

      cn_0 var7;
      var7 = new cn_0();
      this.nq = var7;
      xe_1 var8;
      var8 = new xe_1("≪");
      this.h90 = var8;
       xe_1 var16;
       xe_1 var10000;
       var16 = new xe_1("≫");
      this.Pg = var16;
      var8.RR(this::MV);
       var16.RR(this::Nt0);
      A5 var9 = tw0_0.rl.gh0();
      this.on0 = var9;
       lo0_0 var17;
       lo0_0 var31 = var17 = new lo0_0();
      this.hG = var17;
      var31.Qs0(2);
      fy_2 var18;
      var18 = new fy_2();
      this.b30 = var18;
      cn_0 var19;
      var19 = new cn_0("");
      this.Cs = var19;
       lo0_0 var3;
       lo0_0 var32 = var3 = new lo0_0();
      var32.AH0(var19);
      var32.Qs0(2);
       S70 var20;
       S70 var33 = var20 = new S70(64, 64);
      this.ZI0 = var20;
      var33.JH().Gy0(6, 6);
      var33.uf("battle-item-pic");
      xe_1 var21;

      var10000 = var21 = new xe_1(sm0_0.c0(1410));
      this.I7 = var21;
      var10000.RR(this::QE0);
      HashMap<mc0_1, ie_2> var22;
      var22 = new HashMap<>();
      K5[] var10;
      int var4 = (var10 = tw0_0.rl.Bb(var9).KL()).length;

      for (int var5 = 0; var5 < var4; var5++) {
         K5 var6;
         if ((var6 = var10[var5]).LW().dB0(true) != JU.O4) {
             var22.computeIfAbsent(var6.LW(), ie_2::new).Dk(var6);
         }
      }

      l5_0[] var11 = l5_0.tC0;
      var4 = l5_0.tC0.length;

      for (int var29 = 0; var29 < var4; var29++) {
         l5_0 var10001 = var11[var29];
          EnumMap<l5_0, List<ie_2>> var35 = this.R6;
          ArrayList<ie_2> var30;
          var30 = new ArrayList<>();
         var35.put(var10001, var30);
      }

      for (ie_2 var23 : var22.values()) {
         this.R6.get(var23.TG0.su0()).add(var23);
      }

      for (List<ie_2> var24 : this.R6.values()) {
         for (ie_2 group : var24) {
            group.p7();
         }

         Collections.sort(var24);
      }

      if (tw0_0.H30()) {
         this.I7.SU(sm0_0.c0(5029));
         this.I7.uf("battle-button-confirm");
         fy_2 var36 = this.b30;
         I7 var38 = this.b30.H10();
         Hm0 var10002 = this.b30.lo0();
         S70 var14 = this.ZI0;
         pa0_0 var25 = pa0_0.Ol;
         var36.x40(var38.X20(var10002.k5(pa0_0.Ol, var14).k5(var25, var3)).Ze0().k5(pa0_0.L00, this.I7));
         this.b30.WQ(this.b30.C7(new le0_2[]{this.ZI0}).X20(this.b30.hb(new le0_2[]{var3}).k5(pa0_0.xE, this.I7)));
      } else {
         fy_2 var37 = this.b30;
         I7 var39 = this.b30.H10();
         Hm0 var40 = this.b30.lo0();
         S70 var15 = this.ZI0;
         pa0_0 var26 = pa0_0.Ol;
         var37.x40(var39.X20(var40.k5(pa0_0.Ol, var15).k5(var26, var3)).Ze0().k5(pa0_0.L00, this.I7));
         this.b30.WQ(this.b30.lo0().X20(this.b30.C7(new le0_2[]{this.ZI0, var3})).k5(pa0_0.Vp0, this.I7));
      }

      this.x40(this.lo0().LPt3(new le0_2[]{this.hG, this.b30}));
      this.WQ(this.H10().LPt3(new le0_2[]{this.hG, this.b30}));
      this.Cs.uf("label-black");
      this.nq.uf("label-black");
      this.Pa();
   }

   static {
      l5_0 var10000 = l5_0.qk0[0];
   }

   public static boolean eX(HashSet var0, ie_2 var1) {
      var1.rw0.removeIf(var2 -> !var0.contains(var2));
      var1.xH0();
      return var1.rw0.size() == 0;
   }

   public static boolean M5(HashSet var0, K5 var1) {
      return !var0.contains(var1);
   }

   public final void X8(K5 var1, CH0 var2, byte var3) {
      ML0 var5;
      if ((var5 = this.tn0).kX.eE) {
         oj_2 var4;
         oj_2 var10001;
         b30_0 var6 = var5.xT;
         var10001 = var4 = new oj_2(var6, var1, var2, var3);
         var5.rY(var4);
      }
   }

   public final boolean dv() {
      return true;
   }

   public final void Pa() {
      Hm0 var10000 = new Hm0(this);
      I7 var10001 = new I7(this);
      le0_2[] var1;
      le0_2[] var10002 = var1 = new le0_2[3];
      var10002[0] = this.h90;
      var10002[1] = this.nq;
      var10002[2] = this.Pg;
      this.x40(var10000.X20(var10001.X20(this.hb(var1)).Kn0(this.hG)).Kn0(this.b30));
      if (tw0_0.kz0() ^ true) {
         I7 var6 = new I7(this);
         Hm0 var8 = new Hm0(this);
         ya_1 var10 = new I7(this).k5(pa0_0.xE, this.h90);
         cn_0 var3 = this.nq;
         pa0_0 var2 = pa0_0.Vp0;
         this.WQ(var6.X20(var8.X20(var10.k5(pa0_0.Vp0, var3).k5(pa0_0.up0, this.Pg)).k5(var2, this.hG)).k5(var2, this.b30).Ze0());
      } else {
         I7 var7 = new I7(this);
         ya_1 var9 = new Hm0(this).X20(new I7(this).k5(pa0_0.xE, this.h90).Ze0().k5(pa0_0.Ol, this.nq).Ze0().k5(pa0_0.up0, this.Pg));
         lo0_0 var4 = this.hG;
         pa0_0 var5 = pa0_0.Vp0;
         this.WQ(var7.X20(var9.k5(pa0_0.Vp0, var4)).k5(var5, this.b30).Ze0().Ze0());
      }
   }

   public final void Ll(boolean var1) {
      super.Ll(var1);
      this.QQ = null;
      this.F20 = null;
      this.em();
      this.Pa();
      if (var1) {
         RJ0 var3 = tw0_0.rl.Bb(this.on0);
         HashSet var2;
         var2 = new HashSet(Arrays.asList(var3.KL()));
          for (List<ie_2> groups : this.R6.values()) {
             groups.removeIf(group -> {
                group.rw0.removeIf(item -> !var2.contains(item));
                group.xH0();
                return group.rw0.size() == 0;
             });
         }

         mc0_1 var5 = lF0;
         l5_0 var6;
         if (lF0 == null) {
            var6 = (l5_0)this.l6.get(0);
         } else {
            var6 = var5.Yt0;
         }

         this.R90(var6);
      }
   }

   public final void lE0(i70_0 var1) {
      u2_0 var2 = this.F20;
      if (this.F20 != null) {
         var2.iD(var1);
      } else {
         tf_1 var12 = this.QQ;
         if (this.QQ != null) {
            var12.AT(var1);
         } else {
            int var13 = var1.finally$;
            rp_0 var3 = rp_0.I90;
            if (rp_0.I90 != null && var3.Ov(var13)) {
               xe_1 var6;
               if ((var6 = this.h90).OI) {
                  a7_0.bH(var6.ER.Fc0);
               }
            } else {
               int var14 = var1.finally$;
               var3 = rp_0.Ni;
               if (rp_0.Ni != null && var3.Ov(var14)) {
                  xe_1 var5;
                  if ((var5 = this.Pg).OI) {
                     a7_0.bH(var5.ER.Fc0);
                  }
               } else {
                  int var15 = var1.finally$;
                  var3 = rp_0.kC0;
                  if (rp_0.kC0 != null && var3.Ov(var15)) {
                     int var11 = this.Bh0;
                     if (this.Bh0 > 0) {
                        this.Bh0 = var11 - 1;
                     }
                  } else {
                     int var16 = var1.finally$;
                     var3 = rp_0.synchronized$;
                     if (rp_0.synchronized$ == null || !var3.Ov(var16)) {
                        int var8 = var1.finally$;
                        rp_0 var17 = rp_0.sJ0;
                        if (rp_0.sJ0 != null && var17.Ov(var8)) {
                           xe_1 var9 = this.I7;
                           if (this.I7 != null) {
                              a7_0.bH(var9.ER.Fc0);
                              return;
                           }

                           an_1[] var4;
                           int var10;
                           if ((var10 = this.Bh0) >= (var4 = this.COm9).length) {
                              return;
                           }

                           a7_0.bH(var4[var10].ER.Fc0);
                        }

                        return;
                     }

                     int var7;
                     if ((var7 = this.Bh0 + 1) < this.COm9.length) {
                        this.Bh0 = var7;
                     }
                  }

                  this.j3();
               }
            }
         }
      }
   }

   public final void j3() {
      int var1 = this.Bh0;
      an_1[] var2 = this.COm9;
      if (this.Bh0 >= this.COm9.length) {
         this.Cs.Sk("");
         this.ZI0.og.lo0();
      } else {
         lpt6__0.v90(var2[var1]);
         this.hG.Rn(this.COm9[this.Bh0]);
      }
   }

   public final void R90(l5_0 var1) {
      if (var1 != null) {
         this.uW = var1;
         this.nq.Sk(sm0_0.c0(var1.ni));
         xe_1 var2 = this.h90;
         boolean var3;
         if (this.l6.indexOf(var1) > 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         var2.pw0(var3);
         var2 = this.Pg;
         if (this.l6.indexOf(var1) < this.l6.size() - 1) {
            var3 = true;
         } else {
            var3 = false;
         }

         var2.pw0(var3);
         fy_2 var15;
         var15 = new fy_2();
         I7 var19;
         var19 = new I7(var15);
         Hm0 var4;
         var4 = new Hm0(var15);
         re0_1 var5;
         var5 = new re0_1();
         oj_2[] var6 = tw0_0.PK0.zr;
         int var7 = tw0_0.PK0.zr.length;

         for (int var8 = 0; var8 < var7; var8++) {
            oj_2 var9;
            K5 var25;
            if ((var9 = var6[var8]) != null && var9.hI0 == kt_2.IL0 && (var25 = var9.tJ) != null) {
               var5.Iy(var25.nn.Br);
            }
         }

         ArrayList var22;
         var22 = new ArrayList();
         Iterator var10 = ((List)this.R6.get(var1)).iterator();

         while (var10.hasNext()) {
            ie_2 var23;
            int var24;
            if (((var24 = var5.Dy0((var23 = (ie_2)var10.next()).Qy0.nn.Br)) < 0 ? var5.gz : var5.ju0[var24]) < var23.OC0) {
               var22.add(var23);
            }
         }

         this.COm9 = new an_1[var22.size()];
         int var11 = 0;

         while (true) {
            an_1[] var20 = this.COm9;
            if (var11 >= this.COm9.length) {
               xe_1 var12 = this.I7;
               if (this.I7 != null) {
                  var12.Ll(var22.isEmpty() ^ true);
               }

               label66: {
                  var19.LPt3(this.COm9);
                  var4.LPt3(this.COm9);
                  var15.x40(var19);
                  var15.WQ(var4);
                  this.hG.AH0(var15);
                  if (lF0 != null) {
                     int var13 = 0;

                     while (true) {
                        an_1[] var16 = this.COm9;
                        if (var13 >= this.COm9.length) {
                           break;
                        }

                        an_1 var17;
                        if ((var17 = var16[var13]) != null && var17.xv.TG0 == lF0) {
                           lpt6__0.v90(var17);
                           this.hG.Rn(var17);
                           this.Bh0 = var13;
                           break label66;
                        }

                        var13++;
                     }
                  }

                  this.Bh0 = 0;
                  lF0 = null;
               }

               this.j3();
               this.K8();
               return;
            }

            an_1 var21;
            var21 = new an_1((f.q40_0)(Object)this, (ie_2)var22.get(var11), var11);
            var20[var11] = var21;
            var11++;
         }
      }
   }

   public final void OV(mc0_1 var1, CH0 var2, VU var3) {
      u2_0 var4 = this.F20;
      if (this.F20 != null) {
         this.u3(var4);
         this.F20 = null;
      }

      this.em();
      u2_0 var10006;
      var10006 = var4 = new u2_0((f.q40_0)(Object)this, var1, var2, var3);
      this.F20 = var10006;
      this.x40(this.C7(new le0_2[]{var4}));
      this.WQ(this.hb(new le0_2[]{this.F20}));
      u2_0 var5;
      xe_1[] var6;
      int var7;
      if ((var7 = (var5 = this.F20).jO) >= 0 && var7 < (var6 = var5.Ts0).length) {
         lpt6__0.v90(var6[var7]);
      }
   }

   public final void ew0() {
   }

   public final void QE0() {
      int var1 = this.Bh0;
      if (this.Bh0 >= 0) {
         an_1[] var2 = this.COm9;
         if (var1 < this.COm9.length) {
            ie_2 var7;
            (var7 = var2[var1].xv).getClass();
            if (tw0_0.PK0 != null) {
               re0_1 var10;
               var10 = new re0_1();
               oj_2[] var3 = tw0_0.PK0.zr;
               int var4 = tw0_0.PK0.zr.length;

               for (int var5 = 0; var5 < var4; var5++) {
                  oj_2 var6;
                  K5 var16;
                  if ((var6 = var3[var5]) != null && var6.hI0 == kt_2.IL0 && (var16 = var6.tJ) != null) {
                     var10.Iy(var16.nn.Br);
                  }
               }

               Iterator var13 = var7.rw0.iterator();

               while (var13.hasNext()) {
                  K5 var14;
                  int var15;
                  if (((var15 = var10.Dy0((var14 = (K5)var13.next()).nn.Br)) < 0 ? var10.gz : var10.ju0[var15]) < var14.nn.PA0) {
                     var7.Qy0 = var14;
                     break;
                  }
               }
            }

            switch (H5.lG0[var7.TG0.dB0(true).Ap0]) {
               case 1:
                  this.U90(var7.TG0.Z8, var7.Qy0.nn.Br, CH0.j1, (byte)-1);
                  break;
               case 2:
               case 3:
               case 4:
               case 5:
                  K5 var8 = var7.Qy0;
                  tf_1 var11 = this.QQ;
                  if (this.QQ != null) {
                     this.u3(var11);
                     this.QQ = null;
                  }

                  this.em();
                  tf_1 var12;
                  tf_1 var10005;
                  mc0_1 var9 = var8.cL;
                  var10005 = var12 = new tf_1((f.q40_0)(Object)this, var9, var8.nn.Br, false);
                  this.QQ = var10005;
                  lpt6__0.v90(var12.Ba0());
                  this.x40(this.C7(new le0_2[]{this.QQ}));
                  this.WQ(this.hb(new le0_2[]{this.QQ}));
            }

            return;
         }
      }
   }

   public final void Nt0() {
      int var1 = this.l6.indexOf(this.uW) + 1;
      if (this.l6.size() > var1 && var1 >= 0) {
         this.R90((l5_0)this.l6.get(var1));
      }
   }

   public final void MV() {
      int var1 = this.l6.indexOf(this.uW) - 1;
      if (this.l6.size() > var1 && var1 >= 0) {
         this.R90((l5_0)this.l6.get(var1));
      }
   }

   public final void U90(short var1, CH0 var2, CH0 var3, byte var4) {
      RJ0 var5;
      if ((var5 = tw0_0.rl.Bb(this.on0)) != null) {
         K5 var11;
         if ((var11 = var5.zg(var2)) != null) {
            short var12;
            if ((var12 = X4.gA0(var1)) != 1 && var12 != 5001 && var12 != 5016 && var12 != 5044) {
               ML0 var6;
               if ((var6 = this.tn0).kX.eE) {
                  oj_2 var10;
                  b30_0 var7 = var6.xT;
                  var10 = new oj_2(var7, var11, var3, var4);
                  var6.rY(var10);
               }
            } else {
               if (jq0_0.hA(this.tn0, lpt3__4.class)) {
                  return;
               }

               mc0_1 var8 = gu0.l2.lPT6(var1);
               Qy0 var10000 = Qy0.yI0;
               String var9 = sm0_0.wa0(1435, sm0_0.c0(var8.Nl));
               K5 selected = var11;
               lpt3__4 var10001 = new lpt3__4(var9, () -> this.X8(selected, var3, var4), this);
               var10001.D80 = true;
               var10000.sr0(var10001);
            }

            lF0 = var11.cL;
         }
      }
   }

   public final void Lj0(short var1, CE var2) {
   }
}
