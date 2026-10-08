package cn.pokemmo.graphics.gdx.model;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import java.io.IOException;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class GdxModelResourceManager {
   public static boolean m;
   public static String UI0;
   public static float e30;
   public static eb0_1 kw;
   public static final int[] oq;
   public static final dl_1 Gn0;
   public static GdxModelResourceManager mh;
   public final hd0_2 NP;
   public final gq_1 Ap0;

   public GdxModelResourceManager() {
      gq_1 source = new la0_1("data/sprites/models/");
      if (!tw0_0.xj0()) {
         try {
            VE archive = lg_0.I70.cD0("data/sprites/models.pak");
            if (archive.os0()) {
               source = new H80(new gq_1[]{source, new Ek0(new ZipFile(archive.l00()))});
            }
         } catch (IOException exception) {
            Gn0.error("Error loading model data.", exception);
            throw new nf_1("Error loading model data.");
         }
      }

      this.Ap0 = source;
      this.NP = new hd0_2(source);
      this.NP.ok(ut_0.class, new cs_1(new bc_0()));
   }

   public static GdxModelResourceManager oV() {
      if (mh == null) {
         mh = new GdxModelResourceManager();
      }

      return mh;
   }

   static {
      kw = eb0_1.Y30;
      oq = new int[]{122, 122, 23, 260, 222};
      Gn0 = Cq0.E1(GdxModelResourceManager.class);
   }

   public static boolean Ce0(byte var0, int var1) {
      if (m) {
         return true;
      } else {
         if (var1 >= 5400) {
            boolean[] var10001 = zp_0.Wk;
            if (var1 <= 5422) {
               return true;
            }
         }

         if (var1 >= 5300) {
            boolean[] var2 = zp_0.Wk;
            if (var1 <= 5322) {
               return true;
            }
         }

         switch (var1) {
            case 2010:
            case 2030:
            case 2050:
            case 2340:
            case 2350:
            case 2360:
            case 2370:
            case 2380:
            case 2390:
            case 2420:
            case 2490:
            case 2800:
            case 2810:
            case 2820:
            case 2860:
            case 2870:
            case 2900:
            case 3020:
            case 3060:
               return var0 != 3 && var0 != 4;
            case 2400:
            case 2890:
               return true;
            default:
               switch (var1) {
                  case 5200:
                  case 5201:
                  case 5202:
                  case 5203:
                  case 5204:
                  case 5205:
                     return true;
                  default:
                     return false;
               }
         }
      }
   }

   public static void c00(ut_0 var0, am_2 var1, int var2, int var3, int var4) {
      i4_0 var6;
      i4_0 var10000 = var6 = var1.Rt0(var3, var4);
      ut_0 var10001 = var0;
      Texture var5;
      Texture var10002 = var5 = new Texture(var6);
      a00_0 var10003 = a00_0.xm0;
      ((lq_2)var10002).setWrap(var10003, var10003);
      ((BM)var10001.Cs.get(var2)).LPT8(new mz_2(mz_2.g7, var5));
      var10000.dispose();
   }

   public final ut_0 Ji0(int var1, eb0_1 var2, String var3) {
      return this.mi(var3 + "/model_LOD" + var1 + ".g3db", var2);
   }

   public final VC0 Zh0(byte var1, zp_0 var2) {
      ut_0 model = this.mi("platforms/base.g3db", eb0_1.Y30);
      String suffix = fp0_0.uD(new StringBuilder(), var2.Br, "");
      int platformType = var2.zy0;
      if (platformType == 5 || platformType == 6 || platformType == 9
            || platformType == 10 || platformType == 12 || platformType == 19) {
         suffix = AN.nK0(suffix, "_").append(c8_0.JD0.YG()).toString();
      }

      String texturePath = "platforms/" + var1 + "_" + suffix + ".png";
      Dn0 textureFile = this.Ap0.bC0(texturePath);
      if (!textureFile.os0()) {
         Gn0.error("Missing platform texture: {}", textureFile.el(), new nf_1("Missing texture"));
         return new VC0(model, 0);
      }

      BM material = (BM)model.Cs.get(0);
      Texture texture;
      if (!this.NP.u70(texturePath)) {
         synchronized (this.NP) {
            this.NP.im(texturePath, Texture.class, null);
         }
         this.NP.Q4();
         texture = (Texture)this.NP.nc(Texture.class, texturePath);
         texture.setWrap(a00_0.xm0, a00_0.xm0);
         long textureAttribute = mz_2.g7;
         ((Texture)((mz_2)material.sg(textureAttribute)).I3.uj).dispose();
         material.fR(textureAttribute);
      } else {
         texture = (Texture)this.NP.nc(Texture.class, texturePath);
      }

      material.LPT8(new mz_2(mz_2.g7, texture));
      return new VC0(model, 0);
   }

   public final ut_0 fk0(int var1, eb0_1 var2, String var3) {
      if (this.NP.u70(var3)) {
         return this.mi(var3, var2);
      } else {
         ut_0 var9 = this.mi(var3, var2);
         int var10 = oq[var1];
         if (var1 == 1 || var1 == 0) {
            var10 += c8_0.JD0.YG();
         }

         int var10000 = var1;
         MG0 var10003 = MG0.lpt6;
         am_2 var7 = tw0_0.Ll0.Qz0.fx.jy(var10).vI0;
         byte var6;
         ut_0 var11;
         byte var12;
         switch (var10000) {
            case 0:
               c00(var9, var7, 0, 3, 4);
               c00(var9, var7, 1, 6, 6);
               if (c8_0.JD0.YG() != 0) {
                  this.dU(var9, "u_forest1", 2);
               }

               return var9;
            case 1:
               c00(var9, var7, 0, 3, 4);
               c00(var9, var7, 1, 5, 5);
               c00(var9, var7, 2, 6, 6);
               if (c8_0.JD0.YG() != 0) {
                  this.dU(var9, "u_plains", 3);
               }

               return var9;
            case 2:
               var11 = var9;
               c00(var9, var7, 0, 3, 4);
               var12 = 1;
               var6 = 70;
               break;
            case 3:
               var11 = var9;
               var6 = 10;
               c00(var9, var7, 0, var6, var6);
               var12 = 1;
               var6 = 9;
               break;
            case 4:
               am_2 var10001 = var7;
               am_2 var13 = var7;
               Color var4;
               var4 = new Color(2071690239);
               PRN_ var8;
               var8 = new PRN_(PRN_.Ly, var4);
               ((BM)var9.Cs.get(0)).LPT8(var8);
               ((BM)var9.Cs.get(1)).LPT8(var8);
               c00(var9, var13, 0, 34, 36);
               c00(var9, var10001, 1, 32, 33);
               return var9;
            default:
               return var9;
         }

         c00(var11, var7, var12, var6, var6);
         return var9;
      }
   }

   public final ut_0 mi(String var1, eb0_1 var2) {
      if (this.NP.u70(var1)) {
         return (ut_0)this.NP.nc(ut_0.class, var1);
      }

      SH0 parameters = new SH0();
      parameters.jz0.YI = var2;
      parameters.jz0.A30 = var2;
      this.NP.im(var1, ut_0.class, parameters);
      this.NP.Q4();
      ut_0 model;
      synchronized (this.NP) {
         model = (ut_0)this.NP.Og0(ut_0.class, var1);
      }

      I2 materials = model.Cs.ZD();
      while (materials.hasNext()) {
         BM material = (BM)materials.next();
         material.fR(PRN_.Ly);
         material.fR(PRN_.zz);
         material.fR(PRN_.sI);
         material.fR(PRN_.gp0);
         material.fR(PRN_.xE);
         material.fR(mb0_2.an0);
      }

      return model;
   }

   public final Ou0 jK(int var1) {
      String var2 = "dev/";
      if (var1 >= 5400) {
         boolean[] var10001 = zp_0.Wk;
         if (var1 <= 5422) {
            var1 = (byte)(var1 - 5400);
            zp_0 var41 = (zp_0)t_0.BI0(zp_0.PY.BM((byte)var1), zp_0.class, (byte)var1);
            return this.Zh0((byte)4, var41);
         }
      }

      if (var1 >= 5300) {
         boolean[] var47 = zp_0.Wk;
         if (var1 <= 5322) {
            var1 = (byte)(var1 - 5300);
            zp_0 var39 = (zp_0)t_0.BI0(zp_0.PY.BM((byte)var1), zp_0.class, (byte)var1);
            return this.Zh0((byte)3, var39);
         }
      }

      switch (var1) {
         case 2010:
            eb0_1 var30 = eb0_1.Y30;
            ut_0 var51 = this.Ji0(0, var30, "pumpkin");
            Ou0 var44;
            var44 = new Ou0(this.Ji0(0, var30, "shadow_big"), "big_shadow", 24.0F, (u4_0)null);
            return new dx0_0(var51, true, true, var44);
         case 2030:
            eb0_1 var29 = eb0_1.Y30;
            return new dx0_0(this.Ji0(0, var29, "pumpkin"), false, false, (Ou0)null);
         case 2050:
            eb0_1 var28 = eb0_1.Y30;
            return new dx0_0(this.Ji0(0, var28, "pumpkin"), false, true, (Ou0)null);
         case 2340:
         case 2350:
         case 2360:
         case 2370:
            int var10002 = kq_0.lpT2(var1, 2340, 10, 1);
            eb0_1 var27 = eb0_1.Y30;
            return new hc_2(this.Ji0(var10002, var27, "christmas_present"), 64.0F);
         case 2380:
            eb0_1 var25 = eb0_1.jc0;
            ut_0 var8 = this.Ji0(0, var25, "cny/lantern");
            int[] var26;
            int[] var10003 = var26 = new int[2];
            var10003[0] = 0;
            var10003[1] = 1;
            return new U7(var8, Color.YELLOW, true, 2.0F, var26);
         case 2390:
            eb0_1 var24 = eb0_1.jc0;
            return new hc_2(this.Ji0(0, var24, "cny/firework"), 64.0F);
         case 2400:
            eb0_1 var22 = eb0_1.jc0;
            ut_0 var7 = this.Ji0(0, var22, "cny/banner");
            int[] var23;
            (var23 = new int[1])[0] = 0;
            return new U7(var7, Color.ORANGE, false, 0.0F, var23);
         case 2420:
            eb0_1 var20 = eb0_1.jc0;
            ut_0 var6 = this.Ji0(0, var20, "cny/pig_balloon");
            int[] var21;
            (var21 = new int[1])[0] = 0;
            return new U7(var6, Color.WHITE, false, 0.4F, var21);
         case 2490:
            eb0_1 var19 = eb0_1.jc0;
            return new vs0_0(this.Ji0(0, var19, "cny/rat"));
         case 2800:
            eb0_1 var18 = eb0_1.Y30;
            return new hc_2(this.Ji0(0, var18, "christmas/candy_cane"), 10.0F);
         case 2810:
            eb0_1 var17 = eb0_1.Y30;
            return new hc_2(this.Ji0(1, var17, "christmas/candy_cane"), 10.0F);
         case 2820:
            eb0_1 var16 = eb0_1.jc0;
            return new nr_0(this.Ji0(0, var16, "cny/ox"));
         case 2860:
            eb0_1 var15 = eb0_1.Y30;
            return new v4_0(this.Ji0(0, var15, "cny/tiger"));
         case 2870:
            eb0_1 var14 = eb0_1.Y30;
            return new lj0_1(this.Ji0(0, var14, "anniversary/balloons"));
         case 2890:
            eb0_1 var42 = eb0_1.Y30;
            ut_0 var5 = this.Ji0(0, var42, "anniversary/birthday_banner");
            I2 var43 = var5.Cs.ZD();

            while(var43.hasNext()) {
               BM var10000 = (BM)var43.next();
               ((wh_0)var10000).LPT8(new sh_0(1.0F));
               ((wh_0)var10000).LPT8(new mb0_2(mb0_2.k6, 0.01F));
            }

            return new hc_2(var5, 64.0F);
         case 2900:
            eb0_1 var12 = eb0_1.Y30;
            return new XJ0(this.Ji0(0, var12, "anniversary/birthday_cake"));
         case 3020:
            eb0_1 var11 = eb0_1.Y30;
            return new om_0(this.Ji0(0, var11, "cny/rabbit"));
         case 3060:
            eb0_1 var10 = eb0_1.Y30;
            return new uc0_1(this.Ji0(0, var10, "cny/dragon"));
         default:
            switch (var1) {
               case 5200:
                  eb0_1 var36 = eb0_1.Y30;
                  return new VC0(this.fk0(2, var36, "platforms/u_desert.g3db"));
               case 5201:
                  eb0_1 var35 = eb0_1.Y30;
                  return new VC0(this.fk0(0, var35, "platforms/u_forest1.g3db"));
               case 5202:
                  eb0_1 var34 = eb0_1.Y30;
                  return new VC0(this.fk0(0, var34, "platforms/u_forest2.g3db"));
               case 5203:
                  eb0_1 var33 = eb0_1.Y30;
                  return new VC0(this.fk0(1, var33, "platforms/u_plains.g3db"));
               case 5204:
                  eb0_1 var32 = eb0_1.Y30;
                  return new VC0(this.fk0(4, var32, "platforms/u_rocks_black.g3db"));
               case 5205:
                  eb0_1 var31 = eb0_1.Y30;
                  return new VC0(this.fk0(3, var31, "platforms/u_rocks_brown.g3db"));
               default:
                  if (m) {
                      try {
                         return new WT(this.mi(var1 + UI0 + ".g3db", kw), e30);
                      } catch (nf_1 var9) {
                      m = false;
                         if (var9.getCause() != null) {
                            Qy0.yI0.dk(-1, var9.getCause().getMessage());
                         }
                      }
                  }

                  return null;
            }
      }
   }

   public final void dU(ut_0 var1, String var2, int var3) {
      BM var8;
      BM var10000 = var8 = (BM)var1.Cs.get(var3);
      long var4;
      ((Texture)((mz_2)((wh_0)var10000).sg(var4 = mz_2.g7)).I3.uj).dispose();
      ((wh_0)var10000).fR(var4);
      c8_0 var9;
      System.out.println("platforms/" + var2 + "_" + (var9 = c8_0.JD0).YG() + ".png");
      i4_0 var6;
      i4_0 var10 = var6 = new i4_0(this.Ap0.bC0("platforms/" + var2 + "_" + var9.YG() + ".png"));

      Texture var7;
      Texture var10002 = var7 = new Texture(var6);
      a00_0 var10003 = a00_0.xm0;
      ((lq_2)var10002).setWrap(var10003, var10003);
      ((wh_0)var8).LPT8(new mz_2(var4, var7));
      var10.dispose();
   }
}
