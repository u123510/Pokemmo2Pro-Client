package cn.pokemmo.ui.window.pokemon;

import f.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 玩家训练家全局数据统计窗口
 *
 * 原混淆类: f.cb0_1
 */
public class PlayerStatsWindow extends cx_0 implements tr_1  {
    public final cb0_1 asBridge() {
        return (cb0_1) (Object) this;
    }

   public static final SimpleDateFormat v20 = new SimpleDateFormat("dd/MM/yyyy hh:mm a z");
   public final BU h9;
   public final P8 Z60;
   public final short[] LPt5 = new short[2];
   public final byte[] com4 = new byte[2];
   public final gz_0 S80;
   public final gz_0 Wv0;
   public final ay_1 Xh0;

   public PlayerStatsWindow(BU var1) {
      super(tw0_0.kz0());
      this.h9 = var1;
      this.uf("mm-stats-window");
      this.Hy(sm0_0.c0(9152));
      this.ff0(1);
      this.Pb0(new ff0_1(var1));
      P8 var5;
      P8 var10002;
      var5 = new P8();
      var10002 = var5;
      this.Z60 = var5;
      fy_2 var2;
      fy_2 var10007;
      var2 = new fy_2();
      var10007 = var2;
      var10007.x40(XZ.BC0(var10007.lo0(), new ya_1[]{var2.H10().qd(10).LPt3(new le0_2[]{var5})}, var2).Xq(new ya_1[]{var2.lo0().LPt3(new le0_2[]{var5})}));
      gz_0 var6;
      gz_0 var12;
      var6 = new gz_0(asBridge(), false);
      var12 = var6;
      this.S80 = var12;
      lo0_0 var3;
      lo0_0 var10006;
      var3 = new lo0_0(var6);
      var10006 = var3;
      var10006.uf("stats");
      fy_2 var11 = new fy_2();
      var11.WQ(var11.hb(new le0_2[]{var3}));
      var11.x40(var11.C7(new le0_2[]{var3}));
      var5.Wq(var11, sm0_0.c0(9153)).Kj(new ym_0(asBridge()));
      gz_0 var7;
      gz_0 var10;
      var7 = new gz_0(asBridge(), true);
      var10 = var7;
      this.Wv0 = var10;
      ay_1 var8;
      ay_1 var10004;
      var8 = new ay_1(asBridge());
      var10004 = var8;
      this.Xh0 = var10004;
      lo0_0 var4;
      lo0_0 var10003;
      var4 = new lo0_0(var7);
      var10003 = var4;
      var10003.uf("stats");
      fy_2 var9 = new fy_2();
      var9.WQ(var9.hb(new le0_2[]{var4, var8}));
      var9.x40(var9.C7(new le0_2[]{var4, var8}));
      var10002.Wq(var9, sm0_0.c0(9154)).Kj(new vw_2(asBridge()));
      this.SL(var2);
      this.U30(false);
   }

   public static void fV(String var0, String var1, fy_2 var2) {
      cn_0 var3;
      cn_0 var10002;
      var3 = new cn_0(null, 0);
      var10002 = var3;
      var10002.Sk(var0);
      var10002.uf("label-title");
      cn_0 var4;
      var4 = new cn_0(null, 0);
      var10002 = var4;
      var10002.Sk(var1);
      var10002.uf("label-name-value");
      var2.pJ0.X20(new I7(var2).LPt3(new le0_2[]{var3, var4}));
      var2.L4.X20(new Hm0(var2).LPt3(new le0_2[]{var3, var4}));
   }

   public final void U30(boolean var1) {
      int var0 = var1 ? 1 : 0;
      byte var2;
      this.com4[var0] = var2 = (byte)(this.com4[var0] + 1);
      short var3 = this.LPt5[var0];
      tw0_0.rl.fk0.uQ(new am_1(var3, var2, (boolean)var1));
   }

