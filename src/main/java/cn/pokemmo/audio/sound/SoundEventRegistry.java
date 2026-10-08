package cn.pokemmo.audio.sound;

import f.*;

public abstract class SoundEventRegistry {
   public static void U1() {
      int[] var0;
      int[] var10001 = var0 = new int[2];
      var10001[0] = 90000;
      var10001[1] = 90001;
      _case.P0.Yw((byte)0, var0);
      rz_0[] var6;
      rz_0[] var10000 = var6 = rz_0.lpT5;
      int[] var1 = new int[var10000.length];
      int var2 = var10000.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         byte var93 = var6[var3].f10;
         var1[var93] = var93 + 180000;
      }

      _case.P0.Yw((byte)1, var1);
      i40_0[] var49 = i40_0.qz0;
      int[] var7 = new int[var49.length];

      for(int var41 = 0; var41 < var49.length; ++var41) {
         var7[var41] = var49[var41].j40 + 230000;
      }

      _case var88 = _case.P0;
      var88.Yw((byte)2, var7);
      int[] var10004 = var7 = new int[4];
      var10004[0] = 2351;
      var10004[1] = 2352;
      var10004[2] = 2353;
      var10004[3] = 53;
      var88.Yw((byte)3, var7);
      int[] var10003 = var7 = new int[4];
      var10003[0] = 16801006;
      var10003[1] = 16801018;
      var10003[2] = 16801007;
      var10003[3] = 53;
      var88.Yw((byte)4, var7);
      int[] var10002 = var7 = new int[3];
      var10002[0] = 3055;
      var10002[1] = 8558;
      var10002[2] = 53;
      var88.Yw((byte)5, var7);
      var10001 = var7 = new int[4];
      var10001[0] = 16802003;
      var10001[1] = 16801018;
      var10001[2] = 16801007;
      var10001[3] = 53;
      var88.Yw((byte)6, var7);
      int var12;
      int var42;
      String[] var50 = new String[var42 = (var12 = i40_0.g80.length) + 1];

      for(int var69 = 0; var69 < var42; ++var69) {
         String var4;
         if (var69 == var12) {
            var4 = sm0_0.c0(nf0_0.Bq0);
         } else {
            var4 = i40_0.g80[var69].BT();
         }

         var50[var69] = var4;
      }

      var88 = _case.P0;
      var88.A((byte)7, var50);
      String[] var13;
      String[] var99 = var13 = new String[2];
      var99[0] = sm0_0.c0(nf0_0.Bq0);
      var99[1] = sm0_0.c0(150019);
      var88.A((byte)8, var13);
      int[] var14;
      var10001 = var14 = new int[3];
      var10001[0] = 16779028;
      var10001[1] = 16779029;
      var10001[2] = 53;
      var88.Yw((byte)9, var14);

      for(byte var15 = 0; var15 < 5; ++var15) {
         PG0 var43 = new PG0(5);
         byte[] var51 = N50.Fb;
         byte var70 = 5;

         for(int var84 = 0; var84 < var70; ++var84) {
            byte var5;
            if ((var5 = var51[var84]) != var15) {
               var43.Vn(var5 + 250000);
            }
         }

         var43.Vn(53);
         int[] var44 = var43.toArray();
         LG0 var52 = new LG0((byte)(var15 + 10), var44);
         var52.BQ = var44.length - 1;
         a20.vh(_case.P0.vm0[10], var52);
      }

      var88 = _case.P0;
      int[] var10011 = var14 = new int[3];
      var10011[0] = 16804101;
      var10011[1] = 16804102;
      var10011[2] = 53;
      var88.Yw((byte)20, var14);
      int[] var10010 = var14 = new int[2];
      var10010[0] = 5500;
      var10010[1] = 53;
      var88.Yw((byte)21, var14);
      int[] var10009 = var14 = new int[3];
      var10009[0] = 53;
      var10009[1] = 16800056;
      var10009[2] = 16800055;
      var88.Yw((byte)22, var14);
      int[] var10008 = var14 = new int[3];
      var10008[0] = 53;
      var10008[1] = 16804123;
      var10008[2] = 16804122;
      var88.Yw((byte)23, var14);
      int[] var10007 = var14 = new int[2];
      var10007[0] = 53;
      var10007[1] = 16804123;
      var88.Yw((byte)24, var14);
      String[] var23;
      String[] var10006 = var23 = new String[5];
      var10006[0] = sm0_0.wa0(16804101, sm0_0.c0(2300));
      var10006[1] = sm0_0.wa0(16804102, sm0_0.c0(2300));
      var10006[2] = sm0_0.c0(16804127);
      var10006[3] = sm0_0.c0(16804128);
      var10006[4] = sm0_0.c0(var42 = nf0_0.Bq0);
      var88.A((byte)25, var23);
      String[] var10005 = var23 = new String[5];
      var10005[0] = sm0_0.wa0(16804101, sm0_0.c0(2300));
      var10005[1] = sm0_0.wa0(16804102, sm0_0.c0(2300));
      var10005[2] = sm0_0.wa0(16804135, sm0_0.c0(16804127));
      var10005[3] = sm0_0.wa0(16804135, sm0_0.c0(16804128));
      var10005[4] = sm0_0.c0(nf0_0.Yt);
      var88.A((byte)26, var23);
      String[] var104 = var23 = new String[5];
      var23[0] = sm0_0.wa0(16804101, sm0_0.c0(2300));
      var23[1] = sm0_0.wa0(16804102, sm0_0.c0(2300));
      var23[2] = sm0_0.c0(16804140);
      var23[3] = sm0_0.c0(16804129);
      var104[4] = sm0_0.c0(var42);
      var88.A((byte)27, var23);
      String[] var102 = var23 = new String[3];
      var23[0] = sm0_0.wa0(16804101, sm0_0.c0(2300));
      var23[1] = sm0_0.wa0(16804102, sm0_0.c0(2300));
      var102[2] = sm0_0.c0(var42);
      var88.A((byte)28, var23);
      var99 = var23 = new String[3];
      var23[0] = sm0_0.c0(16805039);
      var23[1] = sm0_0.c0(16805038);
      var99[2] = sm0_0.c0(var42);
      var88.A((byte)29, var23);
      String[] var97 = var23 = new String[3];
      var23[0] = sm0_0.c0(5843);
      var23[1] = sm0_0.c0(2300);
      var97[2] = sm0_0.c0(var42);
      var88.A((byte)30, var23);
      int var29;
      var50 = new String[var42 = (var29 = lpt6__1.N0.length) + 1];

