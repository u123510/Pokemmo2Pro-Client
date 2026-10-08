package cn.pokemmo.ui.widget.menu;

import f.*;

public class PopupMenuManager extends TJ0 {
   public int on0 = 0;
   public int vj = 0;
   public final boolean NE0 = true;

   public PopupMenuManager(le0_2 var1) {
      super(var1);
      this.uf("menumanager");
   }

   public static UA zd(Vt0 var0, le0_2 var1) {
      UA var2 = new UA(var1);
      UA var10000 = var2;
      le0_2 var3;
      if ((var3 = var10000.M10(0, var0, var1, true)) != null) {
         OE0(var3);
      }

      var2.Uz(1, false);
      return var2;
   }

   public static void CI0(EP var0, le0_2 var1) {
      UA var2 = new UA(var1);
      UA var10000 = var2;
      le0_2 var3;
      if ((var3 = var10000.M10(0, var0, var1, false)) != null) {
         var3.sy(var1.A20 - var3.Mx, var1.SB0 + var1.OB);
         OE0(var3);
      }

      var2.Uz(1, false);
   }

   public static void Xy0(int var0, Vt0 var1, jb0_0 var2) {
      UA var3 = new UA(var2);
      UA var10000 = var3;
      le0_2 var6;
      if ((var6 = var10000.M10(0, var1, var2, false)) != null) {
         int var4 = var2.A20;
         int var5 = var2.SB0;
         if ((var0 & 2) != 0) {
            var5 -= var2.OB + var6.OB;
         }

         if ((var0 & 4) != 0) {
            var5 += var2.OB;
         } else if ((var0 & 1) != 0) {
            var5 += var2.OB / 2;
         }

         if ((var0 & 16) != 0) {
            var4 += var2.Mx;
         }

         if ((var0 & 8) != 0) {
            var4 -= var6.Mx;
         } else if ((var0 & 1) != 0) {
            var4 += var2.Mx / 2;
         }

         var6.sy(var4, var5);
         OE0(var6);
      }

      var3.Uz(1, false);
   }

   public static void rL(EP var0, le0_2 var1, int var2, int var3) {
      UA var4 = new UA(var1);
      UA var10000 = var4;
      le0_2 var5;
      if ((var5 = var10000.M10(0, var0, var1, false)) != null) {
         var5.sy(var2, var3);
         OE0(var5);
      }

      var4.Uz(1, false);
   }

   public static void jP(Vt0 var0, xe_1 var1, lpt4__1 var2) {
      UA var3 = new UA(var1);
      UA var10000 = var3;
      le0_2 var4;
      if ((var4 = var10000.M10(0, var0, var1, false)) != null) {
         int var5 = var2.A20;
         var4.sy(var2.Mx / 2 + var5 - var4.Mx / 2, var2.SB0 - var4.OB - 3);
         OE0(var4);
      }

      var3.Uz(1, false);
   }

   public static void OE0(le0_2 var0) {
      var0.oY(Math.min(Math.max(var0.Em0.Mx, var0.R1()), var0.Mx), Math.min(Math.max(var0.Em0.OB, var0.Se()), var0.OB));
      var0.sy(Math.max(0, Math.min(var0.Em0.Mx - var0.Mx, var0.A20)), Math.max(0, Math.min(var0.Em0.OB - var0.OB, var0.SB0)));
   }

   @Override
   public final void t5() {
      super.t5();
      Qy0.yI0.Fx0 = false;
   }

   @Override
   public final boolean jb0(i70_0 var1) {
      if (this.NE0) {
         super.jb0(var1);
      }

      if (E00.ZU(var1.zu) && var1.iT()) {
         int var2 = var1.finally$;
         rp_0 var3 = rp_0.kC0;
         if (rp_0.kC0 != null && var3.Ov(var2)) {
            this.vJ();
            return true;
         }

         var3 = rp_0.synchronized$;
         if (rp_0.synchronized$ != null && var3.Ov(var2)) {
            this.QL();
            return true;
         }

         var3 = rp_0.sJ0;
         if (rp_0.sJ0 != null && var3.Ov(var2)) {
            le0_2 var8;
            if ((var8 = this.Nq0(this.vj)) == null) {
               return true;
            }

            int var10000 = var8.fU();
            var2 = this.on0;
            if (var10000 <= this.on0) {
               return true;
            }

            le0_2 var9;
            if ((var9 = var8.qA(var2)) instanceof xe_1) {
               if (!(((xe_1)var9).ER instanceof tq_0)) {
                  this.vj++;
                  this.on0 = 0;
               }

               var10000 = this.fU();
               int var10 = this.vj;
               if (var10000 > this.vj) {
                  le0_2 var11;
                  if ((var11 = this.Nq0(var10)) == null) {
                     return true;
                  }

                  var10000 = var11.fU();
                  var2 = this.on0;
                  if (var10000 > this.on0) {
                     lpt6__0.v90(var11.qA(var2));
                  }

                  if (this.qA(this.vj) instanceof lo0_0) {
                     ((lo0_0)this.qA(this.vj)).Yj0(0, 60, 100);
                  }
               }
            }

            return true;
         }

         var3 = rp_0.nK0;
         if (rp_0.nK0 != null && var3.Ov(var2)) {
            int var5 = this.vj;
            if (this.vj == 0) {
               this.Md0();
               return true;
            }

            while (this.fU() > var5) {
               this.fC0(this.fU() - 1);
            }

            int var6 = this.vj - 1;
            this.vj = var6;
            this.on0 = 0;
            le0_2 var7;
            if ((var7 = this.Nq0(var6)) == null) {
               return true;
            }

            int var4;
            if (var7.fU() > (var4 = this.on0)) {
               lpt6__0.v90(var7.qA(var4));
            }

            return true;
         }
      }

      return E00.ZU(var1.zu) ? true : super.jb0(var1);
   }

   public final le0_2 Nq0(int var1) {
      if (this.fU() <= var1) {
         return null;
      }

      le0_2 var2;
      if ((var2 = this.qA(var1)) instanceof lo0_0) {
         if (var2.fU() < 1) {
            return null;
         }

         if ((var2 = var2.qA(0)).fU() < 1) {
            return null;
         }

         var2 = var2.qA(0);
      }

      return var2;
   }

   @Override
   public final boolean c3() {
      boolean var1;
      if (var1 = super.c3()) {
         Qy0.yI0.Fx0 = true;
      }

      return var1;
   }

   public final void QL() {
      le0_2 var1;
      if ((var1 = this.Nq0(this.vj)) != null) {
         int var10000 = var1.fU();
         int var2 = this.on0;
         if (var10000 > this.on0 + 1) {
            int var3;
            this.on0 = var3 = var2 + 1;
            if ((var1 = var1.qA(var3)) instanceof xe_1) {
               lpt6__0.v90(var1);
            } else {
               this.QL();
            }

            if (this.qA(this.vj) instanceof lo0_0) {
               ((lo0_0)this.qA(this.vj)).Yj0(this.on0 * var1.OB, 60, 100);
            }
         }
      }
   }

   public final void vJ() {
      if (this.on0 != 0) {
         le0_2 var1;
         if ((var1 = this.Nq0(this.vj)) == null) {
            return;
         }

         int var2;
         this.on0 = var2 = this.on0 - 1;
         if ((var1 = var1.qA(var2)) instanceof xe_1) {
            lpt6__0.v90(var1);
         } else {
            this.vJ();
         }

         if (this.qA(this.vj) instanceof lo0_0) {
            ((lo0_0)this.qA(this.vj)).Yj0(this.on0 * var1.OB, 60, 100);
         }
      }
   }
}
