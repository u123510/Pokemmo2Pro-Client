package cn.pokemmo.graphics.color;

import f.*;
import java.util.ArrayList;

/**
 * 现代化重构类 - 原始混淆类: f.A00
 */
public class LinearGradientConfig  {
   public final ab_2 yO;
   public q8_0 WR;
   public final ArrayList Pn;

   public LinearGradientConfig(ab_2 var1) {
      super();
      if (var1 == null) {
         throw new NullPointerException("type");
      }
      this.yO = var1;
      this.WR = q8_0.Eb;
      this.Pn = new ArrayList();
   }

   public final ab_2 xQ() {
      return this.yO;
   }

   public final q8_0 NP() {
      return this.WR;
   }

   public final int TE0() {
      return this.Pn.size();
   }

   public final gs0_0 mi(int var1) {
      return (gs0_0)this.Pn.get(var1);
   }

   public final gs0_0[] dt() {
      return (gs0_0[])this.Pn.toArray(new gs0_0[0]);
   }

   public final void XJ0(float var1, gn_0 var2) {
      int var3;
      if ((var3 = this.Pn.size()) == 0) {
         if (var1 < 0.0F) {
            throw new IllegalArgumentException("first stop must be >= 0.0f");
         }
         if (var1 > 0.0F) {
            this.Pn.add(new gs0_0(0.0F, var2));
         }
      }

      if (var3 > 0) {
         if (var1 <= ((gs0_0)this.Pn.get(var3 - 1)).A5) {
            throw new IllegalArgumentException("pos must be monotone increasing");
         }
      }
      this.Pn.add(new gs0_0(var1, var2));
   }
}

