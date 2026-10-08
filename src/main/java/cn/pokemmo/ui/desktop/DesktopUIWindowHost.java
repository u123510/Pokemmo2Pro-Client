package cn.pokemmo.ui.desktop;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Function;

public class DesktopUIWindowHost extends C0 {
   public static BU T50;
   public final Qy0 zj;
   public lc_2 iB0;
   public final XH BK;
   public final xe_1 W3;
   public final wg0_0 package$;
   public final qh_1 GQ;
   public int xK = -1;
   public int S30 = -1;
   public fd0_0 le;
   public int pP = -1;
   public int UY = -1;
   public jf_0 nj0;
   public int Su = -1;
   public int FY = -1;
   public jc_2 lB0;
   public int W20 = -1;
   public int Lb = -1;
   public jc_2 Wf;
   public lf0_0 p80;
   public Uo W10;
   public HX Cs0;
   public s90_0 ue0;
   public lr_0 Xf0;
   public b40_0 z10;
   public WG0 Cs;
   public di0_1 vs0;
   public mt_1 vj0;
   public AC q3;
   public vx_1 coM3;
   public At0 ja;
   public ur_2 Mc0;
   public LF0 kx;
   public final xn0_0 cz0;
   public yf0_0 COm6;
   public ab_1 zX;
   public final IA z6;
   public final xg_0 LPT8;
   public qu_2 de0;
   public es_2 Ob;
   public TH jg0;
   public Yl Vi0;
   public kf0_2 yQ;
   public md0_0 iY;
   public QT OJ;
   public zj0_0 pF;
   public OA0 ma0;
   public ig0_2 hM;
   public pe0_2 fE;
   public vl_0 md0;
   public cb0_1 Ld;
   public gc_0 YB0;
   public final gc0_1 AG0;
   public zs_2 Mr;
   public wr0 Y80;
   public Bn0 cOm1 = null;
   public n4_0 ae;
   public VL PF;
   public kt_1 Wi;
   public qv0_0 Bw;
   public xy0_0 Nr;
   public in0_0 x30;
   public Z70 Mn;
   public IZ Af0;
   public VK m2;
   public ic_0 S0;
   public ur_1 K3;
   public final HashMap n4;
   public cn_0 yj0;
   public ae0_1 SP;
   public ng_1 sC0;
   public bs0_0 Iy;
   public ba0_2 F7;
   public ju_2 ix0;
   public final HashMap zi;
   public ek0_0 OB0;
   public rn0_0 B40;
   public tl_2 It;

   public DesktopUIWindowHost(Qy0 var1) {
      HashMap var2;
      var2 = new HashMap();
      this.n4 = var2;
      this.yj0 = null;
      this.SP = null;
      this.sC0 = null;
      this.Iy = null;
      this.F7 = null;
      this.ix0 = null;
      var2 = new HashMap();
      this.zi = var2;
      this.uf("hudgui");
      this.zj = var1;
      lc_2 var9;
      var9 = new lc_2();
      this.iB0 = var9;
      N1 var10;
      var10 = new N1(this, gn_0.WHITE);
      this.LPT8(var10);
      xe_1 var11;
      xe_1 var10000 = var11 = new xe_1();
      this.W3 = var11;
      var10000.uf("chatframe-hidden");
      XH var13;
      var13 = new XH(var11, (BU) this );
      this.BK = var13;
      if (!dw_2.mi && !tw0_0.kz0()) {
         var13.AD(true);
         var11.Ll(false);
      } else {
         var13.AD(false);
         var11.Ll(true);
      }

      var11.RR(new y80_0( (BU) this ));
      wg0_0 var3;
      wg0_0 var14 = var3 = new wg0_0( (BU) this , false);
      this.package$ = var3;
      IA var4;
      IA var10001 = var4 = new IA( (BU) this );
      this.z6 = var4;
      var10001.b2(tw0_0.kz0());
      qh_1 var5;
      var5 = new qh_1();
      this.GQ = var5;
      xn0_0 var6;
      var6 = new xn0_0();
      this.cz0 = var6;
      gc0_1 var7;
      var7 = new gc0_1();
      this.AG0 = var7;
      var14.lt0();
      if (tw0_0.kz0()) {
         var3.sy(tw0_0.LD0.ew0() - var3.R00(), tw0_0.LD0.Hv0() - var3.RR());
      } else {
         var3.sy(tw0_0.LD0.ew0() - var3.R00(), tw0_0.LD0.Hv0() / 2 - var3.RR() / 2);
      }

      xg_0 var8;
      var8 = new xg_0();
      this.LPT8 = var8;
      this.SL(var6);
      this.SL(var3);
      if (tw0_0.H30()) {
         this.SL(var7);
         this.SL(this.iB0);
      }

      this.SL(var8);
      this.SL(var4);
      this.SL(var13);
      this.SL(var11);
      this.SL(var5);
      T50 = (BU) this;
   }

   public static BU lh() {
      return T50;
   }

   public static void YD() {
      tw0_0.rl.fk0.uQ(new sd_2());
   }

   public static void UB() {
      Qy0.yI0.lJ(false, tw0_0.e60.A90(10), -1, -1);
   }

