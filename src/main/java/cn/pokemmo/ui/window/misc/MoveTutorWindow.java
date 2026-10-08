package cn.pokemmo.ui.window.misc;

import f.*;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 招式教学狂学习技能窗口
 *
 * 原混淆类: f.Bn0
 */
public class MoveTutorWindow extends R90 {
    public final Bn0 asBridge() {
        return (Bn0) (Object) this;
    }

   public final BU F50;
   public ly_2 na0;
   public final fy_2 Js0;
   public int O00 = -1;
   public final cn_0 w60;
   public final S70 vP;
   public final ba0_1 ch;
   public final cn_0 zn0;
   public final cn_0 v80;
   public final cn_0 TK0;
   public final cn_0 DG;
   public final qr0_0[] u70;
   public final nl0_0 sj;
   public final VU PQ;
   public final byte bV;
   public final G20[] eH;
   public final lo0_0 vA0;
   public final xe_1 PK;

   public MoveTutorWindow(BU var1, nl0_0 var2, byte var3, VU var4, short[] var5) {
      this.F50 = var1;
      this.bV = var3;
      this.PQ = var4;
      this.sj = var2;
      Tm0 var19;
      var19 = new Tm0(asBridge());
      this.Pb0(var19);
      gn_0 var33 = new gn_0((byte)-1, (byte)-1, (byte)-1, (byte)-1);
      N1 var20 = new N1(asBridge(), var33);
      this.LPT8(var20);
      this.uf("movetutor");
      if (var2 != nl0_0.eu0 && var2 != nl0_0.rB) {
         this.Hy(sm0_0.c0(1932));
      } else {
         this.Hy(sm0_0.c0(1933));
      }

      this.ff0(1);
      this.bD(false);
      fy_2 var21;
      var21 = new fy_2();
      this.Js0 = var21;
      fy_2 var22;
      fy_2 var10000 = var22 = new fy_2();
      I7 var34 = var10000.H10();
      Hm0 var38 = var10000.lo0();
      ArrayList<qr0_0> var6;
      var6 = new ArrayList<>();

      for (int var7 = 0; var7 < var5.length; var7++) {
         short var8;
         short var57 = var8 = var5[var7];
         boolean var9 = true;
         if (var57 < 1 && var8 != 0) {
            var9 = false;
            var8 = (short)(var8 * -1);
         }

         var6.add(new qr0_0(ec0_2.Sx().SX(var8), var9, var7));
      }

      Collections.sort(var6);
      this.eH = new G20[(this.u70 = var6.toArray(new qr0_0[0])).length];
      int var42 = 0;

      while (true) {
         qr0_0[] var44 = this.u70;
         if (var42 >= this.u70.length) {
            var34.LPt3(this.eH);
            var38.LPt3(this.eH);
            var22.x40(var34);
            var22.WQ(var38);
            lo0_0 var32;
            lo0_0 var62 = var32 = new lo0_0();
            this.vA0 = var32;
            var32.Qs0(2);
            var62.AH0(var22);
            var62.MB0();
            cn_0 var23;
            var23 = new cn_0(sm0_0.c0(1854));
            cn_0 var35;
            cn_0 var63 = var35 = new cn_0();
            this.w60 = var35;
            var63.uf("label-value");
            cn_0 var39;
            var39 = new cn_0(sm0_0.c0(1855));
            S70 var43;
            S70 var64 = var43 = new S70(140, 28);
            this.vP = var43;
            var64.JH().Gy0(5, 8);
            var64.uf("label-value-type");
            cn_0 var46;
            var46 = new cn_0(sm0_0.c0(1856));
            ba0_1 var48;
            ba0_1 var65 = var48 = new ba0_1();
            this.ch = var48;
            var65.uf("label-value");
            cn_0 var49;
            var49 = new cn_0(sm0_0.c0(1850));
            cn_0 var50;
            cn_0 var66 = var50 = new cn_0();
            this.zn0 = var50;
            var66.uf("label-value");
            cn_0 var10;
            var10 = new cn_0(sm0_0.c0(1851));
            cn_0 var11;
            cn_0 var67 = var11 = new cn_0();
            this.TK0 = var11;
            var67.uf("label-value");
            cn_0 var12;
            var12 = new cn_0(sm0_0.c0(1852));
            cn_0 var13;
            cn_0 var68 = var13 = new cn_0();
            this.v80 = var13;
            var68.uf("label-value");
            cn_0 var14;
            var14 = new cn_0(sm0_0.c0(1853));
            cn_0 var15;
            cn_0 var69 = var15 = new cn_0();
            this.DG = var15;
            var69.uf("label-value");
            fy_2 var16;
            var16 = new fy_2();
            Hm0 var70 = var16.lo0();
            ya_1[] var10002 = new ya_1[6];
            le0_2[] var17;
            le0_2[] var10009 = var17 = new le0_2[2];
            var10009[0] = var23;
            var10009[1] = var35;
            var10002[0] = var16.C7(var17);
            le0_2[] var10008 = var17 = new le0_2[2];
            var10008[0] = var46;
            var10008[1] = var48;
            var10002[1] = var16.C7(var17);
            le0_2[] var10007 = var17 = new le0_2[2];
            var10007[0] = var39;
            var10007[1] = var43;
            var10002[2] = var16.C7(var17);
            le0_2[] var10006 = var17 = new le0_2[2];
            var10006[0] = var49;
            var10006[1] = var50;
            var10002[3] = var16.C7(var17);
            le0_2[] var10005 = var17 = new le0_2[2];
            var10005[0] = var10;
            var10005[1] = var11;
            var10002[4] = var16.C7(var17);
            le0_2[] var10004 = var17 = new le0_2[2];
            var10004[0] = var12;
            var10004[1] = var13;
            var10002[5] = var16.C7(var17);
            ya_1 var56 = var70.Xq(var10002);
            I7 var71 = var16.H10();
            var10002 = new ya_1[6];
            le0_2[] var18;
            var10009 = var18 = new le0_2[2];
            var10009[0] = var23;
            var10009[1] = var35;
            var10002[0] = var16.hb(var18);
            le0_2[] var24;
            var10008 = var24 = new le0_2[2];
            var10008[0] = var46;
            var10008[1] = var48;
            var10002[1] = var16.hb(var24);
            le0_2[] var25;
            var10007 = var25 = new le0_2[2];
            var10007[0] = var39;
            var10007[1] = var43;
            var10002[2] = var16.hb(var25);
            le0_2[] var26;
            var10006 = var26 = new le0_2[2];
            var10006[0] = var49;
            var10006[1] = var50;
            var10002[3] = var16.hb(var26);
            le0_2[] var27;
            var10005 = var27 = new le0_2[2];
            var10005[0] = var10;
            var10005[1] = var11;
            var10002[4] = var16.hb(var27);
            le0_2[] var28;
            var10004 = var28 = new le0_2[2];
            var10004[0] = var12;
            var10004[1] = var13;
            var10002[5] = var16.hb(var28);
            ya_1 var29 = var71.Xq(var10002);
            if (var2 != nl0_0.Sg) {
               ya_1[] var36;
               var10002 = var36 = new ya_1[1];
               le0_2[] var40;
               le0_2[] var10003 = var40 = new le0_2[2];
               var10003[0] = var14;
               var10003[1] = var15;
               var10002[0] = var16.C7(var40);
               var56.Xq(var36);
               ya_1[] var37;
               ya_1[] var72 = var37 = new ya_1[1];
               le0_2[] var41;
               le0_2[] var75 = var41 = new le0_2[2];
               var75[0] = var14;
               var75[1] = var15;
               var72[0] = var16.hb(var41);
               var29.Xq(var37);
            }

            var16.WQ(var56);
            var16.x40(var29);
            xe_1 var30;
            xe_1 var60 = var30 = new xe_1(sm0_0.c0(1936));
            this.PK = var30;
            var60.RR(new F1(asBridge()));
            this.Js0.WQ(this.Js0.H10().Xq(this.Js0.lo0().qd(5).LPt3(var16, var30)));
            this.Js0.x40(this.Js0.lo0().Xq(this.Js0.H10().LPt3(var16, var30)));
            fy_2 var31 = new fy_2();
            var31.WQ(var31.H10().Xq(var31.lo0().X20(var31.lo0().LPt3(var32)), var31.H10().LPt3(this.Js0)));
            var31.x40(var31.lo0().Xq(var31.H10().X20(var31.H10().LPt3(var32)), var31.lo0().LPt3(this.Js0)));
            this.SL(var31);
            return;
         }

         qr0_0 var45;
         qr0_0 var58 = var45 = var44[var42];
         G20 var47;
         var47 = new G20(var45.Cm.CoM2(), "");
         if (!var58.A80) {
            var47.uf("button-disabled");
         }

         var47.RR(new uf0_2(asBridge(), var45, var42));
         this.eH[var42] = var47;
         var42++;
      }
   }

