package com.badlogic.gdx.math;

import f.C8;
import f.LW;
import f.me0_2;
import f.uj_0;
import java.io.Serializable;

public class Matrix4 implements Serializable {
   private static final long serialVersionUID = -2717655254359579617L;
   public static final me0_2 EK = new me0_2();
   public static final C8 V3;
   public static final C8 eT;
   public static final C8 Av;
   public static final C8 K70;
   public static final Matrix4 Pm;
   public final float[] EW;

   public Matrix4() {
      float[] var10000 = this.EW = new float[16];
      var10000[0] = 1.0F;
      var10000[5] = 1.0F;
      var10000[10] = 1.0F;
      var10000[15] = 1.0F;
   }

   public Matrix4(Matrix4 var1) {
      this.EW = new float[16];
      this.BE(var1);
   }

   public Matrix4(float[] var1) {
      this.EW = new float[16];
      this.Dd0(var1);
   }

   public Matrix4(me0_2 var1) {
      this.EW = new float[16];
      this.km0(var1);
   }

   public Matrix4(C8 var1, me0_2 var2, C8 var3) {
      this.EW = new float[16];
      this.oF0(var1, var2, var3);
   }

   public static native void prj(float[] var0, float[] var1, int var2, int var3, int var4);

   public static void md0(float[] var0, float[] var1) {
      float var2;
      float var3;
      float var4;
      float var5;
      float var6;
      float var7;
      float var8 = (var6 = var0[8]) * (var7 = var1[2]) + (var4 = var0[4]) * (var5 = var1[1]) + (var2 = var0[0]) * (var3 = var1[0]);
      float var9;
      float var10000 = var9 = var0[12];
      float[] var10001 = var1;
      float var10002 = var6;
      float[] var10003 = var1;
      float var10004 = var4;
      float[] var10005 = var1;
      float var10006 = var2;
      float[] var10007 = var1;
      float var10008 = var9;
      float[] var10009 = var1;
      float var10010 = var6;
      float[] var10011 = var1;
      float var10012 = var4;
      float[] var10013 = var1;
      float var10014 = var2;
      float[] var10015 = var1;
      float var10016 = var9;
      float[] var10017 = var1;
      float var10018 = var6;
      float[] var10019 = var1;
      float var10020 = var4;
      float[] var10021 = var1;
      float var10022 = var2;
      float[] var10023 = var1;
      float var31;
      var2 = var9 * (var31 = var1[3]) + var8;
      var6 = var10022 * (var4 = var10023[4]);
      var6 = var10020 * (var8 = var10021[5]) + var6;
      var6 = var10018 * (var9 = var10019[6]) + var6;
      float var10;
      var6 = var10016 * (var10 = var10017[7]) + var6;
      float var11;
      float var12 = var10014 * (var11 = var10015[8]);
      float var13;
      var12 = var10012 * (var13 = var10013[9]) + var12;
      float var14;
      var12 = var10010 * (var14 = var10011[10]) + var12;
      float var15;
      var12 = var10008 * (var15 = var10009[11]) + var12;
      float var16;
      float var17 = var10006 * (var16 = var10007[12]);
      float var18;
      var17 = var10004 * (var18 = var10005[13]) + var17;
      float var19;
      var17 = var10002 * (var19 = var10003[14]) + var17;
      float var20;
      var17 = var10000 * (var20 = var10001[15]) + var17;
      float var21;
      float var22;
      float var23;
      float var24 = (var23 = var0[9]) * var7 + (var22 = var0[5]) * var5 + (var21 = var0[1]) * var3;
      float var25;
      var10000 = var25 = var0[13];
      var10002 = var23;
      var10004 = var22;
      var10006 = var21;
      var10010 = var23;
      var10012 = var22;
      var10014 = var21;
      var10020 = var22;
      var10022 = var21;
      var21 = var25 * var31 + var24;
      var22 = var10022 * var4;
      var22 = var10020 * var8 + var22;
      var22 = var23 * var9 + var22;
      var22 = var25 * var10 + var22;
      var23 = var10014 * var11;
      var23 = var10012 * var13 + var23;
      var23 = var10010 * var14 + var23;
      var23 = var25 * var15 + var23;
      var24 = var10006 * var16;
      var24 = var10004 * var18 + var24;
      var24 = var10002 * var19 + var24;
      var24 = var10000 * var20 + var24;
      float var26;
      float var27;
      float var28 = (var27 = var0[10]) * var7 + (var26 = var0[6]) * var5 + (var25 = var0[2]) * var3;
      float var29;
      var10000 = var29 = var0[14];
      var10002 = var27;
      var10004 = var26;
      var10006 = var25;
      var10010 = var27;
      var10012 = var26;
      var10014 = var25;
      var10020 = var26;
      var10022 = var25;
      var25 = var29 * var31 + var28;
      var26 = var10022 * var4;
      var26 = var10020 * var8 + var26;
      var26 = var27 * var9 + var26;
      var26 = var29 * var10 + var26;
      var27 = var10014 * var11;
      var27 = var10012 * var13 + var27;
      var27 = var10010 * var14 + var27;
      var27 = var29 * var15 + var27;
      var28 = var10006 * var16;
      var28 = var10004 * var18 + var28;
      var28 = var10002 * var19 + var28;
      var28 = var10000 * var20 + var28;
      var10000 = (var29 = var0[3]) * var3;
      var10000 = (var3 = var0[7]) * var5 + var10000;
      var7 = (var5 = var0[11]) * var7 + var10000;
      float var30;
      var10000 = var30 = var0[15];
      var10002 = var5;
      var10004 = var3;
      var10012 = var3;
      var10020 = var3;
      float var32 = var30 * var31 + var7;
      var3 = var29 * var4;
      var3 = var10020 * var8 + var3;
      var3 = var5 * var9 + var3;
      var3 = var30 * var10 + var3;
      var4 = var29 * var11;
      var4 = var10012 * var13 + var4;
      var4 = var5 * var14 + var4;
      var4 = var30 * var15 + var4;
      var5 = var29 * var16;
      var5 = var10004 * var18 + var5;
      var5 = var10002 * var19 + var5;
      var5 = var10000 * var20 + var5;
      var0[0] = var2;
      var0[1] = var21;
      var0[2] = var25;
      var0[3] = var32;
      var0[4] = var6;
      var0[5] = var22;
      var0[6] = var26;
      var0[7] = var3;
      var0[8] = var12;
      var0[9] = var23;
      var0[10] = var27;
      var0[11] = var4;
      var0[12] = var17;
      var0[13] = var24;
      var0[14] = var28;
      var0[15] = var5;
   }

