package cn.pokemmo.ui.battle;

import f.*;
import com.badlogic.gdx.graphics.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 对战主控与战斗 HUD 界面面板 (Battle Combat Layout)
 * 统管对战过程中双方参战精灵、技能按键栏、逃跑/换人/道具弹窗、天气及对战特效的全套 UI 布局与生命周期。
 *
 * 原混淆类: f.ML0
 */
public class BattleCombatLayout extends le0_2 {
    public ML0 asBridge() {
        return (ML0) (Object) this;
    }

   public static final dl_1 Ed0 = Cq0.E1(BattleCombatLayout.class);
   public static final int[] Vn0 = new int[]{1, 2, 3, 0, 5, 4};
   public static final ak0_2[] IP = new ak0_2[0];
   public static final DecimalFormat IY = new DecimalFormat("00");
   public static final MD0 Li = MD0.cB("targeted");
   public static final gn_0 np = new gn_0(Integer.MIN_VALUE);
   public static final gn_0 ZP = new gn_0(536870912);
   public final a10_0 yd0;
   public final fy_2 WU;
   public final fy_2 Be;
   public final fy_2 TH0;
   public final fy_2 Zf0;
   public final tk0_0 ri0;
   public final fy_2 Wq0;
   public NN Hd;
   public final fy_2[] oe;
   public final fy_2[] GB;
   public final S70[][] As;
   public final S70[][] Gr0;
   public q40_0 kX;
   public sc_2 GH0;
   public G20 Vh;
   public G20 Xs;
   public G20 HJ;
   public G20 Ne0;
   public G20 V6;
   public G20 t6;
   public G20 v80;
   public final hh0_1 a60;
   public final xe_1 z9;
   public final ZJ fE;
   public fk0_0 SB;
   public final cn_0[] G1;
   public final S70[] JU;
   public final cn_0 bF;
   public final cn_0 Vd;
   public final ae0_1[] xD0;
   public final le0_2 ki;
   public b30_0 xT;
   public b30_0 Ru;
   public b30_0 fr;
   public vk0_1[] LpT6;
   public final G20[] iQ;
   public final short[] J;
   public final ak0_2[] jb0;
   public ak0_2[] to;
   public ak0_2[] HE0;
   public final ak0_2[] jD0;
   public final ak0_2 EG;
   public final xe_1[] Yc;
   public final xe_1 JC0;
   public byte Pq;
   public boolean Vs;
   public int tG0;
   public int ds;
   public xe_1[] Ss;
   public boolean r7;
   public xe_1[] L1;
   public final Stack yK;
   public boolean BF0;
   public boolean f6;
   public final cn_0 Vw0;
   public hh0_1 yf0;
   public final ArrayList H20;
   public final jd0_1[][] Tb0;
   public final vw_0[] z70;
   public final LinkedList lZ;
   public N60 BQ;
   public final Qy0 Sr0;
   public qj_2 zJ;
   public final in_2 mx0;
   public final in_2 cr;
   public x7_0 Zv0;
   public final qh_1 Bo0;
   public final HashSet qq0;
   public boolean vl;
   public final in_2 bD;
   public pw_1 Aq;

   public BattleCombatLayout(Qy0 var1, a10_0 var2) {
      G20 var3;
      var3 = new G20("", "");
      this.V6 = var3;
      var3 = new G20("", "");
      this.v80 = var3;
      ak0_2[] var48 = IP;
      this.to = var48;
      this.HE0 = var48;
      this.Vs = false;
      this.ds = 0;
      this.Ss = new xe_1[0];
      this.r7 = true;
      Stack var49;
      var49 = new Stack();
      this.yK = var49;
      cn_0 var50;
      var50 = new cn_0();
      this.Vw0 = var50;
      ArrayList var51;
      var51 = new ArrayList();
      this.H20 = var51;
      LinkedList var52;
      var52 = new LinkedList();
      this.lZ = var52;
      this.BQ = null;
      in_2 var53;
      var53 = new in_2(30);
      this.mx0 = var53;
      in_2 var54;
      var54 = new in_2(1000);
      this.cr = var54;
      this.Zv0 = null;
      HashSet var55;
      var55 = new HashSet();
      this.qq0 = var55;
      this.vl = true;
      in_2 var56;
      var56 = new in_2(100);
      this.bD = var56;
      this.Aq = null;
      this.uf("battlegui");
      this.Sr0 = var1;
      this.yd0 = var2;
      qh_1 var11;
      qh_1 var10000 = var11 = new qh_1();

      this.Bo0 = var11;
      var10000.oO((java.util.function.Predicate<sc_1>)ML0::Q70);
      this.Tb0 = new jd0_1[var2.abstract$()][];
      this.z70 = new vw_0[var2.abstract$()];
      byte var12 = 0;

      while (true) {
         vw_0[] var57 = this.z70;
         if (var12 >= this.z70.length) {
            this.m5();
            this.J = new short[var2.J80(var2.Ez0())];
            ZJ var13;
            ZJ var157 = var13 = new ZJ();

            this.fE = var13;
            var157.uf("battle-text");
            le0_2 var14;
            le0_2 var158 = var14 = new le0_2();

            this.ki = var14;
            var158.uf("battle-frame");
            cn_0[] var15;
            cn_0[] var159 = var15 = new cn_0[2];
            cn_0 var58;
            var58 = new cn_0();
            var159[0] = var58;
            cn_0 var59;
            var59 = new cn_0();
            var159[1] = var59;
            this.G1 = var15;
            S70[] var16;
            S70[] var160 = var16 = new S70[2];
            S70 var60;
            var60 = new S70(32, 32, 0);
            var160[0] = var60;
            S70 var61;
            var61 = new S70(32, 32, 0);
            var160[1] = var61;
            this.JU = var16;
            if (var2.ii()) {
               byte var17 = 2;
               byte[] var62;
               byte[] var161 = var62 = new byte[2];
               var161[0] = var2.Ez0();
               var161[1] = var2.eI();

               for (int var89 = 0; var89 < var17; var89++) {
                  O8 var162 = var2.mn(var62[var89]);
                  this.G1[var89].Sk(var162.M2());
                  gt0_0 var6;
                  pi0_1 var109;
                  if (var162 instanceof pi0_1 && (var6 = (var109 = (pi0_1)var2.mn(var62[var89])).Fa()) != null) {
                     this.JU[var89].JH().Nk(new Wr[]{ob0_0.Ui0().lq0(0, var6.fF())});
                     if (tw0_0.kz0()) {
                        this.JU[var89].JH().nq0(48, 48);
                     } else {
                        this.JU[var89].JH().nq0(32, 32);
                     }

                     this.JU[var89].Xr0(var6.GJ0(var109.l20()));
                     this.JU[var89].Bb(0);
                  }
               }
            }

            cn_0 var18;
            cn_0 var163 = var18 = new cn_0();

            this.bF = var18;
            var163.qF0(pa0_0.up0);
            var163.Ll(false);
            av_1 var19 = var2.JT();
            String var20;
            if (var2.dc().aB0() && var19 != null) {
               var20 = var19.toString();
            } else {
               var20 = sm0_0.c0(5024);
            }

            cn_0 var63 = new cn_0(var20);
            this.Vd = var63;
            ae0_1[] var21;
            ae0_1[] var164 = var21 = new ae0_1[2];
            ae0_1 var64;
            var64 = new ae0_1();
            var164[0] = var64;
            ae0_1 var65;
            var65 = new ae0_1();
            var164[1] = var65;
            this.xD0 = var21;
            cn_0[] var22 = this.G1;
            int var66 = this.G1.length;

            for (int var90 = 0; var90 < var66; var90++) {
               var22[var90].Ll(false);
            }

            S70[] var23 = this.JU;
            int var67 = this.JU.length;

            for (int var91 = 0; var91 < var67; var91++) {
               var23[var91].Ll(false);
            }

            ae0_1[] var24 = this.xD0;
            int var68 = this.xD0.length;

            for (int var92 = 0; var92 < var68; var92++) {
               ae0_1 var165 = var24[var92];
               ae0_1 var110;
               ae0_1 var10001 = var110 = var24[var92];
               var24[var92].Ll(false);
               var10001.aE(1.0F);
               var165.uf("time-progressbar");
               short var120 = 200;
               byte var7;
               if (tw0_0.kz0()) {
                  var7 = 28;
               } else {
                  var7 = 18;
               }

               var110.oY(var120, var7);
            }

            fy_2 var25;
            fy_2 var166 = var25 = new fy_2();

            this.WU = var25;
            var166.ua0 = true;
            if (var2.yK() == XA0.Pb) {
               var25.uf("battle-panel-dark");
            } else {
               var25.uf("battle-panel");
            }

            var3 = new G20("", "");
            this.Vh = var3;
            var3 = new G20("", "");
            this.Xs = var3;
            var3 = new G20("", "");
            this.HJ = var3;
            var3 = new G20("", "");
            this.Ne0 = var3;
            q40_0 var73;
            q40_0 var167 = var73 = new q40_0(asBridge());

            this.kX = var73;
            var167.Ll(false);
            this.th();
            this.SL(var25);
            fy_2 var26;
            fy_2 var168 = var26 = new fy_2();

            this.Be = var26;
            var168.ua0 = true;
            var168.uf("battle-panel");
            this.iQ = new G20[4];
            short var27 = 0;

            while (true) {
               G20[] var74 = this.iQ;
               if (var27 >= this.iQ.length) {
                  if (!var2.s80()) {
                     String var76;
                     if (tw0_0.kz0() && var2.yK() != XA0.PRN) {
                        var76 = "";
                     } else {
                        var76 = sm0_0.c0(58);
                     }

                     short var93;
                     if (tw0_0.kz0()) {
                        var93 = 133;
                     } else {
                        var93 = 96;
                     }

                     short var111;
                     if (tw0_0.kz0()) {
                        var111 = 129;
                     } else {
                        var111 = 30;
                     }


                     hh0_1 var28 = new hh0_1(var76, var93, var111);
                     this.a60 = var28;
                     var28.uf("battle-button-return");
                     rx_2 var29;
                     var29 = new rx_2(asBridge(), var2);
                     var28.RR(var29);
                  } else {
                     String var77;
                     if (tw0_0.kz0()) {
                        var77 = "";
                     } else {
                        var77 = sm0_0.c0(65);
                     }

                     short var94;
                     if (tw0_0.kz0()) {
                        var94 = 133;
                     } else {
                        var94 = 96;
                     }

                     short var112;
                     if (tw0_0.kz0()) {
                        var112 = 129;
                     } else {
                        var112 = 30;
                     }


                     hh0_1 var30 = new hh0_1(var77, var94, var112);
                     this.a60 = var30;
                     var30.uf("battle-button-return");
                     var30.RR(this::GD0);
                  }

                  xe_1 var31;
                  xe_1 var170 = var31 = new xe_1(sm0_0.c0(5001));

                  this.z9 = var31;
                  var170.uf("button");
                  var170.RR(this::X10);
                  var170.Ll(false);
                  if (tw0_0.kz0() && var2.yK() != XA0.PRN) {
                     this.Be.SL(this.iQ[0]);
                     this.Be.SL(this.iQ[1]);
                     this.Be.SL(this.iQ[2]);
                     this.Be.SL(this.iQ[3]);
                  } else if (var2.eu() == Cq.yH) {
                     fy_2 var171 = this.Be;
                     I7 var187 = this.Be.H10();
                     ya_1[] var10002 = new ya_1[2];
                     Hm0 var10005 = this.Be.lo0();
                     le0_2[] var32;
                     le0_2[] var10006 = var32 = new le0_2[3];
                     var32[0] = this.iQ[0];
                     var10006[1] = this.iQ[1];
                     var10006[2] = this.v80;
                     var10002[0] = var10005.LPt3(var10006);
                     Hm0 var10004 = this.Be.lo0();
                     le0_2[] var33;
                     le0_2[] var200 = var33 = new le0_2[2];
                     var33[0] = this.iQ[2];
                     var200[1] = this.iQ[3];
                     var10002[1] = var10004.LPt3(var200);
                     var171.x40(var187.Xq(var10002));
                     fy_2 var172 = this.Be;
                     var187 = this.Be.H10();
                     var10002 = new ya_1[3];
                     Hm0 var206 = this.Be.lo0();
                     le0_2[] var34;
                     le0_2[] var10007 = var34 = new le0_2[2];
                     var34[0] = this.iQ[0];
                     var10007[1] = this.iQ[2];
                     var10002[0] = var206.LPt3(var10007);
                     var10005 = this.Be.lo0();
                     le0_2[] var35;
                     var10006 = var35 = new le0_2[2];
                     var35[0] = this.iQ[1];
                     var10006[1] = this.iQ[3];
                     var10002[1] = var10005.LPt3(var10006);
                     var10002[2] = this.Be.hb(new le0_2[]{this.v80});
                     var172.WQ(var187.Xq(var10002));
                  } else {
                     fy_2 var173 = this.Be;
                     I7 var189 = this.Be.H10();
                     ya_1[] var194 = new ya_1[2];
                     Hm0 var202 = this.Be.lo0();
                     le0_2[] var36;
                     le0_2[] var208 = var36 = new le0_2[2];
                     var36[0] = this.iQ[0];
                     var208[1] = this.iQ[1];
                     var194[0] = var202.LPt3(var208);
                     Hm0 var198 = this.Be.lo0();
                     le0_2[] var37;
                     le0_2[] var203 = var37 = new le0_2[2];
                     var37[0] = this.iQ[2];
                     var203[1] = this.iQ[3];
                     var194[1] = var198.LPt3(var203);
                     var173.x40(var189.Xq(var194));
                     fy_2 var174 = this.Be;
                     var189 = this.Be.H10();
                     var194 = new ya_1[2];
                     var202 = this.Be.lo0();
                     le0_2[] var38;
                     var208 = var38 = new le0_2[2];
                     var38[0] = this.iQ[0];
                     var208[1] = this.iQ[2];
                     var194[0] = var202.LPt3(var208);
                     var198 = this.Be.lo0();
                     le0_2[] var39;
                     le0_2[] var205 = var39 = new le0_2[2];
                     var39[0] = this.iQ[1];
                     var205[1] = this.iQ[3];
                     var194[1] = var198.LPt3(var205);
                     var174.WQ(var189.Xq(var194));
                  }

                  this.Be.Ll(false);
                  this.oe = new fy_2[var2.abstract$()];
                  this.GB = new fy_2[var2.abstract$()];
                  this.As = new S70[var2.abstract$()][6];
                  this.Gr0 = new S70[var2.abstract$()][6];

                  for (byte var40 = 0; var40 < var2.abstract$(); var40++) {
                     O8 var78;
                     if (!(var78 = var2.mn(var40)).Hb()
                        && (!tw0_0.H30() || var40 != var2.Ez0() || var2.s80() || var2.ii() || var78.Td0() != con__6.Qs && var2.eu() != Cq.Sa0)) {
                        if (var2.eu() == Cq.Jz0 && var2.J80(var78.th()) > 1) {
                           this.oe[var40] = null;
                        } else {
                           fy_2[] var175 = this.oe;
                           fy_2 var79;
                           var79 = new fy_2();
                           var175[var40] = var79;
                           this.oe[var40].uf("ball-count");
                           this.oe[var40].Ll(false);
                           fy_2[] var176 = this.GB;
                           fy_2 var80;
                           var80 = new fy_2();
                           var176[var40] = var80;
                           this.GB[var40].uf("ball-count");
                           this.GB[var40].Ll(false);
                           this.As[var40] = new S70[6];
                           this.Gr0[var40] = new S70[6];

                           for (byte var81 = 0; var81 < 6; var81++) {
                              if (tw0_0.kz0()) {
                                 S70[] var177 = this.As[var40];
                                 S70 var95;
                                 var95 = new S70(58, 58);
                                 var177[var81] = var95;
                                 this.As[var40][var81].JH().nq0(58, 58);
                                 this.As[var40][var81].JH().Gy0(4, 4);
                                 this.As[var40][var81].JH().dA(2.0F);
                                 this.As[var40][var81].JH().Dg(pa0_0.L00);
                                 S70[] var178 = this.Gr0[var40];
                                 var95 = new S70(32, 32);
                                 var178[var81] = var95;
                                 this.Gr0[var40][var81].JH().nq0(32, 32);
                                 this.Gr0[var40][var81].JH().Gy0(4, 4);
                              } else {
                                 S70[] var179 = this.As[var40];
                                 S70 var97;
                                 var97 = new S70(24, 24);
                                 var179[var81] = var97;
                                 this.As[var40][var81].JH().nq0(16, 16);
                                 this.As[var40][var81].JH().Gy0(4, 4);
                                 S70[] var180 = this.Gr0[var40];
                                 var97 = new S70(24, 24);
                                 var180[var81] = var97;
                                 this.Gr0[var40][var81].JH().nq0(16, 16);
                                 this.Gr0[var40][var81].JH().Gy0(4, 4);
                              }
                           }

                           tb0_1[] var82;
                           int var99 = (var82 = var2.mn(var40).zz()).length;

                           for (int var113 = 0; var113 < var99; var113++) {
                              this.jg0(var82[var113]);
                           }

                           fy_2 var83;
                           Hm0 var100 = (var83 = this.oe[var40]).lo0();
                           ya_1[] var114 = new ya_1[1];
                           byte var121 = 0;
                           ya_1 var125 = this.oe[var40].H10().Kn0(this.As[var40][0]);
                           byte var8;
                           if (tw0_0.kz0()) {
                              var8 = 0;
                           } else {
                              var8 = 6;
                           }

                           var125 = var125.qd(var8).Kn0(this.As[var40][1]);
                           if (tw0_0.kz0()) {
                              var8 = 0;
                           } else {
                              var8 = 6;
                           }

                           var125 = var125.qd(var8).Kn0(this.As[var40][2]);
                           if (tw0_0.kz0()) {
                              var8 = 0;
                           } else {
                              var8 = 6;
                           }

                           var125 = var125.qd(var8).Kn0(this.As[var40][3]);
                           if (tw0_0.kz0()) {
                              var8 = 0;
                           } else {
                              var8 = 6;
                           }

                           var125 = var125.qd(var8).Kn0(this.As[var40][4]);
                           if (tw0_0.kz0()) {
                              var8 = 0;
                           } else {
                              var8 = 6;
                           }

                           var114[var121] = var125.qd(var8).Kn0(this.As[var40][5]);
                           var83.WQ(var100.Xq(var114));
                           this.oe[var40]
                              .x40(
                                 this.oe[var40]
                                    .H10()
                                    .Xq(
                                       new ya_1[]{
                                          this.oe[var40]
                                             .lo0()
                                             .Kn0(this.As[var40][0])
                                             .Kn0(this.As[var40][1])
                                             .Kn0(this.As[var40][2])
                                             .Kn0(this.As[var40][3])
                                             .Kn0(this.As[var40][4])
                                             .Kn0(this.As[var40][5])
                                       }
                                    )
                              );
                           fy_2 var84;
                           Hm0 var101 = (var84 = this.GB[var40]).lo0();
                           var114 = new ya_1[1];
                           var121 = 0;
                           var125 = this.GB[var40].H10().Kn0(this.Gr0[var40][0]);
                           if (tw0_0.kz0()) {
                              var8 = 30;
                           } else {
                              var8 = 6;
                           }

                           var125 = var125.qd(var8).Kn0(this.Gr0[var40][1]);
                           if (tw0_0.kz0()) {
                              var8 = 30;
                           } else {
                              var8 = 6;
                           }

                           var125 = var125.qd(var8).Kn0(this.Gr0[var40][2]);
                           if (tw0_0.kz0()) {
                              var8 = 30;
                           } else {
                              var8 = 6;
                           }

                           var125 = var125.qd(var8).Kn0(this.Gr0[var40][3]);
                           if (tw0_0.kz0()) {
                              var8 = 30;
                           } else {
                              var8 = 6;
                           }

                           var125 = var125.qd(var8).Kn0(this.Gr0[var40][4]);
                           if (tw0_0.kz0()) {
                              var8 = 27;
                           } else {
                              var8 = 6;
                           }

                           var114[var121] = var125.qd(var8).Kn0(this.Gr0[var40][5]);
                           var84.WQ(var101.Xq(var114));
                           fy_2 var85;
                           I7 var102 = (var85 = this.GB[var40]).H10();
                           var114 = new ya_1[1];
                           var121 = 0;
                           var125 = this.GB[var40].lo0().Kn0(this.Gr0[var40][0]);
                           if (tw0_0.kz0()) {
                              var8 = 20;
                           } else {
                              var8 = 0;
                           }

                           var125 = var125.qd(var8).Kn0(this.Gr0[var40][1]);
                           if (tw0_0.kz0()) {
                              var8 = 20;
                           } else {
                              var8 = 0;
                           }

                           var125 = var125.qd(var8).Kn0(this.Gr0[var40][2]);
                           if (tw0_0.kz0()) {
                              var8 = 20;
                           } else {
                              var8 = 0;
                           }

                           var125 = var125.qd(var8).Kn0(this.Gr0[var40][3]);
                           if (tw0_0.kz0()) {
                              var8 = 20;
                           } else {
                              var8 = 0;
                           }

                           var125 = var125.qd(var8).Kn0(this.Gr0[var40][4]);
                           if (tw0_0.kz0()) {
                              var8 = 20;
                           } else {
                              var8 = 0;
                           }

                           var114[var121] = var125.qd(var8).Kn0(this.Gr0[var40][5]);
                           var85.x40(var102.Xq(var114));
                           this.SL(this.GB[var40]);
                           this.SL(this.oe[var40]);
                        }
                     } else {
                        this.oe[var40] = null;
                     }
                  }

                  fy_2 var41;
                  fy_2 var181 = var41 = new fy_2();

                  this.Wq0 = var41;
                  var181.Ll(false);
                  var181.uf("battle-panel");
                  fy_2 var42;
                  var42 = new fy_2();
                  this.TH0 = var42;
                   fy_2 var43;
                   var43 = new fy_2();
                   this.Zf0 = var43;
                   this.jb0 = new ak0_2[var2.mn(var2.Ez0()).Ms0()];
                   this.jD0 = new ak0_2[var2.mn(var2.eI()).Ms0()];

                   for (int var44 = 0; var44 < var2.abstract$(); var44++) {
                     fy_2 var86;
                     if (var44 == 0) {
                        var86 = this.TH0;
                     } else {
                        var86 = this.Zf0;
                     }

                     var86.uf("battle-panel");
                     byte var103;
                     if (var44 == 0) {
                        var103 = var2.Ez0();
                     } else {
                        var103 = var2.eI();
                     }

                     var103 = var2.mn(var103).Ms0();
                      ak0_2[] var117 = var44 == 0 ? this.jb0 : this.jD0;

                     for (byte var124 = 0; var124 < var117.length; var124++) {
                        String var155 = yr_1.pG("NAME ", var124);
                        short var9;
                        if (tw0_0.kz0()) {
                           var9 = 300;
                        } else {
                           var9 = 225;
                        }

                        byte var10;
                        if (tw0_0.kz0()) {
                           var10 = 80;
                        } else {
                           var10 = 54;
                        }


                        ga_2 var140 = new ga_2(asBridge(), var155, var9, var10, var124);
                        var117[var124] = var140;
                        if (var44 == 0) {
                           var155 = "battle-button";
                        } else {
                           var155 = "battle-button-enemy";
                        }

                        var140.uf(var155);
                        var117[var124].qF0(pa0_0.up0);
                        if (var44 == 0) {
                           final byte buttonIndex = var124;
                           final ak0_2[] buttons = var117;
                           final fy_2 panel = var86;
                           var117[var124].RR(() -> this.VA(buttons, buttonIndex, var2, panel));
                        }
                     }

                      if (var117.length == 0) {
                         var86.Ll(false);
                         continue;
                      }

                      if (var103 == 3 && var117.length == 3) {
                         var86.x40(var86.H10().Xq(new ya_1[]{var86.lo0().LPt3(new le0_2[]{var117[0], var117[1], var117[2]})}));
                         I7 var191 = var86.H10();
                         ya_1[] var105;
                         ya_1[] var196 = var105 = new ya_1[3];
                         var105[0] = var86.lo0().LPt3(new le0_2[]{var117[0]});
                         var105[1] = var86.lo0().LPt3(new le0_2[]{var117[1]});
                         var196[2] = var86.lo0().LPt3(new le0_2[]{var117[2]});
                         var86.WQ(var191.Xq(var196));
                      } else if (var117.length < 6) {
                         le0_2[] var198 = var117;
                         var86.x40(var86.H10().Xq(new ya_1[]{var86.lo0().LPt3(var198)}));
                         I7 var199 = var86.H10();
                         ya_1[] var200 = new ya_1[var117.length];
                         for (int var201 = 0; var201 < var117.length; var201++) {
                            var200[var201] = var86.lo0().LPt3(new le0_2[]{var117[var201]});
                         }
                         var86.WQ(var199.Xq(var200));
                      } else {
                        var86.x40(
                           var86.H10()
                              .Xq(
                                 new ya_1[]{
                                    var86.lo0().LPt3(new le0_2[]{var117[0], var117[1], var117[2]}),
                                    var86.lo0().LPt3(new le0_2[]{var117[3], var117[4], var117[5]})
                                 }
                              )
                        );
                        I7 var192 = var86.H10();
                        ya_1[] var106;
                        ya_1[] var197 = var106 = new ya_1[3];
                        var106[0] = var86.lo0().LPt3(new le0_2[]{var117[0], var117[3]});
                        var106[1] = var86.lo0().LPt3(new le0_2[]{var117[1], var117[4]});
                        var197[2] = var86.lo0().LPt3(new le0_2[]{var117[2], var117[5]});
                        var86.WQ(var192.Xq(var197));
                     }

                     var86.Ll(false);
                  }

                  String var87 = "NAME";
                  short var107;
                  if (tw0_0.kz0()) {
                     var107 = 300;
                  } else {
                     var107 = 225;
                  }

                  byte var118;
                  if (tw0_0.kz0()) {
                     var118 = 80;
                  } else {
                     var118 = 54;
                  }


                  ak0_2 var45 = new ak0_2(var87, var107, var118);
                  this.EG = var45;
                  var45.uf("battle-button");
                  var45.qF0(pa0_0.up0);
                  xe_1 var88;
                  xe_1 var182 = var88 = new xe_1(sm0_0.c0(2300));

                  var182.RR(this::Ir);
                  xe_1 var108;
                  xe_1 var183 = var108 = new xe_1(sm0_0.c0(5102));

                  this.JC0 = var108;
                  var183.RR(this::bF0);
                  xe_1[] var119;
                  xe_1[] var184 = var119 = new xe_1[2];
                  var184[0] = var88;
                  var184[1] = var108;
                  this.Yc = var119;
                  this.Wq0.x40(this.Wq0.H10().Xq(new ya_1[]{this.Wq0.hb(new le0_2[]{var45}), this.Wq0.hb(new le0_2[]{var88, var108})}));
                  this.Wq0.WQ(this.Wq0.lo0().Xq(new ya_1[]{this.Wq0.H10().Ze0().LPt3(new le0_2[]{var45}).Ze0(), this.Wq0.H10().Kn0(var88).Ze0().Kn0(var108)}));
                  this.TH0.Ll(false);
                  this.WU.Oq0(true);
                  tk0_0 var46;
                  tk0_0 var185 = var46 = new tk0_0();

                  this.ri0 = var46;
                  var185.uf("battle-panel");
                  var185.Ll(false);
                  this.B7();
                  if (var2.ii()) {
                     this.SL(this.ki);
                     this.SL(this.bF);
                     this.SL(this.Vd);
                     this.SL(this.JU[0]);
                     this.SL(this.G1[0]);
                     this.SL(this.JU[1]);
                     this.SL(this.G1[1]);
                     this.G1[0].Ll(false);
                     this.G1[1].Ll(false);
                  }

                  if (var2.T2()) {
                     this.SL(this.xD0[0]);
                     this.SL(this.xD0[1]);
                  }

                  if (tw0_0.H30() || var2.yK() == XA0.PRN) {
                     this.SL(this.Be);
                     this.SL(this.TH0);
                     this.SL(this.kX);
                     this.SL(var46);
                     this.SL(this.Wq0);
                  }

                  this.SL(this.fE);
                  this.SL(this.z9);
                  this.SL(this.a60);
                  if (tw0_0.kz0()) {
                     this.SL(this.v80);
                  }

                  this.X60(false);
                  this.H5(true, false);
                  this.H5(false, false);
                  return;
               }

               zn_1 var75;
               var75 = new zn_1(asBridge(), var27);
               var74[var27] = var75;
               this.iQ[var27].uf("battle-move-button");
               this.iQ[var27].Bb(250);
               this.iQ[var27].qF0(pa0_0.up0);
                final short moveIndex = var27;
                this.iQ[var27].RR(() -> this.UE(var2, moveIndex));
               var27++;
            }
         }

         boolean var5;
         if (var12 == var2.eI()) {
            var5 = true;
         } else {
            var5 = false;
         }


         vw_0 var4 = new vw_0(var5);
         var57[var12] = var4;
         this.SL(this.z70[var12]);
         var12++;
      }
   }

