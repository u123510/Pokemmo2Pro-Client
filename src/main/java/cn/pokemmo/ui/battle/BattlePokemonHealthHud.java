package cn.pokemmo.ui.battle;

import f.*;

/**
 * 对战精灵血条与状态栏 HUD (Battle Pokemon Health HUD)
 * 渲染对战场景中双方参战精灵的生命值血条 (HP)、经验进度条 (EXP)、状态异常、名字等级及团队指示器。
 *
 * 原混淆类: f.jd0_1
 */
public class BattlePokemonHealthHud {
    public jd0_1 asBridge() {
        return (jd0_1) (Object) this;
    }

   public final ML0 uD;
   public final a10_0 Ia;
   public PF P70;
   public final boolean AS;
   public final byte Pq0;
   public final byte vc0;
   public final byte kK0;
   public final le0_2 nk;
   public final ea0_0 ZC;
   public jh0_0 Rg0;
   public cn_0 lpt3;
   public final S70 bx0;
   public final cn_0 ya0;
   public int Cw;
   public final S70 qU;
   public S70 Jx0;
   public final S70 oM;
   public String HK;
   public final cn_0 Zh0;
   public final cn_0 Km;
   public final er_0 cz;
   public boolean q80;
   public boolean ja0;
   public boolean xA;
   public boolean ld;
   public int j00;
   public int Kl;
   public int k0;
   public int Ou;
   public final int ZA0;
   public final int s90;

