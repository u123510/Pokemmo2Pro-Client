package cn.pokemmo.rom.nds.bw;

import f.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class BwPokemonModelRenderer implements fy0_0 {
   public final int Yy0;
   public final short Wi;
   public final short KL0;
   public final boolean xe0;
   public final byte R80;
   public final boolean qd0;
   public float og = 0.0F;
   public BJ0 GV;
   public U5 PP;
   public ER BC0;
   public final es_1 is0;
   public boolean Zq;
   public Runnable Rr0;

   public BwPokemonModelRenderer(short var1, boolean var2, byte var3) {
      es_1 var4;
      var4 = new es_1();
      this.is0 = var4;
      this.Zq = false;
      this.Rr0 = null;
      this.Yy0 = 3;
      this.Wi = -1;
      this.KL0 = var1;
      this.xe0 = var2;
      this.R80 = var3;
      this.qd0 = false;
      this.iL();
      this.FB0();
   }

   public BwPokemonModelRenderer(int var1, short var2, short var3) {
      es_1 var4;
      var4 = new es_1();
      this.is0 = var4;
      this.Zq = false;
      this.Rr0 = null;
      this.Yy0 = var1;
      this.Wi = var2;
      this.KL0 = var3;
      this.xe0 = false;
      this.R80 = 0;
      this.qd0 = false;
      this.iL();
      this.FB0();
   }

   public BwPokemonModelRenderer() {
      es_1 var1;
      var1 = new es_1();
      this.is0 = var1;
      this.Zq = false;
      this.Rr0 = null;
      this.Yy0 = 3;
      this.Wi = -1;
      this.KL0 = -1;
      this.qd0 = true;
      this.xe0 = false;
      this.R80 = 0;
      this.iL();
      this.FB0();
   }

   public static void Ks0(VU var0) {
      CE var1;
      di0_0.Hv0((var1 = var0.I8).Yb0, var1.ZF0, 1.0F, 0.0F, false);
   }

   public final AG0 BB0() {
      short var1 = this.KL0;
      VU var7;
      if (this.KL0 < 0) {
         var1 = (short)(var1 & 4095);
         CE var2;
         CE var10001 = var2 = new CE(CH0.j1);
         var10001.Yb0 = var1;
         if (this.xe0) {
            var2.IB = (short)(var2.IB | 1);
            var2.N00 = QL.N8;
         } else {
            var2.IB = (short)(var2.IB & -10);
            if (var2.N00 == QL.N8) {
               var2.N00 = QL.lQ;
            }
         }

         var2.ZF0 = this.R80;
         var7 = new VU(var2);
      } else {
         VU[] var10;
         VU[] var10000 = var10 = tw0_0.rl.r1(_volatile.BV).y0();
         VU var12 = null;
         int var3 = var10000.length;
         int var4 = 0;

         while (true) {
            if (var4 >= var3) {
               var7 = var12;
               break;
            }

            VU var5;
            if (!(var5 = var10[var4]).I8.vn()) {
               short var6 = this.Wi;
               if (this.Wi < 1 || var5.I8.Mb(var6)) {
                  if (var5.I8.ou0 == this.KL0) {
                     var7 = var5;
                     break;
                  }

                  var12 = var5;
               }
            }

            var4++;
         }
      }

      if (var7 == null) {
         return AG0.HH0;
      }

      VU var15 = var7;
      lpt5__5.hL.ZD(() -> CX.Ks0(var15), 500L);
      var1 = var7.I8.Yb0;
      short var14 = yh_0.Ed(var7.I8.ZF0, var1);
      yh_0 var13 = yh_0.Xm0;
      byte var8 = var7.Dg0();
      return var13.Vo(var14, var8, var7.I8.I())[0];
   }

   public final void iL() {
      this.GV = new BJ0();
      (this.PP = new U5()).LPT8(new PRN_(PRN_.xE, 1.0F, 1.0F, 1.0F, 1.0F));
      mv_0 var1;
      mv_0 var10001 = var1 = new mv_0();
      var10001.el = 32;
      XB var2;
      var2 = new XB(var1);
      this.BC0 = new ER(var2, new Tf());
      nj0_0 var10;
      nj0_0 var10000 = var10 = tw0_0.Ll0.Qz0;
      String var3 = "/a/1/1/5";
      FJ var13 = new FJ((Ae)var10.fd0.dg.get(var3));
      FJ var53 = var13;
      var3 = "/a/1/1/7";
      Ae var16;
      Ae var43 = var16 = (Ae)var10000.fd0.dg.get(var3);
      Qd0.cV();
      l50_0 var4;
      ByteBuffer var44 = (var4 = var43.h2).dL.duplicate();
      ByteOrder var5 = ByteOrder.LITTLE_ENDIAN;
      ByteBuffer var6;
      int var17;
      int var45 = var17 = pf_0.LPt2(var6 = var44.order(ByteOrder.LITTLE_ENDIAN), var16.bM0);
      int var7 = 1129464142;
      if (var45 != 1129464142) {
         throw new RuntimeException(ac0_0.YH0("Header magic mismatch = ", var17, " vs expected ", var7));
      }

      int var11 = ax0_0.vU(var6);
      int var18 = iy_1.WG0(var6.getInt(), 8, var6.position(), var6);
      int var19 = var6.position() + var18;
      String var35 = "/a/1/2/9";
      Ae var36;
      Ae var48 = var36 = (Ae)var10.fd0.dg.get(var35);
      Qd0.cV();
      ByteBuffer var28;
      int var49 = var7 = pf_0.LPt2(var28 = var48.h2.dL.duplicate().order(var5), var36.bM0);
      int var8 = 1129464142;
      if (var49 != 1129464142) {
         throw new RuntimeException(ac0_0.YH0("Header magic mismatch = ", var7, " vs expected ", var8));
      }

      var28.position();
      var28.getInt();
      var28.getInt();
      int var29 = var28.position();
      ((Buffer)var28).position(var28.getInt() * 8 + var29);
      var28.getInt();
      var28.getInt();
      var28.position();
      int var30;
      int var50 = var30 = this.Yy0;
      byte var12 = 2;
      Ou0[] var38 = new Ou0[2];
      int var9 = var6.getInt(var11 + 12 + (var8 = var30 * 8));
      int var56 = GA.m1(var11, 16, var8, var6);
      int var20 = var9 + var19;
      int var33 = var56 - var9;
      String[] var40 = un0_0.DB0;
      if (var50 < 400) {
         String var51 = var40[var30];
      } else {
         Integer.toString(var30);
      }

      ByteBuffer var57 = var4.dL.duplicate();
      ByteOrder var24 = ByteOrder.LITTLE_ENDIAN;
      ByteBuffer var31;
      (var31 = var57.order(ByteOrder.LITTLE_ENDIAN)).position(var20);
      if (var33 > 0) {
         AT.i20(var20, var33, var31.limit(), var31);
      }

      ByteBuffer var21;
      ByteBuffer var52 = var21 = var31.slice().order(var24);
      var52.getShort();
      var52.getShort();
      var52.getShort();
      var52.getShort();
      short var25 = var52.getShort();
      short var32 = var52.getShort();
      var52.getShort();
      var52.getShort();
      int[] var34 = new int[4];

      for (int var41 = 0; var41 < 4; var41++) {
         var34[var41] = var21.getShort();
      }

      if (var25 != -1) {
         v80_0.Cb0().getClass();
         var38[0] = v80_0.CW(var13, var25, var34);
      }

      for (int var26 = 0; var26 < 4; var26++) {
         var34[var26] = var21.getShort();
      }

      if (var32 != -1) {
         v80_0.Cb0().getClass();
         var38[1] = v80_0.CW(var13, var32, var34);
      }

      for (int var14 = 0; var14 < var12; var14++) {
         Ou0 var22;
         if ((var22 = var38[var14]) != null) {
            int var27 = this.Yy0;
            if (this.Yy0 == 3 && var14 == 0) {
               if (!this.qd0) {
                  ((mz_2)((BM)var22.Y3.get(0)).sg(mz_2.g7)).R4(this.BB0().d3());
               } else {
                  ((BM)var22.Y3.get(0)).LPT8(new sh_0(0.0F));
               }
            } else if (var27 == 3 && this.qd0) {
               var22.ho.w2(1.0F, 0.5F, 1.0F);
            }

            Ou0 var23 = var38[var14];
            this.is0.Ue0(var23);
         }
      }
   }

   public final void FB0() {
      this.og = 0.0F;
      I2 var1 = this.is0.ZD();

      while (var1.hasNext()) {
         Ou0 var10000 = (Ou0)var1.next();
         var10000.EG();
         var10000.TI(false);
      }
   }

   public final void Os() {
      BJ0 var10004 = this.GV;
      BJ0 var10005 = this.GV;
      BJ0 var10006 = this.GV;
      BJ0 var10007 = this.GV;
      BJ0 var10008 = this.GV;
      BJ0 var10009 = this.GV;
      BJ0 var10010 = this.GV;
      BJ0 var10011 = this.GV;
      BJ0 var10012 = this.GV;
      this.GV.Wu0 = 0.1F;
      var10012.Qy = 200.0F;
      var10011.zo0 = 40.0F;
      var10010.d00 = 0.0F;
      var10009.Q30 = 0.0F;
      C8 var11 = var10008.jd0;
      float var1 = 0.0F;
      float var2 = -1.0F;
      var10008.jd0.x = 0.0F;
      var11.y = var1;
      var11.z = var2;
      C8 var10 = var10007.v40;
      var1 = 0.0F;
      var2 = 0.0F;
      var10007.v40.x = 0.0F;
      var10.y = var1;
      var10.z = var2;
      var10006.Rg0 = 2.0F;
      var1 = var10005.x90.x;
      var2 = var10005.x90.y;
      float var3 = var10005.x90.z;
      var10004.JP(var1, var2, var3);
      this.GV.ye(true);
      lg_0.OH0.glClear(256);
      this.BC0.jK(this.GV);
      es_1 var4 = this.is0;
      this.BC0.A80(var4, this.PP);
      this.BC0.end();
   }

   @Override
   public final void dispose() {
      I2 var1 = this.is0.ZD();

      while (var1.hasNext()) {
         ((Ou0)var1.next()).O4();
      }

      this.is0.clear();
      ((uu_0)this.BC0.KF).dispose();
      Runnable var2;
      if ((var2 = this.Rr0) != null) {
         var2.run();
      }
   }
}
