package cn.pokemmo.rom.nds.dppt;

import f.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

public class PlatinumMapZone extends XF0 {
   public final Ts by0;
   public final ArrayList<pg_0> Eu = new ArrayList<>();
   public W2[] J60 = new W2[0];

   public PlatinumMapZone(Ts var1, short var2, byte var3, short var4, TE var5) {
      super(var1, var2, var3, var4, var5);
      this.by0 = var1;
      gh_0 var6;
      if (super.Ro0.Va0 != 0) {
         var6 = gh_0.tA;
      } else {
         var6 = gh_0.wZ;
      }

      super.lm0 = var6;
      this.gA();
      this.zl0();
   }

   public static boolean Pc(LT var0) {
      return !var0.LPt1();
   }

   public static boolean Ed(LT var0) {
      return !var0.LPt1();
   }

   public static boolean XT(LT var0) {
      return !var0.LPt1();
   }

   public final boolean Wp() {
      return super.jE != null ? true : tw0_0.rl.yh0.Ny(super.dw, (short)1360);
   }

   public final void gA() {
      super.gA();
      short var1 = 0;

      while (var1 < super.i80.It0) {
         short var2 = 0;

         while (true) {
            wa0_2 var3 = super.i80;
            if (var2 >= super.i80.WH) {
               var1++;
               break;
            }

            int var4;
            if (super.o6 && (var4 = var3.l1[var1][var2]) >= 0) {
               super.uJ[var1][var2] = super.xk0.Sc0(var4);
               int var10000 = super.i80.l1[var1][var2];
            }

            int var5;
            if ((var5 = super.i80.M70[var1][var2]) >= 0) {
               short var6 = (short)var5;
               if (super.sp0.bL0(var6)) {
                  var6 = super.sp0.f5(var6);
               }

               qj0_1 var7 = (qj0_1)this.by0.FA(var6);
               if (super.yd == 0 && super.ie == 0) {
                  super.yd = var7.qB0;
                  super.ie = var7.N70;
               }

               if (super.yd != var7.qB0 || super.ie != var7.N70) {
                  throw new RuntimeException("Matrix has mismatching footer sizes");
               }

               short[][][][] var8;
               if ((var8 = var7.Jk).length > super.Sm0) {
                  super.Sm0 = var8.length;
               }
            }

            var2++;
         }
      }
   }

   public final void hl(short var1, short var2) {
      int var3;
      if ((var3 = super.i80.M70[var1][var2]) >= 0) {
         short var6 = (short)var3;
         if (super.sp0.bL0(var6)) {
            var6 = super.sp0.f5(var6);
         }

         qj0_1 var7 = (qj0_1)this.by0.FA(var6);
         bm_1[] var10000 = super.Qm[var1];
          wa0_2 var5 = super.i80;
          var10000[var2] = new ZQ(var1, var2, this, var7, var5);
      }
   }

   public final Ao0 PQ(int var1, int var2) {
      return (Ao0)super.W4(var1, var2);
   }

   public final LT Jk0(byte var1, short var2, short var3) {
      W2[] var4;
      return var1 >= 0 && var1 < (var4 = this.J60).length ? var4[var1].wr0(var2, var3) : null;
   }

   public final LT pR(float var1, float var2, float var3) {
      float var8 = Float.MAX_VALUE;
      pg_0 var4 = null;
      Iterator var5 = this.Eu.iterator();

      while (var5.hasNext()) {
         pg_0 var6;
         float var7;
         if ((var7 = (var6 = (pg_0)var5.next()).Fk.Ir(var1, var3, var2)) < var8) {
            var4 = var6;
            var8 = var7;
         }
      }

      return var4;
   }

   public final Ll0 fm(float var1, float var2, float var3, yo_0 var4) {
      Object var5 = null;
      float var6 = Float.MAX_VALUE;

      for (pg_0 var8 : this.Eu) {
         float var9;
         if ((var4 == null || var4.mF0(var8)) && (var9 = var8.Fk.Ir(var1, var3, var2)) < var6) {
            var6 = var9;
            var5 = var8;
         }
      }

      short var10 = (short)var1;
      short var14 = (short)var2;
      Ll0 var11 = this.rc0((byte)0, var10, var14);
      if (var4 == null || var4.mF0(var11)) {
         var1 = var11.Tz();
         float var13 = var11.S80();
         if (new C8(var1, var13, var11.HR()).Ir(var1, var3, var2) < var6) {
            var5 = var11;
         }
      }

      return (Ll0)var5;
   }

