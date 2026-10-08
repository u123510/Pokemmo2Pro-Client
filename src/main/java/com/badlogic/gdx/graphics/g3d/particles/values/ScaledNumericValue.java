package com.badlogic.gdx.graphics.g3d.particles.values;

import f.LW;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public class ScaledNumericValue extends RangedNumericValue {
   private float[] scaling;
   public float[] timeline;
   private float highMin;
   private float highMax;
   private boolean relative;

   public ScaledNumericValue() {
      super();
      this.scaling = new float[]{1.0F};
      this.timeline = new float[]{0.0F};
      this.relative = false;
   }

   public float newHighValue() {
      ScaledNumericValue var10000 = this;
      float var1 = this.highMin;
      float var2 = var10000.highMax - var1;
      return LW.Yu.nextFloat() * var2 + var1;
   }

   public void setHigh(float var1) {
      this.highMin = var1;
      this.highMax = var1;
   }

   public void setHigh(float var1, float var2) {
      this.highMin = var1;
      this.highMax = var2;
   }

   public float getHighMin() {
      return this.highMin;
   }

   public void setHighMin(float var1) {
      this.highMin = var1;
   }

   public float getHighMax() {
      return this.highMax;
   }

   public void setHighMax(float var1) {
      this.highMax = var1;
   }

   public float[] getScaling() {
      return this.scaling;
   }

   public void setScaling(float[] var1) {
      this.scaling = var1;
   }

   public float[] getTimeline() {
      return this.timeline;
   }

   public void setTimeline(float[] var1) {
      this.timeline = var1;
   }

   public boolean isRelative() {
      return this.relative;
   }

   public void setRelative(boolean var1) {
      this.relative = var1;
   }

   public float getScale(float var1) {
      int var2 = -1;
      int var3 = this.timeline.length;

      for(int var4 = 1; var4 < var3; ++var4) {
         if (this.timeline[var4] > var1) {
            var2 = var4;
            break;
         }
      }

      if (var2 == -1) {
         return this.scaling[var3 - 1];
      } else {
         int var6 = var2 - 1;
         float[] var8;
         float[] var10001 = var8 = this.scaling;
         float var5 = var8[var6];
         float var7 = (var8 = this.timeline)[var6];
         float var10 = var10001[var2] - var5;
         return (var1 - var7) / (var8[var2] - var7) * var10 + var5;
      }
   }

   public void load(ScaledNumericValue var1) {
      ScaledNumericValue var10000 = this;
      ScaledNumericValue var10001 = var1;
      ScaledNumericValue var10002 = var1;
      ScaledNumericValue var10003 = this;
      ScaledNumericValue var10004 = var1;
      super.load(var1);
      this.highMax = var1.highMax;
      this.highMin = var1.highMin;
      float[] var2;
      this.scaling = var2 = new float[var1.scaling.length];
      float[] var10005 = var1.scaling;
      int var4 = var2.length;
      System.arraycopy(var10005, 0, var2, 0, var4);
      float[] var3;
      var10003.timeline = var3 = new float[var10004.timeline.length];
      float[] var6 = var10002.timeline;
      var4 = var3.length;
      System.arraycopy(var6, 0, var3, 0, var4);
      var10000.relative = var10001.relative;
   }

   public void write(gp_1 var1) {
      super.write(var1);
      var1.v80(this.highMin, "highMin");
      var1.v80(this.highMax, "highMax");
      var1.v80(this.relative, "relative");
      var1.v80(this.scaling, "scaling");
      var1.v80(this.timeline, "timeline");
   }

   public void read(gp_1 var1, oe_0 var2) {
      ScaledNumericValue var10000 = this;
      gp_1 var10001 = var1;
      ScaledNumericValue var10003 = this;
      gp_1 var10004 = var1;
      ScaledNumericValue var10006 = this;
      gp_1 var10007 = var1;
      ScaledNumericValue var10009 = this;
      gp_1 var10010 = var1;
      super.read(var1, var2);
      Class var3;
      this.highMin = (Float)h4_0.Lpt6(var1, var2, "highMin", var3 = Float.TYPE, (Class)null);
      oe_0 var7 = var2.Is("highMax");
      var10009.highMax = (Float)var10010.b20(var3, (Class)null, var7);
      Class var4 = Boolean.TYPE;
      var7 = var2.Is("relative");
      var10006.relative = (Boolean)var10007.b20(var4, (Class)null, var7);
      var4 = float[].class;
      var7 = var2.Is("scaling");
      var10003.scaling = (float[])var10004.b20(var4, (Class)null, var7);
      var4 = float[].class;
      var7 = var2.Is("timeline");
      var10000.timeline = (float[])var10001.b20(var4, (Class)null, var7);
   }
}
