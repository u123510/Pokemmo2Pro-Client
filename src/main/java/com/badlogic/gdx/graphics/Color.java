package com.badlogic.gdx.graphics;

import f.fe_2;

public class Color {
   public static final Color WHITE;
   public static final Color LIGHT_GRAY;
   public static final Color GRAY;
   public static final Color DARK_GRAY;
   public static final Color BLACK;
   public static final float WHITE_FLOAT_BITS;
   public static final Color CLEAR;
   public static final Color BLUE;
   public static final Color NAVY;
   public static final Color ROYAL;
   public static final Color SLATE;
   public static final Color SKY;
   public static final Color CYAN;
   public static final Color TEAL;
   public static final Color GREEN;
   public static final Color CHARTREUSE;
   public static final Color LIME;
   public static final Color FOREST;
   public static final Color OLIVE;
   public static final Color YELLOW;
   public static final Color GOLD;
   public static final Color GOLDENROD;
   public static final Color ORANGE;
   public static final Color BROWN;
   public static final Color TAN;
   public static final Color FIREBRICK;
   public static final Color RED;
   public static final Color SCARLET;
   public static final Color CORAL;
   public static final Color SALMON;
   public static final Color PINK;
   public static final Color MAGENTA;
   public static final Color PURPLE;
   public static final Color VIOLET;
   public static final Color MAROON;
   public float r;
   public float g;
   public float b;
   public float a;

   public Color() {
   }

   public Color(int var1) {
      rgba8888ToColor(this, var1);
   }

   public Color(float var1, float var2, float var3, float var4) {
      this.r = var1;
      this.g = var2;
      this.b = var3;
      this.a = var4;
      this.clamp();
   }

   public Color(Color var1) {
      this.set(var1);
   }

   public static Color valueOf(String var0) {
      return valueOf(var0, new Color());
   }

   public static Color valueOf(String var0, Color var1) {
      if (var0.charAt(0) == '#') {
         var0 = var0.substring(1);
      }

      var1.r = (float)Integer.parseInt(var0.substring(0, 2), 16) / 255.0F;
      var1.g = (float)Integer.parseInt(var0.substring(2, 4), 16) / 255.0F;
      var1.b = (float)Integer.parseInt(var0.substring(4, 6), 16) / 255.0F;
      float var2;
      if (var0.length() != 8) {
         var2 = 1.0F;
      } else {
         var2 = (float)Integer.parseInt(var0.substring(6, 8), 16) / 255.0F;
      }

      var1.a = var2;
      return var1;
   }

   public static float toFloatBits(int var0, int var1, int var2, int var3) {
      return Float.intBitsToFloat((var3 << 24 | var2 << 16 | var1 << 8 | var0) & -16777217);
   }

   public static float toFloatBits(float var0, float var1, float var2, float var3) {
      return Float.intBitsToFloat(((int)(var3 * 255.0F) << 24 | (int)(var2 * 255.0F) << 16 | (int)(var1 * 255.0F) << 8 | (int)(var0 * 255.0F)) & -16777217);
   }

   public static int toIntBits(int var0, int var1, int var2, int var3) {
      return var3 << 24 | var2 << 16 | var1 << 8 | var0;
   }

   public static int alpha(float var0) {
      return (int)(var0 * 255.0F);
   }

   public static int luminanceAlpha(float var0, float var1) {
      return (int)(var0 * 255.0F) << 8 | (int)(var1 * 255.0F);
   }

   public static int rgb565(float var0, float var1, float var2) {
      return (int)(var0 * 31.0F) << 11 | (int)(var1 * 63.0F) << 5 | (int)(var2 * 31.0F);
   }

   public static int rgba4444(float var0, float var1, float var2, float var3) {
      return (int)(var0 * 15.0F) << 12 | (int)(var1 * 15.0F) << 8 | (int)(var2 * 15.0F) << 4 | (int)(var3 * 15.0F);
   }

   public static int rgb888(float var0, float var1, float var2) {
      return (int)(var0 * 255.0F) << 16 | (int)(var1 * 255.0F) << 8 | (int)(var2 * 255.0F);
   }

   public static int rgba8888(float var0, float var1, float var2, float var3) {
      return (int)(var0 * 255.0F) << 24 | (int)(var1 * 255.0F) << 16 | (int)(var2 * 255.0F) << 8 | (int)(var3 * 255.0F);
   }

   public static int argb8888(float var0, float var1, float var2, float var3) {
      return (int)(var0 * 255.0F) << 24 | (int)(var1 * 255.0F) << 16 | (int)(var2 * 255.0F) << 8 | (int)(var3 * 255.0F);
   }

