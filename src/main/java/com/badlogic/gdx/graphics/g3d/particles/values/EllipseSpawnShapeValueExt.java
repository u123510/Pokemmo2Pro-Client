package com.badlogic.gdx.graphics.g3d.particles.values;

import com.badlogic.gdx.graphics.g3d.particles.SeedRandom;
import com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValueExt.SpawnSide;
import f.C8;
import f.LW;
import f.O00;
import f.TG0;
import f.gp_1;
import f.h4_0;
import f.oe_0;
import java.util.Random;

public final class EllipseSpawnShapeValueExt extends PrimitiveSpawnShapeValueExt {
   private Random random = new O00();
   private float even = 0.0F;
   private float lastT = 0.0F;
   private float iter = 0.0F;
   private float lastRadiusX;
   private float lastRadiusY;
   private float lastRadiusZ;
   private float lastZ;
   PrimitiveSpawnShapeValueExt.SpawnSide side;
   public NumericValue evenCount;
   public NumericValue evenAngleBonus;

   public EllipseSpawnShapeValueExt(EllipseSpawnShapeValueExt var1) {
      super(var1);
      this.side = SpawnSide.both;
      this.evenCount = new NumericValue();
      this.evenAngleBonus = new NumericValue();
      this.load(var1);
   }

   public EllipseSpawnShapeValueExt() {
      this.side = SpawnSide.both;
      this.evenCount = new NumericValue();
      this.evenAngleBonus = new NumericValue();
   }

   public void reSeed() {
      super.reSeed();
      if (super.seed.isActive()) {
         this.random.setSeed(super.seed.getValue());
      }

      this.even = 0.0F;
      this.iter = -1.0F;
   }

   public void spawnAux(C8 var1, float var2) {
      float var3 = super.spawnWidth;
      float var4 = super.spawnWidthDiff;
      var3 = TG0.u9(super.spawnWidthValue, var2, var4, var3);
      var4 = super.spawnHeight;
      float var5 = super.spawnHeightDiff;
      var4 = TG0.u9(super.spawnHeightValue, var2, var5, var4);
      var5 = super.spawnDepth;
      float var6 = super.spawnDepthDiff;
      var2 = TG0.u9(super.spawnDepthValue, var2, var6, var5);
      var5 = 0.0F;
      var6 = ((float)Math.PI * 2F);
      PrimitiveSpawnShapeValueExt.SpawnSide var7;
      if ((var7 = this.side) == SpawnSide.top) {
         var6 = (float)Math.PI;
      } else if (var7 == SpawnSide.bottom) {
         var6 = -(float)Math.PI;
      }

      boolean var45 = true;
      if (this.evenCount.getValue() <= 0.0F) {
         if (this.evenCount.getValue() != 0.0F && super.seed.isActive()) {
            float var8;
            if (!((var8 = this.iter) < 0.0F) && var8 % (float)(-((int)this.evenCount.getValue())) != 0.0F) {
               var45 = false;
            } else {
               this.iter = 0.0F;
            }

            ++this.iter;
         }

         if (var45) {
            this.lastT = SeedRandom.random(this.random, var5, var6);
         }

         var5 = this.lastT;
      } else {
         var5 = this.even;
         this.even = var6 / this.evenCount.getValue() + var5;
         var5 = this.evenAngleBonus.getValue() + this.even;
         if (super.seed.isActive()) {
            var5 += (float)super.seed.getValue() / 360.0F * ((float)Math.PI * 2F) + this.even;
         }
      }

      if (super.edges) {
         if (var3 == 0.0F) {
            float var15 = 0.0F;
            float var21 = var4 / 2.0F;
            float var22 = LW.Po0(var5) * var21;
            var2 /= 2.0F;
            float var16 = LW.Fm0(var5) * var2;
            var1.x = var15;
            var1.y = var22;
            var1.z = var16;
            return;
         }

         if (var4 == 0.0F) {
            float var12 = var3 / 2.0F;
            var12 = LW.Fm0(var5) * var12;
            float var20 = 0.0F;
            var2 /= 2.0F;
            float var14 = LW.Po0(var5) * var2;
            var1.x = var12;
            var1.y = var20;
            var1.z = var14;
            return;
         }

         if (var2 == 0.0F) {
            float var9 = var3 / 2.0F;
            var9 = LW.Fm0(var5) * var9;
            float var18 = var4 / 2.0F;
            float var11 = LW.Po0(var5) * var18;
            float var19 = 0.0F;
            var1.x = var9;
            var1.y = var11;
            var1.z = var19;
            return;
         }

         var2 = var3 / 2.0F;
         var3 = var4 / 2.0F;
         var4 = var2 / 2.0F;
      } else {
         var3 = SeedRandom.random(this.random, var3 / 2.0F);
         var4 = SeedRandom.random(this.random, var4 / 2.0F);
         var2 = SeedRandom.random(this.random, var2 / 2.0F);
         var4 = var2;
         var3 = var4;
         var2 = var3;
      }

      var6 = SeedRandom.random(this.random, -1.0F, 1.0F);
      if (var45) {
         this.lastZ = var6;
         this.lastRadiusX = var2;
         this.lastRadiusY = var3;
         this.lastRadiusZ = var4;
      }

      float var10004 = this.lastZ;
      float var23 = (float)Math.sqrt((double)(1.0F - var10004 * var10004));
      var2 = this.lastRadiusX * var23;
      float var60 = LW.Fm0(var5) * var2;
      float var24 = this.lastRadiusY * var23;
      float var25 = LW.Po0(var5) * var24;
      float var17 = this.lastRadiusZ * var6;
      var1.x = var60;
      var1.y = var25;
      var1.z = var17;
   }

   public PrimitiveSpawnShapeValueExt.SpawnSide getSide() {
      return this.side;
   }

   public void setSide(PrimitiveSpawnShapeValueExt.SpawnSide var1) {
      this.side = var1;
   }

   public void load(ParticleValue var1) {
      EllipseSpawnShapeValueExt var10000 = this;
      EllipseSpawnShapeValueExt var10001 = this;
      super.load(var1);
      EllipseSpawnShapeValueExt var2;
      this.side = (var2 = (EllipseSpawnShapeValueExt)var1).side;
      var10001.evenCount = var2.evenCount;
      var10000.evenAngleBonus = var2.evenAngleBonus;
   }

   public SpawnShapeValueExt copy() {
      return new EllipseSpawnShapeValueExt(this);
   }

   public void write(gp_1 var1) {
      super.write(var1);
      var1.v80(this.side, "side");
      var1.v80(this.evenCount, "evenCount");
      var1.v80(this.evenAngleBonus, "evenAngleBonus");
   }

   public void read(gp_1 var1, oe_0 var2) {
      super.read(var1, var2);
      this.side = (PrimitiveSpawnShapeValueExt.SpawnSide)h4_0.Lpt6(var1, var2, "side", PrimitiveSpawnShapeValueExt.SpawnSide.class, (Class)null);
      if (var2.UJ0("evenCount")) {
         Class var3 = NumericValue.class;
         oe_0 var4 = var2.Is("evenCount");
         this.evenCount = (NumericValue)var1.b20(var3, (Class)null, var4);
      }

      if (var2.UJ0("evenAngleBonus")) {
         EllipseSpawnShapeValueExt var10000 = this;
         gp_1 var10001 = var1;
         Class var5 = NumericValue.class;
         oe_0 var6 = var2.Is("evenAngleBonus");
         var10000.evenAngleBonus = (NumericValue)var10001.b20(var5, (Class)null, var6);
      }

   }
}
