package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;

public class ChatHistoryViewportComponent extends BaseComponent {
   public static final dl_1 es = Cq0.E1(ChatHistoryViewportComponent.class);
   public final fy_2 y6;
   public final R90 uq0;
   public final R90 NL;
   public final fy_2 Pk;
   public final y4_0 c70;
   public final fy_2 Tl0;
   public final qk0_2 sx;
   public boolean ey = false;
   public final le0_2 sL0;
   public final cg_0 Xy0;
   public final cg_0 p40;
   public final xe_1 Gf0;
   public final X6 Hl;
   public final W9 Ho;
   public final xe_1 wf0;
   public final xe_1[] jW;
   public final Qy0 kD0;
   public final cn_0 Xw;
   public MC0 Oe0 = null;
   public final xe_1 MN;
   public final lo0_0 TB;
   public final zx_0 o7;
   public final dr_1 Za0;
   public final cn_0 nt0;
   public final cn_0 BZ;
   public final cn_0 JL;
   public final cn_0 H2;
   public final cn_0 eM0;
   public boolean pE = false;

   public ChatHistoryViewportComponent(Qy0 var1) {
      this.uf("logingui");
      tu_0 var2 = com9__2.fI0().AL0();
      if (!tw0_0.Ll0.zd && xs_0.rD0) {
         int var3;
         if ((var3 = var2.ordinal()) != 1) {
            if (var3 != 2 && var3 != 3) {
               bu_0 var20 = tw0_0.RE0;
               short var4;
               if (rg0_2.r4(50) == 0) {
                  var4 = 1157;
               } else {
                  var4 = 1159;
               }

               var20.sK(var4);
            } else {
               tw0_0.RE0.sK((short)1108);
            }
         } else {
            tw0_0.RE0.sK((short)1083);
         }
      }

      this.kD0 = var1;
      R90 var21 = new R90();
      this.uq0 = var21;
      var21.bD(false);
      var21.Hy(sm0_0.c0(1000));
      var21.uf("login-window");
      fy_2 var28 = new fy_2();
      this.y6 = var28;
      cn_0 var5 = null;
      if (qt_1.st0()) {
         var5 = new cn_0(sm0_0.c0(nf0_0.AI));
         var5.uf("warnlabel");
         this.SL(var5);
      }
      this.nt0 = var5;

      cg_0 var32 = new cg_0();
      this.Xy0 = var32;
      var32.Yr0(value -> !Character.isWhitespace((char)value));
      var32.Bl(xw_1.lv0);
      var32.I7();
      var32.Ii(new F7((f.LPt2_)(Object)this));
      cg_0 var6 = new cg_0();
      this.p40 = var6;
      var6.Zg0(true);
      var6.Ii(this::RN);
      cn_0 var7 = new cn_0(sm0_0.c0(1001));
      this.H2 = var7;
      var7.coM8(var32);
      var7.kl();
      cn_0 var49 = new cn_0(sm0_0.c0(1002));
      this.JL = var49;
      var49.coM8(var6);
      var49.kl();
      xe_1 var39 = new xe_1(sm0_0.c0(1000));
      this.Gf0 = var39;
      var39.RR(this::cOm2);
      W9 var40 = new W9();
      this.Ho = var40;
      cn_0 var8 = new cn_0(sm0_0.c0(1025));
      this.BZ = var8;
      var8.coM8(var40);
      X6 var41 = new X6();
      this.Hl = var41;
      var41.Rm0(this::Pv);
      cn_0 var53 = new cn_0(sm0_0.c0(1001));
      this.eM0 = var53;
      var53.coM8(var41);
      xe_1 var42 = new xe_1(sm0_0.c0(1026));
      this.wf0 = var42;
      var42.RR(this::WZ);
      this.M3();
      if (!this.pE) {
         var32.mm(HO.UW);
         var6.mm(HO.Vu);
      }

      le0_2 var10 = new le0_2();
      this.sL0 = var10;
      var10.oY(484, 143);
      var10.RY(484, 143);
      var10.g2(484, 143);
      if (var2 == tu_0.ol) {
         var10.uf("logo-hween");
      } else {
         var10.uf("logo");
      }

      this.SL(var10);
      zx_0 var11 = tw0_0.H30() ? new zx_0((f.LPt2_)(Object)this) : null;
      this.o7 = var11;
      if (var11 != null) {
         this.SL(var11);
      }

      dr_1 var12 = new dr_1();
      this.Za0 = var12;
      this.SL(var12);
      y4_0 var13 = new y4_0();
      this.c70 = var13;
      var13.AD(false);
      this.SL(var13);
      var21.SL(var28);
      this.SL(var21);
      final xe_1[] buttons = tw0_0.H30() ? new xe_1[9] : null;
      if (buttons != null) {
         int var14 = 0;

         while (true) {
            if (var14 >= buttons.length) {
               buttons[0].RR(var1::tb0);
               buttons[1].RR(ChatHistoryViewportComponent::sa0);
               buttons[2].RR(ChatHistoryViewportComponent::sf0);
               buttons[3].RR(ChatHistoryViewportComponent::yb0);
               buttons[4].RR(ChatHistoryViewportComponent::tj0);
               buttons[5].RR(ChatHistoryViewportComponent::w7);
               buttons[6].RR(tw0_0::M2);
               buttons[7].RR(ChatHistoryViewportComponent::Ka0);
               buttons[8].RR(ChatHistoryViewportComponent::zt);
               break;
            }

            buttons[var14] = new xe_1();
            this.SL(buttons[var14]);
            var14++;
         }
      }
      this.jW = buttons;

      R90 var15 = new R90();
      this.NL = var15;
      var15.bD(false);
      var15.AD(false);
      var15.Hy(sm0_0.c0(1013));
      var15.uf("serverselect-window");
      fy_2 var24 = new fy_2();
      this.Pk = var24;
      var24.Pc();
      var15.SL(var24);
      this.SL(var15);
      fy_2 var16 = new fy_2();
      this.Tl0 = var16;
      var16.uf("login-panel");
      var16.Ll(false);
      qk0_2 var25 = new qk0_2();
      this.sx = var25;
      ge_0 var29 = new ge_0(var25);
      var29.oY(400, 350);
      var29.hp(new YW());
      lo0_0 var26 = new lo0_0();
      this.TB = var26;
      var26.Qs0(2);
      var26.so();
      var26.AH0(var29);
      var26.uf("tos-content");
      xe_1 var30 = new xe_1(sm0_0.c0(25));
      this.MN = var30;
      var30.pw0(false);
      var30.RR(ChatHistoryViewportComponent::eV);
      xe_1 var33 = new xe_1(sm0_0.c0(63));
      var33.RR(ChatHistoryViewportComponent::lS);
      var16.WQ(var16.lo0().Kn0(var26).X20(var16.H10().Ze0().LPt3(var30, var33).Ze0()));
      var16.x40(var16.H10().Kn0(var26).X20(var16.hb(var30, var33)));
      this.SL(var16);
      cn_0 var17 = new cn_0("");
      this.Xw = var17;
      this.Nq();
      this.SL(var17);
      this.Nul();
      for (Object supplier : dw_2.Rp) {
         Qy0.Sq().jE((String)((Supplier<?>)supplier).get());
      }
      dw_2.Rp.clear();
      String var9 = dw_2.con;
      if ("en".equalsIgnoreCase(var9)
         || "fr".equalsIgnoreCase(var9)
         || "es".equalsIgnoreCase(var9)
         || "de".equalsIgnoreCase(var9)
         || "it".equalsIgnoreCase(var9)) {
         G50 var18;
         String var19;
         if ((var18 = G50.Rl(var9)) != null) {
            var19 = var18.aD();
         } else {
            var19 = var9;
         }

         StringBuilder var27 = new StringBuilder();

         for (byte var31 = 0; var31 < 5; var31++) {
            String var34 = "";
            qa0_1 var36;
            if ((var36 = tw0_0.Ll0.Pm0(var31)) != null) {
               var34 = var36.lQ().SA();
            }

            l50_0 var43;
            if ((var43 = tw0_0.Ll0.AB(var31)) != null) {
               var34 = var43.pG0();
            }

            if (!var34.isEmpty() && !var34.equalsIgnoreCase(var9)) {
               if (var27.length() > 0) {
                  var27.append("\n\n");
               }

               String var35 = "";
               if (var43 != null) {
                  var35 = var43.kn0().o30();
               } else if (var36 != null) {
                  var35 = var36.Dq0().o30();
               }

               String[] var37;
               String[] var60 = var37 = new String[3];
               var60[0] = sm0_0.c0(var31 + 90);
               var60[1] = var19;
               var60[2] = var35;
               String var61 = sm0_0.Bx(1187, var37);
               es.error(var61);
               var27.append(var61);
            }
         }

         if (var27.length() > 0) {
            lg_0.k.lPT5(() -> Kv(var1, var27));
         }
      }
   }

