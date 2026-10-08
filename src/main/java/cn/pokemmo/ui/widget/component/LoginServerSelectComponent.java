package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginServerSelectComponent extends BaseComponent {
   public static final MD0 Dp;
   public static final char[] XD = new char[0];
   public static final ww_2 Bu;
   public static final boolean pC = !LoginServerSelectComponent.class.desiredAssertionStatus();
   public final HashMap xt0 = new HashMap();
   public final HashMap J3 = new HashMap();
   public final HashMap el0 = new HashMap();
   public final ArrayList j30 = new ArrayList();
   public final X3 G30;
   public sz_0 kl;
   public QS CT;
   public QS cF0;
   public Y30 XI;
   public mb_0[] m4;
   public dc0_0 ob0;
   public dc0_0 XL;
   public final gf0_1 VF0 = new gf0_1(null);
   public final ArrayList ll0 = new ArrayList();
   public final Hq0 tP = new Hq0(this.Ed0());
   public boolean GE0;
   public boolean vA;
   public L50 RP;
   public int kj;
   public int Zp;
   public boolean Mx;
   public boolean v5;
   public jw_0 HA;

   public LoginServerSelectComponent() {
      this.G30 = new X3((f.ge_0)(Object)this);
   }

   public LoginServerSelectComponent(sz_0 var1) {
      this();
      this.LX(var1);
   }

   public static boolean Ze(char var0) {
      return Character.isWhitespace(var0) || ":;,.-!?".indexOf(var0) >= 0 || var0 == 12289 || var0 == 12290;
   }

   static {
      MD0 var0;
      Dp = var0 = MD0.cB("hover");
      Oq[] var10002 = new Oq[1];
      yc0_0 var1;
      var1 = new yc0_0(var0);
      var10002[0] = var1;
      Bu = new ww_2(var10002);
   }

   public static void in(MP var0, ay_0 var1, jw_0 var2, O10 var3, YA0 var4) {
      boolean var5;
      if (var3 != O10.Jx0) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var5 || var4 != YA0.zH) {
         var0.k50(false);
         if (!var5) {
            short var6 = var2.kj0;
            var0.tI = Math.max(var0.u90, var0.tI + var6);
            ArrayList var14 = var0.GG0;
            int var7 = var0.GG0.size();

            label77:
            while (true) {
               int var10000 = var7;
               var7 += -1;
               if (var10000 <= 0) {
                  ArrayList var15 = var0.dL0;
                  var7 = var0.dL0.size();

                  while (true) {
                     var10000 = var7;
                     var7 += -1;
                     if (var10000 <= 0) {
                        var0.cn();
                        break label77;
                     }

                     if (((jw_0)var15.get(var7)).dt() <= var0.tI) {
                        var15.remove(var7);
                     }
                  }
               }

               if (((jw_0)var14.get(var7)).dt() <= var0.tI) {
                  var14.remove(var7);
               }
            }
         }
      }

      int var16 = var2.EQ;
      short var19 = var2.ce;
      var0.Fa(var2.J, var16, var19);
      var16 = var0.dB0;
      if (var2.J > var0.dB0) {
         var2.J = var16;
      }

      if (var5) {
         if (var3 == O10.E30) {
            var2.rs0 = var0.lx0(var2.ce) - var2.J;
            var0.dL0.add(var2);
         } else {
            var2.rs0 = var0.JO(var2.EQ);
            var0.GG0.add(var2);
         }
      } else if (var4 == YA0.zH) {
         if (var0.FX() < var2.J && !var0.bC0()) {
            var0.k50(false);
         }

         int var8 = var2.J;
         int var13 = var0.AQ;
         var0.AQ += var8;
         var2.rs0 = var13;
      } else {
         I0 var9 = I0.HORIZONTAL_ALIGNMENT;
         int var10;
         if ((var10 = ((ac0_2)var1.Ph.x90(I0.HORIZONTAL_ALIGNMENT).Kj0(var9)).ordinal()) != 1) {
            if (var10 != 2 && var10 != 3) {
               var2.rs0 = var0.JO(var2.EQ);
            } else {
               int var11 = var0.mY;
               var2.rs0 = kq_0.lpT2(var0.dB0, var2.J, 2, var11);
            }
         } else {
            var2.rs0 = var0.lx0(var2.ce) - var2.J;
         }
      }

      var0.LPT4.add(var2);
      if (var5) {
         if (!pC && var0.N90 != var0.LPT4.size() - 1) {
            throw new AssertionError();
         }

         var0.N90++;
         short var12 = var2.kj0;
         var2.D10 = Math.max(var0.u90, var0.tI + var12);
         var0.cn();
      } else if (var4 != YA0.zH) {
         var0.pe0 = Math.min(var0.pe0, Math.max(0, var0.dB0 - var2.J));
         var0.k50(false);
      }
   }

   public final void rU(MP var1, Iterable var2) {
      Iterator var3 = var2.iterator();

      while (var3.hasNext()) {
         this.py0(var1, (ay_0)var3.next());
      }
   }

   public final void py0(MP var1, ay_0 var2) {
      I0 var3 = I0.CLEAR;
      var1.eB0((xv_1)var2.Ph.x90(I0.CLEAR).Kj0(var3));
      if (var2 instanceof B60) {
         B60 var39;
         String var60 = (var39 = (B60)var2).br;
         D90 var4 = ((B60)var2).Ph;
         Y30 var34;
         zv0_0 var35;
         if ((var34 = this.AE(var4)) == null) {
            var35 = null;
         } else {
            I0 var36 = I0.COLOR;
            gn_0 var37 = (gn_0)var4.x90(I0.COLOR).Kj0(var36);
            I0 var6 = I0.COLOR_HOVER;
            zv0_0 var5 = new zv0_0(var34, var37, (gn_0)var4.x90(I0.COLOR_HOVER).Kj0(var6));

            var35 = var5;
         }

         I0 var99 = I0.PREFORMATTED;
         boolean var100 = (Boolean)var4.x90(I0.PREFORMATTED).Kj0(var99);
         if (var35 != null) {
            I0 var107 = I0.INHERIT_HOVER;
            D90 var264 = var4.x90(I0.INHERIT_HOVER);
            int var7 = var107.Ww0;
            Object[] var8;
            Y30 var118;
            if ((var8 = var264.DS) != null) {
               var118 = (Y30)var8[var7];
            } else {
               var118 = null;
            }

            Boolean var108;
            boolean var110;
            if ((var108 = (Boolean)var107.MH.cast(var118)) != null) {
               var110 = var108;
            } else {
               D90 var109 = var1.Sj;
               if (var1.Sj != null && var109 == var4.im0) {
                  var110 = true;
               } else {
                  var110 = false;
               }
            }

            var118 = var35.GS;
            var1.Tr(var4, var118, false);
            if (var100 && !var1.Op0) {
               var1.k50(false);
            }

            if (var100) {
               int var75 = 0;

               while (var75 < var60.length()) {
                  int var121;
                  if ((var121 = var60.indexOf(10, var75)) < 0) {
                     var121 = var60.length();
                  }

                  Y30 var125 = var35.GS;

                  while (true) {
                     label659:
                     if (var75 < var121) {
                        if (var60.charAt(var75) == '\t') {
                           var75++;
                           var264 = var39.Ph;
                           zb0_2 var134;
                           int var149 = (var134 = (zb0_2)var125).getEM();
                           I0 var164;
                           I0 var302 = var164 = I0.TAB_SIZE;
                           var1.wb.getClass();
                           int var136;
                           int var165;
                           if ((var165 = (Integer)var264.x90(var302).Kj0(var164)) > 0 && var149 > 0) {
                              int var137 = Math.min(var165, 32767 / var149) * var149;
                              var149 = var1.AQ - var1.mY;
                              var136 = var1.AQ + var137 - (var134.getSpaceWidth() + var149) % var137;
                           } else {
                              int var135 = var1.AQ;
                              var136 = var134.getSpaceWidth() + var135;
                           }

                           if (var136 < var1.dB0) {
                              var1.AQ = var136;
                           } else if (!var1.bC0()) {
                              break label659;
                           }
                        }

                        int var138;
                        if ((var138 = var60.indexOf(9, var75)) < 0 || var138 >= var121) {
                           var138 = var121;
                        }

                        if (var138 <= var75) {
                           var75 = var138;
                           continue;
                        }

                        int var151 = var1.FX();
                        if ((var138 = ((zb0_2)var125).computeVisibleGlpyhs(var60, var75, var138, var151)) != 0 || var1.bC0()) {
                           var138 = Math.max(1, var138) + var75;
                           boolean var166 = var1.Uq0;
                           J6 var152 = new J6(var39, var35, var60, var75, var138, var166);

                           int var76 = var152.J;
                           int var10004 = var1.AQ;
                           var1.AQ += var76;
                           var152.rs0 = var10004;
                           var152.kj0 = (short)var1.W8;
                           var152.US = var110;
                           var1.LPT4.add(var152);
                           var75 = var138;
                           continue;
                        }
                     }

                     if (var75 >= var121) {
                        if (var121 < var60.length() && var60.charAt(var121) == '\n') {
                           var75 = var121 + 1;
                           var1.k50(true);
                        } else {
                           var75 = var121;
                        }
                        break;
                     }

                     var1.k50(false);
                  }
               }
            } else {
               int var72 = 0;
               int var120 = var60.length();

               while (var72 < var120 && Character.isWhitespace(var60.charAt(var72))) {
                  var72++;
               }

               boolean var124 = false;

               while (var120 > var72 && Character.isWhitespace(var60.charAt(var120 - 1))) {
                  var124 = true;
                  var120--;
               }

               Y30 var9 = var35.GS;
               if (var72 > 0) {
                  int var10 = var1.LPT4.size();
                  jw_0 var144;
                  J6 var145;
                  if (var1.N90 < var10
                     && (
                        !((var144 = (jw_0)var1.LPT4.get(var10 - 1)) instanceof J6)
                           || Character.isWhitespace((var145 = (J6)var144).XC.charAt(var145.Ge0 - 1)) ^ true
                     )) {
                     var10 = var1.AQ;
                     var1.AQ = ((zb0_2)var9).getSpaceWidth() + var10;
                  }
               }

               Boolean var147 = null;

               while (var72 < var120) {
                  if (!pC && Character.isWhitespace(var60.charAt(var72))) {
                     throw new AssertionError();
                  }

                  int var12;
                  int var161;
                  if (var1.Vz0 != ac0_2.D4) {
                     var161 = var1.FX();
                     if ((var161 = ((zb0_2)var9).computeVisibleGlpyhs(var60, var72, var120, var161) + var72) >= var120) {
                        var12 = var161;
                     } else {
                        var12 = var161;

                        while (var12 > var72 && ":;,.-!?".indexOf(var60.charAt(var12)) >= 0) {
                           var12--;
                        }

                        if (!Ze(var60.charAt(var12))) {
                           while (var12 > var72 && !Ze(var60.charAt(var12 - 1))) {
                              var12--;
                           }
                        }
                     }

                     while (var12 > var72 && Character.isWhitespace(var60.charAt(var12 - 1))) {
                        var12--;
                     }
                  } else {
                     var161 = var72;
                     var12 = var72;
                  }

                  boolean var13 = false;
                  if (var12 == var72) {
                     if (var1.Vz0 != ac0_2.D4 && var1.k50(false)) {
                        continue;
                     }

                     if (var147 == null) {
                        I0 var148 = I0.BREAKWORD;
                        var147 = (Boolean)var39.Ph.x90(I0.BREAKWORD).Kj0(var148);
                     }

                     label832: {
                        if (var147) {
                           if (var161 == var72) {
                              var161 = var72 + 1;
                              var12 = var161;
                              break label832;
                           }
                        } else {
                           while (var12 < var120 && !Ze(var60.charAt(var12))) {
                              var12++;
                           }

                           var161 = var12;

                           while (var161 < var120 && ":;,.-!?".indexOf(var60.charAt(var161)) >= 0) {
                              var161++;
                           }
                        }

                        var12 = var161;
                     }

                      var13 = true;
                  }

                  if (var72 < var12) {
                     J6 var163 = new J6(var39, var35, var60, var72, var12, var13);
                     boolean var300 = var1.Uq0;

                     if (var300) {
                        int var73 = var1.Xs;
                        int var302 = var1.Bj;
                        var1.Fa(var163.J, var73, var302);
                     }

                     if (var1.Vz0 == ac0_2.D4 && var1.FX() < var163.J) {
                        var1.k50(false);
                     }

                     int var74 = var163.J;
                     if (var12 < var120 && Character.isWhitespace(var60.charAt(var12))) {
                        var74 += ((zb0_2)var9).getSpaceWidth();
                     }

                     int var10005 = var1.AQ;
                     var1.AQ += var74;
                     var163.rs0 = var10005;
                     var163.kj0 = (short)var1.W8;
                     var163.eC0 = var1.fD;
                     var163.US = var110;
                     var1.LPT4.add(var163);
                  }

                  var72 = var12;

                  while (var72 < var120 && Character.isWhitespace(var60.charAt(var72))) {
                     var72++;
                  }
               }

               if (!var1.bC0() && var124) {
                  int var38 = var1.AQ;
                  var1.AQ = ((zb0_2)var9).getSpaceWidth() + var38;
               }
            }

            var1.Op0 = var100;
         }
      } else if (var2 instanceof pa0_1) {
         var1.k50(true);
      } else {
         if (var1.Op0) {
            var1.k50(false);
            var1.Op0 = false;
         }

         if (var2 instanceof QR) {
            QR var270 = (QR)var2;
            QR var40;
            D90 var61 = (var40 = (QR)var2).Ph;
            Y30 var77 = this.AE(var61);
            this.J70(var1, var61);
            jw_0 var41 = var1.HH(var40);
            var1.Tr(var61, var77, true);

             for (Object var101 : var270) {
                this.py0(var1, (ay_0)var101);
            }

            if (var1.Vz0 == ac0_2.D4) {
               var1.Vz0 = ac0_2.LpT3;
            }

            var1.k50(false);
            var1.JD0 = false;
            var41.Nm0 = var1.tI - var41.D10;
            this.qi0(var1, var61);
         } else if (var2 instanceof O80) {
            O80 var42;
            wl0_2 var62;
            if ((var62 = this.rq((var42 = (O80)var2).t00)) != null) {
               V30 var79;
               V30 var271 = var79 = new V30(var42, var62);

               var271.eC0 = var1.fD;
               this.p90(var1, var42, var79);
            }
         } else if (var2 instanceof oe0_1) {
            oe0_1 var43 = (oe0_1)var2;
            le0_2 var63;
            if ((var63 = (le0_2)this.xt0.get(var43.cc)) == null) {
               if (this.J3.get(var43.cc) != null) {
                  throw new ClassCastException();
               }

               if (var63 == null) {
                  return;
               }
            }

            if (var63.K20 != null) {
               Logger.getLogger(LoginServerSelectComponent.class.getName()).log(Level.SEVERE, "Widget already added: {0}", var63);
            } else {
               super.F9(this.fU(), var63);
               var63.lt0();
               zh0_0 var80;
               zh0_0 var272 = var80 = new zh0_0(var43, var63);

               var80.J = var63.Mx;
               var272.Nm0 = var63.OB;
               this.p90(var1, var43, var80);
            }
         } else if (var2 instanceof vp_2) {
            vp_2 var44;
            D90 var64;
            D90 var273 = var64 = (var44 = (vp_2)var2).Ph;
            this.J70(var1, var64);
            I0 var81 = I0.LIST_STYLE_IMAGE;
            String var82;
            wl0_2 var83;
            if ((var82 = (String)var273.x90(I0.LIST_STYLE_IMAGE).Kj0(var81)) != null) {
               var83 = this.rq(var82);
            } else {
               var83 = null;
            }

            if (var83 != null) {
               V30 var102;
               V30 var303 = var102 = new V30(var44, var83);

               var81 = I0.PADDING_LEFT;
               int var111 = var1.Up0;
               var303.ce = (short)Math.max(0, this.qw0(var64, var81, var111, 0));
               O10 var86 = O10.E9;
               YA0 var112 = YA0.ou0;
               in(var1, var44, var102, var86, var112);
               int var46 = var303.Nm0;
               var303.Nm0 = 32767;

             for (Object var113 : var44) {
                this.py0(var1, (ay_0)var113);
               }

               var102.Nm0 = var46;
               var1.GG0.remove(var102);
               int var47;
               int var275 = var47 = var102.dt();
               var1.k50(false);
               if (var275 > var1.tI) {
                  var1.tI = var47;
                  ArrayList var48 = var1.GG0;
                  int var88 = var1.GG0.size();

                  label600:
                  while (true) {
                     int var276 = var88;
                     var88 += -1;
                     if (var276 <= 0) {
                        ArrayList var49 = var1.dL0;
                        int var89 = var1.dL0.size();

                        while (true) {
                           int var277 = var89;
                           var89 += -1;
                           if (var277 <= 0) {
                              var1.cn();
                              break label600;
                           }

                           if (((jw_0)var49.get(var89)).dt() <= var1.tI) {
                              var49.remove(var89);
                           }
                        }
                     }

                     if (((jw_0)var48.get(var88)).dt() <= var1.tI) {
                        var48.remove(var88);
                     }
                  }
               }

               var1.cn();
            } else {
             for (Object var84 : var44) {
                this.py0(var1, (ay_0)var84);
               }

               var1.k50(false);
            }

            this.qi0(var1, var64);
         } else if (var2 instanceof s0_0) {
            s0_0 var50;
            D90 var65 = (var50 = (s0_0)var2).Ph;
            Y30 var90;
            zv0_0 var91;
            if ((var90 = this.AE(var65)) == null) {
               var91 = null;
            } else {
                I0 var92 = I0.COLOR;
                gn_0 var93 = (gn_0)var65.x90(I0.COLOR).Kj0(var92);
                I0 var114 = I0.COLOR_HOVER;
                zv0_0 var103 = new zv0_0(var90, var93, (gn_0)var65.x90(I0.COLOR_HOVER).Kj0(var114));

               var91 = var103;
            }

            if (var91 != null) {
               this.J70(var1, var65);
               jw_0 var104 = var1.HH(var50);
               int var115 = Math.max(1, var50.fv0);
               int var122;
               int var279 = var122 = var50.lt0.size();
               I0 var126 = I0.LIST_STYLE_TYPE;
               sw0 var127 = (sw0)var65.x90(I0.LIST_STYLE_TYPE).Kj0(var126);
               String[] var141 = new String[var279];
               I0 var153 = I0.PADDING_LEFT;
               int var167 = var1.Up0;
               int var154 = Math.max(0, this.qw0(var65, var153, var167, 0));

               for (int var168 = 0; var168 < var122; var168++) {
                  String var155;
                  var141[var168] = var155 = var127.MB(var115 + var168).concat(". ");
                  var154 = Math.max(var154, ((zb0_2)var91.GS).computeTextWidth(var155));
               }

               for (int var116 = 0; var116 < var122; var116++) {
                  String var128 = var141[var116];
                  ay_0 var169;
                  D90 var175 = (var169 = (ay_0)var50.lt0.get(var116)).Ph;
                  this.J70(var1, var175);
                  int var14 = var128.length();
                  boolean var15 = var1.Uq0;
                  J6 var184 = new J6(var50, var91, var128, 0, var14, var15);

                  int var129 = var184.J;
                  int var287 = var184.Nm0;
                  I0 var191 = I0.PADDING_LEFT;
                  int var16 = var1.Up0;
                  var184.J = Math.max(0, this.qw0(var175, var191, var16, 0)) + var129;
                  O10 var192 = O10.E9;
                  YA0 var195 = YA0.ou0;
                  in(var1, var50, var184, var192, var195);
                  int var288 = var184.rs0;
                  var184.rs0 = Math.max(0, var154 - var129) + var288;
                  var184.Nm0 = 32767;
                  this.py0(var1, var169);
                  var184.Nm0 = var287;
                  var1.GG0.remove(var184);
                  int var130;
                  var279 = var130 = var184.dt();
                  var1.k50(false);
                  if (var279 > var1.tI) {
                     var1.tI = var130;
                     ArrayList var131 = var1.GG0;
                     var167 = var1.GG0.size();

                     label574:
                     while (true) {
                        var279 = var167;
                        var167 += -1;
                        if (var279 <= 0) {
                           ArrayList var132 = var1.dL0;
                           var167 = var1.dL0.size();

                           while (true) {
                              var279 = var167;
                              var167 += -1;
                              if (var279 <= 0) {
                                 var1.cn();
                                 break label574;
                              }

                              if (((jw_0)var132.get(var167)).dt() <= var1.tI) {
                                 var132.remove(var167);
                              }
                           }
                        }

                        if (((jw_0)var131.get(var167)).dt() <= var1.tI) {
                           var131.remove(var167);
                        }
                     }
                  }

                  var1.cn();
                  this.qi0(var1, var175);
               }

               var104.Nm0 = var1.tI - var104.D10;
               this.qi0(var1, var65);
            }
         } else if (var2 instanceof rz_1) {
            rz_1 var51 = (rz_1)var2;
            this.mE0(var1, var51);
         } else if (var2 instanceof xi_0) {
            xi_0 var52;
            int var66;
            int var285 = var66 = (var52 = (xi_0)var2).SE0;
            int var94 = var52.We0;
            int var105 = var52.Y3;
            int var117 = var52.Yv;
            D90 var123 = var52.Ph;
            if (var285 != 0 && var94 != 0) {
               this.J70(var1, var123);
               jw_0 var133 = var1.HH(var52);
               I0 var142 = I0.MARGIN_LEFT;
               int var156 = var1.Up0;
               int var143 = var1.JO(Math.max(0, this.qw0(var123, var142, var156, 0)));
               I0 var157 = I0.MARGIN_RIGHT;
               int var172 = var1.Up0;
               var285 = var156 = Math.max(0, var1.lx0(Math.max(0, this.qw0(var123, var157, var172, 0))) - var143);
               I0 var173 = I0.WIDTH;
               int var176 = var1.Up0;
                boolean var177;
                if ((var172 = Math.min(var285, this.qw0(var123, var173, var176, Integer.MIN_VALUE))) == Integer.MIN_VALUE) {
                   var177 = true;
                } else {
                   var177 = false;
               }

               if (var172 <= 0) {
                  var172 = var156;
               }

               int[] var185 = new int[var66];
               int var187;
               int[] var194;
               int[] var311 = var194 = new int[var187 = var66 + 1];
               boolean[] var196 = new boolean[var66];
               int var17 = 0;
               I0 var18 = I0.PADDING_LEFT;
               int var19 = var1.Up0;
               var311[var17] = Math.max(var105, Math.max(0, this.qw0(var123, var18, var19, 0)));
               var17 = var52.SE0;
               int var208 = var52.We0;
               var19 = var52.Y3;
               int var20 = var52.Yv;
               HashMap var21 = null;
               int var22 = 0;

               while (var22 < var17) {
                  int var23 = 0;
                  int var24 = 0;
                  int var25 = 0;
                  boolean var26 = false;

                  for (int var27 = 0; var27 < var208; var27++) {
                     L30 var28;
                     if ((var28 = var52.FE(var27, var22)) != null) {
                        D90 var29 = var28.Ph;
                        int var30 = var28.E;
                        I0 var31 = I0.WIDTH;
                        int var259;
                        if ((var259 = this.qw0(var29, var31, var172, Integer.MIN_VALUE)) != Integer.MIN_VALUE || var30 <= 1 && var26) {
                           if (var30 == 1 && var259 >= 0) {
                              var26 = true;
                           }
                        } else {
                           var31 = I0.PADDING_LEFT;
                           int var261 = Math.max(var20, Math.max(0, this.qw0(var29, var31, var172, 0)));
                           I0 var32 = I0.PADDING_RIGHT;
                           int var262 = Math.max(var20, Math.max(0, this.qw0(var29, var32, var172, 0)));
                           gf0_1 var33;
                           gf0_1 var305 = var33 = new gf0_1(null);

                           var305.J = var172;
                           MP var306 = this.DJ0(var33, var172, var261, var262, var28, null, false);
                           var306.gY();
                           var259 = var172 - var306.pe0;
                        }

                        if (var30 > 1) {
                           if (var21 == null) {
                              var21 = new HashMap();
                           }

                           Integer var257;
                           Integer var258;
                           if ((var258 = (Integer)var21.get(var257 = (var22 << 16) + var30)) == null || var259 > var258) {
                              var21.put(var257, var259);
                           }
                        } else {
                           var23 = Math.max(var23, var259);
                           I0 var249 = I0.MARGIN_LEFT;
                           int var253 = Math.max(var24, this.qw0(var29, var249, var172, 0));
                           var24 = Math.max(var25, this.qw0(var29, var249, var172, 0));
                           var25 = var24;
                           var24 = var253;
                        }
                     }
                  }

                  var196[var22] = var26;
                  var185[var22] = var23;
                  var194[var22] = Math.max(var194[var22], var24);
                  var194[++var22] = Math.max(var19, var25);
               }

               if (var21 != null) {
                  for (Object var289Object : var21.entrySet()) {
                     Entry var289 = (Entry)var289Object;
                     int var308 = (Integer)var289.getKey();
                     int var209 = var308 >>> 16;
                     var19 = var308 & 65535;
                     var20 = (Integer)var289.getValue();
                     int var237 = 0;
                     var22 = var19;

                     while (var237 < var19) {
                        int var244;
                        if (var196[var244 = var209 + var237]) {
                           var20 -= var185[var244];
                           var22--;
                        }

                        var237++;
                     }

                     if (var20 > 0) {
                        for (int var238 = 0; var238 < var19 && var22 > 0; var238++) {
                           int var245;
                           if (!var196[var245 = var209 + var238]) {
                              var20 /= var22;
                              var185[var245] = Math.max(var185[var245], var20);
                              var20 -= var20;
                              var22--;
                           }
                        }
                     }
                  }
               }

               int var10002 = var194[var66];
               I0 var201 = I0.PADDING_RIGHT;
               int var210 = var1.Up0;
               var194[var66] = Math.max(var10002, Math.max(0, this.qw0(var123, var201, var210, 0)));
               var17 = 0;

               for (int var211 = 0; var211 < var187; var211++) {
                  var17 += var194[var211];
               }

               var187 = 0;

               for (int var212 = 0; var212 < var66; var212++) {
                  var187 += var185[var212];
               }

               if (var177) {
                  var172 = Math.min(var156, var187 + var17);
               }

               if ((var156 = Math.max(0, var172 - var17)) != var187 && var187 > 0) {
                   int var180 = 0;
                  var19 = var66;
                  int var213 = var187;
                  var17 = var156;

                   while (var180 < var66) {
                      if (var196[var180]) {
                        int var204;
                        int var214 = var17 - (var204 = var185[var180]);
                        var17 = var213 - var204;
                        var19--;
                        var213 = var17;
                        var17 = var214;
                     }

                      var180++;
                  }

                  boolean var179 = false;
                  if (var156 < 0) {
                     var179 = true;
                     var19 = var66;
                  } else {
                     var187 = var213;
                     var156 = var17;
                  }

                  for (int var206 = 0; var206 < var66 && var19 > 0; var206++) {
                     if (var179 || !var196[var206]) {
                        int var215 = var185[var206];
                        if (var187 > 0) {
                           var20 = var215 * var156 / var187;
                        } else {
                           var20 = 0;
                        }

                        var185[var206] = var20;
                        var156 -= var20;
                        var187 -= var215;
                     }
                  }
               }

               V30 var160 = this.Sv0(var1, var52);
               var1.Vz0 = ac0_2.LpT3;
                int var182 = var1.tI;
               I0 var189 = I0.PADDING_TOP;
               int var197 = var1.Up0;
                var1.tI = Math.max(var105, Math.max(0, this.qw0(var123, var189, var197, 0))) + var182;
               V30[] var181 = new V30[var66];

               for (int var190 = 0; var190 < var94; var190++) {
                  if (var190 > 0) {
                     var1.tI += var105;
                  }

                  V30 var198 = null;
                  D90 var207;
                  if ((var207 = var52.Bs[var190]) != null) {
                     var18 = I0.MARGIN_TOP;
                     int var217 = Math.max(0, this.qw0(var207, var18, var172, 0));
                     var1.tI = Math.max(var1.u90, var1.tI + var217);
                     var18 = I0.BACKGROUND_IMAGE;
                     String var219;
                     wl0_2 var220;
                     if ((var219 = (String)var207.x90(I0.BACKGROUND_IMAGE).Kj0(var18)) != null) {
                        var220 = this.rq(var219);
                     } else {
                        var220 = null;
                     }

                     if (var220 != null) {
                        V30 var293 = var198 = new V30(var52, var220);

                        var198.D10 = var1.tI;
                        var198.rs0 = var143;
                        var293.J = var172;
                        var1.Cw.Q5.add(var198);
                     }

                     var285 = var1.tI;
                     var18 = I0.PADDING_TOP;
                     var1.tI = Math.max(0, this.qw0(var207, var18, var172, 0)) + var285;
                     var18 = I0.HEIGHT;
                     var1.Km = Math.max(0, this.qw0(var207, var18, var172, 0));
                  }

                  int var223 = 0;
                  var19 = var143;

                  while (var223 < var66) {
                     var19 += var194[var223];
                     L30 var236;
                     L30 var295 = var236 = var52.FE(var190, var223);
                     int var239 = var185[var223];
                     if (var295 != null) {
                        for (int var241 = 1; var241 < var236.E; var241++) {
                           int var246;
                           var239 += var194[var246 = var223 + var241] + var185[var246];
                        }

                        D90 var242 = var236.Ph;
                        I0 var247 = I0.PADDING_LEFT;
                        int var248 = Math.max(var117, Math.max(0, this.qw0(var242, var247, var172, 0)));
                        I0 var251 = I0.PADDING_RIGHT;
                        int var252 = Math.max(var117, Math.max(0, this.qw0(var242, var251, var172, 0)));
                        gf0_1 var254;
                        var254 = new gf0_1(var236);
                        V30 var255;
                        if ((var255 = this.Sv0(var1, var236)) != null) {
                           var255.rs0 = var19;
                           var255.J = var239;
                           var255.hR = var254;
                           var181[var223] = var255;
                        }

                        var254.rs0 = var19;
                        var254.D10 = var1.tI;
                        var254.J = var239;
                        I0 var256 = I0.MARGIN_TOP;
                        var254.kj0 = (short)Math.max(0, this.qw0(var242, var256, var172, 0));
                        var1.LPT4.add(var254);
                        boolean var243 = var1.Uq0;
                        this.DJ0(var254, var172, var248, var252, var236, null, var243);
                        var223 += Math.max(0, var236.E - 1);
                     }

                     var19 += var239;
                     var223++;
                  }

                  var1.k50(false);

                  for (int var224 = 0; var224 < var66; var224++) {
                     V30 var232;
                     if ((var232 = var181[var224]) != null) {
                        var232.Nm0 = var1.tI - var232.D10;
                        var181[var224] = null;
                     }
                  }

                  if (var207 != null) {
                     int var309 = var1.tI;
                     var18 = I0.PADDING_BOTTOM;
                     int var226 = Math.max(0, this.qw0(var207, var18, var172, 0)) + var309;
                     var1.tI = var226;
                     if (var198 != null) {
                        var198.Nm0 = var226 - var198.D10;
                     }

                     this.qi0(var1, var207);
                  }
               }

               int var53 = var1.tI;
               var3 = I0.PADDING_BOTTOM;
               var94 = var1.Up0;
               var1.tI = Math.max(var105, Math.max(0, this.qw0(var123, var3, var94, 0))) + var53;
               ArrayList var54 = var1.GG0;
               int var68 = var1.GG0.size();

               while (true) {
                  var285 = var68;
                  var68 += -1;
                  if (var285 <= 0) {
                     ArrayList var55 = var1.dL0;
                     int var69 = var1.dL0.size();

                     while (true) {
                        var285 = var69;
                        var69 += -1;
                        if (var285 <= 0) {
                           var1.cn();
                           var1.pe0 = Math.min(var1.pe0, Math.max(0, var1.dB0 - var172));
                           if (var160 != null) {
                              var160.Nm0 = var1.tI - var160.D10;
                              var160.rs0 = var143;
                              var160.J = var172;
                           }

                           var133.rs0 = var143;
                           var133.J = var172;
                           var133.Nm0 = var1.tI - var133.D10;
                           this.qi0(var1, var123);
                           return;
                        }

                        if (((jw_0)var55.get(var69)).dt() <= var1.tI) {
                           var55.remove(var69);
                        }
                     }
                  }

                  if (((jw_0)var54.get(var68)).dt() <= var1.tI) {
                     var54.remove(var68);
                  }
               }
            }
         } else if (var2 instanceof rv0_0) {
            rv0_0 var298 = (rv0_0)var2;
            rv0_0 var56;
            rv0_0 var310 = var56 = (rv0_0)var2;
            String var70 = var1.fD;
            var1.fD = var310.n3;
            I0 var96 = I0.DISPLAY;
            if ((YA0)var298.Ph.x90(I0.DISPLAY).Kj0(var96) == YA0.ou0) {
               this.mE0(var1, var56);
            } else {
               D90 var97 = var56.Ph;
               this.J70(var1, var97);
               var1.HH(var56);

               for (Object var106 : var56) {
                  this.py0(var1, (ay_0)var106);
               }

               this.qi0(var1, var97);
            }

            var1.fD = var70;
         } else if (var2 instanceof gb0_0) {
            gb0_0 var300 = (gb0_0)var2;
            gb0_0 var58;
            D90 var71 = (var58 = (gb0_0)var2).Ph;
            this.J70(var1, var71);
            var1.HH(var58);

            for (Object var98 : var300) {
               this.py0(var1, (ay_0)var98);
            }

            this.qi0(var1, var71);
         } else {
            Logger.getLogger(LoginServerSelectComponent.class.getName()).log(Level.SEVERE, "Unknown Element subclass: {0}", var2.getClass());
         }
      }
   }

   public final void p90(MP var1, ay_0 var2, jw_0 var3) {
      D90 var4;
      D90 var10016 = var4 = var2.Ph;
      I0 var5 = I0.FLOAT_POSITION;
      O10 var13 = (O10)var2.Ph.x90(I0.FLOAT_POSITION).Kj0(var5);
      I0 var6 = I0.DISPLAY;
      YA0 var14 = (YA0)var10016.x90(I0.DISPLAY).Kj0(var6);
      I0 var7 = I0.MARGIN_TOP;
      int var8 = var1.Up0;
      var3.kj0 = (short)Math.max(0, this.qw0(var4, var7, var8, 0));
      var7 = I0.MARGIN_LEFT;
      var8 = var1.Up0;
      var3.EQ = (short)Math.max(0, this.qw0(var4, var7, var8, 0));
      var7 = I0.MARGIN_RIGHT;
      var8 = var1.Up0;
      var3.ce = (short)Math.max(0, this.qw0(var4, var7, var8, 0));
      var7 = I0.MARGIN_BOTTOM;
      var8 = var1.Up0;
      var3.oF = (short)Math.max(0, this.qw0(var4, var7, var8, 0));
      int var18 = var3.Nm0;
      I0 var22 = I0.WIDTH;
      int var9 = var1.Up0;
      int var10 = var3.J;
      if ((var8 = this.qw0(var4, var22, var9, var10)) > 0) {
         var9 = var3.J;
         if (var3.J > 0) {
            var18 = var8 * var3.Nm0 / var9;
         }

         var3.J = var8;
      }

      I0 var11 = I0.HEIGHT;
      var8 = var3.Nm0;
      int var12;
      if ((var12 = this.qw0(var4, var11, var8, var18)) > 0) {
         var3.Nm0 = var12;
      }

      in(var1, var2, var3, var13, var14);
   }

   public final void J70(MP var1, D90 var2) {
      I0 var3 = I0.MARGIN_TOP;
      int var4 = Math.max(0, this.qw0(var2, var3, var1.Up0, 0));
      var1.k50(false);
      int var5;
      int var10000 = var5 = Math.max(var1.u90, var1.tI + var4);
      var1.k50(false);
      if (var10000 > var1.tI) {
         var1.tI = var5;
         ArrayList var6 = var1.GG0;
         int var8 = var1.GG0.size();

         while (true) {
            var10000 = var8;
            var8 += -1;
            if (var10000 <= 0) {
               ArrayList var7 = var1.dL0;
               int var9 = var1.dL0.size();

               while (true) {
                  var10000 = var9;
                  var9 += -1;
                  if (var10000 <= 0) {
                     var1.cn();
                     return;
                  }

                  if (((jw_0)var7.get(var9)).dt() <= var1.tI) {
                     var7.remove(var9);
                  }
               }
            }

            if (((jw_0)var6.get(var8)).dt() <= var1.tI) {
               var6.remove(var8);
            }
         }
      }
   }

   public final void qi0(MP var1, D90 var2) {
      I0 var3 = I0.MARGIN_BOTTOM;
      int var4 = Math.max(0, this.qw0(var2, var3, var1.Up0, 0));
      if (var1.bC0()) {
         var1.u90 = Math.max(var1.u90, var1.tI + var4);
      } else {
         var1.j2 = Math.max(var1.j2, var4);
      }
   }

   public final MP DJ0(gf0_1 var1, int var2, int var3, int var4, gb0_0 var5, String var6, boolean var7) {
      D90 var19 = var5.Ph;
      int var8 = Math.max(0, this.qw0(var19, I0.PADDING_TOP, var2, 0));
      int var9 = Math.max(0, this.qw0(var19, I0.PADDING_BOTTOM, var2, 0));
      var2 = Math.max(0, this.qw0(var19, I0.MARGIN_BOTTOM, var2, 0));
      MP var10;
      MP var10001 = var10 = new MP((f.ge_0)(Object)this, var1, var3, var4, var8, (boolean)var7);

      var10001.fD = var6;
      var10001.Sj = var19;
      Iterator var13 = var5.iterator();

      while (var13.hasNext()) {
         this.py0(var10, (ay_0)var13.next());
      }

      var10.gY();
      int var11;
      if ((var11 = Math.max(var3 = var10.tI + var9, this.qw0(var19, I0.HEIGHT, var3, var3))) > var3) {
         label50: {
            var4 = 0;
            I0 var20 = I0.VERTICAL_ALIGNMENT;
            int var21;
            if ((var21 = ((qi_2)var19.x90(I0.VERTICAL_ALIGNMENT).Kj0(var20)).ordinal()) != 1) {
               if (var21 == 2) {
                  var4 = var11 - var3;
                  break label50;
               }

               if (var21 != 3) {
                  break label50;
               }
            }

            var4 = (var11 - var3) / 2;
         }

         if (var4 > 0) {
            var3 = 0;

            for (int var22 = var1.zj0.size(); var3 < var22; var3++) {
               ((jw_0)var1.zj0.get(var3)).D10 += var4;
            }

            char[] var16 = var1.Nw;
            if (var1.Nw.length > 0) {
               if (var16[1] == 0) {
                  var16[0] = (char)(var16[0] + var4);
               } else {
                  char[] var23;
                  (var23 = new char[(var3 = var16.length) + 2])[0] = (char)var4;
                  int var24 = 0;

                  while (var24 < var3) {
                     char[] var26 = var1.Nw;
                     if ((var8 = var1.Nw[var24]) > 0) {
                        var8 += var4;
                     }

                     int var27 = var24 + 2;
                     var23[var27] = (char)var8;
                     int var25 = var24 + 3;
                     var23[var25] = var26[var24 + 1];
                     var24 = var27;
                  }

                  var1.Nw = var23;
               }
            }
         }
      }

      var1.Nm0 = var11;
      var1.oF = (short)Math.max(var2, var10.u90 - var10.tI);
      return var10;
   }

   public final void mE0(MP var1, gb0_0 var2) {
      var1.k50(false);
      D90 var3 = var2.Ph;
      I0 var4 = I0.FLOAT_POSITION;
      O10 var21;
      O10 var10000 = var21 = (O10)var2.Ph.x90(I0.FLOAT_POSITION).Kj0(var4);
      V30 var5 = this.Sv0(var1, var2);
      int var6 = Math.max(0, this.qw0(var3, I0.MARGIN_TOP, var1.Up0, 0));
      int var7 = Math.max(0, this.qw0(var3, I0.MARGIN_LEFT, var1.Up0, 0));
      int var8 = Math.max(0, this.qw0(var3, I0.MARGIN_RIGHT, var1.Up0, 0));
      int var9 = var1.JO(var7);
      var6 = Math.max(var1.u90, var1.tI + var6);
      int var10 = Math.max(0, var1.lx0(var8) - var9);
      int var11 = Math.max(0, this.qw0(var3, I0.PADDING_LEFT, var1.Up0, 0));
      int var12 = Math.max(0, this.qw0(var3, I0.PADDING_RIGHT, var1.Up0, 0));
      O10 var13 = O10.Jx0;
      int var17;
      if (var10000 == O10.Jx0) {
         var17 = this.qw0(var3, I0.WIDTH, var10, var10);
      } else {
         int var14 = var1.Up0;
         if ((var17 = this.qw0(var3, I0.WIDTH, var14, Integer.MIN_VALUE)) == Integer.MIN_VALUE) {
            gf0_1 var18;
            gf0_1 var10001 = var18 = new gf0_1(null);

            var10001.J = Math.max(0, var1.dB0 - var11 - var12);
            MP var33 = this.DJ0(var10001, var1.Up0, var11, var12, var2, null, false);
            var33.k50(false);
            var17 = Math.max(0, var18.J - var33.pe0);
         }
      }

      int var19 = Math.max(0, var17) + var11 + var12;
      if (var21 != var13) {
         var1.Fa(var19, var7, var8);
         var9 = var1.JO(var7);
         var6 = Math.max(var6, var1.tI);
         var10 = Math.max(0, var1.lx0(var8) - var9);
      }

      int var20 = Math.min(var19, var10);
      O10 var31 = O10.E30;
      if (var21 == O10.E30) {
         var9 = var1.lx0(var8) - var20;
      }

      gf0_1 var15;
      gf0_1 var10003 = var15 = new gf0_1(var2);

      var15.rs0 = var9;
      var15.D10 = var6;
      var15.J = var20;
      var15.EQ = (short)var7;
      var10003.ce = (short)var8;
      var10003.eC0 = var1.fD;
      var1.LPT4.add(var15);
      var7 = var1.Up0;
      String var30 = var1.fD;
      boolean var32 = var1.Uq0;
      MP var16 = this.DJ0(var10003, var7, var11, var12, var2, var30, var32);
      var1.N90 = var1.LPT4.size();
      if (var21 == var13) {
         int var22;
         int var34 = var22 = var6 + var15.Nm0;
         var1.k50(false);
         if (var34 > var1.tI) {
            var1.tI = var22;
            ArrayList var23 = var1.GG0;
            var7 = var1.GG0.size();

            label57:
            while (true) {
               int var35 = var7;
               var7 += -1;
               if (var35 <= 0) {
                  ArrayList var24 = var1.dL0;
                  var7 = var1.dL0.size();

                  while (true) {
                     int var36 = var7;
                     var7 += -1;
                     if (var36 <= 0) {
                        var1.cn();
                        break label57;
                     }

                     if (((jw_0)var24.get(var7)).dt() <= var1.tI) {
                        var24.remove(var7);
                     }
                  }
               }

               if (((jw_0)var23.get(var7)).dt() <= var1.tI) {
                  var23.remove(var7);
               }
            }
         }

         short var25 = var15.oF;
         if (var1.bC0()) {
            var1.u90 = Math.max(var1.u90, var1.tI + var25);
         } else {
            var1.j2 = Math.max(var1.j2, var25);
         }

         var1.pe0 = Math.min(var1.pe0, var16.pe0);
      } else {
         if (var21 == var31) {
            var1.dL0.add(var15);
         } else {
            var1.GG0.add(var15);
         }

         var1.cn();
      }

      if (var5 != null) {
         var5.rs0 = var9;
         var5.D10 = var6;
         var5.J = var20;
         var5.Nm0 = var15.Nm0;
         var5.hR = var15;
      }
   }

   public final V30 Sv0(MP var1, ay_0 var2) {
      D90 var3 = var2.Ph;
      I0 var4 = I0.BACKGROUND_IMAGE;
      String var12;
      wl0_2 var13;
      if ((var12 = (String)var2.Ph.x90(I0.BACKGROUND_IMAGE).Kj0(var4)) != null) {
         var13 = this.rq(var12);
      } else {
         var13 = null;
      }

      if (var13 == null) {
         var4 = I0.BACKGROUND_COLOR;
         wl0_2 var8;
         gn_0 var15;
         if (((var15 = (gn_0)var3.x90(I0.BACKGROUND_COLOR).Kj0(var4)).FY & 255) != 0 && (var8 = this.rq("white")) != null) {
            wl0_2 var11 = var8.so(var15);
            var4 = I0.BACKGROUND_COLOR_HOVER;
            gn_0 var17;
            if ((var17 = (gn_0)var3.x90(I0.BACKGROUND_COLOR_HOVER).Kj0(var4)) != null) {
                ww_2 var6 = Bu;
                wl0_2[] var7 = new wl0_2[2];
                wl0_2[] var10001 = var7;
                var10001[0] = var8.so(var17);
                var10001[1] = var11;
                lb0_0 var5 = new lb0_0(var6, null, var7);

               var13 = var5;
            } else {
               var13 = var11;
            }
         } else {
            Object var9 = null;
            var13 = (wl0_2)var9;
         }
      }

      if (var13 != null) {
         V30 var10;
         V30 var19 = var10 = new V30(var2, var13);

         var10.D10 = var1.tI;
         var1.Cw.Q5.add(var10);
         return var19;
      } else {
         return null;
      }
   }

   @Override
   public final String Ck() {
      return "textarea";
   }

   public final void LX(sz_0 var1) {
      sz_0 var2 = this.kl;
      if (this.kl != null) {
         X3 var4 = this.G30;
         ((xp_1)var2).RD0 = (Runnable[])a7_0.tp0(var4, ((xp_1)var2).RD0);
      }

      this.kl = var1;
      if (var1 != null) {
         X3 var3 = this.G30;
         ((xp_1)var1).Kj(var3);
      }

      this.vA = true;
      this.RP = null;
      this.COm3();
   }

   public final void hp(mb_0 var1) {
      this.m4 = (mb_0[])a7_0.gE(this.m4, var1, mb_0.class);
   }

   @Override
   public final void Ib(Jn0 var1) {
      super.Ib(var1);
      LC0 var2;
      LC0 var10004 = var2 = (LC0)var1;
      this.CT = var2.C60("fonts");
      this.cF0 = var2.C60("images");
      this.XI = var2.D8("font");
      this.ob0 = var2.oX("mouseCursor");
      this.XL = var10004.oX("mouseCursor.link");
      this.vA = true;
      this.RP = null;
      this.COm3();
   }

   @Override
   public final void C(zk0_1 var1) {
      this.tP.Ha0.W20(var1);
      this.tP.jb.W20(var1);
   }

   @Override
   public final void em() {
      throw new UnsupportedOperationException("use registerWidget");
   }

   @Override
   public final le0_2 fC0(int var1) {
      throw new UnsupportedOperationException("use registerWidget");
   }

   @Override
   public final int pi0() {
      if (this.RP == null) {
         this.kU();
      }

      int var1 = this.RP.Com9;
      return this.RP.Com9 >= 0 ? var1 : this.a3();
   }

   @Override
   public final int zs0() {
      if (this.a3() == 0) {
         if (this.RP == null) {
            this.kU();
         }

         int var1 = this.RP.Eg0;
         if (this.RP.Eg0 >= 0) {
            return var1;
         }
      }

      this.Iu();
      return this.VF0.Nm0;
   }

   @Override
   public final int m0() {
      short var1 = super.Ya0;
      return le0_2.du0(this.R1(), super.m0(), var1);
   }

   @Override
   public final void g2(int var1, int var2) {
      if (var1 != super.Ya0) {
         this.RP = null;
         this.COm3();
      }

      super.g2(var1, var2);
   }

   @Override
   public final void RY(int var1, int var2) {
      if (var1 != this.R1()) {
         this.RP = null;
         this.COm3();
      }

      super.RY(var1, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void K8() {
      int var1 = this.a3();
      gf0_1 var2 = this.VF0;
      if (this.VF0.J != var1 || this.vA) {
         var2.J = var1;
         this.GE0 = true;
         this.vA = false;
         zk0_1 var136 = super.Em0;
         if (super.Em0 != null) {
            var136.AK.getClass();
         }

         MP var10000;
         try {
            this.VF0.final$();
            this.ll0.clear();
            super.em();
            var10000 = new MP((f.ge_0)(Object)this, this.VF0, 0, 0, 0, true);
         } catch (Throwable var135) {
            this.GE0 = false;
            throw var135;
         }

          MP var137 = var10000;
          sz_0 var142;
          Iterator var143;
          boolean var144;
          ay_0 var145;
          gf0_1 var146;
          gf0_1 var147;
          int var148;

         try {

            var142 = this.kl;
         } catch (Throwable var134) {
            this.GE0 = false;
            throw var134;
         }

         sz_0 var139 = var142;
         if (var142 != null) {
            try {
               var143 = var139.iterator();
            } catch (Throwable var133) {
               this.GE0 = false;
               throw var133;
            }

            Iterator var140 = var143;

            while (true) {
               try {
                  var144 = var140.hasNext();
               } catch (Throwable var130) {
                  this.GE0 = false;
                  throw var130;
               }

               if (!var144) {
                  int var10001;
                   int var10002;
                  try {
                     var137.gY();
                     var146 = this.VF0;
                     var10001 = super.A20;
                     var10002 = super.e80;
                  } catch (Throwable var129) {
                     this.GE0 = false;
                     throw var129;
                  }

                  var10001 += var10002;

                   int var10003;
                  try {
                     var10002 = super.SB0;
                     var10003 = super.y9;
                  } catch (Throwable var128) {
                     this.GE0 = false;
                     throw var128;
                  }

                  var10002 += var10003;

                  try {
                     var146.UL(var10001, var10002);
                     var147 = this.VF0;
                  } catch (Throwable var127) {
                     this.GE0 = false;
                     throw var127;
                  }

                  byte var150 = 0;
                  byte var153 = 0;

                  try {
                     var147.Fk0(var150, var153, this.ll0);
                     break;
                  } catch (Throwable var126) {
                     this.GE0 = false;
                     throw var126;
                  }
               }

               try {
                  var145 = (ay_0)var140.next();
               } catch (Throwable var132) {
                  this.GE0 = false;
                  throw var132;
               }

               ay_0 var3 = var145;

               try {
                  this.py0(var137, var3);
               } catch (Throwable var131) {
                  this.GE0 = false;
                  throw var131;
               }
            }
         }

         try {
            this.Db0();
            var148 = var137.tI;
         } catch (Throwable var125) {
            this.GE0 = false;
            throw var125;
         }

         var1 = var148;
         this.GE0 = false;
         var2 = this.VF0;
         if (this.VF0.Nm0 != var1) {
            var2.Nm0 = var1;
            if (this.k5() != var1) {
               this.COm3();
            }
         }
      }
   }

   @Override
   public final void FW(zk0_1 var1) {
      ArrayList var2;
      ArrayList var10000 = var2 = this.ll0;
      Hq0 var3;
      Hq0 var10001 = var3 = this.tP;
      var3.ZB = super.A20 + super.e80;
      var3.B60 = super.SB0 + super.y9;
      var10001.eH0 = var1.AK;
      int var5 = 0;

      for (int var4 = var10000.size(); var5 < var4; var5++) {
         ((V30)var2.get(var5)).dr(var3);
      }

      this.VF0.dr(var3);
   }

   @Override
   public final void Ej0() {
      if (!this.GE0) {
         this.COm3();
      }
   }

   @Override
   public final void Pp0() {
   }

   @Override
   public final void t5() {
      super.t5();
      this.VF0.final$();
      this.ll0.clear();
      super.em();
      this.vA = true;
      this.RP = null;
      this.COm3();
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      if (super.nd0(var1)) {
         return true;
      }

      int var2 = var1.zu;
      if (E00.C10(var1.zu)) {
         if (this.v5) {
            if (var1.LI0()) {
               this.v5 = false;
               int var6 = var1.f8;
               this.Mx = this.yv0(var6, var1.AN);
               this.kj = var1.f8;
               this.Zp = var1.AN;
               this.Db0();
            }

            return true;
         } else {
            int var7 = var1.f8;
            this.Mx = this.yv0(var7, var1.AN);
            this.kj = var1.f8;
            this.Zp = var1.AN;
            this.Db0();
            if (var2 == 8) {
               return false;
            }

            byte var8 = 3;
            if (var2 == 6) {
               if (!pC && this.v5) {
                  throw new AssertionError();
               }

               this.v5 = true;
               return true;
            } else {
               if (this.HA != null && (var2 == 5 || var2 == var8 || var2 == 4)) {
                  mb_0[] var9 = this.m4;
                  if (this.m4 != null) {
                     for (mb_0 var10000 : var9) {
                        ;
                     }
                  }
               }

               if (var2 == 5) {
                  jw_0 var10 = this.HA;
                  mb_0[] var5;
                  String var11;
                  if (this.HA != null && (var11 = var10.eC0) != null && (var5 = this.m4) != null) {
                     var2 = var5.length;

                     for (int var13 = 0; var13 < var2; var13++) {
                        var5[var13].Sy0(var11);
                     }
                  }
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public final Object rd(int var1, int var2) {
      jw_0 var3 = this.HA;
      ay_0 var4;
      return this.HA != null && (var4 = var3.xE0) instanceof O80 ? ((O80)var4).UK : super.rd(var1, var2);
   }

   public final int qw0(D90 var1, I0 var2, int var3, int var4) {
      g20_0 var5;
      D90 var8;
      g20_0 var10000 = var5 = (g20_0)(var8 = var1.x90(var2)).Kj0(var2);
      Y30 var6 = null;
      if (fk0_1.Ni0(var10000.iG0)) {
         if (var2 == I0.FONT_SIZE && (var8 = var8.im0) == null) {
            return 14;
         }

         if ((var6 = this.AE(var8)) == null) {
            return 0;
         }
      }

      float var7 = var5.z00;
      switch (J90.Qj(var5.iG0)) {
         case 1:
            var7 *= 1.33F;
            break;
         case 2:
            var7 *= ((zb0_2)var6).getEM();
            break;
         case 3:
            var7 *= ((zb0_2)var6).getEX();
            break;
         case 4:
            var7 = var3 * 0.01F * var7;
            break;
         case 5:
            return var4;
      }

      if (var7 >= 32767.0F) {
         return 32767;
      } else {
         return var7 <= -32768.0F ? -32768 : Math.round(var7);
      }
   }

   public final void kU() {
      int var1 = -1;
      int var2 = -1;
      if (this.kl == null) {
         var1 = 0;
         var2 = 0;
      } else {
         int var3 = super.Ya0;
         if (super.Ya0 > 0) {
            int var4 = super.e80 + super.NV;
            var3 = Math.max(0, var3 - var4);
            if (Math.max(0, this.R1() - var4) < var3) {
               gf0_1 var6;
               var6 = new gf0_1(null);
               zk0_1 var7 = super.Em0;
               if (super.Em0 != null) {
                  var7.AK.getClass();
               }

               var6.J = var3;
               MP var8;
               MP var10000 = var8 = new MP((f.ge_0)(Object)this, var6, 0, 0, 0, false);

               this.rU(var8, this.kl);
               var10000.gY();
               var1 = Math.max(0, var3 - var8.pe0);
               var2 = var10000.tI;
            }
         }
      }

      L50 var5;
      var5 = new L50(var1, var2);
      this.RP = var5;
   }

   public final void Db0() {
      jw_0 var1 = null;
      if (this.Mx) {
         var1 = this.VF0.RL(this.kj - (super.A20 + super.e80), this.Zp - (super.SB0 + super.y9));
      }

      if (this.HA != var1) {
         this.HA = var1;
         this.VF0.dd(var1);
         MD0 var2 = Dp;
         this.tP.Ha0.Mk(Dp);
         this.tP.jb.Mk(var2);
         this.yB0();
      }

      LoginServerSelectComponent var10000;
      dc0_0 var10001;
      if (var1 != null && var1.eC0 != null) {
         var10000 = this;
         var10001 = this.XL;
      } else {
         var10000 = this;
         var10001 = this.ob0;
      }

      var10000.Zt = var10001;
      MD0 var3 = Dp;
      super.M.j70(var3, this.Mx);
   }

   public final Y30 AE(D90 var1) {
      I0 var3 = I0.FONT_FAMILIES;
      r50_0 var4;
      if ((var4 = (r50_0)var1.x90(I0.FONT_FAMILIES).Kj0(var3)) != null && this.CT != null) {
         do {
            QS var2 = this.CT;
            Y30 var5;
            if ((var5 = ((LC0)var2).D8(var4.Wo0)) != null) {
               return var5;
            }
         } while ((var4 = var4.g9) != null);
      }

      return this.XI;
   }

   public final wl0_2 rq(String var1) {
      wl0_2 var2;
      if ((var2 = (wl0_2)this.el0.get(var1)) != null) {
         return var2;
      } else {
         byte var4 = 0;
         if (this.j30.size() <= 0) {
            QS var3;
            return (var3 = this.cF0) != null ? ((LC0)var3).uT(var1) : null;
         } else {
            i80_0.Xj(this.j30.get(var4));
            throw null;
         }
      }
   }

   @Override
   public final void F9(int var1, le0_2 var2) {
      throw new UnsupportedOperationException("use registerWidget");
   }

   @Override
   public final void XK0() {
   }

   @Override
   public final void zf() {
   }

   public final void wR(dz_2 var1, String var2) {
      if (var2 != null) {
         if (var1.K20 == null) {
            if (this.xt0.containsKey(var2) || this.J3.containsKey(var2)) {
               throw new IllegalArgumentException("widget name already in registered");
            }

            if (!this.xt0.containsValue(var1)) {
               this.xt0.put(var2, var1);
            } else {
               throw new IllegalArgumentException("widget already registered");
            }
         } else {
            throw new IllegalArgumentException("Widget must not have a parent");
         }
      } else {
         throw new NullPointerException("name");
      }
   }
}
