package com.badlogic.gdx.graphics.g3d.particles.values;

import f.LW;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public class RangedNumericValue extends ParticleValue {
   private float lowMin;
   private float lowMax;

   public float newLowValue() {
      RangedNumericValue var10000 = this;
      float var1 = this.lowMin;
      float var2 = var10000.lowMax - var1;
      return LW.Yu.nextFloat() * var2 + var1;
   }

   public void setLow(float var1) {
      this.lowMin = var1;
      this.lowMax = var1;
   }

   public void setLow(float var1, float var2) {
      this.lowMin = var1;
      this.lowMax = var2;
   }

   public float getLowMin() {
      return this.lowMin;
   }

   public void setLowMin(float var1) {
      this.lowMin = var1;
   }

   public float getLowMax() {
      return this.lowMax;
   }

   public void setLowMax(float var1) {
      this.lowMax = var1;
   }

   public void load(RangedNumericValue var1) {
      super.load(var1);
      this.lowMax = var1.lowMax;
      this.lowMin = var1.lowMin;
   }

   public void write(gp_1 var1) {
      super.write(var1);
      var1.v80(this.lowMin, "lowMin");
      var1.v80(this.lowMax, "lowMax");
   }

   public void read(gp_1 var1, oe_0 var2) {
      RangedNumericValue var10000 = this;
      gp_1 var10001 = var1;
      RangedNumericValue var10003 = this;
      gp_1 var10004 = var1;
      super.read(var1, var2);
      String var3 = "lowMin";
      Class var5 = Float.TYPE;
      var10003.lowMin = (Float)h4_0.Lpt6(var10004, var2, var3, var5, (Class)null);
      oe_0 var4 = var2.Is("lowMax");
      var10000.lowMax = (Float)var10001.b20(var5, (Class)null, var4);
   }
}
