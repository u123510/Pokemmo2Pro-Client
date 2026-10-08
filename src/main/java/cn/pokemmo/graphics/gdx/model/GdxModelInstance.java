package cn.pokemmo.graphics.gdx.model;

import f.*;


import com.badlogic.gdx.math.Matrix4;

public class GdxModelInstance implements uh_1 {
   public final es_1 Y3;
   public final es_1 ZE0;
   public final es_1 HZ;
   public final ut_0 hW;
   public final Matrix4 ho;

   public GdxModelInstance(ut_0 var1) {
      this(var1, (String[])null);
   }

   public GdxModelInstance(ut_0 var1, String var2, boolean var3) {
      this(var1, null, var2, false, false, var3);
   }

   public GdxModelInstance(ut_0 var1, Matrix4 var2, String var3, boolean var4) {
      this(var1, var2, var3, false, false, var4);
   }

   public GdxModelInstance(ut_0 var1, String var2, boolean var3, boolean var4) {
      this(var1, null, var2, true, var3, var4);
   }

   public GdxModelInstance(ut_0 var1, Matrix4 var2, String var3, boolean var4, boolean var5) {
      this(var1, var2, var3, true, var4, var5);
   }

   public GdxModelInstance(ut_0 var1, String var2, boolean var3, boolean var4, boolean var5) {
      this(var1, null, var2, var3, var4, var5);
   }