   public BattlePokemonHealthHud(byte side, byte slot, ML0 var3, a10_0 var4) {
      int var1 = side;
      int var2 = slot;
      cn_0 var5;
      var5 = new cn_0();
      this.Km = var5;
      this.q80 = false;
      this.ja0 = false;
      this.xA = false;
      this.ld = false;
      this.j00 = 0;
      this.Kl = 0;
      this.k0 = 0;
      this.Ou = 0;
      this.uD = var3;
      this.Ia = var4;
      short var6;
      if (tw0_0.kz0()) {
         var6 = 320;
      } else {
         var6 = 260;
      }

      this.ZA0 = var6;
      short var7;
      if (tw0_0.kz0()) {
         var7 = 427;
      } else {
         var7 = 357;
      }

      this.s90 = var7;
      boolean var8;
      if (var1 == var4.Ez0()) {
         var8 = true;
      } else {
         var8 = false;
      }

      this.AS = var8;
      this.Pq0 = (byte)var1;
      this.vc0 = (byte)var2;
      this.kK0 = var4.J80((byte)var1);
      PF var9;
      PF var10000 = var9 = var4.Ce((byte)var1, (byte)var2);
      this.P70 = var9;
      if (var10000 != null) {
         this.HK = lb0_2.pr(var4, var4.yD0(var9.Zo0()));
      } else {
         this.HK = "";
      }

      le0_2 var51;
      var51 = new le0_2();
      this.nk = var51;
      if (var8) {
         label205: {
            label204: {
               if (var4.dc() == zg0_0.ef0) {
                  var51.uf("battle-gui-float");
                  this.xA = true;
                  this.q80 = true;
                  this.ja0 = true;
                  var1 = (short)307;
                  if (tw0_0.kz0()) {
                     var2 = (byte)38;
                  } else {
                     var2 = (byte)28;
                  }

                  var51.RY(var1, var2);
                  var1 = (short)307;
                  if (tw0_0.kz0()) {
                     var2 = (byte)38;
                  } else {
                     var2 = (byte)28;
                  }

                  var51.oY(var1, var2);
                  var1 = (short)307;
                  if (tw0_0.kz0()) {
                     var2 = (byte)38;
                     break label204;
                  }
               } else {
                  if (!var4.s80()) {
                     var51.uf("battle-gui-self");
                     var1 = tw0_0.LD0.ew0() / 2 + 326;
                     var2 = var2 * 40 + 310;
                     var51.sy(var1, var2);
                     short var16;
                     if (tw0_0.kz0()) {
                        var16 = 320;
                     } else {
                        var16 = 299;
                     }

                     byte var30;
                     if (tw0_0.kz0()) {
                        var30 = 54;
                     } else {
                        var30 = 40;
                     }

                     var51.RY(var16, var30);
                     if (tw0_0.kz0()) {
                        var16 = 320;
                     } else {
                        var16 = 299;
                     }

                     if (tw0_0.kz0()) {
                        var30 = 54;
                     } else {
                        var30 = 40;
                     }

                     var51.oY(var16, var30);
                     if (tw0_0.kz0()) {
                        var16 = 320;
                     } else {
                        var16 = 299;
                     }

                     if (tw0_0.kz0()) {
                        var30 = 54;
                     } else {
                        var30 = 40;
                     }

                     var51.g2(var16, var30);
                     cn_0 var19;
                     cn_0 var56 = var19 = new cn_0("");

                     this.lpt3 = var19;
                     var56.oY(200, var56.RR());
                     var56.sy(var51.Nl0() + 80, var51.wF() + 29);
                     break label205;
                  }

                  this.q80 = true;
                  var51.uf("battle-gui-self-slim");
                  short var13;
                  if (tw0_0.kz0()) {
                     var13 = 320;
                  } else {
                     var13 = 299;
                  }

                  byte var27;
                  if (tw0_0.kz0()) {
                     var27 = 39;
                  } else {
                     var27 = 28;
                  }

                  var51.RY(var13, var27);
                  if (tw0_0.kz0()) {
                     var13 = 320;
                  } else {
                     var13 = 299;
                  }

                  if (tw0_0.kz0()) {
                     var27 = 39;
                  } else {
                     var27 = 28;
                  }

                  var51.oY(var13, var27);
                  if (tw0_0.kz0()) {
                     var1 = (short)320;
                  } else {
                     var1 = (short)299;
                  }

                  if (tw0_0.kz0()) {
                     var2 = (byte)39;
                     break label204;
                  }
               }

               var2 = (byte)28;
            }

            var51.g2(var1, var2);
         }

         if (!var4.kd0() && !var4.s80() && !var4.ii() && !this.q80) {
            jh0_0 var20;
            jh0_0 var57 = var20 = new jh0_0(asBridge());

            this.Rg0 = var20;
            var57.aE(0.0F);
            var57.uf("xp-progressbar");
            var57.sy(var51.Nl0() + 80, var51.wF() + 42);
         }
      } else {
         if (var4.dc().aB0() || var4.eu() == Cq.Jz0) {
            var51.uf("battle-gui-float");
            this.xA = true;
         } else if (var4.eu() != Cq.Sa0) {
            var51.uf("battle-gui-enemy");
         } else {
            var9 = this.P70;
            boolean var53;
            if (this.P70 != null && var9.Aw0().Bj()) {
               var53 = true;
            } else {
               var53 = false;
            }

            this.ld = var53;
            String var54;
            if (var53) {
               var54 = "battle-gui-boss";
            } else {
               var54 = "battle-gui-float";
            }

            var51.uf(var54);
            this.xA = true;
         }

         byte var50;
         if (tw0_0.kz0()) {
            if (this.ld) {
               byte var39 = 40;
               var50 = var39;
               var6 = var7;
            } else if (this.xA) {
               var50 = 38;
            } else {
               var6 = 320;
               var50 = 38;
            }
         } else if (this.ld) {
            byte var40 = 28;
            var50 = var40;
            var6 = var7;
         } else if (this.xA) {
            var50 = 28;
         } else {
            var6 = 299;
            var50 = 28;
         }

         var51.RY(var6, var50);
         var51.oY(var6, var50);
         var51.g2(var6, var50);
         if (var4.mn((byte)var1).Hb()
            && var4.Yc((byte)var1)[var2] != null
            && var4.eu() != Cq.Sa0
            && tw0_0.rl.sm().ID0((byte)1, var4.Yc((byte)var1)[var2].p10())) {
            S70 var21;
            S70 var60 = var21 = new S70(32, 32);

            this.Jx0 = var21;
            var60.JH().Nk(ob0_0.Ui0().W6((byte)3));
            var60.JH().Dg(pa0_0.Ol);
         }
      }

      cn_0 var22;
      var22 = new cn_0("");
      this.ya0 = var22;
      String var33;
      if (this.ld && tw0_0.H30()) {
         var33 = "redlabel-large";
      } else {
         var33 = "redlabel";
      }

      var22.uf(var33);
      cn_0 var34;
      cn_0 var61 = var34 = new cn_0("");

      this.Zh0 = var34;
      var61.uf("redlabel-large");
      er_0 var35;
      er_0 var62 = var35 = new er_0();

      this.cz = var35;
      var35.uf("coop-indicator-table");
      var62.SL(var5);
      ea0_0 var36;
      ea0_0 var63 = var36 = new ea0_0(this.lpt3);

      this.ZC = var36;
      var63.uf("health-progressbar");
      var63.aE(1.0F);
      if (tw0_0.kz0()) {
         S70 var41;
         S70 var64 = var41 = new S70(32, 32);

         this.qU = var41;
         var64.JH().Gy0(4, 4);
         if (this.ld) {
            var36.oY(384, 14);
         } else {
            var36.oY(200, 12);
         }

         S70 var42;
         S70 var65 = var42 = new S70(24, 24);

         this.bx0 = var42;
         var65.JH().nq0(24, 24);
         var65.JH().Gy0(4, 4);
         S70 var43;
         S70 var66 = var43 = new S70(32, 32);

         this.oM = var43;
         var66.JH().nq0(25, 22);
         var66.JH().Gy0(4, -12);
         jh0_0 var44 = this.Rg0;
         if (this.Rg0 != null) {
            var44.oY(200, 10);
         }

         S70 var45 = this.Jx0;
         if (this.Jx0 != null) {
            var45.JH().nq0(32, 32);
         }
      } else {
         S70 var46;
         var46 = new S70(16, 16);
         this.qU = var46;
         if (this.ld) {
            var36.oY(325, 9);
         } else if (this.xA) {
            var36.oY(170, 8);
         } else {
            var36.oY(200, 8);
         }

         S70 var47;
         S70 var67 = var47 = new S70(16, 16);

         this.bx0 = var47;
         var67.JH().nq0(16, 16);
         var67.JH().Gy0(4, 4);
         S70 var48;
         S70 var68 = var48 = new S70(16, 16);

         this.oM = var48;
         var68.JH().nq0(16, 14);
         var68.JH().Gy0(2, 2);
         jh0_0 var49 = this.Rg0;
         if (this.Rg0 != null) {
            var49.oY(200, 6);
         }
      }

      this.oM.Ll(false);
      this.bx0.Bb(100);
      var34.Ll(false);
      var35.Ll(false);
      var3.SL(var51);
      var3.SL(var36);
      jh0_0 var37 = this.Rg0;
      if (this.Rg0 != null) {
         var3.SL(var37);
      }

      var5 = this.lpt3;
      if (this.lpt3 != null) {
         var3.SL(var5);
      }

      var3.SL(var22);
      var3.SL(this.qU);
      var3.SL(this.bx0);
      S70 var23 = this.Jx0;
      if (this.Jx0 != null) {
         var3.SL(var23);
      }

      var3.SL(this.oM);
      var3.SL(var34);
      var3.SL(var35);
      this.Hm(false);
   }

