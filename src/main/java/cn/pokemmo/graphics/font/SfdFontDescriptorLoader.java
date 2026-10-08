package cn.pokemmo.graphics.font;

import f.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;

public class SfdFontDescriptorLoader {
   public static final float G90 = (float)vb0_2.ki0(0.04908738521234052, (double)2.0F, (double)1.0F);
   public static final float Zy = (float)vb0_2.ki0(0.14726215563702155, (double)2.0F, (double)1.0F);
   public static final float ug = (float)vb0_2.ki0(0.2454369260617026, (double)2.0F, (double)1.0F);
   public static final float HR = (float)vb0_2.ki0(0.3436116964863836, (double)2.0F, (double)1.0F);
   public static final float x4 = (float)vb0_2.ki0(0.44178646691106466, (double)2.0F, (double)1.0F);
   public static final float Lpt4 = (float)vb0_2.ki0(0.5399612373357456, (double)2.0F, (double)1.0F);
   public static final float Gx = (float)vb0_2.ki0(0.6381360077604268, (double)2.0F, (double)1.0F);
   public static final float Bo0 = (float)vb0_2.ki0(0.7363107781851077, (double)2.0F, (double)1.0F);
   public static final float BG0 = (float)vb0_2.ki0(0.8344855486097889, (double)2.0F, (double)1.0F);
   public static final float uB0 = (float)vb0_2.ki0(0.9326603190344698, (double)2.0F, (double)1.0F);
   public static final float cn0 = (float)vb0_2.ki0(1.030835089459151, (double)2.0F, (double)1.0F);
   public static final float sG = (float)vb0_2.ki0(1.1290098598838318, (double)2.0F, (double)1.0F);
   public static final float COM8 = (float)vb0_2.ki0(1.227184630308513, (double)2.0F, (double)1.0F);
   public static final float jm0 = (float)vb0_2.ki0(1.325359400733194, (double)2.0F, (double)1.0F);
   public static final float com2 = (float)vb0_2.ki0(1.423534171157875, (double)2.0F, (double)1.0F);
   public static final float Zi = (float)vb0_2.ki0(1.521708941582556, (double)2.0F, (double)1.0F);
   public static final float XT = (float)vb0_2.ki0(0.09817477042468103, (double)2.0F, (double)1.0F);
   public static final float q6 = (float)vb0_2.ki0(0.2945243112740431, (double)2.0F, (double)1.0F);
   public static final float zI = (float)vb0_2.ki0(0.4908738521234052, (double)2.0F, (double)1.0F);
   public static final float Lk0 = (float)vb0_2.ki0(0.6872233929727672, (double)2.0F, (double)1.0F);
   public static final float Gm0 = (float)vb0_2.ki0(0.8835729338221293, (double)2.0F, (double)1.0F);
   public static final float k20 = (float)vb0_2.ki0(1.0799224746714913, (double)2.0F, (double)1.0F);
   public static final float On0 = (float)vb0_2.ki0(1.2762720155208536, (double)2.0F, (double)1.0F);
   public static final float rN = (float)vb0_2.ki0(1.4726215563702154, (double)2.0F, (double)1.0F);
   public static final float H7 = (float)vb0_2.ki0(0.19634954084936207, (double)2.0F, (double)1.0F);
   public static final float Aa0 = (float)vb0_2.ki0(0.5890486225480862, (double)2.0F, (double)1.0F);
   public static final float Hw = (float)vb0_2.ki0(0.9817477042468103, (double)2.0F, (double)1.0F);
   public static final float NL0 = (float)vb0_2.ki0(1.3744467859455345, (double)2.0F, (double)1.0F);
   public static final float X2 = (float)vb0_2.ki0((Math.PI / 8D), (double)2.0F, (double)1.0F);
   public static final float Qx0 = (float)vb0_2.ki0(1.1780972450961724, (double)2.0F, (double)1.0F);
   public static final float Qs0 = (float)vb0_2.ki0((Math.PI / 4D), (double)2.0F, (double)1.0F);
   public static float[] Ii = null;
   public static float[][] tI0 = (float[][])null;
   public final float[] dG;
   public final float[] zq0;
   public float[] Qp0;
   public int K10;
   public final float[] RE;
   public final int bc0;
   public final float Ld;
   public final float[] ZK;

   public SfdFontDescriptorLoader(int var1) {
      super();
      float var2 = 32700.0F;
      this.ZK = new float[32];
      if (Ii == null) {
         tI0 = gE(Ii = iR());
      }

      this.dG = new float[512];
      this.zq0 = new float[512];
      this.RE = new float[32];
      this.bc0 = var1;
      this.Ld = var2;
      this.vx();
   }

   public static float[] iR() {
      try {
         Class var10000 = Float.TYPE;
         return (float[])f7(B7.class.getResourceAsStream("/sfd.ser"), var10000);
      } catch (IOException var1) {
         throw new ExceptionInInitializerError(var1);
      }
   }

