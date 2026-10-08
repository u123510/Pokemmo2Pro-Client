package cn.pokemmo.net.session;

import f.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * 客户端主游戏网络会话与交互处理器 (Game Client Network Handler)
 * 负责大世界实体同步、聊天频道、队伍与战斗网络交互
 * 原混淆类: f.BR
 */
public class GameClientNetworkHandler extends Ge0 {
   public Qy0 lZ;

   public GameClientNetworkHandler(np_0 var1, int var2, byte[] var3) {
      super(var1, var2, var3);
   }

   public final void Gc0(zp0_0 var1) {
      this.lZ.zK0.Ld.w80(var1);
   }

   public final void wy0(sf0_2 var1) {
      BU var2 = this.lZ.zK0;
      if (this.lZ.zK0 != null && var2.BK != null) {
         if (var2 != null && !var2.eE && var1.Zy > 0 && var1.hB0 == zo_0.YL) {
            var2.Ll(true);
         }

         if (var1.Mp0.uI0() && !dw_2.U70().contains(var1.Ww)) {
            CH0 var3 = var1.Mp0;
            tw0_0.Tl0.wM(var3, var1.lw);
         }

         this.lZ.zK0.BK.mp(var1, false);
      }
   }

   public final void nv(CH0 var1, IL var2, String var3, G50 var4, int var5) {
      Qy0 var6 = this.lZ;
      oi0_0 var7 = new oi0_0(var1, var2, var3, var4, var5);
      var6.aS.add(var7);
      le0_2 var8 = null;
      KU var9;
      if ((var9 = var6.t30) != null) {
         le0_2[] var10 = (le0_2[])var9.pa();

         for (int var11 = 0, var12 = var6.t30.KB; var11 < var12; var11++) {
            if (var10[var11].getClass().isAssignableFrom(oi0_0.class)) {
               var8 = var10[var11];
               break;
            }
         }

         var6.t30.Gj0();
      }

      if (var8 == null) {
         var6.F9(var6.fU(), var7);
         var6.Qw0(var7);
      }
   }

   public final void Kh(String var1) {
      this.lZ.e80(var1, null);
   }

   public final void pC0(String var1) {
      this.lZ.dk(-1, var1);
   }

