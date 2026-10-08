package com.badlogic.gdx.graphics.g3d.particles.emitters;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.emitters.RegularEmitter.EmissionMode;
import com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer;
import com.badlogic.gdx.graphics.g3d.particles.influencers.ScaleXYInfluencer;
import com.badlogic.gdx.graphics.g3d.particles.influencers.TrailSpawnInfluencerExt;
import f.C8;
import f.I2;

public class TrailEmitter extends RegularEmitter {
   public TrailEmitter() {
      ((RegularEmitter)this).setEmissionMode(EmissionMode.Disabled);
   }

   public TrailEmitter(RegularEmitter var1) {
      super(var1);
      ((RegularEmitter)this).setEmissionMode(EmissionMode.Disabled);
   }

   public void init() {
      super.init();
      super.emissionDelta = (int)super.delay;
   }

   public void spawn(C8 var1, ParallelArray.FloatChannel var2, int var3, ParallelArray.FloatChannel var4, int var5, ParallelArray.FloatChannel var6, int var7) {
      ParticleController var8;
      int var9 = (int)((var8 = super.controller).deltaTime * 1000.0F);
      int var14;
      super.emissionDelta = var14 = super.emissionDelta + var9;
      if ((float)var14 >= super.delay) {
         super.emissionDelta = 0;
         int var13;
         if ((var13 = Math.min(super.emissionDiff, super.maxParticleCount - var8.particles.size)) > 0) {
            I2 var15 = super.controller.influencers.ZD();

            while(var15.hasNext()) {
               Influencer var10;
               if ((var10 = (Influencer)var15.next()) instanceof TrailSpawnInfluencerExt) {
                  TrailSpawnInfluencerExt var10000 = (TrailSpawnInfluencerExt)var10;
                  TrailSpawnInfluencerExt var10001 = (TrailSpawnInfluencerExt)var10;
                  C8 var16;
                  C8 var10005 = var16 = ((TrailSpawnInfluencerExt)var10).spawnPosition;
                  var16.getClass();
                  float var17 = var1.x;
                  float var11 = var1.y;
                  float var12 = var1.z;
                  var10005.x = var17;
                  var10005.y = var11;
                  var10005.z = var12;
                  var10000.positionChannelParent = null;
                  var10001.parentColor = var4;
                  var10000.parentColorOffset = var5;
                  var10001.parentRotation = var6;
                  var10000.parentRotationOffset = var7;
               } else if (var10 instanceof ScaleXYInfluencer) {
                  ScaleXYInfluencer var18 = (ScaleXYInfluencer)var10;
                  ((ScaleXYInfluencer)var10).parentScale = var2;
                  var18.parentScaleOffset = var3;
               }
            }

            ParticleController var20 = super.controller;
            var20.activateParticles(var20.particles.size, var13);
            ParallelArray var19 = super.controller.particles;
            var19.size += var13;
         }
      }
   }

   public void activate(ParallelArray.FloatChannel var1, ParallelArray.FloatChannel var2, int var3, int var4) {
      super.controller.activateParticles(var3, var4);
      ParticleController var10000 = super.controller;
      ParallelArray var10001 = var10000.particles;
      var10001.size += var4;
      I2 var5 = var10000.influencers.ZD();

      while(var5.hasNext()) {
         Influencer var6;
         if ((var6 = (Influencer)var5.next()) instanceof TrailSpawnInfluencerExt) {
            ((TrailSpawnInfluencerExt)var6).positionChannelParent = var1;
         } else if (var6 instanceof ScaleXYInfluencer) {
            ((ScaleXYInfluencer)var6).parentScale = var2;
         }
      }

   }

   public ParticleController getController() {
      return super.controller;
   }

   public ParticleControllerComponent copy() {
      return new TrailEmitter(this);
   }
}
