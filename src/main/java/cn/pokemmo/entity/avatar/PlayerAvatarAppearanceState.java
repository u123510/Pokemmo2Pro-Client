package cn.pokemmo.entity.avatar;

import f.*;

import java.util.Arrays;

public class PlayerAvatarAppearanceState {
   public final byte oG;
   public int Ta;
   public final E90 J30;
   public final cd0_2 aY;
   public byte pR;
   public ew0_0 OD0;
   public q10_0 zJ;
   public boolean Gr0;
   public short[] NF;
   public byte[] QA0;
   public int Si;
   public int Zx0;
   public int EA0;
   public final le0_2 jP;
   public final ld_0 Xo;
   public final EE[] Xc;
   public long To0;

   public PlayerAvatarAppearanceState(le0_2 var1, E90 var2, q10_0 var3, short var4) {
      this(var1, var2);
      this.zJ = var3;
      if (var3 != null) {
         this.NF[var3.Th0()] = var4;
      }

   }

   public PlayerAvatarAppearanceState(le0_2 var1, E90 var2) {
      this.oG = 1;
      this.Ta = 3;
      this.pR = 0;
      this.OD0 = ew0_0.C1;
      this.zJ = null;
      this.Gr0 = false;
      q10_0[] var3;
      this.NF = new short[(var3 = q10_0.Pn0).length];
      this.QA0 = new byte[var3.length];
      this.Si = 0;
      this.Zx0 = 0;
      this.EA0 = 0;
      this.Xo = new ld_0(Arrays.asList(1, 5, 6, 12, 13, 14, 19, 23, 24));
      this.Xc = EE.Wi0();
      this.To0 = -1L;
      this.aY = null;
      if (var2 == null) {
         yt_1 var6;
         if ((var6 = tw0_0.e60) == null) {
            this.jP = null;
            this.J30 = null;
            return;
         }

         var2 = var6.at();
      }

      this.jP = var1;
      this.J30 = var2;
      if (var2 != null) {
         this.pR = var2.Gi().COM6().Ih0();

         for(q10_0 var4 : var3) {
            this.NF[var4.Th0()] = (short)-1;
            this.QA0[var4.Th0()] = -1;
         }

      }
   }

   public PlayerAvatarAppearanceState(le0_2 var1, cd0_2 var2) {
      this.oG = 1;
      this.Ta = 3;
      this.pR = 0;
      this.OD0 = ew0_0.C1;
      this.zJ = null;
      this.Gr0 = false;
      q10_0[] var3;
      q10_0[] var10001 = var3 = q10_0.Pn0;
      this.NF = new short[var10001.length];
      this.QA0 = new byte[var10001.length];
      this.Si = 0;
      this.Zx0 = 0;
      this.EA0 = 0;
      ld_0 var4 = new ld_0(Arrays.asList(1, 5, 6, 12, 13, 14, 19, 23, 24));
      this.Xo = var4;
      this.Xc = EE.Wi0();
      this.To0 = -1L;
      this.jP = var1;
      this.aY = var2;
      if (var2 == null) {
         E90 var5;
         E90 var10000 = var5 = tw0_0.e60.at();
         this.J30 = var5;
         byte var6;
         if (var10000 == null) {
            var6 = 0;
         } else {
            var6 = var5.Gi().COM6().Ih0();
         }

         this.pR = var6;
      } else {
         this.pR = var2.MY();
         this.J30 = null;
      }

      for(q10_0 var9 : var3) {
         this.NF[var9.Th0()] = (short)-1;
         this.QA0[var9.Th0()] = -1;
      }

   }

   public PlayerAvatarAppearanceState(le0_2 var1, byte var2) {
      this.oG = 1;
      this.Ta = 3;
      this.pR = 0;
      this.OD0 = ew0_0.C1;
      this.zJ = null;
      this.Gr0 = false;
      q10_0[] var3;
      q10_0[] var10000 = var3 = q10_0.Pn0;
      this.NF = new short[var3.length];
      this.QA0 = new byte[var3.length];
      this.Si = 0;
      this.Zx0 = 0;
      this.EA0 = 0;
      this.Xo = new ld_0(Arrays.asList(1, 5, 6, 12, 13, 14, 19, 23, 24));
      this.Xc = EE.Wi0();
      this.To0 = -1L;
      this.jP = var1;
      this.pR = var2;
      this.J30 = null;
      this.aY = null;

      for(q10_0 var4 : var10000) {
         this.NF[var4.Th0()] = (short)-1;
         this.QA0[var4.Th0()] = -1;
      }

   }