   public static void uD0() {
      qt_2 var0 = tw0_0.d7;
      if (tw0_0.d7 != null) {
         Ry var1 = var0.cp0;
         if (var0.cp0 != null) {
            MC0 var2 = var0.RO;
            if (var0.RO == MC0.Ts0 || var2 == MC0.YC) {
               String var5 = var0.Ik0;
               String var7 = var0.T2;
               boolean var3 = var0.QO;
               RR var4 = var0.E3;
               Hg0 var6 = new Hg0(var5, var7, true, var3, var4);
               var1.E8(var6);
            }
         }
      }
   }

   public static void Kv(Qy0 ui, StringBuilder message) {
      ui.e80(message.toString(), ChatHistoryViewportComponent::Ay0);
   }

   public static void Ay0() {
   }

   public static void OE() {
      qt_2 var0 = tw0_0.d7;
      if (tw0_0.d7 != null) {
         var0.DK();
      }

      lg_0.k.T0 = false;
   }

   public static void rT() {
      qt_2 var0;
      qt_2 var10000 = var0 = tw0_0.d7;
      tw0_0.d7.getClass();
      if (!yl0_2.Yh(var10000)) {
         var0.RO = MC0.H70;
      }
   }

   public static void lS() {
      qt_2 var0 = tw0_0.d7;
      if (tw0_0.d7 != null) {
         var0.DK();
      }

      lg_0.k.T0 = false;
   }