   public final void Ns0(short[] var1, nl0_0 var2, byte var3, VU var4) {
      Bn0 var5 = this.cOm1;
      if (this.cOm1 != null) {
         var5.xe0();
         this.cOm1 = null;
      }

      if (var1 != null) {
         (this.cOm1 = new Bn0((BU) this, var2, var3, var4, var1)).g2(640, 480);
         this.cOm1.oY(640, 480);
         Bn0 var10002 = this.cOm1;
         int var6 = super.A20 + super.e80;
         int var10003 = kq_0.lpT2(this.a3(), this.cOm1.Mx, 2, var6);
         int var7 = super.SB0 + super.y9;
         var10002.E40(var10003, kq_0.lpT2(this.k5(), this.cOm1.OB, 2, var7));
         this.SL(this.cOm1);
      }
   }

   public final void Y5(vo_2 var1, boolean var2) {
      if (this.OJ != null) {
         tw0_0.RE0.Hq0((byte)2, (short)1373);
         if (var1 != null) {
            var1.Lo0(false);
         }

         this.OJ.xe0();
         this.OJ.Cp0();
         this.OJ = null;
         this.package$.AD(true);
         this.package$.GA0();
      } else if (tw0_0.rl != null) {
         if (var2) {
            tw0_0.RE0.Hq0((byte)2, (short)1371);
            var1.Lo0(true);
            (this.OJ = new QT(tw0_0.rl.y8)).lt0();
            this.OJ.E40(tw0_0.LD0.ew0() / 2 - this.OJ.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.OJ.OB / 2);
            this.SL(this.OJ);
            this.package$.AD(false);
         }
      }
   }

   public final void NK(Dm0 var1) {
      gc_0 var2 = this.YB0;
      if (this.YB0 != null) {
         var2.xe0();
         this.YB0 = null;
      } else {
         if (var1 != null) {
            gc_0 var10004 = var2 = new gc_0(var1);
            this.YB0 = var10004;
            this.SL(var2);
            this.YB0.lt0();
            this.YB0.E40(tw0_0.LD0.ew0() / 2 - this.YB0.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.YB0.OB / 2);
         }
      }
   }

   public final void MJ(CH0 var1, Duration var2, Duration var3) {
      if (!super.eE) {
         this.Ll(true);
      }

      AC var4;
      AC var10003 = var4 = new AC(var1, var2, var3);
      this.q3 = var10003;
      this.SL(var4);
      AC var5;
      (var5 = this.q3).getClass();
      if (tw0_0.kz0()) {
         var5.OU.BL();
      } else if (!var5.OU.Of()) {
         lpt6__0.v90(var5.OU);
      }
   }

   public final void UB0(i4_0 var1, byte var2) {
      if (!super.eE) {
         this.Ll(true);
      }

      Texture var3;
      var3 = new Texture(var1);
      var1.dispose();
      mt_1 var7 = this.vj0;
      if (this.vj0 != null) {
         Texture var6 = var7.Y5;
         if (var7.Y5 != null) {
            var6.dispose();
         }

         var7.Y5 = var3;
         var7.lB.Sk(sm0_0.wa0(70, var2 + ""));
         var7.wu0.og.LX(var3);
         var7.bH.SU(sm0_0.c0(69));
         var7.bH.pw0(true);
         var7.yr.Gv("");
         var7.yr.pw0(true);
         var7.yr.f00();
         lpt6__0.v90(var7.yr);
         var7.wC = System.currentTimeMillis();
         var7.jA0 = 45000L;
      } else {
         mt_1 var4;
         mt_1 var10003 = var4 = new mt_1(var3, var2);
         this.vj0 = var10003;
         this.SL(var4);
         mt_1 var5;
         (var5 = this.vj0).getClass();
         if (tw0_0.kz0()) {
            var5.yr.BL();
         } else if (!var5.yr.Of()) {
            lpt6__0.v90(var5.yr);
         }
      }
   }

   public final void BS(
      byte var1, String var2, int var3, int var4, int var5, byte var6, Cq var7, boolean var8, boolean var9, boolean var10, byte var11, byte var12, lq0[] var13
   ) {
      if (this.ma0 != null) {
         tw0_0.rl.ze0(var1, FD.eq0.Zz0);
      } else {
         er0_0 var14;
         var14 = new er0_0(
            (BU) this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13
         );
         this.ma0 = var14;
         this.SL(var14);
      }
   }

   public final void lI0() {
      Yl var1 = this.Vi0;
      if (this.Vi0 != null) {
         if (!var1.sE) {
            tw0_0.rl.qK(sm0_0.c0(5523));
         }

         lpt6__0.v90(this.Vi0);
      } else {
         boolean var2 = true;
         tw0_0.rl.fk0.uQ(new b4_0(var2));
      }
   }

   public final void wq0() {
      Yl var1 = this.Vi0;
      if (this.Vi0 != null) {
         if (var1.sE) {
            tw0_0.rl.qK(sm0_0.c0(5523));
         }

         lpt6__0.v90(this.Vi0);
      } else {
         boolean var2 = false;
         tw0_0.rl.fk0.uQ(new b4_0(var2));
      }
   }

   public final void rH0() {
      YP var1;
      if ((var1 = (YP)jq0_0.tK0(this, YP.class)) != null) {
         lpt6__0.v90(var1);
      } else {
         yt_1 var3 = tw0_0.e60;
         if (tw0_0.e60 != null && var3.N60() != null && tw0_0.e60.N60().A30 >= 0) {
            YP var2;
            var2 = new YP();
            this.SL(var2);
         } else {
            tw0_0.rl.qK(sm0_0.c0(6002));
         }
      }
   }