   public PlayerAvatarAppearanceState(le0_2 var1) {
      this.oG = 1;
      this.Ta = 3;
      this.pR = 0;
      this.OD0 = ew0_0.C1;
      this.zJ = null;
      this.Gr0 = false;
      q10_0[] var2;
      q10_0[] var10000 = var2 = q10_0.Pn0;
      this.NF = new short[var2.length];
      this.QA0 = new byte[var2.length];
      this.Si = 0;
      this.Zx0 = 0;
      this.EA0 = 0;
      this.Xo = new ld_0(Arrays.asList(1, 5, 6, 12, 13, 14, 19, 23, 24));
      this.Xc = EE.Wi0();
      this.To0 = -1L;
      this.jP = var1;
      this.J30 = null;
      this.aY = null;

      for(q10_0 var4 : var10000) {
         this.NF[var4.Th0()] = (short)-1;
         this.QA0[var4.Th0()] = -1;
      }

   }

   public static gn_0 Py0(byte var0) {
      yb_1 var3 = yb_1.f9(var0);
      byte var10002 = (byte)var3.cOM7.Cc();
      yb_1 var10003 = var3;
      yb_1 var10004 = var3;
      byte var4 = (byte)var3.cOM7.TB0();
      byte var1 = (byte)var10004.cOM7.tr();
      byte var2 = (byte)(var10003.TH * 2);
      return new gn_0(var10002, var4, var1, var2);
   }

   public final void B10(q10_0 var1, byte var2, int var3, int var4, int var5) {
      q10_0 var6;
      if (var1 != (var6 = q10_0.Bj0)) {
         PlayerAvatarAppearanceState var36 = this;
         byte[] var25;
         byte[] var10002 = var25 = qx_1.AE0;
         PlayerAvatarAppearanceState var10004 = this;
         PlayerAvatarAppearanceState var10008 = this;
         byte var14 = (byte)var25[var5];
         var10008.HX(var1, var2, var3, var4, var14);
         var14 = 2;
         var14 = (byte)(var25[var5] + var14);
         var10004.HX(var1, var2, var3, var4, var14);
         var14 = 1;
         var14 = (byte)(var10002[var5] + var14);
         var36.HX(var1, var2, var3, var4, var14);
      } else {
         short var7 = this.ck0(var1 = q10_0.VI);
         short var8 = this.ck0(var6);
         X90 var9 = (X90)var1.Fk.f5(var7);
         if (this.Gr0 || var9 != null && var9.wk(65536) || var8 == -1) {
            this.B10(var1, var2, var3, var4, var5);
            return;
         }

         byte var10000 = qx_1.AE0[var5];
         var5 = (byte)var10000;
         byte var30 = (byte)(var10000 + 2);
         byte var10 = (byte)(var10000 + 1);
         boolean var11 = true;
         EE var12 = this.Xc[var6.iL];
         LPT6_[] var31;
         LPT6_[] var35 = var31 = tw0_0.pv.MQ(this.OD0, var7, var8, var2, (byte)var5, var11, var12);
         boolean var32 = true;
         EE var13 = this.Xc[var6.iL];
         LPT6_[] var33 = tw0_0.pv.MQ(this.OD0, var7, var8, var2, var30, var32, var13);
         var13 = this.Xc[var6.iL];
         LPT6_[] var23 = tw0_0.pv.MQ(this.OD0, var7, var8, var2, var10, true, var13);
         LPT6_ var27;
         if (var35 != null && (var27 = var31[0]) != null) {
            this.qL0(var1, var27, var3, var4, (byte)var5);
         }

         if (var33 != null && (var27 = var33[0]) != null) {
            this.qL0(var1, var27, var3, var4, var30);
         }

         if (var23 != null && (var27 = var23[0]) != null) {
            this.qL0(var1, var27, var3, var4, var10);
         }

         LPT6_ var20;
         if (var31 != null && (var20 = var31[1]) != null) {
            this.qL0(var6, var20, var3, var4, (byte)var5);
         }

         if (var33 != null && (var20 = var33[1]) != null) {
            this.qL0(var6, var20, var3, var4, var30);
         }

         if (var23 != null && (var20 = var23[1]) != null) {
            this.qL0(var6, var20, var3, var4, var10);
         }
      }

   }

