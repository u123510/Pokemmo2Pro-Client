package cn.pokemmo.ui.window.market;

import f.*;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * 玩家面对面交易主窗口
 *
 * 原混淆类: f.gc_0
 */
public class TradeWindow extends cx_0 {
    public final gc_0 asBridge() {
        return (gc_0) (Object) this;
    }

   public final Dm0 Oc0;
   public final fy_2 sM;
   public final fy_2 cq;
   public final fy_2 SG0;
   public final Aj fz0;
   public final cn_0 lF0;
   public final jb0_0[][] md = new jb0_0[2][6];
   public final si0_1[][] Gr0 = new si0_1[2][6];
   public final xe_1 wb;
   public final xe_1 Bw0;
   public final xe_1 fH0;
   public final xe_1 p40;
   public final qj_2 ET;
   public final VL0 R3;
   public final HashMap bH;

   public TradeWindow(Dm0 var1) {
      super(tw0_0.kz0());
      HashMap var2;
      var2 = new HashMap();
      this.bH = var2;
      this.Oc0 = var1;
      og_1 var10;
      var10 = new og_1();
      this.Pb0(var10);
      gn_0 var3 = new gn_0((byte)-1, (byte)-1, (byte)-1, (byte)-1);
      N1 var11 = new N1(asBridge(), var3);

      this.LPT8(var11);
      this.uf("trade-frame");
      this.Hy(sm0_0.c0(1950));
      this.ff0(1);
      xe_1 var12;
      var12 = new xe_1(sm0_0.c0(1951));
      this.wb = var12;
      xe_1 var25;
      xe_1 var70 = var25 = new xe_1(sm0_0.c0(1952));

      this.Bw0 = var25;
      var70.pw0(false);
      xe_1 var26;
      var26 = new xe_1(sm0_0.c0(1953));
      this.fH0 = var26;
      xe_1 var4;
      xe_1 var71 = var4 = new xe_1(sm0_0.c0(1954));

      this.p40 = var4;
      var4.pw0(false);
      var12.RR(new ZG(asBridge(), var1));
      var26.RR(() -> this.MH0(var1));
      var26.Ll(false);
      var71.Ll(false);
      fy_2 var13;
      var13 = new fy_2();
      this.SG0 = var13;
      fy_2 var14;
      var14 = new fy_2();
      this.sM = var14;
      Aj var15;
      Aj var72 = var15 = new Aj(0, tw0_0.rl.ex().bk0(), 0);

      this.fz0 = var15;
      var72.Kj(new YQ(asBridge(), var1));
      VL0 var27;
      VL0 var73 = var27 = new VL0(var15);

      this.R3 = var27;
      var27.j6();
      var73.pw0(var1.u30());

      jb0_0[] var28 = this.md[0];
      for (short var16 = 0; var16 < var28.length; var16++) {
         jb0_0 var29 = new jb0_0(var1.nb(var1.Xj()), var16);
         var28[var16] = var29;
         this.md[0][var16].uf("partyslot");
         this.md[0][var16].pw0(var1.GG0());
         this.md[0][var16].tD0(() -> M(var1, var29));
      }

      this.R3.uf("valueadjuster-bg");
      cn_0 var17;
      var17 = new cn_0(sm0_0.c0(1957));
      StringBuilder var37 = new StringBuilder();
      cn_0 var30 = new cn_0(g7_0.Zx(0, var37, ": "));

      fy_2 var38;
      fy_2 var75 = var38 = new fy_2();

      var75.uf("pokeframe");
      I7 var10003 = var75.H10();
      ya_1[] var10004 = new ya_1[1];
      Hm0 var10006 = var38.lo0();
      ya_1[] var10007 = new ya_1[2];
      ya_1 var10011 = var38.H10().qd(20);
      le0_2[] var5;
      le0_2[] var10012 = var5 = new le0_2[3];
      var5[0] = this.md[0][0];
      var5[1] = this.md[0][1];
      var10012[2] = this.md[0][2];
      var10007[0] = var10011.LPt3(var10012).qd(20);
      ya_1 var124 = var38.H10().qd(20);
      le0_2[] var10010 = var5 = new le0_2[3];
      var5[0] = this.md[0][3];
      var5[1] = this.md[0][4];
      var10010[2] = this.md[0][5];
      var10007[1] = var124.LPt3(var10010).qd(20);
      var10004[0] = var10006.Xq(var10007);
      var75.WQ(var10003.Xq(var10004));
      Hm0 var86 = var75.lo0();
      ya_1[] var10002 = new ya_1[1];
      I7 var102 = var38.H10();
      ya_1[] var10005 = new ya_1[2];
      Hm0 var125 = var38.lo0();
      var10010 = var5 = new le0_2[3];
      var5[0] = this.md[0][0];
      var5[1] = this.md[0][1];
      var10010[2] = this.md[0][2];
      var10005[0] = var125.LPt3(var10010);
      Hm0 var117 = var38.lo0();
      le0_2[] var10008 = var5 = new le0_2[3];
      var5[0] = this.md[0][3];
      var5[1] = this.md[0][4];
      var10008[2] = this.md[0][5];
      var10005[1] = var117.LPt3(var10008);
      var10002[0] = var102.Xq(var10005);
      var75.x40(var86.Xq(var10002));
      cn_0 var46;
      var46 = new cn_0(sm0_0.c0(1967));

      si0_1[] firstStatusSlots = this.Gr0[0];
      for (short var6 = 0; var6 < firstStatusSlots.length; var6++) {
         si0_1 var55;
         var55 = new si0_1(var6, true);
         firstStatusSlots[var6] = var55;
         this.Gr0[0][var6].pw0(var1.u30());
         short var56 = var6;
         this.Gr0[0][var6].of(() -> this.D5(var1, var56));
      }

      fy_2 var52;
      fy_2 var76 = var52 = new fy_2();

      var76.uf("pokeframe");
      var10003 = var76.H10();
      var10004 = new ya_1[1];
      var10006 = var52.lo0();
      var10007 = new ya_1[2];
      var10011 = var52.H10().qd(20);
      le0_2[] var126 = new le0_2[3];
      var10012 = var126;
      var126[0] = this.Gr0[0][0];
      var126[1] = this.Gr0[0][1];
      var10012[2] = this.Gr0[0][2];
      var10007[0] = var10011.LPt3(var10012).qd(20);
      ya_1 var127 = var52.H10().qd(20);
      le0_2[] var128 = new le0_2[3];
      var10010 = var128;
      var128[0] = this.Gr0[0][3];
      var128[1] = this.Gr0[0][4];
      var10010[2] = this.Gr0[0][5];
      var10007[1] = var127.LPt3(var10010).qd(20);
      var10004[0] = var10006.Xq(var10007);
      var76.WQ(var10003.Xq(var10004));
      var86 = var76.lo0();
      var10002 = new ya_1[1];
      I7 var104 = var52.H10();
      var10005 = new ya_1[2];
      Hm0 var131 = var52.lo0();
      le0_2[] var129 = new le0_2[3];
      var10010 = var129;
      var129[0] = this.Gr0[0][0];
      var129[1] = this.Gr0[0][1];
      var10010[2] = this.Gr0[0][2];
      var10005[0] = var131.LPt3(var10010);
      Hm0 var119 = var52.lo0();
      le0_2[] var130 = new le0_2[3];
      var10008 = var130;
      var130[0] = this.Gr0[0][3];
      var130[1] = this.Gr0[0][4];
      var10008[2] = this.Gr0[0][5];
      var10005[1] = var119.LPt3(var10008);
      var10002[0] = var104.Xq(var10005);
      var76.x40(var86.Xq(var10002));
      I7 var60 = this.sM.H10();
      Hm0 var77 = this.sM.lo0();
      var60.X20(var77);
      var77.LPt3(var17, this.R3);
      var77.LPt3(var30, var38);
      var77.LPt3(var46, var52).qd(6);
      var77.Kn0(this.wb);
      var77.Kn0(this.fH0);
      this.sM.WQ(var60);
      Hm0 var61 = this.sM.lo0();
      I7 var78 = this.sM.H10();
      var61.X20(var78);
      var78.qd(6);
      var78.LPt3(var17, this.R3).qd(6);
      var78.LPt3(var30, var38).qd(6);
      var78.LPt3(var46, var52).qd(6);
      var78.Kn0(this.wb);
      var78.Kn0(this.fH0).qd(6);
      this.sM.x40(var61);
      fy_2 var18;
      var18 = new fy_2();
      this.cq = var18;
      cn_0 var19;
      cn_0 var79 = var19 = new cn_0();

      this.lF0 = var19;
      var79.Sk("$0");
      var79.pw0(false);
      var79.uf("label-horizontal-value");

      jb0_0[] var31 = this.md[1];
      for (short var20 = 0; var20 < var31.length; var20++) {
         jb0_0 var32 = new jb0_0(var1.mZ(), var20);
         var31[var20] = var32;
         this.md[1][var20].uf("partyslot");
         this.md[1][var20].Mj0(false);
         this.md[1][var20].pw0(var1.GG0());
      }

      cn_0 var21;
      var21 = new cn_0(sm0_0.c0(1957));
      StringBuilder var39 = new StringBuilder();
      cn_0 var33 = new cn_0(g7_0.Zx(0, var39, ": "));

      fy_2 var40;
      fy_2 var81 = var40 = new fy_2();

      var81.uf("pokeframe");
      var10003 = var81.H10();
      var10004 = new ya_1[1];
      var10006 = var40.lo0();
      var10007 = new ya_1[2];
      var10011 = var40.H10().qd(20);
      var10012 = var5 = new le0_2[3];
      var5[0] = this.md[1][0];
      var5[1] = this.md[1][1];
      var10012[2] = this.md[1][2];
      var10007[0] = var10011.LPt3(var10012).qd(20);
      ya_1 secondPartyGap = var40.H10().qd(20);
      var10010 = var5 = new le0_2[3];
      var5[0] = this.md[1][3];
      var5[1] = this.md[1][4];
      var10010[2] = this.md[1][5];
      var10007[1] = secondPartyGap.LPt3(var10010).qd(20);
      var10004[0] = var10006.Xq(var10007);
      var81.WQ(var10003.Xq(var10004));
      var86 = var81.lo0();
      var10002 = new ya_1[1];
      I7 var106 = var40.H10();
      var10005 = new ya_1[2];
      Hm0 secondPartyRow = var40.lo0();
      var10010 = var5 = new le0_2[3];
      var5[0] = this.md[1][0];
      var5[1] = this.md[1][1];
      var10010[2] = this.md[1][2];
      var10005[0] = secondPartyRow.LPt3(var10010);
      Hm0 var121 = var40.lo0();
      var10008 = var5 = new le0_2[3];
      var5[0] = this.md[1][3];
      var5[1] = this.md[1][4];
      var10008[2] = this.md[1][5];
      var10005[1] = var121.LPt3(var10008);
      var10002[0] = var106.Xq(var10005);
      var81.x40(var86.Xq(var10002));
      cn_0 var51;
      var51 = new cn_0(sm0_0.c0(1967));

      si0_1[] secondStatusSlots = this.Gr0[1];
      for (short var53 = 0; var53 < secondStatusSlots.length; var53++) {
         si0_1 var63;
         var63 = new si0_1(var53, false);
         secondStatusSlots[var53] = var63;
         this.Gr0[1][var53].pw0(var1.u30());
      }

      fy_2 var82 = var52 = new fy_2();

      var82.uf("pokeframe");
      var10003 = var82.H10();
      var10004 = new ya_1[1];
      var10006 = var52.lo0();
      var10007 = new ya_1[2];
      var10011 = var52.H10().qd(20);
      le0_2[] secondStatusTop = new le0_2[3];
      var10012 = secondStatusTop;
      secondStatusTop[0] = this.Gr0[1][0];
      secondStatusTop[1] = this.Gr0[1][1];
      var10012[2] = this.Gr0[1][2];
      var10007[0] = var10011.LPt3(var10012).qd(20);
      ya_1 secondStatusGap = var52.H10().qd(20);
      le0_2[] secondStatusBottom = new le0_2[3];
      var10010 = secondStatusBottom;
      secondStatusBottom[0] = this.Gr0[1][3];
      secondStatusBottom[1] = this.Gr0[1][4];
      var10010[2] = this.Gr0[1][5];
      var10007[1] = secondStatusGap.LPt3(var10010).qd(20);
      var10004[0] = var10006.Xq(var10007);
      var82.WQ(var10003.Xq(var10004));
      var86 = var82.lo0();
      var10002 = new ya_1[1];
      I7 var108 = var52.H10();
      var10005 = new ya_1[2];
      Hm0 secondStatusRowTop = var52.lo0();
      le0_2[] secondStatusTopCompact = new le0_2[3];
      var10010 = secondStatusTopCompact;
      secondStatusTopCompact[0] = this.Gr0[1][0];
      secondStatusTopCompact[1] = this.Gr0[1][1];
      var10010[2] = this.Gr0[1][2];
      var10005[0] = secondStatusRowTop.LPt3(var10010);
      Hm0 var123 = var52.lo0();
      le0_2[] secondStatusBottomCompact = new le0_2[3];
      var10008 = secondStatusBottomCompact;
      secondStatusBottomCompact[0] = this.Gr0[1][3];
      secondStatusBottomCompact[1] = this.Gr0[1][4];
      var10008[2] = this.Gr0[1][5];
      var10005[1] = var123.LPt3(var10008);
      var10002[0] = var108.Xq(var10005);
      var82.x40(var86.Xq(var10002));
      I7 var68 = this.cq.H10();
      Hm0 var83 = this.cq.lo0();
      var68.X20(var83);
      var83.LPt3(var21, this.lF0);
      var83.LPt3(var33, var40);
      var83.LPt3(var51, var52).qd(6);
      var83.Kn0(this.Bw0);
      var83.Kn0(this.p40);
      this.cq.WQ(var68);
      Hm0 var69 = this.cq.lo0();
      I7 var84 = this.cq.H10();
      var69.X20(var84);
      var84.qd(6);
      var84.LPt3(var21, this.lF0).qd(6);
      var84.LPt3(var33, var40).qd(6);
      var84.LPt3(var51, var52).qd(6);
      var84.Kn0(this.Bw0);
      var84.Kn0(this.p40).qd(6);
      this.cq.x40(var69);
      cn_0 var22;
      var22 = new cn_0(tw0_0.e60.at().na0());
      cn_0 var34;
      var34 = new cn_0(var1.qQ());
      fy_2 var85 = this.SG0;
      var86 = this.SG0.lo0();
      var10002 = new ya_1[2];
      ya_1 var113 = this.SG0.H10().Ze0();
      pa0_0 var8 = pa0_0.Ol;
      var10002[0] = var113.k5(pa0_0.Ol, var22).Ze0().k5(var8, var34).Ze0();
      var10002[1] = this.SG0.H10().Ze0().k5(var8, this.sM).Ze0().k5(var8, this.cq).Ze0();
      var85.WQ(var86.Xq(var10002));
      this.SG0.x40(this.SG0.H10().Xq(this.SG0.lo0().LPt3(var22, var34), this.SG0.lo0().LPt3(this.sM, this.cq)));
      this.SL(this.SG0);
      String var23 = "";
      byte var35;
      if (tw0_0.kz0()) {
         var35 = 60;
      } else {
         var35 = 16;
      }

      byte var41;
      if (tw0_0.kz0()) {
         var41 = 60;
      } else {
         var41 = 16;
      }

      qj_2 var9 = new qj_2(var23, var35, var41);

      this.ET = var9;
      var9.uf("tooltip-button");
      fy_2 var24;
      fy_2 var98 = var24 = new fy_2();

      cn_0 var36;
      var36 = new cn_0(sm0_0.c0(7000));
      qj_2 var42;
      qj_2 var109 = var42 = new qj_2("", 40, 30);

      var109.sl().o60(yh_0.Dl0().qC0((short)25, (byte)0, false));
      var109.sl().Gy0(1, -4);
      var109.uf("partyslot-shiny");
      var98.x40(XZ.BC0(var98.lo0(), new ya_1[]{var24.H10().Kn0(var36), var24.H10().LPt3(var42)}, var24).Xq(var24.lo0().LPt3(var36), var24.lo0().LPt3(var42)));
      var9.Bb(0);
      var9.Xr0(var24);
      this.SL(var9);
   }

