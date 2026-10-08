package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class DynamicDoorMeshRenderer extends BaseMapMeshRenderer {
   public boolean N;
   public Ou0 Cc;
   public final C8 hm0;
   public final C8 a2;
   public short yk0;
   public short fn0;
   public final float[] WH;
   public E90 R50;

   public DynamicDoorMeshRenderer(cb_0 var1) {
      super(var1);
      this.N = false;
      this.Cc = null;
      this.hm0 = new C8();
      this.a2 = new C8();
      this.yk0 = 0;
      this.fn0 = 0;
      this.WH = new float[]{0.0F, 5.0F};
      this.R50 = null;
   }

   public final void lpt1(float var1) {
      if (!this.N) {
         ov_0 var2 = (ov_0)tw0_0.LD0.Sc;
         if (var2.qf.isEmpty()) {
            return;
         }

         I2 var3 = var2.qf.ZD();
         while (var3.hasNext()) {
            nv0_0 var4 = (nv0_0)var3.next();
            if (this.gq0() == 185) {
               var4.wp0.kk(2.0F, 6.0F, 2.0F);
            }

            I2 var5 = var4.yf0.ZD();
            while (var5.hasNext()) {
               Ou0 var6 = (Ou0)var5.next();
               if (var6.yI0.equalsIgnoreCase("lift_base01") || var6.yI0.equalsIgnoreCase("leage_lift")) {
                  this.Cc = var6;
                  var6.EG();
               }
            }
         }

         if (this.Cc == null) {
            v80_0 var7 = v80_0.Cb0();
            var7.getClass();
            this.Cc = v80_0.sb((byte)3, this.gq0() > 290 ? 258 : 502, true);
            this.Cc.rF0();
            this.y50.Ue0(this.Cc);
         }

         this.Cc.sY = false;
         switch (this.gq0()) {
            case 176:
               this.yk0 = 4;
               this.fn0 = 11;
               this.WH[0] = 10.0F;
               this.WH[1] = 0.0F;
               break;
            case 184:
               this.yk0 = 4;
               this.fn0 = 19;
               this.WH[0] = 5.0F;
               this.WH[1] = 0.0F;
               break;
            case 185:
               this.yk0 = 8;
               this.fn0 = 8;
               this.WH[0] = 15.0F;
               this.WH[1] = 0.0F;
               break;
            case 291:
               this.yk0 = 11;
               this.fn0 = 23;
               this.WH[0] = 9.0F;
               this.WH[1] = 1.0F;
               break;
            case 293:
               this.yk0 = 19;
               this.fn0 = 44;
               this.WH[0] = 9.0F;
               this.WH[1] = 1.0F;
               break;
            case 294:
               this.yk0 = 9;
               this.fn0 = 11;
               this.WH[0] = 9.0F;
               this.WH[1] = 1.0F;
               break;
            default:
               this.yk0 = 4;
               this.fn0 = 11;
               this.WH[0] = 5.0F;
               this.WH[1] = 0.0F;
         }

         this.Cc.ho.m80(this.yk0 * 0.25F + 0.125F, this.WH[0] * 0.25F + 0.04F, this.fn0 * 0.25F + 0.125F);
         this.N = true;
      }

      this.Cc.ho.V1(this.hm0);
      if (!LW.LH0(this.hm0.y, this.a2.y)) {
         C8 var7 = this.hm0;
         float var8 = this.hm0.y;
         C8 var9 = this.a2;
         float var10 = this.a2.y;
         if (var8 < var10) {
            var8 += lg_0.S4.uL * 1.5F;
            var7.y = var8;
            if (var8 >= var9.y) {
               var7.y = var9.y;
               this.stop();
            }
         } else if (var8 > var10) {
            var8 -= lg_0.S4.uL * 1.5F;
            var7.y = var8;
            if (var8 <= var9.y) {
               var7.y = var9.y;
               this.stop();
            }
         }

         this.Cc.ho.Y1(this.hm0);
         this.Cc.rF0();
      }
   }

   public final void stop() {
      if (this.R50 != null) {
         this.R50.il0.f60(null, false, C8.Zero);
         this.R50.rd.il0.f60(null, false, C8.Zero);
         this.R50 = null;
      }
   }

   public final void sn0(short[] var1) {
      if (var1.length < 1) {
         return;
      }
      if (!this.N) {
         lg_0.k.lPT5(new S90((f.cl0_1)(Object)this, var1));
         return;
      }
      if (var1[0] == 4699) {
         this.KS(var1[1], null);
      } else if (var1[0] == 4700) {
         yt_1 var2 = tw0_0.e60;
         if (var2 != null) {
            this.KS(var1[1], var2.jB0);
         }
      }
   }

   public final void KS(short var1, E90 var2) {
      if (var2 == null) {
         this.Cc.ho.V1(this.hm0);
         this.hm0.y = this.WH[var1] * 0.25F + 0.04F;
         this.a2.x = this.hm0.x;
         this.a2.y = this.hm0.y;
         this.a2.z = this.hm0.z;
         this.Cc.ho.Y1(this.hm0);
         this.Cc.rF0();
         this.R50 = null;
      } else {
         this.a2.y = this.WH[var1] * 0.25F + 0.04F;
         var2.il0.f60(this.Cc, true, C8.Zero);
         var2.rd.il0.f60(this.Cc, true, C8.Zero);
         tw0_0.rl.xm = new XB0((f.cl0_1)(Object)this);
         this.R50 = var2;
      }

      for (short var3 = -1; var3 < 2; var3++) {
         for (short var4 = 0; var4 < 2; var4++) {
            Ll0 var5 = this.WK.rc0((byte)0, (short)(this.yk0 + var3), (short)(this.fn0 + var4));
            if (var5 == null) {
               return;
            }
            var5.Ds0 = this.WH[var1];
         }
      }
   }
}
