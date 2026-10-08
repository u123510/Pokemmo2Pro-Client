package cn.pokemmo.battle.engine;

import f.*;

import java.util.ArrayList;

public class BattleDamageFormulaCalculator {
   public static final boolean Nf0 = !BattleDamageFormulaCalculator.class.desiredAssertionStatus();
   public final gf0_1 Cw;
   public final ArrayList LPT4;
   public final ArrayList GG0;
   public final ArrayList dL0;
   public final StringBuilder u80;
   public final int Vi;
   public final int Up0;
   public final int hh;
   public final int AZ;
   public final boolean Uq0;
   public int tI;
   public int AQ;
   public int N90;
   public int Sx0;
   public int W8;
   public int Xs;
   public int Bj;
   public int u90;
   public int j2;
   public int mY;
   public int dB0;
   public int jE;
   public int Km;
   public int Xq;
   public int kP;
   public int pe0;
   public boolean JD0;
   public boolean sw0;
   public boolean Op0;
   public ac0_2 Vz0;
   public String fD;
   public D90 Sj;
   public final ge_0 wb;

   public BattleDamageFormulaCalculator(ge_0 var1, gf0_1 var2, int var3, int var4, int var5, boolean var6) {
      this.wb = var1;
      this.GG0 = new ArrayList();
      this.dL0 = new ArrayList();
      this.u80 = new StringBuilder();
      this.Cw = var2;
      ArrayList var7 = var2.zj0;
      this.LPT4 = var2.zj0;
      this.Vi = var3;
      int var8;
      this.Up0 = var8 = Math.max(0, var2.J - var3 - var4);
      this.hh = var3;
      this.AZ = var4;
      this.Uq0 = var6;
      this.AQ = var3;
      this.tI = var5;
      this.mY = var3;
      this.dB0 = var8;
      this.pe0 = var8;
      this.Vz0 = ac0_2.LpT3;
      if (!Nf0 && !var7.isEmpty()) {
         throw new AssertionError();
      }
   }

   public final void cn() {
      int var1 = this.JO(this.Xs);
      int var10002 = this.lx0(this.Bj);
      this.mY = var1;
      this.dB0 = Math.max(0, var10002 - var1);
      if (this.bC0()) {
         this.AQ = this.mY;
      }

      int var2 = this.FX();
      this.pe0 = Math.min(this.pe0, var2);
   }

   public final int JO(int var1) {
      int var2 = this.Vi;
      var2 = Math.max(0, var1 - this.hh) + var2;
      int var3 = 0;

      for (int var4 = this.GG0.size(); var3 < var4; var3++) {
         jw_0 var6;
         jw_0 var10001 = var6 = (jw_0)this.GG0.get(var3);
         int var7 = var10001.rs0 + var6.J;
         var2 = Math.max(var2, Math.max(var10001.ce, var1) + var7);
      }

      return var2;
   }

   public final int lx0(int var1) {
      int var2 = this.Vi + this.Up0 - Math.max(0, var1 - this.AZ);
      int var3 = 0;

      for (int var4 = this.dL0.size(); var3 < var4; var3++) {
         jw_0 var5;
         var2 = Math.min(var2, (var5 = (jw_0)this.dL0.get(var3)).rs0 - Math.max(var5.EQ, var1));
      }

      return var2;
   }

   public final int FX() {
      return Math.max(0, this.dB0 - this.AQ + this.mY);
   }

   public final boolean bC0() {
      return this.N90 == this.LPT4.size();
   }

   public final void eB0(xv_1 var1) {
      if (var1 != xv_1.lP) {
         int var2 = -1;
         if (var1 == xv_1.oI || var1 == xv_1.tG0) {
            int var3 = 0;

            for (int var4 = this.GG0.size(); var3 < var4; var3++) {
               jw_0 var5;
               int var6;
               if ((var6 = (var5 = (jw_0)this.GG0.get(var3)).Nm0) != 32767) {
                  var2 = Math.max(var2, var5.D10 + var6);
               }
            }
         }

         if (var1 == xv_1.yq || var1 == xv_1.tG0) {
            int var7 = 0;

            for (int var13 = this.dL0.size(); var7 < var13; var7++) {
               jw_0 var10;
               var2 = Math.max(var2, (var10 = (jw_0)this.dL0.get(var7)).D10 + var10.Nm0);
            }
         }

         if (var2 >= 0) {
            this.k50(false);
            if (var2 > this.tI) {
               this.tI = var2;
               ArrayList var8 = this.GG0;
               var2 = this.GG0.size();

               while (true) {
                  int var10000 = var2;
                  var2 += -1;
                  if (var10000 <= 0) {
                     ArrayList var9 = this.dL0;
                     var2 = this.dL0.size();

                     while (true) {
                        var10000 = var2;
                        var2 += -1;
                        if (var10000 <= 0) {
                           this.cn();
                           return;
                        }

                        if (((jw_0)var9.get(var2)).dt() <= this.tI) {
                           var9.remove(var2);
                        }
                     }
                  }

                  if (((jw_0)var8.get(var2)).dt() <= this.tI) {
                     var8.remove(var2);
                  }
               }
            }
         }
      }
   }

