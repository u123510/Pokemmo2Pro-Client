package cn.pokemmo.ui.window.pokemon;

import f.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 全国宝可梦图鉴主窗口
 *
 * 原混淆类: f.fd0_0
 */
public class PokedexWindow extends cx_0 implements tr_1  {
    public final fd0_0 asBridge() {
        return (fd0_0) (Object) this;
    }

   public static final int[] ts0 = new int[]{255, 255, 255, 255, 255, 255, 680};
   public final ap_0 coM1;
   public final lo0_0 pu;
   public final ba0_1 oh0;
   public final S70 OI0;
   public final xe_1 Gt;
   public final xe_1 E9;
   public final le0_2[] Ar;
   public final ia0_1 JS;
   public final cn_0 tK;
   public final S70 QE0;
   public final S70 NK;
   public final cn_0 aT;
   public final cn_0 lw0;
   public final cn_0 Oi;
   public final cn_0 GT;
   public final cn_0 G50;
   public final cn_0 Ch0;
   public final ia0_1 Wh;
   public final cn_0 Lg0;
   public final cn_0 Su;
   public final xe_1 bp;
   public final fy_2 sC;
   public final fy_2 eW;
   public final fy_2 gq0;
   public final xk0_2 jo;
   public final fy_2 DQ;
   public final fy_2 BZ;
   public final fy_2 lpT6;
   public final P8 else$;
   public final ae0_1[] ec;
   public final cn_0[] ro;
   public final cg_0 tF0;
   public final ae0_1 OR;
   public final ae0_1 Cq0;
   public final ae0_1 iv0;
   public final ae0_1 T4;
   public final cn_0 Ac;
   public final cn_0 ax;
   public final cn_0 Hi0;
   public final cn_0 O30;
   public final W9 Cs0;
   public final fy_2 rD0;
   public final X6 zu0;
   public final fa_0 gd;
   public final X6 Yv0;
   public cq_0 OE0;
   public byte j8;
   public nc_0[] GH0;
   public final lo0_0 M40;
   public final lo0_0 bQ;
   public final lo0_0 Te0;
   public byte Gg;
   public int of;

