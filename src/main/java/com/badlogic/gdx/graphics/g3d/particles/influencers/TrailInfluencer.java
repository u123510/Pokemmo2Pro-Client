package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannelsExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import com.badlogic.gdx.graphics.g3d.particles.emitters.TrailEmitter;
import f.C8;
import f.gp_1;
import f.h4_0;
import f.hd0_2;
import f.oe_0;

public class TrailInfluencer extends Influencer {
   private ParallelArray.FloatChannel posChannel;
   private ParallelArray.FloatChannel scaleChannel;
   private ParallelArray.FloatChannel colorChannel;
   private ParallelArray.FloatChannel rotationChannel;
   public TrailEmitter emitter;
   public boolean isBackSprite = false;
   public boolean copyRotation;

   public TrailInfluencer() {
   }

   public TrailInfluencer(TrailInfluencer var1) {
      this.isBackSprite = var1.isBackSprite;
   }

   public void setEmitter(TrailEmitter var1) {
      this.emitter = var1;
   }

   public void init() {
      super.init();
   }

   public void allocateChannels() {
      super.allocateChannels();
      this.posChannel = (ParallelArray.FloatChannel)super.controller.particles.getChannel(ParticleChannels.Position);
      this.scaleChannel = (ParallelArray.FloatChannel)super.controller.particles.getChannel(ParticleChannelsExt.ScaleXY);
      this.colorChannel = (ParallelArray.FloatChannel)super.controller.particles.getChannel(ParticleChannels.Color);
      this.rotationChannel = (ParallelArray.FloatChannel)super.controller.particles.getChannel(ParticleChannels.Rotation2D);
   }

   public void start() {
      super.start();
   }

   public void update() {
      super.update();
      if (this.emitter != null) {
         int var1 = 0;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;

         for(int var5 = super.controller.particles.size * this.posChannel.strideSize; var1 < var5; var1 += this.posChannel.strideSize) {
            C8 var6 = ParticleControllerComponent.TMP_V1;
            float[] var7;
            float[] var10001 = var7 = this.posChannel.data;
            float[] var10003 = var7;
            float var15 = var7[var1];
            float var8 = var10003[var1 + 1];
            float var9 = var10001[var1 + 2];
            float var10;
            if (this.isBackSprite) {
               var10 = 0.0125F;
            } else {
               var10 = -0.0125F;
            }

            float var10006 = var15;
            var15 = var9 + var10;
            var6.x = var10006;
            var6.y = var8;
            var6.z = var15;
            C8 var10002 = var6;
            ParallelArray.FloatChannel var11 = this.scaleChannel;
            ParallelArray.FloatChannel var17 = this.colorChannel;
            ParallelArray.FloatChannel var18 = this.rotationChannel;
            this.emitter.spawn(var10002, var11, var2, var17, var3, var18, var4);
            if ((var11 = this.scaleChannel) != null) {
               var2 += var11.strideSize;
            }

            if ((var11 = this.colorChannel) != null) {
               var3 += var11.strideSize;
            }

            if ((var11 = this.rotationChannel) != null) {
               var4 += var11.strideSize;
            }
         }

      }
   }

   public void activateParticles(int var1, int var2) {
      super.activateParticles(var1, var2);
   }

   public TrailInfluencer copy() {
      return new TrailInfluencer(this);
   }

   public void write(gp_1 var1) {
      var1.v80(this.isBackSprite, "background");
   }

   public void read(gp_1 var1, oe_0 var2) {
      if (var2.UJ0("background")) {
         this.isBackSprite = (Boolean)h4_0.Lpt6(var1, var2, "background", Boolean.class, (Class)null);
      }

   }

   public void save(hd0_2 var1, ResourceData var2) {
   }

   public void load(hd0_2 var1, ResourceData var2) {
   }
}
