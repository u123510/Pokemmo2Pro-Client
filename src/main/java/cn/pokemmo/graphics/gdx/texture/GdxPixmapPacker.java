package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;

public abstract class GdxPixmapPacker {
   public final int Yd0;
   public final int JY;
   public final es_1 Mc0;
   public ck_1 rg;
   public ck_1 Ht;
   public boolean s9;
   public boolean c9;

   public GdxPixmapPacker(int var1, int var2) {
      this.Mc0 = new es_1();
      this.Yd0 = var1;
      this.JY = var2;
   }

   public final void I7(ix0_0 var1) {
      int var3 = Gdx2DPixmap.abstract$(ix0_0.p9(var1));
      int var2;
      char var4;
      switch (var2 = ix0_0.p9(var1)) {
         case 1:
         case 2:
         case 3:
         case 4:
            var4 = 5121;
            break;
         case 5:
            var4 = '荣';
            break;
         case 6:
            var4 = '耳';
            break;
         default:
            throw new nf_1(yr_1.pG("unknown format: ", var2));
      }

      this.Mc0.Ue0(new y_0(var3, var3, var4));
   }

   public final void XK0() {
      char var2 = '膥';
      this.Ht = new ck_1(var2);
      this.c9 = true;
   }

   public final void aC() {
      char var2 = '赈';
      this.rg = new ck_1(var2);
      this.s9 = true;
   }
}