   public static void eV() {
      qt_2 var0 = tw0_0.d7;
      if (tw0_0.d7 != null && var0.RO == MC0.JK) {
         var0.RO = MC0.zM;
         var0.cp0.E8(new C10(var0.iD));
      }
   }

   public static void zt() {
      lg_0.k.T0 = false;
   }

   public static void Ka0() {
      Qy0.yI0.Bg();
   }

   public static void sa0() {
      Qy0.yI0.qi();
   }

   public static void sf0() {
      Qy0.yI0.wT();
   }

   public static void w7() {
      lg_0.lv0.Lf("https://pokemmo.com/account_forgot_password/?local=" + dw_2.con);
   }

   public static void tj0() {
      lg_0.lv0.Lf("https://pokemmo.com/account_forgot_username/?local=" + dw_2.con);
   }

   public static void yb0() {
      lg_0.lv0.Lf("https://pokemmo.com/account/?local=" + dw_2.con);
   }

   public final void Nq() {
      StringBuilder var1 = new StringBuilder();
      var1.append(sm0_0.c0(1170));
      StringBuilder var2 = var1.append("\nNDS: ");
      nj0_0 var3 = tw0_0.Ll0.Qz0;
      String var6;
      if (tw0_0.Ll0.Qz0 == null) {
         var6 = "--";
      } else {
         var6 = var3.z40.FS;
      }

      var2.append(var6);
      if (tw0_0.Ll0.nC0 != null) {
         var1.append(", ").append(tw0_0.Ll0.nC0.z40.FS.replaceAll("\\P{Print}", ""));
      }

      if (tw0_0.Ll0.t1 != null) {
         var1.append(", ").append(tw0_0.Ll0.t1.z40.FS.replaceAll("\\P{Print}", ""));
      }

      var2 = var1.append("\nGBA: ");
      qa0_1 var7 = tw0_0.Ll0.YB0;
      String var8;
      if (tw0_0.Ll0.YB0 == null) {
         var8 = "--";
      } else {
         var8 = var7.iq0 + " v1." + var7.I40;
      }

      var2.append(var8);
      if (tw0_0.Ll0.LPT2 != null) {
         StringBuilder var10000 = var1.append(", ");
         qa0_1 var5 = tw0_0.Ll0.LPT2;
         var10000.append(var5.iq0 + " v1." + var5.I40);
      }

      this.Xw.Sk(var1.toString());
   }

   public final void iq0(np_0 var1) {
      byte var7 = var1.rg;
      qt_2 var2 = tw0_0.d7;
      if (tw0_0.d7 != null) {
         byte var8;
         if (var2.RO != MC0.G6) {
            var8 = 1;
         } else {
            np_0[] var3 = var2.w80;
            int var4 = var2.w80.length;
            int var5 = 0;

            np_0 var6;
            while (true) {
               if (var5 >= var4) {
                  var6 = null;
                  break;
               }

               if ((var6 = var3[var5]).rg == var7) {
                  break;
               }

               var5++;
            }

            if (var6 == null) {
               var8 = 2;
            } else if ("PTS".equalsIgnoreCase(var6.sz0)) {
               var8 = 4;
            } else {
               var2.ze0 = var6;
               var2.RO = MC0.vB0;
               var2.cp0.E8(new gx_1(var7));
               var8 = 0;
            }
         }

         if (var8 != 0) {
            Qy0 var10000;
            String var10001;
            if (var8 != 3) {
               if (var8 != 4) {
                  var10000 = this.kD0;
                  var10001 = sm0_0.c0(1016);
               } else {
                  var10000 = this.kD0;
                  var10001 = sm0_0.c0(1015);
               }
            } else {
               var10000 = this.kD0;
               var10001 = sm0_0.c0(1014);
            }

            var10000.dk(-1, var10001);
         } else {
            this.update();
         }
      }
   }

