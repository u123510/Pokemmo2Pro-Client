package cn.pokemmo.text.localization;

import f.*;

import java.nio.ByteBuffer;
import java.text.NumberFormat;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class LocalizationMessageFormatter {
   public static final String[] zb0;
   public static final EnumMap<IL, String> cOm5;
   public static final int[][][] rn0;
   public static final int[][][] td0;
   public static final int[][][] yL0;
   public static final SQ cU;
   public static final ld_0 n6;
   public static final xm_0[][] Q6;

   public static void Tk(nj0_0 var0) {
      if (var0 == null) {
         return;
      }

      lpt6__2 var1 = lpt6__2.Q80;
      xm_0 var2 = var0.VB0(var1);
      lpt6__2 var3Lang = lpt6__2.YG0;
      xm_0 var4Table = var0.VB0(var3Lang);
      Q6[2][var1.UB0] = var2;
      Q6[2][var3Lang.UB0] = var4Table;

      try {
         String[] var5 = zb0;
         String var3 = Bw((byte)2, var1, 92, 3, var5);
         String var4 = Bw((byte)2, var1, 92, 5, var5);
         String var6 = Bw((byte)2, var1, 92, 6, var5);
         String var7 = Bw((byte)2, var1, 89, 46, var5);
         String var8 = Bw((byte)2, var1, 92, 4, var5);
         if (var7.contains(" ")) {
            String[] var9 = var7.split(" ");
            int var10 = 0;
            if (var0.pG0().equals("it")) {
               var10 = 2;
            }

            if (var10 >= var9.length) {
               var10 = var9.length - 1;
            }

            var7 = var9[var10];
         }

         if (var0.pG0().equals("ko")) {
            var3 = var3.substring(0, 2);
            var4 = var4.substring(0, 2);
            var6 = var6.substring(0, 2);
            var7 = var7.substring(var7.length() - 3, var7.length() - 1);
         }

         if (var0.pG0().equals("ja")) {
            var3 = var3.substring(0, var3.length() - 1);
            var4 = var4.substring(0, var4.length() - 1);
            var6 = var6.substring(0, var6.length() - 1);
            var7 = Bw((byte)2, var1, 53, 164, var5).substring(0, 6);
         }

         if (var7.startsWith("d'") && var7.length() > 2) {
            var7 = var7.substring(2);
         }

         Tm0(250000, var3);
         Tm0(250001, var4);
         Tm0(250003, var6);
         Tm0(250002, hs(var7, null));
         Tm0(250004, var8);
      } catch (Exception var18) {
         var18.printStackTrace();
      }

      lpt6__2 var19 = lpt6__2.Q80;
      String[] var20 = zb0;
      Tm0(0, tx_1.rX(Bw((byte)2, var19, 34, 2, var20)));
      Tm0(1, tx_1.rX(Bw((byte)2, var19, 34, 1, var20)));
      Tm0(2, tx_1.rX(Bw((byte)2, var19, 17, 7, var20)));
      Tm0(3, Bw((byte)2, var19, 55, 2, var20));
      Tm0(4, Bw((byte)2, var19, 55, 3, var20));
      Tm0(12, Bw((byte)2, var19, 90, 14, var20));
      a7(150000, var2.Sd(70));
      a7(210000, var2.Sd(182));
      a7(220000, var2.Sd(183));
      a7(120000, var2.Sd(202));
      a7(110000, var2.Sd(203));
      a7(190240, var2.Sd(191));
      a7(135000, var2.Sd(53));
      a7(245000, var2.Sd(54));
      a7(180000, var2.Sd(24));
      a7(142000, var2.Sd(89));
      i40_0[] var21 = i40_0.for$;
      int var22 = var21.length;

      for (int var23 = 0; var23 < var22; ++var23) {
         i40_0 var24 = var21[var23];
         if (var24 == i40_0.g50) {
            Tm0(var24.j40 + 230000, "???");
         } else {
            Tm0(var24.j40 + 230000, Bw((byte)2, lpt6__2.Q80, 199, var24.mu, zb0));
         }
      }

      Wx0 var25 = Wx0.zE0;
      Tm0(1754, Ft0(c0(245328), "??", "[0-9０-９,]{2,10}(?!\\})"));
      Tm0(201000, Q6[2][lpt6__2.Q80.UB0].ra0(157, 0, 41));
      Tm0(201001, Q6[2][lpt6__2.Q80.UB0].ra0(157, 0, 42));
      Tm0(201007, Q6[2][lpt6__2.Q80.UB0].ra0(157, 0, 43));
      Tm0(200244, Bw((byte)2, lpt6__2.Q80, 15, 82, zb0));
   }

   public static void TK(int var0) {
      lpt6__2 var2 = lpt6__2.Q80;
      String[] var3 = zb0;
      String var1 = Bw((byte)4, var2, var0, 0, var3);
      xm_0 var4 = jP((byte)4, var2);

      for (int var5 = 0; var5 < 2; ++var5) {
         int var6 = var4.E1(var0);
         int var7;
         if (var6 >= 0 && var6 < var4.ul0.length) {
            if (var4.ul0[var6] == null) {
               var4.VJ0(var6);
            }

            if (var5 >= 0 && var5 < var4.ul0[var6].length) {
               var7 = var4.ul0[var6][var5].length;
            } else {
               var7 = 0;
            }
         } else {
            var7 = 0;
         }

         for (int var8 = 1; var8 < var7; ++var8) {
            String var9 = var4.ra0(var0, var5, var8);
            if (!var9.startsWith(var1)) {
               var4.x30(var0, var5, var1 + ": " + var9, var8);
            }
         }
      }
   }

   public static void xn0() {
      xm_0 var0 = jP((byte)2, lpt6__2.YG0);
      xm_0 var1 = jP((byte)2, lpt6__2.Q80);
      int var2 = var1.D40 ? xm_0.kt0 : 0;

      for (int var3 = 0; var3 < 2; ++var3) {
         String var4 = Xp(var0.ra0(110, var3, 2), (short)5033);
         var0.x30(110, var3, var4, 2);
         var4 = Xp(var0.ra0(464, var3, 6), (short)5030);
         var0.x30(464, var3, var4, 6);
         var4 = Xp(var0.ra0(464, var3, 7), (short)5031);
         var0.x30(464, var3, var4, 7);
         var4 = Xp(var0.ra0(464, var3, 8), (short)5032);
         var0.x30(464, var3, var4, 8);
         var4 = Xp(var0.ra0(38, var3, 9), (short)5591);
         var0.x30(38, var3, var4, 9);
         Iterator var5 = gu0.l2.Pd0.values().iterator();

         while (var5.hasNext()) {
            mc0_1 var6 = (mc0_1)var5.next();
            if (var6.PX == 2) {
               if (var6.tX > 0 && !var6.CJ0) {
                  String var7 = Ft0(var1.ra0(53, var3, var6.Z8 - 5000), (new StringBuilder()).append(var6.tX).append("").toString(), "[0-9０-９,]{2,10}(?!\\})");
                  var1.x30(53, var3, var7, var6.Z8 - 5000);
                  if (var3 == var2) {
                     kE0(var6.Z8 + 130000, var7);
                  }
               }

               if (var6.ia0 > 0) {
                  String var8 = Ft0(var1.ra0(53, var3, var6.Z8 - 5000), (new StringBuilder()).append(var6.ia0).append("").toString(), "[0-9０-９,]{2,10}(?!\\})");
                  var1.x30(53, var3, var8, var6.Z8 - 5000);
                  if (var3 == var2) {
                     kE0(var6.Z8 + 130000, var8);
                  }
               }
            }
         }

         for (int var9 = 0; var9 < rn0.length; ++var9) {
            int[][] var10 = rn0[var9];

            for (int var11 = 0; var11 < var10.length; ++var11) {
               int[] var12 = var10[var11];
               String var13 = Ft0(var0.ra0(var12[0], var3, var12[1]), String.valueOf(md_1.U1((byte)2, (byte)var9, null)), "[0-9０-９,]{2,10}(?!\\})");
               var0.x30(var12[0], var3, var13, var12[1]);
            }
         }
      }

      var0 = jP((byte)3, lpt6__2.Q80);
      String var14 = Ft0(var0.ra0(147, 0, 2), Integer.toString(250), "[0-9０-９,]{4}");
      var0.x30(147, 0, var14, 2);
      var14 = Xp(var0.ra0(154, 0, 8), (short)5042);
      var0.x30(154, 0, var14, 8);
      var14 = Xp(var0.ra0(484, 0, 1), (short)5033);
      var0.x30(484, 0, var14, 1);
      var14 = Xp(var0.ra0(255, 0, 10), (short)5094);
      var0.x30(255, 0, var14, 10);
      var14 = Xp(var0.ra0(361, 0, 219), (short)5030);
      var0.x30(361, 0, var14, 219);
      var14 = Xp(var0.ra0(361, 0, 220), (short)5031);
      var0.x30(361, 0, var14, 220);
      var14 = Xp(var0.ra0(361, 0, 221), (short)5032);
      var0.x30(361, 0, var14, 221);

      for (int var15 = 0; var15 < td0.length; ++var15) {
         int[][] var16 = td0[var15];

         for (int var17 = 0; var17 < var16.length; ++var17) {
            int[] var18 = var16[var17];
            String var19 = Ft0(var0.ra0(var18[0], 0, var18[1]), String.valueOf(md_1.U1((byte)2, (byte)var15, null)), "[0-9０-９,]{2,10}(?!\\})");
            var0.x30(var18[0], 0, var19, var18[1]);
         }
      }

      String var20 = wa0(16777239, NumberFormat.getInstance().format(25000L));

      for (int var21 = 0; var21 < 5; ++var21) {
         int var22 = var21 * 3 + 20;
         String var23 = var0.ra0(96, 0, var22) + "\n" + var20;
         var0.x30(96, 0, var23, var22);
      }

      var0 = jP((byte)4, lpt6__2.Q80);
      var14 = Xp(var0.ra0(191, 0, 209), (short)5030);
      var0.x30(191, 0, var14, 209);
      var14 = Xp(var0.ra0(191, 0, 210), (short)5031);
      var0.x30(191, 0, var14, 210);
      var14 = Xp(var0.ra0(191, 0, 211), (short)5032);
      var0.x30(191, 0, var14, 211);
      var14 = Xp(var0.ra0(397, 0, 1), (short)5033);
      var0.x30(397, 0, var14, 1);

      for (int var24 = 0; var24 < yL0.length; ++var24) {
         int[][] var25 = yL0[var24];

         for (int var26 = 0; var26 < var25.length; ++var26) {
            int[] var27 = var25[var26];
            String var28 = Ft0(var0.ra0(var27[0], 0, var27[1]), String.valueOf(md_1.U1((byte)4, (byte)var24, null)), "[0-9０-９,]{2,10}(?!\\})");
            var0.x30(var27[0], 0, var28, var27[1]);
         }
      }

      String var29 = Ft0(var0.ra0(246, 0, 14), "60", "[0-9０-９,]{2,10}(?!\\})");
      var0.x30(246, 0, var29, 14);
      var29 = Ft0(var0.ra0(246, 0, 15), "60", "[0-9０-９,]{2,10}(?!\\})");
      var0.x30(246, 0, var29, 15);
   }

   public static String Xp(String var0, short var1) {
      return Ft0(var0, (new StringBuilder()).append(gu0.l2.lPT6(var1).TD).append("").toString(), "[0-9０-９,]{2,10}(?!\\})");
   }

   public static String Ft0(String var0, String var1, String var2) {
      char[] var3 = var0.toCharArray();
      int var4 = var3.length;

      for (int var5 = 0; var5 < var4; ++var5) {
         if (Character.UnicodeBlock.of(var3[var5]) == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
            char[] var6 = var1.toCharArray();

            for (int var7 = 0; var7 < var6.length; ++var7) {
               var6[var7] = (char)(var6[var7] + 65248);
            }

            var1 = new String(var6);
            break;
         }
      }

      return var0.replaceAll(var2, var1);
   }

   public static void a7(int var0, String[] var1) {
      for (int var2 = 0; var2 < var1.length; ++var2) {
         Tm0(var0 + var2, var1[var2]);
      }
   }

   public static String hs(String var0, String var1) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var0.length(); ++var3) {
         char var4 = var0.charAt(var3);
         if (!Character.isLetter(var4) && (var1 == null || var1.isEmpty() || !var1.contains((new StringBuilder()).append(var4).append("").toString()))) {
            break;
         }

         var2.append(var4);
      }

      return var2.toString();
   }

   public static void pp(ByteBuffer var0, int var1, int var2, int var3) {
      int var4 = -1;
      if (var1 < 1) {
         return;
      }

      var0.position(var1);
      var1 = 0;

      while (var1 < var2 || var2 < 0) {
         if (var2 < 0) {
            if (var0.get() == (byte)var4) {
               var0.position(var0.position() - 1);
               return;
            }

            var0.position(var0.position() - 1);
         }

         int var5 = var3 + 1;
         mz_1.A10.getClass();
         StringBuilder var6 = new StringBuilder();

         while (true) {
            byte var7 = var0.get();
            if (var7 == -1) {
               Tm0(var3, var6.toString());
               ++var1;
               var3 = var5;
               break;
            }

            if (var7 == -4) {
               var7 = var0.get();
               if (var7 == 6 || var7 == 8 || var7 == 17) {
                  var0.get();
                  continue;
               }

               if (var7 == 11 || var7 == 16) {
                  var0.getShort();
                  continue;
               }
               continue;
            }

            if (var7 == -3) {
               var7 = var0.get();
               var6.append("{" + String.format("%1$02X", var7) + "}");
               continue;
            }

            bm0_1 var8 = mz_1.A10;
            if (!var8.dg(var7)) {
               Tm0(var3, var6.toString());
               ++var1;
               var3 = var5;
               break;
            }

            var6.append((String)var8.BM(var7));
         }
      }
   }

   public static boolean wo0(int var0) {
      return cU.l90(var0);
   }

   public static String c0(int var0) {
      String var1 = (String)cU.get(var0);
      return var1 == null ? yr_1.pG("STRING_", var0) : Qc0(var1);
   }

   public static String wa0(int var0, String var1) {
      String var2 = (String)cU.get(var0);
      if (var2 == null) {
         return yr_1.pG("STRING_", var0);
      } else {
         String var3 = "\\{" + String.format("%1$02X", 0) + "\\}";
         return Qc0(var2.replaceAll(var3, Matcher.quoteReplacement(var1)));
      }
   }

   public static String Bx(int var0, String... var1) {
      String var2 = (String)cU.get(var0);
      if (var2 == null) {
         return yr_1.pG("STRING_", var0);
      } else {
         for (int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = "\\{" + String.format("%1$02X", var3) + "\\}";
            var2 = var2.replaceAll(var4, Matcher.quoteReplacement(var1[var3]));
         }

         return Qc0(var2);
      }
   }

   public static String hL0(int var0, String var1) {
      String var2 = (String)cU.get(var0);
      return var2 == null ? var1 : Qc0(var2);
   }

   public static String vs(int var0, byte[] var1, String[] var2) {
      String var3 = (String)cU.get(var0);
      if (var3 == null) {
         return yr_1.pG("STRING_", var0);
      } else if (var1.length != var2.length) {
         throw new RuntimeException("Mismatching replace keys/values lengths.");
      } else {
         for (int var4 = 0; var4 < var1.length; ++var4) {
            String var5 = "\\{" + String.format("%1$02X", var1[var4]) + "\\}";
            var3 = var3.replaceAll(var5, var2[var4]);
         }

         return Qc0(var3);
      }
   }

   public static String yN(int var0, String... var1) {
      String var2 = (String)cU.get(var0);
      if (var2 == null) {
         return yr_1.pG("STRING_", var0);
      } else {
         for (int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = "\\{" + String.format("%1$02X", var3) + "\\}";
            var2 = var2.replaceAll(var4, "[#ff8a00]" + Matcher.quoteReplacement(var1[var3].trim()) + "[#]");
         }

         return Qc0(var2);
      }
   }

   public static String Bw(byte var0, lpt6__2 var1, int var2, int var3, String... var4) {
      String var5 = Q6[var0][var1.UB0].ra0(var2, 0, var3);

      for (int var6 = 0; var6 < var4.length; ++var6) {
         String var7 = "\\{" + String.format("%1$02X", var6) + "\\}";
         var5 = var5.replaceAll(var7, Matcher.quoteReplacement(var4[var6]));
      }

      return Qc0(var5);
   }

   public static String fg0(byte var0, lpt6__2 var1, int var2, int var3, String... var4) {
      String var5 = Q6[var0][var1.UB0].ra0(var2, 0, var3);

      for (int var6 = 0; var6 < var4.length; ++var6) {
         String var7 = "\\{" + String.format("%1$02X", var6) + "\\}";
         var5 = var5.replaceAll(var7, "[#ff8a00]" + Matcher.quoteReplacement(var4[var6].trim()) + "[#]");
      }

      return Qc0(var5);
   }

   public static String YG(byte var0, lpt6__2 var1, int var2, int var3, iz0_0... var4) {
      return Qc0(X10(Q6[var0][var1.UB0].ra0(var2, 0, var3), var4));
   }

   public static String H5(lpt6__2 var0, int var1, int var2) {
      return Bw((byte)2, var0, var1, var2, zb0);
   }

   public static String Qc0(String var0) {
      if (!var0.contains("{")) {
         return var0;
      } else {
         Matcher var1 = Pattern.compile("\\{([A-F0-9]{2,4})\\}").matcher(var0);

         while (var1.find()) {
            byte var2 = (byte)(Integer.parseInt(var1.group(1), 16) & 255);
            String var3 = var1.group();
            String var4 = (String)mz_1.D00.BM(var2);
            if (var4 == null) {
               var4 = "";
            }

            var0 = var0.replace(var3, var4);
         }

         return var0;
      }
   }

   public static String X10(String var0, iz0_0[] var1) {
      if (!var0.contains("{")) {
         return var0;
      } else if (var1 != null && var1.length >= 1) {
         int var2 = var1.length;

         for (int var3 = 0; var3 < var2; ++var3) {
            iz0_0 var4 = var1[var3];
            var0 = var0.replace("{" + String.format("%1$02X", var4.Yi0) + "}", Matcher.quoteReplacement(var4.vj0()));
         }

         if (var0.contains("{") && var0.contains("+")) {
            Matcher var5 = Pattern.compile("\\{([A-F0-9]{2,4})\\+\\}").matcher(var0);
            if (var5.find()) {
               byte var6 = (byte)(Integer.parseInt(var5.group(1), 16) & 255);
               StringBuilder var7 = new StringBuilder();

               for (int var8 = 0; var8 < var1.length; ++var8) {
                  iz0_0 var9 = var1[var8];
                  if (var9.Yi0 >= var6) {
                     if (var7.length() > 0) {
                        var7.append("/");
                     }

                     var7.append(var9.vj0());
                  }
               }

               var0 = var0.replace(var5.group(), var7);
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static void kE0(int var0, String var1) {
      SQ var2 = cU;
      var2.j10(var2.yw0(var0), var1);
   }

   public static void Tm0(int var0, String var1) {
      SQ var2 = cU;
      var0 = var2.yw0(var0);
      if (var0 < 0) {
         Object var10000 = var2.td[-var0 - 1];
      } else {
         var2.j10(var0, var1);
      }
   }

   public static void rc(qa0_1 var0, int var1, int var2, int var3) {
      if (var1 < 1) {
         return;
      }

      ByteBuffer var4 = var0.VL0.slice().order(java.nio.ByteOrder.LITTLE_ENDIAN);
      var4.position(var1);
      var1 = 0;

      while (var3 <= 0 || var3 > var1) {
         int var5 = G90.GF0(var4.getInt());
         if (var5 < 1 || var5 > var4.limit()) {
            return;
         }

         String var6 = mz_1.Xc(var5, var0.VL0.slice().order(java.nio.ByteOrder.LITTLE_ENDIAN));
         Tm0(var1 + var2, var6);
         ++var1;
      }
   }

   public static void NM(qa0_1 var0, int var1, int var2, int var3) {
      if (var1 < 1) {
         return;
      }

      ByteBuffer var4 = var0.VL0.slice().order(java.nio.ByteOrder.LITTLE_ENDIAN);
      var4.position(var1);
      var1 = 0;

      while (var3 <= 0 || var3 > var1) {
         var4.getInt();
         int var5 = G90.GF0(var4.getInt());
         if (var5 < 1 || var5 > var4.limit()) {
            return;
         }

         String var6 = mz_1.Xc(var5, var0.VL0.slice().order(java.nio.ByteOrder.LITTLE_ENDIAN));
         Tm0(var1 + var2, var6);
         ++var1;
      }
   }

   public static String dd(String var0) {
      if (!var0.contains("STRING_")) {
         return var0;
      } else {
         String[] var1 = var0.split("\\{STRING_");

         for (int var2 = 0; var2 < var1.length - 1; ) {
            try {
               ++var2;
               int var3 = Integer.parseInt(var1[var2].split("\\}")[0]);
               if (cU.l90(var3)) {
                  String var4 = "\\{STRING_" + var3 + "\\}";
                  String var5 = (String)cU.get(var3);
                  if (var5 == null) {
                     var5 = "STRING_" + var3;
                  }

                  var0 = var0.replaceAll(var4, var5);
               }
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }

         return var0;
      }
   }

   public static xm_0 jP(byte var0, lpt6__2 var1) {
      return Q6[var0][var1.UB0];
   }

   public static void Q() {
      TE var0 = gu0.l2.my0;
      var0.getClass();
      var0.bm0(sm0_0::ev0);
   }

   public static void wb() {
      String var0 = Ft0(c0(245328), "", "[0-9０-９,]{2,10}(?!\\})");
      Tm0(910000, Ft0(c0(245420), "", "[0-9０-９,]{2,10}(?!\\})"));
      String var1 = c0(910000);
      Iterator var2 = gu0.l2.Pd0.values().iterator();

      while (var2.hasNext()) {
         mc0_1 var3 = (mc0_1)var2.next();
         if (var3.wb0 > 0) {
            int var4 = var3.Z8 + 900000;
            int var5 = var3.Z8 + 965536;
            StringBuilder var6 = new StringBuilder();
            String var7 = var3.nI() ? var1 : var0;
            var6.append(var7).append(" - ");
            if (var3.wb0 > 0) {
               vk0_1 var8 = (vk0_1)ec0_2.Sx().f4.f5(var3.wb0);
               if (var8 != null) {
                  var7 = c0(var8.bt);
               } else {
                  var7 = "--";
               }
            } else {
               var7 = "--";
            }

            Tm0(var4, var6.append(var7).toString());
            Tm0(var5, hx_1.LPt2(36, c0(var3.wb0 + 120000)));
            var3.Nl = var4;
            var3.Fv = var5;
         }
      }

      String[] var9 = jP((byte)2, lpt6__2.Q80).Sd(244);

      for (int var10 = 0; var10 < var9.length; ++var10) {
         Tm0(var10 + 155000, var9[var10]);
      }

      Iterator var11 = mp_1.vf0().k2.values().iterator();

      while (var11.hasNext()) {
         cq_0 var12 = (cq_0)var11.next();
         cq_0 var13 = var12.kT;
         if (var13 != null) {
            if (var13 == null) {
               var13 = var12;
            }

            Tm0(var12.dR + 150000, (new StringBuilder()).append(var13.Ay(false)).append(" [").append(var12.FZ()).append("]").toString());
         }
      }

      short[][] var14 = n70_0.ll;
      int var15 = 18;

      for (int var16 = 0; var16 < var15; ++var16) {
         short[] var17 = var14[var16];
         Tm0(var17[1] + 150000, c0(var17[0] + 150000));
      }

      int var18 = 1447;
      rz_0[] var19 = rz_0.lpT5;

      for (int var20 = 0; var20 < var19.length; ++var20) {
         int var21 = var20 + 930000;
         Tm0(var21, wa0(101705, var19[var20].toString()));
         gu0.l2.lPT6((short)(var18 + var20)).Nl = var21;
      }

      M var22 = ec0_2.Sx().Com6();
      V3 var23 = new V3(var22.EF);

      while (var23.hasNext()) {
         vk0_1 var24 = (vk0_1)var23.u7();
         int var25 = var24.hC0;
         if (var25 >= 3000) {
            Tm0(var25 + 110000, c0(var24.hC0 - -107000) + "☆");
            Tm0(var24.hC0 + 120000, c0(var25 - -117000));
         }
      }

      StringBuilder var26 = new StringBuilder();
      int var27 = 11400;
      int var28 = 11200;
      QL[] var29 = QL.td0;

      for (int var30 = 0; var30 < var29.length; ++var30) {
         QL var31 = var29[var30];
         var26.append(c0(var28 + var31.D7));
         var26.append(c0(10999));
         Tm0(var27 + var31.D7, var26.toString());
         var26.setLength(0);
      }
   }

   public static String CY(byte var0) {
      if (var0 == 3) {
         return Bw(var0, lpt6__2.Q80, 389, 37, zb0);
      } else if (var0 == 4) {
         return Bw(var0, lpt6__2.Q80, 729, 1, zb0);
      } else {
         return tx_1.rX(c0(300095));
      }
   }

   public static IL ab(String var0) {
      Iterator var1 = cOm5.entrySet().iterator();

      while (var1.hasNext()) {
         Map.Entry var2 = (Map.Entry)var1.next();
         if (((String)var2.getValue()).equalsIgnoreCase(var0) || ((IL)var2.getKey()).name().equalsIgnoreCase(var0)) {
            return (IL)var2.getKey();
         }
      }

      return IL.Sp;
   }

   public static boolean ev0(short var0, short var1) {
      int var2 = var0 + 240000;
      if (!cU.l90(var2)) {
         kE0(var2, c0(var1 + 240000));
      }

      return true;
   }

   static {
      zb0 = new String[0];
      cOm5 = new EnumMap(IL.class);
      rn0 = new int[][][]{
         {},
         {{64, 2}, {12, 23}},
         {{64, 3}, {24, 3}},
         {{64, 4}, {34, 3}},
         {{64, 5}, {68, 3}},
         {{64, 6}, {102, 3}},
         {{64, 7}, {113, 3}},
         {{64, 8}, {119, 3}}
      };
      td0 = new int[][][]{
         {},
         {},
         {{87, 3}, {88, 3}},
         {},
         {{144, 3}},
         {},
         {{56, 3}},
         {}
      };
      yL0 = new int[][][]{
         {},
         {{558, 3}},
         {{567, 3}},
         {},
         {{614, 3}},
         {},
         {{606, 3}},
         {}
      };
      cU = new SQ();
      n6 = new ld_0();
      Q6 = new xm_0[5][2];

      for (int var0 = 0; var0 < Q6.length; ++var0) {
         for (int var1 = 0; var1 < 2; ++var1) {
            Q6[var0][var1] = xm_0.zq;
         }
      }

      IL[] var2 = IL.values();
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; ++var4) {
         cOm5.put(var2[var4], "");
      }

      nf0_0.G8.info("Added string preloads...");
   }

   public static String Vw(lpt6__2 var0, int var1) {
      return Bw((byte)2, var0, 1, var1, zb0);
   }
}
