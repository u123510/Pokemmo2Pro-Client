package cn.pokemmo.rom.nds.hgss;

import f.*;
import cn.pokemmo.rom.nds.dppt.*;
import com.badlogic.gdx.graphics.Color;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

public class HeartGoldSoulSilverRom extends l50_0 {
    public final UY asBridge() {
        return this instanceof UY ? (UY) this : null;
    }

    public final boolean isHeartGold() {
        return "IPK".equals(this.header.codePrefix);
    }

    public final boolean isSoulSilver() {
        return "IPG".equals(this.header.codePrefix);
    }

    public final DpptMapHeaderTable getMapHeaderTable() {
        return this.Za0;
    }

    public final DpptMapHeaderEntry getMapHeader(int id) {
        return (DpptMapHeaderEntry) (Object) this.Za0.Sx0[id];
    }

    public final kx_1 getExteriorMatrix() {
        return this.BJ0;
    }

    public final kx_1 getInteriorMatrix() {
        return this.ny;
    }

   public static final Wr[] CS = new Wr[0];
   public static final String[] qk0 = new String[]{"IPG", "IPK"};
   public static final short[] WK0 = new short[]{11, 0, 2, 12, 14, 8, 10, 1, 3, 11};
   public static final short[] yH = new short[]{12, 0, 2, 13, 15, 9, 11, 1, 3, 12};
   public static final short[] me = new short[]{2, 0, 4, 2, 3, 0, 1, 4, 5};
   public final Wr[][] aUx = new Wr[65][6];
   public final TE Gt = new TE();
   public final w7_0 GY = new w7_0();
   public bm0_1 cS;
   public f1_0 Za0;
   public kx_1 BJ0;
   public kx_1 ny;
   public v8_0[] Jr0 = new v8_0[0];
   public Wr U9;
   public Wr[] Hq0;

   public HeartGoldSoulSilverRom(Dn0 var1) {
      super(var1, true, qk0);
   }

