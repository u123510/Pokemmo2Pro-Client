package cn.pokemmo.rom.nds.hgss;

import f.*;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.graphics.g3d.particles.emitters.RegularEmitter;

public class HgssWorldMapManager extends L00 {
   public static final dl_1 qd0 = Cq0.E1(HgssWorldMapManager.class);
   public nv0_0[][] dD = null;
   public Pv0 Ku = null;
   public boolean YY;
   public rj0_2 wK0;

   public HgssWorldMapManager(UY var1) {
      super(var1);
   }

   public static boolean Xh0(XF0 var0) {
      if (!var0.Ro0.c40()) {
         short var1 = var0.i80.SM;
         if (var0.i80.SM != 56 && (var0.Ro0.tN & 255) != 202 && var1 != 27) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final void MJ0() {
      super.MJ0();
      super.XF = s4_0.OV;
      super.a30 = new cn0_0();
      String var2 = bn0_0.DK0();
      String var3 = bn0_0.Rn0();
      cn0_0 var4 = super.a30;
      JA var1 = new JA(var2, var3, var4);
      JA var10002 = var1;
      var10002.HA = 1;
      var10002.F80 = 5;
      var10002.el = 16;
      super.ns0 = new ER(new bn0_0(var1, super.a30), new FG());
      Color var10003 = new Color(-1112031745);
      Color var10004 = new Color(1936946175);
      Color var5 = Color.BLACK.cpy();
      Color var6;
      var6 = new Color(269509375);
      Color var7 = Color.WHITE.cpy();
      C8 var8;
      var8 = new C8(-0.14440918F, -0.8474426F, -0.0038757324F);
      this.wK0 = new rj0_2(var10003, var10004, var5, var6, var7, var8);
   }

   @Override
   public final boolean o7(byte var1, C8 var2, int var3, boolean var4, boolean var5, boolean var6) {
      boolean var7 = super.fX ^ true;
      yt_1 var8 = tw0_0.e60;
      if (tw0_0.e60 == null) {
         var7 = true;
      }

      label176: {
         if (!var7) {
            _else var28;
            if (!((var28 = var8.N60()) instanceof XF0)) {
               return true;
            }

            XF0 var29;
            if ((var29 = (XF0)var28) == null) {
               break label176;
            }

            gr_2 var9 = super.il0;
            if ((super.il0 == null ? 0 : var9.gq0()) != var29.Ro0.O60) {
               break label176;
            }
         }

         if (!var7) {
            float var27 = Float.MAX_VALUE;
            Ou0 var30 = null;
            boolean var31;
            if (var1 != 4) {
               var31 = true;
            } else {
               var31 = false;
            }

            I2 var10 = super.qf.ZD();

            while (var10.hasNext()) {
               I2 var11 = ((nv0_0)var10.next()).yf0.ZD();

               while (var11.hasNext()) {
                  Ou0 var12 = (Ou0)var11.next();
                  if ((!var4 || var12.yI0.contains("door") || !var5 && var12.yI0.contains("badgegate") || !var5 && var12.yI0.contains("elevator"))
                     && (!var6 || var5 || !var4 || !var12.yI0.contains("badgegate"))) {
                     ly0_0 var13 = var12.Mp0;
                     var2.y = var12.Mp0.jG0.y;
                     if (var12.yI0.equals("p_door") || var12.yI0.equals("kk_door3")) {
                        ly0_0 var14;
                        ly0_0 var10000 = var14 = new ly0_0(var13);
                        var10000.nF(var10000.jG0.Vy(0.0F, 0.0F, 0.125F), var14.Xa0.na(0.0F, 0.0F, 0.125F));
                        var13 = var14;
                     }

                     C8 var10004 = super.VN.jG0;
                     C8 var10005 = super.VN.jG0;
                     C8 var10006 = super.VN.jG0;
                     C8 var32;
                     C8 var10007 = var32 = super.VN.jG0;
                     var32.getClass();
                     float var33 = var2.x;
                     float var39 = var2.y;
                     float var15 = var2.z;
                     var10007.x = var33;
                     var10006.y = var39;
                     var10005.z = var15;
                     var10004.dz0(0.125F);
                     C8 var10003 = super.VN.Xa0;
                     var10004 = super.VN.Xa0;
                     var10005 = super.VN.Xa0;
                     C8 var34;
                     var10006 = var34 = super.VN.Xa0;
                     var34.getClass();
                     float var35 = var2.x;
                     var39 = var2.y;
                     var15 = var2.z;
                     var10006.x = var35;
                     var10005.y = var39;
                     var10004.z = var15;
                     var10003.if$(0.125F);
                     C8 var36 = super.VN.jG0;
                     super.VN.nF(var36, super.VN.Xa0);
                     if ((var13.hC0(super.VN) || var2.eG() || !var4) && (!var31 || var3 < var12.Kv.KB)) {
                        float var37 = var12.Mp0.Xm0.x;
                        var39 = var12.Mp0.Xm0.y;
                        var15 = var12.Mp0.Xm0.z;
                        float var38;
                        if ((var38 = var2.Ir(var37, var39, var15)) < var27) {
                           var27 = var38;
                           var30 = var12;
                        }
                     }
                  }
               }
            }

            if (var30 == null) {
               return false;
            }

            switch (var1) {
               case 0:
               case 1:
                  if (var4 && var5 && var3 == 0) {
                     var30.PE0 = 1.0E8F;
                  } else {
                     var30.PE0 = 1.0F;
                  }

                  boolean var20;
                  if (var1 == 1) {
                     var20 = true;
                  } else {
                     var20 = false;
                  }

                  var30.sC0(var3, var20, null);
                  if (var3 == 0 && var4 && var6) {
                     pw_1 var10001 = pw_1.xC().Xf0();
                     ao_1 var10002 = ao_1.DX(super.uZ, 7, 1.5F);
                     float var21 = super.uZ.Rg0 / 2.0F;
                     var10002.h5[0] = var21;
                     var10001 = var10001.y80(var10002);
                     var10002 = ao_1.DX(super.uZ, 6, 1.5F);
                     float var22 = super.uZ.Q30 + 10.0F;
                     var10002.h5[0] = var22;
                     var10001 = var10001.y80(var10002).mz0();
                     var10001.xF0 = super.YB;
                     super.COM4 = (pw_1)var10001.Ms(tw0_0.LD0.Ov);
                  }

                  if (var4) {
                     byte var17 = 4;
                     if (var3 == 0) {
                        var20 = true;
                     } else {
                        var20 = false;
                     }

                     iy_0 var24 = var30.Mm0;
                     byte var25;
                     if (var30.Mm0 == null) {
                        var25 = -1;
                     } else {
                        var25 = var24.lPt2;
                     }

                     short var26;
                     if (var25 != 2) {
                        if (var25 != 3) {
                           if (var20) {
                              var26 = 1540;
                           } else {
                              var26 = 1541;
                           }
                        } else {
                           var26 = 1499;
                        }
                     } else {
                        var26 = 1543;
                     }

                     if (var5 && var20) {
                        return false;
                     }

                     if (var26 > 0) {
                        tw0_0.RE0.d00(true, var17, var26, 0.0F);
                     }
                  }
                  break;
               case 2:
                  var30.PE0 = 1.0E8F;
                  var30.sC0(var3, false, null);
                  break;
               case 3:
                  var30.EG();
                  break;
               case 4:
                  C8 var16;
                  var16 = new C8();
                  var30.ho.V1(var16);
                  if (var3 == 1) {
                     float var18 = var16.y;
                     if (var16.y <= -90000.0F) {
                        var16.y = var18 + 100000.0F;
                     }
                  } else {
                     float var19 = var16.y;
                     if (var16.y > -90000.0F) {
                        var16.y = var19 - 100000.0F;
                     }
                  }

                  var30.ho.Y1(var16);
            }

            return true;
         }
      }

      lg_0.k.lPT5(new sb0_1((F30) (Object) this, var1, var2, var3, var4, var5, var6));
      return true;
   }

   @Override
   public final void cu0(s4_0 var1, boolean var2) {
      if (!lpt3__1.oq0 && (lpt3__1.RJ || tw0_0.Eu(8)) || !super.vn0) {
         var1 = s4_0.rP;
      }

      ParticleEffectExt var3 = super.Bu0;
      if ((super.Bu0 != null && var2 || var1 == null || super.XF != var1) && var3 != null) {
         if (var2) {
            super.YG0.aUX();
            super.Bu0 = null;
         } else if (!var3.isComplete()) {
            I2 var6 = super.Bu0.getControllers().ZD();

            while (var6.hasNext()) {
               ((RegularEmitter)((ParticleController)var6.next()).emitter).setEmissionMode(RegularEmitter.EmissionMode.EnabledUntilCycleEnd);
            }
         }
      }

      if (lpt3__1.RJ && lg_0.lW.nI0(93) && super.Bu0 != null) {
         super.YG0.aUX();
         super.Bu0 = null;
      }

      super.YG0.I2();
      super.XF = var1;
      var3 = super.Bu0;
      if (super.Bu0 != null && var3.isComplete()) {
         super.Bu0 = null;
      }

      if (!var2) {
         if (super.Bu0 == null && var1 != null) {
            ff_0 var10000;
            String var10001;
            label135: {
               label82: {
                  label81: {
                     int var4;
                     if ((var4 = var1.ordinal()) != 7 && var4 != 17) {
                        if (var4 == 41) {
                           break label81;
                        }

                        if (var4 == 27) {
                           var10000 = super.YG0;
                           var10001 = "weather/ash";
                           break label135;
                        }

                        if (var4 == 28) {
                           var10000 = super.YG0;
                           var10001 = "weather/sandstorm";
                           break label135;
                        }

                        switch (var4) {
                           case 20:
                              break label81;
                           case 21:
                              var10000 = super.YG0;
                              var10001 = "weather/heavy_rain";
                              break label135;
                           case 22:
                              (super.Bu0 = super.YG0.UH0("weather/heavy_rain")).start();
                              super.YG0.fY(super.Bu0);
                              ParticleEffectExt var5 = super.YG0.UH0("weather/thunder");
                              super.Fg = var5;
                              super.YG0.fY(var5);
                              return;
                           case 23:
                              break;
                           case 24:
                              break label82;
                           case 25:
                              var10000 = super.YG0;
                              var10001 = "weather/hail";
                              break label135;
                           default:
                              switch (var4) {
                                 case 43:
                                 case 44:
                                    break label82;
                                 case 45:
                                    break;
                                 default:
                                    return;
                              }
                        }
                     }

                     var10000 = super.YG0;
                     var10001 = "weather/snow";
                     break label135;
                  }

                  var10000 = super.YG0;
                  var10001 = "weather/rain";
                  break label135;
               }

               var10000 = super.YG0;
               var10001 = "weather/heavy_snow";
            }

            (super.Bu0 = var10000.UH0(var10001)).start();
            super.YG0.fY(super.Bu0);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public final void mH(_else var1) {
      if (!super.fX) {
         rj0_2 var7;
         if (Xh0((XF0)var1)) {
            byte var2 = 39;
            var7 = tw0_0.Ll0.Qz0.Oq0.Vo0[var2].bB();
         } else {
            var7 = this.wK0;
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

      c8_0 var5 = c8_0.JD0;
      if (this.Ku != c8_0.JD0.NA()) {
         this.Ku = var5.NA();
         I2 var4 = super.qf.ZD();

         while (var4.hasNext()) {
            I2 var6 = ((nv0_0)var4.next()).yf0.ZD();

            while (var6.hasNext()) {
               iy_0 var3;
               Ou0 var8;
               if ((var3 = (var8 = (Ou0)var6.next()).Mm0) != null && var3.YD0 == 8) {
                  var8.EG();
                  Ou0 var10000;
                  byte var10001;
                  boolean var10002;
                  switch (c8_0.JD0.NA().om) {
                     case 0:
                        var10000 = var8;
                        var10001 = 0;
                        var10002 = true;
                        break;
                     case 1:
                        var10000 = var8;
                        var10001 = 1;
                        var10002 = true;
                        break;
                     case 2:
                        var10000 = var8;
                        var10001 = 2;
                        var10002 = true;
                        break;
                     case 3:
                     case 4:
                        var10000 = var8;
                        var10001 = 3;
                        var10002 = true;
                        break;
                     default:
                        continue;
                  }

                  var10000.sC0(var10001, var10002, null);
               }
            }
         }
      }
   }

   @Override
   public final void Xf0() {
      yt_1 var1 = tw0_0.e60;
      if (tw0_0.e60 != null && var1.jB0 != null && tw0_0.rl.NA && tw0_0.e60.N60() instanceof hm_0) {
         super.Xf0();
         this.ZD0();
         hm_0 var12 = (hm_0)tw0_0.e60.N60();
         E90 var10000 = tw0_0.e60.jB0;
         float var2 = super.qh.r;
         float var3 = super.qh.g;
         float var4 = super.qh.b;
         float var5 = super.qh.a;
         lg_0.OH0.glClearColor(var2, var3, var4, var5);
         lg_0.OH0.glClear(16640);
         C8 var14 = var10000.il0.t60;
         XF0 var19 = super.K60;
         if (super.K60 == null || var19 != var12 || var19.Fm && nf_0.zo0().t8() >= 255) {
            c8_0.JD0.vt0.ar = 0L;
            XF0 var20 = super.K60;
            if (super.K60 != null && var20.Fm) {
               var20.Fm = false;
               var20.gA();
            }

            super.K60 = var12;
            wa0_2 var21 = var12.i80;
            this.dD = new nv0_0[var12.i80.It0][var21.WH];
            mk_1.NU.Sq0();
            I2 var22 = super.qf.ZD();

            while (var22.hasNext()) {
               ((nv0_0)var22.next()).dispose();
            }

            super.qf.clear();
            super.sN.fx.ri0();
            super.e0 = -1;
            super.hq = -1;
            if (tw0_0.PK0 == null && tw0_0.LD0.hO == null) {
               tw0_0.RE0.Eh(var12.dw, var12.hh0(), true, false);
            }

            vo_2.z0 = Xh0(var12);
            ((Ze)super.sN.fx).yA0.b20();
            ok0_2.CoM5();
            tw0_0.lM.BO();
         }

         gr_2 var23 = super.il0;
         if ((super.il0 == null ? 0 : var23.gq0()) != var12.Ro0.O60 || tw0_0.Eu(1) && lg_0.lW.eC0(129) && lg_0.lW.nI0(92)) {
            gr_2 var24 = super.il0;
            if (super.il0 != null) {
               var24.dispose();
               super.il0 = null;
            }

            gr_2 var25;
            switch (var12.Ro0.O60) {
               case 61:
                  var25 = new yt_0(var12);
                  break;
               case 80:
                  var25 = new pk0_1(var12, super.a30);
                  break;
               case 135:
                  var25 = new rf_1(var12);
                  break;
               case 137:
                  var25 = new lh_1(var12);
                  break;
               case 139:
                  var25 = new jz_0(var12);
                  break;
               case 140:
               case 397:
                  var25 = new mj_0(var12);
                  break;
               case 141:
                  var25 = new bj0_1(var12);
                  break;
               case 173:
                  var25 = new nk0_1(var12);
                  break;
               case 180:
                  var25 = new zr0_0(var12);
                  break;
               case 248:
                  var25 = new wa0_1(var12);
                  break;
               default:
                  var25 = new gr_2(var12);
            }

            super.il0 = var25;
         }

         int var26 = 0;
         int var28 = 0;
         int var29 = var12.yd;
         if (var12.yd > 0) {
            int var6 = var12.ie;
            if (var12.ie > 0) {
               wa0_2 var15 = var12.i80;
               var26 = (int)((var14.x - var12.i80.Iz0) / var29);
               var28 = (int)((var14.y - var15.Ig) / var6);
            }
         }

         if (super.e0 != var26 || super.hq != var28) {
            super.e0 = var26;
            super.hq = var28;
         }

         F90 var16 = var12.aA0;
         if (super.je != var12.aA0) {
            super.je = var16;
         }

         byte var17 = 1;
         System.nanoTime();
         boolean var30 = false;

         for (int var35 = Math.max(0, var26 - 1); var35 <= var26 + var17; var35++) {
            for (int var7 = Math.max(0, var28 - var17); var7 <= var28 + var17; var7++) {
               bm_1 var8;
               if (var35 >= 0 && var7 >= 0 && (var8 = var12.gg(var35, var7)) != null && this.dD[var35][var7] == null) {
                  Ao0 var31 = var12.ww(var35, var7);
                  nv0_0 var9;
                  nv0_0 var40 = var9 = new nv0_0(var31, (qj0_1)var8.wj0());
                  var40.Hb0(super.k1);
                  wa0_2 var32;
                  if ((var32 = super.sN.V10(var31.Va0)) != null) {
                     C8 var41 = var9.hw;
                     float var36 = var35 * 8 + 4;
                     float var37 = var32.Iz0 * 0.25F + var36;
                     float var10 = var32.GF0(var35, var7);
                     float var11 = var7 * 8 + 4;
                     var41.na(var37, var10, var32.Ig * 0.25F + var11);
                  }

                  var9.Py0();
                  this.dD[var35][var7] = var9;
                  super.qf.Ue0(var9);
                  if (tt0_0.C7()) {
                     tt0_0 var33;
                     tt0_0 var42 = var33 = tt0_0.j0;
                     tt0_0.j0.d6.tA0();
                     if (var42.G2 != null) {
                        le0_2 var38 = var33.Mu;
                        if (var33.Mu != null) {
                           var33.Ol.sj0(var38, true);
                        }

                        var33.Mu = null;
                        var33.n90();
                        var33.G2.dispose();
                        var33.Ol.sj0(var33.G2, true);
                     }
                  }

                  Ou0 var43 = var9.wp0;
                  Ou0 var45 = var9.wp0;
                  var5 = 1.0F;
                  var9.wp0.jF = 1.0F;
                  var45.QT = var5;
                  var43.kv = var5;
                  var30 = true;
               }
            }
         }

         if (var30 && tw0_0.Eu(1)) {
            dl_1 var44 = qd0;
            System.nanoTime();
            var44.getClass();
         }

         super.ns0.jK(this.cV());
         this.Kx();
         jn_0.Ie0("PSYS.draw");
         super.YG0.begin();
         super.YG0.I2();
         super.YG0.me0();
         super.YG0.end();
         jn_0.Qr("PSYS.draw");
         super.ns0.eo0(super.YG0);
         if ((var12.Jo0 == s4_0.COm8 || ((_else)var12).Z10) && tw0_0.rl.c50 != 7) {
            super.VJ0.np(super.uZ.rj);
            super.VJ0.y += 0.25F;
            if (super.qH < 1.0F) {
               super.qH = 1.0F;
            }

            if (super.qH > 5.0F) {
               super.qH = 5.0F;
            }

            super.a1.ho.F();
            C8 var13 = super.uZ.rj;
            C8 var18 = super.uZ.v40;
            C8 var27 = super.uZ.St0;
            super.a1.ho.co(var13, var18, var27);
            super.a1.ho.Y1(super.VJ0);
            super.a1.ho.tO(C8.X, 90.0F);
            super.a1.ho.w2(super.qH * 1.25F, super.qH * 1.25F, super.qH * 1.25F);
            super.ns0.vL();
            super.ns0.eo0(super.a1);
         }

         super.ns0.end();
         tw0_0.lM.getClass();
      }
   }

   @Override
   public final void Be(E90 var1, BJ0 var2, boolean var3) {
      C8 var10 = var1.il0.t60;
      if (super.KR) {
         if (super.Ej == null) {
            super.Ej = var10;
         }

         var10 = super.Ej;
      }

      C8 var10000 = super.sC;
      C8 var4;
      C8 var10001 = var4 = super.sC;
      float var10003 = var10.x * 0.25F;
      float var11 = var10.z * 0.25F + 0.1F;
      float var5 = var10.y * 0.25F + 0.1F;
      super.sC.x = var10003;
      var10001.y = var11;
      var10000.z = var5;
      af0_0 var12 = af0_0.SS;
      int var22 = af0_0.SS.Lu0;
      var5 = (af0_0.SS.Lu0 % 2 == 0 ? var12.fq0 : -var12.fq0) * 0.02F;
      float var6 = 0.0F;
      float var13 = var22 % 2 == 0 ? var12.mr : -var12.mr;
      var4.Vy(var5, var6, var13 * 0.02F);
      var10001 = super.sC;
      com6__1 var10002 = com6__1.WI0;
      float var14 = com6__1.WI0.xf();
      float var18 = 0.0F;
      var5 = var10002.Um0();
      var10001.na(var14, var18, var5);
      var2.Wu0 = 0.5F;
      float var15 = 100.0F;
      switch (super.XF.ordinal()) {
         case 21:
         case 24:
         case 43:
         case 44:
            var15 = var2.Rg0 + 6.0F;
            break;
         case 25:
         case 32:
            var15 = var2.Rg0 + 2.5F;
            break;
         case 27:
         case 37:
            var15 = var2.Rg0 + 5.0F;
            break;
         case 28:
            var15 = var2.Rg0 + 3.0F;
            break;
         case 35:
            var15 = var2.Rg0 + 4.5F;
      }

      if (!super.fX || super.K60 == null) {
         var2.Qy = var15;
      }

      float var19 = var2.Qy;
      if (var2.Qy != var15) {
         if (var19 > var15) {
            var2.Qy = Math.max(var19 - lg_0.S4.uL * 15.0F, var15);
         } else {
            var2.Qy = Math.min(lg_0.S4.uL * 15.0F + var19, var15);
         }
      }

      hm_0 var7 = (hm_0)tw0_0.e60.N60();
      zv_2 var16 = var1.ba0;
      byte var20 = 0;
      XF0 var25 = super.K60;
      if (super.K60 != null) {
         var20 = var25.Ro0.b9;
      }

      if (!this.YY) {
         if (dw_2.z2 && LW.LH0(var2.zo0, 15.0F)) {
            var2.zo0 = 10.5F;
         } else if (!dw_2.z2 && !LW.LH0(var2.zo0, 15.0F)) {
            var2.zo0 = 15.0F;
         }
      }

      var5 = 0.0F;
      if (var20 == 3 || var20 == 13) {
         var2.Q30 = -25.0F;
         var5 = 0.75F;
      }

      if (var20 == 2) {
         var2.Q30 = -35.0F;
         var2.Rg0 = 10.0F;
      }

      if (!super.fX) {
         if (!this.YY) {
            var2.zo0 = 15.0F;
         }

         var2.Rg0 = 12.5F;
         var2.Q30 = -56.0F;
         var2.d00 = 0.0F;
         if (var7 != null && var16.Lpt2) {
            LT var8;
            if ((var8 = var16.LPt1()) == null) {
               return;
            }

            if (var8.XC0() > 90.0F && var8.XC0() < 270.0F) {
               var2.Q30 = 10.0F;
               var2.d00 = -25.0F;
            } else if (var8.XC0() > 0.0F && var8.XC0() <= 90.0F) {
               var2.d00 = -45.0F;
               var2.Q30 = -15.0F;
            } else if (var8.XC0() >= 270.0F) {
               var2.d00 = 45.0F;
               var2.Q30 = -25.0F;
            }
         }
      }

      float var9 = super.sC.x;
      float var17 = super.sC.y;
      float var21 = super.sC.z;
      var2.nz0(var9, var17, var21, 0.0F, var5, 0.0F);
      var2.ye(true);
      if (super.kp0) {
         BJ0 var28 = super.RX;
         BJ0 var32 = super.RX;
         super.RX.Qy = 1000.0F;
         var32.Wu0 = 0.1F;
         var28.zo0 = var2.zo0;
      }
   }

   @Override
   public final void bw() {
      super.bw();
      com6__1.WI0.cI0((short)0, (short)0);
   }

   @Override
   public final void dispose() {
      super.dispose();
      super.sN.fx.ri0();
      ((Ze)super.sN.fx).yA0.b20();
      ok0_2.CoM5();
      gr_2 var1;
      if ((var1 = super.il0) != null) {
         var1.dispose();
      }
   }

   @Override
   public final void ph0() {
      super.ph0();
      if (tw0_0.e60 != null) {
         this.ZD0();
      }
   }

   @Override
   public final void HF0() {
      super.uZ.zo0--;
      this.YY = true;
   }

   @Override
   public final void uD0() {
      super.uZ.zo0++;
      this.YY = true;
   }

   @Override
   public final void Yt(double var1) {
   }

   @Override
   public final void aN(float var1) {
      super.uZ.zo0 = var1;
      this.YY = true;
   }

   @Override
   public final float Bc() {
      return 15.0F;
   }

   @Override
   public final void M9() {
      super.uZ.zo0 = 15.0F;
      this.YY = false;
   }

   @Override
   public final String g80() {
      String var1 = "\n\nMapHeader:";
      if (super.K60 != null) {
         var1 = AN.nK0(
               AN.nK0(AN.nK0("\n\nMapHeader:\nID: " + super.K60.Ro0.O60, "\nMatrix: ").append(super.K60.i80.SM).toString(), "\nTilesetID: ")
                  .append(super.K60.Ro0.T70)
                  .toString(),
               "\nLight ID: "
            )
            .append(super.K60.Ro0.IJ.aw0)
            .toString();
         if (super.k1 != null) {
            var1 = AN.nK0(var1, "\nClearColor: ").append(super.k1.Ak0).toString();
         }
      }

      return super.K60 != null
         ? AN.nK0(var1, "\n\nCameras:\nPosition: ")
            .append(super.uZ.x90)
            .append("\nTarget: ")
            .append(super.uZ.rj)
            .append("\nDIST: ")
            .append(super.uZ.Rg0)
            .append("\nYAW: ")
            .append(super.uZ.Q30)
            .append("\nPITCH: ")
            .append(super.uZ.d00)
            .toString()
         : var1;
   }

   @Override
   public final void Lo0(boolean var1) {
      super.Hq.np(tw0_0.e60.jB0.L8.ze0);
      I2 var2 = super.qf.ZD();

      while (var2.hasNext()) {
         I2 var3 = ((nv0_0)var2.next()).yf0.ZD();

         while (var3.hasNext()) {
            Ou0 var4 = (Ou0)var3.next();
            super.VN.jG0.np(super.Hq).dz0(0.125F);
            super.VN.Xa0.np(super.Hq).if$(0.125F);
            C8 var5 = super.VN.jG0;
            super.VN.nF(var5, super.VN.Xa0);
            if (var4.yI0.equalsIgnoreCase("pc01") && var4.Mp0.hC0(super.VN)) {
               Ou0 var10000;
               String var10001;
               boolean var10002;
               if (var1) {
                  var10000 = var4;
                  var10001 = "pc_moni_on";
                  var10002 = false;
               } else {
                  var10000 = var4;
                  var10001 = "pc_moni_off";
                  var10002 = false;
               }

               var10000.Ey(var10001, var10002, null);
            }
         }
      }
   }

   @Override
   public final boolean yp(byte var1) {
      return var1 == 4;
   }

   public final void ZD0() {
      label27: {
         E90 var1 = tw0_0.e60.jB0;
         C8 var10000;
         C8 var10001;
         if (super.COM4 != null) {
            var10000 = vo_2.ez.np(super.uZ.v40);
            var10001 = super.uZ.rj;
         } else {
            if (var1 == null) {
               break label27;
            }

            af0_0.SS.bk();
            com6__1.WI0.Ih();
            this.Be(var1, super.uZ, true);
            if (super.kp0) {
               var10000 = vo_2.ez.np(super.RX.v40);
               var10001 = super.RX.rj;
            } else {
               var10000 = vo_2.ez.np(super.uZ.v40);
               var10001 = super.uZ.rj;
            }
         }

         float var5 = var10001.x;
         float var2 = var10001.y;
         float var3 = var10001.z;
         var10000.Vy(var5, var2, var3);
      }

      if (!super.fX) {
         BR var4 = tw0_0.rl;
         if (tw0_0.rl.Sy) {
            var4.Sy = false;
            E90 var6 = tw0_0.e60.jB0;
            tw0_0.e60.jB0.L8.Np0 = false;
            var6.il0.LE(nk_0.Nw);
         } else {
            var4.kg0();
         }

         nf_0.zo0().w30(500, false);
      }
   }
}
