package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.utils.BufferUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public class GdxCustomTextureBufferData implements kj_0 {
   public final sa_0 v0;
   public final FloatBuffer Qm0;
   public final ByteBuffer Yq0;
   public int UI;
   public final boolean ZI0;
   public final int Qt;
   public boolean lI = false;
   public boolean F40 = false;

   public GdxCustomTextureBufferData(boolean var1, int var2, kz_0... var3) {
      this(var1, var2, new sa_0(var3));
   }

   public GdxCustomTextureBufferData(boolean var1, int var2, sa_0 var3) {
      this.v0 = var3;
      ByteBuffer var4;
      this.Yq0 = var4 = BufferUtils.I5(var3.u5 * var2);
      this.ZI0 = true;
      this.Qt = var1 ? 35044 : 35048;
      FloatBuffer var5;
      FloatBuffer var10001 = var5 = var4.asFloatBuffer();
      this.Qm0 = var5;
      this.UI = this.D80();
      ((Buffer)var10001).flip();
      ((Buffer)var4).flip();
   }

   @Override
   public final sa_0 JP() {
      return this.v0;
   }

   @Override
   public final int mB0() {
      return this.Qm0.limit() * 4 / this.v0.u5;
   }

   @Override
   public final int Ew0() {
      return this.Yq0.capacity() / this.v0.u5;
   }

   @Override
   public final FloatBuffer st0(boolean var1) {
      this.lI |= var1;
      return this.Qm0;
   }

   @Override
   public final void ce0(int var1, int var2, float[] var3) {
      this.lI = true;
      if (this.ZI0) {
         BufferUtils.ys0(var3, this.Yq0, var2, var1);
         ((Buffer)this.Qm0).position(0);
         ((Buffer)this.Qm0).limit(var2);
      } else {
         ((Buffer)this.Qm0).clear();
         this.Qm0.put(var3, var1, var2);
         ((Buffer)this.Qm0).flip();
         ((Buffer)this.Yq0).position(0);
         ((Buffer)this.Yq0).limit(this.Qm0.limit() << 2);
      }

      if (this.F40) {
         sY var10001 = lg_0.Sf0;
         int var4 = this.Yq0.limit();
         ByteBuffer var5 = this.Yq0;
         var10001.glBufferSubData(34962, 0, var4, var5);
         this.lI = false;
      }
   }

   @Override
   public final void Fn0(lt_1 var1, int[] var2) {
      sY var3 = lg_0.Sf0;
      lg_0.Sf0.glBindBuffer(34962, this.UI);
      if (this.lI) {
         ((Buffer)this.Yq0).limit(this.Qm0.limit() * 4);
         int var12 = this.Yq0.limit();
         ByteBuffer var4 = this.Yq0;
         int var5 = this.Qt;
         var3.glBufferData(34962, var12, var4, var5);
         this.lI = false;
      }

      int var13 = this.v0.Os.length;
      if (var2 == null) {
         for (int var11 = 0; var11 < var13; var11++) {
            kz_0 var14;
            String var17 = (var14 = this.v0.Os[var11]).ot0;
            int var18;
            if ((var18 = var1.Us.Rl0(-1, var17)) >= 0) {
               lg_0.Sf0.glEnableVertexAttribArray(var18);
               int var15 = var14.dG0;
               int var6 = var14.IK0;
               boolean var7 = var14.UO;
               int var8 = this.v0.u5;
               int var9 = var14.Kk0;
               lg_0.Sf0.glVertexAttribPointer(var18, var15, var6, var7, var8, var9);
            }
         }
      } else {
         for (int var16 = 0; var16 < var13; var16++) {
            kz_0 var19 = this.v0.Os[var16];
            int var21;
            if ((var21 = var2[var16]) >= 0) {
               sY var10005 = lg_0.Sf0;
               var1.getClass();
               var10005.glEnableVertexAttribArray(var21);
               int var20 = var19.dG0;
               int var22 = var19.IK0;
               boolean var23 = var19.UO;
               int var24 = this.v0.u5;
               int var10 = var19.Kk0;
               lg_0.Sf0.glVertexAttribPointer(var21, var20, var22, var23, var24, var10);
            }
         }
      }

      this.F40 = true;
   }

   @Override
   public final void yK0(lt_1 var1, int[] var2) {
      sY var3 = lg_0.Sf0;
      int var4 = this.v0.Os.length;
      if (var2 == null) {
         for (int var7 = 0; var7 < var4; var7++) {
            var1.kC(this.v0.Os[var7].ot0);
         }
      } else {
         for (int var5 = 0; var5 < var4; var5++) {
            int var6;
            if ((var6 = var2[var5]) >= 0) {
               sY var10000 = lg_0.Sf0;
               var1.getClass();
               var10000.glDisableVertexAttribArray(var6);
            }
         }
      }

      var3.glBindBuffer(34962, 0);
      this.F40 = false;
   }

   @Override
   public final void dispose() {
      sY var10001 = lg_0.Sf0;
      lg_0.Sf0.glBindBuffer(34962, 0);
      var10001.glDeleteBuffer(this.UI);
      this.UI = 0;
   }

   public final int D80() {
      int var1;
      int var10000 = var1 = lg_0.Sf0.glGenBuffer();
      lg_0.Sf0.glBindBuffer(34962, var1);
      sY var10001 = lg_0.Sf0;
      int var2 = this.Yq0.capacity();
      var1 = this.Qt;
      var10001.glBufferData(34962, var2, null, var1);
      lg_0.Sf0.glBindBuffer(34962, 0);
      return var10000;
   }
}
