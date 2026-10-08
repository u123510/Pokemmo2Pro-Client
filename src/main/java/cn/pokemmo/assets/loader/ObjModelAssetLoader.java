package cn.pokemmo.assets.loader;

import f.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;


import com.badlogic.gdx.graphics.Color;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

public abstract class ObjModelAssetLoader extends BaseAssetLoader {
   public final AD AUX;
   public G10 ID0;
   public boolean Ob;
   public int T10;
   public jt0_0 ep;
   public nl_1 HD0;
   public es_1 Ca0;

   public ObjModelAssetLoader(gq_1 var1) {
      super(var1);
      this.AUX = new AD();
      this.Ob = true;
   }

   public static Dn0 OD0(String var0, Dn0 var1) {
      StringTokenizer var2 = new StringTokenizer(var0, "\\/");
      Dn0 var3 = var1.Br();

      while (var2.hasMoreElements()) {
         String var4 = var2.nextToken();
         if (var4.equals("..")) {
            var3 = var3.Br();
         } else {
            var3 = var3.wp(var4);
         }
      }

      return var3;
   }

   public static void G6(FF0 var0, G10 var1) {
      var1.SC("name", null);
      float var2 = Float.parseFloat(var1.SC("opacity", "1.0"));
      boolean var3 = var1.jB0(1, "visible") == 1;
      float var4 = var1.FB("offsetx", 0.0F);
      float var5 = var1.FB("offsety", 0.0F);
      float var6 = var1.FB("parallaxx", 1.0F);
      float var7 = var1.FB("parallaxy", 1.0F);
      var0.GM = var2;
      var0.jg = var3;
      var0.dh0 = var4;
      var0.GD0();
      var0.Ax0 = var5;
      var0.GD0();
      var0.ep = var6;
      var0.OH = var7;
   }

   public abstract es_1 xY(Dn0 var1, Em0 var2);