   public final void V80() {
      XH var1 = this.BK;
      this.BK.getClass();
      if (!tw0_0.kz0()) {
         var1.Lj0 = false;
         int var2 = tw0_0.LD0.Hv0() - var1.OB + dw_2.W6;
         var1.gC0(dw_2.BY, dw_2.Qy0);
         var1.E40(dw_2.nE0, var2);
         var1.Lj0 = true;
      }

      this.z6.TT();
      this.GQ.xI();
      if (tw0_0.kz0()) {
         if (dw_2.Lm) {
            this.package$.vf(pa0_0.rr0);
         } else {
            this.package$.vf(pa0_0.Ht0);
         }
      } else {
         this.package$.E40(tw0_0.LD0.ew0() - this.package$.Mx, tw0_0.LD0.Hv0() / 2 - this.package$.OB / 2);
      }

      this.BK.Nd0(dw_2.WY);
      this.iB0.COm3();
   }

   public final void yn(int var1, CH0 var2, boolean var3, boolean var4, boolean var5) {
      if (super.r90 != 0) {
         final int fVar1 = var1;
         final CH0 fVar2 = var2;
         final boolean fVar3 = var3;
         final boolean fVar4 = var4;
         final boolean fVar5 = var5;
         lg_0.k.lPT5(() -> this.yn(fVar1, fVar2, fVar3, fVar4, fVar5));
      } else {
         Uo var6 = this.W10;
         if (this.W10 != null) {
            var6.xe0();
            this.W10 = null;
         }

         (this.W10 = new Uo((BU) this, var1, var2, var3, var4, var5)).Ll(true);
         this.W10.lt0();
         Uo var10002 = this.W10;
         var1 = super.A20 + super.e80;
         int var10003 = kq_0.lpT2(this.a3(), this.W10.Mx, 2, var1);
         var1 = super.SB0 + super.y9;
         var10002.E40(var10003, kq_0.lpT2(this.k5(), this.W10.OB, 2, var1));
         this.SL(this.W10);
      }
   }

   public final void ig() {
      if (this.W10 != null) {
         pro.pokemmo2.shop.service.ShopClient.onNativeShopCloseRequested(this.W10);
         if (tw0_0.kz0()) {
            tw0_0.LD0.Sc.KU(true, CH0.j1);
         }

         Uo var1 = this.W10;
         if (this.W10.PO != 0 && var1.GT.uI0()) {
            pk0_0 var5 = tw0_0.FL;
            int var2;
            int var10000 = var2 = this.W10.PO;
            iz0_0[] var3 = new iz0_0[0];
            String var7;
            if (var10000 == 0) {
               var7 = "";
            } else {
               var7 = g6_0.dG(var2, var3);
            }

            jm_1 var6 = jm_1.hK;
            CH0 var8 = this.W10.GT;
            Object var4 = null;
            var5.getClass();
            var5.iQ(new kt_0(var7, var6, var8, (S0)var4));
         }

         this.W10.xe0();
         this.W10 = null;
      }
   }

   public final void We(boolean var1) {
      s90_0 var2 = this.ue0;
      if (this.ue0 != null) {
         var2.xe0();
         this.ue0 = null;
      } else if (var1) {
         (this.ue0 = new s90_0((BU) this)).oY(640, 480);
         this.ue0.E40(tw0_0.LD0.ew0() / 2 - this.ue0.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.ue0.OB / 2);
         this.SL(this.ue0);
      }
   }

   public final void G20(boolean var1, ur_0 var2) {
      pe0_2 var3 = this.fE;
      if (this.fE != null) {
         var3.xe0();
         this.fE = null;
         Ge0.Vv0 = 0;
         com6__1.WI0.cI0((short)0, (short)0);
      }

      if (var1) {
         (this.fE = new pe0_2(var2)).RY(285, 50);
         this.fE.oY(285, 50);
         this.fE.E40(60, tw0_0.LD0.Hv0() / 3 - this.fE.OB / 2);
         this.SL(this.fE);
         lpt6__0.v90(this.fE);
      }
   }

   public final void se(boolean var1, byte var2, boolean var3, String[] var4, CH0[] var5) {
      ig0_2 var6 = this.hM;
      if (this.hM != null) {
         var6.xe0();
         this.hM = null;
      }

      if (var1) {
         (this.hM = new ig0_2(var2, var3, var4, var5)).RY(285, 50);
         this.hM.oY(285, 50);
         this.hM.E40(60, tw0_0.LD0.Hv0() / 3 - this.hM.OB / 2);
         this.SL(this.hM);
      }
   }

   public final void vC(boolean var1) {
      zj0_0 var2 = this.pF;
      if (this.pF != null) {
         var2.xe0();
         this.pF = null;
      }

      if (var1) {
         (this.pF = new zj0_0()).RY(210, 50);
         this.pF.oY(210, 50);
         this.pF.E40(tw0_0.LD0.ew0() / 2 - this.pF.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.pF.OB / 2);
         this.SL(this.pF);
      }
   }

   public final void lo(boolean var1) {
      es_2 var2 = this.Ob;
      if (this.Ob != null) {
         var2.xe0();
         this.Ob = null;
      }

      if (var1) {
         (this.Ob = new es_2()).E40(tw0_0.LD0.ew0() / 2 - this.Ob.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.Ob.OB / 2);
         this.SL(this.Ob);
      }
   }

