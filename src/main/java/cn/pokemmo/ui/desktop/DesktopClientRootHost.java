package cn.pokemmo.ui.desktop;

import f.*;
import cn.pokemmo.world.entity.PlayerAvatarMovementController;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class DesktopClientRootHost extends C0 {
   public static final dl_1 Gl0 = Cq0.E1(DesktopClientRootHost.class);
   public static Qy0 yI0;
   public final Bp0 nY;
   public final p00_0 nd;
   public re_1 Ur0;
   public LPt2_ G30;
   public n60_0 fv;
   public RT s2;
   public BU zK0;
   public o4 hl0;
   public QC sj0;
   public pj0_2 yY;
   public mf_1 zn0;
   public ro_2 ZK0;
   public m1_0 Uu;
   public ML0 ZW;
   public I30 ez0;
   public final tj0_0 N00;
   public final pk0_0 K1;
   public final E20 om0;
   public final cn_0 zY;
   public j20 uw0;
   public final tl_1 S;
   public final DecimalFormat cF0;
   public final DecimalFormat DG;
   public final cn_0 aX;
   public long A90;
   public long yB0;
   public final long[] Hn;
   public zy0_0 Tx;
   public la_2 Ms0;
   public lpt3__4 Ba0;
   public bu0_0 yr0;
   public final ArrayList Nv0;
   public K6 Sk;
   public jy0 E90;
   public mr0 TG0;
   public final ArrayList aS;
   public boolean Fx0;
   public final es_1 tq;
   public final ia0_1 ae;
   public final xe_1 be;
   public final le0_2 qL;
   public int Fc;
   public MF0 wY;
   public final jn_0 Bc0;

   public DesktopClientRootHost(jn_0 owner) {
      super();
      this.nY = new Bp0();
      this.nd = new p00_0((Qy0) this);
      this.G30 = null; this.fv = null; this.s2 = null; this.zK0 = null; this.hl0 = null;
      this.sj0 = null; this.yY = null; this.zn0 = null; this.ZK0 = null; this.Uu = null; this.ZW = null; this.ez0 = null;
      this.cF0 = new DecimalFormat("000.00");
      this.DG = new DecimalFormat("0000");
      this.aX = new cn_0();
      this.Hn = new long[2]; this.Tx = null; this.Ba0 = null; this.yr0 = null;
      this.Nv0 = new ArrayList(); this.Sk = null; this.E90 = null; this.TG0 = null; this.aS = new ArrayList(); this.Fx0 = false;
      this.tq = new es_1(true, 8); this.Fc = -1; this.zY = new cn_0(); this.om0 = new E20(); this.om0.Ll(false);
      this.Bc0 = owner; this.om0.uf("tooltip-help"); this.F9(0, this.om0);
      this.uf("maingui" + (dw_2.LPt4 ? "-cursor" : ""));
      this.Ur0 = new re_1((Qy0) this);
      this.S = new tl_1(); this.S.Z7(lpt3__1.YM); this.S.H3(); this.S.Ll(dw_2.b00);
      DecimalFormatSymbols symbols = new DecimalFormatSymbols(); symbols.setDecimalSeparator('.'); this.cF0.setDecimalFormatSymbols(symbols);
      this.aX.uf("fpscounter"); this.aX.H3(); this.aX.Ll(dw_2.b00);
      this.N00 = new tj0_0(); this.K1 = new pk0_0((Qy0) this); wl_2 root = new wl_2();
      ia0_1 mobile = null; xe_1 menu = null; le0_2 battery = null;
      if (tw0_0.kz0()) {
         mobile = new ia0_1(1); this.ae = mobile; menu = new xe_1(); this.be = menu; menu.uf("mobile-menu"); menu.RR(this::Gl);
         if (tw0_0.Xy0()) { battery = new le0_2(); battery.uf("mobile-battery-10"); mobile.SL(battery); }
         mobile.SL(menu); this.SL(mobile);
      } else { this.ae = null; this.be = null; }
      this.qL = battery;
      this.SL(this.S); this.SL(this.N00); this.SL(this.K1); this.SL(this.Ur0); this.SL(root); this.SL(this.aX); yI0 = (Qy0) this;
      if (lpt3__1.RJ) this.r10();
   }

   public static Qy0 Sq() {
      return yI0;
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static boolean af(le0_2 root) {
      try {
         for (int i = 0; i < root.fU(); i++) {
            le0_2 child = root.qA(i);
            if (!child.Of()) continue;
            if (child instanceof tr_1) return true;
            if (child instanceof sp0_0 && ((sp0_0) child).JL()) return true;
            if (child instanceof cg_0) return true;
            if (af(child)) return true;
         }
         return root.Em0 != null && root.Em0.sO;
      } catch (Exception ex) {
         ex.printStackTrace();
         return false;
      }
   }

   public static boolean PI(le0_2 root) {
      try {
         for (int i = 0; i < root.fU(); i++) {
            le0_2 child = root.qA(i);
            if (child.Of()) {
               if (child instanceof cg_0) return true;
               if (PI(child)) return true;
            }
         }
         return root.Em0 != null && root.Em0.sO;
      } catch (Exception ex) {
         ex.printStackTrace();
         return false;
      }
   }

   public static boolean qp0(CH0 var0, oi0_0 var1) {
      return var1.X7.equals(var0);
   }

   public static void com9(bi0_1 var0) {
      tw0_0.rl.fk0.uQ(new cb_1(var0.pu));
   }

   public static void m8(bi0_1 var0) {
      BR var10000 = tw0_0.rl;
      String var1 = "//movenpc " + var0.pu + " false";
      tw0_0.rl.getClass();
      var10000.Cp(zo_0.Pk, var1, "", true);
   }

   public static void Xq(bi0_1 var0) {
      BR var10000 = tw0_0.rl;
      String var1 = "//movenpc " + var0.pu + " true";
      tw0_0.rl.getClass();
      var10000.Cp(zo_0.Pk, var1, "", true);
   }

   public static void COm9(bi0_1 var0) {
      BR var10000 = tw0_0.rl;
      String var1 = "//eventdeletenpc " + var0.pu;
      tw0_0.rl.getClass();
      var10000.Cp(zo_0.Pk, var1, "", true);
   }

   public static void Gg0(bi0_1 var0) {
      BR var10000 = tw0_0.rl;
      String var1 = "//eventnpccopy " + var0.pu;
      tw0_0.rl.getClass();
      var10000.Cp(zo_0.Pk, var1, "", true);
   }

   public static void r9(List var0) {
      StringBuilder var3;
      var3 = new StringBuilder();
      Iterator var1 = var0.iterator();

      while (var1.hasNext()) {
         bi0_1 var2;
         if ((var2 = (bi0_1)var1.next()) instanceof E90) {
            if (var3.length() > 0) {
               var3.append(System.lineSeparator());
            }

            E90 e90 = (E90)var2;
            String var6;
            if (e90.oD) {
               var6 = "{§}" + e90.oc0;
            } else {
               var6 = e90.oc0;
            }

            var3.append(var6);
         }
      }

      hl_2 var4 = lg_0.k.E00;
      String var8 = var3.toString();
      var4.getClass();
      hl_2.Ja0(var8);
   }

   public static void Si() {
      byte var0 = 2;
      long var1 = 0L;
      tw0_0.rl.fk0.uQ(new _for(var0, var1));
   }

   public static void Hj(E90 var0) {
      if (yt_1.l00.Uz0()) {
         CH0 var1;
         if (var0 == null) {
            var1 = CH0.j1;
         } else {
            var1 = var0.pu;
         }

         yt_1.l00 = var1;
      } else {
         yt_1.l00 = CH0.j1;
      }
   }

   public static void v5(String var0) {
      xn0_0 var1 = BU.T50.cz0;
      sk0_2 var2 = BU.T50.cz0.ne0;
      if (BU.T50.cz0.ne0 != null) {
         var2.E6.Gv(var0);
      } else {
         sk0_2 var10003 = var2 = new sk0_2(var1);
         var1.ne0 = var10003;
         var2.E6.Gv(var0);
         var1.SL(var1.ne0);
      }
   }

   public static void md0(String var0) {
      BR var10000 = tw0_0.rl;
      var0 = "//teleportto " + var0;
      tw0_0.rl.getClass();
      var10000.Cp(zo_0.Pk, var0, "", true);
   }

   public static void kf(String var0) {
      String target = var0;
      String prompt = xq_1.pz0("Are you sure you want to kick ", target, "?");
      yI0.sr0(new lpt3__4(prompt, () -> Ny0(target), null));
   }

   public static void Ny0(String var0) {
      BR var10000 = tw0_0.rl;
      var0 = "//kick " + var0;
      tw0_0.rl.getClass();
      var10000.Cp(zo_0.Pk, var0, "", true);
   }

   public static void Y0(String var0, G50 var1) {
      BR var10000 = tw0_0.rl;
      var0 = "//setlanguage " + var0 + " " + var1.Sf0;
      tw0_0.rl.getClass();
      var10000.Cp(zo_0.Pk, var0, "", true);
   }

   public static void j(String var0, zo_0 var1) {
      BR var10000 = tw0_0.rl;
      var0 = "//setchat " + var0 + " " + var1.y80;
      tw0_0.rl.getClass();
      var10000.Cp(zo_0.Pk, var0, "", true);
   }

   public static void Fh0(String var0) {
      xn0_0 var10000 = xn0_0.Lt;
      String[] var10004 = new String[]{"Player Name", "Length in Seconds", "Reason"};
      C70[] var1;
      C70[] var10005 = var1 = new C70[3];
      var10005[0] = C70.wx0;
      var10005[1] = C70.Ey0;
      var10005[2] = C70.Kk;
      var10000.SL(new xj_1("//mute_ch", var10004, var1, xj_1.qa0).lL(0, var0).iX());
   }

   public static void lL(String var0) {
      xn0_0 var10000 = xn0_0.Lt;
      String[] var10004 = new String[]{"Player Name", "Length in Seconds", "Reason"};
      C70[] var1;
      C70[] var10005 = var1 = new C70[3];
      var10005[0] = C70.wx0;
      var10005[1] = C70.Ey0;
      var10005[2] = C70.Kk;
      var10000.SL(new xj_1("//mute", var10004, var1, xj_1.qa0).lL(0, var0).iX());
   }

   public static void Uu(String var0, IL var1) {
      xn0_0 var10000 = xn0_0.Lt;
      String[] var2;
      String[] var10003 = var2 = new String[3];
      var10003[0] = "Player Name";
      var10003[1] = "Warn Reason";
      var10003[2] = "Custom Reason (if OTHER)";
      C70[] var3;
      C70[] var5 = var3 = new C70[3];
      var5[0] = C70.wx0;
      var5[1] = C70.Nc0;
      var5[2] = C70.Kk;
      String[][] var4;
      String[][] var6 = var4 = new String[2][];
      var6[0] = H50.ak;
      var6[1] = H50.uw0;
      var10000.SL(new xj_1("//warn", var2, var3, var4).lL(0, var0).lL(1, var1.name()).iX());
   }

   public static void SD0(String var0, IL var1) {
      BR var10000 = tw0_0.rl;
      var0 = "//warn " + var0 + " " + var1;
      tw0_0.rl.getClass();
      var10000.Cp(zo_0.Pk, var0, "", true);
   }

   public static void hp0(String var0) {
      BR var10000 = tw0_0.rl;
      var0 = "//playerinfo " + var0;
      tw0_0.rl.getClass();
      var10000.Cp(zo_0.Pk, var0, "", true);
   }

   public static void gD(E90 var0) {
      if (var0 != null) {
         BR var2 = tw0_0.rl;
         CH0 var1 = var0.pu;
         var2.fk0.uQ(new da0_1(var1));
      }
   }

   public static void nu(String var0) {
      tw0_0.rl.fk0.uQ(new IQ(var0));
   }

   public static void Ql(String var0) {
      tw0_0.rl.fk0.uQ(new Xq0(var0));
   }

   public static void m90(String var0) {
      String var1 = "--";
      tw0_0.rl.fk0.uQ(new T20(var0, var1));
   }

   public static void Ps(String var0) {
      II0.ZN(var0);
   }

   public static void b9(String var0) {
      lg_0.lv0.Lf("https://manage.pokemmo.com/players/by-name/" + var0);
   }

   // Recaf synthetic callback used by Up's kf0_1 entries.
   public static void IR(BM var0, Ou0 var1, int var2, int var3) {
      var0.LPT8(new PRN_(PRN_.Ly, Color.GREEN));
      tt0_0.j0.DP(var0, var1, var1.AD + 1000, var2, var3);
   }

   // Recaf synthetic callback used by Up's second entry pass.
   public static void GQ(BM var0, nv0_0 var1, int var2, int var3) {
      var0.LPT8(new PRN_(PRN_.Ly, Color.GREEN));
      Ou0 node = var1.wp0;
      tt0_0.j0.DP(var0, node, var1.O00, var2, var3);
   }

   public static void fA(String var0) {
      tw0_0.rl.fk0.uQ(new J1(var0));
   }

   public static void S(VU var0, short var1, E90 var2, ls_0 var3, Runnable var4) {
      CH0 var5 = var0.pu;
      CH0 var6 = var2.pu;
      CH0 var7 = var3.Y9;
      tw0_0.rl.p4(var5, var1, var6, var7);
      if (var4 != null) {
         lg_0.k.lPT5(var4);
      }
   }

   public static void Ye(VU var0, short var1, E90 var2, ls_0 var3, Runnable var4) {
      CH0 var5 = var0.pu;
      CH0 var6 = var2.pu;
      CH0 var7 = var3.Y9;
      tw0_0.rl.p4(var5, var1, var6, var7);
      if (var4 != null) {
         lg_0.k.lPT5(var4);
      }
   }

   public static void Px(jb0_0[] var0, QT var1) {
      if (BU.T50 != null) {
         jb0_0[] var2;
         if ((var2 = IntStream.range(0, var0.length).mapToObj(var1::G20).filter(Objects::nonNull).toArray(jb0_0[]::new)).length != var0.length) {
            yI0.dk(-1, sm0_0.wa0(2306, sm0_0.c0(2365)));
            var0 = Arrays.copyOfRange(var0, 0, var2.length);
         }

         tw0_0.rl.qn(var0, var2);
      }
   }

   public static void Yu(jb0_0[] var0, QT var1, NK var2, _volatile var3, int var4) {
      if (BU.T50 != null) {
         jb0_0[] var5;
         if ((var5 = IntStream.range(0, var0.length).mapToObj(var2x -> {
            var1.getClass();
            return QT.LPt7(var2, var2x);
         }).filter(Objects::nonNull).toArray(jb0_0[]::new)).length != var0.length) {
            yI0.dk(-1, sm0_0.wa0(2306, tw0_0.rl.y8.P2(var3, (byte)var4)));
            var0 = Arrays.copyOfRange(var0, 0, var5.length);
         }

         tw0_0.rl.qn(var0, var5);
      }
   }

   public static void tb(wg0_0 var0, jb0_0[] var1) {
      jb0_0 var2;
      if ((var2 = var0.S80()) == null) {
         yI0.dk(-1, sm0_0.c0(2305));
      } else {
         int var7 = 6 - var2.Xh0();
         if (var1.length > var7) {
            var1 = Arrays.copyOf(var1, var7);
         }

         jb0_0[] var3 = new jb0_0[var1.length];
         jb0_0[] var4 = new jb0_0[var1.length];

         for (int var5 = 0; var5 < var1.length; var5++) {
            var3[var5] = var1[var5];
            int var6;
            jb0_0 var8;
            if ((var6 = 6 - var7 + var5) >= 0 && var6 <= 6) {
               var8 = var0.dz[var6];
            } else {
               var8 = null;
            }

            var4[var5] = var8;
         }

         tw0_0.rl.qn(var3, var4);
      }
   }

   public static void pF0(jb0_0[] var0, jb0_0 var1) {
      A40 var3;
      var3 = new A40();
      tk0_0 var2 = new tk0_0(var3);
      int var19 = 0;
      int var4 = var0.length;

      for (int var5 = 0; var5 < var4; var5++) {
         VU var6;
         if ((var6 = var0[var5].ol0()) != null && !var6.I8.vn() && !var6.I8.TH()) {
            tk0_0 var7;
            var7 = new tk0_0(new A40());
            tk0_0 var8;
            var8 = new tk0_0(new A40());
            short var9;
            if (tw0_0.kz0()) {
               var9 = 72;
            } else {
               var9 = 36;
            }

            S70 var10;
            S70 var10000 = var10 = new S70(var9, var9, 0);
            Br0 var55 = var10000.og;
            AG0[] var10002 = new AG0[1];
            yh_0 var10005 = yh_0.Xm0;
            var9 = var6.I8.Kr();
            var10002[0] = var10005.qC0(var9, var6.Dg0(), var6.I8.aR())[0];
            var55.o60(var10002);
            Br0 var44 = var10000.og;
            byte var29 = -8;
            var10000.og.gY = 0;
            var44.a4 = var29;
            if (tw0_0.kz0()) {
               var10.og.EJ0 = 2.0F;
            } else {
               Br0 var45 = var10.og;
               var29 = -2;
               byte var11 = 1;
               var10.og.gY = var29;
               var45.a4 = var11;
            }

            cn_0 var31;
            cn_0 var10004 = var31 = new cn_0(null, 0);
            String var33 = sm0_0.wa0(1731, String.valueOf(var6.I8.wj)) + " " + var6.k30();
            var10004.Sk(var33);
            cn_0 var34;
            var10004 = var34 = new cn_0(null, 0);
            String var12 = (var6.I8.RI(gc_2.RC)
                  + "/"
                  + var6.I8.RI(gc_2.r4)
                  + "/"
                  + var6.I8.RI(gc_2.ly)
                  + "/"
                  + var6.I8.RI(gc_2.ej)
                  + "/"
                  + var6.I8.RI(gc_2.lL0)
                  + "/"
                  + var6.I8.RI(gc_2.ie0))
               .replace("31", "[#6fb76f]31[]")
               .replaceAll("([^0-9])0", "$1[#ff6666]0[]")
               .replaceAll("^0/", "[#ff6666]0[]/");
            var10004.Sk(var12);
            var10004.uf("label-markup");
            var8.gg0.vx0(var31);
            var8.gg0.Rg();
            var8.gg0.vx0(var34);
            tk0_0 var32;
            var32 = new tk0_0(new A40());
            ArrayList var35;
            var35 = new ArrayList();
            if (var6.I8.rh0() > 0) {
               S70 var56 = new S70(24, 24, 0);
               var56.og.o60(ob0_0.Ui0().es0);
               Br0 var60 = var56.og;
               Br0 var10003 = var56.og;
               Br0 var63 = var56.og;
               Br0 var64 = var56.og;
               byte var36 = 17;
               byte var13 = 14;
               var56.og.OA0 = true;
               var64.IF = var36;
               var63.gx0 = var13;
               byte var37 = 6;
               var10003.gY = 4;
               var60.a4 = var37;
               var35.add(var56);
            }

            if (var6.I8.ca()) {
               S70 var57 = new S70(24, 24, 0);
               var57.og.r8(fn_0.qz0().Px);
               var35.add(var57);
            }

            if (var6.I8.bG0.length > 0) {
               S70 var38;
               var10000 = var38 = new S70(24, 24, 0);
               var10000.og.r8(fn_0.qz0().eb0);
               if (tw0_0.kz0()) {
                  Br0 var47 = var38.og;
                  Br0 var58 = var38.og;
                  var38.og.EJ0 = 1.5F;
                  byte var41 = -1;
                  var58.gY = 0;
                  var47.a4 = var41;
               }

               var35.add(var38);
            }

            if (var6.I8.I()) {
               S70 var24;
               S70 var59 = var24 = new S70(24, 24, 0);
               Br0 var39 = var59.og;
               LPT6_[] var42 = new LPT6_[1];
               byte var14 = 0;
               fn_0 var15 = fn_0.qz0();
               LPT6_ var43;
               if (var6.I8.u3()) {
                  var43 = var15.iz;
               } else {
                  var43 = var15.pL;
               }

               var42[var14] = var43;
               var39.r8(var42);
               var35.add(var24);
            }

            for (int var25 = 0; var25 < 4; var25++) {
               le0_2 var40;
               tk0_0 var49;
               if (var25 >= var35.size()) {
                  var49 = var32;
                  var40 = new S70(24, 24, 0);
               } else {
                  var49 = var32;
                  var40 = (le0_2)var35.get(var25);
               }

               var49.gg0.vx0(var40);
               if (var25 == 1) {
                  var32.gg0.Rg();
               }
            }

            var7.gg0.vx0(var10);
            var7.gg0.vx0(var8);
            var7.gg0.vx0(var32);
            byte var26 = 2;
            j1_0 var50 = var7.gg0.yu0(var26);
            float var27 = 15.0F;
            var50.Ek0 = new vl0_0(var27);
            int var51 = ++var19;
            var2.gg0.vx0(var7).goto$();
            if (var51 > 2) {
               var2.gg0.Rg();
               var19 = 0;
            }
         }
      }

      cn_0 var20;
      cn_0 var52 = var20 = new cn_0(null, 0);
      String var22 = sm0_0.wa0(2310, "");
      var52.Sk(var22);
      tk0_0 var23;
      tk0_0 var53 = var23 = new tk0_0(new A40());
      var53.gg0.vx0(var20);
      var53.gg0.Rg();
      var53.gg0.vx0(var2).goto$();
      lo0_0 var17;
      var17 = new lo0_0(var23);
      Runnable var16 = () -> uX(var0, var1);
      lpt3__4 var21 = new lpt3__4(var17, var16, var1, xX.Bm);

      var21.uf("release-widget");
      var21.D80 = true;
      yI0.sr0(var21);
   }

   public static void uX(jb0_0[] var0, jb0_0 var1) {
      HashMap<Integer, Set<VU>> var2 = new HashMap<>();

      Arrays.stream(var0).map(jb0_0::ol0).filter(Objects::nonNull).filter(Qy0::KJ0).forEach(var1x -> {
         dp_1 var2x;
         if ((var2x = var1x.h10()).isEmpty()) {
            var2.computeIfAbsent(0, var0xx -> new HashSet<>()).add(var1x);
         } else {
            int[] var5x;
            int var3x = (var5x = var2x.toArray()).length;

            for (int var4x = 0; var4x < var3x; var4x++) {
               var2.computeIfAbsent(var5x[var4x], var0xx -> new HashSet<>()).add(var1x);
            }
         }
      });
      if (var2.isEmpty() || var2.size() <= 1 && var2.containsKey(0)) {
         int var10 = var0.length;

         for (int var12 = 0; var12 < var10; var12++) {
            jb0_0 var13;
            if ((var13 = var0[var12]).ol0() != null && !var13.ol0().I8.vn() && !var13.ol0().I8.TH()) {
               BR var18 = tw0_0.rl;
               CH0 var14 = var13.ol0().pu;
               var18.fk0.uQ(new sj0_1(var14));
            }
         }
      } else {
         tk0_0 var7;
         tk0_0 var10001 = var7 = new tk0_0(new A40());

         var10001.gg0.DL(2370).Rr0.Rg();
         var10001.gg0.es(" ").Rr0.Rg();
         var2.forEach((key, set) -> wZ(var7, key, set));
         var7.gg0.es(" ").Rr0.Rg();
         var7.gg0.DL(2379).Rr0.Rg();
         xe_1 var3;
         xe_1 var15 = var3 = new xe_1(sm0_0.c0(2380));

         var15.RR(() -> var2.getOrDefault(0, Collections.emptySet()).stream().map(PH0::ZK).forEach(tw0_0.rl::N8));
         var15.pw0(false);
         xe_1 var4;
         xe_1 var16 = var4 = new xe_1(sm0_0.c0(2381));

         var16.RR(() -> var2.values().stream().flatMap(Collection::stream).map(PH0::ZK).distinct().forEach(tw0_0.rl::N8));
         var16.pw0(false);
         lpt5__5.hL.ZD(() -> lg_0.k.lPT5(() -> {
            var3.pw0(true);
            var4.pw0(true);
         }), 1000L);
         xe_1 var11;
         var11 = new xe_1(sm0_0.c0(2382));
         Qy0 var5;
         Qy0 var17 = var5 = yI0;
         lpt3__4 var6;
         lpt3__4 var19 = var6 = new lpt3__4(var7, var3, var4, var11, var1);

         var19.D80 = true;
         String var8 = "confirm-widget-warning";
         lpt3__4 var9;
         if ((var9 = var17.Ba0) != null) {
            var9.xe0();
         }

         var5.Ba0 = var6;
         var6.uf(var8);
         var5.F9(var5.fU(), var6);
      }
   }

   public static void wZ(tk0_0 var0, Integer var1, Set var2) {
      if (var1 != 0) {
         var0.gg0.es(var2.size() + "x " + sm0_0.c0(var1)).Rr0.Rg();
      }
   }

   public static boolean KJ0(VU var0) {
      return !var0.I8.vn() && !var0.I8.TH();
   }

   public static void ew0(jb0_0[] var0) {
      int var1 = var0.length;

      for (int var2 = 0; var2 < var1; var2++) {
         VU var3;
         if ((var3 = var0[var2].ol0()) != null && !var3.I8.vn()) {
            BU var4 = yI0.zK0;
            qu_2 var5 = yI0.zK0.de0;
            if (yI0.zK0.de0 == null) {
               var4.RG0(var3, true, true);
            } else {
               var5.Dg0(var3);
            }
         }
      }
   }

   public static void dI(jb0_0[] var0) {
      int var1 = var0.length;

      for (int var2 = 0; var2 < var1; var2++) {
         VU var3;
         if ((var3 = var0[var2].ol0()) != null && !var3.I8.vn()) {
            BU var4 = yI0.zK0;
            lr_0 var5 = yI0.zK0.Xf0;
            if (yI0.zK0.Xf0 == null) {
               var4.U1(var3, true, true);
            } else {
               var5.nA0.Db(var3);
               byte var6 = 3;
               var5.hq.Zd((com2__3)var5.hq.g6.get(var6));
               lpt6__0.v90(var5.nA0);
            }
         }
      }
   }

   public static void nH0(jb0_0[] var0) {
      int var1 = var0.length;

      for (int var2 = 0; var2 < var1; var2++) {
         VU var3;
         if ((var3 = var0[var2].ol0()) != null && var3.I8.COM6()) {
            BR var4 = tw0_0.rl;
            CH0 var5 = var3.pu;
            byte var6 = -1;
            _volatile var7 = var3.I8.JF;
            var4.fk0.uQ(new SF0(var7, var5, var6));
         }
      }
   }

   public static void ZA(jb0_0 var0, QT var1) {
      int var4 = var0.A20 + var0.e80;
      int var5 = var0.a3() / 2 + var4;
      int var2 = var0.SB0 + var0.y9;
      int var3 = var0.k5() / 2 + var2;
      var1.vu0(var0, Arrays.asList(var1.Uc0().uO()));
      var1.fx0(var5, var3);
      lpt6__0.v90(var0);
   }

   public static void BM(di0_1 var0, jb0_0 var1) {
      var0.FF[0].G9(var1);
   }

   public static void Op0(di0_1 var0, jb0_0 var1) {
      var0.FF[2].G9(var1);
   }

   public static void aK(di0_1 var0, jb0_0[] var1) {
      var0.FF[0].G9(var1[0]);
      var0.FF[2].G9(var1[1]);
   }

   public static boolean Nv0(bi0_1 var0) {
      return var0 instanceof E90;
   }

   public static void ti(String var0) {
      II0.ZN(var0);
   }

   public static jb0_0[] yy0(int var0) {
      return new jb0_0[var0];
   }

   public static jb0_0[] VW(int var0) {
      return new jb0_0[var0];
   }

   public static jb0_0 B20(QT var0, NK var1, int var2) {
      var0.getClass();
      return QT.LPt7(var1, var2);
   }

   public static void fF(xe_1 var0, xe_1 var1) {
      lg_0.k.lPT5(() -> gw(var0, var1));
   }

   public static void gw(xe_1 var0, xe_1 var1) {
      var1.pw0(true);
      var0.pw0(true);
   }

   public static void Oj0(Map var0) {
      var0.values().stream().flatMap(value -> ((Set)value).stream())
         .map(value -> ((VU)value).ZK()).distinct().forEach(value -> tw0_0.rl.N8((CH0)value));
   }

   public static void eq0(Map var0) {
      ((Set)var0.getOrDefault(0, Collections.emptySet())).stream()
         .map(value -> ((VU)value).ZK()).forEach(value -> tw0_0.rl.N8((CH0)value));
   }

   public static void aY(Map var0, VU var1) {
      dp_1 var2 = var1.h10();
      if (var2.isEmpty()) {
         Set var5 = (Set)var0.get(0);
         if (var5 == null) {
            var5 = Jm0(0);
            var0.put(0, var5);
         }
         var5.add(var1);
         return;
      }
      int[] var3 = var2.toArray();
      for (int var4 : var3) {
         Set var5 = (Set)var0.get(var4);
         if (var5 == null) {
            var5 = Fa0(var4);
            var0.put(var4, var5);
         }
         var5.add(var1);
      }
   }

   public static Set Fa0(Integer var0) {
      return new HashSet();
   }

   public static Set Jm0(Integer var0) {
      return new HashSet();
   }

   public static void dk(QT var0) {
      var0.Uc0().FL(true);
   }

   public static boolean rs(jb0_0 var0) {
      return var0.ol0() != null;
   }

   public static void U50(le0_2 var0) {
      I2 var2 = var0.t30.ZD();

      while (var2.hasNext()) {
         le0_2 var1;
         if ((var1 = (le0_2)var2.next()) instanceof GF0) {
            ((GF0)var1).Tj();
         }

         if (var1.t30 != null) {
            U50(var1);
         }
      }
   }

   public static le0_2 QF0(le0_2 var0) {
      if (var0 == null) {
         return null;
      }
      if (var0 instanceof cg_0 && var0.Of()) {
         return var0;
      }

      for (int var1 = 0; var1 < var0.fU(); var1++) {
         le0_2 var2;
         if ((var2 = QF0(var0.qA(var1))) != null) {
            return var2;
         }
      }

      return null;
   }

   public static Vt0 m60(jb0_0[] var0, NK var1) {
      QT var2 = BU.T50.OJ;
      if (BU.T50.OJ == null) {
         return new Vt0();
      }

      Vt0 var3;
      var3 = new Vt0(sm0_0.c0(2301));
      wg0_0 var4 = BU.T50.package$;
      if (BU.T50.package$.S80() != null) {
          at_0 var5 = new at_0(sm0_0.c0(1117));
          var5.eu0 = () -> tb(var4, var0);
          var3.hx.add(var5);
      }

      byte[] var12 = tw0_0.rl.y8.pw0;
      int var13 = tw0_0.rl.y8.pw0.length;

      for (int var6 = 0; var6 < var13; var6++) {
         byte var7 = var12[var6];
         if (var1 == null || var1.Uq0 != var7) {
            NK var8;
            _volatile var9 = (var8 = var2.Lh0[var7]).dz0;
             at_0 var10 = new at_0(tw0_0.rl.y8.P2(var9, var7));
             var10.eu0 = () -> Yu(var0, var2, var8, var9, var7);
             var3.hx.add(var10);
         }
      }

      if (var1 == null || var1.dz0 != _volatile.Kb) {
          at_0 var11 = new at_0(sm0_0.c0(2365));
          var11.eu0 = () -> Px(var0, var2);
          var3.hx.add(var11);
      }

      return var3;
   }

   public static void xi(le0_2 var0, VU var1, short var2, int var3, int var4, Runnable var5) {
      yi_1 var6 = tw0_0.rl.gd0;
      if (tw0_0.rl.gd0 != null) {
         EP var7;
         var7 = new EP();
         boolean var8;
         if (var2 == 1030) {
            var8 = true;
         } else {
            var8 = false;
         }

         si_0[] var24;
         int var9 = (var24 = var6.yJ()).length;

         for (int var10 = 0; var10 < var9; var10++) {
            si_0 var11 = var24[var10];
            E90 var12;
                   if ((var8 || !tw0_0.e60.jB0.pu.equals(var11.HU)) && (var12 = tw0_0.e60.te0(var11.HU)) != null) {
               ls_0[] var25;
               if ((var25 = var11.qJ0).length == 1) {
                  ls_0 var26;
                  if ((var26 = var25[0]) != null) {
                      String var29 = var12.oc0;
                      Runnable var27 = () -> Ye(var1, var2, var12, var26, var5);
                      sw_1 var28 = new sw_1(var29, var12, var27);

                     var7.hx.add(var28);
                  }
               } else if (var25.length > 1) {
                  ps_1 var13;
                  var13 = new ps_1(var12);
                  int var14 = var25.length;

                  for (int var15 = 0; var15 < var14; var15++) {
                     ls_0 var16;
                     ls_0 var10001 = var16 = var25[var15];
                     mp_1 var17 = mp_1.vf0();
                     cq_0 var31 = (cq_0)var17.k2.get(var10001.Xm0);
                      String var19 = var31.Ay(false);
                      AG0 var32 = yh_0.Xm0.Kr0((byte)0, var31.dR, false, false)[0];
                      byte var20 = 0;
                      byte var21 = 36;
                      byte var22 = 36;
                      Runnable var30 = () -> S(var1, var2, var12, var16, var5);
                      kf0_1 var18 = new kf0_1(var19, var32, var20, var21, var22, var30);

                     var13.hx.add(var18);
                  }

                  var7.hx.add(var13);
               }
            }
         }

         if (var7.hx.size() < 1) {
            at_0 var23;
            var23 = new at_0(sm0_0.c0(1122));
            var7.hx.add(var23);
         }

         UA.rL(var7, var0, var3, var4);
      }
   }

   public static Vt0 of() {
      Vt0 var0;
      var0 = new Vt0(sm0_0.c0(1125));
      VU[] var1;
      int var2 = (var1 = tw0_0.rl.r1(_volatile.BV).rT()).length;

      for (int var3 = 0; var3 < var2; var3++) {
         VU var4;
         if ((var4 = var1[var3]) != null) {
            String var10002 = var4.na0();
            short var6 = var4.I8.Kr();
            AG0 var10 = yh_0.Xm0.qC0(var6, var4.Dg0(), var4.I8.aR())[0];
            wj0_1 var9 = new wj0_1(var4);
            kf0_1 var5 = new kf0_1(var10002, var10, -6, 0, 0, var9);
            var0.hx.add(var5);
         }
      }

      yt_1 var7 = tw0_0.e60;
      E90 var8;
      if (tw0_0.e60 != null && (var8 = var7.jB0) != null && var8.mI0() != 0) {
         var0.mA0(sm0_0.c0(2256), Qy0::Si);
      }

      return var0;
   }

   public final void v5(boolean var1, List var2, int var3, int var4) {
      // [右键菜单诊断] 确认 v5 被执行及拾取列表大小（定位后删除）
      System.out.println("[右键菜单诊断] v5执行: 拾取实体数=" + (var2 == null ? -1 : var2.size()) + ", 鼠标坐标=(" + var3 + "," + var4 + ")");
      if (!var1 || !var2.isEmpty()) {
         if (var2.size() == 1) {
            bi0_1 var10000 = (bi0_1)var2.get(0);
            var10000.getClass();
            if (var10000 instanceof KF) {
               UA.rL(of(), this, var3, var4);
               return;
            }
         }

         Vt0 var12;
         var12 = new Vt0();
         Collections.sort(var2, bi0_1.ya0);
         if (tw0_0.Eu(1) && var2.stream().filter(var0 -> var0 instanceof E90).count() > 1L) {
            var12.mA0("Copy all names", () -> r9(var2));
         }

         Iterator var5 = var2.iterator();

         while (var5.hasNext()) {
            bi0_1 var6;
            bi0_1 var34 = var6 = (bi0_1)var5.next();
            var34.getClass();
            q90_0 var15;
            Vt0 var35;
            if (var34 instanceof KF) {
               var35 = var12;
               var15 = of();
            } else if (var6 instanceof E90) {
               E90 var16 = (E90)var6;
               if (var6.pu.equals(tw0_0.e60.jB0.pu)) {
                  var35 = var12;
                  var15 = this.QK(var16, sm0_0.c0(1123), var3, var4, false);
               } else {
                  var35 = var12;
                  String var17 = var16.oc0;
                  boolean var7 = var16.iz0((byte)-128);
                  var15 = this.QK(var16, var17, var3, var4, var7);
               }
            } else {
               if (!var6.CI0()) {
                  continue;
               }

               MO var25 = (MO)var6;
               Vt0 var8;
               var8 = new Vt0(var6.na0());
               var12.hx.add(var8);
               if (this.zK0.cz0.Lt0 != null) {
                  at_0 var9;
                   var9 = new at_0("- COPY -", () -> Gg0(var6));
                  var8.hx.add(var9);
                   var9 = new at_0("- DELETE -", () -> COm9(var6));
                  var8.hx.add(var9);
                  EP var27;
                  EP var10001 = var27 = new EP("- MOVE TO ME -");
                  at_0 var10;
                   var10 = new at_0("Heading", () -> Xq(var6));
                  var10001.hx.add(var10);
                   var10 = new at_0("No Heading", () -> m8(var6));
                  var10001.hx.add(var10);
                  var8.hx.add(var27);
               }

               at_0 var28;
                var28 = new at_0("Force Interact", () -> com9(var6));
               var8.hx.add(var28);
               ej_1 var18 = null;
               mg_0 var29 = var25.hj;
               if (var25.hj instanceof z2_0) {
                  PlayerAvatarMovementController var19 = ((z2_0)var29).Bk0;
                  if (((z2_0)var29).Bk0.ok != 2) {
                     var18 = null;
                  } else {
                     var18 = tw0_0.Ll0.Qz0.AF(var19.Z4);
                  }
               }

               if (var18 != null) {
                  var28 = new at_0("Sprite ID: " + var18.vq);
                  var8.hx.add(var28);
                  var28 = new at_0("Frame Type: " + var18.vd);
                  var8.hx.add(var28);
                  var28 = new at_0("Idle Frame: " + var18.Fv);
                  var8.hx.add(var28);
               }

               at_0 var20;
               var20 = new at_0("NPC Sprite ID: " + var25.ok + " / " + var25.Z4);
               var8.hx.add(var20);
               at_0 var21;
               var21 = new at_0("Idle Movement: " + var25.F7.eA);
               var8.hx.add(var21);
               at_0 var22;
               var22 = new at_0("Movement Leash: " + var25.Mc + " | " + var25.Rj0);
               var8.hx.add(var22);
               at_0 var23;
               var23 = new at_0("Object ID: " + var25.pu);
               var8.hx.add(var23);
               if (var25.DN <= 0) {
                  continue;
               }

               var35 = var8;
               at_0 var24;
               var24 = new at_0("Trainer Aggro Range: " + var25.Nf0);
               var8.hx.add(var24);
               var15 = new at_0("Trainer ID: " + var25.DN);
            }

            var35.hx.add(var15);
         }

         if (var2.isEmpty()) {
            var12.mA0(sm0_0.c0(1122), null);
         }

         if (var3 < 0 && var4 < 0) {
            UA var14;
            UA var37 = var14 = new UA(this);

            le0_2 var11;
            if ((var11 = var37.M10(0, var12, this, false)) != null) {
               var11.lt0();
               Qy0 var13 = yI0;
               var11.sy(yI0.Mx / 2 - var11.Mx / 2, var13.OB / 2 - var11.OB / 2);
               UA.OE0(var11);
            }

            var14.Uz(1, false);
         } else {
            UA.rL(var12, this, var3, var4);
         }
      }
   }

   public final void fT(String var1) {
      fa0_0 var2 = tw0_0.rl.q50;
      tw0_0.rl.q50.getClass();
      String var3 = var1.toLowerCase(Locale.ENGLISH);
      Iterator var7 = var2.lx.values().iterator();

      GR var4;
      do {
         if (!var7.hasNext()) {
            var4 = null;
            break;
         }
      } while (!(var4 = (GR)var7.next()).QB0.DR.toLowerCase(Locale.ENGLISH).equals(var3));

      if (var4 != null) {
          String var6 = sm0_0.wa0(2260, var1);
          lpt3__4 var5 = new lpt3__4(var6, () -> fA(var1), null);

         this.sr0(var5);
      } else {
         tw0_0.rl.fk0.uQ(new zf_0(var1));
      }
   }

   public final void lM(String var1) {
      BU var2;
      if ((var2 = this.zK0) != null) {
         var2.Yf(var1);
      }
   }

   public final void Kl(String var1) {
      BU var2;
      XH var3;
      if ((var2 = this.zK0) != null && (var3 = var2.BK) != null) {
         var3.iX(var1);
      }
   }

   public final void JW(boolean var1, String var2, int var3, int var4) {
      if (var1) {
         Cq var11 = Cq.Wn0;
         var1 = false;
         boolean var13 = false;
         boolean var14 = false;
         byte var5 = 0;
         byte var6 = 0;
         N2 var7 = N2.BF;
         lq0[] var8 = lq0.CoM4;
         byte var9 = 0;
         tw0_0.rl.fk0.uQ(new Bs0(var2, var11, var1, var13, var14, var5, var6, var7, var8, var9));
      } else {
         tt_1 var10;
         var10 = new tt_1(var2);
         this.F9(this.fU(), var10);
      }
   }

   public final void pe(String var1, int var2, int var3) {
      Vt0 var10000 = new Vt0();
      String var5 = sm0_0.c0(1519);
      at_0 var4 = new at_0(var5, () -> II0.ZN(var1));

      var10000.hx.add(var4);
      UA.rL(var10000, this, var2, var3);
   }

   public final void COm5(di0_1 var1, jb0_0[] var2, jb0_0 var3, boolean var4, QT var5, NK var6, int var7, int var8) {
      Vt0 var9;
      var9 = new Vt0();
      if (var1 != null && var2.length <= 2) {
         at_0 var10;
         Vt0 var10000;
         at_0 var10001;
         Runnable var10002;
         if (var2.length == 2) {
            var10000 = var9;
            var10001 = var10 = new at_0(sm0_0.wa0(2518, "1/2"));

             var10002 = () -> aK(var1, var2);
         } else {
            if (var1.FF[0].AG != null) {
               var10001 = var10 = new at_0(sm0_0.wa0(2518, "2"));

                var10001.eu0 = () -> Op0(var1, var3);
               var9.hx.add(var10);
            }

            var10000 = var9;
            var10001 = var10 = new at_0(sm0_0.wa0(2518, "1"));

             var10002 = () -> BM(var1, var3);
         }

         var10001.eu0 = var10002;
         var10000.hx.add(var10);
      }

      if (!var4) {
         at_0 var19;
         at_0 var39 = var19 = new at_0(sm0_0.c0(2317));

          var39.eu0 = () -> ZA(var3, var5);
         var9.hx.add(var19);
         at_0 var20;
         at_0 var34 = var20 = new at_0(sm0_0.c0(2314));

         var34.eu0 = () -> var5.Uc0().FL(true);
         var9.hx.add(var20);
      }

      at_0 var21;
      at_0 var40 = var21 = new at_0(sm0_0.c0(2300));

       var40.eu0 = () -> eF0(var3);
      var9.hx.add(var21);
      String var12 = "";
       int var22 = 0;
       int activeCount = 0;
      int var26 = var2.length;

      for (int var31 = 0; var31 < var26; var31++) {
         VU var11;
         if ((var11 = var2[var31].ol0()) != null) {
            if (!var11.I8.vn() && !var11.I8.TH()) {
                activeCount++;
            }

            if (var11.I8.COM6()) {
               if (var22 < 1) {
                  var12 = sm0_0.c0(gu0.l2.lPT6(var11.I8.rh0()).Nl);
               }

               var22++;
            }
         }
      }

      if (var22 > 0) {
         at_0 var27;
         var27 = new at_0();
         String var13;
         if (var22 == 1) {
            var13 = sm0_0.wa0(1421, var12);
         } else {
            var13 = sm0_0.wa0(1409, String.valueOf(var22));
         }

         String var23 = var27.ln;
         var27.ln = var13;
         var27.Di("name", var23, var13);
          var27.eu0 = () -> nH0(var2);
         var9.hx.add(var27);
      }

      if (var2.length == 1) {
         at_0 var14;
         at_0 var35 = var14 = new at_0(sm0_0.c0(8043));

          var35.eu0 = () -> dI(var2);
         var9.hx.add(var14);
      }

      if (var2.length <= 5) {
         at_0 var15;
         at_0 var36 = var15 = new at_0(sm0_0.c0(5827));

          var36.eu0 = () -> ew0(var2);
         var9.hx.add(var15);
      }

      Vt0 var16 = m60(var2, var6);
      var9.hx.add(var16);
      if (var2.length <= 6 && var3.ol0() != null && !var3.ol0().I8.vn() && var6.dz0 == _volatile.Bf0) {
         Vt0 var17;
         var17 = new Vt0(sm0_0.c0(1412));

         for (int var24 = 0; var24 < tx_0.bm0(tw0_0.rl.k0.hL0); var24++) {
            tx_0 var28;
            String var29 = (var28 = tw0_0.rl.dh0.Ed0((byte)var24)).toString();
            at_0 var32;
            at_0 var37 = var32 = new at_0(var29);

            var37.eu0 = new wn_0(var28, var29, var2);
            var17.hx.add(var32);
         }

         var9.hx.add(var17);
      }

       if (activeCount > 0) {
         at_0 var18;
         at_0 var38 = var18 = new at_0(sm0_0.c0(2302));

          var38.eu0 = () -> pF0(var2, var3);
         var9.hx.add(var18);
      }

      UA.rL(var9, var3, var7, var8);
   }

   public final void eF0(jb0_0 var1) {
      this.zK0.FI(var1.ol0(), var1, qo_1.DL, false);
   }

   @Override
   public final void C(zk0_1 var1) {
      if (tw0_0.kz0()) {
         mh_1 var10000 = var1.cL;
         byte var3 = 0;
         C90 var2;
         var2 = new C90(new UB((Qy0) this));
         var10000.HV.P6(var3, var2);
      }
   }

   public final void Gl() {
      if (this.wY == null) {
         (this.wY = new MF0(this.ae)).Ll(false);
         MF0 var1 = this.wY;
         this.F9(this.fU(), var1);
         this.wY.Iu();
      }

      this.wY.I70(this.wY.eE ^ true);
   }

   public final void VX(cx_0 var1) {
      if (!this.tq.j4(var1, true)) {
         this.tq.Ue0(var1);
      }
   }

   public final boolean y4() {
      if (tw0_0.kz0()) {
         jn_0 var1 = this.Bc0;
         if (this.Bc0.hO != null || var1.uc != null) {
            return true;
         }
      }

      es_1 var2;
      cx_0 var3;
      N1 var4;
      return (var2 = this.tq).KB == 0 ? false : ((var4 = (var3 = (cx_0)var2.GH0()).z70) == null || !var4.pb0) && var3 instanceof Uo ^ true;
   }

   @Override
   public final boolean nd0(i70_0 event) {
      int eventType = event.zu;
      if (tw0_0.kz0() && E00.C10(eventType) && eventType == 3 && tw0_0.FL.gi0()) {
         es_1 queue = tw0_0.FL.lpT1;
         if (queue.KB != 0) ((iw_1)queue.GH0()).zn0();
         return true;
      }

      if (E00.ZU(eventType) && event.iT() && this.G30 != null) {
         rp_0 gate = rp_0.Oe;
         if (gate != null && gate.Ov(event.finally$)) {
            this.G30.Ll(!this.G30.eE);
            return true;
         }
      }

      if (lpt3__1.RJ && E00.ZU(eventType) && event.iT() && event.J30 == 4 && event.finally$ == 62) {
         la_2 overlay = this.Ms0;
         if (overlay != null && overlay.K20 != null) return true;
         if (overlay == null) {
            overlay = new la_2();
            this.Ms0 = overlay;
            this.F9(this.fU(), overlay);
         }
         this.Ms0.lt0();
         this.Ms0.A20(pa0_0.Ol, 0, 200);
         return true;
      }

      if (lpt3__1.RJ && E00.ZU(eventType) && event.iT() && event.finally$ == 68) {
         zy0_0 status = this.Tx;
         if (status.eE) {
            status.Ke0.f00();
            status.z70.iG0(200);
            status.z70.so0 = (Runnable[])a7_0.gE(status.z70.so0, new xa0_0((Qy0) this), Runnable.class);
         } else {
            status.Ll(true);
            status.z70.i10(gn_0.TRANSPARENT);
            status.z70.bT(gn_0.WHITE, 200);
            status.z70.so0 = (Runnable[])a7_0.gE(status.z70.so0, new Jt0((Qy0) this), Runnable.class);
         }
         return true;
      }

      // [右键菜单诊断] 右键按下时的各门控状态（定位后删除）
      if (event.nA0 == 1 && eventType == 3) {
         System.out.println("[右键菜单诊断] nd0收到右键按下: 世界状态e60=" + (tw0_0.e60 != null)
               + ", 自身玩家jB0=" + (tw0_0.e60 != null && tw0_0.e60.jB0 != null)
               + ", 移动端模式kz0=" + tw0_0.kz0() + ", 调试界面C7=" + tt0_0.C7());
         if (tw0_0.e60 != null && tw0_0.e60.jB0 != null) {
            Object selfMapAttr = null;
            try { selfMapAttr = tw0_0.e60.jB0.ba0.V20(); } catch (Throwable t) { selfMapAttr = "EXC:" + t.getClass().getSimpleName(); }
            System.out.println("[右键菜单诊断] 自身实体: 瓦片坐标=(" + tw0_0.e60.jB0.ba0.Lq0 + "," + tw0_0.e60.jB0.ba0.B5
                  + ") 当前地图属性=" + (selfMapAttr == null ? "null!!(拾取门控会拒绝一切实体)" : String.valueOf(selfMapAttr)));
         }
      }

      yt_1 world = tw0_0.e60;
      if (world != null && world.jB0 != null) {
         if (E00.C10(eventType) && (event.nA0 == 0 || event.nA0 == 1)
               && event.f8 < this.Bc0.ew0() && event.AN < this.Bc0.Hv0() - 50) {
            I2 children = this.t30 == null ? null : this.t30.ZD();
            if (children != null) {
               while (children.hasNext()) {
                  le0_2 child = (le0_2)children.next();
                  if (child.Of()) child.f00();
               }
            }
            ML0 ml = this.Bc0.he0 == null ? null : this.Bc0.he0.N10;
            x7_0 x7 = ml == null ? null : ml.Zv0;
            QI0[] regions = x7 == null ? null : x7.Com8;
            if (regions != null) {
               le0_2 hit = this.dh0(event.f8, event.AN);
               if (hit != null) {
                  for (QI0 region : regions) {
                     if (hit.Bf0(region)) break;
                  }
               } else if (x7 != null && !x7.cB) {
                  ml.u3(x7);
                  x7.dispose();
                  ml.Zv0 = null;
               }
            }
         }

         if (!tw0_0.kz0() && event.nA0 == 1 && eventType == 3) {
            if (tt0_0.C7()) {
               vo_2 scene = tw0_0.LD0.Sc;
               Tv0 tv = scene == null ? null : scene.So();
               if (scene != null && tv != null) this.Up(scene.qf, tv, event.f8, event.AN);
            } else {
               this.lJ(true, world.YK0(), event.f8, event.AN);
            }
         }
         if (eventType == 8 && event.J30 == 1 && tw0_0.Eu(3)) {
            this.Bc0.Sc.Yt((double)event.hh0 / 5.0D);
         }
      } else {
         this.G0(event);
      }

      if (E00.ZU(eventType) && event.iT() && Ge0.Vv0 > 0) {
         com6__1 state = com6__1.WI0;
         long now = hk0_1.KG;
         if (state.fi <= now && now - state.CJ > (long)state.kr0 && now - state.i9 > 100L) {
            E90 player = world.jB0;
            int x = player.ba0.Lq0 + state.Q9;
            int y = player.ba0.B5 + state.a6;
            int width = world.N60().zC0;
            int height = world.N60().BJ;
            if (Ge0.Vv0 == 1) {
               rp_0 gate = rp_0.sJ0;
               if (gate != null && gate.Ov(event.finally$)) {
                  tw0_0.rl.fk0.uQ(new sq0_0((byte)y, (byte)x, Ge0.Fu0));
                  return true;
               }
            } else if (Ge0.Vv0 == 2) {
               rp_0 gate = rp_0.sJ0;
               if (gate != null && gate.Ov(event.finally$)) {
                  tw0_0.rl.fk0.uQ(new fb_0((byte)y, (byte)x));
                  return true;
               }
            }
            rp_0 gate = rp_0.nK0;
            if (gate != null && gate.Ov(event.finally$)) {
               Ge0.Vv0 = 0;
               return true;
            }
            gate = rp_0.kC0;
            if (gate != null && gate.Ov(event.finally$)) {
               if (y == 0) return false;
               state.Qf(new nk_0[]{nk_0.A00});
               return true;
            }
            gate = rp_0.synchronized$;
            if (gate != null && gate.Ov(event.finally$)) {
               if (y >= height - 1) return false;
               state.Qf(new nk_0[]{nk_0.Eo0});
               return true;
            }
            gate = rp_0.I90;
            if (gate != null && gate.Ov(event.finally$)) {
               if (x == 0) return false;
               state.Qf(new nk_0[]{nk_0.vq});
               return true;
            }
            gate = rp_0.Ni;
            if (gate != null && gate.Ov(event.finally$)) {
               if (x >= width - 1) return false;
               state.Qf(new nk_0[]{nk_0.h80});
               return true;
            }
         }
      }

      // Keyboard navigation for queued interaction menus must not depend on
      // the optional Ge0 directional-input mode being active.
      if (E00.ZU(eventType) && event.iT()) {
         rp_0 gate = rp_0.sJ0;
         boolean gated = gate != null && gate.Ov(event.finally$);
         gate = rp_0.nK0; gated |= gate != null && gate.Ov(event.finally$);
         gate = rp_0.kC0; gated |= gate != null && gate.Ov(event.finally$);
         gate = rp_0.synchronized$; gated |= gate != null && gate.Ov(event.finally$);
         gate = rp_0.I90; gated |= gate != null && gate.Ov(event.finally$);
         gate = rp_0.Ni; gated |= gate != null && gate.Ov(event.finally$);
         if (gated && this.zK0 != null && !this.zK0.BK.b5.Of()) {
            pk0_0 menu = this.K1;
            if (menu.lpT1.KB != 0) {
               if (((iw_1)menu.lpT1.GH0()).p3(event.finally$)) return true;
            } else {
               BU owner = menu.u4.zK0;
               if (owner != null && owner.cOm1 != null) {
                  owner.cOm1.Sd0(event.finally$);
                  return true;
               }
            }
         }
      }

      if (super.nd0(event)) return true;
      if (this.ZW != null && this.ZW.nd0(event)) return true;
      if (this.ez0 != null && this.ez0.nd0(event)) return true;

      // The HUD is created asynchronously by bl0_1.os0(); input can arrive first.
      if (this.zK0 == null) return super.nd0(event);

      if (event.iT() && event.finally$ == 111 && this.t30 != null) {
         I2 children = this.t30.ZD();
         while (children.hasNext()) {
            le0_2 child = (le0_2)children.next();
            if (child.Of()) child.f00();
         }
      } else if (event.finally$ == 66) {
         if (event.J30 == 1) {
            this.zK0.BK.gE();
            return true;
         }
         if (event.J30 == 0 && !PI(this) && !this.zK0.BK.b5.Of() && lpt6__0.v90(this.zK0.BK.b5)) return true;
      }

      if (this.zK0.BK.b5.Of()) {
         if (event.finally$ == 19) {
            this.zK0.BK.OB0(1);
            return true;
         }
         if (event.finally$ == 20) {
            this.zK0.BK.OB0(-1);
            return true;
         }
         return super.nd0(event);
      }
      if (QF0(this) != null) return super.nd0(event);
      if (this.zK0.Mc0 != null && this.zK0.Mc0.nd0(event)) return true;
      if (!this.zK0.BK.b5.Of() && tw0_0.Eu(3) && event.iT() && event.finally$ == 124) {
         cn_0 label = xn0_0.Lt.Ld0;
         label.Ll(!label.eE);
      }

      this.G0(event);
      if (!this.zK0.BK.b5.Of() && this.sj0 == null && !this.zK0.cz0.Of()) {
         if (event.J30 == 4 && event.finally$ != 0) {
            rp_0 gate = rp_0.Mt;
            if (event.iT() && gate != null && gate.Ov(event.finally$)) this.zK0.jw0();
         }
         rp_0 gate = rp_0.Mi0;
         if (event.iT() && gate != null && gate.Ov(event.finally$)) {
            a10_0 prompt = tw0_0.PK0;
            if (prompt != null && !prompt.a40) this.dk(-1, sm0_0.c0(6002)); else this.zK0.Zl0();
         } else if (event.iT() && (gate = rp_0.Kz0) != null && gate.Ov(event.finally$)) {
            this.zK0.Dj0();
         } else if (event.iT() && (gate = rp_0.Ul) != null && gate.Ov(event.finally$)) {
            this.zK0.QS();
         } else if (event.iT() && (gate = rp_0.ip0) != null && gate.Ov(event.finally$)) {
            if (tw0_0.kz0()) this.Gl(); else this.zK0.iB0.Uz(-1, false);
         } else if (event.iT() && (gate = rp_0.Oe) != null && gate.Ov(event.finally$) && this.Bc0.no0 == null) {
            boolean visible = !this.zK0.eE;
            this.zK0.Ll(visible);
            this.Ll(visible);
         } else if (event.iT() && (gate = rp_0.Jq) != null && gate.Ov(event.finally$)) {
            this.zK0.We(true);
         } else if (event.iT() && (gate = rp_0.oq) != null && gate.Ov(event.finally$)) {
            this.zK0.hc0(true);
         } else if (event.iT() && (gate = rp_0.Un0) != null && gate.Ov(event.finally$)) {
            this.zK0.U1(null, this.zK0.Xf0 == null, false);
         } else if (event.iT() && event.finally$ == 111) {
            if (tw0_0.kz0()) this.Gl();
            else {
               if (this.hl0 != null) this.hl0.xe0();
               else {
                  this.hl0 = new o4((Qy0) this);
                  this.F9(this.fU(), this.hl0);
                  this.hl0.Ll(true);
               }
            }
         }
      }

      rp_0 screenshotGate = rp_0.i9;
      if (event.iT() && screenshotGate != null && screenshotGate.Ov(event.finally$) && !lg_0.lW.eC0(59)
            && !lg_0.lW.eC0(129) && lg_0.Sf0 != null) {
         i4_0 image = null;
         try {
            image = kr_2.R4();
            String path = "./screenshots/screenshot_" + System.currentTimeMillis() / 1000L + ".png";
            VE output = new VE(path, zv_1.kE);
            output.Br().A20();
            F40.mu(output, image);
            yI0.dk(-1, sm0_0.c0(6000));
            tw0_0.RE0.P7((short)1583);
         } catch (Exception ex) {
            yI0.dk(-1, sm0_0.c0(6001));
         } finally {
            if (image != null) image.dispose();
         }
      }

      rp_0 toggle = rp_0.nK0;
      if (event.iT() && toggle != null && toggle.Ov(event.finally$) && dw_2.s3) tw0_0.Ht0.y0 = !tw0_0.Ht0.y0;
      if (this.zK0.z6.nd0(event)) return true;
      if (tw0_0.rl.xm != null) tw0_0.rl.xm.H2(true, event.finally$);
      if (this.Bc0.qL0 != null && this.Bc0.qL0.je0(event)) return true;
      return super.nd0(event);
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void G0(i70_0 var1) {
      if (var1.iT()) {
         if (var1.finally$ == 12) {
            int var2 = var1.J30;
            if ((var1.J30 == 4 || var2 == 1) && var1.iT()) {
               BU var17 = BU.T50;
               if (BU.T50 != null) {
                  lc_2 var3 = var17.iB0;
                  if (var17.iB0.K20 != null) {
                     var3.xe0();
                     lc_2 var18;
                     var18 = new lc_2();
                     var17.iB0 = var18;
                     var17.SL(var18);
                  }
               }
            }
         }

         if (var1.finally$ == 135) {
            int var19 = var1.J30;
            if ((var1.J30 == 4 || var19 == 1) && var1.iT()) {
               lg_0.k.lPT5(jq0_0::Tq);
            }
         }

         if (var1.finally$ == 136) {
            int var20 = var1.J30;
            if (var1.J30 == 4 || var20 == 1) {
               wi0_0 var32 = wi0_0.gm;
               wi0_0.gm.t2(true);
               var32.t2(false);
               yI0.dk(-1, "Reloaded strings.");
            }
         }

         if (var1.finally$ == 137) {
            int var21 = var1.J30;
            if ((var1.J30 == 4 || var21 == 1) && var1.iT()) {
                TreeMap<String, zb0_2> var33 = new TreeMap<>(this.Bc0.UA.D4);
                HashSet<LJ0> var22 = new HashSet<>();
               int var26 = 0;

                for (Entry<String, zb0_2> var34 : var33.entrySet()) {
                  String var5 = (String)var34.getKey();
                  zb0_2 var6;
                  if (!(var6 = (zb0_2)var34.getValue()).isCopy()) {
                     while (var5.length() < 30) {
                        var5 = var5.concat(" ");
                     }

                     int var7 = var6.getFont().aa.KB;
                     int var8 = 0;
                     I2 var9 = var6.getFont().aa.ZD();

                     while (var9.hasNext()) {
                        LPT6_ var10;
                        var8 += (var10 = (LPT6_)var9.next()).bz * var10.xZ * 4;
                     }

                      LJ0 var36 = null;
                      if (var6.getFreeTypeFontData() != null) {
                         var36 = var6.getFreeTypeFontData().ko0;
                         if (var36 == null) {
                            try {
                               Field var35;
                               try {
                                  var35 = var6.getFreeTypeFontData().getClass().getDeclaredField("ko0");
                               } catch (NoSuchFieldException var14) {
                                  var35 = var6.getFreeTypeFontData().getClass().getDeclaredField("packer");
                               }
                               var35.setAccessible(true);
                               var36 = (LJ0) var35.get(var6.getFreeTypeFontData());
                            } catch (Exception ignored) {
                            }
                         }
                      }

                      if (var36 != null && !var22.contains(var36)) {
                         var22.add(var36);
                         var26 += var8;
                      }

                     dl_1 var39 = Gl0;
                     Object[] var31;
                     Object[] var42 = var31 = new Object[3];
                     var31[0] = var5;
                     var31[1] = var7;
                     var42[2] = tx_1.QR(var8);
                     var39.info("{} regionCount: {} PixmapMemory: {}", var31);
                  }
               }

               Gl0.info("Totals - PixmapMemory: {}", tx_1.QR(var26));
            }
         }

         if (var1.finally$ == 138) {
            int var23 = var1.J30;
            if (var1.J30 == 4 || var23 == 1) {
               DI.yt.tK0();
               yI0.dk(-1, "Reloaded mods.");
            }
         }

         if (var1.finally$ == 139 && var1.J30 == 4) {
            String[] var16;
            int var24;
            String[] var27 = new String[var24 = (var16 = wi0_0.gm.V4()).length];
            int var28 = -1;

            for (int var29 = 0; var29 < var24; var29++) {
               var27[var29] = wi0_0.gm.IE0(var16[var29]);
               if (dw_2.con.equalsIgnoreCase(var16[var29])) {
                  var28 = var29;
               }
            }

            if ((var24 = var28 + 1) >= var16.length) {
               var24 = 0;
            }

            Qy0 var10003 = yI0;
            StringBuilder var15;
            StringBuilder var10004 = var15 = new StringBuilder("Changed lang to ");

            var10003.dk(-1, var10004.append(var27[var24]).toString());
            dw_2.m70 = true;
            dw_2.con = var16[var24];
            wi0_0 var43 = wi0_0.gm;
            wi0_0.gm.t2(true);
            var43.t2(false);
            U50(this);
         }
      }
   }

   public final void YD0(NK var1, jb0_0[] var2, jb0_0 var3, int var4, int var5, boolean var6) {
      if (var2.length != 0) {
         if (!Arrays.stream(var2).noneMatch(var0 -> var0.ol0() != null)) {
            BU var7 = BU.T50;
            QT var8 = BU.T50.OJ;
            di0_1 var9 = var7.vs0;
            if (BU.T50.OJ != null) {
               lg_0.k.lPT5(() -> this.COm5(var9, var2, var3, var6, var8, var1, var4, var5));
            }
         }
      }
   }

   public final void Up(es_1 var1, Tv0 var2, int var3, int var4) {
      Vt0 var19;
      var19 = new Vt0();
      es_1 var5;
      var5 = new es_1();
      I2 var6 = var1.ZD();

      label200:
      while (var6.hasNext()) {
         nv0_0 var7 = (nv0_0)var6.next();
         var5.clear();
         DB0 var8 = lg_0.lW;
         float var10001 = lg_0.lW.bk0;
         float var20 = var8.zs;
         float var9 = tw0_0.LD0.mG0.df;
         float var10 = tw0_0.LD0.mG0.gS;
         float var11 = tw0_0.LD0.mG0.Ty;
         float var12 = tw0_0.LD0.mG0.Ja;
         iq0_0 var21 = var2.k0(var10001, var20, var9, var10, var11, var12);
         I2 var23 = var7.yf0.ZD();

         Ou0 var27;
         while (true) {
            boolean var13;
            do {
               if (!var23.hasNext()) {
                  var5.clear();
                  I2 var24 = var7.wp0.ZE0.ZD();

                  while (var24.hasNext()) {
                     Xz0 var28 = (Xz0)var24.next();
                     nv0_0.Uu0(var21, var5, var28, var7.Y40);
                  }

                  I2 var22 = var5.ZD();

                  while (var22.hasNext()) {
                     BM var25;
                     BM var161 = var25 = (BM)var22.next();
                     int var29 = var7.wp0.FC0.En(var25.mi);
                     u4_0 var35 = var7.wp0.FC0;
                     Integer var36;
                     int var37;
                     if ((var36 = (Integer)var35.bb.Wk0(var161.mi)) == null) {
                        var37 = -1;
                     } else {
                        var37 = var36;
                     }

                     u4_0 var42 = var7.wp0.FC0;
                     Texture var43 = (Texture)var42.QR.Wk0(var25.mi);
                     if (var29 >= 0 && var37 >= 0) {
                        String var26 = var25.mi;
                        Runnable var30 = () -> IR(var25, var7.wp0, var29, var37);
                        kf0_1 var46 = new kf0_1(var26, var43, var30);

                        var19.hx.add(var46);
                     }
                  }
                  continue label200;
               }

                var27 = (Ou0)var23.next();
               ly0_0 var31 = var27.Mp0;
               if (var31.dL(var21.er0)) {
                  break;
               }

               var12 = 0.0F;
               var13 = false;
               float var14 = var21.er0.x;
               float var15 = var31.jG0.x;
               if (var21.er0.x <= var31.jG0.x) {
                  C8 var16 = var21.Vq;
                  float var17 = var21.Vq.x;
                  if (var21.Vq.x > 0.0F && (var14 = (var15 - var14) / var17) >= 0.0F) {
                     C8 var143 = R30.VD0;
                     C8 var61;
                     C8 var162 = var61 = R30.VD0;
                     var61.getClass();
                     float var80 = var16.x;
                     var17 = var16.y;
                     float var18 = var16.z;
                     var61.x = var80;
                     var61.y = var17;
                     var61.z = var18;
                     C8 var163 = var162.Fg0(var14);
                     float var81 = var21.er0.x;
                     var17 = var21.er0.y;
                     var18 = var21.er0.z;
                     var163.na(var81, var17, var18);
                     float var82;
                     float var144 = var82 = var143.y;
                     C8 var111 = var31.jG0;
                     if (var144 >= var31.jG0.y) {
                        var16 = var31.Xa0;
                        if (var82 <= var31.Xa0.y && (var15 = var61.z) >= var111.z && var15 <= var16.z) {
                            var13 = true;
                           var12 = var14;
                        }
                     }
                  }
               }

               var14 = var21.er0.x;
               var15 = var31.Xa0.x;
               if (var21.er0.x >= var31.Xa0.x) {
                  C8 var84 = var21.Vq;
                  float var112 = var21.Vq.x;
                  if (var21.Vq.x < 0.0F && (var14 = (var15 - var14) / var112) >= 0.0F) {
                     C8 var146 = R30.VD0;
                     C8 var64;
                     C8 var164 = var64 = R30.VD0;
                     var64.getClass();
                     float var85 = var84.x;
                     var112 = var84.y;
                     float var133 = var84.z;
                     var64.x = var85;
                     var64.y = var112;
                     var64.z = var133;
                     C8 var165 = var164.Fg0(var14);
                     float var86 = var21.er0.x;
                     var112 = var21.er0.y;
                     var133 = var21.er0.z;
                     var165.na(var86, var112, var133);
                     float var87;
                     float var147 = var87 = var146.y;
                     C8 var115 = var31.jG0;
                     if (var147 >= var31.jG0.y) {
                        var84 = var31.Xa0;
                        if (var87 <= var31.Xa0.y && (var15 = var64.z) >= var115.z && var15 <= var84.z && (!var13 || var14 < var12)) {
                            var13 = true;
                           var12 = var14;
                        }
                     }
                  }
               }

               var14 = var21.er0.y;
               var15 = var31.jG0.y;
               if (var21.er0.y <= var31.jG0.y) {
                  C8 var89 = var21.Vq;
                  float var116 = var21.Vq.y;
                  if (var21.Vq.y > 0.0F && (var14 = (var15 - var14) / var116) >= 0.0F) {
                     C8 var149 = R30.VD0;
                     C8 var67;
                     C8 var166 = var67 = R30.VD0;
                     var67.getClass();
                     float var90 = var89.x;
                     var116 = var89.y;
                     float var135 = var89.z;
                     var67.x = var90;
                     var67.y = var116;
                     var67.z = var135;
                     C8 var167 = var166.Fg0(var14);
                     float var91 = var21.er0.x;
                     var116 = var21.er0.y;
                     var135 = var21.er0.z;
                     var167.na(var91, var116, var135);
                     float var92;
                     float var150 = var92 = var149.x;
                     C8 var119 = var31.jG0;
                     if (var150 >= var31.jG0.x) {
                        var89 = var31.Xa0;
                        if (var92 <= var31.Xa0.x && (var15 = var67.z) >= var119.z && var15 <= var89.z && (!var13 || var14 < var12)) {
                            var13 = true;
                           var12 = var14;
                        }
                     }
                  }
               }

               var14 = var21.er0.y;
               var15 = var31.Xa0.y;
               if (var21.er0.y >= var31.Xa0.y) {
                  C8 var94 = var21.Vq;
                  float var120 = var21.Vq.y;
                  if (var21.Vq.y < 0.0F && (var14 = (var15 - var14) / var120) >= 0.0F) {
                     C8 var152 = R30.VD0;
                     C8 var70;
                     C8 var168 = var70 = R30.VD0;
                     var70.getClass();
                     float var95 = var94.x;
                     var120 = var94.y;
                     float var137 = var94.z;
                     var70.x = var95;
                     var70.y = var120;
                     var70.z = var137;
                     C8 var169 = var168.Fg0(var14);
                     float var96 = var21.er0.x;
                     var120 = var21.er0.y;
                     var137 = var21.er0.z;
                     var169.na(var96, var120, var137);
                     float var97;
                     float var153 = var97 = var152.x;
                     C8 var123 = var31.jG0;
                     if (var153 >= var31.jG0.x) {
                        var94 = var31.Xa0;
                        if (var97 <= var31.Xa0.x && (var15 = var70.z) >= var123.z && var15 <= var94.z && (!var13 || var14 < var12)) {
                            var13 = true;
                           var12 = var14;
                        }
                     }
                  }
               }

               var14 = var21.er0.z;
               var15 = var31.jG0.z;
               if (var21.er0.z <= var31.jG0.z) {
                  C8 var99 = var21.Vq;
                  float var124 = var21.Vq.z;
                  if (var21.Vq.z > 0.0F && (var14 = (var15 - var14) / var124) >= 0.0F) {
                     C8 var155 = R30.VD0;
                     C8 var73;
                     C8 var170 = var73 = R30.VD0;
                     var73.getClass();
                     float var100 = var99.x;
                     var124 = var99.y;
                     float var139 = var99.z;
                     var73.x = var100;
                     var73.y = var124;
                     var73.z = var139;
                     C8 var171 = var170.Fg0(var14);
                     float var101 = var21.er0.x;
                     var124 = var21.er0.y;
                     var139 = var21.er0.z;
                     var171.na(var101, var124, var139);
                     float var102;
                     float var156 = var102 = var155.x;
                     C8 var127 = var31.jG0;
                     if (var156 >= var31.jG0.x) {
                        var99 = var31.Xa0;
                        if (var102 <= var31.Xa0.x && (var15 = var73.y) >= var127.y && var15 <= var99.y && (!var13 || var14 < var12)) {
                            var13 = true;
                           var12 = var14;
                        }
                     }
                  }
               }

               var14 = var21.er0.z;
               var15 = var31.Xa0.z;
               if (var21.er0.z >= var31.Xa0.z) {
                  C8 var104 = var21.Vq;
                  float var128 = var21.Vq.z;
                  if (var21.Vq.z < 0.0F && (var14 = (var15 - var14) / var128) >= 0.0F) {
                     C8 var158 = R30.VD0;
                     C8 var76;
                     C8 var172 = var76 = R30.VD0;
                     var76.getClass();
                     float var105 = var104.x;
                     var128 = var104.y;
                     float var141 = var104.z;
                     var76.x = var105;
                     var76.y = var128;
                     var76.z = var141;
                     C8 var173 = var172.Fg0(var14);
                     float var106 = var21.er0.x;
                     var128 = var21.er0.y;
                     var141 = var21.er0.z;
                     var173.na(var106, var128, var141);
                     float var107;
                     float var159 = var107 = var158.x;
                     C8 var131 = var31.jG0;
                     C8 var32;
                     if (var159 >= var31.jG0.x
                        && var107 <= (var32 = var31.Xa0).x
                        && (var15 = var76.y) >= var131.y
                        && var15 <= var32.y
                        && (!var13 || var14 < var12)) {
                        break;
                     }
                  }
               }
            } while (!var13);

            final nv0_0 currentNode = var7;
            Object[] var33 = currentNode.wp0.Y3.rZ;
            int var39 = currentNode.wp0.Y3.KB;
            var5.G6(var33, 0, var39);
            I2 var34 = var5.ZD();

            while (var34.hasNext()) {
               BM var40;
               BM var160 = var40 = (BM)var34.next();
               int var13Index = currentNode.wp0.FC0.En(var40.mi);
               u4_0 var58 = currentNode.wp0.FC0;
               Integer var59;
               int var60;
               if ((var59 = (Integer)var58.bb.Wk0(var160.mi)) == null) {
                  var60 = -1;
               } else {
                  var60 = var59;
               }

               u4_0 var78 = currentNode.wp0.FC0;
               Texture var79 = (Texture)var78.QR.Wk0(var40.mi);
               if (var13Index >= 0 && var60 >= 0) {
                  String var41 = var40.mi;
                  Runnable var45 = () -> GQ(var40, currentNode, var13Index, var60);
                  kf0_1 var108 = new kf0_1(var41, var79, var45);

                  var19.hx.add(var108);
               }
            }
         }
      }

      if (var19.hx.size() > 0) {
         UA.rL(var19, this, var3, var4);
      }
   }

   public final void da0(ry_0 var1, CH0 var2, byte var3) {
      j20 var4 = this.uw0;
      if (this.uw0 != null) {
         var4.xe0();
         this.uw0 = null;
         RT var6;
         if ((var6 = this.s2) != null) {
            lpt6__0.v90(var6.o20());
         }
      } else if (var1 != null) {
         (this.uw0 = new j20(var1, var3, (Qy0) this, var2)).lt0();
         j20 var5 = this.uw0;
         this.F9(this.fU(), var5);
      }
   }

   public final void Bg() {
      QC var1 = this.sj0;
      if (this.sj0 != null) {
         var1.xe0();
      }

      QC var10007 = var1 = new QC((Qy0) this);

      this.sj0 = var10007;
      this.F9(this.fU(), var1);
      this.sj0.lt0();
      this.sj0.E40(this.Bc0.ew0() / 2 - this.sj0.Mx / 2, this.Bc0.Hv0() / 2 - this.sj0.OB / 2);
      this.sj0.Ll(true);
      lpt6__0.v90(this.sj0);
   }

   public final void wT() {
      mf_1 var1 = this.zn0;
      if (this.zn0 != null) {
         var1.xe0();
      }

      mf_1 var10006 = var1 = new mf_1();

      this.zn0 = var10006;
      this.F9(this.fU(), var1);
      this.zn0.lt0();
      this.zn0.E40(this.Bc0.ew0() / 2 - this.zn0.Mx / 2, this.Bc0.Hv0() / 2 - this.zn0.OB / 2);
      this.zn0.Ll(true);
   }

   public final void BE(og0_2 var1) {
      m1_0 var2 = this.Uu;
      if (this.Uu != null) {
         if (var2 != null) {
            var2.xe0();
            this.Uu = null;
         }
      } else {
         m1_0 var3;
         DesktopClientRootHost var10000;
         DesktopClientRootHost var10001;
         if (var1 == null) {
            var10000 = this;
            var10001 = this;
            m1_0 var10003 = var3 = new m1_0(false);

            this.Uu = var10003;
         } else {
            var10000 = this;
            var10001 = this;
            m1_0 var4 = var3 = new m1_0(true);

            this.Uu = var4;
         }

         var10000.F9(var10001.fU(), var3);
         this.Uu.RY(400, 175);
         this.Uu.lt0();
         this.Uu.vf(pa0_0.Ol);
      }
   }

   @Override
   public final boolean u3(le0_2 var1) {
      if (var1 == this.G30) {
         this.G30 = null;
      } else if (var1 == this.Ur0) {
         this.Ur0 = null;
      } else if (var1 == this.yr0) {
         this.yr0 = null;
      } else if (var1 == this.Sk) {
         this.Sk = null;
      } else if (var1 == this.E90) {
         this.E90 = null;
      } else if (var1 == this.TG0) {
         this.TG0 = null;
      } else if (var1 == this.s2) {
         this.s2 = null;
      } else if (var1 == this.zK0) {
         this.zK0 = null;
      } else if (var1 == this.ez0) {
         this.ez0 = null;
      } else if (var1 == this.ZW) {
         this.ZW = null;
      } else if (var1 == this.hl0) {
         this.hl0 = null;
      } else if (var1 == this.sj0) {
         this.sj0 = null;
      } else if (var1 == this.yY) {
         this.yY = null;
      } else if (var1 == this.zn0) {
         this.zn0 = null;
      } else if (var1 == this.ZK0) {
         this.ZK0 = null;
      } else if (var1 instanceof iw_1) {
         pk0_0 var10000 = this.K1;
         iw_1 var2 = (iw_1)var1;
         this.K1.lpT1.sj0(var2, true);
         var10000.KH = System.currentTimeMillis();
      } else if (var1 instanceof ox_0) {
         this.Nv0.remove(var1);
      } else if (var1 == this.fv) {
         this.fv = null;
      } else if (var1 == this.Ba0) {
         this.Ba0 = null;
      }

      return super.u3(var1);
   }

   public final void jE(String var1) {
      this.dk(-1, var1);
   }

   public final void e80(String var1, Runnable var2) {
      bu0_0 var3 = this.yr0;
      if (this.yr0 != null) {
         var3.xe0();
      }

      bu0_0 var10004 = var3 = new bu0_0(var1);

      this.yr0 = var3;
      var10004.hG0 = var2;
      this.F9(this.fU(), var3);
      this.Qw0(this.yr0);
   }

   public final void dN(CH0 var1) {
      this.aS.removeIf(item -> qp0(var1, (oi0_0)item));
      if (!this.aS.isEmpty()) {
         oi0_0 var6 = (oi0_0)this.aS.get(0);
         le0_2 var10000;
         label27: {
            Class<oi0_0> var2 = oi0_0.class;
            KU var3 = super.t30;
            if (super.t30 != null) {
               le0_2[] var7 = (le0_2[])var3.pa();
               int var4 = 0;

               for (int var5 = super.t30.KB; var4 < var5; var4++) {
                  if (var7[var4].getClass().isAssignableFrom(var2)) {
                     super.t30.Gj0();
                     var10000 = var7[var4];
                     break label27;
                  }
               }

               super.t30.Gj0();
            }

            var10000 = null;
         }

         if (var10000 == null) {
            this.F9(this.fU(), var6);
            this.Qw0(var6);
         }
      }
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @Override
   public final void K8() {
      tl_1 var1 = this.S;
      if (this.S != null) {
         var1.lt0();
         pa0_0 var13 = pa0_0.Mk;
         this.S.vf(pa0_0.Mk);
         if (tw0_0.kz0()) {
            this.S.A20(pa0_0.rr0, 0, 0);
         } else {
            this.S.vf(var13);
         }
      }

      cn_0 var14 = this.aX;
      if (this.aX != null) {
         var14.lt0();
         if (tw0_0.kz0()) {
            this.aX.A20(pa0_0.Mk, -150, this.S.OB + 60);
         } else {
            this.aX.A20(pa0_0.Mk, 0, this.S.OB);
         }
      }

      ia0_1 var15 = this.ae;
      if (this.ae != null && var15.eE) {
         var15.lt0();
         this.ae.A20(pa0_0.Mk, -5, 5);
      }

      BU var16 = this.zK0;
      if (this.zK0 != null && var16.oY(this.Bc0.ew0(), this.Bc0.Hv0())) {
         this.zK0.V80();
      }

      ML0 var17 = this.ZW;
      if (this.ZW != null) {
         var17.oY(this.Bc0.ew0(), this.Bc0.Hv0());
      }

      I30 var18 = this.ez0;
      if (this.ez0 != null) {
         var18.oY(this.Bc0.ew0(), this.Bc0.Hv0());
      }

      mr0 var19 = this.TG0;
      if (this.TG0 != null) {
         var19.oY(400, 500);
         mr0 var10000 = this.TG0;
         int var20 = super.A20 + super.e80;
         int var10001 = kq_0.lpT2(this.a3(), this.TG0.Mx, 2, var20);
         int var21 = super.SB0 + super.y9;
         var10000.E40(var10001, kq_0.lpT2(this.k5(), this.TG0.OB, 2, var21));
      }

      LPt2_ var22 = this.G30;
      if (this.G30 != null) {
         var22.oY(this.Bc0.ew0(), this.Bc0.Hv0());
         this.G30.E40(0, 0);
      }

      re_1 var23 = this.Ur0;
      if (this.Ur0 != null) {
         var23.oY(this.Bc0.ew0(), this.Bc0.Hv0());
         re_1 var49 = this.Ur0;
         int var24 = super.A20 + super.e80;
         int var58 = kq_0.lpT2(this.a3(), this.Ur0.Mx, 2, var24);
         int var25 = super.SB0 + super.y9;
         var49.E40(var58, kq_0.lpT2(this.k5(), this.Ur0.OB, 2, var25));
      }

      p00_0 var26 = this.nd;
      if (this.nd != null) {
         var26.oY(this.Bc0.ew0(), this.Bc0.Hv0());
         p00_0 var50 = this.nd;
         int var27 = super.A20 + super.e80;
         int var59 = kq_0.lpT2(this.a3(), this.nd.Mx, 2, var27);
         int var28 = super.SB0 + super.y9;
         var50.E40(var59, kq_0.lpT2(this.k5(), this.nd.OB, 2, var28));
      }

      bu0_0 var29 = this.yr0;
      if (this.yr0 != null) {
         var29.oY(400, 500);
         bu0_0 var51 = this.yr0;
         int var30 = super.A20 + super.e80;
         int var60 = kq_0.lpT2(this.a3(), this.yr0.Mx, 2, var30);
         int var31 = super.SB0 + super.y9;
         var51.E40(var60, kq_0.lpT2(this.k5(), this.yr0.OB, 2, var31));
      }

      I2 var32 = this.K1.lpT1.ZD();

      while (var32.hasNext()) {
         ((iw_1)var32.next()).lt0();
      }

      pk0_0 var33 = this.K1;
      if (this.K1 != null) {
         var33.lt0();
      }

      int var34 = 100;

      try {
         Iterator<?> iterator = this.Nv0.iterator();
         while (iterator.hasNext()) {
            ox_0 widget = (ox_0)iterator.next();
            widget.lt0();
            int x = super.A20 + super.e80 + (this.a3() - widget.Mx) / 2;
            int y = this.VM() - widget.OB - var34;
            widget.E40(x, y);
            var34 += widget.OB + 5;
         }
      } catch (ConcurrentModificationException ex) {
         Gl0.info("error", ex);
      }

      RT var35 = this.s2;
      if (this.s2 != null) {
         var35.oY(this.Bc0.ew0(), this.Bc0.Hv0());
         RT var56 = this.s2;
         int var36 = super.A20 + super.e80;
         int var62 = kq_0.lpT2(this.a3(), this.s2.Mx, 2, var36);
         int var37 = super.SB0 + super.y9;
         var56.E40(var62, kq_0.lpT2(this.k5(), this.s2.OB, 2, var37));
      }

      n60_0 var38 = this.fv;
      if (this.fv != null) {
         var38.oY(this.Bc0.ew0(), this.Bc0.Hv0());
         n60_0 var57 = this.fv;
         int var39 = super.A20 + super.e80;
         int var63 = kq_0.lpT2(this.a3(), this.fv.Mx, 2, var39);
         int var40 = super.SB0 + super.y9;
         var57.E40(var63, kq_0.lpT2(this.k5(), this.fv.OB, 2, var40));
      }

      o4 var41 = this.hl0;
      if (this.hl0 != null) {
         var41.kh0();
         this.hl0.vf(pa0_0.Ol);
      }

      QC var42 = this.sj0;
      if (this.sj0 != null) {
         var42.lt0();
      }

      pj0_2 var43 = this.yY;
      if (this.yY != null) {
         var43.lt0();
         this.yY.E40(this.Bc0.ew0() / 2 - this.yY.Mx / 2, this.Bc0.Hv0() / 2 - this.yY.OB / 2);
      }

      mf_1 var44 = this.zn0;
      if (this.zn0 != null) {
         var44.lt0();
         this.zn0.E40(this.Bc0.ew0() / 2 - this.zn0.Mx / 2, this.Bc0.Hv0() / 2 - this.zn0.OB / 2);
      }

      ro_2 var45 = this.ZK0;
      if (this.ZK0 != null) {
         var45.lt0();
         this.ZK0.E40(this.Bc0.ew0() / 2 - this.ZK0.Mx / 2, this.Bc0.Hv0() / 2 - this.ZK0.OB / 2);
      }

      tj0_0 var46 = this.N00;
      if (this.N00 != null) {
         var46.oY(this.Bc0.ew0(), this.Bc0.Hv0());
         this.N00.E40(0, 0);
      }

      zy0_0 var47 = this.Tx;
      if (this.Tx != null) {
         var47.oY(this.Bc0.ew0(), this.Tx.KC0());
         zy0_0 var48 = this.Tx;
         if (this.Tx.eE) {
            lpt6__0.v90(var48.Ke0);
         }
      }

      super.K8();
   }

   public final BU MK() {
      return this.zK0;
   }

   public final void TW(boolean var1) {
      lg_0.k.lPT5(new IL0((Qy0) this, var1));
   }

   public final void tb0() {
      if (tw0_0.Ro0.yy0()) {
         String var1 = sm0_0.c0(nf0_0.Sc);
         Qy0 var10000 = yI0;
         az_1 var2;
         var2 = new az_1((Qy0) this);
         var10000.sr0(new lpt3__4(var1, var2, null));
      }
   }

   public final void r10() {
      zy0_0 var1;
      zy0_0 var10006 = var1 = new zy0_0();

      this.Tx = var10006;
      this.F9(this.fU(), var1);
      this.Tx.E40(0, 0);
      zy0_0 var2 = this.Tx;
      var2.z70 = new N1(new t5_0(var2), gn_0.WHITE);
      this.Tx.Ll(false);
   }

   public final void zm0() {
      E20 var1 = this.om0;
      if (this.om0 != null && var1.eE) {
         var1.Ll(false);
         E20 var2;
         if (this.zY.K20 != (var2 = this.om0)) {
            var2.em();
         }
      }
   }

   public final void vk(le0_2 var1, Object var2, pa0_0 var3) {
      int var4 = var1.A20;
      var4 = var1.Mx / 2 + var4;
      int var5 = var1.SB0;
      if (var2 == null) {
         this.zm0();
      } else {
         if (var2 instanceof String) {
            String var8;
            if ((var8 = (String)var2).length() == 0) {
               this.zm0();
               return;
            }

            E20 var6 = this.om0;
            if (this.zY.K20 != this.om0) {
               var6.em();
               cn_0 var13 = this.zY;
               this.om0.F9(this.om0.fU(), var13);
            }

            cn_0 var10000 = this.zY;
            this.zY.Jj0 = null;
            var10000.Sk(var8);
         } else {
            le0_2 var9;
            if (var2 instanceof le0_2) {
               le0_2 var14;
               if ((var14 = (var9 = (le0_2)var2).K20) != null && var14 != this.om0) {
                  this.zm0();
                  return;
               }
            } else {
               if (!(var2 instanceof Supplier)) {
                  throw new IllegalArgumentException("Unsupported data type");
               }

               le0_2 var15;
               if ((var15 = (var9 = (le0_2)((Supplier)var2).get()).K20) != null && var15 != this.om0) {
                  this.zm0();
                  return;
               }
            }

            this.om0.em();
            this.om0.F9(this.om0.fU(), var9);
         }

         this.om0.lt0();
         int var10 = this.om0.Mx;
         int var16 = this.om0.OB;
         switch (var3.ordinal()) {
            case 1:
            case 3:
            case 4:
               var4 -= var10 / 2;
               break;
            case 2:
            case 6:
            case 8:
               var4 -= var10;
            case 5:
            case 7:
         }

         switch (var3.ordinal()) {
            case 0:
            case 1:
            case 2:
               var5 -= var16 / 2;
            case 3:
            case 5:
            case 6:
            default:
               break;
            case 4:
            case 7:
            case 8:
               var5 -= var16;
         }

         int var11;
         int var17 = var11 = var1.Xg0() + var4;
         int var7 = var1.R90() + var5;
         if (var17 + var10 > super.Em0.Mx) {
            var11 = super.Em0.Mx - var10;
         }

         if (var7 + var16 > super.Em0.OB) {
            var7 = super.Em0.OB - var16;
         }

         if (var11 < 0) {
            var11 = 0;
         }

         if (var7 < 0) {
            var7 = 0;
         }

         this.om0.E40(var11, var7);
         this.om0.Ll(true);
         lg_0.k.lPT5(() -> this.Qw0(this.om0));
      }
   }

   @Override
   public final void HP(zk0_1 var1) {
      ff_0 var2 = null;
      if (lpt3__1.Ha0) {
         vo_2 var3 = this.Bc0.Sc;
         if (this.Bc0.Sc != null) {
            var2 = var3.Fq0();
         }

         Oz0 var25 = this.Bc0.he0;
         if (this.Bc0.he0 != null && var25 instanceof vr_1) {
            var2 = ((vr_1)var25).OB0;
         }

         if (this.yB0 + 1000000000L < System.nanoTime()) {
            if (var2 != null) {
               this.Hn[0] = var2.ig;
               this.Hn[1] = var2.COm2;
               var2.COm2 = 0;
               var2.ig = 0;
            }

            long var26 = System.nanoTime();
            this.yB0 = var26;
         }
      }

      if (tw0_0.kz0()) {
         if (this.y4()) {
            le0_2 var27 = this.qL;
            if (this.qL != null) {
               var27.Ll(false);
            }

            var27 = this.be;
            if (this.be != null) {
               var27.Ll(false);
            }
         } else {
            le0_2 var29 = this.qL;
            if (this.qL != null) {
               var29.Ll(true);
            }

            var29 = this.be;
            if (this.be != null) {
               var29.Ll(true);
            }
         }
      }

      if (dw_2.b00) {
         this.aX.Ll(false);
      }

      super.HP(var1);
      if (dw_2.b00) {
         this.aX.Ll(true);
         cn_0 var31 = this.aX;
         N1 var4 = this.aX.z70;
         if (this.aX.z70 != null && var4.LpT8) {
            var31.Zo0(var1);
         } else if (var31.IM) {
            var31.U10(var1);
         } else {
            var31.HP(var1);
         }
      }

      if (this.A90 + 500000000L <= System.nanoTime()) {
         long var32 = System.nanoTime();
         this.A90 = var32;
         if (this.qL != null) {
            byte var15 = 100;
            if (100 != this.Fc) {
               this.Fc = var15;
               int var16;
               if ((var16 = Math.round(var15 / 10.0F) * 10) < 10) {
                  var16 = 10;
               }

               this.qL.kx0("mobile-battery-" + var16);
            }
         }

         if (!lpt3__1.FQ) {
            if (!this.aX.j50.toString().isEmpty()) {
               this.aX.Sk("");
            }
         } else {
            var32 = Long.MAX_VALUE;
            long var5 = 0L;
            long var7 = 0L;
            long[] var17 = jn_0.Io;
            int var9 = jn_0.Io.length;

            for (int var10 = 0; var10 < var9; var10++) {
               long var11;
               if ((var11 = var17[var10]) < var32) {
                  var32 = var11;
               }

               if (var11 > var5) {
                  var5 = var11;
               }

               var7 += var11;
               if (var11 == 0L) {
                  return;
               }
            }

            var7 /= jn_0.Io.length;
            if (jn_0.TJ != null) {
               double var34;
               this.aX
                  .Sk(
                     "min / max / avg / lst\n"
                        + this.cF0.format((float)var32 / 1000000.0F)
                        + " / "
                        + this.cF0.format((float)var5 / 1000000.0F)
                        + " / "
                        + this.cF0.format(var34 = (float)var7 / 1000000.0F)
                        + " / "
                        + this.cF0.format(var34)
                  );
               String var18 = this.aX.j50.toString() + "\n\n";
               Iterator var35 = jn_0.TJ.entrySet().iterator();

               while (var35.hasNext()) {
                  long[] var6;
                  Entry var40;
                  Uy0 var44;
                  int var49 = (var6 = (var44 = (Uy0)(var40 = (Entry)var35.next()).getValue()).Fw).length;

                  for (int var8 = 0; var8 < var49; var8++) {
                     float var50;
                     if ((var50 = (float)var6[var8]) < var44.RI0) {
                        var44.RI0 = var50;
                     }

                     if (var50 > var44.xH0) {
                        var44.xH0 = var50;
                     }

                     var44.Np0 += var50;
                  }

                  var44.RI0 /= 1000000.0F;
                  var44.xH0 /= 1000000.0F;
                  var44.Np0 = var44.Np0 / var44.Fw.length / 1000000.0F;
                  if (((Uy0)var40.getValue()).Np0 > 0.01) {
                     var18 = var18 + (String)var40.getKey() + " = " + var40.getValue() + "\n";
                     if (((Uy0)var40.getValue()).ir0 > 0.0F || ((Uy0)var40.getValue()).p30 > 0) {
                        var18 = AN.nK0(var18, "- Vertex count ")
                           .append(this.DG.format(((Uy0)var40.getValue()).ir0))
                           .append("\n- Render calls ")
                           .append(this.DG.format(((Uy0)var40.getValue()).p30))
                           .append("\n- Texture binds ")
                           .append(this.DG.format(((Uy0)var40.getValue()).Ml))
                           .append("\n- Shader binds ")
                           .append(this.DG.format(((Uy0)var40.getValue()).th))
                           .append("\n\n")
                           .toString();
                     }
                  }
               }

               cn_0 var19 = this.aX;
               StringBuilder var36 = AN.nK0(var18, "\n- Vertex count ")
                  .append(this.DG.format(tw0_0.t30.ax0.bH.LG))
                  .append("\n- Render calls ")
                  .append(this.DG.format(tw0_0.t30.ax0.B1))
                  .append("\n- Texture Binds ")
                  .append(this.DG.format(tw0_0.t30.ax0.tA))
                  .append("\n- Shader Binds ")
                  .append(this.DG.format(tw0_0.t30.ax0.BJ0))
                  .append("\n- GL Calls ")
                  .append(this.DG.format(tw0_0.t30.ax0.lf));
               String var13;
               if (var2 == null) {
                  var13 = "";
               } else {
                  StringBuilder var41 = new StringBuilder("\n\nParticle System:\n- Effects: ").append(var2.j8.KB).append("\n- Batches: ");
                  int var45 = 0;
                  I2 var47 = var2.j8.ZD();

                  while (var47.hasNext()) {
                     var45 += ((ParticleEffectExt)var47.next()).getBatchSize();
                  }

                  StringBuilder var20 = var41.append(var45).append("\n- Billboards: ");
                  int var42 = 0;
                  I2 var46 = var2.j8.ZD();

                  while (var46.hasNext()) {
                     var42 += ((ParticleEffectExt)var46.next()).getBatchBufferedCount();
                  }

                  var13 = var20.append(var42)
                     .append("\n- Updates: ")
                     .append(this.Hn[0])
                     .append("/s\n- PhysicsUpdates: ")
                     .append(this.Hn[1])
                     .append("/s")
                     .toString();
               }

               StringBuilder var14 = var36.append(var13);
               jn_0 var21 = tw0_0.LD0;
               IC0 var37 = tw0_0.LD0.BK;
               XD var22;
               if (tw0_0.LD0.BK != null) {
                  var22 = var37.Bi;
               } else {
                  var22 = var21.no0;
               }

               String var24;
               if (var22 != null) {
                  StringBuilder var23;
                  var23 = new StringBuilder("\nFrame: ");
                  jn_0 var38 = tw0_0.LD0;
                  IC0 var43 = tw0_0.LD0.BK;
                  XD var39;
                  if (tw0_0.LD0.BK != null) {
                     var39 = var43.Bi;
                  } else {
                     var39 = var38.no0;
                  }

                  var24 = var23.append(var39.hc0).toString();
               } else {
                  var24 = "";
               }

               var19.Sk(var14.append(var24).toString());
            } else {
               this.aX
                  .Sk(
                     this.cF0.format((float)var32 / 1000000.0F)
                        + " / "
                        + this.cF0.format((float)var5 / 1000000.0F)
                        + " / "
                        + this.cF0.format((float)var7 / 1000000.0F)
                        + " min/max/avg"
                  );
            }
         }
      }
   }

   @Override
   public final void Qw0(le0_2 var1) {
      super.Qw0(var1);
      var1 = this.om0;
      if (var1 != this.om0 && var1.eE) {
         super.Qw0(var1);
      }
   }

   public final void eU(int var1, int var2, String var3) {
      lg_0.k.lPT5(() -> this.pe(var3, var1, var2));
   }

   public final void dk(int var1, String var2) {
      ox_0 var3;
      var3 = new ox_0((Qy0) this, var2.trim(), var1);
      this.Nv0.add(var3);
      this.F9(this.fU(), var3);
      this.Qw0(var3);
   }

   public final void Ni0(Vt0 var1) {
      at_0 var3;
      var3 = new at_0(sm0_0.c0(2800), new XJ((Qy0) this));
      var1.hx.add(var3);
      Vt0 var2;
      Vt0 var7 = var2 = new Vt0(sm0_0.c0(2810));

      at_0 var4;
      var4 = new at_0(sm0_0.c0(23000), new KP());
      var7.hx.add(var4);
      at_0 var5;
      var5 = new at_0(sm0_0.c0(23001), new YH0());
      var7.hx.add(var5);
      at_0 var6;
      var6 = new at_0(sm0_0.c0(nf0_0.Po), new w4_0());
      var7.hx.add(var6);
      var1.hx.add(var2);
   }

   public final Vt0 QK(E90 var1, String var2, int var3, int var4, boolean var5) {
      Vt0 v6 = var1 == null ? new Vt0(var2) : new ps_1(var1, var2);
      if (var1 != null && tw0_0.e60.jB0.pu.equals(var1.pu)) {
         this.Ni0(v6);
         return v6;
      }

      // 1. 初始化各种菜单项的对象及其对应的文本
      at_0 v7 = new at_0(sm0_0.c0(2250)); // Move 文本
      at_0 v8 = new at_0(sm0_0.c0(2251)); // Trade 文本
      at_0 v9 = new at_0(sm0_0.c0(2259)); // Follow 文本
      at_0 v10 = new at_0(sm0_0.c0(2252)); // Inspect 文本

      tw0_0.rl.q50.getClass();
      String lowerName = var2.toLowerCase(Locale.ENGLISH);
      GR v14_temp = null;
      Iterator<?> names = tw0_0.rl.q50.lx.values().iterator();
      while (names.hasNext()) {
         GR candidate = (GR) names.next(); // 强制类型转换
         if (candidate.QB0.DR.toLowerCase(Locale.ENGLISH).equals(lowerName)) {
            v14_temp = candidate;
            break;
         }
      }

      at_0 v11 = new at_0(v14_temp != null ? sm0_0.c0(2254) : sm0_0.c0(2253)); // Move To 文本
      at_0 v12 = new at_0(sm0_0.c0(2255)); // Mute Channel 文本
      at_0 v13 = new at_0(sm0_0.c0(2257)); // Player Info 文本
      at_0 v14 = new at_0(sm0_0.c0(2258)); // Server Info 文本
      at_0 v15 = new at_0(sm0_0.c0(2261)); // Close 文本

      // 2. 核心问题所在：由于字节码中的堆栈错位，事件被绑定到了错误的对象上
      v7.eu0 = () -> this.JW(var5, var2, var3, var4); // 正常绑定: Move -> JW
      v8.eu0 = () -> this.Kl(var2);                   // 正常绑定: Trade -> Kl
      v9.eu0 = () -> this.lM(var2);                   // 正常绑定: Follow -> lM

      // ================= 开始张冠李戴 =================
      v11.eu0 = () -> this.fT(var2);                  // 错乱：Move To (2253/2254) 绑定了 Inspect 的动作 (fT)
      v12.eu0 = () -> m90(var2);                      // 错乱：Mute Channel (2255) 绑定了 Move To 的动作 (m90)
      v10.eu0 = () -> Ql(var2);                       // 错乱：Inspect (2252) 绑定了 Action 的动作 (Ql)
      v14.eu0 = () -> nu(var2);                       // 错乱：Server Info (2258) 绑定了 Mute Channel 的动作 (nu)
      // ================= 错乱结束 ===================

      v15.eu0 = () -> Ps(var2);                       // 正常绑定: Close -> Ps

      // 3. 获取玩家状态（注：原字节码甚至复用了局部变量槽，这里用清晰的命名还原逻辑）
      E90 this_player = tw0_0.e60.xA(var2);
      boolean isSpecialRole = false;
      if (this_player != null) {
         if (this_player.wq0 == RL0.Com5 || this_player.wq0 == RL0.YC) {
            isSpecialRole = true;
         }
      }

      v13.eu0 = () -> gD(this_player);                // 正常绑定: Player Info -> gD

      // 4. 将被弄乱的按钮按条件加进菜单
      if (this_player != null) {
         if (isSpecialRole) {
            v7 = v13; // 特殊角色将原本的 Move 按钮替换为 Player Info
         }
         v6.hx.add(v7);
      }

      v6.hx.add(v8);

      if (this_player == null || !this_player.pu.equals(tw0_0.e60.dj0)) {
         v6.hx.add(v9);
      }

      // 检查并添加那个被错绑定了 Action 逻辑的 "Inspect (v10)"
      if (this_player != null && tw0_0.rl != null) {
         if (tw0_0.rl.u40.K6 || tw0_0.rl.PC0.Jn0.FL0) {
            v6.hx.add(v10);
         }
      }

      // 频道检查，若找不到则添加被错绑定了 Mute Channel 逻辑的 "Server Info (v14)"
      if (tw0_0.rl != null) {
         si_0 v7_si0 = null;
         if (tw0_0.rl.gd0 != null) {
            for (si_0 channel : tw0_0.rl.gd0.yJ()) {
               if (channel.KY.DR.equals(var2)) {
                  v7_si0 = channel;
                  break;
               }
            }
            if (v7_si0 == null) {
               v6.hx.add(v14);
            }
         } else {
            v6.hx.add(v14);
         }
      }

      v6.hx.add(v11); // 添加那个被错绑定了 Inspect 逻辑的 "Move To (v11)"

      if (var1 == null || var1.fH0 == 0) {
         v6.hx.add(v12); // 添加那个被错绑定了 Move To 逻辑的 "Mute Channel (v12)"
      }

      v6.hx.add(v15); // 添加 Close

      // 5. Admin 特权菜单（这部分的堆栈是正常的，未受影响）
      if (tw0_0.Eu(1)) {
         Vt0 admin = new Vt0("Admin");
         at_0 info = new at_0("Player Info");
         info.eu0 = () -> hp0(var2);

         v6.hx.add(new _abstract());
         v6.hx.add(admin);
         admin.hx.add(info);

         if (tw0_0.Eu(4)) {
            Vt0 warn = new Vt0("Warn");
            for (IL reason : IL.x90) {
               if (reason != IL.Sp) {
                  warn.mA0(reason.name(), () -> SD0(var2, reason));
               } else {
                  at_0 custom = new at_0(reason.name());
                  custom.eu0 = () -> Uu(var2, reason);
                  warn.hx.add(custom);
               }
            }
            admin.hx.add(warn);

            at_0 mute = new at_0("Mute");
            mute.eu0 = () -> lL(var2);
            admin.hx.add(mute);

            at_0 muteChat = new at_0("Mute Channel");
            muteChat.eu0 = () -> Fh0(var2);
            admin.hx.add(muteChat);

            at_0 acp = new at_0("ACP");
            acp.eu0 = () -> b9(var2);
            v6.hx.add(acp);
         }

         if (tw0_0.Eu(1)) {
            Vt0 setChannel = new Vt0("Set Channel");
            for (zo_0 channel : zo_0.JG) {
               if (channel.g3) {
                  setChannel.mA0(sm0_0.c0(channel.Yf), () -> j(var2, channel));
               }
            }
            Vt0 setLanguage = new Vt0("Set Chat Language");
            for (G50 language : G50.aG) {
               setLanguage.mA0(VG.Mq(new StringBuilder().append(language.return$).append(" ("), language.d0, ")"), () -> Y0(var2, language));
            }
            admin.hx.add(setChannel);
            admin.hx.add(setLanguage);
         }

         if (tw0_0.Eu(5)) {
            at_0 kick = new at_0("Kick");
            kick.eu0 = () -> kf(var2);
            admin.hx.add(kick);

            at_0 teleport = new at_0("Teleport To");
            teleport.eu0 = () -> md0(var2);
            admin.hx.add(teleport);

            at_0 botHunt = new at_0("Bot Hunt");
            botHunt.eu0 = () -> v5(var2);
            admin.hx.add(botHunt);

            at_0 highlight = new at_0(yt_1.l00.Uz0() ? "Highlight" : "Unhighlight");
            highlight.eu0 = () -> Hj(this_player);
            admin.hx.add(highlight);
         }
         v6.hx.add(v15); // 根据字节码，如果能进入 Admin，会再重复添加一次 v15 (Close)
      }
      return v6;
   }

   public final void qi() {
      pj0_2 var1 = this.yY;
      if (this.yY != null) {
         var1.xe0();
      }

      pj0_2 var10006 = var1 = new pj0_2();

      this.yY = var10006;
      this.F9(this.fU(), var1);
      this.yY.lt0();
      this.yY.E40(this.Bc0.ew0() / 2 - this.yY.Mx / 2, this.Bc0.Hv0() / 2 - this.yY.OB / 2);
      this.yY.Ll(true);
   }

   public final void tM() {
      ro_2 var1 = this.ZK0;
      if (this.ZK0 != null) {
         var1.xe0();
      }

      ro_2 var10006 = var1 = new ro_2();

      this.ZK0 = var10006;
      this.F9(this.fU(), var1);
      this.ZK0.lt0();
      this.ZK0.E40(this.Bc0.ew0() / 2 - this.ZK0.Mx / 2, this.Bc0.Hv0() / 2 - this.ZK0.OB / 2);
      this.ZK0.Ll(true);
   }

   public final void sr0(lpt3__4 var1) {
      lpt3__4 var2 = this.Ba0;
      if (this.Ba0 != null) {
         var2.xe0();
      }

      this.Ba0 = var1;
      this.F9(this.fU(), var1);
   }

   public final void kN() {
      I2 var1 = this.K1.lpT1.ZD();

      while (var1.hasNext()) {
         super.u3((iw_1)var1.next());
      }

      pk0_0 var5 = this.K1;
      Fo0 var2 = this.K1.sl;
      if (this.K1.sl != null) {
         var5.u3(var2);
         var5.sl = null;
      }

      var5.iE.clear();
      var5.lpT1.clear();
      var5.em();
      ox_0[] var6 = (ox_0[])this.Nv0.toArray(new ox_0[0]);
      int var9 = var6.length;

      for (int var3 = 0; var3 < var9; var3++) {
         ox_0 var4;
         if ((var4 = var6[var3]) != null) {
            var4.xe0();
         }
      }

      tj0_0 var10003 = tw0_0.Tl0;
      tj0_0 var10004 = tw0_0.Tl0;
      tw0_0.Tl0.B1.clear();
      var10004.k00.clear();
      var10003.em();
      this.da0(null, CH0.j1, (byte)0);
      lpt6__0.qK0(this.zK0, true);
      BU var7 = this.zK0;
      if (this.zK0 != null) {
         var7.xe0();
      }

      if (this.G30 == null) {
         LPt2_ var8;
         LPt2_ var10 = var8 = new LPt2_((Qy0) this);

         this.G30 = var10;
         this.F9(this.fU(), var8);
         if (tw0_0.Ll0.zd) {
            this.qi();
         } else if (!dw_2.S6) {
            this.tM();
         }
      }
   }

   public final void pc0() {
      this.Qw0(this.om0);
   }

   public final void p2(String var1, int var2, int var3) {
      lg_0.k.lPT5(() -> UA.rL(this.KC(var2, var3, var1), this, var2, var3));
   }

   public final void hL(String var1, int var2, int var3) {
      UA.rL(this.KC(var2, var3, var1), this, var2, var3);
   }

   public final Vt0 KC(int var1, int var2, String var3) {
      E90 var4 = tw0_0.e60.jB0;
      if (tw0_0.e60.jB0 != null && var4.oc0.equals(var3)) {
         Vt0 var5;
         Vt0 var10000 = var5 = new Vt0();

         this.Ni0(var5);
         return var10000;
      } else {
         return this.QK(null, var3, var1, var2, false);
      }
   }

   public final void lJ(boolean var1, ArrayList var2, int var3, int var4) {
      // [右键菜单诊断] 确认 lJ 被执行（定位后删除）
      System.out.println("[右键菜单诊断] lJ执行: 拾取实体数=" + (var2 == null ? -1 : var2.size()) + ", 鼠标坐标=(" + var3 + "," + var4 + ")");
      lg_0.k.lPT5(() -> this.v5(var1, var2, var3, var4));
   }
}