   public static int rgb565(Color var0) {
      return (int)(var0.r * 31.0F) << 11 | (int)(var0.g * 63.0F) << 5 | (int)(var0.b * 31.0F);
   }

   public static int rgba4444(Color var0) {
      return (int)(var0.r * 15.0F) << 12 | (int)(var0.g * 15.0F) << 8 | (int)(var0.b * 15.0F) << 4 | (int)(var0.a * 15.0F);
   }

   public static int rgb888(Color var0) {
      return (int)(var0.r * 255.0F) << 16 | (int)(var0.g * 255.0F) << 8 | (int)(var0.b * 255.0F);
   }

   public static int rgba8888(Color var0) {
      return (int)(var0.r * 255.0F) << 24 | (int)(var0.g * 255.0F) << 16 | (int)(var0.b * 255.0F) << 8 | (int)(var0.a * 255.0F);
   }

   public static int argb8888(Color var0) {
      return (int)(var0.a * 255.0F) << 24 | (int)(var0.r * 255.0F) << 16 | (int)(var0.g * 255.0F) << 8 | (int)(var0.b * 255.0F);
   }

   public static void rgb565ToColor(Color var0, int var1) {
      var0.r = (float)((var1 & '\uf800') >>> 11) / 31.0F;
      var0.g = (float)((var1 & 2016) >>> 5) / 63.0F;
      var0.b = (float)(var1 & 31) / 31.0F;
   }

   public static void rgba4444ToColor(Color var0, int var1) {
      var0.r = (float)((var1 & '\uf000') >>> 12) / 15.0F;
      var0.g = (float)((var1 & 3840) >>> 8) / 15.0F;
      var0.b = (float)((var1 & 240) >>> 4) / 15.0F;
      var0.a = (float)(var1 & 15) / 15.0F;
   }

   public static void rgb888ToColor(Color var0, int var1) {
      var0.r = (float)((var1 & 16711680) >>> 16) / 255.0F;
      var0.g = (float)((var1 & '\uff00') >>> 8) / 255.0F;
      var0.b = (float)(var1 & 255) / 255.0F;
   }

   public static void rgba8888ToColor(Color var0, int var1) {
      var0.r = (float)((var1 & -16777216) >>> 24) / 255.0F;
      var0.g = (float)((var1 & 16711680) >>> 16) / 255.0F;
      var0.b = (float)((var1 & '\uff00') >>> 8) / 255.0F;
      var0.a = (float)(var1 & 255) / 255.0F;
   }

   public static void argb8888ToColor(Color var0, int var1) {
      var0.a = (float)((var1 & -16777216) >>> 24) / 255.0F;
      var0.r = (float)((var1 & 16711680) >>> 16) / 255.0F;
      var0.g = (float)((var1 & '\uff00') >>> 8) / 255.0F;
      var0.b = (float)(var1 & 255) / 255.0F;
   }

   public static void abgr8888ToColor(Color var0, int var1) {
      var0.a = (float)((var1 & -16777216) >>> 24) / 255.0F;
      var0.b = (float)((var1 & 16711680) >>> 16) / 255.0F;
      var0.g = (float)((var1 & '\uff00') >>> 8) / 255.0F;
      var0.r = (float)(var1 & 255) / 255.0F;
   }

   public static void abgr8888ToColor(Color var0, float var1) {
      int var10001 = Float.floatToRawIntBits(var1);
      int var2;
      var10001 = var2 = var10001 | (int)((float)(var10001 >>> 24) * 1.003937F) << 24;
      var0.a = (float)((var2 & -16777216) >>> 24) / 255.0F;
      var0.b = (float)((var2 & 16711680) >>> 16) / 255.0F;
      var0.g = (float)((var2 & '\uff00') >>> 8) / 255.0F;
      var0.r = (float)(var10001 & 255) / 255.0F;
   }

