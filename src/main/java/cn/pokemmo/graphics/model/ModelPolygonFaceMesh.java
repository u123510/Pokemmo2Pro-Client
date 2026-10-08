package cn.pokemmo.graphics.model;

import f.*;

public class ModelPolygonFaceMesh extends G00 {
   public final Bp0 ab;
   public final Bp0 Gp0;
   public float ID0;
   public float E4;
   public final float By0;
   public final float hh0;
   public final boolean G30;

   public ModelPolygonFaceMesh(jk_0[] var1, int var2, int var3, Bp0 var4, Bp0 var5) {
      super(var1, var2, var3, 1, (int)var4.x, (int)var4.y);
      this.ab = var4;
      this.Gp0 = var5;
      int var6 = (int)Math.floor((double)Math.abs(var4.ut(var5) / 4.0F));
      this.By0 = 5.0F;
      this.hh0 = 15.0F;
      float var8;
      this.ID0 = (var5.x - var4.x) / (var8 = (float)var6);
      this.E4 = (var5.y - var4.y) / var8;
      this.G30 = true;
   }

   public final void Fu() {
      if (((G00)this).Dk0() && ((G00)this).H40()) {
         if (super.sd0 % 3 == 0) {
            if (this.ab.ut(this.Gp0) > 5.0F) {
               if (this.G30) {
                  float var1 = (float)((double)this.ab.y * Math.PI * (double)2.0F * (double)this.By0) / (float)lg_0.S4.sD0();
                  Bp0 var10000 = this.ab;
                  float var2;
                  var10000.y = var2 = var10000.y + this.E4;
                  var2 = (float)((double)var2 * Math.PI * (double)2.0F * (double)this.By0) / (float)lg_0.S4.sD0();
                  var10000 = this.ab;
                  var10000.x = var10000.x + (float)((Math.sin((double)var2) - Math.sin((double)var1)) * (double)this.hh0) + this.ID0;
               } else {
                  float var3 = (float)((double)this.ab.x * Math.PI * (double)2.0F * (double)this.By0) / (float)lg_0.S4.Kr0();
                  Bp0 var8 = this.ab;
                  float var5;
                  var8.x = var5 = var8.x + this.ID0;
                  var5 = (float)((double)var5 * Math.PI * (double)2.0F * (double)this.By0) / (float)lg_0.S4.Kr0();
                  var8 = this.ab;
                  var8.y = var8.y + (float)((Math.sin((double)var5) - Math.sin((double)var3)) * (double)this.hh0) + this.E4;
               }

               super.Fu();
            }

         }
      }
   }

   public final int hC() {
      return (int)this.ab.x;
   }

   public final int lt0() {
      return (int)this.ab.y;
   }
}
