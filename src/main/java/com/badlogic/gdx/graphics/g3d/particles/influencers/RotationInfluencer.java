package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannelsExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValueExt;
import f.TG0;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public class RotationInfluencer extends SimpleInfluencer {
   public ScaledNumericValueExt valueX;
   public ScaledNumericValueExt valueY;

   public RotationInfluencer() {
      (this.valueX = new ScaledNumericValueExt()).setHigh(1.0F);
      (this.valueY = new ScaledNumericValueExt()).setHigh(1.0F);
      super.valueChannelDescriptor = ParticleChannelsExt.ScaleXY;
   }

   public RotationInfluencer(RotationInfluencer var1) {
      this();
      this.set(var1);
   }

   private void set(RotationInfluencer var1) {
      this.valueX.load(var1.valueX);
      this.valueY.load(var1.valueY);
      super.valueChannelDescriptor = var1.valueChannelDescriptor;
   }

   public void activateParticles(int var1, int var2) {
      if (super.value.isRelative()) {
         int var10000 = var2;
         int var10001 = var1;
         int var9;
         var2 = var1 * (var9 = super.valueChannel.strideSize);
         int var3 = var10001 * super.interpolationChannel.strideSize;

         for(int var10 = var10000 * var9 + var2; var2 < var10; var3 += super.interpolationChannel.strideSize) {
            float var4 = this.valueX.newLowValue() * super.controller.scale.x;
            float var5 = this.valueX.newHighValue() * super.controller.scale.x;
            float var6 = this.valueY.newLowValue() * super.controller.scale.x;
            float var7 = this.valueY.newHighValue() * super.controller.scale.x;
            float[] var10002 = super.interpolationChannel.data;
            var10002[var3] = var4;
            var10002[var3 + 1] = var5;
            super.valueChannel.data[var2] = TG0.u9(this.valueX, 0.0F, var5, var4);
            super.valueChannel.data[var2 + 1] = TG0.u9(this.valueY, 0.0F, var7, var6);
            var2 += super.valueChannel.strideSize;
         }
      } else {
         int var20 = var2;
         int var21 = var1;
         int var11;
         var2 = var1 * (var11 = super.valueChannel.strideSize);
         int var15 = var21 * super.interpolationChannel.strideSize;

         for(int var12 = var20 * var11 + var2; var2 < var12; var15 += super.interpolationChannel.strideSize) {
            float var16 = this.valueX.newLowValue() * super.controller.scale.x;
            float var17 = this.valueX.newHighValue() * super.controller.scale.x - var16;
            float var18 = this.valueY.newLowValue() * super.controller.scale.y;
            float var19 = this.valueY.newHighValue() * super.controller.scale.y - var18;
            float[] var8;
            float[] var22 = var8 = super.interpolationChannel.data;
            var8[var15] = var16;
            var8[var15 + 1] = var17;
            var8[var15 + 2] = var18;
            var22[var15 + 3] = var19;
            super.valueChannel.data[var2] = TG0.u9(this.valueX, 0.0F, var17, var16);
            super.valueChannel.data[var2 + 1] = TG0.u9(this.valueY, 0.0F, var19, var18);
            var2 += super.valueChannel.strideSize;
         }
      }

   }

   public void allocateChannels() {
      super.allocateChannels();
      ParallelArray.ChannelDescriptor var1;
      (var1 = ParticleChannels.Interpolation4).id = super.controller.particleChannels.newId();
      super.interpolationChannel = (ParallelArray.FloatChannel)super.controller.particles.addChannel(var1);
   }

   public void update() {
      int var1 = 0;
      int var2 = 0;
      int var3 = 2;

      for(int var4 = super.controller.particles.size * super.valueChannel.strideSize; var1 < var4; var3 += super.lifeChannel.strideSize) {
         int var10002 = var2;
         int var10004 = var1;
         float[] var10010 = super.interpolationChannel.data;
         float var5 = var10010[var2];
         float var6 = var10010[var2 + 1];
         super.valueChannel.data[var1] = TG0.u9(this.valueX, super.lifeChannel.data[var3], var6, var5);
         int var10007 = var1 + 1;
         float[] var10009 = super.interpolationChannel.data;
         float var7 = var10009[var2 + 2];
         float var8 = var10009[var2 + 3];
         super.valueChannel.data[var10007] = TG0.u9(this.valueY, super.lifeChannel.data[var3], var8, var7);
         var1 = var10004 + super.valueChannel.strideSize;
         var2 = var10002 + super.interpolationChannel.strideSize;
      }

   }

   public void write(gp_1 var1) {
      var1.v80(this.valueX, "valuex");
      var1.v80(this.valueY, "valuey");
   }

   public void read(gp_1 var1, oe_0 var2) {
      RotationInfluencer var10000 = this;
      gp_1 var10001 = var1;
      this.valueX = (ScaledNumericValueExt)h4_0.Lpt6(var1, var2, "valuex", ScaledNumericValueExt.class, (Class)null);
      Class var3 = ScaledNumericValueExt.class;
      oe_0 var4 = var2.Is("valuey");
      var10000.valueY = (ScaledNumericValueExt)var10001.b20(var3, (Class)null, var4);
   }

   public ParticleControllerComponent copy() {
      return new RotationInfluencer(this);
   }
}
