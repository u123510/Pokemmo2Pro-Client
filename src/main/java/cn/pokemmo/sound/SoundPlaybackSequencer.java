package cn.pokemmo.sound;

import f.*;

public class SoundPlaybackSequencer implements MJ0 {
   public static final int[][] wg;
   public static final int[] iP;
   public static final float[] oZ;
   public static final float[] TU;
   public static final float[][] W20;
   public static final float[] xr;
   public static int[][] L60;
   public static final float[] QV;
   public static final float[] eD;
   public static final float[][] Ty;
   public static final int[][][] Sc;
   public final int[] e90;
   public final int[] ea0;
   public final float[][][] ih0;
   public final float[][][] Cw0;
   public final float[] gK;
   public final float[][] xh0;
   public final float[][] Ws;
   public final int[] nB;
   public final kk_1 N70;
   public final c50_0 x9;
   public final B7 Oc;
   public final B7 N80;
   public final bn_1 wy;
   public final int Rj0;
   public final dw0 sD;
   public final vm_2 Qi0;
   public final cn_2[] Sv;
   public final int XC0;
   public int Zr0;
   public int mD0;
   public final int il;
   public final int Rq;
   public final int Ig0;
   public final int he0;
   public final float[] CI;
   public final float[] Ba;
   public final int[] cOm9;
   public final int[] k5;
   public final int[] cG0;
   public final int[] yA0;
   public final int[] Bu;
   public final int[] SE0;
   public final float[] N90;
   public final float[] UH;
   public final float[] rf;
   public final MA0[] Q60;

   public SoundPlaybackSequencer(kk_1 var1, c50_0 var2, B7 var3, B7 var4, bn_1 var5) {
      super();
      int var6 = 0;
      this.CI = new float[32];
      this.Ba = new float[32];
      this.cOm9 = new int[4];
      int[] var7;
      (var7 = new int[1])[0] = 0;
      this.k5 = var7;
      (var7 = new int[1])[0] = 0;
      this.cG0 = var7;
      (var7 = new int[1])[0] = 0;
      this.yA0 = var7;
      (var7 = new int[1])[0] = 0;
      this.Bu = var7;
      this.SE0 = new int[576];
      this.N90 = new float[576];
      this.UH = new float[18];
      this.rf = new float[36];
      AudioHuffmanCodebookTable.yR();
      this.ea0 = new int[580];
      this.ih0 = new float[2][32][18];
      this.Cw0 = new float[2][32][18];
      this.gK = new float[576];
      this.xh0 = new float[2][576];
      this.Ws = new float[2][576];
      this.nB = new int[2];
      cn_2[] var37;
      cn_2[] var10000 = var37 = new cn_2[2];
      cn_2 var8;
      var8 = new cn_2();
      var10000[0] = var8;
      var8 = new cn_2();
      var10000[1] = var8;
      this.Sv = var37;
      MA0[] var50 = this.Q60 = new MA0[9];
      int[] var38;
      (var38 = new int[23])[0] = 0;
      var38[1] = 6;
      var38[2] = 12;
      var38[3] = 18;
      var38[4] = 24;
      var38[5] = 30;
      var38[6] = 36;
      var38[7] = 44;
      var38[8] = 54;
      var38[9] = 66;
      var38[10] = 80;
      var38[11] = 96;
      var38[12] = 116;
      var38[13] = 140;
      var38[14] = 168;
      var38[15] = 200;
      var38[16] = 238;
      var38[17] = 284;
      var38[18] = 336;
      var38[19] = 396;
      var38[20] = 464;
      var38[21] = 522;
      var38[22] = 576;
      int[] var49;
      int[] var10009 = var49 = new int[14];
      var10009[0] = 0;
      var10009[1] = 4;
      var10009[2] = 8;
      var10009[3] = 12;
      var10009[4] = 18;
      var10009[5] = 24;
      var10009[6] = 32;
      var10009[7] = 42;
      var10009[8] = 56;
      var10009[9] = 74;
      var10009[10] = 100;
      var10009[11] = 132;
      var10009[12] = 174;
      var10009[13] = 192;
      int[] var9;
      (var9 = new int[23])[0] = 0;
      var9[1] = 6;
      var9[2] = 12;
      var9[3] = 18;
      var9[4] = 24;
      var9[5] = 30;
      var9[6] = 36;
      var9[7] = 44;
      var9[8] = 54;
      var9[9] = 66;
      var9[10] = 80;
      var9[11] = 96;
      var9[12] = 114;
      var9[13] = 136;
      var9[14] = 162;
      var9[15] = 194;
      var9[16] = 232;
      var9[17] = 278;
      var9[18] = 330;
      var9[19] = 394;
      var9[20] = 464;
      var9[21] = 540;
      var9[22] = 576;
      int[] var10;
      var10009 = var10 = new int[14];
      var10009[0] = 0;
      var10009[1] = 4;
      var10009[2] = 8;
      var10009[3] = 12;
      var10009[4] = 18;
      var10009[5] = 26;
      var10009[6] = 36;
      var10009[7] = 48;
      var10009[8] = 62;
      var10009[9] = 80;
      var10009[10] = 104;
      var10009[11] = 136;
      var10009[12] = 180;
      var10009[13] = 192;
      int[] var11;
      (var11 = new int[23])[0] = 0;
      var11[1] = 6;
      var11[2] = 12;
      var11[3] = 18;
      var11[4] = 24;
      var11[5] = 30;
      var11[6] = 36;
      var11[7] = 44;
      var11[8] = 54;
      var11[9] = 66;
      var11[10] = 80;
      var11[11] = 96;
      var11[12] = 116;
      var11[13] = 140;
      var11[14] = 168;
      var11[15] = 200;
      var11[16] = 238;
      var11[17] = 284;
      var11[18] = 336;
      var11[19] = 396;
      var11[20] = 464;
      var11[21] = 522;
      var11[22] = 576;
      int[] var12;
      var10009 = var12 = new int[14];
      var10009[0] = 0;
      var10009[1] = 4;
      var10009[2] = 8;
      var10009[3] = 12;
      var10009[4] = 18;
      var10009[5] = 26;
      var10009[6] = 36;
      var10009[7] = 48;
      var10009[8] = 62;
      var10009[9] = 80;
      var10009[10] = 104;
      var10009[11] = 134;
      var10009[12] = 174;
      var10009[13] = 192;
      int[] var13;
      (var13 = new int[23])[0] = 0;
      var13[1] = 4;
      var13[2] = 8;
      var13[3] = 12;
      var13[4] = 16;
      var13[5] = 20;
      var13[6] = 24;
      var13[7] = 30;
      var13[8] = 36;
      var13[9] = 44;
      var13[10] = 52;
      var13[11] = 62;
      var13[12] = 74;
      var13[13] = 90;
      var13[14] = 110;
      var13[15] = 134;
      var13[16] = 162;
      var13[17] = 196;
      var13[18] = 238;
      var13[19] = 288;
      var13[20] = 342;
      var13[21] = 418;
      var13[22] = 576;
      int[] var14;
      var10009 = var14 = new int[14];
      var10009[0] = 0;
      var10009[1] = 4;
      var10009[2] = 8;
      var10009[3] = 12;
      var10009[4] = 16;
      var10009[5] = 22;
      var10009[6] = 30;
      var10009[7] = 40;
      var10009[8] = 52;
      var10009[9] = 66;
      var10009[10] = 84;
      var10009[11] = 106;
      var10009[12] = 136;
      var10009[13] = 192;
      int[] var15;
      (var15 = new int[23])[0] = 0;
      var15[1] = 4;
      var15[2] = 8;
      var15[3] = 12;
      var15[4] = 16;
      var15[5] = 20;
      var15[6] = 24;
      var15[7] = 30;
      var15[8] = 36;
      var15[9] = 42;
      var15[10] = 50;
      var15[11] = 60;
      var15[12] = 72;
      var15[13] = 88;
      var15[14] = 106;
      var15[15] = 128;
      var15[16] = 156;
      var15[17] = 190;
      var15[18] = 230;
      var15[19] = 276;
      var15[20] = 330;
      var15[21] = 384;
      var15[22] = 576;
      int[] var16;
      var10009 = var16 = new int[14];
      var10009[0] = 0;
      var10009[1] = 4;
      var10009[2] = 8;
      var10009[3] = 12;
      var10009[4] = 16;
      var10009[5] = 22;
      var10009[6] = 28;
      var10009[7] = 38;
      var10009[8] = 50;
      var10009[9] = 64;
      var10009[10] = 80;
      var10009[11] = 100;
      var10009[12] = 126;
      var10009[13] = 192;
      int[] var17;
      (var17 = new int[23])[0] = 0;
      var17[1] = 4;
      var17[2] = 8;
      var17[3] = 12;
      var17[4] = 16;
      var17[5] = 20;
      var17[6] = 24;
      var17[7] = 30;
      var17[8] = 36;
      var17[9] = 44;
      var17[10] = 54;
      var17[11] = 66;
      var17[12] = 82;
      var17[13] = 102;
      var17[14] = 126;
      var17[15] = 156;
      var17[16] = 194;
      var17[17] = 240;
      var17[18] = 296;
      var17[19] = 364;
      var17[20] = 448;
      var17[21] = 550;
      var17[22] = 576;
      int[] var18;
      var10009 = var18 = new int[14];
      var10009[0] = 0;
      var10009[1] = 4;
      var10009[2] = 8;
      var10009[3] = 12;
      var10009[4] = 16;
      var10009[5] = 22;
      var10009[6] = 30;
      var10009[7] = 42;
      var10009[8] = 58;
      var10009[9] = 78;
      var10009[10] = 104;
      var10009[11] = 138;
      var10009[12] = 180;
      var10009[13] = 192;
      int[] var19;
      (var19 = new int[23])[0] = 0;
      var19[1] = 6;
      var19[2] = 12;
      var19[3] = 18;
      var19[4] = 24;
      var19[5] = 30;
      var19[6] = 36;
      var19[7] = 44;
      var19[8] = 54;
      var19[9] = 66;
      var19[10] = 80;
      var19[11] = 96;
      var19[12] = 116;
      var19[13] = 140;
      var19[14] = 168;
      var19[15] = 200;
      var19[16] = 238;
      var19[17] = 284;
      var19[18] = 336;
      var19[19] = 396;
      var19[20] = 464;
      var19[21] = 522;
      var19[22] = 576;
      int[] var20;
      var10009 = var20 = new int[14];
      var10009[0] = 0;
      var10009[1] = 4;
      var10009[2] = 8;
      var10009[3] = 12;
      var10009[4] = 18;
      var10009[5] = 26;
      var10009[6] = 36;
      var10009[7] = 48;
      var10009[8] = 62;
      var10009[9] = 80;
      var10009[10] = 104;
      var10009[11] = 134;
      var10009[12] = 174;
      var10009[13] = 192;
      int[] var21;
      (var21 = new int[23])[0] = 0;
      var21[1] = 6;
      var21[2] = 12;
      var21[3] = 18;
      var21[4] = 24;
      var21[5] = 30;
      var21[6] = 36;
      var21[7] = 44;
      var21[8] = 54;
      var21[9] = 66;
      var21[10] = 80;
      var21[11] = 96;
      var21[12] = 116;
      var21[13] = 140;
      var21[14] = 168;
      var21[15] = 200;
      var21[16] = 238;
      var21[17] = 284;
      var21[18] = 336;
      var21[19] = 396;
      var21[20] = 464;
      var21[21] = 522;
      var21[22] = 576;
      int[] var22;
      var10009 = var22 = new int[14];
      var10009[0] = 0;
      var10009[1] = 4;
      var10009[2] = 8;
      var10009[3] = 12;
      var10009[4] = 18;
      var10009[5] = 26;
      var10009[6] = 36;
      var10009[7] = 48;
      var10009[8] = 62;
      var10009[9] = 80;
      var10009[10] = 104;
      var10009[11] = 134;
      var10009[12] = 174;
      var10009[13] = 192;
      int[] var23;
      (var23 = new int[23])[0] = 0;
      var23[1] = 12;
      var23[2] = 24;
      var23[3] = 36;
      var23[4] = 48;
      var23[5] = 60;
      var23[6] = 72;
      var23[7] = 88;
      var23[8] = 108;
      var23[9] = 132;
      var23[10] = 160;
      var23[11] = 192;
      var23[12] = 232;
      var23[13] = 280;
      var23[14] = 336;
      var23[15] = 400;
      var23[16] = 476;
      var23[17] = 566;
      var23[18] = 568;
      var23[19] = 570;
      var23[20] = 572;
      var23[21] = 574;
      var23[22] = 576;
      int[] var24;
      var10009 = var24 = new int[14];
      var10009[0] = 0;
      var10009[1] = 8;
      var10009[2] = 16;
      var10009[3] = 24;
      var10009[4] = 36;
      var10009[5] = 52;
      var10009[6] = 72;
      var10009[7] = 96;
      var10009[8] = 124;
      var10009[9] = 160;
      var10009[10] = 162;
      var10009[11] = 164;
      var10009[12] = 166;
      var10009[13] = 192;
      MA0 var25;
      var25 = new MA0(var38, var49);
      var50[0] = var25;
      MA0 var39;
      var39 = new MA0(var9, var10);
      var50[1] = var39;
      var39 = new MA0(var11, var12);
      var50[2] = var39;
      var39 = new MA0(var13, var14);
      var50[3] = var39;
      var39 = new MA0(var15, var16);
      var50[4] = var39;
      var39 = new MA0(var17, var18);
      var50[5] = var39;
      var39 = new MA0(var19, var20);
      var50[6] = var39;
      var39 = new MA0(var21, var22);
      var50[7] = var39;
      var39 = new MA0(var23, var24);
      var50[8] = var39;
      if (L60 == null) {
         L60 = new int[9][];

         for(int var47 = 0; var47 < 9; ++var47) {
            L60[var47] = O40(this.Q60[var47].jH0);
         }
      }

      this.e90 = new int[54];
      this.N70 = var1;
      this.x9 = var2;
      this.Oc = var3;
      this.N80 = var4;
      this.wy = var5;
      this.Rj0 = var6;
      this.Zr0 = 0;
      byte var26;
      if (var2.ys0() == 3) {
         var26 = 1;
      } else {
         var26 = 2;
      }

      this.il = var26;
      int var32;
      if (var2.TQ() == 1) {
         var32 = 2;
      } else {
         var32 = 1;
      }

      this.XC0 = var32;
      var32 = var2.b20();
      byte var30;
      if (var2.TQ() == 1) {
         var30 = 3;
      } else if (var2.TQ() == 2) {
         var30 = 6;
      } else {
         var30 = 0;
      }

      this.he0 = var32 + var30;
      if (var26 == 2) {
         this.Rq = 0;
         this.Ig0 = 1;
      } else {
         this.Ig0 = 0;
         this.Rq = 0;
      }

      for(int var27 = 0; var27 < 2; ++var27) {
         for(int var31 = 0; var31 < 576; ++var31) {
            this.xh0[var27][var31] = 0.0F;
         }
      }

      int[] var51 = this.nB;
      var51[1] = 576;
      var51[0] = 576;
      dw0 var28;
      var28 = new dw0();
      this.sD = var28;
      vm_2 var29;
      var29 = new vm_2();
      this.Qi0 = var29;
   }

