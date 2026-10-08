package com.badlogic.gdx.graphics.g3d.particles.values;

import f.fe_2;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public class GradientColorValue extends ParticleValue {
   private static float[] temp = new float[3];
   private float[] colors;
   public float[] timeline;

   public GradientColorValue() {
      super();
      this.colors = new float[]{1.0F, 1.0F, 1.0F};
      this.timeline = new float[]{0.0F};
   }

   public float[] getTimeline() {
      return this.timeline;
   }

   public void setTimeline(float[] var1) {
      this.timeline = var1;
   }

   public float[] getColors() {
      return this.colors;
   }

   public void setColors(float[] var1) {
      this.colors = var1;
   }

   public float[] getColor(float var1) {
      this.getColor(var1, temp, 0);
      return temp;
   }

   public void getColor(float var1, float[] var2, int var3) {
      int var4 = 0;
      int var5 = -1;
      float[] var6;
      int var7 = (var6 = this.timeline).length;
      int var8 = 1;
      int var10000 = var8;
      var8 = var4;

      for(int var15 = var10000; var15 < var7; var15 = var10000) {
         if (var6[var15] > var1) {
            var5 = var15;
            break;
         }

         var8 = var15 + 1;
         var10000 = var8;
         var8 = var15;
      }

      GradientColorValue var10001 = this;
      float var10 = var6[var8];
      var4 = var8 * 3;
      float[] var18;
      float[] var23 = var18 = var10001.colors;
      int var10002 = var4;
      int var10004 = var4;
      float var17 = var18[var4];
      float var21 = var18[var10004 + 1];
      float var9 = var23[var10002 + 2];
      if (var5 == -1) {
         var2[var3] = var17;
         var2[var3 + 1] = var21;
         var2[var3 + 2] = var9;
      } else {
         var10 = (var1 - var10) / (var6[var5] - var10);
         int var12;
         var10002 = var12 = var5 * 3;
         int var10005 = var12;
         var2[var3] = fe_2.Ga0(var18[var12], var17, var10, var17);
         var12 = var3 + 1;
         var2[var12] = fe_2.Ga0(var18[var10005 + 1], var21, var10, var21);
         var12 = var3 + 2;
         var2[var12] = fe_2.Ga0(var18[var10002 + 2], var9, var10, var9);
      }
   }

   public void write(gp_1 var1) {
      super.write(var1);
      var1.v80(this.colors, "colors");
      var1.v80(this.timeline, "timeline");
   }

   public void read(gp_1 var1, oe_0 var2) {
      GradientColorValue var10000 = this;
      gp_1 var10001 = var1;
      super.read(var1, var2);
      this.colors = (float[])h4_0.Lpt6(var1, var2, "colors", float[].class, (Class)null);
      Class var3 = float[].class;
      oe_0 var4 = var2.Is("timeline");
      var10000.timeline = (float[])var10001.b20(var3, (Class)null, var4);
   }

   public void load(GradientColorValue var1) {
      GradientColorValue var10000 = var1;
      GradientColorValue var10001 = this;
      GradientColorValue var10002 = var1;
      super.load(var1);
      float[] var2;
      this.colors = var2 = new float[var1.colors.length];
      float[] var10003 = var1.colors;
      int var4 = var2.length;
      System.arraycopy(var10003, 0, var2, 0, var4);
      float[] var3;
      var10001.timeline = var3 = new float[var10002.timeline.length];
      float[] var6 = var10000.timeline;
      var4 = var3.length;
      System.arraycopy(var6, 0, var3, 0, var4);
   }
}