   public final void w80(zp0_0 var1) {
      lo0_0 var2;
      lo0_0 var10000;
      var2 = new lo0_0(null);
      var10000 = var2;
      var10000.uf("stats");
      fy_2 var3;
      fy_2 var131;
      var3 = new fy_2();
      var131 = var3;
      var131.WQ(var131.hb(new le0_2[]{var2}));
      var131.x40(var131.C7(new le0_2[]{var2}));
      fy_2 var4;
      var4 = new fy_2();
      Hm0 var5;
      var5 = new Hm0(var4);
      var4.WQ(var5);
      I7 var24;
      var24 = new I7(var4);
      var4.x40(var24);
      fV(sm0_0.c0(9159), var1.Y10(), var4);
      if (tw0_0.Eu(1)) {
         fV(sm0_0.c0(9160), var1.LB0 + "", var4);
      }

      fV(sm0_0.c0(9161), sm0_0.c0(var1.wn0 + 9225), var4);
      fV(sm0_0.c0(9162), sm0_0.wa0(9174, Integer.toString(var1.H10)), var4);
      String var25 = sm0_0.c0(9163);
      StringBuilder var6;
      var6 = new StringBuilder();
      N2[] var7 = var1.i30;
      int var8 = var1.i30.length;

      for (int var9 = 0; var9 < var8; var9++) {
         N2 var10 = var7[var9];
         if (var6.length() > 0) {
            var6.append(", ");
         }

         var6.append(sm0_0.c0(var10.R5));
      }

      if (var6.length() == 0) {
         var6.append("???");
      }

      fV(var25, var6.toString(), var4);
      fV(sm0_0.c0(9172), sm0_0.c0(var1.kl.YV), var4);
      fV(sm0_0.c0(9164), v20.format(var1.th0), var4);
      fV(sm0_0.c0(9165), sm0_0.c0(var1.NO + 9200), var4);
      fV(sm0_0.c0(9166), var1.FA(), var4);
      StringBuilder var26;
      var26 = new StringBuilder();
      N2 var35 = N2.d6(var1.i30);
      byte var42 = var1.Ib0;
      if ((var1.Ib0 == 1 || var1.CoM8) && var35 != null) {
         short var43 = 9181;
         String[] var47 = new String[2];
         byte var52 = 0;
         String var62 = Integer.toString(var42 == 1 ? var1.H10 : (short)(var1.H10 / 4));
         var47[var52] = var62;
         var52 = 1;
         String var36;
         if (var1.kl == Cq.ez) {
            var36 = sm0_0.c0(5756);
         } else {
            var36 = sm0_0.c0(var35.R5);
         }

         var47[var52] = var36;
         var26.append(sm0_0.Bx(var43, var47));
      }

      if (var1.o9) {
         if (var26.length() > 0) {
            var26.append("\n");
         }

         var26.append(sm0_0.c0(9182));
      }

      if (var26.length() > 0) {
         fV(sm0_0.c0(9180), var26.toString(), var4);
      }

      i9[] var27 = var1.ab0;
      if (var1.ab0.length == 0) {
         fV(sm0_0.c0(9167), sm0_0.c0(83), var4);
      } else {
         boolean var37 = false;
         int var44 = var27.length;

         for (int var48 = 0; var48 < var44; var48++) {
            i9 var54;
            if ((var54 = var27[var48]) != null) {
               cn_0 var63;
               cn_0 var10001;
               String var38 = sm0_0.c0(9167);
               var63 = new cn_0(null, 0);
               var10001 = var63;
               var63.Sk(var38);
               var63.uf("label-title");
               var10001.Ll(var37 ^ true);
               var37 = true;
               cn_0 var11;
               byte var12 = var54.b70;
               String var79;
               if (var54.b70 != 0) {
                  if (var12 != 1) {
                     var79 = "???";
                  } else {
                     var79 = sm0_0.c0(5596);
                  }
               } else {
                  var79 = sm0_0.c0(5595);
               }


               var11 = new cn_0(null, 0);               var11.Sk(var79);
               var11.uf("label-name-value");
               OT var80;
               if (tw0_0.kz0()) {
                  OT var133;
                  byte var13 = 48;
                  byte var14 = 48;
                  cd0_2 var15 = var54.Wr0;
                  var80 = new OT(var13, var14, var15);
                  var133 = var80;
                  var13 = 2;
                  var133.J60.Ta = var13;
                  var133.Te0(-34, -31);
               } else {
                  OT var134;
                  byte var88 = 24;
                  byte var94 = 24;
                  cd0_2 var99 = var54.Wr0;
                  var80 = new OT(var88, var94, var99);
                  var134 = var80;
               }

               cn_0 var89;
               cn_0 var135;
               String var55 = var54.Wr0.DR;
               var89 = new cn_0(null, 0);
               var135 = var89;
               var135.Sk(var55);
               var135.uf("label-name-icon-value");
               var4.pJ0.X20(new I7(var4).LPt3(new le0_2[]{var63, var80, var89, var11}));
               var4.L4.X20(new Hm0(var4).LPt3(new le0_2[]{var63, var80, var89, var11}));
            }
         }
      }

      if (var1.X0.values().size() == 0) {
         fV(sm0_0.c0(9168), "--", var4);
      } else {
         boolean var28 = false;
         ArrayList var136 = new ArrayList(var1.X0.values());
         Collections.sort(var136, jr0_0.fz);
         byte var39 = -1;
         Iterator var45 = var136.iterator();

         while (var45.hasNext()) {
            jr0_0 var49;
            if ((var49 = (jr0_0)var45.next()) != null) {
               cn_0 var56;
               cn_0 var142;
               String var29 = sm0_0.c0(9168);
               var56 = new cn_0(null, 0);
               var142 = var56;
               var56.Sk(var29);
               var56.uf("label-title");
               var142.Ll(var28 ^ true);
               var28 = true;
               cn_0 var64;
               String var69;
               switch (var49.v) {
                  case 1:
                     var69 = "#1";
                     break;
                  case 2:
                     var69 = "#2";
                     break;
                  case 3:
                     var69 = "#3 - 4";
                     break;
                  case 4:
                     var69 = "#5 - 8";
                     break;
                  case 5:
                     var69 = "#9 - 16";
                     break;
                  case 6:
                     var69 = "#17 - 32";
                     break;
                  default:
                     var69 = "???";
               }


               var64 = new cn_0(null, 0);               var64.Sk(var69);
               var64.uf("label-value-smallest");
               boolean var40;
               if (var39 != var49.v) {
                  var40 = true;
               } else {
                  var40 = false;
               }

               var64.Ll(var40);
               var39 = var49.v;
               cn_0 var70;
               cn_0 var137;
               String var50 = lb0_2.FI0(var49, var1.H10, var1.lg0);
               var70 = new cn_0(null, 0);
               var137 = var70;
               var137.Sk(var50);
               var137.uf("label-name-icon-value");
               var137.uf("label-value-large");
               var4.pJ0.X20(new I7(var4).LPt3(new le0_2[]{var56, var64, var70}));
               var4.L4.X20(new Hm0(var4).LPt3(new le0_2[]{var56, var64, var70}));
            }
         }
      }

      short var30 = -1;
      short var41 = var1.H10;
      short var46 = (short)(var1.H10 - 1);
      short var51 = 0;
      int var57 = var41;

      while ((var57 = var57 / 2) > 0) {
         var51++;
         var57 = (short)var57;
      }

      for (short var59 = 0; var59 < var46; var59++) {
         short var65;
         if ((var65 = zp0_0.dR(var59, var41)) != var30) {
            String var31 = "";
            int var71;
            if ((var71 = var65 + 1) == var51) {
               var31 = sm0_0.c0(9170);
            }

            if (var65 + 2 == var51) {
               var31 = sm0_0.c0(9171);
            }

            cn_0 var81;
            cn_0 var143;
            String[] var90;
            String[] var10004 = var90 = new String[2];
            var10004[0] = var71 + "";
            var10004[1] = var31;
            String var32 = sm0_0.Bx(9169, var90);
            var81 = new cn_0(null, 0);
            var143 = var81;
            var143.Sk(var32);
            var143.uf("label-title");
            ya_1 var144 = var4.pJ0;
            le0_2[] var33;
            (var33 = new le0_2[1])[0] = var81;
            var144.X20(var4.C7(var33));
            if (var65 > 0) {
               var4.L4.qd(20);
            }

            ya_1 var138 = var4.L4;
            le0_2[] var34;
            (var34 = new le0_2[1])[0] = var81;
            var138.X20(var4.hb(var34));
            var30 = var65;
         }

         U80 var66;
         JN[] var67;
         if ((var66 = var1.MO(var59)) == null) {
            var67 = null;
         } else if (var1.o9) {
            var67 = var66.GZ;
         } else {
            var67 = new JN[2];
            short var72 = var1.H10;
            int var82 = 0;
            int var91 = 0;
            int var83 = var91;
            var91 = var82;

            int var95;
            while ((var72 /= 2) > 0 && (var95 = var91 + var72) <= var59) {
               var83 = var91;
               var91 = var95;
            }

            if (var59 < var1.H10 / 2) {
               JN[] var73 = var1.SM;
               int var150 = var82 = var59 * 2;
               var67[0] = var73[var82];
               var67[1] = var1.SM[var150 + 1];
            } else {
               short var145 = var72 = (short)(var59 * 2 % var91 + var83);
               var67[0] = var1.MO(var72).e40;
               byte var75 = 1;
               short var85 = (short)(var145 + 1);
               var67[var75] = var1.MO(var85).e40;
            }
         }

         byte var76 = 2;
         cn_0[] var86 = new cn_0[2];
         cn_0[] var93 = new cn_0[3];

         for (int var96 = 0; var96 < var76; var96++) {
            if (var1.MO(var59).kX == 0) {
               String var100 = "???";
               cn_0 var101;
               cn_0 var151 = var101 = I5.df(null, 0, var100);
               var86[var96] = var101;
               var151.uf("label-name-icon-value");
               cn_0 var102;
               var102 = new cn_0(null, 0);
               var93[var96] = var102;
            } else {
               cn_0 var103;
               JN var16;
               String var108;
               if ((var16 = var67[var96]) == null) {
                  var108 = "???";
               } else {
                  var108 = var16.HP.DR;
               }


               var103 = new cn_0(null, 0);               var103.Sk(var108);
               var86[var96] = var103;
               var103.uf("label-name-icon-value");
               if (var67[var96] != null) {
                  if (tw0_0.kz0()) {
                     OT var104;
                     byte var109 = 48;
                     byte var17 = 48;
                     JN var18;
                     cd0_2 var120;
                     if ((var18 = var67[var96]) == null) {
                        var120 = null;
                     } else {
                        var120 = var18.HP;
                     }


                     var104 = new OT(var109, var17, var120);                     byte var110 = 2;
                     var104.J60.Ta = var110;
                     var104.Te0(-34, -31);
                     var93[var96] = var104;
                  } else {
                     OT var105;
                     byte var111 = 24;
                     byte var113 = 24;
                     JN var121;
                     cd0_2 var122;
                     if ((var121 = var67[var96]) == null) {
                        var122 = null;
                     } else {
                        var122 = var121.HP;
                     }


                     var105 = new OT(var111, var113, var122);                     var93[var96] = var105;
                  }
               } else {
                  var103 = new cn_0(null, 0);
                  var93[var96] = var103;
               }

               var93[var96].uf("label-value-icon");
            }
         }

         cn_0 var68;
         cn_0 var140;
         String var77 = sm0_0.c0(5024);
         var68 = new cn_0(null, 0);
         var140 = var68;
         var140.Sk(var77);
         var140.uf("label-value-smallest");
         U80 var78;
         JN var97;
         if ((var97 = (var78 = var1.MO(var59)).e40) == null && var1.MO(var59).Io >= 0) {
            var97 = var1.SM[(short)var78.Io];
         }

         le0_2 var107;
         le0_2 var152;
         var107 = new cn_0(null, 0);
         var152 = var107;
         xe_1 var112;
         var112 = new xe_1(null, false, null);
         var152.uf("label-name-value");
         String var114 = "";
         var93[2] = I5.df(null, 0, var114);
         switch (var78.kX) {
            case 0:
               ((cn_0)var107).Sk("");
               break;
            case 1:
               ((cn_0)var107).Sk(sm0_0.c0(9175));
               var112.SU(sm0_0.c0(9175));
               var112.uf("label-name-value-button");
               break;
            case 3:
               ((le0_2)var107).yj0 = sm0_0.c0(9176);
               var107.yB0();
               ((le0_2)var107).GH0 = 100;
            case 2:
               short var115 = 9177;
               String var123;
               if (var97 == null) {
                  var123 = "???";
               } else {
                  var123 = var97.HP.DR;
               }

               var112.SU(sm0_0.wa0(var115, var123));
               var112.uf("label-name-value-button");
               short var116 = 9177;
               if (var97 == null) {
                  var123 = "???";
               } else {
                  var123 = var97.HP.DR;
               }

               ((cn_0)var107).Sk(sm0_0.wa0(var116, var123));
               if (tw0_0.kz0()) {
                  OT var118;
                  byte var126 = 48;
                  byte var129 = 48;
                  cd0_2 var130;
                  if (var97 == null) {
                     var130 = null;
                  } else {
                     var130 = var97.HP;
                  }


                  var118 = new OT(var126, var129, var130);                  byte var127 = 2;
                  var118.J60.Ta = var127;
                  var118.Te0(-34, -31);
                  var93[2] = var118;
               } else {
                  int var117;
                  OT var125;
                  byte var19;
                  byte var20;
                  cd0_2 var21;
                  label243: {
                     var117 = 2;
                     var19 = 24;
                     var20 = 24;
                     if (var97 != null) {
                        var21 = var97.HP;
                        if (var97.HP != null) {
                           break label243;
                        }
                     }

                     var21 = null;
                  }

                  var125 = new OT(var19, var20, var21);
                  var93[var117] = var125;
               }

               cn_0 var119 = var93[2];
               boolean var128;
               if (var97 != null && var97.HP != null) {
                  var128 = true;
               } else {
                  var128 = false;
               }

               var119.Ll(var128);
               if (var78.kX == 3 && var97 == null) {
                  var112.SU(sm0_0.c0(9178));
                  ((cn_0)var107).Sk(sm0_0.c0(9178));
                  ((le0_2)var107).yj0 = sm0_0.c0(9179);
                  var107.yB0();
               }
         }

         label313: {
            if (var78.kX == 2 && var78.uL0.uI0()) {
               var112.RR(() -> this.Kg(var78));
            } else {
               if (var78.kX != 1) {
                  break label313;
               }

               VX var98;
               var98 = new VX(asBridge(), var1, var78);
               var112.RR(var98);
            }

            var107 = var112;
         }

         var93[2].uf("label-value-icon");
         ya_1 var146 = var4.pJ0;
         le0_2[] var60;
         le0_2[] var153 = var60 = new le0_2[7];
         var60[0] = var93[0];
         var60[1] = var86[0];
         var60[2] = var68;
         var60[3] = var93[1];
         var60[4] = var86[1];
         var153[5] = var93[2];
         var153[6] = (le0_2)var107;
         var146.X20(var4.C7(var60));
         var146 = var4.L4;
         le0_2[] var61;
         var153 = var61 = new le0_2[7];
         var61[0] = var93[0];
         var61[1] = var86[0];
         var61[2] = var68;
         var61[3] = var93[1];
         var61[4] = var86[1];
         var153[5] = var93[2];
         var153[6] = (le0_2)var107;
         var146.X20(var4.hb(var61));
      }

      var2.AH0(var4);
      com2__3 var22;
      com2__3 var148 = var22 = this.Z60.Wq(var3, var1.Y10());
      Vn0 var23;
      var23 = new Vn0(asBridge(), var22);
      var148.RD0 = (Runnable[])a7_0.gE(var148.RD0, var23, Runnable.class);
      this.Z60.Zd(var22);
   }

