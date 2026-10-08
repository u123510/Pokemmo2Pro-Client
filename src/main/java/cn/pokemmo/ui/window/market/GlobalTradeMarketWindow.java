package cn.pokemmo.ui.window.market;

import f.*;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;

/**
 * 全球交易行主大厅/拍卖购买窗口
 *
 * 原混淆类: f.lr_0
 */
public class GlobalTradeMarketWindow extends cx_0 implements tr_1  {
    public final lr_0 asBridge() {
        return (lr_0) (Object) this;
    }

   public static final SimpleDateFormat Hc0 = new SimpleDateFormat("dd MMM hh:mm:ss a");
   public final boolean yw0;
   public final P8 hq;
   public final byte[] COm6;
   public og0_0 Yu;
   public tk0_0 He0;
   public Aj HO;
   public VL0 CoM3;
   public u70_0 uX;
   public uc0_0 nA0;
   public cg_0 Kg;
   public cg_0 super$;
   public xe_1 EQ;
   public int on0 = 0;
   public final EG0[] MU;
   public le0_2 Qy0;
   public K90[] ej0 = new K90[0];
   public qd_0 vb0;
   public m0_0 vw = null;
   public boolean iW = false;

   public static void qb0(K90 var0) {
      BR var2 = tw0_0.rl;
      CH0 var1 = var0.RR;
      var2.fk0.uQ(new l0_0(var1));
   }

   public static void WB0(K90 var0) {
      BR var2 = tw0_0.rl;
      CH0 var1 = var0.RR;
      byte var3 = 1;
      var2.fk0.uQ(new vc_1(var1, var3));
   }

   public static void Ly0(K90 var0) {
      BR var2 = tw0_0.rl;
      CH0 var1 = var0.RR;
      byte var3 = 1;
      var2.fk0.uQ(new vc_1(var1, var3));
   }

   public static void BX(EG0 var0) {
      byte var1;
      if (var0.fq() == 0) {
         var1 = 1;
      } else {
         var1 = 0;
      }

      var0.dm0.Bd(var1);
   }

   public static void o60(EG0 var0) {
      byte var1;
      if (var0.fq() == 2) {
         var1 = 3;
      } else {
         var1 = 2;
      }

      var0.dm0.Bd(var1);
   }

   public static void lw0(K90 var0, mc0_1 var1) {
      GlobalTradeMarketWindow var2 = BU.T50.Xf0;
      GlobalTradeMarketWindow var10000 = var2;
      i1_0 var3;
      var3 = new i1_0(var0, var1, var0.i90);
      le0_2 var4;
      GlobalTradeMarketWindow var10001;
      if ((var4 = var10000.Qy0) == null) {
         var10000 = var2;
         var10001 = var2;
         var2.Qy0 = var3;
      } else {
         var10000 = var2;
         var10001 = var2;
         var4.xe0();
         var2.Qy0 = var3;
      }

      var10000.F9(var10001.fU(), var3);
   }

   public static void aG(K90 var0) {
      lg_0.lv0.Lf("https://manage.pokemmo.com/auctions/" + var0.RR);
   }

   public static void li(K90 var0) {
      II0.ZN(var0.RR + "");
      f.Qy0.yI0.dk(-1, "Auction id copied to clipboard");
   }

   public static void OH0(qd_0 var0, CH0 var1, int var2, short var3) {
      tw0_0.rl.fk0.uQ(new dt0_0(var0, var1, var2, var3));
   }

   public static void cm(Calendar var0, A40 var1, ny_0 var2) {
      StringBuilder var3;
      var3 = new StringBuilder();
      StringBuilder var4;
      var4 = new StringBuilder();
      nu_0[] var5 = var2.L6;
      if (var2.L6.length != 0) {
         Arrays.stream(var5).forEach(u -> lr_0.kJ0(var4, var3, u));
         if (var3.length() == 0) {
            var3.append("----");
         }

         if (var4.length() == 0) {
            var4.append("----");
         }

         var0.setTimeInMillis(var2.oB0);
         String var6 = DateFormat.getDateInstance().format(var0.getTime());
         j1_0 var10004 = var1.sw0(var3.toString().trim(), "cell");
         float var9 = 250.0F;
         var10004.Nk0 = new vl0_0(var9);
         var10004.LPt7 = 1.0F;
         var1.sw0(var4.toString().trim(), "cell");
         short var7 = 8074;
         gh_2.vC(var2.gy.hA + var7, "cell", var1).LPt7 = 1.0F;
         var1.sw0(var6, "cell").LPt7 = 1.0F;
         j1_0 var10000 = var1.Rg();
         float var8 = 3.0F;
         var10000.getClass();
         var10000.Yg = new vl0_0(var8);
      }
   }

   public static void kJ0(StringBuilder var0, StringBuilder var1, nu_0 var2) {
      String var4;
      label23: {
         cq_0 var3 = var2.hD;
         StringBuilder var10000;
         mc0_1 var10001;
         if (var2.hD != null) {
            var4 = var3.Ay(false);
            if (var2.iS == null) {
               break label23;
            }

            var10000 = AN.nK0(var4, " + ");
            var10001 = var2.iS;
         } else {
            if (var2.iS == null) {
               var4 = "$" + var2.ba0;
               break label23;
            }

            var10000 = new StringBuilder().append(var2.ba0).append("x ");
            var10001 = var2.iS;
         }

         var4 = var10000.append(sm0_0.c0(var10001.Nl)).toString();
      }

      if (var2.lPT5) {
         var0.append(var4).append("\n");
      } else {
         var1.append(var4).append("\n");
      }
   }

   public static boolean YL0(ny_0 var0) {
      return var0.L6.length > 0;
   }

   public GlobalTradeMarketWindow(VU var1, boolean var2) {
      super(tw0_0.kz0());
      this.yw0 = var2;
      this.uf((tw0_0.kz0() ? "mobile-" : "").concat("broker-window"));
      this.Hy(sm0_0.c0(8000));
      this.ff0(1);
      this.Pb0(this::close);
      P8 var3;
      P8 var10000 = var3 = new P8();
      this.hq = var3;
      var10000.I6(false);
      qd_0[] var17 = qd_0.yI0;
      qd_0[] var10;
      qd_0[] var10001 = var10 = qd_0.yI0;
      this.COm6 = new byte[qd_0.yI0.length];
      this.MU = new EG0[var10001.length];
      int var4 = var17.length;

      for (int var5 = 0; var5 < var4; var5++) {
         qd_0 var6 = var10[var5];
         this.MU[var6.gc()] = new EG0(asBridge(), var6, var2);
      }

      this.COm6();
      this.If(qd_0.Vx0);
      qd_0[] var11 = qd_0.yI0;
      var4 = qd_0.yI0.length;

      for (int var15 = 0; var15 < var4; var15++) {
         qd_0 var16;
         String var7 = sm0_0.c0((var16 = var11[var15]).gc() + 8001);
         if (tw0_0.kz0()) {
            var7 = var7.replaceAll(" ", "\n");
         }

         this.hq.Wq(this.MU[var16.gc()], var7).Kj(() -> this.SX(var16));
      }

      String var12 = sm0_0.c0(8004);
      if (tw0_0.kz0()) {
         var12 = var12.replaceAll(" ", "\n");
      }

      if (var2) {
         this.hq.Wq(this.Yu, var12);
      } else {
         fy_2 var8;
         fy_2 var18 = var8 = new fy_2();
         cn_0 var14;
         cn_0 var10004 = var14 = new cn_0(sm0_0.c0(8029));
         var10004.uf("label-info");
         var18.WQ(var18.H10().Ze0().LPt3(var14).Ze0());
         var18.x40(var18.H10().Ze0().Kn0(var14).Ze0());
         this.hq.Wq(var8, var12);
      }

      String var9 = sm0_0.c0(8070);
      if (tw0_0.kz0()) {
         var9 = var9.replaceAll(" ", "\n");
      }

      this.hq.Wq(this.Cd0(), var9).Kj(this::wR);
      this.SL(this.hq);
      lpt6__0.mG(this);
      if (var1 != null) {
         this.nA0.Db(var1);
         this.hq.Zd(this.hq.DD());
      }
   }

