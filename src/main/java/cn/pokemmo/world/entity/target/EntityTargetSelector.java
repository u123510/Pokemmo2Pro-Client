package cn.pokemmo.world.entity.target;

import f.*;

public class EntityTargetSelector extends md0_1 {
   public final ZK UC0;
   public final float el0;
   public final float Q6;
   public final long uk;
   public final float pA;
   public final long o1;
   public boolean t40;
   public int Mb0;
   public long lF;
   public float pS;
   public float Wr;
   public int Ln0;
   public int private$;
   public boolean t8;
   public boolean RM;
   public boolean km;
   public final ox_2 Hs0;
   public float s1;
   public float Qs;
   public long WC;
   public final Bp0 ej;
   public final Bp0 mn0;
   public final Bp0 bc;
   public final Bp0 oH;
   public final MR rI0;

   public EntityTargetSelector(ZK var1) {
      this(20.0F, 0.4F, 1.1F, 2.1474836E9F, var1);
   }

   public EntityTargetSelector(float var1, float var2, float var3, float var4, ZK var5) {
      this(var1, var1, var2, var3, var4, var5);
   }

   public EntityTargetSelector(float var1, float var2, float var3, float var4, float var5, ZK var6) {
      ox_2 var7 = new ox_2();
      this.Hs0 = var7;
      Bp0 var8 = new Bp0();
      this.ej = var8;
      Bp0 var9 = new Bp0();
      this.mn0 = var9;
      Bp0 var10 = new Bp0();
      this.bc = var10;
      Bp0 var11 = new Bp0();
      this.oH = var11;
      MR var12 = new MR(this);
      this.rI0 = var12;
      if (var6 != null) {
         this.el0 = var1;
         this.Q6 = var2;
         this.uk = (long)(var3 * 1.0E9F);
         this.pA = var4;
         this.o1 = (long)(var5 * 1.0E9F);
         this.UC0 = var6;
      } else {
         throw new IllegalArgumentException("listener cannot be null.");
      }
   }

   @Override
   public boolean R8(int var1, int var2, int var3, int var4) {
      float var5 = var1;
      float var6 = var2;
      return this.Qh(var3, var4, var5, var6);
   }

   public final boolean Qh(int var1, int var2, float var3, float var4) {
      if (var1 > 1) {
         return false;
      }

      if (var1 == 0) {
         Bp0 var10010 = this.ej;
         this.ej.x = var3;
         var10010.y = var4;
         long var5 = lg_0.lW.ki.yo0;
         this.WC = lg_0.lW.ki.yo0;
         this.Hs0.dh0(var3, var4, var5);
         this.t40 = true;
         this.RM = false;
         this.t8 = false;
         this.s1 = var3;
         this.Qs = var4;
         if (this.rI0.RB == null) {
            MR var6 = this.rI0;
            float var9 = this.pA;
            _finally.HG().dH0(var6, var9);
         }
      } else {
         Bp0 var10005 = this.mn0;
         this.mn0.x = var3;
         var10005.y = var4;
         this.t40 = false;
         this.RM = true;
         Bp0 var10002 = this.bc;
         Bp0 var10003 = this.bc;
         Bp0 var7 = this.ej;
         this.bc.getClass();
         var10003.x = var7.x;
         var10002.y = var7.y;
         Bp0 var10001 = this.oH;
         var10002 = this.oH;
         Bp0 var8 = this.mn0;
         this.oH.getClass();
         var10002.x = var8.x;
         var10001.y = var8.y;
         this.rI0.ky0();
      }

      this.UC0.Qc();
      return false;
   }

   @Override
   public boolean Ao0(int var1, int var2, int var3) {
      float var4 = var1;
      return this.A(var3, var4, var2);
   }

   public final boolean A(int var1, float var2, float var3) {
      if (var1 > 1) {
         return false;
      }

      if (this.t8) {
         return false;
      }

      Bp0 var10000 = var1 == 0 ? this.ej : this.mn0;
      (var1 == 0 ? this.ej : this.mn0).x = var2;
      var10000.y = var3;
      if (!this.RM) {
         ox_2 var16 = this.Hs0;
         ox_2 var10001 = this.Hs0;
         ox_2 var11;
         ox_2 var10002 = var11 = this.Hs0;
         long var10003 = lg_0.lW.ki.yo0;
         long var10004 = lg_0.lW.ki.yo0;
         float var4;
         var11.Vv0 = var4 = var2 - var11.zD0;
         float var5;
         var11.gM = var5 = var3 - var11.zZ;
         var11.zD0 = var2;
         var11.zZ = var3;
         long var6 = var10004 - var11.dg;
         var10002.dg = var10003;
         int var8;
         int var18 = var8 = var10001.jl0;
         var1 = var8 % 10;
         var11.Bq[var1] = var4;
         var11.uz[var1] = var5;
         var11.Og[var1] = var6;
         var16.jl0 = var18 + 1;
         if (this.t40) {
            float var13 = this.s1;
            var4 = this.Qs;
            if (!this.lY(var2, var3, var13, var4)) {
               this.rI0.ky0();
               this.t40 = false;
            }
         }

         if (!this.t40) {
            this.km = true;
            float var9 = this.Hs0.Vv0;
            float var14 = this.Hs0.gM;
            return this.UC0.s70(var2, var3, var9, var14);
         } else {
            return false;
         }
      } else {
         boolean var10 = this.UC0.SV(this.bc, this.oH, this.ej, this.mn0);
         return this.UC0.Vq0(this.bc.ut(this.oH), this.ej.ut(this.mn0)) || var10;
      }
   }

