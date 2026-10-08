package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import f.nf_1;

public class ParticleControllerFinalizerInfluencer extends Influencer {
   ParallelArray.FloatChannel positionChannel;
   ParallelArray.FloatChannel scaleChannel;
   ParallelArray.FloatChannel rotationChannel;
   ParallelArray.ObjectChannel controllerChannel;
   boolean hasScale;
   boolean hasRotation;

   public void init() {
      if ((this.controllerChannel = (ParallelArray.ObjectChannel)super.controller.particles.getChannel(ParticleChannels.ParticleController)) != null) {
         this.scaleChannel = (ParallelArray.FloatChannel)super.controller.particles.getChannel(ParticleChannels.Scale);
         ParallelArray.FloatChannel var1;
         this.rotationChannel = var1 = (ParallelArray.FloatChannel)super.controller.particles.getChannel(ParticleChannels.Rotation3D);
         boolean var2;
         if (this.scaleChannel != null) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.hasScale = var2;
         boolean var3;
         if (var1 != null) {
            var3 = true;
         } else {
            var3 = false;
         }

         this.hasRotation = var3;
      } else {
         throw new nf_1("ParticleController channel not found, specify an influencer which will allocate it please.");
      }
   }

   public void allocateChannels() {
      this.positionChannel = (ParallelArray.FloatChannel)super.controller.particles.addChannel(ParticleChannels.Position);
   }

   public void update() {
      int var1 = 0;
      int var2 = 0;

      for(int var3 = super.controller.particles.size; var1 < var3; var2 += this.positionChannel.strideSize) {
         ParticleController var4 = ((ParticleController[])this.controllerChannel.data)[var1];
         float var5;
         if (this.hasScale) {
            var5 = this.scaleChannel.data[var1];
         } else {
            var5 = 1.0F;
         }

         float var6 = 0.0F;
         float var7 = 0.0F;
         float var8 = 0.0F;
         float var9 = 1.0F;
         if (this.hasRotation) {
            ParallelArray.FloatChannel var10000 = this.rotationChannel;
            int var14 = var1 * var10000.strideSize;
            float[] var15;
            float[] var16 = var15 = var10000.data;
            var6 = var15[var14];
            var7 = var15[var14 + 1];
            var8 = var15[var14 + 2];
            var9 = var16[var14 + 3];
         }

         float[] var12;
         float[] var10004 = var12 = this.positionChannel.data;
         float var11 = var12[var2];
         float var13 = var12[var2 + 1];
         float var10 = var10004[var2 + 2];
         var4.setTransform(var11, var13, var10, var6, var7, var8, var9, var5);
         var4.update();
         ++var1;
      }

   }

   public ParticleControllerFinalizerInfluencer copy() {
      return new ParticleControllerFinalizerInfluencer();
   }
}
