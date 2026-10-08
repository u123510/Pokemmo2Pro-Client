package cn.pokemmo.graphics.gdx.render;

import f.*;


import com.badlogic.gdx.graphics.Texture;

public class GdxTextureRegionMesh extends CG {
   // public static final AG0 HH0;
   public final Wr f60;
   public LPT6_ vw0;
   public final int wm;
   public final int Px0;
   public int gj;
   public int g6;

   public GdxTextureRegionMesh(Wr var1, int var2, int var3, int var4, int var5) {
      this.f60 = var1;
      this.wm = var2;
      this.Px0 = var3;
      this.gj = var4;
      this.g6 = var5;
   }

   static {
      // HH0 initialized in f.AG0
   }

   public final int k60() {
      return this.gj;
   }

   public final int COM9() {
      return this.g6;
   }

   public final LPT6_ d3() {
      super.Ik = hk0_1.KG;
      LPT6_ var1;
      if ((var1 = this.vw0) != null) {
         return var1;
      } else {
         li_2.HA0(this);
         this.f60.O50(this);
         Texture var7 = this.f60.H8();
         if (this.gj < 0) {
            this.gj = var7.getWidth();
         }

         if (this.g6 < 0) {
            this.g6 = var7.getHeight();
         }

         LPT6_ var2 = new LPT6_(var7, this.wm, this.Px0, this.gj, this.g6);
         this.vw0 = var2;
         return var2;
      }
   }

   public final void ji0() {
      this.vw0 = null;
      Wr var10001 = this.f60;
      var10001.Ik = hk0_1.KG;
      ((CG)var10001).sI0(this);
      li_2.cx(this);
   }

   public final void finalize() throws Throwable {
      this.ji0();
      super.finalize();
   }
}
