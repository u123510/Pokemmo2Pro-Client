package cn.pokemmo.ui.widget.menu;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.menu.BasePopupMenuWidget;

public class GuildMemberActionMenuWidget extends BasePopupMenuWidget {
   public final qd_0 m1;
   public final int QX;
   public final lr_0 fd0;

   public GuildMemberActionMenuWidget(lr_0 var1, qd_0 var2, int var3) {
      this.fd0 = var1;
      this.m1 = var2;
      this.QX = var3;
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      if (E00.ZU(var1.zu) && var1.iT()) {
         EG0 var2 = this.fd0.MU[this.m1.xZ];
         int var3 = var1.finally$;
         rp_0 var4 = rp_0.I90;
         if (rp_0.I90 != null && var4.Ov(var3)) {
            var2.sd0(var2.az0, var2.Jh0 - 1);
            return true;
         }

         var3 = var1.finally$;
         var4 = rp_0.Ni;
         if (rp_0.Ni != null && var4.Ov(var3)) {
            var2.sd0(var2.az0, var2.Jh0 + 1);
            return true;
         }

         var3 = var1.finally$;
         var4 = rp_0.kC0;
         if (rp_0.kC0 != null && var4.Ov(var3)) {
            int var7 = var2.az0;
            if (var2.az0 <= 0) {
               var2.PF0.Uz(1, false);
               return true;
            }

            var2.sd0(--var7, var2.Jh0);
            return true;
         }

         var3 = var1.finally$;
         var4 = rp_0.synchronized$;
         if (rp_0.synchronized$ != null && var4.Ov(var3)) {
            int var6 = var2.az0 + 1;
            var2.sd0(var6, var2.Jh0);
            return true;
         }

         var3 = var1.finally$;
         var4 = rp_0.Aq0;
         if (rp_0.Aq0 != null && var4.Ov(var3)) {
            short var9 = var2.RV;
            if (var2.RV >= this.QX / 10) {
               return true;
            }

            var2.y80.Ff(var9 + 1);
            return true;
         }

         var3 = var1.finally$;
         var4 = rp_0.cB;
         if (rp_0.cB != null && var4.Ov(var3)) {
            short var5 = var2.RV;
            if (var2.RV <= 0) {
               return true;
            }

            var2.y80.Ff(var5 - 1);
            return true;
         }

         int var10 = var1.finally$;
         rp_0 var16 = rp_0.nK0;
         if (rp_0.nK0 != null && var16.Ov(var10)) {
            this.fd0.hq.f00();
            lpt6__0.v90(this.fd0.hq);
            return true;
         }
      }

      return super.nd0(var1);
   }
}