   public final jt0_0 qL0(Dn0 var1, ee_0 var2, fm0_0 var3) {
      this.ep = new jt0_0();
      this.HD0 = new nl_1();
      this.Ca0 = new es_1();
      if (var2 != null) {
         this.Ob = var2.dM0;
      } else {
         this.Ob = true;
      }

      String var5 = this.ID0.SC("orientation", null);
      int var6 = this.ID0.jB0(0, "width");
      int var7 = this.ID0.jB0(0, "height");
      int var8 = this.ID0.jB0(0, "tilewidth");
      int var9 = this.ID0.jB0(0, "tileheight");
      int var10 = this.ID0.jB0(0, "hexsidelength");
      String var11 = this.ID0.SC("staggeraxis", null);
      String var12 = this.ID0.SC("staggerindex", null);
      String var13 = this.ID0.SC("backgroundcolor", null);
      Sz0 var14 = this.ep.Xl;
      if (var5 != null) {
         var14.Oa0.WK0("orientation", var5);
      }

      var14.Oa0.WK0("width", Integer.valueOf(var6));
      var14.Oa0.WK0("height", Integer.valueOf(var7));
      var14.Oa0.WK0("tilewidth", Integer.valueOf(var8));
      var14.Oa0.WK0("tileheight", Integer.valueOf(var9));
      var14.Oa0.WK0("hexsidelength", Integer.valueOf(var10));
      if (var11 != null) {
         var14.Oa0.WK0("staggeraxis", var11);
      }

      if (var12 != null) {
         var14.Oa0.WK0("staggerindex", var12);
      }

      if (var13 != null) {
         var14.Oa0.WK0("backgroundcolor", var13);
      }

      this.T10 = var7 * var9;
      if (var5 != null && "staggered".equals(var5) && var7 > 1) {
         this.T10 = this.T10 / 2 + var9 / 2;
      }

      G10 var15 = this.ID0.uQ("properties");
      if (var15 != null) {
         this.Vd(this.ep.Xl, var15);
      }

      I2 var16 = this.ID0.m8("tileset").ZD();

      while (var16.hasNext()) {
         G10 var17 = (G10)var16.next();
         if (var17.Fk.equals("tileset")) {
            int var18 = var17.jB0(1, "firstgid");
            String var19 = "";
            int var20 = 0;
            int var21 = 0;
            Dn0 var22 = null;
            String var23 = var17.SC("source", null);
            G10 var24;
            if (var23 != null) {
               Dn0 var25 = OD0(var23, var1);

               try {
                  var24 = this.AUX.G4(var25);
                  G10 var26 = var24.uQ("image");
                  if (var26 != null) {
                     var19 = var26.Rf("source");
                     var20 = var26.jB0(0, "width");
                     var21 = var26.jB0(0, "height");
                     var22 = OD0(var19, var25);
                  }
               } catch (WC0 var47) {
                  throw new nf_1("Error parsing external tileset.");
               }
            } else {
               G10 var48 = var17.uQ("image");
               if (var48 != null) {
                  var19 = var48.Rf("source");
                  var20 = var48.jB0(0, "width");
                  var21 = var48.jB0(0, "height");
                  var22 = OD0(var19, var1);
               }

               var24 = var17;
            }

            int var49 = var24.jB0(0, "tilewidth");
            int var27 = var24.jB0(0, "tileheight");
            int var28 = var24.jB0(0, "spacing");
            int var29 = var24.jB0(0, "margin");
            G10 var30 = var24.uQ("tileoffset");
            int var31 = 0;
            int var32 = 0;
            if (var30 != null) {
               var31 = var30.jB0(0, "x");
               var32 = var30.jB0(0, "y");
            }

            rr_1 var33 = new rr_1();
            G10 var34 = var24.uQ("properties");
            if (var34 != null) {
               this.Vd(var33.Qj0, var34);
            }

            var33.Qj0.Oa0.WK0("firstgid", Integer.valueOf(var18));
            es_1 var35 = var24.m8("tile");
            this.pG(var1, var3, var33, var35, var18, var49, var27, var28, var29, var23, var31, var32, var19, var20, var21, var22);
            es_1 var36 = new es_1();
            I2 var37 = var35.ZD();

            while (var37.hasNext()) {
               G10 var38 = (G10)var37.next();
               int var39 = var38.jB0(0, "id") + var18;
               wx_1 var40 = (wx_1)var33.zX.get(var39);
               if (var40 != null) {
                  G10 var41 = var38.uQ("animation");
                  qq_1 var42 = null;
                  if (var41 != null) {
                     es_1 var43 = new es_1();
                     Nn0 var44 = new Nn0();
                     I2 var45 = var41.m8("frame").ZD();

                     while (var45.hasNext()) {
                        G10 var46 = (G10)var45.next();
                        int var50 = Integer.parseInt(var46.Rf("tileid")) + var18;
                        var43.Ue0((ij_1)var33.zX.get(var50));
                        var44.ja0(Integer.parseInt(var46.Rf("duration")));
                     }

                     var42 = new qq_1(var44, var43);
                     var42.Je0 = var40.tL0();
                  }

                  if (var42 != null) {
                     var36.Ue0(var42);
                     var40 = var42;
                  }

                  String var51 = var38.SC("terrain", null);
                  if (var51 != null) {
                     var40.oZ().Oa0.WK0("terrain", var51);
                  }

                  String var52 = var38.SC("probability", null);
                  if (var52 != null) {
                     var40.oZ().Oa0.WK0("probability", var52);
                  }

                  String var53 = var38.SC("type", null);
                  if (var53 != null) {
                     var40.oZ().Oa0.WK0("type", var53);
                  }

                  G10 var54 = var38.uQ("properties");
                  if (var54 != null) {
                     this.Vd(var40.oZ(), var54);
                  }

                  G10 var55 = var38.uQ("objectgroup");
                  if (var55 != null) {
                     I2 var56 = var55.m8("object").ZD();

                     while (var56.hasNext()) {
                        G10 var57 = (G10)var56.next();
                        this.Oq0(this.ep, var40.pA(), var57, (float)var40.LT().xZ);
                     }
                  }
               }
            }

            I2 var58 = var36.ZD();

            while (var58.hasNext()) {
               qq_1 var59 = (qq_1)var58.next();
               var33.zX.qx0(var59.Je0, var59);
            }

            this.ep.Ri.Zy.Ue0(var33);
         }

         if (this.ID0.mx0 != null) {
            this.ID0.mx0.sj0(var17, true);
         }
      }

      es_1 var60 = this.ID0.mx0;
      int var61 = var60 == null ? 0 : var60.KB;

      for (int var62 = 0; var62 < var61; ++var62) {
         es_1 var63 = this.ID0.mx0;
         if (var63 == null) {
            throw new nf_1("Element has no children: " + this.ID0.Fk);
         }

         G10 var64 = (G10)var63.get(var62);
         this.Bs0(this.ep, this.ep.Zl, var64, var1, var3);
      }

      fv_1 var65 = this.ep.Zl;
      es_1 var66 = new es_1();
      var66.clear();

      for (int var67 = 0; var67 < var65.wg.KB; ++var67) {
         FF0 var68 = (FF0)var65.wg.get(var67);
         if (HF0.class.isInstance(var68)) {
            var66.Ue0(var68);
         }
      }

      while (var66.KB > 0) {
         HF0 var69 = (HF0)var66.KI();
         var66.Tx0(0);
         I2 var70 = var69.Lc0.wg.ZD();

         while (var70.hasNext()) {
            FF0 var71 = (FF0)var70.next();
            var71.ep *= var69.ep;
            var71.OH *= var69.OH;
            if (var71 instanceof HF0) {
               var66.Ue0((HF0)var71);
            }
         }
      }

      I2 var72 = this.Ca0.ZD();

      while (var72.hasNext()) {
         ((Runnable)var72.next()).run();
      }

      this.Ca0 = null;
      return this.ep;
   }

