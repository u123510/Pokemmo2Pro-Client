package cn.pokemmo.graphics.gdx.render;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class GdxRenderViewPortManager {
   public final le0_2 BZ;
   public int gY = 0;
   public int a4 = 0;
   public int IF = 0;
   public int gx0 = 0;
   public float EJ0 = 1.0F;
   public boolean OA0 = false;
   public boolean G1 = false;
   public int NE = 250;
   public int[] Ev0 = null;
   public int com9 = 0;
   public boolean ug = false;
   public boolean Ve = false;
   public float Xf0 = 0.0F;
   public Color ZC = Color.WHITE.cpy();
   public float Ps = 0.0F;
   public float d00 = 1.25F;
   public gn_0 oo0;
   public Texture[] vt0;
   public LPT6_[] Ah0;
   public int sj = 10;
   public Wr[] iv0;
   public AG0[] xy0;

   public final int LpT3() {
      Texture[] var1 = this.vt0;
      if (this.vt0 != null) {
         return var1.length;
      }

      LPT6_[] var3 = this.Ah0;
      if (this.Ah0 != null) {
         return var3.length;
      }

      Wr[] var4 = this.iv0;
      if (this.iv0 != null) {
         return var4.length;
      }

      AG0[] var2;
      return (var2 = this.xy0) != null ? var2.length : 0;
   }

   public final void g4(int var1, int var2, int var3) {
      Texture var13 = null;
      LPT6_ var14 = null;
      ui_1 var4 = tw0_0.LD0.j20;
      p4_0 var5 = (p4_0)tw0_0.LD0.j20.bK0;
      if (tw0_0.LD0.j20.bK0 == null) {
         var5 = (p4_0)var4.Kt0;
      }
      boolean var6;
      if (this.Ps > 0.0F) {
         var6 = true;
      } else {
         var6 = false;
      }

      if (var6) {
         var4.TV();
         var5.kw(this.Ps);
         var5.bL(this.ZC);
         var5.Dd0(this.d00);
      }

      label74: {
         label73: {
            label72: {
               Texture[] var7 = this.vt0;
               if (this.vt0 != null) {
                  (var13 = var7[var1]).bind();
                  this.zd();
                  if (!var6) {
                     break label73;
                  }
               } else {
                  LPT6_[] var20 = this.Ah0;
                  if (this.Ah0 != null) {
                     Texture var31;
                     (var31 = var20[var1].OB).bind();
                     this.zd();
                     if (var6) {
                        int var32 = var31.getWidth();
                        var5.wg(var32, var31.getHeight());
                     }

                     LPT6_ var40 = var14 = this.Ah0[var1];
                     float var44 = this.IF;
                     float var33 = this.EJ0;
                     int var37 = (int)(var44 * this.EJ0);
                     int var11 = (int)(this.gx0 * var33);
                     boolean var34;
                     if (var34 = var40.Y60 > var14.Ll0 ^ true) {
                        var14.Wu0(false, true);
                     }

                     float var12 = var2;
                     float var16 = var3;
                     float var18 = var37;
                     float var35 = var11;
                     tw0_0.LD0.j20.S50(var14, var12, var16, var18, var35);
                     if (!var34) {
                        break label74;
                     }
                     break label72;
                  }

                  Wr[] var21 = this.iv0;
                  if (this.iv0 == null) {
                     AG0[] var25 = this.xy0;
                     if (this.xy0 == null) {
                        break label74;
                     }

                     Texture var26;
                     (var26 = var25[var1].d3().OB).bind();
                     this.zd();
                     if (var6) {
                        int var27 = var26.getWidth();
                        var5.wg(var27, var26.getHeight());
                     }

                     LPT6_ var38 = var14 = this.xy0[var1].d3();
                     float var42 = this.IF;
                     float var28 = this.EJ0;
                     int var36 = (int)(var42 * this.EJ0);
                     int var9 = (int)(this.gx0 * var28);
                     boolean var29;
                     if (var29 = var38.Y60 > var14.Ll0 ^ true) {
                        var14.Wu0(false, true);
                     }

                     float var10 = var2;
                     float var15 = var3;
                     float var17 = var36;
                     float var30 = var9;
                     tw0_0.LD0.j20.S50(var14, var10, var15, var17, var30);
                     if (!var29) {
                        break label74;
                     }
                     break label72;
                  }

                  (var13 = var21[var1].H8()).bind();
                  this.zd();
                  if (!var6) {
                     break label73;
                  }
               }

               int var22 = var13.getWidth();
               var5.wg(var22, var13.getHeight());
               break label73;
            }

            var14.Wu0(false, true);
            break label74;
         }

         float var10000 = this.IF;
         float var23 = this.EJ0;
         int var8 = (int)(var10000 * this.EJ0);
         int var24 = (int)(this.gx0 * var23);
         this.w8(var13, var2, var3, var8, var24);
      }

      if (var6) {
         var4.TV();
         var5.kw(0.0F);
      }
   }

   public final void zd() {
      gn_0 var1;
      qq_0 var10000;
      if ((var1 = this.oo0) != null) {
         var10000 = tw0_0.LD0.wx0;
      } else {
         var10000 = tw0_0.LD0.wx0;
         var1 = gn_0.WHITE;
      }

      var10000.g50.VF(var1);
   }

   public final void w8(Texture var1, int var2, int var3, int var4, int var5) {
      if (this.Ve) {
         this.Xf0 = (float)((long)(hk0_1.KG / 1.2) % 360L);
      }

      ui_1 var10000 = tw0_0.LD0.j20;
      float var9 = var2;
      float var10 = var3;
      float var11 = var4 / 2;
      float var12 = var5 / 2;
      float var13 = var4;
      float var14 = var5;
      float var6 = this.Xf0;
      int var7 = var1.getWidth();
      int var8 = var1.getHeight();
      var10000.J2(var1, var9, var10, var11, var12, var13, var14, 1.0F, 1.0F, var6, 0, 0, var7, var8, true);
   }

   public final void nq0(int var1, int var2) {
      this.OA0 = true;
      this.IF = var1;
      this.gx0 = var2;
   }

   public final le0_2 Gy0(int var1, int var2) {
      this.gY = var1;
      this.a4 = var2;
      return this.BZ;
   }

   public final void Dg(pa0_0 var1) {
      int var10008 = gl0_1.Be0[var1.ordinal()];
      int var2 = this.BZ.a3();
      this.gY = var1.uD0(var2, this.De0());
      int var3 = this.BZ.k5();
      this.a4 = var1.Kr0(var3, this.yH0());
   }

   public final int B6() {
      return this.gY;
   }

   public final int Y10() {
      return this.a4;
   }

   public final int De0() {
      return this.vt0 == null && this.Ah0 == null && this.iv0 == null && this.xy0 == null ? 0 : (int)(this.IF * this.EJ0);
   }

   public final int yH0() {
      return this.vt0 == null && this.Ah0 == null && this.iv0 == null && this.xy0 == null ? 0 : (int)(this.gx0 * this.EJ0);
   }

   public final void C80(int var1) {
      this.NE = var1;
   }

   public final void aL(int[] var1) {
      if (var1.length != this.LpT3()) {
         throw new RuntimeException();
      }

      this.Ev0 = var1;
      this.com9 = 0;

      for (int var2 = 0; var2 < var1.length; var2++) {
         this.com9 = this.com9 + var1[var2];
      }
   }

   public final void u8(boolean var1) {
      this.Ve = var1;
   }

   public final void wx0(gn_0 var1) {
      if (var1 == null) {
         this.oo0 = var1;
      } else {
         this.oo0 = gn_0.WHITE.Uy(var1);
      }
   }

   public final boolean AU() {
      return this.LpT3() < 1;
   }

   public final void lo0() {
      this.vt0 = null;
      this.Ah0 = null;
      this.iv0 = null;
      this.xy0 = null;
   }

   public final le0_2 r8(LPT6_... var1) {
      this.lo0();
      LPT6_ var2;
      if (var1 != null && var1.length != 0 && (var2 = var1[0]) != null) {
         this.Ah0 = var1;
         if (!this.OA0) {
            this.IF = var2.bz;
            this.gx0 = var2.xZ;
         }

         return this.BZ;
      } else {
         return this.BZ;
      }
   }

   public final le0_2 Nk(Wr... var1) {
      this.lo0();
      Wr var2;
      if (var1 != null && var1.length != 0 && (var2 = var1[0]) != null) {
         this.iv0 = var1;
         if (!this.OA0) {
            this.IF = var2.H8().getWidth();
            this.gx0 = this.iv0[0].H8().getHeight();
         }

         return this.BZ;
      } else {
         return this.BZ;
      }
   }

   public final void t00() {
      if (!this.ug || hk0_1.KG / 500L % 2L != 0L) {
         int var1 = 0;
         int var2;
         if ((var2 = this.LpT3()) >= 1) {
            if ((this.BZ.M.t5(dz_2.H7) || this.G1) && var2 > 1) {
               if (this.Ev0 != null) {
                  var2 = (int)(hk0_1.KG % this.com9);
                  int var3 = 0;
                  int var4 = 0;

                  while (true) {
                     int[] var5 = this.Ev0;
                     if (var4 >= this.Ev0.length) {
                        break;
                     }

                     if (var2 < (var3 += var5[var4])) {
                        var1 = var4;
                        break;
                     }

                     var4++;
                  }
               } else {
                  var1 = (int)(hk0_1.KG / this.NE % var2);
               }
            }

            this.oC0(var1);
         }
      }
   }

   public final void oC0(int var1) {
      if (var1 >= this.LpT3()) {
         var1 = 0;
      }

      if (this.sj == 1) {
         int var3 = this.BZ.A20;
         int var4 = this.BZ.Mx / 2 + var3 - this.De0() / 2;
         int var2 = this.BZ.SB0;
         this.g4(var1, var4, this.BZ.OB / 2 + var2 - this.yH0() / 2);
      } else {
         int var5 = this.BZ.A20 + this.gY;
         this.g4(var1, var5, this.BZ.SB0 + this.a4);
      }
   }

   public final void mt0(int var1, int var2) {
      byte var3 = 0;
      if (this.LpT3() > 0) {
         float var4;
         var1 -= (int)(this.IF * (var4 = this.EJ0)) / 2;
         this.g4(var3, var1, var2 - (int)(this.gx0 * var4) / 2);
      }
   }

   public final void df() {
      this.sj = 1;
   }

   public final void dA(float var1) {
      this.EJ0 = var1;
   }

   public final void Ic() {
      this.gY = -this.IF / 2;
      this.a4 = -this.gx0 / 2;
   }

   public final void hG() {
      this.G1 = true;
   }

   public final void LX(Texture... var1) {
      this.lo0();
      Texture var2;
      if (var1.length != 0 && (var2 = var1[0]) != null) {
         this.vt0 = var1;
         if (!this.OA0) {
            this.IF = var2.getWidth();
            this.gx0 = var1[0].getHeight();
         }
      }
   }

   public final void o60(AG0... var1) {
      this.lo0();
      AG0 var2;
      if (var1 != null && var1.length != 0 && (var2 = var1[0]) != null) {
         this.xy0 = var1;
         if (!this.OA0) {
            this.IF = var2.d3().bz;
            this.gx0 = this.xy0[0].d3().xZ;
         }
      }
   }

   public final void UU(xt_0... var1) {
      this.lo0();
      if (var1.length != 0 && var1[0] != null) {
         LPT6_[] var2 = this.Ah0;
         if (this.Ah0 == null || var2.length != var1.length) {
            this.Ah0 = new LPT6_[var1.length];
         }

         int var5 = 0;

         while (true) {
            LPT6_[] var3 = this.Ah0;
            if (var5 >= this.Ah0.length) {
               if (!this.OA0) {
                  LPT6_ var4;
                  this.IF = (var4 = var3[0]).bz;
                  this.gx0 = var4.xZ;
               }

               return;
            }

            var3[var5] = var1[var5].yq();
            var5++;
         }
      }
   }

   public GdxRenderViewPortManager(le0_2 var1) {
      this.BZ = var1;
   }
}