   public final void Y20() {
      qt_2 var1 = tw0_0.d7;
      MC0 var6;
      if (tw0_0.d7 == null) {
         var6 = MC0.nB0;
      } else {
         var6 = var1.RO;
      }

      if (this.Oe0 != var6) {
         this.Oe0 = var6;
          switch (mapLoginState(var6)) {
            case 1:
               this.uq0.Ll(true);
               this.c70.AD(false);
               Bw0.S2();
               break;
            case 2:
               this.LM(false);
               this.Gf0.SU(sm0_0.c0(1003));
            case 3:
            case 4:
            case 11:
            case 13:
            default:
               break;
            case 5:
            case 6:
               boolean var16;
               var16 = false;
               vo0_0 var27 = tw0_0.d7.FF0;
               label106:
               if (tw0_0.d7.FF0 != null) {
                  label112: {
                     int var32;
                     Qy0 var37;
                     String var10001;
                      if ((var32 = var27.Bx0().Ux) != 2) {
                         if (var32 != 1) {
                           break label106;
                        }

                        IL var17;
                        if ((var17 = sm0_0.ab(var27.J2)) != IL.mh) {
                           Qy0 var33 = this.kD0;
                           jy0 var5 = this.kD0.E90;
                           if (this.kD0.E90 != null) {
                              var5.xe0();
                           }

                            var5 = new jy0(var33, var27, var17);
                            var33.E90 = var5;
                           var33.F9(var33.fU(), var5);
                           var33.Qw0(var33.E90);
                           break label112;
                        }

                        var37 = this.kD0;
                        var10001 = sm0_0.c0(var17.Bq);
                     } else {
                        var37 = this.kD0;
                         StringBuilder var18 = new StringBuilder();
                        var10001 = ig_0.u9(2013, var18, " (").append(zq_2.de.wz0).append(")").toString();
                     }

                     var37.e80(var10001, null);
                  }

                  var16 = true;
               }

               qt_2 var28 = tw0_0.d7;
               zq_2 var34 = tw0_0.d7.Wa0;
               if (!var16) {
                  Qy0 var38;
                  String var39;
                  if (var6 == MC0.D) {
                     String var29 = tx_1.HU(var28.hF0, 2);
                     var38 = this.kD0;
                     var39 = sm0_0.wa0(var34.Vh, var29) + " (" + tw0_0.d7.Wa0.wz0 + ")";
                  } else {
                     int var40;
                     if (tw0_0.Wv0 == null) {
                        var38 = this.kD0;
                        var40 = zq_2.jL0.Vh;
                     } else {
                        var38 = this.kD0;
                        var40 = zq_2.yg.Vh;
                     }

                     var39 = sm0_0.c0(var40);
                  }

                  var38.dk(-1, var39);
               }

               if (var34 == zq_2.oH) {
                  lpt5__5.hL.ZD(this::Ix, 3000L);
               } else {
                  this.LM(true);
               }

               this.Gf0.SU(sm0_0.c0(1000));
               if (!var16) {
                  if (!tw0_0.kz0() && !this.pE) {
                     lpt6__0.v90(this.Xy0);
                  } else {
                     lpt6__0.v90(this.Gf0);
                  }
               }

               tw0_0.d7.DK();
               tw0_0.d7 = null;
               this.NL.AD(false);
               this.c70.AD(false);
               this.Tl0.Ll(false);
               break;
            case 7:
               qt_2 var15 = tw0_0.d7;
               if (tw0_0.d7 == null || var15.iD < 1) {
                  Qy0.yI0.e80("Error loading ToS.\n\nPlease seek support.", ChatHistoryViewportComponent::OE);
                  return;
               }

               this.sx.Eo(var15.Q8);
               lg_0.k.lPT5(this::hs0);
               this.NL.AD(false);
               this.uq0.AD(false);
               this.Tl0.Ll(true);
               this.c70.AD(false);
               break;
            case 8:
               this.NL.AD(false);
               this.uq0.AD(false);
               this.Tl0.Ll(false);
               this.c70.AD(false);
               break;
            case 9:
               this.NL.AD(false);
               this.uq0.AD(false);
               this.Tl0.Ll(false);
               y4_0 var14 = this.c70;
               if (!this.c70.eE) {
                  var14.Aa0.Gv("");
                  var14.Aa0.pw0(true);
                  var14.F9.pw0(true);
                  qt_2 var24 = tw0_0.d7;
                  if (tw0_0.d7 != null) {
                     var14.nt0.Gv(var24.DV);
                     byte var25 = tw0_0.d7.gp0;
                     if (tw0_0.d7.gp0 == 0) {
                        var14.Vv.Sk(sm0_0.c0(1034));
                     } else if (var25 == 2) {
                        var14.Vv.Sk(sm0_0.c0(1038));
                     } else {
                        var14.Ok.em();
                        ya_1 var26 = var14.Ok.hb(var14.Bw0);
                        ya_1 var31 = var14.Ok.hb(var14.nt0);
                        var14.Ok.WQ(D5.fE0(var14.Ok, var14.Ok).X20(var14.Ok.C7(var14.Vv)).X20(var14.Ok.bx0(var26, var31)).X20(var14.Ok.C7(var14.Ur)));
                        var14.Ok
                           .x40(
                              XN.sA(var14.Ok, var14.Ok)
                                 .X20(var14.Ok.hb(var14.Vv))
                                 .VY(20, 20, 20)
                                 .X20(var14.Ok.hb(var14.Bw0, var14.nt0))
                                 .X20(var14.Ok.hb(var14.Ur))
                           );
                        var14.Vv.Sk(sm0_0.c0(1037));
                     }
                  }

                  this.c70.Ll(true);
               }
               break;
            case 10:
               np_0[] var12 = tw0_0.d7.w80;
               xe_1 var13;
               xe_1 var36 = var13 = this.Ap0(tw0_0.d7.JC, var12);
               this.NL.Ll(true);
               this.Tl0.Ll(false);
               this.uq0.AD(false);
               this.c70.AD(false);
               Qy0 var22 = this.kD0;
               int var23 = this.kD0.SB0 + var22.y9;
               int var30 = this.kD0.k5();
               this.NL.E40(tw0_0.LD0.ew0(), kq_0.lpT2(var30, this.NL.OB, 2, var23));
               if (var36 != null) {
                  lpt6__0.v90(var13);
                  if (HO.iQ) {
                     a7_0.bH(var13.ER.Fc0);
                  }
               }
               break;
            case 12:
               this.NL.AD(false);
               Qy0 var10 = this.kD0;
               boolean var21 = true;
               this.kD0.getClass();
               lg_0.k.lPT5(new IL0(var10, var21));
               tw0_0.d7.RO = MC0.wx0;
               lpt5__5 var10000 = lpt5__5.hL;
               Runnable var11 = this::mb;
               var10000.Com4.execute(var11);
               break;
            case 14:
               Qy0 var8 = this.kD0;
               boolean var20 = false;
               this.kD0.getClass();
               lg_0.k.lPT5(new IL0(var8, var20));
                lpt5__5.hL.ZD(this::ao0, 3000L);
               this.Gf0.SU(sm0_0.c0(1000));
               this.NL.AD(false);
               zq_2 var9 = tw0_0.d7.Wa0;
               tw0_0.d7.DK();
               tw0_0.d7 = null;
               this.kD0.dk(-1, sm0_0.c0(var9.Vh));
               break;
            case 15:
               tw0_0.d7.RO = MC0.YC;
               Qy0 var2 = this.kD0;
                lpt3__4 var3 = new lpt3__4(sm0_0.c0(2020), this::gF, this.Gf0);
               Runnable var4;
               if ((var4 = ChatHistoryViewportComponent::uD0) != null) {
                  var3.qp0.RR(var4);
               }

               var2.sr0(var3);
         }
      }

      if (var6 == MC0.JK && this.ey) {
         xe_1 var7 = this.MN;
         if (!this.MN.OI) {
            KB var19 = this.TB.g1;
            if (this.TB.g1.VP == var19.hm) {
               var7.SU(sm0_0.c0(60));
               this.MN.pw0(true);
            }
         }
      }
   }

