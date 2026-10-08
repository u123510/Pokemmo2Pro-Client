package cn.pokemmo.graphics.render;

import f.*;

import com.badlogic.gdx.math.Matrix4;

public class ThirdPersonRenderableSorter extends DefaultRenderableSorter {
   public Tv0 oQ;
   public final C8 mC0;
   public final C8 Uy;

   public ThirdPersonRenderableSorter() {
      C8 c8;
      c8 = new C8();
      this.mC0 = c8;
      C8 c81;
      c81 = new C8();
      this.Uy = c81;
   }

   public final void On0(Tv0 var1, es_1 var2) {
      this.oQ = var1;
      var2.sort(this);
   }

   public final int Yr0(W00 var1, W00 var2) {
      long i = sh_0.vF0;
      boolean flag;
      if (var1.ly.tM(sh_0.vF0) && ((sh_0)var1.ly.sg(i)).yg) {
         flag = true;
      } else {
         flag = false;
      }

      boolean flag1;
      if (var2.ly.tM(i) && ((sh_0)var2.ly.sg(i)).yg) {
         flag1 = true;
      } else {
         flag1 = false;
      }

      if (flag != flag1) {
         return flag ? 1 : -1;
      }

      Matrix4 matrix4 = var1.eo0;
      C8 c82 = var1.VE0.T4;
      C8 c8 = this.mC0;
      if (c82.eG()) {
         matrix4.V1(c8);
      } else if (!matrix4.Mq0()) {
         C8 c85 = matrix4.V1(c8);
         float f2 = c82.x;
         float f6 = c82.y;
         float f10 = c82.z;
         c85.na(f2, f6, f10);
      } else {
         c8.getClass();
         float f7 = c82.x;
         float f11 = c82.y;
         float f = c82.z;
         c8.x = f7;
         c8.y = f11;
         c8.z = f;
         c8.cu(matrix4);
      }

      Matrix4 matrix41 = var2.eo0;
      C8 c81 = var2.VE0.T4;
      C8 c83 = this.Uy;
      if (c81.eG()) {
         matrix41.V1(c83);
      } else if (!matrix41.Mq0()) {
         C8 c84 = matrix41.V1(c83);
         float f3 = c81.x;
         float f4 = c81.y;
         float f8 = c81.z;
         c84.na(f3, f4, f8);
      } else {
         c83.getClass();
         float f5 = c81.x;
         float f9 = c81.y;
         float f12 = c81.z;
         c83.x = f5;
         c83.y = f9;
         c83.z = f12;
         c83.cu(matrix41);
      }

      float f1;
      int j;
      if ((f1 = (int)(this.oQ.v40.Lk(this.mC0) * 1000.0F) - (int)(this.oQ.v40.Lk(this.Uy) * 1000.0F)) < 0.0F) {
         j = -1;
      } else if (f1 > 0.0F) {
         j = 1;
      } else {
         j = 0;
      }

      if (flag) {
         j = -j;
      }

      return j;
   }

   @Override
   public final int compare(Object var1, Object var2) {
      return this.Yr0((W00)var1, (W00)var2);
   }
}