   public final void Bd(q10_0 var1, short var2, byte var3, int var4, int var5, boolean var6) {
      boolean var7 = true;
      switch (var3) {
         case 18:
         case 20:
         case 21:
         case 22:
         case 25:
         case 26:
            var7 = false;
         case 19:
         case 23:
         case 24:
         default:
            short var8 = 0;
            if (var2 != 17) {
               if (var2 != 40) {
                  var8 = Ss0.zl[(int)(hk0_1.KG / 200L % (long)4)];
               } else {
                  switch ((int)(hk0_1.KG / 200L % 4L)) {
                     case 0:
                        var2 = 41;
                        var8 = 46;
                        break;
                     case 1:
                     case 3:
                        var2 = 42;
                        var8 = 47;
                        break;
                     case 2:
                        var2 = 43;
                        var8 = 48;
                  }
               }
            } else {
               switch ((int)(hk0_1.KG / 200L % 4L)) {
                  case 0:
                     var2 = 18;
                     var8 = 23;
                     break;
                  case 1:
                  case 3:
                     var2 = 19;
                     var8 = 24;
                     break;
                  case 2:
                     var2 = 20;
                     var8 = 25;
               }
            }

            if (!var6 && var7 == var6) {
               this.qL0(var1, tw0_0.pv.b50(this.OD0, var1, var8, var3, (byte)0, true, (EE)null), var4, var5, (byte)0);
            }

            _native var9 = tw0_0.pv;
            ew0_0 var10 = this.OD0;
            byte var11;
            if (var6) {
               var11 = 0;
            } else {
               var11 = 2;
            }

            LPT6_ var12 = var9.b50(var10, var1, var2, var3, var11, true, (EE)null);
            byte var13;
            if (var6) {
               var13 = 0;
            } else {
               var13 = 2;
            }

            this.qL0(var1, var12, var4, var5, var13);
            if (var6 && var7 == var6) {
               this.qL0(var1, tw0_0.pv.b50(this.OD0, var1, var8, var3, (byte)0, true, (EE)null), var4, var5, (byte)0);
            }

      }
   }

   public final void HX(q10_0 var1, byte var2, int var3, int var4, byte var5) {
      short var6 = this.ck0(var1);
      if (var1 == q10_0.Qh0 && var6 == 52) {
         switch ((int)(hk0_1.KG / 200L % 4L)) {
            case 0:
               var6 = 54;
               break;
            case 1:
            case 3:
               var6 = 55;
               break;
            case 2:
               var6 = 56;
         }
      }

      this.qL0(var1, tw0_0.pv.b50(this.OD0, var1, var6, var2, var5, true, (EE)null), var3, var4, var5);
   }

   public final void qL0(q10_0 var1, LPT6_ var2, int var3, int var4, byte var5) {
      if (var2 != null) {
         wl0_2 drawable = tg0_2.oU(var2);
         int x = this.jP.A20 + var3;
         int y = this.jP.SB0 + var4;
         drawable.uf(this.jP.M, x, y, drawable.Nx() * this.Ta, drawable.Af() * this.Ta);
         if (var5 != 2 && var5 != 5 && var5 != 8) {
            gn_0 tint = this.xG0(var1);
            if (tint != gn_0.WHITE) {
               // Tinting can return the modern drawable, not the legacy Z30 shim.
               drawable = drawable.so(tint);
            }

            drawable.uf(this.jP.M, x, y, drawable.Nx() * this.Ta, drawable.Af() * this.Ta);
         }

      }
   }

   public final void CF0(int var1) {
      this.Ta = var1;
   }

   public final void JQ(boolean var1) {
      this.Gr0 = var1;
   }

   public final void EU(byte var1) {
      Py0(var1);
      q10_0 var2;
      if ((var2 = this.zJ) != null) {
         this.QA0[var2.iL] = var1;
      }
   }

   public short ck0(q10_0 var1) {
      short var2;
      if ((var2 = this.NF[var1.iL]) != -1) {
         if (Ss0.Fv(var1, var2) > Ss0.C70 && (hk0_1.KG / 2500L & 1L) != 0L) {
            var2 = Ss0.Fv(var1, var2);
         }

         return var2;
      } else {
         E90 var4;
         if ((var4 = this.J30) != null) {
            return var4.J1.Nul(var1);
         } else {
            cd0_2 var3;
            if ((var3 = this.aY) != null) {
                short var5;
               if ((var5 = var1.NUl) > -1) {
                  if (Ss0.Fv(var1, var5 = var3.X3[var5]) > Ss0.C70 && var3.YZ[var1.NUl] != 0) {
                     var5 = Ss0.Fv(var1, var5);
                  }
               } else {
                  var5 = -1;
               }

               return var5;
            } else {
               return (short)-1;
            }
         }
      }
   }