   public final void gF() {
      qt_2 var1 = tw0_0.d7;
      byte[] var3;
      if (tw0_0.d7 != null && var1.Qp.uI0() && (var3 = var1.n60) != null && var3.length > 0) {
         CH0 var2 = tw0_0.d7.Qp;
         byte[] var4 = tw0_0.d7.n60;
         this.Jl(tw0_0.d7.t9, var2, var4);
      }
   }

   public final void ao0() {
      this.LM(true);
   }

   public final void mb() {
      qt_2 var1 = tw0_0.d7;
      tw0_0.d7.getClass();
      np_0 var4 = var1.ze0;
      int var2 = var1.CO;
      byte[] var3 = var1.Vl0;
      BR var10000 = new BR(var4, var2, var3);
      var10000.lZ = this.kD0;
      tw0_0.rl = var10000;
      if (yl0_2.WX(var10000) && tw0_0.rl.fk0 != null) {
         this.kD0.u3(this);
         tw0_0.rl.lZ = this.kD0;
         tw0_0.d7.DK();
         tw0_0.d7 = null;
         lg_0.k.lPT5(this::po);
      } else {
         tw0_0.d7.Jt(zq_2.df, -1, new byte[0]);
      }
   }

   public final void po() {
      this.Xy0.Gv("");
      this.p40.Gv("");
   }

   public final void hs0() {
      this.ey = true;
   }

   public final void Ix() {
      this.LM(true);
   }

   public final void zg(np_0 var1, CH0 var2, byte[] var3) {
      BR var4 = new BR(var1, 0, new byte[0]);
      var4.BX = var2;
      var4.om = var3;
      var4.lZ = this.kD0;
      tw0_0.rl = var4;
      if (yl0_2.WX(var4) && tw0_0.rl.fk0 != null) {
         qt_2 var5 = tw0_0.d7;
         if (tw0_0.d7 != null) {
            var5.DK();
            tw0_0.d7 = null;
         }

         lg_0.k.lPT5(this::Ds0);
      } else {
         lg_0.k.lPT5(this::Fu);
      }
   }

   public final void Ds0() {
      this.Xy0.Gv("");
      this.p40.Gv("");
   }

   public final void Fu() {
      Qy0 var2;
      Qy0 var10002 = var2 = this.kD0;
      boolean var1 = false;
      var10002.getClass();
      lg_0.k.lPT5(new IL0(var2, var1));
      this.kD0.kN();
      this.kD0.dk(-1, sm0_0.c0(zq_2.df.Vh));
   }

