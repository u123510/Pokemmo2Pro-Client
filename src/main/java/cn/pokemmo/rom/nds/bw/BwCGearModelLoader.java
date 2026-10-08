package cn.pokemmo.rom.nds.bw;

import f.*;
import com.badlogic.gdx.graphics.Texture;
import java.nio.ByteBuffer;

public class BwCGearModelLoader implements fy0_0 {
   public FJ bK;
   public Ou0 Jj0;
   public final Ou0 EK0;
   public Ou0 ef;
   public Ou0 ku0;
   public Ou0 l00;
   public Ou0[] lK;
   public Gv0 bM;
   public B5[][] bX = new B5[3][];
   public B5[] CA;
   public B5[] TF0;
   public Texture Fl;
   public Texture XB0;
   public es_1 uV;

   public BwCGearModelLoader(nj0_0 var1) {
      es_1 var2;
      var2 = new es_1();
      this.uV = var2;
      FJ var14 = new FJ(var1.nuL().COM7("/a/2/0/5"));
      this.bK = var14;
      v80_0.Cb0();
      int[] var6;
      int[] var10004 = var6 = new int[4];
      var10004[0] = 35;
      var10004[1] = -1;
      var10004[2] = -1;
      var10004[3] = -1;
      this.EK0 = v80_0.CW(var14, 34, var6);
      v80_0.Cb0();
      int[] var7;
      int[] var10003 = var7 = new int[4];
      var10003[0] = 39;
      var10003[1] = -1;
      var10003[2] = -1;
      var10003[3] = 38;
      this.ku0 = v80_0.CW(var14, 37, var7);
      ByteBuffer var8;
      ByteBuffer var28 = var8 = var14.EG(33).j90();
      int var3 = var28.getInt();
      int var4;
      int var24;
      if ((var4 = var28.getInt()) == 65792) {
         var24 = 24;
      } else if (var4 == 65793) {
         var24 = 36;
      } else {
         if (var4 != 65536) {
            throw new RuntimeException();
         }

         var24 = 12;
      }

      if (var8.remaining() != var3 * var24) {
         throw new RuntimeException();
      }

      Gv0 var9;
      var9 = new Gv0(var14.EG(36));
      this.bM = var9;

      for (int var10 = 0; var10 < 3; var10++) {
         int var15;
         var3 = (var15 = var10 * 2) + 1;
         var24 = var10 + 12;
         this.bX[var10] = this.LD(var15, var3, var24);
      }

      this.CA = new B5[4];
      this.TF0 = new B5[4];

      for (int var11 = 0; var11 < this.CA.length; var11++) {
         Tt0 var16;
         var16 = new Tt0(this.bK.EG(var11 + 7));
         Gt0 var22;
         var22 = new Gt0(this.bK.EG(16));
         IA0 var26;
         var26 = new IA0(this.bK.EG(19));
         IA0 var5;
         IA0 var29 = var5 = new IA0(this.bK.EG(20));
         i4_0 var17 = var26.dB(var16, var22);
         i4_0 var23;
         i4_0 var30 = var23 = var29.dB(var16, var22);
         B5[] var10002 = this.CA;
         B5 var27;
         var27 = new B5(new Texture(var17));
         var10002[var11] = var27;
         var10002 = this.TF0;
         B5 var18;
         var18 = new B5(new Texture(var23));
         var10002[var11] = var18;
         this.uV.Ue0(this.CA[var11].Ae());
         this.uV.Ue0(this.TF0[var11].Ae());
         var17.dispose();
         var30.dispose();
      }

      Tt0 var12;
      var12 = new Tt0(this.bK.EG(11));
      Gt0 var19;
      var19 = new Gt0(this.bK.EG(17));
      i4_0 var13;
      i4_0 var31 = var13 = new Rk0(this.bK.EG(24)).Nz0(var19, var12, 0);
      Texture var20;
      var20 = new Texture(var13);
      this.Fl = var20;
      this.uV.Ue0(var20);
      var31.dispose();
   }

