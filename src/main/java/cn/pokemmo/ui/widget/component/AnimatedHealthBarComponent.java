package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class AnimatedHealthBarComponent extends BaseComponent implements tr_1 {
   public int KI0 = 2;
   public final le0_2 kJ0;
   public final yi0_0 Zm0;
   public final yi0_0 xt;
   public final yi0_0 Ko;
   public final yi0_0 t60;
   public final yi0_0 Zw;
   public final yi0_0 N00;
   public final yi0_0 ny;
   public final yi0_0 Ed0;
   public final yi0_0 U7;
   public final yi0_0 uj0;
   public final yi0_0 a50;
   public final yi0_0 Ay0;
   public final yi0_0 S8;
   public final yi0_0 Kq0;
   public final yi0_0 w70;
   public final yi0_0 LC;
   public final yi0_0 rI0;
   public final yi0_0 h10;
   public final yi0_0 it0;
   public final fy_2 Ab;
   public final fy_2 w;
   public Hm0 Jb0;
   public I7 wh;
   public pw_1 px0;
   public final gc0_1 r10;

   public final void hu() {
      this.w.em();
      this.wh = null;
      this.Jb0 = null;
      this.w.pJ0.Ja0();
      this.w.L4.Ja0();
      BR var1;
      if ((var1 = tw0_0.rl) != null && var1.n2() == 5) {
         this.KI0 = 2;
         le0_2[] var3;
         le0_2[] var7 = var3 = new le0_2[3];
         var7[0] = this.Zm0;
         var7[1] = this.a50;
         var7[2] = this.Ko;
         this.qi0(var3);
         var7 = var3 = new le0_2[4];
         var7[0] = this.xt;
         var7[1] = this.N00;
         var7[2] = this.ny;
         var7[3] = this.t60;
         this.qi0(var3);
         var7 = var3 = new le0_2[3];
         var7[0] = this.Zw;
         var7[1] = this.Ed0;
         var7[2] = this.U7;
         this.qi0(var3);
         this.EB0(this.uj0);
         this.EB0(this.it0);
         var7 = var3 = new le0_2[2];
         var7[0] = this.Ay0;
         var7[1] = this.S8;
         this.qi0(var3);
      } else {
         this.KI0 = 1;
         le0_2[] var2;
         le0_2[] var10000 = var2 = new le0_2[7];
         var10000[0] = this.Kq0;
         var10000[1] = this.w70;
         var10000[2] = this.LC;
         var10000[3] = this.rI0;
         var10000[4] = this.h10;
         var10000[5] = this.it0;
         var10000[6] = this.S8;
         this.qi0(var2);
      }

      this.w.pJ0.X20(this.wh);
      this.w.L4.X20(this.Jb0);
   }

   public final void qi0(le0_2... var1) {
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         this.EB0(var1[var3]);
      }

   }

   public final void EB0(le0_2 var1) {
      short var2;
      if (this.KI0 == 1) {
         var2 = 560;
      } else {
         var2 = 260;
      }

      label27: {
         var1.iv(var2, 64);
         AnimatedHealthBarComponent var10000;
         fy_2 var10001;
         if (this.Jb0 != null && this.wh != null) {
            if (this.w.fU() % this.KI0 != 0) {
               break label27;
            }

            var10000 = this;
            this.w.L4.X20(this.Jb0);
            this.w.pJ0.X20(this.wh);
            fy_2 var3 = this.w;
            this.Jb0 = D5.fE0(var3, var3);
            var10001 = this.w;
         } else {
            var10000 = this;
            fy_2 var10003 = this.w;
            this.Jb0 = D5.fE0(var10003, var10003);
            var10001 = this.w;
         }

         var10000.wh = XN.sA(var10001, var10001);
      }

      this.Jb0.Kn0(var1);
      this.wh.Kn0(var1);
   }

   public final void Pm0(int var1, D2 var2) {
      this.px0 = null;
   }

   public final void Jv0(int var1, D2 var2) {
      this.kJ0.Ll(false);
      this.px0 = null;
   }

   public final void k9() {
      this.I70(false);
   }

   public final void Kz() {
      this.I70(false);
      Qy0.yI0.Bg();
   }

   public final void RI() {
      this.I70(false);
      lg_0.lv0.Lf("https://pokemmo.com/account_forgot_password/?local=" + dw_2.con);
   }

   public final void LS() {
      this.I70(false);
      lg_0.lv0.Lf("https://pokemmo.com/account_forgot_username/?local=" + dw_2.con);
   }

   public final void zh0() {
      this.I70(false);
      lg_0.lv0.Lf("https://pokemmo.com/account/?local=" + dw_2.con);
   }

   public final void PRN() {
      this.I70(false);
      Qy0.yI0.wT();
   }

   public final void Dv() {
      this.I70(false);
      Qy0.yI0.qi();
   }

   public final void Xn() {
      this.I70(false);
      if (!h50_0.Bj0) {
         Qy0.yI0.dk(-1, sm0_0.c0(3017));
      } else {
         BU.T50.cx(true);
      }
   }

   public final void ry0() {
      this.I70(false);
      if (lpt3__1.zC) {
         lg_0.k.T0 = false;
      } else {
         Qy0.yI0.sr0(new lpt3__4(sm0_0.c0(1115), AnimatedHealthBarComponent::Ls0, (le0_2)null));
      }
   }

   public final void F5() {
      this.I70(false);
      Qy0.yI0.sr0(new lpt3__4(sm0_0.c0(1160), () -> {
         BR var0;
         if ((var0 = tw0_0.rl) != null) {
            var0.m9();
         }

      }, (le0_2)null));
   }

   public final void PB0() {
      this.I70(false);
      Qy0.yI0.da0(ry_0.hq, CH0.j1, (byte)0);
   }

   public final void yW() {
      this.I70(false);
      BU.T50.Cn0();
   }

   public final void jB() {
      this.I70(false);
      Qy0.yI0.lJ(false, tw0_0.e60.A90(10), -1, -1);
   }

   public final void oD() {
      this.I70(false);
      UA.zd(BU.T50.me(), this.kJ0);
   }

   public final void lPT7() {
      this.I70(false);
      boolean var1;
      BU var2;
      if ((var2 = BU.T50).de0 == null) {
         var1 = true;
      } else {
         var1 = false;
      }

      var2.RG0((VU)null, var1, false);
   }

   public final void uG0() {
      this.I70(false);
      boolean var1;
      BU var2;
      if ((var2 = BU.T50).Xf0 == null) {
         var1 = true;
      } else {
         var1 = false;
      }

      var2.U1((VU)null, var1, false);
   }

   public final void J6() {
      this.I70(false);
      BU.T50.Dj0();
   }

   public final void S50() {
      a10_0 var1;
      if (BU.T50.lB0 == null && (var1 = tw0_0.PK0) != null && !var1.a40) {
         Qy0.yI0.dk(-1, sm0_0.c0(6002));
      } else {
         BU.T50.Zl0();
         this.I70(false);
      }
   }

   public final void Bt() {
      this.I70(false);
   }

   public final void I70(boolean var1) {
      pw_1 var13;
      jn_0 var16;
      if (var1 && !super.eE) {
         this.hu();
         pw_1 var8;
         if ((var8 = this.px0) != null && !((D2)var8).BJ0()) {
            this.px0.w6 = true;
         }

         ((le0_2)this).Ll(true);
         ((le0_2)this).BL();
         pw_1 var14 = pw_1.xC();
         ao_1 var17 = ao_1.DX(this.kJ0, 1, 0.15F);
         pa0_0 var9;
         float var2 = (float)((var9 = pa0_0.Mk).uD0(super.K20.Mx, this.kJ0.Mx) + this.kJ0.Mx + 5);
         var17.h5[0] = var2;
         pw_1 var15 = var14.y80(var17);
         pa0_0 var18 = var9;
         ao_1 var10 = ao_1.DX(this, 1, 0.15F);
         var2 = (float)var18.uD0(super.K20.Mx, super.Mx);
         var10.h5[0] = var2;
         var13 = var15.y80(var10);
         var13.xF0 = (var1x, var2x) -> {
            this.kJ0.Ll(false);
            this.px0 = null;
         };
         var16 = tw0_0.LD0;
      } else {
         if (var1 || !super.eE) {
            return;
         }

         pw_1 var3;
         if ((var3 = this.px0) != null && !((D2)var3).BJ0()) {
            this.px0.w6 = true;
         }

         this.kJ0.Ll(true);
         ((le0_2)this).Ll(false);
         le0_2 var4;
         int var10000 = (var4 = super.K20).A20 + var4.Mx;
         int var5 = super.SB0;
         ((le0_2)this).E40(var10000, var5);
         pw_1 var12 = pw_1.xC();
         ao_1 var10001 = ao_1.DX(this.kJ0, 1, 0.15F);
         le0_2 var6;
         float var7 = (float)((var6 = super.K20).A20 + var6.Mx - this.kJ0.Mx - 5);
         var10001.h5[0] = var7;
         var13 = var12.y80(var10001);
         var13.xF0 = (var1x, var2x) -> this.px0 = null;
         var16 = tw0_0.LD0;
      }

      this.px0 = (pw_1)((D2)var13).Ms(var16.lY);
   }

   public final boolean nd0(i70_0 var1) {
      if (E00.ZU(var1.zu) && var1.iT()) {
         int var2 = var1.finally$;
         rp_0 var3;
         rp_0 var10000 = var3 = rp_0.I90;
         int var10001 = dw_2.ff;
         if (var10000 != null && var3.Ov(var2)) {
            ((le0_2)this).Uz(-1, true);
            return true;
         }

         var2 = var1.finally$;
         if ((var3 = rp_0.Ni) != null && var3.Ov(var2)) {
            ((le0_2)this).Uz(1, true);
            return true;
         }

         var2 = var1.finally$;
         if ((var3 = rp_0.kC0) != null && var3.Ov(var2)) {
            for(int var5 = 0; var5 < this.KI0; ++var5) {
               ((le0_2)this).Uz(-1, true);
            }

            return true;
         }

         var2 = var1.finally$;
         if ((var3 = rp_0.synchronized$) != null && var3.Ov(var2)) {
            for(int var4 = 0; var4 < this.KI0; ++var4) {
               ((le0_2)this).Uz(1, true);
            }

            return true;
         }

         var2 = var1.finally$;
         if ((var3 = rp_0.nK0) != null && var3.Ov(var2)) {
            this.I70(false);
            return true;
         }
      }

      return super.nd0(var1);
   }

   public final void a80(Jn0 var1) {
   }

   public final void aUX(zk0_1 var1) {
      if (dw_2.lp0) {
         Iu0 var10000 = tw0_0.hH0;
         lg_0.S4.getClass();
         lg_0.S4.getClass();
      }

      wl0_2 var6;
      if ((var6 = super.Jj0) != null) {
         wl0_2 var8 = var6;
         AnimatedHealthBarComponent var10001 = this;
         AnimatedHealthBarComponent var10002 = this;
         AnimatedHealthBarComponent var10003 = this;
         AnimatedHealthBarComponent var10004 = this;
         KG0 var5 = super.M;
         int var7 = var10004.A20;
         int var2 = var10003.SB0;
         int var3 = var10002.Mx;
         int var4 = var10001.OB;
         var8.uf(var5, var7, var2, var3, var4);
      }

   }

   public final void K8() {
      this.Ab.lt0();
      ((le0_2)this).oY(600, tw0_0.LD0.Hv0());
      if (!super.eE) {
         pa0_0 var1 = pa0_0.Mk;
         ((le0_2)this).A20(var1, super.Mx, 0);
      } else {
         ((le0_2)this).vf(pa0_0.Mk);
      }

      this.r10.lt0();
      this.r10.E40(super.A20 + super.e80, super.SB0 + super.y9);
   }

   public final void TJ0() {
      this.I70(false);
      UA.zd(BU.T50.LPT1(), this.kJ0);
   }

   public final void Fg() {
      this.I70(false);
      BU.T50.QS();
   }

   public final void GX() {
      this.I70(false);
      this.S50();
   }

   public static void xu() {
      tw0_0.M2();
   }

   public static void Ls0() {
      lg_0.k.T0 = false;
   }

   public static void MN() {
      BR var0 = tw0_0.rl;
      if (var0 != null) {
         var0.m9();
      }
   }

   public AnimatedHealthBarComponent(ia0_1 var1) {
      this.kJ0 = var1;
      ((le0_2)this).uf("hud-panel");
      yi0_0 var6;
      yi0_0 var10000 = var6 = new yi0_0(dw_2.Vr0, sm0_0.c0(1100), (short)5436);
      this.Zm0 = var6;
      ((xe_1)var10000).RR(this::GX);
      var10000 = var6 = new yi0_0(dw_2.GL, sm0_0.c0(1), (short)5431);
      this.xt = var6;
      ((xe_1)var10000).RR(this::Fg);
      var10000 = var6 = new yi0_0(dw_2.Al0, sm0_0.c0(1101), (short)5432);
      this.Ko = var6;
      ((xe_1)var10000).RR(this::J6);
      var10000 = var6 = new yi0_0(dw_2.fK, sm0_0.c0(1126), (short)5437);
      this.Zw = var6;
      ((xe_1)var10000).RR(this::TJ0);
      var10000 = var6 = new yi0_0(0, sm0_0.c0(8034), (short)5471);
      this.N00 = var6;
      ((le0_2)var10000).Xr0(sm0_0.c0(8000));
      ((xe_1)var10000).RR(this::uG0);
      var10000 = var6 = new yi0_0(0, sm0_0.c0(2353), (short)5452);
      this.ny = var6;
      ((xe_1)var10000).RR(this::lPT7);
      var10000 = var6 = new yi0_0(0, sm0_0.c0(1161), (short)5001);
      this.Ed0 = var6;
      ((xe_1)var10000).RR(this::oD);
      var10000 = var6 = new yi0_0(0, sm0_0.c0(1121), (short)5265);
      this.U7 = var6;
      ((xe_1)var10000).RR(this::jB);
      var10000 = var6 = new yi0_0(0, sm0_0.c0(7900), (short)5277);
      this.uj0 = var6;
      ((xe_1)var10000).RR(this::yW);
      var10000 = var6 = new yi0_0(0, sm0_0.c0(2807), (short)5454);
      this.a50 = var6;
      ((xe_1)var10000).RR(this::PB0);
      var10000 = var6 = new yi0_0(0, sm0_0.c0(1159), (short)5481);
      this.Ay0 = var6;
      ((xe_1)var10000).RR(this::F5);
      var10000 = var6 = new yi0_0(0, sm0_0.c0(1114), (short)5547);
      this.S8 = var6;
      ((xe_1)var10000).RR(this::ry0);
      var10000 = var6 = new yi0_0(-1, sm0_0.c0(1116), (short)5459);
      this.t60 = var6;
      ((xe_1)var10000).RR(this::Xn);
      var10000 = var6 = new yi0_0(-1, sm0_0.c0(1175), (short)5502);
      this.Kq0 = var6;
      ((xe_1)var10000).RR(this::Dv);
      var10000 = var6 = new yi0_0(-1, sm0_0.c0(1190), (short)5428);
      this.w70 = var6;
      ((xe_1)var10000).RR(this::PRN);
      var10000 = var6 = new yi0_0(-1, sm0_0.c0(1005), (short)5465);
      this.LC = var6;
      ((xe_1)var10000).RR(this::zh0);
      var10000 = var6 = new yi0_0(-1, sm0_0.c0(1006), (short)5475);
      this.rI0 = var6;
      ((xe_1)var10000).RR(this::LS);
      var10000 = var6 = new yi0_0(-1, sm0_0.c0(1007), (short)5467);
      this.h10 = var6;
      ((xe_1)var10000).RR(this::RI);
      var10000 = var6 = new yi0_0(-1, sm0_0.c0(1124), (short)5621);
      this.it0 = var6;
      ((xe_1)var10000).RR(() -> tw0_0.M2());
      fy_2 var25;
      fy_2 var47 = var25 = new fy_2();
      this.Ab = var25;
      I7 var2 = var47.H10();
      Hm0 var3;
      Hm0 var48 = var3 = var47.lo0();
      I7 var10002 = var2;
      Hm0 var10004 = var3;
      I7 var10006 = var2;
      var25.WQ(var3);
      var25.x40(var2);
      xe_1 var26;
      xe_1 var10008 = var26 = new xe_1();
      ((le0_2)var10008).uf("mobile-menu-close");
      var10008.RR(() -> this.I70(false));
      xe_1 var27;
      var10008 = var27 = new xe_1();
      ((le0_2)var10008).uf("mobile-menu-settings");
      var10008.RR(this::Kz);
      ((ya_1)var10006).X20(var25.lo0().LPt3(new le0_2[]{var27, var26})).qd(35);
      ((ya_1)var10004).X20(var25.H10().Ze0().LPt3(new le0_2[]{var27, var26}));
      fy_2 var4;
      fy_2 var50 = var4 = new fy_2();
      this.w = var4;
      var50.x40(var50.H10());
      var50.WQ(var50.lo0());
      lo0_0 var5;
      var5 = new lo0_0(var4);
      ((ya_1)var10002).X20(var25.hb(new le0_2[]{var5}));
      ((ya_1)var48).X20(var25.C7(new le0_2[]{var5}));
      this.hu();
      gc0_1 var28;
      gc0_1 var49 = var28 = new gc0_1();
      this.r10 = var28;
      ((le0_2)this).SL(var28);
      ((le0_2)this).SL(var25);
      ((le0_2)var5).Oq0(false);
      ((le0_2)var26).Oq0(false);
      ((le0_2)var27).Oq0(false);
      ((le0_2)var49).Oq0(false);
   }
}
