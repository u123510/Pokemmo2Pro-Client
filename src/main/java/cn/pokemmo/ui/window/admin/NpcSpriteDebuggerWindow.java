package cn.pokemmo.ui.window.admin;

import f.*;

/**
 * NPC精灵图集与动画帧调试器
 *
 * 原混淆类: f.Ax0
 */
public class NpcSpriteDebuggerWindow extends R90 {
   public static final Wr[] lu = new Wr[0];
   public final fy_2 Ru0;
   public final Aj mz;
   public final Aj vh0;
   public final Aj CP;
   public final Gh0 lX;
   public final S70 Ft;
   public final S70 kM;
   public final cn_0 et;
   public Wr[] PRn;
   public Wr[] COm6;

   public NpcSpriteDebuggerWindow(xn0_0 var1) {
      Wr[] var2 = lu;
      this.PRn = var2;
      this.COm6 = var2;
      fy_2 var14 = new fy_2();
      this.Ru0 = var14;
      ((R90)this).ff0(1);
      ((le0_2)this).uf("adminframe");
      ((R90)this).Hy("Npc Sprite Debugger");
      ((R90)this).Pb0(() -> var1.u3(this));
      cn_0 var13 = new cn_0("Region ID: ");
      cn_0 var3 = new cn_0("Sprite ID: ");
      cn_0 var4 = new cn_0("Frame ID: ");
      S70 var5 = new S70();
      this.Ft = var5;
      ((le0_2)var5).oY(128, 128);
      var5.JH().dA(4.0F);
      var5.JH().Gy0(0, 32);
      S70 var6 = new S70();
      this.kM = var6;
      ((le0_2)var6).oY(128, 128);
      var6.JH().dA(4.0F);
      var6.JH().Gy0(0, 128);
      cn_0 var7 = new cn_0("HGSS Mapped Sprite: ");
      this.et = var7;
      Aj var8 = new Aj(0, 10, 0);
      this.mz = var8;
      Gh0 var9 = new Gh0(var8);
      Aj var10 = new Aj(0, 862, 0);
      this.vh0 = var10;
      Gh0 var11 = new Gh0(var10);
      Aj var12 = new Aj(0, 50, 0);
      this.CP = var12;
      Gh0 var15 = new Gh0(var12);
      this.lX = var15;
      ((xp_1)var8).Kj(this::WT);
      ((xp_1)var10).Kj(this::WT);
      ((xp_1)var12).Kj(this::pJ0);
      var14.WQ(var14.lo0().LPt3(new le0_2[]{var13, var9, var3, var11, var4, var15, var5, var7, var6}));
      var14.x40(var14.H10().LPt3(new le0_2[]{var13, var9, var3, var11, var4, var15, var5, var7, var6}));
      ((le0_2)this).SL(var14);
      this.WT();
   }

   public final void K8() {
      ((le0_2)this).RY(500, 700);
      ((R90)this).lt0();
      this.Ru0.lt0();
      super.K8();
   }

   public final void WT() {
      byte var1;
      byte var10000 = var1 = (byte)this.mz.cx0;
      short var2 = (short)this.vh0.cx0;
      if (var10000 != 0 && var1 != 1 && var1 != 10) {
         if (var1 == 2) {
            Wr[] var8;
            this.PRn = var8 = tw0_0.Ll0.Qz0.AF(var2).TK;
            this.Ft.og.Nk(var8);
         } else {
            Ts var9;
            if (var1 == 3 && (var9 = tw0_0.Ll0.nC0) != null) {
               Wr[] var12;
               this.PRn = var12 = var9.f80(var2);
               this.Ft.og.Nk(var12);
            } else {
               UY var10;
               if (var1 == 4 && (var10 = tw0_0.Ll0.t1) != null) {
                  Wr[] var11;
                  if (!var10.Gt.bL0(var2)) {
                     var11 = null;
                  } else {
                     var11 = (Wr[])var10.GY.f5(var10.Gt.f5(var2));
                  }

                  this.PRn = var11;
                  this.Ft.og.Nk(var11);
               }
            }
         }
      } else {
         Wr[] var3;
         this.PRn = var3 = QI.Py.kN(var1, var2, false).z4();
         this.Ft.og.Nk(var3);
      }

      boolean var13;
      if (tw0_0.Ll0.t1 == null || var1 != 0 && var1 != 1) {
         var13 = false;
      } else {
         var13 = true;
      }

      this.et.Ll(var13);
      this.kM.Ll(var13);
      if (var13) {
         Wr[] var7;
         xm0_0 var14;
         if ((var14 = (xm0_0)tw0_0.Ll0.t1.cS.BM(var1)) == null) {
            var7 = UY.CS;
         } else if ((var7 = (Wr[])var14.d90.f5(var2)) == null) {
            var7 = UY.CS;
         }

         this.COm6 = var7;
         this.kM.og.Nk(var7);
      }

      if (var1 != 0 && var1 != 1) {
         if (var1 == 3) {
            this.CP.X90(2);
         } else {
            this.CP.X90(3);
         }
      } else {
         this.CP.X90(0);
      }

      NpcSpriteDebuggerWindow var15 = this;
      this.pJ0();
      Gh0 var4 = this.lX;
      Wr[] var5;
      boolean var6;
      if ((var5 = var15.PRn) != null && var5.length > 0) {
         var6 = true;
      } else {
         var6 = false;
      }

      ((le0_2)var4).pw0(var6);
   }

   public final void pJ0() {
      Wr[] var1;
      if ((var1 = this.PRn) != null) {
         Aj var2;
         int var3;
         if ((var3 = (var2 = this.CP).cx0) >= var1.length) {
            if (var1.length > 0) {
               var2.X90(var1.length - 1);
            } else {
               var2.X90(0);
            }

            var3 = this.CP.cx0;
         }

         if ((var1 = this.PRn) != null && var1.length > 0) {
            this.Ft.og.Nk(new Wr[]{var1[var3]});
            if ((var1 = this.COm6).length > 0) {
               this.kM.og.Nk(new Wr[]{var1[var3]});
            }
         } else {
            this.Ft.og.lo0();
            this.kM.og.lo0();
         }

      }
   }
}
