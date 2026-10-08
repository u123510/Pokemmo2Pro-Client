package cn.pokemmo.ui.window.contest;

import f.*;

public class PokemonContestResultWindow extends ML0 {
   public final cj_0 MC;
   public final cn_0 Xt0;
   public final oi_0 Fd0;
   public final cn_0 XC;
   public final le0_2 O9;
   public short LC0 = -1;
   public final fk0_2[] rJ;
   public final el_2[] V6;
   public final cn_0 S8;
   public long ea0 = 0L;
   public boolean XK = true;
   public boolean ZZ;
   public int M6 = -1;
   public byte Bu = -1;
   public long i7 = 0L;
   public byte YE0 = 0;

   public PokemonContestResultWindow(Qy0 var1, cj_0 var2) {
      super(var1, var2);
      this.MC = var2;
      this.uf("contestgui");
      boolean var5;
      if (!var2.m60() && !var2.s80()) {
         var5 = true;
      } else {
         var5 = false;
      }

      this.ZZ = var5;
      this.rJ = new fk0_2[var2.abstract$()];

      for (int var6 = 0; var6 < var2.abstract$(); var6++) {
         fk0_2[] var10000 = this.rJ;
         fk0_2 var3;
         var3 = new fk0_2((L5)this, (byte)var6);
         var10000[var6] = var3;
      }

      this.V6 = new el_2[var2.abstract$()];

      for (int var7 = 0; var7 < var2.abstract$(); var7++) {
         byte var11;
         this.V6[var7] = new el_2(this.MC.Ce(var11 = (byte)var7, (byte)0), this.MC.mn(var11).jI());
         this.SL(this.V6[var7]);
         this.V6[var7].Ll(false);
      }

      cn_0 var8 = new cn_0();
      this.S8 = var8;
      var8.uf("contestresulttext");
      this.SL(var8);
      var8.Ll(false);
      le0_2 var9 = new le0_2();
      this.O9 = var9;
      var9.uf("contest-frame");
      var9.oY(800, 28);
      super.WU.uf("contest-panel");
      super.Be.uf("contest-panel");
      super.a60.uf("contest-button-return");
      super.Vh.uf("contest-button");
      cn_0 var10;
      var10 = new cn_0(sm0_0.c0(1136));
      this.Xt0 = var10;
      oi_0 var12 = new oi_0(5).I60((short)21, (short)0);
      this.Fd0 = var12;
      cn_0 var4 = new cn_0();
      this.XC = var4;
      var4.qF0(pa0_0.up0);
      this.SL(var9);
      this.SL(var10);
      this.SL(var12);
      this.SL(var4);
      this.X60(false);
   }

   @Override
   public final void th() {
      (super.Vh = new G20("", "")).uf("contest-button");
      super.Vh.RR(new OH((L5)this));
      xe_1[] var1;
      xe_1[] var10006 = var1 = new xe_1[1];
      var10006[0] = super.Vh;
      super.L1 = var10006;
      this.Bl0(var1, 1, false, true);
      this.Ck0(false);
      this.X60(false);
      super.WU.x40(super.WU.hb(super.Vh));
      super.WU.WQ(super.WU.C7(super.Vh));
   }

