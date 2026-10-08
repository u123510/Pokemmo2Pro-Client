package cn.pokemmo.graphics.gdx.render;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.math.Matrix4;

public class GdxMapEnvironmentRenderer extends L00 {
   public yu_0 R6;
   public wc_2 Ht0;

   public GdxMapEnvironmentRenderer() {
      super(null);
   }

   @Override
   public final void MJ0() {
      super.MJ0();
      JA var3 = new JA(bn0_0.DK0(), bn0_0.Rn0(), null);
      var3.HA = 1;
      var3.F80 = 1;
      var3.el = 32;
      super.ns0 = new ER(new bn0_0(var3, null), new FG());
   }

   @Override
   public final void ql0() {
      super.ql0();
      wc_2 var1 = this.Ht0;
      if (this.Ht0 != null) {
         float var2 = super.sJ;
         rj0_2 var3 = super.DP;
         if (super.DP == null) {
            var3 = super.k1;
         }

         I2 var5 = var1.kl0.ZD();

         while (var5.hasNext()) {
            pc0_0 var10000 = (pc0_0)var5.next();
            var10000.P30(var2, var3);
            I2 var6 = var10000.Gh.ZD();

            while (var6.hasNext()) {
               sf_1 var4;
               if ((var4 = (sf_1)var6.next()).HJ0() != null) {
                  var4.HJ0().P30(var2, var3);
               }
            }
         }
      }
   }

   @Override
   public final void Xf0() {
      yu_0 var9 = null;
      yt_1 var1 = tw0_0.e60;
      if (tw0_0.e60 != null && var1.jB0 != null && tw0_0.rl.NA && tw0_0.e60.N60() instanceof yu_0) {
         label161: {
            super.Xf0();
            var9 = (yu_0)tw0_0.e60.N60();
            E90 var2 = tw0_0.e60.jB0;
            float var3 = super.qh.r;
            float var4 = super.qh.g;
            float var5 = super.qh.b;
            float var6 = super.qh.a;
            lg_0.OH0.glClearColor(var3, var4, var5, var6);
            lg_0.OH0.glClear(16640);
            C8 var10000;
            C8 var10001;
            if (super.COM4 != null) {
               var10000 = vo_2.ez.np(super.uZ.v40);
               var10001 = super.uZ.rj;
            } else {
               if (var2 == null) {
                  break label161;
               }

               af0_0.SS.bk();
               BJ0 var22 = super.uZ;
               this.Be(var2, var22, true);
               if (super.kp0) {
                  var10000 = vo_2.ez.np(super.RX.v40);
                  var10001 = super.RX.rj;
               } else {
                  var10000 = vo_2.ez.np(super.uZ.v40);
                  var10001 = super.uZ.rj;
               }
            }

            var3 = var10001.x;
            var4 = var10001.y;
            var5 = var10001.z;
            var10000.Vy(var3, var4, var5);
         }

         if (var9 != null) {
            yu_0 var11 = this.R6;
            if (this.R6 == null || var11 != var9) {
               wc_2 var12 = this.Ht0;
               if (this.Ht0 != null) {
                  var12.dispose();
               }

               c8_0.JD0.vt0.ar = 0L;
               this.R6 = var9;
                wc_2 var13 = new wc_2(new W70());
               this.Ht0 = var13;
               String var14 = "./data/maps/" + var9.Bm0 + ".pm3d";
               lg_0.I70.getClass();
                var13.Con(new VE(var14, zv_1.kE), null);
               if (var9.Bm0 == 1) {
                  pc0_0 var15;
                  BM var24;
                  BM var45 = var24 = (BM)(var15 = (pc0_0)this.Ht0.kl0.KI()).Y3.get(0);
                  long var32 = mz_2.g7;
                  B90 var46 = ((mz_2)var45.sg(mz_2.g7)).I3;
                  Texture var52 = (Texture)((mz_2)var24.sg(var32)).I3.uj;
                  a00_0 var25 = a00_0.xm0;
                  var52.setWrap(a00_0.xm0, a00_0.xm0);
                  var46.Td0(var52, eb0_1.Y30, eb0_1.Y30, var25, var25);
                  short var26 = 1000;
                  float[] var33 = new float[1000];

                  for (int var37 = 0; var37 < 400; var37++) {
                     var33[var37] = by_0.dt.F0(var37 / 400.0F) + -0.2F;
                  }

                  for (int var38 = 400; var38 < var26; var38++) {
                     var33[var38] = 0.8F;
                  }

                  XR[] var16 = XR.Rv(var26, var33, null, null, null);
                  var15.Ru0("logo_loop", ((BM)var15.Y3.get(0)).mi, 0.02F, var16, true);
               }

               I2 var17 = this.Ht0.kl0.ZD();

               while (var17.hasNext()) {
                  pc0_0 var27;
                  C8 var34;
                  C8 var48 = var34 = (var27 = (pc0_0)var17.next()).dk.jG0;
                  Matrix4 var54 = var27.ho;
                  float var39 = 0.25F;
                  float var43 = 0.25F;
                  float var7 = 0.25F;
                  var27.ho.F();
                  var54.EW[0] = var39;
                  var54.EW[5] = var43;
                  var54.EW[10] = var7;
                  if ((var39 = var48.x) < 0.0F || var34.z < 0.0F) {
                     var27.ho.el0(-var39, 0.0F, -var34.z);
                  }

                  I2 var28 = var27.Gh.ZD();

                  while (var28.hasNext()) {
                     ((sf_1)var28.next()).Sy0();
                  }
               }

               mk_1.NU.Sq0();
               I2 var18 = super.qf.ZD();

               while (var18.hasNext()) {
                  ((nv0_0)var18.next()).dispose();
               }

               super.qf.clear();
               super.e0 = -1;
               super.hq = -1;
               if (tw0_0.PK0 == null && tw0_0.LD0.hO == null) {
                  tw0_0.RE0.Eh(var9.dw, (short)0, true, false);
               }

               vo_2.z0 = var9.lm0.AK && J4.p5(var9.Bm0, var9.case$) != 249;
               tw0_0.lM.BO();
            }
         }

         super.ns0.jK(this.cV());
         this.NC();
         wc_2 var19 = this.Ht0;
         if (this.Ht0 != null) {
            ER var20 = super.ns0;
            U5 var29 = super.Y;
            I2 var35 = var19.kl0.ZD();

            while (var35.hasNext()) {
               pc0_0 var41;
               var20.Lh0(var41 = (pc0_0)var35.next(), var29);
               I2 var42 = var41.Gh.ZD();

               while (var42.hasNext()) {
                  sf_1 var44;
                  if ((var44 = (sf_1)var42.next()).HJ0() != null) {
                     var20.Lh0(var44.HJ0(), var29);
                  }
               }
            }
         }

         this.h9(var9);
         super.YG0.begin();
         super.YG0.I2();
         super.YG0.me0();
         super.YG0.end();
         super.ns0.eo0(super.YG0);
         if (var9 != null && (var9.pG != tW.cH || var9.Z10) && tw0_0.rl.c50 != 7) {
            super.VJ0.np(super.uZ.rj);
            super.VJ0.y += 0.125F;
            if (super.qH < 1.0F) {
               super.qH = 1.0F;
            }

            if (super.qH > 5.0F) {
               super.qH = 5.0F;
            }

            super.a1.ho.F();
            C8 var10 = super.uZ.rj;
            C8 var21 = super.uZ.v40;
            C8 var30 = super.uZ.St0;
            super.a1.ho.co(var10, var21, var30);
            super.a1.ho.Y1(super.VJ0);
            super.a1.ho.tO(C8.X, 90.0F);
            super.a1.ho.w2(super.qH * 1.2F, super.qH * 1.2F, super.qH * 1.2F);
            super.ns0.vL();
            super.ns0.eo0(super.a1);
         }

         super.ns0.end();
         tw0_0.lM.getClass();
         if (!super.fX) {
            BR var8 = tw0_0.rl;
            if (tw0_0.rl.Sy) {
               var8.Sy = false;
               E90 var50 = tw0_0.e60.jB0;
               tw0_0.e60.jB0.L8.Np0 = false;
               var50.il0.LE(nk_0.Nw);
            } else {
               var8.kg0();
            }

            nf_0.zo0().w30(500, false);
         }
      }
   }