   static {
      Color var10000 = WHITE = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      LIGHT_GRAY = new Color(-1077952513);
      GRAY = new Color(2139062271);
      DARK_GRAY = new Color(1061109759);
      BLACK = new Color(0.0F, 0.0F, 0.0F, 1.0F);
      WHITE_FLOAT_BITS = var10000.toFloatBits();
      CLEAR = new Color(0.0F, 0.0F, 0.0F, 0.0F);
      BLUE = new Color(0.0F, 0.0F, 1.0F, 1.0F);
      NAVY = new Color(0.0F, 0.0F, 0.5F, 1.0F);
      ROYAL = new Color(1097458175);
      SLATE = new Color(1887473919);
      SKY = new Color(-2016482305);
      CYAN = new Color(0.0F, 1.0F, 1.0F, 1.0F);
      TEAL = new Color(0.0F, 0.5F, 0.5F, 1.0F);
      GREEN = new Color(16711935);
      CHARTREUSE = new Color(2147418367);
      LIME = new Color(852308735);
      FOREST = new Color(579543807);
      OLIVE = new Color(1804477439);
      YELLOW = new Color(-65281);
      GOLD = new Color(-2686721);
      GOLDENROD = new Color(-626712321);
      ORANGE = new Color(-5963521);
      BROWN = new Color(-1958407169);
      TAN = new Color(-759919361);
      FIREBRICK = new Color(-1306385665);
      RED = new Color(-16776961);
      SCARLET = new Color(-13361921);
      CORAL = new Color(-8433409);
      SALMON = new Color(-92245249);
      PINK = new Color(-9849601);
      MAGENTA = new Color(1.0F, 0.0F, 1.0F, 1.0F);
      PURPLE = new Color(-1608453889);
      VIOLET = new Color(-293409025);
      MAROON = new Color(-1339006721);
   }

   public Color set(Color var1) {
      this.r = var1.r;
      this.g = var1.g;
      this.b = var1.b;
      this.a = var1.a;
      return this;
   }

   public Color mul(Color var1) {
      this.r *= var1.r;
      this.g *= var1.g;
      this.b *= var1.b;
      this.a *= var1.a;
      return this.clamp();
   }

   public Color mul(float var1) {
      this.r *= var1;
      this.g *= var1;
      this.b *= var1;
      this.a *= var1;
      return this.clamp();
   }

   public Color add(Color var1) {
      this.r += var1.r;
      this.g += var1.g;
      this.b += var1.b;
      this.a += var1.a;
      return this.clamp();
   }

   public Color sub(Color var1) {
      this.r -= var1.r;
      this.g -= var1.g;
      this.b -= var1.b;
      this.a -= var1.a;
      return this.clamp();
   }

   public Color clamp() {
      float var1;
      if ((var1 = this.r) < 0.0F) {
         this.r = 0.0F;
      } else if (var1 > 1.0F) {
         this.r = 1.0F;
      }

      if ((var1 = this.g) < 0.0F) {
         this.g = 0.0F;
      } else if (var1 > 1.0F) {
         this.g = 1.0F;
      }

      if ((var1 = this.b) < 0.0F) {
         this.b = 0.0F;
      } else if (var1 > 1.0F) {
         this.b = 1.0F;
      }

      if ((var1 = this.a) < 0.0F) {
         this.a = 0.0F;
      } else if (var1 > 1.0F) {
         this.a = 1.0F;
      }

      return this;
   }

   public Color set(float var1, float var2, float var3, float var4) {
      this.r = var1;
      this.g = var2;
      this.b = var3;
      this.a = var4;
      return this.clamp();
   }

   public Color set(int var1) {
      rgba8888ToColor(this, var1);
      return this;
   }

   public Color add(float var1, float var2, float var3, float var4) {
      this.r += var1;
      this.g += var2;
      this.b += var3;
      this.a += var4;
      return this.clamp();
   }

   public Color sub(float var1, float var2, float var3, float var4) {
      this.r -= var1;
      this.g -= var2;
      this.b -= var3;
      this.a -= var4;
      return this.clamp();
   }

   public Color mul(float var1, float var2, float var3, float var4) {
      this.r *= var1;
      this.g *= var2;
      this.b *= var3;
      this.a *= var4;
      return this.clamp();
   }

   public Color lerp(Color var1, float var2) {
      Color var10000 = this;
      Color var10001 = this;
      Color var10003 = this;
      Color var10004 = this;
      Color var10006 = this;
      Color var10007 = this;
      Color var10009 = this;
      Color var10010 = this;
      float var3 = this.r;
      var10010.r = fe_2.Ga0(var1.r, var3, var2, var3);
      var3 = var10009.g;
      var10007.g = fe_2.Ga0(var1.g, var3, var2, var3);
      var3 = var10006.b;
      var10004.b = fe_2.Ga0(var1.b, var3, var2, var3);
      var3 = var10003.a;
      var10001.a = fe_2.Ga0(var1.a, var3, var2, var3);
      return var10000.clamp();
   }

   public Color lerp(float var1, float var2, float var3, float var4, float var5) {
      float var10012 = this.r;
      this.r = fe_2.Ga0(var1, var10012, var5, var10012);
      float var10009 = this.g;
      this.g = fe_2.Ga0(var2, var10009, var5, var10009);
      float var10006 = this.b;
      this.b = fe_2.Ga0(var3, var10006, var5, var10006);
      float var10003 = this.a;
      this.a = fe_2.Ga0(var4, var10003, var5, var10003);
      return this.clamp();
   }

