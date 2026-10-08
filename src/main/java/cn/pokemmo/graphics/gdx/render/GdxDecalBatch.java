package cn.pokemmo.graphics.gdx.render;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;

public class GdxDecalBatch {
   public static final C8 g4 = new C8();
   public final VC RJ;
   public final VC nq0;
   public final VC S50;
   public final VC vw0;
   public final Color vv;
   public sa_0 RE0;
   public final UJ0 qh;
   public final BB A00;
   public int nF0;
   public int mg0;
   public int xv;
   public int kg;
   public int vu;
   public int Am;
   public int Fw;
   public int Iy0;
   public int yL0;
   public int DU;
   public int Gs0;
   public int l60;
   public U30 k;
   public final es_1 zH0;
   public final Color rv0;
   public boolean mB;
   public int NP;
   public float RP;
   public float MC;
   public float ek0;
   public float bH;
   public boolean CE;
   public float[] V80;
   public boolean sF0;
   public final Matrix4 vU;
   public final i00_0 yz;
   public final ly0_0 Pj;
   public int lx;
   public final C8 yI0;

   public GdxDecalBatch() {
      VC var1;
      var1 = new VC();
      this.RJ = var1;
      var1 = new VC();
      this.nq0 = var1;
      var1 = new VC();
      this.S50 = var1;
      var1 = new VC();
      this.vw0 = var1;
      Color var5;
      var5 = new Color();
      this.vv = var5;
      UJ0 var6;
      var6 = new UJ0();
      this.qh = var6;
      BB var7;
      var7 = new BB();
      this.A00 = var7;
      es_1 var8;
      var8 = new es_1();
      this.zH0 = var8;
      Color var9;
      var9 = new Color(Color.WHITE);
      this.rv0 = var9;
      this.mB = false;
      this.RP = 0.0F;
      this.MC = 1.0F;
      this.ek0 = 0.0F;
      this.bH = 1.0F;
      this.CE = false;
      this.sF0 = false;
      Matrix4 var10;
      var10 = new Matrix4();
      this.vU = var10;
      i00_0 var11;
      var11 = new i00_0();
      this.yz = var11;
      ly0_0 var12;
      var12 = new ly0_0();
      this.Pj = var12;
      this.lx = -1;
      C8 var13;
      var13 = new C8();
      this.yI0 = var13;
   }

   static {
      new BB();
      new UJ0();
   }

   public static final void ON(float[] var0, int var1, i00_0 var2) {
      C8 var3;
      C8 var10001 = var3 = g4;
      float var5 = var0[var1];
      int var7;
      float var8 = var0[var7 = var1 + 1];
      int var6;
      float var4 = var0[var6 = var1 + 2];
      var3.x = var5;
      var3.y = var8;
      var3.z = var4;
      var3.Lf0(var2).KM();
      var0[var1] = var3.x;
      var0[var7] = var3.y;
      var0[var6] = var10001.z;
   }

   public final void Xa0() {
      U30 var1 = this.k;
      if (this.k != null) {
         ly0_0 var3 = this.Pj;
         var1.T4.np(var3.Xm0);
         ly0_0 var4 = this.Pj;
         this.k.Y7.np(var4.ec0).Fg0(0.5F);
         this.k.ep0 = this.k.Y7.Am0();
         this.Pj.br();
         U30 var10002 = this.k;
         int var2;
         this.k.d30 = var2 = this.xv;
         int var5;
         var10002.I8 = (var5 = this.A00.Sd0) - var2;
         this.xv = var5;
         this.k = null;
      }
   }

