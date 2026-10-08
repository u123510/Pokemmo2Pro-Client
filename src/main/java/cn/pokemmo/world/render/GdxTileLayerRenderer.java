package cn.pokemmo.world.render;

import f.*;


import com.badlogic.gdx.graphics.Color;
import java.util.ArrayDeque;
import java.util.Iterator;

public class GdxTileLayerRenderer extends _else {
   public static final ArrayDeque CoM8 = new ArrayDeque();
   public final II LL0;
   public int wK0;
   public int com8;
   public go_0[][] pe0;
   public go_0[][] xh;
   public Vj[] gE;
   public short hL0;
   public String dr;
   public boolean vB;
   public String Fw;
   public SU[][] G60;
   public final byte C4;
   public boolean kY;
   public int jb;
   public int KX;
   public jt0_0 final$;
   public wx_1[][] te0;
   public qh_0 tk0;
   public PC0 p40;
   public final int[] L;
   public final es_1 yd0;
   public final I10 qa;
   public boolean Jh0;

   public final void yD0(bi0_1 var1, boolean var2) {
      if (var1 != null) {
         if (yt_1.l00.uI0()) {
            boolean var3 = var1.pu.equals(yt_1.l00);
            yt_1 var4;
            if (((var4 = tw0_0.e60) == null || !var4.dj0.equals(var1.pu)) && !var3) {
               return;
            }
         }

         zv_2 var8;
         zv_2 var10001 = var8 = var1.ba0;
         short var9 = var10001.Lq0;
         short var5 = var10001.B5;
         if ((!var2 || var8.JT >= 3) && (var2 || var8.JT <= 2)) {
            if (var9 < super.zC0 && var5 < super.BJ && var9 >= 0 && var5 >= 0) {
               SU[] row = this.G60[var9];
               if (row[var5] == null) {
                  row[var5] = new SU();
               }

               this.G60[var9][var5].Ir(var1);
            }
         }
      }
   }

   public final void OC0(short[] var1) {
      go_0[][] var2 = new go_0[super.zC0][super.BJ];
      int var3 = 0;

      int var5;
      for(short var4 = 0; var4 < (var5 = super.BJ); ++var4) {
         for(short var7 = 0; var7 < super.zC0; ++var7) {
            go_0[] var10004 = var2[var7];
            go_0 var6;
            var6 = new go_0(var1[var3++], this, var7, var4);
            var10004[var4] = var6;
            II var8 = this.LL0;
            go_0 var10001 = var2[var7][var4];
            short var9 = var2[var7][var4].Qu;
            var10001.Z8 = var8.w3[var9];
         }
      }

      this.xh = var2;
      this.G60 = new SU[super.zC0][var5];
   }

   public final String OE() {
      return this.vB ? this.Fw + "'s " + this.dr : this.dr;
   }

   public final Vj uI(dn_1 var1, int var2, int var3) {
      Vj[] var9;
      int var4 = (var9 = this.gE).length;
      int var5 = 0;

      Vj var6;
      while(true) {
         if (var5 >= var4) {
            return null;
         }

         _else var7;
         if ((var6 = var9[var5]).Oo == var1 && (var7 = var6.I80()) != null) {
            if (var1 != dn_1.vI && var1 != dn_1.o2) {
               int var10;
               if (var2 >= (var10 = var6.FA0) && var2 <= var10 + var7.zC0) {
                  break;
               }
            } else {
               int var8;
               if (var3 >= (var8 = var6.FA0) && var3 <= var8 + var7.BJ) {
                  break;
               }
            }
         }

         ++var5;
      }

      return var6;
   }

   public final LT Fn(int var1, int var2, int var3) {
      if (var1 >= super.zC0) {
         Vj var13;
         if ((var13 = this.uI(dn_1.o2, var1, var2)) == null) {
            return null;
         } else {
            _else var14;
            if ((var14 = var13.I80()) == null) {
               return null;
            } else {
               int var9 = var1 - super.zC0;
               return var14.Fn(var9, var2 - var13.FA0, 0);
            }
         }
      } else if (var1 < 0) {
         Vj var7;
         if ((var7 = this.uI(dn_1.vI, var1, var2)) == null) {
            return null;
         } else {
            _else var12;
            if ((var12 = var7.I80()) == null) {
               return null;
            } else {
               Vj var15 = var7;
               int var8 = var12.zC0 + var1;
               return var12.Fn(var8, var2 - var15.FA0, 0);
            }
         }
      } else if (var2 >= super.BJ) {
         Vj var11;
         if ((var11 = this.uI(dn_1.sn, var1, var2)) == null) {
            return null;
         } else {
            _else var4;
            if ((var4 = var11.I80()) == null) {
               return null;
            } else {
               GdxTileLayerRenderer var10002 = this;
               int var6 = var1 - var11.FA0;
               return var4.Fn(var6, var2 - var10002.BJ, 0);
            }
         }
      } else if (var2 < 0) {
         Vj var5;
         if ((var5 = this.uI(dn_1.AR, var1, var2)) == null) {
            return null;
         } else {
            _else var10;
            return (var10 = var5.I80()) == null ? null : var10.Fn(var1 - var5.FA0, var10.BJ + var2, 0);
         }
      } else {
         return this.xh[var1][var2];
      }
   }

