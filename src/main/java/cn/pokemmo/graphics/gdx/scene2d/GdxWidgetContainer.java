package cn.pokemmo.graphics.gdx.scene2d;

import f.*;


import f.org.json.*;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;

public class GdxWidgetContainer extends sj_1 {
   public final mb0_0 tt;
   public te0_0 s10;
   public final ql_0 vJ;
   public final ql_0 vQ;
   public final ql_0 wv0;
   public final ql_0 Eg;
   public final ql_0 Z5;
   public final ql_0 rQ;
   public final nd0_1 D20;
   public boolean bc0;
   public boolean xU;
   public final boolean a50;
   public final boolean On0;
   public float t60;
   public float gQ;
   public float gW;
   public float q20;
   public float mI;
   public float lp0;
   public boolean A70;
   public boolean qQ;
   public final Bp0 IE0;
   public final boolean Ux0;
   public final boolean JP;
   public final boolean ht;
   public float aI;
   public final float uA;
   public float oX;
   public final float iW;
   public final boolean zS;
   public final boolean FH;
   public final float k30;
   public float Po0;
   public float Sf;
   public float ZD;
   public final boolean Lv0;
   public final boolean Ud0;
   public final float iz;
   public final float pA0;
   public final float ZH0;
   public final boolean GF0;
   public final boolean LPT3;
   public int FD;

   public GdxWidgetContainer(te0_0 var1) {
      this(var1, new mb0_0());
   }

   public GdxWidgetContainer(te0_0 var1, A3 var2) {
      this(var1, (mb0_0)var2.NQ(mb0_0.class));
   }

   public GdxWidgetContainer(te0_0 var1, A3 var2, String var3) {
      this(var1, (mb0_0)var2.Ip(mb0_0.class, var3));
   }

   public GdxWidgetContainer(te0_0 var1, mb0_0 var2) {
      ql_0 var3;
      var3 = new ql_0();
      this.vJ = var3;
      var3 = new ql_0();
      this.vQ = var3;
      var3 = new ql_0();
      this.wv0 = var3;
      var3 = new ql_0();
      this.Eg = var3;
      var3 = new ql_0();
      this.Z5 = var3;
      var3 = new ql_0();
      this.rQ = var3;
      this.a50 = true;
      this.On0 = true;
      Bp0 var10;
      var10 = new Bp0();
      this.IE0 = var10;
      this.Ux0 = true;
      this.JP = true;
      this.ht = true;
      this.uA = 1.0F;
      this.iW = 1.0F;
      this.zS = true;
      this.FH = true;
      this.k30 = 1.0F;
      this.Lv0 = true;
      this.Ud0 = true;
      this.iz = 50.0F;
      this.pA0 = 30.0F;
      this.ZH0 = 200.0F;
      this.GF0 = true;
      this.LPT3 = true;
      this.FD = -1;
      if (var2 != null) {
         this.tt = var2;
         this.CJ0(var1);
         this.DC(150.0F, 150.0F);
         this.Tz();
         nd0_1 var4 = this.qE0();
         this.D20 = var4;
         this.wF0(var4);
         this.GC();
      } else {
         throw new IllegalArgumentException("style cannot be null.");
      }
   }

   public final void WP() {
      ql_0 var1 = this.vJ;
      float var2 = this.vJ.j80;
      float var3 = this.bc0 ? (int)this.gW : 0;
      float var5 = var2 - var3;
      var2 = var1.Wm0;
      int var8 = (int)(this.xU ? this.lp0 - this.q20 : this.lp0);
      var2 -= var8;
      this.s10.P20(var5, var2);
      te0_0 var9 = this.s10;
      if (this.s10 instanceof Cp0) {
         ql_0 var11 = this.rQ;
         ql_0 var10002 = this.rQ;
         ql_0 var10003 = this.rQ;
         ql_0 var4;
         ql_0 var10;
         (var10 = this.rQ).j80 = (var4 = this.vJ).j80 - var5;
         var10003.Wm0 = var4.Wm0 - var2;
         var10002.IA = var4.IA;
         var11.Eu0 = var4.Eu0;
         ((xv_0)((Cp0)var9)).yh = var10;
      }
   }