   public static int[] O40(int[] var0) {
      int var1 = 0;
      int[] var2 = new int[576];
      int var3 = 0;

      while(var3 < 13) {
         int var4 = var0[var3];
         int var5 = var0[++var3];

         for(int var6 = 0; var6 < 3; ++var6) {
            for(int var7 = var4; var7 < var5; ++var7) {
               var2[var7 * 3 + var6] = var1++;
            }
         }
      }

      return var2;
   }

   static {
      int[][] var10000 = new int[2][];
      int[] var0;
      int[] var10003 = var0 = new int[16];
      var10003[0] = 0;
      var10003[1] = 0;
      var10003[2] = 0;
      var10003[3] = 0;
      var10003[4] = 3;
      var10003[5] = 1;
      var10003[6] = 1;
      var10003[7] = 1;
      var10003[8] = 2;
      var10003[9] = 2;
      var10003[10] = 2;
      var10003[11] = 3;
      var10003[12] = 3;
      var10003[13] = 3;
      var10003[14] = 4;
      var10003[15] = 4;
      var10000[0] = var0;
      int[] var10002 = var0 = new int[16];
      var10002[0] = 0;
      var10002[1] = 1;
      var10002[2] = 2;
      var10002[3] = 3;
      var10002[4] = 0;
      var10002[5] = 1;
      var10002[6] = 2;
      var10002[7] = 3;
      var10002[8] = 1;
      var10002[9] = 2;
      var10002[10] = 3;
      var10002[11] = 1;
      var10002[12] = 2;
      var10002[13] = 3;
      var10002[14] = 2;
      var10002[15] = 3;
      var10000[1] = var0;
      wg = var10000;
      (var0 = new int[22])[0] = 0;
      var0[1] = 0;
      var0[2] = 0;
      var0[3] = 0;
      var0[4] = 0;
      var0[5] = 0;
      var0[6] = 0;
      var0[7] = 0;
      var0[8] = 0;
      var0[9] = 0;
      var0[10] = 0;
      var0[11] = 1;
      var0[12] = 1;
      var0[13] = 1;
      var0[14] = 1;
      var0[15] = 2;
      var0[16] = 2;
      var0[17] = 3;
      var0[18] = 3;
      var0[19] = 3;
      var0[20] = 2;
      var0[21] = 0;
      iP = var0;
      float[] var4;
      (var4 = new float[64])[0] = 1.0F;
      var4[1] = 0.70710677F;
      var4[2] = 0.5F;
      var4[3] = 0.35355338F;
      var4[4] = 0.25F;
      var4[5] = 0.17677669F;
      var4[6] = 0.125F;
      var4[7] = 0.088388346F;
      var4[8] = 0.0625F;
      var4[9] = 0.044194173F;
      var4[10] = 0.03125F;
      var4[11] = 0.022097087F;
      var4[12] = 0.015625F;
      var4[13] = 0.011048543F;
      var4[14] = 0.0078125F;
      var4[15] = 0.0055242716F;
      var4[16] = 0.00390625F;
      var4[17] = 0.0027621358F;
      var4[18] = 0.001953125F;
      var4[19] = 0.0013810679F;
      var4[20] = 9.765625E-4F;
      var4[21] = 6.9053395E-4F;
      var4[22] = 4.8828125E-4F;
      var4[23] = 3.4526698E-4F;
      var4[24] = 2.4414062E-4F;
      var4[25] = 1.7263349E-4F;
      var4[26] = 1.2207031E-4F;
      var4[27] = 8.6316744E-5F;
      var4[28] = 6.1035156E-5F;
      var4[29] = 4.3158372E-5F;
      var4[30] = 3.0517578E-5F;
      var4[31] = 2.1579186E-5F;
      var4[32] = 1.5258789E-5F;
      var4[33] = 1.0789593E-5F;
      var4[34] = 7.6293945E-6F;
      var4[35] = 5.3947965E-6F;
      var4[36] = 3.8146973E-6F;
      var4[37] = 2.6973983E-6F;
      var4[38] = 1.9073486E-6F;
      var4[39] = 1.3486991E-6F;
      var4[40] = 9.536743E-7F;
      var4[41] = 6.7434956E-7F;
      var4[42] = 4.7683716E-7F;
      var4[43] = 3.3717478E-7F;
      var4[44] = 2.3841858E-7F;
      var4[45] = 1.6858739E-7F;
      var4[46] = 1.1920929E-7F;
      var4[47] = 8.4293696E-8F;
      var4[48] = 5.9604645E-8F;
      var4[49] = 4.2146848E-8F;
      var4[50] = 2.9802322E-8F;
      var4[51] = 2.1073424E-8F;
      var4[52] = 1.4901161E-8F;
      var4[53] = 1.0536712E-8F;
      var4[54] = 7.450581E-9F;
      var4[55] = 5.268356E-9F;
      var4[56] = 3.7252903E-9F;
      var4[57] = 2.634178E-9F;
      var4[58] = 1.8626451E-9F;
      var4[59] = 1.317089E-9F;
      var4[60] = 9.313226E-10F;
      var4[61] = 6.585445E-10F;
      var4[62] = 4.656613E-10F;
      var4[63] = 3.2927225E-10F;
      oZ = var4;
      var4 = new float[8192];

      for(int var1 = 0; var1 < 8192; ++var1) {
         var4[var1] = (float)Math.pow((double)var1, 1.3333333333333333);
      }

      TU = var4;
      float[][] var36 = new float[2][];
      (var4 = new float[32])[0] = 1.0F;
      var4[1] = 0.8408964F;
      var4[2] = 0.70710677F;
      var4[3] = 0.59460354F;
      var4[4] = 0.5F;
      var4[5] = 0.4204482F;
      var4[6] = 0.35355338F;
      var4[7] = 0.29730177F;
      var4[8] = 0.25F;
      var4[9] = 0.2102241F;
      var4[10] = 0.17677669F;
      var4[11] = 0.14865088F;
      var4[12] = 0.125F;
      var4[13] = 0.10511205F;
      var4[14] = 0.088388346F;
      var4[15] = 0.07432544F;
      var4[16] = 0.0625F;
      var4[17] = 0.052556027F;
      var4[18] = 0.044194173F;
      var4[19] = 0.03716272F;
      var4[20] = 0.03125F;
      var4[21] = 0.026278013F;
      var4[22] = 0.022097087F;
      var4[23] = 0.01858136F;
      var4[24] = 0.015625F;
      var4[25] = 0.013139007F;
      var4[26] = 0.011048543F;
      var4[27] = 0.00929068F;
      var4[28] = 0.0078125F;
      var4[29] = 0.0065695033F;
      var4[30] = 0.0055242716F;
      var4[31] = 0.00464534F;
      var36[0] = var4;
      (var4 = new float[32])[0] = 1.0F;
      var4[1] = 0.70710677F;
      var4[2] = 0.5F;
      var4[3] = 0.35355338F;
      var4[4] = 0.25F;
      var4[5] = 0.17677669F;
      var4[6] = 0.125F;
      var4[7] = 0.088388346F;
      var4[8] = 0.0625F;
      var4[9] = 0.044194173F;
      var4[10] = 0.03125F;
      var4[11] = 0.022097087F;
      var4[12] = 0.015625F;
      var4[13] = 0.011048543F;
      var4[14] = 0.0078125F;
      var4[15] = 0.0055242716F;
      var4[16] = 0.00390625F;
      var4[17] = 0.0027621358F;
      var4[18] = 0.001953125F;
      var4[19] = 0.0013810679F;
      var4[20] = 9.765625E-4F;
      var4[21] = 6.9053395E-4F;
      var4[22] = 4.8828125E-4F;
      var4[23] = 3.4526698E-4F;
      var4[24] = 2.4414062E-4F;
      var4[25] = 1.7263349E-4F;
      var4[26] = 1.2207031E-4F;
      var4[27] = 8.6316744E-5F;
      var4[28] = 6.1035156E-5F;
      var4[29] = 4.3158372E-5F;
      var4[30] = 3.0517578E-5F;
      var4[31] = 2.1579186E-5F;
      var36[1] = var4;
      W20 = var36;
      xr = new float[]{0.0F, 0.2679492F, 0.57735026F, 1.0F, 1.7320508F, 3.732051F, 1.0E11F, -3.732051F, -1.7320508F, -1.0F, -0.57735026F, -0.2679492F, 0.0F, 0.2679492F, 0.57735026F, 1.0F};
      QV = new float[]{0.8574929F, 0.881742F, 0.94962865F, 0.9833146F, 0.9955178F, 0.9991606F, 0.9998992F, 0.99999315F};
      eD = new float[]{-0.51449573F, -0.47173196F, -0.31337744F, -0.1819132F, -0.09457419F, -0.040965583F, -0.014198569F, -0.0036999746F};
      var36 = new float[4][];
      (var4 = new float[36])[0] = -0.016141215F;
      var4[1] = -0.05360318F;
      var4[2] = -0.100707136F;
      var4[3] = -0.16280818F;
      var4[4] = -0.5F;
      var4[5] = -0.38388735F;
      var4[6] = -0.6206114F;
      var4[7] = -1.1659756F;
      var4[8] = -3.8720753F;
      var4[9] = -4.225629F;
      var4[10] = -1.519529F;
      var4[11] = -0.97416484F;
      var4[12] = -0.73744076F;
      var4[13] = -1.2071068F;
      var4[14] = -0.5163616F;
      var4[15] = -0.45426053F;
      var4[16] = -0.40715656F;
      var4[17] = -0.3696946F;
      var4[18] = -0.3387627F;
      var4[19] = -0.31242222F;
      var4[20] = -0.28939587F;
      var4[21] = -0.26880082F;
      var4[22] = -0.5F;
      var4[23] = -0.23251417F;
      var4[24] = -0.21596715F;
      var4[25] = -0.20004979F;
      var4[26] = -0.18449493F;
      var4[27] = -0.16905846F;
      var4[28] = -0.15350361F;
      var4[29] = -0.13758625F;
      var4[30] = -0.12103922F;
      var4[31] = -0.20710678F;
      var4[32] = -0.084752575F;
      var4[33] = -0.06415752F;
      var4[34] = -0.041131172F;
      var4[35] = -0.014790705F;
      var36[0] = var4;
      (var4 = new float[36])[0] = -0.016141215F;
      var4[1] = -0.05360318F;
      var4[2] = -0.100707136F;
      var4[3] = -0.16280818F;
      var4[4] = -0.5F;
      var4[5] = -0.38388735F;
      var4[6] = -0.6206114F;
      var4[7] = -1.1659756F;
      var4[8] = -3.8720753F;
      var4[9] = -4.225629F;
      var4[10] = -1.519529F;
      var4[11] = -0.97416484F;
      var4[12] = -0.73744076F;
      var4[13] = -1.2071068F;
      var4[14] = -0.5163616F;
      var4[15] = -0.45426053F;
      var4[16] = -0.40715656F;
      var4[17] = -0.3696946F;
      var4[18] = -0.33908543F;
      var4[19] = -0.3151181F;
      var4[20] = -0.29642227F;
      var4[21] = -0.28184548F;
      var4[22] = -0.5411961F;
      var4[23] = -0.2621323F;
      var4[24] = -0.25387916F;
      var4[25] = -0.2329629F;
      var4[26] = -0.19852729F;
      var4[27] = -0.15233535F;
      var4[28] = -0.0964964F;
      var4[29] = -0.03342383F;
      var4[30] = 0.0F;
      var4[31] = 0.0F;
      var4[32] = 0.0F;
      var4[33] = 0.0F;
      var4[34] = 0.0F;
      var4[35] = 0.0F;
      var36[1] = var4;
      (var4 = new float[36])[0] = -0.0483008F;
      var4[1] = -0.15715657F;
      var4[2] = -0.28325045F;
      var4[3] = -0.42953748F;
      var4[4] = -1.2071068F;
      var4[5] = -0.8242648F;
      var4[6] = -1.1451749F;
      var4[7] = -1.769529F;
      var4[8] = -4.5470223F;
      var4[9] = -3.489053F;
      var4[10] = -0.7329629F;
      var4[11] = -0.15076515F;
      var4[12] = 0.0F;
      var4[13] = 0.0F;
      var4[14] = 0.0F;
      var4[15] = 0.0F;
      var4[16] = 0.0F;
      var4[17] = 0.0F;
      var4[18] = 0.0F;
      var4[19] = 0.0F;
      var4[20] = 0.0F;
      var4[21] = 0.0F;
      var4[22] = 0.0F;
      var4[23] = 0.0F;
      var4[24] = 0.0F;
      var4[25] = 0.0F;
      var4[26] = 0.0F;
      var4[27] = 0.0F;
      var4[28] = 0.0F;
      var4[29] = 0.0F;
      var4[30] = 0.0F;
      var4[31] = 0.0F;
      var4[32] = 0.0F;
      var4[33] = 0.0F;
      var4[34] = 0.0F;
      var4[35] = 0.0F;
      var36[2] = var4;
      (var4 = new float[36])[0] = 0.0F;
      var4[1] = 0.0F;
      var4[2] = 0.0F;
      var4[3] = 0.0F;
      var4[4] = 0.0F;
      var4[5] = 0.0F;
      var4[6] = -0.15076514F;
      var4[7] = -0.7329629F;
      var4[8] = -3.489053F;
      var4[9] = -4.5470223F;
      var4[10] = -1.769529F;
      var4[11] = -1.1451749F;
      var4[12] = -0.8313774F;
      var4[13] = -1.306563F;
      var4[14] = -0.54142016F;
      var4[15] = -0.46528974F;
      var4[16] = -0.4106699F;
      var4[17] = -0.3700468F;
      var4[18] = -0.3387627F;
      var4[19] = -0.31242222F;
      var4[20] = -0.28939587F;
      var4[21] = -0.26880082F;
      var4[22] = -0.5F;
      var4[23] = -0.23251417F;
      var4[24] = -0.21596715F;
      var4[25] = -0.20004979F;
      var4[26] = -0.18449493F;
      var4[27] = -0.16905846F;
      var4[28] = -0.15350361F;
      var4[29] = -0.13758625F;
      var4[30] = -0.12103922F;
      var4[31] = -0.20710678F;
      var4[32] = -0.084752575F;
      var4[33] = -0.06415752F;
      var4[34] = -0.041131172F;
      var4[35] = -0.014790705F;
      var36[3] = var4;
      Ty = var36;
      Sc = new int[][][] {
         { {6, 5, 5, 5}, {9, 9, 9, 9}, {6, 9, 9, 9} },
         { {6, 5, 7, 3}, {9, 9, 12, 6}, {6, 9, 12, 6} },
         { {11, 10, 0, 0}, {18, 18, 0, 0}, {15, 18, 0, 0} },
         { {7, 7, 7, 0}, {12, 12, 12, 0}, {6, 15, 12, 0} },
         { {6, 6, 6, 3}, {12, 9, 9, 6}, {6, 12, 9, 6} },
         { {8, 8, 5, 0}, {15, 12, 9, 0}, {6, 18, 9, 0} }
      };
   }