   public final void Z80() {
      byte var1 = 1;
      wm_1 var13;
      ByteBuffer var14 = (var13 = super.z40.Wp0[var1]).G3.MH(var13.Zx);
      short var2 = 8;
      int[] var3;
      int[] var10000 = var3 = new int[8];
      var10000[0] = 289;
      var10000[1] = 0;
      var10000[2] = 0;
      var10000[3] = 0;
      var10000[4] = 65535;
      var10000[5] = 0;
      var10000[6] = 0;
      var10000[7] = 0;
      dl_1 var38 = tx_1.Sy0;

      label72:
      while(((Buffer)var14).remaining() > 32) {
         for(int var4 = 0; var4 < var2; ++var4) {
            if (var14.getInt() != var3[var4]) {
               continue label72;
            }
         }

         short entryId;
         do {
            entryId = var14.getShort();
            short mappedId = var14.getShort();
            var14.getShort();
            this.Gt.Dc0(entryId, mappedId);
         } while(entryId != -1);

         bm0_1 var10004 = this.cS = new bm0_1(2);
         xm0_0 var15;
         var15 = new xm0_0();
         var10004.gE0((byte)0, var15);
         bm0_1 var10003 = this.cS;
         var15 = new xm0_0();
         var10003.gE0((byte)1, var15);
         (var15 = (xm0_0)this.cS.BM((byte)0)).eT((short)60, (short)38);
         var15.eT((short)14, (short)70);
         var15.eT((short)15, (short)71);
         var15.eT((short)16, (short)114);
         var15.eT((short)17, (short)115);
         var15.eT((short)21, (short)122);
         var15.eT((short)22, (short)6);
         var15.eT((short)18, (short)116);
         var15.eT((short)23, (short)146);
         var15.eT((short)31, (short)128);
         var15.eT((short)19, (short)121);
         var15.eT((short)24, (short)7);
         var15.eT((short)20, (short)117);
         var15.eT((short)27, (short)131);
         var15.eT((short)30, (short)127);
         var15.eT((short)28, (short)29);
         var15.eT((short)32, (short)19);
         var15.eT((short)47, (short)9);
         var15.eT((short)48, (short)120);
         var15.eT((short)29, (short)14);
         var15.eT((short)59, (short)30);
         var15.eT((short)33, (short)129);
         var15.eT((short)35, (short)20);
         var15.eT((short)39, (short)142);
         var15.eT((short)40, (short)143);
         var15.eT((short)41, (short)123);
         var15.eT((short)42, (short)126);
         var15.eT((short)52, (short)137);
         var15.eT((short)58, (short)85);
         var15.eT((short)50, (short)174);
         var15.eT((short)43, (short)139);
         var15.eT((short)44, (short)140);
         var15.eT((short)45, (short)12);
         var15.eT((short)46, (short)118);
         var15.eT((short)54, (short)49);
         var15.eT((short)55, (short)26);
         var15.eT((short)61, (short)138);
         var15.eT((short)62, (short)145);
         var15.eT((short)63, (short)183);
         var15.eT((short)57, (short)144);
         var15.eT((short)90, (short)190);
         var15.eT((short)37, (short)2);
         var15.eT((short)36, (short)140);
         var15.eT((short)38, (short)1);
         var15.eT((short)56, (short)132);
         var15.eT((short)53, (short)180);
         var15.eT((short)91, (short)58);
         var15.eT((short)64, (short)134);
         var15.eT((short)67, (short)56);
         var15.eT((short)92, (short)95);
         var15.eT((short)71, (short)161);
         var15.eT((short)25, (short)122);
         var15.eT((short)26, (short)186);
         var15.eT((short)78, (short)129);
         var15.eT((short)79, (short)157);
         var15.eT((short)34, (short)19);
         var15.eT((short)68, (short)133);
         var15.eT((short)69, (short)194);
         var15.eT((short)70, (short)57);
         var15.eT((short)65, (short)135);
         var15.eT((short)66, (short)136);
         var15.eT((short)96, (short)93);
         var15.eT((short)97, (short)92);
         var15.eT((short)69, (short)57);
         var15.eT((short)49, (short)175);
         var15.eT((short)89, (short)3);
         var15.eT((short)75, (short)158);
         var15.eT((short)80, (short)168);
         var15.eT((short)81, (short)165);
         var15.eT((short)82, (short)163);
         var15.eT((short)83, (short)166);
         var15.eT((short)84, (short)156);
         var15.eT((short)87, (short)226);
         var15.eT((short)86, (short)169);
         var15.eT((short)85, (short)164);
         var15.eT((short)73, (short)182);
         var15.eT((short)76, (short)192);
         var15.eT((short)74, (short)159);
         var15.eT((short)72, (short)170);
         var15.eT((short)95, (short)94);
         var15.eT((short)51, (short)162);
         var15.eT((short)109, (short)195);
         var15.eT((short)107, (short)229);
         var15.eT((short)110, (short)319);
         var15.eT((short)118, (short)437);
         var15.eT((short)119, (short)414);
         var15.eT((short)121, (short)353);
         var15.eT((short)122, (short)328);
         var15.eT((short)123, (short)331);
         var15.eT((short)124, (short)332);
         var15.eT((short)125, (short)351);
         var15.eT((short)126, (short)385);
         var15.eT((short)127, (short)399);
         var15.eT((short)128, (short)378);
         var15.eT((short)129, (short)379);
         var15.eT((short)130, (short)365);
         var15.eT((short)131, (short)339);
         var15.eT((short)132, (short)383);
         var15.eT((short)133, (short)320);
         var15.eT((short)135, (short)229);
         var15.eT((short)136, (short)444);
         var15.eT((short)137, (short)445);
         var15.eT((short)138, (short)443);
         var15.eT((short)148, (short)719);
         var15.eT((short)149, (short)718);
         var15.eT((short)150, (short)717);
         var15.eT((short)139, (short)449);
         var15.eT((short)140, (short)450);
         var15.eT((short)141, (short)575);
         var15.eT((short)143, (short)574);
         var15.eT((short)142, (short)576);
         var15.eT((short)144, (short)212);
         var15.eT((short)145, (short)211);
         var15.eT((short)146, (short)582);
         var15.eT((short)111, (short)403);
         var15.eT((short)134, (short)366);
         var15.eT((short)147, (short)439);
         var15.eT((short)112, (short)361);
         var15.eT((short)114, (short)316);
         var15.eT((short)117, (short)412);
         var15.eT((short)120, (short)69);
         var15.eT((short)115, (short)338);
         var15.eT((short)116, (short)314);
         var15.eT((short)113, (short)334);
         var15.eT((short)88, (short)193);
         (var15 = (xm0_0)this.cS.BM((byte)1)).eT((short)5, (short)1);
         var15.eT((short)6, (short)2);
         var15.eT((short)7, (short)121);
         var15.eT((short)8, (short)6);
         var15.eT((short)9, (short)28);
         var15.eT((short)10, (short)120);
         var15.eT((short)11, (short)114);
         var15.eT((short)12, (short)115);
         var15.eT((short)13, (short)9);
         var15.eT((short)14, (short)7);
         var15.eT((short)15, (short)28);
         var15.eT((short)16, (short)8);
         var15.eT((short)17, (short)35);
         var15.eT((short)18, (short)18);
         var15.eT((short)19, (short)17);
         var15.eT((short)20, (short)13);
         var15.eT((short)21, (short)19);
         var15.eT((short)22, (short)20);
         var15.eT((short)23, (short)58);
         var15.eT((short)24, (short)6);
         var15.eT((short)25, (short)127);
         var15.eT((short)26, (short)125);
         var15.eT((short)27, (short)30);
         var15.eT((short)28, (short)56);
         var15.eT((short)29, (short)129);
         var15.eT((short)30, (short)130);
         var15.eT((short)31, (short)50);
         var15.eT((short)32, (short)51);
         var15.eT((short)33, (short)11);
         var15.eT((short)34, (short)15);
         var15.eT((short)35, (short)4);
         var15.eT((short)36, (short)5);
         var15.eT((short)37, (short)34);
         var15.eT((short)38, (short)68);
         var15.eT((short)39, (short)185);
         var15.eT((short)40, (short)85);
         var15.eT((short)42, (short)139);
         var15.eT((short)43, (short)140);
         var15.eT((short)44, (short)49);
         var15.eT((short)45, (short)56);
         var15.eT((short)46, (short)26);
         var15.eT((short)47, (short)118);
         var15.eT((short)48, (short)40);
         var15.eT((short)49, (short)54);
         var15.eT((short)50, (short)52);
         var15.eT((short)51, (short)47);
         var15.eT((short)52, (short)7);
         var15.eT((short)53, (short)115);
         var15.eT((short)54, (short)114);
         var15.eT((short)55, (short)36);
         var15.eT((short)56, (short)21);
         var15.eT((short)57, (short)22);
         var15.eT((short)58, (short)134);
         var15.eT((short)59, (short)95);
         var15.eT((short)65, (short)9);
         var15.eT((short)66, (short)122);
         var15.eT((short)67, (short)68);
         var15.eT((short)68, (short)32);
         var15.eT((short)76, (short)478);
         var15.eT((short)77, (short)380);
         var15.eT((short)78, (short)305);
         var15.eT((short)79, (short)495);
         var15.eT((short)80, (short)323);
         var15.eT((short)81, (short)564);
         var15.eT((short)82, (short)94);
         var15.eT((short)83, (short)24);
         var15.eT((short)84, (short)25);
         var15.eT((short)85, (short)136);
         var15.eT((short)86, (short)93);
         var15.eT((short)87, (short)92);
         var15.eT((short)95, (short)619);
         var15.eT((short)96, (short)619);
         var15.eT((short)98, (short)594);
         var15.eT((short)99, (short)46);
         var15.eT((short)110, (short)33);
         var15.eT((short)116, (short)58);
         var15.eT((short)134, (short)60);
         var15.eT((short)136, (short)68);
         var15.eT((short)187, (short)711);
         var15.eT((short)188, (short)712);
         var15.eT((short)189, (short)162);
         var15.eT((short)190, (short)40);
         var15.eT((short)200, (short)708);
         var15.eT((short)201, (short)709);
         var15.eT((short)202, (short)710);
         var15.eT((short)203, (short)631);
         var15.eT((short)204, (short)683);
         var15.eT((short)208, (short)594);
         var15.eT((short)209, (short)323);
         var15.eT((short)210, (short)485);
         var15.eT((short)211, (short)609);
         var15.eT((short)212, (short)683);
         var15.eT((short)213, (short)140);
         var15.eT((short)214, (short)629);
         var15.eT((short)220, (short)592);
         var15.eT((short)223, (short)57);
         var15.eT((short)225, (short)612);
         var15.eT((short)226, (short)687);
         var15.eT((short)227, (short)135);
         var15.eT((short)228, (short)187);
         var15.eT((short)229, (short)450);
         var15.eT((short)232, (short)717);
         var15.eT((short)237, (short)580);
         var15.eT((short)238, (short)581);
         String var19 = "/a/0/8/1";
         Ae var20;
         Ae var40 = var20 = (Ae)super.fd0.dg.get(var19);
         Qd0.cV();
         String var10001 = var40.kd;
         int var21;
         l50_0 var24;
         ByteBuffer var25;
         int var41 = var21 = pf_0.LPt2(var25 = (var24 = var40.h2).dL.duplicate().order(ByteOrder.LITTLE_ENDIAN), var20.bM0);
         int var26 = 1129464142;
         if (var41 != 1129464142) {
            throw new RuntimeException(ac0_0.YH0("Header magic mismatch = ", var21, " vs expected ", var26));
         }

         var21 = ax0_0.vU(var25);
         int var5 = iy_1.WG0(var26 = var25.getInt(), 8, ((Buffer)var25).position(), var25);
         var5 = ((Buffer)var25).position() + var5;

         for(short var6 = 0; var6 < var26; ++var6) {
            int var7;
            int var8 = var25.getInt(var21 + 12 + (var7 = var6 * 8));
            int var45 = GA.m1(var21, 16, var7, var25);
            var7 = var8 + var5;
            var8 = var45 - var8;
            String[] var9 = un0_0.DB0;
            if (var6 < 400) {
               String var42 = var9[var6];
            } else {
               Integer.toString(var6);
            }

            ByteBuffer var10;
            ByteOrder var35;
            (var10 = var24.dL.duplicate().order(var35 = ByteOrder.LITTLE_ENDIAN)).position(var7);
            if (var8 > 0) {
               AT.i20(var7, var8, ((Buffer)var10).limit(), var10);
            }

            ByteBuffer var30;
            ByteBuffer var43 = var30 = var10.slice().order(var35);
            dl_1 var10002 = Er0.r1;
            if (var43.getInt(((Buffer)var43).position()) == 811095106) {
               Er0 var34;
               Er0 var44 = var34 = new Er0(var30, false, false);
               bw_1 var31;
               if ((var31 = var44.Zb0) != null ? var31.lB : ((am_2)var34.Y3.get(0)).qn0) {
                  int var32;
                  Wr[] var36 = new Wr[var32 = var34.E10.ib0.Ks.KB];

                  for(int var37 = 0; var37 < var32; ++var37) {
                      Wr var11 = new Wr(new nz_0(var34, var37));
                      var36[var37] = var11;
                  }

                  this.GY.coM4(var6, var36);
               }
            }
         }

          this.cS.ml0((index, table) -> this.sf0((byte)index, (xm0_0)table));
         return;
      }

      throw new RuntimeException("Unable to find pattern");
   }