   public static double Ue(a10_0 var0, PF var1, PF var2, vk0_1 var3) {
      if (var3.hC0 == 485 && !var2.y3(var1.J50()) && !var2.y3(var1.fE())) {
         return 0.0;
      }

      i40_0 var13 = var3.oG(var1.zi0.Bn, null);
      short var14;
      if ((var14 = var1.Ql()) == 96) {
         var13 = i40_0.c90;
      }

      i40_0 var4;
      i40_0 var5;
      boolean var6;
      double[] var8;
      double var9;
      double var16;
      label97: {
         i40_0 var18 = var4 = var2.J50();
         var5 = var2.fE();
         var6 = var0.gD0(gw0_0.lV);
         var13.getClass();
         byte var7;
         byte var19 = var7 = var18.j40;
         var8 = var13.eI0;
         if (var19 < var13.eI0.length) {
            var9 = var8[var7];
            if (!var6) {
               break label97;
            }

            if (var9 < 1.0) {
               var9 = 2.0;
               break label97;
            }

            if (var9 > 1.0) {
               var9 = 0.5;
               break label97;
            }
         }

         var9 = 1.0;
      }

      label88: {
         byte var17 = var5.j40;
         if (var5.j40 < var8.length) {
            var16 = var8[var17];
            if (!var6) {
               break label88;
            }

            if (var16 < 1.0) {
               var16 = 2.0;
               break label88;
            }

            if (var16 > 1.0) {
               var16 = 0.5;
               break label88;
            }
         }

         var16 = 1.0;
      }

      if ((var14 == 113 || var2.fl0) && (var13 == i40_0.tJ || var13 == i40_0.c90)) {
         i40_0 var15 = i40_0.z2;
         if (var4 == i40_0.z2) {
            var9 = 1.0;
         }

         if (var5 == var15) {
            var16 = 1.0;
         }
      }

      if ((var2.AF0 || var2.hS || var2.uV || var0.gD0(gw0_0.cOm9)) && var13 == i40_0.yC) {
         i40_0 var11 = i40_0.cJ0;
         if (var4 == i40_0.cJ0) {
            var9 = 1.0;
         }

         if (var5 == var11) {
            var16 = 1.0;
         }
      }

      if (var2.f50 && var13 == i40_0.Kt) {
         i40_0 var12 = i40_0.Us0;
         if (var4 == i40_0.Us0) {
            var9 = 1.0;
         }

         if (var5 == var12) {
            var16 = 1.0;
         }
      }

      return var9 * var16;
   }

   public static boolean qx0(PF var0) {
      se_0 var1;
      return (var1 = var0.zi0).Bj() && var1.jx == 2;
   }

   public static CH0[] P9(int var0) {
      return new CH0[var0];
   }

   public static void Pv0(jd0_1 var0) {
      var0.Hm(false);
   }

   public static void yt0(String var0, String var1) {
      if (!var0.isEmpty()) {
         tw0_0.rl.jC(var1.length() > 0 ? var1 : var0, zo_0.n4);
      }
   }

   public static void Ip0(String var0, String var1) {
      if (!var0.isEmpty()) {
         tw0_0.rl.jC(var1.isEmpty() ? var0 : var1, zo_0.n4);
      }
   }

   public static void kP(dl_2 var0) {
      tw0_0.rl.fk0.uQ(new B00());
   }

   public static boolean Ga0(dl_2 var0) {
      byte var1 = 5;
      return var0.Ui0 && var0.VS - (int)(System.currentTimeMillis() / 1000L - var0.V1) + var1 < 1;
   }

   public static boolean VK(dl_2 var0, dl_2 var1) {
      return var0 != var1;
   }

   public static void wq0() {
      BR var10000 = tw0_0.rl;
      String var0 = "//winbattle";
      tw0_0.rl.getClass();
      var10000.Cp(zo_0.Pk, var0, "", true);
   }

   public static boolean Q70(sc_1 var0) {
      int var1 = var0.a.i00.Y1;
      return var1 >= 0 && var1 <= 4;
   }

   public final void ty0() {
      N60 var1 = this.BQ;
      if (this.BQ != null && var1.NJ()) {
         dl_1 var10000 = Ed0;
         Object[] var10002 = new Object[]{this.BQ, this.nC0(), this.lZ.isEmpty() ^ true, null};
         RuntimeException var2;
         var2 = new RuntimeException();
         var10002[3] = var2;
         var10000.error("Frozen Render Entry: {} isBusy: {} hasMore: {}", var10002);
         if (tw0_0.Eu(1)) {
            this.Sr0.dk(-1, sm0_0.c0(5035));
         }

         this.BQ = null;
      }
   }

   public final void rg0() {
      if (this.Ne0 == null) {
         G20 var1;
         var1 = new G20("", "");
         this.Ne0 = var1;
      }

      boolean var6;
      label36: {
         label35: {
            this.Ne0.ER.Fc0 = null;
            O8 var4;
            if ((var4 = this.yd0.mn(this.yd0.eI())).Td0() != con__6.Qs && var4.Td0() != con__6.Wt0) {
               XA0 var5 = this.yd0.Sv;
               if (this.yd0.Sv != XA0.af0 && var5 != XA0.Fz) {
                  break label35;
               }
            }

            if (!this.yd0.Cd0()) {
               var6 = true;
               break label36;
            }
         }

         var6 = false;
      }

      G20 var2;
      String var3;
      label26: {
         if (var6) {
            this.Ne0.SU(sm0_0.c0(5116));
            var2 = this.Ne0;
            if (!tw0_0.kz0()) {
               var3 = sm0_0.c0(5117);
               break label26;
            }
         } else {
            this.Ne0.SU(sm0_0.c0(5106));
            var2 = this.Ne0;
            if (!tw0_0.kz0()) {
               var3 = sm0_0.c0(5107);
               break label26;
            }
         }

         var3 = "";
      }

      var2.Pc(var3);
      this.Ne0.uf("battle-run");
      boolean canRun = var6;
      this.Ne0.RR(() -> this.eC0(canRun));
   }

   public final void IE() {
      a10_0 var1 = this.yd0;
      if (this.yd0.Sv != XA0.Pb) {
         PF var2 = null;
         if (this.xT != null) {
            var2 = var1.Ce(var1.Ez0(), this.xT.B6);
         }

         if (this.HJ == null) {
            G20 var3;
            var3 = new G20("", "");
            this.HJ = var3;
         }

         this.HJ.ER.Fc0 = null;
         short var4;
         if (var2 != null && ((var4 = var2.p10()) >= 1003 && var4 <= 1018 || var4 >= 1029 && var4 <= 1046)) {
            var1 = this.yd0;
            if (!this.yd0.m40 && !var1.dJ && !var1.Cd0()) {
               RJ0 var10000 = tw0_0.rl.Bb(tw0_0.rl.u40);
               byte var6 = 1;
               if (var10000.Dj0((byte)-1, (short)1287, var6)) {
                  this.HJ.SU(sm0_0.c0(5122));
                  G20 var13 = this.HJ;
                  String var18;
                  if (tw0_0.kz0()) {
                     var18 = "";
                  } else {
                     var18 = sm0_0.c0(5123);
                  }

                  var13.Pc(var18);
                  this.HJ.uf("battle-shift");
                   b30_0 var14 = this.xT;
                   this.HJ.RR(() -> this.q1(var14));
                  return;
               }
            }
         }

         var1 = this.yd0;
         if (!this.yd0.dJ && !var1.Cd0()) {
            this.HJ.SU(sm0_0.c0(5120));
            G20 var12 = this.HJ;
            String var17;
            if (tw0_0.kz0()) {
               var17 = "";
            } else {
               var17 = sm0_0.c0(5121);
            }

            var12.Pc(var17);
            this.HJ.uf("battle-shift");
            this.HJ.RR(this::IE0);
         } else {
            this.HJ.SU(sm0_0.c0(5104));
            var1 = this.yd0;
            if (this.yd0.qn0 >= 0) {
               byte var9 = var1.eG[var1.Ez0()].L40(var1.AD).sR;
               if (tw0_0.kz0()) {
                  this.HJ.SU(this.HJ.U4 + " (" + var9 + ")");
               } else {
                  this.HJ.Pc(sm0_0.wa0(5127, String.valueOf(var9)));
               }
            } else {
               G20 var10 = this.HJ;
               String var15;
               if (tw0_0.kz0()) {
                  var15 = "";
               } else {
                  var15 = sm0_0.c0(5105);
               }

               var10.Pc(var15);
            }

            this.HJ.uf("battle-bag");
            q40_0 var11;
            List var16;
            if (this.yd0.Cd0()) {
               q40_0 var19 = var11 = this.kX;
               var16 = Collections.singletonList(l5_0.hB);
               var19.getClass();
               if (var16.isEmpty()) {
                  throw new IllegalStateException();
               }
            } else {
               q40_0 var20 = var11 = this.kX;
               var16 = Arrays.asList(l5_0.qk0);
               var20.getClass();
               if (var16.isEmpty()) {
                  throw new IllegalStateException();
               }
            }

            var11.l6 = var16;
            this.HJ.RR(this::Tx0);
         }
      }
   }

   public final void IE0() {
      if (this.u20()) {
         a10_0 var1 = this.yd0;
         if (!this.yd0.a40) {
            x7_0 var2 = this.Zv0;
            if (this.Zv0 == null) {
               if (var2 == null) {
                  x7_0 var3;
                  x7_0 var10003 = var3 = new x7_0(var1);

                  this.Zv0 = var10003;
                  this.F9(this.fU(), var3);
               }
            } else if (var2 != null && !var2.cB) {
               this.u3(var2);
               this.Zv0.dispose();
               this.Zv0 = null;
            }

            return;
         }
      }
   }

   public final void q1(b30_0 var1) {
      if (this.u20() && !this.yd0.a40) {
         Qy0 var10000 = Qy0.yI0;
         String var3 = sm0_0.wa0(1435, sm0_0.c0(101641));
         Runnable var4 = () -> {
            oj_2 var2x;
            var2x = new oj_2(var1);
            this.rY(var2x);
         };
         G20 var2 = this.HJ;
         lpt3__4 var10001 = new lpt3__4(var3, var4, var2);
         var10001.D80 = true;
         var10000.sr0(var10001);
      }
   }

   public final void RB(b30_0 var1) {
      this.rY(new oj_2(var1));
   }

   public final void eC0(boolean var1) {
      if (this.u20()) {
         if (this.xT != null) {
            a10_0 var2 = this.yd0;
            if (!this.yd0.ci0) {
               this.wJ(var2.mn(var2.eI()).Zc(), "", null);
               this.zG();
               this.Be.Ll(false);
               this.ke();
               this.Ck0(false);
               return;
            }

            O8 var9;
            if (!(var9 = var2.mn(var2.eI())).Sw()) {
               this.wJ(var9.Zc(), "", null);
               this.zG();
               this.Be.Ll(false);
               this.ke();
               this.Ck0(false);
               return;
            }

            if (var1) {
               Qy0 var15 = Qy0.yI0;
               lpt3__4 var16 = new lpt3__4(sm0_0.c0(5039), () -> {
                  oj_2 var1x;
                  var1x = new oj_2(this.xT, kt_2.nz0);
                  this.rY(var1x);
               }, this.Ne0);
               var16.D80 = true;
               var15.sr0(var16);
               return;
            }

            con__6 var10000 = var9.Td0();
            con__6 var6 = con__6.pn0;
            if (var10000 == con__6.pn0) {
               String var10 = null;
               if (this.yd0.ni0(this.yd0.eI()) > 0) {
                  var10 = sm0_0.c0(5046);
               }

               a10_0 var3;
               a10_0 var13 = var3 = this.yd0;
               byte var4 = this.yd0.eI();
               if (var13.eG[var4].Td0() == var6 && var3.Sv != XA0.af0) {
                  PF[] var7;
                  int var11 = (var7 = var3.wI0[var4]).length;

                  for (int var12 = 0; var12 < var11; var12++) {
                     PF var5;
                     if ((var5 = var7[var12]) != null && !var5.zi0.hf0() && S.BA(var5.p10(), tw0_0.rl.Pa) >= 0) {
                        var10 = sm0_0.c0(5064);
                        break;
                     }
                  }
               }

               if (this.yd0.Cd0()) {
                  var10 = sm0_0.c0(5076);
               }

               if (var10 != null) {
                  Qy0 var14 = Qy0.yI0;
                  lpt3__4 var10001 = new lpt3__4(var10, () -> {
                     oj_2 var1x;
                     var1x = new oj_2(this.xT, kt_2.nC);
                     this.rY(var1x);
                  }, this.Ne0);
                  var10001.D80 = true;
                  var14.sr0(var10001);
                  return;
               }
            }

            oj_2 var8;
            var8 = new oj_2(this.xT, kt_2.nC);
            this.rY(var8);
         }
      }
   }

   public final void L0() {
      this.rY(new oj_2(this.xT, kt_2.nC));
   }

   public final void Be() {
      this.rY(new oj_2(this.xT, kt_2.nz0));
   }