   public PokedexWindow(BU var1, ap_0 var2) {
      super(tw0_0.kz0());
      cn_0 var30;
      var30 = new cn_0("");
      this.aT = var30;
      cn_0 var3;
      var3 = new cn_0("");
      this.lw0 = var3;
      cn_0 var4;
      var4 = new cn_0("");
      this.Oi = var4;
      cn_0 var5;
      var5 = new cn_0("");
      this.GT = var5;
      cn_0 var6;
      var6 = new cn_0("");
      this.G50 = var6;
      cn_0 var7;
      var7 = new cn_0("");
      this.Ch0 = var7;
      cn_0 var8;
      var8 = new cn_0("");
      this.Lg0 = var8;
      cn_0 var9;
      var9 = new cn_0("");
      this.Su = var9;
      gc_2[] var10002 = gc_2.fe0;
      this.ec = new ae0_1[gc_2.fe0.length + 1];
      this.ro = new cn_0[var10002.length + 1];
      this.GH0 = new nc_0[0];
      this.Gg = -1;
      this.of = 0;
      this.coM1 = var2;
      this.Pb0(var1::LV);
      this.uf("monsterdex-frame");
      this.Hy(sm0_0.c0(1));
      this.ff0(1);
      lo0_0 var10;
      lo0_0 var93 = var10 = new lo0_0();
      this.pu = var10;
      var93.Qs0(2);
      ba0_1 var82;
      var82 = new ba0_1();
      this.oh0 = var82;
      S70 var11;
      short var12;
      if (tw0_0.kz0()) {
         var12 = 200;
      } else {
         var12 = 170;
      }

      short var13;
      if (tw0_0.kz0()) {
         var13 = 200;
      } else {
         var13 = 185;
      }

      var11 = new S70(var12, var13);
      this.OI0 = var11;
      var11.uf("monstergear-pic");
      xe_1 var83;
      xe_1 var94 = var83 = new xe_1(sm0_0.c0(1727));
      this.Gt = var83;
      var94.RR(() -> this.sl(var2));
      xe_1 var49;
      xe_1 var95 = var49 = new xe_1(sm0_0.c0(1760));
      this.E9 = var49;
      var95.RR(this::A60);
      fy_2 var84;
      var84 = new fy_2();
      this.rD0 = var84;
      fy_2 var85;
      var85 = new fy_2();
      this.sC = var85;
      xe_1 var14;
      xe_1 var96 = var14 = new xe_1(sm0_0.c0(58));
      this.bp = var14;
      var96.RR(this::U9);
      if (tw0_0.kz0()) {
         var14.SU("");
         var14.uf("button-return");
      }

      ia0_1 var15;
      ia0_1 var10009 = var15 = new ia0_1(2);
      this.JS = var15;
      var10009.uf("label-area-monsterdex");
      var82.uf("label-value-dex2");
      var30.uf("label-value-dex2");
      var3.uf("label-value-dex2");
      var4.uf("label-value-dex2");
      var5.uf("label-value-dex2");
      var6.uf("label-value-dex2");
      var8.uf("label-value-dex2");
      var9.uf("label-value-dex2");
      var7.uf("label-value-dex2");
      cn_0 var16;
      var16 = new cn_0(sm0_0.c0(1706));
      cn_0 var17;
      var17 = new cn_0(sm0_0.c0(1707));
      cn_0 var18;
      var18 = new cn_0(sm0_0.c0(1708));
      cn_0 var19;
      var19 = new cn_0(sm0_0.c0(1709));
      cn_0 var20;
      var20 = new cn_0(sm0_0.c0(1710));
      cn_0 var21;
      var21 = new cn_0(sm0_0.c0(1730));
      cn_0 var22;
      var22 = new cn_0(sm0_0.c0(1733));
      cn_0 var23;
      cn_0 var97 = var23 = new cn_0(sm0_0.c0(1886));
      var97.Xr0(sm0_0.c0(1761));
      cn_0 var24;
      var24 = new cn_0(sm0_0.c0(1734));
      cn_0 var25;
      cn_0 var98 = var25 = new cn_0(sm0_0.c0(1735));
      var16.uf("label-title-dex");
      var17.uf("label-title-dex");
      var18.uf("label-title-dex");
      var19.uf("label-title-dex");
      var20.uf("label-title-dex");
      var21.uf("label-title-dex");
      var22.uf("label-title-dex");
      var23.uf("label-title-dex");
      var24.uf("label-title-dex");
      var98.uf("label-title-dex");
      le0_2[] var26;
      le0_2[] var99 = var26 = new le0_2[10];
      var99[0] = var16;
      var99[1] = var17;
      var99[2] = var18;
      var99[3] = var19;
      var99[4] = var20;
      var99[5] = var21;
      var99[6] = var22;
      var99[7] = var23;
      var99[8] = var24;
      var99[9] = var25;
      this.Ar = var26;
      W9 var86;
      W9 var100 = var86 = new W9();
      this.Cs0 = var86;
      var100.k50(false);
      var100.RR(this::Ub0);
      new cn_0(sm0_0.c0(1700)).coM8(var86);
      ae0_1 var87;
      ae0_1 var101 = var87 = new ae0_1();
      this.iv0 = var87;
      var101.aE(0.0F);
      var101.uf("progressbar-white");
      ae0_1 var88;
      ae0_1 var102 = var88 = new ae0_1();
      this.OR = var88;
      var102.aE(0.0F);
      var102.uf("progressbar-blue");
      ae0_1 var89;
      ae0_1 var103 = var89 = new ae0_1();
      this.Cq0 = var89;
      var103.aE(0.0F);
      var103.uf("progressbar-green");
      ae0_1 var90;
      ae0_1 var104 = var90 = new ae0_1();
      this.T4 = var90;
      var104.aE(0.0F);
      var104.uf("progressbar-pink");
      LPT6_ var91 = fn_0.qz0().ML0(i40_0.DL);
      cn_0 var27;
      cn_0 var105 = var27 = new cn_0("");
      this.tK = var27;
      var105.uf("label-value-dex2");
      S70 var28;
      var28 = new S70(0, var91.dV());
      this.QE0 = var28;
      S70 var29;
      var29 = new S70(0, var91.dV());
      this.NK = var29;
      if (tw0_0.kz0()) {
         var28.JH().dA(2.0F);
         var29.JH().dA(2.0F);
      }

      ia0_1 var92;
      var92 = new ia0_1(new le0_2[]{var27, var28, var29});
      var15.SL(new ia0_1(new le0_2[]{var16, var92}));
      var15.SL(new ia0_1(new le0_2[]{var17, var82}));
      var15.SL(new ia0_1(new le0_2[]{var19, var3}));
      var15.SL(new ia0_1(new le0_2[]{var20, var4}));
      var15.SL(new ia0_1(new le0_2[]{var22, var6}));
      ia0_1 var61;
      ia0_1 var10005 = var61 = new ia0_1(new le0_2[]{var23, var7});
      this.Wh = var61;
      var15.SL(var10005);
      var15.SL(new ia0_1(new le0_2[]{var25, var9}));
      var15.SL(new ia0_1(new le0_2[]{var21, var5}));
      var15.SL(new ia0_1(new le0_2[]{var18, var30}));
      var15.SL(new ia0_1(new le0_2[]{var24, var8}));
      ya_1 var31;
      ya_1 var50;
      if (tw0_0.kz0()) {
         var31 = var85.lo0().Xq(new ya_1[]{var85.C7(new le0_2[]{var11, var83, var49}), var85.C7(new le0_2[]{var15})});
         var50 = var85.H10().qd(5).Xq(new ya_1[]{var85.hb(new le0_2[]{var11, var83, var49}), var85.hb(new le0_2[]{var15})}).qd(5);
      } else {
         var31 = var85.lo0().Xq(new ya_1[]{var85.C7(new le0_2[]{var11, var83, var49}), var85.C7(new le0_2[]{var15}).Ze0().Kn0(var14)});
         var50 = var85.H10().qd(5).Xq(new ya_1[]{var85.hb(new le0_2[]{var11, var83, var49}), var85.hb(new le0_2[]{var15, var14})}).qd(5);
      }

      var85.x40(var31);
      var85.WQ(var50);
      cn_0 var32;
      var32 = new cn_0(sm0_0.c0(1701));
      this.Hi0 = var32;
      cn_0 var33;
      var33 = new cn_0(sm0_0.c0(1702));
      this.Ac = var33;
      cn_0 var34;
      var34 = new cn_0(sm0_0.c0(1728));
      this.ax = var34;
      cn_0 var35;
      var35 = new cn_0(sm0_0.c0(1762));
      this.O30 = var35;
      cg_0 var36;
      cg_0 var106 = var36 = new cg_0();
      this.tF0 = var36;
      var106.I7();
      var106.uf("editfield-search");
      var106.Ii(var1x -> this.Ub0());
      fa_0 var37;
      fa_0 var107 = var37 = new fa_0();
      this.gd = var37;
      pg0_2 var38;
      pg0_2 var120 = var38 = new pg0_2();
      var120.Ii(tx_1.rX(sm0_0.H5(lpt6__2.Q80, 276, 1)));
      var120.Ii(sm0_0.c0(1763));
      var107.nf0((byte)-1);
      var107.nf0((byte)-2);
      byte[] var51 = N50.Fb;
      byte var62 = 5;

      for (int var68 = 0; var68 < var62; var68++) {
         byte var72 = var51[var68];
         if (tw0_0.Ll0.cOM4(var72)) {
            var38.Ii(N50.k10(var72) + " " + sm0_0.c0(1));
            this.gd.nf0(var72);
         }
      }

      X6 var52;
      X6 var108 = var52 = new X6(var38);
      this.zu0 = var52;
      var108.Bd(0);
      var108.Rm0(this::Ub0);
      pg0_2 var39;
      pg0_2 var109 = var39 = new pg0_2();
      var109.Ii(sm0_0.c0(5749));
      N2[] var53 = N2.HP;
      int var63 = N2.HP.length;

      for (int var69 = 0; var69 < var63; var69++) {
         var39.Ii(sm0_0.c0(var53[var69].z90()));
      }

      X6 var54;
      X6 var110 = var54 = new X6(var39);
      this.Yv0 = var54;
      var110.Bd(0);
      var110.Rm0(this::Ub0);
      I7 var40;
      I7 var111 = var40 = this.rD0.H10();
      Hm0 var64;
      (var64 = this.rD0.lo0()).LPt3(new le0_2[]{this.zu0, this.tF0, var54});
      var111.LPt3(new le0_2[]{this.zu0, this.tF0, var54});
      fy_2 var55;
      this.rD0
         .x40(
            this.rD0
               .H10()
               .qd(24)
               .X20(var64)
               .Kn0(this.pu)
               .X20(
                  (var55 = this.rD0)
                     .Ou0(
                        new ya_1[]{
                           var55.C7(new le0_2[]{this.Hi0, this.iv0}),
                           this.rD0.C7(new le0_2[]{this.Ac, this.OR}),
                           this.rD0.C7(new le0_2[]{this.ax, this.Cq0}),
                           this.rD0.C7(new le0_2[]{this.O30, this.T4})
                        }
                     )
               )
               .qd(5)
         );
      fy_2 var41;
      this.rD0
         .WQ(
            this.rD0
               .lo0()
               .X20(var40)
               .Kn0(this.pu)
               .X20(
                  (var41 = this.rD0)
                     .bx0(
                        new ya_1[]{
                           var41.hb(new le0_2[]{this.Hi0, this.iv0}),
                           this.rD0.hb(new le0_2[]{this.Ac, this.OR}),
                           this.rD0.hb(new le0_2[]{this.ax, this.Cq0}),
                           this.rD0.hb(new le0_2[]{this.O30, this.T4})
                        }
                     )
               )
         );
      this.SL(this.rD0);
      fy_2 var42;
      fy_2 var112 = var42 = new fy_2();
      this.eW = var42;
      xk0_2 var43;
      var43 = new xk0_2();
      this.jo = var43;
      lo0_0 var56;
      var56 = new lo0_0(var43);
      this.M40 = var56;
      var112.x40(var112.lo0().Kn0(var56));
      var112.WQ(var112.H10().Ze0().Kn0(var56).Ze0());
      fy_2 var44;
      fy_2 var113 = var44 = new fy_2();
      this.DQ = var44;
      var113.uf("label-area-monsterdex");
      int var45 = 0;

      while (true) {
         ae0_1[] var57 = this.ec;
         if (var45 >= this.ec.length) {
            var57[0].uf("progressbar-hp");
            this.ec[1].uf("progressbar-attack");
            this.ec[2].uf("progressbar-defense");
            this.ec[3].uf("progressbar-spatk");
            this.ec[4].uf("progressbar-spdef");
            this.ec[5].uf("progressbar-speed");
            this.ec[6].uf("progressbar-total");
            ae0_1[] var115 = this.ec;
            cn_0[] var46 = new cn_0[this.ec.length];
            le0_2[] var59 = new le0_2[var115.length];
            Hm0 var65 = this.DQ.lo0();
            I7 var70 = this.DQ.H10();
            int var73 = 0;

            while (true) {
               ae0_1[] var74 = this.ec;
               if (var73 >= this.ec.length) {
                  this.DQ.WQ(var65);
                  this.DQ.x40(var70);
                  fy_2 var47;
                  fy_2 var116 = var47 = new fy_2();
                  this.BZ = var47;
                  var116.uf("label-area-monsterdex");
                  var116.WQ(var116.H10());
                  var116.x40(var116.lo0());
                  lo0_0 var60;
                  var93 = var60 = new lo0_0();
                  this.bQ = var60;
                  var93.AH0(var47);
                  fy_2 var48;
                  var48 = new fy_2();
                  this.gq0 = var48;
                  fy_2 var66;
                  fy_2 var118 = var66 = new fy_2();
                  this.lpT6 = var66;
                  var66.uf("label-area-monsterdex");
                  lo0_0 var71;
                  lo0_0 var10008 = var71 = new lo0_0();
                  this.Te0 = var71;
                  var10008.AH0(var66);
                  var48.x40(var48.lo0().Kn0(var71));
                  var48.WQ(var48.H10().Ze0().Kn0(var71).Ze0());
                  var118.WQ(var118.lo0());
                  var118.x40(var118.H10());
                  P8 var67;
                  P8 var119 = var67 = new P8();
                  this.else$ = var67;
                  var67.Wq(this.sC, sm0_0.c0(1703));
                  var67.Wq(this.eW, sm0_0.c0(1704));
                  var67.Wq(this.DQ, sm0_0.c0(1717));
                  var67.Wq(var48, sm0_0.c0(1775));
                  var119.Wq(var60, sm0_0.c0(2550));
                  var119.Ll(false);
                  this.SL(var67);
                  if (tw0_0.kz0()) {
                     this.bp.Ll(false);
                     this.SL(this.bp);
                  }

                  this.Ub0();
                  return;
               }

               int var81;
               if ((var81 = var73 + 1) < var74.length) {
                  var6 = new cn_0(sm0_0.c0(gc_2.fe0[var73].FZ() + 1720));
                  var46[var73] = var6;
               } else {
                  var6 = new cn_0(sm0_0.c0(gc_2.fe0.length + 1720));
                  var46[var73] = var6;
               }

               cn_0[] var121 = this.ro;
               var6 = new cn_0("-");
               var121[var73] = var6;
               le0_2 var78;
               le0_2 var122 = var78 = new le0_2();
               var59[var73] = var78;
               var122.SL(this.ec[var73]);
               ya_1 var123 = this.DQ.H10().Ze0();
               le0_2[] var79;
               le0_2[] var10003 = var79 = new le0_2[3];
               var79[0] = var46[var73];
               var79[1] = this.ro[var73];
               var10003[2] = var59[var73];
               var65.X20(var123.LPt3(var10003).Ze0());
               fy_2 var10001 = this.DQ;
               le0_2[] var80;
               le0_2[] var124 = var80 = new le0_2[3];
               var80[0] = var46[var73];
               var80[1] = this.ro[var73];
               var124[2] = var59[var73];
               var70.X20(var10001.hb(var124));
               var73 = var81;
            }
         }

         ae0_1 var58;
         var58 = new ae0_1();
         var57[var45] = var58;
         var45++;
      }
   }

