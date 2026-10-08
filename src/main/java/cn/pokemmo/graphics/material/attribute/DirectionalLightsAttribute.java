package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


public class DirectionalLightsAttribute extends BaseMaterialAttribute {
   public static final long M0 = hf_1.T20("directionalLights");
   public final es_1 Ds0 = new es_1(1);

   public DirectionalLightsAttribute() {
      super(M0);
   }

   public DirectionalLightsAttribute(DirectionalLightsAttribute var1) {
      this();
      this.Ds0.E3(var1.Ds0);
   }

   @Override
   public final int hashCode() {
      int var3 = super.YF * 7489;
      I2 var1 = this.Ds0.ZD();

      while (var1.hasNext()) {
         qv_0 var2;
         qv_0 var6 = var2 = (qv_0)var1.next();
         int var4 = var3 * 1229;
         int var5;
         if (var6 == null) {
            var5 = 0;
         } else {
            var5 = var2.hashCode();
         }

         var3 = var4 + var5;
      }

      return var3;
   }

   @Override
   public hf_1 pD0() {
      return new f.CP(this);
   }

   @Override
   public final int compareTo(Object var1) {
      hf_1 var4 = (hf_1)var1;
      long var2;
      long var5;
      byte var6;
      if ((var2 = super.yO) != (var5 = var4.yO)) {
         if (var2 < var5) {
            var6 = -1;
         } else {
            var6 = 1;
         }
      } else {
         var6 = 0;
      }

      return var6;
   }
}