   @Override
   public final void Be(E90 var1, BJ0 var2, boolean var3) {
      C8 var9 = var1.il0.t60;
      if (super.KR) {
         if (super.Ej == null) {
            super.Ej = var9;
         }

         var9 = super.Ej;
      }

      C8 var10001 = super.sC;
      C8 var10002 = super.sC;
      C8 var10003 = super.sC;
      float var10 = var9.x;
      float var4 = var9.z;
      float var5 = var9.y;
      super.sC.x = var10;
      var10003.y = var4;
      var10002.z = var5;
      var10001.Fg0(0.25F);
      C8 var11 = super.sC;
      af0_0 var15 = af0_0.SS;
      int var21 = af0_0.SS.Lu0;
      var5 = (af0_0.SS.Lu0 % 2 == 0 ? var15.fq0 : -var15.fq0) * 0.02F;
      float var6 = 0.0F;
      var4 = var21 % 2 == 0 ? var15.mr : -var15.mr;
      var11.Vy(var5, var6, var4 * 0.02F);
      var10001 = super.sC;
      com6__1 var30 = com6__1.WI0;
      float var12 = com6__1.WI0.xf();
      var4 = 0.0F;
      var5 = var30.Um0();
      var10001.na(var12, var4, var5);
      var2.Wu0 = 0.5F;
      float var13 = 100.0F;
      if (!super.fX || super.K60 == null) {
         var2.Qy = var13;
      }

      var4 = var2.Qy;
      if (var2.Qy != var13) {
         if (var4 > var13) {
            var2.Qy = Math.max(var4 - lg_0.S4.uL * 15.0F, var13);
         } else {
            var2.Qy = Math.min(lg_0.S4.uL * 15.0F + var4, var13);
         }
      }

      yu_0 var28 = (yu_0)tw0_0.e60.N60();
      zv_2 var7 = var1.ba0;
      if (dw_2.z2 && LW.LH0(var2.zo0, 25.0F)) {
         var2.zo0 = 17.5F;
      } else if (!dw_2.z2 && !LW.LH0(var2.zo0, 25.0F)) {
         var2.zo0 = 25.0F;
      }

      float var14 = 0.0F;
      if (!super.fX) {
         var2.zo0 = 25.0F;
         var2.Rg0 = 7.5F;
         var2.Q30 = -56.0F;
         var2.d00 = 0.0F;
      }

      var2.Q30 = -56.0F;
      var2.zo0 = 35.0F;
      var2.Rg0 = 7.5F;
      LT var19;
      if ((var19 = var7.LPt1()) != null && var7.o0 == 1 && var19.Tz() >= 27 && var19.Tz() <= 29 && var19.HR() >= 32 && var19.HR() <= 53) {
         var2.Q30 = -10.0F;
         var2.Rg0 = 4.5F;
      }

      float var8 = super.sC.x;
      var4 = super.sC.y;
      var5 = super.sC.z;
      var2.nz0(var8, var4, var5, 0.0F, var14, 0.0F);
      var2.ye(true);
      if (super.kp0) {
         BJ0 var25 = super.RX;
         BJ0 var29 = super.RX;
         super.RX.Qy = 1000.0F;
         var29.Wu0 = 0.1F;
         var25.zo0 = var2.zo0;
      }
   }