   public final short hh0() {
      return this.hL0;
   }

   public final boolean Wp() {
      if (super.jE != null) {
         return true;
      } else {
         byte var1;
         if ((var1 = super.dw) == 0 && !tw0_0.rl.yh0.Ny(var1, (short)2095)) {
            return false;
         } else if ((var1 = super.dw) == 1 && !tw0_0.rl.yh0.Ny(var1, (short)2240)) {
            return false;
         } else {
            byte var2;
            return (var2 = super.dw) != 2 || tw0_0.rl.yh0.Ny(var2, (short)2403);
         }
      }
   }

   public final int j3() {
      return this.jb;
   }

   public final int qF() {
      return this.KX;
   }

   public final void dispose() {
      jt0_0 var1;
      if ((var1 = this.final$) != null) {
         var1.dispose();
      }

      qh_0 var2;
      if ((var2 = this.tk0) != null) {
         ((Kd0)var2).dispose();
      }

   }

   public final void S50(int var1, hl0_1 var2, ly0_0 var3) {
      int var4 = this.jb;
      int var5 = this.KX;
      int var6 = super.BJ;
      int var7 = super.zC0;
      go_0[][] var8 = this.xh;
      if (var1 == 0) {
         for(int var21 = 0; var21 < var6; ++var21) {
            int var9;
            float var10;
            if (!((var10 = (float)(var9 = var21 * 16 + var5)) < var3.jG0.y) && !(var10 > var3.Xa0.y)) {
               for(int var11 = 0; var11 < var7; ++var11) {
                  int var12;
                  float var13;
                  if (!((var13 = (float)(var12 = var11 * 16 + var4)) < var3.jG0.x) && !(var13 > var3.Xa0.x)) {
                     go_0 var14;
                     db0_2 var15;
                     if ((var15 = (var14 = var8[var11][var21]).Z8).gA0(0) != null) {
                        var2.Lz(var15.gA0(0), var13, var10);
                     }

                     byte var16 = 0;
                     if (var15.Nf != null && var15.Nf[var16] != null && !((LT)var14).lW() && Vs0.cOM7 > 0) {
                        for(int var37 = 0; var37 < 4; ++var37) {
                           B5 var17;
                           if ((var17 = var15.cS(0, var37)) != null) {
                              var17.NL0((float)(var37 % 2 * 8 + var12));
                              var17.ZJ((float)(var37 / 2 * 8 + var9));
                              es_1 var18 = this.yd0;
                              Zn0 var19;
                              Zn0 var10001 = var19 = (Zn0)this.qa.obtain();
                              var19.di = var17;
                              var19.VT = var17.a70();
                              var10001.mo = var17.wJ0();
                              boolean var20;
                              if (var17.yQ > var17.Yo) {
                                 var20 = true;
                              } else {
                                 var20 = false;
                              }

                              var19.bZ = var20;
                              boolean var42;
                              if (var17.Y60 > var17.Ll0) {
                                 var42 = true;
                              } else {
                                 var42 = false;
                              }

                              var19.j0 = var42;
                              var18.Ue0(var19);
                           }
                        }
                     }

                     if ((var15.Gn0 & this.C4) != 0 && var15.gA0(1) != null) {
                        var2.Lz(var15.gA0(1), var13, var10);
                     }

                     if (((LT)var14).lW()) {
                        ((LT)var14).lW();
                        I2 var26 = var14.Sg.ZD();

                        while(var26.hasNext()) {
                           ((gj_0)var26.next()).x8(var2, 0, var12, var9);
                        }
                     }

                     byte var27 = 1;
                     if (var15.Nf != null && var15.Nf[var27] != null && !((LT)var14).lW() && Vs0.cOM7 > 0) {
                        for(int var28 = 0; var28 < 4; ++var28) {
                           B5 var30;
                           if ((var30 = var15.cS(1, var28)) != null) {
                              var30.NL0((float)(var28 % 2 * 8 + var12));
                              var30.ZJ((float)(var28 / 2 * 8 + var9));
                              es_1 var39 = this.yd0;
                              Zn0 var43;
                              Zn0 var51 = var43 = (Zn0)this.qa.obtain();
                              var43.di = var30;
                              var43.VT = var30.a70();
                              var51.mo = var30.wJ0();
                              boolean var47;
                              if (var30.yQ > var30.Yo) {
                                 var47 = true;
                              } else {
                                 var47 = false;
                              }

                              var43.bZ = var47;
                              boolean var31;
                              if (var30.Y60 > var30.Ll0) {
                                 var31 = true;
                              } else {
                                 var31 = false;
                              }

                              var43.j0 = var31;
                              var39.Ue0(var43);
                           }
                        }
                     }
                  }
               }
            }
         }
      } else if (var1 == 1 || var1 == 2) {
         if (var1 == 1) {
            this.Jh0 = false;
         } else if (var1 == 2 && !this.Jh0) {
            return;
         }

         for(int var22 = 0; var22 < var6; ++var22) {
            int var23;
            float var24;
            if (!((var24 = (float)(var23 = var22 * 16 + var5)) < var3.jG0.y) && !(var24 > var3.Xa0.y)) {
               for(int var25 = 0; var25 < var7; ++var25) {
                  int var29;
                  float var32;
                  if (!((var32 = (float)(var29 = var25 * 16 + var4)) < var3.jG0.x) && !(var32 > var3.Xa0.x)) {
                     go_0 var36 = var8[var25][var22];
                     if (var1 == 1) {
                        if (var36.Es() > 3) {
                           this.Jh0 = true;
                           continue;
                        }
                     } else if (var1 == 2 && var36.Es() < 4) {
                        continue;
                     }

                     db0_2 var40;
                     if (((var40 = var36.Z8).Gn0 & this.C4) == 0) {
                        if (var40.gA0(1) != null) {
                           var2.Lz(var40.gA0(1), var32, var24);
                        }

                        byte var33 = 1;
                        if (var40.Nf != null && var40.Nf[var33] != null && Vs0.cOM7 > 0) {
                           for(int var34 = 0; var34 < 4; ++var34) {
                              B5 var44;
                              if ((var44 = var40.cS(1, var34)) != null) {
                                 var44.NL0((float)(var34 % 2 * 8 + var29));
                                 var44.ZJ((float)(var34 / 2 * 8 + var23));
                                 es_1 var48 = this.yd0;
                                 Zn0 var49;
                                 Zn0 var52 = var49 = (Zn0)this.qa.obtain();
                                 var49.di = var44;
                                 var49.VT = var44.a70();
                                 var52.mo = var44.wJ0();
                                 boolean var50;
                                 if (var44.yQ > var44.Yo) {
                                    var50 = true;
                                 } else {
                                    var50 = false;
                                 }

                                 var49.bZ = var50;
                                 boolean var46;
                                 if (var44.Y60 > var44.Ll0) {
                                    var46 = true;
                                 } else {
                                    var46 = false;
                                 }

                                 var49.j0 = var46;
                                 var48.Ue0(var49);
                              }
                           }
                        }
                     }

                     if (((LT)var36).lW()) {
                        ((LT)var36).lW();
                        I2 var35 = var36.Sg.ZD();

                        while(var35.hasNext()) {
                           ((gj_0)var35.next()).x8(var2, 10, var29, var23);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public final void Rr(hl0_1 var1, PC0 var2, boolean var3) {
      yt_1 var4;
      if ((var4 = tw0_0.e60) != null) {
         Iterator var10 = var4.pn0.values().iterator();

         while(var10.hasNext()) {
            Object var5;
            if (!((bi0_1)(var5 = (bi0_1)var10.next())).CI0()) {
               zv_2 var6;
               if ((var6 = ((bi0_1)var5).ba0).o0 == super.Bm0 && var6.ID0 == super.case$) {
                  zv_2 var7;
                  KF var20;
                  if (((bi0_1)var5).rd != null && ((bi0_1)var5).Jf0() && (var7 = (var20 = ((bi0_1)var5).rd).ba0).o0 == super.Bm0 && var7.ID0 == super.case$) {
                     this.yD0(var20, var3);
                  }
               } else if (((bi0_1)var5).rd == null || !((bi0_1)var5).Jf0() || (var6 = ((bi0_1)(var5 = ((bi0_1)var5).rd)).ba0).o0 != super.Bm0 || var6.ID0 != super.case$) {
                  continue;
               }

               this.yD0((bi0_1)var5, var3);
            }
         }

         var10 = tw0_0.e60.pn0.values().iterator();

         while(var10.hasNext()) {
            bi0_1 var14;
            zv_2 var21;
            if ((var14 = (bi0_1)var10.next()).CI0() && (var21 = var14.ba0).o0 == super.Bm0 && var21.ID0 == super.case$) {
               this.yD0(var14, var3);
            }
         }

         E90 var12;
         if ((var12 = tw0_0.e60.jB0) != null) {
            KF var15;
            zv_2 var22;
            if (((bi0_1)var12).Jf0() && (var22 = (var15 = var12.rd).ba0).o0 == super.Bm0 && var22.ID0 == super.case$) {
               this.yD0(var15, var3);
            }

            zv_2 var16;
            if ((var16 = var12.ba0).o0 == super.Bm0 && var16.ID0 == super.case$) {
               this.yD0(var12, var3);
            }
         }

         for(int var8 = 0; var8 < super.BJ; ++var8) {
            for(int var13 = 0; var13 < super.zC0; ++var13) {
               SU var17;
               SU var10000 = var17 = this.G60[var13][var8];
               go_0 var23 = this.xh[var13][var8];
               if (var10000 != null) {
                  while(var17.H30.isEmpty() ^ true) {
                     ((bi0_1)var17.H30.poll()).uR().tD0(var1, var2, this);
                  }
               }

               if (((LT)var23).lW()) {
                  ((LT)var23).lW();
                  I2 var18 = var23.Sg.ZD();

                  while(var18.hasNext()) {
                     gj_0 var28 = (gj_0)var18.next();
                     int var24 = this.jb;
                     var24 = var13 * 16 + var24;
                     int var26 = this.KX;
                     var26 = var8 * 16 + var26;
                     var28.x8(var1, 1, var24, var26);
                  }
               }
            }
         }

         while(!CoM8.isEmpty()) {
            ((bi0_1)CoM8.poll()).uR().tD0(var1, var2, this);
         }

      }
   }

   public final void jL(hl0_1 var1, PC0 var2, ly0_0 var3, int var4) {
      int var5 = this.jb;
      int var6 = this.KX;
      int var10000 = super.zC0 * 16 + var5;
      int var7 = super.BJ * 16 + var6;
      C8 var8;
      C8 var32;
      if (!((float)var10000 < (var8 = var3.jG0).x) && !((float)var5 > (var32 = var3.Xa0).x)) {
         if (!((float)var7 < var8.y) && !((float)var6 > var32.y)) {
            if (this.final$ == null || var4 != 0 && var4 != 2) {
               float var60 = Vs0.lv;
               Color.abgr8888ToColor(var1.oH, var60);
               var1.og = var60;
               if (var4 == 0) {
                  this.S50(0, var1, var3);
               } else if (var4 == 1) {
                  this.Rr(var1, var2, false);
               } else if (var4 == 2) {
                  this.S50(1, var1, var3);
                  this.Rr(var1, var2, true);
                  this.S50(2, var1, var3);
               }

               I2 var10 = this.yd0.ZD();

               while(var10.hasNext()) {
                  Zn0 var29;
                  Zn0 var50 = var29 = (Zn0)var10.next();
                  B5 var31 = var50.di;
                  boolean var38 = var50.bZ;
                  boolean verticalFlip = var50.j0;
                  boolean horizontalFlip = false;
                  boolean var46 = false;
                  if (var31.yQ > var31.Yo != var38) {
                     horizontalFlip = true;
                  }

                  if (var31.Y60 > var31.Ll0 != verticalFlip) {
                     var46 = true;
                  }

                  var50 = var29;
                  var31.Wu0(horizontalFlip, var46);
                  B5 var57 = var29.di;
                  Zn0 var61 = var29;
                  float var30 = var29.VT;
                  var57.ak0(var30, var61.mo);
                  var50.di.jN(var1);
               }

               this.qa.freeAll(this.yd0);
               this.yd0.clear();
            } else {
               ((ui_1)var1).end();
               if (this.tk0 == null) {
                  qh_0 var11;
                  var11 = new qh_0(this.final$);
                  this.tk0 = var11;
                  PC0 var12;
                  float var33 = var2.Ui;
                  var12 = new PC0(var33, var2.yG);
                  this.p40 = var12;
               }

               PC0 var13;
               PC0 var10001 = var13 = this.p40;
               var13.Ui = var2.Ui;
               var13.yG = var2.yG;
               float var14 = var2.Ui;
               var10001.Ka0(var14, var2.yG, false);
               this.p40.v40.np(var2.v40);
               var10001 = this.p40;
               C8 var15;
               C8 var10002 = var15 = var10001.v40;
               float var10003 = var10002.y * -1.0F + (float)(super.BJ * 16);
               var15.x -= (float)this.jb;
               var10002.y = var10003 + (float)this.KX;
               var10001.R1(true);
               qh_0 var16;
               qh_0 var53 = var16 = this.tk0;
               PC0 var34;
               PC0 var58 = var34 = this.p40;
               C3 var17 = var16.Ft;
               ((ui_1)var17).Po(var58.iJ);
               float var18;
               float var39 = var58.Ui * (var18 = var34.LH);
               var18 = var58.yG * var18;
               float var43 = Math.abs(var58.St0.y) * var39;
               var43 = Math.abs(var58.St0.x) * var18 + var43;
               var18 = Math.abs(var58.St0.y) * var18;
               var18 = Math.abs(var58.St0.x) * var39 + var18;
               ql_0 var40;
               ql_0 var54 = var40 = var53.nJ;
               float var59 = var18;
               C8 var35;
               float var10007 = (var35 = var34.v40).x - var43 / 2.0F;
               var18 = var35.y - var18 / 2.0F;
               var40.j80 = var10007;
               var40.Wm0 = var18;
               var40.IA = var43;
               var54.Eu0 = var59;
               C3 var23 = this.tk0.Ft;
               lt_1 var36;
               if ((var36 = var1.bK0) == null) {
                  var36 = var1.Kt0;
               }

               ui_1 var24;
               if (var36 != (var24 = (ui_1)var23).bK0) {
                  if (var24.xq) {
                     var24.TV();
                  }

                  var24.bK0 = var36;
                  if (var24.xq) {
                     if (var36 != null) {
                        lg_0.Sf0.glUseProgram(var36.lH);
                     } else {
                        lt_1 var55 = var24.Kt0;
                        sY var48 = lg_0.Sf0;
                        var55.getClass();
                        var48.glUseProgram(var55.lH);
                     }

                     var24.b40();
                  }
               }

               float var25 = Vs0.lv;
               ui_1 var56 = (ui_1)this.tk0.Ft;
               Color.abgr8888ToColor(var56.oH, var25);
               var56.og = var25;
               int[] var26 = this.L;
               byte var37 = 0;
               byte var41;
               if (var4 == 0) {
                  var41 = 0;
               } else {
                  var41 = 1;
               }

               var26[var37] = var41;
               this.tk0.dn(var26);
               if (var4 == 1) {
                  float var27 = Color.WHITE_FLOAT_BITS;
                  ui_1 var49 = (ui_1)this.tk0.Ft;
                  Color.abgr8888ToColor(var49.oH, var27);
                  var49.og = var27;
                  int[] var28;
                  (var28 = this.L)[0] = 2;
                  this.tk0.dn(var28);
               }

               ((ui_1)var1).W30();
               ((ui_1)var1).Po(var2.iJ);
               this.Rr(var1, var2, true);
            }
         }
      }
   }

   public GdxTileLayerRenderer(byte var1, byte var2, byte var3, byte var4, int var5, int var6, int var7, int var8, byte var9, byte var10) {
      super(var1, var2, var3, var4);
      this.gE = new Vj[0];
      this.vB = false;
      this.Fw = "";
      this.kY = false;
      this.jb = 0;
      this.KX = 0;
      this.final$ = null;
      this.te0 = null;
      this.tk0 = null;
      this.p40 = null;
      this.L = new int[1];
      es_1 var11;
      var11 = new es_1();
      this.yd0 = var11;
      I10 var12;
      var12 = new I10();
      this.qa = var12;
      this.Jh0 = false;
      super.zC0 = var5;
      super.BJ = var6;
      this.wK0 = var9;
      this.com8 = var10;
      this.LL0 = tw0_0.ys0.k40(var7, var8);
      this.C4 = (byte)(var1 == 1 ? 16 : 32);
   }
}
