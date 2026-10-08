package cn.pokemmo.ui.window.settings;

import f.*;

import java.util.ArrayList;

/**
 * 个人衣橱与时装搭配窗口
 *
 * 原混淆类: f.COm8_
 */
public class WardrobeWindow extends yz_1 {
    public final COm8_ asBridge() {
        return (COm8_) (Object) this;
    }

   public final Mm ip;
   public final fy_2 ga0;
   public final fy_2 Ib;
   public final fy_2 Dy;
   public final cn_0[] lb0;
   public final qj_2[] Sa;
   public final ia0_1[] xm;
   public q10_0 EB0;
   public final jb0_1 COM1;
   public final Au0 uv0;
   public final ia0_1 u60;
   public final xe_1 Iu;
   public final xe_1 x4;
   public byte pG0 = 0;

   public WardrobeWindow() {
      q10_0[] var10000 = q10_0.Pn0;
      q10_0[] var10001 = q10_0.Pn0;
      q10_0[] var10002 = q10_0.Pn0;
      q10_0[] var2;
      q10_0[] var10003 = var2 = q10_0.Pn0;
      jb0_1 var1 = new jb0_1(var2.length);
      this.COM1 = var1;
      j3_0 var12;
      var12 = new j3_0(asBridge());
      this.Pb0(var12);
      this.uf("wardrobe");
      this.Hy(sm0_0.c0(3204));
      this.ff0(1);
      Mm var13;
      Mm var10004 = var13 = new Mm(asBridge(), tw0_0.e60.at());
      this.ip = var13;
      var10004.CF0(3);
      fy_2 var14;
      var14 = new fy_2();
      this.ga0 = var14;
      this.lb0 = new cn_0[var10003.length];
      this.Sa = new qj_2[var10002.length];
      this.xm = new ia0_1[var10001.length];
      ia0_1 var15;
      var15 = new ia0_1();
      int var3 = var10000.length;

      for (int var4 = 0; var4 < var3; var4++) {
         q10_0 var5;
         q10_0 var50 = var5 = var2[var4];
         this.lb0[var5.Th0()] = new cn_0(sm0_0.c0(var5.DE()));
         qj_2 var6;
         qj_2 var61 = var6 = new qj_2("", 48, 40);
         var61.uf("addon-item-picker");
         this.xm[var5.Th0()] = new ia0_1();
         var61.sl().Nk(gh_1.Jh0().S1((short)5459));
         var61.RR(new qu0_0(asBridge(), var5));
         if (var50 == q10_0.Cw0) {
            var15.SL(var6);
            var6.Bb(50);
            var6.Xr0(sm0_0.c0(var5.DE()));
            var6.sl().Nk(gh_1.Jh0().S1((short)5447));
         } else if (var5 == q10_0.Qh0) {
            var15.SL(var6);
            var6.Bb(50);
            var6.Xr0(sm0_0.c0(var5.DE()));
            var6.sl().Nk(gh_1.Jh0().S1((short)5450));
         } else if (var5.Th0() < 5) {
            this.xm[var5.Th0()].SL(var6);
            this.xm[var5.Th0()].SL(this.lb0[var5.Th0()]);
         } else {
            this.xm[var5.Th0()].SL(this.lb0[var5.Th0()]);
            this.xm[var5.Th0()].SL(var6);
         }

         var6.sl().nq0(24, 24);
         var6.sl().Gy0(8, 8);
         this.Sa[var5.Th0()] = var6;
      }

      ia0_1 var26;
      ia0_1 var51 = var26 = new ia0_1(2);
      var51.SL(var15);
      Hm0 var52 = this.ga0.lo0();
      ya_1[] var62 = new ya_1[3];
      I7 var10005 = this.ga0.H10();
      q10_0 var16 = q10_0.Bj0;
      ya_1 var70 = var10005.Kn0(this.xm[q10_0.Bj0.Th0()]);
      q10_0 var30 = q10_0.VI;
      var70 = var70.Kn0(this.xm[q10_0.VI.Th0()]);
      q10_0 var35 = q10_0.uz;
      var70 = var70.Kn0(this.xm[q10_0.uz.Th0()]);
      q10_0 var39 = q10_0.rg0;
      var62[0] = var70.Kn0(this.xm[q10_0.rg0.Th0()]);
      var62[1] = this.ga0.lo0().k5(pa0_0.L00, var26);
      I7 var65 = this.ga0.H10();
      q10_0 var41 = q10_0.bb;
      ya_1 var66 = var65.Kn0(this.xm[q10_0.bb.Th0()]);
      q10_0 var7 = q10_0.Xl;
      ya_1 var67 = var66.Kn0(this.xm[q10_0.Xl.Th0()]);
      q10_0 var8 = q10_0.l3;
      ya_1 var68 = var67.Kn0(this.xm[q10_0.l3.Th0()]);
      q10_0 var9 = q10_0.Ci;
      var62[2] = var68.Kn0(this.xm[q10_0.Ci.Th0()]);
      ya_1 var53 = var52.Xq(var62);
      Hm0 var63 = this.ga0.lo0();
      ya_1[] var64 = new ya_1[5];
      I7 var10008 = this.ga0.H10();
      Hm0 var10009 = this.ga0.lo0();
      ia0_1 var17 = this.xm[var16.Th0()];
      pa0_0 var10 = pa0_0.xE;
      ya_1 var74 = var10009.k5(pa0_0.xE, var17);
      ia0_1 var18 = this.xm[var41.Th0()];
      pa0_0 var42 = pa0_0.up0;
      var64[0] = var10008.X20(var74.k5(pa0_0.up0, var18));
      var64[1] = this.ga0.H10().X20(this.ga0.lo0().k5(var10, this.xm[var30.Th0()]).k5(var42, this.xm[var7.Th0()]));
      var64[2] = this.ga0.H10().X20(this.ga0.lo0().k5(var10, this.xm[var35.Th0()]).k5(var42, this.xm[var8.Th0()]));
      var64[3] = this.ga0.H10().X20(this.ga0.lo0().k5(var10, this.xm[var39.Th0()]).k5(var42, this.xm[var9.Th0()]));
      var64[4] = this.ga0.hb(var26);
      this.ga0.WQ(var63.Xq(var64));
      this.ga0.x40(var53);
      fy_2 var19;
      fy_2 var54 = var19 = new fy_2();
      this.Ib = var19;
      var54.uf("shoplayout");
      Au0 var20;
      var20 = new Au0(asBridge());
      this.uv0 = var20;
      lo0_0 var27;
      var27 = new lo0_0(var20);
      cn_0 var21;
      var21 = new cn_0(sm0_0.wa0(3202, "0"));
      xe_1 var31;
      xe_1 var69 = var31 = new xe_1("Reload addons.pak");
      xe_1 var36;
      (var36 = uz0_0.nJ(var69, () -> lg_0.k.lPT5(COm8_::nj0), "Copy Appearance")).RR(() -> lg_0.k.lPT5(this::qI0));
      var54.WQ(var54.hb(var27, var21, var31, var36));
      var54.x40(var54.C7(var27, var21, var31, var36));
      fy_2 var22;
      fy_2 var55 = var22 = new fy_2();
      this.Dy = var22;
      var55.uf("color-dialog");
      I7 var23 = var55.H10();
      Hm0 var28 = var55.lo0();
      Hm0 var32 = var55.lo0();
      I7 var37 = var55.H10();
      yb_1[] var40;
      yb_1[] var56 = var40 = yb_1.Mh;
      xe_1[] var43 = new xe_1[yb_1.Mh.length];
      int var44 = 0;
      int var45 = var56.length;

      for (int var46 = 0; var46 < var45; var46++) {
         yb_1 var47 = var40[var46];
         qj_2 var11;
         qj_2 var10014 = var11 = new qj_2(null, 20, 20);
         var43[var44] = var11;
         var10014.uf("color-button");
         var43[var44].RY(20, 20);
         var43[var44].oY(20, 20);
         xe_1 var48;
         xe_1 var73 = var48 = var43[var44];
         gn_0 var49;
         var49 = new gn_0(var47.Q2().rR());
         var73.LPT8(new N1(var48, var49));
         var43[var44].RR(new r8_0(asBridge(), var47));
         var32.Kn0(var43[var44]);
         var37.Kn0(var43[var44]);
         if (++var44 % 3 == 0) {
            var23.X20(var32);
            var28.X20(var37);
            var32 = this.Dy.lo0();
            var37 = this.Dy.H10();
         }
      }

      var23.X20(var32);
      var28.X20(var37);
      xe_1 var33;
      xe_1 var57 = var33 = new xe_1("Select");
      var57.RR(new np_2(asBridge()));
      this.Dy.x40(this.Dy.H10().X20(var28).Kn0(var33));
      this.Dy.WQ(this.Dy.lo0().X20(var23).Kn0(var33));
      this.Dy.Ll(false);
      fy_2 var24;
      fy_2 var58 = var24 = new fy_2();
      var58.WQ(var58.C7(this.ga0).X20(var24.hb(this.Ib, this.Dy)));
      var58.x40(var58.hb(this.ga0).X20(var24.hb(this.Ib, this.Dy)));
      this.SL(var24);
      W9 var25;
      var25 = new W9();
      xe_1 var29;
      var29 = new xe_1("<");
      this.Iu = var29;
      xe_1 var34;
      xe_1 var59 = var34 = new xe_1(">");
      this.x4 = var34;
      var25.RR(new Yu0(asBridge()));
      var29.RR(new ea_2(asBridge()));
      var59.RR(new FL(asBridge()));
      ia0_1 var38;
      ia0_1 var60 = var38 = new ia0_1();
      this.u60 = var38;
      var60.SL(var25);
      var60.SL(new cn_0("Hide Hat"));
      this.SL(var38);
      this.SL(var29);
      this.SL(var34);
   }

