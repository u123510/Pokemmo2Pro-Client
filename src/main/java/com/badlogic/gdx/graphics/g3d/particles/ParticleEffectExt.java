package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer;
import com.badlogic.gdx.graphics.g3d.particles.influencers.TrailInfluencer;
import f.I2;
import f.es_1;
import f.fy0_0;
import f.hd0_2;
import f.ju_0;
import f.uh_1;

public class ParticleEffectExt extends ParticleEffect implements uh_1 {
   private boolean initialized;
   private transient es_1 batches;
   private transient ParticleEffectExt parent;
   private transient hd0_2 manager;
   private transient String managerFileName;
   private es_1 disposables;

   public ParticleEffectExt() {
      super();
      this.initialized = false;
      this.batches = new es_1(0);
      this.parent = null;
      this.manager = null;
      this.managerFileName = null;
      this.disposables = new es_1();
   }

   public ParticleEffectExt(ParticleController... var1) {
      super(var1);
      this.initialized = false;
      this.batches = new es_1(0);
      this.parent = null;
      this.manager = null;
      this.managerFileName = null;
      this.disposables = new es_1();
   }

   public ParticleEffectExt(ParticleEffectExt var1) {
      super(var1);
      this.initialized = false;
      this.batches = new es_1(0);
      this.parent = null;
      this.manager = null;
      this.managerFileName = null;
      this.disposables = new es_1();
      this.parent = var1;
      this.manager = var1.manager;
      this.managerFileName = var1.managerFileName;
      this.batches = var1.batches;
   }

   public void start() {
      super.start();
   }

   public void init() {
      if (!this.initialized) {
         this.initialized = true;
         int var1 = 0;

         for(int var2 = ((ParticleEffect)this).getControllers().KB; var1 < var2; ++var1) {
            ParticleControllerExt var3;
            if ((var3 = (ParticleControllerExt)((ParticleEffect)this).getControllers().get(var1)).trailController < 0) {
               var3.updateTrailController((ParticleControllerExt)null);
            } else {
               I2 var4 = var3.influencers.ZD();

               while(var4.hasNext()) {
                  if ((Influencer)var4.next() instanceof TrailInfluencer && ((ParticleEffect)this).getControllers().KB > var3.trailController) {
                     var3.updateTrailController((ParticleControllerExt)((ParticleEffect)this).getControllers().get(var3.trailController));
                  }
               }
            }
         }

         super.init();
      }
   }

   public ParticleEffectExt copy() {
      return new ParticleEffectExt(this);
   }

   public void dispose() {
      super.dispose();
      I2 var1 = this.disposables.ZD();

      while(var1.hasNext()) {
         ((fy0_0)var1.next()).dispose();
      }

      if (this.parent != null) {
         hd0_2 var7;
         hd0_2 var10000 = var7 = this.manager;
         String var2 = this.managerFileName;
         synchronized(var10000){}

         Class var8;
         try {
            var8 = (Class)var10000.LJ0.Wk0(var2);
         } catch (Throwable var4) {
            throw var4;
         }

         if (var8 != null) {
            this.manager.Mj(this.managerFileName);
         }

      } else {
         I2 var5 = this.batches.ZD();

         while(var5.hasNext()) {
            ParticleBatch var6;
            if ((var6 = (ParticleBatch)var5.next()) instanceof fy0_0) {
               ((fy0_0)var6).dispose();
            }
         }

      }
   }

   public void begin() {
      I2 var1 = this.batches.ZD();

      while(var1.hasNext()) {
         ((ParticleBatch)var1.next()).begin();
      }

   }

   public void end() {
      I2 var1 = this.batches.ZD();

      while(var1.hasNext()) {
         ((ParticleBatch)var1.next()).end();
      }

   }

   public void getRenderables(es_1 var1, ju_0 var2) {
      I2 var3 = this.batches.ZD();

      while(var3.hasNext()) {
         ((ParticleBatch)var3.next()).getRenderables(var1, var2);
      }

   }

   public ParticleControllerExt findController(String var1) {
      int var2 = 0;

      for(int var3 = ((ParticleEffect)this).getControllers().KB; var2 < var3; ++var2) {
         ParticleControllerExt var4;
         if ((var4 = (ParticleControllerExt)((ParticleEffect)this).getControllers().get(var2)).name.equals(var1)) {
            return var4;
         }
      }

      return null;
   }

   public void setBatches(es_1 var1) {
      this.batches = var1;
   }

   public es_1 getBatches() {
      return this.batches;
   }

   public int getBatchBufferedCount() {
      ParticleEffectExt var10000 = this;
      int var2 = 0;

      for(I2 var1 = var10000.batches.ZD(); var1.hasNext(); var2 += ((BillboardParticleBatchExt)((ParticleBatch)var1.next())).getBufferedCount()) {
      }

      return var2;
   }

   public int getBatchSize() {
      return this.batches.KB;
   }

   public boolean isLoaded() {
      return this.manager != null;
   }

   public void setLoaded(hd0_2 var1, String var2) {
      this.manager = var1;
      this.managerFileName = var2;
   }

   public boolean isInitialized() {
      return this.initialized;
   }

   public void addResource(fy0_0 var1) {
      this.disposables.Ue0(var1);
   }

   public String path() {
      return this.managerFileName;
   }

   public String debugInfo() {
      return this.managerFileName + " parent = " + this.parent + " initialized = " + this.initialized;
   }
}