   public final void K8() {
      if (tw0_0.kz0()) {
         this.kh0();
      } else {
         this.RY(670, 500);
         this.Z60.RY(670, 500);
      }

      super.K8();
   }

   public final void C(zk0_1 var1) {
      super.C(var1);
      lpt6__0.v90(this);
   }

   public final void x00() {
      lpt6__0.v90(this);
   }

   public final boolean nd0(i70_0 var1) {
      if (E00.ZU(var1.zu) && var1.iT()) {
         int var2 = var1.finally$;
         rp_0 var3 = rp_0.I90;
         if (rp_0.I90 != null && var3.Ov(var2)) {
            this.Z60.Lb(-1);
            return true;
         }

         var3 = rp_0.Ni;
         if (rp_0.Ni != null && var3.Ov(var2)) {
            this.Z60.Lb(1);
            return true;
         }

         var3 = rp_0.nK0;
         if (rp_0.nK0 != null && var3.Ov(var2)) {
            this.h9.qD0(false);
            return true;
         }
      }

      return super.nd0(var1);
   }

   public final void Kg(U80 var1) {
      BR var2 = tw0_0.rl;
      CH0 var3 = var1.uL0;
      var2.fk0.uQ(new bk_1(var3));
      this.h9.qD0(false);
   }
}


