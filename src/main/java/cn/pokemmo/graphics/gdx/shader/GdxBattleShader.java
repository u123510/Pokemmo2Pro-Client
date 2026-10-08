package cn.pokemmo.graphics.gdx.shader;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class GdxBattleShader extends f.Wm0 {
   public static String OR;
   public static String hr0;
   /** @deprecated */
   public static final int u8 = 1029;
   /** @deprecated */
   public static final int mg = 515;
   public static final long dJ = pr_1.av | ma_1.ZL;
   public static final wh_0 vB = new wh_0();
   public final int break$;
   public final int UK;
   public final int hk;
   public final int q4;
   public final int W20;
   public final int LD;
   public final int MG;
   public final int bh0;
   public final int qW;
   public final int q60;
   public final int Vk0;
   public final int cB;
   public final int R6;
   public final int cM;
   public final int Zp0;
   public final int dF;
   public final int m50;
   public final int FZ;
   public final int S4;
   public final int md;
   public final int L9;
   public final int Jg0;
   public final int HK;
   public final int uc;
   public int mH0;
   public int wD;
   public int L10;
   public int D1;
   public int su;
   public int xb0;
   public int PJ0;
   public int hh0;
   public int aB0;
   public int bq;
   public int GI;
   public int Bb;
   public int zy;
   public int HH;
   public int P70;
   public int G50;
   public int Sl;
   public final boolean XZ;
   public final boolean gw0;
   public final qv_0[] Ma0;
   public final dm0_0[] Fc0;
   public final Ew0[] pI;
   public W00 CF;
   public final long SL0;
   public final long tL;
   public final mn0_0 rF;
   public float com9;
   public boolean mz0;

   public static String getDefaultVertexShader() {
      if (OR == null) {
         String var0 = "data/shaders/battle.vertex.glsl";
         lg_0.I70.getClass();
         OR = new VE(var0, zv_1.tt0).gd0(null);
      }

      return OR;
   }

   public static String getDefaultFragmentShader() {
      if (hr0 == null) {
         String var0 = "data/shaders/battle.fragment.glsl";
         lg_0.I70.getClass();
         hr0 = new VE(var0, zv_1.tt0).gd0(null);
      }

      return hr0;
   }

   public GdxBattleShader(W00 var1, mn0_0 var2, String var3) {
      this(var1, var2, var3, getDefaultVertexShader(), getDefaultFragmentShader());
      var2.getClass();
   }

   public GdxBattleShader(W00 var1, mn0_0 var2, String var3, String var4, String var5) {
      this(var1, var2, new lt_1(QA0.W0(var3, var4), QA0.W0(var3, var5)));
   }

   public GdxBattleShader(W00 var1, mn0_0 var2, lt_1 var3) {
      com9__4 var4;
      var4 = new com9__4("u_dirLights[0].color");
      this.q60 = this.register(var4);
      var4 = new com9__4("u_dirLights[0].direction");
      this.Vk0 = this.register(var4);
      var4 = new com9__4("u_dirLights[1].color");
      this.cB = this.register(var4);
      var4 = new com9__4("u_pointLights[0].color");
      this.R6 = this.register(var4);
      var4 = new com9__4("u_pointLights[0].position");
      this.cM = this.register(var4);
      var4 = new com9__4("u_pointLights[0].intensity");
      this.Zp0 = this.register(var4);
      var4 = new com9__4("u_pointLights[1].color");
      this.dF = this.register(var4);
      var4 = new com9__4("u_spotLights[0].color");
      this.m50 = this.register(var4);
      var4 = new com9__4("u_spotLights[0].position");
      this.FZ = this.register(var4);
      var4 = new com9__4("u_spotLights[0].intensity");
      this.S4 = this.register(var4);
      var4 = new com9__4("u_spotLights[0].direction");
      this.md = this.register(var4);
      var4 = new com9__4("u_spotLights[0].cutoffAngle");
      this.L9 = this.register(var4);
      var4 = new com9__4("u_spotLights[0].exponent");
      this.Jg0 = this.register(var4);
      var4 = new com9__4("u_spotLights[1].color");
      this.HK = this.register(var4);
      var4 = new com9__4("u_fogColor");
      this.uc = this.register(var4);
      var4 = new com9__4("u_shadowMapProjViewTrans");
      this.register(var4);
      var4 = new com9__4("u_shadowTexture");
      this.register(var4);
      var4 = new com9__4("u_shadowPCFOffset");
      this.register(var4);
      new id_2();
      new i00_0();
      new C8();
      wh_0 var61 = c8(var1);
      this.rF = var2;
      super.program = var3;
      boolean var40;
      if (var1.AA0 != null) {
         var40 = true;
      } else {
         var40 = false;
      }

      this.XZ = var40;
      long var5 = lpt7__4.qo0;
      boolean var70;
      if (var61.tM(lpt7__4.qo0) || var40 && var61.tM(var5)) {
         var70 = true;
      } else {
         var70 = false;
      }

      this.gw0 = var70;
      if (var40) {
         var1.AA0.getClass();
      }

      this.CF = var1;
      long var62 = var61.N30() | dJ;
      this.SL0 = var62;
      long var63 = var1.VE0.m8.zh0().Js0();
      this.tL = var63;
      this.Ma0 = new qv_0[var40 ? 2 : 0];
      int var41 = 0;

      while (true) {
         qv_0[] var64 = this.Ma0;
         if (var41 >= this.Ma0.length) {
            this.Fc0 = new dm0_0[this.XZ ? 5 : 0];
            int var42 = 0;

            while (true) {
               dm0_0[] var66 = this.Fc0;
               if (var42 >= this.Fc0.length) {
                  if (this.XZ) {
                     var2.getClass();
                  }

                  this.pI = new Ew0[0];
                  int var43 = 0;

                  while (true) {
                     Ew0[] var68 = this.pI;
                     if (var43 >= this.pI.length) {
                        var2.getClass();
                        ln_0 var7 = jb_0.Bx0;
                        this.register(cp0_0.kK0, var7);
                        Lx0 var8 = jb_0.qB0;
                        this.register(cp0_0.I1, var8);
                        li_1 var9 = jb_0.hD0;
                        this.register(cp0_0.Rt, var9);
                        SF var10 = jb_0.H40;
                        this.register(cp0_0.iN, var10);
                        dv_1 var11 = jb_0.wI;
                        this.register(cp0_0.yI, var11);
                        f9_0 var12 = jb_0.uj0;
                        this.register(cp0_0.CL, var12);
                        al_2 var13 = jb_0.wh0;
                        this.register(cp0_0.Sx, var13);
                        com9__4 var14;
                        var14 = new com9__4("u_time");
                        this.break$ = this.register(var14);
                        U40 var15 = jb_0.kq;
                        this.register(cp0_0.PZ, var15);
                        ho_0 var16 = jb_0.C70;
                        this.register(cp0_0.Q8, var16);
                        rr_0 var17 = jb_0.JM;
                        this.register(cp0_0.cu0, var17);
                        A0 var18 = jb_0.m9;
                        this.register(cp0_0.Hb, var18);
                        if (var1.lpt7 != null) {
                           com9__4 var74 = cp0_0.kK;
                           he_0 var19;
                           var19 = new he_0();
                           this.register(var74, var19);
                        }

                        ic0_0 var20 = jb_0.fy0;
                        this.register(cp0_0.sg, var20);
                        this.UK = this.register(cp0_0.ad0);
                        o70 var21 = jb_0.eq0;
                        this.register(cp0_0.aO, var21);
                        Fs0 var22 = jb_0.else$;
                        this.register(cp0_0.sl, var22);
                        e2_0 var23 = jb_0.UZ;
                        this.register(cp0_0.Gp0, var23);
                        lt_0 var24 = jb_0.yk0;
                        this.register(cp0_0.fA, var24);
                        PN var25 = jb_0.Zr;
                        this.register(cp0_0.coM1, var25);
                        um_0 var26 = jb_0.N70;
                        this.register(cp0_0.h1, var26);
                        Ap0 var27 = jb_0.uF;
                        this.register(cp0_0.HI0, var27);
                        jh_1 var28 = jb_0.sI;
                        this.register(cp0_0.n50, var28);
                        te0_1 var29 = jb_0.xv;
                        this.register(cp0_0.DQ, var29);
                        xf_1 var30 = jb_0.m00;
                        this.register(cp0_0.jd0, var30);
                        con__1 var31 = jb_0.qi0;
                        this.register(cp0_0.On0, var31);
                        dj_0 var32 = jb_0.mJ;
                        this.register(cp0_0.xm, var32);
                        UJ var33 = jb_0.tH;
                        this.register(cp0_0.fJ0, var33);
                        LPT7_ var34 = jb_0.gh0;
                        this.register(cp0_0.DA0, var34);
                        yd_2 var35 = jb_0.nJ0;
                        this.register(cp0_0.rk0, var35);
                        pd_2 var36 = jb_0.Jf;
                        this.register(cp0_0.Up0, var36);
                        this.hk = this.register(cp0_0.qk);
                        Zz0 var37 = jb_0.L50;
                        this.register(cp0_0.Be0, var37);
                        this.MG = this.register(cp0_0.xN);
                        this.q4 = this.register(cp0_0.am);
                        this.W20 = this.register(cp0_0.I20);
                        this.LD = this.register(cp0_0.k7);
                        this.qW = this.register(cp0_0.oj0);
                        this.bh0 = this.register(cp0_0.mL);
                        if (this.XZ) {
                           com9__4 var75 = cp0_0.Vg;
                           ha_2 var38;
                           var38 = new ha_2();
                           this.register(var75, var38);
                        }

                        if (this.gw0) {
                           x1_0 var39 = jb_0.AM;
                           this.register(cp0_0.Rs0, var39);
                        }

                        return;
                     }

                     Ew0 var69;
                     var69 = new Ew0();
                     var68[var43] = var69;
                     var43++;
                  }
               }

               dm0_0 var67;
               var67 = new dm0_0();
               var66[var42] = var67;
               var42++;
            }
         }

         qv_0 var65;
         var65 = new qv_0();
         var64[var41] = var65;
         var41++;
      }
   }

   public static final boolean jg(long var0, long var2) {
      return (var0 & var2) == var2;
   }

   public static final wh_0 c8(W00 var0) {
      wh_0 var1;
      wh_0 var10001 = var1 = vB;
      vB.ni0 = 0L;
      var10001.VH.clear();
      U5 var2 = var0.AA0;
      if (var0.AA0 != null) {
         var1.zc(var2);
      }

      BM var3;
      if ((var3 = var0.ly) != null) {
         var1.zc(var3);
      }

      return var1;
   }

   public static String AuX(W00 var0, mn0_0 var1) {
      wh_0 var2;
      wh_0 var10001 = var2 = c8(var0);
      String var3 = "";
      long var4 = var10001.ni0;
      long var6;
      if (jg(var6 = var0.VE0.m8.COM6.JP().Js0(), 1L)) {
         var3 = "#define positionFlag\n";
      }

      if ((var6 & 6L) != 0L) {
         var3 = QA0.W0(var3, "#define colorFlag\n");
      }

      if (jg(var6, 256L)) {
         var3 = QA0.W0(var3, "#define binormalFlag\n");
      }

      if (jg(var6, 128L)) {
         var3 = QA0.W0(var3, "#define tangentFlag\n");
      }

      if (jg(var6, 8L)) {
         var3 = QA0.W0(var3, "#define normalFlag\n");
      }

      if ((jg(var6, 8L) || jg(var6, 384L)) && var0.AA0 != null) {
         var3 = QA0.W0(QA0.W0(var3, "#define lightingFlag\n"), "#define ambientCubemapFlag\n");
         StringBuilder var11 = new StringBuilder().append(var3).append("#define numDirectionalLights 2\n");
         var1.getClass();
         var3 = QA0.W0(QA0.W0(var11.toString(), "#define numPointLights 5\n"), "#define numSpotLights 0\n");
         if (var2.tM(PRN_.YI0)) {
            var3 = QA0.W0(var3, "#define fogFlag\n");
         }

         var0.AA0.getClass();
         if (var2.tM(lpt7__4.qo0)) {
            var3 = QA0.W0(var3, "#define environmentCubemapFlag\n");
         }
      }

      int var9 = var0.VE0.m8.COM6.JP().Os.length;

      for (int var13 = 0; var13 < var9; var13++) {
         kz_0 var7;
         int var8;
         if ((var8 = (var7 = var0.VE0.m8.COM6.JP().Os[var13]).tM) == 64) {
            var3 = fp0_0.uD(AN.nK0(var3, "#define boneWeight"), var7.sf, "Flag\n");
         } else if (var8 == 16) {
            var3 = fp0_0.uD(AN.nK0(var3, "#define texCoord"), var7.sf, "Flag\n");
         }
      }

      var6 = sh_0.vF0;
      if ((var4 & sh_0.vF0) == var6) {
         var3 = QA0.W0(var3, "#define blendedFlag\n");
      }

      var6 = mz_2.g7;
      if ((var4 & mz_2.g7) == var6) {
         var3 = QA0.W0(QA0.W0(var3, "#define diffuseTextureFlag\n"), "#define diffuseTextureCoord texCoord0\n");
      }

      var6 = mz_2.GB0;
      if ((var4 & mz_2.GB0) == var6) {
         var3 = QA0.W0(QA0.W0(var3, "#define specularTextureFlag\n"), "#define specularTextureCoord texCoord0\n");
      }

      var6 = mz_2.yS;
      if ((var4 & mz_2.yS) == var6) {
         var3 = QA0.W0(QA0.W0(var3, "#define normalTextureFlag\n"), "#define normalTextureCoord texCoord0\n");
      }

      var6 = mz_2.protected$;
      if ((var4 & mz_2.protected$) == var6) {
         var3 = QA0.W0(QA0.W0(var3, "#define emissiveTextureFlag\n"), "#define emissiveTextureCoord texCoord0\n");
      }

      var6 = mz_2.Dh0;
      if ((var4 & mz_2.Dh0) == var6) {
         var3 = QA0.W0(QA0.W0(var3, "#define reflectionTextureFlag\n"), "#define reflectionTextureCoord texCoord0\n");
      }

      var6 = mz_2.cW;
      if ((var4 & mz_2.cW) == var6) {
         var3 = QA0.W0(QA0.W0(var3, "#define ambientTextureFlag\n"), "#define ambientTextureCoord texCoord0\n");
      }

      var6 = PRN_.Ly;
      if ((var4 & PRN_.Ly) == var6) {
         var3 = QA0.W0(var3, "#define diffuseColorFlag\n");
      }

      var6 = Rv0.XT;
      if ((var4 & Rv0.XT) == var6) {
         var3 = QA0.W0(var3, "#define overlayColorFlag\n");
      }

      var6 = na0_0.UG;
      if ((var4 & na0_0.UG) == var6) {
         var3 = QA0.W0(var3, "#define glowFlag\n");
      }

      if (dw_2.YO == 1) {
         var3 = QA0.W0(var3, "#define glowHQ\n");
      }

      var6 = PRN_.zz;
      if ((var4 & PRN_.zz) == var6) {
         var3 = QA0.W0(var3, "#define specularColorFlag\n");
      }

      var6 = PRN_.sI;
      if ((var4 & PRN_.sI) == var6) {
         var3 = QA0.W0(var3, "#define emissiveColorFlag\n");
      }

      var6 = PRN_.Ar;
      if ((var4 & PRN_.Ar) == var6) {
         var3 = QA0.W0(var3, "#define reflectionColorFlag\n");
      }

      var6 = mb0_2.an0;
      if ((var4 & mb0_2.an0) == var6) {
         var3 = QA0.W0(var3, "#define shininessFlag\n");
      }

      var4 = mb0_2.k6;
      if ((var4 & mb0_2.k6) == var4) {
         var3 = QA0.W0(var3, "#define alphaTestFlag\n");
      }

      if (var0.lpt7 != null) {
         var1.getClass();
         var3 = var3 + "#define numBones 12\n";
      }

      return var3;
   }

   @Override
   public final void init() {
      lt_1 var10000 = super.program;
      super.program = null;
      W00 var1 = this.CF;
      this.init(var10000, var1);
      this.CF = null;
      this.mH0 = this.loc(this.q60);
      this.wD = this.loc(this.q60) - this.mH0;
      this.L10 = this.loc(this.Vk0) - this.mH0;
      if ((this.D1 = this.loc(this.cB) - this.mH0) < 0) {
         this.D1 = 0;
      }

      this.su = this.loc(this.R6);
      this.xb0 = this.loc(this.R6) - this.su;
      this.PJ0 = this.loc(this.cM) - this.su;
      int var2;
      if (this.has(this.Zp0)) {
         var2 = this.loc(this.Zp0) - this.su;
      } else {
         var2 = -1;
      }

      this.hh0 = var2;
      if ((this.aB0 = this.loc(this.dF) - this.su) < 0) {
         this.aB0 = 0;
      }

      this.bq = this.loc(this.m50);
      this.GI = this.loc(this.m50) - this.bq;
      this.Bb = this.loc(this.FZ) - this.bq;
      this.zy = this.loc(this.md) - this.bq;
      int var3;
      if (this.has(this.S4)) {
         var3 = this.loc(this.S4) - this.bq;
      } else {
         var3 = -1;
      }

      this.HH = var3;
      this.P70 = this.loc(this.L9) - this.bq;
      this.G50 = this.loc(this.Jg0) - this.bq;
      if ((this.Sl = this.loc(this.HK) - this.bq) < 0) {
         this.Sl = 0;
      }
   }

   @Override
   public final boolean canRender(W00 var1) {
      long var2 = 0L;
      U5 var4 = var1.AA0;
      if (var1.AA0 != null) {
         var2 = var4.ni0;
      }

      BM var5 = var1.ly;
      if (var1.ly != null) {
         var2 |= var5.ni0;
      }

      return this.SL0 == (var2 | dJ) && this.tL == var1.VE0.m8.COM6.JP().Js0() && var1.AA0 != null == this.XZ;
   }

   @Override
   public final boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof CK && (CK)var1 == this) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   @Override
   public final void begin(Tv0 var1, qi_1 var2) {
      super.begin(var1, var2);
      qv_0[] var15 = this.Ma0;
      int var19 = this.Ma0.length;

      for (int var3 = 0; var3 < var19; var3++) {
         qv_0 var10000 = var15[var3];
         qv_0 var10001 = var15[var3];
         float var4 = 0.0F;
         float var5 = -1.0F;
         float var6 = 0.0F;
         var10001.l0.set(0.0F, 0.0F, 0.0F, 1.0F);
         C8 var7;
         C8 var34 = var7 = var10000.jf;
         var7.x = var4;
         var7.y = var5;
         var34.z = var6;
         var34.KM();
      }

      dm0_0[] var16 = this.Fc0;
      int var20 = this.Fc0.length;

      for (int var22 = 0; var22 < var20; var22++) {
         dm0_0 var35 = var16[var22];
         dm0_0 var38 = var16[var22];
         dm0_0 var10002 = var16[var22];
         float var24 = 0.0F;
         float var27 = 0.0F;
         float var29 = 0.0F;
         float var31 = 0.0F;
         var10002.l0.set(0.0F, 0.0F, 0.0F, 1.0F);
         C8 var8 = var38.EJ;
         var8.x = var24;
         var8.y = var27;
         var8.z = var29;
         var35.ET = var31;
      }

      Ew0[] var17 = this.pI;
      int var21 = this.pI.length;

      for (int var23 = 0; var23 < var21; var23++) {
         Ew0 var36 = var17[var23];
         Ew0 var39 = var17[var23];
         float var25 = 0.0F;
         float var28 = 0.0F;
         float var30 = 0.0F;
         float var32 = 0.0F;
         float var33 = -1.0F;
         float var9 = 0.0F;
         float var10 = 0.0F;
         float var11 = 1.0F;
         float var12 = 0.0F;
         var39.l0.set(0.0F, 0.0F, 0.0F, 1.0F);
         C8 var13;
         C8 var10004 = var13 = var36.Tv;
         var13.x = var25;
         var13.y = var28;
         var10004.z = var30;
         C8 var26 = var39.LPt5;
         var26.x = var32;
         var26.y = var33;
         var26.z = var9;
         var26.KM();
         var36.gp = var10;
         var39.Bd = var11;
         var36.Ja0 = var12;
      }

      this.mz0 = false;
      if (this.has(this.break$)) {
         int var14 = this.break$;
         float var18;
         this.com9 = var18 = this.com9 + lg_0.S4.uL;
         this.set(var14, var18);
      }
   }

   @Override
   public final void render(W00 var1, wh_0 var2) {
      if (!var2.tM(sh_0.vF0)) {
         super.context.mx0(770, 771, false);
      }

      this.rF.getClass();
      int var3 = u8;
      this.rF.getClass();
      int var4 = mg;
      float var5 = 0.0F;
      float var6 = 1.0F;
      boolean var7Depth = true;
      I2 var8 = var2.VH.ZD();

      while (var8.hasNext()) {
         hf_1 var9;
         long var10;
         if (((var10 = (var9 = (hf_1)var8.next()).yO) & sh_0.vF0) == var10) {
            qi_1 var82 = super.context;
            sh_0 var120 = (sh_0)var9;
            int var83 = ((sh_0)var9).W00;
            var82.mx0(var83, ((sh_0)var9).Rs, true);
            int var84 = this.UK;
            float var101 = var120.yt;
            this.set(var84, var101);
         } else {
            long var12 = pr_1.av;
            if ((var10 & pr_1.av) == var12) {
               var3 = ((pr_1)var9).ps;
            } else {
               var12 = mb0_2.k6;
               if ((var10 & mb0_2.k6) == var12) {
                  int var85 = this.hk;
                  float var102 = ((mb0_2)var9).LL0;
                  this.set(var85, var102);
               } else if (na0_0.CY(var10)) {
                  na0_0 var86 = (na0_0)var9;
                  Texture var103;
                  if ((var103 = (Texture)((mz_2)var2.sg(mz_2.g7)).I3.uj) != null) {
                     int var87 = this.qW;
                     float var104 = var103.getWidth();
                     float var11 = var103.getHeight();
                     this.set(var87, var104, var11);
                     int var88 = this.bh0;
                     float var105 = 1.0F / (var103.getWidth() - 1);
                     var11 = 1.0F / (var103.getHeight() - 1);
                     this.set(var88, var105, var11);
                     int var89 = this.MG;
                     float var106 = var86.CD0.r;
                     var11 = var86.CD0.g;
                     float var119 = var86.CD0.b;
                     this.set(var89, var106, var11, var119);
                     int var90 = this.W20;
                     float var107 = var86.hL;
                     this.set(var90, var107);
                     int var91 = this.LD;
                     float var108 = var86.aD;
                     this.set(var91, var108);
                     int var92 = this.q4;
                     float var109 = var86.nF0;
                     this.set(var92, var109);
                  }
               } else {
                  var12 = ma_1.ZL;
                  if ((var10 & ma_1.ZL) == var12) {
                     ma_1 var124 = (ma_1)var9;
                     ma_1 var148 = (ma_1)var9;
                     var4 = ((ma_1)var9).BA0;
                     var5 = var124.sC0;
                     var6 = var148.Sg;
                     var7Depth = var124.WZ;
                  } else {
                     this.rF.getClass();
                  }
               }
            }
         }
      }

      super.context.fh0(var3);
      super.context.vk0(var4, var5, var6);
      qi_1 var14 = super.context;
      if (super.context.Wz != var7Depth) {
         sY var125 = lg_0.OH0;
         var14.Wz = var7Depth;
         var125.glDepthMask(var7Depth);
      }

      if (this.XZ) {
         CP var15;
         es_1 var16;
         if ((var15 = (CP)var2.sg(CP.M0)) == null) {
            var16 = null;
         } else {
            var16 = var15.Ds0;
         }

         fi_2 var21;
         es_1 var22;
         if ((var21 = (fi_2)var2.sg(fi_2.Tl0)) == null) {
            var22 = null;
         } else {
            var22 = var21.jA;
         }

         Lm0 var28;
         es_1 var29;
         if ((var28 = (Lm0)var2.sg(Lm0.uv0)) == null) {
            var29 = null;
         } else {
            var29 = var28.Ai0;
         }

         if (this.mH0 >= 0) {
            int var30 = 0;

            while (true) {
               qv_0[] var45 = this.Ma0;
               if (var30 >= this.Ma0.length) {
                  break;
               }

               label230: {
                  if (var16 != null && var30 < var16.KB) {
                     if (this.mz0 && var45[var30].er0((qv_0)var16.get(var30))) {
                        break label230;
                     }

                     qv_0 var46 = this.Ma0[var30];
                     qv_0 var67;
                     qv_0 var126 = var67 = (qv_0)var16.get(var30);
                     var46.getClass();
                     Color var93;
                     Color var127 = var93 = var126.l0;
                     C8 var68 = var67.jf;
                     if (var127 != null) {
                        var46.l0.set(var93);
                     }

                     if (var68 != null) {
                        C8 var128 = var46.jf;
                        C8 var149 = var46.jf;
                        C8 var164 = var46.jf;
                        C8 var47;
                        C8 var172 = var47 = var46.jf;
                        var47.getClass();
                        float var48 = var68.x;
                        float var69 = var68.y;
                        float var94 = var68.z;
                        var172.x = var48;
                        var164.y = var69;
                        var149.z = var94;
                        var128.KM();
                     }
                  } else {
                     if (this.mz0) {
                        Color var66 = var45[var30].l0;
                        if (var45[var30].l0.r == 0.0F && var66.g == 0.0F && var66.b == 0.0F) {
                           break label230;
                        }
                     }

                     var45[var30].l0.set(0.0F, 0.0F, 0.0F, 1.0F);
                  }

                  int var7 = this.mH0;
                  int var129 = var30 * this.D1 + var7;
                  lt_1 var50 = super.program;
                  int var150 = var129 + this.wD;
                  float var70 = this.Ma0[var30].l0.r;
                  float var95 = this.Ma0[var30].l0.g;
                  float var111 = this.Ma0[var30].l0.b;
                  sY var151 = lg_0.Sf0;
                  var50.getClass();
                  var151.glUniform3f(var150, var70, var95, var111);
                  lt_1 var51 = super.program;
                  var129 += this.L10;
                  float var71 = this.Ma0[var30].jf.x;
                  var95 = this.Ma0[var30].jf.y;
                  var111 = this.Ma0[var30].jf.z;
                  sY var131 = lg_0.Sf0;
                  var51.getClass();
                  var131.glUniform3f(var129, var71, var95, var111);
                  if (this.D1 <= 0) {
                     break;
                  }
               }

               var30++;
            }
         }

         if (this.su >= 0) {
            var3 = 0;

            while (true) {
               dm0_0[] var31 = this.Fc0;
               if (var3 >= this.Fc0.length) {
                  break;
               }

               label231: {
                  if (var22 != null && var3 < var22.KB) {
                     if (this.mz0 && var31[var3].eK((dm0_0)var22.get(var3))) {
                        break label231;
                     }

                     dm0_0 var32 = this.Fc0[var3];
                     dm0_0 var52;
                     dm0_0 var132 = var52 = (dm0_0)var22.get(var3);
                     var32.getClass();
                     Color var72;
                     Color var133 = var72 = var132.l0;
                     C8 var53 = var52.EJ;
                     float var97 = var52.ET;
                     if (var133 != null) {
                        var32.l0.set(var72);
                     }

                     if (var53 != null) {
                        C8 var134 = var32.EJ;
                        C8 var154 = var32.EJ;
                        C8 var73;
                        C8 var166 = var73 = var32.EJ;
                        var73.getClass();
                        float var54 = var53.x;
                        float var74 = var53.y;
                        float var113 = var53.z;
                        var166.x = var54;
                        var154.y = var74;
                        var134.z = var113;
                     }

                     var32.ET = var97;
                  } else {
                     if (this.mz0 && var31[var3].ET == 0.0F) {
                        break label231;
                     }

                     var31[var3].ET = 0.0F;
                  }

                  int var33 = this.su;
                  int var34;
                  int var135 = var34 = var3 * this.aB0 + var33;
                  lt_1 var55 = super.program;
                  int var155 = var135 + this.xb0;
                  dm0_0 var75;
                  Color var167 = (var75 = this.Fc0[var3]).l0;
                  float var76;
                  float var98 = var167.r * (var76 = var75.ET);
                  float var114 = var167.g * var76;
                  float var77 = var167.b * var76;
                  sY var156 = lg_0.Sf0;
                  var55.getClass();
                  var156.glUniform3f(var155, var98, var114, var77);
                  lt_1 var56 = super.program;
                  var135 += this.PJ0;
                  float var78 = this.Fc0[var3].EJ.x;
                  var98 = this.Fc0[var3].EJ.y;
                  var114 = this.Fc0[var3].EJ.z;
                  sY var137 = lg_0.Sf0;
                  var56.getClass();
                  var137.glUniform3f(var135, var78, var98, var114);
                  int var7 = this.hh0;
                  if (this.hh0 >= 0) {
                     lt_1 var35 = super.program;
                     var135 = var34 + var7;
                     float var58 = this.Fc0[var3].ET;
                     sY var140 = lg_0.Sf0;
                     var35.getClass();
                     var140.glUniform1f(var135, var58);
                  }

                  if (this.aB0 <= 0) {
                     break;
                  }
               }

               var3++;
            }
         }

         if (this.bq >= 0) {
            var3 = 0;

            while (true) {
               Ew0[] var23 = this.pI;
               if (var3 >= this.pI.length) {
                  break;
               }

               label232: {
                  if (var29 != null && var3 < var29.KB) {
                     if (this.mz0 && var23[var3].vI((Ew0)var29.get(var3))) {
                        break label232;
                     }

                     this.pI[var3].h30((Ew0)var29.get(var3));
                  } else {
                     if (this.mz0 && var23[var3].gp == 0.0F) {
                        break label232;
                     }

                     var23[var3].gp = 0.0F;
                  }

                  var4 = this.bq;
                  int var25;
                  int var141 = var25 = var3 * this.Sl + var4;
                  lt_1 var36 = super.program;
                  int var178 = var141 + this.GI;
                  Ew0 var59;
                  Color var182 = (var59 = this.pI[var3]).l0;
                  float var60;
                  float var79 = var182.r * (var60 = var59.gp);
                  float var100 = var182.g * var60;
                  float var61 = var182.b * var60;
                  sY var179 = lg_0.Sf0;
                  var36.getClass();
                  var179.glUniform3f(var178, var79, var100, var61);
                  lt_1 var37 = super.program;
                  int var174 = var141 + this.Bb;
                  C8 var180 = this.pI[var3].Tv;
                  C8 var184 = this.pI[var3].Tv;
                  C8 var186 = this.pI[var3].Tv;
                  var37.getClass();
                  var6 = var186.x;
                  float var62 = var184.y;
                  float var80 = var180.z;
                  lg_0.Sf0.glUniform3f(var174, var6, var62, var80);
                  lt_1 var39 = super.program;
                  int var169 = var141 + this.zy;
                  C8 var175 = this.pI[var3].LPt5;
                  C8 var181 = this.pI[var3].LPt5;
                  C8 var185 = this.pI[var3].LPt5;
                  var39.getClass();
                  var6 = var185.x;
                  float var63 = var181.y;
                  float var81 = var175.z;
                  lg_0.Sf0.glUniform3f(var169, var6, var63, var81);
                  lt_1 var41 = super.program;
                  int var159 = var141 + this.P70;
                  float var64 = this.pI[var3].Bd;
                  sY var160 = lg_0.Sf0;
                  var41.getClass();
                  var160.glUniform1f(var159, var64);
                  lt_1 var42 = super.program;
                  var141 += this.G50;
                  float var65 = this.pI[var3].Ja0;
                  sY var143 = lg_0.Sf0;
                  var42.getClass();
                  var143.glUniform1f(var141, var65);
                  int var43 = this.HH;
                  if (this.HH >= 0) {
                     lt_1 var26 = super.program;
                     var141 = var25 + var43;
                     var6 = this.pI[var3].gp;
                     sY var146 = lg_0.Sf0;
                     var26.getClass();
                     var146.glUniform1f(var141, var6);
                  }

                  if (this.Sl <= 0) {
                     break;
                  }
               }

               var3++;
            }
         }

         long var19 = PRN_.YI0;
         if (var2.tM(PRN_.YI0)) {
            var3 = this.uc;
            Color var27 = ((PRN_)var2.sg(var19)).v50;
            this.set(var3, var27);
         }

         this.mz0 = true;
      }

      super.render(var1, var2);
   }

   @Override
   public final void end() {
      super.end();
   }

   @Override
   public final void dispose() {
      super.program.dispose();
      super.dispose();
   }
}