   public final void hc0(boolean var1) {
      ab_1 var2 = this.zX;
      if (this.zX != null) {
         var2.xe0();
         this.zX = null;
      } else {
         At0 var4 = this.ja;
         if (this.ja != null) {
            var4.xe0();
            this.ja = null;
         } else if (var1) {
            if (tw0_0.rl.xI0 == null) {
               if (var4 != null) {
                  var4.xe0();
               }

               At0 var3;
               var3 = new At0();
               this.ja = var3;
               this.SL(var3);
            } else {
               (this.zX = new ab_1((BU) this)).g2(485, 300);
               this.zX.oY(485, 300);
               this.zX.E40(tw0_0.LD0.ew0() / 2 - this.zX.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.zX.OB / 2);
               this.SL(this.zX);
            }
         }
      }
   }

   public final void aUX() {
      md0_0 var1 = this.iY;
      if (this.iY != null) {
         var1.xe0();
         this.iY = null;
      }
   }

   public final void cx(boolean var1) {
      LF0 var2 = this.kx;
      if (this.kx != null) {
         var2.xe0();
         this.kx = null;
      } else if (var1) {
         LF0 var3;
         var3 = new LF0((BU) this);
         this.kx = var3;
         this.SL(var3);
      }
   }

   public final void Dj0() {
      jf_0 var1 = this.nj0;
      if (this.nj0 != null) {
         this.Su = var1.A20;
         this.FY = var1.SB0;
         var1.xe0();
         this.nj0 = null;
      } else {
         label19: {
            (this.nj0 = new jf_0((BU) this)).g2(480, 300);
            this.nj0.oY(480, 300);
            int var2 = this.Su;
            if (this.Su > 0 && this.FY > 0 && var2 <= tw0_0.LD0.ew0() - this.nj0.Mx) {
               int var10000 = this.FY;
               int var10001 = tw0_0.LD0.Hv0();
               var1 = this.nj0;
               if (var10000 <= var10001 - this.nj0.OB) {
                  int var4 = this.Su;
                  var1.E40(var4, this.FY);
                  break label19;
               }
            }

            this.nj0.E40(tw0_0.LD0.ew0() / 2 - this.nj0.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.nj0.OB / 2);
         }

         this.SL(this.nj0);
      }
   }

   public final void jw0() {
      vl_0 var1 = this.md0;
      if (this.md0 != null) {
         var1.xe0();
         this.md0 = null;
      } else {
         (this.md0 = new vl_0((BU) this)).g2(470, 320);
         this.md0.oY(470, 320);
         this.md0.E40(tw0_0.LD0.ew0() / 2 - this.md0.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.md0.OB / 2);
         this.SL(this.md0);
      }
   }

   public final void Cn0() {
      wr0 var1 = this.Y80;
      if (this.Y80 != null) {
         var1.xe0();
         this.Y80 = null;
      } else {
         var1 = new wr0((BU) this);
         this.Y80 = var1;
         this.SL(var1);
      }
   }

   public final void PRn(CH0 var1) {
      ng_2 var2;
      if ((var2 = (ng_2)this.n4.get(var1)) != null) {
         this.xK = var2.A20;
         this.S30 = var2.SB0;
         this.n4.remove(var1);
         var2.xe0();
      }
   }

   public final void se0() {
      jc_2 var1 = this.lB0;
      if (this.lB0 != null) {
         this.W20 = var1.A20;
         this.Lb = var1.SB0;
         var1.xe0();
         this.lB0 = null;
         Qy0.yI0.zm0();
      }
   }

   public final void Zl0() {
      jc_2 var1 = this.lB0;
      if (this.lB0 != null) {
         this.W20 = var1.A20;
         this.Lb = var1.SB0;
         var1.xe0();
         this.lB0 = null;
      } else {
         label19: {
            (this.lB0 = new jc_2((BU) this, false)).RY(350, 200);
            this.lB0.oY(350, 200);
            int var2 = this.W20;
            if (this.W20 > 0 && this.Lb > 0 && var2 <= tw0_0.LD0.ew0() - this.lB0.Mx) {
               int var10000 = this.Lb;
               int var10001 = tw0_0.LD0.Hv0();
               var1 = this.lB0;
               if (var10000 <= var10001 - this.lB0.OB) {
                  int var4 = this.W20;
                  var1.E40(var4, this.Lb);
                  break label19;
               }
            }

            this.lB0.E40(tw0_0.LD0.ew0() / 2 - this.lB0.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.lB0.OB / 2);
         }

         this.SL(this.lB0);
      }
   }

   public final void gI() {
      vx_1 var1 = this.coM3;
      if (this.coM3 != null) {
         var1.xe0();
         this.coM3 = null;
      } else {
         vx_1 var10004 = var1 = new vx_1((BU) this);
         this.coM3 = var10004;
         this.SL(var1);
         this.coM3.lt0();
         this.coM3.vf(pa0_0.Ol);
      }
   }

   public final void X10(
      byte var1, String var2, int var3, int var4, int var5, byte var6, Cq var7, boolean var8, boolean var9, boolean var10, byte var11, byte var12, lq0[] var13
   ) {
      lg_0.k.lPT5(() -> this.BS(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13));
   }