   public final void Bs0(jt0_0 var1, fv_1 var2, G10 var3, Dn0 var4, fm0_0 var5) {
      String var6 = var3.Fk;
      if (var6.equals("group")) {
         if (var3.Fk.equals("group")) {
            HF0 var7 = new HF0();
            G6(var7, var3);
            G10 var8 = var3.uQ("properties");
            if (var8 != null) {
               this.Vd(var7.Nl, var8);
            }

            es_1 var9 = var3.mx0;
            int var10 = var9 == null ? 0 : var9.KB;

            for (int var11 = 0; var11 < var10; ++var11) {
               es_1 var12 = var3.mx0;
               if (var12 == null) {
                  throw new nf_1("Element has no children: " + var3.Fk);
               }

               G10 var13 = (G10)var12.get(var11);
               this.Bs0(var1, var7.Lc0, var13, var4, var5);
            }

            I2 var36 = var7.Lc0.wg.ZD();

            while (var36.hasNext()) {
               FF0 var37 = (FF0)var36.next();
               if (var7 == var37) {
                  var37.getClass();
                  throw new nf_1("Can't set self as the parent");
               }

               var37.Uu0 = var7;
            }

            var2.wg.Ue0(var7);
         }
      } else if (var6.equals("layer")) {
         if (var3.Fk.equals("layer")) {
            int var38 = var3.jB0(0, "width");
            int var39 = var3.jB0(0, "height");
            int var40 = ((Integer)var1.Xl.Oa0.Wk0("tilewidth")).intValue();
            int var41 = ((Integer)var1.Xl.Oa0.Wk0("tileheight")).intValue();
            X70 var42 = new X70(var38, var39, var40, var41);
            G6(var42, var3);
            G10 var14 = var3.uQ("data");
            String var15 = var14.SC("encoding", null);
            if (var15 == null) {
               throw new nf_1("Unsupported encoding (XML) for TMX Layer Data");
            }

            int[] var16 = new int[var38 * var39];
            if (var15.equals("csv")) {
               String[] var17 = var14.j0.split(",");

               for (int var18 = 0; var18 < var17.length; ++var18) {
                  var16[var18] = (int)Long.parseLong(var17[var18].trim());
               }
            } else {
               if (!var15.equals("base64")) {
                  throw new nf_1(xq_1.pz0("Unrecognised encoding (", var15, ") for TMX Layer Data"));
               }

               String var43 = var14.SC("compression", null);
               InputStream var19 = null;

               try {
                  byte[] var20 = So0.P3(var14.j0);
                  if (var43 == null) {
                     var19 = new ByteArrayInputStream(var20);
                  } else if (var43.equals("gzip")) {
                     var19 = new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(var20), var20.length));
                  } else {
                     if (!var43.equals("zlib")) {
                        throw new nf_1("Unrecognised compression (" + var43 + ") for TMX Layer Data");
                     }

                     var19 = new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(var20)));
                  }

                  byte[] var21 = new byte[4];

                  for (int var22 = 0; var22 < var39; ++var22) {
                     for (int var23 = 0; var23 < var38; ++var23) {
                        int var24 = var19.read(var21);

                        while (var24 < 4) {
                           int var25 = 4 - var24;
                           int var26 = var19.read(var21, var24, var25);
                           if (var26 == -1) {
                              break;
                           }

                           var24 += var26;
                        }

                        if (var24 != 4) {
                           throw new nf_1("Error Reading TMX Layer Data: Premature end of tile data");
                        }

                        var16[var22 * var38 + var23] = var21[0] & 255 | (var21[1] & 255) << 8 | (var21[2] & 255) << 16 | (var21[3] & 255) << 24;
                     }
                  }

                  KT.E1(var19);
               } catch (IOException var35) {
                  throw new nf_1("Error Reading TMX Layer Data - IOException: " + var35.getMessage());
               } catch (Throwable var34) {
                  KT.E1(var19);
                  throw var34;
               }
            }

            yg0_1 var44 = var1.Ri;

            for (int var45 = 0; var45 < var39; ++var45) {
               for (int var46 = 0; var46 < var38; ++var46) {
                  int var47 = var16[var45 * var38 + var46];
                  boolean var27 = (var47 & Integer.MIN_VALUE) != 0;
                  boolean var28 = (var47 & 1073741824) != 0;
                  boolean var29 = (var47 & 536870912) != 0;
                  wx_1 var30 = var44.lPT2(var47 & 536870911);
                  if (var30 != null) {
                     KC0 var31 = new KC0();
                     if (var29) {
                        if (var27 && var28) {
                           var31.UH0 = true;
                           var31.gY = 3;
                        } else if (var27) {
                           var31.gY = 3;
                        } else if (var28) {
                           var31.gY = 1;
                        } else {
                           var31.oi0 = true;
                           var31.gY = 3;
                        }
                     } else {
                        var31.UH0 = var27;
                        var31.oi0 = var28;
                     }

                     var31.Gy = var30;
                     int var32 = this.Ob ? var39 - 1 - var45 : var45;
                     if (var46 >= 0 && var46 < var42.l30 && var32 >= 0 && var32 < var42.QL) {
                        var42.gm0[var46][var32] = var31;
                     }
                  }
               }
            }

            G10 var48 = var3.uQ("properties");
            if (var48 != null) {
               this.Vd(var42.Nl, var48);
            }

            var2.wg.Ue0(var42);
         }
      } else if (var6.equals("objectgroup")) {
         if (var3.Fk.equals("objectgroup")) {
            FF0 var49 = new FF0();
            G6(var49, var3);
            G10 var50 = var3.uQ("properties");
            if (var50 != null) {
               this.Vd(var49.Nl, var50);
            }

            I2 var51 = var3.m8("object").ZD();

            while (var51.hasNext()) {
               G10 var52 = (G10)var51.next();
               this.Oq0(var1, var49.sP, var52, (float)this.T10);
            }

            var2.wg.Ue0(var49);
         }
      } else if (var6.equals("imagelayer") && var3.Fk.equals("imagelayer")) {
         float var53;
         if (var3.cA != null && var3.cA.fl("offsetx")) {
            var53 = Float.parseFloat(var3.SC("offsetx", "0"));
         } else {
            var53 = Float.parseFloat(var3.SC("x", "0"));
         }

         float var54;
         if (var3.cA != null && var3.cA.fl("offsety")) {
            var54 = Float.parseFloat(var3.SC("offsety", "0"));
         } else {
            var54 = Float.parseFloat(var3.SC("y", "0"));
         }

         if (this.Ob) {
            var54 = (float)this.T10 - var54;
         }

         LPT6_ var55 = null;
         G10 var56 = var3.uQ("image");
         if (var56 != null) {
            var55 = var5.Qq0(OD0(var56.Rf("source"), var4).el());
            var54 -= (float)var55.xZ;
         }

         C5 var57 = new C5(var55, var53, var54);
         G6(var57, var3);
         G10 var33 = var3.uQ("properties");
         if (var33 != null) {
            this.Vd(var57.Nl, var33);
         }

         var2.wg.Ue0(var57);
      }
   }

   public final void Oq0(jt0_0 var1, Hh var2, G10 var3, float var4) {
      if (var3.Fk.equals("object")) {
         WA var5 = null;
         float var6 = 1.0F;
         float var7 = 1.0F;
         float var8 = var3.FB("x", 0.0F) * var6;
         if (this.Ob) {
            var4 -= var3.FB("y", 0.0F);
         } else {
            var4 = var3.FB("y", 0.0F);
         }

         var4 *= var7;
         float var9 = var3.FB("width", 0.0F) * var6;
         float var10 = var3.FB("height", 0.0F) * var7;
         es_1 var11 = var3.mx0;
         if (var11 != null && var11.KB > 0) {
            G10 var12 = var3.uQ("polygon");
            if (var12 != null) {
               String[] var13 = var12.Rf("points").split(" ");
               float[] var14 = new float[var13.length * 2];

               for (int var15 = 0; var15 < var13.length; ++var15) {
                  String[] var16 = var13[var15].split(",");
                  int var17 = var15 * 2;
                  var14[var17] = Float.parseFloat(var16[0]) * var6;
                  float var18 = Float.parseFloat(var16[1]) * var7;
                  var14[var17 + 1] = var18 * (float)(this.Ob ? -1 : 1);
               }

               var5 = new com2__1(new c10_0(var14));
            } else {
               G10 var40 = var3.uQ("polyline");
               if (var40 != null) {
                  String[] var42 = var40.Rf("points").split(" ");
                  float[] var44 = new float[var42.length * 2];

                  for (int var46 = 0; var46 < var42.length; ++var46) {
                     String[] var48 = var42[var46].split(",");
                     int var50 = var46 * 2;
                     var44[var50] = Float.parseFloat(var48[0]) * var6;
                     float var19 = Float.parseFloat(var48[1]) * var7;
                     var44[var50 + 1] = var19 * (float)(this.Ob ? -1 : 1);
                  }

                  var5 = new ci_1(new lv0_0(var44));
               } else if (var3.uQ("ellipse") != null) {
                  float var41 = this.Ob ? var4 - var10 : var4;
                  var5 = new wk0_2(var8, var41, var9, var10);
               }
            }
         }

         if (var5 == null) {
            String var43 = var3.SC("gid", null);
            if (var43 != null) {
               int var45 = (int)Long.parseLong(var43);
               boolean var47 = (var45 & Integer.MIN_VALUE) != 0;
               boolean var49 = (var45 & 1073741824) != 0;
               wx_1 var51 = var1.Ri.lPT2(var45 & 536870911);
               lu_1 var20 = new lu_1(var51, var47, var49);
               var5 = var20;
               var20.hf0.Oa0.WK0("gid", Integer.valueOf(var45));
               var3.FB("width", (float)var20.Va.bz);
               var3.FB("height", (float)var20.Va.xZ);
               var3.FB("rotation", 0.0F);
            } else {
               float var52 = this.Ob ? var4 - var10 : var4;
               var5 = new lpt3__6(var8, var52, var9, var10);
            }
         }

         var3.SC("name", null);
         String var53 = var3.SC("rotation", null);
         if (var53 != null) {
            var5.hf0.Oa0.WK0("rotation", Float.valueOf(Float.parseFloat(var53)));
         }

         String var54 = var3.SC("type", null);
         if (var54 != null) {
            var5.hf0.Oa0.WK0("type", var54);
         }

         int var55 = var3.jB0(0, "id");
         if (var55 != 0) {
            var5.hf0.Oa0.WK0("id", Integer.valueOf(var55));
         }

         var5.hf0.Oa0.WK0("x", Float.valueOf(var8));
         if (var5 instanceof lu_1) {
            var5.hf0.Oa0.WK0("y", Float.valueOf(var4));
         } else {
            if (this.Ob) {
               var4 -= var10;
            }

            var5.hf0.Oa0.WK0("y", Float.valueOf(var4));
         }

         var5.hf0.Oa0.WK0("width", Float.valueOf(var9));
         var5.hf0.Oa0.WK0("height", Float.valueOf(var10));
         var3.jB0(1, "visible");
         G10 var21 = var3.uQ("properties");
         if (var21 != null) {
            this.Vd(var5.hf0, var21);
         }

         this.HD0.qx0(var55, var5);
         var2.DE0.Ue0(var5);
      }
   }

   public final void Vd(Sz0 var1, G10 var2) {
      if (var2.Fk.equals("properties")) {
         I2 var3 = var2.m8("property").ZD();

         while (var3.hasNext()) {
            G10 var4 = (G10)var3.next();
            String var5 = var4.SC("name", null);
            String var6 = var4.SC("value", null);
            String var7 = var4.SC("type", null);
            if (var6 == null) {
               var6 = var4.j0;
            }

            Object var8 = var6;
            if (var7 != null && var7.equals("object")) {
               try {
                   int var9 = Integer.parseInt(var6);
                   this.Ca0.Ue0(new db0_0((f.vd_1)(Object)this, var9, var1, var5));
                } catch (Exception var10) {
                  throw new nf_1(xq_1.pz0("Error parsing property [\" + name + \"] of type \"object\" with value: [", var6, "]"), var10);
               }
            } else {
               if (var7 != null) {
                  if (var7.equals("int")) {
                     var8 = Integer.valueOf(var6);
                  } else if (var7.equals("float")) {
                     var8 = Float.valueOf(var6);
                  } else if (var7.equals("bool")) {
                     var8 = Boolean.valueOf(var6);
                  } else {
                     if (!var7.equals("color")) {
                        throw new nf_1("Wrong type given for property " + var5 + ", given : " + var7 + ", supported : string, bool, int, float, color");
                     }

                     String var11 = var6.substring(3);
                     String var12 = var6.substring(1, 3);
                     var8 = Color.valueOf(var11 + var12);
                  }
               }

               var1.Oa0.WK0(var5, var8);
            }
         }
      }
   }

   public abstract void pG(Dn0 var1, fm0_0 var2, rr_1 var3, es_1 var4, int var5, int var6, int var7, int var8, int var9, String var10, int var11, int var12, String var13, int var14, int var15, Dn0 var16);

   public final es_1 getDependencies(String var1, Dn0 var2, in_0 var3) {
      ee_0 var4 = (ee_0)var3;
      this.ID0 = this.AUX.G4(var2);
      Em0 var5 = new Em0();
      if (var4 != null) {
         var5.f8 = false;
         var5.A30 = var4.Pm;
         var5.YI = var4.yB0;
      }

      return this.xY(var2, var5);
   }
}
