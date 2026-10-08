package cn.pokemmo.graphics.gdx.color;

import f.*;


import com.badlogic.gdx.graphics.Color;

public class GdxShadingColorConfig {
   public final Color Za0;
   public final Color QH0;
   public final Color MK;
   public final mb0_0 xY;
   public final de0_2 Aj;

   public GdxShadingColorConfig() {
      Color var1 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      this.Za0 = var1;
      this.QH0 = null;
      this.MK = null;
      this.xY = null;
      this.Aj = null;
   }

   public GdxShadingColorConfig(sc_0 var1, Color var2, YA var3, mb0_0 var4, de0_2 var5) {
      Color var6 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      this.Za0 = var6;
      var6.set(var2);
      this.QH0 = null;
      this.MK = null;
      this.xY = var4;
      this.Aj = var5;
   }

   public GdxShadingColorConfig(CG0 var1) {
      Color var2 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      this.Za0 = var2;
      var1.getClass();
      var2.set(var1.Za0);
      this.QH0 = var1.QH0 != null ? new Color(var1.QH0) : null;
      this.MK = var1.MK != null ? new Color(var1.MK) : null;

      this.xY = new mb0_0(var1.xY);
      this.Aj = new de0_2(var1.Aj);
   }
}