   public static Object f7(InputStream var0, Class var1) throws IOException {
      short var2 = 512;
      if (var1 != null) {
         if (var0 != null) {
            ObjectInputStream var10000 = new ObjectInputStream(var0);

            Object var6 = null;

            try {
               var6 = var10000.readObject();
            } catch (ClassNotFoundException var4) {
               throw new InvalidClassException(var4.toString());
            }

            Object var5 = var6;
            Class var3;
            if ((var3 = var6.getClass()).isArray()) {
               if (var3.getComponentType() == var1) {
                  if (Array.getLength(var5) == var2) {
                     return var5;
                  } else {
                     throw new InvalidObjectException("array length mismatch");
                  }
               } else {
                  throw new InvalidObjectException("unexpected array component type");
               }
            } else {
               throw new InvalidObjectException("object is not an array");
            }
         } else {
            throw new NullPointerException("in");
         }
      } else {
         throw new NullPointerException("elemType");
      }
   }

   public static float[][] gE(float[] var0) {
      byte var1 = 16;
      int var2;
      float[][] var3 = new float[var2 = var0.length / var1][];

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5;
         int var6;
         if ((var5 = var4 * var1) + var1 > var0.length) {
            var6 = var0.length - var5;
         } else {
            var6 = var1;
         }

         if (var6 < 0) {
            var6 = 0;
         }

         float[] var7 = new float[var6];

         for(int var8 = 0; var8 < var6; ++var8) {
            var7[var8] = var0[var5 + var8];
         }

         var3[var4] = var7;
      }