   public final ap_0 Os() {
      return this.coM1;
   }

   public final void y0(byte var1, cq_0 var2) {
      if (var2 != null) {
         cq_0 var3;
         if (var2.iv0 > 0 && var1 > 0) {
            mp_1 var10000 = mp_1.vf0();
            short var26 = (short)(var2.iv0 + var1 - 1);
            var3 = (cq_0)var10000.k2.get(var26);
         } else {
            var3 = var2;
         }

         this.j8 = (byte)var1;
         this.OE0 = var2;
         P8 var4 = this.else$;
         if (this.else$.eE) {
            byte var34 = 0;
            var4.Zd((com2__3)var4.g6.get(var34));
         } else {
            var4.Ll(true);
            this.rD0.Ll(false);
            if (tw0_0.kz0()) {
               this.bp.Ll(true);
            }
         }

         this.M40.Xr0(0);
         this.Te0.Xr0(0);
         this.bQ.Xr0(0);
         DecimalFormat var35;
         var35 = new DecimalFormat("000");
         boolean seen = this.coM1.ID0((byte)0, var2.dR);
         boolean caught = this.coM1.ID0((byte)1, var2.dR);
         boolean formSeen;
         if (var2.ar > 1) {
            if (this.coM1.hs0(var2.dR) == 0) {
               formSeen = seen && var1 == 0;
               caught = caught && var1 == 0;
            } else {
               formSeen = this.coM1.H6((byte)0, var1, var2.dR);
               caught = this.coM1.H6((byte)1, var1, var2.dR);
            }
         } else {
            formSeen = seen;
         }

         this.Gt.pw0(formSeen);
         xe_1 var8 = this.E9;
         boolean hasForms = var2.ar > 1;
         var8.pw0(hasForms);
         var8 = this.E9;
         var8.Ll(hasForms);
         int[] var122 = null;
         short spriteId = yh_0.Ed(var1, var2.dR);
         yh_0 var10;
         yh_0 var185 = var10 = yh_0.Xm0;
         AG0[] var11;
         AG0 var12 = (var11 = yh_0.Xm0.Kr0((byte)0, spriteId, false, false))[0];
         if (var185.kJ((byte)0, spriteId, false, false)) {
            var122 = var10.R6((byte)0, spriteId, false, false);
         } else {
            var11 = null;
         }

         int spriteX = 80 - var12.d3().bz / 2;
         int var165 = 80 - var12.d3().xZ / 2;
         if (var11 != null && var11.length > 2) {
            this.OI0.og.o60(var11);
            this.OI0.og.aL(var122);
            this.OI0.og.G1 = true;
         } else {
            this.OI0.og.o60(new AG0[]{var12});
         }

         this.OI0.og.EJ0 = 2.0F;
         int var124;
         if (tw0_0.kz0()) {
            float var211 = spriteX;
            Br0 var123 = this.OI0.og;
            spriteX = (int)(var211 - (this.OI0.og.IF / 2.0F - 20.0F));
            var124 = (int)(var165 - (var123.gx0 / 2.0F - 40.0F));
         } else {
            float var212 = spriteX;
            Br0 var125 = this.OI0.og;
            spriteX = (int)(var212 - (this.OI0.og.IF / 2.0F - 7.0F));
            var124 = (int)(var165 - (var125.gx0 / 2.0F - 20.0F));
         }

         Br0 var166;
         Br0 var213 = var166 = this.OI0.og;
         var166.gY = spriteX;
         var213.a4 = var124;
         if (formSeen) {
            var166.wx0(null);
         } else {
            gn_0 var126;
            var126 = new gn_0((byte)0, (byte)0, (byte)0, (byte)127);
            var166.wx0(var126);
         }

         if (seen) {
            S70 var186 = this.OI0;
            StringBuilder var62;
            var62 = new StringBuilder();
            var186.Sk(ig_0.u9(1705, var62, " ").append(var35.format(var2.MN(this.Gg))).append(" ").append(var2.Ay(false)).toString());
            StringBuilder var63;
            var63 = new StringBuilder();
            this.Hy(ig_0.u9(1705, var63, " ").append(var35.format(var2.MN(this.Gg))).append(" ").append(var2.Ay(false)).toString());
         } else {
            S70 var187 = this.OI0;
            StringBuilder var64;
            var64 = new StringBuilder();
            var187.Sk(ig_0.u9(1705, var64, " ").append(var35.format(var2.MN(this.Gg))).append(" ???").toString());
            StringBuilder var65;
            var65 = new StringBuilder();
            this.Hy(ig_0.u9(1705, var65, " ").append(var35.format(var2.MN(this.Gg))).append(" ???").toString());
         }

         this.jo.ML.clear();

         for (int var36 = 0; var36 < this.ec.length; var36++) {
            this.ro[var36].Sk("?");
            this.ec[var36].aE(0.0F);
         }

         X50 var196;
         boolean var216;
         if (caught) {
            ba0_1 var188 = this.oh0;
            lpt6__2 var37 = lpt6__2.Q80;
            int descriptionKey = tw0_0.Ll0.Qz0.z40.ie.equals("IRA") ? 236 : 235;
            short speciesId = var2.dR;
            String[] var127 = sm0_0.zb0;
            var188.Sk(sm0_0.Bw((byte)2, var37, descriptionKey, speciesId, var127));
            this.oh0.lt0();
            short var67 = 260;
            this.tK.Sk(sm0_0.Bw((byte)2, var37, var67, speciesId, var127));
            this.QE0.og.r8(new LPT6_[]{fn_0.qz0().jJ0(var3.OE0((byte)var1).j40)});
            if (var3.OE0((byte)var1) != var3.F70((byte)var1)) {
               this.NK.og.r8(new LPT6_[]{fn_0.qz0().jJ0(var3.F70((byte)var1).j40)});
            } else {
               this.NK.og.lo0();
            }

            byte var38;
            Br0 var189;
            byte var10002;
            if (tw0_0.kz0()) {
               if (this.NK.og.AU()) {
                  var189 = this.QE0.og;
                  var213 = this.QE0.og;
                  var10002 = -110;
                  var38 = -6;
               } else {
                  Br0 var190 = this.QE0.og;
                  byte var39 = -6;
                  this.QE0.og.gY = -210;
                  var190.a4 = var39;
                  var189 = this.NK.og;
                  var213 = this.NK.og;
                  var10002 = -115;
                  var38 = -6;
               }
            } else {
               if (this.NK.og.AU()) {
                  var189 = this.QE0.og;
               } else {
                  Br0 var191 = this.QE0.og;
                  byte var40 = 0;
                  this.QE0.og.gY = -115;
                  var191.a4 = var40;
                  var189 = this.NK.og;
               }

               var213 = var189;
               var10002 = -65;
               var38 = 0;
            }

            var213.gY = var10002;
            var189.a4 = var38;
            int var41 = 0;

            while (true) {
               gc_2[] var68 = gc_2.fe0;
               if (var41 >= gc_2.fe0.length) {
                  this.ro[6].Sk("" + (var3.zq + var3.sE0 + var3.yi0 + var3.ce0 + var3.wL0 + var3.this$));
                  this.ec[6].aE((float)(var3.zq + var3.sE0 + var3.yi0 + var3.ce0 + var3.wL0 + var3.this$) / ts0[6]);
                  String var42 = "";
                  gc_2[] var69 = gc_2.ME;
                  int statTypeCount = gc_2.ME.length;

                  for (int var128 = 0; var128 < statTypeCount; var128++) {
                     gc_2 var152;
                     if (!(var152 = var69[var128]).j8 && var2.HG0[var152.v10] > 0) {
                        if (!var42.isEmpty()) {
                           var42 = var42.concat(", ");
                        }

                        var42 = AN.nK0(var42, "+").append(var2.HG0[var152.v10]).append(" ").append(var152).toString();
                     }
                  }

                  if (var3.Lh(0) != var3.Lh(1) && var3.Lh(1) >= 1) {
                     this.G50.Sk(sm0_0.c0(var3.Lh(0) + 210000) + " / " + sm0_0.c0(var3.Lh(1) + 210000));
                  } else {
                     this.G50.Sk(sm0_0.c0(var3.Lh(0) + 210000));
                  }

                  cn_0 var192 = this.G50;
                  this.G50.yj0 = lb0_2.ZV(var3);
                  var192.yB0();
                  this.G50.GH0 = 100;
                  cq_0 var70 = var3.ng;
                  if (var3.ng == null) {
                     var70 = var3;
                  }

                  var67 = var70.dR;
                  if (var3.h5[2] > 0 && (S.J9(var67, h50_0.im) || S.J9(var67, h50_0.av0))) {
                     this.Ch0.Sk(sm0_0.c0(var3.Lh(2) + 210000));
                     cn_0 var193 = this.Ch0;
                     this.Ch0.yj0 = lb0_2.Xm(var3);
                     var193.yB0();
                     this.Ch0.GH0 = 100;
                     if (!this.JS.t30.j4(this.Wh, true)) {
                        this.JS.F9(5, this.Wh);
                     }
                  } else {
                     this.JS.u3(this.Wh);
                  }

                  HashSet var72 = var3.lD;
                  if (var3.lD.size() <= 0) {
                     this.Lg0.Sk(sm0_0.c0(var3.gq0.R5));
                  } else {
                     StringBuilder var93;
                     StringBuilder var215 = var93 = new StringBuilder();
                     var215.append(sm0_0.c0(var3.gq0.R5));
                     var215.append(" / ");
                     int var129 = 0;
                     Iterator var153 = var72.iterator();

                     while (var153.hasNext()) {
                        N2 var167;
                        if ((var167 = (N2)var153.next()) != null) {
                           int var194 = ++var129;
                           var93.append(sm0_0.c0(var167.R5));
                           if (var194 < var72.size()) {
                              var93.append(" / ");
                           }
                        }
                     }

                     this.Lg0.Sk(var93.toString());
                  }

                  if (var42.isEmpty()) {
                     var42 = "None";
                  }

                  this.aT.Sk(var42);
                  lpt6__2 var43 = lpt6__2.Q80;
                  var67 = 245;
                  int var94 = var2.dR;
                  String[] var130 = sm0_0.zb0;
                  this.lw0.Sk(sm0_0.Bw((byte)2, var43, var67, var94, var130));
                  var67 = 268;
                  var94 = var2.dR;
                  this.Oi.Sk(sm0_0.Bw((byte)2, var43, var67, var94, var130));
                  short[] var44 = var2.rA0;
                  if (var2.rA0.length <= 0) {
                     this.Su.Sk(sm0_0.c0(nf0_0.Po));
                  } else {
                     StringBuilder var75;
                     var75 = new StringBuilder();
                     var94 = 1;

                     for (int var131 = 0; var131 < var44.length; var94++) {
                        var75.append(sm0_0.c0(gu0.l2.lPT6(var44[var131]).Nl));
                        if (++var131 < var44.length) {
                           var75.append(", ");
                           if (var94 % 2 == 0) {
                              var75.append("\n");
                           }
                        }
                     }

                     this.Su.Sk(var75.toString());
                  }

                  String var45 = "";
                  au_1 var76 = var2.B2;
                  au_1 var97 = var2.Cw;
                  au_1[] var98;
                  if (var2.B2 == var2.Cw) {
                     (var98 = new au_1[1])[0] = var76;
                  } else {
                     au_1[] var132;
                     au_1[] var195 = var132 = new au_1[2];
                     var195[0] = var76;
                     var195[1] = var97;
                     var98 = var132;
                  }

                  for (au_1 var154 : var98) {
                     if (!var45.isEmpty()) {
                        var45 = var45.concat(", ");
                     }

                     var45 = var45 + sm0_0.c0(var154.zc + 181000);
                  }

                  this.GT.Sk(var45);
                  var196 = this.jo.W20;
                  var216 = true;
                  break;
               }

               this.ro[var41].Sk(Integer.toString(var3.Fb(var68[var41])));
               this.ec[var41].aE((float)var3.Fb(var68[var41]) / ts0[var41]);
               var41++;
            }
         } else {
            this.oh0.Sk("?????");
            this.tK.Sk("????? " + sm0_0.c0(0));
            this.QE0.og.lo0();
            this.NK.og.lo0();
            this.aT.Sk("?????");
            this.GT.Sk("?????");
            this.lw0.Sk("?????");
            this.Oi.Sk("?????");
            this.G50.Sk("?????");
            cn_0 var197 = this.G50;
            this.G50.yj0 = "";
            var197.yB0();
            this.Lg0.Sk("?????");
            this.Su.Sk("?????");
            cq_0 var46 = var3.ng;
            if (var3.ng == null) {
               var46 = var3;
            }

            short var47 = var46.dR;
            if (var3.h5[2] <= 0 || !S.J9(var47, h50_0.im) && !S.J9(var47, h50_0.av0)) {
               this.JS.u3(this.Wh);
            } else {
               this.Ch0.Sk("?????");
            }

            var196 = this.jo.W20;
            var216 = false;
         }

         var196.U10 = var216;

         for (Object value : var3.WC) {
            pu0_0 var78 = (pu0_0)value;
            xk0_2 var198 = this.jo;
            eo0_0 var99;
            eo0_0 var217;
            short var79 = var78.HA0;
            var217 = var99 = new eo0_0(var79, var78.yL, null, null);
            var198.ML.add(var99);
         }

         HashSet var49;
         var49 = new HashSet();
         wx_2 var80;
         var80 = new wx_2();
         Iterator var100 = gu0.l2.Pd0.values().iterator();

         while (var100.hasNext()) {
            mc0_1 var134;
            String var155;
            if (!var49.contains(var155 = sm0_0.c0((var134 = (mc0_1)var100.next()).Nl))) {
               var49.add(var155);
               short var156 = var134.wb0;
               if (var134.wb0 > 0 && var3.dG(Wx0.rz, var156)) {
                  xk0_2 var220 = this.jo;
                  eo0_0 var157;
                  var157 = new eo0_0(var134.wb0, (byte)0, null, var134);
                  var220.ML.add(var157);
                  var80.TI0(var134.wb0);
               }
            }
         }

         short[] var50;
         int itemMoveCount = (var50 = var3.r50[4]).length;

         for (int var135 = 0; var135 < itemMoveCount; var135++) {
            short var158;
            if (!var80.bL0(var158 = var50[var135])) {
               xk0_2 var199 = this.jo;
               eo0_0 var168;
               var168 = new eo0_0(var158, (byte)0, Wx0.rz, null);
               var199.ML.add(var168);
            }
         }

         short[] var51;
         int levelMoveCount = (var51 = var3.r50[3]).length;

         for (int var102 = 0; var102 < levelMoveCount; var102++) {
            short var136 = var51[var102];
            xk0_2 var200 = this.jo;
            eo0_0 var159;
            var159 = new eo0_0(var136, (byte)0, Wx0.Z8, null);
            var200.ML.add(var159);
         }

         wx_2 var52;
         var52 = new wx_2();
         wx_2 var82;
         var82 = new wx_2();

         for (cq_0 var103 = var2; var103 != null && !var52.bL0(var103.dR); var103 = var103.By) {
            cq_0 var137;
            if (var103.iv0 > 0 && var1 > 0) {
               mp_1 var201 = mp_1.vf0();
               short var138 = (short)(var103.iv0 + var1 - 1);
               var137 = (cq_0)var201.k2.get(var138);
            } else {
               var137 = var103;
            }

            var52.TI0(var103.dR);
            short[] var139;
            int evolutionMoveCount = (var139 = var137.r50[0]).length;

            for (int var169 = 0; var169 < evolutionMoveCount; var169++) {
               short var176;
               if (!var82.bL0(var176 = var139[var169])) {
                  var82.TI0(var176);
                  xk0_2 var202 = this.jo;
                  eo0_0 var182;
                  var182 = new eo0_0(var176, (byte)0, Wx0.zE0, null);
                  var202.ML.add(var182);
               }
            }
         }

         short[] var13;
         int var53 = (var13 = var3.r50[1]).length;

         for (int var83 = 0; var83 < var53; var83++) {
            short var104 = var13[var83];
            xk0_2 var203 = this.jo;
            eo0_0 var140;
            var140 = new eo0_0(var104, (byte)0, Wx0.Ps, null);
            var203.ML.add(var140);
         }

         short[] var14;
         int var54 = (var14 = var3.r50[2]).length;

         for (int var84 = 0; var84 < var54; var84++) {
            short var105 = var14[var84];
            xk0_2 var204 = this.jo;
            eo0_0 var141;
            var141 = new eo0_0(var105, (byte)0, Wx0.ly0, null);
            var204.ML.add(var141);
         }

         short[] var15;
         int var55 = (var15 = var3.r50[5]).length;

         for (int var85 = 0; var85 < var55; var85++) {
            short var106 = var15[var85];
            xk0_2 var205 = this.jo;
            eo0_0 var142;
            var142 = new eo0_0(var106, (byte)0, Wx0.wy, null);
            var205.ML.add(var142);
         }

         short[] var16;
         int var27 = (var16 = var3.r50[6]).length;

         for (int var56 = 0; var56 < var27; var56++) {
            short var86 = var16[var56];
            xk0_2 var206 = this.jo;
            eo0_0 var107;
            var107 = new eo0_0(var86, (byte)0, Wx0.const$, null);
            var206.ML.add(var107);
         }

         this.jo.Wg0();
         lg_0.k.lPT5(this.eW::COm3);
         this.lpT6.pJ0.Ja0();
         this.lpT6.L4.Ja0();
         String var17 = sm0_0.c0(1776);
         String var28 = sm0_0.c0(1777);
         String var57 = sm0_0.c0(1778);
         String var87 = sm0_0.c0(1779);
         String var108 = sm0_0.c0(1781);
         this.qx(true, var17, var28, var57, var87, var108, true);
         dh0_0 var18 = dh0_0.FK0;
         short var29 = var2.dR;
         hc_1 var58;
         if ((var58 = (hc_1)dh0_0.FK0.r10.f5(var29)) == null) {
            var58 = new hc_1(var29);
            var18.r10.coM4(var29, var58);
         }

         ArrayList var19;
         if ((var19 = var58.nUl()).isEmpty()) {
            int regionIndex = S.os0(var2.Nm(), tw0_0.rl.yI());
            if (regionIndex != -1 && tw0_0.rl.hz().Hh0(var2.Nm())) {
               String var22 = N50.k10((byte)regionIndex);
               if (tw0_0.rl.IW(var2.Nm())) {
                  String var30 = sm0_0.c0(1765);
                  String var59 = sm0_0.c0(1767);
                  this.qx(true, "--", var22, var30, "50", var59, false);
               } else {
                  BR var207 = tw0_0.rl;
                  short var221 = var2.Nm();
                  var207.getClass();
                  tc_1[] var31;
                  int var60 = (var31 = Ge0.JW(var221)).length;

                  for (int var88 = 0; var88 < var60; var88++) {
                     String var109 = sm0_0.c0(var31[var88].Q3());
                     String var119 = sm0_0.wa0(1766, var22);
                     String var143 = sm0_0.c0(1767);
                     this.qx(true, var109, var22, var119, "???", var143, false);
                  }
               }
            } else {
               String var21 = sm0_0.c0(1791);
               this.qx(true, "--", "--", var21, "--", "--", false);
            }
         } else {
            Collections.sort(var19, this::Ha);

            for (Object value : var19) {
               this.Jt0(formSeen, (OD)value);
            }
         }

         this.lpT6.lt0();
         lg_0.k.lPT5(this.gq0::COm3);
         this.BZ.kl0().Ja0();
         this.BZ.nt0().Ja0();
         this.BZ.kl0().Ze0();
         rm0_0 var24;
         var24 = new rm0_0(var2);
         boolean var25 = true;
         byte var33;
         if (tw0_0.kz0()) {
            var33 = 92;
         } else {
            var33 = 46;
         }

         for (Object value : var24.FX.values()) {
            ZR var89 = (ZR)value;
            qj_2[] var110 = new qj_2[0];

            for (int var120 = 0; var120 < 2; var120++) {
               if (var120 == 0) {
                  if (var25) {
                     var25 = false;
                     continue;
                  }

                  int connectorCount = Math.max(var89.Jc.values().toArray(new cq_0[0]).length, var89.Rw0.values().toArray(new P80[0]).length);
                  qj_2[] var144 = new qj_2[connectorCount];

                  for (int var161 = 0; var161 < connectorCount; var161++) {
                     qj_2 var170;
                     qj_2 var208 = var170 = new qj_2("\u2500\u27a4", var33, var33);
                     var144[var161] = var170;
                     var208.uf("monsterdex-button-evo-tree");
                  }

                  var110 = var144;
               } else {
                  label341: {
                     qj_2[] var162;
                     if (var89.Jc.values().toArray(new cq_0[0]).length > 0) {
                        cq_0[] var112;
                        int var145;
                        var162 = new qj_2[var145 = (var112 = (cq_0[])var89.Jc.values().toArray(new cq_0[0])).length];

                        for (int var171 = 0; var171 < var145; var171++) {
                           nc_0 var177;
                           nc_0 var222;
                           cq_0 var10007 = var112[var171];
                           byte var178 = this.Gg;
                           var222 = var177 = new nc_0(asBridge(), var10007, (byte)0, var178);
                           var162[var171] = var177;
                           var222.SU("");
                           var162[var171].sl().Gy0(5, 2);
                        }

                        int currentLevel = var89.mn0;
                        ZR var114;
                        if ((
                              (var114 = (ZR)var24.FX.get(currentLevel + 1)) != null && Math.max(var114.Jc.size(), var114.Rw0.size()) != 0
                                 ? Math.max(var114.Jc.size(), var114.Rw0.size()) | 1
                                 : 0
                           )
                           > (var145 | 1)) {
                           int nextLevelWidth;
                           ZR var116;
                           if ((var116 = (ZR)var24.FX.get(currentLevel + 1)) != null && Math.max(var116.Jc.size(), var116.Rw0.size()) != 0) {
                              nextLevelWidth = Math.max(var116.Jc.size(), var116.Rw0.size()) | 1;
                           } else {
                              nextLevelWidth = 0;
                           }

                           qj_2[] var172 = new qj_2[nextLevelWidth];

                           for (int var179 = 0; var179 < nextLevelWidth; var179++) {
                              qj_2 var183;
                              qj_2 var209 = var183 = new qj_2("\u2500\u27a4", var33, var33);
                              var172[var179] = var183;
                              var209.uf("monsterdex-button-evo-tree");
                           }

                           int var180;
                           int var210 = var180 = nextLevelWidth - var145;
                           int padding = var180 / 2;
                           System.arraycopy(var162, 0, var172, padding, var145);
                           if (var210 >= 2) {
                              var172[0].SU("\u250c\u2500");
                              var172[nextLevelWidth - 1].SU("\u2514\u2500");
                              if (var180 >= 4) {
                                 var172[1].SU("\u251c\u2500");
                                 var172[nextLevelWidth - 2].SU("\u251c\u2500");
                              }
                           }

                           var110 = var172;
                           break label341;
                        }
                     } else {
                        if (var89.Rw0.values().toArray(new P80[0]).length <= 0) {
                           break label341;
                        }

                        P80[] var118;
                        int var146;
                        var162 = new qj_2[var146 = (var118 = (P80[])var89.Rw0.values().toArray(new P80[0])).length];

                        for (int var173 = 0; var173 < var146; var173++) {
                           fj0_0 var181;
                           var181 = new fj0_0(var118[var173], this.coM1, var33);
                           var162[var173] = var181;
                        }
                     }

                     var110 = var162;
                  }
               }

               if (var110.length > 0 && var110.length % 2 == 0) {
                  qj_2[] var147 = new qj_2[var110.length + 1];

                  for (int var164 = 0; var164 < var110.length; var164++) {
                     byte var174;
                     if (var164 >= var110.length / 2) {
                        var174 = 1;
                     } else {
                        var174 = 0;
                     }

                     int var175 = var164 + var174;
                     var147[var175] = var110[var164];
                  }

                  var147[var110.length / 2] = new qj_2("", var33, var33);
                  var147[var110.length / 2].Ll(false);
                  var110 = var147;
               }

               this.BZ.nt0().X20(this.BZ.H10().Ze0().LPt3(var110).Ze0());
               this.BZ.kl0().X20(this.BZ.hb(var110));
            }
         }

         this.BZ.kl0().Ze0();
      }
   }