   public final void RN(int value) {
      if (value == 66) {
         this.cOm2();
      }
   }

   public final void Pv() {
      ol0_2 var1 = this.Hl.mu0;
      boolean var2;
      if (this.Hl.mu0.Mw0 != var1.KB.ul0() - 1) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.fJ0(var2);
   }

   public final void M3() {
      ArrayList var1;
      ArrayList var10000 = var1 = vf0_1.a();
      var1.add(new RR(sm0_0.c0(1028), null));
      pg0_2 var2 = new pg0_2(var1);
      this.Hl.r30(var2);
      if (var10000.isEmpty()) {
         this.fJ0(false);
      } else {
         this.Hl.Bd(0);
         int var3 = 0;

         for (Iterator var4 = var1.iterator(); var4.hasNext(); var3++) {
            if (((RR)var4.next()).Ii0.equalsIgnoreCase(vf0_1.Ga)) {
               this.Hl.Bd(var3);
            }
         }

         if (var1.size() == 1) {
            byte var5 = 0;
            this.Xy0.Gv(((RR)var2.w7.get(var5)).Ii0);
         }
      }
   }

   public final void fJ0(boolean var1) {
      this.pE = var1;
      cn_0 var2;
      if (var1) {
         var2 = this.eM0;
      } else {
         var2 = this.H2;
      }

      le0_2 var3;
      if (var1) {
         var3 = this.Hl;
      } else {
         var3 = this.Xy0;
      }

      xe_1 var4;
      if (var1) {
         var4 = this.wf0;
      } else {
         var4 = this.Ho;
      }

      cn_0 var5;
      if (var1) {
         var5 = new cn_0(null, 0);
      } else {
         var5 = this.BZ;
      }

      this.Hl.Ll(var1);
      this.eM0.Ll(var1);
      boolean var6;
      this.H2.Ll(var6 = var1 ^ true);
      this.Xy0.Ll(var6);
      this.Xy0.pw0(var6);
      if (this.Hl.mu0.KB.ul0() == 1) {
         this.Xy0.Ll(true);
         var3 = this.Xy0;
      }

      this.BZ.Ll(var6);
      this.Ho.Ll(var6);
      this.p40.pw0(var6);
      this.p40.Zg0(var6);
      cg_0 var10000;
      String var10001;
      if (var1) {
         var10000 = this.p40;
         var10001 = sm0_0.c0(1027);
      } else {
         var10000 = this.p40;
         var10001 = "";
      }

      var10000.Gv(var10001);
      this.y6.em();
      ya_1 var8 = this.y6.hb(var2, this.JL);
      ya_1 var9 = this.y6.hb(var3, this.p40);
      ya_1 var7 = this.y6.C7(var4, var5).Ze0().Kn0(this.Gf0);
      this.y6.WQ(D5.fE0(this.y6, this.y6).X20(this.y6.bx0(var8, var9)).X20(var7));
      this.y6.x40(XN.sA(this.y6, this.y6).X20(this.y6.hb(var2, var3)).X20(this.y6.hb(this.JL, this.p40)).X20(this.y6.hb(var4, var5, this.Gf0)));
   }

   @Override
   public final void C(zk0_1 var1) {
      if (!tw0_0.kz0() && !this.pE) {
         lpt6__0.v90(this.Xy0);
      } else {
         lpt6__0.v90(this.Gf0);
      }

      if (HO.iQ) {
         this.cOm2();
      }
   }

   public final void Nul() {
      if (!tw0_0.kz0()) {
         int var1 = 0;

         while (true) {
            xe_1[] var2 = this.jW;
            if (var1 >= this.jW.length) {
               this.o7.sP();
               return;
            }

            short var3 = 0;
            switch (var1) {
               case 0:
                  var3 = 1172;
                  break;
               case 1:
                  var3 = 1175;
                  break;
               case 2:
                  var3 = 1190;
                  break;
               case 3:
                  var3 = 1005;
                  break;
               case 4:
                  var3 = 1006;
                  break;
               case 5:
                  var3 = 1007;
                  break;
               case 6:
                  var3 = 1124;
                  break;
               case 7:
                  var3 = 1008;
                  break;
               case 8:
                  var3 = 1009;
            }

            var2[var1].SU(sm0_0.c0(var3));
            var1++;
         }
      }
   }