   public static void c3(K90 var0, A40 var1) {
      if (var0.Q1 == qd_0.H4) {
         mc0_1 var2 = gu0.l2.lPT6(var0.CF);
         S70 var3;
         S70 var10000 = var3 = new S70(-1, -1, 0);
         var10000.og.Nk(gh_1.aH0.F10(var2, false));
         Br0 var23 = var10000.og;
         byte var4 = 24;
         byte var5 = 24;
         var10000.og.OA0 = true;
         var23.IF = var4;
         var23.gx0 = var5;
         var23.sj = 1;
         if (tw0_0.kz0()) {
            var3.og.EJ0 = 2.0F;
         }

         var1.vx0(new le0_2(null, false)).goto$();
         j1_0 var14;
         j1_0 var24 = var14 = var1.vx0(var3);
         float var21 = 32.0F;
         var24.sn0 = new vl0_0(var21);
         float var22;
         if (tw0_0.kz0()) {
            var22 = 10.0F;
         } else {
            var22 = 5.0F;
         }

         var14.J90 = new vl0_0(var22);
         var1.sw0(var0.si0 + "x " + sm0_0.c0(var2.Nl), "label-lalign").rs0 = 1.0F;
         var1.vx0(new le0_2(null, false)).goto$();
      } else if (var0.Hl0 != null) {
         wb_0 var7;
         wb_0 var10001 = var7 = new wb_0();
         var10001.uh = VY.At;
         var10001.JA = false;
         if (var0.Hl0 != null) {
            var7.Db(new VU(var0.Hl0));
         } else {
            var7.E1(yh_0.Xm0.qC0(var0.CF, (byte)0, false)[0]);
         }

         var7.SU("");
         if (tw0_0.kz0()) {
            byte var15 = 0;
            var7.iK = 0;
            var7.oY = var15;
            Br0 var27 = var7.tp0;
            Br0 var10002 = var7.tp0;
            var15 = -20;
            var7.tp0.gY = 0;
            var10002.a4 = var15;
            var27.EJ0 = 2.0F;
            var7.uf("label");
         }

         j1_0 var8;
         (var8 = var1.vx0(var7)).Wa0();
         if (tw0_0.kz0()) {
            float var9 = 48.0F;
            vl0_0 var17;
            var17 = new vl0_0(var9);
            var8.jQ = var17;
            float var10 = 130.0F;
            var17 = new vl0_0(var10);
            var8.sn0 = var17;
         } else {
            float var11 = 70.0F;
            vl0_0 var19;
            var19 = new vl0_0(var11);
            var8.sn0 = var19;
            float var12 = 40.0F;
            var19 = new vl0_0(var12);
            var8.jQ = var19;
         }

         byte var6 = var0.Hl0.wj;
         short var13 = var0.Hl0.Yb0;
         var1.vx0(new xe_1(sm0_0.c0(59) + " " + var6 + " " + sm0_0.c0(var13 + 150000))).goto$().LPt7 = 1.0F;
      }

      var1.Rg();
   }

   public static void vx(K90 var0, le0_2 var1) {
      if (tw0_0.Eu(1)) {
         Vt0 var2;
         Vt0 var10000 = var2 = new Vt0();
         String var3 = "Auction #" + var0.RR;
         var2.mA0(var3, () -> lr_0.li(var0));
         var2.mA0("ACP", () -> lr_0.aG(var0));
         UA.zd(var10000, var1);
      }
   }

   public final void COm6() {
      og0_0 var1;
      var1 = new og0_0(asBridge());
      this.Yu = var1;
      tk0_0 var7;
      tk0_0 var10000 = var7 = new tk0_0(new A40());
      var10000.uf("/broker-table");
      boolean var2 = true;
      var10000.NB = true;
      var10000.LJ0 = var2;
      A40 var8;
      (var8 = var10000.gg0).EF(5.0F);
      j1_0 var3;
      (var3 = var8.FU.Wa0().NA()).rs0 = 1.0F;
      float var4;
      if (tw0_0.kz0()) {
         var4 = 72.0F;
      } else {
         var4 = 36.0F;
      }

      var3.jQ = new vl0_0(var4);
      var3.ys0(1.0F);
      j1_0 var42 = var8.yu0(0);
      float var11 = 160.0F;
      var42.sn0 = new vl0_0(var11);
      ((A40)var8.uc()).X0();
      if (tw0_0.kz0()) {
         var8.rx0(40.0F);
      } else {
         var8.rx0(10.0F);
      }

      u70_0 var12;
      u70_0 var43 = var12 = new u70_0();
      this.uX = var12;
      var43.RR(this::ay);
      this.uX.M40 = this::q7;
      var3 = gh_2.vC(8005, "header-column", var8);
      if (tw0_0.kz0()) {
         var4 = 96.0F;
      } else {
         var4 = 48.0F;
      }

      var3.jQ = new vl0_0(var4);
      var8.vx0(this.uX);
      var8.Rg();
      uc0_0 var14;
      uc0_0 var44 = var14 = new uc0_0();
      this.nA0 = var14;
      var44.JA = true;
      var44.uh = VY.At;
      var44.RR(this::Ad);
      this.nA0.Nj = this::Ii;
      if (tw0_0.kz0()) {
         uc0_0 var45 = this.nA0;
         uc0_0 var10001 = this.nA0;
         byte var15 = 100;
         byte var30 = 120;
         this.nA0.iK = var15;
         var10001.oY = var30;
         Br0 var46 = var45.tp0;
         byte var16 = 14;
         byte var31 = 30;
         var45.tp0.gY = var16;
         var46.a4 = var31;
      }

      var3 = gh_2.vC(0, "header-column", var8);
      if (tw0_0.kz0()) {
         var4 = 120.0F;
      } else {
         var4 = 48.0F;
      }

      var3.jQ = new vl0_0(var4);
      var8.vx0(this.nA0);
      var8.Rg();
      Aj var18;
      var18 = new Aj(0, Integer.MAX_VALUE, 0);
      this.HO = var18;
      VL0 var19;
      VL0 var47 = var19 = new VL0(this.HO, false);
      this.CoM3 = var19;
      var47.SJ = "$";
      var47.mH();
      short var20 = 8006;
      String var33 = "header-column";
      Qs0 var5;
      Qs0 var48 = var5 = new Qs0(var20);
      var48.uf(var33);
      var8.vx0(var5);
      j1_0 var49 = var8.vx0(this.CoM3);
      float var21 = 180.0F;
      var49.sn0 = new vl0_0(var21);
      var8.Rg();
      cg_0 var22;
      cg_0 var50 = var22 = new cg_0(null, new wn0_0());
      this.Kg = var22;
      var50.pw0(false);
      sm0_0.c0(8007);
      short var23 = 8007;
      String var34 = "header-column";
      Qs0 var51 = var5 = new Qs0(var23);
      var51.uf(var34);
      var8.vx0(var5);
      var8.vx0(this.Kg);
      var8.Rg();
      cg_0 var24;
      cg_0 var52 = var24 = new cg_0(null, new wn0_0());
      this.super$ = var24;
      var52.pw0(false);
      sm0_0.c0(8047);
      short var25 = 8047;
      String var35 = "header-column";
      Qs0 var53 = var5 = new Qs0(var25);
      var53.uf(var35);
      var8.vx0(var5);
      var8.vx0(this.super$);
      var8.Rg();
      xe_1 var26;
      xe_1 var54 = var26 = new xe_1(sm0_0.c0(8009));
      this.EQ = var26;
      pa0_0 var27 = pa0_0.Ol;
      var54.qF0(pa0_0.Ol);
      this.EQ.uf("cell-button");
      this.EQ.RR(this::Wt);
      xe_1 var36;
      xe_1 var55 = var36 = new xe_1(sm0_0.c0(8008));
      var55.qF0(var27);
      var55.uf("cell-button");
      var55.RR(this::op);
      tk0_0 var28;
      var10000 = var28 = new tk0_0(new A40());
      j1_0 var10002 = var10000.gg0.FU;
      j1_0 var10003 = var10000.gg0.FU;
      float var40 = 100.0F;
      var10000.gg0.FU.getClass();
      var10003.sn0 = new vl0_0(var40);
      float var41 = 36.0F;
      var10002.jQ = new vl0_0(var41);
      j1_0 var60 = var10000.gg0.vx0(var36);
      var60.Hb0 = 1;
      var60.Wa0();
      xe_1 var37 = this.EQ;
      var10000.gg0.vx0(var37).GD();
      j1_0 var57 = var8.vx0(var28);
      var57.rs0 = 1.0F;
      var57.d80 = 2;
      var8.Rg();
      this.Zd0();
      og0_0 var9;
      og0_0 var58 = var9 = this.Yu;
      this.Yu.getClass();
      var58.WQ(new Hm0(var9).Xq(this.Yu.C7(var7)));
      og0_0 var10;
      og0_0 var59 = var10 = this.Yu;
      this.Yu.getClass();
      ya_1 var61 = new I7(var10).qd(30);
      ya_1[] var62 = new ya_1[1];
      og0_0 var6;
      (var6 = this.Yu).getClass();
      var62[0] = new Hm0(var6).Kn0(var7);
      var59.x40(var61.Xq(var62));
   }