   @Override
   public final void K8() {
      super.K8();
      int var1;
      int var2 = (var1 = tw0_0.LD0.ew0() / 2) - 400;
      int var3 = (tw0_0.LD0.Hv0() - 500) / 4;
      super.WU.oY(800, 115);
      int var4;
      super.WU.E40(var2, var4 = var3 + 336);
      super.kX.oY(800, 115);
      super.kX.E40(var2, var4);
      super.TH0.oY(800, 115);
      super.TH0.E40(var2, var4);
      super.ri0.oY(800, 115);
      super.ri0.E40(var2, var4);
      super.fE.qF0(pa0_0.qQ);
      fy_2 var5 = super.WU;
      super.fE.E40(super.WU.A20 + 10, var5.SB0 + 20);
      super.Be.oY(800, 115);
      super.Be.E40(var2, var4);
      super.a60.lt0();
      super.a60.RY(128, 24);
      super.a60.E40(super.Be.cz() - super.a60.Mx, super.Be.VM() - super.a60.OB);
      this.O9.E40(var2, var3 - 26);
      var2 = var1 - 395;
      var4 = var3 - 11;
      this.Xt0.E40(var2, var4);
      oi_0 var10000 = this.Fd0;
      var2 = this.Xt0.hr0() + (var1 - 390);
      var10000.E40(var2, var3 - 18);
      this.XC.E40(var1 - -392 - this.XC.hr0(), var4);
      int var6 = 0;

      while (true) {
         fk0_2[] var12 = this.rJ;
         if (var6 >= this.rJ.length) {
            var6 = 0;

            while (true) {
               G20[] var16 = super.iQ;
               if (var6 >= super.iQ.length) {
                  int var8 = 0;

                  while (true) {
                     el_2[] var17 = this.V6;
                     if (var8 >= this.V6.length) {
                        cn_0 var30 = this.S8;
                        var8 = tw0_0.LD0.ew0() / 2 - this.S8.hr0() / 2;
                        var30.E40(var8, var3 + 420);
                        this.S8.lt0();
                        return;
                     }

                     var17[var8].E40(tw0_0.LD0.ew0() / 2 + 100, this.rJ[var8].lf * 72 + var3 + 120);
                     var8++;
                  }
               }

               var16[var6].RY(200, 50);
               super.iQ[var6].oY(200, 50);
               var6++;
            }
         }

         fk0_2 var29 = var12[var6];
         fk0_2 var13;
         fk0_2 var10001 = var13 = var12[var6];
         var4 = tw0_0.LD0.ew0() / 2 + 104;
         int var28 = this.rJ[var6].lf * 84 + var3;
         var29.LZ.E40(var4, var28);
         le0_2 var20 = var13.LZ;
         var10001.TG.E40(var13.LZ.A20 + 150, var20.SB0 + 12);
         le0_2 var21 = var13.LZ;
         var29.e10.E40(var13.LZ.A20 + 5, var21.SB0 + 12);
         le0_2 var22 = var13.LZ;
         var10001.k20.E40(var13.LZ.A20 + 40, var22.SB0 + 30);
         le0_2 var23 = var13.LZ;
         var29.OJ0.E40(var13.LZ.A20 + 80, var23.SB0 + 30);
         le0_2 var24 = var13.LZ;
         var10001.na0.E40(var13.LZ.A20 + 220, var24.SB0 + 44);
         le0_2 var25 = var13.LZ;
         var29.Si0.E40(var13.LZ.A20 + 2, var25.SB0 + 67);
         le0_2 var26 = var13.LZ;
         var10001.IF0.E40(var13.LZ.A20 + 12, var26.SB0 + 20);
         le0_2 var14;
         var29.H3.E40((var14 = var13.LZ).A20 + 40, var14.SB0 + 70);
         fk0_2 var15 = this.rJ[var6];
         boolean var27;
         if (!this.ZZ && this.Bu == -1) {
            var27 = true;
         } else {
            var27 = false;
         }

         var15.Ns(var27);
         var6++;
      }
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      if (!tw0_0.LD0.Rg0) {
         return super.nd0(var1);
      }

      if (this.Bu != -1 && E00.ZU(var1.zu) && var1.iT()) {
         int var2 = var1.finally$;
         rp_0 var3 = rp_0.sJ0;
         if (rp_0.sJ0 != null && var3.Ov(var2)) {
            return true;
         }

         var2 = var1.finally$;
         var3 = rp_0.nK0;
         if (rp_0.nK0 != null && var3.Ov(var2)) {
            return true;
         }
      }

      return super.nd0(var1);
   }

