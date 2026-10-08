package cn.pokemmo.audio;

import f.*;


import aurelienribon.tweenengine.equations.Quad;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class GdxSoundManager extends vj_0 {
   public static final C8 mU = new C8(-2.25F, 0.0F, 0.8F);
   public fh_1 Ix0;
   public ff_0 Tr0;
   public ParticleEffectExt[] PF;
   public VU[] kv;
   public xt_0[] Ic0;
   public ui_1 DM;
   public Texture[] zb;
   public Texture Qz;
   public Color[] sA;
   public final Color c00 = Color.WHITE.cpy();
   public int S20;
   public int mu0;
   public int wE0;
   public int xb0;
   public int ku;
   public float Cv0;
   public boolean l50;
   public BT TH;
   public short om;
   public byte jz0;
   public com3__3[] rk;
   public pw_1 w5;
   public ParticleEffectExt PN;
   public ParticleEffectExt yC;
   public boolean FD = false;

   public GdxSoundManager(byte var1) {
      super(true);
   }

   public static void l70(com3__3 var0, int var1, D2 var2) {
      na0_0 var3;
      if ((var3 = (na0_0)var0.K7.sg(na0_0.UG)) != null) {
         var3.aD = var0.dG;
      }
   }

   @Override
   public final ux_1 CoM5() {
      return new je0_2();
   }

   @Override
   public final void IZ() {
      super.IZ();
      BJ0 var10010 = super.fC0;
      BJ0 var10011 = super.fC0;
      super.fC0.Rg0 = 3.0F;
      C8 var10 = var10011.rj;
      float var1 = -1.0F;
      float var2 = -3.25F;
      var10011.rj.x = 0.0F;
      var10.y = var1;
      var10.z = var2;
      var10010.JP(0.0F, 0.5F, 1.0F);
      Tq0 var3;
      var3 = new Tq0(super.fC0);
      this.Ix0 = new fh_1(100, var3);
      (this.Tr0 = new ff_0(super.fC0, 0)).nI(tw0_0.Ll0.Qz0);
      this.Tr0.Vk.Q4();
      ui_1 var9 = new ui_1();
      this.DM = var9;
      super.ym0.Ue0(var9);
      super.ym0.Ue0(this.Ix0);
      super.ym0.Ue0(var3);
      super.ym0.Ue0(this.Tr0);
      BT var4 = new BT();
      this.TH = var4;
      Qy0.yI0.F9(Qy0.yI0.fU(), var4);
      this.TH.lt0();
      this.TH.BL();
      OE0 var5 = tw0_0.RE0.e00;
      short var6;
      if (tw0_0.RE0.e00 != null) {
         var6 = var5.Ib0();
      } else {
         var6 = 0;
      }

      this.om = var6;
      OE0 var7 = tw0_0.RE0.e00;
      byte var8;
      if (tw0_0.RE0.e00 != null) {
         var8 = var7.Fv();
      } else {
         var8 = 0;
      }

      this.jz0 = var8;
      this.LPt6(lg_0.S4.Kr0(), lg_0.S4.sD0());
   }

   @Override
   public final void LPt6(int var1, int var2) {
      super.LPt6(var1, var2);
      this.DM.g00.BI(super.bA0, super.ED0);
   }

   @Override
   public final boolean je0(i70_0 var1) {
      label31: {
         if (E00.ZU(var1.zu) && var1.iT()) {
            int var2 = var1.finally$;
            rp_0 var3 = rp_0.sJ0;
            if (rp_0.sJ0 != null && var3.Ov(var2)) {
               break label31;
            }

            var2 = var1.finally$;
            var3 = rp_0.nK0;
            if (rp_0.nK0 != null && var3.Ov(var2)) {
               break label31;
            }
         }

         int var7 = var1.zu;
         if (!E00.C10(var1.zu) || var1.nA0 != 0 || var7 != 3) {
            return false;
         }
      }

      Qy0 var10000 = Qy0.yI0;
      Qy0 var10001 = Qy0.yI0;
      lpt3__4 var5;
      String var4 = sm0_0.c0(6150);
      Runnable var8 = this::RQ;
      BT var10 = this.TH;
      var5 = new lpt3__4(var4, var8, var10);
      var10000.F9(var10001.fU(), var5);
      return true;
   }

   @Override
   public final void c80() {
      super.c80();
      byte var1 = this.jz0;
      tw0_0.RE0.Eh(var1, this.om, false, true);
      this.TH.xe0();
   }

    @Override
    public final void ux() {
        fn_0.qz0().getClass();
        this.zb = fn_0.qF();
        for (Texture texture : this.zb) {
            this.S20 += texture.getWidth();
            this.mu0 = texture.getHeight();
        }
        this.Qz = fn_0.qz0().Q10("hof");
        int memberCount = tw0_0.rl.PC0.VW.size();
        this.kv = new VU[memberCount];
        System.arraycopy(tw0_0.rl.PC0.rT(), 0, this.kv, 0, memberCount);
        this.PF = new ParticleEffectExt[memberCount];
        this.rk = new com3__3[memberCount];
        this.Ic0 = new xt_0[memberCount];
        this.sA = new Color[memberCount];
        (this.PN = this.Tr0.UH0("special/hof")).init();
        (this.yC = this.Tr0.UH0("special/hof_party_trail")).init();
        for (int index = 0; index < this.kv.length; ++index) {
            VU member = this.kv[index];
            if (member == null) {
                continue;
            }
            CE creature = member.I8;
            i40_0 type = member.ZE();
            com3__3 model;
            yh_0 data = yh_0.Xm0;
            if ((!this.FD || creature.Kr() >= 1000)
                && data.ak0(member.Dg0(), creature.Kr(), false, creature.I())) {
                AG0[] effects = data.Kr0(member.Dg0(), creature.Kr(), false, creature.I());
                LPT6_[] parts = new LPT6_[effects.length];
                for (int part = 0; part < effects.length; ++part) {
                    parts[part] = effects[part].d3();
                    effects[part].O50(this);
                }
                float scale = data.hS((byte)0, creature.Kr());
                if (scale == 0.0f) {
                    scale = 1.0f;
                }
                model = com3__3.DE(parts, scale);
                if (data.kJ(member.Dg0(), creature.Kr(), false, creature.I())) {
                    int[] timing = data.R6(member.Dg0(), creature.Kr(), false, creature.I());
                    p_0 animation = model.r2;
                    if (animation != null) {
                        if (timing != null && timing[0] > 0) {
                            int total = 0;
                            for (int value : timing) {
                                total += value;
                            }
                            animation.VK = (float) total / timing.length / 1000.0f;
                        } else {
                            animation.VK = 0.05f;
                        }
                        animation.kK0 = OI0.MW;
                    }
                }
                model.nu(1.0f, 1.0f, 1.0f, 0.0f);
            } else {
                this.Ic0[index] = data.P90(member.Dg0(), creature.Kr(), false, creature.I());
                this.Ic0[index].j9(4.0f);
                this.ym0.Ue0(this.Ic0[index]);
                model = com3__3.xD(this.Ic0[index]);
            }
            float speed = creature.aR() ? 0.0125f : 0.01f;
            model.im = speed;
            model.OF0(speed);
            model.zf0(0.25f, 0.0f, 1.0f);
            model.Ji(C8.Z, this.fC0.St0);
            model.Vg();
            this.rk[index] = model;
            gn_0 color = (gn_0)rh_2.I2.get(type);
            color.getClass();
            this.sA[index] = new Color((color.cv & 0xFF) / 255.0f, (color.x8 & 0xFF) / 255.0f,
                (color.sh & 0xFF) / 255.0f, (color.FY & 0xFF) / 255.0f);
            this.PF[index] = this.Tr0.UH0("special/type_" + type.j40);
            this.ym0.Ue0(this.PF[index]);
        }
    }

    @Override
    public final void gf0() {
      super.gf0();
      this.xb0 = 0;
      this.Cv0 = 0.0F;
      this.ku = 0;
      this.l50 = false;
   }

   @Override
   public final void update() {
      super.update();
      int var1 = this.xb0;
      if (this.xb0 == 1) {
         int var2 = this.ku;
         if (this.ku < this.rk.length) {
            xt_0 var4;
            if ((var4 = this.Ic0[var2]) != null) {
               var4.run();
            }

            this.rk[this.ku].GA(super.Qj);
            this.rk[this.ku].Vg();
            return;
         }
      }

      if (var1 == 2) {
         for (int var3 = 0; var3 < this.rk.length; var3++) {
            xt_0 var5;
            if ((var5 = this.Ic0[var3]) != null) {
               var5.run();
            }

            this.rk[var3].GA(super.Qj);
            this.rk[var3].Vg();
         }
      }
   }

   @Override
   public final boolean Lpt1() {
      return this.xb0 == 3;
   }

   public final void RQ() {
      this.xb0 = 3;
   }

   @Override
   public final void i5() {
      this.DM.W30();
      int state = this.xb0;
      if (state == 2) {
         this.DM.oH.set(Color.WHITE);
         this.DM.og = Color.WHITE.toFloatBits();
         if (this.zb.length == 1) {
            this.DM.vv0(this.zb[0], 0.0F, 0.0F, super.bA0, super.ED0);
            return;
         }
         int totalWidth = Math.max(1, this.S20);
         float textureHeight = Math.max(1.0F, (float)this.mu0);
         int cycleWidth = (int)Math.max(1.0F, (float)super.ED0 / textureHeight * totalWidth);
         this.wE0 = -((int)(hk0_1.Bk0 / 22000000L % cycleWidth));
         while (this.wE0 < super.bA0) {
            for (Texture texture : this.zb) {
               int width = (int)Math.max(1.0F, (float)super.ED0 / texture.getHeight() * texture.getWidth());
               this.DM.vv0(texture, this.wE0, 0.0F, width, super.ED0);
               this.wE0 += width;
            }
         }
      } else {
         Color color = this.c00;
         this.DM.oH.set(color);
         this.DM.og = color.toFloatBits();
         this.DM.vv0(this.Qz, 0.0F, 0.0F, super.bA0, super.ED0);
      }
      this.DM.end();
      this.vk();
   }

   public final void vk() {
      this.Cv0 = this.Cv0 + super.Qj;
      if (this.xb0 == 0) {
         if (!this.l50) {
            tw0_0.RE0.Eh((byte)2, (short)1016, true, true);
            this.c00.set(Color.BLACK);
            pw_1 var10000 = this.w5 = pw_1.xC();
            ao_1 var10001 = ao_1.DX(this.c00, 0, 1.0F).Om0(0.5F, 0.5F, 0.5F, 1.0F);
            var10001.Yn = Quad.INOUT;
            var10000.y80(var10001);
            this.w5.Ms(super.cn);
            this.l50 = true;
         }

         if (this.Cv0 > 1.0F) {
            this.xb0++;
            this.Cv0 = 0.0F;
            this.l50 = false;
            this.w5 = null;
         }
      }

      if (this.xb0 == 1) {
         int var1 = this.ku;
         VU[] var2 = this.kv;
         if (this.ku < this.kv.length) {
            if (!this.l50) {
               VU var17;
               VU var85 = var17 = var2[var1];
               com3__3 var10 = this.rk[var1];
               float var3 = 1.0F;
               if (var85.I8.aR()) {
                  var3 = LW.r1(0.6F, 0.5F, 1.0F);
                  if (var17.I8.I()) {
                     var10.op0(x4_0.DS, 1.0F);
                  } else {
                     var10.op0(x4_0.EH0, 0.8F);
                  }
               }

               CE var4 = var17.I8;
               short var98 = var17.I8.Yb0;
               byte var40 = var4.ZF0;
               float var5 = 0.0F;
               boolean var6 = var4.aR();
               di0_0.Hv0(var98, var40, var3, var5, var6);
               BT var30;
               BT var99 = var30 = this.TH;
               ii0_1 var41 = super.cn;
               this.TH.A5.gg0.OO();
               A40 var52 = var99.A5.gg0;
               S70 var62;
               var62 = new S70(64, 64, 0);
               if (!var17.I8.vn() && var17.Dg0() >= 0) {
                  Br0 var100 = var62.og;
                  LPT6_[] var118 = new LPT6_[1];
                  byte var7 = 0;
                  fn_0 var8 = fn_0.qz0();
                  byte var9 = var17.Dg0();
                  var118[var7] = var8.vo0[var9];
                  var100.r8(var118);
                  var62.og.EJ0 = 4.0F;
               }

               tk0_0 var10008 = var30.A5;
               int var72 = 1;
               var30.A5.NB = true;
               var10008.LJ0 = var72 != 0;
               var52.FU.Wa0();
               var52.X0();
               var52.EF(15.0F);
               j1_0 var10003 = var52.es(var17.na0());
               var10003.d80 = 2;
               float var73 = 32.0F;
               var10003.jQ = new vl0_0(var73);
               var10003.Rr0.Rg();
               var52.es(var17.k30()).Rr0.vx0(var62).Rr0.Rg();
               StringBuilder var63;
               var63 = new StringBuilder();
               StringBuilder var64 = ig_0.u9(59, var63, " ");
               String var74;
               if (var17.I8.vn()) {
                  var74 = "???";
               } else {
                  var74 = Byte.toString(var17.I8.wj);
               }

               var52.es(var64.append(var74).toString()).Rr0.Rg();
               StringBuilder var65;
               var65 = new StringBuilder();
               j1_0 var101 = var52.es(ig_0.u9(1807, var65, " ").append(var17.I8.Ql0()).toString());
               float var66 = 25.0F;
               var101.getClass();
               var101.Yg = new vl0_0(var66);
               var101.d80 = 2;
               var101.Rr0.Rg();
               String var67 = sm0_0.c0(1872);
               CE var75 = var17.I8;
               int var79 = var17.I8.vO;
               String var76;
               if (var17.I8.vO != -1) {
                  byte var82 = var75.dZ;
                  if (var75.dZ == 0) {
                     var79 = (var79 & 0xFF) - -139912;
                  } else {
                     int var83 = 140000;
                     var79 = var82 * 1000 + var83 + (var79 & 0xFF);
                  }

                  if (var75.aUX()) {
                     var79 = 1884;
                  } else if (!sm0_0.cU.l90(var79) || var17.I8.aJ0 == 0) {
                     var72 = 250000;
                     var79 = var17.I8.dZ + var72;
                  }

                  var76 = sm0_0.wa0(1877, sm0_0.c0(var79));
               } else {
                  var67 = sm0_0.c0(1874);
                  var76 = sm0_0.c0(1876);
               }

               String var81 = sm0_0.wa0(1875, var17.I8.aJ0 + "");
               byte var84 = var17.I8.aJ0;
               if (var17.I8.aJ0 == -1) {
                  var67 = sm0_0.c0(1873);
                  var81 = "";
               } else if (var84 < 1) {
                  var81 = "";
               }

               if (var17.I8.vn()) {
                  var67 = sm0_0.c0(1874);
                  var81 = "";
               }

               SimpleDateFormat var53;
               var53 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
               String var18 = sm0_0.wa0(1878, var53.format(var17.I8.t50 * 1000L));
               String[] var54;
               String[] var10006 = var54 = new String[5];
               var10006[0] = "";
               var10006[1] = var67;
               var10006[2] = var81;
               var10006[3] = var76;
               var10006[4] = var18;
               j1_0 var127 = var52.es(sm0_0.Bx(1870, var54));
               float var19 = 25.0F;
               var127.getClass();
               var127.Yg = new vl0_0(var19);
               var127.d80 = 2;
               var30.A5.lt0();
               var30.A5.E40(-var30.A5.Mx, 0);
               tk0_0 var20;
               tk0_0 var119 = var20 = var30.A5;
               gn_0 var55 = gn_0.TRANSPARENT;
               var119.z70 = new N1(new t5_0(var20), var55);
               pw_1 var120 = pw_1.xC();
               ao_1 var125 = ao_1.DX(var30.A5, 3, 1.0F).UD(0.0F, 0.0F);
               Quad var21 = Quad.INOUT;
               var125.Yn = Quad.INOUT;
               var120.y80(var125).Ms(var41);
               var30.A5.z70.bT(gn_0.WHITE, 1200);
               this.Tr0.zd();
               this.Tr0.fY(this.yC);
               this.yC.start();
               ParticleEffectExt var102 = this.PF[this.ku];
               this.Tr0.fY(this.PF[this.ku]);
               var102.start();
               var10.MI0().a = 0.0F;
               Color var31 = this.sA[this.ku];
               pw_1 var87 = pw_1.gb0();
               ao_1 var103 = ao_1.DX(var10, 9, 0.5F);
               float var42 = 1.0F;
               var103.h5[0] = var42;
               var103.Yn = var21;
               pw_1 var88 = var87.y80(var103);
               ao_1 var104 = ao_1.DX(var10, 4, 0.5F).kt(0.0F, 0.125F, 1.5F);
               var104.Yn = var21;
               pw_1 var89 = var88.y80(var104);
               ao_1 var105 = ao_1.DX(this.c00, 0, 0.5F);
               float[] var11;
               float[] var121 = var11 = new float[4];
               var11[0] = var31.r;
               var11[1] = var31.g;
               var11[2] = var31.b;
               var121[3] = var31.a;
               ao_1 var106 = var105.Om0(var121);
               var106.Yn = var21;
               var89.y80(var106).Ms(super.cn);
               this.l50 = true;
            } else if (this.Cv0 > 4.0F) {
               this.ku = var1 + 1;
               this.Cv0 = 0.0F;
               this.l50 = false;
               this.w5 = null;
            }
         } else if (this.w5 == null) {
            this.Tr0.zd();
            pw_1 var90 = pw_1.xC().Xf0();
            ao_1 var107 = ao_1.DX(this.rk[this.ku - 1], 9, 0.5F);
            float var12 = 0.0F;
            var107.h5[0] = var12;
            Quad var13 = Quad.INOUT;
            var107.Yn = Quad.INOUT;
            var90 = var90.y80(var107);
            var107 = ao_1.DX(this.rk[this.ku - 1], 4, 0.5F).kt(0.0F, 0.0F, 0.0F);
            var107.Yn = var13;
            var90 = var90.y80(var107);
            var107 = ao_1.DX(this.c00, 0, 0.5F);
            float[] var22;
            float[] var122 = var22 = new float[4];
            Color var32 = this.c00;
            var22[0] = var32.r;
            var22[1] = var32.g;
            var122[2] = this.c00.b;
            var122[3] = 0.0F;
            var107 = var107.Om0(var122);
            var107.Yn = var13;
            (this.w5 = var90.y80(var107).mz0().y80(ao_1.pc(this::ZT))).Ms(super.cn);
         }
      }

      if (this.xb0 == 2) {
         if (!this.l50) {
            this.Tr0.zd();
            this.Tr0.fY(this.PN);
            this.PN.start();
            this.TH.A5.xe0();
            BT var14 = this.TH;
            this.TH.getClass();
            E90 var23 = tw0_0.e60.jB0;
            if (tw0_0.e60.jB0 != null) {
               tk0_0 var93 = var14.nq0;
               tk0_0 var111 = var14.nq0;
               boolean var33 = true;
               var14.nq0.NB = true;
               var111.LJ0 = var33;
               A40 var34;
               A40 var94 = var34 = var93.gg0;
               var34.FU.mA = 1;
               var34.EF(15.0F);
               var34.es(sm0_0.Bw((byte)2, lpt6__2.Q80, 32, 4, sm0_0.zb0)).NA().Rr0.Rg();
               j1_0 var43 = var94.sw0(var23.oc0, "trainer-name");
               float var56;
               if (tw0_0.kz0()) {
                  var56 = 10.0F;
               } else {
                  var56 = 150.0F;
               }

               var43.Yg = new vl0_0(var56);
               var43.Rr0.Rg();
               j1_0 var10007 = var34.vx0(new le0_2(null, false));
               var10007.K6();
               var10007.Hb0 = 1;
               var10007.i8 = 1;
               var10007.Rr0.Rg();
               int var129 = tw0_0.rl.k0.oc0 / 3600;
               var34.es(sm0_0.wa0(1603, NumberFormat.getInstance().format(var129))).Rr0.Rg();
               tk0_0 var35 = var14.nq0;
               var14.F9(var14.fU(), var35);
               var14.xB0 = var23.Vv;
               Mm var112 = var14.rI = new Mm(var14, var23);
               var112.OD0 = ew0_0.a;
               var112.Ta = 2;
               var14.nq0.lt0();
            }

            this.c00.set(1.0F, 1.0F, 1.0F, 0.0F);
            (this.w5 = pw_1.xC()).TD0();
            int var15 = 0;

            while (true) {
               com3__3[] var24 = this.rk;
               if (var15 >= this.rk.length) {
                  this.w5.mz0();
                  this.w5.Xf0();
                  com3__3[] var16 = this.rk;
                  int var29 = this.rk.length;

                  for (int var39 = 0; var39 < var29; var39++) {
                     com3__3 var51 = var16[var39];
                     this.w5.TD0();
                     pw_1 var96 = this.w5;
                     ao_1 var116 = ao_1.DX(var51, 11, 0.3F);
                     float var61 = 0.0F;
                     var116.h5[0] = var61;
                     var116.Yn = Quad.INOUT;
                     var96.y80(var116);
                     this.w5.y80(ao_1.pc((index, tween) -> ys_2.l70(var51, index, tween)));
                     this.w5.mz0();
                  }

                  this.w5.mz0();
                  this.w5.Xf0();
                  pw_1 var97 = this.w5;
                  ao_1 var117 = ao_1.DX(this.c00, 0, 0.5F).Om0(1.0F, 1.0F, 1.0F, 1.0F);
                  var117.Yn = Quad.INOUT;
                  var97.y80(var117);
                  this.w5.mz0();
                  this.w5.Ms(super.cn);
                  this.l50 = true;
                  break;
               }

               com3__3 var123 = var24[var15];
               com3__3 var25;
               (var25 = var24[var15]).nu(1.0F, 1.0F, 1.0F, 1.0F);
               float var36 = 1.0F;
               float var44 = 1.0F;
               float var57 = 1.0F;
               float var68 = 1.0F;
               var123.CQ.v50.set(var36, var44, var57, var68);
               C8 var37 = mU;
               var44 = mU.x;
               var44 = (var57 = var15) * 1.0F + var44;
               if (var15 > 2) {
                  var68 = 0.3F;
               } else {
                  var68 = 0.0F;
               }

               var44 += var68;
               var68 = var37.y + 5.0F;
               float var78 = var37.z;
               var25.zf0(var44, var68, var78);
               na0_0 var48;
               if ((var48 = (na0_0)var25.K7.sg(na0_0.UG)) != null) {
                  var48.aD = 0.0F;
               }

               pw_1 var10004 = this.w5;
               ao_1 var128 = (ao_1)ao_1.Sk0.u9();
               var128.r70(null, -1, 0.0F);
               float var26 = 0.1F;
               var128.Sq0 += var26;
               var10004.y80(var128);
               pw_1 var27 = this.w5;
               ao_1 var49 = ao_1.DX(var25, 4, 0.1F);
               float var59 = var37.x;
               var57 = var57 * 0.8F + var59;
               if (var15 > 2) {
                  var68 = 0.3F;
               } else {
                  var68 = 0.0F;
               }

               float var28 = var57 + var68;
               var36 = var37.y;
               var44 = var37.z;
               ao_1 var115 = var49.kt(var28, var36, var44);
               var115.Yn = Quad.INOUT;
               var27.y80(var115);
               var15++;
            }
         }

         if (this.Cv0 > 10.0F) {
            this.xb0++;
            this.Cv0 = 0.0F;
            this.l50 = false;
            this.w5 = null;
         }
      }
   }

   public final void ZT(int var1, D2 var2) {
      this.xb0++;
      this.Cv0 = 0.0F;
      this.l50 = false;
      this.w5 = null;
   }
}