   public final void Ub0() {
      fy_2 pages = new fy_2();
      I7 horizontalPages = new I7(pages);
      Hm0 verticalPages = new Hm0(pages);
      nc_0[] pageCards = new nc_0[12];
      int cardsOnPage = 0;
      int caughtCount = 0;
      int formCaughtCount = 0;
      int seenCount = 0;
      int fullyCaughtCount = 0;
      int eligibleCount = 0;
      int totalCount = 0;

      ArrayList<cq_0> nationalDex = new ArrayList<>();
      for (Object value : mp_1.vf0().k2.values()) {
         cq_0 pokemon = (cq_0)value;
         cq_0 base = pokemon.ng == null ? pokemon : pokemon.ng;
         if (S.J9(base.dR, h50_0.im) || base.jD) {   // 白名单 或 可获得种族(obtainable): 新增精灵自动进入图鉴, 与编号无关
            nationalDex.add(pokemon);
         }
      }

      int nationalDexCount = nationalDex.size();
      int regionChoice = this.zu0.mu0.Mw0;
      if (regionChoice >= this.gd.j5) {
         throw new ArrayIndexOutOfBoundsException(regionChoice);
      }

      this.Gg = this.gd.DK0[regionChoice];
      int typeChoice = this.Yv0.mu0.Mw0;
      N2 selectedType = typeChoice < 1 ? null : N2.HP[typeChoice - 1];
      ArrayList<nc_0> matchingCards = new ArrayList<>();
      String searchTerm = tx_1.J10(((wn0_0)this.tF0.dI0).YA.toString(), true);
      ArrayList<cq_0> entries;
      if (this.Gg == -2) {
         entries = new ArrayList<>();
         for (Object value : mp_1.vf0().k2.values()) {
            cq_0 pokemon = (cq_0)value;
            cq_0 base = pokemon.ng == null ? pokemon : pokemon.ng;
            if (S.J9(base.dR, h50_0.im) || base.jD) {   // 白名单 或 可获得种族(obtainable): 新增精灵自动进入图鉴, 与编号无关
               entries.add(pokemon);
            }
         }
         Collections.sort(entries, Comparator.comparingInt(pokemon -> pokemon.MN(this.Gg)));
      } else {
         entries = mp_1.vf0().GG(this.Gg);
      }

      for (cq_0 pokemon : entries) {
         if (this.coM1.ID0((byte)1, pokemon.dR)) {
            caughtCount++;
            seenCount++;
            if (this.coM1.ID0((byte)2, pokemon.dR)) {
               formCaughtCount++;
            }
            if (this.coM1.ID0((byte)3, pokemon.dR)) {
               fullyCaughtCount++;
            }
            eligibleCount++;
            totalCount++;
         } else if (this.coM1.ID0((byte)0, pokemon.dR)) {
            seenCount++;
            totalCount++;
            if (!pokemon.Hd) {
               eligibleCount++;
            }
         } else if (!pokemon.Hd) {
            totalCount++;
            eligibleCount++;
         }

         if (this.tF0.yy() > 0 && (!tx_1.qp0(tx_1.J10(pokemon.Ay(false), false), searchTerm) || !this.coM1.ID0((byte)0, pokemon.dR))) {
            continue;
         }
         if (this.Cs0.ER.U20() && !this.coM1.ID0((byte)0, pokemon.dR)) {
            continue;
         }

         if (selectedType != null) {
            if (pokemon.iv0 > 0) {
               for (int form = 0; form < pokemon.ar; form++) {
                  short formId = form > 0 ? (short)(pokemon.iv0 + form - 1) : pokemon.dR;
                  cq_0 formPokemon = (cq_0)mp_1.vf0().k2.get(formId);
                  if (formPokemon.gq0 == selectedType || formPokemon.lD.contains(selectedType)) {
                      nc_0 card = new nc_0(asBridge(), pokemon, (byte)form, this.Gg);
                     pageCards[cardsOnPage] = card;
                     matchingCards.add(card);
                     if (++cardsOnPage % 12 == 0) {
                        cardsOnPage = 0;
                        horizontalPages.X20(new Hm0(pages).LPt3(pageCards));
                        verticalPages.X20(new I7(pages).LPt3(pageCards));
                     }
                  }
               }
               continue;
            }
            if (pokemon.gq0 != selectedType && !pokemon.lD.contains(selectedType)) {
               continue;
            }
         }

         nc_0 card = new nc_0(asBridge(), pokemon, (byte)-1, this.Gg);
         pageCards[cardsOnPage] = card;
         matchingCards.add(card);
         if (++cardsOnPage % 12 == 0) {
            cardsOnPage = 0;
            horizontalPages.X20(new Hm0(pages).LPt3(pageCards));
            verticalPages.X20(new I7(pages).LPt3(pageCards));
         }
      }

      this.GH0 = matchingCards.toArray(new nc_0[0]);
      if (cardsOnPage > 0) {
         nc_0[] partialPage = new nc_0[cardsOnPage];
         System.arraycopy(pageCards, 0, partialPage, 0, cardsOnPage);
         horizontalPages.X20(new Hm0(pages).LPt3(partialPage));
         verticalPages.X20(new I7(pages).LPt3(partialPage));
      }

      this.iv0.aE((float)seenCount / totalCount);
      this.OR.aE((float)caughtCount / eligibleCount);
      this.Cq0.aE((float)formCaughtCount / eligibleCount);
      this.T4.aE((float)fullyCaughtCount / nationalDexCount);
      this.Hi0.Sk(sm0_0.c0(1701) + " " + seenCount + " / " + totalCount);
      this.Ac.Sk(sm0_0.c0(1702) + " " + caughtCount + " / " + eligibleCount);
      this.ax.Sk(sm0_0.c0(1728) + " " + formCaughtCount + " / " + eligibleCount);
      this.O30.Sk(sm0_0.c0(1762) + " " + fullyCaughtCount + " / " + nationalDexCount);
      pages.x40(horizontalPages);
      pages.WQ(verticalPages);
      this.pu.AH0(pages);
      this.K8();
      this.of = 0;
      Qy0.yI0.zm0();
   }