   public static void nj0() {
      _native var0 = tw0_0.pv;
      tw0_0.pv.getClass();
      ew0_0[] var1 = ew0_0.Fh0;
      int var2 = ew0_0.Fh0.length;

      for (int var3 = 0; var3 < var2; var3++) {
         ew0_0 var4 = var1[var3];
         SQ var5;
         (var5 = var0.Jx0[var4.Bu0]).getClass();
         new Hm(var5);
         us_2 var6;
         var6 = new us_2(var5);

         while (var6.hasNext()) {
            LPT6_[] var23;
            int var7 = (var23 = (LPT6_[])var6.ty()).length;

            for (int var8 = 0; var8 < var7; var8++) {
               if (var23[var8] != null) {
                  var23[var8].OB.dispose();
               }
            }
         }

         var0.Jx0[var4.Bu0] = new SQ();
      }

      var1 = ew0_0.Fh0;
      var2 = ew0_0.Fh0.length;

      for (int var18 = 0; var18 < var2; var18++) {
         ew0_0 var20 = var1[var18];

         for (byte var24 = 0; var24 < 5; var24++) {
            for (int var28 = 0; var28 < 52; var28++) {
               LPT6_ var30;
               if ((var30 = var0.SI0[var20.Bu0][var24][var28]) != null) {
                  var30.OB.dispose();
               }
            }
         }
      }

      q10_0[] var12 = q10_0.Pn0;
      int var15 = q10_0.Pn0.length;

      for (int var17 = 0; var17 < var15; var17++) {
         q10_0 var19;
         q10_0 var10000 = var19 = var12[var17];
         ArrayList<X90> var21;
          var21 = new ArrayList<>();
         w7_0 var25;
         (var25 = var10000.Fk).getClass();
         new M(var25);
         V3 var29;
         var29 = new V3(var25);

         while (var29.hasNext()) {
            X90 var26 = (X90)var29.u7();

            z3_0[] var9;
            for (int var31 = 0; var31 < var26.vf0.length; var31++) {
               for (int var32 = 0; var32 < (var9 = var26.vf0[var31]).length; var32++) {
                  z3_0 var33;
                  if ((var33 = var9[var32]) != null) {
                     int var10 = 0;

                     while (true) {
                        yy0[] var11 = var33.ku0;
                        if (var10 >= var33.ku0.length) {
                           var33.VZ = null;
                           break;
                        }

                        var11[var10].ol0();
                        var33.ku0[var10] = null;
                        var10++;
                     }
                  }
               }
            }

            var21.add(var26);
         }

         for (X90 var27 : var21) {
            var19.Fk.sX(var27.ax);
         }
      }

      String var13 = "data/sprites/addons.pak";
      lg_0.I70.getClass();
      Qy0 var34;
      if (WH0.wQ(new VE(var13, zv_1.tt0))) {
         if ((tw0_0.pv = new _native()).Pk0()) {
            return;
         }

         var34 = Qy0.yI0;
      } else {
         var34 = Qy0.yI0;
      }

      var34.dk(-1, "error during reload");
   }