   public final void lI(i4_0 var1, byte var2) {
      lg_0.k.lPT5(() -> this.UB0(var1, var2));
   }

   public final void WZ(CH0 var1, Duration var2, Duration var3) {
      lg_0.k.lPT5(() -> this.MJ(var1, var2, var3));
   }

   public final void m80() {
      lg_0.k.lPT5(() -> {
         mt_1 var1 = this.vj0;
         if (this.vj0 != null) {
            var1.xe0();
            this.vj0 = null;
         }

         AC var2 = this.q3;
         if (this.q3 != null) {
            var2.xe0();
            this.q3 = null;
         }
      });
   }

   public final void GF0(Dm0 var1) {
      lg_0.k.lPT5(() -> this.NK(var1));
   }

   public final void Nc0(boolean var1) {
      vo_2 var2 = tw0_0.LD0.Sc;
      lg_0.k.lPT5(() -> this.Y5(var2, var1));
   }

   public final QT Qf() {
      return this.OJ;
   }

   public final void LV() {
      fd0_0 var1 = this.le;
      if (this.le != null) {
         this.pP = var1.A20;
         this.UY = var1.SB0;
         var1.xe0();
         this.le = null;
      }
   }

   public final void QS() {
      fd0_0 var1 = this.le;
      if (this.le != null) {
         this.pP = var1.A20;
         this.UY = var1.SB0;
         var1.xe0();
         this.le = null;
      } else {
         BR var3 = tw0_0.rl;
         if (tw0_0.rl != null) {
            ap_0 var4;
            if ((var4 = var3.tp0) != null) {
               label24: {
                  fd0_0 var2;
                  fd0_0 var10000 = var2 = new fd0_0((BU) this, var4);
                  this.le = var2;
                  var10000.g2(600, 400);
                  this.le.oY(600, 400);
                  if (this.pP > 0 && this.UY > 0 && this.xK <= tw0_0.LD0.ew0() - this.le.Mx) {
                     int var6 = this.UY;
                     int var10001 = tw0_0.LD0.Hv0();
                     var1 = this.le;
                     if (var6 <= var10001 - this.le.OB) {
                        var1.E40(this.pP, this.UY);
                        break label24;
                     }
                  }

                  this.le.E40(tw0_0.LD0.ew0() / 2 - this.le.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.le.OB / 2);
               }

               this.SL(this.le);
               lpt6__0.v90(this.le);
            }
         }
      }
   }

   public final void U0(boolean var1) {
      ur_2 var2 = this.Mc0;
      if (this.Mc0 != null) {
         var2.xe0();
         this.Mc0 = null;
      }

      if (var1) {
         ur_2 var3;
         ur_2 var10004 = var3 = new ur_2((BU) this);
         this.Mc0 = var10004;
         this.SL(var3);
         this.Mc0.lt0();
         this.Mc0.E40(tw0_0.LD0.ew0() / 2 - this.Mc0.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.Mc0.OB / 2);
      }
   }

   public final void jl0() {
      boolean var1;
      if (this.Ld == null) {
         var1 = true;
      } else {
         var1 = false;
      }

      this.qD0(var1);
   }

   public final void qD0(boolean var1) {
      cb0_1 var2 = this.Ld;
      if (this.Ld != null) {
         var2.xe0();
         this.Ld = null;
      }

      if (var1) {
         cb0_1 var3;
         cb0_1 var10004 = var3 = new cb0_1((BU) this);
         this.Ld = var10004;
         this.SL(var3);
         this.Ld.lt0();
         this.Ld.E40(tw0_0.LD0.ew0() / 2 - this.Ld.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.Ld.OB / 2);
      }
   }

   public final void Is0() {
      WG0 var1 = this.Cs;
      if (this.Cs != null) {
         var1.xe0();
         this.Cs = null;
      }
   }

   public final void XV() {
      b40_0 var1 = this.z10;
      if (this.z10 != null) {
         var1.xe0();
         this.z10 = null;
      }
   }

   @Override
   public final boolean u3(le0_2 var1) {
      if (var1 == this.ma0) {
         this.ma0 = null;
      } else if (var1 == this.vj0) {
         this.vj0 = null;
      }

      IA var2 = this.z6;
      if (this.z6 != null && this.lB0 == var1 && !tw0_0.kz0()) {
         String var3 = "hotkeybar";
         if (!"hotkeybar".equals(var2.gW)) {
            var2.uf(var3);
            var2.yI();
         }
      }

      return super.u3(var1);
   }

   public final IA cE0() {
      return this.z6;
   }

   public final void Yf(String var1) {
      if ((nq_1)this.zi.get(var1) == null) {
         nq_1 var2;
         nq_1 var10001 = var2 = new nq_1(var1);
         this.SL(var2);
         var10001.lt0();
         var10001.E40(tw0_0.LD0.ew0() / 2 - var2.Mx / 2, tw0_0.LD0.Hv0() / 2 - var2.OB / 2);
         lpt6__0.v90(var10001.hx0);
         this.zi.put(var1, var2);
      }
   }

   public final void gZ() {
      xy0_0 var1 = this.Nr;
      if (this.Nr != null) {
         var1.xe0();
         this.Nr = null;
      }
   }

   public final void g2() {
      ic_0 var1 = this.S0;
      if (this.S0 != null) {
         var1.xe0();
         this.S0 = null;
      }
   }