   public final void Tz() {
      h80_0 var1;
      var1 = new h80_0((U10) this);
      if (!super.fx.j4(var1, true)) {
         super.fx.Ue0(var1);
      }
   }

   public final void GC() {
      IF var1;
      var1 = new IF((U10) this);
      this.wF0(var1);
   }

   public final void Yj() {
      if (this.GF0) {
         float var2;
         if (this.Lv0) {
            var2 = this.iz;
            var2 = LW.r1(this.t60, -this.iz, this.mI + var2);
         } else {
            var2 = LW.r1(this.t60, 0.0F, this.mI);
         }

         this.t60 = var2;
         if (this.Ud0) {
            var2 = this.iz;
            var2 = LW.r1(this.gQ, -this.iz, this.lp0 + var2);
         } else {
            var2 = LW.r1(this.gQ, 0.0F, this.lp0);
         }

         this.gQ = var2;
      }
   }

   @Override
   public final void yE0(float var1) {
      super.yE0(var1);
      boolean var2 = this.D20.kJ0.km;
      boolean var3 = false;
      float var4 = this.aI;
      if (this.aI > 0.0F && this.Ux0 && !var2 && !this.A70 && !this.qQ) {
         if ((this.oX -= var1) <= 0.0F) {
            this.aI = Math.max(0.0F, var4 - var1);
         }

         var3 = true;
      }

      if (this.Po0 > 0.0F) {
         this.Jo();
         float var15 = this.Po0 / this.k30;
         var4 = this.t60;
         this.t60 = uj_0.SJ0(this.Sf, var15, var1, var4);
         var4 = this.gQ;
         this.gQ = uj_0.SJ0(this.ZD, var15, var1, var4);
         this.Yj();
         float var16 = this.t60;
         var4 = this.iz;
         float var5;
         if (this.t60 == (var5 = -this.iz)) {
            this.Sf = 0.0F;
         }

         if (var16 >= this.mI + var4) {
            this.Sf = 0.0F;
         }

         float var17 = this.gQ;
         if (this.gQ == var5) {
            this.ZD = 0.0F;
         }

         if (var17 >= this.lp0 + var4) {
            this.ZD = 0.0F;
         }

         if ((this.Po0 -= var1) <= 0.0F) {
            this.Sf = 0.0F;
            this.ZD = 0.0F;
         }

         var3 = true;
      }

      if (this.JP
         && this.Po0 <= 0.0F
         && !var2
         && (!this.A70 || this.bc0 && this.mI / (this.vQ.IA - this.wv0.IA) > this.vJ.IA * 0.1F)
         && (!this.qQ || this.xU && this.lp0 / (this.Eg.Eu0 - this.Z5.Eu0) > this.vJ.Eu0 * 0.1F)) {
         var4 = this.gW;
         float var31 = this.t60;
         if (this.gW != this.t60) {
            this.gW = var4 < var31
               ? Math.min(var31, Math.max(var1 * 200.0F, (var31 - var4) * 7.0F * var1) + var4)
               : Math.max(var31, var4 - Math.max(var1 * 200.0F, (var4 - var31) * 7.0F * var1));
            var3 = true;
         }

         var4 = this.q20;
         var31 = this.gQ;
         if (this.q20 != this.gQ) {
            this.q20 = var4 < var31
               ? Math.min(var31, Math.max(var1 * 200.0F, (var31 - var4) * 7.0F * var1) + var4)
               : Math.max(var31, var4 - Math.max(var1 * 200.0F, (var4 - var31) * 7.0F * var1));
            var3 = true;
         }
      } else {
         var4 = this.t60;
         if (this.gW != this.t60) {
            this.gW = var4;
         }

         var4 = this.gQ;
         if (this.q20 != this.gQ) {
            this.q20 = var4;
         }
      }

      label124: {
         if (!var2) {
            label120:
            if (this.Lv0 && this.bc0) {
               float var8 = this.t60;
               if (this.t60 < 0.0F) {
                  this.Jo();
                  float var9 = this.t60;
                  float var18 = this.pA0;
                  if ((this.t60 = ((this.ZH0 - var18) * -var9 / this.iz + var18) * var1 + var9) > 0.0F) {
                     this.t60 = 0.0F;
                  }
               } else {
                  if (!(var8 > this.mI)) {
                     break label120;
                  }

                  this.Jo();
                  float var10 = this.t60;
                  float var19 = this.pA0;
                  float var10001 = this.ZH0 - var19;
                  var4 = this.mI;
                  float var11;
                  float var10000 = var11 = this.t60 - (var10001 * -(this.mI - var10) / this.iz + var19) * var1;
                  this.t60 = var11;
                  if (var10000 < var4) {
                     this.t60 = var4;
                  }
               }

               var3 = true;
            }

            if (this.Ud0 && this.xU) {
               float var12 = this.gQ;
               if (this.gQ < 0.0F) {
                  this.Jo();
                  float var14 = this.gQ;
                  float var21 = this.pA0;
                  if ((this.gQ = ((this.ZH0 - var21) * -var14 / this.iz + var21) * var1 + var14) > 0.0F) {
                     this.gQ = 0.0F;
                  }
                  break label124;
               }

               if (var12 > this.lp0) {
                  this.Jo();
                  float var13 = this.gQ;
                  float var20 = this.pA0;
                  float var34 = this.ZH0 - var20;
                  var4 = this.lp0;
                  float var7;
                  float var33 = var7 = this.gQ - (var34 * -(this.lp0 - var13) / this.iz + var20) * var1;
                  this.gQ = var7;
                  if (var33 < var4) {
                     this.gQ = var4;
                  }
                  break label124;
               }
            }
         }

         if (!var3) {
            return;
         }
      }

      ir_0 var6;
      if ((var6 = super.uP) != null && var6.uG) {
         lg_0.S4.rt0.G20();
      }
   }