   public final void Em0() {
      pw_1 var1 = this.Aq;
      if (this.Aq != null) {
         var1.w6 = true;
         this.Aq = null;
      }

      this.WU.Ll(true);
      lpt6__0.v90(this.Yy0());
      pa0_0 var10001 = pa0_0.xE;
      G20 var10002 = this.Vh;
      int var5 = tw0_0.LD0.Hv0();
      hh_0.ej0(var10001, var10002, 10, tw0_0.LD0.ew0(), var5);
      pa0_0 var6;
      var10001 = var6 = pa0_0.L00;
      G20 var10006 = this.Xs;
      int var2 = tw0_0.LD0.Hv0();
      hh_0.ej0(var6, var10006, 0, tw0_0.LD0.ew0(), var2);
      G20 var10004 = this.V6;
      var2 = tw0_0.LD0.Hv0();
      hh_0.ej0(var6, var10004, 0, tw0_0.LD0.ew0(), var2);
      qh_1 var15 = this.Bo0;
      var2 = tw0_0.LD0.Hv0();
      hh_0.ej0(var10001, var15, 0, tw0_0.LD0.ew0(), var2);
      G20 var9 = this.t6;
      if (this.t6 != null) {
         var2 = tw0_0.LD0.Hv0();
         hh_0.ej0(var6, var9, 0, tw0_0.LD0.ew0(), var2);
      }

      pa0_0 var16 = pa0_0.up0;
      G20 var10003 = this.Ne0;
      int var3 = tw0_0.LD0.Hv0();
      hh_0.ej0(var16, var10003, 0, tw0_0.LD0.ew0(), var3);
      G20 var14 = this.HJ;
      int var4 = tw0_0.LD0.Hv0();
      hh_0.ej0(var6, var14, 0, tw0_0.LD0.ew0(), var4);
   }

   public final void dI0() {
      int var1 = tw0_0.LD0.ew0();
      int var2 = tw0_0.LD0.Hv0();
      hh_0.JW(pa0_0.xE, this.Vh, var1, var2, null);
      hh_0.JW(pa0_0.L00, this.Xs, var1, var2, null);
      hh_0.JW(pa0_0.L00, this.V6, var1, var2, null);
      hh_0.JW(pa0_0.L00, this.Bo0, var1, var2, null);
      if (this.t6 != null) {
         hh_0.JW(pa0_0.L00, this.t6, var1, var2, null);
      }

      hh_0.JW(pa0_0.up0, this.Ne0, var1, var2, null);
      this.Aq = hh_0.JW(pa0_0.up0, this.HJ, var1, var2, this::Z6);
   }

   public final void Z6(int var1, D2 var2) {
      this.WU.Ll(false);
   }

   public final void mQ(PF var1) {
      this.Tb0[var1.cD0][var1.Kj0].Hm(false);
   }

   public final boolean He0(VU var1) {
      return var1 != null && !this.yK.contains(var1);
   }

   public final void hk(byte var1) {
      jn_0 var2 = tw0_0.LD0;
      Oz0 var6;
      if (tw0_0.LD0 != null && (var6 = var2.he0) != null) {
         var6.ph();
      }

      this.rY(new oj_2(this.xT, kt_2.Nk0, (short)var1));
      this.B7();
   }

   public final void lI() {
      this.rY(new oj_2(this.xT, kt_2.Bq));
   }

   public final void V20() {
      this.rY(new oj_2(this.xT, kt_2.Zk0));
   }

   public final void Hl0() {
      this.rY(new oj_2(this.xT, kt_2.An));
   }

   public final void Lk0() {
      this.rY(new oj_2(this.xT, kt_2.eM));
   }

   public final void p1() {
      if (this.u20()) {
         jn_0 var1 = tw0_0.LD0;
         Oz0 var2;
         if (tw0_0.LD0 != null && (var2 = var1.he0) != null) {
            var2.ph();
         }

         this.Zo();
         this.Vs = false;
         this.eA0();
      }
   }

   public final void Is() {
      if (this.u20()) {
         jn_0 var1 = tw0_0.LD0;
         Oz0 var2;
         if (tw0_0.LD0 != null && (var2 = var1.he0) != null) {
            var2.ph();
         }

         this.Zo();
         this.Vs = false;
         this.FU();
         if (tw0_0.kz0()) {
            this.ke();
            NN var3;
            NN var10008 = var3 = new NN(this.TH0);

            this.Hd = var10008;
            this.F9(this.fU(), var3);
            this.u3(this.a60);
            hh0_1 var4 = this.a60;
            this.F9(this.fU(), var4);
         }

         this.TH0.Ll(true);
         this.Bl0(this.jb0, 3, false, true);
      }
   }

   public final void WJ0() {
      b30_0 var1 = this.xT;
      boolean var16;
      if (this.xT != null) {
         byte var2 = var1.Pp0;
         PF var8;
         if ((var8 = this.yd0.Ce(var2, var1.B6)) != null) {
            if (this.yd0.Sv == XA0.pS) {
               oj_2 var7;
               var7 = new oj_2(this.xT, kt_2.ue, (short)-1);
               this.rY(var7);
            } else {
               jn_0 var3 = tw0_0.LD0;
               Oz0 var18;
               if (tw0_0.LD0 != null && (var18 = var3.he0) != null) {
                  var18.ph();
               }

               this.Zo();
               this.r60(var8);
               this.Be.Ll(true);
               if (tw0_0.kz0()) {
                  this.ke();
                  NN var9;
                  NN var10000 = var9 = new NN(this.Be);

                  this.Hd = var9;
                  var10000.Ll(false);
                  NN var10 = this.Hd;
                  this.F9(this.fU(), var10);
                  this.u3(this.a60);
                  hh0_1 var11 = this.a60;
                  this.F9(this.fU(), var11);
                  if (this.yd0.nf == Cq.yH) {
                     this.u3(this.v80);
                     G20 var12 = this.v80;
                     this.F9(this.fU(), var12);
                  }
               }

               a10_0 var13 = this.yd0;
               Cq var19 = this.yd0.nf;
               Cq var4 = Cq.yH;
               if (this.yd0.nf == Cq.yH) {
                  G20 var5;
                  label42: {
                     var5 = this.v80;
                     if (!var13.a40 && var19 == var4) {
                        var2 = var13.Ez0();
                        PF[] var15;
                        if ((var15 = var13.wI0[var2])[2] != null || var15[0] != null) {
                           var16 = true;
                           break label42;
                        }
                     }

                     var16 = false;
                  }

                  var5.Ll(var16);
               }

               var2 = 2;
               this.Bl0(this.iQ, var2, false, true);
               short var6 = this.J[var1.B6];
               this.tG0 = var6;
               lpt6__0.v90(this.iQ[var6]);
               if (tw0_0.kz0()) {
                  lg_0.k.lPT5(this::gX);
               }
            }
         }
      }
   }

   public final void gX() {
      this.Hd.Ll(true);
      lpt6__0.v90(this.Yy0());
      G20[] var1 = this.iQ;
      int var2 = this.iQ.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1[var3].lt0();
      }

      pa0_0 var10 = pa0_0.xE;
      byte var12 = 2;
      le0_2[] var14;
      le0_2[] var10000 = var14 = new le0_2[2];
      var14[0] = this.iQ[0];
      var10000[1] = this.iQ[2];

      for (int var4 = 0; var4 < var12; var4++) {
         le0_2 var5;
         le0_2 var10001 = var5 = var14[var4];
         byte var6 = 0;
         int var7 = var10001.K20.Mx;
         int var8 = var10001.K20.OB;
         hh_0.ej0(var10, var5, var6, var7, var8);
      }

      pa0_0 var11 = pa0_0.up0;
      var12 = 2;
      var10000 = var14 = new le0_2[2];
      var14[0] = this.iQ[1];
      var10000[1] = this.iQ[3];