   public final void throw$(vy_2 var1, CH0 var2, VU var3, byte var4) {
      VK var5 = this.m2;
      if (this.m2 != null) {
         var5.xe0();
         this.m2 = null;
      }

      VK var10001 = var5 = new VK(var1, var2, var3, var4);
      this.m2 = var10001;
      if (!var5.jH0) {
         var5.xe0();
         this.m2 = null;
      } else {
         this.SL(var5);
         this.m2.lt0();
         this.m2.E40(tw0_0.LD0.ew0() / 2 - this.m2.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.m2.OB / 2);
      }
   }

   @Override
   public final void SL(le0_2 var1) {
      XH var2 = this.BK;
      o20_0 var5;
      boolean var6;
      if (this.BK != null && (var5 = var2.b5) != null && var5.Of()) {
         var6 = true;
      } else {
         var6 = false;
      }

      this.F9(this.fU(), var1);
      IA var3 = this.z6;
      if (this.z6 != null) {
         if (this.lB0 == var1 && !tw0_0.kz0()) {
            String var4 = "hotkeybar-frame-visible";
            if (!"hotkeybar-frame-visible".equals(var3.gW)) {
               var3.uf(var4);
               var3.yI();
            }
         }

         if (var6) {
            lpt6__0.v90(this.BK.b5);
         } else {
            this.Qw0(var1);
         }
      }
   }