   public BwCGearModelLoader(Ts var1) {
      this.uV = new es_1();
      FJ var2;
      FJ var10002 = var2 = new FJ(var1.nuL().COM7("/graphic/ev_pokeselect.narc"));
      this.bK = var2;
      v80_0.Cb0();
      int[] var6;
      (var6 = new int[1])[0] = 0;
      this.Jj0 = v80_0.CW(var2, 1, var6);
      v80_0.Cb0();
      int[] var7 = new int[0];
      this.EK0 = v80_0.CW(var2, 8, var7);
      v80_0.Cb0();
      int[] var8 = new int[0];
      this.ef = v80_0.CW(var10002, 9, var8);
      this.lK = new Ou0[3];

      for (int var9 = 0; var9 < 3; var9++) {
         Ou0[] var10000 = this.lK;
         v80_0 var14 = v80_0.Cb0();
         var10002 = this.bK;
         int var15;
         int var3 = (var15 = var9 * 2) + 3;
         int[] var4;
         (var4 = new int[1])[0] = var15 + 2;
         var14.getClass();
         var10000[var9] = v80_0.CW(var10002, var3, var4);
      }

      Tt0 var10;
      var10 = new Tt0(this.bK.EG(11));
      Gt0 var16;
      var16 = new Gt0(this.bK.EG(10));
      i4_0 var11;
      i4_0 var20 = var11 = new Rk0(this.bK.EG(12)).Nz0(var16, var10, 0);
      Texture var17 = new Texture(var11);
      this.Fl = var17;
      var20.dispose();
      this.uV.Ue0(var17);
      Tt0 var12;
      var12 = new Tt0(this.bK.EG(15));
      i4_0 var13;
      i4_0 var10001 = var13 = new Gt0(this.bK.EG(14)).Qo0(var12);
      Texture var5 = new Texture(var13);
      this.XB0 = var5;
      var10001.dispose();
      this.uV.Ue0(var5);
   }

   public BwCGearModelLoader(UY var1) {
      this.uV = new es_1();
      FJ var2;
      FJ var10001 = var2 = new FJ(var1.nuL().COM7("/a/0/8/2"));
      this.bK = var2;
      v80_0.Cb0();
      int[] var3 = new int[0];
      this.Jj0 = v80_0.CW(var2, 0, var3);
      v80_0.Cb0();
      int[] var4;
      (var4 = new int[1])[0] = 7;
      this.EK0 = v80_0.CW(var2, 1, var4);
      v80_0.Cb0();
      int[] var5;
      int[] var10005 = var5 = new int[2];
      var10005[0] = 6;
      var10005[1] = 5;
      this.ku0 = v80_0.CW(var2, 2, var5);
      v80_0.Cb0();
      int[] var6;
      (var6 = new int[1])[0] = 4;
      this.l00 = v80_0.CW(var10001, 3, var6);
   }

   public B5[] LD(int var1, int var2, int var3) {
      byte var4 = 21;
      Tt0 var5;
      var5 = new Tt0(this.bK.GJ(var1));
      Tt0 var8;
      var8 = new Tt0(this.bK.GJ(var2));
      Gt0 var10;
      var10 = new Gt0(this.bK.GJ(var3), false);
      Rk0 var13;
      Rk0 var10000 = var13 = new Rk0(this.bK.GJ(var4), false);
      byte var11 = 96;
      byte var14 = 96;
      i4_0 var12 = var13.oQ(var10, var5, 0, var11, var14, 0);
      var14 = 96;
      var4 = 96;
      i4_0 var9 = var10000.oQ(var10, var8, 0, var14, var4, 0);
      B5[] var16;
      B5[] var18 = var16 = new B5[2];
      B5 var6;
      var6 = new B5(new Texture(var12));
      var16[0] = var6;
      B5 var7;
      var7 = new B5(new Texture(var9));
      var16[1] = var7;
      this.uV.Ue0(var16[0].OB);
      this.uV.Ue0(var16[1].OB);
      var12.dispose();
      var9.dispose();
      return var18;
   }

   @Override
   public final void dispose() {
      I2 var1 = this.uV.ZD();

      while (var1.hasNext()) {
         ((fy0_0)var1.next()).dispose();
      }

      Ou0 var3 = this.Jj0;
      if (this.Jj0 != null) {
         var3.O4();
      }

      Ou0 var4 = this.EK0;
      if (this.EK0 != null) {
         var4.O4();
      }

      Ou0 var5 = this.ef;
      if (this.ef != null) {
         var5.O4();
      }

      Ou0 var6 = this.ku0;
      if (this.ku0 != null) {
         var6.O4();
      }

      Ou0 var7 = this.l00;
      if (this.l00 != null) {
         var7.O4();
      }

      Ou0[] var8 = this.lK;
      if (this.lK != null) {
         int var9 = 0;

         for (int var2 = var8.length; var9 < var2; var9++) {
            this.lK[var9].O4();
         }
      }
   }
}