   public final void a80(Jn0 var1) {
   }

   public final void K8() {
      super.K8();
      int var1 = this.pu.Mx;
      this.Te0.oY(var1, this.pu.OB);
      var1 = this.pu.Mx;
      this.bQ.oY(var1, this.pu.OB);
      var1 = this.pu.Mx;
      this.M40.oY(var1, this.pu.OB);
      ae0_1[] var10 = this.ec;
      int var2 = this.ec.length;

      for (int var3 = 0; var3 < var2; var3++) {
         ae0_1 var4 = var10[var3];
         int var5 = 250;
         byte var6;
         if (tw0_0.kz0()) {
            var6 = 12;
         } else {
            var6 = 8;
         }

         var4.oY(var5, var6);
         var4.K20.getClass();
         var5 = var4.A20;
         int var27 = var4.K20.SB0 - var4.OB / 2;
         var4.sy(var5, var4.K20.OB / 2 + var27);
      }

      if (tw0_0.kz0()) {
         var1 = tw0_0.LD0.Hv0();
         this.oY(tw0_0.LD0.ew0(), var1);
         byte var12 = 0;
         this.E40(0, var12);
         P8 var13 = this.else$;
         this.else$.E40(this.else$.A20, var13.SB0 + 60);
         P8 var14 = this.else$;
         this.else$.oY(this.else$.Mx, var14.OB - 120);
         this.bp.oY(114, 114);
         this.bp.E40(this.cz() - this.bp.Mx - 30, this.VM() - this.bp.OB - 70);
      } else {
         var1 = super.OB;
         this.RY(670, var1);
      }

      var1 = this.pu.Mx;
      this.BZ.RY(var1, this.pu.OB);
      fy_2 var32 = this.BZ;
      fy_2 var10001 = this.BZ;
      fy_2 var17;
      fy_2 var33 = var17 = this.BZ;
      this.BZ.K20.getClass();
      var2 = var33.A20;
      var1 = var10001.K20.SB0 - var17.OB / 2;
      var32.sy(var2, var10001.K20.OB / 2 + var1);
      var1 = 0;
      le0_2[] var22 = this.Ar;
      int var25 = this.Ar.length;

      for (int var28 = 0; var28 < var25; var28++) {
         int var31 = var22[var28].Mx;
         if (var22[var28].Mx > var1) {
            var1 = var31;
         }
      }

      if (var1 > 75) {
         le0_2[] var23 = this.Ar;
         var25 = this.Ar.length;

         for (int var29 = 0; var29 < var25; var29++) {
            var23[var29].RY(var1, 28);
         }
      }

      if (zb0_2.bigCJKFontSizes()) {
         le0_2[] var7;
         var1 = (var7 = this.Ar).length;

         for (int var24 = 0; var24 < var1; var24++) {
            var7[var24].RY(var7[var24].R1(), 32);
         }
      }
   }

