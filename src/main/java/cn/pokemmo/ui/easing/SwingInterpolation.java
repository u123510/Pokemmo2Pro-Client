package cn.pokemmo.ui.easing;

import f.*;
import java.util.*;

public class SwingInterpolation extends BaseInterpolation {
   public final float Tg;
   public final float iw0;
   public final float Com4;
   public final float j6;

   public SwingInterpolation(float var1, float var2) {
      this.Tg = var1;
      this.iw0 = var2;
      float var3;
      this.Com4 = var3 = (float)Math.pow(var1, -var2);
      this.j6 = 1.0F / (1.0F - var3);
   }

   public float UV(float var1) {
      if (var1 <= 0.5F) {
         double var4 = this.Tg;
         float var3 = this.iw0;
         return ((float)Math.pow(var4, (var1 * 2.0F - 1.0F) * var3) - this.Com4) * this.j6 / 2.0F;
      } else {
         double var10000 = this.Tg;
         float var2 = -this.iw0;
         return (2.0F - ((float)Math.pow(var10000, (var1 * 2.0F - 1.0F) * var2) - this.Com4) * this.j6) / 2.0F;
      }
   }
}