   public static void M(Dm0 var0, jb0_0 var1) {
      byte var2 = var0.c80;
      if (!var0.RU[var2]) {
         UA.zd(pv0_0.A80(var1, tw0_0.rl.PC0), var1);
      }
   }

   public static void WY(lpt3__4 var0) {
      Qy0.yI0.sr0(var0);
   }

   public static void Mt0(Dm0 var0, StringBuilder var1, Entry var2) {
      VU var6 = (VU)var2.getKey();
      QL var3 = (QL)var2.getValue();
      if (var0.COM3[var0.KK()].sF(var6.pu) != null) {
         String[] var5;
         String[] var10002 = var5 = new String[3];
         var5[0] = var3.toString();
         var5[1] = var6.k30();
         byte var4 = 2;
         var10002[var4] = var0.U6;
         var1.append(sm0_0.Bx(1975, var10002)).append("\n");
      }
   }

   @Override
   public final void a80(Jn0 var1) {
   }

   @Override
   public final void K8() {
      if (tw0_0.kz0() ^ true) {
         super.K8();
         int var1 = super.A20;
         this.ET.E40(this.a3() + var1 - 35, super.SB0 + 45);
      } else {
         this.kh0();
         super.K8();
         this.ET.lt0();
         this.ET.vf(pa0_0.dC0);
      }
   }