   static {
      new me0_2();
      V3 = new C8();
      eT = new C8();
      Av = new C8();
      K70 = new C8();
      Pm = new Matrix4();
      new C8();
      new C8();
      new C8();
   }

   public static void Hl(float[] param0) {
      /*
       * Static matrix inverse. CFR could not reconstruct this method and left
       * it empty, but the original bytecode matches libGDX Matrix4.inv(float[])
       * with a void result: if the determinant is zero it returns without
       * modifying the array, otherwise it writes the inverse in-place.
       *
       * This method is used by camera/viewport unprojection paths; leaving it
       * empty makes screen coordinates fail to map back into UI/world space,
       * which shows up as mouse clicks being received by GLFW but ignored by
       * the game widgets.
       */
      float l_det = param0[3] * param0[6] * param0[9] * param0[12]
         - param0[2] * param0[7] * param0[9] * param0[12]
         - param0[3] * param0[5] * param0[10] * param0[12]
         + param0[1] * param0[7] * param0[10] * param0[12]
         + param0[2] * param0[5] * param0[11] * param0[12]
         - param0[1] * param0[6] * param0[11] * param0[12]
         - param0[3] * param0[6] * param0[8] * param0[13]
         + param0[2] * param0[7] * param0[8] * param0[13]
         + param0[3] * param0[4] * param0[10] * param0[13]
         - param0[0] * param0[7] * param0[10] * param0[13]
         - param0[2] * param0[4] * param0[11] * param0[13]
         + param0[0] * param0[6] * param0[11] * param0[13]
         + param0[3] * param0[5] * param0[8] * param0[14]
         - param0[1] * param0[7] * param0[8] * param0[14]
         - param0[3] * param0[4] * param0[9] * param0[14]
         + param0[0] * param0[7] * param0[9] * param0[14]
         + param0[1] * param0[4] * param0[11] * param0[14]
         - param0[0] * param0[5] * param0[11] * param0[14]
         - param0[2] * param0[5] * param0[8] * param0[15]
         + param0[1] * param0[6] * param0[8] * param0[15]
         + param0[2] * param0[4] * param0[9] * param0[15]
         - param0[0] * param0[6] * param0[9] * param0[15]
         - param0[1] * param0[4] * param0[10] * param0[15]
         + param0[0] * param0[5] * param0[10] * param0[15];
      if (l_det == 0.0F) {
         return;
      }

      float m00 = param0[9] * param0[14] * param0[7] - param0[13] * param0[10] * param0[7]
         + param0[13] * param0[6] * param0[11] - param0[5] * param0[14] * param0[11]
         - param0[9] * param0[6] * param0[15] + param0[5] * param0[10] * param0[15];
      float m01 = param0[12] * param0[10] * param0[7] - param0[8] * param0[14] * param0[7]
         - param0[12] * param0[6] * param0[11] + param0[4] * param0[14] * param0[11]
         + param0[8] * param0[6] * param0[15] - param0[4] * param0[10] * param0[15];
      float m02 = param0[8] * param0[13] * param0[7] - param0[12] * param0[9] * param0[7]
         + param0[12] * param0[5] * param0[11] - param0[4] * param0[13] * param0[11]
         - param0[8] * param0[5] * param0[15] + param0[4] * param0[9] * param0[15];
      float m03 = param0[12] * param0[9] * param0[6] - param0[8] * param0[13] * param0[6]
         - param0[12] * param0[5] * param0[10] + param0[4] * param0[13] * param0[10]
         + param0[8] * param0[5] * param0[14] - param0[4] * param0[9] * param0[14];
      float m10 = param0[13] * param0[10] * param0[3] - param0[9] * param0[14] * param0[3]
         - param0[13] * param0[2] * param0[11] + param0[1] * param0[14] * param0[11]
         + param0[9] * param0[2] * param0[15] - param0[1] * param0[10] * param0[15];
      float m11 = param0[8] * param0[14] * param0[3] - param0[12] * param0[10] * param0[3]
         + param0[12] * param0[2] * param0[11] - param0[0] * param0[14] * param0[11]
         - param0[8] * param0[2] * param0[15] + param0[0] * param0[10] * param0[15];
      float m12 = param0[12] * param0[9] * param0[3] - param0[8] * param0[13] * param0[3]
         - param0[12] * param0[1] * param0[11] + param0[0] * param0[13] * param0[11]
         + param0[8] * param0[1] * param0[15] - param0[0] * param0[9] * param0[15];
      float m13 = param0[8] * param0[13] * param0[2] - param0[12] * param0[9] * param0[2]
         + param0[12] * param0[1] * param0[10] - param0[0] * param0[13] * param0[10]
         - param0[8] * param0[1] * param0[14] + param0[0] * param0[9] * param0[14];
      float m20 = param0[5] * param0[14] * param0[3] - param0[13] * param0[6] * param0[3]
         + param0[13] * param0[2] * param0[7] - param0[1] * param0[14] * param0[7]
         - param0[5] * param0[2] * param0[15] + param0[1] * param0[6] * param0[15];
      float m21 = param0[12] * param0[6] * param0[3] - param0[4] * param0[14] * param0[3]
         - param0[12] * param0[2] * param0[7] + param0[0] * param0[14] * param0[7]
         + param0[4] * param0[2] * param0[15] - param0[0] * param0[6] * param0[15];
      float m22 = param0[4] * param0[13] * param0[3] - param0[12] * param0[5] * param0[3]
         + param0[12] * param0[1] * param0[7] - param0[0] * param0[13] * param0[7]
         - param0[4] * param0[1] * param0[15] + param0[0] * param0[5] * param0[15];
      float m23 = param0[12] * param0[5] * param0[2] - param0[4] * param0[13] * param0[2]
         - param0[12] * param0[1] * param0[6] + param0[0] * param0[13] * param0[6]
         + param0[4] * param0[1] * param0[14] - param0[0] * param0[5] * param0[14];
      float m30 = param0[9] * param0[6] * param0[3] - param0[5] * param0[10] * param0[3]
         - param0[9] * param0[2] * param0[7] + param0[1] * param0[10] * param0[7]
         + param0[5] * param0[2] * param0[11] - param0[1] * param0[6] * param0[11];
      float m31 = param0[4] * param0[10] * param0[3] - param0[8] * param0[6] * param0[3]
         + param0[8] * param0[2] * param0[7] - param0[0] * param0[10] * param0[7]
         - param0[4] * param0[2] * param0[11] + param0[0] * param0[6] * param0[11];
      float m32 = param0[8] * param0[5] * param0[3] - param0[4] * param0[9] * param0[3]
         - param0[8] * param0[1] * param0[7] + param0[0] * param0[9] * param0[7]
         + param0[4] * param0[1] * param0[11] - param0[0] * param0[5] * param0[11];
      float m33 = param0[4] * param0[9] * param0[2] - param0[8] * param0[5] * param0[2]
         + param0[8] * param0[1] * param0[6] - param0[0] * param0[9] * param0[6]
         - param0[4] * param0[1] * param0[10] + param0[0] * param0[5] * param0[10];

      float invDet = 1.0F / l_det;
      param0[0] = m00 * invDet;
      param0[1] = m10 * invDet;
      param0[2] = m20 * invDet;
      param0[3] = m30 * invDet;
      param0[4] = m01 * invDet;
      param0[5] = m11 * invDet;
      param0[6] = m21 * invDet;
      param0[7] = m31 * invDet;
      param0[8] = m02 * invDet;
      param0[9] = m12 * invDet;
      param0[10] = m22 * invDet;
      param0[11] = m32 * invDet;
      param0[12] = m03 * invDet;
      param0[13] = m13 * invDet;
      param0[14] = m23 * invDet;
      param0[15] = m33 * invDet;
   }

