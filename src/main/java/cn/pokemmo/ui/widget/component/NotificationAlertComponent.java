package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class NotificationAlertComponent extends BaseComponent {
   public final fy_2 pRN;
   public final cg_0 G1;
   public final cg_0 gT;

   public NotificationAlertComponent() {
      ((le0_2)this).uf("confirm-widget");
      fy_2 var1 = new fy_2();
      this.pRN = var1;
      ((le0_2)var1).uf("confirm-panel");
      cn_0 var2 = new cn_0(sm0_0.wa0(2725, h50_0.uK0 + ""));
      cg_0 var3 = new cg_0();
      this.G1 = var3;
      cg_0 var4 = new cg_0();
      this.gT = var4;
      var3.ef0(16);
      var3.LPt8("[a-zA-ZÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]");
      var3.I7();
      var4.ef0(4);
      var4.LPt8("[a-zA-ZÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]");
      var4.I7();
      cn_0 var5 = new cn_0(sm0_0.c0(2729));
      var5.kl();
      cn_0 var6 = new cn_0(sm0_0.c0(2730));
      var6.kl();
      xe_1 var7 = new xe_1(sm0_0.c0(2708));
      var7.RR(this::N00);
      xe_1 var8 = new xe_1(sm0_0.c0(nf0_0.Bq0));
      var8.RR(this::xe0);
      var1.x40(var1.H10().Kn0(var2).X20(var1.lo0().LPt3(new le0_2[]{var5, var3})).X20(var1.lo0().LPt3(new le0_2[]{var6, var4})).X20(var1.H10().LPt3(new le0_2[]{var7, var8})).Ze0());
      var1.WQ(var1.lo0().Kn0(var2).X20(var1.H10().LPt3(new le0_2[]{var5, var3})).X20(var1.H10().LPt3(new le0_2[]{var6, var4})).X20(var1.lo0().Kn0(var7).Kn0(var8)));
      ((le0_2)this).SL(var1);
   }

   public final void K8() {
      this.pRN.lt0();
      ((le0_2)this).lt0();
      ((le0_2)this).N80(pa0_0.Ol);
   }

   public final void N00() {
      ((le0_2)this).xe0();
      if (tw0_0.rl.k0.il < h50_0.uK0) {
         Qy0.yI0.dk(-1, sm0_0.c0(1927));
      } else {
         Qy0.yI0.sr0(new lpt3__4(sm0_0.wa0(2726, ((wn0_0)this.G1.dI0).YA.toString()), new G2((f.At0)(Object)this), this));
      }
   }
}