   public final boolean sf0(byte var1, xm0_0 var2) {
      TE var11;
      TE var10000 = var11 = var2.s80;
      int var3;
      short[] var4 = new short[var3 = var10000.Rv];
      short[] var5;
      short[] var20 = var5 = var10000.zp0;
      byte[] var12 = var11.Ut;
      int var6 = var20.length;
      int var7 = 0;

      while(true) {
         int var21 = var6;
         var6 += -1;
         if (var21 <= 0) {
            for(int var13 = 0; var13 < var3; ++var13) {
               short var17 = var4[var13];
               var6 = var2.s80.f5(var17);
               if (this.GY.bL0((short)var6)) {
                  Wr[] var19 = (Wr[])this.GY.f5((short)var6);
                  var2.d90.coM4(var17, var19);
               }
            }

            TE var9;
            TE var10001 = var9 = var2.s80;
            var10001.Rv = 0;
            var10001.YB0 = var10001.Ut.length;
            short[] var10003 = var10001.zp0;
            int var14 = var10003.length;
            short var16 = var9.Hu0;
            Arrays.fill(var10003, 0, var14, var16);
            short[] var10002 = var10001.YG0;
            int var10 = var10002.length;
            var14 = var9.Uf;
            Arrays.fill(var10002, 0, var10, (short)var14);
            byte[] var23 = var10001.Ut;
            Arrays.fill(var23, 0, var23.length, (byte)0);
            var2.s80 = null;
            return true;
         }

         if (var12[var6] == 1) {
            int var8 = var7 + 1;
            var4[var7] = var5[var6];
            var7 = var8;
         }
      }
   }