   @Override
   public final void I3(short var1, CH0 var2, CH0 var3, short var4, byte var5, byte var6, boolean var7) {
      if (!this.nz() && !super.fw && !tw0_0.FL.gi0() && (var7 || super.NF0.Xk0.ty0())) {
         if (var1 == 372) {
            if (!var3.Uz0() && var4 >= 1) {
               super.fk0.uQ(new gu_1(var1, var3, var4, var5, (byte)0));
               return;
            }

            K5[] var75;
            int var8 = (var75 = super.NC[1].KL()).length;

            for (int var9 = 0; var9 < var8; var9++) {
               K5 var10;
               if ((var10 = var75[var9]).nn.Br.equals(var3)) {
                  hl0_0 var31 = var10.nn;
                  if (var10.nn.PA0 == 1) {
                     short var15 = 372;
                     CH0 var32 = var31.Br;
                     byte var16 = -1;
                     super.fk0.uQ(new gu_1(var15, var32, (short)1, var16, (byte)0));
                  } else {
                     BU var17;
                     VL var33;
                     if ((var33 = (var17 = this.lZ.zK0).PF) != null) {
                        var33.xe0();
                        var17.PF = null;
                     }

                     VL var18;
                     var18 = new VL(var10);
                     var17.PF = var18;
                     var17.SL(var18);
                  }

                  return;
               }
            }
         }

         A5 var76 = tw0_0.rl.u40;
         RJ0 var102 = this.Bb(var76);
         short var81 = 1;
         if (!var102.Dj0((byte)-1, var1, var81)) {
            tw0_0.FL.Ad(sm0_0.c0(6003));
         } else {
            var81 = X4.gA0(var1);
            if (var1 == 361 || var1 == 1181 || var1 == 5442 || var1 == 8442 || var1 == 9442) {
               boolean var43 = true;
               Object var59 = null;
               BU var30;
               if ((var30 = this.lZ.zK0) != null) {
                  var30.Iz(var43, (tl0_0)var59);
               }
            } else if (var1 == 260 || var1 == 8444) {
               this.qK(sm0_0.wa0(6042, super.k0.Lpt5 + ""));
            } else if (var81 == 1001) {
               BU var29;
               BU var114 = var29 = this.lZ.zK0;
               boolean var58 = false;
               if (var114.iY != null) {
                  var29.aUX();
               } else {
                  md0_0 var62;
                  var62 = new md0_0(var29, var58, var1);
                  var29.iY = var62;
                  var29.SL(var62);
               }
            } else if (var81 == 1004) {
               pk_0 var56 = tw0_0.rl.xI0;
               if (tw0_0.rl.xI0 == null) {
                  String var113 = sm0_0.c0(2616);
                  zo_0 var42 = zo_0.Dd;
                  this.jC(var113, var42);
               } else if (var56.hn(tw0_0.e60.dj0) != pg0_0.ze0) {
                  String var112 = sm0_0.c0(2614);
                  zo_0 var41 = zo_0.Dd;
                  this.jC(var112, var41);
               } else {
                  BU var28;
                  BU var111 = var28 = this.lZ.zK0;
                  boolean var57 = false;
                  yf0_0 var60;
                  if ((var60 = var111.COm6) != null) {
                     var60.xe0();
                     var28.COm6 = null;
                  } else {
                     yf0_0 var61;
                     var61 = new yf0_0(var28, var57, var1);
                     var28.COm6 = var61;
                     var28.SL(var61);
                  }
               }
            } else {
               K5 var85;
               if (var1 >= 1050 && var1 <= 1065 && var3.Uz0() && (var85 = super.NC[var76.ec0].Mq0(var1)) != null) {
                  this.lZ.zK0.SL(new zg0_2(var85));
               } else if ((var1 == 1028 || var1 == 1029) && (var3.Uz0() || var4 < 1) && (var85 = super.NC[var76.ec0].Mq0(var1)) != null) {
                  BU var26;
                  n4_0 var40;
                  if ((var40 = (var26 = this.lZ.zK0).ae) != null) {
                     var40.Y20.UR(tw0_0.rl.NC[1].zg(var3));
                  } else {
                     n4_0 var27;
                     var27 = new n4_0(var85, var3);
                     var26.ae = var27;
                     var26.SL(var27);
                  }
               } else if (var1 == 1270 && (var3.Uz0() || var4 < 1) && (var85 = super.NC[var76.ec0].Mq0(var1)) != null) {
                  BU var24;
                  kt_1 var39;
                  if ((var39 = (var24 = this.lZ.zK0).Wi) != null) {
                     var39.Bz0.UR(tw0_0.rl.NC[1].zg(var3));
                  } else {
                     kt_1 var25;
                     var25 = new kt_1(var85, var3);
                     var24.Wi = var25;
                     var24.SL(var25);
                  }
               } else if (var1 == 1535 && var3.Uz0() && (var85 = super.NC[var76.ec0].Mq0(var1)) != null) {
                  VU var37;
                  if ((var37 = super.PC0.sF(var3)) != null) {
                     BU var23;
                     BU var108 = var23 = this.lZ.zK0;
                     CE var38 = var37.I8;
                     Z70 var54;
                     if ((var54 = var108.Mn) != null) {
                        var54.xe0();
                        var23.Mn = null;
                     }

                     Z70 var55;
                     Z70 var120 = var55 = new Z70(var85, var38);
                     var23.Mn = var120;
                     var23.SL(var55);
                     var23.Mn.lt0();
                     var23.Mn.E40(tw0_0.LD0.ew0() / 2 - var23.Mn.Mx / 2, tw0_0.LD0.Hv0() / 2 - var23.Mn.OB / 2);
                  }
               } else {
                  gu0 var89 = gu0.l2;
                  K5 var93;
                  if (gu0.l2.lPT6(var1).lx > 0 && (var93 = super.NC[var76.ec0].Mq0(var1)) != null) {
                     VU var35;
                     if ((var35 = super.PC0.sF(var3)) != null) {
                        BU var22;
                        BU var107 = var22 = this.lZ.zK0;
                        CE var36 = var35.I8;
                        IZ var52;
                        if ((var52 = var107.Af0) != null) {
                           var52.xe0();
                           var22.Af0 = null;
                        }

                        IZ var53;
                        IZ var10004 = var53 = new IZ(var93, var36);
                        var22.Af0 = var10004;
                        var22.SL(var53);
                        var22.Af0.lt0();
                        var22.Af0.E40(tw0_0.LD0.ew0() / 2 - var22.Af0.Mx / 2, tw0_0.LD0.Hv0() / 2 - var22.Af0.OB / 2);
                     }
                  } else if (var1 == 1422 && (var93 = super.NC[var76.ec0].Mq0(var1)) != null) {
                     BU var20;
                     if ((var20 = this.lZ.zK0).Bw == null) {
                        qv0_0 var21;
                        var21 = new qv0_0(var93);
                        var20.Bw = var21;
                        var20.SL(var21);
                     }
                  } else if (var81 == 1018 && var5 <= -1 && (var93 = super.NC[var76.ec0].Mq0(var1)) != null) {
                     BU var19;
                     VU var34;
                     if ((var34 = super.PC0.sF(var3)) != null && (var19 = this.lZ.zK0).K3 == null) {
                        ur_1 var51;
                        ur_1 var116 = var51 = new ur_1(var34, var93);
                        var19.K3 = var116;
                        if (var51.Db != null) {
                           var19.SL(var51);
                        } else {
                           var51.xe0();
                           var19.K3 = null;
                        }
                     }
                  } else {
                     mc0_1 var90 = var89.lPT6(var1);
                     if (var81 >= 5548 && var81 <= 5564 && var4 < 1) {
                        VU var63;
                        VU var105 = var63 = super.PC0.sF(var3);
                        i40_0 var65 = i40_0.b8(var81);
                        if (var105 != null && var65 != null) {
                           String[] var74;
                           String[] var115 = var74 = new String[5];
                           var74[0] = Integer.toString(40);
                           var74[1] = sm0_0.c0(var90.Nl);
                           var74[2] = var63.na0();
                           var74[3] = sm0_0.c0(110237);
                           var115[4] = var65.BT();
                           String var64 = sm0_0.Bx(2545, var115);
                           this.lZ.sr0(new lpt3__4(var64, () -> this.sn0(var1, var2, var3, (short)1, (byte)-1), null));
                        }
                     } else if (var1 == 1540) {
                        BU.T50.vC(true);
                     } else {
                        X90 var83 = var90.Iq;
                        if (var90.Iq != null) {
                           var6 = 0;
                           var85 = null;
                           var93 = null;
                           K5[] var79;
                           int var11 = (var79 = super.NC[var76.ec0].KL()).length;

                           for (int var12 = 0; var12 < var11; var12++) {
                              K5 var13;
                              hl0_0 var14;
                              if ((var14 = (var13 = var79[var12]).nn).wQ == var1) {
                                 var6++;
                                 if (var14.Br.equals(var2)) {
                                    var93 = var13;
                                    var85 = var13;
                                 } else {
                                    var93 = var13;
                                 }
                              }
                           }

                           K5 var45;
                           if (var85 != null) {
                              var45 = var85;
                           } else {
                              var45 = var93;
                           }

                            boolean var99 = false;
                            boolean var98 = false;
                            if (var45 != null) {
                               E90 var100 = super.cJ0.jB0;
                               if (super.cJ0.jB0 != null) {
                                  if (var100.J1.Nul(var83.SG) == var83.ax && var100.J1.Ry0(var83.SG) == yb_1.f9(var45.nn.N50)) {
                                     boolean var47 = true;
                                     var99 = var47;
                                  } else {
                                     boolean var46 = false;
                                     var99 = var46;
                                  }

                                 if (var83.wk(32768)) {
                                    boolean var48;
                                    if (var100.J1.Nul(var83.SG) == var83.ax) {
                                       var48 = true;
                                    } else {
                                       var48 = false;
                                    }

                                    if (var100.J1.Nul(var83.SG) == Ss0.Fv(var83.SG, var83.ax)) {
                                       var98 = true;
                                    } else {
                                       var98 = false;
                                    }

                                    var98 = var48 | var98;
                                 }
                              }
                           }

                           if ((var85 != null || var6 <= 1) && var6 >= 1) {
                              if (var85 == null) {
                                 var85 = var93;
                              }

                              if (var85 != null) {
                                  if (!var99) {
                                    byte var49 = var85.cL.Iq.SG.iL;
                                    CH0 var73 = var85.nn.Br;
                                    byte var92 = -1;
                                    boolean var97 = false;
                                    super.fk0.uQ(new C6(var49, var73, var92, var97));
                                 }

                                 label296:
                                 if (!var83.wk(16384)) {
                                    if (var83.SG == q10_0.Qh0) {
                                        if (var99) {
                                          break label296;
                                       }

                                       byte var50 = 2;
                                       if ((tw0_0.rl.k0.HL & var50) == 0) {
                                          break label296;
                                       }
                                    }

                                    if (!var98) {
                                       return;
                                    }
                                 }

                                 super.fk0.uQ(new gu_1(var1, var3, var4, var5, (byte)0));
                              }
                           } else {
                              this.lZ.da0(ry_0.hq, CH0.j1, (byte)0);
                           }
                        } else if (var1 != 262
                           && var1 != 263
                           && var1 != 264
                           && var1 != 5445
                           && var1 != 5446
                           && var1 != 5447
                           && var1 != 8445
                           && var1 != 8446
                           && var1 != 8447
                           && var1 != 9445
                           && var1 != 9446
                           && var1 != 9447) {
                           if (var90.rg && var4 < 1) {
                              BU.T50.throw$(null, var2, null, var5);
                           } else {
                              super.fk0.uQ(new gu_1(var1, var3, var4, var5, (byte)var6));
                           }
                        } else if (tw0_0.PK0 == null) {
                           E90 var44 = tw0_0.e60.jB0;
                           if (tw0_0.e60.jB0 != null) {
                              E90 var66 = super.cJ0.jB0;
                              if (super.cJ0.jB0 != null && var66.iz0((byte)-128)) {
                                 this.qK(sm0_0.c0(6002));
                              } else {
                                 var102 = super.NC[var76.ec0];
                                 byte var67 = 1;
                                 if (!var102.Dj0(tw0_0.e60.Com4, var1, var67)) {
                                    this.lZ.dk(-1, sm0_0.c0(6003));
                                 } else {
                                     yt_1 var68 = tw0_0.e60;
                                     var67 = var44.ba0.uS;
                                     byte var69 = var44.ba0.o0;
                                     byte var84 = var44.ba0.ID0;
                                     _else var70;
                                     if ((var70 = (_else)var68.E6.get(J4.iA0(var67, var69, var84))) != null) {
                                       LT var71;
                                       LT var78;
                                       if ((var78 = var70.gv(var71 = var44.ba0.LPt1(), var44.ba0.Y30, 1)) != null
                                          && var71 != null
                                          && var71.XC0(var44.ba0.JT)
                                          && var78.ut()
                                          && !(Math.abs(var71.S80() - var78.S80()) > 1.0F)) {
                                          super.fk0.uQ(new gu_1(var1, var3, var4, var5, (byte)0));
                                          tw0_0.LD0.KJ0 = new bl_0(var44);
                                       } else if (tw0_0.PK0 != null) {
                                          this.qK(sm0_0.c0(6002));
                                       } else {
                                          this.qK(sm0_0.c0(6002));
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public final void qK(String var1) {
      lg_0.k.lPT5(() -> this.pC0(var1));
      this.ug(new sf0_2(zo_0.Dd, CH0.j1, "", null, (byte)0, var1));
   }

   @Override
   public final void jp0(String var1) {
      lg_0.k.lPT5(() -> this.Kh(var1));
   }

   public final void VQ(CH0 var1, IL var2, String var3, G50 var4, int var5) {
      lg_0.k.lPT5(() -> this.nv(var1, var2, var3, var4, var5));
   }

   @Override
   public final void VI() {
      BU var1 = this.lZ.zK0;
      if (this.lZ.zK0 != null) {
         jf_0 var3;
         if ((var3 = var1.nj0) != null) {
            var3.update();
         }

         Uo var4 = this.lZ.zK0.W10;
         if (this.lZ.zK0.W10 != null) {
            var4.b5();
         }

         HX var2;
         if ((var2 = this.lZ.zK0.Cs0) != null) {
            var2.vO();
         }
      }
   }

   @Override
   public final boolean ug(sf0_2 var1) {
      if (var1.Mp0.uI0()) {
         BB0 var2 = super.a8;
         if (var2.qY.containsKey(var1.Mp0)) {
            return false;
         }
      }

      f.Vv0.GU.qm(var1);
      if (var1.hB0 == zo_0.YL) {
         BU var3 = this.lZ.zK0;
         if (this.lZ.zK0 != null) {
            String var4 = var1.At0;
            nq_1 var5;
            if ((var5 = (nq_1)var3.zi.get(var4)) != null) {
               var5.Ub0(var1);
            }
         }
      }

      lg_0.k.lPT5(() -> this.wy0(var1));
      return true;
   }

   @Override
   public final void yt0() {
      BU var1;
      if ((var1 = this.lZ.zK0) != null) {
         lg_0.k.lPT5(new Q60(var1));
      }
   }

   @Override
   public final void lPt9() {
      short[][][] var1 = Ge0.wn;
      int var2 = Ge0.wn.length;

      for (int var3 = 0; var3 < var2; var3++) {
         short[][] var4 = var1[var3];
         RJ0 var5;
         if ((var5 = super.NC[1]) != null) {
            byte var6 = tw0_0.e60.Com4;
            if (tw0_0.e60.Com4 >= 0 && var6 < var4.length) {
               short var7 = 0;

               short[] var9;
               for (int var8 = 0; var8 < (var9 = var4[var6]).length; var8++) {
                  if (var5.Dj0(var6, var9[var8], (short)1)) {
                     var7 = var4[var6][var8];
                     break;
                  }
               }

               if (var7 != 0) {
                  BU var11 = this.lZ.zK0;
                  IA var12;
                  if (this.lZ.zK0 != null && (var12 = var11.z6) != null) {
                     boolean var14 = false;

                     short[] var10;
                     for (int var21 = 0; var21 < var4.length; var21++) {
                        for (int var26 = 0; var26 < (var10 = var4[var21]).length; var26++) {
                           var14 |= var12.Ji(var10[var26], var7);
                        }
                     }

                     if (!var14) {
                        if (!lpt2__0.kG().contains(var7)) {
                           int var23 = 0;

                           label103:
                           while (true) {
                              qr_0[] var22 = var12.Mx0;
                              if (var23 >= var12.Mx0.length) {
                                 var23 = 0;

                                 while (true) {
                                    var22 = var12.Mx0;
                                    if (var23 >= var12.Mx0.length || var23 >= 6) {
                                       break label103;
                                    }

                                     qr_0 var24;
                                    if ((var24 = var22[var23]).wE0 < 1) {
                                       var24.Z8(var7, CH0.j1, true);
                                       break label103;
                                    }

                                    var23++;
                                 }
                              }

                              if (var22[var23].wE0 == var7) {
                                 break;
                              }

                              var23++;
                           }
                        }

                        for (int var13 = 0; var13 < var4.length; var13++) {
                           short[] var18;
                           for (int var17 = 0; var17 < (var18 = var4[var13]).length; var17++) {
                              var7 = var18[var17];
                              HashSet var10000 = lpt2__0.kG();
                              var10000.add(var7);
                              StringBuffer var20;
                              var20 = new StringBuffer();

                              for (Object var27 : var10000) {
                                 if (var20.length() > 0) {
                                    var20.append(",");
                                 }

                                 var20.append(var27);
                              }

                              lpt2__0.Bu = var20.toString();
                              lpt2__0.s5 = true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public final void Ux(byte var1, Cq var2, N2 var3, rs_1 var4) {
      dh0_1 var5 = dh0_1.V9;
      dh0_1.V9.getClass();
      if (var2 != null && var3 != null) {
         Map var6;
         if ((var6 = (Map)var5.HA.get(var1)) == null) {
            Byte var20 = var1;
            EnumMap var7;
            var7 = new EnumMap(Cq.class);
            Cq[] var8 = Cq.NZ;
            byte var9 = 4;

            for (int var10 = 0; var10 < var9; var10++) {
               Cq var11 = var8[var10];
               EnumMap var12;
               var12 = new EnumMap(N2.class);
               var7.put(var11, var12);
            }

            var5.HA.put(var20, var7);
            var6 = var7;
         }

         rs_1 var19;
         if ((var19 = (rs_1)((Map)var6.get(var2)).get(var3)) != null) {
            w7_0 var21 = var4.vf0;
            var4.vf0.getClass();
            new M(var21);
            V3 var23;
            var23 = new V3(var21);

            while (var23.hasNext()) {
               bf0_0 var22 = (bf0_0)var23.u7();
               var19.vf0.coM4(var22.RX, var22);
            }
         } else {
            ((Map)var6.get(var2)).put(var3, var4);
         }
      }

      BU var13;
      if ((var13 = this.lZ.zK0) != null) {
         kf0_2 var14;
         if ((var14 = var13.yQ) != null) {
            TB0 var15 = var14.ke0;
            if ((var1 == 0 || var1 == var15.oS) && (var2 == null || var2 == var15.RL0.cOm4) && (var3 == null || var3 == var15.RL0.EE0)) {
               if (var15.hV == null) {
                  var15.hV = var4;
               } else {
                  w7_0 var16 = var4.vf0;
                  var4.vf0.getClass();
                  new M(var16);
                  V3 var18;
                  var18 = new V3(var16);

                  while (var18.hasNext()) {
                     bf0_0 var17 = (bf0_0)var18.u7();
                     var15.hV.vf0.coM4(var17.RX, var17);
                  }
               }

               var15.GP.gn(var15.Ho0(false));
            }
         }
      }
   }

   @Override
   public final void GC(G50 var1, zo_0 var2, boolean var3, boolean var4) {
      if (var1 != null) {
         dw_2.S6 = true;
         dw_2.fP = var1.PM;
         dw_2.CY();
         if (!var4) {
            short var5 = 6070;
            this.qK(sm0_0.wa0((var3 ? 2 : 0) + var5, var1.d0));
         }
      }

      if (var2 != null && !var4) {
         short var9 = 6071;
         this.qK(sm0_0.wa0((var3 ? 2 : 0) + var9, sm0_0.c0(var2.Yf)));
      }

      BU var7;
      if ((var7 = this.lZ.zK0) != null) {
         XH var8;
         if ((var8 = var7.BK) != null) {
            var8.uf("chatframe");
            var8.yI();
            var8.Nd0(dw_2.WY);
            var8.lL0();
            if (var2 != null) {
               var8.D20(var2);
            }
         }
      }
   }

   @Override
   public final void CA(VU var1) {
      BU var2 = this.lZ.zK0;
      if (this.lZ.zK0 != null) {
         if (var1 != null && var2.n4.get(var1.pu) != null) {
            lg_0.k.lPT5(new ck_2(var2, var1));
         }

         di0_1 var3;
         if ((var3 = this.lZ.zK0.vs0) != null) {
            var3.update();
         }
      }
   }

   @Override
   public final void WK0(zp0_0 var1) {
      super.LPt1 = null;
      BU var2 = this.lZ.zK0;
      if (this.lZ.zK0 != null && var2.Ld != null) {
         lg_0.k.lPT5(() -> this.Gc0(var1));
      }
   }

   private static int Lp0(int var0) {
      switch (var0) {
         case 1:
            return 3;
         case 2:
            return 4;
         case 4:
            return 5;
         case 5:
            return 6;
         case 6:
            return 2;
         case 7:
            return 1;
         case 8:
            return 7;
         default:
            return 0;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public final void FC0(GH var1) {
      if (var1 instanceof p5_0) {
         p5_0 var33;
         if ((var33 = (p5_0)var1).z7 == 0) {
            String var17 = var33.eA;
            String var34 = var33.Pm0;
            int var2 = var33.tQ;
            kp_1 var3 = new kp_1();
            kp_1 var81 = var3;
            var3.a60 = var17;
            var3.sb0 = var34;
            var81.dG0 = var2;
            FB0.By0.add(var3);
            BU var18;
            if ((var18 = this.lZ.zK0) != null) {
               H50 var19;
               FB0 var35;
               if ((var19 = var18.cz0.kT) == null) {
                  var35 = null;
               } else {
                  var35 = var19.BC0;
               }

               if (var35 != null) {
                  FB0 var20;
                  if (var19 == null) {
                     var20 = null;
                  } else {
                     var20 = var19.BC0;
                  }

                  var20.jk.private$(var20.LL0);
               }
            }
         }
      } else if (var1 instanceof j2_0) {
         j2_0 var36 = (j2_0)var1;
         switch (Lp0(var36.PU.AI0)) {
            case 1:
               this.qK(var36.vD);
               break;
            case 2:
               this.qK("Insufficient privileges to use this command.");
               break;
            case 3:
               P1 var26;
               P1 var76 = var26 = this.lZ.zK0.cz0.nV.Cs;
               CH0 var50 = var36.Zz0;
               String var56 = var36.qw0;
               int var60 = var36.PP;
               String var40 = var36.vD;
               var76.getClass();
                th_0 var63 = new th_0();
                th_0 var77 = var63;
               var63.xF = var50;
               var63.UG = var56;
               var63.Bx = var60;
               var77.ge0 = var40;
               lg_0.k.lPT5(new zr_0(var26, var63));
               break;
            case 4:
               P1 var25;
               P1 var75 = var25 = this.lZ.zK0.cz0.nV.Cs;
               CH0 var39 = var36.Zz0;
               int var49 = -1;
               int var55 = 0;

               for (Iterator var59 = var75.tj.iterator(); var59.hasNext(); var55++) {
                  if (((th_0)var59.next()).xF.equals(var39)) {
                     var49 = var55;
                  }
               }

               if (var49 >= 0) {
                  lg_0.k.lPT5(new jx_1(var25, var49));
               }
               break;
            case 5:
               uk_0 var23;
               if ((var23 = this.lZ.zK0.cz0.Lt0) != null) {
                  byte var24 = var36.iq0;
                  short var48 = var36.YR;
                  short var54 = var36.tC0;
                  byte var58 = var36.ev;
                  int var62 = var36.u80;
                  boolean var65 = var36.zi;
                  boolean var67 = var36.ad0;
                  byte var69 = var36.DG0;
                  byte var9 = var36.pB;
                  byte var10 = var36.hc0;
                  byte[] var11 = var36.fp;
                  byte[] var38 = var36.nc;
                  var23.ND(var24, var36.l8, var48, var54, var58, var62, var65, var67, var69, var9, var10, var11, var38);
               }
               break;
            case 6:
               uk_0 var21;
               if ((var21 = this.lZ.zK0.cz0.Lt0) != null) {
                  short var22 = var36.YR;
                  short var47 = var36.tC0;
                  byte var53 = var36.ev;
                  int var4 = var36.u80;
                  byte var5 = var36.DG0;
                  byte var6 = var36.pB;
                  byte var37 = var36.hc0;
                  byte[] var7 = new byte[0];
                  byte[] var8 = new byte[0];
                  var21.ND((byte)-1, var36.l8, var22, var47, var53, var4, false, false, var5, var6, var37, var7, var8);
               }
               break;
            case 7:
               this.lZ.zK0.cz0.ne0.Xx(var36.FI0);
         }
      } else if (var1 instanceof ao_0) {
         ao_0 var41;
         if ((var41 = (ao_0)var1).Nn0) {
            xn0_0 var51;
            xn0_0 var78 = var51 = this.lZ.zK0.cz0;
             xn0_0 var27 = this.lZ.zK0.cz0;
             e30_0 var42 = var41.EK0;
             byte var61 = var41.wk;
            byte var64 = var41.ki;
            byte var66 = var41.xF;
            byte var68 = var41.wt0;
            String var70 = var41.i10;
            long var71 = var41.I60;
            int var72 = var41.VJ0;
            String var12 = var41.hT;
            String var13 = var41.Ti;
             String var14 = var41.Lq;
             String var15 = var41.coM6;
             om_1[] var16 = var41.Ae;
             Ju0 var57 = new Ju0(var27, var42, var61, var64, var66, var68, var70, var71, var72, var12, var13, var14, var15, var16);
             Ju0 var84 = var57;
            int var28;
            if ((var28 = var78.Dp(var84)) > 0) {
               var51.fC0(var28);
            }

            Ju0 var29 = var51.nV;
            if (var51.nV != null) {
               var51.u3(var29);
            }

            var51.SL(var57);
            var57.lt0();
            var57.E40(tw0_0.LD0.ew0() / 2 - var57.Mx / 2, tw0_0.LD0.Hv0() / 2 - var57.OB / 2);
            var51.nV = var57;
         } else {
            this.qK("No such player.");
         }
      } else if (var1 instanceof nd0_2) {
         nd0_2 var30 = (nd0_2)var1;
         BU var43;
         xn0_0 var44;
         if ((var43 = this.lZ.zK0) != null && (var44 = var43.cz0) != null) {
            ft_2[] var31 = var30.m70;
            my0 var45;
            if ((var45 = var44.Pg) != null) {
               y0_0 var80 = var45.RF0;
               y0_0 var46;
               y0_0 var85 = var46 = var45.RF0;
               var46.Cu0 = var31;
               Collections.sort(Arrays.asList(var31));
               var80.ad0 = new xe_1[var85.Cu0.length];

               for (int var32 = 0; var32 < var46.Cu0.length; var32++) {
                  xe_1[] var86 = var46.ad0;
                  xe_1 var52;
                  var52 = new xe_1("Inspect Player");
                  var86[var32] = var52;
                  var46.ad0[var32].RR(new ES(var46, var32));
               }

               var46.gi.private$(var46.Xw0);
            }
         }
      }
   }

   @Override
   public final void Hf0(short var1) {
      lg_0.k.lPT5(() -> tw0_0.LD0.x(tw0_0.rl.r1(_volatile.BV).Ry0(var1)));
   }
}