   public final void le0(PF var1, boolean var2, short var3) {
      this.P70 = var1;
      String var4;
      if ((var4 = var1.A60()).contains("☆")) {
         var4 = var4.replace("☆", "★");
      }

      this.ya0.Sk(ig_0.u9(59, AN.nK0(var4, " "), " ").append(var1.Ya0()).toString());
      this.Cw = var1.Ya0();
      a10_0 var15 = this.Ia;
      if (this.Ia != null) {
         tb0_1 var16;
         if ((var16 = var15.yD0(var1.Zo0())) != null) {
            if (this.Ia.mn(var16.Ni).Fr(var16.Ua0) == this.Ia.AD) {
               this.uD.jg0(var16);
            }

            ea0_0 var5 = this.ZC;
            if (var3 < 0) {
               var3 = var1.uk();
            }

            int health = var1.zi0.Sj;
            var5.fp0 = false;
            var5.fM = var3;
            var5.ha0 = health;
            if (!var2) {
               var5.Cm0 = var3;
               var5.CH();
            }

            this.HK = lb0_2.vq(this.Ia, var16, false);
            this.ya0.coM8(null);
            cn_0 var19 = this.ya0;
            this.ya0.yj0 = this.HK;
            var19.yB0();
            this.ya0.GH0 = 100;
            if (this.Ia.Sv == XA0.Fz) {
               this.px0();
            }
         }
      } else {
         this.ya0.coM8(null);
         cn_0 var20 = this.ya0;
         this.ya0.yj0 = "";
         var20.yB0();
      }

      if (var1.Wm() >= 0 && var1.Wm() <= 1) {
         Br0 var21 = this.qU.og;
         LPT6_[] var10001 = new LPT6_[1];
         byte var7 = 0;
         fn_0 var12 = fn_0.qz0();
         byte var17 = var1.Wm();
         var10001[var7] = var12.n50[var17];
         var21.r8(var10001);
         byte var13;
         Br0 var25;
         Br0 var10002;
         if (tw0_0.kz0()) {
            var21 = this.qU.og;
            var25 = this.qU.og;
            var10002 = this.qU.og;
            var7 = 32;
            var13 = 32;
         } else {
            var21 = this.qU.og;
            var25 = this.qU.og;
            var10002 = this.qU.og;
            var7 = 19;
            var13 = 19;
         }

         var10002.OA0 = true;
         var25.IF = var7;
         var21.gx0 = var13;
      } else {
         this.qU.og.lo0();
      }

      if (this.Rg0 != null && !this.Ia.kd0()) {
         float var9 = 0.0F;
         VU var14;
         if ((var14 = tw0_0.rl.PC0.sF(var1.Zo0())) != null) {
            CE var10 = var14.I8;
            byte var18 = var14.I8.wj;
            if (var14.I8.wj == 100) {
               var9 = 100.0F;
            } else {
               int var23 = var10.Lr0;
               int var26 = var14.f60.yw.Mu0(var18);
               int levelSpan = var14.f60.yw.Mu0(var14.I8.wj + 1) - var26;
               var9 = (float)(var23 - var26) / levelSpan;
            }
         }

         jh0_0 var24 = this.Rg0;
         jh0_0 var27 = this.Rg0;
         this.Rg0.Com9 = var9;
         var27.Co0 = var9;
         var24.aE(var9);
      }

      this.z2(var1);
      this.up();
   }

