package cn.pokemmo.ui.window.inventory;

import f.*;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * 玩家背包物品栏大窗口
 *
 * 原混淆类: f.jc_2
 */
public class InventoryWindow extends cx_0 implements vy_2, tr_1  {
    public final jc_2 asBridge() {
        return (jc_2) (Object) this;
    }

   public static final HashMap XD0 = new HashMap();
   public final BU FE;
   public final boolean H40;
   public final boolean UY;
   public final l5_0[] dl0;
   public final fy_2 It0;
   public final ZW Ns;
   public l5_0 uq;
   public final PB[] py0;
   public final Ms0[] Nz0;
   public cn_0 ad0;
   public final cg_0 nB;
   public tf_1 ix;
   public u2_0 xm0;
   public eg_1 AV;
   public QV Oa0;
   public HD0 SQ;
   public int dD;
   public int Fx;
   public final A5 qo0;

   public static void com4(xe_1 var0) {
      lg_0.k.lPT5(() -> Lpt4(var0));
   }

   public static void Lpt4(xe_1 var0) {
      var0.pw0(true);
   }

   public static K5[] dc(int var0) {
      return new K5[var0];
   }

   public static K5[] eS(int var0) {
      return new K5[var0];
   }

   public static K5[] y60(int var0) {
      return new K5[var0];
   }

   public InventoryWindow(BU var1, boolean var2) {
      super(tw0_0.kz0());
      l5_0 var3 = l5_0.B9;
      this.uq = var3;
      this.dD = -1;
      this.Fx = 0;
      this.FE = var1;
      this.H40 = (boolean)var2;
      this.Pb0(this::close);
      if (tw0_0.kz0()) {
         this.uf("mobile-inventory-tabbedframe");
      } else {
         this.uf("inventory-tabbedframe");
      }

      this.ff0(1);
      A5 var9;
      A5 var10000 = var9 = tw0_0.rl.gh0();
      this.qo0 = var9;
      A5 var4 = A5.O1;
      boolean var5;
      if (var10000 != A5.O1 && var9 != A5.N00) {
         var5 = false;
      } else {
         var5 = true;
      }

      this.UY = (boolean)var5;
      if (var5) {
         this.Hy(sm0_0.c0(1460).toUpperCase());
         this.py0 = new PB[var2 ? 0 : 1];
         this.Nz0 = new Ms0[var2 ? 0 : 1];
         l5_0[] var14;
         (var14 = new l5_0[1])[0] = var3;
         this.dl0 = var14;
      } else {
         StringBuilder var15;
         var15 = new StringBuilder();
         this.Hy(ig_0.u9(1400, var15, " - ").append(sm0_0.c0(var3.WA0()).toUpperCase()).toString());
         PB[] var16 = new PB[var2 ? 0 : l5_0.tC0.length];
         this.py0 = var16;
         this.Nz0 = new Ms0[var2 ? 0 : l5_0.tC0.length];
         this.dl0 = l5_0.Oy;
      }

      cg_0 var17;
      cg_0 var23 = var17 = new cg_0();

      this.nB = var17;
      var23.I7();
      var23.Ii(this::uT);
      ZW var6;
      ZW var24 = var6 = new ZW();

      this.Ns = var6;
      var24.Od0(false);
      var24.uf("tabbedpane");
      fy_2 var7;
      fy_2 var25 = var7 = new fy_2();

      this.It0 = var7;
      var25.WQ(var25.H10().qd(10).LPt3(var6));
      var25.x40(var25.C7(var6));
      this.SL(var7);
      this.SL(var17);
      if (tw0_0.kz0()) {
         cn_0 var18;
         var18 = new cn_0(sm0_0.wa0(1928, NumberFormat.getInstance().format(tw0_0.rl.ex().bk0())));
         this.ad0 = var18;
         this.SL(var18);
      }

      if (tw0_0.kz0()) {
         HD0 var19;
         var19 = new HD0(asBridge());
         this.SQ = var19;
         this.SL(var19);
      }

      byte currentCategory = tw0_0.e60.yY();
      K5[] var21 = tw0_0.rl.Bb(var9).KL();
      if (var2 || var9 != var4 && var9 != A5.N00) {
         l5_0[] var11 = l5_0.Oy;
         int var12 = l5_0.Oy.length;

         for (int var13 = 0; var13 < var12; var13++) {
            l5_0 var22 = var11[var13];
            if (!var2) {
               K5[] var8 = Stream.of(var21).filter(item -> jc_2.rt(var22, currentCategory, item)).toArray(K5[]::new);
               this.a00(var22, var8);
            }
         }
      } else {
         K5[] var10 = Stream.of(var21).filter(item -> jc_2.RR(currentCategory, item)).toArray(K5[]::new);
         this.a00(var3, var10);
      }

      this.RY(550, 140);
   }

