package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class PokemonSummaryPageComponent extends BaseComponent {
   public final int IW;
   public final xe_1 Ft;
   public final xe_1 TV;
   public final EN ax0;
   public final ya_2 RY;
   public com8__3 G40;
   public int Dp0;
   public int GW;
   public Runnable[] lr0;
   public wl0_2 y1;
   public wl0_2 coM4;
   public int YJ0;
   public int MU;
   public boolean tE0;
   public int Uw;
   public int hm;
   public int VP;
   public long QP;

   public PokemonSummaryPageComponent() {
      this(2);
   }

   public PokemonSummaryPageComponent(int var1) {
      this.IW = var1;
      xe_1 var5 = new xe_1();
      this.Ft = var5;
      xe_1 var2 = new xe_1();
      this.TV = var2;
      EN var3 = new EN();
      this.ax0 = var3;
      lpt7__2 var4 = new lpt7__2((f.KB)(Object)this);
      if (var1 == 1) {
         this.uf("hscrollbar");
         var5.uf("leftbutton");
         var2.uf("rightbutton");
      } else {
         this.uf("vscrollbar");
         var5.uf("upbutton");
         var2.uf("downbutton");
      }

      ya_2 var6 = new ya_2((f.KB)(Object)this);
      this.RY = var6;
      var5.Oq0(false);
      var5.VJ().l40(var4);
      var2.Oq0(false);
      var2.VJ().l40(var4);
      var3.Oq0(false);
      var3.uf("thumb");
      var3.Nl(var6);
      this.SL(var5);
      this.SL(var2);
      this.SL(var3);
      this.YJ0 = 10;
      this.MU = 1;
      this.hm = 100;
      this.oY(30, 200);
      this.q20();
   }

   public final void Qu() {
      int var1 = this.hm - this.Uw;
      if (this.IW == 1) {
         int var2 = this.ax0.m0();
         if (this.tE0) {
            long var4 = Math.max(1, super.Mx - this.Ft.Mx - this.TV.Mx);
            long var13 = var2;
            var2 = this.YJ0;
            var2 = (int)Math.max(var13, var4 * this.YJ0 / (var2 + var1 + 1));
         }

         this.ax0.oY(var2, super.OB);
         xe_1 var6 = this.Ft;
         var2 = this.Ft.A20 + var6.Mx;
         if (var1 != 0) {
            int var14 = this.VP - this.Uw;
            var2 += this.nb() * var14 / var1;
         }

         this.ax0.E40(var2, super.SB0);
      } else {
         int var8 = this.ax0.rm0();
         if (this.tE0) {
            long var9 = Math.max(1, super.OB - this.Ft.OB - this.TV.OB);
            long var16 = var8;
            var8 = this.YJ0;
            var8 = (int)Math.max(var16, var9 * this.YJ0 / (var8 + var1 + 1));
         }

         this.ax0.oY(super.Mx, var8);
         xe_1 var11 = this.Ft;
         var8 = this.Ft.SB0 + var11.OB;
         if (var1 != 0) {
            int var17 = this.VP - this.Uw;
            var8 += this.nb() * var17 / var1;
         }

         this.ax0.E40(super.A20, var8);
      }
   }

   @Override
   public final String Ck() {
      return "scrollbar";
   }

   public final void c9(Runnable var1) {
      this.lr0 = (Runnable[])a7_0.gE(this.lr0, var1, Runnable.class);
   }

   public final void DL(int var1) {
      this.jd0(var1, true);
   }

   public final void jd0(int var1, boolean var2) {
      var1 = this.cOm7(var1);
      int var3 = this.VP;
      if (this.VP != var1) {
         this.VP = var1;
         this.Qu();
         this.vI0(var3, var1, "value");
         if (var2) {
            a7_0.bH(this.lr0);
         }
      }
   }

   public final void Xz0(int var1) {
      PokemonSummaryPageComponent var10000;
      int var10001;
      if (this.Uw < this.hm) {
         var10000 = this;
         var10001 = this.VP + var1;
      } else {
         var10000 = this;
         var10001 = this.VP - var1;
      }

      var10000.jd0(var10001, true);
   }

   @Override
   public final void Ib(Jn0 var1) {
      super.Ib(var1);
      LC0 var2;
      this.tE0 = (var2 = (LC0)var1).SD("scaleThumb", false);
      this.Qu();
      PokemonSummaryPageComponent var10000;
      LC0 var10001;
      String var10002;
      boolean var10003;
      Class<wl0_2> var10004;
      if (this.IW == 1) {
         var10000 = this;
         var10001 = var2;
         this.y1 = (wl0_2)var2.N30("trackImageLeft", false, wl0_2.class, null);
         var10002 = "trackImageRight";
         var10003 = false;
         var10004 = wl0_2.class;
      } else {
         var10000 = this;
         var10001 = var2;
         this.y1 = (wl0_2)var2.N30("trackImageUp", false, wl0_2.class, null);
         var10002 = "trackImageDown";
         var10003 = false;
         var10004 = wl0_2.class;
      }

      var10000.coM4 = (wl0_2)var10001.N30(var10002, var10003, var10004, null);
   }

   @Override
   public final void FW(zk0_1 var1) {
      int var6 = super.A20 + super.e80;
      int var2 = super.SB0 + super.y9;
      if (this.IW == 1) {
         int var3 = this.k5();
         wl0_2 var4 = this.y1;
         if (this.y1 != null) {
            var4.uf(super.M, var6, var2, this.ax0.A20 - var6, var3);
         }

         wl0_2 var7 = this.coM4;
         if (this.coM4 != null) {
            EN var8 = this.ax0;
            int var9 = this.ax0.A20 + var8.Mx;
            var7.uf(super.M, var9, var2, this.cz() - var9, var3);
         }
      } else {
         int var13 = this.a3();
         wl0_2 var14 = this.y1;
         if (this.y1 != null) {
            int var15 = this.ax0.SB0 - var2;
            var14.uf(super.M, var6, var2, var13, var15);
         }

         wl0_2 var10 = this.coM4;
         if (this.coM4 != null) {
            EN var11 = this.ax0;
            var2 = this.ax0.SB0 + var11.OB;
            KG0 var10001 = super.M;
            int var5 = this.VM() - var2;
            var10.uf(var10001, var6, var2, var13, var5);
         }
      }
   }

   @Override
   public final void C(zk0_1 var1) {
      com8__3 var2 = new com8__3(var1);
      this.G40 = var2;
      var2.bm0 = this.RY;
      var2.ad0 = true;
   }

   @Override
   public final void N00(zk0_1 var1) {
      com8__3 var2 = this.G40;
      if (this.G40 != null) {
         var2.wg0();
      }

      this.G40 = null;
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      if (var1.zu == 4 && var1.nA0 == 0) {
         this.Dp0 = 0;
         this.V8();
      }

      if (!super.nd0(var1) && var1.zu == 3 && var1.nA0 == 0) {
         int var2 = var1.f8;
         int var3 = var1.AN;
         if (this.yv0(var2, var3)) {
            if (this.IW == 1 ? (this.GW = var1.f8) >= this.ax0.A20 : (this.GW = var1.AN) >= this.ax0.SB0) {
               this.Dp0 = 1;
            } else {
               this.Dp0 = -1;
            }

            this.V8();
         }
      }

      int var4;
      if ((var1.J30 & 36) != 0) {
         var4 = this.YJ0;
      } else {
         var4 = this.MU;
      }

      if (var1.zu == 9) {
         int var5;
         if ((var5 = dp0.r9(var1.finally$)) != 92) {
            if (var5 != 93) {
               switch (var5) {
                  case 19:
                     if (this.IW == 2) {
                        this.jd0(this.VP - var4, true);
                        return true;
                     }
                     break;
                  case 20:
                     if (this.IW == 2) {
                        this.jd0(this.VP + var4, true);
                        return true;
                     }
                     break;
                  case 21:
                     if (this.IW == 1) {
                        this.jd0(this.VP - var4, true);
                        return true;
                     }
                     break;
                  case 22:
                     if (this.IW == 1) {
                        this.jd0(this.VP + var4, true);
                        return true;
                     }
               }
            } else if (this.IW == 2) {
               this.jd0(this.VP + this.YJ0, true);
               return true;
            }
         } else if (this.IW == 2) {
            this.jd0(this.VP - this.YJ0, true);
            return true;
         }
      }

      if (var1.zu == 8) {
         this.jd0(this.VP - var4 * var1.hh0, true);
      }

      return E00.C10(var1.zu);
   }

   public final int cOm7(int var1) {
      int var2;
      int var3;
      if ((var2 = this.Uw) < (var3 = this.hm)) {
         if (var1 < var2) {
            return var2;
         }

         if (var1 <= var3) {
            return var1;
         }
      } else {
         if (var1 > var2) {
            return var2;
         }

         if (var1 >= var3) {
            return var1;
         }
      }

      return var3;
   }

   public final void Lo0(int var1) {
      this.G40.Mu(var1);
      var1 = this.Dp0;
      if (this.Dp0 != 0) {
         int var2;
         if (this.IW == 1) {
            var2 = this.ax0.A20;
         } else {
            var2 = this.ax0.SB0;
         }

         if ((this.GW - var2) * var1 > 0) {
            this.Xz0(var1 * this.YJ0);
         }
      } else if (this.Ft.ER.sx0()) {
         this.Xz0(-this.MU);
      } else if (this.TV.ER.sx0()) {
         this.Xz0(this.MU);
      }
   }

   @Override
   public final int R1() {
      if (this.IW == 1) {
         int var10000 = super.R1();
         int var1 = this.Ft.R1();
         int var2 = this.ax0.R1() + var1;
         return Math.max(var10000, this.TV.R1() + var2);
      } else {
         return Math.max(super.R1(), this.ax0.R1());
      }
   }

   @Override
   public final int Se() {
      if (this.IW == 1) {
         return Math.max(super.Se(), this.ax0.Se());
      }

      int var10000 = super.Se();
      int var1 = this.Ft.Se();
      int var2 = this.ax0.Se() + var1;
      return Math.max(var10000, this.TV.Se() + var2);
   }

   @Override
   public final int m0() {
      return this.R1();
   }

   @Override
   public final int rm0() {
      return this.Se();
   }

   @Override
   public final void K8() {
      xe_1 var10000;
      int var10001;
      int var10002;
      if (this.IW == 1) {
         this.Ft.oY(this.Ft.m0(), super.OB);
         this.Ft.E40(super.A20, super.SB0);
         this.TV.oY(this.Ft.m0(), super.OB);
         var10000 = this.TV;
         var10001 = super.A20 + super.Mx - this.TV.Mx;
         var10002 = super.SB0;
      } else {
         int var1 = super.Mx;
         this.Ft.oY(var1, this.Ft.rm0());
         this.Ft.E40(super.A20, super.SB0);
         var1 = super.Mx;
         this.TV.oY(var1, this.TV.rm0());
         xe_1 var3;
         var10000 = var3 = this.TV;
         var10001 = super.A20;
         var10002 = super.SB0 + super.OB - var3.OB;
      }

      var10000.E40(var10001, var10002);
      this.Qu();
   }

   public final int nb() {
      return this.IW == 1 ? Math.max(1, super.Mx - this.Ft.Mx - this.ax0.Mx - this.TV.Mx) : Math.max(1, super.OB - this.Ft.OB - this.ax0.OB - this.TV.OB);
   }

   public final void V8() {
      if (this.G40 != null) {
         if (this.Dp0 == 0 && !this.Ft.ER.sx0() && !this.TV.ER.sx0()) {
            this.G40.wg0();
         } else {
            com8__3 var1 = this.G40;
            int var2 = this.G40.Ln;
            if (this.G40.Ln <= 0 && (!var1.ad0 || var2 != -1)) {
               this.Lo0(300);
               com8__3 var3;
               if ((var3 = this.G40) != null) {
                  var3.Gi0();
               }
            }
         }
      }
   }

   public final void Kx0(int var1) {
      byte var2 = 0;
      if (var1 >= 0) {
         this.Uw = var2;
         this.hm = var1;
         this.VP = this.cOm7(this.VP);
         this.Qu();
         EN var3 = this.ax0;
         boolean var4;
         if (var1 != 0) {
            var4 = true;
         } else {
            var4 = false;
         }

         var3.Ll(var4);
      } else {
         throw new IllegalArgumentException("maxValue < minValue");
      }
   }
}
