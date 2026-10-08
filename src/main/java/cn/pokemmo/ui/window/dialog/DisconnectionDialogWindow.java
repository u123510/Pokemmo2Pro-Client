package cn.pokemmo.ui.window.dialog;

import f.*;

import java.util.Iterator;

/**
 * 断开连接与反作弊提示弹窗
 *
 * 原混淆类: f.K6
 */
public class DisconnectionDialogWindow extends cx_0 implements tr_1  {
    public final K6 asBridge() {
        return (K6) (Object) this;
    }

   public final fy_2 eG0;
   public final xe_1 bU;
   public final xe_1 f6;
   public final fc0_0 bm0;

   public DisconnectionDialogWindow(Qy0 var1, fc0_0 var2) {
      super(false, false);
      var1.aS(cx_0.class);
      this.bm0 = var2;
      this.uf("disconnection-widget");

      fy_2 var3 = new fy_2();
      this.eG0 = var3;
      var3.uf("confirm-panel");
      qk0_2 var4 = new qk0_2();
      ge_0 var5 = new ge_0(var4);
      var5.hp(K6::MG);
      var5.uf("textarea");

      StringBuilder var6 = new StringBuilder();
      String var7 = sm0_0.c0(var2.pM());
      xe_1 var8 = null;
      if (var2 == fc0_0.KE && tw0_0.rl != null && !tw0_0.rl.PO().isEmpty()) {
         mH(var6, var7.replace("https://pokemmo.com/tampering", "https://pokemmo.com/tampering-as"));
         var6.append("&nbsp;");
         Iterator var9 = tw0_0.rl.PO().iterator();
         if (var9.hasNext()) {
            i80_0.Xj(var9.next());
            throw null;
         }

         mH(var6, sm0_0.wa0(6825, ""));
         var8 = new xe_1(sm0_0.c0(6826));
         var8.pw0(true);
         var8.RR(K6::LPT3);
      } else {
         mH(var6, var7);
      }

      this.f6 = var8;
      var4.Eo(var6.toString());
      xe_1 var10 = new xe_1(sm0_0.c0(nf0_0.BA));
      this.bU = var10;
      var10.pw0(false);
      var10.RR(() -> this.LW(var2));
      var3.x40(var3.H10().Kn0(var5).Kn0(this.f6).Kn0(var10).Ze0());
      var3.WQ(var3.lo0().Kn0(var5).Kn0(this.f6).Kn0(var10));
      this.SL(var3);
      super.Ey = tw0_0.kz0();
   }

   public static void LPT3() {
      tw0_0.lM.getClass();
   }

   public static void MG(String var0) {
      lg_0.lv0.Lf(var0);
   }

   public static void mH(StringBuilder var0, String var1) {
      var0.append("<div style=\"word-wrap: break-word; font-family: default; text-align: center;");
      var0.append(" \\\">");
      if ((var1 = var1.replaceAll("\\n", "<br/>")).matches(".*https://([a-z\\.\\-]+)?pokemmo.com.*")) {
         var1 = var1.replaceAll("(https://([a-z\\.\\-]+)?pokemmo\\.com\\S*)", "<a style=\"display: inline; float: left; font: link\" href=\"$1\">$1</a>");
      }

      var0.append(var1);
      var0.append("</div>");
   }

   @Override
   public final void C(zk0_1 var1) {
      lpt6__0.v90(this.bU);
      com8__3 var2 = new com8__3(var1);
      int var3;
      switch (this.bm0.JS) {
         case 9:
         case 10:
         case 11:
            var3 = 10000;
            break;
         case 3:
         case 4:
         case 6:
         case 7:
         case 8:
            var3 = 5000;
            break;
         default:
            var3 = 2000;
      }

      var2.Mu(var3);
      var2.Gi0();
      var2.bm0 = () -> this.bU.pw0(true);
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      label22: {
         if (E00.ZU(var1.zu) && var1.iT()) {
            int var2 = var1.finally$;
            rp_0 var3 = rp_0.sJ0;
            if (rp_0.sJ0 != null && var3.Ov(var2)) {
               break label22;
            }

            var2 = var1.finally$;
            var3 = rp_0.nK0;
            if (rp_0.nK0 != null && var3.Ov(var2)) {
               break label22;
            }
         }

         return super.nd0(var1);
      }

      a7_0.bH(this.bU.ER.Fc0);
      return true;
   }

   @Override
   public final void K8() {
      super.K8();
      this.kh0();
      this.eG0.lt0();
      this.eG0.vf(pa0_0.Ol);
   }

   @Override
   public final void HP(zk0_1 var1) {
      if (tw0_0.kz0()) {
         this.BL();
      } else {
         lpt6__0.v90(this.bU);
      }

      super.HP(var1);
   }

   public final void tx() {
      this.bU.pw0(true);
   }

   public final void LW(fc0_0 var1) {
      if (this.bU.OI) {
         this.xe0();
         if (var1 != fc0_0.Jr && var1 != fc0_0.Ju0 && var1 != fc0_0.xv && var1 != fc0_0.KE && var1 != fc0_0.KJ0) {
            BR var2 = tw0_0.rl;
            if (tw0_0.rl != null) {
               var2.m9();
            }
         } else {
            lg_0.k.T0 = false;
         }
      }
   }
}