   public static void Lv(K5 var0, int var1) {
      if (BU.T50.z6 != null) {
         Qy0 var10000 = Qy0.yI0;
         String[] var2;
         String[] var10001 = var2 = new String[2];
         var10001[0] = var0.Ua();
         var10001[1] = var1 + 1 + "";
         var10000.dk(-1, sm0_0.Bx(1415, var2));
         short var3 = var0.nn.wQ;
         BU.T50.z6.mg(var1, var0.nn.Br, var3);
      }
   }

   public static void coN(K5 var0) {
      a10_0 var1;
      if ((var1 = bc_1.km(var0.cL.g0)) != null) {
         pf0_2 var2;
         var2 = new pf0_2();
         var1.Tk0.add(var2);
         tw0_0.PK0 = var1;
      }
   }

   public static void f6(EK var0, le0_2 var1) {
      BU.T50.FI(var0.n2, var1, qo_1.DL, false);
   }

   public static void OC0() {
      BU.T50.se0();
   }

   public static void ku() {
      BU var0 = BU.T50;
      jc_2 var1 = BU.T50.Wf;
      if (BU.T50.Wf != null) {
         var1.xe0();
         var0.Wf = null;
         Qy0.yI0.zm0();
      }
   }

   public static boolean rt(l5_0 var0, byte var1, K5 var2) {
      if (var2.cL.Yt0 == var0) {
         byte var3 = var2.nn.Ps;
         if (var2.nn.Ps == var1 || var3 == -1) {
            return true;
         }
      }

      return false;
   }

   public static boolean RR(byte var0, K5 var1) {
      byte var2;
      return (var2 = var1.nn.Ps) == var0 || var2 == -1;
   }

   public final void a00(l5_0 var1, K5[] var2) {
      Ms0 var3;
      var3 = new Ms0(asBridge(), this.SQ, var1, var2);
      int var16 = var1.Ra;
      this.Nz0[var1.Ra] = var3;
      PB[] var4 = this.py0;
      ZW var5 = this.Ns;
      String var6;
      if (tw0_0.kz0()) {
         var6 = sm0_0.c0(var1.ni);
      } else {
         var6 = "";
      }

      var5.getClass();
      PB var7;
      PB var10000 = var7 = new PB(var5);

      var10000.oq0.SU(var6);
      le0_2 var26;
      if ((var26 = var10000.pe0) != var3) {
         if (var26 != null) {
            var5.PN.u3(var26);
         }

         var7.pe0 = var3;
         var3.Ll(var7.getValue());
         var5.PN.F9(var5.PN.fU(), var3);
      }

      o10_0 var20 = var7.oq0;
      var5.HB0.F9(var5.HB0.fU(), var20);
      var5.rJ.add(var7);
      if (var5.rJ.size() == 1) {
         var5.qf(var7);
      }

      int var21 = 0;

      for (int var27 = var5.rJ.size(); var21 < var27; var21++) {
         KG0 var8 = ((PB)var5.rJ.get(var21)).oq0.M;
         MD0 var9 = ZW.gC;
         boolean var10;
         if (var21 == 0) {
            var10 = true;
         } else {
            var10 = false;
         }

         var8.j70(var9, var10);
         var9 = ZW.QI0;
         if (var21 == var27 - 1) {
            var10 = true;
         } else {
            var10 = false;
         }

         var8.j70(var9, var10);
      }

      var4[var16] = var7;
      PB var10002 = this.py0[var1.Ra];
      String var17 = "inventory-tab-empty";
      o10_0 var33 = var10002.oq0;
      var10002.oq0.getClass();
      var33.uf(var17);
      var33.yI();
      this.py0[var1.Ra].Kj(() -> this.pL(var1));
      short var18;
      switch (var1.ordinal()) {
         case 0:
            var18 = 5436;
            break;
         case 1:
            var18 = 5476;
            break;
         case 2:
            var18 = 5004;
            break;
         case 3:
            var18 = 5252;
            break;
         case 4:
            var18 = 5155;
            break;
         case 5:
         default:
            var18 = 5459;
            break;
         case 6:
            var18 = 5017;
            break;
         case 7:
            var18 = 5057;
      }

      if (this.UY) {
         var18 = 1421;
      }

      HashMap var22;
      Wr[] var24;
      if ((var24 = (Wr[])(var22 = XD0).get(var18)) == null) {
         Wr[] var34 = var24 = new Wr[2];
         byte var23 = 0;
         gh_1 var25;
         gh_1 var10003 = var25 = gh_1.aH0;
         var24[var23] = var25.Jg(var18, true);
         byte var19 = 1;
         var34[var19] = var10003.Jg(var18, false);
         var22.put(var18, var24);
      }

      Br0 var11;
      (var11 = this.py0[var1.Ra].oq0.Hx0).Nk(var24);
      if (tw0_0.kz0()) {
         byte var12 = 48;
         byte var14 = 48;
         var11.OA0 = true;
         var11.IF = var12;
         var11.gx0 = var14;
         byte var13 = 6;
         byte var15 = 6;
         var11.gY = var13;
         var11.a4 = var15;
      }
   }

