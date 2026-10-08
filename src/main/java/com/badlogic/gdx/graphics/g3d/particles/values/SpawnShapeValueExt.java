package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import f.C8;
import f.gp_1;
import f.h4_0;
import f.hd0_2;
import f.oe_0;

public abstract class SpawnShapeValueExt extends ParticleValue implements ResourceData.Configurable {
   public RangedNumericValueExt xOffsetValue;
   public RangedNumericValueExt yOffsetValue;
   public RangedNumericValueExt zOffsetValue;
   public LongNumericValue seed;

   public SpawnShapeValueExt() {
      this.xOffsetValue = new RangedNumericValueExt();
      this.yOffsetValue = new RangedNumericValueExt();
      this.zOffsetValue = new RangedNumericValueExt();
      (this.seed = new LongNumericValue()).setValue(System.nanoTime());
   }

   public SpawnShapeValueExt(SpawnShapeValueExt var1) {
      this();
   }

   public void reSeed() {
      if (this.seed.isActive()) {
         this.xOffsetValue.setSeed(this.seed.getValue());
         this.yOffsetValue.setSeed(this.seed.getValue());
         this.zOffsetValue.setSeed(this.seed.getValue());
      }

   }

   public abstract void spawnAux(C8 var1, float var2);

   public final C8 spawn(C8 var1, float var2) {
      this.spawnAux(var1, var2);
      RangedNumericValueExt var5;
      if ((var5 = this.xOffsetValue).active) {
         RangedNumericValueExt var10001 = var5;
         float var6 = var1.x;
         var1.x = var10001.newLowValue() + var6;
      }

      if ((var5 = this.yOffsetValue).active) {
         RangedNumericValueExt var9 = var5;
         float var8 = var1.y;
         var1.y = var9.newLowValue() + var8;
      }

      RangedNumericValueExt var3;
      if ((var3 = this.zOffsetValue).active) {
         RangedNumericValueExt var10 = var3;
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
      SpawnShapeValueExt shape = (SpawnShapeValueExt)var1;
      this.xOffsetValue.load(shape.xOffsetValue);
      this.yOffsetValue.load(shape.yOffsetValue);
      this.zOffsetValue.load(shape.zOffsetValue);
      this.seed.load(shape.seed);
   }

   public abstract SpawnShapeValueExt copy();

   public void write(gp_1 var1) {
      super.write(var1);
      var1.v80(this.xOffsetValue, "xOffsetValue");
      var1.v80(this.yOffsetValue, "yOffsetValue");
      var1.v80(this.zOffsetValue, "zOffsetValue");
      var1.v80(this.seed, "seed");
   }

   public void read(gp_1 var1, oe_0 var2) {
      SpawnShapeValueExt var10000 = this;
      gp_1 var10001 = var1;
      SpawnShapeValueExt var10003 = this;
      gp_1 var10004 = var1;
      SpawnShapeValueExt var10006 = this;
      gp_1 var10007 = var1;
      super.read(var1, var2);
      this.xOffsetValue = (RangedNumericValueExt)h4_0.Lpt6(var1, var2, "xOffsetValue", RangedNumericValueExt.class, (Class)null);
      Class var3 = RangedNumericValueExt.class;
      oe_0 var6 = var2.Is("yOffsetValue");
      var10006.yOffsetValue = (RangedNumericValueExt)var10007.b20(var3, (Class)null, var6);
      var3 = RangedNumericValueExt.class;
      var6 = var2.Is("zOffsetValue");
      var10003.zOffsetValue = (RangedNumericValueExt)var10004.b20(var3, (Class)null, var6);
      var3 = LongNumericValue.class;
      var6 = var2.Is("seed");
      var10000.seed = (LongNumericValue)var10001.b20(var3, (Class)null, var6);
   }

   public void save(hd0_2 var1, ResourceData var2) {
   }

   public void load(hd0_2 var1, ResourceData var2) {
   }
}