   @Override
   public final void K8() {
      this.Xw.lt0();
      this.Xw.E40(3, 3);
      this.uq0.lt0();
      R90 var10000 = this.uq0;
      Qy0 var1 = this.kD0;
      int var3 = this.kD0.A20 + var1.e80;
      int var10001 = kq_0.lpT2(this.kD0.a3(), this.uq0.Mx, 2, var3);
      var1 = this.kD0;
      int var5 = this.kD0.SB0 + var1.y9;
      var10000.E40(var10001, kq_0.lpT2(this.kD0.k5(), this.uq0.OB, 2, var5));
      this.c70.lt0();
      var10000 = this.c70;
      var1 = this.kD0;
      int var7 = this.kD0.A20 + var1.e80;
      var10001 = kq_0.lpT2(this.kD0.a3(), this.c70.Mx, 2, var7);
      var1 = this.kD0;
      int var9 = this.kD0.SB0 + var1.y9;
      var10000.E40(var10001, kq_0.lpT2(this.kD0.k5(), this.c70.OB, 2, var9));
      zx_0 var10 = this.o7;
      if (this.o7 != null) {
         var1 = this.kD0;
         int var12 = this.kD0.SB0 + var1.y9;
         var10.E40(0, this.kD0.k5() - this.o7.OB + var12);
      }

      dr_1 var13 = this.Za0;
      if (this.Za0 != null) {
         var13.lt0();
         this.Za0.A20(pa0_0.L00, 0, -100);
      }

      if (this.jW != null) {
         int var14 = 0;

         while (true) {
            xe_1[] var2 = this.jW;
            if (var14 >= this.jW.length) {
               if (!tw0_0.Ro0.yy0()) {
                  this.jW[0].Ll(false);
               }
               break;
            }

            var2[var14].RY(200, 26);
            this.jW[var14].oY(200, 26);
            xe_1 var31 = this.jW[var14];
            var10001 = super.A20 + super.e80;
            var10001 = this.a3() - this.jW[var14].Mx + var10001 - 4;
            int var10002 = super.SB0 + super.y9;
            var2 = this.jW;
            var31.E40(var10001, this.k5() - this.jW[var14].OB + var10002 - ((var2.length - 1 - var14) * 26 + 4));
            var14++;
         }
      }

      var10000 = this.NL;
      var1 = this.kD0;
      int var16 = this.kD0.A20 + var1.e80;
      var10001 = kq_0.lpT2(this.kD0.a3(), this.NL.Mx, 2, var16);
      var1 = this.kD0;
      int var18 = this.kD0.SB0 + var1.y9;
      var10000.E40(var10001, kq_0.lpT2(this.kD0.k5(), this.NL.OB, 2, var18));
      this.sL0.oY(484, 143);
       le0_2 var33 = this.sL0;
      var1 = this.kD0;
      int var20 = this.kD0.A20 + var1.e80;
      var10001 = kq_0.lpT2(this.kD0.a3(), this.sL0.Mx, 2, var20);
      var1 = this.kD0;
      int var22 = this.kD0.SB0 + var1.y9 - 200;
      var33.E40(var10001, kq_0.lpT2(this.kD0.k5(), this.sL0.OB, 2, var22));
      this.Tl0.lt0();
      var33 = this.Tl0;
      var1 = this.kD0;
      int var24 = this.kD0.A20 + var1.e80;
      var10001 = kq_0.lpT2(this.kD0.a3(), this.Tl0.Mx, 2, var24);
      var1 = this.kD0;
      int var26 = this.kD0.SB0 + var1.y9;
      var33.E40(var10001, kq_0.lpT2(this.kD0.k5(), this.Tl0.OB, 2, var26));
      cn_0 var27 = this.nt0;
      if (this.nt0 != null) {
         var27.lt0();
         this.nt0.E40(tw0_0.LD0.ew0() / 2 - this.nt0.Mx / 2, 50);
      }
   }

   @Override
   public final void HP(zk0_1 var1) {
      this.update();
      super.HP(var1);
   }

   public final void cOm2() {
      if (super.Em0 != null) {
         if (tw0_0.Ll0.zd) {
            Qy0.yI0.e80("You do not have the minimum required roms to login.", null);
            return;
         }

         this.LM(true);
         if (tw0_0.d7 == null) {
            if (this.pE) {
               ol0_2 var1;
               RR var2;
               vf0_1.Ga = (var2 = (RR)(var1 = this.Hl.mu0).KB.YS(var1.Mw0)).Ii0;
               s8_0.j50(new File(lpt3__1.Q40, "savedcredentials.properties").getAbsolutePath(), vf0_1.class);
               tw0_0.d7 = new qt_2(var2.Ii0, "", false, var2);
            } else {
               String var10002 = ((wn0_0)this.Xy0.dI0).YA.toString();
               String var3 = ((wn0_0)this.p40.dI0).YA.toString();
               tw0_0.d7 = new qt_2(var10002, var3, this.Ho.ER.U20(), null);
            }

            lpt5__5 var10000 = lpt5__5.hL;
            Runnable var4 = ChatHistoryViewportComponent::rT;
            var10000.Com4.execute(var4);
         }
      }
   }

   public final void LM(boolean var1) {
      cg_0 var2 = this.Xy0;
      boolean var3;
      if (!this.pE && var1) {
         var3 = true;
      } else {
         var3 = false;
      }

      var2.pw0(var3);
      var2 = this.p40;
      if (!this.pE && var1) {
         var3 = true;
      } else {
         var3 = false;
      }

      var2.pw0(var3);
      this.Gf0.pw0(var1);
   }

