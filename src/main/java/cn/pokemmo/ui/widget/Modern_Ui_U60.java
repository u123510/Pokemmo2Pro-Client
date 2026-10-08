package cn.pokemmo.ui.widget;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.U60
 */
public class Modern_Ui_U60 extends vg_1 {

   public final fy_2 Vl;

   public Modern_Ui_U60(BU var1, mc0_1 var2, byte var3) {
      if (jq0_0.hA(var1, U60.class)) {
         jq0_0.tK0(var1, U60.class).xe0();
      }

      this.uf("item-widget");
      fy_2 var8;
      fy_2 var10001 = var8 = new fy_2();
      this.Vl = var8;
      var10001.uf("item-panel");
      IK0 var4;
      IK0 var9 = var4 = new IK0((U60)this);
      var9.Sk(var2.getName());
      var9.JH().Nk(gh_1.Jh0().Xj0(var2));
      var9.JH().nq0(24, 24);
      var9.lt0();
      lp_0 var5 = new lp_0((U60)this, lb0_2.OF(var2));
      var5.Oq0(false);
      xe_1 var6;
      xe_1 var11 = var6 = new xe_1(sm0_0.c0(65));
      var11.RR(this::xe0);
      gi_1 var7 = null;
      if (var2.jc() != null) {
         var7 = new gi_1(var2, var3, null, false, false, "");
      }

      if (var7 != null) {
         var8.x40(var8.H10().Kn0(var4).Kn0(var7).Kn0(var5).Kn0(var7.extends$).Kn0(var6).Ze0());
         var8.WQ(var8.lo0().Kn0(var4).Kn0(var7).Kn0(var5).Kn0(var7.extends$).Kn0(var6));
      } else {
         var8.x40(var8.H10().Kn0(var4).Kn0(var5).Kn0(var6).Ze0());
         var8.WQ(var8.lo0().Kn0(var4).Kn0(var5).Kn0(var6));
      }

      this.SL(var8);
   }

   @Override
   public final void K8() {
      this.lt0();
      this.Vl.lt0();
      this.E40((super.K20.a3() - this.Vl.Mx) / 2, (super.K20.k5() - this.Vl.OB) / 2);
      this.lt0();
   }
}