   public final void x00() {
      lpt6__0.v90(this);
   }

   public final void N00(zk0_1 var1) {
      super.N00(var1);
      Qy0.yI0.zm0();
   }

   public final void mu0() {
      int var1 = this.of;
      nc_0[] var2 = this.GH0;
      nc_0 var4;
      if (this.of >= this.GH0.length) {
         var4 = null;
      } else {
         var4 = var2[var1];
      }

      if (var4 != null) {
         lpt6__0.v90(var4);
         this.pu.Rn(var4);
         Object var3 = var4.yj0;
         if (var4.yj0 != null) {
            Qy0.yI0.vk(var4, var3, pa0_0.L00);
            return;
         }
      }

      Qy0.yI0.zm0();
   }

   public final boolean nd0(i70_0 var1) {
      if (E00.C10(var1.zu)) {
         Qy0.yI0.zm0();
      }

      if (E00.ZU(var1.zu) && var1.iT()) {
         if (Qy0.af(this)) {
            return super.nd0(var1);
         }

         int var2 = var1.finally$;
         if (this.else$.eE) {
            Qy0.yI0.zm0();
            rp_0 var16 = rp_0.kC0;
            if (rp_0.kC0 != null && var16.Ov(var2)) {
               lo0_0 var22;
               KB var23;
               if (this.else$.Bb() == 1) {
                  var22 = this.M40;
                  var23 = this.M40.g1;
               } else if (this.else$.Bb() == 3) {
                  var22 = this.Te0;
                  var23 = this.Te0.g1;
               } else {
                  if (this.else$.Bb() != 4) {
                     return true;
                  }

                  var22 = this.bQ;
                  var23 = this.bQ.g1;
               }

               var22.Xr0(var23.VP - 20);
               return true;
            }

            var16 = rp_0.synchronized$;
            if (rp_0.synchronized$ != null && var16.Ov(var2)) {
               lo0_0 var10000;
               KB var10001;
               if (this.else$.Bb() == 1) {
                  var10000 = this.M40;
                  var10001 = this.M40.g1;
               } else if (this.else$.Bb() == 3) {
                  var10000 = this.Te0;
                  var10001 = this.Te0.g1;
               } else {
                  if (this.else$.Bb() != 4) {
                     return true;
                  }

                  var10000 = this.bQ;
                  var10001 = this.bQ.g1;
               }

               var10000.Xr0(var10001.VP + 20);
               return true;
            }

            var16 = rp_0.I90;
            if (rp_0.I90 != null && var16.Ov(var2)) {
               this.else$.Lb(-1);
               return true;
            }

            var16 = rp_0.Ni;
            if (rp_0.Ni != null && var16.Ov(var2)) {
               this.else$.Lb(1);
               return true;
            }

            var16 = rp_0.sJ0;
            if (rp_0.sJ0 != null && var16.Ov(var2)) {
               if (this.else$.Bb() == 0) {
                  a7_0.bH(this.Gt.ER.Fc0);
               }

               return true;
            }

            var16 = rp_0.nK0;
            if (rp_0.nK0 != null && var16.Ov(var2)) {
               this.U9();
               return true;
            }

            return super.nd0(var1);
         }

         if (var2 == 34 && var1.J30 == 4) {
            this.tF0.BL();
            return true;
         }

         rp_0 var3 = rp_0.kC0;
         if (rp_0.kC0 != null && var3.Ov(var2)) {
            int var10 = this.of;
            if (this.of < 12) {
               return true;
            }

            this.of = var10 - 12;
            this.mu0();
            return true;
         }

         var3 = rp_0.synchronized$;
         if (rp_0.synchronized$ != null && var3.Ov(var2)) {
            int var9;
            if ((var9 = this.of + 12) < this.GH0.length) {
               this.of = var9;
            }

            this.mu0();
            return true;
         }

         var3 = rp_0.I90;
         if (rp_0.I90 != null && var3.Ov(var2)) {
            int var8 = this.of;
            if (this.of < 1) {
               return true;
            }

            this.of = var8 - 1;
            this.mu0();
            return true;
         }

         var3 = rp_0.Ni;
         if (rp_0.Ni != null && var3.Ov(var2)) {
            int var7;
            if ((var7 = this.of + 1) < this.GH0.length) {
               this.of = var7;
            }

            this.mu0();
            return true;
         }

         var3 = rp_0.sJ0;
         if (rp_0.sJ0 != null && var3.Ov(var2)) {
            nc_0[] var4;
            nc_0 var5;
            int var6;
            if ((var6 = this.of) >= (var4 = this.GH0).length) {
               var5 = null;
            } else {
               var5 = var4[var6];
            }

            if (var5 != null) {
               a7_0.bH(var5.ER.Fc0);
               Qy0.yI0.zm0();
            }

            return true;
         }

         var3 = rp_0.nK0;
         if (rp_0.nK0 != null && var3.Ov(var2)) {
            BU.T50.LV();
            return true;
         }
      }

      return super.nd0(var1);
   }

