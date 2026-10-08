package cn.pokemmo.net.compress.stream;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class BaseStreamDecompressor {
   public static final dl_1 qf0 = Cq0.E1(BaseStreamDecompressor.class);
   public static boolean kh0 = false;

   public static void Yr(Tk0 var0) throws Exception {
      short[] var1;
      int var2 = (var1 = gh_1.aH0.rf0.sA0()).length;

      for (int var3 = 0; var3 < var2; var3++) {
         short var4 = var1[var3];
         var0.putNextEntry(new ZipEntry(GQ.ti("sprites/itemicons/", var4, ".png")));
         i4_0 var5;
         i4_0 var10001 = var5 = gh_1.aH0.PB(var4, false).R7();
         F40.mu(new YD(var0), var5);
         var10001.dispose();
         var0.closeEntry();
      }
   }

   public static void n50(Tk0 var0) throws Exception {
      Iterator var1 = mp_1.vf0().k2.values().iterator();

      while (var1.hasNext()) {
         cq_0 var2;
         cq_0 var10000 = var2 = (cq_0)var1.next();
         short var3 = var10000.dR;
         if (var10000.uC != he0_1.FM) {
            int var19;
            byte[] var20;
            if ((var19 = var2.Ai) > 0 && var19 < 254) {
               byte[] var55 = var20 = new byte[2];
               var55[0] = 0;
               var55[1] = 1;
            } else if (var19 == 254) {
               (var20 = new byte[1])[0] = 1;
            } else {
               (var20 = new byte[1])[0] = 0;
            }

            for (int var4 = 0; var4 < 2; var4++) {
               for (int var5 = 0; var5 < 2; var5++) {
                  ArrayList<i4_0> var6 = new ArrayList<>();

                  label152:
                  for (int var9 : var20) {
                     yh_0 var10 = yh_0.Xm0;
                     boolean var11 = var4 == 1;
                     boolean var12 = var5 == 1;

                     if (!var10.ak0((byte)var9, var3, var11, var12)) {

                        AG0 var38;
                        i4_0 var44;
                        i4_0 var10001 = var44 = (var38 = var10.Kr0((byte)var9, var3, var11, var12)[0]).f60.R7();
                         int sourceX = var38.wm;
                         int sourceY = var38.Px0;
                         int width = var38.gj;
                         int var13 = var38.g6;
                         i4_0 var14 = new i4_0(width, var13, var44.rH0());
                         i4_0 var60 = var14;
                         byte var15 = 0;
                         byte var16 = 0;
                         var60.XF.bJ(var44.XF, sourceX, sourceY, var15, var16, width, var13);
                        var10001.dispose();

                        for (i4_0 var45 : var6) {
                           if (var14.Rh0().equals(var45.Rh0())) {
                              var14.dispose();
                              continue label152;
                           }
                        }

                        var6.add(var14);
                     }
                  }

                  boolean var33;
                  if (var6.size() > 1) {
                     var33 = true;
                  } else {
                     var33 = false;
                  }

                  for (int var36 = 0; var36 < var6.size(); var36++) {
                     String var41;
                     if (var33) {
                        if (var36 == 0) {
                           var41 = "-m";
                        } else {
                           var41 = "-f";
                        }
                     } else {
                        var41 = "";
                     }

                      ZipEntry var46;
                     StringBuilder var49 = CO.go("sprites/battlesprites/", var3, "-");
                     String var53;
                     if (var4 == 1) {
                        var53 = "back";
                     } else {
                        var53 = "front";
                     }

                     var49 = var49.append(var53).append("-");
                     if (var5 == 1) {
                        var53 = "s";
                     } else {
                        var53 = "n";
                     }

                      var46 = new ZipEntry(var49.append(var53).append(var41).append(".png").toString());
                     var0.putNextEntry(var46);
                     i4_0 var42;
                     i4_0 var59 = var42 = (i4_0)var6.get(var36);
                     F40.mu(new YD(var0), var42);
                     var59.dispose();
                     var0.closeEntry();
                  }
               }
            }
         }
      }

      yh_0 var17 = yh_0.Xm0;
      byte var21 = 0;
      pe0_0 var22;
      if ((var22 = yh_0.Xm0.e80[var21]) == null) {
         var22 = new pe0_0();
      }

      gB(var0, var22, "table-front-scale");
      var21 = 1;
      pe0_0 var24;
      if ((var24 = var17.e80[var21]) == null) {
         var24 = new pe0_0();
      }

      gB(var0, var24, "table-back-scale");
      var21 = 2;
      pe0_0 var26;
      if ((var26 = var17.e80[var21]) == null) {
         var26 = new pe0_0();
      }

      gB(var0, var26, "table-summary-scale");
      if (var17.K90 == null) {
         new SQ();
      }

      var0.putNextEntry(new ZipEntry("sprites/battlesprites/table-coordinate-mods.txt"));
      PrintWriter var18 = new PrintWriter(var0);
      PrintWriter var56 = var18;
      var56.write(";Table which determines coordinate modifications for battle sprites.\r\n");
      var56.write(";Lines starting with ; will be ignored\r\n");
      var56.write(";Please only include values for overriden sprites!\r\n");
      var56.write(
         ";Each entry should be a separate line and contain ID,(FRONT/BACK)=X,Y,Z. Scale is clamped from -1 to 1. Default values for all fields are 0.\r\n"
      );
      var56.write(";X: Negative values push left, positive values push right.\r\n");
      var56.write(";Y: Higher values push up, lower values push down.\r\n");
      var56.write(";Z: Higher values push away from the camera, lower values push towards the camera.\r\n");
      var56.write(";Scale is clamped from -1 to 1.\r\n");
      var56.write(";Example (Altitude mod only, increasing Y by 0.31): 1,front=0,0.31,0\r\n");
      var21 = 2;
      boolean[] var28;
      boolean[] var57 = var28 = new boolean[2];
      var57[0] = false;
      var57[1] = true;
      Iterator var29 = mp_1.vf0().k2.values().iterator();

      while (var29.hasNext()) {
         cq_0 var30;
         if ((var30 = (cq_0)var29.next()).uC != he0_1.FM) {
            short var31 = var30.dR;

            for (int var32 = 0; var32 < var21; var32++) {
               boolean var34 = var28[var32];
               C8 var37;
               if ((var37 = yh_0.Xm0.L4(var31, var34)) != yh_0.Hz0) {
                  StringBuilder var35 = new StringBuilder().append(var31).append(",");
                  String var43;
                  if (var34) {
                     var43 = "back";
                  } else {
                     var43 = "front";
                  }

                  var18.write(var35.append(var43).append("=").append(var37.x).append(",").append(var37.y).append(",").append(var37.z).append("\r\n").toString());
               }
            }
         }
      }

      var18.flush();
      var0.closeEntry();
   }

   public static void gB(Tk0 var0, pe0_0 var1, String var2) throws Exception {
      var0.putNextEntry(new ZipEntry(xq_1.pz0("sprites/battlesprites/", var2, ".txt")));
      PrintWriter var10 = new PrintWriter(var0);
      PrintWriter var10002 = var10;
      var10002.write(";Table which determines scales for battle sprites.\r\n");
      var10002.write(";Lines starting with ; will be ignored\r\n");
      var10002.write(";Please only include values for overriden sprites!\r\n");
      var10002.write(";Each entry should be a separate line and contain ID=SCALE, like \"1=3\" without quotes.\r\n");
      int var3 = var1.Rv;
      short[] var4 = new short[var1.Rv];
      short[] var5 = var1.r7;
      byte[] var6 = var1.Ut;
      int var7 = var1.r7.length;
      int var8 = 0;

      while (true) {
         int var10000 = var7;
         var7 += -1;
         if (var10000 <= 0) {
            for (int var11 = 0; var11 < var3; var11++) {
               short var12 = var4[var11];
               var10.write(var12 + "=" + var1.EW(var12) + "\r\n");
            }

            var10.flush();
            var0.closeEntry();
            return;
         }

         if (var6[var7] == 1) {
            int var9 = var8 + 1;
            var4[var8] = var5[var7];
            var8 = var9;
         }
      }
   }

   public static void Xa(Tk0 var0) throws Exception {
      String[] var1;
      String[] var10000 = var1 = new String[2];
      var10000[0] = "-m";
      var10000[1] = "-f";
      short var2 = 712;

      for (short var3 = 0; var3 < var2; var3++) {
         boolean var4;
         byte var5;
         if (var4 = yh_0.HG0.j4(var3, false)) {
            var5 = 2;
         } else {
            var5 = 1;
         }

         for (byte var6 = 0; var6 < var5; var6++) {
            AG0[] var7 = yh_0.Xm0.qC0(var3, var6, false);

            for (int var8 = 0; var8 < var7.length; var8++) {
               String var9;
               if (var4) {
                  var9 = var1[var6];
               } else {
                  var9 = "";
               }

               var0.putNextEntry(new ZipEntry("sprites/monstericons/" + var3 + "-" + var8 + var9 + ".png"));
               AG0 var10001 = var7[var8];
               AG0 var10002 = var7[var8];
               AG0 var10003 = var7[var8];
               i4_0 var17 = var7[var8].f60.R7();
               int var10 = var10002.wm;
               int var11 = var10003.Px0;
               int var12 = var10002.gj;
               int var13 = var10001.g6;
               i4_0 var14 = new i4_0(var12, var13, var17.rH0());
               i4_0 var18 = var14;
               byte var15 = 0;
               byte var16 = 0;
               var14.XF.bJ(var17.XF, var10, var11, var15, var16, var12, var13);
               var17.dispose();
               F40.mu(new YD(var0), var14);
               var18.dispose();
               var0.closeEntry();
            }
         }
      }
   }

   public static void Nj(Tk0 var0) throws Exception {
      for (byte var1 = 0; var1 < 5; var1++) {
         H40 var2;
         int[] var8;
         if ((var2 = (H40)ZU.kB.Vp0.BM(var1)) == null) {
            var8 = new int[0];
         } else {
            var8 = var2.Com3.Zw0();
         }

         for (int var5 : var8) {
            H40 var6;
            Wr var10;
            if ((var6 = (H40)ZU.kB.Vp0.BM(var1)) == null) {
               var10 = Wr.Mk0;
            } else {
               Wr var7;
               if ((var7 = (Wr)var6.dp0.get(var5)) == null) {
                  var7 = (Wr)var6.Com3.get(var5);
               }

               if (var7 == null) {
                  var10 = Wr.Mk0;
               } else {
                  var10 = var7;
               }
            }

            var0.putNextEntry(new ZipEntry("sprites/trainersprites/" + var1 + "/" + var5 + ".png"));
            i4_0 var9;
            i4_0 var10001 = var9 = var10.R7();
            F40.mu(new YD(var0), var9);
            var10001.dispose();
            var0.closeEntry();
         }
      }
   }

   public static void uf(Tk0 var0) throws Exception {
      byte var1 = 2;
      byte[] var2;
      byte[] var10000 = var2 = new byte[2];
      var10000[0] = 0;
      var10000[1] = 1;

      for (int var3 = 0; var3 < var1; var3++) {
         byte var4 = var2[var3];
         int[] var5;
         int var6 = (var5 = ((to_0)QI.Py.s10.BM(var4)).X80.Zw0()).length;

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = var5[var7];
            ht_0 var9 = QI.Py.kN(var4, var8, false);

            for (int var10 = 0; var10 < 1000 && var9.XC(var10); var10++) {
               var0.putNextEntry(
                  new ZipEntry(fp0_0.uD(new StringBuilder("sprites/overworldsprites/").append(var4).append("/").append(var8).append("-"), var10, ".png"))
               );
               i4_0 var11;
               i4_0 var10001 = var11 = var9.li0(var10).R7();
               F40.mu(new YD(var0), var11);
               var10001.dispose();
               var0.closeEntry();
            }
         }
      }

      w7_0 var12 = tw0_0.Ll0.Qz0.Ao0;
      tw0_0.Ll0.Qz0.Ao0.getClass();
      new M(var12);
      V3 var16;
      var16 = new V3(var12);

      while (var16.hasNext()) {
         ej_1 var13;
         if ((var13 = (ej_1)var16.u7()).JZ == 1) {
            Wr[] var17 = var13.TK;
            if (var13.TK.length >= 1) {
               for (int var18 = 0; var18 < var17.length; var18++) {
                  StringBuilder var10006 = new StringBuilder("sprites/overworldsprites/2/");
                  tw0_0.Ll0.Qz0.getClass();
                  var0.putNextEntry(new ZipEntry(var10006.append(var13.p00).append("-").append(var18).append(".png").toString()));
                  i4_0 var19;
                  i4_0 var22 = var19 = var17[var18].R7();
                  F40.mu(new YD(var0), var19);
                  var22.dispose();
                  var0.closeEntry();
               }
            }
         }
      }

      Ts var14 = tw0_0.Ll0.nC0;
      if (tw0_0.Ll0.nC0 != null) {
         w7_0 var20 = var14.Sn;
         var14.Sn.getClass();
          var20.eQ((short var1x, Object rawFrames) -> {
             Wr[] var2x = (Wr[])rawFrames;
             if (var2x.length < 1) {
               return true;
            }

            for (int var3x = 0; var3x < var2x.length; var3x++) {
               ZipOutputStream var10000x = var0;
               Wr[] var10001x = var2x;
               int var10002 = var3x;
               ZipOutputStream var10003 = var0;
               StringBuilder var10006x = new StringBuilder("sprites/overworldsprites/3/");
               tw0_0.Ll0.nC0.getClass();
               ZipEntry var10004 = new ZipEntry(var10006x.append(var1x).append("-").append(var3x).append(".png").toString());

                try {
                   var10003.putNextEntry(var10004);
                   i4_0 image = var10001x[var10002].R7();
                   try {
                      F40.mu(new YD(var0), image);
                   } finally {
                      image.dispose();
                   }
                   var10000x.closeEntry();
                } catch (IOException exception) {
                   exception.printStackTrace();
                   return false;
                }
            }

            return true;
         });
      }

      UY var15 = tw0_0.Ll0.t1;
      if (tw0_0.Ll0.t1 != null) {
         w7_0 var21 = var15.GY;
         var15.GY.getClass();
          var21.eQ((short var1x, Object rawFrames) -> {
            Wr[] var2x = (Wr[])rawFrames;
            if (var2x.length < 1) {
               return true;
            }

            for (int var3x = 0; var3x < var2x.length; var3x++) {
               ZipOutputStream var10000x = var0;
               Wr[] var10001x = var2x;
               int var10002 = var3x;
               ZipOutputStream var10003 = var0;
               StringBuilder var10006x = new StringBuilder("sprites/overworldsprites/4/");
               tw0_0.Ll0.t1.getClass();
               ZipEntry var10004 = new ZipEntry(var10006x.append(var1x).append("-").append(var3x).append(".png").toString());

                try {
                   var10003.putNextEntry(var10004);
                   i4_0 image = var10001x[var10002].R7();
                   try {
                      F40.mu(new YD(var0), image);
                   } finally {
                      image.dispose();
                   }
                   var10000x.closeEntry();
                } catch (IOException exception) {
                   exception.printStackTrace();
                   return false;
                }
            }

            return true;
         });
      }
   }

   public static void ez(Tk0 var0) throws Exception {
      Iterator var1 = mp_1.vf0().k2.values().iterator();

      while (var1.hasNext()) {
         cq_0 var2;
         short var3;
         byte[] var4;
         if ((var3 = (var2 = (cq_0)var1.next()).dR) >= 1 && var3 <= 649 && (var4 = di0_0.ts(var3)) != null && var4.length >= 1) {
            var0.putNextEntry(new ZipEntry(fp0_0.uD(new StringBuilder("cries/"), var2.dR, ".wav")));
            var0.write(var4);
            var0.closeEntry();
         }
      }
   }

   public static void ZH(Tk0 var0) throws Exception {
      var0.putNextEntry(new ZipEntry("info.xml"));
      Document var1;
      Document var10001 = var1 = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
      Element var10002 = var10001.createElement("resource");
      var10002.setAttribute("name", "Dumped Resources");
      var10002.setAttribute("version", "0.0");
      var10002.setAttribute("description", "Directly dumped resources.");
      var10002.setAttribute("author", "--");
      var10002.setAttribute("weblink", "");
      var10001.appendChild(var10002);
      Transformer var4 = TransformerFactory.newInstance().newTransformer();
      DOMSource var2;
      var2 = new DOMSource(var1);
      StreamResult var3;
      var3 = new StreamResult(var0);
      var4.setOutputProperty("indent", "yes");
      var4.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      var4.transform(var2, var3);
      var0.closeEntry();
   }

   public static void X90(Tk0 var0) throws Exception {
      sg_1 var2 = sg_1.Ed;
      gp_1 var1 = new gp_1(var2);
      StringWriter var3;
      var3 = new StringWriter();
      x9_0 var4;
      var4 = new x9_0(var3);
      var1.tU = var2;
      var1.Zx(var4);
      var1.LV();
      ArrayList var10000 = new ArrayList(mp_1.vf0().k2.values());
      Collections.sort(var10000, Comparator.comparingInt(cq_0::Nm));
      Iterator var13 = var10000.iterator();

      while (var13.hasNext()) {
         cq_0 var14;
         if ((var14 = (cq_0)var13.next()).dR >= 1 && var14.uC != he0_1.FM) {
            var1.cQ();
            String var17 = "id";
            var1.v80(var14.dR, var17);
            String var18 = "name";
            var1.v80(var14.Ay(false), var18);
            String var19 = "exp_type";
            var1.v80(var14.yw.id0, var19);
            String var20 = "obtainable";
            var1.v80(var14.jD ^ true, var20);
            String var21 = "gender_ratio";
            var1.v80(var14.Ai, var21);
            String var22 = "height";
            var1.v80(var14.vF, var22);
            String var23 = "weight";
            var1.v80(var14.Cu0, var23);
            var1.Sm0("egg_groups");
            au_1 var24 = var14.B2;
            au_1 var5 = var14.Cw;
            au_1[] var42;
            if (var14.B2 == var14.Cw) {
               (var42 = new au_1[1])[0] = var24;
            } else {
               au_1[] var6;
               au_1[] var95 = var6 = new au_1[2];
               var95[0] = var24;
               var95[1] = var5;
               var42 = var6;
            }

            int var25 = var42.length;

            for (int var64 = 0; var64 < var25; var64++) {
               String var7;
               if ((var7 = sm0_0.c0(var42[var64].zc + 181000).toLowerCase()) == null) {
                  var1.XH(var7, null, null);
               } else {
                  Class var8 = var7.getClass();
                  var1.XH(var7, var8, null);
               }
            }

            var1.xy();
            var1.Sm0("abilities");

            for (int var26 = 0; var26 < 3; var26++) {
               var1.cQ();
               var1.v80(var14.Lh(var26), "id");
               var1.v80(sm0_0.c0(var14.Lh(var26) + 210000), "name");
               var1.d10();
            }

            var1.xy();
            if (var14.kT == null) {
               var1.Sm0("forms");

               for (byte var27 = 0; var27 < var14.ar; var27++) {
                  var1.cQ();
                  cq_0 var43;
                  if (var14.iv0 > 0 && var27 > 0) {
                     mp_1 var96 = mp_1.vf0();
                     short var44 = (short)(var14.iv0 + var27 - 1);
                     var43 = (cq_0)var96.k2.get(var44);
                  } else {
                     var43 = var14;
                  }

                  var1.v80(var27, "form_id");
                  String var28 = "id";
                  var1.v80(var43.dR, var28);
                  var1.v80(var43.Ay(true), "name");
                  var1.d10();
               }

               var1.xy();
            }

            var1.Sm0("evolutions");

            for (Iterator var29 = var14.Xn.iterator(); var29.hasNext(); var1.d10()) {
               P80 var45;
               P80 var98 = var45 = (P80)var29.next();
               var1.cQ();
               String var65 = "id";
               var1.v80(var98.YS, var65);
               var65 = "name";
               mp_1 var78 = mp_1.vf0();
               var1.v80(((cq_0)var78.k2.get(var98.YS)).Ay(false), var65);
               var65 = "type";
               var1.v80(var98.RH0.name(), var65);
               var65 = "val";
               var1.v80(var98.I0, var65);
               int var69;
               if ((var69 = var98.RH0.ordinal()) != 6 && var69 != 8) {
                  switch (var69) {
                     case 17:
                     case 18:
                     case 19:
                     case 20:
                        break;
                     default:
                        continue;
                  }
               }

               var65 = "item_name";
               var1.v80(sm0_0.c0(gu0.l2.lPT6((short)var45.I0).Nl), var65);
            }

            var1.xy();
            var1.Sm0("moves");

            for (Object rawMove : var14.WC) {
               pu0_0 var99 = (pu0_0)rawMove;
               var1.cQ();
               String var46 = "id";
               var1.v80(var99.HA0, var46);
               String var47 = "name";
               ec0_2 var71 = ec0_2.Sx();
               var1.v80(sm0_0.c0(((vk0_1)var71.f4.f5(var99.HA0)).bt), var47);
               var1.v80("level", "type");
               String var48 = "level";
               var1.v80(var99.yL, var48);
               var1.d10();
            }

            Wx0[] var31 = Wx0.h90;
            int var49 = Wx0.h90.length;

            for (int var72 = 0; var72 < var49; var72++) {
               Wx0 var79 = var31[var72];
               short[] var85;
               int var9 = (var85 = var14.G60(var79)).length;

               for (int var10 = 0; var10 < var9; var10++) {
                  short var11;
                  short var10001 = var11 = var85[var10];
                  var1.cQ();
                  var1.v80(var10001, "id");
                  String var12 = "name";
                  var1.v80(sm0_0.c0(((vk0_1)ec0_2.Sx().f4.f5(var11)).bt), var12);
                  String var94 = "type";
                  var1.v80(sm0_0.c0(var79.Jn + 1750), var94);
                  var1.d10();
               }
            }

            var1.xy();
            var1.Sm0("types");
            String var32;
            if ((var32 = var14.OE0((byte)-1).toString()) == null) {
               var1.XH(var32, null, null);
            } else {
               Class var50 = var32.getClass();
               var1.XH(var32, var50, null);
            }

            String var33;
            if ((var33 = var14.F70((byte)-1).toString()) == null) {
               var1.XH(var33, null, null);
            } else {
               Class var51 = var33.getClass();
               var1.XH(var33, var51, null);
            }

            var1.xy();
            var1.Zc("stats");
            gc_2[] var34 = gc_2.Wp;
            int var52 = gc_2.Wp.length;

            for (int var73 = 0; var73 < var52; var73++) {
               gc_2 var80;
               String var86 = (var80 = var34[var73]).name().toLowerCase();
               var1.v80(var14.Fb(var80), var86);
            }

            var1.d10();
            var1.Zc("yields");
            String var35 = "exp";
            var1.v80(var14.AT, var35);
            gc_2[] var36 = gc_2.Wp;
            int var53 = gc_2.Wp.length;

            for (int var74 = 0; var74 < var53; var74++) {
               gc_2 var81 = var36[var74];
               String var87 = "ev_" + var81.name().toLowerCase();
               var1.v80(var14.HG0[var81.v10], var87);
            }

            var1.d10();
            var1.Sm0("tiers");
            String var37;
            if ((var37 = sm0_0.c0(var14.gq0.R5)) == null) {
               var1.XH(var37, null, null);
            } else {
               Class var54 = var37.getClass();
               var1.XH(var37, var54, null);
            }

            Iterator var38 = var14.lD.iterator();

            while (var38.hasNext()) {
               String var55;
               if ((var55 = sm0_0.c0(((N2)var38.next()).R5)) == null) {
                  var1.XH(var55, null, null);
               } else {
                  Class var75 = var55.getClass();
                  var1.XH(var55, var75, null);
               }
            }

            var1.xy();
            var1.Sm0("held_items");
            short[] var39 = var14.rA0;
            int var56 = var14.rA0.length;

            for (int var76 = 0; var76 < var56; var76++) {
               short var82;
               short var100 = var82 = var39[var76];
               var1.cQ();
               var1.v80(var100, "id");
               String var88 = "name";
               var1.v80(sm0_0.c0(gu0.l2.lPT6(var82).Nl), var88);
               var1.d10();
            }

            var1.xy();
            var1.Sm0("locations");
            dh0_0 var40 = dh0_0.FK0;
            short var15 = var14.dR;
            hc_1 var57;
            if ((var57 = (hc_1)dh0_0.FK0.r10.f5(var15)) == null) {
               var57 = new hc_1(var15);
               var40.r10.coM4(var15, var57);
            }

            var10000 = var57.hp0;
            Collections.sort(var57.hp0);

            for (Object rawLocation : var10000) {
               OD var41 = (OD)rawLocation;
               var1.cQ();
               String var58 = sm0_0.c0(var41.Bx.n10);
               String var77 = "???";
               if (var41.CV((short)1)) {
                  var77 = sm0_0.c0(1774);
               }

               if (var41.CV((short)2)) {
                  var77 = sm0_0.c0(1782);
               } else if (var41.CV((short)4)) {
                  var77 = sm0_0.c0(1783);
               } else if (var41.CV((short)8)) {
                  var77 = sm0_0.c0(1784);
               } else if (var41.CV((short)16)) {
                  var77 = sm0_0.c0(1773);
               } else if (var41.CV((short)64)) {
                  var77 = sm0_0.c0(1795);
               } else if (var41.CV((short)128)) {
                  var77 = sm0_0.c0(1799);
               } else if (var41.CV((short)256)) {
                  var77 = sm0_0.c0(1794);
               }

               String var83 = sm0_0.hL0(var41.wD0 * 1000 + 140000 + (var41.Tv0 & 255), "???");
               if (var41.CV((short)32)) {
                  var83 = sm0_0.c0(1798);
                  var58 = var83;
               }

               if (var41.COM5()) {
                  ArrayList var89;
                  var89 = new ArrayList();
                  if (var41.E50((byte)1)) {
                     var89.add(sm0_0.c0(ZJ0.qL(ZJ0.jw0)));
                  }

                  if (var41.E50((byte)2)) {
                     var89.add(sm0_0.c0(ZJ0.qL(ZJ0.Ih0)));
                  }

                  if (var41.E50((byte)4)) {
                     var89.add(sm0_0.c0(ZJ0.qL(ZJ0.Pw)));
                  }

                  if (var41.vp > -1) {
                     var89.add("SEASON" + var41.vp);
                  }

                  if (var89.size() > 0) {
                      StringBuilder var90 = new StringBuilder();
                     StringBuilder var10002 = var90;
                     var10002.append(var83);
                     var10002.append(" (");
                     int var84 = var89.size();
                     Iterator var93 = var89.iterator();

                     while (var93.hasNext()) {
                        var90.append((String)var93.next());
                        if (var84 > 1) {
                           var90.append("/");
                           var84--;
                        }
                     }

                     var90.append(")");
                     var83 = var90.toString();
                  }
               }

               int var91;
                if ((var91 = tmType(var41.Bx.wx0)) != 1) {
                  if (var91 == 2) {
                     byte var59 = var41.Ks0;
                     if (var41.Ks0 < 0) {
                        var59 = 2;
                     }

                     var58 = sm0_0.c0(var59 + 245445);
                  }
               } else {
                  byte var92 = var41.Ks0;
                  if (var41.Ks0 != 1) {
                     if (var92 == 2) {
                        var58 = sm0_0.c0(1793);
                     }
                  } else {
                     var58 = sm0_0.c0(1792);
                  }
               }

               var1.v80(var58, "type");
               String var60 = "region_id";
               var1.v80(var41.wD0, var60);
               String var61 = "region_name";
               var1.v80(sm0_0.c0(var41.wD0 + 250000), var61);
               var1.v80(var83, "location");
               String var62 = "min_level";
               var1.v80(var41.cc, var62);
               String var63 = "max_level";
               var1.v80(var41.f50, var63);
               var1.v80(var77, "rarity");
               var1.d10();
            }

            var1.xy();
            var1.d10();
         }
      }

      var1.xy();
      String var104 = var1.Z00(var1.FO.Xi0.toString());
      var0.putNextEntry(new ZipEntry("info/monsters.json"));
      var0.write(var104.getBytes(StandardCharsets.UTF_8));
      var0.closeEntry();
   }

   public static void TL(Tk0 var0) throws Exception {
       gp_1 var1 = new gp_1(sg_1.Ed);
       gp_1 var10000 = var1;
       sg_1 var2 = sg_1.Ed;
      StringWriter var4;
      var4 = new StringWriter();
      x9_0 var3;
      var3 = new x9_0(var4);
      var10000.tU = var2;
      var10000.Zx(var3);
      var10000.LV();
      ArrayList var16 = new ArrayList(ec0_2.Sx().Com6());
      Collections.sort(var16, Comparator.comparingInt(vk0_1::oC0));
      Iterator var5 = var16.iterator();

      while (var5.hasNext()) {
         vk0_1 var6;
         if ((var6 = (vk0_1)var5.next()).hC0 >= 1 && !var6.Kq0()) {
            var1.cQ();
            String var7 = "id";
            var1.v80(var6.hC0, var7);
            String var8 = "name";
            var1.v80(sm0_0.c0(var6.bt), var8);
            var1.v80(var6.Pl(false).toString(), "skill_damage_type");
            String var9 = "base_power";
            var1.v80(var6.X00, var9);
            String var10 = "base_accuracy";
            var1.v80(var6.mt0, var10);
            String var11 = "base_pp";
            var1.v80(var6.Gn(false), var11);
            String var12 = "priority";
            var1.v80(var6.Tp, var12);
            String var13 = "type";
            var1.v80(var6.oG(null, null).toString(), var13);
            String var14 = "target_type";
            var1.v80(var6.g5, var14);
            String var15 = "true_damage";
            var1.v80(var6.continue$, var15);
            var1.d10();
         }
      }

      var1.xy();
      String var17 = var1.Z00(var1.FO.Xi0.toString());
      var0.putNextEntry(new ZipEntry("info/skills.json"));
      var0.write(var17.getBytes(StandardCharsets.UTF_8));
      var0.closeEntry();
   }

   public static void Uk(Tk0 var0) throws Exception {
       gp_1 var1 = new gp_1(sg_1.Ed);
       gp_1 var10000 = var1;
       sg_1 var2 = sg_1.Ed;
      StringWriter var4;
      var4 = new StringWriter();
      x9_0 var3;
      var3 = new x9_0(var4);
      var10000.tU = var2;
      var10000.Zx(var3);
      var10000.LV();
      ArrayList var13 = new ArrayList(gu0.l2.Pd0.values());
      Collections.sort(var13, Comparator.comparingInt(mc0_1::rX));
      Iterator var5 = var13.iterator();

      while (var5.hasNext()) {
         mc0_1 var6;
         if ((var6 = (mc0_1)var5.next()).Z8 >= 1) {
            var1.cQ();
            String var7 = "id";
            var1.v80(var6.Z8, var7);
            String var8 = "name";
            var1.v80(sm0_0.c0(var6.Nl), var8);
            String var9 = "desc";
            var1.v80(var6.Com4((byte)-1, 38), var9);
            String var10 = "region_id";
            var1.v80(var6.PX, var10);
            var1.v80(var6.V4(), "icon_id");
            String var11 = "name_string_id";
            var1.v80(var6.Nl, var11);
            String var12 = "desc_string_id";
            var1.v80(var6.Fv, var12);
            var1.d10();
         }
      }

      var1.xy();
      String var14 = var1.Z00(var1.FO.Xi0.toString());
      var0.putNextEntry(new ZipEntry("info/items.json"));
      var0.write(var14.getBytes(StandardCharsets.UTF_8));
      var0.closeEntry();
   }

   private static int tmType(int index) {
      try {
         Class<?> tableClass = Class.forName("f.tm_1");
         java.lang.reflect.Field tableField = tableClass.getDeclaredField("e9");
         return ((int[])tableField.get(null))[index];
      } catch (ReflectiveOperationException | RuntimeException ignored) {
         return 0;
      }
   }
}
