package cn.pokemmo.ui.widget.color;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/**
 * TWL 界面一维颜色渐变选择器控件 (TWL 1D Color Gradient Area Widget)
 * <p>
 * 对应原始混淆类: f.KC
 * 职责:
 * TWL 调色板与取色器的一维梯度滑动选择控件（主题标识: "colorarea1d"）。
 */
public class ColorArea1D extends Xr0 {
   public final int u8;
   public i4_0 u;
   public ByteBuffer VD0;
   public IntBuffer qU;
   public final V7 fz0;

   public ColorArea1D(int var1, V7 var2) {
      this.fz0 = var2;
      this.u8 = var1;
      int var3 = 0;

      for (int var4 = var2.T1(); var3 < var4; var3++) {
         if (var3 != var1) {
            var2.LT[var3].Kj(this);
         }
      }
   }

   @Override
   public final String Ck() {
      return "colorarea1d";
   }

   @Override
   public final void FW(zk0_1 var1) {
      super.FW(var1);
      if (super.qF0 != null) {
         this.fz0.PW.getClass();
         float var5 = this.fz0.PW.o6(this.u8);
         int var6 = (int)((this.fz0.Ou[this.u8] - var5) * (this.k5() - 1) / (0.0F - var5) + 0.5F);
         wl0_2 var10000 = super.qF0;
         KG0 var2 = super.M;
         int var3 = super.A20 + super.e80;
         int var4 = super.SB0 + super.y9 + var6;
         int var7 = this.a3();
         var10000.uf(var2, var3, var4, var7, 1);
      }
   }

   @Override
   public final void hp(zk0_1 var1) {
      Z30 var2;
      super.M00 = var2 = ((qq_0)var1.AK).Sk(1);
      (this.VD0 = (this.u = var2.i6.OB.getTextureData().JX()).Rh0()).order(ByteOrder.BIG_ENDIAN);
      this.qU = this.VD0.asIntBuffer();
   }

   @Override
   public final void Th0() {
      float[] var1 = (float[])this.fz0.Ou.clone();
      IntBuffer var2 = this.qU;
      kj0_0 var3 = this.fz0.PW;
      float var4 = this.fz0.PW.o6(this.u8);
      float var5 = (0.0F - var4) / 63.0F;

      for (int var6 = 0; var6 < 64; var6++) {
         var1[this.u8] = var4;
         var2.put(var6, var3.a80(var1) << 8 | 0xFF);
         var4 += var5;
      }

      super.M00.i6.OB.load(super.M00.i6.OB.getTextureData());
      super.TQ = false;
   }

   @Override
   public final void N00(zk0_1 var1) {
      super.M00.i6.OB.dispose();
      this.u.dispose();
   }

   @Override
   public final void CoM2(int var1, int var2) {
      this.fz0.PW.getClass();
      float var4 = this.fz0.PW.o6(this.u8);
      int var3;
      float var5 = (0.0F - var4) * Math.max(0, Math.min(var3 = this.k5(), var2)) / var3 + var4;
      this.fz0.LT[this.u8].MK0(var5);
   }
}