   public final void update() {
      lg_0.k.lPT5(this::Y20);
      if (tw0_0.Ll0.zd) {
         Qy0 var1 = Qy0.yI0;
         if (Qy0.yI0 != null && var1.yY != null) {
            boolean var3 = false;
            fy_2 var2 = this.y6;
            if (this.y6.eE) {
               var2.Ll(var3);
            }

            if (this.Of()) {
               lpt6__0.v90(Qy0.yI0.yY);
            }
         }
      }
   }

   @Override
   public final void aUX(zk0_1 var1) {
      if (dw_2.lp0 && tw0_0.kz0()) {
         lg_0.S4.getClass();
         lg_0.S4.getClass();
      }

      wl0_2 var6 = super.Jj0;
      if (super.Jj0 != null) {
         KG0 var5 = super.M;
         int var7 = super.A20;
         int var2 = super.SB0;
         int var3 = super.Mx;
         int var4 = super.OB;
         var6.uf(var5, var7, var2, var3, var4);
      }
   }

   public final void WZ() {
      if (this.pE) {
         ol0_2 var1 = this.Hl.mu0;
         RR var5;
         if ((var5 = (RR)this.Hl.mu0.KB.YS(var1.Mw0)) != null && var5.f0 != null) {
            String var6 = var5.Ii0;
            ArrayList var2;
            Iterator var3 = (var2 = vf0_1.a()).iterator();

            while (var3.hasNext()) {
               RR var4;
               if ((var4 = (RR)var3.next()).Ii0.equals(var6)) {
                  var2.remove(var4);
                  vf0_1.e20(var2);
                  break;
               }
            }

            this.M3();
         }
      }
   }

   public final void Jl(np_0 var1, CH0 var2, byte[] var3) {
      qt_2 var4 = tw0_0.d7;
      if (tw0_0.d7 != null) {
         var4.DK();
         tw0_0.d7 = null;
      }

      Qy0 var6 = this.kD0;
      boolean var7 = true;
      this.kD0.getClass();
      lg_0.k.lPT5(new IL0(var6, var7));
      this.kD0.u3(this);
      lpt5__5 var5 = lpt5__5.hL;
       var5.Com4.execute(() -> this.zg(var1, var2, var3));
   }

   public final xe_1 Ap0(int var1, np_0[] var2) {
      this.Pk.em();
      cn_0 var3 = new cn_0();
      String var4 = sm0_0.c0(1010);
      var3.Sk(var4);
      cn_0 var18 = new cn_0();
      String var5 = sm0_0.c0(1011);
      var18.Sk(var5);
      cn_0 var20 = new cn_0();
      String var6 = sm0_0.c0(1012);
      var20.Sk(var6);
      fy_2 var22 = this.Pk;
      this.Pk.getClass();
      ya_1 var23 = new I7(var22).Ze0();
      I7 var7;
      I7 var10001 = var7 = XN.sA(this.Pk, this.Pk);
      ya_1 var8 = D5.fE0(this.Pk, this.Pk).LPt3(var3);
      ya_1 var9 = D5.fE0(this.Pk, this.Pk).LPt3(var18);
      ya_1 var10 = D5.fE0(this.Pk, this.Pk).LPt3(var20);
      var10001.X20(this.Pk.hb(var3, var18, var20));
      xe_1 var17 = null;

      for (np_0 var11 : var2) {
         if (!"PTS".equalsIgnoreCase(var11.sz0)) {
            xe_1 var12 = new xe_1(sm0_0.c0(1000));
            cn_0 var13 = new cn_0();
            String var14 = var11.sz0;
            var13.Sk(var14);
            cn_0 var24 = new cn_0();
            String var15;
            if (!var11.Td) {
               var15 = sm0_0.c0(1021);
            } else {
               int var25 = var11.at0;
               double var10000 = var11.at0;
               int var16 = var11.eg;
               if (var10000 > var11.eg * 0.5) {
                  var15 = sm0_0.c0(1022);
               } else if (var25 >= var16) {
                  var15 = sm0_0.c0(1023);
               } else {
                  var15 = sm0_0.c0(1020);
               }
            }

            var24.Sk(var15);
            var8.Kn0(var13);
            var9.Kn0(var24);
            var10.Kn0(var12);
            var7.X20(this.Pk.hb(var13, var24, var12));
            var12.RR(() -> this.iq0(var11));
            if (var11.rg == var1) {
               var17 = var12;
            }
         }
      }

      var23.X20(var8).X20(var9).X20(var10);
      var23.Ze0();
      this.Pk.WQ(var23);
      this.Pk.x40(var7);
      return var17;
   }

   private static int mapLoginState(MC0 state) {
      switch (state.Y2) {
         case 0:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         case 5:
            return 4;
         case 6:
            return 5;
         case 1:
            return 6;
         case 7:
            return 7;
         case 8:
            return 8;
         case 16:
            return 9;
         case 9:
            return 10;
         case 10:
            return 11;
         case 11:
            return 12;
         case 13:
            return 13;
         case 12:
            return 14;
         case 14:
            return 15;
         default:
            return 0;
      }
   }
}