   @Override
   public final void mH(_else var1) {
      if (!super.fX) {
         rj0_2 var7;
         if (var1.lm0 == gh_0.wZ) {
            byte var2 = 39;
            var7 = tw0_0.Ll0.Qz0.Oq0.Vo0[var2].bB();
         } else {
            var7 = new rj0_2(
               new Color(-1112031745),
               new Color(1936946175),
               Color.BLACK.cpy(),
               new Color(269509375),
               Color.WHITE.cpy(),
               new C8(-0.14440918F, -0.8474426F, -0.0038757324F)
            );
         }

         super.k1 = var7;
         this.mD0();
      }

      if (super.vn0) {
         this.cu0(var1.Jo0, super.fX ^ true);
      }

      this.Wh0();
      if (!super.fX) {
         this.mD0();
      }
   }

   @Override
   public final void cu0(s4_0 var1, boolean var2) {
      if (!lpt3__1.oq0 && (lpt3__1.RJ || tw0_0.Eu(8)) || !super.vn0) {
         var1 = s4_0.rP;
      }

      if (super.Bu0 != null && var2 || var1 == null || super.XF != var1) {
         super.YG0.aUX();
         super.Bu0 = null;
      }

      super.XF = var1;
      if (super.Bu0 == null && var1 != null) {
         int var3;
         if ((var3 = var1.ordinal()) != 3) {
            if (var3 != 5) {
               if (var3 != 7) {
                  if (var3 == 13) {
                     (super.Bu0 = super.YG0.UH0("weather/heavy_rain")).start();
                     super.YG0.fY(super.Bu0);
                     ParticleEffectExt var4 = super.YG0.UH0("weather/thunder");
                     super.Fg = var4;
                     super.YG0.fY(var4);
                     return;
                  }

                  if (var3 != 17) {
                     return;
                  }
               }

               (super.Bu0 = super.YG0.UH0("weather/snow")).start();
               super.YG0.fY(super.Bu0);
            } else {
               (super.Bu0 = super.YG0.UH0("weather/rain")).start();
               super.YG0.fY(super.Bu0);
               ParticleEffectExt var5 = super.YG0.UH0("weather/thunder");
               super.Fg = var5;
               super.YG0.fY(var5);
            }
         } else {
            (super.Bu0 = super.YG0.UH0("weather/rain")).start();
            super.YG0.fY(super.Bu0);
         }
      }
   }

   @Override
   public final void dispose() {
      super.dispose();
      wc_2 var1;
      if ((var1 = this.Ht0) != null) {
         var1.dispose();
      }
   }

   @Override
   public final boolean yp(byte var1) {
      return var1 == 10;
   }

   @Override
   public final void HF0() {
      super.uZ.zo0--;
   }

   @Override
   public final void uD0() {
      super.uZ.zo0++;
   }

   @Override
   public final void Yt(double var1) {
   }

   @Override
   public final void aN(float var1) {
      super.uZ.zo0 = var1;
   }

   @Override
   public final float Bc() {
      return 25.0F;
   }

   @Override
   public final void M9() {
      super.uZ.zo0 = 25.0F;
   }
}