   public final String pG0() {
      String var1 = super.pG0();
      if ("ja".equals(var1)) {
         no0_0 var10000 = super.fd0;
         String var2 = "/a/0/1/6";
         if (((Ae)var10000.dg.get(var2)).Vh0 > 500000) {
            return "zh";
         }
      }

      return var1;
   }

   public final void jx() {
      String[] var10000 = sm0_0.zb0;
      lpt6__2 var1 = lpt6__2.Q80;
      xm_0 var2;
      xm_0 var187 = var2 = ((l50_0)this).VB0(var1);
      lpt6__2 var3 = lpt6__2.YG0;
      xm_0 var4 = ((l50_0)this).VB0(var3);
      xm_0[][] var10004 = sm0_0.Q6;
      var10004[4][var1.UB0] = var2;
      var10004[4][var3.UB0] = var4;
      sm0_0.a7(190480, var187.Sd(730));
      sm0_0.a7(144000, var187.Sd(279));
      sm0_0.a7(139000, var187.Sd(221));
      sm0_0.a7(249000, var187.Sd(222));
      short var62 = 196;
      byte var80 = 14;
      String[] var93 = sm0_0.zb0;
      sm0_0.Tm0(13, sm0_0.Bw((byte)4, var1, var62, var80, var93));
      sm0_0.TK(664);
      sm0_0.TK(667);
      sm0_0.TK(716);
      gu0 var19;
      (var19 = gu0.l2).getClass();
      String var63 = "/a/0/1/7";
      Ae var64;
      Ae var188 = var64 = (Ae)super.fd0.dg.get(var63);
      Qd0.cV();
      String var10001 = var188.kd;
      int var65;
      l50_0 var81;
      ByteBuffer var94;
      if ((var65 = pf_0.LPt2(var94 = (var81 = var188.h2).dL.duplicate().order(ByteOrder.LITTLE_ENDIAN), var64.bM0)) != 1129464142) {
         throw new RuntimeException(GQ.ti("Header magic mismatch = ", var65, " vs expected 1129464142"));
      } else {
         var65 = ax0_0.vU(var94);
         int var5;
         int var6 = iy_1.WG0(var5 = var94.getInt(), 8, ((Buffer)var94).position(), var94);
         var6 = ((Buffer)var94).position() + var6;

         for(short var7 = 0; var7 < var5; ++var7) {
            mc0_1 var8;
            var8 = new mc0_1();
            short var9 = (short)(var7 + 9000);
            if (var7 >= 113) {
               var9 = (short)(var9 + 22);
            }

            if (var7 >= 406) {
               ++var9;
            }

            int var10;
            int var11 = var94.getInt(var65 + 12 + (var10 = var7 * 8));
            int var213 = GA.m1(var65, 16, var10, var94);
            var10 = var11 + var6;
            var11 = var213 - var11;
            String[] var12 = un0_0.DB0;
            if (var7 < 400) {
               String var189 = var12[var7];
            } else {
               Integer.toString(var7);
            }

            ByteBuffer var13;
            ByteOrder var173;
            (var13 = var81.dL.duplicate().order(var173 = ByteOrder.LITTLE_ENDIAN)).position(var10);
            if (var11 > 0) {
               AT.i20(var10, var11, ((Buffer)var13).limit(), var13);
            }

            var8.ca(var9, this, var13.slice().order(var173));
            var19.Cb0.put(var8.Z8, var8);
            var19.Pd0.put(var8.Z8, var8);
         }

         ByteBuffer var82 = ((l50_0)this).Gr();

         do {
            while(var82.getShort() != 64) {
            }
         } while(var82.getShort() != 12 || var82.getShort() != 30 || var82.getShort() != 50);

         Iterator var20 = var19.Pd0.values().iterator();

         while(var20.hasNext()) {
            mc0_1 var67;
            short var95;
            if ((var95 = (var67 = (mc0_1)var20.next()).Z8) >= 9328 && var95 <= 9427) {
               var67.wb0 = var82.getShort();
            }
         }

         gh_1 var68;
         (var68 = gh_1.aH0).getClass();
          FJ var96 = new FJ((Ae)super.fd0.dg.get("/a/0/1/8"));

         ByteBuffer var109 = ((l50_0)this).Gr();

         do {
            while(var109.getInt() != 4587577) {
            }
         } while(var109.getInt() != 16318714 || var109.getInt() != 28246143);

         Rk0 var22;
         var22 = new Rk0(var96.GJ(1), false);
         SQ var83;
         var83 = new SQ();
         SQ var120;
         var120 = new SQ();

         for(int var128 = 0; var128 < 537; ++var128) {
            short var137 = (short)(var128 + 9000);
            var109.getShort();
            short var143 = var109.getShort();
            short var153 = var109.getShort();
            var109.getShort();
            if (!var68.rf0.bL0(var137)) {
               Wr var144;
               Wr var154;
               int var161;
               if (((GX)var83).l90(var161 = var143 << 16 | var153)) {
                  var144 = (Wr)var83.get(var161);
                  var154 = (Wr)var120.get(var161);
               } else {
                   Wr var162 = new Wr(new pg_1(var96, var153, false, var143, var22, (byte)4, (Color)null));

                  var83.j10(((GX)var83).yw0(var161), var162);
                   Wr var175 = new Wr(new pg_1(var96, var153, true, var143, var22, (byte)4, (Color)null));

                  var120.j10(((GX)var120).yw0(var161), var175);
                  var154 = var175;
                  var144 = var162;
               }

               var68.rf0.coM4(var137, var144);
               var68.rh.coM4(var137, var154);
            }
         }

         ZU var23;
         (var23 = ZU.kB).getClass();
         H40 var69;
         var69 = new H40();
          FJ var84 = new FJ((Ae)super.fd0.dg.get("/a/0/5/8"));


         for(int var98 = 0; var98 <= 128; ++var98) {
            Wr var110;
            Wr var214 = var110 = new Wr(new DX(var84, var98));
            var214.zz = true;
            SQ var192 = var69.Com3;
            var192.j10(((GX)var192).yw0(var98), var110);
         }

         var23.Vp0.gE0((byte)4, var69);
         nl_0.iS((byte)4);
          String var24 = "/a/2/1/6";
          Ae var25 = (Ae)super.fd0.dg.get(var24);
          FJ var70 = new FJ(var25);

          var25 = var70.GJ(10);
         Rk0 var85;
         var85 = new Rk0(var25, false);
          var25 = var70.GJ(8);
         Rk0 var99;
         var99 = new Rk0(var25, false);
          var25 = var70.GJ(6);
         Tt0 var111;
         var111 = new Tt0(var25);
          var25 = var70.GJ(7);
         Gt0 var121;
         var121 = new Gt0(var25, false);
         Wr[] var194 = this.aUx[64];
         Wr var30;
         var30 = new Wr(new ui0_1(var99, var121, var111));
         var194[0] = var30;
         var194 = this.aUx[64];
         var30 = new Wr(new ca0_0(var99, var121, var111));
         var194[1] = var30;

         for(int var32 = 0; var32 < 64; ++var32) {
            Ae var100 = var70.GJ(var32 + 12);
            var111 = new Tt0(var100);
            var100 = var70.GJ(var32 + 76);
            var121 = new Gt0(var100, false);

            for(byte var102 = 0; var102 < 6; ++var102) {
               Wr[] var215 = this.aUx[var32];
               Wr var129;
               var129 = new Wr(new vk_1(var85, var121, var111, var102));
               var215[var102] = var129;
            }
         }

         this.Z80();
         bz_0 var33;
         var33 = new bz_0(this);
         super.gQ = var33;
         String var34 = "/a/0/4/1";
         Ae var35;
         Ae var196 = var35 = (Ae)super.fd0.dg.get(var34);
         Qd0.cV();
         var10001 = var196.kd;
         int var36;
         l50_0 var71;
         ByteBuffer var86;
         if ((var36 = pf_0.LPt2(var86 = (var71 = var196.h2).dL.duplicate().order(ByteOrder.LITTLE_ENDIAN), var35.bM0)) != 1129464142) {
            throw new RuntimeException(GQ.ti("Header magic mismatch = ", var36, " vs expected 1129464142"));
         } else {
            var36 = ax0_0.vU(var86);
            int var197 = var86.getInt();
            int var103 = iy_1.WG0(var197, 8, ((Buffer)var86).position(), var86);
            var103 = ((Buffer)var86).position() + var103;
            super.du0 = new con__3[var197];

            wa0_2[] entries = super.du0;
            for(short var113 = 0; var113 < entries.length; ++var113) {
               int entryOffset = var113 * 8;
               int entryStart = var86.getInt(var36 + 12 + entryOffset);
               int entryEnd = GA.m1(var36, 16, entryOffset, var86);
               int entryPosition = entryStart + var103;
               int entryLength = entryEnd - entryStart;
               String entryName = var113 < 400 ? un0_0.DB0[var113] : Integer.toString(var113);
               Ae entry = new Ae(var71, entryName, entryPosition, entryLength, var113);
               entry.kd = "";
               entries[var113] = new con__3(var113, entry);
            }

            f1_0 var38;
            var38 = new f1_0(this, 0);
            this.Za0 = var38;
            Z0 var72 = Z0.rb;
            byte var87 = 4;
            S80[] var73;
            if (4 < (var73 = var72.h4).length) {
               var73[var87] = var38;
            }

            String var39 = "/a/0/6/5";
            Ae var40;
            Ae var199 = var40 = (Ae)super.fd0.dg.get(var39);
            Qd0.cV();
            var10001 = var199.kd;
            int var41;
            l50_0 var74;
            ByteBuffer var88;
            if ((var41 = pf_0.LPt2(var88 = (var74 = var199.h2).dL.duplicate().order(ByteOrder.LITTLE_ENDIAN), var40.bM0)) != 1129464142) {
               throw new RuntimeException(GQ.ti("Header magic mismatch = ", var41, " vs expected 1129464142"));
            } else {
               var41 = ax0_0.vU(var88);
               int var200 = var88.getInt();
               var103 = iy_1.WG0(var200, 8, ((Buffer)var88).position(), var88);
               var103 = ((Buffer)var88).position() + var103;
               super.o50 = new qj0_1[var200];

               ab0_2[] maps = super.o50;
               for(short var115 = 0; var115 < maps.length; ++var115) {
                  int entryOffset = var115 * 8;
                  int entryStart = var88.getInt(var41 + 12 + entryOffset);
                  int entryEnd = GA.m1(var41, 16, entryOffset, var88);
                  int entryPosition = entryStart + var103;
                  int entryLength = entryEnd - entryStart;
                  String entryName = var115 < 400 ? un0_0.DB0[var115] : Integer.toString(var115);
                  Ae entry = new Ae(var74, entryName, entryPosition, entryLength, var115);
                  entry.kd = "";
                  maps[var115] = new qj0_1(this, var115, entry);
               }

               kx_1 var43;
               var43 = new kx_1(this, MG0.rm);
               this.BJ0 = var43;
               var43 = new kx_1(this, MG0.Wk0);
               this.ny = var43;
               wa0_2 var201 = super.du0[212];
               var201.It0 = 5;
               var201.WH = 6;
               int[][] var228 = new int[5][];
               int[] var45;
               int[] var10009 = var45 = new int[6];
               var10009[0] = 211;
               var10009[1] = 211;
               var10009[2] = 211;
               var10009[3] = 211;
               var10009[4] = 211;
               var10009[5] = 211;
               var228[0] = var45;
               int[] var10008 = var45 = new int[6];
               var10008[0] = 211;
               var10008[1] = 661;
               var10008[2] = 655;
               var10008[3] = 653;
               var10008[4] = 660;
               var10008[5] = 211;
               var228[1] = var45;
               int[] var10007 = var45 = new int[6];
               var10007[0] = 211;
               var10007[1] = 663;
               var10007[2] = 652;
               var10007[3] = 656;
               var10007[4] = 657;
               var10007[5] = 666;
               var228[2] = var45;
               int[] var233 = var45 = new int[6];
               var233[0] = 211;
               var233[1] = 654;
               var233[2] = 662;
               var233[3] = 658;
               var233[4] = 659;
               var233[5] = 211;
               var228[3] = var45;
               int[] var231 = var45 = new int[6];
               var231[0] = 211;
               var231[1] = 211;
               var231[2] = 211;
               var231[3] = 211;
               var231[4] = 211;
               var231[5] = 211;
               var228[4] = var45;
               var201.M70 = var228;
               int[][] var226 = new int[5][];
               var10008 = var45 = new int[6];
               var10008[0] = 0;
               var10008[1] = 0;
               var10008[2] = 0;
               var10008[3] = 0;
               var10008[4] = 0;
               var10008[5] = 0;
               var226[0] = var45;
               var10007 = var45 = new int[6];
               var10007[0] = 0;
               var10007[1] = 352;
               var10007[2] = 346;
               var10007[3] = 344;
               var10007[4] = 351;
               var10007[5] = 0;
               var226[1] = var45;
               var233 = var45 = new int[6];
               var233[0] = 0;
               var233[1] = 354;
               var233[2] = 343;
               var233[3] = 347;
               var233[4] = 348;
               var233[5] = 357;
               var226[2] = var45;
               var231 = var45 = new int[6];
               var231[0] = 0;
               var231[1] = 345;
               var231[2] = 353;
               var231[3] = 349;
               var231[4] = 350;
               var231[5] = 0;
               var226[3] = var45;
               int[] var230 = var45 = new int[6];
               var230[0] = 0;
               var230[1] = 0;
               var230[2] = 0;
               var230[3] = 0;
               var230[4] = 0;
               var230[5] = 0;
               var226[4] = var45;
               var201.l1 = var226;
               ((con__3)var201).Wm0 = new float[5][6];

               for(short var55 = 343; var55 <= 354; ++var55) {
                  ((Ao0)this.Za0.Sx0[var55]).Va0 = 212;
               }

               String var56 = "/a/0/5/5";
               Ae var57;
               Ae var202 = var57 = (Ae)super.fd0.dg.get(var56);
               Qd0.cV();
               var10001 = var202.kd;
               int var58;
               ByteOrder var89;
               ByteBuffer var107;
               if ((var58 = pf_0.LPt2(var107 = (var74 = var202.h2).dL.duplicate().order(var89 = ByteOrder.LITTLE_ENDIAN), var57.bM0)) != 1129464142) {
                  throw new RuntimeException(GQ.ti("Header magic mismatch = ", var58, " vs expected 1129464142"));
               } else {
                  var58 = ax0_0.vU(var107);
                  int var116;
                  int var126 = iy_1.WG0(var116 = var107.getInt(), 8, ((Buffer)var107).position(), var107);
                  var126 = ((Buffer)var107).position() + var126;
                  String var132 = "/a/0/5/6";
                  Ae var133;
                  var202 = var133 = (Ae)super.fd0.dg.get(var132);
                  Qd0.cV();
                  var10001 = var202.kd;
                  ByteBuffer var90;
                  int var134;
                  l50_0 var142;
                  if ((var134 = pf_0.LPt2(var90 = (var142 = var202.h2).dL.duplicate().order(var89), var133.bM0)) != 1129464142) {
                     throw new RuntimeException(GQ.ti("Header magic mismatch = ", var134, " vs expected 1129464142"));
                  } else {
                     int var117 = ax0_0.vU(var90);
                     var134 = iy_1.WG0(var90.getInt(), 8, ((Buffer)var90).position(), var90);
                     var134 = ((Buffer)var90).position() + var134;
                     this.Jr0 = new v8_0[var116];

                     for(short var149 = 0; var149 < this.Jr0.length; ++var149) {
                        int var157;
                        int var167 = var107.getInt(var58 + 12 + (var157 = var149 * 8));
                        int var223 = GA.m1(var58, 16, var157, var107);
                        int var168 = var167 + var126;
                        int var176 = var223 - var167;
                        String[] var180 = un0_0.DB0;
                        if (var149 < 400) {
                           String var205 = var180[var149];
                        } else {
                           Integer.toString(var149);
                        }

                        ByteOrder var185;
                        ByteBuffer var186;
                        (var186 = var74.dL.duplicate().order(var185 = ByteOrder.LITTLE_ENDIAN)).position(var168);
                        if (var176 > 0) {
                           AT.i20(var168, var176, ((Buffer)var186).limit(), var186);
                        }

                        ByteBuffer var169 = var186.slice().order(var185);
                        v8_0 var177;
                        var177 = new v8_0(var149, this, var169);
                        int var170 = GA.m1(var117, 12, var157, var90);
                        var223 = GA.m1(var117, 16, var157, var90);
                        var157 = var170 + var134;
                        var170 = var223 - var170;
                        if (var149 < 400) {
                           String var206 = var180[var149];
                        } else {
                           Integer.toString(var149);
                        }

                        ByteBuffer var181;
                        (var181 = var142.dL.duplicate().order(var185)).position(var157);
                        if (var170 > 0) {
                           AT.i20(var157, var170, ((Buffer)var181).limit(), var181);
                        }

                        ByteBuffer var159 = var181.slice().order(var185);

                        io_2[] var182 = var177.JS;
                        for(int var172 = 0; var172 < var182.length; ++var172) {
                           io_2 var183;
                           var183 = new io_2(var177, var159);
                           var182[var172] = var183;
                        }

                        this.Jr0[var149] = var177;
                        // The original bytecode stores 4 in a reused local slot only
                        // while selecting the lookup table; it must not overwrite the
                        // surrounding resource-table loop index.
                        OV target = wn_1.pn.zx0[4];
                        target.xk.coM4(var177.vn, var177);
                     }

                      FJ var60 = new FJ((Ae)super.fd0.dg.get("/a/1/4/4"));

                     Wr var77;
                     var77 = new Wr(new uh0_0(var60));
                     this.U9 = var77;
                     Rk0 var78;
                     var78 = new Rk0(var60.GJ(2), false);
                     byte var91 = 2;
                     this.Hq0 = new Wr[2];

                     for(int var108 = 0; var108 < var91; ++var108) {
                        Wr[] var210 = this.Hq0;
                        Wr var118;
                        var118 = new Wr(new Bz(var60, var78, var108));
                        var210[var108] = var118;
                     }

                     String var16 = "/a/0/4/9";
                     Ae var17 = (Ae)super.fd0.dg.get(var16);
                     var60 = new FJ(var17);

                     for(int var18 = 0; var18 < 8; ++var18) {
                        ob0_0 var212 = ob0_0.Ui0();
                        byte var79 = 4;
                        AG0 var92 = (new Wr(new XV(var60, var18))).T20();
                        var212.Zc0[var79][var18] = var92;
                     }

                  }
               }
            }
         }
      }
   }

