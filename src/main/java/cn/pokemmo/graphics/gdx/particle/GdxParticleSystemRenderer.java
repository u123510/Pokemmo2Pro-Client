package cn.pokemmo.graphics.gdx.particle;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class GdxParticleSystemRenderer extends vo_2 {
   public static final C8 Pk0 = new C8();
   public static final C8 Ec = new C8();
   public yl_0 nK;
   public float NC0;
   public boolean fj0;
   public z20_0 Uk0;
   public z20_0 X7;
   public PC0 vk0;
   public final ly0_0 IZ;
   public hl0_1 E20;
   public final xo0 yl;
   public int zv0;
   public int y0;
   public final es_1 Ui;

   public GdxParticleSystemRenderer() {
      this.nK = null;
      this.NC0 = 4.0F;
      this.fj0 = false;
      this.Uk0 = null;
      this.X7 = null;
      this.IZ = new ly0_0();
      this.yl = new xo0();
      this.zv0 = 1;
      this.y0 = 1;
      this.Ui = new es_1();
      this.qf = null;
      this.Ix();
   }

   public final boolean yp(byte var1) {
      return var1 == 0 || var1 == 1;
   }

   public final float Bc() {
      if (this.fj0) {
         return this.NC0;
      } else {
         int var1;
         if (tw0_0.kz0()) {
            var1 = dw_2.Mv0;
            if (var1 > 2) {
               return (float)var1;
            } else {
               var1 = lg_0.S4.Kr0() + 10;
               if (var1 < 1152) {
                  return 3.0F;
               } else if (var1 < 1920) {
                  return 4.0F;
               } else if (var1 < 2560) {
                  return 5.0F;
               } else {
                  return var1 < 3840 ? 6.0F : 8.0F;
               }
            }
         } else {
            var1 = dw_2.Mv0;
            if (var1 > 3) {
               return (float)var1;
            } else {
               var1 = lg_0.S4.Kr0() - 10;
               if (var1 <= 1920) {
                  return 4.0F;
               } else if (var1 < 2560) {
                  return 5.0F;
               } else {
                  return var1 < 3840 ? 6.0F : 8.0F;
               }
            }
         }
      }
   }

   public final void M9() {
      this.fj0 = false;
   }

   public final void Dt0(int var1, int var2) {
      this.NC0 = this.Bc();
      this.vk0 = new PC0();
      this.zv0 = var1;
      this.y0 = var2;
      this.vk0.Ka0((float)var1, (float)var2, true);
      this.vk0.LH = 1.0F / this.NC0;
      this.vk0.R1(true);
      this.E20.Po(this.vk0.iJ);
   }

   public final void HF0() {
      this.fj0 = true;
      this.NC0 += 1.0F;
      this.Dt0(lg_0.S4.Kr0(), lg_0.S4.sD0());
   }

   public final void uD0() {
      this.fj0 = true;
      this.NC0 -= 1.0F;
      if (this.NC0 < 1.0F) {
         this.NC0 = 1.0F;
      }

      this.Dt0(lg_0.S4.Kr0(), lg_0.S4.sD0());
   }

   public final void Yt(double var1) {
      this.fj0 = true;
      this.NC0 = (float)((double)this.NC0 - var1);
      if (this.NC0 < 1.0F) {
         this.NC0 = 1.0F;
      }

      this.Dt0(lg_0.S4.Kr0(), lg_0.S4.sD0());
   }

   public final void aN(float var1) {
      this.NC0 = var1;
      if (var1 < 1.0F) {
         this.NC0 = 1.0F;
      }

      this.Dt0(lg_0.S4.Kr0(), lg_0.S4.sD0());
   }

   public final String g80() {
      return "\nMap Render Calls: " + this.E20.mW;
   }

   public final void dispose() {
      Vs0 var1 = tw0_0.ys0;
      if (var1 != null) {
         var1.dispose();
         tw0_0.ys0 = null;
      }

      this.E20.dispose();
      this.yl.dispose();
   }

   public final Tv0 So() {
      return this.vk0;
   }

   public final ly0_0 Ej0() {
      return this.IZ;
   }

   public final void RU(bi0_1 var1, iq0_0 var2, ArrayList var3) {
      if (var1 != null) {
         if (var1.ba0.V20() != null) {
            Pk0.np(var1.uR().ze0);
            Pk0.x += 8.0F;
            if (R30.cf(var2, Pk0, new C8(16.0F, 32.0F, 100.0F))) {
               var3.add(var1);
            }
         }
      }
   }

   public final void qq0(PRN_ var1) {
      _else var2 = tw0_0.e60.N60();
      if (var2 != null) {
         gh_0 var3 = var2.lm0;
         if (var3 != gh_0.tA && var3 != gh_0.fs0 && var3 != gh_0.GM && var3 != gh_0.vm0) {
            c8_0 var7 = c8_0.JD0;
            int var4 = var7.d60() * 100 + (int)((double)(var7.ki0() % 3600 / 60) * 1.65D);
            if (var4 > 1400 && var4 <= 2000) {
               var1.v50.set(1.0F, 1.0F, 1.0F, 1.0F);
            } else if (var4 >= 700 && var4 <= 2000) {
               var1.v50.set(1.0F, 1.0F, 1.0F, 0.75F);
            } else {
               float var5;
               if (var4 > 2000 && var4 < 2255) {
                  var5 = (float)(2255 - var4) / 255.0F;
                  float var6 = var5 * 0.7099999785F + 0.2899999917F;
                  var1.v50.set(var6, var6, var5 * 0.5F + 0.5F, var5 * 0.25F + 0.75F);
               } else if (var4 > 445 && var4 < 700) {
                  var5 = (float)(var4 - 445) / 255.0F;
                  float var8 = var5 * 0.7099999785F + 0.2899999917F;
                  float var9 = var5 * 0.5F + 0.5F;
                  var1.v50.set(var8, var8, var9, var9);
               } else {
                  var1.v50.set(0.2899999917F, 0.2899999917F, 0.5F, 0.5F);
               }
            }
         } else {
            var1.v50.set(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }
   }

   public final void GU(boolean var1) {
      this.vn0 = var1;
      if (!var1) {
         this.qF0(s4_0.rP, true);
      }
   }

   public final void Ix() {
      this.E20 = new hl0_1();
      this.Dt0(lg_0.S4.Kr0(), lg_0.S4.sD0());
      if (tw0_0.ys0 == null) {
         tw0_0.ys0 = new Vs0();
      }
   }

   public final void qF0(s4_0 var1, boolean var2) {
      if (!lpt3__1.oq0 && (lpt3__1.RJ || tw0_0.Eu(8))) {
         var1 = s4_0.rP;
      } else if (!this.vn0) {
         var1 = s4_0.rP;
      }

      z20_0 var3 = this.Uk0;
      if (var3 == null || var3.ra != var1) {
         if (var3 != null) {
            if (var2) {
               this.X7 = null;
            } else {
               this.X7 = var3;
               var3.CJ = true;
            }
         }

         if (var1 != s4_0.Oj0 && var1 != s4_0.n2 && var1 != s4_0.Vw0 && var1 != s4_0.Gk0) {
            if (var1 == s4_0.sQ) {
               this.Uk0 = new l60(var1, var2);
            } else if (var1 == s4_0.SA0) {
               this.Uk0 = new fo_0(var1, var2);
            } else if (var1 == s4_0.Ci) {
               this.Uk0 = new EX(var1, var2);
            } else if (var1 == s4_0.CD0) {
               this.Uk0 = new gb0_1(var1, var2);
            } else if (var1 == s4_0.tA0) {
               this.Uk0 = new kk0_2(var1, var2);
            } else {
               this.Uk0 = null;
            }
         } else {
            this.Uk0 = new ak_0(var1, var2);
         }

         _else var4 = tw0_0.e60.N60();
         if (var4 != null && var4.lm0 == gh_0.GM) {
            this.Uk0 = new BC(var1, var2);
         }
      }
   }

   public final void Xf0() {
      yt_1 var1 = tw0_0.e60;
      if (var1 == null) {
         this.fX = false;
      } else {
         this.UU = false;
         _else var2 = var1.N60();
         E90 var3 = tw0_0.e60.jB0;
         if (var3 != null && tw0_0.rl.NA && var2 instanceof yl_0) {
            yl_0 var4 = (yl_0)var2;
            if (dw_2.Kr) {
               xo0 var5 = this.yl;
               na_0 var6 = var5.Bp;
               boolean var7 = var6 != null && var5.ql == var4;
               boolean drawBorder = false;
               if (!var7 || var5.Ud) {
                  if (!var7) {
                     if (var6 != null) {
                        var5.dispose();
                     }

                     var5.ql = var4;
                     ui_1 var8 = new ui_1();
                     var5.Qe = var8;
                     PC0 var9 = new PC0();
                     if (var4.final$ != null) {
                        Object var10 = var4.final$.Xl.Oa0.Wk0("border_width");
                        String var11 = "0";
                        if (var10 != null) {
                           var11 = (String)var10;
                        }

                        var4.wK0 = Integer.parseInt(var11);
                        Object var12 = var4.final$.Xl.Oa0.Wk0("border_height");
                        String var13 = "0";
                        if (var12 != null) {
                           var13 = (String)var12;
                        }

                        int var14 = Integer.parseInt(var13);
                        var4.com8 = var14;
                        if (var4.wK0 >= 1 && var14 >= 1) {
                           String[] var15 = new String[2];
                           Object var16 = var4.final$.Xl.Oa0.Wk0("border_bottom");
                           String var17 = "";
                           if (var16 != null) {
                              var17 = (String)var16;
                           }

                           var15[0] = var17;
                           Object var18 = var4.final$.Xl.Oa0.Wk0("border_top");
                           String var19 = "";
                           if (var18 != null) {
                              var19 = (String)var18;
                           }

                           var15[1] = var19;
                           var4.te0 = new wx_1[2][];
                           int var20 = 0;
                           int var21 = 0;
                           boolean parsedOk = true;

                           label638:
                           for(int var22 = 0; var22 < 2; ++var22) {
                              String[] var23 = var15[var22].split(",");
                              if (var23.length != var4.com8 * var4.com8) {
                                 var4.wK0 = 0;
                                 var4.com8 = 0;
                                 break;
                              }

                              var4.te0[var22] = new wx_1[var23.length];

                              for(int var24 = 0; var24 < var23.length; ++var24) {
                                 int var25 = Integer.parseInt(var23[var24]);
                                 var4.te0[var22][var24] = var4.final$.Ri.lPT2(var25);
                                 wx_1 var26 = var4.te0[var22][var24];
                                 if (var26 == null) {
                                    parsedOk = false;
                                    break label638;
                                 }

                                 if (var26.LT().bz > var20) {
                                    var20 = var4.te0[var22][var24].LT().bz;
                                 }

                                 if (var4.te0[var22][var24].LT().xZ > var21) {
                                    var21 = var4.te0[var22][var24].LT().xZ;
                                 }
                              }
                           }

                           if (parsedOk && var4.wK0 >= 1 && var4.com8 >= 1) {
                              var9.Ka0((float)(var4.wK0 * var20), (float)(var4.com8 * var21), false);
                              var5.Qe.Po(var9.iJ);
                              na_0 var48 = new na_0(ix0_0.Vw, var4.wK0 * 16, var4.com8 * 16, false);
                              var5.Bp = var48;
                              Texture var50 = (Texture)((lq_2)var48.f1.KI());
                              var5.gn = var50;
                              var50.setFilter(eb0_1.Y30, eb0_1.Y30);
                              var5.gn.setWrap(a00_0.xm0, a00_0.xm0);
                              var5.Ud = false;
                              drawBorder = true;
                           }
                        }
                     } else {
                        var9.Ka0((float)(var4.wK0 * 16), (float)(var4.com8 * 16), false);
                        var5.Qe.Po(var9.iJ);
                        na_0 var46 = new na_0(ix0_0.Vw, var4.wK0 * 16, var4.com8 * 16, false);
                        var5.Bp = var46;
                        Texture var47 = (Texture)((lq_2)var46.f1.KI());
                        var5.gn = var47;
                        var47.setFilter(eb0_1.Y30, eb0_1.Y30);
                        var5.gn.setWrap(a00_0.xm0, a00_0.xm0);
                        int var49 = 0;

                        for(short var51 = 0; var51 < var4.com8; var51 = (short)(var51 + 1)) {
                           for(short var52 = 0; var52 < var4.wK0; var52 = (short)(var52 + 1)) {
                              for(short var53 = 0; var53 < 2; var53 = (short)(var53 + 1)) {
                                 int[] var54 = var4.pe0[var52][var51].Z8.NC;
                                 byte var55;
                                 if (var54 != null && var54[var53] > 0) {
                                    var55 = 1;
                                 } else {
                                    var55 = 0;
                                 }

                                 var49 |= var55;
                              }
                           }
                        }

                        var5.Ud = var49 != 0;
                        drawBorder = true;
                     }
                  } else {
                     drawBorder = true;
                  }
               }


            if (drawBorder) {
               var5.Bp.synchronized$();
               lg_0.OH0.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
               lg_0.OH0.glClear(16384);
               var5.Qe.W30();

               for(short by = 0; by < var4.com8; by = (short)(by + 1)) {
                  for(short bx = 0; bx < var4.wK0; bx = (short)(bx + 1)) {
                     for(short bl = 0; bl < 2; bl = (short)(bl + 1)) {
                        LPT6_ tile;
                        if (var4.te0 != null) {
                           tile = var4.te0[bl][by * var4.com8 + bx].LT();
                        } else {
                           tile = var4.pe0[bx][by].Z8.gA0(bl);
                        }

                        if (tile != null) {
                           var5.Qe.Lz(tile, (float)(by * 16), (float)(bx * 16));
                        }
                     }
                  }
               }

               var5.Qe.end();
               var5.Bp.end();
            }
            }

            this.E20.W30();
            BR var27 = tw0_0.rl;
            boolean var28 = var27.nI;
            if (var28) {
               var27.nI = false;
               var28 = true;
            }

            this.fX = !var28;
            if (!this.fX) {
               var27.kg0();
               nf_0.zo0().w30(500, false);
            }

            this.vk0.v40.np(var3.il0.t60).Fg0(16.0F);
            C8 var29 = this.vk0.v40;
            var29.x += (float)(var3.L8.ji() / 2);
            var29 = this.vk0.v40;
            var29.y += (float)(var3.L8.CoM5() / 2);
            _else var30 = var3.ba0.V20();
            var29 = this.vk0.v40;
            var29.x += (float)var30.j3();
            var29 = this.vk0.v40;
            var29.y += (float)var30.qF();
            var29 = this.vk0.v40;
            var29.x = (float)((int)var29.x);
            var29.y = (float)((int)var29.y);
            af0_0 var31 = af0_0.SS;
            var31.bk();
            C8 var32 = this.vk0.v40;
            float var33 = var32.x;
            int var34 = var31.Lu0;
            float var35 = (float)(var34 % 2 == 0 ? -var31.fq0 : var31.fq0);
            var32.x = var33 - var35;
            var33 = var32.y;
            float var36 = (float)(var34 % 2 == 0 ? -var31.mr : var31.mr);
            var32.y = var33 - var36;
            com6__1 var37 = com6__1.WI0;
            var37.Ih();
            var29 = this.vk0.v40;
            var29.x += (float)var37.T50();
            var29 = this.vk0.v40;
            var29.y += (float)var37.fO();
            float var38 = this.NC0;
            var29 = this.vk0.v40;
            var29.x += (float)(this.zv0 & 1) / var38 * 0.5F;
            var29.y += (float)(this.y0 & 1) / var38 * 0.5F;
            this.vk0.R1(true);
            this.E20.Po(this.vk0.iJ);
            C8 var39 = Pk0;
            float var40 = this.NC0;
            var39.np(this.vk0.v40).Vy((float)this.zv0 / var40 / 2.0F + 16.0F, (float)this.y0 / var40 / 2.0F + 16.0F, 0.0F);
            C8 var41 = Ec;
            float var42 = this.NC0;
            var41.np(this.vk0.v40).na((float)this.zv0 / var42 / 2.0F + 16.0F, (float)this.y0 / var42 / 2.0F + 16.0F, 0.0F);
            this.IZ.nF(var39, var41);
            this.qF0(var4.Jo0, !this.fX);
            if (this.nK != var4 && tw0_0.PK0 == null) {
               if (var3.LH0() && !var3.Ze()) {
                  byte var43 = var3.ba0.uS;
                  if (var43 == 0) {
                     tw0_0.RE0.Eh((byte)0, (short)305, true, false);
                  } else if (var43 == 1) {
                     tw0_0.RE0.Eh((byte)1, (short)365, true, false);
                  }
               } else {
                  tw0_0.RE0.Eh(var4.dw, var4.hL0, true, false);
               }

               this.nK = var4;
               tw0_0.lM.BO();
            }

            Vs0 var44 = tw0_0.ys0;
            gh_0 var45 = var4.lm0;
            if (var45 == gh_0.GM) {
               var44.Ru0(0);
               Vs0.aT(true);
            } else if (var45 != gh_0.tA && var45 != gh_0.fs0 && var45 != gh_0.vm0) {
               if (Vs0.c3) {
                  Vs0.aT(false);
               }

               c8_0 var56 = c8_0.JD0;
               int var57 = var56.d60() * 100 + (int)((double)(var56.ki0() % 3600 / 60) * 1.65D);
               if (var57 > 1400 && var57 <= 2000) {
                  var44.Ru0(0);
               } else if (var57 >= 700 && var57 <= 2000) {
                  var44.Ru0(0);
               } else if (var57 > 2000 && var57 < 2255) {
                  var44.Ru0(var57 - 2000);
               } else if (var57 > 445 && var57 < 700) {
                  var44.Ru0(255 - (var57 - 445));
               } else {
                  var44.Ru0(255);
               }
            } else {
               var44.Ru0(0);
            }

            if (dw_2.Kr && var4.wK0 >= 1 && var4.com8 >= 1) {
               hl0_1 var58 = this.E20;
               xo0 var59 = this.yl;
               float var60 = Vs0.lv;
               Color.abgr8888ToColor(var58.oH, var60);
               var58.og = var60;
               ly0_0 var61 = tw0_0.LD0.Sc.Ej0();
               int var62 = var4.wK0;
               int var63 = (int)var61.ec0.x + var62 * 32;
               int var64 = var4.com8;
               int var65 = (int)var61.ec0.y + var64 * 32;
               float var66 = var61.jG0.x;
               float var67 = (float)(var62 * 16);
               var66 = var66 - var66 % var67 - var67;
               float var68 = var61.jG0.y;
               var68 = var68 - var68 % (float)(var64 * 16) - (float)(var64 * 8);
               var58.Ya0(var59.gn, var66, var68, 0, 0, var63, var65);
            }

            yt_1 var69 = tw0_0.e60;
            if (var69 != null) {
               E90 var70 = var69.jB0;
               if (var70 != null) {
                  int var71 = dw_2.eM0();
                  if (var71 < 1) {
                     if (_native.j7) {
                        Iterator var72 = tw0_0.e60.pn0.values().iterator();

                        while(var72.hasNext()) {
                           bi0_1 var73 = (bi0_1)var72.next();
                           if (var73 instanceof E90) {
                              var73.uR().Oq(false, false);
                           }
                        }

                        this.Ui.clear();
                     }

                     _native.j7 = false;
                  } else {
                     _native.j7 = true;
                     _else var74 = var70.ba0.V20();
                     Pk0.np(var70.il0.t60);
                     if (var74 != null) {
                        Pk0.x += (float)(var74.j3() / 16);
                        Pk0.y += (float)(var74.qF() / 16);
                     }

                     Iterator var75 = tw0_0.e60.pn0.values().iterator();

                     while(var75.hasNext()) {
                        bi0_1 var76 = (bi0_1)var75.next();
                        if (var76 instanceof E90) {
                           E90 var77 = (E90)var76;
                           _else var78 = var77.ba0.V20();
                           C8 var79 = Ec;
                           var79.np(var77.il0.t60);
                           if (var78 != null) {
                              var79.x += (float)(var78.j3() / 16);
                              var79.y += (float)(var78.qF() / 16);
                           }

                           var77.DM = Pk0.SH0(var79);
                           this.Ui.Ue0(var77);
                        }
                     }

                     this.Ui.sort(E90.Ie0);
                     ld_0 var80 = new ld_0();
                     HashSet var81 = new HashSet();
                     int var82 = this.Ui.KB;

                     int var84;
                     E90 var85;
                     for(int var83 = 0; var83 < var82; ++var83) {
                        var85 = (E90)this.Ui.get(var83);
                        if (!var85.il0.np) {
                           zv_2 var86 = var85.ba0;
                           var84 = var86.Lq0 | var86.B5 << 16;
                           if (!var80.l90(var84)) {
                              var80.Vn(var84);
                              var81.add(var85.pu);
                           }
                        }
                     }

                     int var100 = 0;

                     for(int var87 = 0; var87 < var82; ++var87) {
                        var85 = (E90)this.Ui.get(var82 - var87 - 1);
                        boolean var88 = false;
                        boolean var89 = true;
                        if (!var85.il0.np && !var81.contains(var85.pu)) {
                           var88 = true;
                           var89 = false;
                        } else {
                           ++var100;
                           if (var100 > var71) {
                              var88 = true;
                           }
                        }

                        var85.L8.Oq(var88, var89);
                     }

                     this.Ui.clear();
                  }
               }
            }

            for(int var90 = 0; var90 < 3; ++var90) {
               Vj[] var91 = var4.gE;
               int var92 = var91.length;

               int var93;
               Vj var94;
               yl_0 var96;
               for(var93 = 0; var93 < var92; ++var93) {
                  var94 = var91[var93];
                  var96 = (yl_0)((_else)tw0_0.e60.E6.get(J4.iA0(var94.j6, var94.U0, var94.RT)));
                  if (var96 != null && o5_0.LpT9[var94.Oo.LP] == 1) {
                     var96.jL(this.E20, this.vk0, this.IZ, var90);
                  }
               }

               var4.jL(this.E20, this.vk0, this.IZ, var90);
               var91 = var4.gE;
               var92 = var91.length;

               for(var93 = 0; var93 < var92; ++var93) {
                  var94 = var91[var93];
                  var96 = (yl_0)((_else)tw0_0.e60.E6.get(J4.iA0(var94.j6, var94.U0, var94.RT)));
                  if (var96 != null) {
                     int var97 = o5_0.LpT9[var94.Oo.LP];
                     if (var97 == 2 || var97 == 3 || var97 == 4) {
                        var96.jL(this.E20, this.vk0, this.IZ, var90);
                     }
                  }
               }
            }

            if (tw0_0.e60 != null) {
               z20_0 var98 = this.X7;
               if (var98 != null) {
                  if (!var98.OY) {
                     var98.lI();
                     var98.OY = true;
                  }

                  var98.ro0(this.E20);
               }

               var98 = this.Uk0;
               if (var98 != null) {
                  if (!var98.OY) {
                     var98.lI();
                     var98.OY = true;
                  }

                  var98.ro0(this.E20);
               }

               _else var99 = tw0_0.e60.N60();
               if (var99 != null && tw0_0.e60.jB0 != null) {
                  this.coM7(var99);
                  if ((var99.pG != tW.cH || var99.Z10) && tw0_0.rl.c50 != 7) {
                     int var101 = (int)((float)Math.round(this.qH * 10.0F) / 10.0F * 24.0F + 49.0F);
                     float var102 = this.IZ.ec0.x;
                     float var103 = this.IZ.ec0.y;
                     int var104 = (int)this.IZ.jG0.x;
                     int var105 = (int)this.IZ.jG0.y;
                     int var106 = var101 / 2;
                     int var107 = var104 + (int)(var102 / 2.0F) - var106;
                     var106 = var105 + (int)(var103 / 2.0F) - var106;
                     int var108 = var106 + -10;
                     Texture var109 = fn_0.qz0().jF[0];
                     this.E20.vv0(var109, (float)var107, (float)var108, (float)var101, (float)var101);
                     Texture var110 = fn_0.qz0().YZ;
                     float var111 = (float)var104;
                     float var112 = (float)var105;
                     float var113 = (float)(var106 + -8 + -var105);
                     this.E20.vv0(var110, var111, var112, var102, var113);
                     var110 = fn_0.qz0().YZ;
                     var113 = (float)(var108 + var101 - 2);
                     var106 = (int)var103;
                     float var114 = (float)(var106 + 4);
                     this.E20.vv0(var110, var111, var113, var102, var114);
                     var110 = fn_0.qz0().YZ;
                     float var115 = (float)(var106 + 2 + -var104);
                     var113 = (float)var107;
                     this.E20.vv0(var110, var111, var112, var115, var113);
                     var110 = fn_0.qz0().YZ;
                     float var116 = (float)(var107 + var101 - 2);
                     float var117 = (float)((int)var102 / 2 + 4);
                     this.E20.vv0(var110, var116, var112, var117, var113);
                  }
               }
            }

            if (tw0_0.e60 != null && Ge0.Vv0 > 0) {
               int var118 = tw0_0.e60.jB0.ba0.Lq0 * 16 + com6__1.WI0.T50();
               int var119 = tw0_0.e60.jB0.ba0.B5 * 16 + com6__1.WI0.fO();
               byte var120 = Ge0.Vv0;
               if (var120 == 1) {
                  yj_2 var121 = QO.NX.xW(Ge0.Fu0);
                  if (var121.R10 != 4 && !var121.Sd) {
                     _else var122 = tw0_0.e60.N60();
                     if (var122 instanceof yl_0) {
                        yl_0 var123 = (yl_0)var122;

                        int overlayLayers;
                        switch(var121.ff) {
                        case 0:
                        case 1:
                           overlayLayers = 1;
                           break;
                        case 3:
                        case 4:
                        case 5:
                        case 9:
                           overlayLayers = 2;
                           break;
                        case 7:
                           overlayLayers = 4;
                           break;
                        case 8:
                           overlayLayers = 3;
                           break;
                        case 2:
                        case 6:
                        default:
                           overlayLayers = 0;
                        }

                        for(int var124 = 0; var124 < overlayLayers; ++var124) {
                           for(int var125 = 0; var125 < var121.dM(); ++var125) {
                              int var126 = var121.fY[var121.dM() * var124 + var125] + 512;
                              db0_2 var127 = var123.LL0.w3[var126];
                              if (var127 == null) {
                                 this.E20.end();
                                 return;
                              }

                              if (System.nanoTime() / 300000000L % 2L == 1L) {
                                 LPT6_ var128 = var127.gA0(1);
                                 this.E20.Lz(var128, (float)(var125 * 16 + var118), (float)(var124 * 16 + var119));
                              }
                           }
                        }
                     }
                  } else {
                     short var129 = var121.I20();
                     Wr var130 = QI.Py.kN(var121.LpT5, var129, false).li0(0);
                     var130.H8();
                     int var131 = var130.fr0;
                     int var132 = var130.Tq;
                     if (var132 >= 200 && var129 < 300) {
                        if (var129 == 211) {
                           var131 = 24;
                           var132 = 36;
                        } else {
                           var131 = 24;
                           var132 = 24;
                        }
                     }

                     if (var131 > 16) {
                        var118 -= (var131 - 16) / 2;
                     }

                     if (var132 > 16) {
                        var119 -= var132 - 16;
                     }

                     if (System.nanoTime() / 300000000L % 2L == 1L) {
                        this.E20.vv0(var130.H8(), (float)var118, (float)var119, (float)var131, (float)var132);
                     }
                  }
               } else if (var120 == 2 && System.nanoTime() / 300000000L % 2L == 1L) {
                  this.E20.CH0(ob0_0.Ui0().G60.H8(), (float)var118, (float)var119);
               }
            }

            this.E20.end();
         } else {
            this.fX = false;
         }
      }
   }
}
