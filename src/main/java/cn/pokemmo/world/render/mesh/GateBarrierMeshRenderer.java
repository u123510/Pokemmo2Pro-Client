package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class GateBarrierMeshRenderer extends BaseMapMeshRenderer {
   public static final C8 nj0 = new C8();
   public static final me0_2 Wr = new me0_2();
   public final cf_2 FD0;
   public final es_1 N20;
   public final es_1 AA0;
   public final es_1 zS;
   public final es_1 rI0;

   public GateBarrierMeshRenderer(cb_0 var1) {
      super(var1);
       this.FD0 = new cf_2();
       this.N20 = new es_1();
       this.AA0 = new es_1();
       this.zS = new es_1();
       this.rI0 = new es_1();
      byte var16 = 22;
      int[][] var3 = new int[22][];
      int[] var4;
      int[] var10000 = var4 = new int[8];
      var10000[0] = 154;
      var10000[1] = 459;
      var10000[2] = 3;
      var10000[3] = 8;
      var10000[4] = 270;
      var10000[5] = 0;
      var10000[6] = 1;
      var10000[7] = 1;
      var3[0] = var4;
      var10000 = var4 = new int[8];
      var10000[0] = 154;
      var10000[1] = 460;
      var10000[2] = 8;
      var10000[3] = 8;
      var10000[4] = 180;
      var10000[5] = 1;
      var10000[6] = 0;
      var10000[7] = 1;
      var3[1] = var4;
      var10000 = var4 = new int[8];
      var10000[0] = 154;
      var10000[1] = 459;
      var10000[2] = 13;
      var10000[3] = 8;
      var10000[4] = 0;
      var10000[5] = 0;
      var10000[6] = 1;
      var10000[7] = 1;
      var3[2] = var4;
      var10000 = var4 = new int[8];
      var10000[0] = 155;
      var10000[1] = 458;
      var10000[2] = 6;
      var10000[3] = 13;
      var10000[4] = 180;
      var10000[5] = 0;
      var10000[6] = 3;
      var10000[7] = 2;
      var3[3] = var4;
      var10000 = var4 = new int[8];
      var10000[0] = 155;
      var10000[1] = 461;
      var10000[2] = 11;
      var10000[3] = 13;
      var10000[4] = 180;
      var10000[5] = 1;
      var10000[6] = 0;
      var10000[7] = 3;
      var3[4] = var4;
      var10000 = var4 = new int[8];
      var10000[0] = 155;
      var10000[1] = 459;
      var10000[2] = 6;
      var10000[3] = 8;
      var10000[4] = 270;
      var10000[5] = 1;
      var10000[6] = 2;
      var10000[7] = 1;
      var3[5] = var4;
      var10000 = var4 = new int[8];
      var10000[0] = 155;
      var10000[1] = 458;
      var10000[2] = 11;
      var10000[3] = 8;
      var10000[4] = 90;
      var10000[5] = 0;
      var10000[6] = 1;
      var10000[7] = 2;
      var3[6] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 155;
      var10000[1] = 464;
      var10000[2] = 15;
      var10000[3] = 8;
      var10000[4] = 90;
      var10000[5] = 3;
      var10000[6] = 0;
      var10000[7] = 4;
      var10000[8] = 4;
      var3[7] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 155;
      var10000[1] = 464;
      var10000[2] = 2;
      var10000[3] = 13;
      var10000[4] = 90;
      var10000[5] = 3;
      var10000[6] = 0;
      var10000[7] = 4;
      var10000[8] = 4;
      var3[8] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 156;
      var10000[1] = 463;
      var10000[2] = 2;
      var10000[3] = 13;
      var10000[4] = 0;
      var10000[5] = 3;
      var10000[6] = 0;
      var10000[7] = 4;
      var10000[8] = 4;
      var3[9] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 156;
      var10000[1] = 464;
      var10000[2] = 2;
      var10000[3] = 18;
      var10000[4] = 0;
      var10000[5] = 3;
      var10000[6] = 0;
      var10000[7] = 4;
      var10000[8] = 4;
      var3[10] = var4;
      var10000 = var4 = new int[8];
      var10000[0] = 156;
      var10000[1] = 459;
      var10000[2] = 6;
      var10000[3] = 18;
      var10000[4] = 270;
      var10000[5] = 1;
      var10000[6] = 4;
      var10000[7] = 1;
      var3[11] = var4;
      var10000 = var4 = new int[8];
      var10000[0] = 156;
      var10000[1] = 462;
      var10000[2] = 11;
      var10000[3] = 18;
      var10000[4] = 90;
      var10000[5] = 0;
      var10000[6] = 0;
      var10000[7] = 3;
      var3[12] = var4;
      var10000 = var4 = new int[8];
      var10000[0] = 156;
      var10000[1] = 461;
      var10000[2] = 16;
      var10000[3] = 18;
      var10000[4] = 0;
      var10000[5] = 1;
      var10000[6] = 4;
      var10000[7] = 3;
      var3[13] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 156;
      var10000[1] = 464;
      var10000[2] = 20;
      var10000[3] = 13;
      var10000[4] = 90;
      var10000[5] = 3;
      var10000[6] = 0;
      var10000[7] = 4;
      var10000[8] = 4;
      var3[14] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 156;
      var10000[1] = 464;
      var10000[2] = 20;
      var10000[3] = 18;
      var10000[4] = 90;
      var10000[5] = 3;
      var10000[6] = 0;
      var10000[7] = 4;
      var10000[8] = 4;
      var3[15] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 156;
      var10000[1] = 461;
      var10000[2] = 6;
      var10000[3] = 8;
      var10000[4] = 270;
      var10000[5] = 0;
      var10000[6] = 1;
      var10000[7] = 3;
      var10000[8] = 6;
      var3[16] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 156;
      var10000[1] = 460;
      var10000[2] = 11;
      var10000[3] = 8;
      var10000[4] = 0;
      var10000[5] = 1;
      var10000[6] = 0;
      var10000[7] = 1;
      var10000[8] = 6;
      var3[17] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 156;
      var10000[1] = 461;
      var10000[2] = 16;
      var10000[3] = 8;
      var10000[4] = 0;
      var10000[5] = 0;
      var10000[6] = 0;
      var10000[7] = 3;
      var10000[8] = 6;
      var3[18] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 156;
      var10000[1] = 460;
      var10000[2] = 6;
      var10000[3] = 13;
      var10000[4] = 270;
      var10000[5] = 1;
      var10000[6] = 0;
      var10000[7] = 1;
      var10000[8] = 6;
      var3[19] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 156;
      var10000[1] = 461;
      var10000[2] = 11;
      var10000[3] = 13;
      var10000[4] = 90;
      var10000[5] = 0;
      var10000[6] = 0;
      var10000[7] = 3;
      var10000[8] = 6;
      var3[20] = var4;
      var10000 = var4 = new int[9];
      var10000[0] = 156;
      var10000[1] = 461;
      var10000[2] = 16;
      var10000[3] = 13;
      var10000[4] = 90;
      var10000[5] = 1;
      var10000[6] = 2;
      var10000[7] = 3;
      var10000[8] = 6;
      var3[21] = var4;

      for (int var38 = 0; var38 < var16; var38++) {
         int[] var5 = var3[var38];
         if (var1.W5().O60 == var5[0]) {
            int var6 = var5[1];
            Ou0 var40;
            if (this.FD0.Vd(var6)) {
               var40 = ((Ou0)this.FD0.Ip(var6)).Ma0();
            } else {
               v80_0.Cb0().getClass();
               Ou0 var7;
               Ou0 var64 = var7 = v80_0.VH(var6);
               this.FD0.n3(var6, var7);
               var40 = var64.Ma0();
            }

            this.yS(var40);
            var40.sY = false;
            es_1 var41 = this.rI0;
            int var9 = var5[2];
            int var10 = var5[3];
            int var11;
            if (var5.length == 9) {
               var11 = var5[8];
            } else {
               var11 = 0;
            }

            int var39 = var5[4];
            int var42 = var5[5];
            int var68 = var5[6];
            int var67 = var5[7];
             sk_2 var8 = new sk_2(var40, var9, var10, var11, var39, var42);
            var41.Ue0(var8);
         }
      }

      if (var1.p4() == 154) {
         Ou0 var10001 = v80_0.VH(487);
         var10001.ho.m80(3.625F, 0.25F, 3.375F);
         var10001.Ni(GateBarrierMeshRenderer::ev0);
         var10001.TU(0, true);
         this.yS(var10001);
      }

      if (var1.p4() == 156) {
         Ou0 var66 = v80_0.VH(486);
         var66.ho.m80(2.375F, 1.75F, 0.875F);
         var66.Ni(GateBarrierMeshRenderer::wQ);
         var66.TU(0, true);
         this.yS(var66);
      }
   }

   public static boolean wQ() {
      BR var0 = tw0_0.rl;
      return tw0_0.rl != null && var0.yh0.Ny((byte)3, (short)1368);
   }

   public static boolean ev0() {
      BR var0 = tw0_0.rl;
      return tw0_0.rl != null && var0.yh0.Ny((byte)3, (short)1368);
   }

   public final void lpt1(float var1) {
      I2 var2 = this.rI0.ZD();

      while (var2.hasNext()) {
         sk_2 var3;
         float var4;
         float var10000 = var4 = (var3 = (sk_2)var2.next()).jh;
         float var5 = var3.YK;
         if (var10000 != var3.YK) {
            boolean var14 = false;
            if (var4 > var5) {
               var3.jh = var4 - lg_0.S4.uL * 120.0F;
            } else {
               var3.jh = lg_0.S4.uL * 120.0F + var4;
               var14 = true;
            }

            C8 var12 = nj0;
            var3.MW.ho.V1(nj0);
            float var6 = var3.jh;
            float var7 = var3.YK;
            if (var3.jh > var3.YK && var14 || var6 < var7 && !var14) {
               var3.jh = var7;
               tw0_0.rl.Am(false);
            }

            int var15 = var3.Sd0;
            if (var3.Sd0 != 3 && var15 != 2) {
               C8 var17 = C8.Y;
               Wr.Oa(var17, var3.jh);
            } else {
               C8 var16 = C8.X;
               Wr.Oa(var16, var3.jh);
            }

            Matrix4 var10;
            Matrix4 var21 = var10 = var3.MW.ho;
            me0_2 var22 = Wr;
            me0_2 var10002 = Wr;
            me0_2 var10003 = Wr;
            me0_2 var10004 = Wr;
            var10.getClass();
            float var11 = var12.x;
            var4 = var12.y;
            var5 = var12.z;
            var6 = var10004.m1;
            var7 = var10003.ao0;
            float var8 = var10002.th;
            float var9 = var22.Au0;
            var21.vh(var11, var4, var5, var6, var7, var8, var9);
         }
      }

      super.lpt1(var1);
   }

   public final void sn0(short[] var1) {
      if (var1.length >= 1) {
         short var2;
         if ((var2 = var1[0]) == 4469 || var2 == 4470) {
            short var11 = var1[1];
            boolean var12;
            if (var2 == 4469) {
               var12 = true;
            } else {
               var12 = false;
            }

            I2 var10 = this.rI0.ZD();

            while (var10.hasNext()) {
               sk_2 var24 = (sk_2)var10.next();
               float var4 = var24.jh;
               if (var24.YK == var24.jh) {
                  int var5 = var24.Sd0;
                  if (var24.Sd0 == 0 || var5 == 3) {
                     var5 = var24.lJ;
                     var24.YK = var11 * 90 + var5;
                  } else if (var5 == 1 || var5 == 2) {
                     var24.YK = var24.lJ - var11 * 90;
                  }

                  if (Math.abs(var4 - var24.YK) > 269.0F) {
                     var4 = var24.jh;
                     if (var24.jh > var24.YK) {
                        var24.jh = var4 - 360.0F;
                     } else {
                        var24.jh = var4 + 360.0F;
                     }
                  }

                  if (!var12) {
                     tw0_0.rl.Am(true);
                  } else {
                     var24.jh = var24.YK;
                     C8 var16 = nj0;
                     var24.MW.ho.V1(nj0);
                     var5 = var24.Sd0;
                     if (var24.Sd0 != 3 && var5 != 2) {
                        C8 var21 = C8.Y;
                        Wr.Oa(var21, var24.jh);
                     } else {
                        C8 var20 = C8.X;
                        Wr.Oa(var20, var24.jh);
                     }

                     Matrix4 var14;
                     Matrix4 var10000 = var14 = var24.MW.ho;
                     me0_2 var10001 = Wr;
                     me0_2 var10002 = Wr;
                     me0_2 var10003 = Wr;
                     me0_2 var10004 = Wr;
                     var14.getClass();
                      float var23 = var16.x;
                     var4 = var16.y;
                     float var22 = var16.z;
                     float var6 = var10004.m1;
                     float var7 = var10003.ao0;
                     float var8 = var10002.th;
                     float var9 = var10001.Au0;
                      var10000.vh(var23, var4, var22, var6, var7, var8, var9);
                  }
               }
            }
         }
      }
   }

   public final void dispose() {
      super.dispose();
      com7__4 var1;
      (var1 = this.FD0.K00()).getClass();

      while (var1.hasNext()) {
         ((Ou0)var1.next()).O4();
      }

      this.N20.clear();
      this.AA0.clear();
      this.zS.clear();
   }
}