   public final void a7() {
      c50_0 var10000 = this.x9;
      int var1 = var10000.import$;
      int var5;
      if (var10000.wn == 1) {
         this.Qi0.HA = this.N70.DA(9);
         if (this.il == 1) {
            vm_2 var59 = this.Qi0;
            this.N70.DA(5);
            var59.getClass();
         } else {
            vm_2 var60 = this.Qi0;
            this.N70.DA(3);
            var60.getClass();
         }

         for(int var2 = 0; var2 < this.il; ++var2) {
            this.Qi0.tu0[var2].JQ[0] = this.N70.DA(1);
            this.Qi0.tu0[var2].JQ[1] = this.N70.DA(1);
            this.Qi0.tu0[var2].JQ[2] = this.N70.DA(1);
            this.Qi0.tu0[var2].JQ[3] = this.N70.DA(1);
         }

         label317:
         for(int var12 = 0; var12 < 2; ++var12) {
            for(int var3 = 0; var3 < this.il; ++var3) {
               this.Qi0.tu0[var3].Wn[var12].l30 = this.N70.DA(12);
               this.Qi0.tu0[var3].Wn[var12].sR = this.N70.DA(9);
               this.Qi0.tu0[var3].Wn[var12].Ki0 = this.N70.DA(8);
               this.Qi0.tu0[var3].Wn[var12].lf = this.N70.DA(4);
               this.Qi0.tu0[var3].Wn[var12].Iu0 = this.N70.DA(1);
               OY var4;
               if ((var4 = this.Qi0.tu0[var3].Wn[var12]).Iu0 != 0) {
                  var4.Ee = this.N70.DA(2);
                  this.Qi0.tu0[var3].Wn[var12].ot0 = this.N70.DA(1);
                  this.Qi0.tu0[var3].Wn[var12].H10[0] = this.N70.DA(5);
                  this.Qi0.tu0[var3].Wn[var12].H10[1] = this.N70.DA(5);
                  this.Qi0.tu0[var3].Wn[var12].e50[0] = this.N70.DA(3);
                  this.Qi0.tu0[var3].Wn[var12].e50[1] = this.N70.DA(3);
                  this.Qi0.tu0[var3].Wn[var12].e50[2] = this.N70.DA(3);
                  if ((var5 = (var4 = this.Qi0.tu0[var3].Wn[var12]).Ee) == 0) {
                     break label317;
                  }

                  if (var5 == 2 && var4.ot0 == 0) {
                     var4.oR = 8;
                  } else {
                     var4.oR = 7;
                  }

                  var4.rQ = 20 - var4.oR;
               } else {
                  var4.H10[0] = this.N70.DA(5);
                  this.Qi0.tu0[var3].Wn[var12].H10[1] = this.N70.DA(5);
                  this.Qi0.tu0[var3].Wn[var12].H10[2] = this.N70.DA(5);
                  this.Qi0.tu0[var3].Wn[var12].oR = this.N70.DA(4);
                  this.Qi0.tu0[var3].Wn[var12].rQ = this.N70.DA(3);
                  this.Qi0.tu0[var3].Wn[var12].Ee = 0;
               }

               this.Qi0.tu0[var3].Wn[var12].Nc = this.N70.DA(1);
               this.Qi0.tu0[var3].Wn[var12].Ka0 = this.N70.DA(1);
               this.Qi0.tu0[var3].Wn[var12].Com2 = this.N70.DA(1);
            }
         }
      } else {
         this.Qi0.HA = this.N70.DA(8);
         if (this.il == 1) {
            vm_2 var61 = this.Qi0;
            this.N70.DA(1);
            var61.getClass();
         } else {
            vm_2 var62 = this.Qi0;
            this.N70.DA(2);
            var62.getClass();
         }

         for(int var13 = 0; var13 < this.il; ++var13) {
            this.Qi0.tu0[var13].Wn[0].l30 = this.N70.DA(12);
            this.Qi0.tu0[var13].Wn[0].sR = this.N70.DA(9);
            this.Qi0.tu0[var13].Wn[0].Ki0 = this.N70.DA(8);
            this.Qi0.tu0[var13].Wn[0].lf = this.N70.DA(9);
            this.Qi0.tu0[var13].Wn[0].Iu0 = this.N70.DA(1);
            OY var20;
            if ((var20 = this.Qi0.tu0[var13].Wn[0]).Iu0 != 0) {
               var20.Ee = this.N70.DA(2);
               this.Qi0.tu0[var13].Wn[0].ot0 = this.N70.DA(1);
               this.Qi0.tu0[var13].Wn[0].H10[0] = this.N70.DA(5);
               this.Qi0.tu0[var13].Wn[0].H10[1] = this.N70.DA(5);
               this.Qi0.tu0[var13].Wn[0].e50[0] = this.N70.DA(3);
               this.Qi0.tu0[var13].Wn[0].e50[1] = this.N70.DA(3);
               this.Qi0.tu0[var13].Wn[0].e50[2] = this.N70.DA(3);
               int var33;
               if ((var33 = (var20 = this.Qi0.tu0[var13].Wn[0]).Ee) == 0) {
                  break;
               }

               if (var33 == 2 && var20.ot0 == 0) {
                  var20.oR = 8;
               } else {
                  var20.oR = 7;
                  var20.rQ = 13;
               }
            } else {
               var20.H10[0] = this.N70.DA(5);
               this.Qi0.tu0[var13].Wn[0].H10[1] = this.N70.DA(5);
               this.Qi0.tu0[var13].Wn[0].H10[2] = this.N70.DA(5);
               this.Qi0.tu0[var13].Wn[0].oR = this.N70.DA(4);
               this.Qi0.tu0[var13].Wn[0].rQ = this.N70.DA(3);
               this.Qi0.tu0[var13].Wn[0].Ee = 0;
            }

            this.Qi0.tu0[var13].Wn[0].Ka0 = this.N70.DA(1);
            this.Qi0.tu0[var13].Wn[0].Com2 = this.N70.DA(1);
         }
      }

      for(int var14 = 0; var14 < var1; ++var14) {
         dw0 var22;
         dw0 var63 = var22 = this.sD;
         int var34 = this.N70.DA(8);
         int var46 = var63.Xb0;
         int[] var6;
         int[] var64 = var6 = var63.IH0;
         int var7 = var46 + 1;
         var6[var46] = var34 & 128;
         int var8 = var46 + 2;
         var6[var7] = var34 & 64;
         var7 = var46 + 3;
         var6[var8] = var34 & 32;
         var8 = var46 + 4;
         var6[var7] = var34 & 16;
         var7 = var46 + 5;
         var6[var8] = var34 & 8;
         var8 = var46 + 6;
         var6[var7] = var34 & 4;
         var7 = var46 + 7;
         var64[var8] = var34 & 2;
         var5 = var46 + 8;
         var6[var7] = var34 & 1;
         if (var5 == 32768) {
            var22.Xb0 = 0;
         } else {
            var22.Xb0 = var5;
         }
      }

      dw0 var15;
      int var66 = (var15 = this.sD).HY;
      int var23 = var66 >>> 3;
      int var35;
      if ((var35 = var66 & 7) != 0) {
         var15.Z0(8 - var35);
         ++var23;
      }

      int var16;
      var66 = var35 = (var16 = this.Zr0) - var23 - this.Qi0.HA;
      var1 = var16 + var1;
      this.Zr0 = var1;
      if (var66 >= 0) {
         if (var23 > 4096) {
            this.Zr0 = var1 - 4096;
            dw0 var10;
            dw0 var68 = var10 = this.sD;
            var68.HY -= 32768;
            if ((var10.pl = (var16 = var68.pl) - '耀') < 0) {
               var10.pl = var16;
            }
         }

         while(var35 > 0) {
            this.sD.Z0(8);
            --var35;
         }

         for(int var11 = 0; var11 < this.XC0; ++var11) {
            for(int var18 = 0; var18 < this.il; ++var18) {
               dw0 var24;
               this.mD0 = (var24 = this.sD).HY;
               if (this.x9.wn != 1) {
                  this.R9(var18, var11);
               } else {
                  R60 var37;
         OY current = (var37 = this.Qi0.tu0[var18]).Wn[var11];
         int var49 = current.lf;
                  int[][] var10001 = wg;
                  int var56 = var10001[0][var49];
                  var49 = var10001[1][var49];
                  if (current.Iu0 != 0 && current.Ee == 2) {
                     if (current.ot0 == 0) {
                        this.Sv[var18].yk[0][0] = var24.Z0(var56);
                        this.Sv[var18].yk[1][0] = this.sD.Z0(var56);
                        this.Sv[var18].yk[2][0] = this.sD.Z0(var56);
                        this.Sv[var18].yk[0][1] = this.sD.Z0(var56);
                        this.Sv[var18].yk[1][1] = this.sD.Z0(var56);
                        this.Sv[var18].yk[2][1] = this.sD.Z0(var56);
                        this.Sv[var18].yk[0][2] = this.sD.Z0(var56);
                        this.Sv[var18].yk[1][2] = this.sD.Z0(var56);
                        this.Sv[var18].yk[2][2] = this.sD.Z0(var56);
                        this.Sv[var18].yk[0][3] = this.sD.Z0(var56);
                        this.Sv[var18].yk[1][3] = this.sD.Z0(var56);
                        this.Sv[var18].yk[2][3] = this.sD.Z0(var56);
                        this.Sv[var18].yk[0][4] = this.sD.Z0(var56);
                        this.Sv[var18].yk[1][4] = this.sD.Z0(var56);
                        this.Sv[var18].yk[2][4] = this.sD.Z0(var56);
                        this.Sv[var18].yk[0][5] = this.sD.Z0(var56);
                        this.Sv[var18].yk[1][5] = this.sD.Z0(var56);
                        this.Sv[var18].yk[2][5] = this.sD.Z0(var56);
                        this.Sv[var18].yk[0][6] = this.sD.Z0(var49);
                        this.Sv[var18].yk[1][6] = this.sD.Z0(var49);
                        this.Sv[var18].yk[2][6] = this.sD.Z0(var49);
                        this.Sv[var18].yk[0][7] = this.sD.Z0(var49);
                        this.Sv[var18].yk[1][7] = this.sD.Z0(var49);
                        this.Sv[var18].yk[2][7] = this.sD.Z0(var49);
                        this.Sv[var18].yk[0][8] = this.sD.Z0(var49);
                        this.Sv[var18].yk[1][8] = this.sD.Z0(var49);
                        this.Sv[var18].yk[2][8] = this.sD.Z0(var49);
                        this.Sv[var18].yk[0][9] = this.sD.Z0(var49);
                        this.Sv[var18].yk[1][9] = this.sD.Z0(var49);
                        this.Sv[var18].yk[2][9] = this.sD.Z0(var49);
                        this.Sv[var18].yk[0][10] = this.sD.Z0(var49);
                        this.Sv[var18].yk[1][10] = this.sD.Z0(var49);
                        this.Sv[var18].yk[2][10] = this.sD.Z0(var49);
                        this.Sv[var18].yk[0][11] = this.sD.Z0(var49);
                        this.Sv[var18].yk[1][11] = this.sD.Z0(var49);
                        this.Sv[var18].yk[2][11] = this.sD.Z0(var49);
                        int[][] var71 = this.Sv[var18].yk;
                        var71[0][12] = 0;
                        var71[1][12] = 0;
                        var71[2][12] = 0;
                     } else {
                        for(int var25 = 0; var25 < 8; ++var25) {
                           this.Sv[var18].W70[var25] = this.sD.Z0(wg[0][current.lf]);
                        }

                        for(int var26 = 3; var26 < 6; ++var26) {
                           for(int var38 = 0; var38 < 3; ++var38) {
                              this.Sv[var18].yk[var38][var26] = this.sD.Z0(wg[0][current.lf]);
                           }
                        }

                        for(int var27 = 6; var27 < 12; ++var27) {
                           for(int var39 = 0; var39 < 3; ++var39) {
                              this.Sv[var18].yk[var39][var27] = this.sD.Z0(wg[1][current.lf]);
                           }
                        }

                        byte var28 = 12;

                        for(int var40 = 0; var40 < 3; ++var40) {
                           this.Sv[var18].yk[var40][var28] = 0;
                        }
                     }
                  } else {
                     if (var37.JQ[0] == 0 || var11 == 0) {
                        this.Sv[var18].W70[0] = var24.Z0(var56);
                        this.Sv[var18].W70[1] = this.sD.Z0(var56);
                        this.Sv[var18].W70[2] = this.sD.Z0(var56);
                        this.Sv[var18].W70[3] = this.sD.Z0(var56);
                        this.Sv[var18].W70[4] = this.sD.Z0(var56);
                        this.Sv[var18].W70[5] = this.sD.Z0(var56);
                     }

                     if (this.Qi0.tu0[var18].JQ[1] == 0 || var11 == 0) {
                        this.Sv[var18].W70[6] = this.sD.Z0(var56);
                        this.Sv[var18].W70[7] = this.sD.Z0(var56);
                        this.Sv[var18].W70[8] = this.sD.Z0(var56);
                        this.Sv[var18].W70[9] = this.sD.Z0(var56);
                        this.Sv[var18].W70[10] = this.sD.Z0(var56);
                     }

                     if (this.Qi0.tu0[var18].JQ[2] == 0 || var11 == 0) {
                        this.Sv[var18].W70[11] = this.sD.Z0(var49);
                        this.Sv[var18].W70[12] = this.sD.Z0(var49);
                        this.Sv[var18].W70[13] = this.sD.Z0(var49);
                        this.Sv[var18].W70[14] = this.sD.Z0(var49);
                        this.Sv[var18].W70[15] = this.sD.Z0(var49);
                     }

                     if (this.Qi0.tu0[var18].JQ[3] == 0 || var11 == 0) {
                        this.Sv[var18].W70[16] = this.sD.Z0(var49);
                        this.Sv[var18].W70[17] = this.sD.Z0(var49);
                        this.Sv[var18].W70[18] = this.sD.Z0(var49);
                        this.Sv[var18].W70[19] = this.sD.Z0(var49);
                        this.Sv[var18].W70[20] = this.sD.Z0(var49);
                     }

                     int[] var70 = this.Sv[var18].W70;
                     var70[21] = 0;
                     var70[22] = 0;
                  }
               }

               this.ge0(var18, var11);
               this.CON(this.ih0[var18], var18, var11);
            }

            this.JE(var11);
            if (this.Rj0 == 3 && this.il > 1) {
               this.II0();
            }

            for(int var19 = this.Rq; var19 <= this.Ig0; ++var19) {
               this.XQ(this.Cw0[var19], var19, var11);
               this.Zn(var19, var11);
               this.dh(var19, var11);

               for(int var29 = 18; var29 < 576; var29 += 36) {
                  for(int var41 = 1; var41 < 18; var41 += 2) {
                     float[] var72 = this.gK;
                     var5 = var29 + var41;
                     var72[var5] = -var72[var5];
                  }
               }

               if (var19 != 0 && this.Rj0 != 2) {
                  for(int var31 = 0; var31 < 18; ++var31) {
                     var35 = 0;

                     for(int var48 = 0; var48 < 576; var48 += 18) {
                        this.Ba[var35] = this.gK[var48 + var31];
                        ++var35;
                     }

                     B7 var45 = this.N80;
                     float[] sourceBa = this.Ba;

                     for(int var52 = 31; var52 >= 0; --var52) {
                        var45.RE[var52] = sourceBa[var52];
                     }

                     var45.getClass();
                     this.N80.d9(this.wy);
                  }
               } else {
                  for(int var30 = 0; var30 < 18; ++var30) {
                     var35 = 0;

                     for(int var47 = 0; var47 < 576; var47 += 18) {
                        this.CI[var35] = this.gK[var47 + var30];
                        ++var35;
                     }

                     B7 var43 = this.Oc;
                     float[] sourceCi = this.CI;

                     for(int var51 = 31; var51 >= 0; --var51) {
                        var43.RE[var51] = sourceCi[var51];
                     }

                     var43.getClass();
                     this.Oc.d9(this.wy);
                  }
               }
            }
         }
      }

   }