   public final void vj0() {
      int var1 = this.O00;
      if (this.O00 >= 0) {
         qr0_0[] var2 = this.u70;
         if (var1 < this.u70.length) {
            qr0_0 var5 = var2[var1];
            VU var6 = this.PQ;
            short var3 = this.u70[this.O00].Cm.hC0;
            Runnable var7 = () -> this.e80(var5);
            (this.na0 = new ly_2(var6, var3, var7)).uf("monster-panel");
            ly_2 var4 = this.na0;
            this.F9(this.fU(), var4);
            return;
         }
      }
   }

   @Override
   public final void C(zk0_1 var1) {
      this.vA0.Kj = hd_1.D0;
   }

   @Override
   public final void K8() {
      this.RY(500, 335);
      ly_2 var1 = this.na0;
      if (this.na0 != null) {
         var1.oY(300, 325);
      }

      this.vA0.g2(32767, 400);
      super.K8();
   }

   @Override
   public final boolean u3(le0_2 var1) {
      if (var1 == this.na0) {
         this.na0 = null;
      }

      return super.u3(var1);
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      return E00.ZU(var1.zu) && var1.iT() ? this.Sd0(var1.finally$) : super.nd0(var1);
   }

   public final boolean Sd0(int var1) {
      ly_2 var2 = this.na0;
      if (this.na0 != null) {
         rp_0 var3 = rp_0.synchronized$;
         if (rp_0.synchronized$ != null && var3.Ov(var1)) {
            int var8;
            if ((var8 = var2.XU + 2) < 4) {
               var2.XU = var8;
            }

            lpt6__0.v90(var2.qa[var2.XU]);
            return true;
         }

         var3 = rp_0.kC0;
         if (rp_0.kC0 != null && var3.Ov(var1)) {
            int var7 = var2.XU;
            if (var2.XU > 1) {
               var2.XU = var7 - 2;
            }

            lpt6__0.v90(var2.qa[var2.XU]);
            return true;
         }

         var3 = rp_0.I90;
         if (rp_0.I90 != null && var3.Ov(var1)) {
            int var6 = var2.XU;
            if (var2.XU > 0 && var6 % 2 == 1) {
               var2.XU = var6 - 1;
            }

            lpt6__0.v90(var2.qa[var2.XU]);
            return true;
         }

         var3 = rp_0.Ni;
         if (rp_0.Ni != null && var3.Ov(var1)) {
            int var5 = var2.XU;
            if (var2.XU < 4 && var5 % 2 == 0) {
               var2.XU = var5 + 1;
            }

            lpt6__0.v90(var2.qa[var2.XU]);
            return true;
         }

         var3 = rp_0.sJ0;
         if (rp_0.sJ0 != null && var3.Ov(var1)) {
            a7_0.bH(var2.qa[var2.XU].ER.Fc0);
            return true;
         }

         var3 = rp_0.nK0;
         if (rp_0.nK0 != null && var3.Ov(var1)) {
            var2.XU = -1;
            a7_0.bH(var2.xg.ER.Fc0);
            return true;
         }
      }

      rp_0 var14 = rp_0.synchronized$;
      if (rp_0.synchronized$ != null && var14.Ov(var1)) {
         int var10000 = var1 = this.O00 + 1;
         G20[] var20 = this.eH;
         if (var10000 < this.eH.length) {
            this.O00 = var1;
         }

         var1 = this.O00;
         if (this.O00 >= 0 && var1 < var20.length) {
            lpt6__0.v90(var20[var1]);
            a7_0.bH(this.eH[this.O00].ER.Fc0);
            this.vA0.Rn(this.eH[this.O00]);
         }

         return true;
      } else {
         rp_0 var15 = rp_0.kC0;
         if (rp_0.kC0 != null && var15.Ov(var1)) {
            var1 = this.O00;
            if (this.O00 > 0) {
               this.O00 = var1 - 1;
            }

            var1 = this.O00;
            if (this.O00 >= 0) {
               G20[] var19 = this.eH;
               if (var1 < this.eH.length) {
                  lpt6__0.v90(var19[var1]);
                  a7_0.bH(this.eH[this.O00].ER.Fc0);
                  this.vA0.Rn(this.eH[this.O00]);
               }
            }

            return true;
         } else {
            rp_0 var16 = rp_0.sJ0;
            if (rp_0.sJ0 != null && var16.Ov(var1)) {
               this.vj0();
               return true;
            }

            rp_0 var17 = rp_0.nK0;
            if (rp_0.nK0 != null && var17.Ov(var1)) {
               byte var9 = -1;
               byte var18 = -1;
               BU var26 = this.F50;
               MoveTutorWindow var4 = this.F50.cOm1;
               if (this.F50.cOm1 != null) {
                  var4.xe0();
                  var26.cOm1 = null;
               }

               tw0_0.rl.hB(this.bV, var9, var18);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public final void e80(qr0_0 var1) {
      ly_2 var2 = this.na0;
      if (this.na0 != null) {
         byte var5 = (byte)(var1.zI0 + 1);
         byte var6 = (byte)var2.XU;
         BU var3 = this.F50;
         MoveTutorWindow var4 = this.F50.cOm1;
         if (this.F50.cOm1 != null) {
            var4.xe0();
            var3.cOm1 = null;
         }

         tw0_0.rl.hB(this.bV, var5, var6);
      }
   }
}
