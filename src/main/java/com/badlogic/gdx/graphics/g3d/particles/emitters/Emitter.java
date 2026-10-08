package com.badlogic.gdx.graphics.g3d.particles.emitters;

import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import f.gp_1;
import f.h4_0;
import f.oe_0;

public abstract class Emitter extends ParticleControllerComponent {
   public int minParticleCount;
   public int maxParticleCount = 4;
   public float percent;

   public Emitter(Emitter var1) {
      this.set(var1);
   }

   public Emitter() {
   }

   public void init() {
      super.controller.particles.size = 0;
   }

   public void end() {
      super.controller.particles.size = 0;
   }

   public boolean isComplete() {
      return this.percent >= 1.0F;
   }

   public int getMinParticleCount() {
      return this.minParticleCount;
   }

   public void setMinParticleCount(int var1) {
      this.minParticleCount = var1;
   }

   public int getMaxParticleCount() {
      return this.maxParticleCount;
   }

   public void setMaxParticleCount(int var1) {
      this.maxParticleCount = var1;
   }

   public void setParticleCount(int var1, int var2) {
      this.setMinParticleCount(var1);
      this.setMaxParticleCount(var2);
   }

   public void set(Emitter var1) {
      this.minParticleCount = var1.minParticleCount;
      this.maxParticleCount = var1.maxParticleCount;
   }

   public void write(gp_1 var1) {
      var1.v80(this.minParticleCount, "minParticleCount");
      var1.v80(this.maxParticleCount, "maxParticleCount");
   }

   public void read(gp_1 var1, oe_0 var2) {
      Emitter var10000 = this;
      gp_1 var10001 = var1;
      Emitter var10003 = this;
      gp_1 var10004 = var1;
      String var3 = "minParticleCount";
      Class var5 = Integer.TYPE;
      var10003.minParticleCount = (Integer)h4_0.Lpt6(var10004, var2, var3, var5, (Class)null);
      oe_0 var4 = var2.Is("maxParticleCount");
      var10000.maxParticleCount = (Integer)var10001.b20(var5, (Class)null, var4);
   }
}