   @Override
   public final void HP(zk0_1 var1) {
      Dm0 var2 = this.Oc0;
      int var3 = 0;

      while (true) {
         xh_0[] var4 = var2.COM3;
         if (var3 < var2.COM3.length) {
            xh_0 var5;
            if (!(var5 = var4[var3]).rr0) {
               var3++;
               continue;
            }

            var5.rr0 = false;
         } else {
            if (!var2.aUX) {
               break;
            }

            var2.aUX = false;
         }

         this.Hr0();
         break;
      }

      super.HP(var1);
   }

   public final void Hr0() {
      cn_0 var10000 = this.lF0;
      StringBuilder var10001 = new StringBuilder("$");
      NumberFormat var10002 = NumberFormat.getInstance();
      Dm0 var10003 = this.Oc0;
      byte var1 = this.Oc0.KK();
      var10000.Sk(var10001.append(var10002.format(var10003.xp0[var1])).toString());
      var1 = this.Oc0.c80;
      this.fz0.X90(this.Oc0.xp0[var1]);
      yh_0 var8 = yh_0.Xm0;

      for (int var2 = 0; var2 < 2; var2++) {
         for (short var3 = 0; var3 < 6; var3++) {
            this.md[var2][var3].iV(this.md[var2][var3].Vt0);
            byte var4;
            if (var2 == 0) {
               var4 = this.Oc0.c80;
            } else {
               var4 = this.Oc0.KK();
            }

            VU var20;
            if ((var20 = this.Oc0.COM3[var4].Ry0(var3)) != null) {
               label88: {
                  jb0_0 var5;
                  String var6;
                  if (var20.I8.I()) {
                     var5 = this.md[var2][var3];
                     var6 = "partyslot-shiny";
                     if ("partyslot-shiny".equals(var5.gW)) {
                        break label88;
                     }
                  } else {
                     var5 = this.md[var2][var3];
                     var6 = "partyslot";
                     if ("partyslot".equals(var5.gW)) {
                        break label88;
                     }
                  }

                  var5.uf(var6);
                  var5.yI();
               }

               jb0_0 var29 = this.md[var2][var3];
               short var26 = var20.I8.Kr();
               var29.E1(var8.qC0(var26, var20.Dg0(), var20.I8.aR())[0]);
               jb0_0 var30 = this.md[var2][var3];
               this.md[var2][var3].yj0 = lb0_2.Ky(var20, false, true, false);
               var30.yB0();
               this.md[var2][var3].GH0 = 100;
            } else {
               this.md[var2][var3].E1(null);
               jb0_0 var31 = this.md[var2][var3];
               this.md[var2][var3].yj0 = null;
               var31.yB0();
               jb0_0 var21 = this.md[var2][var3];
               String var27 = "partyslot";
               if (!"partyslot".equals(var21.gW)) {
                  var21.uf(var27);
                  var21.yI();
               }
            }
         }
      }

      for (int var9 = 0; var9 < 2; var9++) {
         for (short var15 = 0; var15 < 6; var15++) {
            si0_1[][] var17 = this.Gr0;
            byte var22;
            if (var9 == this.Oc0.c80) {
               var22 = 0;
            } else {
               var22 = 1;
            }

            si0_1 var18 = var17[var22][var15];
            if (tw0_0.kz0()) {
               var18.vc0 = 48;
               var18.NX = 48;
               var22 = (byte)0;
               byte var28 = 13;
               var18.ge = var22;
               var18.ej0 = var28;
            }

            VF0 var24;
            if ((var24 = this.Oc0.Ti0[var9][var15]) == null) {
               var18.Uj0((byte)0, (short)0, (short)0);
            } else {
               short var19 = var24.PA;
               var22 = (byte)var24.FY;
               var18.Uj0(var24.XF0, var19, var22);
            }
         }
      }

      var1 = this.Oc0.c80;
      if (this.Oc0.RU[var1]) {
         this.wb.SU(sm0_0.c0(1955));
         this.R3.pw0(false);
      }

      Dm0 var33 = this.Oc0;
      var1 = this.Oc0.KK();
      if (var33.RU[var1]) {
         this.Bw0.SU(sm0_0.c0(1955));
      }

      var1 = this.Oc0.c80;
      if (this.Oc0.u8[var1]) {
         this.fH0.SU(sm0_0.c0(1956));
      }

      Dm0 var34 = this.Oc0;
      var1 = this.Oc0.KK();
      if (var34.u8[var1]) {
         this.p40.SU(sm0_0.c0(1956));
      }

      var1 = 0;
      boolean[] var16 = this.Oc0.RU;
      if (this.Oc0.RU[var1] && var16[1]) {
         this.fH0.Ll(true);
         this.p40.Ll(true);
      }
   }