   public final void N3(qd_0 var1, byte var2, int var3, K90[] var4, int var5, boolean var6, RB var7) {
      if (this.COm6[var1.xZ] == var2) {
         js_0 var17;
         js_0 var10000 = var17 = new js_0(asBridge(), var1, var3);
         var10000.uf("/broker-table");
         A40 var8;
         j1_0 var9 = (var8 = var10000.gg0).FU.ys0(1.0F).NA();
         float var10;
         if (tw0_0.kz0()) {
            var10 = 40.0F;
         } else {
            var10 = 36.0F;
         }

         var9.jQ = new vl0_0(var10);
         if (tw0_0.kz0()) {
            var8.yu0(1).Jq(46.0F);
         }

         boolean var27;
         if (var4.length < 1) {
            var27 = true;
         } else {
            var27 = false;
         }

         this.RZ(var1, var17, var27);
         var5 *= 10;
         cn_0 var28 = new cn_0(null, 0);
         short var29 = 8028;
         String[] var11 = new String[3];
         int var12 = 0;
         NumberFormat var13 = NumberFormat.getInstance();
         byte var14;
         if (var4.length > 0) {
            var14 = 1;
         } else {
            var14 = 0;
         }

         var11[var12] = var13.format(var5 + var14);
         var11[1] = NumberFormat.getInstance().format(var5 + var4.length);
         int var21 = 2;
         StringBuilder var25 = new StringBuilder().append(NumberFormat.getInstance().format(var3));
         String var51;
         if (var6) {
            var51 = "+";
         } else {
            var51 = "";
         }

         var11[var21] = var25.append(var51).toString();
         String var22 = sm0_0.Bx(var29, var11);
         var28.Sk(var22);
         var28.uf("label-info");
         var21 = var4.length;

         for (int var26 = 0; var26 < var21; var26++) {
            K90 var30;
            qd_0 var31;
            if ((var31 = (var30 = var4[var26]).Q1) == qd_0.Vx0) {
               wb_0 var36;
               wb_0 var99 = var36 = new wb_0();
               var99.uh = VY.At;
               var99.JA = false;
               if (var30.Hl0 != null) {
                  var36.Db(new VU(var30.Hl0));
               } else {
                  var36.E1(yh_0.Xm0.qC0(var30.CF, (byte)0, false)[0]);
               }

               var36.SU("");
               if (tw0_0.kz0()) {
                  var12 = (byte)0;
                  var36.iK = 0;
                  var36.oY = var12;
                  Br0 var100 = var36.tp0;
                  Br0 var10001 = var36.tp0;
                  var12 = (byte)-20;
                  var36.tp0.gY = 0;
                  var10001.a4 = var12;
                  var100.EJ0 = 2.0F;
               }

               j1_0 var55 = var8.vx0(var36);
               float var68;
               if (tw0_0.kz0()) {
                  var68 = 120.0F;
               } else {
                  var68 = 70.0F;
               }

               vl0_0 var56;
               var56 = new vl0_0(var68);
               var55.sn0 = var56;
               var55.Wa0();
               CE var57 = var30.Hl0;
               byte var69;
               if (var30.Hl0 != null) {
                  var69 = var57.wj;
               } else {
                  var69 = var30.i90;
               }

               if (var57 != null) {
                  var12 = var57.Yb0;
               } else {
                  var12 = var30.CF;
               }

               xe_1 var82;
               var82 = new xe_1(sm0_0.c0(59) + " " + var69 + " " + sm0_0.c0(var12 + 150000));
               if (var30.Hl0 != null) {
                  var36.uf("button-monster");
                  Runnable var37;
                  var36.Nj = var37 = () -> this.Ri0(var36);
                  var82.uf("button-species");
                  var82.RR(var37);
               } else {
                  var36.uf("cell");
                  var82.uf("cell");
               }

               if (tw0_0.kz0()) {
                  j1_0 var102 = var8.vx0(var82).GD();
                  float var38 = 190.0F;
                  var102.sn0 = new vl0_0(var38);
                  var102.goto$();
               } else {
                  j1_0 var39;
                  (var39 = var8.vx0(var82)).rs0 = 1.0F;
                  byte var59;
                  if (var1 != qd_0.Ws0) {
                     var59 = 1;
                  } else {
                     var59 = 0;
                  }

                  byte var40 = 0;
                  var39.Hb0 = Integer.valueOf(var59);
                  var39.i8 = Integer.valueOf(var40);
               }

               if (var1 != qd_0.Ws0) {
                  String var41 = var30.Hl0.yb.toString();
                  j1_0 var104 = var8.sw0(var41, "cell");
                  var104.rs0 = 1.0F;
                  le0_2 var60;
                  (var60 = (le0_2)var104.kh0).Bb(50);
                  if (var30.Hl0.yb.Hv == null) {
                     var60.Xr0(AN.nK0(var41, "\n").append(sm0_0.c0(1806)).toString());
                  } else {
                     var60.Xr0(AN.nK0(var41, "\n").append(lb0_2.GK0(var30.Hl0.yb)).toString());
                  }

                  gc_2[] var42 = gc_2.fe0;
                  var12 = gc_2.fe0.length;

                  for (int var70 = 0; var70 < var12; var70++) {
                     gc_2 var83 = var42[var70];
                     byte var91;
                     byte var105 = var91 = var30.Hl0.RI(var83);
                     String var84 = String.valueOf(var30.Hl0.RI(var83));
                     if (var105 == 31) {
                        var84 = var84.replace("31", "[#6fb76f]31[]");
                     } else if (var91 == 0) {
                        var84 = var84.replace("0", "[#ff6666]0[]");
                     }

                     j1_0 var85 = var8.sw0(var84, "cell-markup");
                     float var92;
                     if (tw0_0.kz0()) {
                        var92 = 20.0F;
                     } else {
                        var92 = 30.0F;
                     }

                     var85.sn0 = new vl0_0(var92);
                     var85.rs0 = 1.0F;
                  }
               }
            } else {
               qd_0 var32 = qd_0.H4;
               if (var31 == qd_0.H4) {
                  mc0_1 var52 = gu0.l2.lPT6(var30.CF);
                  S70 var67;
                  S70 var97 = var67 = new S70(-1, -1, 0);
                  var97.og.Nk(gh_1.aH0.F10(var52, false));
                  Br0 var10002 = var97.og;
                  Br0 var10003 = var97.og;
                  Br0 var10004 = var97.og;
                  var14 = (byte)24;
                  byte var15 = 24;
                  var97.og.OA0 = true;
                  var10004.IF = var14;
                  var10003.gx0 = var15;
                  var10002.sj = 1;
                  var97.lt0();
                  var97.uf("cell-icon");
                  if (tw0_0.kz0()) {
                     var67.og.EJ0 = 2.0F;
                  }

                  j1_0 var80 = var8.vx0(var67);
                  if (tw0_0.kz0()) {
                     float var89;
                     if (tw0_0.kz0() && var1 == qd_0.Ws0) {
                        var89 = 120.0F;
                     } else {
                        var89 = 0.0F;
                     }

                     var80.sn0 = new vl0_0(var89);
                     var80.Wa0().rs0 = 1.0F;
                  } else {
                     var80.LPt4(70.0F).mA = 1;
                  }

                  String var81 = sm0_0.c0(var52.Nl);
                  if (var52.Yt0 == l5_0.Hj) {
                     X90 var90 = var52.Iq;
                     if (var52.Iq != null && var90.yt()) {
                        var81 = AN.nK0(var81, " (").append(yb_1.f9(var30.i90).Xe()).append(")").toString();
                     }
                  }

                  if (tw0_0.kz0()) {
                     if (var81.length() > 36 && var1 == var32) {
                        var81 = var81.substring(0, 33) + "...";
                     } else if (var81.length() > 20 && var1 != var32) {
                        var81 = var81.substring(0, 17) + "...";
                     }
                  } else if (tw0_0.kz0() ^ true && var81.length() > 32) {
                     var81 = var81.substring(0, 29) + "...";
                  }

                  j1_0 var34;
                  if (var52.Iq != null) {
                     xe_1 var33;
                     xe_1 var124 = var33 = new xe_1(var81);
                     var124.uf("cell-button-addon");
                     var124.RR(() -> lr_0.lw0(var30, var52));
                     var124.GH0 = 1;
                     var67.GH0 = 1;
                     var67.yj0 = new gi_1(var52, var30.i90, null);
                     var67.yB0();
                     var34 = var8.vx0(var33);
                  } else {
                     cn_0 var35;
                     cn_0 var98 = var35 = new cn_0(null, 0);
                     var35.Sk(var81);
                     var35.uf("cell");
                     var34 = var8.vx0(var35);
                     var67.GH0 = 1;
                     var35.GH0 = 1;
                     var67.yj0 = lb0_2.Sp0(var52, true, false);
                     var67.yB0();
                     var98.yj0 = lb0_2.Sp0(var52, true, false);
                     var98.yB0();
                  }

                  if (tw0_0.kz0()) {
                     var34.goto$();
                  } else {
                     var34.Wa0().rs0 = 1.0F;
                  }

                  if (var1 != qd_0.Ws0) {
                     var8.sw0(NumberFormat.getInstance().format(var30.si0), "cell").rs0 = 1.0F;
                  }
               }
            }

            qd_0 var43 = qd_0.Ws0;
            if (var1 == qd_0.Ws0) {
               var8.sw0(NumberFormat.getInstance().format(var30.si0), "cell").rs0 = 1.0F;
            }

            cn_0 var62;
            cn_0 var116 = var62 = new cn_0(null, 0);
            String var71 = "$" + NumberFormat.getInstance().format(var30.mx0);
            var62.Sk(var71);
            var62.uf("cell");
            var116.ZZ(var3x -> vx(var30, var62));
            var8.vx0(var62).rs0 = 1.0F;
            if (var1 == qd_0.H4 && var7 != null && var7.Dz0(var30.CF) >= 0) {
               if (var30.mx0 > var7.mk(var30.CF) * 1.5) {
                  var62.uf("cell-danger");
               } else if (var30.mx0 > var7.mk(var30.CF) * 1.25) {
                  var62.uf("cell-warn");
               }
            }

            if (var1 == var43) {
               cn_0 var63;
               cn_0 var106 = var63 = new cn_0(null, 0);
               String var72 = "$" + NumberFormat.getInstance().format((long)var30.mx0 * var30.hf);
               var106.Sk(var72);
               var106.uf("cell");
               var8.vx0(var63).rs0 = 1.0F;
            }

            Date var44;
            Date var120 = var44 = new Date();
            var120.setTime(var30.ql0 * 1000L);
            Date var64;
            var120 = var64 = new Date();
            var120.setTime(var30.Kq0 * 1000L);
            j1_0 var107;
            if (var1 == var43) {
               String var73 = sm0_0.c0(var30.q8 == 0 ? 8022 : 8023);
               xe_1 var45 = new xe_1(var73);
               var45.uf("cell");
               var45.yj0 = Hc0.format(var64);
               var45.yB0();
               var45.GH0 = 150;
               var8.vx0(var45).rs0 = 1.0F;
               xe_1 var46 = new xe_1(sm0_0.c0(var30.q8 == 0 ? 8020 : 8024));
               boolean var65;
               if (var30.q8 == 0) {
                  var65 = true;
               } else {
                  var65 = false;
               }

               var46.pw0(var65);
               pa0_0 var66 = pa0_0.Ol;
               var46.qF0(pa0_0.Ol);
               var46.uf("cell-button");
               var46.RR(() -> this.SI(var30));
               var8.vx0(var46).rs0 = 1.0F;
               xe_1 var47;
               var47 = new xe_1(sm0_0.c0(8021));
               boolean var74;
               if (var30.q8 != 1 && var30.hf <= 0) {
                  var74 = false;
               } else {
                  var74 = true;
               }

               var47.pw0(var74);
               var47.qF0(var66);
               var47.uf("cell-button");
               var47.RR(() -> this.kq(var30));
               var107 = var8.vx0(var47);
            } else {
               String var75 = tx_1.i((int)(System.currentTimeMillis() / 1000L) - var30.ql0, false);
               var14 = (byte)(int)(var30.Kq0 - System.currentTimeMillis() / 1000L);
               int var93 = var30.Kq0 - var30.ql0;
               j1_0 var109;
               if (tw0_0.kz0()) {
                  ey0_0 var16;
                  ey0_0 var108 = var16 = new ey0_0();
                  var16.aE((float)var14 / var93);
                  var108.B(var75);
                  float var76;
                  if ((var76 = var108.uc) > 0.8F) {
                     var16.uf("progressbar-100");
                  } else if (var76 > 0.6F) {
                     var16.uf("progressbar-80");
                  } else if (var76 > 0.4F) {
                     var16.uf("progressbar-60");
                  } else if (var76 > 0.2F) {
                     var16.uf("progressbar-40");
                  } else {
                     var16.uf("progressbar-20");
                  }

                  var16.lv = true;
                  var16.GH0 = 150;
                  tk0_0 var122 = new tk0_0(new A40());
                  A40 var125 = var122.gg0;
                  A40 var77;
                  A40 var126 = var77 = var122.gg0;
                  var122.gg0.EF(1.0F);
                  j1_0 var127 = var126.DL(8037).GD();
                  float var87 = 8.0F;
                  var127.J90 = new vl0_0(var87);
                  SimpleDateFormat var88;
                  SimpleDateFormat var128 = var88 = Hc0;
                  var77.es(var88.format(var44)).Rr0.Rg();
                  j1_0 var129 = var77.DL(8013).GD();
                  float var48 = 8.0F;
                  var129.J90 = new vl0_0(var48);
                  var125.es(var128.format(var64));
                  var16.yj0 = var122;
                  var16.yB0();
                  var109 = var8.vx0(var16);
               } else {
                  xe_1 var94;
                  xe_1 var110 = var94 = new xe_1(var75);
                  var110.uf("cell");
                  SimpleDateFormat var78 = Hc0;
                  var110.yj0 = Hc0.format(var44);
                  var110.yB0();
                  var110.GH0 = 150;
                  var8.vx0(var94).rs0 = 1.0F;
                  xe_1 var49;
                  xe_1 var111 = var49 = new xe_1(tx_1.i(var14, true));
                  var49.uf("cell");
                  var111.yj0 = var78.format(var64);
                  var111.yB0();
                  var111.GH0 = 150;
                  var109 = var8.vx0(var49);
               }

               var109.rs0 = 1.0F;
               xe_1 var50;
               xe_1 var112 = var50 = new xe_1(sm0_0.c0(8014));
               var50.uf("cell-button");
               var50.qF0(pa0_0.Ol);
               var112.RR(() -> this.Ra(var30));
               var107 = var8.vx0(var50);
            }

            var107.rs0 = 1.0F;
            var8.Rg();
         }

         if (var4.length < 1) {
            j1_0 var113 = gh_2.vC(1655, "cell", var8);
            var113.d80 = var8.B8;
            var113.mA = 1;
            var113.rs0 = 1.0F;
            var113.Rr0.Rg();
         }

         j1_0 var118 = var8.vx0(var28);
         var118.d80 = var8.B8;
         var118 = var118.Jq(30.0F);
         var118.mA = 1;
         var118.rs0 = 1.0F;
         var118.Rr0.Rg();
         EG0 var19;
         V1 var24;
         if ((var24 = (var19 = this.MU[var1.xZ]).y80) != null) {
            var24.JK0(var19.RV, var3);
         }

         le0_2 var18;
         var18 = new le0_2(null, false);
         j1_0 var123 = var8.vx0(var18).Jq(0.0F);
         var123.d80 = var8.B8;
         var123.p20();
         this.MU[var1.xZ].Yj0.tv0(var17);
         if (this.MU[var1.xZ].Of() && !this.MU[var1.xZ].Com5.Of()) {
            this.MU[var1.xZ].sd0(0, 0);
         }
      }
   }