   public final Matrix4 Dd0(float[] var1) {
      Matrix4 var10000 = this;
      float[] var10001 = var1;
      float[] var2;
      int var3 = (var2 = this.EW).length;
      System.arraycopy(var10001, 0, var2, 0, var3);
      return var10000;
   }

   public final Matrix4 km0(me0_2 var1) {
      Matrix4 var10000 = this;
      me0_2 var10001 = var1;
      me0_2 var10002 = var1;
      float var4 = var1.m1;
      float var5 = var1.ao0;
      float var2 = var10002.th;
      float var3 = var10001.Au0;
      return var10000.vh(0.0F, 0.0F, 0.0F, var4, var5, var2, var3);
   }

   public final Matrix4 vh(float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      Matrix4 var10000 = this;
      Matrix4 var10001 = this;
      float var10002 = var6;
      float var10003 = var5;
      float var10004 = var5;
      float var10005 = var4;
      float var10006 = var4;
      float var10007 = var4;
      float var10008 = var7;
      float var13 = var4 * 2.0F;
      var4 = var5 * 2.0F;
      var5 = var6 * 2.0F;
      var6 = var7 * var13;
      var7 *= var4;
      float var8 = var10008 * var5;
      var13 = var10007 * var13;
      float var9 = var10006 * var4;
      float var10 = var10005 * var5;
      var4 = var10004 * var4;
      float var11 = var10003 * var5;
      var5 = var10002 * var5;
      float[] var12;
      float[] var21 = var12 = var10001.EW;
      var12[0] = 1.0F - (var4 + var5);
      var12[4] = var9 - var8;
      var12[8] = var10 + var7;
      var12[12] = var1;
      var12[1] = var9 + var8;
      var12[5] = 1.0F - (var13 + var5);
      var12[9] = var11 - var6;
      var12[13] = var2;
      var12[2] = var10 - var7;
      var12[6] = var11 + var6;
      var21[10] = 1.0F - (var13 + var4);
      var21[14] = var3;
      var21[3] = 0.0F;
      var21[7] = 0.0F;
      var21[11] = 0.0F;
      var21[15] = 1.0F;
      return var10000;
   }