   public final F90 eg0(short var1) {
       Ae archiveEntry = (Ae)super.fd0.dg.get("/a/0/3/2");
       Qd0.cV();
       ByteBuffer buffer = archiveEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
       int magic = pf_0.LPt2(buffer, archiveEntry.bM0);
       int expectedMagic = 1129464142;
       if (magic != expectedMagic) {
          throw new RuntimeException(ac0_0.YH0("Header magic mismatch = ", magic, " vs expected ", expectedMagic));
       }

       int tableOffset = ax0_0.vU(buffer);
       int entryCount = buffer.getInt();
       int dataOffset = ((Buffer)buffer).position() + iy_1.WG0(entryCount, 8, ((Buffer)buffer).position(), buffer);
       if (var1 >= entryCount) {
          return null;
       }

       int indexOffset = var1 * 8;
       int entryOffset = buffer.getInt(tableOffset + 12 + indexOffset);
       int entryEnd = GA.m1(tableOffset, 16, indexOffset, buffer);
       String name = var1 < 400 ? un0_0.DB0[var1] : Integer.toString(var1);
       Ae entry = new Ae(archiveEntry.h2, name, dataOffset + entryOffset, entryEnd - entryOffset, var1);
       entry.kd = "";
       return new ep_1(entry);
   }