      return var3;
   }

   public final void vx() {
      for(int var1 = 0; var1 < 512; ++var1) {
         this.zq0[var1] = 0.0F;
         this.dG[var1] = 0.0F;
      }

      for(int var2 = 0; var2 < 32; ++var2) {
         this.RE[var2] = 0.0F;
      }

      this.Qp0 = this.dG;
      this.K10 = 15;
   }

   public final void d9(bn_1 var1) {
      float[] var2;
      float var10001 = (var2 = this.RE)[0];
      float var3 = var2[1];
      float var4 = var2[2];
      float var5 = var2[3];
      float var6 = var2[4];
      float var7 = var2[5];
      float var8 = var2[6];
      float var9 = var2[7];
      float var10 = var2[8];
      float var11 = var2[9];
      float var12 = var2[10];
      float var13 = var2[11];
      float var14 = var2[12];
      float var15 = var2[13];
      float var16 = var2[14];
      float var17 = var2[15];
      float var18 = var2[16];
      float var19 = var2[17];
      float var20 = var2[18];
      float var21 = var2[19];
      float var22 = var2[20];
      float var23 = var2[21];
      float var24 = var2[22];
      float var25 = var2[23];
      float var26 = var2[24];
      float var27 = var2[25];
      float var28 = var2[26];
      float var29 = var2[27];
      float var30 = var2[28];
      float var31 = var2[29];
      float var32 = var2[30];
      float var70;
      float var33 = var10001 + (var70 = var2[31]);
      float var71 = var3 + var32;
      float var34 = var4 + var31;
      float var35 = var5 + var30;
      float var36 = var6 + var29;
      float var37 = var7 + var28;
      float var38 = var8 + var27;
      float var39 = var9 + var26;
      float var40 = var10 + var25;
      float var41 = var11 + var24;
      float var42 = var12 + var23;
      float var43 = var13 + var22;
      float var44 = var14 + var21;
      float var45 = var15 + var20;
      float var46 = var16 + var19;
      float var47;
      float var48;
      float var10003 = var48 = var33 + (var47 = var17 + var18);
      float var72 = var71 + var46;
      float var197 = var34 + var45;
      float var202 = var35 + var44;
      float var206 = var36 + var43;
      float var212 = var37 + var42;
      float var216 = var38 + var41;
      float var221 = var39 + var40;
      float var225;
      float var227 = (var33 - var47) * (var225 = XT);
      float var234;
      float var237 = (var71 - var46) * (var234 = q6);
      float var241;
      float var243 = (var34 - var45) * (var241 = zI);
      var46 = (var35 - var44) * (var45 = Lk0);
      float var49 = (var36 - var43) * (var47 = Gm0);
      float var50;
      float var51 = (var37 - var42) * (var50 = k20);
      float var52;
      float var53 = (var38 - var41) * (var52 = On0);
      float var54;
      float var55 = (var39 - var40) * (var54 = rN);
      float var56;
      var10003 = var56 = var10003 + var221;
      float var57;
      float var303 = var57 = var72 + var216;
      var71 = var197 + var212;
      var33 = var202 + var206;
      var35 = (var48 - var221) * (var34 = H7);
      var37 = (var72 - var216) * (var36 = Aa0);
      var40 = (var197 - var212) * (var38 = Hw);
      var44 = (var202 - var206) * (var42 = NL0);
      float var251 = var227 + var55;
      var48 = var237 + var53;
      float var259 = var243 + var51;
      float var263 = var46 + var49;
      float var268 = (var227 - var55) * var34;
      var55 = (var237 - var53) * var36;
      float var276 = (var243 - var51) * var38;
      float var58 = (var46 - var49) * var42;
      float var59 = var56 + var33;
      float var60 = var303 + var71;
      float var199;
      var10003 = (var10003 - var33) * (var199 = X2);
      float var74;
      float var208 = (var57 - var71) * (var74 = Qx0);
      float var218 = var35 + var44;
      float var229 = var37 + var40;
      var44 = (var35 - var44) * var199;
      var46 = (var37 - var40) * var74;
      float var256 = var251 + var263;
      var49 = var48 + var259;
      var51 = (var251 - var263) * var199;
      var53 = (var48 - var259) * var74;
      float var273 = var268 + var58;
      var56 = var55 + var276;
      var57 = (var268 - var58) * var199;
      var58 = (var55 - var276) * var74;
      float var285 = var59 + var60;
      float var287;
      float var61 = (var59 - var60) * (var287 = Qs0);
      float var62 = var10003 + var208;
      var10003 = var35 = (var10003 - var208) * var287;
      var37 = var218 + var229;
      var40 = (var218 - var229) * var287;
      float var246 = var44 + var46;
      var46 = (var44 - var46) * var287;
      var48 = var256 + var49;
      var49 = (var256 - var49) * var287;
      float var265 = var51 + var53;
      var53 = (var51 - var53) * var287;
      var55 = var273 + var56;
      var56 = (var273 - var56) * var287;
      float var281 = var57 + var58;
      var58 = (var57 - var58) * var287;
      float var231;
      var44 = (var59 = -(var231 = var46 + var40)) - var246;
      var37 = -var246 - var46 - var37;
      float var63;
      float var64 = (var63 = var58 + var53) + var56;
      float var65;
      float var262;
      var57 = (var65 = -(var262 = var58 + var56 + var49)) - var281;
      float var66;
      float var311 = var51 = (var66 = -var281 - var58) - var265 - var53;
      var51 -= var56;
      var48 = var66 - var55 - var48;
      var53 = var311 - var55;
      var55 = -var285;
      var62 = (var56 = -var10003) - var62;
      var10001 = var66 = (var10001 - var70) * G90;
      var3 = (var3 - var32) * Zy;
      var4 = (var4 - var31) * ug;
      var5 = (var5 - var30) * HR;
      var6 = (var6 - var29) * x4;
      var7 = (var7 - var28) * Lpt4;
      var8 = (var8 - var27) * Gx;
      float var110;
      float var295 = var110 = (var9 - var26) * Bo0;
      var10 = (var10 - var25) * BG0;
      var11 = (var11 - var24) * uB0;
      var12 = (var12 - var23) * cn0;
      var13 = (var13 - var22) * sG;
      var14 = (var14 - var21) * COM8;
      var15 = (var15 - var20) * jm0;
      var16 = (var16 - var19) * com2;
      float var154;
      var18 = var66 + (var154 = (var17 - var18) * Zi);
      var19 = var3 + var16;
      var20 = var4 + var15;
      var21 = var5 + var14;
      var22 = var6 + var13;
      var23 = var7 + var12;
      var24 = var8 + var11;
      var25 = var295 + var10;
      var10001 = var17 = (var10001 - var154) * var225;
      var3 = (var3 - var16) * var234;
      var4 = (var4 - var15) * var241;
      float var90;
      var295 = var90 = (var5 - var14) * var45;
      var6 = (var6 - var13) * var47;
      var7 = (var7 - var12) * var50;
      var8 = (var8 - var11) * var52;
      var9 = (var110 - var10) * var54;
      var10 = var18 + var25;
      var11 = var19 + var24;
      var12 = var20 + var23;
      var13 = var21 + var22;
      var14 = (var18 - var25) * var34;
      var15 = (var19 - var24) * var36;
      var16 = (var20 - var23) * var38;
      float var156 = (var21 - var22) * var42;
      var18 = var17 + var9;
      var19 = var3 + var8;
      var20 = var4 + var7;
      var21 = var295 + var6;
      float var112;
      var10001 = var112 = (var10001 - var9) * var34;
      float var80;
      var295 = var80 = (var3 - var8) * var36;
      var4 = (var4 - var7) * var38;
      var5 = (var90 - var6) * var42;
      var6 = var10 + var13;
      var7 = var11 + var12;
      var8 = (var10 - var13) * var199;
      var9 = (var11 - var12) * var74;
      var10 = var14 + var156;
      var11 = var15 + var16;
      var12 = (var14 - var156) * var199;
      var13 = (var15 - var16) * var74;
      var14 = var18 + var21;
      var15 = var19 + var20;
      var16 = (var18 - var21) * var199;
      var17 = (var19 - var20) * var74;
      var18 = var112 + var5;
      var19 = var295 + var4;
      var10001 = (var10001 - var5) * var199;
      var71 = (var80 - var4) * var74;
      var3 = var6 + var7;
      var4 = (var6 - var7) * var287;
      var5 = var8 + var9;
      var6 = (var8 - var9) * var287;
      var7 = var10 + var11;
      var8 = (var10 - var11) * var287;
      var9 = var12 + var13;
      var10 = (var12 - var13) * var287;
      var11 = var14 + var15;
      var12 = (var14 - var15) * var287;
      var13 = var16 + var17;
      var14 = (var16 - var17) * var287;
      var15 = var18 + var19;
      var16 = (var18 - var19) * var287;
      var17 = var10001 + var71;
      float var76;
      var10001 = var20 = (var19 = (var18 = (var76 = (var10001 - var71) * var287) + var10) + var14) + var8 + var16;
      var10003 = var22 = (var21 = var76 + var14 + var6) + var16;
      float var337 = var16 + var76 + var12;
      float var87;
      float var125;
      var12 = (var125 = -(var87 = var16 + var76 + var12 + var4)) - var17;
      float var136;
      var24 = (var23 = -(var136 = var337 + var8 + var10)) - var9 - var17;
      float var334 = -var13 - var14 - var17 - var76;
      float var339 = -var13 - var14 - var17 - var76 - var16;
      float var109 = var334 - var16 - var5 - var6;
      var14 = var339 - var8 - var9 - var10;
      var334 = var16 = var334 - var15;
      var5 = var16 - var5 - var6;
      var7 = var334 - (var6 = var7 + var9 + var10);
      float var331 = -var11 - var15 - var17 - var76;
      var3 = -var11 - var15 - var17 - var76 - var3;
      var6 = var331 - var6;
      float[] var115 = this.Qp0;
      int var120 = this.K10;
      var115[var120] = var61;
      int var147 = var120 + 16;
      var115[var147] = var87;
      int var88 = var120 + 32;
      var115[var88] = var262;
      int var153 = var120 + 48;
      var115[var153] = var136;
      int var137 = var120 + 64;
      var115[var137] = var231;
      int var159 = var120 + 80;
      var115[var159] = var20;
      int var173 = var120 + 96;
      var115[var173] = var64;
      int var187 = var120 + 112;
      var115[var187] = var22;
      int var180 = var120 + 128;
      var115[var180] = var35;
      int var188 = var120 + 144;
      var115[var188] = var21;
      int var177 = var120 + 160;
      var115[var177] = var63;
      int var189 = var120 + 176;
      var115[var189] = var19;
      int var169 = var120 + 192;
      var115[var169] = var46;
      int var190 = var120 + 208;
      var115[var190] = var18;
      int var164 = var120 + 224;
      var115[var164] = var58;
      int var191 = var120 + 240;
      var115[var191] = var76;
      int var77 = var120 + 256;
      var115[var77] = 0.0F;
      int var192 = var120 + 272;
      var31 = -var76;
      var115[var192] = var31;
      int var194 = var120 + 288;
      var32 = -var58;
      var115[var194] = var32;
      int var196 = var120 + 304;
      var33 = -var18;
      var115[var196] = var33;
      int var201 = var120 + 320;
      var34 = -var46;
      var115[var201] = var34;
      int var205 = var120 + 336;
      var35 = -var19;
      var115[var205] = var35;
      int var211 = var120 + 352;
      var36 = -var63;
      var115[var211] = var36;
      int var215 = var120 + 368;
      var38 = -var21;
      var115[var215] = var38;
      int var224 = var120 + 384;
      var115[var224] = var56;
      int var226 = var120 + 400;
      var40 = -var10003;
      var115[var226] = var40;
      int var233 = var120 + 416;
      var41 = -var64;
      var115[var233] = var41;
      int var236 = var120 + 432;
      var42 = -var10001;
      var115[var236] = var42;
      int var240 = var120 + 448;
      var115[var240] = var59;
      int var242 = var120 + 464;
      var115[var242] = var23;
      int var183 = var120 + 480;
      var115[var183] = var65;
      int var249 = var120 + 496;
      var115[var249] = var125;
      float[] var126 = this.dG;
      if (var115 == var126) {
         var126 = this.zq0;
      }

      float var67 = -var61;
      var126[var120] = var67;
      var126[var147] = var12;
      var126[var88] = var57;
      var126[var153] = var24;
      var126[var137] = var44;
      var126[var159] = var14;
      var126[var173] = var51;
      var126[var187] = var109;
      var126[var180] = var62;
      var126[var188] = var5;
      var126[var177] = var53;
      var126[var189] = var7;
      var126[var169] = var37;
      var126[var190] = var6;
      var126[var164] = var48;
      var126[var191] = var3;
      var126[var77] = var55;
      var126[var192] = var3;
      var126[var194] = var48;
      var126[var196] = var6;
      var126[var201] = var37;
      var126[var205] = var7;
      var126[var211] = var53;
      var126[var215] = var5;
      var126[var224] = var62;
      var126[var226] = var109;
      var126[var233] = var51;
      var126[var236] = var14;
      var126[var240] = var44;
      var126[var242] = var24;
      var126[var183] = var57;
      var126[var249] = var12;
      this.Kc(var1);
      this.K10 = this.K10 + 1 & 15;
      float[] var68;
      if (this.Qp0 == (var68 = this.dG)) {
         var68 = this.zq0;
      }

      this.Qp0 = var68;

      for(int var69 = 0; var69 < 32; ++var69) {
         this.RE[var69] = 0.0F;
      }

   }

   public final void ub0() {
      float[] var1 = this.Qp0;
      float[] var2 = this.ZK;
      int var3 = 0;

      for(int var4 = 0; var4 < 32; ++var4) {
         float[] var5 = tI0[var4];
         float var6 = var1[var3] * var5[0];
         var6 = var1[var3 + 15] * var5[1] + var6;
         var6 = var1[var3 + 14] * var5[2] + var6;
         var6 = var1[var3 + 13] * var5[3] + var6;
         var6 = var1[var3 + 12] * var5[4] + var6;
         var6 = var1[var3 + 11] * var5[5] + var6;
         var6 = var1[var3 + 10] * var5[6] + var6;
         var6 = var1[var3 + 9] * var5[7] + var6;
         var6 = var1[var3 + 8] * var5[8] + var6;
         var6 = var1[var3 + 7] * var5[9] + var6;
         var6 = var1[var3 + 6] * var5[10] + var6;
         var6 = var1[var3 + 5] * var5[11] + var6;
         var6 = var1[var3 + 4] * var5[12] + var6;
         var6 = var1[var3 + 3] * var5[13] + var6;
         var6 = var1[var3 + 2] * var5[14] + var6;
         var2[var4] = (var1[var3 + 1] * var5[15] + var6) * this.Ld;
         var3 += 16;
      }

   }

   public final void Q1() {
      float[] var1 = this.Qp0;
      float[] var2 = this.ZK;
      int var3 = 0;

      for(int var4 = 0; var4 < 32; ++var4) {
         float[] var5 = tI0[var4];
         float var6 = var1[var3 + 1] * var5[0];
         var6 = var1[var3] * var5[1] + var6;
         var6 = var1[var3 + 15] * var5[2] + var6;
         var6 = var1[var3 + 14] * var5[3] + var6;
         var6 = var1[var3 + 13] * var5[4] + var6;
         var6 = var1[var3 + 12] * var5[5] + var6;
         var6 = var1[var3 + 11] * var5[6] + var6;
         var6 = var1[var3 + 10] * var5[7] + var6;
         var6 = var1[var3 + 9] * var5[8] + var6;
         var6 = var1[var3 + 8] * var5[9] + var6;
         var6 = var1[var3 + 7] * var5[10] + var6;
         var6 = var1[var3 + 6] * var5[11] + var6;
         var6 = var1[var3 + 5] * var5[12] + var6;
         var6 = var1[var3 + 4] * var5[13] + var6;
         var6 = var1[var3 + 3] * var5[14] + var6;
         var2[var4] = (var1[var3 + 2] * var5[15] + var6) * this.Ld;
         var3 += 16;
      }

   }

   public final void O7() {
      float[] var1 = this.Qp0;
      float[] var2 = this.ZK;
      int var3 = 0;

      for(int var4 = 0; var4 < 32; ++var4) {
         float[] var5 = tI0[var4];
         float var6 = var1[var3 + 2] * var5[0];
         var6 = var1[var3 + 1] * var5[1] + var6;
         var6 = var1[var3] * var5[2] + var6;
         var6 = var1[var3 + 15] * var5[3] + var6;
         var6 = var1[var3 + 14] * var5[4] + var6;
         var6 = var1[var3 + 13] * var5[5] + var6;
         var6 = var1[var3 + 12] * var5[6] + var6;
         var6 = var1[var3 + 11] * var5[7] + var6;
         var6 = var1[var3 + 10] * var5[8] + var6;
         var6 = var1[var3 + 9] * var5[9] + var6;
         var6 = var1[var3 + 8] * var5[10] + var6;
         var6 = var1[var3 + 7] * var5[11] + var6;
         var6 = var1[var3 + 6] * var5[12] + var6;
         var6 = var1[var3 + 5] * var5[13] + var6;
         var6 = var1[var3 + 4] * var5[14] + var6;
         var2[var4] = (var1[var3 + 3] * var5[15] + var6) * this.Ld;
         var3 += 16;
      }

   }

   public final void Or0() {
      float[] var1 = this.Qp0;
      float[] var2 = this.ZK;
      int var3 = 0;

      for(int var4 = 0; var4 < 32; ++var4) {
         float[] var5 = tI0[var4];
         float var6 = var1[var3 + 3] * var5[0];
         var6 = var1[var3 + 2] * var5[1] + var6;
         var6 = var1[var3 + 1] * var5[2] + var6;
         var6 = var1[var3] * var5[3] + var6;
         var6 = var1[var3 + 15] * var5[4] + var6;
         var6 = var1[var3 + 14] * var5[5] + var6;
         var6 = var1[var3 + 13] * var5[6] + var6;
         var6 = var1[var3 + 12] * var5[7] + var6;
         var6 = var1[var3 + 11] * var5[8] + var6;
         var6 = var1[var3 + 10] * var5[9] + var6;
         var6 = var1[var3 + 9] * var5[10] + var6;
         var6 = var1[var3 + 8] * var5[11] + var6;
         var6 = var1[var3 + 7] * var5[12] + var6;
         var6 = var1[var3 + 6] * var5[13] + var6;
         var6 = var1[var3 + 5] * var5[14] + var6;
         var2[var4] = (var1[var3 + 4] * var5[15] + var6) * this.Ld;
         var3 += 16;
      }

   }

   public final void qk() {
      float[] var1 = this.Qp0;
      float[] var2 = this.ZK;
      int var3 = 0;

      for(int var4 = 0; var4 < 32; ++var4) {
         float[] var5 = tI0[var4];
         float var6 = var1[var3 + 4] * var5[0];
         var6 = var1[var3 + 3] * var5[1] + var6;
         var6 = var1[var3 + 2] * var5[2] + var6;
         var6 = var1[var3 + 1] * var5[3] + var6;
         var6 = var1[var3] * var5[4] + var6;
         var6 = var1[var3 + 15] * var5[5] + var6;
         var6 = var1[var3 + 14] * var5[6] + var6;
         var6 = var1[var3 + 13] * var5[7] + var6;
         var6 = var1[var3 + 12] * var5[8] + var6;
         var6 = var1[var3 + 11] * var5[9] + var6;
         var6 = var1[var3 + 10] * var5[10] + var6;
         var6 = var1[var3 + 9] * var5[11] + var6;
         var6 = var1[var3 + 8] * var5[12] + var6;
         var6 = var1[var3 + 7] * var5[13] + var6;
         var6 = var1[var3 + 6] * var5[14] + var6;
         var2[var4] = (var1[var3 + 5] * var5[15] + var6) * this.Ld;
         var3 += 16;
      }

   }

   public final void Kc(bn_1 var1) {
      switch (this.K10) {
         case 0:
            this.ub0();
            break;
         case 1:
            this.Q1();
            break;
         case 2:
            this.O7();
            break;
         case 3:
            this.Or0();
            break;
         case 4:
            this.qk();
            break;
         case 5:
            float[] var18 = this.Qp0;
            float[] var29 = this.ZK;
            int var40 = 0;

            for(int var53 = 0; var53 < 32; ++var53) {
               float[] var64 = tI0[var53];
               float var215 = var18[var40 + 5] * var64[0];
               var215 = var18[var40 + 4] * var64[1] + var215;
               var215 = var18[var40 + 3] * var64[2] + var215;
               var215 = var18[var40 + 2] * var64[3] + var215;
               var215 = var18[var40 + 1] * var64[4] + var215;
               var215 = var18[var40] * var64[5] + var215;
               var215 = var18[var40 + 15] * var64[6] + var215;
               var215 = var18[var40 + 14] * var64[7] + var215;
               var215 = var18[var40 + 13] * var64[8] + var215;
               var215 = var18[var40 + 12] * var64[9] + var215;
               var215 = var18[var40 + 11] * var64[10] + var215;
               var215 = var18[var40 + 10] * var64[11] + var215;
               var215 = var18[var40 + 9] * var64[12] + var215;
               var215 = var18[var40 + 8] * var64[13] + var215;
               var215 = var18[var40 + 7] * var64[14] + var215;
               var29[var53] = (var18[var40 + 6] * var64[15] + var215) * this.Ld;
               var40 += 16;
            }
            break;
         case 6:
            float[] var17 = this.Qp0;
            float[] var28 = this.ZK;
            int var39 = 0;

            for(int var52 = 0; var52 < 32; ++var52) {
               float[] var63 = tI0[var52];
               float var200 = var17[var39 + 6] * var63[0];
               var200 = var17[var39 + 5] * var63[1] + var200;
               var200 = var17[var39 + 4] * var63[2] + var200;
               var200 = var17[var39 + 3] * var63[3] + var200;
               var200 = var17[var39 + 2] * var63[4] + var200;
               var200 = var17[var39 + 1] * var63[5] + var200;
               var200 = var17[var39] * var63[6] + var200;
               var200 = var17[var39 + 15] * var63[7] + var200;
               var200 = var17[var39 + 14] * var63[8] + var200;
               var200 = var17[var39 + 13] * var63[9] + var200;
               var200 = var17[var39 + 12] * var63[10] + var200;
               var200 = var17[var39 + 11] * var63[11] + var200;
               var200 = var17[var39 + 10] * var63[12] + var200;
               var200 = var17[var39 + 9] * var63[13] + var200;
               var200 = var17[var39 + 8] * var63[14] + var200;
               var28[var52] = (var17[var39 + 7] * var63[15] + var200) * this.Ld;
               var39 += 16;
            }
            break;
         case 7:
            float[] var16 = this.Qp0;
            float[] var27 = this.ZK;
            int var38 = 0;

            for(int var51 = 0; var51 < 32; ++var51) {
               float[] var62 = tI0[var51];
               float var185 = var16[var38 + 7] * var62[0];
               var185 = var16[var38 + 6] * var62[1] + var185;
               var185 = var16[var38 + 5] * var62[2] + var185;
               var185 = var16[var38 + 4] * var62[3] + var185;
               var185 = var16[var38 + 3] * var62[4] + var185;
               var185 = var16[var38 + 2] * var62[5] + var185;
               var185 = var16[var38 + 1] * var62[6] + var185;
               var185 = var16[var38] * var62[7] + var185;
               var185 = var16[var38 + 15] * var62[8] + var185;
               var185 = var16[var38 + 14] * var62[9] + var185;
               var185 = var16[var38 + 13] * var62[10] + var185;
               var185 = var16[var38 + 12] * var62[11] + var185;
               var185 = var16[var38 + 11] * var62[12] + var185;
               var185 = var16[var38 + 10] * var62[13] + var185;
               var185 = var16[var38 + 9] * var62[14] + var185;
               var27[var51] = (var16[var38 + 8] * var62[15] + var185) * this.Ld;
               var38 += 16;
            }
            break;
         case 8:
            float[] var15 = this.Qp0;
            float[] var26 = this.ZK;
            int var37 = 0;

            for(int var50 = 0; var50 < 32; ++var50) {
               float[] var61 = tI0[var50];
               float var170 = var15[var37 + 8] * var61[0];
               var170 = var15[var37 + 7] * var61[1] + var170;
               var170 = var15[var37 + 6] * var61[2] + var170;
               var170 = var15[var37 + 5] * var61[3] + var170;
               var170 = var15[var37 + 4] * var61[4] + var170;
               var170 = var15[var37 + 3] * var61[5] + var170;
               var170 = var15[var37 + 2] * var61[6] + var170;
               var170 = var15[var37 + 1] * var61[7] + var170;
               var170 = var15[var37] * var61[8] + var170;
               var170 = var15[var37 + 15] * var61[9] + var170;
               var170 = var15[var37 + 14] * var61[10] + var170;
               var170 = var15[var37 + 13] * var61[11] + var170;
               var170 = var15[var37 + 12] * var61[12] + var170;
               var170 = var15[var37 + 11] * var61[13] + var170;
               var170 = var15[var37 + 10] * var61[14] + var170;
               var26[var50] = (var15[var37 + 9] * var61[15] + var170) * this.Ld;
               var37 += 16;
            }
            break;
         case 9:
            float[] var14 = this.Qp0;
            float[] var25 = this.ZK;
            int var36 = 0;

            for(int var49 = 0; var49 < 32; ++var49) {
               float[] var60 = tI0[var49];
               float var155 = var14[var36 + 9] * var60[0];
               var155 = var14[var36 + 8] * var60[1] + var155;
               var155 = var14[var36 + 7] * var60[2] + var155;
               var155 = var14[var36 + 6] * var60[3] + var155;
               var155 = var14[var36 + 5] * var60[4] + var155;
               var155 = var14[var36 + 4] * var60[5] + var155;
               var155 = var14[var36 + 3] * var60[6] + var155;
               var155 = var14[var36 + 2] * var60[7] + var155;
               var155 = var14[var36 + 1] * var60[8] + var155;
               var155 = var14[var36] * var60[9] + var155;
               var155 = var14[var36 + 15] * var60[10] + var155;
               var155 = var14[var36 + 14] * var60[11] + var155;
               var155 = var14[var36 + 13] * var60[12] + var155;
               var155 = var14[var36 + 12] * var60[13] + var155;
               var155 = var14[var36 + 11] * var60[14] + var155;
               var25[var49] = (var14[var36 + 10] * var60[15] + var155) * this.Ld;
               var36 += 16;
            }
            break;
         case 10:
            float[] var13 = this.Qp0;
            float[] var24 = this.ZK;
            int var35 = 0;

            for(int var48 = 0; var48 < 32; ++var48) {
               float[] var59 = tI0[var48];
               float var140 = var13[var35 + 10] * var59[0];
               var140 = var13[var35 + 9] * var59[1] + var140;
               var140 = var13[var35 + 8] * var59[2] + var140;
               var140 = var13[var35 + 7] * var59[3] + var140;
               var140 = var13[var35 + 6] * var59[4] + var140;
               var140 = var13[var35 + 5] * var59[5] + var140;
               var140 = var13[var35 + 4] * var59[6] + var140;
               var140 = var13[var35 + 3] * var59[7] + var140;
               var140 = var13[var35 + 2] * var59[8] + var140;
               var140 = var13[var35 + 1] * var59[9] + var140;
               var140 = var13[var35] * var59[10] + var140;
               var140 = var13[var35 + 15] * var59[11] + var140;
               var140 = var13[var35 + 14] * var59[12] + var140;
               var140 = var13[var35 + 13] * var59[13] + var140;
               var140 = var13[var35 + 12] * var59[14] + var140;
               var24[var48] = (var13[var35 + 11] * var59[15] + var140) * this.Ld;
               var35 += 16;
            }
            break;
         case 11:
            float[] var12 = this.Qp0;
            float[] var23 = this.ZK;
            int var34 = 0;

            for(int var47 = 0; var47 < 32; ++var47) {
               float[] var58 = tI0[var47];
               float var125 = var12[var34 + 11] * var58[0];
               var125 = var12[var34 + 10] * var58[1] + var125;
               var125 = var12[var34 + 9] * var58[2] + var125;
               var125 = var12[var34 + 8] * var58[3] + var125;
               var125 = var12[var34 + 7] * var58[4] + var125;
               var125 = var12[var34 + 6] * var58[5] + var125;
               var125 = var12[var34 + 5] * var58[6] + var125;
               var125 = var12[var34 + 4] * var58[7] + var125;
               var125 = var12[var34 + 3] * var58[8] + var125;
               var125 = var12[var34 + 2] * var58[9] + var125;
               var125 = var12[var34 + 1] * var58[10] + var125;
               var125 = var12[var34] * var58[11] + var125;
               var125 = var12[var34 + 15] * var58[12] + var125;
               var125 = var12[var34 + 14] * var58[13] + var125;
               var125 = var12[var34 + 13] * var58[14] + var125;
               var23[var47] = (var12[var34 + 12] * var58[15] + var125) * this.Ld;
               var34 += 16;
            }
            break;
         case 12:
            float[] var11 = this.Qp0;
            float[] var22 = this.ZK;
            int var33 = 0;

            for(int var46 = 0; var46 < 32; ++var46) {
               float[] var57 = tI0[var46];
               float var110 = var11[var33 + 12] * var57[0];
               var110 = var11[var33 + 11] * var57[1] + var110;
               var110 = var11[var33 + 10] * var57[2] + var110;
               var110 = var11[var33 + 9] * var57[3] + var110;
               var110 = var11[var33 + 8] * var57[4] + var110;
               var110 = var11[var33 + 7] * var57[5] + var110;
               var110 = var11[var33 + 6] * var57[6] + var110;
               var110 = var11[var33 + 5] * var57[7] + var110;
               var110 = var11[var33 + 4] * var57[8] + var110;
               var110 = var11[var33 + 3] * var57[9] + var110;
               var110 = var11[var33 + 2] * var57[10] + var110;
               var110 = var11[var33 + 1] * var57[11] + var110;
               var110 = var11[var33] * var57[12] + var110;
               var110 = var11[var33 + 15] * var57[13] + var110;
               var110 = var11[var33 + 14] * var57[14] + var110;
               var22[var46] = (var11[var33 + 13] * var57[15] + var110) * this.Ld;
               var33 += 16;
            }
            break;
         case 13:
            float[] var10 = this.Qp0;
            float[] var21 = this.ZK;
            int var32 = 0;

            for(int var45 = 0; var45 < 32; ++var45) {
               float[] var56 = tI0[var45];
               float var95 = var10[var32 + 13] * var56[0];
               var95 = var10[var32 + 12] * var56[1] + var95;
               var95 = var10[var32 + 11] * var56[2] + var95;
               var95 = var10[var32 + 10] * var56[3] + var95;
               var95 = var10[var32 + 9] * var56[4] + var95;
               var95 = var10[var32 + 8] * var56[5] + var95;
               var95 = var10[var32 + 7] * var56[6] + var95;
               var95 = var10[var32 + 6] * var56[7] + var95;
               var95 = var10[var32 + 5] * var56[8] + var95;
               var95 = var10[var32 + 4] * var56[9] + var95;
               var95 = var10[var32 + 3] * var56[10] + var95;
               var95 = var10[var32 + 2] * var56[11] + var95;
               var95 = var10[var32 + 1] * var56[12] + var95;
               var95 = var10[var32] * var56[13] + var95;
               var95 = var10[var32 + 15] * var56[14] + var95;
               var21[var45] = (var10[var32 + 14] * var56[15] + var95) * this.Ld;
               var32 += 16;
            }
            break;
         case 14:
            float[] var9 = this.Qp0;
            float[] var20 = this.ZK;
            int var31 = 0;

            for(int var44 = 0; var44 < 32; ++var44) {
               float[] var55 = tI0[var44];
               float var80 = var9[var31 + 14] * var55[0];
               var80 = var9[var31 + 13] * var55[1] + var80;
               var80 = var9[var31 + 12] * var55[2] + var80;
               var80 = var9[var31 + 11] * var55[3] + var80;
               var80 = var9[var31 + 10] * var55[4] + var80;
               var80 = var9[var31 + 9] * var55[5] + var80;
               var80 = var9[var31 + 8] * var55[6] + var80;
               var80 = var9[var31 + 7] * var55[7] + var80;
               var80 = var9[var31 + 6] * var55[8] + var80;
               var80 = var9[var31 + 5] * var55[9] + var80;
               var80 = var9[var31 + 4] * var55[10] + var80;
               var80 = var9[var31 + 3] * var55[11] + var80;
               var80 = var9[var31 + 2] * var55[12] + var80;
               var80 = var9[var31 + 1] * var55[13] + var80;
               var80 = var9[var31] * var55[14] + var80;
               var20[var44] = (var9[var31 + 15] * var55[15] + var80) * this.Ld;
               var31 += 16;
            }
            break;
         case 15:
            float[] var2 = this.Qp0;
            float[] var3 = this.ZK;
            int var4 = 0;

            for(int var5 = 0; var5 < 32; ++var5) {
               float[] var6 = tI0[var5];
               float var7 = var2[var4 + 15] * var6[0];
               var7 = var2[var4 + 14] * var6[1] + var7;
               var7 = var2[var4 + 13] * var6[2] + var7;
               var7 = var2[var4 + 12] * var6[3] + var7;
               var7 = var2[var4 + 11] * var6[4] + var7;
               var7 = var2[var4 + 10] * var6[5] + var7;
               var7 = var2[var4 + 9] * var6[6] + var7;
               var7 = var2[var4 + 8] * var6[7] + var7;
               var7 = var2[var4 + 7] * var6[8] + var7;
               var7 = var2[var4 + 6] * var6[9] + var7;
               var7 = var2[var4 + 5] * var6[10] + var7;
               var7 = var2[var4 + 4] * var6[11] + var7;
               var7 = var2[var4 + 3] * var6[12] + var7;
               var7 = var2[var4 + 2] * var6[13] + var7;
               var7 = var2[var4 + 1] * var6[14] + var7;
               var3[var5] = (var2[var4] * var6[15] + var7) * this.Ld;
               var4 += 16;
            }
      }

      if (var1 != null) {
         int var19 = this.bc0;
         float[] var8 = this.ZK;

         int var231;
         int[] var10000;
         for(int var30 = 0; var30 < 32; var10000[var19] = var1.mH * 2 + var231) {
            float var41;
            short var42;
            if ((var41 = var8[var30++]) > 32767.0F) {
               var42 = 32767;
            } else if (var41 < -32768.0F) {
               var42 = Short.MIN_VALUE;
            } else {
               var42 = (short)((int)var41);
            }

            byte var43 = (byte)(var42 & 255);
            byte var54 = (byte)(var42 >>> 8 & 255);
            byte[] var65 = var1.qo0;
            int[] var230;
            var10000 = var230 = var1.wH0;
            int var10004 = var231 = var230[var19];
            var65[var231] = var43;
            var65[var10004 + 1] = var54;
         }
      }

   }
}