   @Override
   public boolean kh(int var1, int var2, int var3, int var4) {
      float var5 = var1;
      float var6 = var2;
      return this.jo0(var3, var4, var5, var6);
   }

   public final boolean jo0(int var1, int var2, float var3, float var4) {
      if (var1 > 1) {
         return false;
      }

      if (this.t40) {
         float var5 = this.s1;
         float var6 = this.Qs;
         if (!this.lY(var3, var4, var5, var6)) {
            this.t40 = false;
         }
      }

      boolean var23 = this.km;
      this.km = false;
      this.rI0.ky0();
      if (this.t8) {
         return false;
      }

      if (this.t40) {
         label77: {
            if (this.Ln0 == var2 && this.private$ == var1 && System.nanoTime() - this.lF <= this.uk) {
               float var32 = this.pS;
               float var39 = this.Wr;
               if (this.lY(var3, var4, var32, var39)) {
                  break label77;
               }
            }

            this.Mb0 = 0;
         }

         this.Mb0++;
         long var33 = System.nanoTime();
         this.lF = var33;
         this.pS = var3;
         this.Wr = var4;
         this.Ln0 = var2;
         this.private$ = var1;
         this.WC = 0L;
         return this.UC0.EA(var3, var4);
      } else if (this.RM) {
         this.RM = false;
         this.UC0.Ar0();
         this.km = true;
         float var14;
         ox_2 var49;
         float var52;
         y5 var54;
         if (var1 == 0) {
            var49 = this.Hs0;
            float var11 = this.mn0.x;
            var14 = this.mn0.y;
            var52 = var11;
            var54 = lg_0.lW.ki;
         } else {
            var49 = this.Hs0;
            float var12 = this.ej.x;
            var14 = this.ej.y;
            var52 = var12;
            var54 = lg_0.lW.ki;
         }

         long var15 = var54.yo0;
         var49.dh0(var52, var14, var15);
         return false;
      } else {
         boolean var13 = false;
         if (var23 && !this.km) {
            var13 = this.UC0.mO(var3, var4);
         }

         long var24 = lg_0.lW.ki.yo0;
         if (lg_0.lW.ki.yo0 - this.WC <= this.o1) {
            ox_2 var10000 = this.Hs0;
            ox_2 var10001 = this.Hs0;
            ox_2 var10002 = this.Hs0;
            ox_2 var10003 = this.Hs0;
            ox_2 var10004 = this.Hs0;
            ox_2 var7;
            ox_2 var10005 = var7 = this.Hs0;
            float var16;
            var7.Vv0 = var16 = var3 - var7.zD0;
            float var21;
            var7.gM = var21 = var4 - var7.zZ;
            var7.zD0 = var3;
            var7.zZ = var4;
            long var25 = var24 - var7.dg;
            var10005.dg = var24;
            int var8;
            int var9 = (var8 = var10004.jl0) % 10;
            float[] var10;
            (var10 = var10003.Bq)[var9] = var16;
            var10002.uz[var9] = var21;
            var10001.Og[var9] = var25;
            int var17;
            var10000.jl0 = var17 = var8 + 1;
            ZK var22 = this.UC0;
            int var18 = Math.min(10, var17);
            float var26 = 0.0F;

            for (int var34 = 0; var34 < var18; var34++) {
               var26 += var10[var34];
            }

            var3 = var26 / var18;
            long[] var27 = var7.Og;
            int var35 = Math.min(10, var7.jl0);
            long var40 = 0L;

            for (int var45 = 0; var45 < var35; var45++) {
               var40 += var27[var45];
            }

            float var28;
            if ((var28 = (float)(var35 == 0 ? 0L : var40 / var35) / 1.0E9F) == 0.0F) {
               var3 = 0.0F;
            } else {
               var3 /= var28;
            }

            ox_2 var29 = this.Hs0;
            float[] var36 = this.Hs0.uz;
            int var41 = Math.min(10, this.Hs0.jl0);
            float var43 = 0.0F;

            for (int var46 = 0; var46 < var41; var46++) {
               var43 += var36[var46];
            }

            float var30 = var43 / var41;
            long[] var37 = var29.Og;
            int var42 = Math.min(10, var29.jl0);
            long var44 = 0L;

            for (int var47 = 0; var47 < var42; var47++) {
               var44 += var37[var47];
            }

            float var31;
            float var38;
            if ((var38 = (float)(var42 == 0 ? 0L : var44 / var42) / 1.0E9F) == 0.0F) {
               var31 = 0.0F;
            } else {
               var31 = var30 / var38;
            }

            if (!var22.lPT7(var2, var3, var31) && !var13) {
               var13 = false;
            } else {
               var13 = true;
            }
         }

         this.WC = 0L;
         return var13;
      }
   }

   public final boolean lY(float var1, float var2, float var3, float var4) {
      return Math.abs(var1 - var3) < this.el0 && Math.abs(var2 - var4) < this.Q6;
   }
}
