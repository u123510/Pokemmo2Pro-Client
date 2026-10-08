package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.concurrent.atomic.AtomicReference;

public abstract class QuestLogEntryComponent extends BaseComponent {
   public static final MD0 a8 = MD0.cB("editActive");
   public final EN lA;
   public final Tv Ly0;
   public final xe_1 aB0;
   public final xe_1 BA0;
   public final Runnable Jc0;
   public final lk_0 EB0;
   public com8__3 be;
   public String SJ;
   public String qK0 = "";
   public boolean NY = true;
   public final boolean QN = true;
   public boolean ms;
   public int tE;

   public QuestLogEntryComponent() {
      EN var1;
      var1 = new EN(this.Ed0());
      this.lA = var1;
      Tv var2 = new Tv((f.Kq0)(Object)this, this.Ed0());
      this.Ly0 = var2;
      xe_1 var3;
      var3 = new xe_1(this.Ed0(), 0);
      this.aB0 = var3;
      xe_1 var4 = new xe_1(this.Ed0(), 0);
      this.BA0 = var4;
      var1.m00();
      var1.uf("valueDisplay");
      var2.uf("valueEdit");
      var3.uf("decButton");
      var4.uf("incButton");
      Runnable var5 = this::r50;
      this.Jc0 = this::Ba0;
      var3.VJ().l40(var5);
      var4.VJ().l40(var5);
      lk_0 var6 = new lk_0((f.Kq0)(Object)this);
      this.EB0 = var6;
      var1.RR(var6);
      var1.Nl(var6);
      var2.Ll(false);
      var2.Ii(var6);
      this.SL(var1);
      this.SL(var2);
      this.SL(var3);
      this.SL(var4);
      this.Oq0(true);
      this.q20();
   }

   public final void YF0(AtomicReference var1, int var2) {
      if (var2 == 0) {
         Tv var10002 = this.Ly0;
         this.Ly0.em = (gt_0[])a7_0.tp0((gt_0)var1.get(), var10002.em);
         this.Md0();
      }
   }

   @Override
   public final void Xr0(Object var1) {
      super.yj0 = var1;
      this.yB0();
      EN var10000 = this.lA;
      this.lA.yj0 = var1;
      var10000.yB0();
   }

