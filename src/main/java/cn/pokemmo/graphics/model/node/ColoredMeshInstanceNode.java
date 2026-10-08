package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;

public class ColoredMeshInstanceNode extends BaseSceneNodeModel {
   public static final C8 zc0 = new C8();
   public final PRN_ IK0;
   public final PRN_ ZO;
   public float dz;
   public int PD0;
   public Pv0 Z8;
   public Pv0 vI;
   public final int[] ao0;
   public final Color o0;
   public final boolean m20;
   public final float Li0;

   public ColoredMeshInstanceNode(ColoredMeshInstanceNode var1) {
      super(var1);
      int[] var2;
      int[] var10000 = var2 = var1.ao0;
      this.ao0 = var2;
      this.m20 = var1.m20;
      float var5;
      this.Li0 = var5 = var1.Li0;
      Color var3;
      this.o0 = var3 = var1.o0;
      this.ZO = new PRN_(PRN_.sI, var3.cpy().mul(var5 * 0.2F));
      float var6 = var5 * 0.21F + 0.6F;
      float var8 = var5 * 0.21F + 0.6F;
      float var4 = var5 * 0.21F + 0.6F;
      this.IK0 = new PRN_(PRN_.xE, new Color(var6, var8, var4, 0.1F));
      if (var10000 != null) {
         for (int var10 : var2) {
            ((BM)super.Y3.get(var10)).LPT8(this.ZO);
            ((BM)super.Y3.get(var10)).LPT8(this.IK0);
         }
      }
   }

   public ColoredMeshInstanceNode(ut_0 var1, Color var2, boolean var3, float var4, int... var5) {
      super(var1, "LightEmissiveModel", 64.0F, null);
      this.eB(true);
      if (!var1.AF.isEmpty()) {
         this.TU(0, true);
      }

      this.o0 = var2;
      this.m20 = var3;
      this.Li0 = var4;
      this.ZO = new PRN_(PRN_.sI, var2.cpy().mul(var4 * 0.2F));
      this.IK0 = new PRN_(PRN_.xE, new Color(var4 * 0.21F + 0.6F, var4 * 0.21F + 0.6F, var4 * 0.21F + 0.6F, 0.1F));
      this.ao0 = var5;

      for (int var8 : var5) {
         ((BM)super.Y3.get(var8)).LPT8(this.ZO);
         ((BM)super.Y3.get(var8)).LPT8(this.IK0);
      }
   }

   @Override
   public final void v3(float var1, float var2) {
      super.v3(var1, var2);
      if (this.ao0 != null) {
         if ((this.dz += var2) >= this.PD0 / 1000.0F) {
            this.dz = 0.0F;
            this.PD0 = rg0_2.j40(2000, 5000);
         }

         Pv0 var4 = this.vI;
         if (this.vI == null) {
            var4 = c8_0.JD0.Yj();
         }

         if (var4 != this.Z8) {
            Pv0 var5 = this.vI;
            if (this.vI == null) {
               var5 = c8_0.JD0.Yj();
            }

            this.Z8 = var5;
            if (var5 == Pv0.cY) {
               int[] var6 = this.ao0;
               int var9 = this.ao0.length;

               for (int var3 = 0; var3 < var9; var3++) {
                  ((BM)super.Y3.get(var6[var3])).fR(PRN_.xE);
               }
            } else {
               int[] var7 = this.ao0;
               int var10 = this.ao0.length;

               for (int var12 = 0; var12 < var10; var12++) {
                  ((BM)super.Y3.get(var7[var12])).LPT8(this.IK0);
               }
            }
         }

         if (this.m20) {
            if ((var1 = this.dz * 1000.0F / this.PD0) > 0.5F) {
               var1 = 1.0F - var1;
            }

            var2 = this.Li0 / 10.0F;
            Color var13 = this.o0;
            float var10001 = this.o0.r * var1 * var2;
            float var14 = var13.g * var1 * var2;
            this.ZO.v50.set(var10001, var14, var13.b * var1 * var2, 1.0F);
            this.IK0.v50.set(var1 * 0.25F + 0.55F, var1 * 0.25F + 0.55F, var1 * 0.25F + 0.55F, 0.1F);
         }
      }
   }

   @Override
   public void eo0(C8 var1) {
      Matrix4 var10000 = super.ho;
      C8 var10001 = zc0;
      C8 var10002 = zc0;
      C8 var10003 = zc0;
      C8 var3;
      C8 var10004 = var3 = zc0;
      var3.getClass();
      float var4 = var1.x;
      float var5 = var1.y;
      float var2 = var1.z;
      var10004.x = var4;
      var10003.y = var5;
      var10002.z = var2;
      var10000.Y1(var10001.Vy(0.0F, 0.15F, -0.05F));
   }

   @Override
   public final Ou0 Ma0() {
      ColoredMeshInstanceNode var10000 = new ColoredMeshInstanceNode(this);
      var10000.I0 = true;
      return var10000;
   }
}