   public final void Tf0() {
      HeartGoldSoulSilverRom var10000 = this;
      no0_0 var10003 = super.fd0;
      String var1 = "/data/sound/gs_sound_data.sdat";
      var10000.r3 = new hx_2((Ae)var10003.dg.get(var1));
   }

   public final Wr v5(byte var1, short var2, short var3) {
      Wr[] var4 = null;
      if (var1 == 4) {
         var4 = (Wr[])this.GY.f5(var2);
      } else {
         xm0_0 var5;
         if ((var5 = (xm0_0)this.cS.BM(var1)) != null) {
            Wr[] var6;
            if ((var6 = (Wr[])var5.d90.f5(var2)) == null) {
               var6 = CS;
               var4 = var6;
            } else {
               var4 = var6;
            }
         }
      }

      if (var4 != null && var4.length >= 1) {
         if (var4.length == 16) {
            short[] var8 = WK0;
            if (10 <= var3) {
               return null;
            }

            var3 = var8[var3];
         } else if (var4.length == 17) {
            short[] var9 = yH;
            if (10 <= var3) {
               return null;
            }

            var3 = var9[var3];
         } else if (var4.length == 8) {
            short[] var10 = me;
            if (9 <= var3) {
               return null;
            }

            var3 = var10[var3];
         }

         return var4.length <= var3 ? var4[0] : var4[var3];
      } else {
         return null;
      }
   }