   @Override
   public final void Dw0(zk0_1 var1) {
      super.Dw0(var1);
      byte var5 = this.pG0;
      if (this.pG0 < 9) {
         Mm var10000 = this.ip;
         Mm var10001 = this.ip;
         Mm var10002 = this.ip;
         Mm var2;
         Mm var10003 = var2 = this.ip;
         int var4;
         int var10004 = var4 = this.ga0.Mx / 2 - 73;
         byte var3 = 60;
         var10003.Si = var10004;
         var10002.Zx0 = var3;
         var10001.OD0 = ew0_0.C1;
         if (var10000.zJ == q10_0.Qh0 && var5 < 3) {
            var5 = (byte)(var5 + 6);
         }

         var2.eQ(T10.pv0[var5][T10.h8.gZ()], var4, var3);
      } else {
         Mm var6;
         byte var9;
         int var11;
         if (var5 == 9) {
            var6 = this.ip;
            Mm var8 = this.ip;
            this.ip.Ta = 2;
            var8.OD0 = ew0_0.a;
            var9 = 0;
            var11 = this.ga0.Mx;
         } else {
            if (var5 != 10) {
               var6 = this.ip;
               Mm var12 = this.ip;
               this.ip.Ta = 4;
               var12.OD0 = ew0_0.C1;
               var6.Vd0(this.ga0.Mx / 2 - 73, 60);
               return;
            }

            var6 = this.ip;
            Mm var10 = this.ip;
            this.ip.Ta = 2;
            var10.OD0 = ew0_0.a;
            var9 = 1;
            var11 = this.ga0.Mx;
         }

         var6.eQ(var9, var11 / 2 - 73, 60);
      }
   }