   public final void V6(int var1, int var2, int var3, int var4, boolean recompute) {
      if (!recompute) {
         this.j00 = var1;
         this.Kl = var2;
         this.k0 = var3;
         this.Ou = var4;
      }

      int var5 = 0;

      label334: {
         label310: {
            label309: {
               label332: {
                  if (this.Ia.j6 != zg0_0.ef0 || !(tw0_0.kz0() ^ true) && !this.Ia.a40) {
                     boolean primary = this.AS;
                     if (primary || this.Ia.nf != Cq.Jz0) {
                        label275:
                        if (!primary && this.Ia.nf == Cq.Sa0) {
                           int panelWidth;
                           if (this.ld) {
                              panelWidth = this.s90;
                           } else {
                              panelWidth = this.ZA0;
                           }

                           label270: {
                              var1 -= 10;
                              var5 = this.vc0;
                              if (this.vc0 == 0) {
                                 var3 = var3 / 2 - panelWidth / 2 - panelWidth;
                                 byte var38;
                                 if (tw0_0.kz0()) {
                                    var38 = 75;
                                 } else {
                                    var38 = 0;
                                 }

                                 var1 = var3 - var38 + var1;
                                 if (tw0_0.kz0()) {
                                    break label270;
                                 }
                              } else {
                                 if (var5 == 1) {
                                    var1 = var3 / 2 - panelWidth / 2 + var1;
                                    if (tw0_0.kz0()) {
                                       var3 = 30;
                                    } else {
                                       var3 = 0;
                                    }
                                    break label275;
                                 }

                                 var3 = var3 / 2 - panelWidth / 2 + panelWidth;
                                 byte var39;
                                 if (tw0_0.kz0()) {
                                    var39 = 75;
                                 } else {
                                    var39 = 0;
                                 }

                                 var1 = var3 + var39 + var1;
                                 if (tw0_0.kz0()) {
                                    break label270;
                                 }
                              }

                              var3 = 70;
                              break label275;
                           }

                           var3 = -20;
                        } else {
                           if (!tw0_0.kz0()) {
                              if (tw0_0.kz0() ^ true) {
                                 if (this.AS) {
                                    if (this.q80) {
                                       var2 += this.vc0 * 40 - 40;
                                    } else {
                                       var2 += this.vc0 * 60 - 55;
                                    }
                                 } else {
                                    var2 += this.vc0 * 40;
                                 }
                              }
                              break label334;
                           }

                           if (!this.AS) {
                              var2 += this.vc0 * 60;
                              break label334;
                           }

                           if (this.q80) {
                              var2 += this.vc0 * 60 - 60;
                              break label334;
                           }

                           byte var24 = this.kK0;
                           if (this.kK0 != 1) {
                              if (var24 != 2) {
                                 var3 = (this.vc0 - 1) * 90 - 40;
                              } else {
                                 var3 = (this.vc0 - 1) * 90;
                              }
                           } else {
                              var3 = -40;
                           }
                        }

                        var2 += var3;
                        break label334;
                     }

                     var1 -= 10;
                     byte var36 = this.vc0;
                     if (this.vc0 < 2) {
                        int var61 = var3 / 2;
                        var3 = this.ZA0;
                        var1 = var61 - this.ZA0 / 2 - var3 + var1;
                        var3 = 30;
                        var4 = 1 - var36;
                        if (tw0_0.kz0()) {
                           break label332;
                        }
                     } else {
                        if (var36 == 2) {
                           var1 = var3 / 2 - this.ZA0 / 2 + var1;
                           var2 += 30;
                           break label334;
                        }

                        int var10001 = var3 / 2;
                        var3 = this.ZA0;
                        var1 = var10001 - this.ZA0 / 2 + var3 + var1;
                        var3 = 30;
                        var4 = var36 - 3;
                        if (tw0_0.kz0()) {
                           break label332;
                        }
                     }
                  } else {
                     var1 -= 10;
                     switch (this.vc0) {
                        case 0:
                        case 3:
                           int var60 = var3 / 2;
                           var3 = this.ZA0;
                           var1 += var60 - this.ZA0 / 2 - var3;
                           if (this.AS) {
                              short var21;
                              if (tw0_0.kz0()) {
                                 var21 = 320;
                              } else {
                                 var21 = 190;
                              }

                              var3 = var4 - var21;
                           } else {
                              var3 = 75;
                           }

                           byte var34 = this.vc0;
                           if (this.AS) {
                              var5 = (byte)3;
                           } else {
                              var5 = (byte)0;
                           }

                           if (var34 == var5) {
                              var4 = 1;
                           } else {
                              var4 = 0;
                           }

                           if (tw0_0.kz0()) {
                              break label309;
                           }
                           break;
                        case 1:
                        case 4:
                           var1 += var3 / 2 - this.ZA0 / 2;
                           if (this.AS) {
                              short var19;
                              if (tw0_0.kz0()) {
                                 var19 = 320;
                              } else {
                                 var19 = 190;
                              }

                              var3 = var4 - var19;
                           } else {
                              var3 = 75;
                           }

                           byte var33 = this.vc0;
                           if (this.AS) {
                              var5 = (byte)4;
                           } else {
                              var5 = (byte)1;
                           }

                           if (var33 == var5) {
                              var4 = 1;
                           } else {
                              var4 = 0;
                           }

                           if (tw0_0.kz0()) {
                              break label309;
                           }
                           break;
                        case 2:
                        case 5:
                           int var10000 = var3 / 2;
                           var3 = this.ZA0;
                           var1 += var10000 - this.ZA0 / 2 + var3;
                           if (this.AS) {
                              short var17;
                              if (tw0_0.kz0()) {
                                 var17 = 320;
                              } else {
                                 var17 = 190;
                              }

                              var3 = var4 - var17;
                           } else {
                              var3 = 75;
                           }

                           byte var31 = this.vc0;
                           if (this.AS) {
                              var5 = (byte)5;
                           } else {
                              var5 = (byte)2;
                           }

                           if (var31 == var5) {
                              var4 = 1;
                           } else {
                              var4 = 0;
                           }

                           if (tw0_0.kz0()) {
                              break label309;
                           }
                           break;
                        default:
                           break label334;
                     }
                  }

                  var5 = (byte)40;
                  break label310;
               }

               var5 = (byte)65;
               break label310;
            }

            var5 = (byte)60;
         }

         var2 = si0_0.Fz(var4, var5, var3, var2);
      }

      cn_0 var68;
      er_0 var67;
      int var75;
      label343: {
         this.nk.E40(var1, var2);
         var3 = Math.max(1, this.ya0.hr0());
         var4 = Math.max(1, this.ya0.Ob());
         this.ya0.RY(var3, var4);
         this.ya0.oY(var3, var4);
         S70 var63;
         int var10002;
         if (tw0_0.kz0()) {
            if (this.AS) {
               this.ya0.E40(var1 + 50, var2 - (int)(this.ya0.OB / 1.7));
               ea0_0 var41 = this.ZC;
               byte var6;
               if (!this.ja0) {
                  var6 = 88;
               } else {
                  var6 = 72;
               }

               int var55 = var1 + var6;
               if (var55 == 0) {
                  var6 = 11;
               } else {
                  var6 = 12;
               }

               var41.E40(var55, var2 + var6);
               this.bx0.E40(var1 + 18, var2 - 21);
               jh0_0 var42 = this.Rg0;
               if (this.Rg0 != null) {
                  var42.E40(var1 + 86, var2 + 57);
               }

               cn_0 var43 = this.lpt3;
               if (this.lpt3 != null) {
                  var43.E40(var1 + 80, var2 + 38);
                  this.lpt3.qF0(pa0_0.Ol);
               }

               S70 var66;
               if (this.qU.og.De0() > 0) {
                  this.qU.E40(var1 + 45 + var3, var2 - 25);
                  var66 = this.oM;
                  S70 var29 = this.qU;
                  var75 = this.qU.A20 + 28;
                  var10002 = var29.SB0 + 21;
               } else {
                  var66 = this.oM;
                  var75 = var1 + 52 + var3;
                  var10002 = var2 - 3;
               }

               var66.E40(var75, var10002);
               if (this.Km.j50.toString().isEmpty()) {
                  return;
               }

               var67 = this.cz;
               var75 = this.cz.Mx;
               break label343;
            }

            label242: {
               cn_0 var62;
               if (this.ld) {
                  this.ZC.E40(var1 + 22, var2 + 14);
                  var62 = this.ya0;
                  var75 = this.nk.Mx;
               } else {
                  if (!this.xA) {
                     this.ZC.E40(var1 + 72, var2 + 12);
                     this.ya0.E40(var1 + 45, var2 - (int)(this.ya0.OB / 1.7));
                     break label242;
                  }

                  this.ZC.E40(var1 + 72, var2 + 12);
                  var62 = this.ya0;
                  var75 = this.nk.Mx;
               }

               var62.E40(var75 / 2 - var3 / 2 + var1, var2 - 1 - var4 / 2);
            }

            this.qU.E40(this.ya0.A20 + var3, var2 - 25);
            this.bx0.E40(this.ya0.A20 - 32, var2 - 19);
            this.Zh0.E40(var1 + 45, var2 + 55);
            if (this.Jx0 == null) {
               if (this.qU.og.De0() > 0) {
                  var63 = this.oM;
                  S70 var8;
                  var75 = (var8 = this.qU).A20 + 28;
                  var10002 = var8.SB0 + 21;
               } else {
                  var63 = this.oM;
                  var75 = this.ya0.A20 + var3;
                  var10002 = var2 - 3;
               }
            } else {
               S70 var64;
               if (this.qU.og.De0() > 0) {
                  var64 = this.Jx0;
                  S70 var14 = this.qU;
                  var75 = this.qU.A20 + 25;
                  var10002 = var14.SB0 - 7;
               } else {
                  var64 = this.Jx0;
                  var75 = this.ya0.A20 + var3;
                  var10002 = var2 - 34;
               }

               var64.E40(var75, var10002);
               var63 = this.oM;
               S70 var9;
               var75 = (var9 = this.Jx0).A20 + 38;
               var10002 = var9.SB0 + 28;
            }
         } else {
            if (!(tw0_0.kz0() ^ true)) {
               return;
            }

            if (this.AS) {
               cn_0 var46 = this.ya0;
               this.ya0.E40(var5 = var1 + 65, var2 - 1 - var46.OB / 2);
               ea0_0 var47 = this.ZC;
               int var59 = var1 + 80;
               byte var7;
               if (!this.ja0) {
                  var7 = 8;
               } else {
                  var7 = 9;
               }

               var47.E40(var59, var2 + var7);
               this.bx0.E40(var1 + 40, var2 - 15);
               jh0_0 var48 = this.Rg0;
               if (this.Rg0 != null) {
                  var48.E40(var59, var2 + 41);
               }

               cn_0 var49 = this.lpt3;
               if (this.lpt3 != null) {
                  var49.E40(var59, var2 + 28);
                  this.lpt3.qF0(pa0_0.Ol);
               }

               if (this.qU.og.De0() > 0) {
                  this.qU.E40(var5 + var3, var2 - 12);
                  var3 = this.qU.A20 + 14;
                  this.oM.E40(var3, this.qU.SB0);
               } else {
                  this.oM.E40(var1 + var3 + 65, this.ya0.SB0 - 1);
               }

               if (this.Km.j50.toString().isEmpty()) {
                  return;
               }

               var67 = this.cz;
               var75 = this.cz.Mx;
               break label343;
            }

            label236: {
               if (this.ld) {
                  this.ZC.E40(var1 + 16, var2 + 10);
                  var68 = this.ya0;
                  var75 = this.nk.Mx;
               } else {
                  if (!this.xA) {
                     this.ZC.E40(var1 + 70, var2 + 9);
                     cn_0 var44;
                     var68 = var44 = this.ya0;
                     var75 = var1 + 50;
                     var10002 = var2 - 1 - var44.OB / 2;
                     break label236;
                  }

                  this.ZC.E40(var1 + 55, var2 + 9);
                  var68 = this.ya0;
                  var75 = this.nk.Mx;
               }

               var75 = var75 / 2 - var3 / 2 + var1;
               var10002 = var2 - 1 - var4 / 2;
            }

            var68.E40(var75, var10002);
            this.qU.E40(this.ya0.A20 + var3, var4 = var2 - 12);
            this.bx0.E40(this.ya0.A20 - 24, var2 - 15);
            this.Zh0.E40(var1 + 50, var2 + 40);
            if (this.Jx0 == null) {
               if (this.qU.og.De0() > 0) {
                  int var11 = this.qU.A20 + 15;
                  this.oM.E40(var11, this.qU.SB0);
               } else {
                  this.oM.E40(var1 + 55 + var3, var4);
               }

               return;
            }

            S70 var69;
            if (this.qU.og.De0() > 0) {
               var69 = this.Jx0;
               S70 var15 = this.qU;
               var75 = this.qU.A20 + 12;
               var10002 = var15.SB0 - 7;
            } else {
               var69 = this.Jx0;
               var75 = this.ya0.A20 + var3;
               var10002 = var2 - 19;
            }

            var69.E40(var75, var10002);
            var63 = this.oM;
            S70 var10;
            var75 = (var10 = this.Jx0).A20 + 23;
            var10002 = var10.SB0 + 7;
         }

         var63.E40(var75, var10002);
         return;
      }

      var67.E40(var1 - var75 - 10, var2 + 10);
   }