   @Override
   public final void HP(zk0_1 var1) {
      if (tw0_0.kz0()) {
         boolean var2 = this.zj.y4();
         boolean var3;
         if (this.zj.ZW != null) {
            var3 = true;
         } else {
            var3 = false;
         }

         wg0_0 var4 = this.package$;
         boolean var5;
         if (!var2 && !var3) {
            var5 = true;
         } else {
            var5 = false;
         }

         var4.AD(var5);
         IA var37 = this.z6;
         if (!var2 && !var3) {
            var5 = true;
         } else {
            var5 = false;
         }

         var37.AD(var5);
         this.W3.Ll(var2 ^ true);
         xg_0 var38 = this.LPT8;
         if (!var2 && !var3) {
            var5 = true;
         } else {
            var5 = false;
         }

         var38.Ll(var5);
         qh_1 var39 = this.GQ;
         if (!var2 && !var3) {
            var3 = true;
         } else {
            var3 = false;
         }

         var39.AD(var3);
         if (var2) {
            this.cz0.Ll(false);
         } else if (tw0_0.Eu(1)) {
            this.cz0.lPt6();
         }
      } else {
         xn0_0 var6 = this.cz0;
         if (this.cz0 != null) {
            var6.lPt6();
         }
      }

      BR var7 = tw0_0.rl;
      Fd0 var8;
      if (tw0_0.rl == null) {
         var8 = null;
      } else {
         var8 = var7.Ob0();
      }

      label194: {
         if (var8 != null) {
            byte var28 = var8.o4;
            if (var8.o4 != 3) {
               if (tw0_0.PK0 == null) {
                  if (var28 == 0) {
                     if (this.sC0 == null) {
                        ng_1 var16;
                        var16 = new ng_1();
                        this.sC0 = var16;
                        this.SL(var16);
                        this.sC0.lt0();
                     }

                     yt_1 var17 = tw0_0.e60;
                     if (tw0_0.e60 != null) {
                        this.sC0.AK0(var17.Com4);
                     }

                     if (tw0_0.kz0()) {
                        this.sC0.A20(pa0_0.Mk, -135, 5);
                     } else {
                        this.sC0.A20(pa0_0.Mk, -15, 30);
                     }

                     if (this.Iy == null) {
                        lk_1 var18;
                        var18 = new lk_1();
                        this.Iy = var18;
                        this.SL(var18);
                        this.Iy.lt0();
                     }

                     this.Iy.X30(this.sC0.SX.Mx);
                     ng_1 var19 = this.sC0;
                     int var20;
                     if (this.sC0.eE) {
                        var20 = var19.OB + 10;
                     } else {
                        var20 = 0;
                     }

                     if (tw0_0.kz0()) {
                        this.Iy.A20(pa0_0.Mk, -135, var20 + 5);
                     } else {
                        this.Iy.A20(pa0_0.Mk, -15, var20 + 30);
                     }
                  } else {
                     if (this.SP == null) {
                        ae0_1 var34;
                        var34 = new ae0_1();
                        this.SP = var34;
                        cn_0 var35;
                        var35 = new cn_0(null, 0);
                        this.yj0 = var35;
                        this.SL(this.SP);
                        this.SL(this.yj0);
                     }

                     ae0_1 var36 = this.SP;
                     String var41;
                     if (var8.o4 == 0) {
                        var41 = "event-progressbar-halloween";
                     } else {
                        var41 = "event-progressbar";
                     }

                     if (!var41.equals(var36.gW)) {
                        var36.uf(var41);
                        var36.yI();
                     }

                     this.SP.Ll(true);
                     this.yj0.Ll(true);
                     this.yj0.Sk(var8.EU);
                     this.yj0.lt0();
                     this.SP.aE(var8.O50 / 100.0F);
                     this.yj0.qF0(pa0_0.Ol);
                     this.yj0.oY(this.yj0.hr0(), this.yj0.Ob());
                     this.SP.oY(this.yj0.Mx, 8);
                     cn_0 var22;
                     ae0_1 var44;
                     pa0_0 var10001;
                     short var10002;
                     int var10003;
                     if (tw0_0.kz0()) {
                        pa0_0 var21 = pa0_0.Mk;
                        this.yj0.A20(pa0_0.Mk, -150, 20);
                        var44 = this.SP;
                        var10001 = var21;
                        var10002 = -150;
                        var22 = this.yj0;
                        var10003 = this.yj0.SB0;
                     } else {
                        pa0_0 var23 = pa0_0.Mk;
                        this.yj0.A20(pa0_0.Mk, -15, 30);
                        var44 = this.SP;
                        var10001 = var23;
                        var10002 = -15;
                        var22 = this.yj0;
                        var10003 = this.yj0.SB0;
                     }

                     var44.A20(var10001, var10002, var10003 + var22.OB + 10);
                  }
               } else {
                  ng_1 var24 = this.sC0;
                  if (this.sC0 != null) {
                     var24.Ll(false);
                  }

                  bs0_0 var25 = this.Iy;
                  if (this.Iy != null) {
                     var25.Ll(false);
                  }

                  ae0_1 var26 = this.SP;
                  if (this.SP != null) {
                     var26.Ll(false);
                     this.yj0.Ll(false);
                  }
               }
               break label194;
            }
         }

         ng_1 var29 = this.sC0;
         if (this.sC0 != null) {
            var29.xe0();
            this.sC0 = null;
         }

         label160: {
            label159: {
               label198: {
                  BR var30 = tw0_0.rl;
                  if (tw0_0.rl != null) {
                     cq0_0 var31;
                     cq0_0 var10000 = var31 = var30.oY;
                     short var40 = 1044;
                     var31.getClass();
                     cq0_0.w0((short)1044);
                     if (var10000.lY.jA0(var40) > 0) {
                        tu_0 var32 = tu_0.os;
                        if (((jx_2)com9__2.Om.go.get(var32)).Be()) {
                           if (this.Iy == null) {
                              zs0_0 var14;
                              var14 = new zs0_0();
                              this.Iy = var14;
                              this.SL(var14);
                              this.Iy.lt0();
                           }

                           this.Iy.X30(0);
                           if (tw0_0.kz0()) {
                              break label159;
                           }
                           break label198;
                        }
                     }
                  }

                  if (tw0_0.rl != null) {
                     tu_0 var33 = tu_0.I9;
                     if (((jx_2)com9__2.Om.go.get(var33)).Be()) {
                        if (var8 != null && var8.o4 == 3) {
                           bs0_0 var12 = this.Iy;
                           if (this.Iy instanceof rc0_1) {
                              var12.xe0();
                              this.Iy = null;
                           }

                           if (this.Iy == null) {
                              bb_0 var13;
                              var13 = new bb_0();
                              this.Iy = var13;
                              this.SL(var13);
                              this.Iy.lt0();
                           }
                        } else {
                           bs0_0 var10 = this.Iy;
                           if (this.Iy instanceof bb_0) {
                              var10.xe0();
                              this.Iy = null;
                           }

                           if (this.Iy == null) {
                              rc0_1 var11;
                              var11 = new rc0_1((Function<Short, Short>)(x -> Short.valueOf(jt_0.AH0(x.shortValue()))));
                              this.Iy = var11;
                              this.SL(var11);
                              this.Iy.lt0();
                           }
                        }

                        this.Iy.X30(0);
                        if (tw0_0.kz0()) {
                           break label159;
                        }
                        break label198;
                     }
                  }

                  bs0_0 var9 = this.Iy;
                  if (this.Iy != null) {
                     var9.xe0();
                     this.Iy = null;
                  }
                  break label160;
               }

               this.Iy.A20(pa0_0.Mk, -15, 30);
               break label160;
            }

            this.Iy.A20(pa0_0.Mk, -135, 5);
         }

         ae0_1 var15 = this.SP;
         if (this.SP != null) {
            var15.xe0();
            this.yj0.xe0();
            this.yj0 = null;
            this.SP = null;
         }
      }

      super.HP(var1);
   }

   @Override
   public final void K8() {
      lc_2 var1 = this.iB0;
      int var5;
      if (this.iB0.K20 != null && var1.eE) {
         var5 = -var1.OB;
      } else {
         var5 = 0;
      }

      byte var2;
      if (tw0_0.kz0()) {
         var2 = -96;
      } else {
         var2 = 4;
      }

      Iterator var3 = this.zi.values().iterator();

      while (var3.hasNext()) {
         nx_2 var4;
         if ((var4 = (nx_2)var3.next()).Hn0.eE && var4.eE) {
            var4.A20(pa0_0.Ht0, var2, var5);
            var5 -= var4.k5();
         }
      }

      ba0_2 var12 = this.F7;
      if (this.F7 != null && var12.eE) {
         var12.A20(pa0_0.Ht0, var2, var5);
         var5 -= var12.k5();
      }

      Yl var13 = this.Vi0;
      if (this.Vi0 != null && var13.eE && var13.Hn0.eE) {
         var13.A20(pa0_0.Ht0, var2, var5);
         var5 -= var13.k5();
      }

      ju_2 var14 = this.ix0;
      if (this.ix0 != null && var14.eE && var14.Hn0.eE) {
         var14.A20(pa0_0.Ht0, var2, var5);
         var14.k5();
      }

      xn0_0 var6 = this.cz0;
      if (this.cz0 != null) {
         var6.lt0();
         this.cz0.E40(0, 0);
      }

      gc0_1 var7 = this.AG0;
      if (this.AG0 != null) {
         var7.lt0();
         this.AG0.E40(0, 0);
      }

      ng_1 var8 = this.sC0;
      if (this.sC0 != null) {
         var8.lt0();
      }

      bs0_0 var9 = this.Iy;
      if (this.Iy != null) {
         var9.lt0();
      }

      this.W3.lt0();
      xe_1 var10 = this.W3;
      pa0_0 var11;
      if (tw0_0.kz0()) {
         var11 = pa0_0.qQ;
      } else {
         var11 = pa0_0.rr0;
      }

      var10.vf(var11);
      this.z6.lt0();
      this.GQ.lt0();
   }