   public final void Ob(K5 var1) {
      short var2 = var1.nn.PA0;
      if (var1.nn.PA0 > 1) {
         uf0_0 var3;
         if ((var3 = (uf0_0)jq0_0.tK0(Qy0.yI0, uf0_0.class)) != null) {
            lpt6__0.v90(var3);
            return;
         }

         String var5 = sm0_0.wa0(1432, sm0_0.c0(var1.cL.Nl));
         x8_0 var6;
         var6 = new x8_0(asBridge(), var1);
         uf0_0 var4;
         uf0_0 var10000 = var4 = new uf0_0(var5, var2, var6, asBridge());

         Qy0.yI0.F9(Qy0.yI0.fU(), var4);
      } else {
         this.NUL(var1, (short)1);
      }
   }

   public final void tD(K5 var1) {
      short var5 = 372;
      CH0 var6 = CH0.j1;
      CH0 var2 = var1.nn.Br;
      byte var3 = 0;
      byte var4 = -1;
      this.ew0();
      tw0_0.rl.sn0(var5, var6, var2, var3, var4);
   }

   public final void EA(K5 var1, K5 var2) {
      if (var1 == null) {
         tw0_0.rl.qK(sm0_0.c0(8580));
      } else {
         short var5 = var1.nn.wQ;
         CH0 var6 = var1.nn.Br;
         CH0 var7 = var2.nn.Br;
         byte var3 = 1;
         byte var4 = -1;
         this.ew0();
         tw0_0.rl.sn0(var5, var6, var7, var3, var4);
      }
   }

   public final void P3(K5 var1) {
      if (tw0_0.PK0 != null || tw0_0.rl.nz()) {
         Qy0.yI0.dk(-1, sm0_0.c0(6002));
      } else if (var1 != null) {
         X90 var2 = var1.cL.Iq;
         if (var1.cL.Iq != null && var2.wk(32768)) {
            short var5 = var1.nn.wQ;
            CH0 var6 = var1.nn.Br;
            CH0 var7 = CH0.j1;
            byte var3 = 1;
            byte var4 = 1;
            this.ew0();
            tw0_0.rl.sn0(var5, var6, var7, var3, var4);
         }
      }
   }

   public final void WA0(K5 var1, short var2) {
      CH0 var3 = var1.nn.Br;
      tw0_0.rl.fk0.uQ(new Qw0(var3, var2));
      if (tw0_0.kz0() && var2 >= var1.nn.PA0) {
         this.SQ.rL0(null);
      }
   }

   public final void r00(K5 var1) {
      short var5 = var1.nn.wQ;
      CH0 var6 = var1.nn.Br;
      CH0 var2 = CH0.j1;
      byte var3 = 1;
      byte var4 = 1;
      this.ew0();
      tw0_0.rl.sn0(var5, var6, var2, var3, var4);
   }

   public final void DH0(l5_0 var1, int[] var2) {
      int var3 = var1.Ra;
      this.Nz0[var1.Ra].bC0.Xr0(var2[var3]);
   }

   public final boolean X4(l5_0 var1, byte var2, K5 var3) {
      if (var3.cL.Yt0 == var1 || this.UY) {
         byte var4 = var3.nn.Ps;
         if (var3.nn.Ps == var2 || var4 == -1) {
            return true;
         }
      }

      return false;
   }

   public final void Ki(K5 var1) {
      this.v6(var1, true);
   }

   public final void Lp0(K5 var1) {
      this.IC0(var1);
   }

   public final void eY(K5 var1) {
      this.IC0(var1);
   }

   public final void nE0(K5 var1, EK var2) {
      this.cOm5(var1, var2);
   }

   public final void pL(l5_0 var1) {
      this.uq = var1;
      if (this.UY) {
         this.Hy(sm0_0.c0(1460).toUpperCase());
      } else {
         StringBuilder var2;
         var2 = new StringBuilder();
         this.Hy(ig_0.u9(1400, var2, " - ").append(sm0_0.c0(this.uq.ni).toUpperCase()).toString());
      }
   }

   @Override
   public final boolean dv() {
      return false;
   }

   public final void close() {
      if (this.H40) {
         InventoryWindow var1;
         BU var2;
         if ((var1 = (var2 = this.FE).Wf) != null) {
            var1.xe0();
            var2.Wf = null;
            Qy0.yI0.zm0();
         }
      } else {
         this.FE.se0();
      }
   }