   public final void Fa(int var1, int var2, int var3) {
      if (Math.max(0, this.lx0(var3) - this.JO(var2)) < var1) {
         this.k50(false);

         label52:
         while (true) {
            int var4 = Integer.MAX_VALUE;
            jw_0 var5;
            if (!this.GG0.isEmpty() && (var5 = (jw_0)this.GG0.get(this.GG0.size() - 1)).Nm0 != 32767) {
               var4 = Math.min(var4, var5.dt());
            }

            if (!this.dL0.isEmpty()) {
               var4 = Math.min(var4, ((jw_0)this.dL0.get(this.dL0.size() - 1)).dt());
            }

            if (var4 == Integer.MAX_VALUE || var4 < this.tI) {
               return;
            }

            this.tI = var4;
            ArrayList var6 = this.GG0;
            int var8 = this.GG0.size();

            while (true) {
               int var10000 = var8;
               var8 += -1;
               if (var10000 <= 0) {
                  ArrayList var7 = this.dL0;
                  int var9 = this.dL0.size();

                  while (true) {
                     var10000 = var9;
                     var9 += -1;
                     if (var10000 <= 0) {
                        this.cn();
                        if (Math.max(0, this.lx0(var3) - this.JO(var2)) >= var1) {
                           return;
                        }
                        continue label52;
                     }

                     if (((jw_0)var7.get(var9)).dt() <= this.tI) {
                        var7.remove(var9);
                     }
                  }
               }

               if (((jw_0)var6.get(var8)).dt() <= this.tI) {
                  var6.remove(var8);
               }
            }
         }
      }
   }

   public final boolean k50(boolean var1) {
      if (!this.bC0() || !this.sw0 && var1) {
         this.pe0 = Math.min(this.pe0, this.FX());
         int var2 = this.tI;
         int var3 = this.Km;
         if (this.bC0()) {
            var3 = Math.max(var3, this.jE);
         } else {
            for (int var4 = this.N90; var4 < this.LPT4.size(); var4++) {
               var3 = Math.max(var3, ((jw_0)this.LPT4.get(var4)).Nm0);
            }

            jw_0 var14 = (jw_0)this.LPT4.get(this.LPT4.size() - 1);
            int var15 = this.mY + this.dB0 - (var14.rs0 + var14.J);
            int var5;
            if ((var5 = this.Vz0.ordinal()) != 1) {
               if (var5 != 2) {
                  if (var5 == 3 && var15 < this.dB0 / 4) {
                     var5 = this.LPT4.size() - this.N90;

                     for (int var6 = 1; var6 < var5; var6++) {
                        jw_0 var25 = (jw_0)this.LPT4.get(this.N90 + var6);
                        int var7 = var15 * var6 / (var5 - 1);
                        var25.rs0 += var7;
                     }
                  }
               } else {
                  int var16 = var15 / 2;

                  for (int var20 = this.N90; var20 < this.LPT4.size(); var20++) {
                     ((jw_0)this.LPT4.get(var20)).rs0 += var16;
                  }
               }
            } else {
               for (int var19 = this.N90; var19 < this.LPT4.size(); var19++) {
                  ((jw_0)this.LPT4.get(var19)).rs0 += var15;
               }
            }

            for (int var17 = this.N90; var17 < this.LPT4.size(); var17++) {
               jw_0 var22;
               D90 var26 = (var22 = (jw_0)this.LPT4.get(var17)).xE0.Ph;
               I0 var23;
               I0 var10001 = var23 = I0.VERTICAL_ALIGNMENT;
               this.wb.getClass();
               switch (((qi_2)var26.x90(var10001).Kj0(var23)).ordinal()) {
                  case 0:
                     var22.D10 = 0;
                     break;
                  case 1:
                     var22.D10 = (var3 - var22.Nm0) / 2;
                     break;
                  case 2:
                     var22.D10 = var3 - var22.Nm0;
                     break;
                  case 3:
                     var22.D10 = 0;
                     var22.Nm0 = var3;
               }

               int var11 = var22.kj0 - var22.D10;
               var2 = Math.max(var2, Math.max(this.u90, this.tI + var11));
               this.j2 = Math.max(this.j2, var22.dt() - var3);
            }

            for (int var18 = this.N90; var18 < this.LPT4.size(); var18++) {
               ((jw_0)this.LPT4.get(var18)).D10 += var2;
            }
         }

         this.lD(var2, var3);
         this.Km = 0;
         this.N90 = this.LPT4.size();
         this.sw0 = (boolean)(var1 ^ true);
         int end = var2 + var3;
         this.tI = end;
         this.u90 = Math.max(this.u90, end + this.j2);
         this.j2 = 0;
         this.W8 = 0;
         ArrayList var9 = this.GG0;
         var2 = this.GG0.size();

         while (true) {
            int var29 = var2;
            var2 += -1;
            if (var29 <= 0) {
               ArrayList var10 = this.dL0;
               var2 = this.dL0.size();

               while (true) {
                  var29 = var2;
                  var2 += -1;
                  if (var29 <= 0) {
                     this.cn();
                     return true;
                  }

                  if (((jw_0)var10.get(var2)).dt() <= this.tI) {
                     var10.remove(var2);
                  }
               }
            }

            if (((jw_0)var9.get(var2)).dt() <= this.tI) {
               var9.remove(var2);
            }
         }
      } else {
         this.sw0 = (boolean)(var1 ^ true);
         return false;
      }
   }

