package cn.pokemmo.graphics.gdx.texture;

import f.*;


public class GdxSpriteEffectNode extends bn_0 {
   public he_2 lE0;
   public boolean R5;
   public final boolean as;
   public float Fp0;
   public final b2_0 CA0;
   public final b2_0 O3;
   public final b2_0 pd0;
   public final Bp0 U1;
   public final Bp0 O20;

   public GdxSpriteEffectNode(float var1, A3 var2) {
      this(var1, (he_2)var2.NQ(he_2.class));
   }

   public GdxSpriteEffectNode(float var1, A3 var2, String var3) {
      this(var1, (he_2)var2.Ip(he_2.class, var3));
   }

   public GdxSpriteEffectNode(float var1, he_2 var2) {
      super();
      this.as = true;
      this.CA0 = new b2_0(0.0F, 0.0F, 0.0F);
      this.O3 = new b2_0(0.0F, 0.0F, 0.0F);
      this.pd0 = new b2_0(0.0F, 0.0F, 0.0F);
      this.U1 = new Bp0();
      this.O20 = new Bp0();
      if (var1 < 0.0F) {
         throw new IllegalArgumentException("deadzoneRadius must be > 0");
      }

      this.Fp0 = var1;
      this.U1.FF(this.Xk0() / 2.0F, this.FE0() / 2.0F);
      this.h80(var2);
      this.DC(this.uq0(), this.Tn0());
      this.wF0(new fh0_0(this));
   }

   public final void Zb(float var1, float var2, boolean var3) {
      float oldU1X = this.U1.x;
      float oldU1Y = this.U1.y;
      float oldO20X = this.O20.x;
      float oldO20Y = this.O20.y;
      float centerX = this.CA0.ID0;
      float centerY = this.CA0.uQ;

      this.U1.x = centerX;
      this.U1.y = centerY;
      this.O20.x = 0.0F;
      this.O20.y = 0.0F;
      if (!var3 && !this.pd0.XK(var1, var2)) {
         float radius = this.CA0.vX;
         float normalizedX = (var1 - centerX) / radius;
         float normalizedY = (var2 - centerY) / radius;
         this.O20.x = normalizedX;
         this.O20.y = normalizedY;
         float length = (float)Math.sqrt(normalizedX * normalizedX + normalizedY * normalizedY);
         if (length > 1.0F) {
            float scale = 1.0F / length;
            this.O20.x *= scale;
            this.O20.y *= scale;
         }

         if (this.CA0.XK(var1, var2)) {
            this.U1.x = var1;
            this.U1.y = var2;
         } else {
            float directionLength = (float)Math.sqrt(this.O20.x * this.O20.x + this.O20.y * this.O20.y);
            if (directionLength != 0.0F) {
               this.O20.x /= directionLength;
               this.O20.y /= directionLength;
            }

            this.U1.x = this.O20.x * radius + centerX;
            this.U1.y = this.O20.y * radius + centerY;
         }
      }

      if (oldO20X != this.O20.x || oldO20Y != this.O20.y) {
         qk_0 var8 = (qk_0)UE0.TL0(qk_0.class).obtain();
         if (this.LC(var8)) {
            this.O20.x = oldO20X;
            this.O20.y = oldO20Y;
            this.U1.x = oldU1X;
            this.U1.y = oldU1Y;
         }

         UE0.P3(var8);
      }
   }

   public final void h80(he_2 var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("style cannot be null");
      }

      this.lE0 = var1;
      this.KE0();
   }

   @Override
   public final te0_0 nX(float var1, float var2, boolean var3) {
      if (var3 && this.nx0 != cs_0.FU) {
         return null;
      }

      if (!this.On0 || !this.O3.XK(var1, var2)) {
         return null;
      }

      return this;
   }

   @Override
   public final void Od() {
      float halfWidth = this.E20 / 2.0F;
      float halfHeight = this.TK0 / 2.0F;
      float radius = Math.min(halfWidth, halfHeight);
      this.O3.ID0 = halfWidth;
      this.O3.uQ = halfHeight;
      this.O3.vX = radius;

      YA border = this.lE0.wH;
      if (border != null) {
         radius -= Math.max(((br_1)border).wv, ((br_1)border).u1) / 2.0F;
      }

      this.CA0.ID0 = halfWidth;
      this.CA0.uQ = halfHeight;
      this.CA0.vX = radius;
      this.pd0.ID0 = halfWidth;
      this.pd0.uQ = halfHeight;
      this.pd0.vX = this.Fp0;
      this.U1.x = halfWidth;
      this.U1.y = halfHeight;
      this.O20.x = 0.0F;
      this.O20.y = 0.0F;
   }

   @Override
   public final void BS(ui_1 var1, float var2) {
      this.PD0();
      com.badlogic.gdx.graphics.Color var3 = this.dC;
      var1.TJ0(var3.r, var3.g, var3.b, var3.a * var2);
      float x = this.cM0;
      float y = this.iG;
      float width = this.E20;
      float height = this.TK0;
      YA background = this.lE0.va0;
      if (background != null) {
         background.Xd(var1, x, y, width, height);
      }

      YA knob = this.lE0.wH;
      if (knob != null) {
         br_1 style = (br_1)knob;
         knob.Xd(var1, x + this.U1.x - style.wv / 2.0F, y + this.U1.y - style.u1 / 2.0F, style.wv, style.u1);
      }
   }

   public final float uq0() {
      YA var1 = this.lE0.va0;
      return var1 == null ? 0.0F : ((br_1)var1).wv;
   }

   public final float Tn0() {
      YA var1 = this.lE0.va0;
      return var1 == null ? 0.0F : ((br_1)var1).u1;
   }
}