   public final Matrix4 oF0(C8 var1, me0_2 var2, C8 var3) {
      Matrix4 var10000 = this;
      C8 var10001 = var3;
      C8 var10002 = var3;
      C8 var10003 = var3;
      me0_2 var10004 = var2;
      me0_2 var10005 = var2;
      me0_2 var10006 = var2;
      me0_2 var10007 = var2;
      C8 var10008 = var1;
      float var10 = var1.x;
      float var11 = var1.y;
      float var12 = var10008.z;
      float var13 = var10007.m1;
      float var4 = var10006.ao0;
      float var5 = var10005.th;
      float var6 = var10004.Au0;
      float var7 = var10003.x;
      float var8 = var10002.y;
      float var9 = var10001.z;
      return var10000.oC(var10, var11, var12, var13, var4, var5, var6, var7, var8, var9);
   }

   public final Matrix4 oC(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      Matrix4 var10000 = this;
      Matrix4 var10001 = this;
      float var10002 = var6;
      float var10003 = var5;
      float var10004 = var5;
      float var10005 = var4;
      float var10006 = var4;
      float var10007 = var4;
      float var10008 = var7;
      float var16 = var4 * 2.0F;
      var4 = var5 * 2.0F;
      var5 = var6 * 2.0F;
      var6 = var7 * var16;
      var7 *= var4;
      float var11 = var10008 * var5;
      var16 = var10007 * var16;
      float var12 = var10006 * var4;
      float var13 = var10005 * var5;
      var4 = var10004 * var4;
      float var14 = var10003 * var5;
      var5 = var10002 * var5;
      float[] var15;
      float[] var24 = var15 = var10001.EW;
      var15[0] = (1.0F - (var4 + var5)) * var8;
      var15[4] = (var12 - var11) * var9;
      var15[8] = (var13 + var7) * var10;
      var15[12] = var1;
      var15[1] = (var12 + var11) * var8;
      var15[5] = (1.0F - (var16 + var5)) * var9;
      var15[9] = (var14 - var6) * var10;
      var15[13] = var2;
      var15[2] = (var13 - var7) * var8;
      var15[6] = (var14 + var6) * var9;
      var24[10] = (1.0F - (var16 + var4)) * var10;
      var24[14] = var3;
      var24[3] = 0.0F;
      var24[7] = 0.0F;
      var24[11] = 0.0F;
      var24[15] = 1.0F;
      return var10000;
   }