   public final void WZ(Matrix4 var1) {
      boolean var2;
      if (var1 != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.sF0 = var2;
      if (var2) {
         Matrix4 var10001 = this.vU;
         this.vU.getClass();
         var10001.Dd0(var1.EW);
         this.yz.T4(var1).aM().Se0();
      } else {
         this.vU.F();
         this.yz.j6();
      }
   }

   public final void Pm(int var1) {
      int var2 = this.NP;
      int var3;
      GdxDecalBatch var10000;
      if (this.NP == 0) {
         var10000 = this;
         var3 = var1 * 4;
      } else if (var2 == 1) {
         var10000 = this;
         var3 = var1 * 8;
      } else {
         var10000 = this;
         var3 = var1 * 6;
      }

      var10000.A00.Wf(var3);
   }

   public final short ek0(VC var1) {
      C8 var2;
      if (var1.Qj) {
         var2 = var1.Bv;
      } else {
         var2 = null;
      }

      C8 var3;
      if (var1.Lpt9) {
         var3 = var1.t3;
      } else {
         var3 = null;
      }

      Color var4;
      if (var1.OF0) {
         var4 = var1.z20;
      } else {
         var4 = null;
      }

      Bp0 var9;
      if (var1.CT) {
         var9 = var1.Lb;
      } else {
         var9 = null;
      }

      if (this.mg0 <= 65535) {
         float[] var5 = this.V80;
         int var6 = this.kg;
         this.V80[var6] = var2.x;
         int var7 = this.vu;
         if (this.vu > 1) {
            int var8 = var6 + 1;
            var5[var8] = var2.y;
         }

         if (var7 > 2) {
            int var54 = var6 + 2;
            var5[var54] = var2.z;
         }

         if (this.Am >= 0) {
            if (var3 == null) {
               C8 var68 = this.yI0;
               C8 var10001 = this.yI0;
               C8 var10002 = this.yI0;
               C8 var10003 = var3 = this.yI0;
               var3.getClass();
               float var29 = var2.x;
               float var40 = var2.y;
               float var55 = var2.z;
               var10003.x = var29;
               var10002.y = var40;
               var10001.z = var55;
               var3 = var68.KM();
            }

            float[] var30 = this.V80;
            int var31 = this.Am;
            var30[var31] = var3.x;
            int var41 = var31 + 1;
            var30[var41] = var3.y;
            int var32 = var31 + 2;
            this.V80[var32] = var3.z;
         }

         int var33 = this.yL0;
         if (this.yL0 >= 0) {
            if (var4 == null) {
               var4 = Color.WHITE;
            }

            float[] var42 = this.V80;
            var42[var33] = var4.r;
            int var56 = var33 + 1;
            var42[var56] = var4.g;
            int var57 = var33 + 2;
            this.V80[var57] = var4.b;
            if (this.DU > 3) {
               int var34 = var33 + 3;
               var42[var34] = var4.a;
            }
         } else {
            int var35 = this.Gs0;
            if (this.Gs0 > 0) {
               if (var4 == null) {
                  var4 = Color.WHITE;
               }

               this.V80[var35] = var4.toFloatBits();
            }
         }

         if (var9 != null) {
            int var36 = this.l60;
            if (this.l60 >= 0) {
               this.V80[var36] = var9.x;
               int var10 = var36 + 1;
               this.V80[var10] = var9.y;
            }
         }

         float[] var11 = this.V80;
         byte var37 = 0;
         int var38 = this.qh.Or;
         this.qh.KN(var37, this.nF0, var11);
         int var12 = this.mg0++;
         this.lx = var12;
         if (this.sF0) {
            float[] var13 = this.qh.iS;
            int var43 = var38 + this.kg;
            int var48 = this.vu;
            Matrix4 var58 = this.vU;
            if (this.vu > 2) {
               C8 var49;
               C8 var75 = var49 = g4;
               float var14 = var13[var43];
               int var50;
               float var62 = var13[var50 = var43 + 1];
               float var67 = var13[var7 = var43 + 2];
               var49.x = var14;
               var49.y = var62;
               var49.z = var67;
               var49.cu(var58);
               var13[var43] = var49.x;
               var13[var50] = var49.y;
               var13[var7] = var75.z;
            } else if (var48 > 1) {
               C8 var76 = g4;
               C8 var84 = g4;
               C8 var87 = g4;
               C8 var90 = g4;
               C8 var93 = g4;
               float var15 = var13[var43];
               int var51;
               float var63 = var13[var51 = var43 + 1];
               float var66 = 0.0F;
               g4.x = var15;
               var93.y = var63;
               var90.z = var66;
               var87.cu(var58);
               var13[var43] = var84.x;
               var13[var51] = var76.y;
            } else {
               C8 var81 = g4;
               C8 var88 = g4;
               C8 var91 = g4;
               float var94 = var13[var43];
               float var16 = 0.0F;
               float var44 = 0.0F;
               g4.x = var94;
               var91.y = var16;
               var88.z = var44;
               var13[var43] = var81.cu(var58).x;
            }

            int var17 = this.Am;
            if (this.Am >= 0) {
               ON(this.qh.iS, var38 + var17, this.yz);
            }

            int var18 = this.Fw;
            if (this.Fw >= 0) {
               ON(this.qh.iS, var38 + var18, this.yz);
            }

            int var19 = this.Iy0;
            if (this.Iy0 >= 0) {
               ON(this.qh.iS, var38 + var19, this.yz);
            }
         }

         float[] var20 = this.qh.iS;
         int var45;
         float var52 = this.qh.iS[var45 = var38 + this.kg];
         int var59 = this.vu;
         float var64;
         if (this.vu > 1) {
            var64 = var20[var45 + 1];
         } else {
            var64 = 0.0F;
         }

         float var21;
         if (var59 > 2) {
            var21 = var20[var45 + 2];
         } else {
            var21 = 0.0F;
         }

         this.Pj.CoM9(var52, var64, var21);
         if (this.mB) {
            int var22 = this.yL0;
            if (this.yL0 >= 0) {
               float[] var46 = this.qh.iS;
               int var23;
               float var92 = this.qh.iS[var23 = var38 + var22];
               var4 = this.rv0;
               this.qh.iS[var23] = var92 * this.rv0.r;
               int var60;
               this.qh.iS[var59] = this.qh.iS[var60 = var23 + 1] * var4.g;
               int var61;
               this.qh.iS[var60] = this.qh.iS[var61 = var23 + 2] * var4.b;
               if (this.DU > 3) {
                  int var24;
                  var46[var23] = var46[var24 = var23 + 3] * var4.a;
               }
            } else {
               int var25 = this.Gs0;
               if (this.Gs0 >= 0) {
                  Color.abgr8888ToColor(this.vv, this.qh.iS[var38 + var25]);
                  this.qh.iS[var38 + this.Gs0] = this.vv.mul(this.rv0).toFloatBits();
               }
            }
         }

         if (this.CE) {
            int var26 = this.l60;
            if (this.l60 >= 0) {
               float[] var47 = this.qh.iS;
               int var27;
               this.qh.iS[var27 = var38 + var26] = this.MC * var47[var27] + this.RP;
               this.qh.iS[++var27] = this.bH * var47[var27] + this.ek0;
            }
         }

         return (short)this.lx;
      } else {
         throw new nf_1("Too many vertices used");
      }
   }

   public final void Zh0(short var1, short var2, short var3) {
      int var4 = this.NP;
      if (this.NP != 4 && var4 != 0) {
         if (var4 != 1) {
            throw new nf_1("Incorrect primitive type");
         }

         byte var6 = 6;
         this.A00.Wf(var6);
         this.A00.e80(var1);
         this.A00.e80(var2);
         this.A00.e80(var2);
         this.A00.e80(var3);
         this.A00.e80(var3);
         this.A00.e80(var1);
      } else {
         byte var5 = 3;
         this.A00.Wf(var5);
         this.A00.e80(var1);
         this.A00.e80(var2);
         this.A00.e80(var3);
      }
   }

   public final void Ix(short var1, short var2, short var3, short var4) {
      int var5 = this.NP;
      if (this.NP == 4) {
         this.A00.Wf(6);
         this.A00.e80(var1);
         this.A00.e80(var2);
         this.A00.e80(var3);
         this.A00.e80(var3);
         this.A00.e80(var4);
         this.A00.e80(var1);
      } else if (var5 == 1) {
         this.A00.Wf(8);
         this.A00.e80(var1);
         this.A00.e80(var2);
         this.A00.e80(var2);
         this.A00.e80(var3);
         this.A00.e80(var3);
         this.A00.e80(var4);
         this.A00.e80(var4);
         this.A00.e80(var1);
      } else {
         if (var5 != 0) {
            throw new nf_1("Incorrect primitive type");
         }

         this.A00.Wf(4);
         this.A00.e80(var1);
         this.A00.e80(var2);
         this.A00.e80(var3);
         this.A00.e80(var4);
      }
   }

   public final void MK0(C8 var1, C8 var2, C8 var3, C8 var4, C8 var5) {
      VC var10005 = this.RJ.kf0(var1, var5).p70(0.0F, 1.0F);
      VC var7 = this.nq0.kf0(var2, var5).p70(1.0F, 1.0F);
      VC var9 = this.S50.kf0(var3, var5).p70(1.0F, 0.0F);
      VC var11 = this.vw0.kf0(var4, var5).p70(0.0F, 0.0F);
      byte var13 = 4;
      this.qh.bD(this.nF0 * var13);
      short var6 = this.ek0(var10005);
      short var8 = this.ek0(var7);
      short var10 = this.ek0(var9);
      short var12 = this.ek0(var11);
      this.Ix(var6, var8, var10, var12);
   }

   public final void XB0() {
      this.CE = false;
      this.ek0 = 0.0F;
      this.RP = 0.0F;
      this.bH = 1.0F;
      this.MC = 1.0F;
   }
}