   @Override
   public final void HP(zk0_1 var1) {
      super.HP(var1);
      byte var4 = this.Bu;
      label115:
      if (this.Bu >= 0) {
         cn_0 var24;
         switch (var4) {
            case 0:
               this.S8.z70.bT(gn_0.WHITE, 100);
               this.S8.Sk(sm0_0.c0(311000));
               if (hk0_1.KG > this.i7 + 2000L) {
                  this.S8.z70.iG0(100);
                  this.Bu++;

                  for (int var12 = 0; var12 < 4; var12++) {
                     this.V6[var12].mt = hk0_1.KG;
                  }
               }
               break label115;
            case 1:
               N1 var9 = this.S8.z70;
               if (this.S8.z70.pb0) {
                  break label115;
               }

               var9.bT(gn_0.WHITE, 100);
               this.S8.Sk(sm0_0.c0(311001));
               int var10 = 0;

               for (int var18 = 0; var18 < 4; var18++) {
                  if (!this.V6[var18].Td0(true)) {
                     this.V6[var18].WZ(true);
                  } else {
                     var10++;
                  }
               }

               if (var10 != 4) {
                  break label115;
               }

               this.Bu++;

               for (int var11 = 0; var11 < 4; var11++) {
                  this.V6[var11].mt = hk0_1.KG;
               }

               var24 = this.S8;
               break;
            case 2:
               N1 var7 = this.S8.z70;
               if (this.S8.z70.pb0) {
                  break label115;
               }

               var7.bT(gn_0.WHITE, 100);
               this.S8.Sk(sm0_0.c0(311002));
               int var8 = 0;

               for (int var15 = 0; var15 < 4; var15++) {
                  el_2 var23;
                  if ((var23 = this.V6[var15]).Td0(true) && var23.Td0(false)) {
                     var8++;
                  }
               }

               for (int var16 = 0; var16 < 4; var16++) {
                  if (!this.V6[var16].Td0(false)) {
                     this.V6[var16].WZ(false);
                  }
               }

               if (var8 != 4) {
                  break label115;
               }

               long var17 = hk0_1.KG;
               this.i7 = var17;
               this.Bu = 3;
               var24 = this.S8;
               break;
            case 3:
               N1 var5 = this.S8.z70;
               if (!this.S8.z70.pb0) {
                  var5.bT(gn_0.WHITE, 100);
                  String var6 = "";
                  String var2 = "";
                  O8 var3;
                  if ((var3 = this.MC.mn(this.YE0)) != null) {
                     var6 = var3.M2();
                  }

                  PF var21;
                  if ((var21 = this.MC.Ce(this.YE0, (byte)0)) != null) {
                     var2 = var21.A60();
                  }

                  var24 = this.S8;
                  String[] var22;
                  String[] var10001 = var22 = new String[4];
                  var10001[0] = "";
                  var10001[1] = "";
                  var10001[2] = var6;
                  var10001[3] = var2;
                  var24.Sk(sm0_0.Bx(311003, var22));
               }
            default:
               break label115;
         }

         var24.z70.iG0(100);
      }

      short var13 = this.MC.Pl0;
      if (this.MC.Pl0 < 1) {
         var13 = 1;
      }

      if (var13 != this.M6) {
         this.M6 = var13;
         String[] var19;
         String[] var25 = var19 = new String[3];
         var25[0] = "";
         var25[1] = "";
         var25[2] = var13 + "";
         String[] var14;
         if ((var14 = sm0_0.Bx(310266, var19).split("\n")).length < 2) {
            var25 = var14 = new String[2];
            var25[0] = "ERROR";
            var25[1] = "--";
         }

         String var20 = var14[0].toUpperCase();
         var14[0] = var20;
         this.XC.Sk(var20);
         super.Vh.SU(var14[0]);
         super.Vh.Pc("");
      }
   }

   @Override
   public final void H5(boolean var1, boolean var2) {
      super.H5(var1, false);
   }

