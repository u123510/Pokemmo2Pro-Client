package cn.pokemmo.net.codec.binary;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * 业务协议二进制数据载荷解码器 (Game Data Payload Decoder)
 * 
 * 职责:
 * 为所有入站数据包 (InboundPacket) 提供业务实体级的高性能二进制解码能力，
 * 涵盖玩家外观档案、背包道具条目、宝可梦物种属性、招式技能表、公会成员、对战行动等。
 * 
 * 原混淆类: f.yq0_0
 */

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public abstract class GameDataPayloadReader extends gl0_2 {
   public GameDataPayloadReader(ByteBuffer var1, int var2) {
      super(var1, var2);
   }

   public final CH0 pE() {
      return CH0.Ab(super.Rj.getLong());
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public final e30_0 CW(boolean var1) {
      e30_0 var22;
      CH0 var2 = this.pE();
      String var3 = this.q60();
      String var4 = this.q60();
      int var5 = super.Rj.getInt();
      byte var6 = super.Rj.get();
      int var7 = super.Rj.getInt();
      long var8;
      if (var1) {
         var8 = 0L;
      } else {
         var8 = super.Rj.getLong();
      }

      int var23 = super.Rj.getInt();
      super.Rj.getInt();
      super.Rj.get();
      int var29 = super.Rj.getInt();
      int var33 = super.Rj.getInt();
      short var10 = super.Rj.getShort();
      int var11 = super.Rj.getInt();
      byte var12 = super.Rj.get();
      super.Rj.get();
      byte var13 = super.Rj.get();
      super.Rj.getInt();
      super.Rj.get();
      super.Rj.get();
      super.Rj.get();
      super.Rj.get();
      super.Rj.get();
      super.Rj.get();
      super.Rj.get();
      super.Rj.get();
      short var14 = super.Rj.getShort();
      byte var15 = super.Rj.get();
      int var16 = super.Rj.getInt();
      byte var17 = super.Rj.get();
      byte var18 = super.Rj.get();
      byte var19 = super.Rj.get();
      super.Rj.get();
      super.Rj.get();
      super.Rj.get();
      var22 = new e30_0(
         var2, var3, var4, var5, var6, var7, var8, var23, var29, var33, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19
      );
      byte var24 = super.Rj.get();
      byte var30 = super.Rj.get();
      byte var34 = super.Rj.get();
      super.Rj.get();
      short var36 = super.Rj.getShort();
      short var39 = super.Rj.getShort();
      super.Rj.get();
      super.Rj.get();
      var22.kC = var24;
      var22.Oq0 = var30;
      var22.Zl0 = var34;
      var22.sL0 = var36;
      var22.t60 = var39;
      var22.Kx = super.Rj.getShort();
      var22.yL0 = super.Rj.getShort();
      byte var26 = super.Rj.get();
      j30_0 var10003 = (j30_0)t_0.BI0(j30_0.v7.BM(var26), j30_0.class, var26);
      short var27 = super.Rj.getShort();
      short var31 = super.Rj.getShort();
      var22.Uj = var10003;
      var22.ey = var27;
      var22.a = var31;
      byte var28;
      QL[] var32 = new QL[var28 = super.Rj.get()];

      for (int var35 = 0; var35 < var28; var35++) {
         var32[var35] = QL.Q8(super.Rj.get());
      }

      e30_0 var37 = var22;
      Object var21;
      Object var10001 = var21 = var22.x30;
      e30_0 var10002 = var22;
      QL[] var38 = var32;
      synchronized (var21) {
         var10002.Bx = var38;
         // $VF: monitorexit
         return var37;
      }
   }

   public final qe0_2 ki() {
      qe0_2 var1 = new qe0_2();
      var1.Fw = super.Rj.get();
      short var2 = super.Rj.getShort();
      q10_0[] var3 = q10_0.Pn0;
      int var4 = q10_0.Pn0.length;

      for (int var5 = 0; var5 < var4; var5++) {
         q10_0 var6 = var3[var5];
         if ((var2 & 1 << var6.iL) != 0) {
            short var7;
            short var10000 = var7 = super.Rj.getShort();
            short[] var10 = var1.pr;
            byte var8 = var6.iL;
            short var9;
            if ((var9 = (short)(var10000 & 1023)) == 1023) {
               var9 = -1;
            }

            var10[var8] = var9;
            byte[] var11 = var1.iu0;
            byte var12;
            if ((var12 = (byte)((var7 & '\uffff') >> 10)) == 63) {
               var12 = -1;
            }

            var11[var8] = var12;
         }
      }

      return var1;
   }

   public final pe_0 h() {
      CH0 var1 = this.pE();
      String var2 = this.q60();
      String var3 = this.q60();
      int var4 = super.Rj.getInt();
      String var5 = this.q60();
      int var6 = super.Rj.getInt();
      short var7 = super.Rj.getShort();
      short var8 = super.Rj.getShort();
      short var9 = super.Rj.getShort();
      short var10 = super.Rj.getShort();
      short var11 = super.Rj.getShort();
      int var12 = super.Rj.getInt();
      byte var13;
      String[] var14 = new String[var13 = super.Rj.get()];

      for (int var15 = 0; var15 < var13; var15++) {
         var14[var15] = this.q60();
      }

      return new pe_0(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14);
   }

   public final cd0_2 h80() {
      String var1 = this.q60();
      cd0_2 var10000 = new cd0_2(super.Rj.get(), super.Rj.getInt(), var1);
      var10000.ZQ = super.Rj.get();
      var10000.c80(q10_0.VI, super.Rj.getShort());
      var10000.c80(q10_0.uz, super.Rj.getShort());
      var10000.c80(q10_0.rg0, super.Rj.getShort());
      var10000.c80(q10_0.Bj0, super.Rj.getShort());
      return var10000;
   }

   public final hl0_0 BM() {
      byte var1;
      byte var10000 = var1 = super.Rj.get();
      CH0 var2 = this.pE();
      if ((var10000 & 1) != 0) {
         this.pE();
      }

      short var3 = super.Rj.getShort();
      short var4 = super.Rj.getShort();
      byte var5 = super.Rj.get();
      A5 var10 = (A5)t_0.BI0(A5.N8.BM(var5), A5.class, var5);
      if ((var1 & 2) != 0) {
         super.Rj.get();
      }

      byte var6;
      if ((var1 & 4) != 0) {
         var6 = super.Rj.get();
      } else {
         var6 = 0;
      }

      byte var7;
      if ((var1 & 8) != 0) {
         var7 = super.Rj.get();
      } else {
         var7 = -1;
      }

      hl0_0 var8 = new hl0_0(var2, var3, var4, var10, var6, var7);
      if ((var1 & 16) != 0) {
         int var9 = super.Rj.getInt();
         var8.pe = new tu_2(super.Rj.get(), super.Rj.get(), var9);
      }

      return var8;
   }

   public final iz0_0 vG() {
      byte var1 = super.Rj.get();
      byte var2;
      byte var10000 = var2 = super.Rj.get();
      byte var3 = 0;
      if ((var10000 & 128) != 0) {
         var2 = (byte)(var2 & 127);
         var3 = super.Rj.get();
      }

      if (var2 != 5) {
         if (var2 == 28) {
            iz0_0 var12 = new iz0_0(var1, var2);
            var12.cOm5 = var3;
            return var12;
         }

         if (var2 == 30) {
            iz0_0 var11 = new iz0_0(var1, super.Rj.getLong());
            var11.cOm5 = var3;
            return var11;
         }

         if (var2 == 9 || var2 == 10 || var2 == 17) {
            iz0_0 var10 = new iz0_0(var1, var2, super.Rj.getInt());
            var10.cOm5 = var3;
            return var10;
         }

         if (var2 != 18) {
            int var4;
            short[] var5 = new short[var4 = super.Rj.get() & 0xFF];

            for (int var6 = 0; var6 < var4; var6++) {
               var5[var6] = super.Rj.getShort();
            }

            iz0_0 var9 = new iz0_0(var1, var2, var5);
            var9.cOm5 = var3;
            return var9;
         }
      }

      String var7 = this.q60();
      iz0_0 var8 = new iz0_0(var1, var2, var7);
      var8.cOm5 = var3;
      return var8;
   }

   public final Im X90() {
      CH0 var10002 = this.pE();
      av_1 var7 = (av_1)av_1.rh.BM(super.Rj.get());
      byte var1 = super.Rj.get();
      float var2 = super.Rj.getFloat();
      short var3 = super.Rj.getShort();
      byte var4 = super.Rj.get();
      int var5 = super.Rj.getInt();
      int var6 = super.Rj.getInt();
      return new Im(var10002, var7, var1, var2, var3, var4, var5, var6);
   }

   public final SZ di0() {
      switch (super.Rj.get()) {
         case -1:
            return null;
         case 0:
            int var8 = super.Rj.getInt();
            int var10;
            iz0_0[] var11 = new iz0_0[var10 = super.Rj.get() & 0xFF];

            for (int var12 = 0; var12 < var10; var12++) {
               var11[var12] = this.vG();
            }

            return new ru_0(var8, var11);
         case 1:
            byte var7 = super.Rj.get();
            int var9;
            short[] var3 = new short[var9 = super.Rj.get() & 0xFF];

            for (int var4 = 0; var4 < var9; var4++) {
               var3[var4] = super.Rj.getShort();
            }

            return new pb0_1(var7, var3);
         case 2:
            short var6 = super.Rj.getShort();
            return new P50(super.Rj.get(), super.Rj.get(), var6);
         case 3:
            byte var10002 = super.Rj.get();
            lpt6__2 var5 = (lpt6__2)lpt6__2.If.BM(super.Rj.get());
            short var1 = super.Rj.getShort();
            short var2 = super.Rj.getShort();
            return new N5(var10002, var5, var1, var2);
         default:
            return new ru_0(0);
      }
   }

   public final zp0_0 Pl0() {
      zp0_0 var1;
      CH0 var2 = this.pE();
      byte var3 = super.Rj.get();
      byte var4 = super.Rj.get();
      String var5 = this.q60();
      short var6 = super.Rj.getShort();
      byte var7 = super.Rj.get();
      Cq var8 = Cq.Gl(super.Rj.get());
      long var9 = super.Rj.getLong();
      byte var11 = super.Rj.get();
      int var12 = super.Rj.getInt();
      byte var13 = super.Rj.get();
      boolean var14;
      if (super.Rj.get() == 1) {
         var14 = true;
      } else {
         var14 = false;
      }

      boolean var15;
      if (super.Rj.get() == 1) {
         var15 = true;
      } else {
         var15 = false;
      }

      super.Rj.get();
      var1 = new zp0_0(var2, var3, var4, var5, var6, var7, var8, var9, var11, var12, var13, var14, var15);
      return var1;
   }

   public final HZ[] Q10() {
      byte var1;
      if ((var1 = super.Rj.get()) > 0) {
          HashMap var2 = new HashMap();

         for (int var3 = 0; var3 < var1; var3++) {
            byte var4 = super.Rj.get();
            short var5 = super.Rj.getShort();
            short var6 = super.Rj.getShort();
            short var7 = super.Rj.getShort();
            short var8 = super.Rj.getShort();
            byte var9 = super.Rj.get();
            byte var10;
            GV var14;
            if ((var10 = super.Rj.get()) < 0) {
               var14 = null;
            } else {
               var14 = GV.Zd(var10);
            }

            byte var11;
            N2 var15;
            if ((var11 = super.Rj.get()) < 0) {
               var15 = null;
            } else {
               var15 = N2.FW(var11);
            }

            HZ var12;
            if ((var12 = (HZ)var2.get(var15)) == null) {
               var12 = new HZ(var15);
               var2.put(var15, var12);
            }

            qr_1 var13 = new qr_1(var4, var5, var6, var7, var8, var14, var15, var9);
            if (!var12.x2.contains(var13)) {
               var12.x2.add(var13);
            }
         }

          HZ[] var10000 = (HZ[])var2.values().toArray(new HZ[0]);
         Arrays.sort(var10000);
         return var10000;
      } else {
         return new HZ[0];
      }
   }

   public final lq0[] Nx0() {
      byte var1;
      lq0[] var2 = new lq0[var1 = super.Rj.get()];

      for (int var3 = 0; var3 < var1; var3++) {
         GV var4;
         lq0 var5;
         if ((var4 = GV.Zd(super.Rj.get())).jC0) {
            var5 = lq0.JS(var4, super.Rj.get());
         } else {
            var5 = lq0.p8(var4);
         }

         var2[var3] = var5;
      }

      return var2;
   }

   public final ls_0[] Vj0() {
      byte var1;
      byte var10000 = var1 = super.Rj.get();
      ls_0[] var2 = new ls_0[var10000];
      if (var10000 < 1) {
         return var2;
      }

      _volatile var4 = (_volatile)_volatile.zs0.BM(super.Rj.get());

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = new ls_0(this.pE(), super.Rj.getShort());
      }

      return var2;
   }

   public final ch0_2 ST() {
      e30_0 var1 = this.CW(true);
      qe0_2 var2 = this.ki();
      qe0_2 var3 = new qe0_2(var2);
      short var13 = super.Rj.getShort();
      q10_0[] var4 = q10_0.Pn0;
      int var5 = q10_0.Pn0.length;

      for (int var6 = 0; var6 < var5; var6++) {
         q10_0 var7 = var4[var6];
         if ((var13 & 1 << var7.iL) != 0) {
            short var8;
            short var10000 = var8 = super.Rj.getShort();
            short[] var17 = var3.pr;
            byte var9 = var7.iL;
            short var10;
            if ((var10 = (short)(var10000 & 1023)) == 1023) {
               var10 = -1;
            }

            var17[var9] = var10;
            byte[] var18 = var3.iu0;
            byte var19;
            if ((var19 = (byte)((var8 & '\uffff') >> 10)) == 63) {
               var19 = -1;
            }

            var18[var9] = var19;
         }
      }

      ch0_2 var14 = new ch0_2(var1, var3);
      vl_1 var11;
      if ((super.Rj.get() & 255) == 1) {
          vl_1 var20;
         k40_0 var10003 = (k40_0)k40_0.Ds.BM(super.Rj.get());
         this.q60();
          var11 = var20 = new vl_1(super.Rj.getInt());
      } else {
         var11 = null;
      }

      var14.GT = var11;
      int var12 = super.Rj.get() & 255;
      ArrayList var15 = new ArrayList();

      for (int var16 = 0; var16 < var12; var16++) {
         var15.add(this.Lr0());
      }

      var14.Uk0 = var15;
      return var14;
   }

   public final CE Lr0() {
      CE var1 = new CE(this.pE());
      byte var2 = super.Rj.get();
      b var55 = (b)t_0.BI0(b.JW.BM(var2), b.class, var2);
      CH0 var3 = this.pE();
      this.pE();
      _volatile var4 = (_volatile)_volatile.zs0.BM(super.Rj.get());
      short var5 = super.Rj.getShort();
      short var6 = super.Rj.getShort();
      int var7 = super.Rj.getInt();
      CH0 var8 = this.pE();
      String var9 = this.q60();
      String var10 = this.q60();
      byte var11 = super.Rj.get();
      byte var12 = super.Rj.get();
      byte var13 = super.Rj.get();
      short var14 = super.Rj.getShort();
      short var15 = super.Rj.getShort();
      int var16 = super.Rj.getInt();
      byte var17 = super.Rj.get();
      short var18 = super.Rj.getShort();
      short var19 = super.Rj.getShort();
      short var20 = super.Rj.getShort();
      short var21 = super.Rj.getShort();
      short var22 = super.Rj.getShort();
      byte var23 = super.Rj.get();
      byte var24 = super.Rj.get();
      byte var25 = super.Rj.get();
      byte var26 = super.Rj.get();
      short var27 = super.Rj.getShort();
      short var28 = super.Rj.getShort();
      short var29 = super.Rj.getShort();
      short var30 = super.Rj.getShort();
      short var31 = super.Rj.get();
      short var32 = super.Rj.get();
      short var33 = super.Rj.get();
      short var34 = super.Rj.get();
      short var35 = super.Rj.get();
      short var36 = super.Rj.get();
      byte var37 = super.Rj.get();
      byte var38 = super.Rj.get();
      byte var39 = super.Rj.get();
      byte var40 = super.Rj.get();
      byte var41 = super.Rj.get();
      super.Rj.get();
      byte var42 = super.Rj.get();
      byte var43 = super.Rj.get();
      byte var44 = super.Rj.get();
      byte var45 = super.Rj.get();
      byte var46 = super.Rj.get();
      int var47 = super.Rj.getInt();
      byte var48;
      byte var10000 = var48 = super.Rj.get();
      long var49 = super.Rj.getLong();
      short var51 = super.Rj.getShort();
      int var52 = super.Rj.getInt();
      short var10001 = super.Rj.getShort();
      byte var53 = super.Rj.get();
      byte var54 = super.Rj.get();
      short normalizedPokemonIndex = var6;
      byte normalizedFormType = var46;
      cq_0 formEntry = mp_1.vf0().W50(var6);
      if (formEntry != null && formEntry.kT != null) {
         normalizedPokemonIndex = formEntry.kT.dR;
         if (normalizedFormType == 0) {
            normalizedFormType = formEntry.a20;
         }
      }
      var1.Hf0 = var55;
      var1.W50 = var3;
      var1.JF = var4;
      var1.ou0 = var5;
      var1.Yb0 = normalizedPokemonIndex;
      var1.vQ = var7;
      var1.C70 = var8;
      var1.bj = var9;
      var1.kX = var10;
      var1.jw0 = var11;
      var1.H1 = var12;
      var1.wj = var13;
      var1.VD = var14;
      var1.pQ = var15;
      var1.Lr0 = var16;
      var1.WH0 = var17;
      var1.bm = var18;
      var1.Gu[0] = var19;
      var1.Gu[1] = var20;
      var1.Gu[2] = var21;
      var1.Gu[3] = var22;
      var1.TC0[0] = var23;
      var1.TC0[1] = var24;
      var1.TC0[2] = var25;
      var1.TC0[3] = var26;
      var1.V3[0] = var27;
      var1.V3[1] = var28;
      var1.V3[2] = var29;
      var1.V3[3] = var30;
      short[] var56 = var1.iI0;
      var56[0] = (short)(var31 & 0xFF);
      var56[1] = (short)(var32 & 0xFF);
      var56[2] = (short)(var33 & 0xFF);
      var56[3] = (short)(var34 & 0xFF);
      var56[4] = (short)(var35 & 0xFF);
      var1.iI0[5] = (short)(var36 & 0xFF);
      var1.sl = var37;
      var1.GD0 = var38;
      var1.Fe = var39;
      var1.y8 = var40;
      var1.zc = var41;
      var1.vO = var42;
      var1.aJ0 = var43;
      var1.dZ = var44;
      var1.QQ = var45;
      var1.ZF0 = normalizedFormType;
      var1.al0 = var47;
      var1.gU = var49;
      var1.IB = var51;
      var1.t50 = var52;
      var1.SW = var10001;
      if (var10000 == 2 && !var1.ca() && !var4.zK0) {
         var1.Xn0 = 0;
      } else {
         var1.Xn0 = var48;
      }

      if (var53 < 0) {
         var1.kQ = null;
      } else {
         var1.kQ = i40_0.MG0(var53);
      }

      var1.N00 = QL.Q8(var54);
      var1.tI();
      QL[] var58 = new QL[var2 = super.Rj.get()];

      for (int var59 = 0; var59 < var2; var59++) {
         var58[var59] = QL.Q8(super.Rj.get());
      }

      var1.bG0 = var58;
      return var1;
   }

   public final St0 m5(boolean var1, boolean var2) {
      CH0 var3 = this.pE();
      CH0 var4 = this.pE();
      CH0 var5 = this.pE();
      byte var6 = super.Rj.get();
      String var7 = var1 ? "" : this.q60();
      String var8 = var1 ? this.q60() : "";
      int var9 = super.Rj.getInt();
      String var10 = this.q60();
      String var11 = var2 ? this.q60() : "";
      byte var12 = super.Rj.get();
      super.Rj.get();
      St0 var13 = new St0(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      // Mail lists and mail details share this parser.  The second argument
      // marks a detail packet; only details carry the attachment section.
      if (!var2) {
         return var13;
      }

      int var14 = super.Rj.get() & 255;
      HashMap<Byte, o60_0> var15 = new HashMap<>();
      for (int var16 = 0; var16 < var14; var16++) {
         CH0 var17 = var13.Tp;
         byte var18 = super.Rj.get();
         boolean var19 = super.Rj.get() == 1;
         byte var20 = super.Rj.get();
         long var21 = super.Rj.getLong();
         super.Rj.get();
         short var23 = super.Rj.getShort();
         short var24 = super.Rj.getShort();
         byte var25 = super.Rj.get();
         o60_0 var26 = new o60_0(var17, var18, var19, var20, var21, var23, var24, var25);
         if (var20 != 0) {
            if (var20 == 1) {
               if ((super.Rj.get() & 255) == 1) {
                  var26.tx0 = this.Lr0();
                  for (byte var27 = 0; var27 < 6; var27++) {
                     var26.Ul0[var27] = super.Rj.getShort();
                  }
               }
            } else if (var20 == 3) {
               if ((super.Rj.get() & 255) == 1) {
                  var26.kC0 = this.bM0();
               }
            } else if (var20 == 4 && (super.Rj.get() & 255) == 1) {
               this.pE();
               byte var28 = super.Rj.get();
               if (var28 == 1) {
                  short var29 = super.Rj.getShort();
                  byte var30 = super.Rj.get();
                  byte var31 = super.Rj.get();
                  byte var32 = super.Rj.get();
                  boolean var33 = super.Rj.get() == 1;
                  boolean var34 = super.Rj.get() == 1;
                  var26.k = new yi0_1(var28, var29, var30, var31, var32, var33, var34);
               } else if (var28 == 2) {
                  var26.k = new yi0_1(var28, super.Rj.getShort());
               } else {
                  throw new RuntimeException("");
               }
            }
         } else if ((super.Rj.get() & 255) == 1) {
            var26.Pc = this.BM();
         }

         var15.put(var26.sA, var26);
      }

      var13.ej0 = Collections.unmodifiableMap(var15);
      return var13;
   }

   public final jr0_0 bM0() {
      byte var1 = super.Rj.get();
      byte var2 = super.Rj.get();
      if (super.Rj.get() != 1) {
         int var11 = super.Rj.getInt();
         int var13 = super.Rj.getInt();
         int var15 = super.Rj.getInt();
         short var16 = super.Rj.getShort();
         short var17 = super.Rj.getShort();
         byte var18 = super.Rj.get();
         return new jr0_0(var1, var2, var11, var13, var15, var16, var17, var18);
      }

       jr0_0 var3;
      short var4 = super.Rj.getShort();
      boolean var5;
      if ((super.Rj.get() & 255) == 1) {
         var5 = true;
      } else {
         var5 = false;
      }

      boolean var6;
      if ((super.Rj.get() & 255) == 1) {
         var6 = true;
      } else {
         var6 = false;
      }

      byte var7 = super.Rj.get();
      boolean var8;
      if ((super.Rj.get() & 255) == 1) {
         var8 = true;
      } else {
         var8 = false;
      }

      boolean var9;
      if ((super.Rj.get() & 255) == 1) {
         var9 = true;
      } else {
         var9 = false;
      }

      byte var10 = super.Rj.get();
      byte var12 = super.Rj.get();
      byte var14 = super.Rj.get();
       var3 = new jr0_0(var1, var2, var4, var5, var6, var7, var8, var9, var10, var12, var14);
      return var3;
   }

   public final lp_1 uu0() {
      super.Rj.get();
      LY var1 = this.NK();
      LY var2 = this.NK();
      short var3 = super.Rj.getShort();
      byte var4 = super.Rj.get();
      return new lp_1(var1, var2, var3, var4);
   }
}