   public Matrix4 s7() {
      return new Matrix4(this);
   }

   public final Matrix4 F() {
      float[] var10001 = this.EW;
      var10001[0] = 1.0F;
      var10001[4] = 0.0F;
      var10001[8] = 0.0F;
      var10001[12] = 0.0F;
      var10001[1] = 0.0F;
      var10001[5] = 1.0F;
      var10001[9] = 0.0F;
      var10001[13] = 0.0F;
      var10001[2] = 0.0F;
      var10001[6] = 0.0F;
      var10001[10] = 1.0F;
      var10001[14] = 0.0F;
      var10001[3] = 0.0F;
      var10001[7] = 0.0F;
      var10001[11] = 0.0F;
      var10001[15] = 1.0F;
      return this;
   }

   public final float rA0() {
      float[] var15;
      float[] var10000 = var15 = this.EW;
      float var1;
      float var10001 = var1 = var10000[3];
      float var2;
      float var3;
      float var4;
      float var5 = var1 * (var2 = var15[6]) * (var3 = var15[9]) * (var4 = var15[12]);
      float var6;
      float var10003 = var6 = var15[2];
      float var23;
      float var7 = var5 - var6 * (var23 = var15[7]) * var3 * var4;
      float var8;
      float var9;
      var7 = uj_0.SJ0(var1 * (var8 = var15[5]), var9 = var15[10], var4, var7);
      float var10 = var15[1];
      var7 = var10 * var23 * var9 * var4 + var7;
      float var11;
      float var22;
      float var26;
      float var12 = var10003 * var8 * (var11 = var15[11]) * var4 + var7 - var10 * var2 * var11 * var4 - var1 * var2 * (var22 = var15[8]) * (var26 = var15[13]);
      var12 = var10003 * var23 * var22 * var26 + var12;
      float var13;
      var12 = var10001 * (var13 = var15[4]) * var9 * var26 + var12;
      float var14;
      float var32 = var14 = var10000[0];
      var12 = var12 - var14 * var23 * var9 * var26 - var6 * var13 * var11 * var26;
      var7 = var14 * var2 * var11 * var26 + var12;
      var1 = var1 * var8 * var22 * (var12 = var15[14]) + var7 - var10 * var23 * var22 * var12 - var1 * var13 * var3 * var12;
      var1 = var14 * var23 * var3 * var12 + var1;
      float var16;
      var1 = var10 * var13 * var11 * var12 + var1 - var14 * var8 * var11 * var12 - var6 * var8 * var22 * (var16 = var15[15]);
      var1 = var10 * var2 * var22 * var16 + var1;
      var1 = var6 * var13 * var3 * var16 + var1 - var14 * var2 * var3 * var16 - var10 * var13 * var9 * var16;
      return var32 * var8 * var9 * var16 + var1;
   }

   public final Matrix4 Yp0(float var1, float var2, float var3) {
      this.F();
      float[] var10001 = this.EW;
      var10001[12] = var1;
      var10001[13] = var2;
      var10001[14] = var3;
      return this;
   }