   public final void update() {
      if (!this.H40) {
         RJ0 var1;
         if ((var1 = tw0_0.rl.Bb(this.qo0)) == null) {
            this.close();
         } else {
            l5_0[] var2 = this.dl0;
            int[] var3 = new int[this.dl0.length];
            int var4 = this.dl0.length;

            for (int var5 = 0; var5 < var4; var5++) {
               var3[var2[var5].Ra] = this.Nz0[var2[var5].Ra].bC0.g1.VP;
            }

            byte var9 = tw0_0.e60.Com4;
            K5[] var11 = var1.KL();
            l5_0[] var12 = this.dl0;
            int var13 = this.dl0.length;

            for (int var6 = 0; var6 < var13; var6++) {
               l5_0 var7 = var12[var6];
               Ms0 var10000 = this.Nz0[var7.Ra];
               this.Nz0[var7.Ra].U80 = Stream.of(var11).filter(item -> this.X4(var7, var9, item)).toArray(K5[]::new);
               var10000.Ik();
               lg_0.k.lPT5(() -> this.DH0(var7, var3));
            }

            HD0 var8;
            if ((var8 = this.SQ) != null) {
               K5 var10 = var8.PA;
               if (var8.PA != null) {
                  var8.rL0(var10);
               }
            }
         }
      }
   }

   @Override
   public final void K8() {
      int var1 = 530;
      int var2 = 378;
      if (tw0_0.kz0()) {
         var1 = tw0_0.LD0.ew0();
         var2 = tw0_0.LD0.Hv0();
         this.vi(0, 0, 0, 0);
         this.RY(var1, var2);
         Ms0[] var3 = this.Nz0;
         int var4 = this.Nz0.length;

         for (int var5 = 0; var5 < var4; var5++) {
            Ms0 var10000 = var3[var5];
            this.Ns.vi(0, 0, 0, 0);
            var10000.vi(0, 0, 0, 0);
         }
      } else {
         this.RY(var1, 386);
      }

      this.It0.oY(var1 - 15, var2);
      this.It0.Ll(true);
      this.nB.Ll(true);
      if (!tw0_0.kz0()) {
         Ms0[] var7 = this.Nz0;
         int var13 = this.Nz0.length;

         for (int var14 = 0; var14 < var13; var14++) {
            Ms0 var15 = var7[var14];
            var7[var14].RY(var1 - 37, var2 + 20);
            var15.vi(10, 10, 10, 10);
         }
      }

      HD0 var8 = this.SQ;
      if (this.SQ != null) {
         var8.E40(300, 0);
      }

      tf_1 var9 = this.ix;
      if (this.ix != null) {
         var9.oY(var1, var2 + 28);
         this.ix.E40(0, 0);
         this.It0.Ll(false);
         this.nB.Ll(false);
      }

      u2_0 var10 = this.xm0;
      if (this.xm0 != null) {
         var10.oY(var1, var2 + 28);
         this.xm0.E40(0, 0);
         this.It0.Ll(false);
         this.nB.Ll(false);
      }

      eg_1 var11 = this.AV;
      if (this.AV != null) {
         var11.oY(var1, var2 + 28);
         this.AV.E40(0, 0);
         this.It0.Ll(false);
         this.nB.Ll(false);
      }

      QV var12 = this.Oa0;
      if (this.Oa0 != null) {
         var12.oY(var1, var2 + 28);
         this.Oa0.E40(0, 0);
         this.It0.Ll(false);
         this.nB.Ll(false);
      }

      super.K8();
      if (tw0_0.kz0() ^ true) {
         this.nB.oY(180, 28);
         this.nB.E40(super.A20 + 330, super.SB0 + 40);
      } else {
         this.Ns.E40(0, 61);
         this.nB.lt0();
         this.nB.vf(pa0_0.dC0);
         this.ad0.lt0();
         cg_0 var6;
         this.ad0.E40((var6 = this.nB).A20 + var6.Mx + 15, 10);
      }
   }