   public Color premultiplyAlpha() {
      Color var10000 = this;
      Color var10001 = this;
      Color var10002 = this;
      Color var10003 = this;
      Color var10004 = this;
      float var1;
      this.r *= var1 = this.a;
      var10003.g = var10004.g * var1;
      var10001.b = var10002.b * var1;
      return var10000;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Color var10000 = this;
         Color color = (Color)var1;
         return var10000.toIntBits() == color.toIntBits();
      } else {
         return false;
      }
   }

   public int hashCode() {
      float var1;
      int var4;
      if ((var1 = this.r) != 0.0F) {
         var4 = Float.floatToIntBits(var1);
      } else {
         var4 = 0;
      }

      var4 *= 31;
      float var2;
      int var9;
      if ((var2 = this.g) != 0.0F) {
         var9 = Float.floatToIntBits(var2);
      } else {
         var9 = 0;
      }

      var4 = (var4 + var9) * 31;
      float var10;
      int var11;
      if ((var10 = this.b) != 0.0F) {
         var11 = Float.floatToIntBits(var10);
      } else {
         var11 = 0;
      }

      Color var10000 = this;
      int var3 = (var4 + var11) * 31;
      float var7;
      int var8;
      if ((var7 = var10000.a) != 0.0F) {
         var8 = Float.floatToIntBits(var7);
      } else {
         var8 = 0;
      }

      return var3 + var8;
   }

   public float toFloatBits() {
      return Float.intBitsToFloat(((int)(this.a * 255.0F) << 24 | (int)(this.b * 255.0F) << 16 | (int)(this.g * 255.0F) << 8 | (int)(this.r * 255.0F)) & -16777217);
   }

   public int toIntBits() {
      return (int)(this.a * 255.0F) << 24 | (int)(this.b * 255.0F) << 16 | (int)(this.g * 255.0F) << 8 | (int)(this.r * 255.0F);
   }

   public String toString() {
      String var1;
      for(var1 = Integer.toHexString((int)(this.r * 255.0F) << 24 | (int)(this.g * 255.0F) << 16 | (int)(this.b * 255.0F) << 8 | (int)(this.a * 255.0F)); var1.length() < 8; var1 = "0".concat(var1)) {
      }

      return var1;
   }

   public Color fromHsv(float var1, float var2, float var3) {
      int var4;
      float var6;
      int var10000 = var4 = (int)(var6 = (var1 / 60.0F + 6.0F) % 6.0F);
      float var10002 = var1 = var6 - (float)var4;
      float var9 = (1.0F - var2) * var3;
      float var5 = (1.0F - var2 * var10002) * var3;
      var1 = (1.0F - (1.0F - var1) * var2) * var3;
      switch (var10000) {
         case 0:
            this.r = var3;
            this.g = var1;
            this.b = var9;
            break;
         case 1:
            this.r = var5;
            this.g = var3;
            this.b = var9;
            break;
         case 2:
            this.r = var9;
            this.g = var3;
            this.b = var1;
            break;
         case 3:
            this.r = var9;
            this.g = var5;
            this.b = var3;
            break;
         case 4:
            this.r = var1;
            this.g = var9;
            this.b = var3;
            break;
         default:
            this.r = var3;
            this.g = var9;
            this.b = var5;
      }

      return this.clamp();
   }

   public Color fromHsv(float[] var1) {
      Color var10000 = this;
      float[] var10001 = var1;
      float var3 = var1[0];
      float var4 = var1[1];
      float var2 = var10001[2];
      return var10000.fromHsv(var3, var4, var2);
   }

   public float[] toHsv(float[] var1) {
      float var2;
      float var3;
      float var4;
      if ((var4 = (var2 = Math.max(Math.max(this.r, this.g), this.b)) - (var3 = Math.min(Math.min(this.r, this.g), this.b))) == 0.0F) {
         var1[0] = 0.0F;
      } else {
         float var5;
         if (var2 == (var5 = this.r)) {
            var1[0] = ((this.g - this.b) * 60.0F / var4 + 360.0F) % 360.0F;
         } else {
            float var6;
            if (var2 == (var6 = this.g)) {
               var1[0] = (this.b - var5) * 60.0F / var4 + 120.0F;
            } else {
               var1[0] = (var5 - var6) * 60.0F / var4 + 240.0F;
            }
         }
      }

      if (var2 > 0.0F) {
         var1[1] = 1.0F - var3 / var2;
      } else {
         var1[1] = 0.0F;
      }

      var1[2] = var2;
      return var1;
   }

   public Color cpy() {
      return new Color(this);
   }
}