   public final C8 V1(C8 var1) {
      float[] var2;
      float[] var10002 = var2 = this.EW;
      var1.x = var2[12];
      var1.y = var2[13];
      var1.z = var10002[14];
      return var1;
   }

   public final String toString() {
      return "[" + this.EW[0] + "|" + this.EW[4] + "|" + this.EW[8] + "|" + this.EW[12] + "]\n[" + this.EW[1] + "|" + this.EW[5] + "|" + this.EW[9] + "|" + this.EW[13] + "]\n[" + this.EW[2] + "|" + this.EW[6] + "|" + this.EW[10] + "|" + this.EW[14] + "]\n[" + this.EW[3] + "|" + this.EW[7] + "|" + this.EW[11] + "|" + this.EW[15] + "]\n";
   }

   public final Matrix4 el0(float var1, float var2, float var3) {
      Matrix4 var10000 = this;
      float[] var10001 = this.EW;
      float var5 = var10001[12];
      float var4 = var10001[0] * var1;
      var4 = var10001[4] * var2 + var4;
      var10001[12] = var10001[8] * var3 + var4 + var5;
      var5 = var10001[13];
      var4 = var10001[1] * var1;
      var4 = var10001[5] * var2 + var4;
      var10001[13] = var10001[9] * var3 + var4 + var5;
      var5 = var10001[14];
      var4 = var10001[2] * var1;
      var4 = var10001[6] * var2 + var4;
      var10001[14] = var10001[10] * var3 + var4 + var5;
      var5 = var10001[15];
      var1 = var10001[3] * var1;
      var1 = var10001[7] * var2 + var1;
      var10001[15] = var10001[11] * var3 + var1 + var5;
      return var10000;
   }

   public final Matrix4 tO(C8 var1, float var2) {
      if (var2 == 0.0F) {
         return this;
      } else {
         Matrix4 var10000 = this;
         me0_2 var4;
         me0_2 var10001 = var4 = EK;
         float var10003 = var2;
         C8 var10004 = var1;
         var4.getClass();
         float var5 = var1.x;
         float var6 = var1.y;
         var2 = var10004.z;
         float var3 = var10003 * ((float)Math.PI / 180F);
         var10001.h50(var5, var6, var2, var3);
         return var10000.qt(var10001);
      }
   }

   public final Matrix4 qt(me0_2 param1) {
      /*
       * This is the in-place quaternion rotation from libGDX's
       * Matrix4.rotate(Quaternion).  The previous reconstruction built a
       * temporary matrix through oC(...), which is not equivalent here:
       * oC replaces the temporary matrix, while the bytecode for this method
       * multiplies the current matrix by the quaternion rotation directly.
       * Besides changing transforms, that can move the input/UI coordinate
       * space and make GLFW mouse coordinates miss their hit targets.
       */
      float x = param1.m1;
      float y = param1.ao0;
      float z = param1.th;
      float w = param1.Au0;
      float xx = x * x;
      float xy = x * y;
      float xz = x * z;
      float xw = x * w;
      float yy = y * y;
      float yz = y * z;
      float yw = y * w;
      float zz = z * z;
      float zw = z * w;

      float r00 = 1.0F - 2.0F * (yy + zz);
      float r01 = 2.0F * (xy - zw);
      float r02 = 2.0F * (xz + yw);
      float r10 = 2.0F * (xy + zw);
      float r11 = 1.0F - 2.0F * (xx + zz);
      float r12 = 2.0F * (yz - xw);
      float r20 = 2.0F * (xz - yw);
      float r21 = 2.0F * (yz + xw);
      float r22 = 1.0F - 2.0F * (xx + yy);

      float m00 = this.EW[0] * r00 + this.EW[4] * r10 + this.EW[8] * r20;
      float m01 = this.EW[0] * r01 + this.EW[4] * r11 + this.EW[8] * r21;
      float m02 = this.EW[0] * r02 + this.EW[4] * r12 + this.EW[8] * r22;
      float m10 = this.EW[1] * r00 + this.EW[5] * r10 + this.EW[9] * r20;
      float m11 = this.EW[1] * r01 + this.EW[5] * r11 + this.EW[9] * r21;
      float m12 = this.EW[1] * r02 + this.EW[5] * r12 + this.EW[9] * r22;
      float m20 = this.EW[2] * r00 + this.EW[6] * r10 + this.EW[10] * r20;
      float m21 = this.EW[2] * r01 + this.EW[6] * r11 + this.EW[10] * r21;
      float m22 = this.EW[2] * r02 + this.EW[6] * r12 + this.EW[10] * r22;
      float m30 = this.EW[3] * r00 + this.EW[7] * r10 + this.EW[11] * r20;
      float m31 = this.EW[3] * r01 + this.EW[7] * r11 + this.EW[11] * r21;
      float m32 = this.EW[3] * r02 + this.EW[7] * r12 + this.EW[11] * r22;

      this.EW[0] = m00;
      this.EW[1] = m10;
      this.EW[2] = m20;
      this.EW[3] = m30;
      this.EW[4] = m01;
      this.EW[5] = m11;
      this.EW[6] = m21;
      this.EW[7] = m31;
      this.EW[8] = m02;
      this.EW[9] = m12;
      this.EW[10] = m22;
      this.EW[11] = m32;
      return this;
   }