   public final void zl0() {
      short var1;
      switch (var1 = J4.p5(super.Bm0, super.case$)) {
         case 573:
         case 574:
         case 575:
         case 576:
         case 577:
         case 579:
         case 580:
         case 581:
         case 582:
         case 583:
            Ts var2;
            Ts var10000 = var2 = tw0_0.Ll0.nC0;
            String var24 = "/fielddata/tornworld/tw_arc.narc";
            FJ var3 = new FJ((Ae)var2.fd0.dg.get(var24));
            String var25 = "/fielddata/tornworld/tw_arc_attr.narc";
            Ae var26;
            Ae var151 = var26 = (Ae)var10000.fd0.dg.get(var25);
            Qd0.cV();
            l50_0 var4;
            ByteBuffer var5;
            int var27;
            int var152 = var27 = pf_0.LPt2(var5 = (var4 = var151.h2).dL.duplicate().order(ByteOrder.LITTLE_ENDIAN), var26.bM0);
            int var6 = 1129464142;
            if (var152 != 1129464142) {
               throw new RuntimeException(ac0_0.YH0("Header magic mismatch = ", var27, " vs expected ", var6));
            } else {
               int var28 = ax0_0.vU(var5);
               var6 = iy_1.WG0(var5.getInt(), 8, var5.position(), var5);
               var6 = var5.position() + var6;
               sk_1 var7 = new CU(var3.GJ(0).MH(false)).p80(J4.p5(super.Bm0, super.case$));
                XU var8 = new XU(var3.GJ(var7.Md + 1));
                this.J60 = new W2[var8.su.length];
               byte var36 = 0;

               while (true) {
                  YN[] var9 = var8.su;
                  if (var36 >= var8.su.length) {
                     m50[] var29 = var8.gL;
                     int var37 = var8.gL.length;

                     for (int var48 = 0; var48 < var37; var48++) {
                        m50 var55 = var29[var48];

                        for (int var61 = 0; var61 < var55.CON + 1; var61++) {
                           float var66 = var55.cE0;
                           float var82 = var55.jo0 + var61;
                           float var90 = var55.OT;
                           yo_0 var110 = var0 -> !((Ll0)var0).LPt1();
                           Ll0 var67 = this.fm(var66, var82, var90, var110);
                           float var83 = var55.cE0 + var55.UN;
                           var90 = var55.jo0 + var61 + var55.Z5;
                           float var111 = var55.OT + var55.k4;
                           yo_0 var129 = var0 -> !((Ll0)var0).LPt1();
                           Ll0 var84;
                           if ((var84 = this.fm(var83, var90, var111, var129)) instanceof pg_0) {
                              this.J60[var84.Sm].Mv0 = var55.QJ0;
                           }

                           if (var67.gr0() && var67.JG0(var55.JU) == null) {
                              var67.Nn0(var55.JU, var67);
                           }
                        }
                     }

                     byte var30 = 0;

                     while (true) {
                        YN[] var38 = var8.su;
                        if (var30 >= var8.su.length) {
                           if (var1 == 575) {
                              for (short var21 = 0; var21 < 32; var21++) {
                                 pg_0 var31 = this.J60[0].wr0((short)31, var21);
                                 pg_0 var40;
                                 pg_0 var165 = var40 = this.J60[1].wr0((short)0, var21);
                                 byte var50 = 3;
                                 if (var165 == null) {
                                    var31.getClass();
                                 } else {
                                    var31.C80[var50] = var40;
                                 }

                                 byte var41 = 2;
                                 var40.C80[var41] = var31;
                                 pg_0 var32 = this.J60[2].wr0((short)31, var21);
                                 pg_0 var42;
                                 pg_0 var167 = var42 = this.J60[3].wr0((short)0, var21);
                                 byte var51 = 3;
                                 if (var167 == null) {
                                    var32.getClass();
                                 } else {
                                    var32.C80[var51] = var42;
                                 }

                                 byte var43 = 2;
                                 var42.C80[var43] = var32;
                                 pg_0 var33 = this.J60[0].wr0(var21, (short)31);
                                 pg_0 var44;
                                 pg_0 var169 = var44 = this.J60[2].wr0(var21, (short)0);
                                 byte var52 = 0;
                                 if (var169 == null) {
                                    var33.getClass();
                                 } else {
                                    var33.C80[var52] = var44;
                                 }

                                 byte var45 = 1;
                                 var44.C80[var45] = var33;
                                 pg_0 var34 = this.J60[1].wr0(var21, (short)31);
                                 pg_0 var46;
                                 pg_0 var171 = var46 = this.J60[3].wr0(var21, (short)0);
                                 byte var53 = 0;
                                 if (var171 == null) {
                                    var34.getClass();
                                 } else {
                                    var34.C80[var53] = var46;
                                 }

                                 byte var22 = 1;
                                 var46.C80[var22] = var34;
                              }
                           }

                           NG0[] var23 = var8.Oy;
                           if (var8.Oy != null) {
                              int var35 = var23.length;

                              for (int var47 = 0; var47 < var35; var47++) {
                                 NG0 var173 = var23[var47];
                                 NG0 var54;
                                 NG0 var186 = var54 = var23[var47];
                                 float var57 = var23[var47].sa0 + 0.125F;
                                 float var64 = var186.zl0;
                                 float var71 = var173.Sa0 + 0.125F;
                                 yo_0 var77 = var0 -> !((Ll0)var0).LPt1();
                                 Ll0 var58;
                                 if ((var58 = this.fm(var57, var64, var71, var77)) != null) {
                                    for (short var65 = 0; var65 <= var54.fO + 1; var65++) {
                                       LT var73;
                                       if (var65 > 0) {
                                          if (var58.gr0()) {
                                             byte var72 = ((pg_0)var58).Sm;
                                             short var78 = var58.Tz();
                                             short var87 = (short)(var58.HR() + var65);
                                             var73 = this.Jk0(var72, var78, var87);
                                          } else {
                                             short var74 = var58.Tz();
                                             int var79 = var58.HR() + var65;
                                             var74 = (short)var74;
                                             short var80 = (short)var79;
                                             var73 = this.rc0((byte)var58.Sm, var74, var80);
                                          }
                                       } else {
                                          var73 = var58;
                                       }

                                       if (var73 == null || var73.LPt1()) {
                                          break;
                                       }

                                       if (var73.u40() != lj_1.pF && var73.u40() instanceof MB0) {
                                          ((MB0)var73.u40()).Ur.Ue0(var54);
                                       } else {
                                          ((Ll0)var73).WH = new MB0(var54);
                                       }
                                    }
                                 }
                              }
                           }

                           return;
                        }

                        YN var159 = var38[var30];
                        int var39 = this.J60[var30].o2;
                        int var49 = this.J60[var30].yB0;
                         C8 var56 = new C8();
                        short var62;
                        if ((var62 = var159.Sh0) != 1) {
                           if (var62 != 2) {
                              if (var62 == 3) {
                                 var56.na(0.0F, 0.0F, 0.0F);
                              }
                           } else {
                              var56.na(1.0F, 1.0F, 1.5F);
                           }
                        } else if (var1 == 574) {
                           var56.na(0.0F, 1.0F, 1.5F);
                        } else if (var1 == 575) {
                           var56.na(0.0F, 0.875F, 1.0F);
                        } else if (var1 == 576) {
                           var56.na(0.0F, 1.0F, 0.5F);
                        } else {
                           var56.na(0.0F, 1.0F, 0.0F);
                        }

                        for (short var63 = 0; var63 < var39; var63++) {
                           for (short var68 = 0; var68 < var49; var68++) {
                              pg_0 var85 = this.J60[var30].wr0(var63, var68);
                              W2 var92;
                              short var112;
                              if ((var112 = (var92 = this.J60[var30]).Mv0) != 1) {
                                 if (var112 != 2) {
                                    if (var112 != 3) {
                                       byte var93 = 1;
                                       pg_0 var113;
                                       if ((var113 = var92.wr0(var63, (short)(var68 - 1))) == null) {
                                          var85.getClass();
                                       } else {
                                          var85.C80[var93] = var113;
                                       }

                                       byte var94 = 0;
                                       pg_0 var114;
                                       if ((var114 = this.J60[var30].wr0(var63, (short)(var68 + 1))) != null) {
                                          var85.C80[var94] = var114;
                                       }

                                       byte var95 = 3;
                                       pg_0 var115;
                                       if ((var115 = this.J60[var30].wr0((short)(var63 + 1), var68)) != null) {
                                          var85.C80[var95] = var115;
                                       }

                                       byte var96 = 2;
                                       pg_0 var116;
                                       if ((var116 = this.J60[var30].wr0((short)(var63 - 1), var68)) != null) {
                                          var85.C80[var96] = var116;
                                       }
                                    } else {
                                       byte var97 = 0;
                                       pg_0 var117;
                                       if ((var117 = var92.wr0(var63, (short)(var68 - 1))) == null) {
                                          var85.getClass();
                                       } else {
                                          var85.C80[var97] = var117;
                                       }

                                       byte var98 = 1;
                                       pg_0 var118;
                                       if ((var118 = this.J60[var30].wr0(var63, (short)(var68 + 1))) != null) {
                                          var85.C80[var98] = var118;
                                       }

                                       byte var99 = 2;
                                       pg_0 var119;
                                       if ((var119 = this.J60[var30].wr0((short)(var63 + 1), var68)) != null) {
                                          var85.C80[var99] = var119;
                                       }

                                       byte var100 = 3;
                                       pg_0 var120;
                                       if ((var120 = this.J60[var30].wr0((short)(var63 - 1), var68)) != null) {
                                          var85.C80[var100] = var120;
                                       }
                                    }
                                 } else {
                                    byte var101 = 2;
                                    pg_0 var121;
                                    if ((var121 = var92.wr0(var63, (short)(var68 - 1))) == null) {
                                       var85.getClass();
                                    } else {
                                       var85.C80[var101] = var121;
                                    }

                                    byte var102 = 3;
                                    pg_0 var122;
                                    if ((var122 = this.J60[var30].wr0(var63, (short)(var68 + 1))) != null) {
                                       var85.C80[var102] = var122;
                                    }

                                    byte var103 = 1;
                                    pg_0 var123;
                                    if ((var123 = this.J60[var30].wr0((short)(var63 + 1), var68)) != null) {
                                       var85.C80[var103] = var123;
                                    }

                                    byte var104 = 0;
                                    pg_0 var124;
                                    if ((var124 = this.J60[var30].wr0((short)(var63 - 1), var68)) != null) {
                                       var85.C80[var104] = var124;
                                    }
                                 }
                              } else {
                                 byte var105 = 3;
                                 pg_0 var125;
                                 if ((var125 = var92.wr0(var63, (short)(var68 - 1))) == null) {
                                    var85.getClass();
                                 } else {
                                    var85.C80[var105] = var125;
                                 }

                                 byte var106 = 2;
                                 pg_0 var126;
                                 if ((var126 = this.J60[var30].wr0(var63, (short)(var68 + 1))) != null) {
                                    var85.C80[var106] = var126;
                                 }

                                 byte var107 = 0;
                                 pg_0 var127;
                                 if ((var127 = this.J60[var30].wr0((short)(var63 + 1), var68)) != null) {
                                    var85.C80[var107] = var127;
                                 }

                                 byte var108 = 1;
                                 pg_0 var128;
                                 if ((var128 = this.J60[var30].wr0((short)(var63 - 1), var68)) != null) {
                                    var85.C80[var108] = var128;
                                 }
                              }

                              C8 var69;
                              C8 var185 = var69 = var85.Fk;
                              var69.getClass();
                              float var70 = var56.x;
                              float var86 = var56.y;
                              float var109 = var56.z;
                              var185.na(var70, var86, var109);
                           }
                        }

                        var30++;
                     }
                  }

                  short var10;
                  int var11;
                  YN var81;
                  switch (var10 = (var81 = var9[var36]).Sh0) {
                     case 0:
                     case 3:
                        var11 = var81.UA;
                        break;
                     case 1:
                     case 2:
                        var11 = var81.sJ;
                        break;
                     default:
                        var11 = 0;
                  }

                  var10 = (short)(var11 + 1);
                  short var155;
                  switch (var10) {
                     case 0:
                     case 1:
                     case 2:
                     case 3:
                        var155 = var81.Com5;
                        break;
                     default:
                        var155 = 0;
                  }

                  int var12 = var155 + 1;
                  if (var7.Md != 4 || var36 != 0) {
                     var11 = var10;
                  }

                  this.J60[var36] = new W2(var11, var12);
                  float var187 = var81.rH;
                  float var13 = var81.Xa0;
                  C8 var89 = new C8(var187, var13, var81.Ki);
                  short var130 = var81.Sh0;
                  if (var81.Sh0 != 0) {
                     if (var130 != 1) {
                        if (var130 == 3) {
                           var89.na(var11 - 0.5F, 0.0F, 0.5F);
                        }
                     } else {
                        var89.na(0.0F, var11 - 1, 0.0F);
                     }
                  } else {
                     var89.na(0.5F, 0.0F, 0.5F);
                  }

                  short var131;
                  short var156 = var131 = var81.Wi;
                  int var14;
                  int var15 = var5.getInt(var28 + 12 + (var14 = var131 * 8));
                  int var176 = GA.m1(var28, 16, var14, var5);
                  var14 = var15 + var6;
                  var15 = var176 - var15;
                  String[] var16 = un0_0.DB0;
                  if (var156 < 400) {
                     String var157 = var16[var131];
                  } else {
                     Integer.toString(var131);
                  }

                  ByteBuffer var177 = var4.dL.duplicate();
                  ByteOrder var132 = ByteOrder.LITTLE_ENDIAN;
                  ByteBuffer var138;
                  (var138 = var177.order(ByteOrder.LITTLE_ENDIAN)).position(var14);
                  if (var15 > 0) {
                     AT.i20(var14, var15, var138.limit(), var138);
                  }

                  byte[] var133;
                  var138.slice().order(var132).get(var133 = new byte[2048]);

                  for (short var135 = 0; var135 < var11; var135++) {
                     for (short var137 = 0; var137 < var12; var137++) {
                        short var17 = var133[(var137 * 32 + var135) * 2];
                        short var18 = var133[(var137 * 32 + var135) * 2 + 1];
                        pg_0 var139 = new pg_0(this, var135, var137, var36, var17, var18);
                        this.J60[var36].an[var135][var137] = var139;
                        this.Eu.add(var139);
                        C8 var144;
                        C8 var179 = var144 = var139.Fk;
                        var144.getClass();
                        float var149 = var89.x;
                        float var19 = var89.y;
                        float var20 = var89.z;
                        var179.x = var149;
                        var179.y = var19;
                        var179.z = var20;
                        pg_0 var158;
                        float var181;
                        switch (var81.Sh0) {
                           case 0:
                              var158 = var139;
                              float var143 = var135;
                              float var148 = var137;
                              var144.na(var143, 0.0F, var148);
                              var181 = 0.0F;
                              break;
                           case 1:
                              var158 = var139;
                              float var142 = -var135;
                              float var147 = var137;
                              var144.na(0.0F, var142, var147);
                              var181 = 270.0F;
                              break;
                           case 2:
                              var158 = var139;
                              float var141 = var135;
                              float var146 = var137;
                              var144.na(0.0F, var141, var146);
                              var181 = 90.0F;
                              break;
                           case 3:
                              var158 = var139;
                              float var140 = -var135;
                              float var145 = var137;
                              var144.na(var140, 0.0F, var145);
                              var181 = 180.0F;
                              break;
                           default:
                              continue;
                        }

                        var158.J70 = var181;
                     }
                  }

                  var36++;
               }
            }
         case 578:
         default:
            this.Eu.clear();
      }
   }

   public final Z50 W4(int var1, int var2) {
      return (Ao0)super.W4(var1, var2);
   }
}
