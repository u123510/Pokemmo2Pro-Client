package cn.pokemmo.rom.nds.dppt;

import f.*;
import com.badlogic.gdx.graphics.Texture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PlatinumBattleSceneLoader extends O8 {
   public final byte hs0;
   public final short ZG;
   public jk_0[] q50 = null;
   public xt_0 Xo0 = null;
   public ArrayList HW = null;
   public mk0_0 K2;
   public ii0_2 Sy;
   public ArrayList NP;
   public final byte Ez;
   public final int wm;
   public final String GI0;
   public Wr us = null;
   public xt_0 aH = null;
   public boolean aM0 = false;

   public PlatinumBattleSceneLoader(byte var1, byte var2, short var3, byte var4, byte var5) {
      super(var1, var4);
      this.hs0 = var2;
      this.ZG = var3;
      gn_2 var6;
      if ((var6 = wn_1.fj0().vi(var2, var3)) == null) {
         var6 = wn_1.fj0().l3();
      }

      this.Ez = var6.VK0();
      this.wm = ZU.ay(var6.A5());
      this.GI0 = var6.gK0();
      ((O8)this).fC(var5);
   }

   public PlatinumBattleSceneLoader(byte var1, byte var2, byte var3, byte var4, int var5, byte var6, byte var7) {
      super(var1, var6);
      this.hs0 = var2;
      this.ZG = -1;
      this.Ez = var3;
      this.wm = ZU.ay(var4);
      this.GI0 = sm0_0.c0(var5);
      ((O8)this).fC(var7);
   }

   public final void Dt(float var1, float var2) {
      this.NP = new ArrayList();
      com3__3 var12 = null;
      ZU var3 = ZU.kB;
      byte var4 = this.hs0;
      int var5 = this.wm;
      H40 var21;
      if ((var21 = (H40)var3.Vp0.BM(var4)) == null || !var21.dp0.l90(var5)) {
         byte var22;
         if ((var22 = this.hs0) != 2 || (var5 = this.wm) != 37 && var5 != 38 && var5 != 40) {
            xt_0 var34 = null;
            label76: {
               label53: {
                  label52: {
                     if (var22 == 3) {
                        Ts var26 = tw0_0.Ll0.nC0;
                        int var41 = this.wm;
                        FJ var48 = new FJ((Ae)var26.fd0.dg.get("/poketool/trgra/trfgra.narc"));
                        int var42;
                        mm_1 var28 = new mm_1(var48.GJ((var42 = var41 * 5) + 3), false);
                        if (var28.yq0(1) < 1) {
                           break label52;
                        }

                        Tt0 var51 = new Tt0(var48.GJ(var42 + 1));
                        Gt0 var53 = new Gt0(var48.GJ(var42), true);
                        Rk0 var55 = new Rk0(var48.GJ(var42 + 2), false);
                        var34 = new xt_0(var51, var53, var55, (mm_1)null, (E3)null, var28);
                        var34.LpT3 = 80;
                        var34.Uy0 = 80;
                     } else {
                        if (var22 != 4) {
                           break label76;
                        }

                        UY var30 = tw0_0.Ll0.t1;
                        int var44 = this.wm;
                        FJ var49 = new FJ((Ae)var30.fd0.dg.get("/a/0/5/8"));
                        int var45;
                        mm_1 var32 = new mm_1(var49.GJ((var45 = var44 * 5) + 3), false);
                        if (var32.yq0(1) < 1) {
                           break label52;
                        }

                        Tt0 var52 = new Tt0(var49.GJ(var45 + 1));
                        Gt0 var54 = new Gt0(var49.GJ(var45), true);
                        Rk0 var56 = new Rk0(var49.GJ(var45 + 2), false);
                        var34 = new xt_0(var52, var54, var56, (mm_1)null, (E3)null, var32);
                        var34.LpT3 = 80;
                        var34.Uy0 = 80;
                     }

                     break label53;
                  }

                  var34 = null;
               }

               this.aH = var34;
            }
         } else {
            nj0_0 var23 = tw0_0.Ll0.Qz0;
             FJ var6 = new FJ((Ae)var23.fd0.dg.get("/a/0/7/2"));
             int var40;
             Rk0 var25 = new Rk0(var6.GJ((var40 = var5 * 8) + 2), false);
             Tt0 var7 = new Tt0(var6.GJ(var40 + 7));
             Gt0 var8 = new Gt0(var6.GJ(var40 + 1), true);
             mm_1 var9 = new mm_1(var6.GJ(var40 + 3), true);
             E3 var10 = new E3(var6.GJ(var40 + 4));
             mm_1 var11 = new mm_1(var6.GJ(var40 + 5), false);
            this.aH = new xt_0(var7, var8, var25, var9, var10, var11);
         }

         xt_0 var35;
         if ((var35 = this.aH) != null) {
            xt_0 var62 = var35;
            xt_0 var68 = var35;
            xt_0 var69 = var35;
            xt_0 var10003 = var35;
            xt_0 var10004 = var35;
            xt_0 var10005 = var35;
            xt_0 var10006 = var35;
            boolean var13 = false;
            boolean var36 = false;
            var10006.No0 = 1;
            var10005.PP = var13;
            var10004.rF = var36;
            var10003.rs0 = false;
            var69.coM9 = true;
            var68.coM9 = false;
            LPT6_ var14 = var62.yq();
            var36 = true;
            com3__3 var46 = new com3__3(var14.bz, var14.xZ, var14, var36);
            var46.qr0(vr_1.Lt0);
            var46.j.na(var2 + 0.25F, 0.025F, 0.0F);
            var12 = var46;
         }
      }

      if (var12 == null) {
         ZU var64 = var3;
         byte var15 = this.hs0;
         int var19 = this.wm;
         H40 var16;
         Wr var17;
         if ((var16 = (H40)var64.Vp0.BM(var15)) == null) {
            var17 = Wr.Mk0;
         } else {
            Wr var38;
            if ((var38 = (Wr)var16.dp0.get(var19)) == null) {
               var38 = (Wr)var16.Com3.get(var19);
            }

            if (var38 == null) {
               var17 = Wr.Mk0;
            } else {
               var17 = var38;
            }
         }

         this.us = var17;
         ((CG)var17).O50(this);
         LPT6_ var18 = new LPT6_(this.us.H8());
         var5 = var18.bz;
         com3__3 var39 = new com3__3(var5, var18.xZ, var18, true);
         var39.qr0(vr_1.Lt0);
         var39.j.na(var2 + 0.25F, -0.025F, 0.0F);
         var12 = var39;
      }

      this.NP.add(var12);
   }

   public final void vy() {
      xt_0 var1;
      if ((var1 = this.aH) != null) {
         xt_0 var10000 = var1;
         xt_0 var10001 = var1;
         xt_0 var10002 = var1;
         xt_0 var10003 = var1;
         xt_0 var10004 = var1;
         byte var4 = 1;
         boolean var2 = false;
         boolean var3 = false;
         var10004.No0 = var4;
         var10003.PP = var2;
         var10002.rF = var3;
         var10001.rs0 = false;
         var10000.coM9 = true;
      }

      this.aM0 = true;
   }

   public final void LPT7() {
      xt_0 var1;
      if ((var1 = this.aH) != null) {
         lg_0.k.lPT5(var1);
      }

   }

   public final List v10() {
      return (List)(this.hs0 == 3 && this.wm == 65 && !this.aM0 ? Collections.emptyList() : this.NP);
   }

   public final void Vs0(int var1, int var2) {
      byte var31;
      jk_0 var100;
      jk_0 var10001;
      int var10002;
      if ((var2 = this.hs0) == 2 && this.Ez == 37) {
         nj0_0 var40 = tw0_0.Ll0.Qz0;
         FJ var56 = new FJ((Ae)var40.fd0.dg.get("/a/0/6/4"));
         Rk0 var42 = new Rk0(var56.GJ(26), false);
         Tt0 var64 = new Tt0(var56.GJ(31));
         Gt0 var67 = new Gt0(var56.GJ(25), true);
         mm_1 var69 = new mm_1(var56.GJ(27), true);
         E3 var71 = new E3(var56.GJ(28));
         mm_1 var73 = new mm_1(var56.GJ(29), false);
         short var57 = var42.bs0.j2;

         for(int var75 = 0; var75 < var57; ++var75) {
            Bp0 var78 = new Bp0();
            Bp0 var11 = new Bp0();
            var42.DX(var75, var78, var11);
            if (var75 >= 9 && var75 <= 13) {
               var78.x = 48.0F;
               var78.y = 48.0F;
               var11.x = 24.0F;
               var11.y = 24.0F;
            }

            i4_0 var12 = new i4_0((int)var78.x, (int)var78.y, ix0_0.Vw);
            var42.Q60(var75, var67, var64, var12, var11, (short[])null);
            var42.Lpt8();
            var12.dispose();
         }

         xt_0 var58 = new xt_0(var64, var67, var42, var69, var71, var73);
         this.Xo0 = var58;
         byte var65 = 1;
         D30 var43;
         if ((var43 = var58.t2) == null) {
            LJ0 var68 = new LJ0(1024, 1024, ix0_0.Vw, 2, true);
            ix0_0 var44 = ix0_0.Vw;
            byte var70 = 10;
            int var45 = 0;
            int var72 = var58.oL.yq0(var65);

            int var76;
            for(int var74 = 0; (var76 = (int)Math.floor((double)((float)var45 * 0.6F))) < var72; var45 += var70) {
               ix0_0 var80 = ix0_0.Vw;
               i4_0 var79 = new i4_0(192, 128, var80);
               mm_1 var81;
               mm_1 var118 = var81 = var58.oL;
               E3 var86 = var58.fa;
               mm_1 var13 = var58.JY;
               Rk0 var14 = var58.em;
               Gt0 var15 = var58.qI0;
               Tt0 var16 = var58.BY;
               Bp0 var17 = new Bp0(96.0F, 112.0F);
               Lw0 var18;
               if (var65 < (var18 = var118.yG).v3) {
                  gl_1 var89;
                  iv_2[] var19 = (var89 = var18.Sc[var65]).wz0;
                  int var20 = 0;
                  int var21 = -1;

                  short var24;
                  label501:
                  for(short var22 = 0; var22 < var89.Mi; var21 = var24) {
                     iv_2 var109 = var19[var22];
                     short var23 = var19[var22].tj;
                     if ((var24 = var109.Sm.DK0) != var21) {
                        var20 = 0;
                     }

                     if (var76 < var23) {
                        var76 = var20 + var76;
                        Lw0 var82;
                        if (var65 >= (var82 = var81.yG).v3) {
                           break;
                        }

                        gl_1 var110 = var82.Sc[var65];
                        OD0 var83 = new OD0();
                        short[] var124 = new short[4];
                        Bp0 var90 = new Bp0();
                        if (!mm_1.t90(var110, var22, var83, var124, var90)) {
                           break;
                        }

                        var90.x += var17.x;
                        var90.y += var17.y;
                        int var84;
                        if ((var84 = var83.VB) >= 0) {
                           if (var84 >= var86.Hy0.I40) {
                              break;
                           }

                            j90_0 var85;
                            aq_0[] var87 = (var85 = var86.mh0[var84]).rI;
                            int var91;

                           for(int var88 = 0; var88 < (var91 = var85.qv0); ++var88) {
                              aq_0 var92;
                              aq_0 var125 = var92 = var87[var91 - 1 - var88];
                              Bp0 var95 = new Bp0(var90.x + (float)var92.J3, var90.y + (float)var92.x60);
                              short var93;
                              Lw0 var98;
                              var21 = var13.yz0(var76, var125.N80);
                              var93 = var92.N80;
                              var98 = var13.yG;
                              if (var21 < 0 || var93 < 0 || var93 >= var98.v3) {
                                 break label501;
                              }

                              var110 = var98.Sc[var93];
                              OD0 var94 = new OD0();
                              short[] var97 = new short[4];
                              Bp0 var99 = new Bp0();
                              if (!mm_1.t90(var110, var21, var94, var97, var99)) {
                                 break label501;
                              }

                              var99.x += var95.x;
                              var99.y += var95.y;
                              var14.Q60(var94.VB, var15, var16, var79, var99, var97);
                           }
                           break;
                        }

                        var86.getClass();
                        break;
                     }

                     var76 -= var23;
                     var20 += var23;
                     ++var22;
                  }
               }

               var68.y9(Integer.toString(var74++), var79);
               var79.dispose();
            }

            LJ0 var127 = var68;
            var58.em.Lpt8();
            eb0_1 var46 = eb0_1.Y30;
            synchronized(var68){}

            D30 var59 = new D30();
            var127.DD(var59, var46, var46);

            var58.t2 = var59;
            var68.dispose();
            var43 = var58.t2;
         }

         es_1 var47;
         this.q50 = new jk_0[(var47 = var43.kE).KB];

         for(int var60 = 0; var60 < var47.KB; ++var60) {
            jk_0[] var114 = this.q50;
            jk_0 var66 = new jk_0((LPT6_)var47.get(var60));
            var114[var60] = var66;
         }

         var100 = this.q50[0];
         jk_0 var61;
         var10001 = var61 = var100;
         ii0_2 var48 = new ii0_2(var61);
         this.Sy = var48;
         var10002 = var1 + 296;
         var31 = 32;
      } else {
         label537: {
            if (var2 == 3) {
               var2 = -1;
               byte var3;
               if ((var3 = this.Ez) != 63) {
                  switch (var3) {
                     case 90:
                        var2 = 3;
                        break;
                     case 91:
                        var2 = 4;
                        break;
                     case 92:
                        var2 = 5;
                        break;
                     case 93:
                        var2 = 6;
                        break;
                     case 94:
                        var2 = 7;
                        break;
                     case 95:
                        var2 = 8;
                        break;
                     case 96:
                        var2 = 9;
                  }
               } else {
                  var2 = 2;
               }

               if (var2 > -1) {
                  Ts var51 = tw0_0.Ll0.nC0;
                   FJ var62 = new FJ((Ae)var51.fd0.dg.get("/poketool/trgra/trbgra.narc"));
                   int var36;
                   Rk0 var53 = new Rk0(var62.GJ((var36 = var2 * 5) + 2), false);
                   Tt0 var5 = new Tt0(var62.GJ(var36 + 1));
                   Gt0 var6 = new Gt0(var62.GJ(var36), false);
                   new mm_1(var62.GJ(var36 + 3), false);
                   ArrayList var37 = new ArrayList();
                   short var63 = var53.bs0.j2;

                  for(int var7 = 0; var7 < var63; ++var7) {
                      Bp0 var8 = new Bp0();
                      Bp0 var9 = new Bp0();
                      var53.DX(var7, var8, var9);
                      i4_0 var10 = new i4_0((int)var8.x, (int)var8.y, ix0_0.Vw);
                     var53.Q60(var7, var6, var5, var10, var9, (short[])null);
                     var53.Lpt8();
                     var37.add(new Texture(var10));
                      var10.dispose();
                  }

                  this.HW = var37;
                  this.q50 = new jk_0[var37.size()];

                  for(int var38 = 0; var38 < this.HW.size(); ++var38) {
                     jk_0[] var104 = this.q50;
                      jk_0 var54 = new jk_0((Texture)this.HW.get(var38));
                     var104[var38] = var54;
                  }

                  var100 = this.q50[0];
                  jk_0 var55;
                  var10001 = var55 = var100;
                  ii0_2 var39 = new ii0_2(var55);
                  this.Sy = var39;
                  var10002 = var1 + 296;
                  var31 = 32;
                  break label537;
               }
            }

            _native var10000 = tw0_0.pv;
            var2 = 0;
            var10000.getClass();
            qe0_2 var49 = new qe0_2();
            ec0_1 var4 = new ec0_1((byte)var2, var49);
            var100 = (this.q50 = var10000.Rc0(var4))[0];
            jk_0 var50;
            var10001 = var50 = var100;
            ii0_2 var35 = new ii0_2(var50);
            this.Sy = var35;
            var10002 = var1 + 296;
            var31 = 32;
         }
      }

      var10001.yJ = var10002;
      var100.tX = var31;
   }

   public final con__6 Td0() {
      return con__6.tZ;
   }

   public final String a70(a10_0 var1) {
      if (var1.Sv == XA0.at) {
          StringBuilder var2 = new StringBuilder();
         return ig_0.u9(200506, var2, "\n\n").append(sm0_0.wa0(200507, String.valueOf(var1.fD0))).toString();
      } else {
         return "";
      }
   }

   public final String BO() {
      lpt6__2 var10000 = lpt6__2.Q80;
      byte var1 = 15;
      byte var2 = 7;
      String[] var3;
      String[] var10001 = var3 = new String[2];
      var3[0] = this.yB();
      var10001[1] = this.uq0();
      return sm0_0.fg0((byte)2, var10000, var1, var2, var3);
   }

   public final String T8(a10_0 var1) {
       ArrayList var2 = new ArrayList();
      var2.add(this.yB());
       var2.add(this.uq0());
      int var3 = 0;
      byte var4 = 0;

      while(true) {
         byte var5 = super.ZG0;
         if (var4 >= (byte)var1.wI0[var5].length) {
            if (var3 < 1) {
               return "";
            }

            int var7 = var3 + 13;
            Cq var9 = var1.nf;
            if ((var5 > 0 ? var9.Lw0 : var9.e50) > 3) {
               var7 = 5022;
               var2.clear();
               var2.add(this.yB());
               var2.add(this.uq0());
            }

            lpt6__2 var6 = lpt6__2.Q80;
            byte var8 = 15;
            String[] var10 = (String[])var2.toArray(new String[0]);
            return sm0_0.fg0((byte)2, var6, var8, var7, var10);
         }

         PF var11;
         if ((var11 = var1.Ce(var5, var4)) != null && !var11.zi0.hf0()) {
            ++var3;
            var2.add(var11.A60());
         } else {
            var2.add("");
         }

         ++var4;
      }
   }

   public final void Wa0(hl0_1 var1) {
      if (this.Sy != null) {
         this.q50[0].gy(var1);
      }

      mk0_0 var2;
      if ((var2 = this.K2) != null) {
         var2.nr(var1);
      }

   }

   public final void Cq0(int var1, boolean var2) {
      if (var2) {
          mk0_0 var3 = new mk0_0(this.q50, var1);
          this.K2 = var3;
         if (this.hs0 == 2 && this.Ez == 37) {
            var3.WV = 60;
         }

         var3.Ti0();
      }

      this.Sy = null;
   }

   public final void aE0(float var1, byte var2) {
      if (super.ZG0 != super.lpT2.Ez0()) {
         tw0_0.LD0.he0.R9(super.ZG0, var1, var2);
      }

   }

   public final ii0_2 b90() {
      return this.Sy;
   }

   public final String Zc() {
      byte var3 = 15;
      byte var1 = 76;
      String[] var2 = sm0_0.zb0;
      return sm0_0.Bw((byte)2, lpt6__2.Q80, var3, var1, var2);
   }

   public final boolean pq(ML0 var1, boolean var2, String var3, SZ[] var4, int var5) {
      boolean var6 = (boolean)(var2 ^ true);
      if (!var2) {
         lpt6__2 var10001 = lpt6__2.Q80;
         byte var7 = 15;
         byte var8 = 44;
         String[] var9;
         String[] var10002 = var9 = new String[2];
         var9[0] = this.yB();
         var10002[1] = this.uq0();
         var1.wJ(sm0_0.fg0((byte)2, var10001, var7, var8, var9), "", (Runnable)null);
      }

      boolean var10 = var6 | super.pq(var1, (boolean)var2, var3, var4, var5);
      if (!var2 && var5 > 0) {
         ML0 var10000 = var1;
         lpt6__2 var14 = lpt6__2.Q80;
         byte var11 = 15;
         byte var12 = 58;
         String[] var13;
         String[] var15 = var13 = new String[2];
         var15[0] = var3;
         var15[1] = var5 + "";
         var10000.wJ(sm0_0.fg0((byte)2, var14, var11, var12, var13), "", (Runnable)null);
      }

      return var10;
   }

   public final String M2() {
      return this.yB() + " " + this.uq0();
   }

   public final String jI() {
      return this.uq0();
   }

   public final String bM(O8 var1) {
      return this.uq0();
   }

   public final byte f90() {
      byte var1;
      if ((var1 = this.hs0) == 4 && this.Ez == 109) {
         return 2;
      } else {
         return var1 == 10 ? tw0_0.e60.Com4 : var1;
      }
   }

   public final short WK0() {
      switch (this.hs0) {
         case 0:
            byte var4;
            if ((var4 = this.Ez) != 23 && var4 != 24) {
               if (var4 == 30) {
                  return 299;
               }

               if (var4 != 84 && var4 != 87) {
                  if (var4 != 90) {
                     break;
                  }

                  return 299;
               }
            }

            return 296;
         case 1:
            switch (this.Ez) {
               case 3:
               case 9:
               case 11:
               case 49:
                  return 475;
               case 13:
               case 53:
                  return 483;
               case 31:
                  return 482;
               case 32:
                  return 477;
               case 38:
                  return 478;
               case 50:
                  return 481;
               default:
                  return super.WK0();
            }
         case 2:
            byte var3;
            if ((var3 = this.Ez) == 47) {
               return 1137;
            }

            if (var3 == 89) {
               return 1136;
            }

            if (var3 == 100) {
               return 1145;
            }

            if (var3 == 101) {
               return 1138;
            }

            switch (var3) {
               case 10:
               case 11:
               case 12:
                  return 1132;
               default:
                  switch (var3) {
                     case 19:
                     case 20:
                     case 21:
                     case 22:
                     case 23:
                        return 1132;
                     default:
                        switch (var3) {
                           case 37:
                           case 38:
                              return 1133;
                           case 39:
                              return 1134;
                           case 40:
                              return 1137;
                           default:
                              switch (var3) {
                                 case 54:
                                 case 55:
                                 case 56:
                                    return 1132;
                                 default:
                                    switch (var3) {
                                       case 77:
                                          return 1134;
                                       case 78:
                                       case 79:
                                       case 80:
                                       case 81:
                                          return 1135;
                                       case 82:
                                          return 1139;
                                       default:
                                          return super.WK0();
                                    }
                              }
                        }
                  }
            }
         case 3:
            byte var2;
            if ((var2 = this.Ez) == 97) {
               return 1202;
            }

            switch (var2) {
               case 62:
               case 64:
                  return 1117;
               case 63:
                  return 1124;
               case 65:
               case 66:
               case 67:
               case 68:
                  return 1136;
               case 69:
                  return 1122;
               default:
                  switch (var2) {
                     case 72:
                        return 1134;
                     case 73:
                        return 1123;
                     case 74:
                     case 75:
                     case 76:
                     case 77:
                     case 78:
                     case 79:
                        return 1117;
                     default:
                        switch (var2) {
                           case 86:
                              return 1120;
                           case 87:
                           case 88:
                              return 1134;
                           case 89:
                              return 1123;
                           default:
                              switch (var2) {
                                 case 99:
                                 case 100:
                                 case 101:
                                 case 102:
                                    return 1202;
                                 default:
                                    return super.WK0();
                              }
                        }
                  }
            }
         case 4:
            byte var1;
            if ((var1 = this.Ez) == 23) {
               return 1119;
            }

            if (var1 == 55 || var1 == 62) {
               return 1120;
            }

            if (var1 == 70 || var1 == 112) {
               return 1118;
            }

            if (var1 == 114 || var1 == 124) {
               return 1120;
            }

            if (var1 == 66 || var1 == 67) {
               return 1118;
            }

            switch (var1) {
               case 72:
               case 73:
               case 74:
               case 75:
               case 76:
                  return 1118;
               default:
                  switch (var1) {
                     case 86:
                        return 1124;
                     case 87:
                     case 88:
                     case 89:
                        return 1118;
                     default:
                        switch (var1) {
                           case 97:
                           case 99:
                           case 100:
                           case 101:
                           case 102:
                              return 1147;
                           case 98:
                           case 103:
                           case 104:
                           case 105:
                           case 106:
                           case 107:
                           case 108:
                           case 110:
                              return 1118;
                           case 109:
                              return 1165;
                           default:
                              switch (var1) {
                                 case 116:
                                 case 117:
                                 case 118:
                                    return 1120;
                                 case 119:
                                    return 1119;
                              }
                        }
                  }
            }
      }

      return super.WK0();
   }

   public final byte Mo() {
      return this.hs0 == 4 && this.Ez == 109 ? 2 : tw0_0.e60.Com4;
   }

   public final short cd() {
      byte var1;
      label210:
      switch (var1 = this.hs0) {
         case 0:
            byte var7;
            if ((var7 = this.Ez) == 23 || var7 == 24 || var7 == 30 || var7 == 84 || var7 == 87 || var7 == 90) {
               return 312;
            }
            break;
         case 1:
            byte var6;
            if ((var6 = this.Ez) == 3 || var6 == 9 || var6 == 11 || var6 == 13) {
               return 424;
            }

            if (var6 == 38) {
               return 355;
            }

            if (var6 == 49 || var6 == 53) {
               return 424;
            }

            if (var6 == 31) {
               return 355;
            }

            if (var6 == 32) {
               return 354;
            }
            break;
         case 2:
            byte var5;
            if ((var5 = this.Ez) == 39) {
               return 1151;
            }

            if (var5 == 47) {
               return 1151;
            }

            if (var5 == 89) {
               return 1152;
            }

            if (var5 == 101) {
               return 1151;
            }

            switch (var5) {
               case 10:
               case 11:
               case 12:
                  return 1150;
               default:
                  switch (var5) {
                     case 19:
                     case 20:
                     case 21:
                     case 22:
                     case 23:
                        return 1150;
                     default:
                        switch (var5) {
                           case 54:
                           case 55:
                           case 56:
                              return 1150;
                           default:
                              switch (var5) {
                                 case 77:
                                    return 1151;
                                 case 78:
                                 case 79:
                                 case 80:
                                 case 81:
                                    return 1152;
                                 case 82:
                                    return 1151;
                                 default:
                                    break label210;
                              }
                        }
                  }
            }
         case 3:
            byte var4;
            if ((var4 = this.Ez) == 97) {
               return 1203;
            }

            switch (var4) {
               case 62:
               case 64:
                  return 1129;
               case 63:
                  return 1128;
               case 65:
               case 66:
               case 67:
               case 68:
                  return 1133;
               case 69:
                  return 1130;
               default:
                  switch (var4) {
                     case 73:
                        return 1131;
                     case 74:
                     case 75:
                     case 76:
                     case 77:
                     case 78:
                     case 79:
                        return 1129;
                     default:
                        switch (var4) {
                           case 86:
                              return 1132;
                           case 87:
                           case 88:
                              return 1131;
                           case 89:
                              return 1131;
                           default:
                              switch (var4) {
                                 case 99:
                                 case 100:
                                 case 101:
                                 case 102:
                                    return 1203;
                                 default:
                                    break label210;
                              }
                        }
                  }
            }
         case 4:
            byte var3;
            if ((var3 = this.Ez) == 66 || var3 == 67 || var3 == 70 || var3 == 112) {
               return 1131;
            }

            switch (var3) {
               case 72:
               case 73:
               case 74:
               case 75:
               case 76:
                  return 1131;
               default:
                  switch (var3) {
                     case 87:
                     case 88:
                     case 89:
                        return 1131;
                     default:
                        switch (var3) {
                           case 97:
                           case 99:
                           case 100:
                           case 101:
                           case 102:
                              return 1148;
                           case 98:
                           case 103:
                           case 104:
                           case 105:
                           case 106:
                           case 107:
                           case 108:
                           case 110:
                              return 1131;
                           case 109:
                              return 1152;
                        }
                  }
            }
      }

      con__6 var8 = con__6.tZ;
      short[] var2;
      return var1 >= 0 && var1 < (var2 = var8.Ub).length ? var2[var1] : var8.Ub[0];
   }

   public final void dispose() {
      xt_0 var1;
      if ((var1 = this.Xo0) != null) {
         var1.dispose();
         this.Xo0 = null;
      }

      ArrayList var3;
      if ((var3 = this.HW) != null) {
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            ((Texture)var4.next()).dispose();
         }

         this.HW = null;
      }

      Wr var5;
      if ((var5 = this.us) != null) {
         ((CG)var5).sI0(this);
         this.us = null;
      }

      xt_0 var2;
      if ((var2 = this.aH) != null) {
         var2.dispose();
      }

   }

   public final String yB() {
      byte var1;
      return (var1 = this.hs0) == 10 ? sm0_0.c0(this.Ez + 190000) : sm0_0.c0(var1 * 120 + 190000 + this.Ez);
   }

   public final String uq0() {
      byte var1;
      byte var2;
      if ((var1 = this.hs0) != 0 || (var2 = this.Ez) != 81 && var2 != 89 && var2 != 90) {
         return var1 == 3 && this.Ez == 63 ? sm0_0.CY(var1) : this.GI0;
      } else {
         return sm0_0.CY(var1);
      }
   }
}