   @Override
   public final void Z50() {
      mb0_0 var1 = this.tt;
      YA var2 = this.tt.hV;
      YA var3 = var1.SJ0;
      YA var4 = var1.o80;
      float var5 = 0.0F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      if (this.tt.hV != null) {
         br_1 var10000 = (br_1)var2;
         br_1 var10001 = (br_1)var2;
         var5 = ((br_1)var2).GA0;
         var6 = var10000.f60;
         var7 = var10001.dL0;
         var8 = var10000.bB;
      }

      float var22 = super.E20;
      float var9 = super.TK0;
      ql_0 var71 = this.vJ;
      ql_0 var81 = this.vJ;
      ql_0 var10002 = this.vJ;
      float var44 = var22 - var5 - var6;
      float var56;
      float var10 = (var56 = var9 - var7) - var8;
      this.vJ.j80 = var5;
      var10002.Wm0 = var8;
      var81.IA = var44;
      var71.Eu0 = var10;
      if (this.s10 != null) {
         var7 = 0.0F;
         var10 = 0.0F;
         if (var3 != null) {
            var7 = ((br_1)var3).u1;
         }

         YA var17;
         if ((var17 = var1.Vg0) != null) {
            var7 = Math.max(var7, ((br_1)var17).u1);
         }

         if (var4 != null) {
            var10 = ((br_1)var4).wv;
         }

         YA var18 = this.tt.X00;
         if (this.tt.X00 != null) {
            var10 = Math.max(var10, ((br_1)var18).wv);
         }

         te0_0 var19 = this.s10;
         float var11;
         float var20;
         if (this.s10 instanceof ro0_0) {
            var20 = ((ro0_0)var19).uq0();
            var11 = ((ro0_0)var19).Tn0();
         } else {
            var20 = var19.E20;
            var11 = var19.TK0;
         }

         ql_0 var12 = this.vJ;
         float var13 = this.vJ.IA;
         boolean var14;
         if (var20 > this.vJ.IA) {
            var14 = true;
         } else {
            var14 = false;
         }

         this.bc0 = var14;
         float var15 = var12.Eu0;
         boolean var16;
         if (var11 > var12.Eu0) {
            var16 = true;
         } else {
            var16 = false;
         }

         this.xU = var16;
         if (var16) {
            float var67;
            var12.IA = var67 = var13 - var10;
            if (!this.a50) {
               var12.j80 += var10;
            }

            if (!var14 && var20 > var67) {
               this.bc0 = true;
            }
         }

         if (this.bc0) {
            var12.Eu0 = var13 = var15 - var7;
            if (this.On0) {
               var12.Wm0 += var7;
            }

            if (!var16 && var11 > var13) {
               this.xU = true;
               var12.IA -= var10;
               if (!this.a50) {
                  var12.j80 += var10;
               }
            }
         }

         float var21 = Math.max(var12.IA, var20);
         float var64;
         float var74 = var64 = Math.max(this.vJ.Eu0, var11);
         var12 = this.vJ;
         var13 = var21 - this.vJ.IA;
         this.mI = var13;
         this.lp0 = var74 - var12.Eu0;
         this.t60 = LW.r1(this.t60, 0.0F, var13);
         this.gQ = LW.r1(this.gQ, 0.0F, this.lp0);
         if (this.bc0) {
            if (var3 != null) {
               var12 = this.vJ;
               var13 = this.vJ.j80;
               if (!this.On0) {
                  var8 = var56 - var7;
               }

               ql_0 var57;
               var71 = var57 = this.vQ;
               float var46 = var12.IA;
               var57.j80 = var13;
               var57.Wm0 = var8;
               var57.IA = var46;
               var71.Eu0 = var7;
               if (this.LPT3) {
                  this.wv0.IA = Math.max(((br_1)var3).wv, (int)(var46 * var12.IA / var21));
               } else {
                  this.wv0.IA = ((br_1)var3).wv;
               }

               ql_0 var47 = this.wv0;
               if (this.wv0.IA > var21) {
                  var47.IA = 0.0F;
               }

               var47.Eu0 = ((br_1)var3).u1;
               float var27 = this.vQ.j80;
               var8 = this.vQ.IA - var47.IA;
               var9 = this.mI;
               if (this.mI == 0.0F) {
                  var9 = 0.0F;
               } else {
                  var9 = LW.r1(this.t60 / var9, 0.0F, 1.0F);
               }

               var47.j80 = var27 + (int)(var8 * var9);
               this.wv0.Wm0 = this.vQ.Wm0;
            } else {
               var71 = this.vQ;
               var81 = this.vQ;
               var10002 = this.vQ;
               float var28 = 0.0F;
               var7 = 0.0F;
               var8 = 0.0F;
               var9 = 0.0F;
               this.vQ.j80 = var28;
               var10002.Wm0 = var7;
               var81.IA = var8;
               var71.Eu0 = var9;
               var71 = this.wv0;
               var81 = this.wv0;
               var10002 = this.wv0;
               float var29 = 0.0F;
               var7 = 0.0F;
               var8 = 0.0F;
               var9 = 0.0F;
               this.wv0.j80 = var29;
               var10002.Wm0 = var7;
               var81.IA = var8;
               var71.Eu0 = var9;
            }
         }

         if (this.xU) {
            if (var4 != null) {
               float var30;
               if (this.a50) {
                  var30 = var22 - var6 - var10;
               } else {
                  var30 = var5;
               }

               ql_0 var50 = this.vJ;
               var8 = this.vJ.Wm0;
               var71 = this.Eg;
               ql_0 var62;
               var81 = var62 = this.Eg;
               float var31 = var50.Eu0;
               var62.j80 = var30;
               var62.Wm0 = var8;
               var81.IA = var10;
               var71.Eu0 = var31;
               ql_0 var55 = this.Z5;
               br_1 var35;
               this.Z5.IA = (var35 = (br_1)var4).wv;
               if (this.LPT3) {
                  var55.Eu0 = Math.max(var35.u1, (int)(var31 * var50.Eu0 / var64));
               } else {
                  var55.Eu0 = var35.u1;
               }

               ql_0 var32 = this.Z5;
               if (this.Z5.Eu0 > var64) {
                  var32.Eu0 = 0.0F;
               }

               if (this.a50) {
                  var5 = var22 - var6 - var35.wv;
               }

               var32.j80 = var5;
               float var23 = this.Eg.Wm0;
               float var36 = this.Eg.Eu0 - var32.Eu0;
               var5 = 1.0F;
               var6 = this.lp0;
               if (this.lp0 == 0.0F) {
                  var6 = 0.0F;
               } else {
                  var6 = LW.r1(this.gQ / var6, 0.0F, 1.0F);
               }

               var32.Wm0 = var23 + (int)((var5 - var6) * var36);
            } else {
               var71 = this.Eg;
               var81 = this.Eg;
               var10002 = this.Eg;
               float var24 = 0.0F;
               float var33 = 0.0F;
               float var37 = 0.0F;
               var5 = 0.0F;
               this.Eg.j80 = var24;
               var10002.Wm0 = var33;
               var81.IA = var37;
               var71.Eu0 = var5;
               var71 = this.Z5;
               var81 = this.Z5;
               var10002 = this.Z5;
               float var25 = 0.0F;
               float var34 = 0.0F;
               float var38 = 0.0F;
               var5 = 0.0F;
               this.Z5.j80 = var25;
               var10002.Wm0 = var34;
               var81.IA = var38;
               var71.Eu0 = var5;
            }
         }

         this.WP();
         te0_0 var26 = this.s10;
         if (this.s10 instanceof ro0_0) {
            var26.DC(var21, var64);
            ((ro0_0)this.s10).PD0();
         }
      }
   }