   public final boolean wS(short var1) {
      if (var1 >= 4095 && var1 <= 5094) {
         return false;
      } else if (var1 == 8192) {
         return false;
      } else if (this.Gt.f5(var1) != 0) {
         return false;
      } else {
         return var1 != 1;
      }
   }

   public final am_2 EL0(MG0 var1, int var2) {
       MG0 ignored = MG0.lpt6;
       Ae archiveEntry = (Ae)super.fd0.dg.get("/a/0/4/4");
       Qd0.cV();
       ByteBuffer buffer = archiveEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
       int magic = pf_0.LPt2(buffer, archiveEntry.bM0);
       int expectedMagic = 1129464142;
       if (magic != expectedMagic) {
          throw new RuntimeException(ac0_0.YH0("Header magic mismatch = ", magic, " vs expected ", expectedMagic));
       }

       int tableOffset = ax0_0.vU(buffer);
       int entryCount = buffer.getInt();
       int dataOffset = ((Buffer)buffer).position() + iy_1.WG0(entryCount, 8, ((Buffer)buffer).position(), buffer);
       int indexOffset = var2 * 8;
       int entryOffset = buffer.getInt(tableOffset + 12 + indexOffset);
       int entryEnd = GA.m1(tableOffset, 16, indexOffset, buffer);
       int entryPosition = dataOffset + entryOffset;
       int entryLength = entryEnd - entryOffset;
       ByteOrder order = ByteOrder.LITTLE_ENDIAN;
       ByteBuffer entryBuffer = archiveEntry.h2.dL.duplicate().order(order);
       entryBuffer.position(entryPosition);
       if (entryLength > 0) {
          AT.i20(entryPosition, entryLength, ((Buffer)entryBuffer).limit(), entryBuffer);
       }

       return new Er0(entryBuffer.slice().order(order), false, false).E10;
   }

   public final void A3() {
       c2_0 data = new c2_0(this, lpt6__2.Q80, (Ae)super.fd0.dg.get("/a/0/2/7"));
       this.Gn = data;
       this.b70 = data;
   }

   public final byte Tz() {
      return 4;
   }

   public final S80 G80() {
      return this.Za0;
   }

   public final Z50 Sc0(int var1) {
      return (Ao0)this.Za0.Sx0[var1];
   }
}