   public final void gY() {
      this.k50(false);
      this.eB0(xv_1.tG0);
      this.lD(this.tI, 0);
      int var2 = this.u80.length();
      char[] var1;
      this.Cw.Nw = var1 = new char[var2];
      this.u80.getChars(0, var2, var1, 0);
   }

   public final void Tr(D90 var1, Y30 var2, boolean var3) {
      if (var2 != null) {
         this.jE = ((zb0_2)var2).getLineHeight();
      } else {
         this.jE = 0;
      }

      if (var3) {
         this.k50(false);
         this.JD0 = true;
      }

      if (var3 || !this.JD0 && this.bC0()) {
         this.Xs = Math.max(0, this.wb.qw0(var1, I0.MARGIN_LEFT, this.Up0, 0));
         this.Bj = Math.max(0, this.wb.qw0(var1, I0.MARGIN_RIGHT, this.Up0, 0));
         I0 var4;
         I0 var10001 = var4 = I0.HORIZONTAL_ALIGNMENT;
         this.wb.getClass();
         this.Vz0 = (ac0_2)var1.x90(var10001).Kj0(var4);
         this.cn();
         int var10000 = this.mY;
         this.AQ = Math.max(0, this.wb.qw0(var1, I0.TEXT_INDENT, this.Up0, 0) + var10000);
      }

      this.W8 = Math.max(0, this.wb.qw0(var1, I0.MARGIN_TOP, this.Up0, 0));
   }

   public final jw_0 HH(ay_0 var1) {
      jw_0 var2 = new jw_0(var1);
      var2.D10 = this.tI;
      var2.rs0 = this.Vi;
      var2.J = this.Up0;
      this.Cw.dx0.add(var2);
      return var2;
   }

   public final void lD(int var1, int var2) {
      while (this.Sx0 < this.Cw.dx0.size()) {
         ArrayList var10000 = this.Cw.dx0;
         int var3 = this.Sx0++;
         jw_0 var5;
         if ((var5 = (jw_0)var10000.get(var3)).Nm0 == 0) {
            var5.D10 = var1;
            var5.Nm0 = var2;
         }
      }

      if (this.N90 > this.Xq) {
         this.u80.append('\u0000').append((char)(this.N90 - this.Xq));
      }

      if (var1 > this.kP) {
         this.u80.append((char)var1).append('\u0000');
      }

      int var4;
      this.kP = var4 = var1 + var2;
      this.u80.append((char)var4).append((char)(this.LPT4.size() - this.N90));
      this.Xq = this.LPT4.size();
   }
}