      for(int var71 = 0; var71 < var42; ++var71) {
         String var85;
         if (var71 == var29) {
            var85 = sm0_0.c0(nf0_0.Bq0);
         } else {
            var85 = lpt6__1.N0[var71].toString();
         }

         var50[var71] = var85;
      }

      var88 = _case.P0;
      var88.A((byte)31, var50);
      String[] var30;
      String[] var111 = var30 = new String[3];
      var111[0] = sm0_0.c0(1135);
      var111[1] = sm0_0.c0(16804123);
      var111[2] = sm0_0.c0(var42 = nf0_0.Bq0);
      var88.A((byte)32, var30);
      String[] var110 = var30 = new String[4];
      String[] var10014 = var50 = new String[2];
      var10014[0] = "x3";
      var10014[1] = sm0_0.c0(245094);
      var30[0] = sm0_0.Bx(8601, var50);
      String[] var10013 = var50 = new String[2];
      var10013[0] = "x2";
      var10013[1] = sm0_0.c0(245094);
      var30[1] = sm0_0.Bx(8601, var50);
      String[] var10012 = var50 = new String[2];
      var10012[0] = "x1";
      var10012[1] = sm0_0.c0(245094);
      var30[2] = sm0_0.Bx(8601, var50);
      var110[3] = sm0_0.c0(var42);
      var88.A((byte)33, var30);
      String[] var109 = var30 = new String[3];
      var30[0] = sm0_0.c0(16780444);
      var30[1] = sm0_0.c0(16780445);
      var109[2] = sm0_0.c0(var42);
      var88.A((byte)34, var30);
      String[] var108 = var30 = new String[4];
      var30[0] = sm0_0.c0(16780444);
      var30[1] = sm0_0.c0(16780445);
      var30[2] = sm0_0.c0(16780446);
      var108[3] = sm0_0.c0(var42);
      var88.A((byte)35, var30);
      var10006 = var30 = new String[4];
      var30[0] = sm0_0.c0(1177);
      var30[1] = sm0_0.c0(16804123);
      var30[2] = sm0_0.wa0(16805053, sm0_0.c0(6601));
      var10006[3] = sm0_0.c0(var42);
      var88.A((byte)36, var30);
      int[] var35;
      int[] var106 = var35 = new int[3];
      var106[0] = 5494;
      var106[1] = 5500;
      var106[2] = 53;
      var88.Yw((byte)37, var35);
      int[] var105 = var35 = new int[2];
      var105[0] = 5494;
      var105[1] = 53;
      var88.Yw((byte)38, var35);
      byte var37 = 39;
      String[] var48;
      var102 = var48 = new String[12];
      short var57 = 428;
      byte var72 = 0;
      lpt6__2 var86 = lpt6__2.Q80;
      String[] var87 = sm0_0.zb0;
      var102[0] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var57 = 428;
      var72 = 1;
      var102[1] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var57 = 428;
      var72 = 2;
      var102[2] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var57 = 428;
      var72 = 3;
      var102[3] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var57 = 428;
      var72 = 4;
      var102[4] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var57 = 428;
      var72 = 5;
      var102[5] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var57 = 428;
      var72 = 6;
      var102[6] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var57 = 428;
      var72 = 7;
      var102[7] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var57 = 428;
      var72 = 8;
      var102[8] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var57 = 428;
      var72 = 9;
      var102[9] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var57 = 428;
      var72 = 10;
      var102[10] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var57 = 428;
      var72 = 11;
      var102[11] = sm0_0.Bw((byte)4, var86, var57, var72, var87);
      var88.A(var37, var48);
      int[] var38;
      int[] var101 = var38 = new int[2];
      var101[0] = 16780177;
      var101[1] = 53;
      var88.Yw((byte)40, var38);
      int[] var98 = var38 = new int[3];
      var98[0] = 16780177;
      var98[1] = 16780178;
      var98[2] = 53;
      var88.Yw((byte)41, var38);

      for(byte var40 = 0; var40 < 7; ++var40) {
         EX((byte)0, (byte)(var40 + 120), var40);
      }

      if (tw0_0.Ll0.cOM4((byte)1)) {
         EX((byte)1, (byte)120, (byte)12);
         EX((byte)1, (byte)121, (byte)8);
      }

   }

   public static void EX(byte var0, byte var1, byte var2) {
      _case var3;
      LG0 var4;
      if ((var4 = (LG0)(var3 = _case.P0).vm0[var0].Fm0.BM(var2)) != null) {
         _case var10000 = var3;
         LG0 var5 = new LG0(var1, var4.wM);
         a20.vh(var10000.vm0[var0], var5);
      }

   }
}