   public final void kq(K90 var1) {
      if (!this.yw0) {
         tw0_0.rl.qK(sm0_0.c0(8029));
      } else {
         BR var10000 = tw0_0.rl;
         CH0[] var2;
         CH0[] var10001 = var2 = new CH0[1];
         byte var3 = 0;
         var10001[var3] = var1.RR;
         var10000.fk0.uQ(new pz_0(var2));
      }
   }

   public final void Ri0(wb_0 var1) {
      BU var10000 = BU.T50;
      VU var2 = var1.AG;
      le0_2 var3 = this.K();
      var10000.FI(var2, var3, qo_1.DL, false);
   }

   public final void ki0(qd_0 var1) {
      tk0_0 var2;
      tk0_0 var10000 = var2 = new tk0_0(new A40());
      var10000.uf("/broker-table");
      j1_0 var3 = var10000.gg0.FU.ys0(1.0F).NA();
      float var4;
      if (tw0_0.kz0()) {
         var4 = 40.0F;
      } else {
         var4 = 36.0F;
      }

      var3.jQ = new vl0_0(var4);
      A40 var6 = var2.gg0;
      if (tw0_0.kz0()) {
         var6.yu0(1).Jq(46.0F);
      }

      this.RZ(var1, var2, true);
      String var5 = "label-info";
      var6.getClass();
      j1_0 var10002 = gh_2.vC(55, var5, var6);
      var10002.mA = 1;
      var10002.d80 = var6.B8;
      var10002 = var10002.NA();
      var10002.i8 = 1;
      var10002.rs0 = 1.0F;
      this.MU[var1.xZ].Yj0.tv0(var2);
      ((tk0_0)var6.Op).COm3();
   }