   public final void RG0(VU var1, boolean var2, boolean var3) {
      qu_2 var4 = this.de0;
      if (this.de0 != null) {
         var4.xe0();
         this.de0 = null;
      }

      if (var2) {
         (this.de0 = new qu_2(var3, var1)).g2(440, 500);
         this.de0.oY(440, 500);
         QT var5 = this.OJ;
         if (this.OJ != null && this.de0.Mx + var5.Mx + 10 < tw0_0.LD0.ew0()) {
            var5.A20(pa0_0.Ol, -this.de0.Mx / 2, 0);
            int var6 = var5.A20 + var5.Mx + 5;
            T50.de0.E40(var6, var5.SB0);
         } else {
            this.de0.vf(pa0_0.Ol);
         }

         this.SL(this.de0);
      }
   }

   public final void U1(VU var1, boolean var2, boolean var3) {
      lr_0 var4 = this.Xf0;
      if (this.Xf0 != null) {
         var4.xe0();
         this.Xf0 = null;
      }

      if (var2) {
         if (this.OJ != null) {
            var3 = true;
         }

         lr_0 var5;
         lr_0 var10003 = var5 = new lr_0(var1, var3);
         this.Xf0 = var10003;
         this.SL(var5);
         lpt6__0.v90(this.Xf0);
      }
   }

   public final void MJ(short[] var1, nl0_0 var2, byte var3, VU var4) {
      lg_0.k.lPT5(() -> this.Ns0(var1, var2, var3, var4));
   }

   public final Vt0 LPT1() {
      Vt0 var1;
      Vt0 var10000 = var1 = new Vt0(sm0_0.c0(1126));
      String var2 = sm0_0.c0(1649);
      var1.mA0(var2, () -> this.jw0());
      String var3 = sm0_0.c0(1120);
      var1.mA0(var3, () -> this.hc0(true));
      String var4 = sm0_0.c0(1113);
      var10000.mA0(var4, this::rH0);
      var10000.mA0(sm0_0.c0(1121), BU::UB);
      Qy0.yI0.getClass();
      Vt0 var5 = Qy0.of();
      var10000.hx.add(var5);
      return var10000;
   }

   public final Vt0 me() {
      Vt0 var1;
      Vt0 var10000 = var1 = new Vt0(sm0_0.c0(1126));
      String var2 = sm0_0.c0(5500);
      var1.mA0(var2, this::wq0);
      String var3 = sm0_0.c0(9150);
      var1.mA0(var3, this::lI0);
      String var4 = sm0_0.c0(1128);
      var10000.mA0(var4, this::jl0);
      var10000.mA0(sm0_0.c0(5670), BU::YD);
      return var10000;
   }

   public final void Iz(boolean var1, tl0_0 var2) {
      lf0_0 var3 = this.p80;
      if (this.p80 != null) {
         Runnable var5 = var3.Yy0;
         if (var3.Yy0 != null) {
            var5.run();
         }

         this.p80.xe0();
         this.p80 = null;
      } else if (var1) {
         lf0_0 var4;
         var4 = new lf0_0((BU) this, var2);
         this.p80 = var4;
         this.SL(var4);
      }
   }

   public final ng_2 FI(VU var1, le0_2 var2, qo_1 var3, boolean var4) {
      if (var1 == null) {
         return null;
      }

      ng_2 var5;
      if ((var5 = (ng_2)this.n4.get(var1.pu)) != null) {
         lpt6__0.v90(var5);
         return var5;
      }

      if (!this.n4.isEmpty()) {
         int var9 = this.xK;
         if (this.xK > 0) {
            int var6 = this.S30;
            if (this.S30 > 0) {
               this.S30 = var6 + 48;
               this.xK = var9 + 28;
            }
         }
      }

      ng_2 var10001 = var5 = new ng_2((BU) this, var1, var3, true, var4);
      var10001.Pb0 = var2;
      int var7 = this.xK;
      if (this.xK > 0 && this.S30 > 0 && var7 <= tw0_0.LD0.ew0() - var5.Mx && this.S30 <= tw0_0.LD0.Hv0() - var5.OB) {
         int var8 = this.xK;
         var5.E40(var8, this.S30);
      } else {
         var5.E40(tw0_0.LD0.ew0() / 2 - var5.Mx / 2, tw0_0.LD0.Hv0() / 2 - var5.OB / 2);
      }

      this.xK = var5.A20;
      this.S30 = var5.SB0;
      this.n4.put(var1.pu, var5);
      this.SL(var5);
      return var5;
   }
}