   public final void U9() {
      P8 var1 = this.else$;
      boolean var10000 = this.else$.eE;
      var1.Ll(false);
      this.rD0.Ll(true);
      this.Hy(sm0_0.c0(1));
      if (var10000) {
         byte var2 = 0;
         this.else$.Zd((com2__3)this.else$.g6.get(var2));
      }

      if (tw0_0.kz0()) {
         this.bp.Ll(false);
      }

      this.OE0 = null;
   }

   public final void Jt0(boolean var1, OD var2) {
      byte var3 = var2.vp;
      if (var2.vp == -1 || var3 == c8_0.JD0.YG()) {
         String var9 = sm0_0.c0(var2.Bx.n10);
         String var4 = var2.cc + " - " + var2.f50;
         if (var2.cc == var2.f50) {
            var4 = fp0_0.uD(new StringBuilder(), var2.cc, "");
         }

         String var5 = "???";
         if (var2.CV((short)1)) {
            var5 = sm0_0.c0(1774);
         }

         if (var2.CV((short)2)) {
            var5 = sm0_0.c0(1782);
         } else if (var2.CV((short)4)) {
            var5 = sm0_0.c0(1783);
         } else if (var2.CV((short)8)) {
            var5 = sm0_0.c0(1784);
         } else if (var2.CV((short)16)) {
            var5 = sm0_0.c0(1773);
         } else if (var2.CV((short)64)) {
            var5 = sm0_0.c0(1795);
         } else if (var2.CV((short)128)) {
            var5 = sm0_0.c0(1799);
         } else if (var2.CV((short)256)) {
            var5 = sm0_0.c0(1794);
         }

         String var6 = sm0_0.hL0(var2.wD0 * 1000 + 140000 + (var2.Tv0 & 255), "???");
         if (var2.CV((short)32)) {
            var6 = sm0_0.c0(1798);
            var9 = var6;
         }

         if (var2.COM5()) {
            ArrayList var7;
            var7 = new ArrayList();
            if (var2.E50((byte)1)) {
               var7.add(sm0_0.c0(ZJ0.qL(ZJ0.jw0)));
            }

            if (var2.E50((byte)2)) {
               var7.add(sm0_0.c0(ZJ0.qL(ZJ0.Ih0)));
            }

            if (var2.E50((byte)4)) {
               var7.add(sm0_0.c0(ZJ0.qL(ZJ0.Pw)));
            }

            if (var7.size() > 0) {
               StringBuilder var12;
               StringBuilder var10002 = var12 = new StringBuilder();
               var10002.append(var6);
               var10002.append(" (");
               int var11 = var7.size();
               Iterator var8 = var7.iterator();

               while (var8.hasNext()) {
                  var12.append((String)var8.next());
                  if (var11 > 1) {
                     var12.append("/");
                     var11--;
                  }
               }

               var12.append(")");
               var6 = var12.toString();
            }
         }

         int var13;
         if ((var13 = COM6_.aux[var2.Bx.wx0]) != 1) {
            if (var13 == 2) {
               var3 = var2.Ks0;
               if (var2.Ks0 < 0 || var2.wD0 == 2) {
                  var3 = 2;
               }

               var9 = sm0_0.c0(var3 + 245445);
            }
         } else {
            byte var14 = var2.Ks0;
            if (var2.Ks0 != 1) {
               if (var14 == 2) {
                  var9 = sm0_0.c0(1793);
               }
            } else {
               var9 = sm0_0.c0(1792);
            }
         }

         this.qx(var1, var9, N50.k10(var2.wD0), var6, var4, var5, false);
      }
   }