   public gn_0 xG0(q10_0 var1) {
      if (this.pR == -1) {
         return gn_0.BLACK;
      } else if (!var1.Yy(this.ck0(var1))) {
         return gn_0.WHITE;
      } else {
         byte var2;
         if ((var2 = this.QA0[var1.iL]) == -2) {
            yb_1[] var6;
            return Py0((var6 = yb_1.rq0)[(int)(System.currentTimeMillis() / 150L % (long)var6.length)].at0);
         } else if (var2 != -1) {
            return Py0(var2);
         } else {
            E90 var9;
            if ((var9 = this.J30) != null) {
               yb_1 var4 = var9.J1.Ry0(var1);
               byte var10002 = (byte)var4.cOM7.Cc();
               yb_1 var10003 = var4;
               yb_1 var10004 = var4;
               byte var5 = (byte)var4.cOM7.TB0();
               byte var8 = (byte)var10004.cOM7.tr();
               byte var10 = (byte)(var10003.TH * 2);
               return new gn_0(var10002, var5, var8, var10);
            } else {
               cd0_2 var3;
               byte var7;
               return (var3 = this.aY) != null ? Py0((var7 = var1.NUl) > -1 ? var3.YZ[var7] : -1) : gn_0.WHITE;
            }
         }
      }
   }

   public final byte jc0(q10_0 var1) {
      if (this.pR == -1) {
         return 0;
      } else if (!var1.Yy(this.ck0(var1))) {
         return 0;
      } else {
         byte var2;
         if ((var2 = this.QA0[var1.iL]) == -2) {
            return 0;
         } else if (var2 != -1) {
            return var2;
         } else {
            E90 var5;
            if ((var5 = this.J30) != null) {
               return var5.J1.Ry0(var1).at0;
            } else {
               cd0_2 var3;
               if ((var3 = this.aY) != null) {
                  byte var4;
                  return (var4 = var1.NUl) > -1 ? var3.YZ[var4] : -1;
               } else {
                  return 0;
               }
            }
         }
      }
   }

   public final void PC0() {
      int var1 = this.Si;
      int var2 = this.Zx0;
      if (this.OD0 == ew0_0.XI0) {
         this.eQ(T10.yP[T10.xh0.gZ()], var1, var2);
      } else {
         for(byte var3 = 0; var3 < 3; ++var3) {
            if (this.oG == 1) {
               var1 = this.Si;
               var1 = var3 * 84 + var1;
            } else {
               var2 = this.Zx0;
               var2 = var3 * 84 + var2;
            }

            byte var4;
            if (this.zJ == q10_0.Qh0 && this.EA0 == 0) {
               var4 = (byte)(var3 + 6);
            } else {
               var4 = var3;
            }

            int var5;
            if ((var5 = this.EA0) == 3) {
               var4 = T10.Ui[var4][T10.R00.gZ()];
            } else if (var5 == 4) {
               var4 = T10.he0[var4][T10.J5.gZ()];
            } else {
               var4 = T10.pv0[var5 * 3 + var4][T10.h8.gZ()];
            }

            this.eQ(var4, var1, var2);
         }

      }
   }

