package cn.pokemmo.battle.model;

import f.*;

import com.badlogic.gdx.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BattlePokemonCombatant {
   public static final C8 xU = new C8();
   public static final com3__3[] bB0 = new com3__3[0];
   public static final Color[] Y90 = new Color[]{Color.valueOf("#FF9AA2"), Color.valueOf("#FFB7B2"), Color.valueOf("#FFDAC1"), Color.valueOf("#E2F0CB"), Color.valueOf("#B5EAD7"), Color.valueOf("#bfbbf6")};
   public static final HashMap K40 = new HashMap();
   public short rm0;
   public byte VZ;
   public byte h60;
   public byte ZR;
   public byte c10;
   public String s10;
   public boolean Mu0;
   public boolean U1;
   public boolean Q7;
   public cq_0 Z10;
   public QL FZ;
   public final O8 pm0;
   public tb0_1 r10;
   public final se_0 zi0;
   public final byte cD0;
   public byte Kj0;
   public byte lY;
   public byte Ao;
   public jk_0 qi;
   public ii0_2 Fo;
   public com3__3 LpT9;
   public com3__3[] Br0;
   public com3__3[] BG;
   public boolean ea0;
   public short[] Wu;
   public byte[] xJ;
   public short zr0;
   public boolean cf0;
   public boolean Yo;
   public boolean G90;
   public boolean z40;
   public short Sk0;
   public short S20;
   public short EH0;
   public short FF;
   public short qo0;
   public boolean AF0;
   public boolean hS;
   public boolean uV;
   public boolean fl0;
   public boolean f50;
   public boolean TF;
   public short[] Eu;
   public short[] Cd0;
   public byte[] sh0;
   public short VI0;
   public byte[] sL0;
   public i40_0 gp;
   public i40_0 Qj;
   public boolean kc;
   public com3__3 Sc0;
   public xt_0 nl;
   public CG[] Qv0;
   public boolean Dv0;
   public boolean ZM;
   public boolean hL;
   public pw_1 xV;
   public pw_1 vI;
   public float zs0;
   public Runnable ok0;
   public byte rs0;
   public final ke0_1 q40;
   public byte Jo0;

   public BattlePokemonCombatant(O8 var1, tb0_1 var2, b30_0 var3) {
      super();
      this.h60 = -1;
      this.ZR = -128;
      this.c10 = -1;
      this.s10 = "";
      this.Z10 = null;
      this.FZ = QL.lQ;
      this.qi = jk_0.Ty;
      com3__3[] var4 = bB0;
      this.Br0 = var4;
      this.BG = var4;
      this.ea0 = false;
      this.xJ = null;
      this.zr0 = -1;
      this.cf0 = false;
      this.Yo = false;
      this.G90 = false;
      this.z40 = false;
      this.Sk0 = -1;
      this.S20 = -1;
      this.EH0 = -1;
      this.FF = -1;
      this.qo0 = 0;
      this.AF0 = false;
      this.hS = false;
      this.uV = false;
      this.fl0 = false;
      this.f50 = false;
      this.TF = false;
      this.Eu = new short[0];
      this.Cd0 = null;
      this.sh0 = null;
      this.VI0 = -1;
      this.sL0 = new byte[gc_2.ME.length];
      i40_0 var5 = i40_0.Gc;
      this.gp = var5;
      this.Qj = var5;
      this.kc = false;
      this.Sc0 = null;
      this.nl = null;
      this.Qv0 = null;
      this.Dv0 = true;
      this.ZM = false;
      this.hL = true;
      this.xV = null;
      this.vI = null;
      this.ok0 = null;
      this.rs0 = 1;
      ke0_1 var6;
      var6 = new ke0_1();
      this.q40 = var6;
      this.Jo0 = 0;
      this.pm0 = var1;
      this.r10 = var2;
      this.zi0 = var2.zG();
      this.cD0 = var3.a70();
      this.Kj0 = var3.B50();
   }

   static {
      i40_0[] var0;
      int var1 = (var0 = i40_0.for$).length;

      for(int var2 = 0; var2 < var1; ++var2) {
         i40_0 var3;
         Color[] var4;
         switch ((var3 = var0[var2]).ordinal()) {
            case 1:
            case 4:
            case 5:
            case 10:
               Color[] var11 = var4 = new Color[4];
               var11[0] = Color.valueOf("#fff7c2");
               var11[1] = Color.valueOf("#FFDAC1");
               var11[2] = Color.valueOf("#FFB7B2");
               var11[3] = Color.valueOf("#FFDAC1");
               break;
            case 2:
            case 15:
               Color[] var10 = var4 = new Color[4];
               var10[0] = Color.valueOf("#c2fff7");
               var10[1] = Color.valueOf("#f5fffe");
               var10[2] = Color.valueOf("#c2fff7");
               var10[3] = Color.valueOf("#f5fffe");
               break;
            case 3:
            case 7:
            case 17:
               Color[] var9 = var4 = new Color[4];
               var9[0] = Color.valueOf("#6e2417");
               var9[1] = Color.valueOf("#2f0a29");
               var9[2] = Color.valueOf("#59134e");
               var9[3] = Color.valueOf("#2f0a29");
               break;
            case 6:
            case 12:
               Color[] var8 = var4 = new Color[3];
               var8[0] = Color.valueOf("#E2F0CB");
               var8[1] = Color.valueOf("#c1df90");
               var8[2] = Color.valueOf("#fff7c2");
               break;
            case 8:
            case 9:
            default:
               Color[] var12 = var4 = new Color[4];
               var12[0] = Color.valueOf("#fff7c2");
               var12[1] = Color.valueOf("#fff8f4");
               var12[2] = Color.valueOf("#FFDAC1");
               var12[3] = Color.valueOf("#fff8f4");
               break;
            case 11:
               Color[] var7 = var4 = new Color[4];
               var7[0] = Color.valueOf("#76cdff");
               var7[1] = Color.valueOf("#c2fff7");
               var7[2] = Color.valueOf("#7689ff");
               var7[3] = Color.valueOf("#c2fff7");
               break;
            case 13:
               Color[] var6 = var4 = new Color[3];
               var6[0] = Color.valueOf("#fff7c2");
               var6[1] = Color.valueOf("#FFDAC1");
               var6[2] = Color.valueOf("#fff8f4");
               break;
            case 14:
               Color[] var5 = var4 = new Color[4];
               var5[0] = Color.valueOf("#FF9AA2");
               var5[1] = Color.valueOf("#FFDAC1");
               var5[2] = Color.valueOf("#ff9ad5");
               var5[3] = Color.valueOf("#FFDAC1");
               break;
            case 16:
               Color[] var10000 = var4 = new Color[4];
               var10000[0] = Color.valueOf("#6e2417");
               var10000[1] = Color.valueOf("#2f0a29");
               var10000[2] = Color.valueOf("#122b58");
               var10000[3] = Color.valueOf("#2f0a29");
         }

         K40.put(var3, var4);
      }

   }

   public final void JG(Oz0 var1) {
      var1.N10.Hi(this.asBridge()).px0();
   }

   public final void jz0(Oz0 var1) {
      var1.N10.Hi(this.asBridge()).px0();
   }

   public final void yn0(Oz0 var1) {
      var1.N10.Hi(this.asBridge()).Ny();
   }

   public final void I70() {
      tw0_0.LD0.he0.tt(this.cD0, (short)1046);
   }

   public final void s0(short var1, byte var2, String var3, short var4, byte var5, byte var6, byte var7, QL var8) {
      this.rm0 = var1;
      this.VZ = var2;
      this.s10 = var3;
      this.Mu0 = (var4 & 9) != 0;
      this.U1 = (var4 & 4) != 0;
      this.Q7 = (var4 & 8) != 0;
      this.ZR = var5;
      this.c10 = var6;
      this.h60 = var7;
      this.FZ = var8;
      if (var6 > 0) {
         cq_0 var9;
         if ((var9 = mp_1.vf0().W50(var1)).iv0 > 0) {
            this.Z10 = mp_1.vf0().W50((short)(var9.iv0 + var6 - 1));
         }
      } else {
         this.Z10 = mp_1.vf0().W50(var1);
      }

   }

   public final void z8() {
      xg_1 var1;
      if (this.zi0.Bn.GK0 != (var1 = xg_1.rv)) {
         if (this.p10() != 1024) {
            if (this.vI == null) {
               CE var2;
               CE var10000 = var2 = this.zi0.Bn;
               xg_1 var3 = var10000.GK0;
               if (var10000.Yb0 == 250 && (this.rm0 != 0 ? this.Mu0 : var2.I()) && var3 != var1) {
                  a10_0 var21 = this.pm0.lpT2;
                  short var10 = 1121;
                  var21.LPt4 = 4;
                  var21.pk = var10;
                  this.zs0 = 1.33F;
                  Color[] var11;
                  Color var14 = (var11 = Y90)[0];
                  if (!this.LpT9.K7.tM(na0_0.UG)) {
                     this.LpT9.op0(var14, 1.4F);
                  }

                  pw_1 var16 = pw_1.xC();

                  for(Color var19 : var11) {
                     ao_1 var23 = ao_1.DX(this.LpT9.K7, 11, 1.8F);
                     float[] var20;
                     float[] var24 = var20 = new float[4];
                     var20[0] = var19.r;
                     var20[1] = var19.g;
                     var20[2] = var19.b;
                     var24[3] = var19.a;
                     var16.y80(var23.Om0(var24));
                  }

                  ao_1 var25 = ao_1.DX(this.LpT9.K7, 11, 1.8F);
                  float[] var12;
                  float[] var26 = var12 = new float[4];
                  var12[0] = var14.r;
                  var12[1] = var14.g;
                  var12[2] = var14.b;
                  var26[3] = var14.a;
                  var16.y80(var25.Om0(var26));
                  ((D2)var16).Yu0(32767, 0.0F);
                  this.vI = var16;
                  ((D2)var16).Ms(tw0_0.LD0.Ov);
                  this.no();
                  this.pm0.lpT2.mn(this.cD0).zI.wu0 = true;
                  tw0_0.LD0.he0.Z8(this.cD0, (short)1046);
                  String var22 = sm0_0.wa0(5063, sm0_0.c0(150250));
                  this.s10 = "";
                  this.zi0.Bn.kX = var22;
                  this.r10.Wb();
                  this.ok0 = this::I70;
               } else if (this.zi0.Fo0()) {
                  Color[] var8;
                  if ((var8 = (Color[])K40.get(this.rP())) == null) {
                     return;
                  }

                  Color var13 = var8[0];
                  if (!this.LpT9.K7.tM(na0_0.UG)) {
                     this.LpT9.op0(var13, 1.3F);
                  }

                  pw_1 var15 = pw_1.xC();

                  for(Color var6 : var8) {
                     ao_1 var10001 = ao_1.DX(this.LpT9.K7, 11, 4.0F);
                     float[] var7;
                     float[] var10002 = var7 = new float[4];
                     var7[0] = var6.r;
                     var7[1] = var6.g;
                     var7[2] = var6.b;
                     var10002[3] = var6.a;
                     var15.y80(var10001.Om0(var10002));
                  }

                  ao_1 var10003 = ao_1.DX(this.LpT9.K7, 11, 4.0F);
                  float[] var9;
                  float[] var10004 = var9 = new float[4];
                  var9[0] = var13.r;
                  var9[1] = var13.g;
                  var9[2] = var13.b;
                  var10004[3] = var13.a;
                  var15.y80(var10003.Om0(var10004));
                  ((D2)var15).Yu0(32767, 0.0F);
                  this.vI = var15;
                  ((D2)var15).Ms(tw0_0.LD0.Ov);
                  this.r10.Wb();
               }
            }

         }
      }
   }

   public final short p10() {
      short var1;
      return (var1 = this.rm0) > 0 ? var1 : this.zi0.Bn.Yb0;
   }

   public final se_0 Aw0() {
      return this.zi0;
   }

   public final short G20() {
      se_0 var10000 = this.zi0;
      short var1 = var10000.Bn.Yb0;
      return yh_0.Ed(var10000.nF0, var1);
   }

   public final boolean yT() {
      return this.rm0 != 0 ? this.U1 : this.zi0.Bn.aR();
   }

   public final QL getParticleVanity() {
      QL var1;
      return (var1 = this.FZ) != QL.lQ ? var1 : (this.zi0 != null ? this.zi0.Vg0 : QL.lQ);
   }

   public final boolean om0() {
      QL var1;
      zj_0 var2;
      return (var1 = this.zi0.Vg0).new$() || (var2 = var1.aUx) == zj_0.dC0 || var2 == zj_0.fn0;
   }

   public final void ZI(boolean var1, boolean var2) {
      short var3;
      if ((var3 = this.VI0) == -1) {
         var3 = this.p10();
      }

      com3__3 var10;
      if (var3 < 1) {
         var10 = null;
      } else {
         byte var4 = this.coM9();
         cq_0 var10000 = (cq_0)mp_1.vf0().k2.get(Short.valueOf((short)var3));
         byte var5 = this.Wm();
         int var6;
         if ((var6 = var10000.Ai) != 0) {
            if (var6 != 254) {
               if (var6 == 255) {
                  var5 = -1;
               }
            } else {
               var5 = 1;
            }
         } else {
            var5 = 0;
         }

         var3 = yh_0.Ed(var4, (short)var3);
         xt_0 var22;
         if ((var22 = this.nl) != null) {
            var22.dispose();
            this.nl = null;
         }

         CG[] var23;
         if ((var23 = this.Qv0) != null) {
            var6 = var23.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               var23[var7].sI0(this);
            }

            this.Qv0 = null;
         }

         boolean var24;
         if (this.rm0 != 0) {
            var24 = this.Mu0;
         } else {
            var24 = this.zi0.Bn.I();
         }

         yh_0 var28;
         if ((var28 = yh_0.Xm0).ak0(var5, var3, (boolean)var1, (boolean)var24)) {
            AG0[] var29;
            AG0[] var34 = var29 = var28.Kr0(var5, var3, (boolean)var1, (boolean)var24);
            this.Qv0 = var29;
            int var31;
            LPT6_[] var8 = new LPT6_[var31 = var34.length];

            for(int var9 = 0; var9 < var31; ++var9) {
               var8[var9] = var29[var9].d3();
               var29[var9].O50(this);
            }

            float var32;
            if ((var32 = (var28 = yh_0.Xm0).hS((byte)(var1 ? 1 : 0), var3)) == 0.0F) {
               var32 = 1.0F;
            }

            com3__3 var33;
            (var33 = com3__3.DE(var8, var32)).OF0(0.01F);
            if (var28.kJ(var5, var3, (boolean)var1, (boolean)var24)) {
               int[] var11;
               if ((var11 = var28.R6(var5, var3, (boolean)var1, (boolean)var24)) != null && var11[0] > 0) {
                  var3 = 0;
                  int count = var11.length;

                  for(int var26 = 0; var26 < count; ++var26) {
                     var3 += var11[var26];
                  }

                  float var13 = (float)(var3 / var11.length) / 1000.0F;
                  p_0 var20;
                  if ((var20 = var33.r2) != null) {
                     var20.VK = var13;
                     int var36 = var20.p10.length;
                  }
               } else {
                  float var12 = 0.05F;
                  p_0 var18;
                  if ((var18 = var33.r2) != null) {
                     var18.VK = var12;
                     int var35 = var18.p10.length;
                  }
               }

               p_0 var14;
               if ((var14 = var33.r2) != null) {
                  var14.kK0 = OI0.MW;
               }
            }

            var10 = var33;
         } else {
            xt_0 var15 = var28.P90(var5, var3, (boolean)var1, (boolean)var24);
            this.nl = var15;
            float var21;
            if (var1) {
               var21 = (float)dw_2.ba;
            } else {
               var21 = (float)dw_2.Tv0;
            }

            var15.j9(var21);
            var10 = com3__3.xD(this.nl);
            com3__3 var38;
            float var10001;
            if (this.zi0.Fo0()) {
               var38 = var10;
               var10001 = 0.015F;
            } else if (this.yT()) {
               var38 = var10;
               var10001 = 0.0125F;
            } else {
               var38 = var10;
               var10001 = 0.01F;
            }

            var38.im = var10001;
            ((com3__3)var10).OF0(var10.im);
         }
      }

      this.LpT9 = var10;
      if (var10 != null) {
         ((com3__3)var10).nu(0.0F, 0.0F, 0.0F, 0.0F);
         this.Br0 = new com3__3[]{this.LpT9};
         if (this.yT()) {
            if (this.rm0 != 0 ? this.Mu0 : this.zi0.Bn.I()) {
               this.LpT9.op0(x4_0.DS, 1.0F);
            } else {
               this.LpT9.op0(x4_0.EH0, 0.8F);
            }
         }

         if (this.kc) {
            this.RZ();
         }

         this.ll0();
         if (var2) {
            this.nm0();
            this.z8();
         }

         if (!this.Dv0) {
            this.W1(false);
            this.Dv0 = true;
         }

      }
   }

   public final synchronized void ll0() {
      ArrayList var1;
      var1 = new ArrayList();
      com3__3 var2;
      if ((var2 = this.LpT9) != null) {
         var1.add(var2);
      }

      if (this.kc) {
         var1.add(this.Sc0);
      }

      if (var1.size() > 0) {
         this.BG = (com3__3[])var1.toArray(new com3__3[0]);
      } else {
         this.BG = bB0;
      }

      this.no();
   }

   public final void nm0() {
      if (this.LpT9 != null && this.pm0.lpT2 != null) {
         com3__3[] var1;
         int var2 = (var1 = this.BG).length;

         for(int var3 = 0; var3 < var2; ++var3) {
            com3__3 var4;
            (var4 = var1[var3]).j.np(this.ZK(var4, true));
         }

         if (this.Dv0) {
            this.no();
         }

      }
   }

   public final void lPT2() {
      if (this.LpT9 != null && this.pm0.lpT2 != null) {
         pw_1 var1 = pw_1.gb0();
         com3__3[] var2;
         int var3 = (var2 = this.BG).length;

         for(int var4 = 0; var4 < var3; ++var4) {
            com3__3 var10001 = var2[var4];
            C8 var5 = this.ZK(var2[var4], true);
            ao_1 var9 = ao_1.DX(var10001, 4, 0.5F);
            float var8 = var5.x;
            float var6 = var5.y;
            float var7 = var5.z;
            var1.y80(var9.kt(var8, var6, var7));
         }

         ((D2)var1).Ms(tw0_0.LD0.Ov);
         if (this.Dv0) {
            this.no();
         }

      }
   }

   public final C8 ZK(com3__3 var1, boolean var2) {
      C8 var3 = yh_0.Xm0.L4(this.p10(), this.COm2());
      this.yT();
      if (this.COm2()) {
         if (var1 == this.LpT9) {
            C8 var5;
            (var5 = xU).np(vr_1.MS);
            float var7 = this.Sz(this.pm0.lpT2) + var3.x;
            float var4;
            if (this.pm0.lpT2.Sv == XA0.PRN) {
               var4 = 0.0F;
            } else if (this.COm2()) {
               if (this.yT()) {
                  var4 = 0.17F;
               } else {
                  var4 = 0.08F;
               }
            } else if (this.zi0.Fo0()) {
               var4 = 0.275F;
            } else if (this.yT()) {
               var4 = 0.15F;
            } else {
               var4 = 0.06F;
            }

            var5.na(var7, var4 + var3.y, this.Or(this.pm0.lpT2) + var3.z);
         } else if (var1 == this.Sc0) {
            C8 var10000 = xU;
            var10000.np(vr_1.MS);
            var10000.na(this.Sz(this.pm0.lpT2) + 0.15F, -0.3F, this.Or(this.pm0.lpT2) - 0.3F);
         }
      } else if (var1 == this.LpT9) {
         C8 var6;
         (var6 = xU).np(vr_1.Lt0);
         float var8 = this.Sz(this.pm0.lpT2) + var3.x;
         float var9;
         if (this.pm0.lpT2.Sv == XA0.PRN) {
            var9 = 0.0F;
         } else if (this.COm2()) {
            if (this.yT()) {
               var9 = 0.17F;
            } else {
               var9 = 0.08F;
            }
         } else if (this.zi0.Fo0()) {
            var9 = 0.275F;
         } else if (this.yT()) {
            var9 = 0.15F;
         } else {
            var9 = 0.06F;
         }

         var6.na(var8, var9 + var3.y, this.Or(this.pm0.lpT2) + 0.5F + var3.z);
      } else if (var1 == this.Sc0) {
         C8 var10 = xU;
         var10.np(vr_1.Lt0);
         var10.na(this.Sz(this.pm0.lpT2) - 0.2F, -0.28F, this.Or(this.pm0.lpT2) + 0.6F);
      }

      return xU;
   }

   public final com3__3 RZ() {
      if (this.Sc0 == null) {
         LPT6_ var1;
         yh_0 var2;
         Wr var3;
         if ((var3 = (var2 = yh_0.Xm0).dI0) == null) {
            tn_0 var4;
            var4 = new tn_0(var2);
            Wr var10001 = var3 = new Wr(var4);
            var2.dI0 = var3;
         }

         var1 = new LPT6_(var3.H8());
         if (this.COm2()) {
            var1.lpT6(96, 0, 96, 96);
            var1.Wu0(true, false);
         } else {
            var1.lpT6(0, 0, 96, 96);
         }

         boolean var6 = true;
         int var8 = var1.bz;
         (this.Sc0 = new com3__3(var8, var1.xZ, var1, var6)).OF0(0.01F);
         com3__3 var10 = this.Sc0;
         var10.qr0(this.ZK(var10, true));
         this.ll0();
      }

      yh_0 var5;
      Wr var7;
      if ((var7 = (var5 = yh_0.Xm0).dI0) == null) {
         tn_0 var9;
         var9 = new tn_0(var5);
         Wr var11 = var7 = new Wr(var9);
         var5.dI0 = var7;
      }

      var7.Ik = hk0_1.KG;
      return this.Sc0;
   }

   public final void W1(boolean var1) {
      com3__3[] var8;
      int var2 = (var8 = this.Br0).length;

      for(int var3 = 0; var3 < var2; ++var3) {
         com3__3 var4;
         Color var5 = (var4 = var8[var3]).MI0();
         float var6;
         float var7;
         float var9;
         float var10;
         com3__3 var10000;
         if (var1) {
            var10000 = var4;
            var9 = var5.r;
            var10 = var5.g;
            var6 = var5.b;
            var7 = 1.0F;
         } else {
            var10000 = var4;
            var9 = var5.r;
            var10 = var5.g;
            var6 = var5.b;
            var7 = 0.0F;
         }

         var10000.CQ.v50.set(var9, var10, var6, var7);
      }

   }

   public final void wb0(boolean var1) {
      short var2;
      jk_0 var11;
      if ((var2 = this.p10()) < 1) {
         var11 = jk_0.Ty;
      } else {
         yh_0 var3 = yh_0.Xm0;
         int var4 = this.coM9();
         cq_0 var10000 = (cq_0)mp_1.vf0().k2.get(var2);
         int var5 = this.Wm();
         int var6;
         if ((var6 = var10000.Ai) != 0) {
            if (var6 != 254) {
               if (var6 == 255) {
                  var5 = -1;
               }
            } else {
               var5 = 1;
            }
         } else {
            var5 = 0;
         }

         this.lY = 0;
         this.Ao = 0;
         int var12 = yh_0.Ed((byte)var4, var2);
         boolean female = this.rm0 != 0 ? this.Mu0 : this.zi0.Bn.I();

         AG0[] var30;
         AG0[] var33 = var30 = var3.Kr0((byte)var5, (short)var12, var1, female);
         AG0 var7 = var33[0];
         if (var33.length > 2 && var3.kJ((byte)var5, (short)var12, var1, female)) {
            this.Ao = 0;
            this.lY = 2;
            float var32;
            if ((var32 = var3.hS((byte)(var1 ? 1 : 0), (short)var12)) <= 0.0F || var32 > 10.0F) {
               var32 = 3.0F;
            }

            int[] var15 = var3.R6((byte)var5, (short)var12, var1, female);
            jk_0 var21;
            var21 = new jk_0(var30, var32 / 3.0F, var15);
            var11 = var21;
         } else {
            if (var1) {
               this.lY = 2;
               var12 = var7.g6;
               Wr var18 = var7.f60;
               var4 = var7.Px0;
               var5 = var4 + var12 - 1;
               if (!var18.zz) {
                  throw new RuntimeException("Calculation not requested");
               }

               if (var18.sO == null) {
                  var18.H8();
               }

               if (var4 < 0) {
                  var4 = 0;
               }

               int var31;
               if (var5 >= (var31 = var18.Tq)) {
                  var5 = var31 - 1;
               }

               while(var5 >= var4) {
                  if (var18.sO.get(var5)) {
                     var4 = var5;
                     break;
                  }

                  --var5;
               }

               this.lY = (byte)((int)Math.ceil((double)(var12 - (var4 - var7.Px0)) / 1.5));
            } else {
               Wr var13 = var7.f60;
               int var17 = var7.Px0;
               var4 = var17 + var7.g6 - 1;
               if (!var13.zz) {
                  throw new RuntimeException("Calculation not requested");
               }

               if (var13.sO == null) {
                  var13.H8();
               }

               if (var17 < 0) {
                  var17 = 0;
               }

               if (var4 >= (var5 = var13.Tq)) {
                  var4 = var5 - 1;
               }

               while(var17 <= var4) {
                  if (var13.sO.get(var17)) {
                     var4 = var17;
                     break;
                  }

                  ++var17;
               }

               this.Ao = (byte)((byte)((var4 - var7.Px0) / 2) + 2);
            }

            jk_0 var34 = var11 = new jk_0(var7);
            byte var19 = 64;
            var4 = 64;
            ((jk_0)var34).cOm6 = var19;
            ((jk_0)var34).wN = var4;
            var19 = 64;
            var4 = 64;
            ((jk_0)var34).Q1 = var19;
            ((jk_0)var34).lo0 = var4;
         }
      }

      label129: {
         this.qi = var11;
         a10_0 var22;
         jk_0 target;
         if ((var22 = this.pm0.lpT2) != null && var22.Sv == XA0.PRN) {
            target = (jk_0)var11;
            target.yJ = -80;
         } else {
            if (!var1) {
               ((jk_0)var11).yJ = this.vF(var22) - 260;
               ((jk_0)var11).tX = this.h90(this.pm0.lpT2);
               break label129;
            }
            target = (jk_0)var11;
            target.yJ = 296;
         }
         target.tX = this.h90(var22);
      }

      ii0_2 var10;
      var10 = new ii0_2(this.qi);
      this.Fo = var10;
   }

   public final CH0 Zo0() {
      return this.zi0.Bn.YD0;
   }

   public final short uk() {
      return this.zi0.Bn.VD;
   }

   public final void F(short var1) {
      this.zi0.Bn.hB(var1);
   }

   public final byte Wm() {
      if (this.zi0.Bj()) {
         return -1;
      } else {
         byte var1;
         return (var1 = this.ZR) != -128 ? var1 : this.zi0.D4;
      }
   }

   public final byte rp0() {
      byte var1;
      return (var1 = this.h60) > 0 ? var1 : this.zi0.Bn.QQ;
   }

   public final byte Ya0() {
      byte var1;
      return (var1 = this.VZ) > 0 ? var1 : this.zi0.Bn.wj;
   }

   public final String A60() {
      if (!this.s10.isEmpty()) {
         return this.s10;
      } else {
         String var1;
         return !(var1 = this.zi0.Bn.kX).isEmpty() ? var1 : this.nz0(true);
      }
   }

   public final String Yp() {
      return "[#ff8a00]" + this.A60().replaceAll("\\{[^\\}]+\\}", "") + "[#]";
   }

   public final String EG() {
      O8 var5;
      label22: {
         a10_0 var1 = this.pm0.lpT2;
         byte var2;
         byte var10000 = var2 = this.cD0;
         byte var3 = this.Kj0;
         if (var10000 >= 0) {
            O8[] var4;
            if (var2 <= (var4 = var1.eG).length) {
               var5 = var4[var2].Sf(var3);
               break label22;
            }
         } else {
            var1.getClass();
         }

         var5 = null;
      }

      String var8;
      if (!(var8 = var5.zn().trim()).isEmpty()) {
         if (var5 instanceof pi0_1) {
            String[] var7;
            String[] var10 = var7 = new String[2];
            var7[0] = var8;
            var10[1] = this.A60();
            return sm0_0.Bx(5025, var7);
         } else {
            String[] var6;
            String[] var9 = var6 = new String[2];
            var6[0] = var8;
            var9[1] = this.A60();
            return sm0_0.Bx(5026, var6);
         }
      } else {
         return this.A60();
      }
   }

   public final String nz0(boolean var1) {
      short var2;
      boolean var3;
      boolean var4;
      if (this.xJ != null) {
         CE var10001 = this.zi0.Bn;
         var2 = var10001.Yb0;
         var3 = var10001.I();
         var4 = this.zi0.Bn.aR();
      } else {
         if (this.rm0 != 0) {
            var3 = this.Mu0;
         } else {
            var3 = this.zi0.Bn.I();
         }

         var4 = this.yT();
         var2 = this.p10();
      }

      boolean var10000 = var1;
      boolean var5 = this.zi0.Bj();
      String var6 = sm0_0.c0(var2 + 150000);
      if (var10000) {
         if (var3 && var4) {
            var6 = sm0_0.wa0(5019, sm0_0.wa0(1887, var6));
         } else if (var3) {
            var6 = sm0_0.wa0(5019, var6);
         } else if (var4) {
            var6 = sm0_0.wa0(1887, var6);
         }
      }

      if (var5) {
         var6 = QA0.W0(var6, "☆");
      }

      return var6;
   }

   public final boolean H7() {
      return this.zi0.hf0();
   }

   public final void bv0(short var1) {
      se_0 var2;
      se_0 var10001 = var2 = this.zi0;
      var10001.T0 = var1;
      if (var1 != var10001.Bn.rh0()) {
         var2.Bn.ZE0 = var2.T0;
      }

      Oz0 var3;
      if ((var3 = tw0_0.LD0.he0) != null) {
         lg_0.k.lPT5(() -> this.yn0(var3));
      }

   }

   public final void Ry0(byte var1) {
      this.Tm();
      this.zi0.Bn.H1 = var1;
      this.no();
      this.y80();
   }

   public final void no() {
      com3__3[] var1;
      if ((var1 = this.Br0).length >= 1) {
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            com3__3 var10000 = var1[var3];
            float var4;
            var1[var3].XV = var4 = this.qs0();
            xt_0 var5;
            if ((var5 = var10000.Kj) != null) {
               var5.B0 = var4;
            }
         }

      }
   }

   public final float qs0() {
      if (this.zs()) {
         return 0.0F;
      } else {
         float var1;
         if ((var1 = this.zs0) == 0.0F) {
            if (!this.yT() && !this.zi0.Bj()) {
               var1 = 1.0F;
            } else {
               var1 = 0.8F;
            }
         }

         float var2;
         if (!this.Eq() && !this.jD0()) {
            var2 = var1;
         } else {
            var2 = 0.6F;
         }

         return var1 > 1.0F && var2 != var1 ? var2 * var1 : var2;
      }
   }

   public final void Tm() {
      pw_1 var1;
      if ((var1 = this.xV) != null) {
         var1.w6 = true;
         this.xV = null;
         pw_1 var10000 = pw_1.xC().TD0();
         ao_1 var10001 = ao_1.DX(this.LpT9.K7, 10, 0.25F);
         float[] var2;
         float[] var10002 = var2 = new float[4];
         Color var3;
         Color var10004 = var3 = Color.CLEAR;
         var2[0] = var3.r;
         var2[1] = var3.g;
         var2[2] = var3.b;
         var10002[3] = var10004.a;
         var10000.y80(var10001.Om0(var10002)).mz0().Ms(tw0_0.LD0.Ov);
      }

   }

   public final void y80() {
      if (this.hL) {
         Color var1;
         if (this.wG0()) {
            var1 = Color.RED;
         } else if (this.Eq()) {
            var1 = Color.YELLOW;
         } else if (this.rq()) {
            var1 = Color.PURPLE;
         } else if (this.Ky()) {
            var1 = Color.MAGENTA;
         } else if (this.zs()) {
            var1 = Color.CYAN;
         } else {
            var1 = Color.CLEAR;
         }

         Color var2;
         if (var1 != (var2 = Color.CLEAR) && this.xV == null) {
            BattlePokemonCombatant var10000 = this;
            pw_1 var10001 = pw_1.xC().TD0().p1((float)rg0_2.j40(10, 15) / 10.0F);
            ao_1 var10002 = ao_1.DX(this.LpT9.K7, 10, 3.5F);
            float[] var3;
            float[] var10003 = var3 = new float[4];
            var3[0] = var1.r;
            var3[1] = var1.g;
            var10003[2] = var1.b;
            var10003[3] = 0.5F;
            var10001 = var10001.y80(var10002.Om0(var10003));
            var10002 = ao_1.DX(this.LpT9.K7, 10, 3.5F);
            float[] var4;
            var10003 = var4 = new float[4];
            var4[0] = var2.r;
            var4[1] = var2.g;
            var4[2] = var2.b;
            var10003[3] = var2.a;
            var10000.xV = (pw_1)((pw_1)var10001.y80(var10002.Om0(var10003)).mz0().Yu0(32767, 0.0F)).Ms(tw0_0.LD0.Ov);
         }

      }
   }

   public final boolean jD0() {
      return (byte)(this.zi0.Bn.H1 & 7) > 0;
   }

   public final boolean rq() {
      byte var1;
      return ((var1 = this.zi0.Bn.H1) | 8) == var1;
   }

   public final boolean Ky() {
      byte var1;
      return ((var1 = this.zi0.Bn.H1) | -128) == var1;
   }

   public final boolean wG0() {
      byte var1;
      return ((var1 = this.zi0.Bn.H1) | 16) == var1;
   }

   public final boolean zs() {
      byte var1;
      return ((var1 = this.zi0.Bn.H1) | 32) == var1;
   }

   public final boolean Eq() {
      byte var1;
      return ((var1 = this.zi0.Bn.H1) | 64) == var1;
   }

   public final int h90(a10_0 var1) {
      if (!this.COm2() && var1.Sv != XA0.PRN) {
         a10_0 var10000 = var1;
         int var4 = 0;
         byte var2 = this.cD0;
         if ((byte)var10000.wI0[var2].length == 5) {
            var4 = this.Kj0 % 2 * -10;
         }

         var2 = 8;
         return (this.kc ? 17 : this.Ao) + var2 + var4;
      } else {
         byte var3 = 48;
         return (this.kc ? 17 : this.lY) + var3;
      }
   }

   public final float Or(a10_0 var1) {
      byte var2 = this.cD0;
      var2 = (byte)var1.wI0[var2].length;
      if (this.COm2()) {
         if (var1.j6 == zg0_0.ef0) {
            byte var7;
            switch (var7 = this.Kj0) {
               case 0:
               case 1:
               case 2:
                  return -((float)var7 * 0.05F);
               case 3:
               case 4:
               case 5:
                  return (float)var7 * 0.05F;
            }
         } else {
            if (var2 == 2) {
               if (this.Kj0 != 0) {
                  return 0.25F;
               }

               return 0.0F;
            }

            if (var2 == 3) {
               byte var8;
               if ((var8 = this.Kj0) != 0) {
                  if (var8 != 2) {
                     return -0.5F;
                  }

                  return 0.5F;
               }

               return 0.0F;
            }

            if (var2 == 4) {
               switch (this.Kj0) {
                  case 0:
                     return 0.0F;
                  case 1:
                     return -0.5F;
                  case 2:
                     return -0.4F;
                  case 3:
                     return 0.1F;
               }
            } else if (var2 == 5) {
               return 0.0F;
            }
         }

         return 0.2F;
      } else {
         if (var1.Sv == XA0.Fz) {
            Cq var9 = var1.nf;
            if ((this.cD0 > 0 ? var9.Lw0 : var9.e50) == 3) {
               byte var4;
               if ((var4 = this.Kj0) == 0) {
                  return -0.1F;
               }

               if (var4 == 1) {
                  return -0.8F;
               }

               if (var4 == 2) {
                  return 0.25F;
               }
            }
         } else {
            if (var1.m2) {
               Cq var3 = var1.nf;
               if ((this.cD0 > 0 ? var3.Lw0 : var3.e50) == 1) {
                  return -0.5F;
               }
            }

            if (var1.j6 == zg0_0.ef0) {
               byte var5;
               switch (var5 = this.Kj0) {
                  case 0:
                  case 1:
                  case 2:
                     return (float)var5 * 0.05F;
                  case 3:
                  case 4:
                  case 5:
                     return -((float)var5 * 0.05F);
               }
            } else {
               if (var2 == 2) {
                  return this.Kj0 == 0 ? -0.6F : 0.0F;
               }

               if (var2 == 3) {
                  byte var6;
                  if ((var6 = this.Kj0) != 0) {
                     if (var6 != 2) {
                        return 0.2F;
                     }

                     return -0.1F;
                  }

                  return -0.7F;
               }

               if (var2 == 5) {
                  switch (this.Kj0) {
                     case 1:
                        return -0.75F;
                     case 2:
                        return -0.55F;
                     case 3:
                        return -0.25F;
                     case 4:
                        return 0.1F;
                     default:
                        return 0.0F;
                  }
               }
            }
         }

         return -0.5F;
      }
   }

   public final float Sz(a10_0 var1) {
      if (var1.Sv == XA0.PRN) {
         return 0.0F;
      } else {
         byte var2 = this.cD0;
         var2 = (byte)var1.wI0[var2].length;
         if (this.COm2()) {
            if (var1.j6 == zg0_0.ef0) {
               byte var8;
               switch (var8 = this.Kj0) {
                  case 0:
                  case 1:
                  case 2:
                     return (float)var8 * 0.75F - 0.45F;
                  case 3:
                  case 4:
                  case 5:
                     return (float)(var8 - 3) * 0.75F - 0.85F;
               }
            } else {
               if (var2 == 2) {
                  if (this.Kj0 == 0) {
                     return -0.4F;
                  }

                  return 0.4F;
               }

               if (var2 == 3) {
                  byte var9;
                  if ((var9 = this.Kj0) == 2) {
                     return 0.5F;
                  }

                  return (float)var9 * 0.7F + -0.5F;
               }

               if (var2 == 4) {
                  switch (this.Kj0) {
                     case 0:
                        return -0.75F;
                     case 1:
                        return -0.2F;
                     case 2:
                        return 0.5F;
                     case 3:
                        return 0.75F;
                  }
               }
            }

            return 0.0F;
         } else {
            if (var1.Sv == XA0.Fz) {
               Cq var10 = var1.nf;
               if ((this.cD0 > 0 ? var10.Lw0 : var10.e50) == 3) {
                  byte var4;
                  if ((var4 = this.Kj0) == 0) {
                     return -0.45F;
                  }

                  if (var4 == 1) {
                     return 0.15F;
                  }

                  if (var4 == 2) {
                     return 0.35F;
                  }
               }
            } else {
               if (var1.m2) {
                  Cq var3 = var1.nf;
                  if ((this.cD0 > 0 ? var3.Lw0 : var3.e50) == 1) {
                     return 0.2F;
                  }
               }

               if (var1.j6 == zg0_0.ef0) {
                  byte var5;
                  switch (var5 = this.Kj0) {
                     case 0:
                     case 1:
                     case 2:
                        return (float)var5 * 0.75F - 0.75F;
                     case 3:
                     case 4:
                     case 5:
                        return (float)(var5 - 3) * 0.75F - 0.85F;
                  }
               } else {
                  if (var2 == 2) {
                     if (this.Kj0 == 0) {
                        return -0.25F;
                     }

                     return 0.35F;
                  }

                  if (var2 == 3) {
                     byte var7;
                     if ((var7 = this.Kj0) == 2) {
                        return 0.75F;
                     }

                     return (float)var7 * 0.3F + -0.35F;
                  }

                  if (var2 == 5) {
                     byte var6;
                     switch (var6 = this.Kj0) {
                        case 0:
                           return -0.35999998F;
                        case 1:
                        case 2:
                        case 3:
                           return (float)(var6 - 2) * 0.75F + 0.25F;
                        case 4:
                           return 0.35999998F;
                     }
                  }
               }
            }

            return 0.2F;
         }
      }
   }

   public final boolean COm2() {
      return this.pm0.lpT2.Ez0() == this.cD0;
   }

   public final int vF(a10_0 var1) {
      if (var1.Sv == XA0.PRN) {
         return 0;
      } else if (this.COm2()) {
         byte var4 = this.cD0;
         PF[] var5;
         if ((byte)(var5 = var1.wI0[var4]).length == 2) {
            return var1.Ce(var4, (byte)0) == this.asBridge() ? 10 : 66;
         } else {
            return (byte)var5.length == 3 ? this.Kj0 * 28 + 10 : 38;
         }
      } else {
         byte var2 = this.cD0;
         PF[] var3;
         if ((byte)(var3 = var1.wI0[var2]).length == 3) {
            return this.Kj0 * 20 + 124;
         } else if ((byte)var3.length == 5) {
            return this.Kj0 * 20 + 104;
         } else if ((byte)var3.length == 2) {
            return var1.Ce(var2, (byte)0) == this.asBridge() ? 122 : 166;
         } else {
            return 144;
         }
      }
   }

   public final void ND0(short var1, byte var2, short[] var3, byte[] var4, short var5, byte var6) {
      byte var7 = this.Ya0();
      String var8 = this.zi0.Bn.kX;
      byte var9 = this.rp0();
      QL var10;
      if ((var10 = this.FZ) == QL.lQ) {
         var10 = this.zi0.Vg0;
      }

      this.s0(var1, var7, var8, var5, var6, var2, var9, var10);
      this.Wu = var3;
      this.xJ = var4;
      if (var1 > 0 && var3 != null && var4 == null) {
         this.xJ = new byte[4];

         for(int var11 = 0; var11 < 4; ++var11) {
            if (this.Wu[var11] > 0) {
               ec0_2 var12 = ec0_2.Sx();
               vk0_1 var13;
               if ((var13 = (vk0_1)var12.f4.f5(var3[var11])) == null) {
                  this.xJ[var11] = 0;
               } else {
                  var4 = this.xJ;
                  byte var14;
                  if (var13.Gn(false) < 5) {
                     var14 = var13.Gn(false);
                  } else {
                     var14 = 5;
                  }

                  var4[var11] = var14;
               }
            }
         }
      }

   }

   public final byte coM9() {
      byte var1;
      return (var1 = this.c10) != -1 ? var1 : this.zi0.nF0;
   }

   public final short[] qz0() {
      short[] var1;
      if ((var1 = this.Wu) != null) {
         return var1;
      } else {
         var1 = this.zi0.Bn.Gu;
         if (this.Cd0 != null) {
            var1 = Arrays.copyOf(var1, var1.length);

            short[] var3;
            for(int var2 = 0; var2 < (var3 = this.Cd0).length; ++var2) {
               short var6;
               if ((var6 = var3[var2]) >= 0) {
                  var1[var2] = var6;
               }
            }

            return var1;
         } else {
            return var1;
         }
      }
   }

   public final byte[] um0() {
      byte[] var1;
      if ((var1 = this.xJ) != null) {
         return var1;
      } else {
         var1 = this.zi0.Bn.TC0;
         if (this.Cd0 != null) {
            var1 = Arrays.copyOf(var1, var1.length);

            short[] var3;
            for(int var2 = 0; var2 < (var3 = this.Cd0).length; ++var2) {
               if (var3[var2] >= 0) {
                  var1[var2] = this.sh0[var2];
               }
            }

            return var1;
         } else {
            return var1;
         }
      }
   }

   public final void yK0(gc_2 var1, byte var2) {
      if (!this.TF || var2 >= 0) {
         byte[] var10001 = this.sL0;
         byte var3;
         var10001[var1.v10] = (byte)(var10001[var1.v10] + var2);
         this.r10.Wb();
         Oz0 var4;
         if ((var4 = tw0_0.LD0.he0) != null) {
            var4.N10.Hi(this.asBridge()).XO();
         }

      }
   }

   public final void Mt(gc_2 var1, byte var2) {
      if (!this.TF || var2 >= 0) {
         this.sL0[var1.v10] = var2;
      }
   }

   public final void Ah() {
      byte[] var2;
      if (this.TF) {
         for(int var1 = 0; var1 < (var2 = this.sL0).length; ++var1) {
            if (var2[var1] < 0) {
               var2[var1] = 0;
            }
         }
      } else {
         Arrays.fill(this.sL0, (byte)0);
      }

   }

   public final void h30(byte[] var1) {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] < 0 && this.TF) {
               var1[var2] = this.sL0[var2];
            }
         }

         this.sL0 = var1;
      }
   }

   public final void c20() {
      this.ZM = true;
      xt_0 var1;
      if ((var1 = this.nl) != null) {
         var1.dispose();
      }

      CG[] var5;
      if ((var5 = this.Qv0) != null) {
         int var2 = var5.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            var5[var3].sI0(this);
         }
      }

      pw_1 var4;
      if ((var4 = this.xV) != null) {
         var4.bC0();
      }

   }

   public final void xG0() {
      this.U7(1.0F);
   }

   public final void U7(float var1) {
      float var2 = 0.0F;
      a10_0 var3;
      if ((var3 = this.pm0.lpT2) != null) {
         if (var3.Ez0() == this.cD0) {
            var2 = -1.0F;
         } else {
            var2 = 1.0F;
         }
      }

      var2 *= dw_2.ej;
      boolean var5;
      if (!this.yT() && !this.zi0.Bj()) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1 = LW.r1(var1 * 0.6F, 0.5F, 1.0F);
      }

      di0_0.Hv0(this.p10(), this.coM9(), var1, var2, var5);
   }

   public final short HF() {
      short var10000 = this.p10();
      short var1 = this.coM9();
      dl_1 var10001 = tx_1.Sy0;
      switch (var10000) {
         case 12:
         case 15:
         case 17:
         case 22:
         case 41:
         case 42:
         case 49:
         case 63:
         case 70:
         case 71:
         case 72:
         case 73:
         case 81:
         case 82:
         case 90:
         case 91:
         case 92:
         case 93:
         case 109:
         case 110:
         case 116:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 129:
         case 130:
         case 137:
         case 138:
         case 139:
         case 140:
         case 142:
         case 145:
         case 146:
         case 151:
         case 166:
         case 169:
         case 170:
         case 171:
         case 174:
         case 187:
         case 188:
         case 189:
         case 193:
         case 200:
         case 201:
         case 211:
         case 223:
         case 226:
         case 230:
         case 233:
         case 249:
         case 250:
         case 251:
         case 267:
         case 269:
         case 270:
         case 278:
         case 279:
         case 284:
         case 291:
         case 292:
         case 307:
         case 313:
         case 314:
         case 318:
         case 319:
         case 320:
         case 321:
         case 330:
         case 333:
         case 337:
         case 338:
         case 339:
         case 340:
         case 344:
         case 347:
         case 349:
         case 351:
         case 353:
         case 355:
         case 358:
         case 362:
         case 367:
         case 368:
         case 369:
         case 370:
         case 374:
         case 375:
         case 380:
         case 381:
         case 382:
         case 384:
         case 385:
         case 412:
         case 413:
         case 414:
         case 415:
         case 416:
         case 425:
         case 426:
         case 429:
         case 433:
         case 436:
         case 437:
         case 455:
         case 456:
         case 457:
         case 458:
         case 462:
         case 468:
         case 469:
         case 472:
         case 474:
         case 476:
         case 477:
         case 478:
         case 479:
         case 480:
         case 481:
         case 482:
         case 488:
         case 489:
         case 491:
         case 517:
         case 518:
         case 527:
         case 528:
         case 550:
         case 561:
         case 562:
         case 563:
         case 564:
         case 567:
         case 577:
         case 578:
         case 579:
         case 582:
         case 583:
         case 584:
         case 587:
         case 589:
         case 592:
         case 593:
         case 594:
         case 598:
         case 599:
         case 601:
         case 602:
         case 605:
         case 606:
         case 608:
         case 609:
         case 615:
         case 618:
         case 628:
         case 635:
         case 637:
         case 641:
         case 642:
         case 645:
            return 2029;
         case 487:
            if (var1 == 1) {
               return 2029;
            }
            break;
         case 648:
            if (var1 == 0) {
               return 2029;
            }
      }

      var10000 = var1 = this.p10();
      this.coM9();
      if (var10000 != 50 && var1 != 51) {
         if (this.hi0().Cu0 < 500) {
            return 1400;
         } else if (this.hi0().Cu0 < 1500) {
            return 1399;
         } else {
            return 1398;
         }
      } else {
         return 0;
      }
   }

   public final cq_0 hi0() {
      cq_0 var1;
      if ((var1 = this.Z10) != null) {
         return var1.iv0 > 0 && this.c10 > 0 ? mp_1.vf0().W50((short)(this.Z10.iv0 + this.c10 - 1)) : var1;
      } else {
         return this.zi0.E10();
      }
   }

   public final i40_0 J50() {
      i40_0 var1;
      return (var1 = this.gp) != i40_0.Gc ? var1 : this.hi0().OE0(this.coM9());
   }

   public final i40_0 fE() {
      i40_0 var1;
      return (var1 = this.Qj) != i40_0.Gc ? var1 : this.hi0().F70(this.coM9());
   }

   public final boolean y3(i40_0 var1) {
      if (this.gp != var1 && this.Qj != var1) {
         return this.J50() == var1 || this.fE() == var1;
      } else {
         return true;
      }
   }

   public final i40_0 rP() {
      i40_0 var1;
      i40_0 var10000 = var1 = this.zi0.E10().OE0((byte)-1);
      i40_0 var3 = this.zi0.E10().F70((byte)-1);
      i40_0 var2;
      if (var10000 == (var2 = i40_0.c90) && var1 != var3) {
         var1 = var3;
      }

      return var1 != i40_0.g50 && var1 != i40_0.Gc ? var1 : var2;
   }

   public final short Ql() {
      short var1;
      return (var1 = this.Sk0) != -1 ? var1 : this.zi0.E3();
   }

   public final void Iw0(byte var1) {
      this.rs0 = var1;
      Oz0 var2;
      if ((var2 = tw0_0.LD0.he0) != null) {
         lg_0.k.lPT5(() -> this.jz0(var2));
      }

   }

   public final void WP(byte var1) {
      this.rs0 -= var1;
      Oz0 var2;
      if ((var2 = tw0_0.LD0.he0) != null) {
         lg_0.k.lPT5(() -> this.JG(var2));
      }

   }

   public final void X70(byte var1, byte var2, short var3) {
      if (this.Cd0 == null) {
         short[] var4;
         short[] var10001 = var4 = new short[4];
         this.Cd0 = var4;
         this.sh0 = new byte[4];
         Arrays.fill(var10001, (short)-1);
         Arrays.fill(this.sh0, (byte)-1);
      }

      this.Cd0[var1] = var3;
      this.sh0[var1] = var2;
   }

    // ==========================================
    // 现代可读 API 封装 (Modernized APIs)
    // ==========================================

    public final PF asBridge() {
        return ((Object) this) instanceof PF ? (PF) (Object) this : null;
    }

    public final short getSpeciesId() {
        return this.p10();
    }

    public final se_0 getSlotInfo() {
        return this.Aw0();
    }

    public final short getVisualSpeciesId() {
        return this.G20();
    }

    public final boolean isSecretShiny() {
        return this.yT();
    }

    public final boolean isShiny() {
        return this.rm0 != 0 ? this.Mu0 : (this.zi0 != null && this.zi0.Bn != null && this.zi0.Bn.I());
    }

    public final short getCurrentHp() {
        return this.uk();
    }

    public final void setCurrentHp(short hp) {
        this.F(hp);
    }

    public final short getMaxHp() {
        return this.HF();
    }

    public final float getHpPercent() {
        return this.qs0();
    }

    public final byte getGender() {
        return this.Wm();
    }

    public final byte getNature() {
        return this.rp0();
    }

    public final byte getAbility() {
        return this.Ya0();
    }

    public final String getDisplayName() {
        return this.A60();
    }

    public final String getSpeciesName() {
        return this.Yp();
    }

    public final String getTrainerName() {
        return this.EG();
    }

    public final String getFormattedName(boolean withLevel) {
        return this.nz0(withLevel);
    }

    public final boolean isFainted() {
        return this.H7();
    }

    public final boolean isAlive() {
        return this.Eq();
    }

    public final boolean isPlayerSide() {
        return this.jD0();
    }

    public final boolean isOpponentSide() {
        return this.rq();
    }

    public final boolean isWild() {
        return this.Ky();
    }

    public final boolean isSubstituted() {
        return this.wG0();
    }

    public final boolean hasStatusAilment() {
        return this.zs();
    }

    public final byte getForm() {
        return this.coM9();
    }

    public final short[] getEvs() {
        return this.qz0();
    }

    public final byte[] getIvs() {
        return this.um0();
    }

    public final short getHeldItemId() {
        return this.Ql();
    }

    public final cq_0 getPokedexEntry() {
        return this.hi0();
    }

    public final i40_0 getPrimaryType() {
        return this.J50();
    }

    public final i40_0 getSecondaryType() {
        return this.fE();
    }

    public final boolean hasType(i40_0 type) {
        return this.y3(type);
    }

    public final i40_0 getDisplayType() {
        return this.rP();
    }

    public final CH0 getOriginalTrainer() {
        return this.Zo0();
    }

    public final com3__3 getSubstituteRenderer() {
        return this.RZ();
    }

    public final void setVisible(boolean visible) {
        this.W1(visible);
    }

    public final void setFainted(boolean fainted) {
        this.wb0(fainted);
    }

    public final void updatePosition() {
        this.nm0();
    }

    public final void animatePosition() {
        this.lPT2();
    }

    public final void loadBattleSprite(boolean isFront, boolean animated) {
        this.ZI(isFront, animated);
    }

    public final void setStatStage(gc_2 stat, byte stage) {
        this.yK0(stat, stage);
    }

    public final void adjustStatStage(gc_2 stat, byte delta) {
        this.Mt(stat, delta);
    }

    public final void resetStatStages() {
        this.Ah();
    }

    public final void applyStatStages(byte[] stages) {
        this.h30(stages);
    }

    public final void clearStatus() {
        this.c20();
    }

    public final void cureStatus() {
        this.xG0();
    }

}