   @Override
   public final void K8() {
      super.K8();
      this.RY(750, 300);
      this.lt0();
      this.u60.lt0();
      fy_2 var1 = this.ga0;
      int var2 = this.ga0.A20;
      this.u60.E40(this.ga0.Mx / 2 + var2 - this.u60.Mx / 2, var1.SB0 + 10);
      this.Iu.RY(24, 24);
      this.Iu.g2(24, 24);
      this.Iu.oY(24, 24);
      this.Iu.lt0();
      var1 = this.ga0;
      var2 = this.ga0.A20;
      this.Iu.E40(this.ga0.Mx / 2 + var2 - this.Iu.Mx / 2 - 32, var1.SB0 + 160);
      this.x4.RY(24, 24);
      this.x4.g2(24, 24);
      this.x4.oY(24, 24);
      this.x4.lt0();
      fy_2 var3;
      int var5 = (var3 = this.ga0).A20;
      this.x4.E40(this.ga0.Mx / 2 + var5 - this.x4.Mx / 2 + 32, var3.SB0 + 160);
   }

   public final void qI0() {
      StringBuilder var1;
      var1 = new StringBuilder("<player_appearance gender=\"0\" skin_tone=\"0\"");
      StringBuilder var10000 = new StringBuilder(" hat_addon_id=\"");
      q10_0 var2 = q10_0.Bj0;
      var1.append(var10000.append(this.ip.ck0(q10_0.Bj0)).append("\"").toString());
      var1.append(" hat_color=\"" + this.ip.jc0(var2) + "\"");
      var10000 = new StringBuilder(" hair_addon_id=\"");
      var2 = q10_0.VI;
      var1.append(var10000.append(this.ip.ck0(q10_0.VI)).append("\"").toString());
      var1.append(" hair_color=\"" + this.ip.jc0(var2) + "\"");
      var10000 = new StringBuilder(" eyes_addon_id=\"");
      var2 = q10_0.uz;
      var1.append(var10000.append(this.ip.ck0(q10_0.uz)).append("\"").toString());
      var1.append(" eyes_color=\"" + this.ip.jc0(var2) + "\"");
      var10000 = new StringBuilder(" facial_hair_addon_id=\"");
      var2 = q10_0.rg0;
      var1.append(var10000.append(this.ip.ck0(q10_0.rg0)).append("\"").toString());
      var1.append(" facial_hair_color=\"" + this.ip.jc0(var2) + "\"");
      var10000 = new StringBuilder(" back_addon_id=\"");
      var2 = q10_0.Ci;
      var1.append(var10000.append(this.ip.ck0(q10_0.Ci)).append("\"").toString());
      var1.append(" back_color=\"" + this.ip.jc0(var2) + "\"");
      var10000 = new StringBuilder(" top_addon_id=\"");
      var2 = q10_0.bb;
      var1.append(var10000.append(this.ip.ck0(q10_0.bb)).append("\"").toString());
      var1.append(" top_color=\"" + this.ip.jc0(var2) + "\"");
      var10000 = new StringBuilder(" gloves_addon_id=\"");
      var2 = q10_0.Xl;
      var1.append(var10000.append(this.ip.ck0(q10_0.Xl)).append("\"").toString());
      var1.append(" gloves_color=\"" + this.ip.jc0(var2) + "\"");
      var10000 = new StringBuilder(" footwear_addon_id=\"");
      var2 = q10_0.pv;
      var1.append(var10000.append(this.ip.ck0(q10_0.pv)).append("\"").toString());
      var1.append(" footwear_color=\"" + this.ip.jc0(var2) + "\"");
      var10000 = new StringBuilder(" leggings_addon_id=\"");
      var2 = q10_0.l3;
      var1.append(var10000.append(this.ip.ck0(q10_0.l3)).append("\"").toString());
      var1.append(" leggings_color=\"" + this.ip.jc0(var2) + "\"");
      var1.append("/>");
      hl_2 var19 = lg_0.k.E00;
      String var10002 = var1.toString();
      var19.getClass();
      hl_2.Ja0(var10002);
      System.out.println(var1.toString());
   }
}