   public final void Hm(boolean var1) {
      this.ZC.Ll(var1);
      cn_0 var2 = this.lpt3;
      if (this.lpt3 != null) {
         var2.Ll(var1);
      }

      jh0_0 var3 = this.Rg0;
      if (this.Rg0 != null) {
         var3.Ll(var1);
      }

      this.nk.Ll(var1);
      this.ya0.Ll(var1);
      this.qU.Ll(var1);
      this.bx0.Ll(var1);
      this.Zh0.Ll(var1);
      if (!this.AS) {
         var2 = this.Jx0;
         if (this.Jx0 != null) {
            var2.Ll(var1);
         }
      }

      this.Om0(var1);
      this.up();
   }

   public final void z2(PF var1) {
      if (var1 != null && tw0_0.PK0 != null) {
         tb0_1 var3 = this.Ia.yD0(var1.Zo0());
         byte var2;
         if ((var2 = CE.kq(var1.zi0.HP())) != -128) {
            if (var2 != 16) {
               if (var2 != 32) {
                  if (var2 != 64) {
                     if (var2 != 7) {
                        if (var2 != 8) {
                           this.bx0.og.lo0();
                           S70 var12 = this.bx0;
                           this.bx0.yj0 = null;
                           var12.yB0();
                        } else {
                           S70 var13 = this.bx0;
                           this.bx0.yj0 = sm0_0.c0(5221);
                           var13.yB0();
                           Br0 var14 = this.bx0.og;
                           LPT6_[] var10001 = new LPT6_[1];
                           fn_0 var10004 = fn_0.qz0();
                           var2 = 8;
                           var10001[0] = var10004.D20[fn_0.Xa(var2)];
                           var14.r8(var10001);
                        }
                     } else {
                        S70 var15 = this.bx0;
                        this.bx0.yj0 = sm0_0.c0(5220);
                        var15.yB0();
                        Br0 var16 = this.bx0.og;
                        LPT6_[] var26 = new LPT6_[1];
                        fn_0 var31 = fn_0.qz0();
                        var2 = 7;
                        var26[0] = var31.D20[fn_0.Xa(var2)];
                        var16.r8(var26);
                     }
                  } else {
                     S70 var17 = this.bx0;
                     this.bx0.yj0 = sm0_0.c0(5224);
                     var17.yB0();
                     Br0 var18 = this.bx0.og;
                     LPT6_[] var27 = new LPT6_[1];
                     fn_0 var32 = fn_0.qz0();
                     var2 = 64;
                     var27[0] = var32.D20[fn_0.Xa(var2)];
                     var18.r8(var27);
                  }
               } else {
                  S70 var19 = this.bx0;
                  this.bx0.yj0 = sm0_0.c0(5223);
                  var19.yB0();
                  Br0 var20 = this.bx0.og;
                  LPT6_[] var28 = new LPT6_[1];
                  fn_0 var33 = fn_0.qz0();
                  var2 = 32;
                  var28[0] = var33.D20[fn_0.Xa(var2)];
                  var20.r8(var28);
               }
            } else {
               S70 var21 = this.bx0;
               this.bx0.yj0 = sm0_0.c0(5222);
               var21.yB0();
               Br0 var22 = this.bx0.og;
               LPT6_[] var29 = new LPT6_[1];
               fn_0 var34 = fn_0.qz0();
               var2 = 16;
               var29[0] = var34.D20[fn_0.Xa(var2)];
               var22.r8(var29);
            }
         } else {
            S70 var23 = this.bx0;
            this.bx0.yj0 = sm0_0.c0(5225);
            var23.yB0();
            Br0 var24 = this.bx0.og;
            LPT6_[] var30 = new LPT6_[1];
            fn_0 var35 = fn_0.qz0();
            var2 = -128;
            var30[0] = var35.D20[fn_0.Xa(var2)];
            var24.r8(var30);
         }

         String var10 = lb0_2.vq(this.Ia, var3, false);
         this.HK = var10;
         cn_0 var25 = this.ya0;
         this.ya0.yj0 = var10;
         var25.yB0();
         this.uD.jg0(var3);
      } else {
         this.bx0.og.lo0();
         S70 var10000 = this.bx0;
         this.bx0.yj0 = null;
         var10000.yB0();
      }
   }