   public final void T7() {
      if (this.lA.eE) {
         this.Ly0.bj(null);
         this.Ly0.Gv(this.UG());
         this.Ly0.Ll(true);
         this.Ly0.BL();
         this.Ly0.tf0();
         KG0 var1 = this.Ly0.M;
         MD0 var2 = cg_0.vh0;
         boolean var3;
         if ((this.lA.ER.mu0 & 1) != 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         var1.j70(var2, var3);
         this.lA.Ll(false);
         super.M.j70(a8, true);
      }
   }

   public final void sS() {
      if (this.Ly0.eE) {
         this.q8();
         this.lA.Ll(true);
         this.Ly0.Ll(false);
         this.lA.ER.Ge0(this.Ly0.M.t5(dz_2.H7));
         super.M.j70(a8, false);
      }
   }

   public final void Md0() {
      Tv var1 = this.Ly0;
      if (this.Ly0.eE) {
         if (this.QN) {
            this.AZ(((wn0_0)var1.dI0).YA.toString());
         }

         this.sS();
      }
   }

   @Override
   public final void Ib(Jn0 var1) {
      super.Ib(var1);
      LC0 var4;
      LC0 var10000 = var4 = (LC0)var1;
      this.tE = var4.H10(100, "width");
      String var2 = "";
      String var3;
      if ((var3 = (String)var10000.N30("displayPrefix", true, String.class, null)) != null) {
         var2 = var3;
      }

      this.qK0 = var2;
      this.NY = var4.SD("useMouseWheel", this.NY);
   }

   @Override
   public final int R1() {
      int var10000 = super.R1();
      int var1 = super.e80 + super.NV;
      var1 = this.aB0.R1() + var1;
      int var2 = Math.max(this.tE, this.lA.R1()) + var1;
      return Math.max(var10000, this.BA0.R1() + var2);
   }

   @Override
   public final int Se() {
      int var1 = Math.max(Math.max(this.lA.Se(), this.aB0.Se()), this.BA0.Se());
      return Math.max(super.y9 + super.Cz + var1, super.Se());
   }

   @Override
   public final int pi0() {
      int var1 = this.aB0.m0();
      int var2 = Math.max(this.tE, this.lA.m0()) + var1;
      return this.BA0.m0() + var2;
   }

   @Override
   public final int zs0() {
      return Math.max(Math.max(this.aB0.rm0(), this.BA0.rm0()), this.lA.rm0());
   }

   @Override
   public final void Bt() {
      label17: {
         label16: {
            Tv var1 = this.Ly0;
            this.ms = this.Ly0.eE;
            if (var1.Of()) {
               lg_0.k.getClass();
               hb0_2 var2 = hb0_2.BN;
               if (hb0_2.BN == hb0_2.cw) {
                  break label16;
               }

               lg_0.k.getClass();
               if (var2 == hb0_2.XU) {
                  break label16;
               }
            }

            this.Md0();
            break label17;
         }

         lg_0.lW.getClass();
         AtomicReference var10001 = new AtomicReference();
         gt_0 var3 = value -> this.YF0(var10001, value);
         var10001.set(var3);
         this.Ly0.Ii(var3);
      }

      this.lA.M.j70(le0_2.gz, false);
   }

   @Override
   public final void hs() {
      this.lA.M.j70(le0_2.gz, true);
   }

   @Override
   public final void Ll(boolean var1) {
      super.Ll(var1);
      if (!var1) {
         this.sS();
      }
   }

   @Override
   public final void yr0() {
      this.sS();
   }

   @Override
   public final void K8() {
      int var1 = this.k5();
      int var2 = super.SB0 + super.y9;
      this.aB0.E40(super.A20 + super.e80, var2);
      this.aB0.oY(this.aB0.m0(), var1);
      this.BA0.E40(this.cz() - this.BA0.m0(), var2);
      this.BA0.oY(this.BA0.m0(), var1);
      xe_1 var3 = this.aB0;
      int var5 = this.aB0.A20 + var3.Mx;
      int var4 = Math.max(0, this.BA0.A20 - var5);
      this.lA.oY(var4, var1);
      this.lA.E40(var5, var2);
      this.Ly0.oY(var4, var1);
      this.Ly0.E40(var5, var2);
   }

   public final void mH() {
      String var1 = this.SJ;
      if (this.SJ == null) {
         var1 = this.qK0;
      }

      this.lA.SU(var1.concat(this.Tz()));
   }

   public abstract String Tz();

   @Override
   public final boolean nd0(i70_0 var1) {
      int var2 = var1.zu;
      if (E00.ZU(var1.zu)) {
         if (var1.iT() && var1.finally$ == 111) {
            lk_0 var4 = this.EB0;
            if (this.EB0.qc) {
               var4.qc = false;
               this.w50();
               return true;
            }
         }

         if (!this.Ly0.eE) {
            if (J90.Qj(var1.zu) == 8) {
               if ((var2 = dp0.r9(var1.finally$)) != 21) {
                  if (var2 == 22) {
                     this.yv0();
                     return true;
                  }

                  if (var2 != 62 && var2 != 66) {
                     if (var1.iN() && this.kk(var1.TD)) {
                        this.T7();
                        this.Ly0.nd0(var1);
                        return true;
                     }

                     return false;
                  }

                  this.T7();
                  return true;
               }

               this.aux();
               return true;
            }

            return false;
         }
      } else if (!this.Ly0.eE && this.NY && var2 == 8) {
         int var3;
         if ((var3 = var1.hh0) < 0) {
            this.aux();
         } else if (var3 > 0) {
            this.yv0();
         }

         return true;
      }

      return super.nd0(var1);
   }

   public abstract String UG();

   public abstract boolean AZ(String var1);

   public abstract String XF0(String var1);

   public abstract void q8();

   public abstract boolean kk(char var1);

   public abstract void br();

   public abstract void qL0(int var1);

   public abstract void w50();

   public abstract void aux();

   public abstract void yv0();

   public abstract void UO();

   public final void Ba0() {
      byte var1 = 75;
      this.be.Mu(var1);
      if (this.BA0.ER.sx0() || this.aB0.ER.sx0()) {
         this.sS();
      }
   }

   public final void r50() {
      if (this.be != null) {
         if (!this.BA0.ER.sx0() && !this.aB0.ER.sx0()) {
            this.be.wg0();
         } else {
            com8__3 var1 = this.be;
            int var2 = this.be.Ln;
            if (this.be.Ln <= 0 && (!var1.ad0 || var2 != -1)) {
               var1.Mu(300);
               if (this.BA0.ER.sx0() || this.aB0.ER.sx0()) {
                  this.sS();
               }

               this.be.Gi0();
            }
         }
      }
   }

   public final void j6() {
      this.SJ = "$";
      this.mH();
   }

   @Override
   public final void mz0(int var1, le0_2 var2) {
      this.hs();
      if (var1 == 1) {
         if (var2 != null && !(var2 instanceof QuestLogEntryComponent)) {
            var2 = var2.K20;
         }

         if (var2 != this && var2 instanceof QuestLogEntryComponent && ((QuestLogEntryComponent)var2).ms) {
            this.T7();
         }
      }
   }
}