   @Override
   public final void X60(boolean var1) {
      if (this.rJ != null) {
         byte var2 = 0;

         while (true) {
            cj_0 var3 = this.MC;
            if (var2 >= (byte)this.MC.wI0.length) {
               oi_0 var29 = this.Fd0;
               oi_0 var10;
               oi_0 var31 = var10 = this.Fd0;
                byte state = var3.A3;
                var31.vF0 = state;
                var29.ci = hk0_1.KG;
                if (state == 0) {
                   var10.ap = state;
                }

               return;
            }

            PF var12;
            if ((var12 = var3.Ce(var2, (byte)0)) != null) {
               fk0_2 var10001 = this.rJ[var2];
               fk0_2 var4;
               fk0_2 var10002 = var4 = this.rJ[var2];
               var4.e10.Sk(var12.A60());
               ke0_1 var5 = var12.q40;
               var10002.lf = var12.q40.nG;
               qd_2 var6;
               qd_2 var26 = var6 = var10001.H3;
               short var14;
               short var10004 = var14 = var5.b3;
               short var7 = 1000;
               var26.tD = var10004;
               var26.hX = var7;
               var26.iA = false;
               if (!var1) {
                  var6.S3 = var14;
                  var6.aE(var14 * 100 / var7 / 100.0F);
               }

               oi_0 var15;
               oi_0 var27 = var15 = var4.OJ0;
               ke0_1 var19 = var12.q40;
               byte var22;
               var4.OJ0.vF0 = var22 = (byte)(var12.q40.LX / 10);
               long var8 = hk0_1.KG;
               var27.ci = hk0_1.KG;
               if (!var1) {
                  var15.ap = var22;
               }

               J70 var16;
               J70 var28 = var16 = var4.IF0;
               var16.Qi0 = var22 = (byte)(var19.gS / 10);
               var28.B40 = var8;
               if (!var1) {
                  var16.bb0 = var22;
               }

               dc_0 var17 = var4.Si0;
               boolean var20;
               if (var19.jU > 0) {
                  var20 = true;
               } else {
                  var20 = false;
               }

               var17.wg = var20;
               var4.H3.yI();
               var4.e10.coM8(null);
               cn_0 var30 = var4.e10;
               var4.e10.yj0 = var12.nz0(true);
               var30.yB0();
               var4.e10.GH0 = 0;
               byte var18 = var12.q40.j70;
               if (var12.q40.j70 < 0) {
                  var4.k20.og.lo0();
               } else {
                  Br0 var21 = var4.k20.og;
                  AG0[] var24 = new AG0[1];
                  byte var25 = 0;
                  ji0_0 var9 = ji0_0.Hg;
                  if (var18 < 0 || var18 >= var9.E30.length) {
                     var18 = 0;
                  }

                  var24[var25] = var9.E30[var18];
                  var21.o60(var24);
               }

               byte var13;
               switch (var13 = var12.q40.Tv0) {
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                     var4.na0.Sk(sm0_0.wa0(5204, String.valueOf(var13 + 1)));
                     break;
                  case 4:
                     var4.na0.Sk(sm0_0.wa0(5204, "???"));
                     break;
                  default:
                     var4.na0.Sk("");
               }
            } else {
               this.rJ[var2].Ns(false);
            }

            var2++;
         }
      }
   }

   @Override
   public final boolean rp0() {
      byte var1 = 0;

      while (true) {
         fk0_2[] var2 = this.rJ;
         if (var1 >= this.rJ.length) {
            return true;
         }

         fk0_2 var6;
         if ((var6 = var2[var1]).LZ.eE) {
            oi_0 var3 = var6.OJ0;
            label32:
            if (var6.OJ0.eE) {
               if (var3.vF0 == var3.ap) {
                  long var4 = hk0_1.KG;
                  if (hk0_1.KG - var3.ci > 250L) {
                     qd_2 var8 = var6.H3;
                     if (var6.H3.S3 != var8.tD) {
                        return false;
                     }

                     J70 var7;
                     if ((var7 = var6.IF0).Qi0 == var7.bb0 && var4 - var7.B40 > 250L) {
                        break label32;
                     }

                     return false;
                  }
               }

               return false;
            }
         }

         var1++;
      }
   }
}