   public final void R9(int var1, int var2) {
      int var3;
      int var4;
      byte textureMode;
      int var6;
      int var31;
      OY var11;
      label164: {
         var3 = 0;
         OY var10000 = var11 = this.Qi0.tu0[var1].Wn[var2];
         var4 = this.x9.z4;
         textureMode = 0;
         var6 = var10000.lf;
         if (var10000.Ee == 2) {
            if ((var31 = var11.ot0) == 0) {
               var31 = 1;
               break label164;
            }

            if (var31 == 1) {
               var31 = 2;
               break label164;
            }
         }

         var31 = 0;
      }

      if (var4 != 1 && var4 != 3 || var1 != 1) {
         if (var6 < 400) {
            int[] var24;
            int[] var10001 = var24 = this.cOm9;
            int var10006 = var6 >>> 4;
            var24[0] = (var6 >>> 4) / 5;
            var24[1] = var10006 % 5;
            var24[2] = (var6 & 15) >>> 2;
            var10001[3] = var6 & 3;
            var11.Nc = 0;
            textureMode = 0;
         } else if (var6 < 500) {
            int[] var25;
            int[] var34 = var25 = this.cOm9;
            int var10003 = var6 - 400;
            int var10005 = var6 - 400 >>> 2;
            var25[0] = (var6 - 400 >>> 2) / 5;
            var25[1] = var10005 % 5;
            var34[2] = var10003 & 3;
            var34[3] = 0;
            var11.Nc = 0;
            textureMode = 1;
         } else if (var6 < 512) {
            int[] var26;
            int[] var35 = var26 = this.cOm9;
            int var10004 = var6 - 500;
            var26[0] = (var6 - 500) / 3;
            var35[1] = var10004 % 3;
            var35[2] = 0;
            var35[3] = 0;
            var11.Nc = 1;
            textureMode = 2;
         }
      }

      if ((var4 == 1 || var4 == 3) && var1 == 1) {
         if ((var4 = var6 >>> 1) < 180) {
            int[] var27;
            int[] var36 = var27 = this.cOm9;
            var27[0] = var4 / 36;
            int var39 = var4 % 36;
            var27[1] = var4 % 36 / 6;
            var36[2] = var39 % 6;
            var36[3] = 0;
            var11.Nc = 0;
            textureMode = 3;
         } else if (var4 < 244) {
            int[] var28;
            int[] var37 = var28 = this.cOm9;
            int var19;
            int var40 = var19 = var4 - 180;
            var28[0] = (var19 & 63) >>> 4;
            var28[1] = (var19 & 15) >>> 2;
            var37[2] = var40 & 3;
            var37[3] = 0;
            var11.Nc = 0;
            textureMode = 4;
         } else if (var4 < 255) {
            int[] var29;
            int[] var38 = var29 = this.cOm9;
            int var41 = var4 - 244;
            var29[0] = (var4 - 244) / 3;
            var38[1] = var41 % 3;
            var38[2] = 0;
            var38[3] = 0;
            var11.Nc = 0;
            textureMode = 5;
         }
      }

      for(int var20 = 0; var20 < 45; ++var20) {
         this.e90[var20] = 0;
      }

      var4 = 0;

      for(int var30 = 0; var30 < 4; ++var30) {
         for(int var8 = 0; var8 < Sc[textureMode][var31][var30]; ++var8) {
            int[] var9 = this.e90;
            int var10;
            if ((var10 = this.cOm9[var30]) == 0) {
               var10 = 0;
            } else {
               var10 = this.sD.Z0(var10);
            }

            var9[var4] = var10;
            ++var4;
         }
      }

      if (var11.Iu0 != 0 && var11.Ee == 2) {
         if (var11.ot0 != 0) {
            for(int var13 = 0; var13 < 8; ++var13) {
               this.Sv[var1].W70[var13] = this.e90[var3];
               ++var3;
            }

            for(int var14 = 3; var14 < 12; ++var14) {
               for(int var22 = 0; var22 < 3; ++var22) {
                  this.Sv[var1].yk[var22][var14] = this.e90[var3];
                  ++var3;
               }
            }

            for(int var15 = 0; var15 < 3; ++var15) {
               this.Sv[var1].yk[var15][12] = 0;
            }
         } else {
            for(int var16 = 0; var16 < 12; ++var16) {
               for(int var23 = 0; var23 < 3; ++var23) {
                  this.Sv[var1].yk[var23][var16] = this.e90[var3];
                  ++var3;
               }
            }

            for(int var17 = 0; var17 < 3; ++var17) {
               this.Sv[var1].yk[var17][12] = 0;
            }
         }
      } else {
         for(int var12 = 0; var12 < 21; ++var12) {
            this.Sv[var1].W70[var12] = this.e90[var3];
            ++var3;
         }

         int[] var33 = this.Sv[var1].W70;
         var33[21] = 0;
         var33[22] = 0;
      }

   }