   public final void cOm5(K5 var1, EK var2) {
      if (tw0_0.PK0 == null && !tw0_0.rl.nz() && var1 != null && var2 != null) {
         xe_1 var3;
         var3 = new xe_1(sm0_0.c0(1423));
         xe_1 var4;
         xe_1 var10000 = var4 = new xe_1(sm0_0.c0(1465));

            var10000.RR(() -> this.r00(var1));
         var10000.pw0(false);
         lpt5__5.hL.ZD(() -> lg_0.k.lPT5(() -> var4.pw0(true)), 1000L);
         SimpleDateFormat var6;
         var6 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
         cn_0 var10;
         cn_0 var14 = var10 = new cn_0(null, 0);
         String[] var5;
         String[] var10003 = var5 = new String[2];
         var5[0] = var2.n2.na0();
         byte var7 = 1;
         var10003[var7] = var6.format(var2.zD0.ly * 1000L);
         String var8 = sm0_0.Bx(1467, var10003);

         var14.Sk(var8);
         Qy0 var9;
         Qy0 var15 = var9 = Qy0.yI0;
         lpt3__4 var12;
         lpt3__4 var10001 = var12 = new lpt3__4(var10, var4, null, var3, null);

         var10001.D80 = true;
         String var11 = "confirm-widget-warning";
         lpt3__4 var13;
         if ((var13 = var15.Ba0) != null) {
            var13.xe0();
         }

         var9.Ba0 = var12;
         var12.uf(var11);
         var9.F9(var9.fU(), var12);
      } else {
         Qy0.yI0.dk(-1, sm0_0.c0(6002));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public final void IC0(K5 var1) {
      if (tw0_0.PK0 != null || tw0_0.rl.nz()) {
         Qy0.yI0.dk(-1, sm0_0.c0(6002));
      } else if (var1 != null && var1.cL.Iq != null) {
         short var8 = var1.nn.wQ;
         CH0 var10 = var1.nn.Br;
         CH0 var13 = CH0.j1;
         byte var14 = 1;
         byte var15 = -1;
         this.ew0();
         tw0_0.rl.sn0(var8, var10, var13, var14, var15);
      } else if (var1 != null) {
         int actionType;
         switch (var1.cL.dB0(false).Ap0) {
            case 1:
               actionType = 1;
               break;
            case 7:
               actionType = 2;
               break;
            case 2:
               actionType = 3;
               break;
            case 4:
               actionType = 4;
               break;
            case 3:
               actionType = 5;
               break;
            default:
               actionType = 0;
         }

         switch (actionType) {
            case 1:
               short var12 = var1.nn.wQ;
               CH0 var3 = var1.nn.Br;
               CH0 var4 = CH0.j1;
               int var5 = var1.cL.rg ? 0 : 1;
               byte var6 = -1;
               this.ew0();
               tw0_0.rl.sn0(var12, var3, var4, (short)var5, var6);
               short var9;
               if (var1.cL.Yt0 == l5_0.Jy || (var9 = var1.nn.wQ) >= 1227 && var9 <= 1230) {
                  this.close();
               }
               break;
            case 2:
            case 3:
               this.v6(var1, false);
               break;
            case 4:
               eg_1 var2 = this.AV;
               if (this.AV != null) {
                  this.u3(var2);
                  this.AV = null;
               }

               eg_1 var10005 = var2 = new eg_1(asBridge(), var1);

               this.AV = var10005;
               this.Hy(var2.ke.Ua());
               eg_1 var7 = this.AV;
               this.F9(this.fU(), var7);
               break;
            case 5:
               this.v6(var1, false);
         }
      }
   }

   @Override
   public final void OV(mc0_1 var1, CH0 var2, VU var3) {
      u2_0 var4 = this.xm0;
      if (this.xm0 != null) {
         this.u3(var4);
         this.xm0 = null;
      }

      u2_0 var10005 = var4 = new u2_0(asBridge(), var1, var2, var3);

      this.xm0 = var10005;
      this.Hy(var4.Pt0.j50.toString());
      u2_0 var5 = this.xm0;
      this.F9(this.fU(), var5);
   }

   @Override
   public final void ew0() {
      if (this.UY) {
         this.Hy(sm0_0.c0(1460).toUpperCase());
      } else {
         StringBuilder var1;
         var1 = new StringBuilder();
         this.Hy(ig_0.u9(1400, var1, " - ").append(sm0_0.c0(this.uq.ni).toUpperCase()).toString());
      }

      QV var2 = this.Oa0;
      if (this.Oa0 != null) {
         this.u3(var2);
         this.Oa0 = null;
      }

      eg_1 var3 = this.AV;
      if (this.AV != null) {
         this.u3(var3);
         this.AV = null;
      }

      tf_1 var4 = this.ix;
      if (this.ix != null) {
         this.u3(var4);
         this.ix = null;
      }

      u2_0 var5 = this.xm0;
      if (this.xm0 != null) {
         this.u3(var5);
         this.xm0 = null;
      }

      this.vK();
   }

   @Override
   public final void HP(zk0_1 var1) {
      super.HP(var1);
      if (this.H40 && this.Oa0 == null && this.AV == null && this.ix == null && this.xm0 == null) {
         lg_0.k.lPT5(jc_2::ku);
      }

      if (this.Oa0 != null || this.AV != null || this.ix != null || this.xm0 != null) {
         Qy0.yI0.zm0();
      }

      a10_0 var2 = tw0_0.PK0;
      if (tw0_0.PK0 != null && !var2.a40 && tw0_0.rl != null) {
         lg_0.k.lPT5(jc_2::OC0);
      }
   }

   public final void v6(K5 var1, boolean var2) {
      tf_1 var3 = this.ix;
      if (this.ix != null) {
         this.u3(var3);
         this.ix = null;
      }

      mc0_1 var4 = var1.cL;
      tf_1 var10005 = var3 = new tf_1(asBridge(), var4, var1.nn.Br, var2);

      this.ix = var10005;
      this.Hy(var3.Ey0.j50.toString());
      tf_1 var5 = this.ix;
      this.F9(this.fU(), var5);
   }

   public final void NUL(K5 var1, short var2) {
      Qy0 var10000 = Qy0.yI0;
      String[] var3;
      String[] var10006 = var3 = new String[2];
      var3[0] = Integer.toString(var2);
      var10006[1] = var1.Fh0();
      String var4 = sm0_0.Bx(1431, var3);
      lpt3__4 var10001 = new lpt3__4(var4, () -> this.WA0(var1, var2), null);
      var10001.D80 = true;
      var10000.sr0(var10001);
   }

   @Override
   public final void x00() {
      lpt6__0.v90(this.XS());
   }

   @Override
   public final void N00(zk0_1 var1) {
      super.N00(var1);
      Qy0.yI0.zm0();
   }

   public final xe_1 XS() {
      tf_1 var1 = this.ix;
      if (this.ix != null) {
         return var1.Ba0();
      }

      u2_0 var4 = this.xm0;
      if (this.xm0 != null) {
         return var4.Ts0[var4.jO];
      }

      QV var5 = this.Oa0;
      if (this.Oa0 != null) {
         return var5.ns0[var5.Hi0];
      }

      eg_1 var6 = this.AV;
      if (this.AV != null) {
         return var6.uH[var6.Ka];
      }

      int var7 = this.dD;
      if (this.dD < 0) {
         ZW var2;
         PB var3;
         return (var2 = this.Ns) != null && (var3 = var2.tI) != null ? var3.oq0 : null;
      }

      xe_1[] var8;
      if ((var8 = (xe_1[])this.Nz0[this.uq.Ra].Nd0.get(var7)) == null) {
         return null;
      }

      if (this.Fx < 0) {
         this.Fx = 0;
      }

      if (this.Fx >= var8.length) {
         this.Fx = var8.length - 1;
      }

      return var8[this.Fx];
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      if (E00.C10(var1.zu)) {
         Qy0.yI0.zm0();
      }

      if (E00.ZU(var1.zu) && var1.iT()) {
         int var2 = var1.finally$;
         u2_0 var3 = this.xm0;
         if (this.xm0 != null) {
            var3.nd0(var1);
            return true;
         }

         tf_1 var21 = this.ix;
         if (this.ix != null) {
            var21.nd0(var1);
            return true;
         }

         QV var22 = this.Oa0;
         if (this.Oa0 != null) {
            var22.nd0(var1);
            return true;
         }

         eg_1 var23 = this.AV;
         if (this.AV != null) {
            var23.nd0(var1);
            return true;
         }

         if (this.nB.Of()) {
            this.nB.nd0(var1);
            return true;
         }

         rp_0 var24 = rp_0.kC0;
         rp_0 var4 = rp_0.synchronized$;
         rp_0 var5 = rp_0.I90;
         rp_0 var6 = rp_0.Ni;
         if (var2 == 34 && var1.J30 == 4) {
            this.nB.BL();
            return true;
         }

         if (tw0_0.kz0() && this.dD < 0) {
            rp_0 var10001 = var6;
            var6 = var4;
            var4 = var24;
            var5 = var10001;
            var24 = var5;
         } else {
            var4 = var5;
            var5 = var4;
         }

         if (var24 != null && var24.Ov(var2)) {
            if (tw0_0.kz0() && this.dD < 1) {
               return true;
            }

            int var15 = this.dD;
            if (this.dD < 0) {
               return true;
            }

            if ((this.dD = var15 - 1) < 0) {
               ZW var16 = this.Ns;
               int var17;
               if (this.Ns.rJ.isEmpty()) {
                  var17 = -1;
               } else {
                  var17 = var16.rJ.indexOf(var16.tI);
               }

               this.Fx = var17;
            }

            this.vK();
            return true;
         }

         if (var5 != null && var5.Ov(var2)) {
            if (this.Nz0[this.uq.Ra].Nd0.l90(this.dD + 1) && ++this.dD == 0) {
               this.Fx = 0;
            }

            this.vK();
            return true;
         }

         if (var4 != null && var4.Ov(var2) && !this.nB.Of()) {
            if (tw0_0.kz0() && this.dD >= 0) {
               this.dD = -1;
               ZW var13 = this.Ns;
               this.Fx = (this.Ns.rJ.isEmpty() ? -1 : var13.rJ.indexOf(var13.tI)) + 1;
            }

            if (this.dD < 0) {
               if (--this.Fx < 0) {
                  this.Fx = 0;
               }

               this.Ns.qf(this.py0[this.Fx]);
               this.vK();
               return true;
            }

            int var14 = this.Fx;
            if (this.Fx > 0) {
               this.Fx = var14 - 1;
            }

            this.vK();
            return true;
         }

         if (var6 != null && var6.Ov(var2) && !this.nB.Of()) {
            int var10 = this.dD;
            if (this.dD < 0) {
               int var31 = ++this.Fx;
               Ms0[] var12 = this.Nz0;
               if (var31 >= this.Nz0.length) {
                  this.Fx = var12.length - 1;
               }

               this.Ns.qf(this.py0[this.Fx]);
               this.vK();
               return true;
            }

            var2 = this.Fx;
            xe_1[] var11;
            if ((var11 = (xe_1[])this.Nz0[this.uq.Ra].Nd0.get(var10)) != null && var11.length > var2) {
               this.Fx++;
            }

            this.vK();
            return true;
         }

         rp_0 var25 = rp_0.sJ0;
         if (rp_0.sJ0 != null && var25.Ov(var2) && !this.nB.Of()) {
            if (this.dD < 0) {
               return true;
            }

            xe_1 var9 = this.XS();
            var2 = this.dD;
            K5[] var19;
            K5 var30;
            if (this.dD >= 0 && (var19 = (K5[])this.Nz0[this.uq.Ra].Gn0.get(var2)) != null) {
               if (this.Fx < 0) {
                  this.Fx = 0;
               }

               if (this.Fx >= var19.length) {
                  this.Fx = var19.length - 1;
               }

               var30 = var19[this.Fx];
            } else {
               var30 = null;
            }

            if (var30 != null && var9 != null) {
               a7_0.bH(var9.ER.Fc0);
            }

            return true;
         }

         rp_0 var26 = rp_0.nK0;
         if (rp_0.nK0 != null && var26.Ov(var2) && !this.nB.Of()) {
            if (this.H40) {
               BU var7 = BU.T50;
               jc_2 var8 = BU.T50.Wf;
               if (BU.T50.Wf != null) {
                  var8.xe0();
                  var7.Wf = null;
                  Qy0.yI0.zm0();
               }
            } else {
               BU.T50.se0();
            }

            return true;
         }
      }

      return super.nd0(var1);
   }

   public final void uT(int var1) {
      if (var1 != 66 && var1 != 111) {
         if (tx_1.J10(this.nB.dI0.toString(), true).isEmpty()) {
            Ms0[] var8;
            var1 = (var8 = this.Nz0).length;

            for (int var2 = 0; var2 < var1; var2++) {
               var8[var2].Ik();
            }
         } else {
            this.dD = -1;
            le0_2 var10 = this.Nz0[this.uq.Ra].Ik();
            l5_0 var11 = this.uq;
            l5_0[] var3 = this.dl0;
            int var4 = this.dl0.length;

            for (int var5 = 0; var5 < var4; var5++) {
               l5_0 var6;
               if ((var6 = var3[var5]) != this.uq) {
                  le0_2 var7 = this.Nz0[var6.Ra].Ik();
                  if (var10 == null) {
                     var11 = var6;
                     var10 = var7;
                  }
               }
            }

            if (var10 != null) {
               boolean var10000 = this.nB.Of();
               this.Ns.qf((PB)this.Ns.rJ.get(var11.Ra));
               if (var10000) {
                  lpt6__0.v90(this.nB);
               }

               this.Nz0[var11.Ra].bC0.Rn(var10);
            }
         }
      } else {
         this.vK();
      }
   }

   public final void vK() {
      xe_1 var1;
      if ((var1 = this.XS()) != null) {
         lpt6__0.v90(var1);
         Object var2 = var1.yj0;
         if (var1.yj0 != null) {
            Qy0.yI0.vk(this.Nz0[this.uq.Ra], var2, pa0_0.L00);
         } else {
            Qy0.yI0.zm0();
         }

         this.Nz0[this.uq.Ra].bC0.Rn(var1);
         if (tw0_0.kz0()) {
            a7_0.bH(var1.ER.Fc0);
         }
      } else {
         Qy0.yI0.zm0();
      }
   }

   @Override
   public final void U90(short var1, CH0 var2, CH0 var3, byte var4) {
      this.ew0();
      tw0_0.rl.sn0(var1, var2, var3, (short)1, var4);
   }

   @Override
   public final void Lj0(short var1, CE var2) {
      this.ew0();
      BR var4 = tw0_0.rl;
      CH0 var5 = var2.YD0;
      _volatile var3 = var2.JF;
      var4.fk0.uQ(new SF0(var3, var5, var1));
   }

   public final Vt0 UX(K5 var1, le0_2 var2) {
      Vt0 var3;
      var3 = new Vt0();
      if (tw0_0.kz0()) {
         this.SQ.rL0(var1);
      }

      if (var1.cL.dB0(false) != JU.O4 && tw0_0.PK0 == null && !tw0_0.rl.nz()) {
         EK var4;
         if ((var4 = tw0_0.rl.DD(var1.cL.zK)) == null) {
            at_0 var8;
            at_0 var28 = var8 = new at_0(sm0_0.c0(1410));

            var28.eu0 = () -> this.IC0(var1);
            var3.hx.add(var8);
         } else {
            label70: {
               ed0_0 var5 = var4.zD0;
               at_0 var21;
               Vt0 var10000;
               at_0 var10001;
               Runnable var10002;
               if (var4.zD0.Dr) {
                  var10000 = var3;
                  var10001 = var21 = new at_0(sm0_0.c0(1465));

                  var10002 = () -> this.cOm5(var1, var4);
               } else {
                  if (var5.ly - System.currentTimeMillis() / 1000L >= 0L) {
                     int var22 = (int)(var4.zD0.ly - System.currentTimeMillis() / 1000L);
                     at_0 var6;
                     var10001 = var6 = new at_0(tx_1.i(var22, true));

                     var10001.LG(false);
                     var3.hx.add(var6);
                     break label70;
                  }

                  var10000 = var3;
                  var10001 = var21 = new at_0(sm0_0.c0(1466));

                  var10002 = () -> this.IC0(var1);
               }

               var10001.eu0 = var10002;
               var10000.hx.add(var21);
            }

            at_0 var23;
            at_0 var27 = var23 = new at_0(sm0_0.c0(1703));

            var27.eu0 = () -> jc_2.f6(var4, var2);
            var3.hx.add(var23);
         }

         X90 var9 = var1.cL.Iq;
         if (var1.cL.Iq != null && var9.wk(32768)) {
            at_0 var10;
            at_0 var29 = var10 = new at_0(sm0_0.c0(1437));

            var29.eu0 = () -> this.P3(var1);
            var3.hx.add(var10);
         }

         if (var1.cL.g0 != QL.lQ) {
            at_0 var11;
            at_0 var30 = var11 = new at_0(sm0_0.c0(3006));

            var30.eu0 = () -> jc_2.coN(var1);
            var3.hx.add(var11);
         }

         if (var1.nn.P.LPt4 != tw0_0.rl.Fb0()) {
            Vt0 var12;
            var12 = new Vt0(sm0_0.c0(1412));
            int var18 = 0;

            while (var18 < 9) {
               at_0 var24;
               int menuIndex = var18;
               at_0 var31 = var24 = new at_0(sm0_0.wa0(1413, (menuIndex + 1) + ""));

               var31.eu0 = () -> jc_2.Lv(var1, menuIndex);
               var12.hx.add(var24);
               var18++;
            }

            var3.hx.add(var12);
         }
      }

      if (var1.nn.P.LPt4 && var1.cL.X80() && var1.cL.Z8 != 1446) {
         K5 var13 = tw0_0.rl.Bb(this.qo0).Mq0((short)1028);
         at_0 var19;
         at_0 var35 = var19 = new at_0(sm0_0.c0(8551));

         var35.eu0 = () -> this.EA(var1, var13);
         var3.hx.add(var19);
         at_0 var14;
         at_0 var32 = var14 = new at_0(sm0_0.c0(8571));

         var32.eu0 = () -> this.tD(var13);
         var3.hx.add(var14);
      }

      mc0_1 var15 = var1.cL;
      l5_0 var20 = var1.cL.Yt0;
      if (var1.cL.Yt0 != l5_0.Jy && var20 != l5_0.Hj && var15.ii0) {
         at_0 var16;
         at_0 var33 = var16 = new at_0(sm0_0.c0(1411));

         var33.eu0 = () -> this.v6(var1, true);
         var3.hx.add(var16);
      }

      if (var1.nn.P.LPt4 && var1.cL.To0(true)) {
         at_0 var17;
         at_0 var34 = var17 = new at_0(sm0_0.c0(1424));

         var34.eu0 = () -> this.Ob(var1);
         var3.hx.add(var17);
      }

      at_0 var7;
      at_0 var36 = var7 = new at_0(sm0_0.c0(1423));

      var36.eu0 = null;
      var3.hx.add(var7);
      return var3;
   }
}