   public final boolean Mq0() {
      return !LW.LH0(this.EW[0], 1.0F) || !LW.LH0(this.EW[5], 1.0F) || !LW.LH0(this.EW[10], 1.0F) || !LW.iF(this.EW[4]) || !LW.iF(this.EW[8]) || !LW.iF(this.EW[1]) || !LW.iF(this.EW[9]) || !LW.iF(this.EW[2]) || !LW.iF(this.EW[6]);
   }

   public final void BE(Matrix4 var1) {
      this.Dd0(var1.EW);
   }

   public final void NG(Matrix4 var1) {
      md0(this.EW, var1.EW);
   }

   public final void BI(float var1, float var2) {
      Matrix4 var10000 = this;
      float var10001 = 0.0F + var1;
      float var3 = 0.0F + var2;
      var10000.QA(0.0F, var10001, 0.0F, var3, 0.0F, 1.0F);
   }

   public final void QA(float var1, float var2, float var3, float var4, float var5, float var6) {
      Matrix4 var10000 = this;
      float var10002 = var5;
      float var10003 = var4;
      float var10004 = var3;
      float var10005 = var2;
      float var10006 = var1;
      float var7 = var2 - var1;
      var1 = 2.0F / var7;
      var2 = var4 - var3;
      var3 = 2.0F / var2;
      var4 = var6 - var5;
      var5 = -2.0F / var4;
      var7 = -(var10005 + var10006) / var7;
      var2 = -(var10003 + var10004) / var2;
      var4 = -(var6 + var10002) / var4;
      float[] var16 = var10000.EW;
      var16[0] = var1;
      var16[1] = 0.0F;
      var16[2] = 0.0F;
      var16[3] = 0.0F;
      var16[4] = 0.0F;
      var16[5] = var3;
      var16[6] = 0.0F;
      var16[7] = 0.0F;
      var16[8] = 0.0F;
      var16[9] = 0.0F;
      var16[10] = var5;
      var16[11] = 0.0F;
      var16[12] = var7;
      var16[13] = var2;
      var16[14] = var4;
      var16[15] = 1.0F;
   }

   public final void Y1(C8 var1) {
      float[] var2;
      float[] var10000 = var2 = this.EW;
      var2[12] = var1.x;
      var2[13] = var1.y;
      var10000[14] = var1.z;
   }

   public final void m80(float var1, float var2, float var3) {
      float[] var10000 = this.EW;
      var10000[12] = var1;
      var10000[13] = var2;
      var10000[14] = var3;
   }

   public final void IW(C8 var1) {
      this.F();
      float[] var2;
      float[] var10000 = var2 = this.EW;
      var2[12] = var1.x;
      var2[13] = var1.y;
      var10000[14] = var1.z;
   }

   public final void CN(C8 var1, float var2) {
      if (var2 == 0.0F) {
         this.F();
      } else {
         Matrix4 var10000 = this;
         me0_2 var4;
         me0_2 var10001 = var4 = EK;
         float var10002 = var2;
         C8 var10003 = var1;
         var4.getClass();
         float var5 = var1.x;
         float var6 = var1.y;
         var2 = var10003.z;
         float var3 = var10002 * ((float)Math.PI / 180F);
         var10000.km0(var10001.h50(var5, var6, var2, var3));
      }
   }