   public final void ge0(int var1, int var2) {
      this.k5[0] = 0;
      this.cG0[0] = 0;
      this.yA0[0] = 0;
      this.Bu[0] = 0;
      OY var3;
      int var4 = this.mD0 + (var3 = this.Qi0.tu0[var1].Wn[var2]).l30;
      int var17;
      int var24;
      if (var3.Iu0 != 0 && var3.Ee == 2) {
         if (this.he0 == 8) {
            var17 = 72;
         } else {
            var17 = 36;
         }

         var24 = 576;
      } else {
         int[] var6;
         if ((var17 = (var24 = var3.oR + 1) + var3.rQ + 1) > (var6 = this.Q60[this.he0].RL).length - 1) {
            var17 = 22;
         }

         var24 = var6[var24];
         var17 = var6[var17];
         var24 = var17;
         var17 = var24;
      }

      int var28 = 0;

      OY var8;
      for(int var7 = 0; var7 < (var8 = this.Qi0.tu0[var1].Wn[var2]).sR << 1; var7 += 2) {
         AudioHuffmanCodebookTable var37 = var7 < var17 ? AudioHuffmanCodebookTable.Xv0[var8.H10[0]] : (var7 < var24 ? AudioHuffmanCodebookTable.Xv0[var8.H10[1]] : AudioHuffmanCodebookTable.Xv0[var8.H10[2]]);
         int[] var30 = this.yA0;
         int[] var9 = this.Bu;
         dw0 var10 = this.sD;
         AudioHuffmanCodebookTable.uE0(var37, this.k5, this.cG0, var30, var9, var10);
         int[] var38 = var30 = this.ea0;
         int var33 = var28 + 1;
         int[] var35;
         var38[var28] = (var35 = this.k5)[0];
         var28 += 2;
         int[] var11;
         var38 = var11 = this.cG0;
         var30[var33] = var11[0];
         int var10001 = var35[0];
         int var40 = var38[0];
      }

      AudioHuffmanCodebookTable var12 = AudioHuffmanCodebookTable.Xv0[var8.Com2 + 32];
      dw0 var41 = this.sD;

      while(true) {
         var17 = var41.HY;
         if (var17 >= var4 || var28 >= 576) {
            if (var17 > var4) {
               dw0 var13;
               var41 = var13 = this.sD;
               var17 -= var4;
               var41.HY -= var17;
               int var21;
               int var46 = var21 = var41.pl - var17;
               var13.pl = var21;
               if (var46 < 0) {
                  var13.pl = var21 + '耀';
               }

               var28 -= 4;
            }

            dw0 var14;
            if ((var17 = (var14 = this.sD).HY) < var4) {
               var14.Z0(var4 - var17);
            }

            if (var28 < 576) {
               this.nB[var1] = var28;
            } else {
               this.nB[var1] = 576;
            }

            if (var28 < 0) {
               var28 = 0;
            }

            while(var28 < 576) {
               this.ea0[var28] = 0;
               ++var28;
            }

            return;
         }

         AudioHuffmanCodebookTable.uE0(var12, this.k5, this.cG0, this.yA0, this.Bu, this.sD);
         int[] var19;
         int[] var42 = var19 = this.ea0;
         var24 = var28 + 1;
         int[] var29;
         var42[var28] = (var29 = this.yA0)[0];
         int var26 = var28 + 2;
         int[] var32;
         var42[var24] = (var32 = this.Bu)[0];
         var24 = var28 + 3;
         int[] var34;
         var42[var26] = (var34 = this.k5)[0];
         var28 += 4;
         int[] var36;
         var42 = var36 = this.cG0;
         var19[var24] = var36[0];
         int var10003 = var29[0];
         int var49 = var32[0];
         int var48 = var34[0];
         int var44 = var42[0];
         var41 = this.sD;
      }
   }

   public final void mL(int var1, int var2, int var3) {
      if (var1 == 0) {
         float[][] var10000 = this.Ws;
         var10000[0][var3] = 1.0F;
         var10000[1][var3] = 1.0F;
      } else if ((var1 & 1) != 0) {
         float[][] var4 = this.Ws;
         var4[0][var3] = W20[var2][var1 + 1 >>> 1];
         var4[1][var3] = 1.0F;
      } else {
         float[][] var5 = this.Ws;
         var5[0][var3] = 1.0F;
         var5[1][var3] = W20[var2][var1 >>> 1];
      }

   }