   public final void qx(boolean var1, String var2, String var3, String var4, String var5, String var6, boolean var7) {
      cn_0 var8 = new cn_0(null, 0);
      if (!var1) {
         var2 = "???";
      }
      var8.Sk(var2);
      cn_0 var12 = new cn_0(null, 0);
      if (!var1) {
         var3 = "???";
      }
      var12.Sk(var3);
      cn_0 var13 = new cn_0(null, 0);
      if (!var1) {
         var4 = "???";
      }
      var13.Sk(var4);
      cn_0 var14 = new cn_0(null, 0);
      if (!var1) {
         var5 = "???";
      }
      var14.Sk(var5);
      cn_0 var11 = new cn_0(null, 0);
      if (!var1) {
         var6 = "???";
      }
      var11.Sk(var6);
      if (var7) {
         var8.uf("label-title-dex-medium");
         var12.uf("label-title-dex-small");
         var13.uf("label-title-dex-name");
         var14.uf("label-title-dex-smallest");
         var11.uf("label-title-dex-medium");
      } else {
         var8.uf("label-value-dex-medium");
         var12.uf("label-value-dex-small");
         var13.uf("label-value-dex-name");
         var14.uf("label-value-dex-smallest");
         var11.uf("label-value-dex-medium");
      }

      var13.lt0();
      fy_2 var9;
      (var9 = this.lpT6).L4.X20(var9.hb(new le0_2[]{var8, var12, var13, var14, var11}));
      fy_2 var10;
      (var10 = this.lpT6).pJ0.X20(var10.C7(new le0_2[]{var8, var12, var13, var14, var11}));
   }

   public final int sw(cq_0 var1) {
      return var1.MN(this.Gg);
   }

   public final int Ha(OD var1, OD var2) {
      if (var1.wD0 == var2.wD0) {
         return var1.kz(var2);
      }

      byte var5 = this.Gg;
      byte var3 = 0;

      while (true) {
         byte[] var4 = N50.DD;
         if (var3 >= 6) {
            var3 = -1;
            break;
         }

         if (var4[var3] == var5) {
            break;
         }

         var3++;
      }

      byte var6 = var1.wD0;
      byte var8 = 0;

      while (true) {
         byte[] var10 = N50.DD;
         if (var8 >= 6) {
            var8 = -1;
            break;
         }

         if (var10[var8] == var6) {
            break;
         }

         var8++;
      }

      byte var7 = var2.wD0;
      byte var9 = 0;

      while (true) {
         byte[] var11 = N50.DD;
         if (var9 >= 6) {
            var9 = -1;
            break;
         }

         if (var11[var9] == var7) {
            break;
         }

         var9++;
      }

      if (var8 == var3) {
         return -1;
      } else {
         return var9 == var3 ? 1 : Integer.compare(var8, var9);
      }
   }

   public final void rc0(int var1) {
      this.Ub0();
   }

   public final void A60() {
      cq_0 var1 = this.OE0;
      this.y0((byte)((this.j8 + 1) % var1.ar), var1);
   }

   public final void sl(ap_0 var1) {
      cq_0 var2 = this.OE0;
      if (this.OE0 != null) {
         byte var3 = 0;
         if (var1.ID0(var3, var2.dR)) {
            di0_0.Hv0(this.OE0.dR, this.j8, 1.0F, 0.0F, false);
         }
      }
   }
}


