package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class GdxSprite extends f.LPT6_ {
   public final float[] Sx;
   public final Color UB0;
   public float pD0;
   public float pV;
   public float EI0;
   public float hk0;
   public float Jn0;
   public float si;
   public float B1;
   public float Zi0;
   public float D60;
   public boolean o70;

   public GdxSprite() {
      this.Sx = new float[20];
      this.UB0 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      this.Zi0 = 1.0F;
      this.D60 = 1.0F;
      this.o70 = true;
      this.lE(1.0F, 1.0F, 1.0F);
   }

   public GdxSprite(Texture var1) {
      this(var1, 0, 0, var1.getWidth(), var1.getHeight());
   }

   public GdxSprite(Texture var1, int var2, int var3) {
      this((Texture)var1, 0, 0, var2, var3);
   }

   public GdxSprite(Texture var1, int var2, int var3, int var4, int var5) {
      this.Sx = new float[20];
      this.UB0 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      this.Zi0 = 1.0F;
      this.D60 = 1.0F;
      this.o70 = true;
      if (var1 != null) {
         super.OB = var1;
         ((LPT6_)this).lpT6(var2, var3, var4, var5);
         this.lE(1.0F, 1.0F, 1.0F);
         this.An((float)Math.abs(var4), (float)Math.abs(var5));
         this.FJ0(this.EI0 / 2.0F, this.hk0 / 2.0F);
      } else {
         throw new IllegalArgumentException("texture cannot be null.");
      }
   }

   public GdxSprite(LPT6_ var1) {
      this.Sx = new float[20];
      this.UB0 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      this.Zi0 = 1.0F;
      this.D60 = 1.0F;
      this.o70 = true;
      ((LPT6_)this).t60(var1);
      this.lE(1.0F, 1.0F, 1.0F);
      this.An((float)var1.R90(), (float)var1.dV());
      this.FJ0(this.EI0 / 2.0F, this.hk0 / 2.0F);
   }

   public GdxSprite(LPT6_ var1, int var2, int var3, int var4, int var5) {
      this.Sx = new float[20];
      this.UB0 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      this.Zi0 = 1.0F;
      this.D60 = 1.0F;
      this.o70 = true;
      ((LPT6_)this).KF0(var1, var2, var3, var4, var5);
      this.lE(1.0F, 1.0F, 1.0F);
      this.An((float)Math.abs(var4), (float)Math.abs(var5));
      this.FJ0(this.EI0 / 2.0F, this.hk0 / 2.0F);
   }

   public GdxSprite(B5 var1) {
      this.Sx = new float[20];
      this.UB0 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      this.Zi0 = 1.0F;
      this.D60 = 1.0F;
      this.o70 = true;
      this.f8(var1);
   }

   public final void f8(B5 var1) {
      if (var1 != null) {
         System.arraycopy(var1.Sx, 0, this.Sx, 0, 20);
         super.OB = var1.OB;
         super.yQ = var1.yQ;
         super.Y60 = var1.Y60;
         super.Yo = var1.Yo;
         super.Ll0 = var1.Ll0;
         this.pD0 = var1.pD0;
         this.pV = var1.pV;
         this.EI0 = var1.EI0;
         this.hk0 = var1.hk0;
         super.bz = var1.bz;
         super.xZ = var1.xZ;
         this.Jn0 = var1.Jn0;
         this.si = var1.si;
         this.B1 = var1.B1;
         this.Zi0 = var1.Zi0;
         this.D60 = var1.D60;
         this.UB0.set(var1.UB0);
         this.o70 = var1.o70;
      } else {
         throw new IllegalArgumentException("sprite cannot be null.");
      }
   }

   public void ss(float var1, float var2, float var3, float var4) {
      this.pD0 = var1;
      this.pV = var2;
      this.EI0 = var3;
      this.hk0 = var4;
      if (!this.o70) {
         if (this.B1 == 0.0F && this.Zi0 == 1.0F && this.D60 == 1.0F) {
            GdxSprite var10000 = this;
            float var5 = var1 + var3;
            var3 = var2 + var4;
            float[] var7 = var10000.Sx;
            var7[0] = var1;
            var7[1] = var2;
            var7[5] = var1;
            var7[6] = var3;
            var7[10] = var5;
            var7[11] = var3;
            var7[15] = var5;
            var7[16] = var2;
         } else {
            this.o70 = true;
         }
      }
   }

   public void An(float var1, float var2) {
      this.EI0 = var1;
      this.hk0 = var2;
      if (!this.o70) {
         if (this.B1 == 0.0F && this.Zi0 == 1.0F && this.D60 == 1.0F) {
            GdxSprite var10000 = this;
            GdxSprite var10001 = this;
            float var4;
            var1 = (var4 = this.pD0) + var1;
            float var3;
            var2 = (var3 = var10001.pV) + var2;
            float[] var7 = var10000.Sx;
            var7[0] = var4;
            var7[1] = var3;
            var7[5] = var4;
            var7[6] = var2;
            var7[10] = var1;
            var7[11] = var2;
            var7[15] = var1;
            var7[16] = var3;
         } else {
            this.o70 = true;
         }
      }
   }

   public void ak0(float var1, float var2) {
      this.pD0 = var1;
      this.pV = var2;
      if (!this.o70) {
         if (this.B1 == 0.0F && this.Zi0 == 1.0F && this.D60 == 1.0F) {
            GdxSprite var10000 = this;
            GdxSprite var10002 = this;
            float var4 = var1 + this.EI0;
            float var3 = var2 + var10002.hk0;
            float[] var5 = var10000.Sx;
            var5[0] = var1;
            var5[1] = var2;
            var5[5] = var1;
            var5[6] = var3;
            var5[10] = var4;
            var5[11] = var3;
            var5[15] = var4;
            var5[16] = var2;
         } else {
            this.o70 = true;
         }
      }
   }

   public void NL0(float var1) {
      this.pD0 = var1;
      if (!this.o70) {
         if (this.B1 == 0.0F && this.Zi0 == 1.0F && this.D60 == 1.0F) {
            GdxSprite var10000 = this;
            float var2 = var1 + this.EI0;
            float[] var3 = var10000.Sx;
            var3[0] = var1;
            var3[5] = var1;
            var3[10] = var2;
            var3[15] = var2;
         } else {
            this.o70 = true;
         }
      }
   }

   public void ZJ(float var1) {
      this.pV = var1;
      if (!this.o70) {
         if (this.B1 == 0.0F && this.Zi0 == 1.0F && this.D60 == 1.0F) {
            GdxSprite var10000 = this;
            float var2 = var1 + this.hk0;
            float[] var3 = var10000.Sx;
            var3[1] = var1;
            var3[6] = var2;
            var3[11] = var2;
            var3[16] = var1;
         } else {
            this.o70 = true;
         }
      }
   }

   public final void mI(float var1, float var2) {
      this.pD0 += var1;
      this.pV += var2;
      if (!this.o70) {
         if (this.B1 == 0.0F && this.Zi0 == 1.0F && this.D60 == 1.0F) {
            float[] var10000 = this.Sx;
            var10000[0] += var1;
            var10000[1] += var2;
            var10000[5] += var1;
            var10000[6] += var2;
            var10000[10] += var1;
            var10000[11] += var2;
            var10000[15] += var1;
            var10000[16] += var2;
         } else {
            this.o70 = true;
         }
      }
   }

   public final void Wx(Color var1) {
      GdxSprite var10000 = this;
      this.UB0.set(var1);
      float var2 = var1.toFloatBits();
      float[] var3 = var10000.Sx;
      var3[2] = var2;
      var3[7] = var2;
      var3[12] = var2;
      var3[17] = var2;
   }

   public final void Ha0(float var1) {
      GdxSprite var10000 = this;
      Color var10001 = this.UB0;
      var10001.a = var1;
      float var2 = var10001.toFloatBits();
      float[] var3 = var10000.Sx;
      var3[2] = var2;
      var3[7] = var2;
      var3[12] = var2;
      var3[17] = var2;
   }

   public void FJ0(float var1, float var2) {
      this.Jn0 = var1;
      this.si = var2;
      this.o70 = true;
   }

   public float a70() {
      return this.pD0;
   }

   public float wJ0() {
      return this.pV;
   }

   public float l() {
      return this.EI0;
   }

   public float LD0() {
      return this.hk0;
   }

   public float Zu0() {
      return this.Jn0;
   }

   public float kC0() {
      return this.si;
   }

   public final void Ur0(float var1, float var2, float var3, float var4) {
      super.Ur0(var1, var2, var3, var4);
      float[] var10000 = this.Sx;
      var10000[3] = var1;
      var10000[4] = var4;
      var10000[8] = var1;
      var10000[9] = var2;
      var10000[13] = var3;
      var10000[14] = var2;
      var10000[18] = var3;
      var10000[19] = var4;
   }

   public void Wu0(boolean var1, boolean var2) {
      super.Wu0(var1, var2);
      float[] var3 = this.Sx;
      if (var1) {
         float var6 = var3[3];
         var3[3] = var3[13];
         var3[13] = var6;
         var6 = var3[8];
         var3[8] = var3[18];
         var3[18] = var6;
      }

      if (var2) {
         float[] var10000 = var3;
         float[] var10001 = var3;
         float[] var10002 = var3;
         float[] var10003 = var3;
         float[] var10004 = var3;
         float[] var10005 = var3;
         float[] var10006 = var3;
         float var4 = var3[4];
         var10005[4] = var10006[14];
         var10004[14] = var4;
         var4 = var10003[9];
         var10001[9] = var10002[19];
         var10000[19] = var4;
      }

   }

   public final void lE(float var1, float var2, float var3) {
      GdxSprite var10000 = this;
      this.UB0.set(var1, var2, var3, 1.0F);
      float var4 = this.UB0.toFloatBits();
      float[] var5 = var10000.Sx;
      var5[2] = var4;
      var5[7] = var4;
      var5[12] = var4;
      var5[17] = var4;
   }

   public void tK() {
      float[] var10000 = this.Sx;
      float var1 = var10000[4];
      var10000[4] = var10000[19];
      var10000[19] = var10000[14];
      var10000[14] = var10000[9];
      var10000[9] = var1;
      var1 = var10000[3];
      var10000[3] = var10000[18];
      var10000[18] = var10000[13];
      var10000[13] = var10000[8];
      var10000[8] = var1;
   }

   public final void jN(ui_1 var1) {
      Texture var2 = super.OB;
      if (this.o70) {
         this.o70 = false;
         float[] var3 = this.Sx;
         float var4 = -this.Jn0;
         float var5;
         float var10003 = var5 = -this.si;
         float var6 = var4 + this.EI0;
         float var7 = var10003 + this.hk0;
         float var8 = this.pD0 - var4;
         float var9 = this.pV - var5;
         float var10;
         if ((var10 = this.Zi0) != 1.0F || this.D60 != 1.0F) {
            float var10000 = var7;
            float var10001 = var6;
            var4 *= var10;
            float var21;
            var6 = var5 * (var21 = this.D60);
            var7 = var10001 * var10;
            var5 = var10000 * var21;
            var10000 = var6;
            var10001 = var7;
            var7 = var5;
            var6 = var10001;
            var5 = var10000;
         }

         if ((var10 = this.B1) != 0.0F) {
            float var10002 = var6;
            var10003 = var6;
            float var10004 = var5;
            float var10005 = var5;
            float var10006 = var4;
            float var10007 = var4;
            float var10008 = var4 = LW.gc0(var10);
            var5 = LW.Om(this.B1);
            var6 = var10007 * var10008;
            var10 = var10006 * var5;
            float var11 = var10005 * var4;
            float var12 = var10004 * var5;
            float var13 = var10003 * var4;
            float var14 = var10002 * var5;
            float var17;
            float var39 = var17 = var7 * var4;
            var10006 = var17;
            var10008 = var6;
            var4 = var7 * var5;
            var5 = var6 - var12 + var8;
            var6 = var11 + var10 + var9;
            var3[0] = var5;
            var3[1] = var6;
            var7 = var10008 - var4 + var8;
            var10 = var10006 + var10 + var9;
            var3[5] = var7;
            var3[6] = var10;
            var4 = var13 - var4 + var8;
            var39 = var8 = var39 + var14 + var9;
            var3[10] = var4;
            var3[11] = var8;
            var3[15] = var4 - var7 + var5;
            var3[16] = var39 - (var10 - var6);
         } else {
            float[] var37 = var3;
            float[] var41 = var3;
            float[] var42 = var3;
            float[] var44 = var3;
            float[] var45 = var3;
            float[] var46 = var3;
            float[] var48 = var3;
            float[] var49 = var3;
            float var15 = var4 + var8;
            var4 = var5 + var9;
            var5 = var6 + var8;
            var6 = var7 + var9;
            var49[0] = var15;
            var48[1] = var4;
            var46[5] = var15;
            var45[6] = var6;
            var44[10] = var5;
            var42[11] = var6;
            var41[15] = var5;
            var37[16] = var4;
         }
      }

      var1.Il0(var2, this.Sx, 20);
   }
}
