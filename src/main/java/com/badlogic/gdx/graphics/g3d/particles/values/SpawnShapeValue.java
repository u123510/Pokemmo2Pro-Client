package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import f.C8;
import f.gp_1;
import f.h4_0;
import f.hd0_2;
import f.oe_0;

public abstract class SpawnShapeValue extends ParticleValue implements ResourceData.Configurable {
   public RangedNumericValue xOffsetValue;
   public RangedNumericValue yOffsetValue;
   public RangedNumericValue zOffsetValue;

   public SpawnShapeValue() {
      super();
      this.xOffsetValue = new RangedNumericValue();
      this.yOffsetValue = new RangedNumericValue();
      this.zOffsetValue = new RangedNumericValue();
   }

   public SpawnShapeValue(SpawnShapeValue var1) {
      this();
   }

   public abstract void spawnAux(C8 var1, float var2);

   public final C8 spawn(C8 var1, float var2) {
      this.spawnAux(var1, var2);
      RangedNumericValue var5;
      if ((var5 = this.xOffsetValue).active) {
         RangedNumericValue var10001 = var5;
         float var6 = var1.x;
         var1.x = var10001.newLowValue() + var6;
      }

      if ((var5 = this.yOffsetValue).active) {
         RangedNumericValue var9 = var5;
         float var8 = var1.y;
         var1.y = var9.newLowValue() + var8;
      }

      RangedNumericValue var3;
      if ((var3 = this.zOffsetValue).active) {
         RangedNumericValue var10 = var3;
         float var4 = var1.z;
         var1.z = var10.newLowValue() + var4;
      }

      return var1;
   }

   public void init() {
   }

   public void start() {
   }

   public void load(ParticleValue var1) {
      super.load(var1);
      SpawnShapeValue shape = (SpawnShapeValue)var1;
      this.xOffsetValue.load(shape.xOffsetValue);
      this.yOffsetValue.load(shape.yOffsetValue);
      this.zOffsetValue.load(shape.zOffsetValue);
   }

   public abstract SpawnShapeValue copy();

   public void write(gp_1 var1) {
      super.write(var1);
      var1.v80(this.xOffsetValue, "xOffsetValue");
      var1.v80(this.yOffsetValue, "yOffsetValue");
      var1.v80(this.zOffsetValue, "zOffsetValue");
   }

   public void read(gp_1 var1, oe_0 var2) {
      SpawnShapeValue var10000 = this;
      gp_1 var10001 = var1;
      SpawnShapeValue var10003 = this;
      gp_1 var10004 = var1;
      super.read(var1, var2);
      this.xOffsetValue = (RangedNumericValue)h4_0.Lpt6(var1, var2, "xOffsetValue", RangedNumericValue.class, (Class)null);
      Class var3 = RangedNumericValue.class;
      oe_0 var5 = var2.Is("yOffsetValue");
      var10003.yOffsetValue = (RangedNumericValue)var10004.b20(var3, (Class)null, var5);
      var3 = RangedNumericValue.class;
      var5 = var2.Is("zOffsetValue");
      var10000.zOffsetValue = (RangedNumericValue)var10001.b20(var3, (Class)null, var5);
   }

   public void save(hd0_2 var1, ResourceData var2) {
   }

   public void load(hd0_2 var1, ResourceData var2) {
   }
}