   @Override
   public final float uq0() {
      float var1 = 0.0F;
      te0_0 var2 = this.s10;
      if (this.s10 instanceof ro0_0) {
         var1 = ((ro0_0)var2).uq0();
      } else if (var2 != null) {
         var1 = var2.E20;
      }

      YA var6 = this.tt.hV;
      if (this.tt.hV != null) {
         br_1 var5;
         var1 = Math.max(var1 + (var5 = (br_1)var6).GA0 + var5.f60, var5.wv);
      }

      if (this.xU) {
         float var4 = 0.0F;
         YA var3;
         mb0_0 var7;
         if ((var3 = (var7 = this.tt).o80) != null) {
            var4 = ((br_1)var3).wv;
         }

         YA var8;
         if ((var8 = var7.X00) != null) {
            var4 = Math.max(var4, ((br_1)var8).wv);
         }

         var1 += var4;
      }

      return var1;
   }

   @Override
   public final float Tn0() {
      float var1 = 0.0F;
      te0_0 var2 = this.s10;
      if (this.s10 instanceof ro0_0) {
         var1 = ((ro0_0)var2).Tn0();
      } else if (var2 != null) {
         var1 = var2.TK0;
      }

      YA var6 = this.tt.hV;
      if (this.tt.hV != null) {
         br_1 var5;
         var1 = Math.max(var1 + (var5 = (br_1)var6).dL0 + var5.bB, var5.u1);
      }

      if (this.bc0) {
         float var4 = 0.0F;
         YA var3;
         mb0_0 var7;
         if ((var3 = (var7 = this.tt).SJ0) != null) {
            var4 = ((br_1)var3).u1;
         }

         YA var8;
         if ((var8 = var7.Vg0) != null) {
            var4 = Math.max(var4, ((br_1)var8).u1);
         }

         var1 += var4;
      }

      return var1;
   }