   public final void D5(Dm0 var1, short var2) {
      byte var3 = var1.c80;
      if (!var1.RU[var3]) {
         UA.zd(pv0_0.S20(this.Gr0[0][var2], pv0_0.zy0, false), this.Gr0[0][var2]);
      }
   }

   public final void MH0(Dm0 var1) {
      fy_2[] var2 = new fy_2[2];
      cn_0 var3;
       cn_0 varConfirmLabel = var3 = new cn_0(null, 0);
      String var4 = sm0_0.c0(1963);

       varConfirmLabel.Sk(var4);
      cn_0 var30;
       varConfirmLabel = var30 = new cn_0(null, 0);
      String var5 = sm0_0.c0(1964);

       varConfirmLabel.Sk(var5);
      cn_0 var33;
       varConfirmLabel = var33 = new cn_0(null, 0);
      String var6 = sm0_0.c0(1965);

       varConfirmLabel.Sk(var6);

      for (int var36 = 0; var36 < 2; var36++) {
         fy_2 var7;
         fy_2 var10005 = var7 = new fy_2();

         var2[var36] = var7;
         var10005.uf("/confirm-panel-dialog");
         Hm0 var39 = D5.fE0(var2[var36], var2[var36]);
         I7 var8 = XN.sA(var2[var36], var2[var36]);
         if (var1.c80 == var36) {
            var39.Kn0(var33);
            var8.Kn0(var33);
         } else {
            var39.Kn0(var30);
            var8.Kn0(var30);
         }

         fy_2 var9;
         fy_2 var10003 = var9 = new fy_2();

         cn_0 var10;
         cn_0 var10006 = var10 = new cn_0(null, 0);
         String var11 = "$" + NumberFormat.getInstance().format(var1.xp0[var36]);

         var10006.Sk(var11);
         var10003.uf("/confirm-panel-dialog2");
         var10003.WQ(new I7(var9).qd(10).LPt3(var10).qd(20));
         var10003.x40(new Hm0(var9).LPt3(var10));
         var8.LPt3(var9);
         var39.LPt3(var9);
         boolean var41 = true;
         VU[] var45;
         int var47 = (var45 = var1.COM3[var36].y0()).length;

         for (int var12 = 0; var12 < var47; var12++) {
            VU var13;
            if ((var13 = var45[var12]) != null) {
               var41 = false;
               fy_2 var14;
               fy_2 var88 = var14 = new fy_2();

               var88.uf("/confirm-panel-dialog2");
               mc0_1 var15 = gu0.l2.lPT6(var13.I8.rh0());
                S70 var16;
                S70 var10000;
               var16 = new S70(0, 0, 0);
               S70 var17;
               var17 = new S70(0, 0, 0);
               S70 var18;
               if (tw0_0.kz0()) {
                  var10000 = var18 = new S70(72, 72, 0);

                  Br0 var90 = var10000.og;
                  byte var19 = 72;
                  byte var20 = 72;
                  var10000.og.OA0 = true;
                  var90.IF = var19;
                  var90.gx0 = var20;
                  var19 = 0;
                  var20 = -10;
                  var90.gY = var19;
                  var90.a4 = var20;
               } else {
                  var10000 = var18 = new S70(36, 36, 0);

                  Br0 var92 = var10000.og;
                  byte var62 = 36;
                  byte var76 = 36;
                  var10000.og.OA0 = true;
                  var92.IF = var62;
                  var92.gx0 = var76;
               }

               if (var13.I8.I()) {
                  Br0 var63 = var17.og;
                  LPT6_[] var77 = new LPT6_[1];
                  byte var21 = 0;
                  fn_0 var22 = fn_0.qz0();
                  LPT6_ var85;
                  if (var13.I8.u3()) {
                     var85 = var22.EB;
                  } else {
                     var85 = var22.tj0;
                  }

                  var77[var21] = var85;
                  var63.r8(var77);
                  int var66;
                  Br0 var93;
                  Br0 var10001;
                  S70 var10002;
                  if (tw0_0.kz0()) {
                     var93 = var17.og;
                     var10001 = var63 = var17.og;
                     var10002 = var17;
                     byte var65 = 32;
                     byte var78 = 32;
                     var63.OA0 = true;
                     var63.IF = var65;
                     var63.gx0 = var78;
                     var66 = var17.A20 - 5;
                  } else {
                     var93 = var17.og;
                     var10001 = var63 = var17.og;
                     var10002 = var17;
                     byte var68 = 16;
                     byte var79 = 16;
                     var63.OA0 = true;
                     var63.IF = var68;
                     var63.gx0 = var79;
                     var66 = var17.A20 - 4;
                  }

                  int var80 = var10002.SB0;
                  var10001.gY = var66;
                  var93.a4 = var80;
               }

               label84:
               if (var13.I8.bG0.length > 0) {
                  int var71;
                   Br0 var108;
                   Br0 var95;
                  int var114;
                  label92: {
                     var16.og.r8(fn_0.qz0().eb0);
                     Br0 var94;
                     S70 var113;
                     if (tw0_0.kz0()) {
                        var108 = var16.og;
                        Br0 var112 = var16.og;
                        byte var69 = 32;
                        byte var81 = 32;
                        var16.og.OA0 = true;
                        var112.IF = var69;
                        var108.gx0 = var81;
                        if (var17.og.yH0() > 0) {
                           var95 = var16.og;
                           var108 = var16.og;
                           var114 = var17.A20 - 10;
                           var71 = var17.SB0 + 24;
                           break label92;
                        }

                        var94 = var16.og;
                        var108 = var16.og;
                        var113 = var17;
                        var71 = var17.A20 - 10;
                     } else {
                        var108 = var16.og;
                        Br0 var115 = var16.og;
                        byte var72 = 16;
                        byte var82 = 16;
                        var16.og.OA0 = true;
                        var115.IF = var72;
                        var108.gx0 = var82;
                        if (var17.og.yH0() > 0) {
                           var95 = var16.og;
                           var108 = var16.og;
                           var114 = var17.A20 - 9;
                           var71 = var17.SB0 + 16;
                           break label92;
                        }

                        var94 = var16.og;
                        var108 = var16.og;
                        var113 = var17;
                        var71 = var17.A20 - 9;
                     }

                     int var83 = var113.SB0;
                     var108.gY = var71;
                     var94.a4 = var83;
                     break label84;
                  }

                  var108.gY = var114;
                  var95.a4 = var71;
               }

               Br0 var127 = var18.og;
               AG0[] var131 = new AG0[1];
               yh_0 var10009 = yh_0.Xm0;
               short var73 = var13.I8.Kr();
               var131[0] = var10009.qC0(var73, var13.Dg0(), var13.I8.aR())[0];
               var127.o60(var131);
               var18.GH0 = 0;
               var18.yj0 = lb0_2.Ky(var13, false, true, false);
               var18.yB0();
               cn_0 var74 = new cn_0(null, 0);
               StringBuilder var84;
               var84 = new StringBuilder();
               StringBuilder var50 = ig_0.u9(1842, ig_0.u9(59, var84, " ").append(var13.I8.wj).append(" ").append(var13.k30()).append("\n"), " ");
               String var55;
               if (var13.I8.rh0() > 0) {
                  var55 = sm0_0.c0(var15.Nl);
               } else {
                  var55 = sm0_0.c0(nf0_0.Po);
               }

               String var51 = var50.append(var55).toString();

               var74.Sk(var51);
               var14.WQ(new I7(var14).LPt3(var17, var16, var18, var74).qd(60));
               var14.x40(new Hm0(var14).LPt3(var17, var16, var18, var74));
               var8.LPt3(var14);
               var39.LPt3(var14);
            }
         }

         VF0[] var46;
         int var48 = (var46 = var1.Ti0[var36]).length;

         for (int var49 = 0; var49 < var48; var49++) {
            VF0 var52;
            if ((var52 = var46[var49]) != null) {
               short var53 = var52.PA;
               if (var52.PA >= 1 && var52.FY >= 1) {
                  mc0_1 var42 = gu0.l2.lPT6(var53);
                  boolean var54 = false;
                  fy_2 var56;
                  fy_2 var97 = var56 = new fy_2();

                  var97.uf("/confirm-panel-dialog2");
                   S70 var57;
                   S70 var10000;
                  byte var58;
                  byte var60;
                  Br0 var99;
                  Br0 var110;
                  Br0 var116;
                  if (tw0_0.kz0()) {
                     var10000 = var57 = new S70(48, 48, 0);

                     var99 = var10000.og;
                     var110 = var10000.og;
                     var116 = var10000.og;
                     var58 = 48;
                     var60 = 48;
                  } else {
                     var10000 = var57 = new S70(24, 24, 0);

                     var99 = var10000.og;
                     var110 = var10000.og;
                     var116 = var10000.og;
                     var58 = 24;
                     var60 = 24;
                  }

                  var116.OA0 = true;
                  var110.IF = var58;
                  var99.gx0 = var60;
                  var57.og.Nk(gh_1.aH0.F10(var42, false));
                  var57.yj0 = lb0_2.Sp0(var42, true, false);
                  var57.yB0();
                  var57.GH0 = 0;
                  cn_0 var59;
                  cn_0 var121 = var59 = new cn_0(null, 0);
                  String var43 = var52.FY + "x " + sm0_0.c0(var42.Nl);

                  var121.Sk(var43);
                  var56.WQ(new I7(var56).LPt3(var57).LPt3(var59).qd(60));
                  var56.x40(new Hm0(var56).LPt3(var57, var59));
                  var8.LPt3(var56);
                  var39.LPt3(var56);
                  var41 = var54;
               }
            }
         }

         if (var41) {
            fy_2 var117 = var9 = new fy_2();

            var117.WQ(new I7(var9).qd(210));
            var8.LPt3(var9);
            var39.LPt3(var9);
         }

         var2[var36].WQ(var39);
         var2[var36].x40(var8);
      }

      fy_2 var31;
      fy_2 var101 = var31 = new fy_2();

      var101.uf("trade-confirm-widget");
      Hm0 var34;
      var34 = new Hm0(var31);
      I7 var37;
      var37 = new I7(var31);
      lo0_0 var40;
      lo0_0 var102 = var40 = new lo0_0(null);

      var34.Kn0(var40);
      var37.Kn0(var40);
      var31.WQ(var34);
      var31.x40(var37);
      fy_2 var35;
      fy_2 var111 = var35 = new fy_2();

      var111.uf("/confirm-panel-dialog");
      ya_1 var122 = new Hm0(var35).Kn0(var3);
      ya_1[] var128 = new ya_1[1];
      Hm0 var10008 = new Hm0(var35);
      ya_1[] var133 = new ya_1[1];
       ya_1 var134 = new I7(var35).qd(20);
      le0_2[] var10013 = new le0_2[1];
      byte var38 = 0;
      var10013[var38] = var2[var1.c80];
       var133[0] = var134.LPt3(var10013).LPt3(var2[var1.KK()]);
      var128[0] = var10008.Xq(var133);
      var111.WQ(var122.Xq(var128));
      ya_1 var118 = new I7(var35).Kn0(var3);
      ya_1[] var123 = new ya_1[1];
      Hm0 var10007 = new Hm0(var35);
      ya_1[] var132 = new ya_1[2];
       I7 var10012 = new I7(var35);
      var10013 = new le0_2[1];
      byte var27 = 0;
      var10013[var27] = var2[var1.c80];
      var132[0] = var10012.LPt3(var10013);
      var132[1] = new I7(var35).LPt3(var2[var1.KK()]);
      var123[0] = var10007.Xq(var132);
      var111.x40(var118.Xq(var123));
      var102.AH0(var111);
      lpt3__4 var25;
      lpt3__4 var103 = var25 = new lpt3__4(var31, new D7(asBridge(), var1), null, xX.Bm);

      var40.gC0(400, 250);
      var103.gC0(400, 250);
      var103.uf("trade-confirm-widget");
      Qy0.yI0.sr0(var25);
      StringBuilder var28;
      StringBuilder var104 = var28 = new StringBuilder();

       this.bH.entrySet().stream().forEach(var35Entry -> Mt0(var1, var28, (Entry)var35Entry));
      if (!var104.toString().isEmpty()) {
         Qy0 var105 = Qy0.yI0;
         String var23 = var28.toString().trim();
         String var24 = sm0_0.c0(nf0_0.BA);
         String var26 = sm0_0.c0(nf0_0.Bq0);
         Runnable var29 = () -> WY(var25);
         xe_1 var32 = this.fH0;
         var105.sr0(new lpt3__4(var23, var24, var26, var29, var32));
      } else {
         Qy0.yI0.sr0(var25);
      }
   }
}