   public final void co(C8 var1, C8 var2, C8 var3) {
      Matrix4 var10000 = this;
      Matrix4 var10001 = this;
      Matrix4 var10002 = this;
      C8 var7;
      C8 var10003 = var7 = K70;
      C8 var10010 = var2;
      C8 var10011 = var2;
      var7.getClass();
      float var12 = var2.x;
      float var4 = var10011.y;
      float var5 = var10010.z;
      var7.x = var12;
      var7.y = var4;
      var7.z = var5;
      var12 = var1.x;
      var4 = var1.y;
      var5 = var1.z;
      var10003.Vy(var12, var4, var5);
      C8 var14;
      var10003 = var14 = V3;
      var14.getClass();
      var4 = var7.x;
      var5 = var7.y;
      float var6 = var7.z;
      var10003.x = var4;
      var10003.y = var5;
      var10003.z = var6;
      var10003.KM();
      C8 var20;
      var10003 = var20 = eT;
      C8 var10004 = var3;
      C8 var10008 = var7;
      C8 var10009 = var7;
      var20.getClass();
      float var8 = var7.x;
      float var15 = var10009.y;
      var5 = var10008.z;
      var20.x = var8;
      var20.y = var15;
      var20.z = var5;
      var10003.Xv0(var10004).KM();
      C8 var9;
      var10003 = var9 = Av;
      var9.getClass();
      var15 = var20.x;
      var5 = var20.y;
      var6 = var20.z;
      var9.x = var15;
      var9.y = var5;
      var9.z = var6;
      var10003.Xv0(var14).KM();
      var10002.F();
      float[] var17;
      float[] var26 = var17 = var10001.EW;
      var17[0] = var20.x;
      var17[4] = var20.y;
      var17[8] = var20.z;
      var17[1] = var9.x;
      var17[5] = var9.y;
      var17[9] = var9.z;
      var17[2] = -var14.x;
      var17[6] = -var14.y;
      var26[10] = -var14.z;
      float var27 = -var1.x;
      float var10 = -var1.y;
      Matrix4 var11 = Pm.Yp0(var27, var10, -var1.z);
      md0(var10000.EW, var11.EW);
   }

   public final void hr(float var1) {
      float[] var10000 = this.EW;
      var10000[0] *= var1;
      var10000[5] *= var1;
      var10000[10] *= var1;
   }

   public final void qs0(C8 var1) {
      float var8;
      if (LW.iF(this.EW[4]) && LW.iF(this.EW[8])) {
         var8 = Math.abs(this.EW[0]);
      } else {
         float[] var10000 = this.EW;
         var8 = var10000[0] * var10000[0];
         var8 = var10000[4] * var10000[4] + var8;
         var8 = (float)Math.sqrt((double)(var10000[8] * var10000[8] + var8));
      }

      float var10;
      if (LW.iF(this.EW[1]) && LW.iF(this.EW[9])) {
         var10 = Math.abs(this.EW[5]);
      } else {
         float[] var11 = this.EW;
         var10 = var11[1] * var11[1];
         var10 = var11[5] * var11[5] + var10;
         var10 = (float)Math.sqrt((double)(var11[9] * var11[9] + var10));
      }

      float var6;
      if (LW.iF(this.EW[2]) && LW.iF(this.EW[6])) {
         var6 = Math.abs(this.EW[10]);
      } else {
         float[] var12 = this.EW;
         var6 = var12[2] * var12[2];
         var6 = var12[6] * var12[6] + var6;
         var6 = (float)Math.sqrt((double)(var12[10] * var12[10] + var6));
      }

      var1.x = var8;
      var1.y = var10;
      var1.z = var6;
   }

   public final void w2(float var1, float var2, float var3) {
      float[] var5;
      float var4 = (var5 = this.EW)[0] * var1;
      var5[0] = var4;
      var4 = var5[4] * var2;
      var5[4] = var4;
      var4 = var5[8] * var3;
      var5[8] = var4;
      var4 = var5[1] * var1;
      var5[1] = var4;
      var4 = var5[5] * var2;
      var5[5] = var4;
      var4 = var5[9] * var3;
      var5[9] = var4;
      var4 = var5[2] * var1;
      var5[2] = var4;
      var4 = var5[6] * var2;
      var5[6] = var4;
      var4 = var5[10] * var3;
      var5[10] = var4;
      var1 = var5[3] * var1;
      var5[3] = var1;
      var1 = var5[7] * var2;
      var5[7] = var1;
      var1 = var5[11] * var3;
      var5[11] = var1;
   }
}