   public final void Ii() {
      UA.zd(pv0_0.A80(this.nA0, tw0_0.rl.PC0), this.nA0);
   }

   public final void Ad() {
      if (this.nA0.AG != null) {
         this.uX.UR(null);
      }

      this.Zd0();
   }

   public final void q7() {
      u70_0 var1 = this.uX;
      yo_0 var2 = pv0_0.zy0;
      boolean var3;
      if (this.uX.wE0 > 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      UA.zd(pv0_0.S20(var1, var2, var3), this.uX);
   }

   public final void ay() {
      if (this.uX.wE0 > 0) {
         this.nA0.Db(null);
      }

      this.Zd0();
   }

   public final void SX(qd_0 var1) {
      int var10000 = this.hq.Bb();
      byte var2 = var1.xZ;
      if (var10000 == var1.xZ) {
         this.MU[var2].nK0();
         this.If(var1);
      }
   }

   public final void kv0(ny_0[] var1) {
      tk0_0 var4;
      if ((var4 = this.He0) != null) {
         A40 var10000 = var4.gg0;
         A40 var10001 = var4.gg0;
         A40 var5;
         (var5 = var4.gg0).OO();
         ((A40)var10001.uc()).MP = 1;
         j1_0 var17 = var10000.FU;
         var10000.FU.mA = 1;
         j1_0 var18 = var17.K6().NA().ys0(1.0F);
         float var2 = 36.0F;
         var18.jQ = new vl0_0(var2);
         if (tw0_0.kz0()) {
            var2 = 5.0F;
         } else {
            var2 = 0.0F;
         }

         var5.qE0(var2);
         if (tw0_0.kz0()) {
            var2 = 0.0F;
         } else {
            var2 = 5.0F;
         }

         var5.Dr0(var2);
         if (tw0_0.kz0()) {
            var2 = 5.0F;
         } else {
            var2 = 0.0F;
         }

         var5.rx0(var2);
         short var11 = 8071;
         String var3 = "header-column";
         Qs0 var10003 = new Qs0(var11);
         var10003.uf(var3);
         j1_0 var10002 = var5.vx0(var10003);
         var2 = 250.0F;
         var10002.sn0 = new vl0_0(var2);
         var10002.NA().rs0 = 1.0F;
         var10002 = gh_2.vC(8072, "header-column", var5);
         var2 = 140.0F;
         var10002.sn0 = new vl0_0(var2);
         var10002.rs0 = 1.0F;
         var10002 = gh_2.vC(8073, "header-column", var5);
         var2 = 100.0F;
         var10002.sn0 = new vl0_0(var2);
         var10002.rs0 = 1.0F;
         var10002 = gh_2.vC(5837, "header-column", var5);
         var2 = 100.0F;
         var10002.sn0 = new vl0_0(var2);
         var10002.rs0 = 1.0F;
         j1_0 var22 = var5.Rg();
         var2 = 3.0F;
         var22.getClass();
         var22.Yg = new vl0_0(var2);
         if (var1.length != 0 && !Arrays.stream(var1).noneMatch(lr_0::YL0)) {
            Calendar var7 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            Arrays.stream(var1).forEach(u -> lr_0.cm(var7, var5, u));
         } else {
            String var6 = sm0_0.c0(8069);
            cn_0 var29 = new cn_0(null, 0);
            var29.Sk(var6);
            var29.uf("label-info");
            var10002 = var5.vx0(var29);
            var10002.d80 = 4;
            var10002.rs0 = 1.0F;
            var5.Rg();
            j1_0 var20 = var5.vx0(new le0_2(null, false));
            var20.d80 = 4;
            var20.p20();
         }
      }
   }

   public final void close() {
      if (this.yw0) {
         BU var1 = f.Qy0.yI0.zK0;
         if (f.Qy0.yI0.zK0.OJ == null && var1.de0 == null) {
            tw0_0.rl.fk0.uQ(new re_2());
         }
      }

      BU.T50.U1(null, false, false);
   }

   @Override
   public final void N00(zk0_1 var1) {
      lpt6__0.qK0(this, false);
      le0_2 var2 = lpt6__0.bF0;
      if (lpt6__0.bF0 != null) {
         var2.BL();
      }

      super.N00(var1);
   }

   public final void If(qd_0 var1) {
      m0_0 var2 = this.vw;
      if (this.vw != null) {
         var2.ky0();
         this.vw = null;
      }

      EG0 var10;
      String var3 = tx_1.J10(((wn0_0)(var10 = this.MU[var1.xZ]).Com5.dI0).YA.toString(), true);
      py_1 var4 = null;
      int var5;
      if ((var5 = B0.qj0[var1.Bc0]) != 1) {
         if (var5 == 2 && !var3.isEmpty()) {
            wx_2 var21;
            var21 = new wx_2();
            Iterator var27 = gu0.l2.Pd0.values().iterator();

            while (var27.hasNext()) {
               mc0_1 var6;
               if ((var6 = (mc0_1)var27.next()).TL() && !var6.M80 && tx_1.qp0(tx_1.J10(sm0_0.c0(var6.Nl), false), var3)) {
                  var21.TI0(var6.Z8);
               }
            }

            py_1 var14;
            var14 = new py_1(var21);
            var4 = var14;
         }
      } else if (!var3.isEmpty()) {
         wx_2 var22;
         var22 = new wx_2();
         Iterator var28 = mp_1.vf0().k2.values().iterator();

         while (var28.hasNext()) {
            cq_0 var32;
            if ((var32 = (cq_0)var28.next()).kT == null && var32.dR < 32767 && tx_1.qp0(tx_1.J10(var32.Ay(false), false), var3)) {
               var22.TI0(var32.dR);
            }
         }

         py_1 var15;
         var15 = new py_1(var22);
         var4 = var15;
      }

      X6 var16 = var10.kH0;
      bx_0 var17;
      if (var10.kH0.mu0.Mw0 > 0 && (var17 = (bx_0)((eg_0)var16.Vh0()).q90) != null) {
         byte var20;
         if ((var20 = v40_0.lo0(var17, tw0_0.rl.sN)) != -1) {
            byte var12 = var1.xZ;
            byte var31 = (byte)(this.COm6[var1.xZ] + 1);
            this.COm6[var12] = var31;
            this.vB0(var1);
            BR var13 = tw0_0.rl;
            byte var33 = var10.fq();
            short var9 = this.MU[var1.xZ].RV;
            var13.fk0.uQ(new m2_0(var20, var31, var33, var4, var9));
         }
      } else {
         es_1 var18;
         var18 = new es_1();
         if (var4 != null) {
            var18.Ue0(var4);
         }

         es_1 var10003 = var10.yH();
         Object[] var23 = var10003.rZ;
         var5 = var10003.KB;
         var18.G6(var23, 0, var5);
         byte var24 = var1.xZ;
         byte var30 = (byte)(this.COm6[var1.xZ] + 1);
         this.COm6[var24] = var30;
         I2 var25 = var18.ZD();

         while (var25.hasNext()) {
            if (((Mg)var25.next()).L6()) {
               K90[] var7 = new K90[0];
               this.M8(var30, var1, 0, 0, var7, null);
               return;
            }
         }

         this.vB0(var1);
         Mg[] var11 = (Mg[])var18.Mo0(Mg.class);
         BR var19 = tw0_0.rl;
         byte var26 = var10.fq();
         short var8 = this.MU[var1.xZ].RV;
         var19.fk0.uQ(new ld_1(var30, var1, var26, var8, var11));
      }
   }

   public final void Wt() {
      this.EQ.pw0(false);
      short var1 = 1;
      int var2 = this.CoM3.eB0;
      if (this.CoM3.eB0 < this.on0) {
         tw0_0.rl.qK(sm0_0.wa0(5895, NumberFormat.getInstance().format(this.on0)));
         this.lo(td_1.op0);
      } else {
         label48: {
            VU var3 = this.nA0.AG;
            qd_0 var4;
            CH0 var5;
            if (this.nA0.AG != null) {
               var4 = qd_0.Vx0;
               var5 = var3.pu;
            } else {
               if (!this.uX.qi.uI0()) {
                  break label48;
               }

               u70_0 var10 = this.uX;
               short var12 = this.uX.ax;
               if (this.uX.ax <= 0) {
                  break label48;
               }

               qd_0 var11 = qd_0.H4;
               var5 = var10.qi;
               var1 = var12;
               var4 = var11;
            }

            if (var3 != null) {
               boolean var6 = false;
               short var7 = 0;
               if (var3.I8.u3() && var2 < 7500000) {
                  var6 = true;
                  var7 = 5062;
               } else if (var3.I8.I() && var2 < 600000) {
                  var6 = true;
                  var7 = 5019;
               }

               if (var6) {
                  Qy0 var10001 = f.Qy0.yI0;
                  String[] var8;
                  String[] var10007 = var8 = new String[2];
                  var10007[0] = sm0_0.wa0(var7, var3.na0());
                  var10007[1] = "$" + NumberFormat.getInstance().format(var2);
                  String var9 = sm0_0.Bx(8044, var8);
                  short var1f = var1;
                  lpt3__4 var10002 = new lpt3__4(var9, () -> lr_0.OH0(var4, var5, var2, var1f), null);
                  var10002.D80 = true;
                  var10001.sr0(var10002);
                  this.EQ.pw0(true);
                  return;
               }
            }

            if (var3 != null) {
               var3.I8.getClass();
            }

            tw0_0.rl.fk0.uQ(new dt0_0(var4, var5, var2, var1));
            return;
         }

         this.lo(td_1.op0);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public final void lo(td_1 var1) {
      this.EQ.pw0(true);
       switch (B0.Od0[var1.H6]) {
         case 1:
            this.op();
            break;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            this.EQ.pw0(true);
            break;
         case 16:
         case 17:
            qd_0 var2 = this.vb0;
            if (this.vb0 != null) {
               this.If(var2);
            }
            break;
         case 18:
         case 19:
            this.If(qd_0.Ws0);
      }
   }

   public final void vB0(qd_0 var1) {
      lg_0.k.lPT5(() -> this.ki0(var1));
   }

   public final void M8(byte var1, qd_0 var2, int var3, int var4, K90[] var5, RB var6) {
      if (var2 == qd_0.Ws0) {
         this.ej0 = var5;
      }

      boolean var7;
      if (var4 < 0) {
         var7 = true;
      } else {
         var7 = false;
      }

      if (var7) {
         var4 = -var4;
      }

      int var4f = var4;
      lg_0.k.lPT5(() -> this.N3(var2, var1, var4f, var5, var3, var7, var6));
   }

   public final void RZ(qd_0 var1, tk0_0 var2, boolean var3) {
      A40 var25 = var2.gg0;
      if (tw0_0.kz0()) {
         var25.qE0(5.0F);
      }

      var25.FU.LPt7 = 1.0F;
      ((A40)var25.uc()).MP = 1;
      j1_0 var4 = null;
      if (tw0_0.kz0()) {
         cn_0 var36;
         cn_0 var10000 = var36 = new cn_0(null, 0);
         String var5 = sm0_0.wa0(1928, NumberFormat.getInstance().format(tw0_0.rl.k0.il));
         var10000.Sk(var5);
         var10000.uf("label-info");
         (var4 = var25.vx0(var36)).Wa0().Rr0.Rg();
      }

      label143: {
         j1_0 var54;
         if (var1 == qd_0.Vx0) {
            j1_0 var37 = gh_2.vC(0, "header-column", var25);
            float var6;
            if (tw0_0.kz0()) {
               var6 = 315.0F;
            } else {
               var6 = 0.0F;
            }

            var37.sn0 = new vl0_0(var6);
            var37.d80 = 2;
            var37.goto$();
            short var38 = 8106;
            String var48 = "header-column";
            Qs0 var7;
            Qs0 var52 = var7 = new Qs0(var38);
            var52.uf(var48);
            var37 = var25.vx0(var7);
            if (tw0_0.kz0()) {
               var6 = 95.0F;
            } else {
               var6 = 63.0F;
            }

            var37.sn0 = new vl0_0(var6);
            var37.rs0 = 1.0F;
            j1_0 var26 = var25.sw0("IVs", "header-column");
            var26.d80 = var3 ? 1 : 6;
            float var40;
            if (tw0_0.kz0()) {
               var40 = 200.0F;
            } else {
               var40 = 190.0F;
            }

            var54 = var26;
            var26.sn0 = new vl0_0(var40);
         } else if (var1 == qd_0.H4) {
            j1_0 var27 = var25.sw0("", "header-column");
            float var41;
            if (tw0_0.kz0()) {
               var41 = 120.0F;
            } else {
               var41 = 70.0F;
            }

            var27.sn0 = new vl0_0(var41);
            var27.rs0 = 1.0F;
            j1_0 var28 = gh_2.vC(8015, "header-column", var25);
            if (tw0_0.kz0()) {
               var28.goto$();
            } else {
               float var29 = 220.0F;
               var28.sn0 = new vl0_0(var29);
               var28.rs0 = 1.0F;
            }

            j1_0 var30 = gh_2.vC(8016, "header-column", var25);
            if (tw0_0.kz0() ^ true) {
               var41 = 60.0F;
            } else {
               var41 = 0.0F;
            }

            var54 = var30;
            var30.sn0 = new vl0_0(var41);
         } else {
            if (var1 != qd_0.Ws0) {
               break label143;
            }

            j1_0 var31 = var25.sw0("", "header-column");
            float var43;
            if (tw0_0.kz0()) {
               var43 = 120.0F;
            } else {
               var43 = 70.0F;
            }

            var31.sn0 = new vl0_0(var43);
            var31.rs0 = 1.0F;
            j1_0 var32 = gh_2.vC(8015, "header-column", var25);
            if (tw0_0.kz0()) {
               var32.goto$();
            } else {
               float var33 = 220.0F;
               var32.sn0 = new vl0_0(var33);
               var32.rs0 = 1.0F;
            }

            j1_0 var34 = gh_2.vC(8017, "header-column", var25);
            if (tw0_0.kz0() ^ true) {
               var43 = 60.0F;
            } else {
               var43 = 0.0F;
            }

            var54 = var34;
            var34.sn0 = new vl0_0(var43);
         }

         var54.rs0 = 1.0F;
      }

      xe_1 var35;
      var35 = new xe_1(sm0_0.c0(8012));
      j1_0 var45;
      (var45 = var25.vx0(var35)).rs0 = 1.0F;
      float var50;
      if (tw0_0.kz0()) {
         var50 = 148.0F;
      } else {
         var50 = 102.0F;
      }

      vl0_0 var46;
      var46 = new vl0_0(var50);
      var45.sn0 = var46;
      qd_0 var47 = qd_0.Ws0;
      if (var1 == qd_0.Ws0) {
         var35.uf("header-column");
      } else {
         EG0 var51;
         if ((var51 = this.MU[var1.xZ]).fq() == 2) {
            var35.uf("header-column-sort-desc");
         } else if (var51.fq() == 3) {
            var35.uf("header-column-sort-asc");
         } else {
            var35.uf("header-column-sort-default");
         }

         var35.RR(() -> lr_0.o60(var51));
      }

      if (var1 == var47) {
         j1_0 var57 = gh_2.vC(8018, "header-column", var25);
         float var8 = 92.0F;
         var57.sn0 = new vl0_0(var8);
         var57.rs0 = 1.0F;
         j1_0 var9 = gh_2.vC(8019, "header-column", var25);
         float var18;
         if (tw0_0.kz0()) {
            var18 = 48.0F;
         } else {
            var18 = 90.0F;
         }

         var9.sn0 = new vl0_0(var18);
         var9.rs0 = 1.0F;
         j1_0 var10 = gh_2.vC(8020, "header-column", var25);
         float var19;
         if (tw0_0.kz0() ^ true) {
            var19 = 105.0F;
         } else {
            var19 = 140.0F;
         }

         var10.sn0 = new vl0_0(var19);
         var10.rs0 = 1.0F;
         j1_0 var11 = gh_2.vC(8021, "header-column", var25);
         float var20;
         if (tw0_0.kz0() ^ true) {
            var20 = 105.0F;
         } else {
            var20 = 140.0F;
         }

         var11.sn0 = new vl0_0(var20);
         var11.rs0 = 1.0F;
      } else {
         xe_1 var12;
         var12 = new xe_1(sm0_0.c0(8037));
         EG0 var21;
         if ((var21 = this.MU[var1.xZ]).fq() == 0) {
            var12.uf("header-column-sort-desc");
         } else if (var21.fq() == 1) {
            var12.uf("header-column-sort-asc");
         } else {
            var12.uf("header-column-sort-default");
         }

         var12.RR(() -> lr_0.BX(var21));
         j1_0 var13;
         (var13 = var25.vx0(var12)).rs0 = 1.0F;
         float var22;
         if (tw0_0.kz0()) {
            var22 = 150.0F;
         } else {
            var22 = 92.0F;
         }

         var13.sn0 = new vl0_0(var22);
         if (tw0_0.kz0() ^ true) {
            j1_0 var14;
            (var14 = gh_2.vC(8013, "header-column", var25)).rs0 = 1.0F;
            float var23;
            if (tw0_0.kz0()) {
               var23 = 120.0F;
            } else {
               var23 = 92.0F;
            }

            vl0_0 var15;
            var15 = new vl0_0(var23);
            var14.sn0 = var15;
         }

         j1_0 var16;
         (var16 = gh_2.vC(8014, "header-column", var25)).rs0 = 1.0F;
         float var24;
         if (tw0_0.kz0()) {
            var24 = 100.0F;
         } else {
            var24 = 96.0F;
         }

         vl0_0 var17;
         var17 = new vl0_0(var24);
         var16.sn0 = var17;
      }

      var25.Rg();
      if (tw0_0.kz0() && var4 != null) {
         var4.d80 = var25.B8;
      }
   }

   public final void Ra(K90 var1) {
      if ((this.vb0 = var1.Q1) == qd_0.H4) {
         uf0_0 var11;
         if ((var11 = (uf0_0)jq0_0.tK0(f.Qy0.yI0, uf0_0.class)) != null) {
            f.Qy0.yI0.u3(var11);
         }

         String var12 = sm0_0.c0(gu0.l2.lPT6(var1.CF).Nl);
         cx_0 var21;
         if (var1.si0 < 2) {
            String var13 = sm0_0.Bx(8039, "1", var12, "$" + NumberFormat.getInstance().format(var1.mx0));
            Runnable var7 = () -> lr_0.Ly0(var1);
            cx_0 var31 = var21 = new lpt3__4(var13, var7, this.K());
            } else {
            String var8 = sm0_0.wa0(8031, var12);
            short var23 = var1.si0;
            JF0 var25;
            var25 = new JF0(var12, var1);
            le0_2 var10 = this.K();
            cx_0 var32 = var21 = new uf0_0(var8, var23, var25, var10);
         }

         f.Qy0.yI0.F9(f.Qy0.yI0.fU(), var21);
      } else {
         tk0_0 var2;
         tk0_0 var10002 = var2 = new tk0_0(new A40());
         A40 var3;
         c3(var1, var3 = var10002.gg0);
         if (var1.Q1 == qd_0.Vx0) {
            CE var4 = var1.Hl0;
            if (var1.Hl0 == null) {
               throw new IllegalArgumentException();
            }

            byte var22 = var4.wj;
            short var5 = var4.Yb0;
            if (var4.aR() && !var1.Hl0.ca()) {
               j1_0 var29 = var3.es(sm0_0.wa0(8057, sm0_0.c0(var5 + 150000)));
               var29.d80 = 4;
               float var19 = 10.0F;
               var29.ck0 = new vl0_0(var19);
               float var20 = 15.0F;
               var29.Yg = new vl0_0(var20);
            } else if (var22 > tw0_0.rl.yh0.IL0(tw0_0.e60.Com4)) {
               String var14 = sm0_0.c0(var5 + 150000);
               String[] var24;
               String[] var33 = var24 = new String[2];
               var24[0] = var14;
               var33[1] = Integer.toString(var22);
               j1_0 var27 = var3.es(sm0_0.Bx(8038, var24));
               var27.d80 = 4;
               float var15 = 10.0F;
               var27.ck0 = new vl0_0(var15);
               float var16 = 15.0F;
               var27.Yg = new vl0_0(var16);
            } else {
               j1_0 var28 = var3.DL(8032);
               var28.d80 = 4;
               float var17 = 10.0F;
               var28.ck0 = new vl0_0(var17);
               float var18 = 10.0F;
               var28.Yg = new vl0_0(var18);
            }
         }

         Qy0 var30 = f.Qy0.yI0;
         Runnable var6 = () -> lr_0.WB0(var1);
         le0_2 var36 = this.K();
         xX var9 = xX.Bm;
         var30.sr0(new lpt3__4(var2, var6, var36, var9));
      }
   }

   public final void SI(K90 var1) {
      if (!this.yw0) {
         tw0_0.rl.qK(sm0_0.c0(8029));
      } else {
         tk0_0 var3;
         tk0_0 var10000 = var3 = new tk0_0(new A40());
         A40 var7 = var10000.gg0;
         c3(var1, var10000.gg0);
         j1_0 var8 = var7.DL(8030);
         float var2 = 10.0F;
         var8.Yg = new vl0_0(var2);
         var2 = 10.0F;
         var8.ck0 = new vl0_0(var2);
         var8.d80 = 4;
         var8.Rr0.Rg();
         Qy0 var9 = f.Qy0.yI0;
         Runnable var4 = () -> lr_0.qb0(var1);
         xX var5 = xX.Bm;
         var9.sr0(new lpt3__4(var3, var4, null, var5));
      }
   }

   public final void hc(K90 var1) {
      this.Ra(var1);
   }

   public final void Gs(K90 var1) {
      this.SI(var1);
   }

   public final void rs0(K90 var1, cn_0 var2, e90_0 var3) {
      vx(var1, var2);
   }

   public final void op() {
      this.CoM3.case$(0);
      this.nA0.Db(null);
      this.uX.UR(null);
      this.Zd0();
   }

   @Override
   public final void K8() {
      super.K8();
      if (tw0_0.kz0()) {
         this.E40(0, 0);
         this.oY(super.Em0.Mx, super.Em0.OB);
         this.hq.e4.lt0();
         le0_2 var1 = this.hq.e4;
         pa0_0 var2 = pa0_0.up0;
         if (this.hq.e4.K20 != null) {
            int var3 = var1.Em0.Mx;
            int var4 = var2.uD0(var3, var1.Mx);
            int var5 = var1.Em0.OB;
            var1.E40(var4, var2.Kr0(var5, var1.OB));
         }

         super.Lr0.lt0();
         super.Lr0.A20(pa0_0.Mk, 0, 0);
         super.r90 = 0;
      } else if (!this.iW) {
         this.iW = true;
         this.vf(pa0_0.Ol);
      }
   }

   public final void Zd0() {
      short var1;
      int var2;
      int var3;
      var1 = 1;
      var2 = 1;
      var3 = 2000000000;
      u70_0 var4 = this.uX;
      short var5 = this.uX.wE0;
      label56:
      if (this.uX.wE0 > 0) {
         short var8 = var4.ax;
         if (var4.ax > 0) {
            var1 = var8;
         }

         mc0_1 var9;
         mc0_1 var10000 = var9 = gu0.l2.lPT6(var5);
         short var13 = h50_0.XD0;
         if (var10000.sh0 > 1) {
            if (var9.wX != NA0.T70) {
               var3 = 250000000;
            } else {
               var3 = 20000000;
            }
         }

         if (var9.kr0) {
            int var19 = (int)((var3 = Math.round(var9.TD * 1.105F)) * h50_0.sg0);
            var5 = h50_0.XD0;
            if (var19 < h50_0.XD0) {
               var3 = Math.round(var9.TD * 1.05F + var5);
               var2 = var13;
               break label56;
            }
         }

         var2 = var13;
      }

      VU var14 = this.nA0.AG;
      if (this.nA0.AG != null) {
         if (var14.I8.I()) {
            var2 = h50_0.bs;
         } else {
            var2 = h50_0.Y30;
         }
      }

      label60: {
         Aj var15;
         var15 = new Aj(0, var3, this.CoM3.eB0);
         this.HO = var15;
         this.CoM3.yW(var15);
         this.CoM3.case$(this.CoM3.eB0);
         this.on0 = var2;
         this.HO.Kj(this::Zd0);
         var2 = this.CoM3.eB0;
         int var20 = var3 = (int)(this.CoM3.eB0 * h50_0.sg0);
         short var16 = h50_0.Y30;
         if (var20 >= h50_0.Y30 || this.nA0.AG == null) {
            var16 = h50_0.XD0;
            if (var3 >= h50_0.XD0) {
               break label60;
            }
         }

         var3 = var16;
      }

      short var17 = h50_0.lv0;
      if (var3 > h50_0.lv0) {
         var3 = var17;
      }

      int var6 = var3 * var1;
      long var11;
      long var22 = var11 = (long)var1 * var2;
      this.Kg.Gv("$" + NumberFormat.getInstance().format(var6));
      if (var22 > 2000000000L) {
         String var7 = sm0_0.wa0(8048, NumberFormat.getInstance().format(2000000000L));
         xe_1 var23 = this.EQ;
         this.EQ.yj0 = var7;
         var23.yB0();
         this.EQ.pw0(false);
         this.EQ.GH0 = 0;
         cg_0 var24 = this.super$;
         this.super$.yj0 = var7;
         var24.yB0();
         cg_0 var25 = this.super$;
         this.super$.GH0 = 0;
         var25.Gv("(!!) $" + NumberFormat.getInstance().format(var11));
      } else {
         xe_1 var10001 = this.EQ;
         this.EQ.yj0 = null;
         var10001.yB0();
         this.super$.Gv("$" + NumberFormat.getInstance().format(var11));
         cg_0 var26 = this.super$;
         this.super$.yj0 = null;
         var26.yB0();
         if (var11 > 0L) {
            this.EQ.pw0(true);
         }
      }
   }

   @Override
   public final void x00() {
      lpt6__0.v90(this.hq);
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      if (!E00.ZU(var1.zu) || !var1.iT()) {
         return super.nd0(var1);
      }

      if (f.Qy0.af(this)) {
         return super.nd0(var1);
      }

      label91: {
         label99: {
            int var2 = var1.finally$;
            if (this.hq.Of() && this.hq.bx == null) {
               rp_0 var3 = rp_0.I90;
               if (rp_0.I90 != null && var3.Ov(var2)) {
                  break label99;
               }

               var3 = rp_0.cB;
               if (rp_0.cB != null && var3.Ov(var2)) {
                  break label99;
               }

               var3 = rp_0.Ni;
               if (rp_0.Ni != null && var3.Ov(var2)) {
                  break label91;
               }

               var3 = rp_0.Aq0;
               if (rp_0.Aq0 != null && var3.Ov(var2)) {
                  break label91;
               }

               var3 = rp_0.nK0;
               if (rp_0.nK0 != null && var3.Ov(var2)) {
                  this.close();
                  return true;
               }

               var3 = rp_0.sJ0;
               if (rp_0.sJ0 != null && var3.Ov(var2)) {
                  if (this.hq.Bb() >= 3) {
                     if (this.hq.Bb() == 3) {
                        this.Yu.Uz(1, false);
                     }
                  } else {
                     this.MU[this.hq.Bb()].sd0(0, 0);
                  }

                  return true;
               }
            }

            cg_0 var6;
            if (var1.finally$ == 34 && var1.J30 == 4 && (var6 = this.MU[this.hq.Bb()].Com5) != null) {
               var6.BL();
               return true;
            }

            return super.nd0(var1);
         }

         this.hq.Lb(-1);
         le0_2 var5;
         if ((var5 = this.hq.bx) != null) {
            var5.f00();
         }

         return true;
      }

      this.hq.Lb(1);
      le0_2 var4;
      if ((var4 = this.hq.bx) != null) {
         var4.f00();
      }

      return true;
   }

   @Override
   public final boolean u3(le0_2 var1) {
      if (var1 == this.Qy0) {
         this.Qy0 = null;
      }

      return super.u3(var1);
   }

   @Override
   public final void HP(zk0_1 var1) {
      super.HP(var1);
      if (this.Of() && super.bx == null) {
         lpt6__0.v90(this.hq);
      }
   }

   public final void wR() {
      if (this.hq.Bb() == 4) {
         tw0_0.rl.fk0.uQ(new Qq());
      }
   }

   public final fy_2 Cd0() {
      fy_2 var1;
      var1 = new fy_2();
      (this.He0 = new tk0_0(new A40())).uf("/broker-table");
      if (tw0_0.kz0() ^ true) {
         j1_0 var10000 = this.He0.gg0.FU;
         float var2 = 2.0F;
         this.He0.gg0.FU.getClass();
         var10000.J90 = new vl0_0(var2);
      }

      byte var6 = 38;
      byte var3 = 0;
      short var4 = 0;
      if (tw0_0.kz0()) {
         var6 = 61;
         var3 = 61;
         var4 = 285;
      }

      lo0_0 var5;
      lo0_0 var10005 = var5 = new lo0_0(this.He0);
      var10005.Qs0(2);
      var1.WQ(new Hm0(var1));
      var1.x40(new I7(var1));
      var1.pJ0.X20(var1.C7(var5).qd(var4));
      var1.L4.X20(new I7(var1).qd(var6).Kn0(var5).qd(var3));
      return var1;
   }
}