   @Override
   public final float Q70() {
      return 0.0F;
   }

   @Override
   public final float n30() {
      return 0.0F;
   }

   public final void CJ0(te0_0 var1) {
      te0_0 var2 = this.s10;
      if (this.s10 != this) {
         if (var2 != null) {
            this.throws$(var2, true);
         }

         this.s10 = var1;
         if (var1 != null) {
            super.KD0(var1);
         }
      } else {
         throw new IllegalArgumentException("actor cannot be the ScrollPane.");
      }
   }

   /** @deprecated */
   @Deprecated
   @Override
   public final void KD0(te0_0 var1) {
      throw new UnsupportedOperationException("Use ScrollPane#setActor.");
   }

   @Override
   public final boolean throws$(te0_0 var1, boolean var2) {
      if (var1 != null) {
         if (var1 != this.s10) {
            return false;
         }

         this.s10 = null;
         return super.throws$(var1, var2);
      } else {
         throw new IllegalArgumentException("actor cannot be null.");
      }
   }

   @Override
   public final te0_0 u7(int var1, boolean var2) {
      te0_0 var3;
      if ((var3 = super.u7(var1, var2)) == this.s10) {
         this.s10 = null;
      }

      return var3;
   }

   @Override
   public final te0_0 nX(float var1, float var2, boolean var3) {
      if (!(var1 < 0.0F) && !(var1 >= super.E20) && !(var2 < 0.0F) && !(var2 >= super.TK0)) {
         if (var3 && super.nx0 == cs_0.FU && super.On0) {
            if (this.bc0 && this.A70 && this.vQ.Ur0(var1, var2)) {
               return this;
            }

            if (this.xU && this.qQ && this.Eg.Ur0(var1, var2)) {
               return this;
            }
         }

         return super.nX(var1, var2, var3);
      } else {
         return null;
      }
   }