   public final void CON(float[][] var1, int var2, int var3) {
      OY var17;
      OY var10000 = var17 = this.Qi0.tu0[var2].Wn[var3];
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7;
      if (var10000.Iu0 != 0 && var17.Ee == 2) {
         if (var17.ot0 != 0) {
            var7 = this.Q60[this.he0].RL[1];
         } else {
            var7 = ((var5 = this.Q60[this.he0].jH0[1]) << 2) - var5;
         }
      } else {
         var7 = this.Q60[this.he0].RL[1];
      }

      int var8 = 0;
      double var9 = ((double)var17.Ki0 - 210.0) * 0.25;
      float var28 = (float)Math.pow(2.0, var9);

      for(int var10 = 0; var10 < this.nB[var2]; ++var10) {
         int var11;
         int var12 = (var10 - (var11 = var10 % 18)) / 18;
         int var13;
         if ((var13 = this.ea0[var10]) == 0) {
            var1[var12][var11] = 0.0F;
         } else {
            float[] var14;
            if (var13 < (var14 = TU).length) {
               if (var13 > 0) {
                  var1[var12][var11] = var28 * var14[var13];
               } else if ((var13 = -var13) < var14.length) {
                  var1[var12][var11] = -var28 * var14[var13];
               } else {
                  var1[var12][var11] = -var28 * (float)Math.pow((double)var13, 1.3333333333333333);
               }
            } else if (var13 > 0) {
               var1[var12][var11] = var28 * (float)Math.pow((double)var13, 1.3333333333333333);
            } else {
               var1[var12][var11] = -var28 * (float)Math.pow((double)(-var13), 1.3333333333333333);
            }
         }
      }

      int var30;
      for(int var29 = 0; var29 < (var30 = this.nB[var2]); ++var29) {
         int var32 = (var29 - (var30 = var29 % 18)) / 18;
         if (var6 == var7) {
            if (var17.Iu0 != 0 && var17.Ee == 2) {
               if (var17.ot0 != 0) {
                  MA0 var23;
                  int[] var36;
                  int var40;
                  if (var6 == (var40 = (var36 = (var23 = this.Q60[this.he0]).RL)[8])) {
                     int[] var41 = var23.jH0;
                     var5 = ((var4 = var41[4]) << 2) - var4;
                     byte var24 = 3;
                     int var42 = var8 = var41[3];
                     var4 -= var8;
                     var8 = (var42 << 2) - var8;
                     var5 = var4;
                     var7 = var5;
                     var4 = var24;
                  } else if (var6 < var40) {
                     var7 = var36[var4++ + 2];
                  } else {
                     int[] var44 = var23.jH0;
                     var5 = var44[var4++ + 2];
                     var7 = (var5 << 2) - var5;
                     int var45 = var8 = var44[var4];
                     var5 -= var8;
                     var8 = (var45 << 2) - var8;
                  }
               } else {
                  int[] var46 = this.Q60[this.he0].jH0;
                  var5 = var46[var4++ + 2];
                  var7 = (var5 << 2) - var5;
                  int var47 = var8 = var46[var4];
                  var5 -= var8;
                  var8 = (var47 << 2) - var8;
               }
            } else {
               var7 = this.Q60[this.he0].RL[var4++ + 2];
            }
         }

         int var37;
         if (var17.Iu0 == 0 || ((var37 = var17.Ee) != 2 || var17.ot0 != 0) && (var37 != 2 || var17.ot0 == 0 || var29 < 36)) {
            var37 = this.Sv[var2].W70[var4];
            if (var17.Nc != 0) {
               var37 += iP[var4];
            }

            int var35 = var37 << var17.Ka0;
            var1[var32][var30] *= oZ[var35];
         } else {
            int var33 = (var6 - var8) / var5;
            int var34 = (this.Sv[var2].yk[var33][var4] << var17.Ka0) + (var17.e50[var33] << 2);
            var1[var32][var30] *= oZ[var34];
         }

         ++var6;
      }

      while(var30 < 576) {
         int var15;
         int var48 = var15 = var30 % 18;
         var2 = (var30 - var15) / 18;
         if (var48 < 0) {
            var15 = 0;
         }

         if (var2 < 0) {
            var2 = 0;
         }

         var1[var2][var15] = 0.0F;
         ++var30;
      }

   }

   public final void XQ(float[][] var1, int var2, int var3) {
      OY var12;
      if ((var12 = this.Qi0.tu0[var2].Wn[var3]).Iu0 != 0 && var12.Ee == 2) {
         for(int var18 = 0; var18 < 576; ++var18) {
            this.gK[var18] = 0.0F;
         }

         if (var12.ot0 != 0) {
            for(int var14 = 0; var14 < 36; ++var14) {
               int var23 = (var14 - (var3 = var14 % 18)) / 18;
               this.gK[var14] = var1[var23][var3];
            }

            int var15 = 3;

            while(var15 < 13) {
               int[] var20;
               int var24;
               int var10000 = var24 = (var20 = this.Q60[this.he0].jH0)[var15];
               int var21 = var20[++var15] - var24;
               var24 = (var10000 << 2) - var24;
               int var5 = 0;

               for(int var6 = 0; var5 < var21; var6 += 3) {
                  int var7;
                  int var10001 = var7 = var24 + var5;
                  int var8 = var24 + var6;
                  int var9;
                  int var10 = (var10001 - (var9 = var10001 % 18)) / 18;
                  float[] var11;
                  float[] var32 = var11 = this.gK;
                  var11[var8] = var1[var10][var9];
                  int var27;
                  int var10002 = var27 = var7 + var21;
                  var7 = var8 + 1;
                  var11[var7] = var1[(var27 - (var9 = var27 % 18)) / 18][var9];
                  var10002 += var21;
                  var7 = var8 + 2;
                  var32[var7] = var1[(var10002 - (var8 = var10002 % 18)) / 18][var8];
                  ++var5;
               }
            }
         } else {
            for(int var16 = 0; var16 < 576; ++var16) {
               int var33 = L60[this.he0][var16];
               int var26 = (var33 - (var3 = var33 % 18)) / 18;
               this.gK[var16] = var1[var26][var3];
            }
         }
      } else {
         for(int var13 = 0; var13 < 576; ++var13) {
            int var4 = (var13 - (var3 = var13 % 18)) / 18;
            this.gK[var13] = var1[var4][var3];
         }
      }

   }