   public final void eQ(byte var1, int var2, int var3) {
      long var4;
      if (this.To0 != (var4 = hk0_1.KG)) {
         this.To0 = var4;
         EE[] var15;
         int var5 = (var15 = this.Xc).length;

         for(int var6 = 0; var6 < var5; ++var6) {
            var15[var6].ZH = (int)((long)var15[var6].ZH + hk0_1.HI0);
         }
      }

      q10_0 var16 = q10_0.Ci;
       short ciTile = this.ck0(var16);
      q10_0 var20 = q10_0.Qh0;
      short var7 = this.ck0(var20);
      ew0_0 var8;
      boolean var17;
       if (this.OD0 == (var8 = ew0_0.C1) && ciTile != -1 && var16.Wo(ciTile) && this.Xo.l90(var1)) {
         var17 = true;
      } else {
         var17 = false;
      }

       boolean var18 = this.OD0 == var8 && var7 != -1 && var20.Wo(var7) && this.Xo.l90(var1);

      int var21;
      if (Ss0.C90(var7) && var1 >= 18 && var1 <= 26) {
         byte var26;
         switch (var1) {
            case 18:
            case 21:
            case 22:
               var26 = 18;
               break;
            case 19:
            case 23:
            case 24:
               var26 = 19;
               break;
            case 20:
            default:
               var26 = 20;
         }

         if (var7 == 17 || var7 == 40) {
            var1 = var26;
         }

         if (Ss0.lPt2(var7)) {
            this.Bd(var20, var7, var1, var2, var3, false);
         }

         var21 = var3;
         var3 = var1;
         var1 = var26;
      } else if (var7 == 52 && var1 >= 18 && var1 <= 26) {
         if ((var21 = (int)(hk0_1.KG / 200L % 4L)) != 2) {
            if (var21 == 3) {
               var3 -= 2;
            }
         } else {
            --var3;
         }

         var21 = var3;
         switch (var1) {
            case 18:
            case 21:
            case 22:
               var1 = 27;
               var3 = 18;
               break;
            case 19:
            case 23:
            case 24:
               var1 = 28;
               var3 = 19;
               break;
            case 20:
            default:
               var1 = 29;
               var3 = 20;
         }
      } else {
         var21 = var3;
         var3 = var1;
      }

      for(int var27 = 0; var27 < 3; ++var27) {
         wl0_2 drawable;
         if (var27 == 1 && (drawable = tg0_2.oU(tw0_0.pv.fr(this.OD0, this.pR, var1))) != null) {
            if (this.pR == -1) {
               drawable = drawable.so(gn_0.BLACK);
            }

            drawable.uf(this.jP.M, this.jP.A20 + var2, this.jP.SB0 + var21,
                  drawable.Nx() * this.Ta, drawable.Af() * this.Ta);
         }

         this.B10(q10_0.Cw0, var1, var2, var21, var27);
         if (!var18 && !Ss0.lPt2(var7)) {
            this.B10(q10_0.Qh0, (byte)var3, var2, var21, var27);
         }

         q10_0 var29;
         if ((var29 = q10_0.bb).cOm4(this.ck0(var29))) {
            this.B10(q10_0.pv, var1, var2, var21, var27);
         }

         if (var29.QI(this.ck0(var29))) {
            this.B10(q10_0.l3, var1, var2, var21, var27);
         }

         q10_0 var30 = q10_0.Xl;
         boolean var31;
         if (this.ck0(var30) != 1 && !this.Xo.l90(var1)) {
            var31 = true;
         } else {
            var31 = false;
         }

         if (!var31) {
            this.B10(var30, var1, var2, var21, var27);
         }

         this.B10(var29, var1, var2, var21, var27);
         if (!var17) {
            this.B10(q10_0.Ci, var1, var2, var21, var27);
         }

         this.B10(q10_0.rg0, var1, var2, var21, var27);
         this.B10(q10_0.uz, var1, var2, var21, var27);
         this.B10(q10_0.Bj0, var1, var2, var21, var27);
         if (var31) {
            this.B10(var30, var1, var2, var21, var27);
         }

         if (var17) {
            this.B10(q10_0.Ci, var1, var2, var21, var27);
         }

         if (var18 && !Ss0.lPt2(var7)) {
            this.B10(q10_0.Qh0, (byte)var3, var2, var21, var27);
         }
      }

      if (Ss0.lPt2(var7) && var1 >= 18 && var1 <= 26) {
         this.Bd(q10_0.Qh0, var7, (byte)var3, var2, var21, true);
      }

   }

   public final void Vd0(int var1, int var2) {
      long var3;
      if (this.To0 != (var3 = hk0_1.KG)) {
         this.To0 = var3;
         EE[] var9;
         int var4 = (var9 = this.Xc).length;

         for(int var5 = 0; var5 < var4; ++var5) {
            var9[var5].ZH = (int)((long)var9[var5].ZH + hk0_1.HI0);
         }
      }

      q10_0 var10;
      this.B10(var10 = q10_0.Bj0, (byte)0, var1, var2, 0);
      ew0_0 var11 = ew0_0.C1;
      wl0_2 drawable;
      if ((drawable = tg0_2.oU(tw0_0.pv.fr(var11, this.pR, 51))) != null) {
         if (this.pR == -1) {
            drawable = drawable.so(gn_0.BLACK);
         }

         drawable.uf(this.jP.M, this.jP.A20 + var1, this.jP.SB0 + var2,
               drawable.Nx() * this.Ta, drawable.Af() * this.Ta);
      }

      this.B10(q10_0.rg0, (byte)0, var1, var2, 1);
      this.B10(q10_0.uz, (byte)0, var1, var2, 1);
      this.B10(var10, (byte)0, var1, var2, 1);
   }

   public final void qd(byte var1, q10_0 var2, short var3) {
      PlayerAvatarAppearanceState var10000 = this;
      PlayerAvatarAppearanceState var10002 = this;
      byte var4;
      this.NF[var4 = var2.iL] = var3;
      var10002.QA0[var4] = var1;
      var10000.zJ = var2;
   }

   public final void MA() {
      this.OD0 = ew0_0.a;
   }

   public final void tg() {
      this.EA0 = 2;
   }

   public final void zc() {
      this.Si = -17;
      this.Zx0 = -14;
   }
}