   public final nd0_1 qE0() {
      return new nd0_1((U10) this);
   }

   public final void Jo() {
      this.aI = this.uA;
      this.oX = this.iW;
   }

   @Override
   public final void BS(ui_1 var1, float var2) {
      if (this.s10 != null) {
         this.PD0();
         Matrix4 var10001 = this.IJ0();
         Matrix4 var10002 = super.dq0;
         Matrix4 var3 = var1.jP;
         super.dq0.getClass();
         var10002.Dd0(var3.EW);
         var1.Ud(var10001);
         if (this.bc0) {
            ql_0 var25 = this.wv0;
            float var4 = this.vQ.j80;
            float var5 = this.vQ.IA - var25.IA;
            float var6 = this.mI;
            if (this.mI == 0.0F) {
               var6 = 0.0F;
            } else {
               var6 = LW.r1(this.gW / var6, 0.0F, 1.0F);
            }

            var25.j80 = var4 + (int)(var5 * var6);
         }

         if (this.xU) {
            ql_0 var26 = this.Z5;
            float var32 = this.Eg.Wm0;
            float var39 = this.Eg.Eu0 - var26.Eu0;
            float var53 = 1.0F;
            float var7 = this.lp0;
            if (this.lp0 == 0.0F) {
               var7 = 0.0F;
            } else {
               var7 = LW.r1(this.q20 / var7, 0.0F, 1.0F);
            }

            var26.Wm0 = var32 + (int)((var53 - var7) * var39);
         }

         this.WP();
         Color var27 = super.dC;
         float var33 = super.dC.a * var2;
         if (this.tt.hV != null) {
            float var40 = var27.r;
            float var54 = var27.g;
            float var62 = var27.b;
            var1.TJ0(var40, var54, var62, var33);
            var40 = 0.0F;
            var54 = super.E20;
            var62 = super.TK0;
            this.tt.hV.Xd(var1, var40, 0.0F, var54, var62);
         }

         var1.TV();
         ql_0 var42 = this.vJ;
         float var56 = this.vJ.j80;
         float var64 = this.vJ.Wm0;
         float var8 = this.vJ.IA;
         float var43 = var42.Eu0;
         if (!(this.vJ.IA <= 0.0F) && !(var43 <= 0.0F)) {
            ir_0 var9 = super.uP;
            if (super.uP != null) {
               ql_0 var10;
               ql_0 var10000 = var10 = ql_0.SI;
               var10.j80 = var56;
               var10.Wm0 = var64;
               var10.IA = var8;
               var10000.Eu0 = var43;
               var10000 = var42 = (ql_0)f.UE0.TL0(ql_0.class).obtain();
               Matrix4 var57 = ((ui_1)var9.rg0).jP;
               var9.Prn.vE0(var57, var10, var42);
               if (PH.Sj(var10000)) {
                  this.Yf0(var1, var2);
                  var1.TV();
                  f.UE0.P3(PH.eF());
               } else {
                  f.UE0.P3(var42);
               }
            }
         }

         var2 = var27.r;
         float var45 = var27.g;
         var56 = var27.b;
         var1.TJ0(var2, var45, var56, var33);
         if (this.Ux0) {
            var33 = by_0.pF0.F0(this.aI / this.uA) * var33;
         }

         var2 = var27.r;
         float var28 = var27.g;
         float var46 = var27.b;
         if (!(var33 <= 0.0F)) {
            var1.TJ0(var2, var28, var46, var33);
            boolean var13;
            if (this.bc0 && this.wv0.IA > 0.0F) {
               var13 = true;
            } else {
               var13 = false;
            }

            boolean var29;
            if (this.xU && this.Z5.Eu0 > 0.0F) {
               var29 = true;
            } else {
               var29 = false;
            }

            if (var13) {
               if (var29) {
                  YA var14 = this.tt.Dy;
                  if (this.tt.Dy != null) {
                     ql_0 var15 = this.vQ;
                     var2 = this.vQ.j80 + var15.IA;
                     var33 = this.Eg.IA;
                     float var47 = this.Eg.Wm0;
                     var14.Xd(var1, var2, this.vQ.Wm0, var33, var47);
                  }
               }

               YA var17 = this.tt.Vg0;
               if (this.tt.Vg0 != null) {
                  var2 = this.vQ.j80;
                  var33 = this.vQ.Wm0;
                  float var48 = this.vQ.IA;
                  var56 = this.vQ.Eu0;
                  var17.Xd(var1, var2, var33, var48, var56);
               }

               YA var19 = this.tt.SJ0;
               if (this.tt.SJ0 != null) {
                  var2 = this.wv0.j80;
                  var33 = this.wv0.Wm0;
                  float var49 = this.wv0.IA;
                  var56 = this.wv0.Eu0;
                  var19.Xd(var1, var2, var33, var49, var56);
               }
            }

            if (var29) {
               YA var21 = this.tt.X00;
               if (this.tt.X00 != null) {
                  var2 = this.Eg.j80;
                  float var30 = this.Eg.Wm0;
                  var33 = this.Eg.IA;
                  float var50 = this.Eg.Eu0;
                  var21.Xd(var1, var2, var30, var33, var50);
               }

               YA var23 = this.tt.o80;
               if (this.tt.o80 != null) {
                  var2 = this.Z5.j80;
                  float var31 = this.Z5.Wm0;
                  var33 = this.Z5.IA;
                  float var51 = this.Z5.Eu0;
                  var23.Xd(var1, var2, var31, var33, var51);
               }
            }
         }

         var1.Ud(super.dq0);
      }
   }
}