   public final void JE(int var1) {
      if (this.il == 1) {
         for(int var13 = 0; var13 < 32; ++var13) {
            for(int var2 = 0; var2 < 18; var2 += 3) {
               float[] var3;
               float[] var10000 = var3 = this.Cw0[0][var13];
               float[] var4;
               float[] var10001 = var4 = this.ih0[0][var13];
               var3[var2] = var4[var2];
               int var26;
               var3[var26 = var2 + 1] = var4[var26];
               int var27;
               var10000[var26] = var10001[var27 = var2 + 2];
            }
         }
      } else {
         OY var14 = this.Qi0.tu0[0].Wn[var1];
         c50_0 var23;
         c50_0 var106 = var23 = this.x9;
         int flags = var106.z4;
         boolean var5;
         int var30;
         if ((var30 = var106.fJ) == 1 && (flags & 2) != 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         boolean var28 = var30 == 1 && (flags & 1) != 0;

         boolean var24 = var23.wn == 0 || var23.wn == 2;

         var30 = var14.lf & 1;

         for(int var6 = 0; var6 < 576; ++var6) {
            this.SE0[var6] = 7;
            this.N90[var6] = 0.0F;
         }

         if (var28) {
            if (var14.Iu0 != 0 && var14.Ee == 2) {
               if (var14.ot0 != 0) {
                  int var19 = 0;

                  for(int var42 = 0; var42 < 3; ++var42) {
                     int var54 = 2;

                     for(int var76 = 12; var76 >= 3; --var76) {
                        int[] var90;
                        int var100;
                        int var130 = var100 = (var90 = this.Q60[this.he0].jH0)[var76];
                        int var91 = var90[var76 + 1] - var100;
                        var100 = (var130 << 2) - var100;

                        for(int var102 = (var42 + 1) * var91 + var100 - 1; var91 > 0; --var102) {
                           if (this.ih0[1][var102 / 18][var102 % 18] != 0.0F) {
                              var54 = -10;
                              var91 = -10;
                              int var115 = var76;
                              var76 = var54;
                              var54 = var115;
                           }

                           --var91;
                        }
                     }

                     if (++var54 > var19) {
                        var19 = var54;
                     }

                     while(var54 < 12) {
                        int[] var77;
                        int var92;
                        int var131 = var92 = (var77 = this.Q60[this.he0].jH0)[var54];
                        int var78;
                        int var103 = var77[var78 = var54 + 1] - var92;
                        var92 = (var131 << 2) - var92;

                        for(int var94 = var42 * var103 + var92; var103 > 0; --var103) {
                           int[] var105 = this.SE0;
                           int var12;
                           int var116 = var12 = this.Sv[1].yk[var42][var54];
                           var105[var94] = var12;
                           if (var116 != 7) {
                              if (var24) {
                                 this.mL(var12, var30, var94);
                              } else {
                                 this.N90[var94] = xr[var12];
                              }
                           }

                           ++var94;
                        }

                        var54 = var78;
                     }

                     int[] var57;
                     int[] var132 = var57 = this.Q60[this.he0].jH0;
                     int var79 = var132[10];
                     int var95;
                     int var133 = var95 = var132[11];
                     int var58 = var95 - var79;
                     var79 = (var79 << 2) - var79;
                     int var59 = var42 * var58 + var79;
                     var79 = var57[12] - var95;
                     var95 = (var133 << 2) - var95;

                     for(int var97 = var42 * var79 + var95; var79 > 0; --var79) {
                        int[] var134 = this.SE0;
                        var134[var97] = var134[var59];
                        if (var24) {
                           float[][] var117 = this.Ws;
                           var117[0][var97] = var117[0][var59];
                           var117[1][var97] = var117[1][var59];
                        } else {
                           float[] var118 = this.N90;
                           var118[var97] = var118[var59];
                        }

                        ++var97;
                     }
                  }

                  if (var19 <= 3) {
                     var19 = 2;
                     int var43 = 17;
                     int var60 = -1;

                     while(var19 >= 0) {
                        if (this.ih0[1][var19][var43] != 0.0F) {
                           var60 = (var19 << 4) + (var19 << 1) + var43;
                           var19 = -1;
                        } else if ((var43 += -1) < 0) {
                           --var19;
                           var43 = 17;
                        }
                     }

                     for(var19 = 0; (var43 = this.Q60[this.he0].RL[var19]) <= var60; ++var19) {
                     }

                     while(var19 < 8) {
                        int var82;
                        int[] var61 = this.Q60[this.he0].RL;
                        for(int var62 = var61[var82 = var19 + 1] - var61[var19]; var62 > 0; --var62) {
                           int[] var98 = this.SE0;
                           int var104;
                           int var119 = var104 = this.Sv[1].W70[var19];
                           var98[var43] = var104;
                           if (var119 != 7) {
                              if (var24) {
                                 this.mL(var104, var30, var43);
                              } else {
                                 this.N90[var43] = xr[var104];
                              }
                           }

                           ++var43;
                        }

                        var19 = var82;
                     }
                  }
               } else {
                  for(int var18 = 0; var18 < 3; ++var18) {
                     int var36 = -1;

                     for(int var48 = 12; var48 >= 0; --var48) {
                        int[] var68;
                        int var86;
                        int var125 = var86 = (var68 = this.Q60[this.he0].jH0)[var48];
                        int var69 = var68[var48 + 1] - var86;
                        var86 = (var125 << 2) - var86;

                        for(int var88 = (var18 + 1) * var69 + var86 - 1; var69 > 0; --var88) {
                           if (this.ih0[1][var88 / 18][var88 % 18] != 0.0F) {
                              var36 = -10;
                              var69 = -10;
                              int var111 = var48;
                              var48 = var36;
                              var36 = var111;
                           }

                           --var69;
                        }
                     }

                     ++var36;

                     while(var36 < 12) {
                        int[] var49;
                        int var70;
                        int var126 = var70 = (var49 = this.Q60[this.he0].jH0)[var36];
                        int var50;
                        int var89 = var49[var50 = var36 + 1] - var70;
                        var70 = (var126 << 2) - var70;

                        for(int var72 = var18 * var89 + var70; var89 > 0; --var89) {
                           int[] var99 = this.SE0;
                           int var11;
                           int var112 = var11 = this.Sv[1].yk[var18][var36];
                           var99[var72] = var11;
                           if (var112 != 7) {
                              if (var24) {
                                 this.mL(var11, var30, var72);
                              } else {
                                 this.N90[var72] = xr[var11];
                              }
                           }

                           ++var72;
                        }

                        var36 = var50;
                     }

                     int[] var39;
                     int[] var127 = var39 = this.Q60[this.he0].jH0;
                     int var51 = var127[10];
                     int var73;
                     int var128 = var73 = var127[11];
                     int var40 = var73 - var51;
                     var51 = (var51 << 2) - var51;
                     int var41 = var18 * var40 + var51;
                     var51 = var39[12] - var73;
                     var73 = (var128 << 2) - var73;

                     for(int var75 = var18 * var51 + var73; var51 > 0; --var51) {
                        int[] var129 = this.SE0;
                        var129[var75] = var129[var41];
                        if (var24) {
                           float[][] var113 = this.Ws;
                           var113[0][var75] = var113[0][var41];
                           var113[1][var75] = var113[1][var41];
                        } else {
                           float[] var114 = this.N90;
                           var114[var75] = var114[var41];
                        }

                        ++var75;
                     }
                  }
               }
            } else {
               int var15 = 31;
               int var34 = 17;
               int var7 = 0;

               while(var15 >= 0) {
                  if (this.ih0[1][var15][var34] != 0.0F) {
                     var7 = (var15 << 4) + (var15 << 1) + var34;
                     var15 = -1;
                  } else if ((var34 += -1) < 0) {
                     --var15;
                     var34 = 17;
                  }
               }

               for(var15 = 0; (var34 = this.Q60[this.he0].RL[var15]) <= var7; ++var15) {
               }

               while(var15 < 21) {
                  int var8;
                  int[] var46 = this.Q60[this.he0].RL;
                  for(int var47 = var46[var8 = var15 + 1] - var46[var15]; var47 > 0; --var47) {
                     int[] var9 = this.SE0;
                     int var10;
                     int var107 = var10 = this.Sv[1].W70[var15];
                     var9[var34] = var10;
                     if (var107 != 7) {
                        if (var24) {
                           this.mL(var10, var30, var34);
                        } else {
                           this.N90[var34] = xr[var10];
                        }
                     }

                     ++var34;
                  }

                  var15 = var8;
               }

               int[] var108 = this.Q60[this.he0].RL;
               var15 = var108[20];

               for(int var32 = 576 - var108[21]; var32 > 0 && var34 < 576; --var32) {
                  int[] var124 = this.SE0;
                  var124[var34] = var124[var15];
                  if (var24) {
                     float[][] var109 = this.Ws;
                     var109[0][var34] = var109[0][var15];
                     var109[1][var34] = var109[1][var15];
                  } else {
                     float[] var110 = this.N90;
                     var110[var34] = var110[var15];
                  }

                  ++var34;
               }
            }
         }

         int var22 = 0;

         for(int var33 = 0; var33 < 32; ++var33) {
            for(int var45 = 0; var45 < 18; ++var45) {
               if (this.SE0[var22] == 7) {
                  if (var5) {
                     float[][][] var120 = this.Cw0;
                     float[][][] var63;
                     float[] var64;
                     float[] var83;
                     var120[0][var33][var45] = ((var83 = (var63 = this.ih0)[0][var33])[var45] + (var64 = var63[1][var33])[var45]) * 0.70710677F;
                     var120[1][var33][var45] = (var83[var45] - var64[var45]) * 0.70710677F;
                  } else {
                     float[][][] var121 = this.Cw0;
                     float[][][] var65;
                     var121[0][var33][var45] = (var65 = this.ih0)[0][var33][var45];
                     var121[1][var33][var45] = var65[1][var33][var45];
                  }
               } else if (var28) {
                  if (var24) {
                     float[][][] var122 = this.Cw0;
                     float[] var66;
                     float[][] var84;
                     var122[0][var33][var45] = (var66 = this.ih0[0][var33])[var45] * (var84 = this.Ws)[0][var22];
                     var122[1][var33][var45] = var66[var45] * var84[1][var22];
                  } else {
                     float[][][] var123 = this.Cw0;
                     float[] var67;
                     float var85;
                     var123[1][var33][var45] = var85 = this.ih0[0][var33][var45] / ((var67 = this.N90)[var22] + 1.0F);
                     var123[0][var33][var45] = var85 * var67[var22];
                  }
               }

               ++var22;
            }
         }
      }

   }

   public final void Zn(int var1, int var2) {
      OY var10;
      if ((var2 = (var10 = this.Qi0.tu0[var1].Wn[var2]).Iu0) == 0 || var10.Ee != 2 || var10.ot0 != 0) {
         short var11;
         if (var2 != 0 && var10.ot0 != 0 && var10.Ee == 2) {
            var11 = 18;
         } else {
            var11 = 558;
         }

         for(int var13 = 0; var13 < var11; var13 += 18) {
            for(int var3 = 0; var3 < 8; ++var3) {
               int var4 = var13 + 17 - var3;
               int var5 = var13 + 18 + var3;
               float[] var6;
               float[] var10000 = var6 = this.gK;
               float var10002 = var6[var4];
               float var15 = var6[var5];
               float[] var7;
               float var8 = var10002 * (var7 = QV)[var3];
               float[] var9;
               float[] var10003 = var9 = eD;
               var6[var4] = var8 - var15 * var9[var3];
               float var14 = var15 * var7[var3];
               var10000[var5] = var10002 * var10003[var3] + var14;
            }
         }

      }
   }

   public final void dh(int var1, int var2) {
      OY var29 = this.Qi0.tu0[var1].Wn[var2];

      for(int var3 = 0; var3 < 576; var3 += 18) {
         int var4;
         if (var29.Iu0 != 0 && var29.ot0 != 0 && var3 < 36) {
            var4 = 0;
         } else {
            var4 = var29.Ee;
         }

         float[] var5 = this.gK;

         for(int var6 = 0; var6 < 18; ++var6) {
            this.UH[var6] = var5[var6 + var3];
         }

         float[] var39 = this.UH;
         float[] var7 = this.rf;
         if (var4 == 2) {
            var7[0] = 0.0F;
            var7[1] = 0.0F;
            var7[2] = 0.0F;
            var7[3] = 0.0F;
            var7[4] = 0.0F;
            var7[5] = 0.0F;
            var7[6] = 0.0F;
            var7[7] = 0.0F;
            var7[8] = 0.0F;
            var7[9] = 0.0F;
            var7[10] = 0.0F;
            var7[11] = 0.0F;
            var7[12] = 0.0F;
            var7[13] = 0.0F;
            var7[14] = 0.0F;
            var7[15] = 0.0F;
            var7[16] = 0.0F;
            var7[17] = 0.0F;
            var7[18] = 0.0F;
            var7[19] = 0.0F;
            var7[20] = 0.0F;
            var7[21] = 0.0F;
            var7[22] = 0.0F;
            var7[23] = 0.0F;
            var7[24] = 0.0F;
            var7[25] = 0.0F;
            var7[26] = 0.0F;
            var7[27] = 0.0F;
            var7[28] = 0.0F;
            var7[29] = 0.0F;
            var7[30] = 0.0F;
            var7[31] = 0.0F;
            var7[32] = 0.0F;
            var7[33] = 0.0F;
            var7[34] = 0.0F;
            var7[35] = 0.0F;
            var4 = 0;

            int var238;
            for(int var123 = 0; var123 < 3; var4 = var238) {
               int var128 = var123 + 15;
               float var263 = var39[var128];
               int var141 = var123 + 12;
               float var157 = var263 + var39[var141];
               var39[var128] = var157;
               var263 = var39[var141];
               int var158 = var123 + 9;
               float var172 = var263 + var39[var158];
               var39[var141] = var172;
               var263 = var39[var158];
               int var173 = var123 + 6;
               float var185 = var263 + var39[var173];
               var39[var158] = var185;
               var263 = var39[var173];
               int var186 = var123 + 3;
               float var195 = var263 + var39[var186];
               var39[var173] = var195;
               var195 = var39[var186] + var39[var123];
               var39[var186] = var195;
               var195 = var39[var128] + var39[var158];
               var39[var128] = var195;
               var195 = var39[var158] + var39[var186];
               var39[var158] = var195;
               float var142;
               float var159 = (var142 = var39[var141]) * 0.5F;
               float var174 = var39[var173] * 0.8660254F;
               float var206;
               var263 = (var206 = var39[var123]) + var159;
               float var143 = var206 - var142;
               var159 = var263 + var174;
               var263 -= var174;
               float var129;
               float var144 = (var129 = var39[var128]) * 0.5F;
               float var161 = var195 * 0.8660254F;
               float var145;
               float var302 = var145 = (var174 = var39[var186]) + var144;
               float var130 = var174 - var129;
               var302 += var161;
               float var131 = (var145 - var161) * 1.9318516F;
               float var146 = var130 * 0.70710677F;
               float var162;
               var174 = var159 + (var162 = var302 * 0.5176381F);
               var159 -= var162;
               float var187 = var143 + var146;
               var143 -= var146;
               var195 = var263 + var131;
               var263 -= var131;
               var130 = var174 * 0.5043145F;
               var174 = var187 * 0.5411961F;
               var187 = var195 * 0.6302362F;
               var263 *= 0.8213398F;
               var143 *= 1.306563F;
               float var293 = var159 * 3.830649F;
               float var311 = -var130;
               var130 = -var130 * 0.7933533F;
               float var149 = var311 * 0.6087614F;
               float var307 = -var174;
               var159 = -var174 * 0.9238795F;
               var174 = var307 * 0.38268343F;
               var302 = -var187;
               var187 = -var187 * 0.9914449F;
               var195 = var302 * 0.13052619F;
               var206 = var143 * 0.38268343F;
               float var217 = var293 * 0.6087614F;
               float var228 = -var293 * 0.7933533F;
               float var231 = -var143 * 0.9238795F;
               float var236 = -var263 * 0.9914449F;
               var263 *= 0.13052619F;
               var238 = var4 + 6;
               float var242 = var7[var238] + var263;
               var7[var238] = var242;
               int var243 = var4 + 7;
               var206 = var7[var243] + var206;
               var7[var243] = var206;
               int var209 = var4 + 8;
               var217 = var7[var209] + var217;
               var7[var209] = var217;
               var209 = var4 + 9;
               var217 = var7[var209] + var228;
               var7[var209] = var217;
               var209 = var4 + 10;
               var217 = var7[var209] + var231;
               var7[var209] = var217;
               var209 = var4 + 11;
               var217 = var7[var209] + var236;
               var7[var209] = var217;
               var209 = var4 + 12;
               var187 = var7[var209] + var187;
               var7[var209] = var187;
               int var191 = var4 + 13;
               var159 = var7[var191] + var159;
               var7[var191] = var159;
               int var166 = var4 + 14;
               var130 = var7[var166] + var130;
               var7[var166] = var130;
               int var135 = var4 + 15;
               var143 = var7[var135] + var149;
               var7[var135] = var143;
               var135 = var4 + 16;
               var143 = var7[var135] + var174;
               var7[var135] = var143;
               var4 += 17;
               float var137 = var7[var4] + var195;
               var7[var4] = var137;
               ++var123;
            }
         } else {
            float var8 = var39[17];
            float var10000 = var39[16];
            var8 += var39[16];
            var39[17] = var8;
            float var9;
            float var10;
            var10000 = var10 = var10000 + (var9 = var39[15]);
            var39[16] = var10;
            float var10001 = var39[14];
            var9 += var39[14];
            var39[15] = var9;
            float var11;
            float var12 = var10001 + (var11 = var39[13]);
            var39[14] = var12;
            var10001 = var39[12];
            var11 += var39[12];
            var39[13] = var11;
            float var13;
            float var14 = var10001 + (var13 = var39[11]);
            var39[12] = var14;
            var10001 = var39[10];
            var13 += var39[10];
            var39[11] = var13;
            float var15;
            float var16 = var10001 + (var15 = var39[9]);
            var39[10] = var16;
            var10001 = var39[8];
            var15 += var39[8];
            var39[9] = var15;
            float var17;
            float var18;
            var10001 = var18 = var10001 + (var17 = var39[7]);
            var39[8] = var18;
            float var10002 = var39[6];
            var17 += var39[6];
            var39[7] = var17;
            float var19;
            float var20 = var10002 + (var19 = var39[5]);
            var39[6] = var20;
            var10002 = var39[4];
            var19 += var39[4];
            var39[5] = var19;
            float var21;
            float var22;
            var10002 = var22 = var10002 + (var21 = var39[3]);
            var39[4] = var22;
            float var10003 = var39[2];
            var21 += var39[2];
            var39[3] = var21;
            float var23;
            float var24 = var10003 + (var23 = var39[1]);
            var39[2] = var24;
            var10003 = var39[0];
            float var25;
            float var10004 = var25 = var39[0];
            float var117 = var23 + var25;
            var39[1] = var117;
            float var125 = var8 + var9;
            var39[17] = var125;
            float var153 = var9 + var11;
            var39[15] = var153;
            float var180 = var11 + var13;
            var39[13] = var180;
            float var202 = var13 + var15;
            var39[11] = var202;
            float var223 = var15 + var17;
            var39[9] = var223;
            float var233 = var17 + var19;
            var39[7] = var233;
            float var240 = var19 + var21;
            var39[5] = var240;
            var23 = var21 + var117;
            var39[3] = var23;
            float var40;
            float var26 = (var40 = var10003 + var10004) + var14;
            float var27 = var10002 * 1.8793852F + var26;
            var27 = var10001 * 1.5320889F + var27;
            float var256;
            var10000 = var256 = var10000 * 0.34729636F + var27;
            float var41;
            var10001 = var41 = var40 + var22 - var18 - var14 - var14 - var10;
            float var28 = var26 - var22 * 0.34729636F - var18 * 1.8793852F;
            float var258;
            var10002 = var258 = var10 * 1.5320889F + var28;
            var26 -= var22 * 1.5320889F;
            float var252;
            var10003 = var252 = var18 * 0.34729636F + var26 - var10 * 1.8793852F;
            var10004 = var25 - var22 + var18 - var14 + var10;
            var40 = var20 * 1.7320508F;
            var8 = var24 * 1.9696155F + var40;
            var8 = var16 * 1.2855753F + var8;
            var8 = var12 * 0.6840403F + var8;
            var10 = (var24 - var16 - var12) * 1.7320508F;
            var14 = var24 * 1.2855753F - var40 - var16 * 0.6840403F;
            var14 = var12 * 1.9696155F + var14;
            var40 = var24 * 0.6840403F - var40;
            var40 = var16 * 1.9696155F + var40 - var12 * 1.2855753F;
            float var322 = var16 = (var12 = var117 + var117) + var180;
            float var168 = var240 * 1.8793852F + var16;
            float var169 = var223 * 1.5320889F + var168;
            float var170 = var125 * 0.34729636F + var169;
            float var215 = var12 + var240 - var223 - var180 - var180 - var125;
            var18 = var16 - var240 * 0.34729636F - var223 * 1.8793852F;
            var18 = var125 * 1.5320889F + var18;
            var19 = var322 - var240 * 1.5320889F;
            var19 = var223 * 0.34729636F + var19 - var125 * 1.8793852F;
            var9 = (var117 - var240 + var223 - var180 + var125) * 0.70710677F;
            var13 = var233 * 1.7320508F;
            var17 = var23 * 1.9696155F + var13;
            var17 = var202 * 1.2855753F + var17;
            var17 = var153 * 0.6840403F + var17;
            var20 = (var23 - var202 - var153) * 1.7320508F;
            var15 = var23 * 1.2855753F - var13 - var202 * 0.6840403F;
            var15 = var153 * 1.9696155F + var15;
            var13 = var23 * 0.6840403F - var13;
            var11 = var202 * 1.9696155F + var13 - var153 * 1.2855753F;
            float var315 = var256 + var8;
            var21 = var256 + var8 + (var13 = (var170 + var17) * 0.5019099F);
            var13 = var315 - var13;
            float var10009 = var41 + var10;
            var23 = var41 + var10 + (var22 = (var215 + var20) * 0.5176381F);
            var22 = var10009 - var22;
            float var310 = var258 + var14;
            var25 = var258 + var14 + (var24 = (var18 + var15) * 0.55168897F);
            var24 = var310 - var24;
            float var10007 = var252 + var40;
            var27 = var252 + var40 + (var26 = (var19 + var11) * 0.61038727F);
            var26 = var10007 - var26;
            var28 = var10004 + var9;
            var9 = var10004 - var9;
            var10004 = var10003 - var40;
            float var45;
            var11 = var10003 - var40 + (var45 = (var19 - var11) * 0.8717234F);
            var40 = var10004 - var45;
            var10003 = var10002 - var14;
            float var139;
            var14 = var10002 - var14 + (var139 = (var18 - var15) * 1.1831008F);
            float var140 = var10003 - var139;
            var10002 = var10001 - var10;
            float var121;
            var15 = var10001 - var10 + (var121 = (var215 - var20) * 1.9318516F);
            float var122 = var10002 - var121;
            float var227;
            var10000 = var227 = (var16 = var10000 - var8) + (var12 = (var170 - var17) * 5.7368565F);
            float var156;
            float var321 = var156 = var16 - var12;
            float[] var30 = Ty[var4];
            float var47 = -var156 * var30[0];
            var7[0] = var47;
            float var48 = -var122 * var30[1];
            var7[1] = var48;
            float var49 = -var140 * var30[2];
            var7[2] = var49;
            float var50 = -var40 * var30[3];
            var7[3] = var50;
            float var51 = -var9 * var30[4];
            var7[4] = var51;
            float var52 = -var26 * var30[5];
            var7[5] = var52;
            float var53 = -var24 * var30[6];
            var7[6] = var53;
            float var54 = -var22 * var30[7];
            var7[7] = var54;
            float var55 = -var13 * var30[8];
            var7[8] = var55;
            float var56 = var13 * var30[9];
            var7[9] = var56;
            float var57 = var22 * var30[10];
            var7[10] = var57;
            float var58 = var24 * var30[11];
            var7[11] = var58;
            float var59 = var26 * var30[12];
            var7[12] = var59;
            float var60 = var9 * var30[13];
            var7[13] = var60;
            var40 *= var30[14];
            var7[14] = var40;
            var40 = var140 * var30[15];
            var7[15] = var40;
            var40 = var122 * var30[16];
            var7[16] = var40;
            var40 = var321 * var30[17];
            var7[17] = var40;
            var40 = var227 * var30[18];
            var7[18] = var40;
            var40 = var15 * var30[19];
            var7[19] = var40;
            var40 = var14 * var30[20];
            var7[20] = var40;
            var40 = var11 * var30[21];
            var7[21] = var40;
            var40 = var28 * var30[22];
            var7[22] = var40;
            var40 = var27 * var30[23];
            var7[23] = var40;
            var40 = var25 * var30[24];
            var7[24] = var40;
            var40 = var23 * var30[25];
            var7[25] = var40;
            var40 = var21 * var30[26];
            var7[26] = var40;
            var40 = var21 * var30[27];
            var7[27] = var40;
            var40 = var23 * var30[28];
            var7[28] = var40;
            var40 = var25 * var30[29];
            var7[29] = var40;
            var40 = var27 * var30[30];
            var7[30] = var40;
            var40 = var28 * var30[31];
            var7[31] = var40;
            var40 = var11 * var30[32];
            var7[32] = var40;
            var40 = var14 * var30[33];
            var7[33] = var40;
            var40 = var15 * var30[34];
            var7[34] = var40;
            float var31 = var10000 * var30[35];
            var7[35] = var31;
         }

         for(int var34 = 0; var34 < 18; ++var34) {
            var5[var34 + var3] = this.UH[var34];
         }

         float[][] var35 = this.xh0;
         float[] var36;
         float[] var37;
         var5[var3] = (var37 = this.rf)[0] + (var36 = var35[var1])[var3];
         float var82 = var37[18];
         var36[var3] = var82;
         int var83;
         var5[var83 = var3 + 1] = var37[1] + var36[var83];
         float var100 = var37[19];
         var36[var83] = var100;
         var5[var83 = var3 + 2] = var37[2] + var36[var83];
         var100 = var37[20];
         var36[var83] = var100;
         var5[var83 = var3 + 3] = var37[3] + var36[var83];
         var100 = var37[21];
         var36[var83] = var100;
         var5[var83 = var3 + 4] = var37[4] + var36[var83];
         var100 = var37[22];
         var36[var83] = var100;
         var5[var83 = var3 + 5] = var37[5] + var36[var83];
         var100 = var37[23];
         var36[var83] = var100;
         var5[var83 = var3 + 6] = var37[6] + var36[var83];
         var100 = var37[24];
         var36[var83] = var100;
         var5[var83 = var3 + 7] = var37[7] + var36[var83];
         var100 = var37[25];
         var36[var83] = var100;
         var5[var83 = var3 + 8] = var37[8] + var36[var83];
         var100 = var37[26];
         var36[var83] = var100;
         var5[var83 = var3 + 9] = var37[9] + var36[var83];
         var100 = var37[27];
         var36[var83] = var100;
         var5[var83 = var3 + 10] = var37[10] + var36[var83];
         var100 = var37[28];
         var36[var83] = var100;
         var5[var83 = var3 + 11] = var37[11] + var36[var83];
         var100 = var37[29];
         var36[var83] = var100;
         var5[var83 = var3 + 12] = var37[12] + var36[var83];
         var100 = var37[30];
         var36[var83] = var100;
         var5[var83 = var3 + 13] = var37[13] + var36[var83];
         var100 = var37[31];
         var36[var83] = var100;
         var5[var83 = var3 + 14] = var37[14] + var36[var83];
         var100 = var37[32];
         var36[var83] = var100;
         var5[var83 = var3 + 15] = var37[15] + var36[var83];
         var100 = var37[33];
         var36[var83] = var100;
         var5[var83 = var3 + 16] = var37[16] + var36[var83];
         var100 = var37[34];
         var36[var83] = var100;
         var5[var83 = var3 + 17] = var37[17] + var36[var83];
         float var38 = var37[35];
         var36[var83] = var38;
      }

   }

   public final void II0() {
      // $FF: Couldn't be decompiled
   }
}

