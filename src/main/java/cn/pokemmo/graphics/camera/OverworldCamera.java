package cn.pokemmo.graphics.camera;

import f.*;

public class OverworldCamera extends PerspectiveCamera {
   public final C8 rj;
   public final C8 x90;
   public final C8 Ws0;
   public float d00;
   public float Q30;
   public float Rg0;
   public final C8 eo0;

   public OverworldCamera() {
      this((float)lg_0.S4.Kr0(), (float)lg_0.S4.sD0());
   }

   public OverworldCamera(float var1, float var2) {
      super(67.0F, var1, var2);
      this.eo0 = new C8();
      this.rj = new C8();
      this.x90 = new C8();
      this.Ws0 = new C8();
      this.d00 = 0.0F;
      this.Q30 = 0.0F;
      this.Rg0 = 0.0F;
   }

   public final void PB(float var1, boolean var2) {
      boolean var10000 = var2;
      float var10002 = var1;
      float var10004 = var1;
      this.eo0.np(super.jd0).Xv0(super.St0).y = 0.0F;
      C8 var4 = this.rj;
      C8 var5 = this.eo0.KM();
      float var3 = var10004 - this.Q30;
      this.Aj(var4, var5, var3);
      this.Q30 = var10002;
      if (var10000) {
         this.ye(true);
      }

   }

   public final void Xw(C8 var1) {
      super.Xw(var1);
   }

   public final void nz0(float var1, float var2, float var3, float var4, float var5, float var6) {
      OverworldCamera var10000 = this;
      OverworldCamera var10001 = this;
      OverworldCamera var10002 = this;
      OverworldCamera var10003 = this;
      float var10007 = var3;
      float var10009 = var2;
      float var10011 = var1;
      float var10012 = var4;
      C8 var18;
      C8 var10014 = var18 = this.x90;
      var18.x = var1;
      var18.y = var2;
      var10014.z = var3;
      C8 var10013 = super.v40;
      float var10016 = var3;
      float var10017 = var2;
      C8 var8;
      var2 = var1 + (var8 = this.Ws0).x;
      var3 = var10017 + var8.y;
      var1 = var10016 + var8.z + this.Rg0;
      var10013.x = var2;
      var10013.y = var3;
      var10013.z = var1;
      var1 = var10011 + var10012;
      var2 = var10009 + var5;
      var3 = var10007 + var6;
      this.Y90(var1, var2, var3);
      var1 = this.Q30;
      float var10004 = var2 = this.d00;
      OverworldCamera var10005 = this;
      OverworldCamera var10006 = this;
      this.Q30 = 0.0F;
      this.d00 = 0.0F;
      C8 var7;
      super.St0.np(var7 = C8.Y);
      C8 var17 = var10006.rj;
      float var19 = var10004 - var10005.d00;
      ((Tv0)var10003).Aj(var17, var7, var19);
      var10002.d00 = var2;
      var10001.PB(var1, false);
      var10000.ye(true);
   }

   public final void JP(float var1, float var2, float var3) {
      OverworldCamera var10000 = this;
      OverworldCamera var10001 = this;
      OverworldCamera var10002 = this;
      OverworldCamera var10003 = this;
      C8 var4;
      C8 var10009 = var4 = this.x90;
      var4.x = var1;
      var4.y = var2;
      var10009.z = var3;
      C8 var10008 = super.v40;
      float var10011 = var3;
      float var10012 = var2;
      C8 var6;
      var2 = var1 + (var6 = this.Ws0).x;
      var3 = var10012 + var6.y;
      var1 = var10011 + var6.z + this.Rg0;
      var10008.x = var2;
      var10008.y = var3;
      var10008.z = var1;
      C8 var10007 = this.rj;
      var1 = var10007.x;
      var2 = var10007.y;
      var3 = var10007.z;
      this.Y90(var1, var2, var3);
      var1 = this.Q30;
      float var10004 = var2 = this.d00;
      OverworldCamera var10005 = this;
      OverworldCamera var10006 = this;
      this.Q30 = 0.0F;
      this.d00 = 0.0F;
      C8 var5;
      super.St0.np(var5 = C8.Y);
      C8 var15 = var10006.rj;
      float var16 = var10004 - var10005.d00;
      ((Tv0)var10003).Aj(var15, var5, var16);
      var10002.d00 = var2;
      var10001.PB(var1, false);
      var10000.ye(true);
   }

   public final void Y90(float var1, float var2, float var3) {
      this.rj.x = var1;
      this.rj.y = var2;
      this.rj.z = var3;
      super.Y90(var1 + this.Ws0.x, var2 + this.Ws0.y, var3 + this.Ws0.z);
   }
}