      for (int var9 = 0; var9 < var12; var9++) {
         le0_2 var16;
         le0_2 var22 = var16 = var14[var9];
         byte var17 = 0;
         int var18 = var22.K20.Mx;
         int var19 = var22.K20.OB;
         hh_0.ej0(var11, var16, var17, var18, var19);
      }
   }

   public final void ZM(b30_0 var1) {
      jn_0 var2 = tw0_0.LD0;
      Oz0 var12;
      if (tw0_0.LD0 != null && (var12 = var2.he0) != null) {
         var12.ph();
      }

      b30_0 var13 = this.xT;
      if (this.xT != null) {
         vk0_1 var14;
         if ((var14 = this.LpT6[this.J[var13.B6]]) != null) {
            O8 var3 = this.yd0.mn(this.yd0.eI());
            byte var4 = this.yd0.eI();
            boolean var5;
            if (this.yd0.nf == Cq.yH) {
               var5 = true;
            } else {
               var5 = false;
            }

            if (var3.Td0() == con__6.pn0) {
               XA0 var15 = this.yd0.Sv;
               if (this.yd0.Sv != XA0.af0 && var15 != XA0.Fz && var14.lr0() && var14.X00 > 0 && this.yd0.ni0(var4) >= 1) {
                  int var16 = 0;
                  PF[] var19;
                  int var6 = (var19 = this.yd0.wI0[var4]).length;

                  for (int var7 = 0; var7 < var6; var7++) {
                     PF var8;
                     if ((var8 = var19[var7]) != null && !var8.zi0.hf0()) {
                        var16++;
                     }
                  }

                  if (var16 > 1) {
                     String var17 = null;
                      if (this.H20.stream().anyMatch(entry -> this.rV((b30_0)entry))) {
                        var17 = sm0_0.c0(5047);
                     }

                     if (var17 != null) {
                        Qy0 var21 = Qy0.yI0;
                         Runnable var10 = () -> this.rQ(var5, var14, var1);
                        lpt3__4 var10001 = new lpt3__4(var17, var10, this.Ne0);
                        var10001.D80 = true;
                        var21.sr0(var10001);
                        return;
                     }
                  }
               }
            }

            this.rY(new oj_2(var5 ? this.Ru : this.xT, var14.hC0, var1.bG()));
         }
      }
   }

   public final void rQ(boolean var1, vk0_1 var2, b30_0 var3) {
      this.rY(new oj_2(var1 ? this.Ru : this.xT, var2.hC0, var3.bG()));
   }

   public final boolean rV(b30_0 var1) {
      PF var2;
      return (var2 = this.yd0.wI0[var1.Pp0][var1.B6]) != null && var2.zi0.Bn.I() && !var2.zi0.hf0();
   }

   public final void Ir() {
      VU var1 = this.EG.hy;
      if (this.EG.hy != null) {
         if (BU.T50 != null) {
            this.ke();
            this.Wq0.Ll(false);
            this.TH0.Ll(false);
            this.zG();
            xe_1[] var2 = this.L1;
            int var3;
            if (tw0_0.kz0()) {
               var3 = this.L1.length;
            } else {
               var3 = 3;
            }

            this.Bl0(var2, var3, false, true);
            BU.T50.FI(var1, this.Vh, qo_1.DL, false);
         }
      }
   }

   public final void VA(ak0_2[] var1, byte var2, a10_0 var3, fy_2 var4) {
      if (this.BF0) {
         VU var10;
         if ((var10 = var1[var2].hy) != null && !this.yK.contains(var10)) {
            this.yK.add(var10);
            this.EE();
         }
      } else {
         this.Pq = (byte)var2;
         if (tw0_0.kz0() && !this.Vs) {
            this.ke();
            NN var5;
            var5 = new NN(this.Wq0);
            this.Hd = var5;
            this.F9(this.fU(), var5);
            this.u3(this.a60);
            hh0_1 var6 = this.a60;
            this.F9(this.fU(), var6);
            ak0_2 var7;
            VU var11;
            if ((var11 = (var7 = var1[var2]).hy) == null) {
               this.EG.W(var7.F9);
            } else {
               xe_1 var8 = this.JC0;
               boolean var13;
               if (var11.I8.VD > 0 && var3.nd0(var11.pu) == null) {
                  var13 = true;
               } else {
                  var13 = false;
               }

               var8.pw0(var13);
               this.EG.ih(var11);
            }

            var4.Ll(false);
            this.Wq0.Ll(true);
            xe_1[] var9 = this.Yc;
            this.Bl0(var9, this.Yc.length, false, true);
            lpt6__0.v90(this.Yy0());
         } else {
            this.bF0();
         }
      }
   }

   public final void X10() {
      if (this.cr.ty0()) {
         tw0_0.rl.fk0.uQ(new B00());
      }
   }

   public final void UE(a10_0 var1, short var2) {
      jn_0 var3 = tw0_0.LD0;
      Oz0 var46;
      if (tw0_0.LD0 != null && (var46 = var3.he0) != null) {
         var46.ph();
      }

      boolean var47;
      if (var1.nf == Cq.yH) {
         var47 = true;
      } else {
         var47 = false;
      }

      b30_0 var4;
      if (var47) {
         var4 = this.Ru;
      } else {
         var4 = this.xT;
      }

      if (var4 != null) {
         vk0_1 var5;
         short var68;
         if ((var5 = this.LpT6[var2]) == null || (var68 = var5.hC0) == 0) {
            return;
         }

         if (var68 != 165) {
            byte var69 = var4.Pp0;
            PF var70;
            if ((var70 = var1.Ce(var69, var4.B6)) == null) {
               return;
            }

            short var6 = var70.zi0.T0;
            mc0_1 var72;
            if (var70.zi0.T0 > 0) {
               var72 = gu0.l2.lPT6(var6);
            } else {
               var72 = null;
            }

            if (var70.um0()[var2] < 1) {
               lpt6__2 var93 = lpt6__2.Q80;
               byte var30 = 15;
               int var44 = 82;
               String[] var58 = new String[0];
               this.wJ(sm0_0.fg0((byte)2, var93, var30, var44, var58), "", null);
               this.zG();
               this.Be.Ll(false);
               this.ke();
               xe_1[] var31 = this.L1;
               if (tw0_0.kz0()) {
                  var44 = this.L1.length;
               } else {
                  var44 = 3;
               }

               this.Bl0(var31, var44, false, true);
               return;
            }

            if (var70.cf0 && this.LpT6[var2].X00 < 1) {
               lpt6__2 var92 = lpt6__2.Q80;
               byte var28 = 14;
               short var57 = 571;
               String[] var67;
               String[] var101 = var67 = new String[2];
               var101[0] = var70.A60();
               var101[1] = sm0_0.c0(this.LpT6[var2].bt);
               this.wJ(sm0_0.fg0((byte)2, var92, var28, var57, var67), "", null);
               this.zG();
               this.Be.Ll(false);
               this.ke();
                xe_1[] var29 = this.L1;
                this.Bl0(var29, tw0_0.kz0() ? this.L1.length : 3, false, true);
               return;
            }

            if (var70.Yo && this.LpT6[var2].hC0 == var70.qo0) {
               lpt6__2 var91 = lpt6__2.Q80;
               byte var26 = 14;
               short var56 = 580;
               String[] var66;
               String[] var100 = var66 = new String[2];
               var100[0] = var70.A60();
               var100[1] = sm0_0.c0(this.LpT6[var2].bt);
               this.wJ(sm0_0.fg0((byte)2, var91, var26, var56, var66), "", null);
               this.zG();
               this.Be.Ll(false);
               this.ke();
                xe_1[] var27 = this.L1;
                this.Bl0(var27, tw0_0.kz0() ? this.L1.length : 3, false, true);
               return;
            }

            short var7 = this.LpT6[var2].hC0;
            if (var70.S20 == this.LpT6[var2].hC0) {
               lpt6__2 var90 = lpt6__2.Q80;
               byte var24 = 14;
               short var55 = 595;
               String[] var65;
               String[] var99 = var65 = new String[2];
               var99[0] = var70.A60();
               var99[1] = sm0_0.c0(this.LpT6[var2].bt);
               this.wJ(sm0_0.fg0((byte)2, var90, var24, var55, var65), "", null);
               this.zG();
               this.Be.Ll(false);
               this.ke();
                xe_1[] var25 = this.L1;
                this.Bl0(var25, tw0_0.kz0() ? this.L1.length : 3, false, true);
               return;
            }

            short var8 = var70.EH0;
            if (var70.EH0 > 0 && var8 != var7) {
               String var22 = sm0_0.c0(gu0.l2.lPT6(var70.FF).Nl);
               String var38 = "";
               ec0_2 var87 = ec0_2.Sx();
               short var53 = var70.EH0;
               if ((vk0_1)var87.f4.f5(var53) != null) {
                  var87 = ec0_2.Sx();
                  short var39 = var70.EH0;
                  var38 = sm0_0.c0(((vk0_1)var87.f4.f5(var39)).bt);
               }

               lpt6__2 var89 = lpt6__2.Q80;
               byte var54 = 15;
               byte var64 = 99;
               String[] var71;
               String[] var98 = var71 = new String[2];
               var98[0] = var22;
               var98[1] = var38;
               this.wJ(sm0_0.fg0((byte)2, var89, var54, var64, var71), "", null);
               this.zG();
               this.Be.Ll(false);
               this.ke();
                xe_1[] var23 = this.L1;
                this.Bl0(var23, tw0_0.kz0() ? this.L1.length : 3, false, true);
               return;
            }

            if (var1.gD0(gw0_0.cOm9) && this.LpT6[var2].Ro(512)) {
               lpt6__2 var86 = lpt6__2.Q80;
               byte var20 = 14;
               int var52 = this.yd0.QX(1086, var70);
               String[] var63;
               String[] var97 = var63 = new String[2];
               var97[0] = var70.nz0(true);
               var97[1] = sm0_0.c0(this.LpT6[var2].bt);
               this.wJ(sm0_0.fg0((byte)2, var86, var20, var52, var63), "", null);
               this.zG();
               this.Be.Ll(false);
               this.ke();
                xe_1[] var21 = this.L1;
                this.Bl0(var21, tw0_0.kz0() ? this.L1.length : 3, false, true);
               return;
            }

            vk0_1 var75;
            if (var70.G90 && ((var75 = this.LpT6[var2]).zQ > 0 || var75.sw > 0 || var75.Ro(4096))) {
               lpt6__2 var85 = lpt6__2.Q80;
               byte var18 = 14;
               short var51 = 890;
               String[] var62;
               String[] var96 = var62 = new String[2];
               var96[0] = var70.A60();
               var96[1] = sm0_0.c0(this.LpT6[var2].bt);
               this.wJ(sm0_0.fg0((byte)2, var85, var18, var51, var62), "", null);
               this.zG();
               this.Be.Ll(false);
               this.ke();
                xe_1[] var19 = this.L1;
                this.Bl0(var19, tw0_0.kz0() ? this.L1.length : 3, false, true);
               return;
            }

            var7 = var70.zr0;
            if (var70.zr0 > 0 && this.LpT6[var2].hC0 != var7) {
               lpt6__2 var84 = lpt6__2.Q80;
               byte var16 = 14;
               short var50 = 559;
               String[] var61;
               String[] var95 = var61 = new String[2];
               var95[0] = var70.A60();
               var95[1] = sm0_0.c0(this.LpT6[var2].bt);
               this.wJ(sm0_0.fg0((byte)2, var84, var16, var50, var61), "", null);
               this.zG();
               this.Be.Ll(false);
               this.ke();
                xe_1[] var17 = this.L1;
                this.Bl0(var17, tw0_0.kz0() ? this.L1.length : 3, false, true);
               return;
            }

            boolean var77;
            if (!var1.gD0(gw0_0.sm0) && !var70.z40 && var70.Ql() != 103) {
               var77 = false;
            } else {
               var77 = true;
            }

            if (var77) {
               var8 = this.LpT6[var2].hC0;
               if (this.LpT6[var2].hC0 == 374 || var8 == 363) {
                  lpt6__2 var83 = lpt6__2.Q80;
                  byte var14 = 14;
                  short var49 = 727;
                  String[] var60;
                  String[] var94 = var60 = new String[2];
                  var94[0] = var70.A60();
                  var94[1] = sm0_0.c0(this.LpT6[var2].bt);
                  this.wJ(sm0_0.fg0((byte)2, var83, var14, var49, var60), "", null);
                  this.zG();
                  this.Be.Ll(false);
                  this.ke();
                   xe_1[] var15 = this.L1;
                   this.Bl0(var15, tw0_0.kz0() ? this.L1.length : 3, false, true);
                  return;
               }
            }

            yw_0 var78 = this.LpT6[var2].Pl(var1.gD0(gw0_0.vz));
            if (!var77 && var72 != null && var72.com5(this.LpT6[var2], var78)) {
               this.wJ(sm0_0.Bx(5060, new String[]{sm0_0.c0(var72.Nl), var78.toString()}), "", null);
               this.zG();
               this.Be.Ll(false);
               this.ke();
                xe_1[] var13 = this.L1;
                this.Bl0(var13, tw0_0.kz0() ? this.L1.length : 3, false, true);
               return;
            }

            byte var73 = var1.eI();
            PF[] var74;
            int var80 = (var74 = var1.wI0[var73]).length;

            for (int var81 = 0; var81 < var80; var81++) {
               PF var9;
               if ((var9 = var74[var81]) != null && !var9.zi0.hf0() && S.J9(this.LpT6[var2].hC0, var9.Eu)) {
                  lpt6__2 var82 = lpt6__2.Q80;
                  byte var10 = 14;
                  short var48 = 589;
                  String[] var59;
                  String[] var10001 = var59 = new String[2];
                  var10001[0] = var70.A60();
                  var10001[1] = sm0_0.c0(this.LpT6[var2].bt);
                  this.wJ(sm0_0.fg0((byte)2, var82, var10, var48, var59), "", null);
                  this.zG();
                  this.Be.Ll(false);
                  this.ke();
                   xe_1[] var11 = this.L1;
                   this.Bl0(var11, tw0_0.kz0() ? this.L1.length : 3, false, true);
                  return;
               }
            }
         }

         this.J[this.xT.B6] = (short)var2;
         if (this.to.length > 0 && !var47) {
            this.H20.clear();
            this.H20.add(b30_0.U5(var1.eI(), (byte)0));
            this.Zo();
            this.Be.Ll(false);
            this.ke();
            this.Kj();
         } else {
            oj_2 var12;
            var12 = new oj_2(var4, kt_2.ue, this.LpT6[var2].hC0);
            this.rY(var12);
         }
      }
   }

   public final void m5() {
      byte var1 = 0;

      while (true) {
         jd0_1[][] var2 = this.Tb0;
         if (var1 >= this.Tb0.length) {
            return;
         }

         var2[var1] = null;
         var2[var1] = new jd0_1[(byte)this.yd0.wI0[var1].length];

         jd0_1[] var3;
         for (byte var5 = 0; var5 < (var3 = this.Tb0[var1]).length; var5++) {
            var3[var5] = new jd0_1(var1, var5, asBridge(), this.yd0);
         }

         var1++;
      }
   }

   public final void B7() {
      label103: {
         a10_0 var10000 = this.yd0;
         byte var1 = this.yd0.Ez0();
         if ((byte)var10000.wI0[var1].length <= 1) {
            var10000 = this.yd0;
            var1 = this.yd0.eI();
            if ((byte)var10000.wI0[var1].length <= 1) {
               break label103;
            }
         }

         if (this.yd0.Sv != XA0.PRN) {
            var1 = 0;
            int var2 = 0;

            while (true) {
               PF[][] var3 = this.yd0.wI0;
               if (var2 >= (byte)this.yd0.wI0.length) {
                  int var14 = 0;
                  this.to = new ak0_2[var1];

                  for (int var16 = 0; var16 < 2; var16++) {
                     byte var20;
                     if (var16 == 0) {
                        var20 = this.yd0.eI();
                     } else {
                        var20 = this.yd0.Ez0();
                     }

                     byte var4 = 0;

                     while (var4 < (byte)this.yd0.wI0[var20].length) {
                        int var5 = var14 + 1;
                        if (var14 < this.to.length) {
                           b30_0 var6 = b30_0.U5(var20, var4);
                            String var9 = yr_1.pG("NAME ", var14);
                            short var10 = (short)(tw0_0.kz0() ? 300 : 225);
                            byte var11 = (byte)(tw0_0.kz0() ? 80 : 54);
                            this.to[var14] = new bq_0(asBridge(), var9, var10, var11, var6, var14);
                           this.to[var14].uf("battle-button");
                           this.to[var14].qF0(pa0_0.up0);
                            this.to[var14].RR(() -> this.ZM(var6));
                        }

                        var4++;
                        var14 = var5;
                     }
                  }

                  this.ri0.gg0.x7();
                  if (tw0_0.kz0() ^ true) {
                     this.ri0.gg0.X0();
                     this.ri0.gg0.qE0(10.0F);
                  }

                  tk0_0 var15;
                  var15 = new tk0_0(new A40());
                  this.HE0 = new ak0_2[this.to.length];
                  a10_0 var17 = this.yd0;
                  if (this.yd0.nf == Cq.Jz0) {
                     var2 = 0;

                     for (int var22 = 0; var22 < 2; var22++) {
                         tk0_0 var25 = new tk0_0(new A40());

                        int var28 = var22 * 3;

                        for (int var31 = var28; var31 < var28 + 3; var31++) {
                           ak0_2 var33 = this.to[Vn0[var31]];
                           this.HE0[var2] = var33;
                           var25.gg0.vx0(var33);
                           var2++;
                        }

                        var15.gg0.vx0(var25).p20();
                        var15.gg0.Rg();
                     }
                  } else {
                     var2 = 0;
                     int var21 = (byte)var17.wI0.length - 1;

                     while (var21 >= 0) {
                        a10_0 var23 = this.yd0;
                        byte var24 = (byte)var23.wI0[(byte)var21].length;
                        tk0_0 var26;
                        var26 = new tk0_0(new A40());
                        int var29 = 0;
                        var29 = var2;

                        for (int var32 = var29; var32 < var24; var32++) {
                           ak0_2 var34 = this.to[var2 + var32];
                           this.HE0[var29] = var34;
                           var26.gg0.vx0(var34);
                           var29++;
                        }

                        var15.gg0.vx0(var26).p20();
                        var15.gg0.Rg();
                        var21--;
                        var2 = var29;
                     }
                  }

                  var15.gg0.rx0(5.0F);
                  this.ri0.gg0.vx0(var15);
                  return;
               }

               var1 += (byte)var3[var2].length;
               var2++;
            }
         }
      }

      this.to = IP;
   }

   public void th() {
      if (this.yd0.Sv != XA0.Pb) {
          String var2 = sm0_0.c0(5100);
          String var3;
         if (tw0_0.kz0()) {
            var3 = "";
         } else {
            var3 = sm0_0.c0(5101);
         }


          G20 var1 = new G20(var2, var3);
          this.Vh = var1;
         var1.uf("battle-fight");
         this.Vh.RR(this::WJ0);
          var2 = sm0_0.c0(0);
         if (tw0_0.kz0()) {
            var3 = "";
         } else {
            var3 = sm0_0.c0(5103);
         }

          var1 = new G20(var2, var3);
          this.Xs = var1;
         var1.uf("battle-switch");
         this.Xs.RR(this::Is);
         q40_0 var6;
         q40_0 var10000 = var6 = new q40_0(asBridge());

         this.kX = var6;
         var10000.Ll(false);
         this.IE();
         this.rg0();
          var2 = "WIN";
         if (tw0_0.kz0()) {
            var3 = "";
         } else {
            var3 = "Because you can.";
         }

          var1 = new G20(var2, var3);
          this.t6 = var1;
         var1.uf("battle-win");
         this.t6.RR(ML0::wq0);
         this.t6.Ll(false);
          var2 = sm0_0.c0(5114);
         if (tw0_0.kz0()) {
            var3 = "";
         } else if (this.yd0.Sv == XA0.af0) {
            var3 = sm0_0.c0(5126);
         } else {
            var3 = sm0_0.c0(5115);
         }

          var1 = new G20(var2, var3);
          this.V6 = var1;
         var1.uf("battle-shift");
         if (this.yd0.Sv == XA0.af0) {
            this.V6.RR(this::p1);
         } else {
            this.V6.RR(() -> {
               oj_2 var1x;
               var1x = new oj_2(this.xT, kt_2.eM);
               this.rY(var1x);
            });
         }

         this.V6.Ll(false);
         if (tw0_0.kz0()) {
            var1 = new G20("", "");
            this.v80 = var1;
         } else {
            var1 = new G20(sm0_0.c0(5124), sm0_0.c0(5125));
            this.v80 = var1;
         }

         this.v80.uf("battle-rotate");
         this.v80.RR(this::om0);
         this.v80.Ll(false);
         if (tw0_0.kz0()) {
            xe_1[] var11;
            xe_1[] var44 = var11 = new xe_1[6];
            var44[0] = this.Vh;
            var44[1] = this.Xs;
            var44[2] = this.V6;
            var44[3] = this.t6;
            var44[4] = this.HJ;
            var44[5] = this.Ne0;
            this.L1 = var11;
            byte var33 = 1;
            this.Bl0(var11, var33, false, true);
         } else {
            xe_1[] var12;
            xe_1[] var45 = var12 = new xe_1[6];
            var45[0] = this.Vh;
            var45[1] = this.HJ;
            var45[2] = this.V6;
            var45[3] = this.Xs;
            var45[4] = this.Ne0;
            var45[5] = this.t6;
            this.L1 = var12;
            byte var34 = 3;
            this.Bl0(var12, var34, false, true);
         }

         this.Ck0(false);
         if (tw0_0.kz0() ^ true) {
            this.WU
               .x40(
                  XN.sA(this.WU, this.WU)
                     .Xq(
                        new ya_1[]{
                           D5.fE0(this.WU, this.WU).LPt3(new le0_2[]{this.Vh, this.HJ, this.V6}),
                           D5.fE0(this.WU, this.WU).LPt3(new le0_2[]{this.Xs, this.Ne0, this.t6})
                        }
                     )
               );
            this.WU
               .WQ(
                  XN.sA(this.WU, this.WU)
                     .Xq(
                        new ya_1[]{
                           D5.fE0(this.WU, this.WU).LPt3(new le0_2[]{this.Vh, this.Xs}),
                           D5.fE0(this.WU, this.WU).LPt3(new le0_2[]{this.HJ, this.Ne0}),
                           D5.fE0(this.WU, this.WU).LPt3(new le0_2[]{this.V6, this.t6})
                        }
                     )
               );
            return;
         }

         var1 = this.Vh;
         this.WU.F9(this.WU.fU(), var1);
         var1 = this.HJ;
         this.WU.F9(this.WU.fU(), var1);
         var1 = this.V6;
         this.WU.F9(this.WU.fU(), var1);
         var1 = this.Xs;
         this.WU.F9(this.WU.fU(), var1);
         var1 = this.Ne0;
         this.WU.F9(this.WU.fU(), var1);
         var1 = this.t6;
         this.WU.F9(this.WU.fU(), var1);
         a10_0 var19 = this.yd0;
         if (this.yd0.m40 || var19.a40) {
            return;
         }
      } else {
         q40_0 var20;
         q40_0 var46 = var20 = new q40_0(asBridge());

         this.kX = var20;
         var46.Ll(false);
         G20 var21;
         G20 var47 = var21 = new G20("", "");

         this.Vh = var21;
         var47.uf("battle-ball");
         this.Vh.RR(() -> {
            oj_2 var1x;
            var1x = new oj_2(this.xT, kt_2.An);
            this.rY(var1x);
         });
         this.NM();
          String var35 = sm0_0.c0(tw0_0.e60.Com4 == 3 ? 5118 : 5110);
         String var42;
         if (tw0_0.kz0()) {
            var42 = "";
         } else {
            var42 = sm0_0.c0(tw0_0.e60.Com4 == 3 ? 5119 : 5111);
         }


          G20 var22 = new G20(var35, var42);
          this.Xs = var22;
         var22.uf("battle-rock");
         this.Xs.RR(() -> {
            oj_2 var1x;
            var1x = new oj_2(this.xT, kt_2.Zk0);
            this.rY(var1x);
         });
          var35 = sm0_0.c0(5112);
         if (tw0_0.kz0()) {
            var42 = "";
         } else {
            var42 = sm0_0.c0(5113);
         }


          G20 var23 = new G20(var35, var42);
          this.HJ = var23;
         var23.uf("battle-bait");
         this.HJ.RR(() -> {
            oj_2 var1x;
            var1x = new oj_2(this.xT, kt_2.Bq);
            this.rY(var1x);
         });
         this.rg0();
         if (tw0_0.kz0()) {
            xe_1[] var24;
            xe_1[] var48 = var24 = new xe_1[4];
            var48[0] = this.Vh;
            var48[1] = this.Xs;
            var48[2] = this.HJ;
            var48[3] = this.Ne0;
            this.L1 = var24;
            byte var37 = 1;
            this.Bl0(var24, var37, false, true);
         } else {
            xe_1[] var25;
            xe_1[] var49 = var25 = new xe_1[4];
            var49[0] = this.Vh;
            var49[1] = this.HJ;
            var49[2] = this.Xs;
            var49[3] = this.Ne0;
            this.L1 = var25;
            byte var38 = 3;
            this.Bl0(var25, var38, false, true);
         }

         this.Ck0(false);
         if (!tw0_0.kz0()) {
            this.WU
               .x40(
                  XN.sA(this.WU, this.WU)
                     .Xq(
                        new ya_1[]{D5.fE0(this.WU, this.WU).LPt3(new le0_2[]{this.Vh, this.HJ}), D5.fE0(this.WU, this.WU).LPt3(new le0_2[]{this.Xs, this.Ne0})}
                     )
               );
            this.WU
               .WQ(
                  XN.sA(this.WU, this.WU)
                     .Xq(
                        new ya_1[]{D5.fE0(this.WU, this.WU).LPt3(new le0_2[]{this.Vh, this.Xs}), D5.fE0(this.WU, this.WU).LPt3(new le0_2[]{this.HJ, this.Ne0})}
                     )
               );
            return;
         }

         G20 var26 = this.Vh;
         this.WU.F9(this.WU.fU(), var26);
         G20 var27 = this.HJ;
         this.WU.F9(this.WU.fU(), var27);
         G20 var28 = this.Xs;
         this.WU.F9(this.WU.fU(), var28);
         G20 var29 = this.Ne0;
         this.WU.F9(this.WU.fU(), var29);
      }

      qh_1 var4 = this.Bo0;
      this.WU.F9(this.WU.fU(), var4);
   }

   public final void Bl0(xe_1[] var1, int var2, boolean var3, boolean var4) {
      this.tG0 = 0;
      this.ds = var2;
      this.Ss = var1;
      this.r7 = var4;
      if (var1.length != 0) {
         if (var3) {
            for (int var6 = 0; var6 < var1.length; var6++) {
               if (var1[var6].OI) {
                  this.tG0 = var6;
                  break;
               }
            }
         }

         BU var5 = Qy0.yI0.zK0;
         if (Qy0.yI0.zK0 != null) {
            if (var5.BK.b5.Of()) {
               return;
            }

            if (tw0_0.kz0() && var5.BK.eE) {
               return;
            }
         }

         lpt6__0.v90(this.Yy0());
      }
   }

   public final xe_1 Yy0() {
      int var1 = this.tG0;
      xe_1[] var2;
      return this.tG0 >= 0 && var1 < (var2 = this.Ss).length ? var2[var1] : null;
   }

   public final void rY(oj_2 param1) {
      if (this.u20() && this.xT != null && this.mx0.ty0()) {
         a10_0 battle = this.yd0;
         byte playerIndex = this.xT.B6;
         synchronized (battle.zr) {
            if (battle.Ql0[playerIndex]) {
               battle.zr[playerIndex] = param1;
               kt_2 actionType = param1.hI0;
               if (actionType == kt_2.nC || actionType == kt_2.nz0) {
                  battle.oC0 = true;
               } else if (actionType == kt_2.IL0) {
                  short itemId = X4.gA0(param1.wW);
                  if (itemId == 5576 || itemId >= 5001 && itemId <= 5016 || itemId >= 5492 && itemId <= 5500) {
                     battle.oC0 = true;
                  }
               }

               if (battle.D0() == null) {
                  for (byte index = 0; index < battle.Ql0.length; index++) {
                     oj_2 queuedAction = battle.zr[index];
                     if (queuedAction != null) {
                        tw0_0.rl.fk0.uQ(queuedAction);
                     }

                     battle.Ql0[index] = false;
                     battle.zr[index] = null;
                  }
               }
            }
         }

         this.l60(null);
         this.zG();
         this.Be.Ll(false);
         this.TH0.Ll(false);
         this.Wq0.Ll(false);
         this.kX.Ll(false);
         this.ri0.Ll(false);
         this.v80.Ll(false);
         this.ke();
         this.Ck0(false);
      }

      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:361)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:504)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1058)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:573)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:185)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual f/ML0.u20 ()Z
      // 004: ifeq 184
      // 007: aload 0
      // 008: getfield f/ML0.xT Lf/b30_0;
      // 00b: ifnull 184
      // 00e: aload 0
      // 00f: getfield f/ML0.mx0 Lf/in_2;
      // 012: invokevirtual f/in_2.ty0 ()Z
      // 015: ifne 01b
      // 018: goto 184
      // 01b: aload 0
      // 01c: getfield f/ML0.yd0 Lf/a10_0;
      // 01f: dup
      // 020: dup
      // 021: astore 2
      // 022: aload 0
      // 023: getfield f/ML0.xT Lf/b30_0;
      // 026: getfield f/b30_0.B6 B
      // 029: istore 3
      // 02a: getfield f/a10_0.zr [Lf/oj_2;
      // 02d: dup
      // 02e: astore 4
      // 030: monitorenter
      // 031: getfield f/a10_0.Ql0 [Z
      // 034: iload 3
      // 035: baload
      // 036: ifne 043
      // 039: aload 4
      // 03b: monitorexit
      // 03c: goto 140
      // 03f: astore 0
      // 040: goto 17f
      // 043: aload 1
      // 044: aload 2
      // 045: getfield f/a10_0.zr [Lf/oj_2;
      // 048: iload 3
      // 049: aload 1
      // 04a: aastore
      // 04b: getfield f/oj_2.hI0 Lf/kt_2;
      // 04e: dup
      // 04f: astore 3
      // 050: getstatic f/kt_2.nC Lf/kt_2;
      // 053: if_acmpeq 0fb
      // 056: aload 3
      // 057: getstatic f/kt_2.nz0 Lf/kt_2;
      // 05a: if_acmpne 060
      // 05d: goto 0fb
      // 060: aload 3
      // 061: getstatic f/kt_2.IL0 Lf/kt_2;
      // 064: if_acmpne 100
      // 067: aload 1
      // 068: getfield f/oj_2.wW S
      // 06b: invokestatic f/X4.gA0 (S)S
      // 06e: dup
      // 06f: istore 1
      // 070: sipush 5576
      // 073: if_icmpeq 0fb
      // 076: iload 1
      // 077: tableswitch 77 5001 5016 132 132 132 132 132 132 132 132 132 132 132 132 132 132 132 132
      // 0c4: iload 1
      // 0c5: tableswitch 51 5492 5500 54 54 54 54 54 54 54 54 54
      // 0f8: goto 100
      // 0fb: aload 2
      // 0fc: bipush 1
      // 0fd: putfield f/a10_0.oC0 Z
      // 100: aload 2
      // 101: invokevirtual f/a10_0.D0 ()Lf/b30_0;
      // 104: ifnonnull 13d
      // 107: bipush 0
      // 108: istore 1
      // 109: iload 1
      // 10a: aload 2
      // 10b: getfield f/a10_0.Ql0 [Z
      // 10e: arraylength
      // 10f: if_icmpge 13d
      // 112: aload 2
      // 113: getfield f/a10_0.zr [Lf/oj_2;
      // 116: iload 1
      // 117: aaload
      // 118: dup
      // 119: astore 3
      // 11a: ifnull 127
      // 11d: getstatic f/tw0_0.rl Lf/BR;
      // 120: getfield f/Ge0.fk0 Lf/k20_0;
      // 123: aload 3
      // 124: invokevirtual f/k20_0.uQ (Lf/RE;)V
      // 127: iload 1
      // 128: aload 2
      // 129: dup
      // 12a: getfield f/a10_0.Ql0 [Z
      // 12d: iload 1
      // 12e: bipush 0
      // 12f: bastore
      // 130: getfield f/a10_0.zr [Lf/oj_2;
      // 133: iload 1
      // 134: aconst_null
      // 135: aastore
      // 136: bipush 1
      // 137: iadd
      // 138: i2b
      // 139: istore 1
      // 13a: goto 109
      // 13d: aload 4
      // 13f: monitorexit
      // 140: aload 0
      // 141: dup
      // 142: dup2
      // 143: dup2
      // 144: dup2
      // 145: dup2
      // 146: aconst_null
      // 147: invokevirtual f/ML0.l60 (Lf/b30_0;)V
      // 14a: invokevirtual f/ML0.zG ()V
      // 14d: getfield f/ML0.Be Lf/fy_2;
      // 150: bipush 0
      // 151: invokevirtual f/le0_2.Ll (Z)V
      // 154: getfield f/ML0.TH0 Lf/fy_2;
      // 157: bipush 0
      // 158: invokevirtual f/le0_2.Ll (Z)V
      // 15b: getfield f/ML0.Wq0 Lf/fy_2;
      // 15e: bipush 0
      // 15f: invokevirtual f/le0_2.Ll (Z)V
      // 162: getfield f/ML0.kX Lf/q40_0;
      // 165: bipush 0
      // 166: invokevirtual f/q40_0.Ll (Z)V
      // 169: getfield f/ML0.ri0 Lf/tk0_0;
      // 16c: bipush 0
      // 16d: invokevirtual f/le0_2.Ll (Z)V
      // 170: getfield f/ML0.v80 Lf/G20;
      // 173: bipush 0
      // 174: invokevirtual f/xe_1.Ll (Z)V
      // 177: invokevirtual f/ML0.ke ()V
      // 17a: bipush 0
      // 17b: invokevirtual f/ML0.Ck0 (Z)V
      // 17e: return
      // 17f: aload 0
      // 180: aload 4
      // 182: monitorexit
      // 183: athrow
      // 184: return
      // try (24 -> 27): 31 null
      // try (28 -> 31): 31 null
      // try (33 -> 40): 31 null
      // try (42 -> 43): 31 null
      // try (44 -> 46): 31 null
      // try (48 -> 50): 31 null
      // try (51 -> 54): 31 null
      // try (63 -> 68): 31 null
      // try (71 -> 75): 31 null
      // try (76 -> 80): 31 null
      // try (83 -> 98): 31 null
      // try (103 -> 105): 31 null
      // try (136 -> 139): 31 null
   }

   public final void ke() {
      NN var1 = this.Hd;
      if (this.Hd != null) {
         this.Hd = null;
         var1.em();
         this.u3(var1);
      }
   }

   public final void C(zk0_1 var1) {
      lpt6__0.v90(this);
   }

   public void X60(boolean var1) {
      for (byte var2 = 0; var2 < this.Tb0.length; var2++) {
         for (byte var3 = 0; var3 < this.Tb0[var2].length; var3++) {
            PF var4;
            if ((var4 = this.yd0.Ce(var2, var3)) != null) {
               this.Tb0[var2][var3].le0(var4, var1, (short)-1);
            } else {
               this.Tb0[var2][var3].Hm(false);
            }
         }
      }
   }

   public boolean nd0(i70_0 var1) {
      int var29;
      xe_1[] var12;
      if (!tw0_0.LD0.Rg0) {
         return super.nd0(var1);
      }

      if (tw0_0.Eu(3) && lpt3__1.RJ && (var1.zu == 9 || var1.zu == 10) && var1.finally$ == 141 && var1.iT()) {
         this.lZ.clear();
         this.BQ = null;
         return true;
      }

      BU var2 = BU.T50;
      if (BU.T50.vj0 == null && var2.q3 == null) {
         int var15 = var1.zu;
         if (var1.zu >= 1 && var1.zu <= 7 && var15 == 1) {
            return true;
         }

         label256: {
            label267: {
                if ((var15 == 9 || var15 == 10) && var1.iT()) {
                  int var16 = var1.finally$;
                  rp_0 var3 = rp_0.sJ0;
                  if (rp_0.sJ0 != null && var3.Ov(var16)) {
                     break label267;
                  }

                  int var17 = var1.finally$;
                  var3 = rp_0.nK0;
                  if (rp_0.nK0 != null && var3.Ov(var17)) {
                     break label267;
                  }
               }

               int var18 = var1.zu;
                if (!(var1.zu >= 1 && var1.zu <= 7) || var1.nA0 != 0 || var18 != 3) {
                  break label256;
               }
            }

            N60 var19 = this.BQ;
            if (this.BQ != null && var19.gJ0() == NU.ST) {
               ZJ var20 = this.fE;
               if (!this.fE.Q40) {
                  var20.Q40 = true;
                  return true;
               }
            }
         }

         Oz0 var21 = tw0_0.LD0.he0;
         if (tw0_0.LD0.he0 != null && !var21.OE.dg) {
            return super.nd0(var1);
         }

         N60 var22 = this.BQ;
         if (this.BQ != null && !(var22 instanceof NB0) && !(var22 instanceof AK0)) {
            return super.nd0(var1);
         }

         var2 = this.Sr0.zK0;
         label217:
         if (this.Sr0.zK0 != null && !var2.BK.b5.Of() && (var1.zu == 9 || var1.zu == 10) && var1.iT()) {
            int var24 = var1.finally$;
            rp_0 var34 = rp_0.Ni;
            if (rp_0.Ni == null || !var34.Ov(var24)) {
               int var25 = var1.finally$;
               rp_0 var4 = rp_0.I90;
               if (rp_0.I90 == null || !var4.Ov(var25)) {
                  int var26 = var1.finally$;
                  var4 = rp_0.synchronized$;
                  if (rp_0.synchronized$ == null || !var4.Ov(var26)) {
                     int var27 = var1.finally$;
                     var4 = rp_0.kC0;
                     if (rp_0.kC0 == null || !var4.Ov(var27)) {
                        int var30 = var1.finally$;
                        var34 = rp_0.sJ0;
                        if (rp_0.sJ0 != null && var34.Ov(var30) && this.Of()) {
                           q40_0 var32 = this.kX;
                           if (this.kX.eE) {
                              var32.lE0(var1);
                              return true;
                           }

                           xe_1 var6;
                           if ((var6 = this.Yy0()) != null && var6.OI) {
                              a7_0.bH(var6.ER.Fc0);
                           }

                           return true;
                        }

                        int var31 = var1.finally$;
                        var34 = rp_0.nK0;
                        if (rp_0.nK0 != null && var34.Ov(var31) && this.a60.eE && this.Of()) {
                           a7_0.bH(this.a60.ER.Fc0);
                           int var14 = this.tG0;
                           xe_1[] var5;
                           if (this.tG0 > 0 && var14 < (var5 = this.L1).length) {
                              lpt6__0.v90(var5[var14]);
                           }

                           return true;
                        }
                        break label217;
                     }
                  }
               }
            }

            q40_0 var28 = this.kX;
            if (this.kX.eE) {
               var28.lE0(var1);
               return true;
            }

            var29 = this.tG0;
            label207:
            if (this.ds > 0 && this.r7) {
               int var44 = var1.finally$;
               int var8;
               if (var34 != null && var34.Ov(var44)) {
                  if ((var8 = var29 + 1) % this.ds == 0) {
                     break label207;
                  }
               } else {
                  label294: {
                     int var35 = var1.finally$;
                     rp_0 var45 = rp_0.I90;
                     if (rp_0.I90 != null && var45.Ov(var35)) {
                        if ((var29 + 1) % this.ds == 1) {
                           break label207;
                        }
                     } else {
                        int var36 = var1.finally$;
                        rp_0 var46 = rp_0.kC0;
                        if (rp_0.kC0 == null || !var46.Ov(var36)) {
                           int var9 = var1.finally$;
                           var34 = rp_0.synchronized$;
                           if (rp_0.synchronized$ == null || !var34.Ov(var9)) {
                              break label207;
                           }

                           int var10 = this.ds;
                           xe_1[] var38 = this.Ss;
                           if (this.ds == this.Ss.length) {
                              var29++;
                              break label207;
                           }

                           if ((var8 = var29 + var10) >= var38.length) {
                              break label207;
                           }
                           break label294;
                        }

                        int var7 = this.ds;
                        if (this.ds != this.Ss.length) {
                           if ((var8 = var29 - var7) < 0) {
                              break label207;
                           }
                           break label294;
                        }
                     }

                     var29--;
                     break label207;
                  }
               }

               var29 = var8;
            }

            if (var29 < 0) {
               var29 = 0;
            }

            xe_1[] var11 = this.Ss;
            if (var29 >= this.Ss.length) {
               var29 = var11.length - 1;
            }

            if (var11.length < 1) {
               return true;
            }

            do {
               var12 = this.Ss;
               if (this.Ss[var29].eE) {
                  this.tG0 = var29;
                  lpt6__0.v90(this.Yy0());
                  return true;
               }

               int var39 = this.tG0;
               if (this.tG0 > var29) {
                  var29--;
               } else if (var39 <= var29) {
                  var29++;
               }
            } while (var29 < var12.length && var29 >= 0);

            return true;
         }

         if (super.nd0(var1)) {
            return true;
         }

         int var13;
         if ((var13 = var1.zu) >= 1 && var13 <= 7 && var13 == 3) {
            this.Sr0.Qw0(this);
         }

         return false;
      } else {
         return true;
      }
   }

   public final void a80(Jn0 var1) {
      if (tw0_0.kz0() ^ true) {
         this.WU.oY(tw0_0.LD0.ew0(), 240);
      }
   }

   public final void l60(b30_0 var1) {
      b30_0 var2 = this.Ru;
      if (this.Ru != null) {
         jd0_1 var10000 = this.Tb0[var2.Pp0][var2.B6];
         int var6 = this.Tb0[var2.Pp0][var2.B6].j00;
         int var3 = this.Tb0[var2.Pp0][var2.B6].Kl;
         int var4 = var10000.k0;
         int var5 = var10000.Ou;
         var10000.V6(var6, var3, var4, var5, true);
      }

      this.xT = var1;
      this.Ru = var1;
      this.H20.clear();
   }

   public final void r60(PF var1) {
      boolean var2 = false;
      byte[] var3 = var1.um0();
      short[] var4 = var1.qz0();
      if (var3 != null) {
         int var5 = 0;

         label317:
         while (true) {
            if (var5 >= 4) {
               var3 = null;
               break;
            }

            ec0_2 var6 = ec0_2.Sx();
            vk0_1 var34;
            if ((var34 = (vk0_1)var6.f4.f5(var4[var5])) != null && (!var1.cf0 || var34.X00 >= 1) && (!var1.Yo || var34.hC0 != var1.qo0)) {
               short var7 = var34.hC0;
               if (var1.S20 != var34.hC0) {
                   short var8 = var1.zr0;
                  if (var1.zr0 <= 0 || var8 == var7) {
                     var8 = var1.EH0;
                     label291:
                     if ((var1.EH0 <= 0 || var8 == var7)
                        && (!this.yd0.gD0(gw0_0.cOm9) || !var34.Ro(512))
                        && (!var1.G90 || var34.zQ <= 0 && var34.sw <= 0 && !var34.Ro(4096))) {
                         boolean var47;
                         if (!this.yd0.gD0(gw0_0.sm0) && !var1.z40 && var1.Ql() != 103) {
                            var47 = false;
                         } else {
                            var47 = true;
                        }

                        if (var47) {
                           var8 = var34.hC0;
                           if (var34.hC0 == 374 || var8 == 363) {
                              break label291;
                           }
                        }

                        var8 = var1.zi0.T0;
                        mc0_1 var56;
                        if (var1.zi0.T0 > 0) {
                           var56 = gu0.l2.lPT6(var8);
                        } else {
                           var56 = null;
                        }

                        if ((var47 || var56 == null || !var56.com5(var34, var34.Pl(this.yd0.gD0(gw0_0.vz)))) && var3[var5] >= 1) {
                            a10_0 var68 = this.yd0;
                            byte var57 = this.yd0.eI();
                            PF[] var49;
                            int var69 = (var49 = var68.wI0[var57]).length;
                            int var9 = 0;

                            while (true) {
                               if (var9 >= var69) {
                                 break label317;
                              }

                              PF var10;
                              if ((var10 = var49[var9]) != null && !var10.zi0.hf0() && S.J9(var34.hC0, var10.Eu)) {
                                 break;
                              }

                              var9++;
                           }
                        }
                     }
                  }
               }
            }

            var5++;
         }
      }

      if (var3 == null) {
         var2 = true;
         var4 = new short[]{165, 0, 0, 0};
      }

      this.LpT6 = new vk0_1[4];

      for (int var12 = 0; var12 < 4; var12++) {
         vk0_1[] var70 = this.LpT6;
         ec0_2 var35 = ec0_2.Sx();
         var70[var12] = (vk0_1)var35.f4.f5(var4[var12]);
      }

      for (int var11 = 0; var11 < 4; var11++) {
         vk0_1 var13;
         if ((var13 = this.LpT6[var11]) != null && var13.hC0 != 0) {
            if (tw0_0.kz0()) {
               this.iQ[var11].Ll(true);
            } else {
               this.iQ[var11].pw0(true);
            }

            i40_0 var14 = this.LpT6[var11].oG(var1.zi0.Bn, this.yd0.O00);
            if (this.yd0.Sv == XA0.PRN && tw0_0.Ll0.cOM4((byte)1)) {
               M3 var27;
               if ((var27 = this.LpT6[var11].Qj()) == null || var27.zB0() == null) {
                  this.iQ[var11].pw0(false);
                  G20 var83 = this.iQ[var11];
                  StringBuilder var33;
                  var33 = new StringBuilder();
                  var83.Pc(ig_0.u9(1865, var33, " -- / ").append(sm0_0.c0(1866)).append(" --").toString());
                  this.iQ[var11].zW.lo0();
                  continue;
               }

               Br0 var43 = this.iQ[var11].zW;
               AG0[] var50 = new AG0[1];
               byte var58 = 0;
               ji0_0 var61 = ji0_0.Hg;
               AG0 var62;
               ib0_0 var66;
               if ((var66 = this.LpT6[var11].Qj().throws$) == null) {
                  var62 = var61.X0[0];
               } else {
                  var62 = var61.X0[var66.nH];
               }

               var50[var58] = var62;
               var43.o60(var50);
               Br0 var95 = this.iQ[var11].zW;
               byte var28 = 16;
               this.iQ[var11].zW.gY = 153;
               var95.a4 = var28;
               HU var91 = var27.zB0();
               byte var29 = var91.OA;
               byte var44 = var91.VC;
               byte var51 = var1.q40.jU;
                byte[] var59;
                int var63 = (var59 = var27.iQ).length;
                int var67 = 0;
                boolean var52;

               while (true) {
                  if (var67 >= var63) {
                     var52 = false;
                     break;
                  }

                  if (var59[var67] == var51) {
                     var52 = true;
                     break;
                  }

                  var67++;
               }

               G20 var60 = this.iQ[var11];
               StringBuilder var64;
               var64 = new StringBuilder();
               StringBuilder var65 = ig_0.u9(1865, var64, " ");
               String var30;
               if (var29 < 1) {
                  var30 = "--";
               } else {
                  var30 = Integer.toString(var29);
               }

               StringBuilder var31 = ig_0.u9(1866, var65.append(var30).append(" / "), " ");
               String var45;
               if (var44 < 1) {
                  var45 = "--";
               } else {
                  var45 = Integer.toString(var44);
               }

               label223: {
                  var60.Pc(var31.append(var45).toString());
                  G20 var32;
                  String var46;
                  if (var1.qo0 == this.LpT6[var11].hC0) {
                     var32 = this.iQ[var11];
                     var46 = "battle-move-button-red";
                     if ("battle-move-button-red".equals(var32.gW)) {
                        break label223;
                     }
                  } else if (var1.q40.jU > 0 && var52) {
                     var32 = this.iQ[var11];
                     var46 = "battle-move-button-green";
                     if ("battle-move-button-green".equals(var32.gW)) {
                        break label223;
                     }
                  } else {
                     var32 = this.iQ[var11];
                     var46 = "battle-move-button";
                     if ("battle-move-button".equals(var32.gW)) {
                        break label223;
                     }
                  }

                  var32.uf(var46);
                  var32.yI();
               }

               G20 var82 = this.iQ[var11];
               this.iQ[var11].yj0 = lb0_2.Sm(this.LpT6[var11]);
               var82.yB0();
            } else {
               this.iQ[var11].zW.r8(new LPT6_[]{fn_0.qz0().jJ0(var14.j40)});
               this.iQ[var11].ww.lo0();
               if (!tw0_0.kz0()) {
                  G20 var75 = this.iQ[var11];
                  Br0 var86 = this.iQ[var11].zW;
                  byte var15 = 10;
                  this.iQ[var11].zW.gY = 153;
                  var86.a4 = var15;
                  Br0 var76 = var75.ww;
                  byte var16 = 24;
                  var75.ww.gY = 153;
                  var76.a4 = var16;
               } else {
                  byte var36;
                  Br0 var72;
                  Br0 var10001;
                  short var10002;
                  if (var11 != 1 && var11 != 3) {
                     var72 = this.iQ[var11].zW;
                     var10001 = this.iQ[var11].zW;
                     var10002 = 5;
                     var36 = 45;
                  } else {
                     var72 = this.iQ[var11].zW;
                     var10001 = this.iQ[var11].zW;
                     var10002 = 215;
                     var36 = 45;
                  }

                  var10001.gY = var10002;
                  var72.a4 = var36;
                  G20 var37;
                  Br0 var73 = (var37 = this.iQ[var11]).ww;
                  var36 = 24;
                  var73.gY = 125;
                  var73.a4 = var36;
                  var37.zW.EJ0 = 2.0F;
                  var73.EJ0 = 2.0F;
                  if (tw0_0.kz0()) {
                     G20 var74;
                     StringBuilder var85;
                     i40_0 var92;
                     if (var11 != 0 && var11 != 2) {
                        var74 = this.iQ[var11];
                        var92 = var14;
                        var85 = new StringBuilder("battle-move-button-right-type");
                     } else {
                        var74 = this.iQ[var11];
                        var92 = var14;
                        var85 = new StringBuilder("battle-move-button-left-type");
                     }

                     var74.kx0(var85.append(var92.j40).toString());
                  }
               }

               if (var2) {
                  this.iQ[var11].Pc(sm0_0.c0(1852) + " - / -");
                  G20 var26 = this.iQ[var11];
                  boolean var42;
                  if (var11 == 0) {
                     var42 = true;
                  } else {
                     var42 = false;
                  }

                  var26.pw0(var42);
                  this.iQ[var11].sy0(1.0, yw_0.c0, false);
               } else {
                  label192: {
                     double var88;
                     yw_0 var94;
                     vk0_1 var10003;
                     label191: {
                        Cq var17 = this.yd0.nf;
                         G20 var77;
                        if ((this.yd0.eI() > 0 ? var17.Lw0 : var17.e50) == 1) {
                           PF var18;
                           if ((var18 = this.yd0.Ce(this.yd0.eI(), (byte)0)) != null) {
                               var77 = this.iQ[var11];
                              vk0_1 var39 = this.LpT6[var11];
                              var88 = Ue(this.yd0, var1, var18, var39);
                              var94 = this.LpT6[var11].Pl(this.yd0.gD0(gw0_0.vz));
                              var10003 = this.LpT6[var11];
                              break label191;
                           }

                           var77 = this.iQ[var11];
                           var88 = 0.0;
                           var94 = null;
                        } else {
                           a10_0 var19 = this.yd0;
                           if (this.yd0.nf == Cq.Sa0) {
                              PF var40 = var19.Nv0;
                              if (var19.Nv0 != null) {
                                  var77 = this.iQ[var11];
                                 var13 = this.LpT6[var11];
                                 var88 = Ue(var19, var1, var40, var13);
                                 var94 = this.LpT6[var11].Pl(this.yd0.gD0(gw0_0.vz));
                                 var10003 = this.LpT6[var11];
                                 break label191;
                              }

                              var77 = this.iQ[var11];
                              var88 = 0.0;
                              var94 = null;
                           } else {
                              var77 = this.iQ[var11];
                              var88 = 0.0;
                              var94 = null;
                           }
                        }

                        var77.sy0(var88, var94, false);
                        break label192;
                     }

                      this.iQ[var11].sy0(var88, var94, var10003.continue$);
                  }

                  if (this.LpT6[var11].hC0 == 165) {
                     this.iQ[var11].Pc(sm0_0.c0(1852) + " ∞");
                  } else {
                      boolean var24;
                      label180: {
                        _else var21;
                        short var22 = J4.p5((var21 = tw0_0.e60.N60()).Bm0, var21.case$);
                        if (tw0_0.e60.N60().dw == 2 && (var22 == 434 || var22 == 435)) {
                           CE var23 = var1.zi0.Bn;
                           if (var1.zi0.Bn.vO == 70 && var23.dZ == 2) {
                              var24 = true;
                              break label180;
                           }
                        }

                        var24 = false;
                     }

                     byte var25 = this.LpT6[var11].Gn(var24);
                     G20 var79 = this.iQ[var11];
                     StringBuilder var41;
                     var41 = new StringBuilder();
                     var79.Pc(ig_0.u9(1852, var41, " ").append(var3[var11]).append(" / ").append(var1.zi0.Bn.Vd(var25, var11)).toString());
                  }
               }

               G20 var80 = this.iQ[var11];
               this.iQ[var11].yj0 = s2_0.Fl0(this.LpT6[var11], var1.zi0.Bn, -1);
               var80.yB0();
            }

            this.iQ[var11].SU(sm0_0.c0(this.LpT6[var11].bt));
         } else {
            this.iQ[var11].SU("-");
            this.iQ[var11].Pc(sm0_0.c0(1852) + " - / -");
            if (tw0_0.kz0()) {
               this.iQ[var11].Ll(false);
            } else {
               this.iQ[var11].pw0(false);
            }

            this.iQ[var11].zW.lo0();
            G20 var71 = this.iQ[var11];
            this.iQ[var11].yj0 = null;
            var71.yB0();
            this.iQ[var11].sy0(0.0, null, false);
         }
      }
   }

   public final void FU() {
      Mj var1;
      if (this.yd0.kd0()) {
         var1 = tw0_0.rl.r1(this.yd0.DF0);
      } else {
         var1 = tw0_0.rl.PC0;
      }

      if (var1 != null) {
         O8 var10000 = this.yd0.mn(this.yd0.Ez0());
         tb0_1[] var2 = var10000.NC(var10000.L40(this.yd0.AD));
          for (int var3 = 0; var3 < this.jb0.length; var3++) {
             ak0_2 var4 = this.jb0[var3];
             if (var3 >= var2.length) {
                var4.ih(null);
                continue;
             }

             tb0_1 var6 = var2[var3];
             VU var5 = var6.uG0 != 0 ? var1.sF(var6.tz0()) : null;
             var4.ih(var5);
             var4.SF((byte)-1);
             var4.Ll(true);
             if (tw0_0.kz0() && !this.Vs) {
                var4.pw0(var5 != null);
             } else if (var5 != null) {
                var4.pw0(var5.I8.VD > 0 && this.yd0.nd0(var5.pu) == null);
             }
          }
      }
   }

   public final void eA0() {
      byte var1 = this.yd0.Ez0();
      PF[][] var2 = this.yd0.wI0;
      PF[] var3 = this.yd0.wI0[var1];
      b30_0 var4 = this.Ru;
      PF var17;
      if (this.Ru != null) {
         var17 = var2[var4.Pp0][var4.B6];
      } else {
         var17 = null;
      }

      this.to = new ak0_2[var3.length];

      for (byte var28 = 0; var28 < var3.length; var28++) {
         b30_0 var5 = b30_0.U5(var1, var28);
         short var8 = (short)(tw0_0.kz0() ? 300 : 225);
         byte var9 = (byte)(tw0_0.kz0() ? 80 : 54);
         this.to[var28] = new ua0_0(asBridge(), var8, var9, var5, var28);
         this.to[var28].uf("battle-button");
         this.to[var28].qF0(pa0_0.up0);
         byte var32 = var28;
         this.to[var28].RR(() -> this.hk(var32));
         this.to[var28].W(var3[var28]);
         ak0_2 var30 = this.to[var28];
         boolean var29;
         if (this.yd0.wI0[var5.Pp0][var5.B6] != var17) {
            var29 = true;
         } else {
            var29 = false;
         }

         var30.pw0(var29);
         this.to[var28].Ll(true);
      }

      this.ri0.gg0.x7();
      this.ri0.Ll(true);
      cn_0 var10 = new cn_0(null, 0);
      short var27 = 5061;
      String var18;
      if (var17 != null) {
         var18 = var17.nz0(true);
      } else {
         var18 = "";
      }

      String var19 = sm0_0.wa0(var27, var18);

      var10.Sk(var19);
      if (tw0_0.kz0()) {
         this.ri0.gg0.vx0(var10);
         this.ri0.gg0.Rg();
         tk0_0 var11;
         tk0_0 var10000 = var11 = new tk0_0(new A40());

         ak0_2 var20 = this.to[1];
         var10000.gg0.vx0(var20);
         this.ri0.gg0.vx0(var11);
         this.ri0.gg0.Rg();
         tk0_0 var12;
         var10000 = var12 = new tk0_0(new A40());

         ak0_2 var21 = this.to[0];
         var10000.gg0.vx0(var21);
         ak0_2 var22 = this.to[2];
         var10000.gg0.vx0(var22);
         this.ri0.gg0.vx0(var12);
      } else {
         this.ri0.gg0.X0();
         this.ri0.gg0.qE0(15.0F);
         this.ri0.gg0.vx0(var10);
         this.ri0.gg0.Rg();
         tk0_0 var13;
         tk0_0 var32 = var13 = new tk0_0(new A40());

         ak0_2 var23 = this.to[0];
         var32.gg0.vx0(var23);
         ak0_2 var24 = this.to[1];
         var32.gg0.vx0(var24);
         ak0_2 var25 = this.to[2];
         var32.gg0.vx0(var25);
         this.ri0.gg0.vx0(var13).p20();
      }

      if (tw0_0.kz0()) {
         this.ke();
         NN var14;
         var14 = new NN(this.ri0);
         this.Hd = var14;
         this.F9(this.fU(), var14);
         this.u3(this.a60);
         hh0_1 var15 = this.a60;
         this.F9(this.fU(), var15);
      }

      ak0_2[] var16 = this.to;
      int var26 = this.to.length;
      this.Bl0(var16, var26, true, true);
   }

   public final void EE() {
      if (this.BF0) {
         Mj var1;
         if (this.yd0.kd0()) {
            var1 = tw0_0.rl.r1(this.yd0.DF0);
         } else {
            var1 = tw0_0.rl.PC0;
         }

         if (var1 != null) {
            int var2 = this.yK.size() + 1;
            boolean var3 = false;
            ArrayList var4;
            ArrayList var10000 = var4 = new ArrayList(6);

            var4.addAll(this.yK);
            var10000.addAll(Stream.of(var1.rT()).filter(var1x -> var1x != null && !this.yK.contains(var1x)).collect(Collectors.toList()));

            for (byte var8 = 0; var8 < this.jb0.length; var8++) {
               VU var5;
               if (var8 < var4.size()) {
                  var5 = (VU)var4.get(var8);
               } else {
                  var5 = null;
               }

               boolean var6;
               if (var5 != null) {
                  var6 = true;
               } else {
                  var6 = false;
               }

               var3 |= var6;
               this.jb0[var8].ih(var5);
               ak0_2 var10 = this.jb0[var8];
               byte var7;
               if (var5 != null) {
                  var7 = var5.Dg0();
               } else {
                  var7 = -1;
               }

               var10.SF(var7);
               ak0_2 var11 = this.jb0[var8];
               boolean var9;
               if (var8 >= this.yK.size() && var5 != null) {
                  var9 = true;
               } else {
                  var9 = false;
               }

               var11.pw0(var9);
            }

            if (var3) {
               this.Vw0.Sk(sm0_0.wa0(5031, Integer.toString(var2)));
            } else {
               this.Vw0.Sk(sm0_0.c0(5032));
            }
         }
      }
   }

   public final void bF0() {
      jn_0 var1 = tw0_0.LD0;
      Oz0 var5;
      if (tw0_0.LD0 != null && (var5 = var1.he0) != null) {
         var5.ph();
      }

      if (this.bD.ty0()) {
         b30_0 var6 = this.xT;
         if (this.xT != null) {
            kt_2 var4 = kt_2.Q5;
            this.rY(new oj_2(var6, var4, this.Pq));
         } else if (this.mx0.ty0()) {
            N60 var7 = this.BQ;
            if (this.BQ instanceof NB0) {
               kt_2 var2 = kt_2.Q5;
               tw0_0.rl.fk0.uQ(new oj_2(((NB0)var7).xx, var2, this.Pq));
            }

            if (var7 instanceof AK0) {
               b30_0 var3 = this.fr;
               tw0_0.rl.fk0.uQ(new sn_2(var3, this.Pq));
            }
         }
      }
   }

   public final void Kj() {
      boolean var31;
      if (tw0_0.kz0()) {
         this.ke();
         NN var1;
         var1 = new NN(this.ri0);
         this.Hd = var1;
         this.F9(this.fU(), var1);
         this.u3(this.a60);
         hh0_1 var19 = this.a60;
         this.F9(this.fU(), var19);
      }

      this.ri0.Ll(true);
      int var20 = 0;
      b30_0 var2 = this.xT;
      if (this.xT != null) {
         vk0_1 var22;
         switch ((var22 = this.LpT6[this.J[var2.B6]]).g5) {
            case 4:
            case 5:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
               this.H20.clear();
            case 7:
            case 9:
            default:
               ak0_2 var3 = null;
               b30_0 var4 = this.xT;
               PF var25;
               if ((var25 = this.yd0.wI0[var4.Pp0][var4.B6]) != null) {
                  for (int var5 = 0; var5 < 2; var5++) {
                     byte var6;
                     if (var5 == 0) {
                        var6 = this.yd0.eI();
                     } else {
                        var6 = this.yd0.Ez0();
                     }

                     byte var7 = 0;

                     while (var7 < (byte)this.yd0.wI0[var6].length) {
                        int var8 = var20 + 1;
                        MD0 var9 = Li;
                        this.to[var20].M.j70(Li, false);
                        PF var10 = this.yd0.Ce(var6, var7);
                        this.to[var20].W(var10);
                        if (b30_0.U5(var6, var7) == this.xT) {
                           var3 = this.to[var20];
                        }

                        xg_1 var11 = var25.zi0.Bn.GK0;
                        xg_1 var27;
                        if (var10 != null) {
                           var27 = var10.zi0.Bn.GK0;
                        } else {
                           var27 = xg_1.rv;
                        }

                        ak0_2 var12;
                        label231: {
                           label230: {
                              var12 = this.to[var20];
                              a10_0 var13 = this.yd0;
                              Cq var14;
                              Cq var10000 = var14 = this.yd0.nf;
                              XA0 var37 = var13.Sv;
                              byte var15 = var13.Ez0();
                              byte var16 = this.xT.B6;
                              i40_0 var17 = var25.J50();
                              i40_0 var18 = var25.fE();
                              label229:
                              if (var10000.po0(var16) && var14.po0(var7)) {
                                 switch (var22.g5) {
                                    case 0:
                                       if (var15 == var6 && var16 == var7) {
                                          break label229;
                                       }
                                       break;
                                    case 1:
                                       if (var15 != var6) {
                                          break label229;
                                       }
                                       break;
                                    case 2:
                                       if (var15 != var6 || var16 == var7) {
                                          break label229;
                                       }
                                       break;
                                    case 3:
                                    case 5:
                                       if (var15 == var6) {
                                          break label229;
                                       }
                                       break;
                                    case 4:
                                       if (var15 == var6 && var16 == var7 || var37 == XA0.Fz && var22.X00 > 0 && var15 == var6) {
                                          break label229;
                                       }
                                       break;
                                    case 6:
                                       if (var15 == var6) {
                                          break label230;
                                       }
                                       break label229;
                                    case 7:
                                    case 9:
                                       if (var15 != var6 || var16 != var7) {
                                          break label229;
                                       }
                                       break;
                                    case 8:
                                       if (var37 != XA0.Fz || var22.X00 <= 0 || var15 != var6) {
                                          break label230;
                                       }
                                       break label229;
                                    case 10:
                                    case 16:
                                       break label230;
                                    case 11:
                                    case 14:
                                       if (var15 != var6) {
                                          break label230;
                                       }
                                       break label229;
                                    case 12:
                                       if (var15 == var6) {
                                          break label230;
                                       }
                                       break label229;
                                    case 13:
                                       if (var22.hC0 == 174) {
                                          i40_0 var28 = i40_0.z2;
                                          if (var17 == i40_0.z2 || var18 == var28) {
                                             if (var15 != var6 || var16 != var7) {
                                                break label230;
                                             }
                                             break label229;
                                          }
                                       }

                                       if (var15 == var6 && var16 == var7) {
                                          break label230;
                                       }
                                       break label229;
                                    case 15:
                                       if (var16 != var7) {
                                          break label230;
                                       }
                                       break label229;
                                    case 17:
                                       if (var15 == var6 && var16 != var7) {
                                          break label230;
                                       }
                                       break label229;
                                 }

                                 if (var22.Ro(2048)) {
                                    break label230;
                                 }

                                 b30_0 var39 = b30_0.U5(var15, var16);
                                 b30_0 var40 = b30_0.U5(var6, var7);
                                 if (var14 == Cq.Jz0 || var11.WB0 || var27.WB0) {
                                    break label230;
                                 }

                                 if (var37 == XA0.Fz) {
                                    byte var29 = var39.Pp0;
                                    byte var34 = var40.Pp0;
                                    if (var39.Pp0 != var40.Pp0) {
                                       int[] var38 = var14.U7;
                                       int var30;
                                       if (var14.U7 != null) {
                                          var30 = var38.length;
                                       } else if (var29 > 0) {
                                          var30 = var14.Lw0;
                                       } else {
                                          var30 = var14.e50;
                                       }

                                       int var35;
                                       if (var38 != null) {
                                          var35 = var38.length;
                                       } else if (var34 > 0) {
                                          var35 = var14.Lw0;
                                       } else {
                                          var35 = var14.e50;
                                       }

                                       if (var30 > var35 ? (var39.B6 <= 1 ? var40.B6 <= 1 : var40.B6 >= 1) : (var39.B6 == 0 ? var40.B6 <= 1 : var40.B6 >= 2)) {
                                          break label230;
                                       }
                                       break label229;
                                    }
                                 }

                                 if (Math.abs(var39.B6 - var40.B6) < 2) {
                                    break label230;
                                 }
                              }

                              var31 = false;
                              break label231;
                           }

                           var31 = true;
                        }

                        var12.pw0(var31);
                        ak0_2 var32;
                        KG0 var36 = (var32 = this.to[var20]).M;
                        boolean var33;
                        switch (var22.g5) {
                           case 4:
                           case 5:
                           case 6:
                           case 8:
                           case 10:
                           case 11:
                           case 12:
                              if (var32.OI) {
                                 var33 = true;
                                 break;
                              }
                           case 7:
                           case 9:
                           default:
                              var33 = false;
                        }

                        var36.j70(var9, var33);
                        switch (var22.g5) {
                           case 4:
                           case 5:
                           case 6:
                           case 8:
                           case 10:
                           case 11:
                           case 12:
                              if (this.to[var20].OI) {
                                 this.H20.add(b30_0.U5(var6, var7));
                              }
                           case 7:
                           case 9:
                           default:
                              var7++;
                              var20 = var8;
                        }
                     }
                  }

                  if (var22.hC0 == 270 && var3 != null && Arrays.stream(this.to).noneMatch(le0_2::uo)) {
                     var3.pw0(true);
                  }

                  ak0_2[] var21 = this.HE0;
                  int var23 = this.HE0.length / 2;
                  boolean var24 = true;
                  boolean var42;
                  switch (var22.g5) {
                     case 4:
                     case 5:
                     case 6:
                     case 8:
                     case 10:
                     case 11:
                     case 12:
                        var42 = true;
                        break;
                     case 7:
                     case 9:
                     default:
                        var42 = false;
                  }

                  boolean var26 = var42 ^ true;
                  this.Bl0(var21, var23, var24, var26);
               }
         }
      }
   }

   public void HP(zk0_1 var1) {
      Oz0 var2 = tw0_0.LD0.he0;
      if (tw0_0.PK0 != null && var2 != null && !var2.WT) {
         ui_1 var10000 = tw0_0.LD0.wx0.zi;
         ui_1 var3;
         ui_1 var10001 = var3 = tw0_0.LD0.wx0.zi;
         float var6 = var3.og;
         var3.end();
         var2.bL0();
         var10001.W30();
         Color.abgr8888ToColor(var3.oH, var6);
         var10000.og = var6;
      }

      if (tw0_0.kz0() ^ true) {
         var2 = tw0_0.LD0.he0;
         if (tw0_0.LD0.he0 instanceof vr_1 && ((vr_1)var2).j9 != null) {
            this.WU.oY(this.WU.Mx, 0);
         } else {
            fy_2 var8 = this.WU;
            int var24 = this.WU.Mx;
            short var4;
            if (tw0_0.kz0()) {
               var4 = 160;
            } else {
               var4 = 115;
            }

            var8.oY(var24, Math.min(var4, this.WU.Mx + 1));
         }
      }

      this.ty0();
      N60 var9 = this.BQ;
      if (this.BQ == null || var9.lPt1() || this.BQ.gL0()) {
         if (this.BQ != null && lpt3__1.sk) {
            System.out.println(this.BQ.gJ0().toString() + " took " + (System.currentTimeMillis() - this.BQ.qI));
         }

         N60 var10;
         if ((var10 = (N60)this.lZ.poll()) != null) {
            var10.U40();
            var10.ii();
         }

         this.BQ = var10;
      }

      for (byte var11 = 0; var11 < 2; var11++) {
          byte var25;
         if (var11 == 0) {
            var25 = this.yd0.Ez0();
         } else {
            var25 = this.yd0.eI();
         }

         a10_0 var33 = this.yd0;
         int var5 = this.yd0.K80;
         dl_2 var26;
         if (this.yd0.K80 == var25) {
            var26 = var33.Qt0((byte)var5, var33.AD);
         } else {
            var26 = var33.Qt0((byte)var25, (byte)0);
         }

         var33 = this.yd0;
         dy_1 var43 = this.yd0.rU;
         if (this.yd0.rU != null) {
             int var54 = var43.mi0();
             int var35 = var43.sB0;
             this.xD0[var11].aE((float)var54 / var35);
            ae0_1 var36 = this.xD0[var11];
            String var28;
            if (this.yd0.V20 < 1L) {
               var28 = "---";
            } else {
               StringBuilder var51 = new StringBuilder();
               DecimalFormat var44 = IY;
                var28 = var51.append(IY.format(var54 / 60)).append(":").append(var44.format(var54 % 60)).toString();
            }

            var36.B(var28);
            this.xD0[var11].Ll(true);
         } else if (var33.T2() && var26 != null) {
            int var37;
            if (var26.Ui0) {
               if ((var37 = var26.VS - (int)(System.currentTimeMillis() / 1000L - var26.V1)) < 0) {
                  var37 = 0;
               }

               var5 = var26.EG;
               if (var26.EG > 0 && var37 > var5) {
                  var37 = var5;
               }
            } else {
               var37 = var26.VS;
               if (var26.VS < 0) {
                  var37 = 0;
               }
            }

             int var54 = var26.sE0;
             this.xD0[var11].aE((float)var37 / var54);
            ae0_1 var30 = this.xD0[var11];
            String var38;
            if (this.yd0.V20 < 1L) {
               var38 = "---";
            } else {
               StringBuilder var52 = new StringBuilder();
               DecimalFormat var46 = IY;
               var38 = var52.append(IY.format(var37 / 60)).append(":").append(var46.format(var37 % 60)).toString();
            }

            var30.B(var38);
            this.xD0[var11].Ll(true);
         } else {
            this.xD0[var11].Ll(false);
         }
      }

      if (this.yd0.m40) {
         int var12 = (int)(System.currentTimeMillis() / 1000L - this.yd0.V20 / 1000L);
         StringBuilder var31;
         StringBuilder var53 = var31 = new StringBuilder();

         var53.append(sm0_0.wa0(5200, Math.max(1, this.yd0.Pl0) + ""));
         var53.append("\n");
         short var39 = 5201;
         String var47;
         if (this.yd0.V20 < 1L) {
            var47 = "---";
         } else {
            var53 = new StringBuilder();
            DecimalFormat var48 = IY;
            var47 = var53.append(IY.format(var12 / 60)).append(":").append(var48.format(var12 % 60)).toString();
         }

         var31.append(sm0_0.wa0(var39, var47));
         a10_0 var40 = this.yd0;
         int var49;
         if ((var49 = this.yd0.S0 * 60) > 0) {
            if (var40.V20 < 1L) {
               var31.append("\n");
               var31.append(sm0_0.wa0(5202, "---"));
            } else {
               int var13;
               if ((var13 = var49 - var12) < 0) {
                  var13 = 0;
               }

               if (var13 < var49 * 0.5) {
                  var31.append("\n");
                  StringBuilder var56 = new StringBuilder();
                  DecimalFormat var41 = IY;
                  var31.append(sm0_0.wa0(5202, var56.append(IY.format(var13 / 60)).append(":").append(var41.format(var13 % 60)).toString()));
               }
            }
         }

         this.bF.qF0(pa0_0.up0);
         this.bF.Sk(var31.toString());
      }

      a10_0 var14 = this.yd0;
      if (this.yd0.a40) {
         this.a60.Ll(true);
      } else {
         if (!this.Be.eE && (this.xT == null || !this.TH0.eE && !this.Wq0.eE && var14.gc0() < 0) && !this.kX.eE && !this.ri0.eE && (!this.BF0 || this.f6)) {
            if (this.vl) {
               this.Ne0.Ll(true);
            }

            this.a60.Ll(false);
         } else {
            this.Ne0.Ll(false);
            this.a60.Ll(true);
         }

         label177: {
            a10_0 var15 = this.yd0;
            if (this.yd0.I60 == null && var15.rU == null && var15.rg0 && System.currentTimeMillis() / 1000L > var15.p1 + h50_0.X9 + 1) {
               a10_0 var16 = this.yd0;
               if (this.yd0.m40 && !(var16 instanceof cj_0)) {
                  this.z9.Ll(true);
                  break label177;
               }
            }

            xe_1 var17 = this.z9;
            if (this.z9.eE) {
               var17.Ll(false);
            }
         }

         if (this.yd0.T2() && this.cr.ty0()) {
            byte var18 = this.yd0.K80;
            dl_2 var19;
            if ((var19 = this.yd0.Qt0(var18, this.yd0.AD)) != null && var19.Ui0 && var19.VS - (int)(System.currentTimeMillis() / 1000L - var19.V1) < 1) {
               tw0_0.rl.fk0.uQ(new B00());
            } else {
               Arrays.stream(this.yd0.I60)
                  .flatMap(Arrays::stream)
                  .filter(Objects::nonNull)
                  .filter(var1x -> var1x != var19)
                  .filter(ML0::Ga0)
                  .findAny()
                  .ifPresent(ML0::kP);
            }
         }

         dy_1 var20 = this.yd0.rU;
         if (this.yd0.rU != null && var20.K50 && var20.mi0() < 1 && this.cr.ty0()) {
            this.ke0();
         }
      }

      // The battle HUD can render one frame while the battle screen is being
      // disposed or has not yet been attached to the renderer.
      Oz0 battleScreen = tw0_0.LD0 == null ? null : tw0_0.LD0.he0;
      if (this.xT != null && this.u20() && this.yd0.Tk0.isEmpty() && battleScreen != null && battleScreen.OE == ca_2.M6) {
         this.Ck0(true);
         b30_0 var21 = this.Ru;
         if (this.Ru != null) {
            jd0_1 var55 = this.Tb0[this.xT.Pp0][var21.B6];
            this.Tb0[this.xT.Pp0][var21.B6].getClass();
            int var22 = (int)(Math.sin((int)(hk0_1.KG / 50L % 20L) * 2 * Math.PI / 20) * 2);
            int var32 = var55.j00;
            int var23 = var55.Kl + var22;
            int var42 = var55.k0;
            int var50 = var55.Ou;
            var55.V6(var32, var23, var42, var50, true);
         }
      } else {
         this.Ck0(false);
      }

      super.HP(var1);
   }

   public final void aa0(PF var1, PF var2, Nt var3, boolean var4, boolean var5, short var6, boolean var7, qn_1 var8) {
      if (var3.Ja0((byte)1) && (var2 = this.yd0.nd0(var3.jA0)) == null) {
         dl_1 var23 = Ed0;
         RuntimeException var14;
         var14 = new RuntimeException();
         var23.error("Attempt to override target to invalid object id.", var14);
      } else if (var3.Ja0((byte)2) && (var1 = this.yd0.nd0(var3.fe0)) == null) {
         dl_1 var10000 = Ed0;
         RuntimeException var13;
         var13 = new RuntimeException();
         var10000.error("Attempt to override attacker to invalid object id.", var13);
      } else {
         if (var3.Ja0((byte)32)) {
            var1.WP((byte)1);
         }

         byte var9;
         if (var1 != null && var2 != null && var1.Zo0().equals(var2.Zo0())) {
            var9 = 1;
         } else {
            var9 = 2;
         }

         boolean[] var10 = new boolean[var9];

         for (int var11 = 0; var11 < var9; var11++) {
            PF var12;
            if (var11 == 0) {
               var12 = var2;
            } else {
               var12 = var1;
            }

            boolean var22;
            if (var12 != null && var12.uk() > 0) {
               var22 = true;
            } else {
               var22 = false;
            }

            var10[var11] = var22;
         }

         if (var3 instanceof eb0_0) {
            ((eb0_0)var3).IE0(var1, var2, var4, var5, var6, (boolean)var7, asBridge(), var8);
         }

         for (int var15 = 0; var15 < var9; var15++) {
            PF var16;
            if (var15 == 0) {
               var16 = var2;
            } else {
               var16 = var1;
            }

            if (var10[var15] && var16 != null && var16.uk() < 1 && !var16.zi0.Bj()) {
               X00 var17;
               var17 = new X00(asBridge(), var16, true);
               this.lZ.add(new kw_0(var17));
               lpt6__2 var18 = lpt6__2.Q80;
               byte var19 = 14;
                int var24 = this.yd0.QX(0, var16);
               String[] var21;
               (var21 = new String[1])[0] = var16.A60();
                this.wJ(sm0_0.fg0((byte)2, var18, var19, var24, var21), "", null);
            }
         }
      }
   }

   public final a10_0 BM() {
      return this.yd0;
   }

   public final void wJ(String var1, String var2, Runnable var3) {
      String[] var8 = var1.split("\n\n");

      for (int var4 = 0; var4 < var8.length; var4++) {
         String var5;
         String var6 = (var5 = var8[var4]).replaceAll("\\{[^\\}]+\\}", "");
         Runnable var7;
         if (var4 == var8.length - 1) {
            var7 = var3;
         } else {
            var7 = null;
         }

         String displayText = var5.replaceAll("\\[#(.*?)\\](.*?)\\[#(.*?)\\]", "$2");
         is_0 var11 = new is_0(displayText, this.fE, var7);

          String var12 = var6;
          String var13 = var2;
          Runnable var10 = () -> {
             if (!var12.isEmpty()) {
                tw0_0.rl.jC(var13.isEmpty() ? var12 : var13, zo_0.n4);
             }
          };
          if (var10 != null) {
            var11.fF0.add(var10);
         }

         this.lZ.add(var11);
      }
   }

   public final void ob(String var1) {
      String[] var6;
      int var2 = (var6 = var1.split("\n\n")).length;

      for (int var3 = 0; var3 < var2; var3++) {
         String var4;
         String var10000 = var4 = var6[var3];
         LinkedList var10001 = this.lZ;
         String var5 = var4.replaceAll("\\[#(.*?)\\](.*?)\\[#(.*?)\\]", "$2");
         var10001.add(new Zx0(var5, this.fE));
         if (!var10000.isEmpty()) {
            tw0_0.rl.jC(var4.replaceAll("\\{[^\\}]+\\}", ""), zo_0.n4);
         }
      }
   }

   public final void rK(String var1) {
      this.I1("", "", null);
   }

   public final void I1(String var1, String var2, Runnable var3) {
      String[] var10;
      int var4 = (var10 = var1.split("\n\n")).length;

      for (int var5 = 0; var5 < var4; var5++) {
         String var6;
         String var7 = (var6 = var10[var5]).replaceAll("\\{[^\\}]+\\}", "");
          var6 = var6.replaceAll("\\[#(.*?)\\](.*?)\\[#(.*?)\\]", "$2");
          ZJ var9 = this.fE;
          Runnable[] var12;
          Runnable[] var10003 = var12 = new Runnable[2];
          String var13 = var7;
          String var14 = var2;
          var10003[0] = () -> {
             if (!var13.isEmpty()) {
                tw0_0.rl.jC(var14.isEmpty() ? var13 : var14, zo_0.n4);
             }
          };
          var10003[1] = var3;

          g10_0 var8 = new g10_0(var6, var9, var12);

         this.lZ.add(var8);
      }
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public final boolean Yn0(SZ var1) {
      if (var1 == null) {
         return false;
      }

      switch (var1.Bi()) {
         case 0:
            this.wJ(g6_0.dG(var1.pj(), var1.WL()), "", null);
            return true;
         case 1:
            this.wJ(GJ.Ig0.Xw(var1.pA0(), var1.l30()), "", null);
            return true;
         case 2:
            P50 var2 = (P50)var1;
            byte var3 = var2.h4;
            uy_0 var4 = var3 >= 0 && var3 < rh_1.vY.Yj.length ? rh_1.vY.Yj[var3] : null;
            if (var4 == null) {
               return true;
            }
            e80_0 var5 = (e80_0)var4.lL0.get(var2.ct);
            if (var5 == null) {
               return true;
            }
            String var6 = var2.pS >= 0 && var2.pS < var5.Dc0.length ? GJ.Ig0.Xw(var5.rd0, var5.Dc0[var2.pS]) : "";
            this.wJ(var6, "", null);
            return true;
         case 3:
            N5 var7 = (N5)var1;
            this.wJ(sm0_0.Bw(var7.tM, var7.r, var7.w00, var7.aJ, sm0_0.zb0), "", null);
            return true;
         default:
            return false;
      }
   }

   public final boolean u20() {
      this.ty0();
      N60 var1;
      return this.lZ.isEmpty() && ((var1 = this.BQ) == null || var1.lPt1());
   }

   public final void Ck0(boolean var1) {
      if (this.vl != var1) {
         this.vl = var1;
         this.Vh.Ll(var1);
         this.Xs.Ll(var1);
         this.HJ.Ll(var1);
         this.Ne0.Ll(var1);
         G20 var2 = this.t6;
         if (this.t6 != null) {
            boolean var3;
            if (var1 && tw0_0.e60.jB0.fH0 >= 8) {
               var3 = true;
            } else {
               var3 = false;
            }

            var2.Ll(var3);
         }

         a10_0 var6 = this.yd0;
         if (this.yd0.nf == Cq.Hs0) {
            if (var6.Sv == XA0.af0) {
               this.V6.Ll(var1);
            } else {
               var2 = this.V6;
               b30_0 var10 = this.Ru;
               boolean var11;
               if (this.Ru != null && var10.B6 != 1 && var1) {
                  var11 = true;
               } else {
                  var11 = false;
               }

               var2.Ll(var11);
            }
         }

         this.fE.Ll(var1 ^ true);
         ZJ var8 = this.fE;
         if (!this.fE.eE) {
            var8.Sk("");
         }

         this.Bo0.AD(var1);
         if (var1) {
            this.IE();
            this.rg0();
            a10_0 var4 = this.yd0;
            if (this.yd0.nf == Cq.Sa0) {
               Arrays.stream(var4.wI0).flatMap(Arrays::stream).filter(Objects::nonNull).filter(ML0::qx0).forEach(this::mQ);
               if (this.yd0.Cd0()) {
                  this.Vh.Ll(false);
                  this.Xs.Ll(false);
                  Arrays.stream(this.Tb0).flatMap(Arrays::stream).forEach(var0 -> var0.Hm(false));
                  this.Tx0();
               }
            }

            xe_1[] var5 = this.L1;
            int var9;
            if (tw0_0.kz0()) {
               var9 = this.L1.length;
            } else {
               var9 = this.L1.length / 2;
            }

            this.Bl0(var5, var9, false, true);
         }
      }
   }

   public final void g9() {
      if (tw0_0.kz0() ^ true) {
         sc_2 var1 = this.GH0;
         if (this.GH0 != null) {
            this.u3(var1);
            this.GH0 = null;
         }
      } else if (this.Hd != null) {
         this.GH0 = null;
         this.ke();
      }
   }

   public void K8() {
      int var1 = 115;
      int var2;
      int var35;
      int var36;
      int var55;
      int var62;
      int var79;
      if (tw0_0.kz0() && this.yd0.Sv != XA0.PRN) {
         var1 = 160;
         var2 = tw0_0.LD0.ew0();
         int var97 = var35 = tw0_0.LD0.Hv0();
         byte var37 = 0;
         var55 = var97 - 526;
         byte var63 = 0;
         var62 = var55;
         var36 = var35;
         var55 = var37;
         var79 = var63;
      } else {
         fc0_2.q70(dw_2.c10, true);
         var2 = fc0_2.YQ;
         var35 = fc0_2.On0 + (var62 = (int)Math.ceil(tw0_0.LD0.Ew * 50.0F));
         var36 = fc0_2.On0;
         int leftOffset = (tw0_0.LD0.ew0() - var2) / 2;
         int verticalInset = fc0_2.On0 - 400;
         var55 = leftOffset;
         var79 = var62;
         var62 = verticalInset;
      }

      for (byte var8 = 0; var8 < this.Tb0.length; var8++) {
         if (tw0_0.kz0()) {
            this.z70[var8].oY(325, 32);
         } else {
            this.z70[var8].lt0();
         }

         if (var8 == this.yd0.eI()) {
            if (tw0_0.kz0()) {
               vw_0 var9;
               vw_0 var99 = var9 = this.z70[var8];
               int var85 = var55 + var2 - var9.Mx;
               var99.E40(var85, var79 + 200);
            } else {
               this.z70[var8].E40(var55 + var2 - this.z70[var8].Mx, var79 + 100);
            }
         } else {
            vw_0 var86 = this.z70[var8];
            int var10 = var35 - 160;
            byte var11;
            if (tw0_0.kz0()) {
               var11 = 100;
            } else {
               var11 = 0;
            }

            var86.E40(var55, var10 - var11);
         }

         for (byte var87 = 0; var87 < this.Tb0[var8].length; var87++) {
            if (var8 == this.yd0.Ez0()) {
               a10_0 var94 = this.yd0;
               if (this.yd0.j6 != zg0_0.ef0) {
                  jd0_1 var100 = this.Tb0[var8][var87];
                  int var95 = var55 + var2 - 299;
                  var100.V6(var95, var62 + 266 - ((byte)var94.wI0[var8].length - 1) * 30, var2, var36, false);
                  continue;
               }
            }

            this.Tb0[var8][var87].V6(var55, 140 - ((byte)this.yd0.wI0[var8].length - 1) * 20, var2, var36, false);
         }

         if (this.oe[var8] != null) {
            if (var8 == this.yd0.Ez0()) {
               int var89;
               fy_2 var102;
               int var116;
               if (tw0_0.kz0()) {
                  var102 = this.oe[var8];
                  var89 = var55 + var2 - 370;
                  var102.E40(var89, var62 + 295);
                  var102 = this.GB[var8];
                  var89 = var2 - 3 + var55 - 368;
                  var116 = var62 + 302;
               } else {
                  var102 = this.oe[var8];
                  var89 = var55 + var2 - 212;
                  var102.E40(var89, var62 + 300);
                  var102 = this.GB[var8];
                  var89 = var2 - 3 + var55 - 206;
                  var116 = var62 + 310;
               }

               var102.E40(var89, var116);
            } else {
               fy_2 var104;
               int var117;
               short var123;
               byte var10003;
               byte var10004;
               if (tw0_0.kz0()) {
                  this.oe[var8].E40(var55 + 30, ((byte)this.yd0.wI0[var8].length - 1) * 40 + 170);
                  var104 = this.GB[var8];
                  var117 = var55 + 28;
                  var123 = 178;
                  var10003 = 40;
                  var10004 = (byte)this.yd0.wI0[var8].length;
               } else {
                  this.oe[var8].E40(var55 + 80, ((byte)this.yd0.wI0[var8].length - 1) * 20 + 175);
                  var104 = this.GB[var8];
                  var117 = var55 + 83;
                  var123 = 183;
                  var10003 = 20;
                  var10004 = (byte)this.yd0.wI0[var8].length;
               }

               var104.E40(var117, (var10004 - 1) * var10003 + var123);
            }
         }
      }

      if (!(tw0_0.kz0() ^ true) && this.yd0.Sv != XA0.PRN) {
         this.WU.oY(tw0_0.LD0.ew0(), tw0_0.LD0.Hv0());
         this.WU.lt0();
         this.WU.E40(0, 0);
         fy_2 var106 = this.Be;
         fy_2 var118 = this.Be;
         this.Be.oY(var36 = tw0_0.LD0.ew0(), var62 = tw0_0.LD0.Hv0());
         var118.RY(var36, var62);
         var106.g2(var36, var62);
         this.Be.E40(0, 0);
         G20[] var40 = this.iQ;
         var62 = this.iQ.length;

         for (int var80 = 0; var80 < var62; var80++) {
            var40[var80].lt0();
         }

         G20 var107 = this.iQ[0];
         pa0_0 var41 = pa0_0.xE;
         var107.vf(pa0_0.xE);
         G20[] var69 = this.iQ;
         G20 var108 = this.iQ[2];
         byte var42 = 0;
         var108.A20(var41, var42, var69[0].OB);
         G20 var109 = this.iQ[1];
         pa0_0 var43 = pa0_0.up0;
         var109.vf(pa0_0.up0);
         G20[] var70 = this.iQ;
         G20 var110 = this.iQ[3];
         var42 = 0;
         var110.A20(var43, var42, var70[1].OB);
      } else {
         this.WU.oY(var2, var1);
         var36 = var35 - var1;
         this.WU.E40(var55, var36);
         this.Be.oY(var2, var1);
         this.Be.E40(var55, var36);
         this.TH0.oY(var2, var1);
         this.TH0.E40(var55, var36);
         short var64;
         if (zb0_2.bigCJKFontSizes()) {
            var64 = 265;
         } else {
            var64 = 250;
         }

         this.kX.oY(var2, var64);
         this.kX.E40(var55, var35 - var64);
         q40_0 var65;
         q40_0 var105 = var65 = this.kX;
         var65.Rg = var2;
         var65.kr = var1;
         var65.fj = var55;
         var105.jA = var36;
         this.ri0.oY(var2, var1);
         this.ri0.E40(var55, var36);
         sc_2 var66 = this.GH0;
         if (this.GH0 != null) {
            var66.oY(var2, var1);
            this.GH0.E40(var55, var36);
         }
      }

      fy_2[] var45 = this.oe;
      var62 = this.oe.length;

      for (int var81 = 0; var81 < var62; var81++) {
         fy_2 var91;
         if ((var91 = var45[var81]) != null) {
            var91.lt0();
         }
      }

      fy_2[] var46 = this.GB;
      var62 = this.GB.length;

      for (int var82 = 0; var82 < var62; var82++) {
         fy_2 var92;
         if ((var92 = var46[var82]) != null) {
            var92.lt0();
         }
      }

      if (tw0_0.kz0() && this.yd0.Sv != XA0.PRN) {
         if (dw_2.lp0) {
            lg_0.S4.getClass();
            lg_0.S4.getClass();
         }

         this.fE.vi(17, 17, 7, 7);
         this.fE.oY(var2, var1);
         this.fE.A20(pa0_0.rr0, 0, 0);
         I2 var16 = this.WU.t30.ZD();

         while (var16.hasNext()) {
            ((le0_2)var16.next()).lt0();
         }

         pa0_0 var17 = pa0_0.rr0;
         this.Vh.E2(pa0_0.rr0, 0, -this.Xs.OB + 25);
         this.Xs.E2(var17, this.Vh.Mx - 25, 0);
         G20 var18 = this.Xs;
         var1 = this.Xs.A20 + var18.Mx;
         this.V6.E40(var1, this.Xs.SB0);
         pa0_0 var20 = pa0_0.Ht0;
         this.HJ.E2(pa0_0.Ht0, -this.Xs.Mx, 0);
         this.Ne0.E2(var20, 0, 0);
         G20 var48 = this.t6;
         if (this.t6 != null) {
            var48.E2(var20, -this.Xs.Mx - this.Ne0.Mx, 0);
            this.t6.g2(250, 75);
         }
      } else {
         this.fE.qF0(pa0_0.qQ);
         var1 = this.WU.A20;
         this.fE.E40(var1, this.WU.SB0);
         this.Vh.RY(209, 52);
         this.Xs.RY(209, 52);
         this.HJ.RY(209, 52);
         this.Ne0.RY(209, 52);
         G20 var14 = this.t6;
         if (this.t6 != null) {
            var14.g2(180, 52);
         }

         ak0_2[] var15 = this.jb0;
         var36 = this.jb0.length;

         for (int var73 = 0; var73 < var36; var73++) {
            var15[var73].RY(200, 48);
         }
      }

      ak0_2[] var21 = this.to;
      var36 = this.to.length;

      for (int var74 = 0; var74 < var36; var74++) {
         var21[var74].RY(200, 48);
      }

      this.a60.lt0();
      this.a60.RY(128, 24);
      this.v80.lt0();
      G20 var22 = this.v80;
       int var50;
      if (tw0_0.kz0()) {
         var50 = 128;
      } else {
         var50 = 210;
      }

      label178: {
         var22.RY(var50, 24);
         if (tw0_0.kz0()) {
            a10_0 var23 = this.yd0;
            if (this.yd0.Sv != XA0.PRN && !var23.a40) {
               if (var23.nf == Cq.yH) {
                  pa0_0 var24 = pa0_0.L00;
                  this.a60.A20(pa0_0.L00, -70, 0);
                  this.v80.A20(var24, 70, 0);
               } else {
                  this.a60.vf(pa0_0.L00);
               }
               break label178;
            }
         }

         this.a60.E40(this.Be.cz() - this.a60.Mx, this.Be.VM() - this.a60.OB);
      }

      hh0_1 var25 = this.yf0;
      label172:
      if (this.yf0 != null && var25.eE) {
         if (tw0_0.kz0()) {
            a10_0 var26 = this.yd0;
            if (this.yd0.Sv != XA0.PRN && !var26.a40) {
               this.yf0.A20(pa0_0.rr0, 15, -15);
               this.a60.A20(pa0_0.Ht0, -15, -15);
               break label172;
            }
         }

         hh0_1 var111 = this.yf0;
         int var121 = this.Be.cz() - this.a60.Mx;
         fy_2 var27 = this.Be;
         var111.E40(var121, this.Be.SB0 + var27.y9);
      }

      if (this.Vw0 != null && tw0_0.kz0() ^ true) {
         cn_0 var28 = this.Vw0;
         if (this.Vw0.eE) {
            var28.qF0(pa0_0.Ol);
            cn_0 var29 = this.Vw0;
            var1 = (int)(var2 / 2 + var55 - var29.Mx * 0.5);
            this.Vw0.E40(var1, var35 - 140);
         }
      }

      this.ki.E40(var55, var79);
      this.ki.oY(var2, 40);
      this.bF.E40((var1 = var55 + var2) - 4, var79 + 90);
      pa0_0 var51 = pa0_0.Ol;
      this.Vd.qF0(pa0_0.Ol);
      int var32;
      this.Vd.E40(var2 / 2 + var55, var32 = var79 + 20);
      ae0_1 var75 = this.xD0[0];
      var55 += 5;
       int var83;
      if (tw0_0.kz0()) {
         var83 = 6;
      } else {
         var83 = 11;
      }

      var75.E40(var55, var79 + var83);
      ae0_1 var58;
      int var112 = (var58 = this.xD0[0]).A20 + var58.Mx;
      this.G1[0].qF0(var51);
      this.G1[0].E40((var112 + this.Vd.A20) / 2, var32);
      S70 var59 = this.JU[0];
      cn_0 var76;
      var62 = (var76 = this.G1[0]).A20 - var76.hr0() / 2 - 50;
      var83 = this.G1[0].SB0;
      byte var93;
      if (tw0_0.kz0()) {
         var93 = 22;
      } else {
         var93 = 15;
      }

      var59.E40(var62, var83 - var93);
      var112 = this.xD0[1].A20;
      this.G1[1].qF0(var51);
      this.G1[1].E40((var112 + this.Vd.A20) / 2, var32);
      S70 var33 = this.JU[1];
      var50 = this.G1[1].A20;
      var50 = this.G1[1].hr0() / 2 + var50 + 20;
      var55 = this.G1[1].SB0;
      byte var78;
      if (tw0_0.kz0()) {
         var78 = 22;
      } else {
         var78 = 15;
      }

      var33.E40(var50, var55 - var78);
      ae0_1 var34 = this.xD0[1];
      var50 = var1 - 205;
      byte var61;
      if (tw0_0.kz0()) {
         var61 = 6;
      } else {
         var61 = 11;
      }

      var34.E40(var50, var79 + var61);
      this.z9.lt0();
      this.z9.RY(128, 24);
      this.z9.E40(this.Be.cz() - this.z9.Mx, this.Be.VM() - this.z9.OB);
      if (tw0_0.kz0()) {
         this.Bo0.E2(pa0_0.L00, 0, 0);
      }

      if (this.zJ != null) {
         int var12;
         qj_2 var114;
         int var122;
         if (tw0_0.kz0()) {
            var114 = this.zJ;
            var12 = var1 - 1260;
            var122 = var35 - 280;
         } else {
            var114 = this.zJ;
            var12 = var1 - 20;
            var122 = var35 - 136;
         }

         var114.E40(var12, var122);
      }
   }

   public final void jg0(tb0_1 var1) {
      if (var1 != null) {
         boolean var14;
         byte var2 = var1.Ni;
         byte var3 = var1.X90;
         O8 var4;
         byte var5;
         byte var10;
         if ((var5 = (var4 = this.yd0.mn(var2)).Fr(var1.Ua0)) > 0 && (var10 = var4.L40(var5).qc) < 6) {
            var3 += var10;
         }

         S70[] var11;
         if (var3 < (var11 = this.As[var2]).length) {
            a10_0 var6 = this.yd0;
            if (this.yd0.Sv != XA0.Fz || var5 == var6.AD) {
               S70 var12;
               if ((var12 = var11[var3]) != null && this.Gr0[var2][var3] != null) {
                  var5 = var1.uG0;
                  if (var1.uG0 != 0) {
                     label102: {
                        if (var5 != -2) {
                           se_0 var13 = var1.B3;
                           if (var1.B3.Bn.YD0.Sa == 0L || !var13.hf0()) {
                              var14 = false;
                              break label102;
                           }
                        }

                        var14 = true;
                     }

                     if (var1.gQ()) {
                        se_0 var18 = var1.B3;
                        if (var14) {
                           Br0 var10000 = this.As[var2][var3].og;
                           AG0[] var10001 = new AG0[1];
                           byte var29 = 0;
                           var18.getClass();
                           yh_0 var10004 = yh_0.Xm0;
                           short var30 = var18.Bn.Yb0;
                           short var31 = yh_0.Ed(var18.nF0, var30);
                           var10001[var29] = var10004.qC0(var31, var18.D4, false)[0];
                           var10000.o60(var10001);
                        } else {
                           Br0 var37 = this.As[var2][var3].og;
                           var18.getClass();
                           yh_0 var51 = yh_0.Xm0;
                           short var32 = var18.Bn.Yb0;
                           short var33 = yh_0.Ed(var18.nF0, var32);
                           var37.o60(var51.qC0(var33, var18.D4, false));
                        }

                        Br0 var52 = this.As[var2][var3].og;
                        byte var34 = 36;
                        byte var7 = 36;
                        this.As[var2][var3].og.OA0 = true;
                        var52.IF = var34;
                        var52.gx0 = var7;
                        byte var35 = -10;
                        var52.gY = -8;
                        var52.a4 = var35;
                        if (var14) {
                           this.Gr0[var2][var3].og.lo0();
                        }

                        if ((var5 = var18.HP()) != -128) {
                           if (var5 != 16) {
                              if (var5 != 32) {
                                 if (var5 != 64) {
                                    if (var5 != 7) {
                                       if (var5 != 8) {
                                          this.Gr0[var2][var3].og.lo0();
                                       } else {
                                          Br0 var38 = this.Gr0[var2][var3].og;
                                          LPT6_[] var53 = new LPT6_[1];
                                          fn_0 var59 = fn_0.qz0();
                                          var5 = 8;
                                          var53[0] = var59.Q90[fn_0.Xa(var5)];
                                          var38.r8(var53);
                                       }
                                    } else {
                                       Br0 var39 = this.Gr0[var2][var3].og;
                                       LPT6_[] var54 = new LPT6_[1];
                                       fn_0 var60 = fn_0.qz0();
                                       var5 = 7;
                                       var54[0] = var60.Q90[fn_0.Xa(var5)];
                                       var39.r8(var54);
                                    }
                                 } else {
                                    Br0 var40 = this.Gr0[var2][var3].og;
                                    LPT6_[] var55 = new LPT6_[1];
                                    fn_0 var61 = fn_0.qz0();
                                    var5 = 64;
                                    var55[0] = var61.Q90[fn_0.Xa(var5)];
                                    var40.r8(var55);
                                 }
                              } else {
                                 Br0 var41 = this.Gr0[var2][var3].og;
                                 LPT6_[] var56 = new LPT6_[1];
                                 fn_0 var62 = fn_0.qz0();
                                 var5 = 32;
                                 var56[0] = var62.Q90[fn_0.Xa(var5)];
                                 var41.r8(var56);
                              }
                           } else {
                              Br0 var42 = this.Gr0[var2][var3].og;
                              LPT6_[] var57 = new LPT6_[1];
                              fn_0 var63 = fn_0.qz0();
                              var5 = 16;
                              var57[0] = var63.Q90[fn_0.Xa(var5)];
                              var42.r8(var57);
                           }
                        } else {
                           Br0 var43 = this.Gr0[var2][var3].og;
                           LPT6_[] var58 = new LPT6_[1];
                           fn_0 var64 = fn_0.qz0();
                           var5 = -128;
                           var58[0] = var64.Q90[fn_0.Xa(var5)];
                           var43.r8(var58);
                        }
                     } else {
                        this.As[var2][var3].og.Nk(new Wr[]{ob0_0.Ui0().W6((byte)3)});
                        Br0 var44 = this.As[var2][var3].og;
                        var5 = 16;
                        byte var36 = 16;
                        this.As[var2][var3].og.OA0 = true;
                        var44.IF = var5;
                        var44.gx0 = var36;
                        if (tw0_0.kz0()) {
                           var44 = this.As[var2][var3].og;
                           var5 = 14;
                           this.As[var2][var3].og.gY = 10;
                           var44.a4 = var5;
                        }
                     }

                     Br0 var15 = this.As[var2][var3].og;
                     gn_0 var28;
                     if (var14) {
                        var28 = np;
                     } else {
                        var28 = null;
                     }

                     var15.wx0(var28);
                     S70 var47 = this.As[var2][var3];
                     this.As[var2][var3].yj0 = lb0_2.vq(this.yd0, var1, true);
                     var47.yB0();
                     this.As[var2][var3].GH0 = 1;
                  } else {
                     var12.og.Nk(new Wr[]{ob0_0.Ui0().W6((byte)3)});
                     this.As[var2][var3].og.wx0(ZP);
                     Br0 var48 = this.As[var2][var3].og;
                     byte var8 = 16;
                     byte var16 = 16;
                     this.As[var2][var3].og.OA0 = true;
                     var48.IF = var8;
                     var48.gx0 = var16;
                     if (tw0_0.kz0()) {
                        var48 = this.As[var2][var3].og;
                        byte var9 = 14;
                        this.As[var2][var3].og.gY = 10;
                        var48.a4 = var9;
                     }

                     S70 var50 = this.As[var2][var3];
                     this.As[var2][var3].yj0 = "";
                     var50.yB0();
                     this.As[var2][var3].ur0();
                  }
               }
            }
         }
      }
   }

   public void H5(boolean var1, boolean var2) {
      a10_0 var3 = this.yd0;
      int var8 = var1 ? 1 : 0;
      if (this.yd0.nf == Cq.Jd) {
         var2 = false;
      }

      byte var7;
      if (var1) {
         var7 = var3.eI();
      } else {
         var7 = var3.Ez0();
      }

      fy_2 var4;
      if ((var4 = this.oe[var7]) != null) {
         var4.Ll(var2);
      }

      if ((var4 = this.GB[var7]) != null) {
         var4.Ll(var2);
      }

      if (var2) {
         if (var1) {
            cn_0 var9 = this.bF;
            boolean var5;
            if (var2 && !this.yd0.j6.u) {
               var5 = true;
            } else {
               var5 = false;
            }

            var9.Ll(var5);
         }

         this.G1[var8].Ll(var2);
         this.JU[var8].Ll(var2);
         this.xD0[var8].Ll(var2);
         this.Vd.Sk(sm0_0.c0(5024));
      }

      for (byte var6 = 0; var6 < this.Tb0[var7].length; var6++) {
         PF var10 = this.yd0.Ce(var7, var6);
         jd0_1 var13 = this.Tb0[var7][var6];
         se_0 var11;
         boolean var12;
         if (!var2 || var10 == null || (var11 = var10.zi0).Bj() && var11.jx == 2) {
            var12 = false;
         } else {
            var12 = true;
         }

         var13.Hm(var12);
      }
   }

   public final void NM() {
      if (this.yd0.Sv == XA0.Pb) {
         if (tw0_0.kz0()) {
            this.Vh.SU(tw0_0.rl.k0.hh0 + "x " + sm0_0.c0(5108));
         } else {
            this.Vh.SU(sm0_0.c0(5108));
         }

         this.Vh.Pc(sm0_0.wa0(5109, tw0_0.rl.k0.hh0 + ""));
      }
   }

   public final boolean nC0() {
      return this.xT != null;
   }

   public final void Xi0() {
      this.fE.Sk("");
      this.Zo();
      this.Vs = true;
      this.FU();
      if (tw0_0.kz0()) {
         this.ke();
         NN var1;
         NN var10008 = var1 = new NN(this.TH0);

         this.Hd = var10008;
         this.F9(this.fU(), var1);
         this.u3(this.a60);
         hh0_1 var2 = this.a60;
         this.F9(this.fU(), var2);
      }

      this.TH0.Ll(true);
      this.Bl0(this.jb0, 3, false, true);
   }

   public final void Zo() {
      if (!(tw0_0.kz0() ^ true) && this.yd0.Sv != XA0.PRN) {
         lg_0.k.lPT5(() -> {
            hh_0.JW(pa0_0.xE, this.Vh, tw0_0.LD0.ew0(), tw0_0.LD0.Hv0(), null);
            pa0_0 var1;
            pa0_0 var10001 = var1 = pa0_0.L00;
            hh_0.JW(var1, this.Xs, tw0_0.LD0.ew0(), tw0_0.LD0.Hv0(), null);
            hh_0.JW(var1, this.V6, tw0_0.LD0.ew0(), tw0_0.LD0.Hv0(), null);
            hh_0.JW(var10001, this.Bo0, tw0_0.LD0.ew0(), tw0_0.LD0.Hv0(), null);
            G20 var2 = this.t6;
            if (this.t6 != null) {
               hh_0.JW(var1, var2, tw0_0.LD0.ew0(), tw0_0.LD0.Hv0(), null);
            }

            hh_0.JW(pa0_0.up0, this.Ne0, tw0_0.LD0.ew0(), tw0_0.LD0.Hv0(), null);
            G20 var4 = this.HJ;
            int var5 = tw0_0.LD0.ew0();
            int var6 = tw0_0.LD0.Hv0();
            LB0 var3 = (var1x, var2x) -> this.WU.Ll(false);
            this.Aq = hh_0.JW(var1, var4, var5, var6, var3);
         });
      } else {
         this.WU.Ll(false);
      }
   }

   public final void zG() {
      if (!(tw0_0.kz0() ^ true) && this.yd0.Sv != XA0.PRN) {
         lg_0.k.lPT5(this::Em0);
      } else {
         this.WU.Ll(true);
      }
   }

   public final jd0_1 Hi(PF var1) {
      return var1 == null ? this.Tb0[0][0] : this.Tb0[var1.cD0][var1.Kj0];
   }

   public boolean rp0() {
      return true;
   }

   public final void lpt7() {
      if (this.u20() && !this.BF0) {
         a10_0 var1 = this.yd0;
         if (this.yd0 != null && var1.j6.u) {
            this.BF0 = true;
            if (tw0_0.kz0() ^ true || this.yd0.a40) {
               for (byte var6 = 0; var6 < this.Tb0.length; var6++) {
                  a10_0 var2 = this.yd0;
                  if (this.yd0.a40 || var6 != var2.Ez0()) {
                     for (byte var17 = 0; var17 < this.Tb0[var6].length; var17++) {
                        PF var10000 = this.yd0.Ce(var6, var17);
                        jd0_1 var3 = this.Tb0[var6][var17];
                        boolean var4;
                        if (var10000 != null) {
                           var4 = true;
                        } else {
                           var4 = false;
                        }

                        var3.Hm(var4);
                     }
                  }
               }
            }

            var1 = this.yd0;
            if (!this.yd0.a40 && var1.j6.u) {
               dy_1 var18 = var1.rU;
               if ((var1.rU == null || !var18.K50 || var18.mi0() >= 1) && var1.vy0) {
                  this.EE();

                  for (byte var8 = 0; var8 < this.jD0.length; var8++) {
                     a10_0 var10001 = this.yd0;
                     byte var19 = this.yd0.eI();
                     PF var20;
                     if (var8 >= (byte)var10001.wI0[var19].length) {
                        var20 = null;
                     } else {
                        var20 = this.yd0.Ce(this.yd0.eI(), var8);
                     }

                     this.jD0[var8].W(var20);
                     ak0_2 var31 = this.jD0[var8];
                     byte var21;
                     if (var20 != null) {
                        var21 = var20.Wm();
                     } else {
                        var21 = -1;
                     }

                     var31.SF(var21);
                     this.jD0[var8].pw0(true);
                  }

                  this.TH0.Ll(true);
                  this.Zf0.Ll(true);
                  byte var9 = 3;
                  this.Bl0(this.jb0, var9, false, true);
                   String var22 = sm0_0.c0(5029);
                   short var32 = (short)(tw0_0.kz0() ? 133 : 96);
                   short var36 = (short)(tw0_0.kz0() ? 129 : 30);
                   hh0_1 var10 = new hh0_1(var22, var32, var36);
                  this.yf0 = var10;
                  String var23;
                  if (tw0_0.kz0()) {
                     var23 = "battle-fight";
                  } else {
                     var23 = "battle-button-confirm";
                  }

                  var10.uf(var23);
                  this.yf0.RR(this::ke0);
                  es_1 var11;
                  var11 = new es_1(xe_1.class);
                  byte var24 = 0;

                  while (true) {
                     ak0_2[] var33 = this.jb0;
                     if (var24 >= this.jb0.length || var24 >= 3) {
                        byte var25 = 1;
                        xe_1[] var34;
                        (var34 = new xe_1[1])[0] = this.yf0;
                        var11.G6(var34, 0, var25);
                        byte var26 = 3;

                        while (true) {
                           ak0_2[] var35 = this.jb0;
                           if (var26 >= this.jb0.length) {
                              byte var12 = 1;
                              var11.G6(new xe_1[]{this.a60}, 0, var12);
                              xe_1[] var41 = (xe_1[])var11.Mo0(var11.rZ.getClass().getComponentType());
                              byte var13 = 4;
                              this.Bl0(var41, var13, false, true);
                               le0_2 var15;
                              if (tw0_0.kz0()) {
                                 this.ke();
                                 zc0_1 var14;
                                 zc0_1 var42 = var14 = new zc0_1();

                                 le0_2[] var27;
                                 (var27 = new le0_2[1])[0] = this.Zf0;
                                 var42.qG0(var27);
                                 le0_2[] var28;
                                 (var28 = new le0_2[1])[0] = this.Vw0;
                                 var42.qG0(var28);
                                 le0_2[] var29;
                                 (var29 = new le0_2[1])[0] = this.TH0;
                                 var42.qG0(var29);
                                 hs_2 var30;
                                 var30 = new hs_2(var14, var14);
                                 this.Hd = var30;
                                 this.F9(this.fU(), var30);
                                 this.u3(this.a60);
                                 var15 = this.a60;
                              } else {
                                 this.Vw0.lt0();
                                 var15 = this.Vw0;
                              }

                              this.F9(this.fU(), var15);
                              var15 = this.yf0;
                              this.F9(this.fU(), var15);
                              if (tw0_0.kz0()) {
                                 this.yf0.E2(pa0_0.rr0, 15, -15);
                                 this.a60.E2(pa0_0.Ht0, -15, -15);
                              } else {
                                 this.yf0.RY(196, 24);
                                 this.yf0.E40(this.jb0[this.jb0.length - 1].cz() - this.yf0.Mx, this.jb0[this.jb0.length - 1].VM() - this.yf0.OB);
                              }

                              return;
                           }

                           byte var38 = 1;
                           var11.G6(new xe_1[]{var35[var26]}, 0, var38);
                           var26++;
                        }
                     }

                     byte var37 = 1;
                     var11.G6(new xe_1[]{var33[var24]}, 0, var37);
                     var24++;
                  }
               }
            }

            a10_0 var39 = this.yd0;
            VW var5;
            var5 = new VW();
            var39.Tk0.add(var5);
            return;
         }
      }
   }

   public final void F00() {
      if (this.u20() && !this.BF0) {
         a10_0 var1 = this.yd0;
         if (this.yd0 != null) {
            boolean var2 = var1.j6.u;
            if (var1.j6.u) {
               this.BF0 = true;
               this.f6 = true;
               if (!var1.a40 && var2) {
                  dy_1 var14 = var1.rU;
                  if ((var1.rU == null || !var14.K50 || var14.mi0() >= 1) && var1.vy0) {
                     ak0_2[] var7 = this.jb0;
                     int var24 = this.jb0.length;

                     for (int var3 = 0; var3 < var24; var3++) {
                        ak0_2 var20 = var7[var3];
                        var7[var3].pw0(false);
                        var20.Ll(false);
                     }

                     byte var8 = 3;
                     this.Bl0(this.jb0, var8, false, true);
                      String var16 = sm0_0.c0(5048);
                      short var19 = (short)(tw0_0.kz0() ? 133 : 96);
                      short var4 = (short)(tw0_0.kz0() ? 129 : 30);
                      hh0_1 var9 = new hh0_1(var16, var19, var4);
                     this.yf0 = var9;
                     String var17;
                     if (tw0_0.kz0()) {
                        var17 = "battle-fight";
                     } else {
                        var17 = "battle-button-confirm";
                     }

                     var9.uf(var17);
                     this.yf0.RR(this::ke0);
                     es_1 var21 = new es_1(xe_1.class);
                     byte var10 = 1;
                     var21.G6(new xe_1[]{this.yf0}, 0, var10);
                     xe_1[] var22 = (xe_1[])var21.Mo0(var21.rZ.getClass().getComponentType());
                     byte var11 = 4;
                     this.Bl0(var22, var11, false, true);
                     if (tw0_0.kz0()) {
                        this.ke();
                        zc0_1 var12;
                        var12 = new zc0_1();
                        n00_0 var18;
                        var18 = new n00_0(var12, var12);
                        this.Hd = var18;
                        this.F9(this.fU(), var18);
                     }

                     hh0_1 var13 = this.yf0;
                     this.F9(this.fU(), var13);
                     if (tw0_0.kz0()) {
                        this.yf0.E2(pa0_0.rr0, 15, -15);
                     } else {
                        this.yf0.RY(196, 24);
                        this.yf0.E40(this.jb0[this.jb0.length - 1].cz() - this.yf0.Mx, this.jb0[this.jb0.length - 1].VM() - this.yf0.OB);
                     }

                     a10_0 var23 = this.yd0;
                     Oo0 var6;
                     var6 = new Oo0();
                     var23.Tk0.add(var6);
                     return;
                  }
               }

               a10_0 var10000 = this.yd0;
               VW var5;
               var5 = new VW();
               var10000.Tk0.add(var5);
               return;
            }
         }
      }
   }

   public final void ke0() {
      if (this.BF0 && !this.yd0.a40) {
         this.BF0 = false;
         this.f6 = false;
         this.ke();
         BR var1;
         BR var10000 = var1 = tw0_0.rl;
         CH0[] var2 = (CH0[])this.yK.stream().filter(Objects::nonNull).map(value -> ((PH0)value).ZK()).toArray(CH0[]::new);
         var10000.getClass();
         a10_0 var3 = tw0_0.PK0;
         if (tw0_0.PK0 != null && var3.j6.u && !var3.a40) {
            var1.fk0.uQ(new av0_0(var2));
         }

         this.TH0.Ll(false);
         this.Zf0.Ll(false);
         this.u3(this.yf0);
         this.u3(this.Vw0);
         a10_0 var5 = this.yd0;
         VW var4;
         var4 = new VW();
         var5.Tk0.add(var4);
      } else {
         this.BF0 = false;
         this.f6 = false;
      }
   }

   public final void GD0() {
      BR var1 = tw0_0.rl;
      if (tw0_0.rl != null) {
         var1.wF();
         this.lZ.clear();
         a10_0 var10000 = this.yd0;
         this.yd0.Tk0.clear();
         var10000.lPt9.clear();
      }
   }

   public final void om0() {
      a10_0 var10001 = this.yd0;
      byte var1 = this.yd0.Ez0();
      PF[] var2 = var10001.wI0[var1];
      byte var3 = this.Ru.B6;
      byte var4 = (byte)(this.Ru.B6 >= 2 ? 0 : var3 + 1);
      var3 = (byte)(var3 <= 0 ? 2 : var3 - 1);
      boolean var5;
      PF var9;
      if ((var9 = var2[var4]) != null) {
         var5 = true;
      } else {
         var5 = false;
      }

      PF var6;
      boolean var8;
      if ((var6 = var2[var3]) != null) {
         var8 = true;
      } else {
         var8 = false;
      }

      if (var5 || var8) {
         if (!var5) {
            var9 = var6;
         }

         if (var9 != null) {
            this.Ru = b30_0.U5(var1, var9.Kj0);
            this.X60(false);
            this.r60(var9);
         }
      }
   }

   public final void Tx0() {
      if (this.u20()) {
         jn_0 var1 = tw0_0.LD0;
         Oz0 var2;
         if (tw0_0.LD0 != null && (var2 = var1.he0) != null) {
            var2.ph();
         }

         a10_0 var3 = this.yd0;
         if (!this.yd0.dJ && !var3.Cd0()) {
            this.wJ(sm0_0.c0(5004), "", null);
         } else {
            a10_0 var4 = this.yd0;
            if (this.yd0.qn0 >= 0 && var4.eG[var4.Ez0()].L40(var4.AD).sR < 1) {
               this.wJ(sm0_0.c0(5128), "", null);
            } else {
               if (tw0_0.kz0()) {
                  this.ke();
                  NN var5;
                  NN var10008 = var5 = new NN(this.kX);

                  this.Hd = var10008;
                  this.F9(this.fU(), var5);
                  this.u3(this.a60);
                  hh0_1 var6 = this.a60;
                  this.F9(this.fU(), var6);
               }

               this.Zo();
               this.kX.Ll(true);
            }
         }
      }
   }
}