   public final void up() {
      if (!this.nk.eE) {
         this.cz.Ll(false);
         this.Km.Sk("");
      } else {
         if (this.Ia.mn(this.Pq0).Td0() == con__6.Wt0) {
            a10_0 var10000 = this.Ia;
            byte var10001 = this.Pq0;
            int var1 = this.vc0;
            this.Ia.getClass();
            b30_0 var4 = b30_0.U5(var10001, (byte)var1);
            V00 var5;
            if ((var5 = (V00)var10000.qQ.get(var4)) == null) {
               this.cz.Ll(false);
               this.Km.Sk("");
            } else {
               String var6;
               if ((var6 = var5.toString()).isEmpty()) {
                  this.cz.Ll(false);
                  this.Km.Sk("");
                  return;
               }

               this.Km.Sk(var6);
               int var2 = (var1 = this.Km.hr0()) + 10;
               int var3 = this.Km.Ob() + 10;
               if (tw0_0.kz0()) {
                  var2 = var1 + 15;
               }

               var1 = Math.max(1, var2);
               var2 = Math.max(1, var3);
               this.cz.RY(var1, var2);
               this.cz.oY(var1, var2);
               this.cz.Ll(this.uD.eE);
            }
         }
      }
   }

   public final int bf() {
      return this.ZC.fM;
   }

