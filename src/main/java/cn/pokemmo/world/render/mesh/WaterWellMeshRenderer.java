package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class WaterWellMeshRenderer extends BaseMapMeshRenderer {
   public final Ou0 zg0;

   public WaterWellMeshRenderer(p50_0 var1) {
      super(var1);
      ra0_0.Ao0().getClass();
      Ou0 var2;
      this.zg0 = var2 = ra0_0.kh();
      var2.ho.el0(3.25F, -0.01F, 2.3625F);
      this.yS(var2);
   }

   @Override
   public final void sn0(short[] var1) {
      if (var1.length >= 1) {
         short var2;
         Ou0 var10000;
         byte var10001;
         boolean var10002;
         if ((var2 = var1[0]) != 386) {
            if (var2 != 389) {
               return;
            }

            var10000 = this.zg0;
            this.zg0.PE0 = 1.0F;
            var10001 = 0;
            var10002 = false;
         } else {
            var10000 = this.zg0;
            this.zg0.PE0 = 1.0E8F;
            var10001 = 0;
            var10002 = false;
         }

         var10000.sC0(var10001, var10002, null);
      }
   }
}
