package cn.pokemmo.graphics.render;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import f.*;

/**
 * 现代化重构类 - 原始类: f.CF0
 */
public class RenderPassContext implements fy0_0 {

   public final up_2 oH0;
   public final ui_1 u9;
   public final B5[] LPt2;
   public final PC0 op;
   public final Color pa;
   public final Color zF = new Color(1.0F, 1.0F, 1.0F, 1.0F);
   public float lJ = 0.0F;

   public RenderPassContext() {
      this.pa = new Color(270521855);
      this.LPt2 = new B5[12];

      for (int var1 = 0; var1 < 4; var1++) {
         this.LPt2[var1] = new B5(fi_0.xL().A4(0));
      }

      int var3 = 0;

      while (var3 < 7) {
         this.LPt2[var3 + 4] = new B5(fi_0.xL().A4(++var3));
      }

      PC0 var4 = new PC0(lg_0.S4.Kr0(), lg_0.S4.sD0());
      this.op = var4;
      this.u9 = new ui_1(30);
      (this.oH0 = new up_2(var4)).Yw0(lg_0.S4.Kr0(), lg_0.S4.sD0());
      B5 var10001 = this.LPt2[10];
      var3 = (int)this.LPt2[10].l() * 10;
      int var6 = (int)this.LPt2[10].LD0();
      var10001.lpT6(0, 0, var3, var6);
      this.LPt2[10].An(this.LPt2[10].l() * 10.0F, this.LPt2[10].LD0());
   }

   @Override
   public final void dispose() {
      this.u9.dispose();
      fi_0 var2;
      I2 var1 = (var2 = fi_0.xL()).a10.ZD();

      while (var1.hasNext()) {
         ((Texture)var1.next()).dispose();
      }

      var2.a10.clear();
      var2.a10 = null;
   }
}