   public final void Ny() {
      PF var1 = this.P70;
      boolean var2;
      if (this.P70 != null && var1.zi0.T0 > 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.Om0(var2);
   }

   public final void px0() {
      PF var1 = this.P70;
      if (this.P70 != null) {
         if (var1.COm2()) {
            this.Zh0.Sk("");
            return;
         }

         byte var3 = this.P70.rs0;
         if (this.P70.rs0 < 1 || var3 > 10) {
            this.Zh0.Sk("");
            return;
         }

         String var2 = String.valueOf(Character.toChars(var3 + 10101));
         this.Zh0.Sk(var2);
      }
   }

   public final void XO() {
      a10_0 var1 = this.Ia;
      if (this.Ia != null) {
         PF var2 = this.P70;
         if (this.P70 != null) {
            this.HK = lb0_2.vq(var1, var1.yD0(var2.Zo0()), false);
         } else {
            this.HK = "";
         }

         cn_0 var10000 = this.ya0;
         this.ya0.yj0 = this.HK;
         var10000.yB0();
      }
   }

   public final void Om0(boolean var1) {
      PF var2 = this.P70;
      if (this.P70 != null && var2.zi0.T0 > 0) {
         this.oM.Ll(var1);
         this.oM.og.o60(ob0_0.Ui0().es0);
      } else {
         this.oM.Ll(false);
         this.oM.og.lo0();
      }
   }
}