   public GdxModelInstance(ut_0 var1, Matrix4 var2, String var3, boolean var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, true);
   }

   public GdxModelInstance(ut_0 var1, Matrix4 var2, String var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      es_1 var8;
      var8 = new es_1();
      this.Y3 = var8;
      var8 = new es_1();
      this.ZE0 = var8;
      es_1 var9;
      var9 = new es_1();
      this.HZ = var9;
      this.hW = var1;
      if (var2 == null) {
         var2 = new Matrix4();
      }

      this.ho = var2;
      Xz0 var10;
      Xz0 var12;
      var8.Ue0(var12 = (var10 = var1.rE(var3, var4)).wb0());
      if (var6) {
         Matrix4 var11;
         if (var5) {
            var11 = var10.TG0;
         } else {
            var11 = var10.TJ0;
         }

         var2.NG(var11);
         var12.BI0.mf0(0.0F, 0.0F, 0.0F);
         var12.RG.Rx0();
         var12.Fc0.mf0(1.0F, 1.0F, 1.0F);
      } else if (var5 && var12.Jg()) {
         var2.NG(var10.Ii0().TG0);
      }

      this.Ka();
      this.IQ(var1.AF, var7);
      this.a8();
   }

   public GdxModelInstance(ut_0 var1, String... var2) {
      this(var1, null, var2);
   }

   public GdxModelInstance(ut_0 var1, Matrix4 var2, String... var3) {
      es_1 var4;
      var4 = new es_1();
      this.Y3 = var4;
      var4 = new es_1();
      this.ZE0 = var4;
      var4 = new es_1();
      this.HZ = var4;
      this.hW = var1;
      if (var2 == null) {
         var2 = new Matrix4();
      }

      this.ho = var2;
      if (var3 == null) {
         this.ii0(var1.Wc0);
      } else {
         this.Zp0(var1.Wc0, var3);
      }

      this.IQ(var1.AF, true);
      this.a8();
   }

   public GdxModelInstance(ut_0 var1, es_1 var2) {
      this(var1, null, var2);
   }

   public GdxModelInstance(ut_0 var1, Matrix4 var2, es_1 var3) {
      this(var1, var2, var3, true);
   }

   public GdxModelInstance(ut_0 var1, Matrix4 var2, es_1 var3, boolean var4) {
      es_1 var5;
      var5 = new es_1();
      this.Y3 = var5;
      var5 = new es_1();
      this.ZE0 = var5;
      var5 = new es_1();
      this.HZ = var5;
      this.hW = var1;
      if (var2 == null) {
         var2 = new Matrix4();
      }

      this.ho = var2;
      this.YN(var1.Wc0, var3);
      this.IQ(var1.AF, var4);
      this.a8();
   }

   public GdxModelInstance(ut_0 var1, C8 var2) {
      this(var1);
      this.ho.IW(var2);
   }

   public GdxModelInstance(ut_0 var1, float var2, float var3, float var4) {
      this(var1);
      this.ho.Yp0(var2, var3, var4);
   }

   public GdxModelInstance(ut_0 var1, Matrix4 var2) {
      this(var1, var2, (String[])null);
   }

   public GdxModelInstance(GdxModelInstance var1) {
      this(var1, var1.ho.s7());
   }

   public GdxModelInstance(GdxModelInstance var1, Matrix4 var2) {
      this(var1, var2, true);
   }

   public GdxModelInstance(GdxModelInstance var1, Matrix4 var2, boolean var3) {
      this.Y3 = new es_1();
      this.ZE0 = new es_1();
      this.HZ = new es_1();
      this.hW = var1.hW;
      if (var2 == null) {
         var2 = new Matrix4();
      }

      this.ho = var2;
      this.ii0(var1.ZE0);
      this.IQ(var1.HZ, var3);
      this.a8();
   }

   public final void ii0(es_1 var1) {
      int var2 = 0;

      for (int var3 = var1.KB; var2 < var3; var2++) {
         Xz0 var4 = (Xz0)var1.get(var2);
         this.ZE0.Ue0(var4.wb0());
      }

      this.Ka();
   }

   public final void Zp0(es_1 var1, String... var2) {
      int var3 = 0;

      for (int var4 = var1.KB; var3 < var4; var3++) {
         Xz0 var5 = (Xz0)var1.get(var3);
         int var6 = var2.length;

         for (int var7 = 0; var7 < var6; var7++) {
            if (var2[var7].equals(var5.mw)) {
               this.ZE0.Ue0(var5.wb0());
               break;
            }
         }
      }

      this.Ka();
   }

   public final void YN(es_1 var1, es_1 var2) {
      int var3 = 0;

      for (int var4 = var1.KB; var3 < var4; var3++) {
         Xz0 var5 = (Xz0)var1.get(var3);
         I2 var6 = var2.ZD();

         while (var6.hasNext()) {
            if (((String)var6.next()).equals(var5.mw)) {
               this.ZE0.Ue0(var5.wb0());
               break;
            }
         }
      }

      this.Ka();
   }

   public final void xP(Xz0 var1) {
      int var2 = 0;

      for (int var3 = var1.sJ0.KB; var2 < var3; var2++) {
         I20 var4;
         cf_2 var5;
         if ((var5 = (var4 = (I20)var1.sJ0.get(var2)).RQ) != null) {
             for (int var6 = 0; var6 < var5.tb0; var6++) {
                Object[] var7 = var5.ev;
                var5.ev[var6] = this.Ve0(((Xz0)var7[var6]).mw, true);
             }
         }

         if (!this.Y3.j4(var4.jK0, true)) {
            int var11;
            if ((var11 = this.Y3.E8(var4.jK0, false)) < 0) {
               es_1 var10000 = this.Y3;
               BM var10 = var4.jK0;
               BM var12 = new BM(var10);
               var4.jK0 = var12;
               var10000.Ue0(var12);
            } else {
               var4.jK0 = (BM)this.Y3.get(var11);
            }
         }
      }

      var2 = 0;

      for (int var9 = var1.yn.KB; var2 < var9; var2++) {
         this.xP((Xz0)var1.yn.get(var2));
      }
   }

   @Override
   public final void getRenderables(es_1 var1, ju_0 var2) {
      I2 var3 = this.ZE0.ZD();

      while (var3.hasNext()) {
         this.z80((Xz0)var3.next(), var1, var2);
      }
   }

   public final void z80(Xz0 var1, es_1 var2, ju_0 var3) {
      es_1 var4 = var1.sJ0;
      if (var1.sJ0.KB > 0) {
         I2 var8 = var4.ZD();

         while (var8.hasNext()) {
            I20 var5;
            if ((var5 = (I20)var8.next()).eh) {
               W00 var6;
               label30: {
                  W00 var10001 = var6 = (W00)var3.obtain();
                  var10001.ly = var5.jK0;
                  var10001.VE0.l0(var5.d40);
                  if ((var6.lpt7 = var5.IC0) == null) {
                     Matrix4 var9 = this.ho;
                     if (this.ho != null) {
                        Matrix4 var12 = var6.eo0;
                        var6.eo0.getClass();
                        Matrix4 var11 = var12.Dd0(var9.EW);
                        Matrix4.md0(var11.EW, var1.TG0.EW);
                        break label30;
                     }
                  }

                  Matrix4 var10 = this.ho;
                  if (this.ho != null) {
                     Matrix4 var10000 = var6.eo0;
                     var6.eo0.getClass();
                     var10000.Dd0(var10.EW);
                  } else {
                     var6.eo0.F();
                  }
               }

               var6.Uz = null;
               var2.Ue0(var6);
            }
         }
      }

      I2 var7 = var1.yn.ZD();

      while (var7.hasNext()) {
         this.z80((Xz0)var7.next(), var2, var3);
      }
   }

   public final void a8() {
      int var1 = this.ZE0.KB;

      for (int var2 = 0; var2 < var1; var2++) {
         ((Xz0)this.ZE0.get(var2)).Z90();
      }

      for (int var3 = 0; var3 < var1; var3++) {
         ((Xz0)this.ZE0.get(var3)).pF0();
      }
   }

   public final BM ff0(String var1) {
      int var2 = this.Y3.KB;
      int var3 = 0;

      BM var4;
      while (true) {
         if (var3 >= var2) {
            var4 = null;
            break;
         }

         if ((var4 = (BM)this.Y3.get(var3)).mi.equalsIgnoreCase(var1)) {
            break;
         }

         var3++;
      }

      return var4;
   }

   public final Xz0 Yz(String var1) {
      return this.Ve0(var1, true);
   }

   public final Xz0 Ve0(String var1, boolean var2) {
      boolean var3 = true;
      return Xz0.ry0(this.ZE0, var1, var3);
   }

   public final void Ka() {
      int var1 = 0;

      for (int var2 = this.ZE0.KB; var1 < var2; var1++) {
         this.xP((Xz0)this.ZE0.get(var1));
      }
   }

   public final void IQ(es_1 var1, boolean var2) {
      I2 var9 = var1.ZD();

      while (var9.hasNext()) {
         ji0_2 var3;
         ji0_2 var10000 = var3 = (ji0_2)var9.next();
          ji0_2 var4 = new ji0_2();
          ji0_2 var10001 = var4;
         var4.Ys0 = var3.Ys0;
         var10001.Oj = var3.Oj;
         I2 var10 = var10000.jl.ZD();

         while (var10.hasNext()) {
            yg0_0 var5;
            Xz0 var6;
            if ((var6 = this.Ve0((var5 = (yg0_0)var10.next()).Cr.mw, true)) != null) {
                yg0_0 var7 = new yg0_0();
                var7.Cr = var6;
               if (var2) {
                  var7.TK = var5.TK;
                  var7.l = var5.l;
                  var7.HG = var5.HG;
               } else {
                  if (var5.TK != null) {
                     var7.TK = new es_1();
                     I2 var12 = var5.TK.ZD();

                     while (var12.hasNext()) {
                        li0_2 var8 = (li0_2)var12.next();
                        float var16 = var8.Ls0;
                        var7.TK.Ue0(new li0_2(var16, var8.Yo));
                     }
                  }

                  if (var5.l != null) {
                     var7.l = new es_1();
                     I2 var13 = var5.l.ZD();

                     while (var13.hasNext()) {
                        li0_2 var17 = (li0_2)var13.next();
                        float var18 = var17.Ls0;
                        var7.l.Ue0(new li0_2(var18, var17.Yo));
                     }
                  }

                  if (var5.HG != null) {
                     var7.HG = new es_1();
                     I2 var11 = var5.HG.ZD();

                     while (var11.hasNext()) {
                        li0_2 var14 = (li0_2)var11.next();
                        float var15 = var14.Ls0;
                        var7.HG.Ue0(new li0_2(var15, var14.Yo));
                     }
                  }
               }

               if (var7.TK != null || var7.l != null || var7.HG != null) {
                  var4.jl.Ue0(var7);
               }
            }
         }

         if (var4.jl.KB > 0) {
            this.HZ.Ue0(var4);
         }
      }
   }
}
