package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BridgeMeshRenderer extends BaseMapMeshRenderer {
   public static final float[] PB = new float[]{32.0F, 42.0F, 0.0F, -10.0F};
   public static final byte[] B40 = new byte[]{0, 0};
   public final Ou0 jv0;
   public final Ou0 ox;
   public final Ou0[] e80 = new Ou0[4];
   public final wy0_0 hW;

   public BridgeMeshRenderer(p50_0 var1) {
      super(var1);
      ra0_0.Ao0().getClass();
      Ou0 var5;
      this.jv0 = var5 = ra0_0.JO();
      float[] var2 = PB;
      byte[] var3 = B40;
      wy0_0 var10003 = this.hW = new wy0_0(this, var5, 0, var2, var3, 0, false);
      var10003.P8 = false;
      this.yS(var10003.uF0);
      ra0_0.Ao0().getClass();
      Ou0 var6;
      this.ox = var6 = ra0_0.Md();
      var6.ho.m80(8.0F, 0.0F, 10.5F);
      this.yS(var6);
      float[][] var7;
      float[][] var10000 = var7 = new float[4][];
      float[] var10004 = var2 = new float[2];
      var10004[0] = 26.0F;
      var10004[1] = 44.0F;
      var10000[0] = var2;
      float[] var14 = var2 = new float[2];
      var14[0] = 26.0F;
      var14[1] = 37.0F;
      var10000[1] = var2;
      float[] var10002 = var2 = new float[2];
      var10002[0] = 34.0F;
      var10002[1] = 44.0F;
      var10000[2] = var2;
      float[] var10001 = var2 = new float[2];
      var10001[0] = 34.0F;
      var10001[1] = 37.0F;
      var10000[3] = var2;

      for (int var12 = 0; var12 < 4; var12++) {
         Ou0[] var15 = this.e80;
         ra0_0.Ao0().getClass();
         var15[var12] = ra0_0.Df();
         float var13 = var7[var12][0] * 0.25F;
         float var4 = var7[var12][1] * 0.25F;
         this.e80[var12].ho.m80(var13, 0.0F, var4);
         this.e80[var12].TU(2, true);
         this.yS(this.e80[var12]);
      }
   }

   @Override
   public final void sn0(short[] var1) {
      if (var1.length >= 1) {
         short var2;
         if ((var2 = var1[0]) != 442) {
            if (var2 == 443) {
               this.hW.Fe0(0);
               this.hW.nr0 = 1;
            }
         } else {
            if (var1.length < 5) {
               return;
            }

            var2 = 0;
            int var3 = 0;

            while (var3 < 4) {
               int var4;
               if (var1[var4 = var3 + 1] != 0) {
                  this.e80[var3].sC0(1, true, null);
                  var2++;
               } else {
                  this.e80[var3].sC0(2, true, null);
               }

               var3 = var4;
            }

            if (var2 >= 4) {
               this.jv0.sC0(0, true, null);
               this.ox.sC0(0, true, null);
            }
         }
      }
   }

   @Override
   public final void lpt1(float var1) {
      super.lpt1(var1);
      this.hW.w70();
   }

   @Override
   public final void dispose() {
      super.dispose();
      yt_1 var3 = tw0_0.e60;
      if (tw0_0.e60 != null) {
         E90 var4;
         if ((var4 = var3.jB0) != null) {
            EA0 var10000 = var4.il0;
            Object var5 = null;
            boolean var1 = false;
            var4.il0.getClass();
            C8 var2 = C8.Zero;
            var10000.f60((Ou0)var5, var1, var2);
         }
      }
   }
}
