package cn.pokemmo.ui.twl.core;

import f.*;

import f.org.json.*;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.BufferUtils;
import java.io.IOException;
import java.net.URL;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.channels.SelectionKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.lwjgl.glfw.GLFW;

/**
 * TWL 客户端 GUI 协调器 (GUI Coordinator)
 */
public abstract class TwlGui extends ci_2 {
   public static final dl_1 gy0 = Cq0.E1(TwlGui.class);
   public static boolean qD = false;
   public static final long[] Io = new long[100];
   public static int GU = 0;
   public static boolean Ey0 = true; //调试UI
   public static HashMap TJ;
   public boolean Rg0 = true;
   public boolean I30 = false;
   public ui_1 IA;
   public hl0_1 AN;
   public PC0 zv;
   public PC0 oL;
   public B5 Rl;
   public ii0_1 Ov;
   public ii0_1 lY;
   public BJ0 U1;
   public ff_0 Yx0;
   public eh_2 K10;
   public ui_1 j20;
   public PC0 Y9;
   public jy_1 aj;
   public float Ew = dw_2.Tf;
   public qq_0 wx0;
   public up_2 mG0;
   public zk0_1 wO;
   public Yo0 TG;
   public tt0_0 wo;
   public R40 UY;
   public qq_0 wf;
   public ui_1 Ik0;
   public bj0_0 FC0;
   public PC0 Ag;
   public float Z1;
   public IC0 BK;
   public vo_2 Sc;
   public Oz0 he0;
   public XD no0;
   public CX v5;
   public Sr VW;
   public jn_2 hO;
   public wf_0 uc;
   public vj_0 qL0;
   public G40 KJ0;
   public final float L7;
   public na_0 nB0;
   public na_0 X3;
   public ui_1 B;
   public PC0 Uv0;
   public wa_1 wl0;
   public bl0_2 u10;
   public Qy0 d6;
   public R40 UA;
   public final hy0_0 sy;
   public long K7;
   public final y60_0 m3;
   public final y60_0 i20;
   public boolean k2;
   public float tF;
   public final Bp0 ds0;
   public final Bp0 EC0;
   public final Bp0 pd0;
   public final Color LpT8;
   public final d3 AD0;
   public d3 Gx0;
   public final in_2 Sq0;
   public boolean vm0;
   public boolean fM0;
   public long Ts;
   public final fa_0 ra;
   public boolean vb0;
   public boolean Kj0;
   public boolean Sf0;
   public boolean VE0;

   public TwlGui() {
      new in_2(500);
      this.BK = null;
      this.Sc = null;
      this.he0 = null;
      this.no0 = null;
      this.v5 = null;
      this.VW = null;
      this.hO = null;
      this.uc = null;
      this.L7 = 1.0F;
      this.u10 = null;
      this.UA = null;
      hy0_0 var1;
      var1 = new hy0_0((ga0_0)this);
      this.sy = var1;
      this.K7 = 0L;
      y60_0 var2;
      var2 = new y60_0();
      this.m3 = var2;
      y60_0 var3;
      var3 = new y60_0();
      this.i20 = var3;
      this.k2 = false;
      this.tF = 0.0F;
      Bp0 var4;
      var4 = new Bp0();
      this.ds0 = var4;
      Bp0 var5;
      var5 = new Bp0();
      this.EC0 = var5;
      Bp0 var6;
      var6 = new Bp0();
      this.pd0 = var6;
      Color var7;
      var7 = new Color();
      this.LpT8 = var7;
      this.AD0 = null;
      this.Gx0 = null;
      in_2 var8;
      var8 = new in_2(250);
      this.Sq0 = var8;
      this.vm0 = false;
      this.fM0 = false;
      this.Ts = 0L;
      fa_0 var9;
      var9 = new fa_0(0);
      this.ra = var9;
      tw0_0.LD0 = (jn_0) this;
   }

   public static void Ie0(String var0) {
      if (lpt3__1.FQ) {
         Uy0 var10000 = (Uy0)TJ.get(var0);
         var10000.getClass();
         Uy0.B0 = System.nanoTime();
         ok0_0 var1 = tw0_0.t30.ax0;
         var10000.zy = tw0_0.t30.ax0.B1;
         var10000.P50 = var1.bH.LG;
         var10000.xh = var1.tA;
         var10000.finally$ = var1.BJ0;
      }
   }

   public static void Qr(String var0) {
      if (lpt3__1.FQ) {
         Uy0 var4;
         if ((var4 = (Uy0)TJ.get(var0)).Fw.length <= var4.sS) {
            var4.sS = 0;
         }

         long var1;
         long var10005 = var1 = System.nanoTime() - Uy0.B0;
         long[] var10006 = var4.Fw;
         int var3 = var4.sS++;
         var10006[var3] = var1;
         var4.BC = (float)var10005 / 1000000.0F;
         ok0_0 var5 = tw0_0.t30.ax0;
         var4.p30 = tw0_0.t30.ax0.B1 - var4.zy;
         var4.ir0 = var5.bH.LG - var4.P50;
         var4.Ml = var5.tA - var4.xh;
         var4.th = var5.BJ0 - var4.finally$;
      }
   }

   public static URL m(Dn0 file) {
    Dn0 root = file.Br();
    while (!root.el().isEmpty()) {
        root = root.Br();
    }
    try {
        return new URL("pokemmo", "local", 80, file.el(), new kh_1(root));
    } catch (java.net.MalformedURLException exception) {
        throw new RuntimeException(exception);
    }
}

   public static void gi(WU var0, X6 var1) {
      var0.BD = true;
      int var2 = var1.mu0.Mw0;
      if (var1.mu0.Mw0 != dw_2.aR) {
         dw_2.aR = var2;
         dw_2.CY();
      }
   }

   public final void Le0(boolean mobile) {
    if (this.Y9 == null) {
        this.j20 = new ui_1(1000, new p4_0());
        this.Y9 = new PC0();
        this.Y9.Ka0(lg_0.S4.Kr0(), lg_0.S4.sD0(), true);
    }
    this.j20.Po(this.Y9.iJ);
    if (mobile) {
        this.aj = new yh0_0(this.Y9, dw_2.lp0);
        this.Ew = Math.max(1.0f / ((float)lg_0.S4.Kr0() / 1280.0f), 1.0f / ((float)lg_0.S4.sD0() / 720.0f));
    } else {
        float scale = dw_2.Tf;
        int width = lg_0.S4.Kr0();
        int height = lg_0.S4.sD0();
        if (LW.LH0(scale, 1.0f) || LW.LH0(scale, 0.0f)) {
            scale = 1.0f;
        } else {
            float inverseScale = 1.0f / scale;
            if (!LW.LH0(inverseScale, 1.0f)) {
                int scaledWidth = (int)((float)width / inverseScale);
                int scaledHeight = (int)((float)height / inverseScale);
                if (scaledWidth <= 500 || scaledHeight <= 640) {
                    if (LW.LH0(inverseScale, 1.25f)) {
                        scale = 0.8f;
                    } else if (LW.LH0(inverseScale, 1.5f)) {
                        scale = 0.7f;
                    } else if (LW.LH0(inverseScale, 1.75f)) {
                        scale = 0.6f;
                    } else if (LW.LH0(inverseScale, 2.0f)) {
                        scale = 0.5f;
                    }
                }
            }
        }
        this.Ew = scale;
        this.aj = new ee0_1(P9.Pi0, lg_0.S4.Kr0() * this.Ew, lg_0.S4.sD0() * this.Ew, this.Y9);
    }
    this.aj.Yw0(lg_0.S4.Kr0(), lg_0.S4.sD0());
    if (this.wx0 == null) {
        this.wx0 = new qq_0(this.j20, this.aj);
    }
    this.wx0.va = this.aj;
    this.wx0.Ii();
    gy0.info("Initializing ui viewport with {} x {} // {} x {} uiViewportScale: {}", Float.valueOf(this.aj.qj), Float.valueOf(this.aj.eY), Integer.valueOf(this.aj.Ty), Integer.valueOf(this.aj.Ja), Float.valueOf(this.Ew));
    if (lpt3__1.YM) {
        na_0 frameBuffer = this.X3;
        if (frameBuffer != null) {
            frameBuffer.dispose();
        }
        this.X3 = new na_0(ix0_0.Vw, lg_0.S4.Kr0(), lg_0.S4.sD0(), false, false);
    }
}

   public final Oz0 S30() {
      return this.he0;
   }

   public final vo_2 wL() {
      return this.Sc;
   }

   public final boolean nv() {
      vo_2 var1;
      return (var1 = this.Sc) == null || var1.UU;
   }

   public void YK0() {
      if (tw0_0.hH0 == null) {
         throw new RuntimeException("Init must be set before renderer initialization");
      }

      Cr0.qq = Thread.currentThread();
      System.nanoTime();
      jv_1 var1 = tw0_0.Xl0;
      lg_0.lW.L50 = tw0_0.Xl0;
      int var2 = 4;
      lg_0.lW.Sp0.o40(var2);
      if (!dw_2.A9.isEmpty()) {
         gy0.info("Setting output device to \"{}\"", dw_2.A9);
         lg_0.MF.AF(dw_2.A9);
      }

      String var30 = lg_0.OH0.glGetString(7936);
      String var3 = lg_0.OH0.glGetString(7937);
      String var4 = lg_0.OH0.glGetString(7938);
      mh0_2 var10000 = tw0_0.Ht0;
      mh0_2 var10001 = tw0_0.Ht0;
      mh0_2 var10002 = tw0_0.Ht0;
      mh0_2 var10003 = tw0_0.Ht0;
      mh0_2 var10004 = tw0_0.Ht0;
      mh0_2 var10005 = tw0_0.Ht0;
      mh0_2 var5;
      mh0_2 var10006 = var5 = tw0_0.Ht0;
      tw0_0.Ht0.FU((byte)0, var30);
      var10006.FU((byte)1, var3);
      var10005.FU((byte)2, var4);
      var10004.FU((byte)10, Gf.Mb());
      var10003.FU((byte)11, Gf.PH());
      var10002.FU((byte)12, Long.toString(Gf.fH()));
      var10001.FU((byte)13, Long.toString(Gf.Ib()));
      var10000.FU((byte)14, Long.toString(Gf.Lb()));
      if (Gf.RH()) {
         var5.FU((byte)15, Long.toString(1L));
      }

      if (ea0_1.rv0 && ("Red Hat".equals(var30) || "Mesa/X.org".equals(var30)) && var3.startsWith("virgl")) {
         qD = true;
      }

      if (var3.toLowerCase(Locale.ENGLISH).contains("microsoft basic render driver")) {
         throw new nf_1("Couldn't create window");
      }

      label57: {
         Bw0.bL0("opengl_vendor", var30, "OpenGL vendor", false);
         Bw0.bL0("opengl_renderer", var3, "OpenGL renderer", false);
         Bw0.bL0("opengl_version", var4, "OpenGL version", false);
         Bw0.bL0("opengl_extensions", lg_0.OH0.glGetString(7939), "OpenGL extensions", false);
         tw0_0.Dc0();
         var3 = "GL_ARB_multisample";
         lg_0.S4.getClass();
         if (!GLFW.glfwExtensionSupported(var3)) {
            var3 = "GL_ANGLE_framebuffer_multisample";
            lg_0.S4.getClass();
            if (!GLFW.glfwExtensionSupported(var3)) {
               if (!tw0_0.Xy0()) {
                  break label57;
               }

               var3 = "GL_EXT_multisampled_render_to_texture";
               lg_0.S4.getClass();
               if (!GLFW.glfwExtensionSupported(var3)) {
                  break label57;
               }
            }
         }

         IntBuffer var52;
         IntBuffer var73 = var52 = BufferUtils.yD0(16);
         lg_0.Sf0.glGetIntegerv(36183, var52);
         sx_1.QJ0 = var73.get();
      }

      if (var30.toLowerCase().contains("intel") && sx_1.QJ0 > 8) {
         gy0.info("Limiting MSAA Samples to 8x because detected Intel GL Vendor.");
         sx_1.QJ0 = 8;
      }

      if (tw0_0.Xy0() && sx_1.QJ0 > 4) {
         gy0.info("Limiting MSAA Samples to 4x because Mobile platform.");
         sx_1.QJ0 = 4;
      }

      var2 = sx_1.QJ0;
      if (dw_2.Zu > sx_1.QJ0) {
         dw_2.Zu = var2;
      }

      Bw0.bL0("opengl_msaa_max_sample_count", sx_1.QJ0, "MSAA Max Samples Support", false);
      IntBuffer var32;
      IntBuffer var74 = var32 = BufferUtils.yD0(16);
      lg_0.Sf0.glGetIntegerv(3379, var32);
      sx_1.jg0 = var74.get();
      ((Buffer)var74).position(0);
      lg_0.Sf0.glGetIntegerv(34930, var32);
      sx_1.OW = var74.get();
      Bw0.bL0("opengl_max_texture_size", sx_1.jg0, "Max Texture Size", false);
      Bw0.bL0("opengl_max_texture_image_units", sx_1.OW, "Max Texture Image Units", false);
      Bw0.bL0("current_resolution", lg_0.S4.Kr0() + " x " + lg_0.S4.sD0(), "Current Resolution", false);
      Bw0.bL0("has_audio", lg_0.MF, "Has Audio", false);
      Bw0.bL0("nds_map_cache_enabled", dw_2.bn, "NDS Map Cache Enabled", false);
      PC0 var33;
      PC0 var75 = var33 = new PC0();

      this.zv = var33;
      var75.Ka0(lg_0.S4.Kr0(), lg_0.S4.sD0(), false);
      this.zv.R1(true);
      PC0 var34;
      PC0 var76 = var34 = new PC0();

      this.oL = var34;
      var76.Ka0(lg_0.S4.Kr0(), lg_0.S4.sD0(), true);
      PC0 var77 = this.oL;
      this.oL.LH = 0.25F;
      var77.R1(true);
      Class<B5> var35 = B5.class;
      pv_1 var53;
      var53 = new pv_1();
      HashMap var78 = ao_1.LH0;
      HashMap var86 = ao_1.LH0;
      HashMap var99 = ao_1.LH0;
      HashMap var100 = ao_1.LH0;
      HashMap var101 = ao_1.LH0;
      HashMap var103 = ao_1.LH0;
      HashMap var104 = ao_1.LH0;
      HashMap var10007 = ao_1.LH0;
      HashMap var10008 = ao_1.LH0;
      HashMap var10009 = ao_1.LH0;
      HashMap var10010 = ao_1.LH0;
      HashMap var10011 = ao_1.LH0;
      HashMap var10012 = ao_1.LH0;
      HashMap var10013 = ao_1.LH0;
      HashMap var10014 = ao_1.LH0;
      HashMap var10015 = ao_1.LH0;
      HashMap var10016 = ao_1.LH0;
      ao_1.LH0.put(var35, var53);
      var10016.put(te0_0.class, new z90_0());
      var10015.put(BM.class, new bq_1());
      var10014.put(U10.class, new wb0_2());
      var10013.put(jk_0.class, new d20_0());
      var10012.put(qd0_0.class, new LA0());
      var10011.put(BJ0.class, new yc_1());
      var10010.put(HG.class, new of_1());
      var10009.put(lc_0.class, new of_1());
      var10008.put(com3__3.class, new qh0_0());
      var10007.put(Bp0.class, new ih_0());
      var104.put(C8.class, new gu_0());
      var103.put(ql_0.class, new D50());
      var101.put(Color.class, new P0());
      var100.put(le0_2.class, new yv_0());
      var99.put(gn_0.class, new com5__2());
      var86.put(Br0.class, new em_0());
      var78.put(Ou0.class, new _final());
      ao_1.Gy0 = 4;
      ao_1.zf0 = 5;
      ao_1.Sk0.HF.ensureCapacity(50);
      ii0_1 var36;
      var36 = new ii0_1();
      this.Ov = var36;
      ii0_1 var37;
      var37 = new ii0_1();
      this.lY = var37;
      ui_1 var38;
      ui_1 var79 = var38 = new ui_1();

      this.IA = var38;
      var79.Po(this.zv.iJ);
      hl0_1 var39;
      var39 = new hl0_1(1000, (new qd0_0()).mF0);
      this.AN = var39;
      i4_0 var40;
      ix0_0 var54 = ix0_0.n2;
      i4_0 var80 = var40 = new i4_0(1, 1, var54);

      B5 var55;
      B5 var87 = var55 = new B5(new Texture(var40));

      this.Rl = var55;
      var87.Ha0(0.0F);
      var80.dispose();
      BJ0 var41;
      var41 = new BJ0();
      this.U1 = var41;
      mv_0 var42;
      mv_0 var81 = var42 = new mv_0();

      var81.HA = 1;
      var81.F80 = 1;
      var81.el = 32;
      eh_2 var56;
      var56 = new eh_2(new XB(var42), new FG());
      this.K10 = var56;
      ff_0 var43;
      var43 = new ff_0(this.U1, 0);
      this.Yx0 = var43;
      if (lpt3__1.FQ) {
         (tw0_0.t30 = new Kr0(lg_0.S4)).yD0();
         (TJ = new HashMap()).put("MAIN.update", new Uy0());
         TJ.put("MAP.update", new Uy0());
         TJ.put("MAP.render", new Uy0());
         TJ.put("PSYS.draw", new Uy0());
         TJ.put("GUI.render", new Uy0());
         TJ.put("BATTLE.render", new Uy0());
      }

      if (this.L7 != 1.0F) {
         ui_1 var44;
         var44 = new ui_1();
         this.B = var44;
         var2 = (int)(lg_0.S4.Kr0() * this.L7);
         int var57 = (int)(lg_0.S4.sD0() * this.L7);
         PC0 var64;
         PC0 var82 = var64 = new PC0();

         this.Uv0 = var64;
         var82.Ka0(lg_0.S4.Kr0(), lg_0.S4.sD0(), true);
         this.B.Po(this.zv.iJ);
         dl_1 var83 = gy0;
         Integer var65 = var2;
         Integer var68 = var57;
         var83.info("Initializing GAME FBO {} x {}", var65, var68);
         na_0 var66;
         var66 = new na_0(ix0_0.Vw, var2, var57, true);
         this.nB0 = var66;
      }

      wa_1 var7;
      var7 = new wa_1();
      this.wl0 = var7;
      up_2 var8;
      var8 = new up_2();
      this.mG0 = var8;
      hy0_0 var6;
      (var6 = this.sy).getClass();
      A3 var9;
      var9 = new A3();
      var6.Ml0 = var9;
      ui_1 var10;
      var10 = new ui_1();
      var6.AuX = var10;
      PC0 var11;
      PC0 var88 = var11 = new PC0();

      var6.eC0 = var11;
      var88.Ka0(lg_0.S4.Kr0(), lg_0.S4.sD0(), true);
      yh0_0 var12;
      yh0_0 var89 = var12 = new yh0_0(var6.eC0, dw_2.lp0);

      var6.Mm = var12;
      var89.Yw0(lg_0.S4.Kr0(), lg_0.S4.sD0());
      Texture var13;
      Texture var90 = var13 = new Texture("data/buttons/controller.png");

      var90.setFilter(eb0_1.jc0, eb0_1.jc0);
      LPT6_[] var46;
      LPT6_[] var91 = var46 = new LPT6_[5];
      LPT6_ var58;
      var58 = new LPT6_(var13, 1, 1, 170, 170);
      var91[0] = var58;
      LPT6_ var59;
      var59 = new LPT6_(var13, 341, 1, 170, 170);
      var91[1] = var59;
      LPT6_ var60;
      LPT6_ var102 = var60 = new LPT6_(var13, 341, 1, 170, 170);

      var46[2] = var60;
      var102.Wu0(true, false);
      LPT6_ var61;
      var61 = new LPT6_(var13, 171, 1, 170, 170);
      var91[3] = var61;
      LPT6_ var62;
      var62 = new LPT6_(var13, 171, 1, 170, 170);
      var91[4] = var62;
      var91[3].Wu0(false, true);
      LPT6_ var63;
      var63 = new LPT6_(var13, 1, 171, 90, 90);
      LPT6_ var67;
      LPT6_ var92 = var67 = new LPT6_(var13, 91, 171, 90, 90);

      var63.Wu0(false, true);
      var92.Wu0(false, true);
      A3 var93 = var6.Ml0;
      String var14 = "dpad-idle";
      LPT6_ var69 = var46[0];
      var6.Ml0.getClass();
      var93.oj(var69.getClass(), var69, var14);
      A3 var94 = var6.Ml0;
      String var15 = "dpad-left";
      LPT6_ var70 = var46[1];
      var6.Ml0.getClass();
      var94.oj(var70.getClass(), var70, var15);
      A3 var95 = var6.Ml0;
      String var16 = "dpad-right";
      LPT6_ var71 = var46[2];
      var6.Ml0.getClass();
      var95.oj(var71.getClass(), var71, var16);
      A3 var96 = var6.Ml0;
      String var17 = "dpad-down";
      LPT6_ var72 = var46[3];
      var6.Ml0.getClass();
      var96.oj(var72.getClass(), var72, var17);
      A3 var97 = var6.Ml0;
      String var18 = "dpad-up";
      LPT6_ var47 = var46[4];
      var6.Ml0.getClass();
      var97.oj(var47.getClass(), var47, var18);
      String var19 = "a-button";
      var6.Ml0.oj(LPT6_.class, var63, var19);
      String var20 = "b-button";
      var6.Ml0.oj(LPT6_.class, var67, var20);
      he_2 var21;
      var21 = new he_2();
      var6.NM = var21;
      (var6.xF0 = new YA[5])[0] = var6.Ml0.Y8("dpad-idle");
      var6.xF0[1] = var6.Ml0.Y8("dpad-left");
      var6.xF0[2] = var6.Ml0.Y8("dpad-right");
      var6.xF0[3] = var6.Ml0.Y8("dpad-down");
      var6.xF0[4] = var6.Ml0.Y8("dpad-up");
      var6.NM.va0 = var6.xF0[0];
      X5 var22;
      X5 var98 = var22 = new X5(Math.min(125.0F, 125.0F) * dw_2.N90, var6.NM);

      var6.G9 = var22;
      var98.Ig(25.0F, 25.0F, 250.0F, 250.0F);
      Bp0 var23;
      var23 = new Bp0(0.0F, 0.0F);
      var6.cOM2 = var23;
      ir_0 var24;
      var24 = new ir_0(var6.Mm, var6.AuX);
      var6.pz0 = var24;
      byte var48 = 0;
      var1.HV.P6(var48, var24);
      X5 var25 = var6.G9;
      var6.pz0.cx0.KD0(var25);
      yb0_0 var26;
      var26 = new yb0_0(var6.Ml0.Y8("a-button"));
      var6.Nf0 = var26;
      yb0_0 var27;
      var27 = new yb0_0(var6.Ml0.Y8("b-button"));
      var6.qx = var27;
      yb0_0 var85 = var6.Nf0;
      var6.Nf0.eo0.Bp = true;
      var27.eo0.Bp = true;
      var85.DC(120.0F, 120.0F);
      var6.qx.DC(120.0F, 120.0F);
      yb0_0 var28 = var6.Nf0;
      var6.Nf0.On0 = false;
      var6.qx.On0 = false;
      var6.G9.On0 = false;
      var6.pz0.cx0.KD0(var28);
      yb0_0 var29 = var6.qx;
      var6.pz0.cx0.KD0(var29);
      var6.oK0();
      tw0_0.hH0.Pc0();
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void ba0(OX oX) {
        this.Le0(oX.J0);
        if (this.u10 == null) {
            ga0_0 application = (ga0_0)this;
            application.d6 = new Qy0(application);
            Bg0 root = new Bg0();
            root.b00 = application.sy;
            bl0_2 ui = new bl0_2(application, application.d6, application.wx0, root, tw0_0.Xl0, application.Y9, ok_0.kX);
            application.u10 = ui;
            try {
                ui.vi = false;
                root.BG = ui;
                tw0_0.Xl0.HV.Ue0(root);
                tw0_0.lM.Qw0(dw_2.L90);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        R40 theme = this.cOM5(this.wx0, oX);
        if (theme == null) {
            return;
        }
        if (this.UA != null) {
            this.UA.CoM6();
        }
        this.UA = theme;
        this.u10.pO(theme);
        this.u10.Bb(500);
        if (this.wO != null) {
            R40 battleTheme = this.cOM5(this.wf, oX);
            if (battleTheme == null) {
                return;
            }
            this.wO.pO(battleTheme);
        }
    }

   public final void Ux0() {
    if (this.I30) {
        return;
    }
    long frameStartedAt = System.nanoTime();
    float delta = lg_0.S4.uL;

    if (lpt3__1.RJ && lg_0.lW.eC0(129)) {
        if (lg_0.lW.nI0(8)) lg_0.S4.zE(1280, 720);
        if (lg_0.lW.nI0(9)) lg_0.S4.zE(1480, 720);
        if (lg_0.lW.nI0(10)) lg_0.S4.zE(1480, 800);
        if (lg_0.lW.nI0(11)) lg_0.S4.zE(1024, 720);
        if (lg_0.lW.nI0(12)) lg_0.S4.zE(1920, 1080);
        if (lg_0.lW.nI0(13)) lg_0.S4.zE(1600, 900);
    }

    this.Ov.D70(delta);
    this.lY.D70(delta);
    this.Z1 += delta;
    long previousTick = hk0_1.KG;
    long nowNanos = System.nanoTime();
    hk0_1.Bk0 = nowNanos;
    hk0_1.KG = nowNanos / 1000000L;
    hk0_1.HI0 = hk0_1.KG - previousTick;

    if (!tr_0.w9.isEmpty()) {
        try {
            long deadline = System.currentTimeMillis() + 30L;
            while (System.currentTimeMillis() < deadline) {
                Yk task = (Yk)tr_0.w9.peek();
                if (task == null || !task.run()) {
                    break;
                }
                tr_0.w9.poll();
            }
        } catch (Exception exception) {
            tw0_0.hH0.me0(exception, sm0_0.c0(nf0_0.bu), false);
            tr_0.w9.clear();
        }
    }

    if (hk0_1.KG >= li_2.lu + 60000L) {
        li_2.lu = hk0_1.KG;
        synchronized (li_2.kp0) {
            for (Iterator iterator = li_2.kp0.iterator(); iterator.hasNext();) {
                CG resource = (CG)iterator.next();
                if (!resource.Mt0() && resource.cOm2() + 300000L < hk0_1.KG) {
                    li_2.Tx0.add(resource);
                }
            }
            for (Iterator iterator = li_2.Tx0.iterator(); iterator.hasNext();) {
                ((CG)iterator.next()).ji0();
            }
            li_2.Tx0.clear();
        }
    }

    if (tw0_0.pv != null) {
        tw0_0.pv.C4 += delta * _native.mu0;
    }
    if (tw0_0.RE0 != null) {
        tw0_0.RE0.z6.jl();
    }

    _else map = tw0_0.e60 == null ? null : tw0_0.e60.N60();
    if (map != null && (this.Sc == null || !this.Sc.yp(map.dw))) {
        if (this.Sc != null) {
            this.Sc.dispose();
        }
        switch (map.dw) {
            case 0:
            case 1:
                this.Sc = new vg_0();
                break;
            case 2:
                this.Sc = new cr0_0(tw0_0.Ll0.Qz0);
                break;
            case 3:
                this.Sc = new ov_0(tw0_0.Ll0.nC0);
                break;
            case 4:
                this.Sc = new F30(tw0_0.Ll0.t1);
                break;
            case 10:
                this.Sc = new UR();
                break;
            default:
                break;
        }
    }
    if (this.Sc != null) {
        this.Sc.ql0();
    }
    if (this.no0 != null && this.no0.bb0) {
        this.no0 = null;
    }

    if (tw0_0.e60 != null) {
        tw0_0.e60.tg0();
        if (this.KJ0 != null && this.KJ0.Ob0()) {
            this.KJ0.zR();
            this.KJ0 = null;
        }
        a10_0 battle = tw0_0.PK0;
        if (this.he0 == null && this.KJ0 == null) {
            if (battle != null && this.hO == null) {
                Cq state = battle.nf;
                if (state != Cq.Jd) {
                    tw0_0.RE0.Eh(battle.cOM1(), battle.QA(), false, false);
                }
                if (!battle.a40 || battle.mo()) {
                    if (battle.mW || battle.nf == Cq.Jd || battle.Sv == XA0.PRN) {
                        this.js();
                    } else {
                        this.Gx0 = new L0();
                        this.KJ0 = new fg_1((jn_0) this, 1300L);
                    }
                }
            }
        } else {
            if (this.KJ0 != null) {
                this.KJ0.Qr();
            }
            if (battle == null && this.KJ0 == null && this.he0 != null) {
                this.he0.dispose();
                this.he0 = null;
                if (this.d6.ZW != null) {
                    this.d6.ZW.xe0();
                }
                if (map != null && this.hO == null) {
                    tw0_0.RE0.Eh(map.dw, map.hh0(), true, false);
                    tw0_0.RE0.qq();
                }
            }
        }
    } else {
        if (this.he0 != null) {
            this.he0.dispose();
            this.he0 = null;
        }
        this.KJ0 = null;
        if (this.hO != null) {
            this.hO.dispose();
            this.hO = null;
        }
    }

    if (tw0_0.Yw(5) && lg_0.lW.eC0(129) && lg_0.lW.nI0(50)) {
        String clipboard = lg_0.k.E00 == null ? "" : GLFW.glfwGetClipboardString(lg_0.S4.rt0.hc0);
        if (clipboard != null && clipboard.startsWith("//moveto")) {
            tw0_0.rl.Cp(zo_0.Pk, clipboard, "", true);
        }
    }
    boolean reportModifier = (lg_0.lW.eC0(129) || lg_0.lW.eC0(130))
        && lg_0.lW.eC0(93) && lg_0.lW.eC0(92);
    if (!this.k2 && (lg_0.lW.eC0(25) || reportModifier)) {
        boolean submitReport = true;
        int delay = 2000;
        if (!lg_0.lW.eC0(24) && lg_0.lW.eC0(25)) {
            delay = 10000;
        }
        if ((lg_0.lW.eC0(129) || lg_0.lW.eC0(130)) && lg_0.lW.eC0(93) && lg_0.lW.eC0(92)) {
            submitReport = false;
            delay = 0;
        }
        if (this.K7 < 1L) {
            this.K7 = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - this.K7 > (long)delay) {
            this.K7 = 0L;
            this.k2 = submitReport;
            String message = ea0_1.x8 ? sm0_0.c0(nf0_0.Cs0) : sm0_0.c0(nf0_0.Y4);
            tw0_0.uV.Qu(sm0_0.c0(nf0_0.Dz0), message, UE.iC, new Qw(), null, true);
        }
    } else if (this.K7 > 0L) {
        this.K7 = 0L;
    }

    hy0_0 controls = this.sy;
    if (tw0_0.hH0.K90) {
        if (controls.kY != dw_2.Yj || controls.KH != dw_2.jq0 || controls.cE != dw_2.Lu) {
            controls.oK0();
        }
        boolean showControls = false;
        if (tw0_0.kz0() && dw_2.mE && controls.pz0 != null && this.he0 == null && this.Sc != null) {
            Qy0 mainGui = Qy0.yI0;
            boolean modalOpen = mainGui.wY != null && mainGui.wY.eE;
            boolean animationActive = this.hO != null || this.uc != null || this.qL0 != null;
            boolean blockingWindow = mainGui.tq.KB != 0 && ((cx_0)mainGui.tq.GH0()) != null && ((cx_0)mainGui.tq.GH0()).Rt0();
            showControls = !modalOpen && !mainGui.Fx0 && !animationActive && !blockingWindow;
        }
        if (showControls != controls.ob0) {
            controls.ob0 = showControls;
            controls.Ef();
            controls.Nf0.On0 = showControls;
            controls.qx.On0 = showControls;
            controls.G9.On0 = showControls;
        }
    }

    if (this.nB0 != null) {
        CI0.r40(0, 0, this.nB0.dx0.Yd0, this.nB0.dx0.JY);
        lg_0.Sf0.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        lg_0.Sf0.glClear(16384);
        this.nB0.synchronized$();
    } else if (tt0_0.C7()) {
        this.aj.kF(false);
    } else {
        CI0.r40(0, 0, lg_0.S4.Kr0(), lg_0.S4.sD0());
    }
    lg_0.OH0.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    lg_0.OH0.glClear(16640);

    if (!HO.iQ && (tw0_0.rl == null || tw0_0.rl.n2() != 5)) {
        if (this.BK == null) {
            this.BK = new IC0();
        }
        this.BK.mT();
    } else if (this.BK != null) {
        this.BK.dispose();
        this.BK = null;
    }

    if (this.Sc != null && this.no0 == null && this.VW == null) {
        Ie0("MAP.render");
        boolean menuBlocksMap = false;
        if (!dw_2.Ga0) {
            if (tw0_0.PK0 != null && this.he0 != null) {
                menuBlocksMap = true;
            } else if (tw0_0.rl != null && tw0_0.rl.lZ.zK0 != null) {
                BU menu = tw0_0.rl.lZ.zK0;
                if (menu.Mc0 != null) {
                    menuBlocksMap = true;
                } else if (menu.t30 != null) {
                    le0_2[] children = (le0_2[])menu.t30.pa();
                    int childCount = menu.t30.KB;
                    for (int index = 0; index < childCount; index++) {
                        if (Rs0.class.isAssignableFrom(children[index].getClass())) {
                            menuBlocksMap = true;
                            break;
                        }
                    }
                    menu.t30.Gj0();
                }
            }
        }
        nf_0 fades = nf_0.zo0();
        if (menuBlocksMap) {
            if (fades.ik.kl0 < 255 && !Qy0.yI0.y4()) {
                this.Sc.Xf0();
            } else {
                this.Sc.ph0();
            }
        } else if (tw0_0.PK0 != null && this.he0 != null && dw_2.Ga0) {
            // Keep the overworld visible behind the desktop battle overlay.
            this.Sc.Xf0();
        } else if (fades.COn.kl0 > 0 || !Qy0.yI0.y4()) {
            this.Sc.Xf0();
        } else {
            this.Sc.ph0();
        }
        Qr("MAP.render");
    }

    if (this.v5 != null) {
        this.v5.og += delta;
        if (this.v5.og < 0.0F || this.v5.og >= Float.MAX_VALUE) {
            this.v5.og = 0.0F;
        }
        I2 effects = this.v5.is0.ZD();
        while (effects.hasNext()) {
            ((Ou0)effects.next()).bo0(this.v5.og);
        }
        this.v5.Zq = true;
        effects = this.v5.is0.ZD();
        while (effects.hasNext()) {
            Ou0 effect = (Ou0)effects.next();
            if (effect.ep != null && effect.ep.mH0 != null && effect.ep.mH0.DL0 != 0) {
                this.v5.Zq = false;
            }
        }
        if (this.v5.Zq) {
            this.v5.dispose();
            this.v5 = null;
        }
    }

    boolean overlayOpen = false;
    if (tw0_0.rl != null && tw0_0.rl.lZ.zK0 != null) {
        BU menu = tw0_0.rl.lZ.zK0;
        if (menu.Mc0 == null && menu.t30 != null) {
            le0_2[] children = (le0_2[])menu.t30.pa();
            int childCount = menu.t30.KB;
            for (int index = 0; index < childCount; index++) {
                if (Rs0.class.isAssignableFrom(children[index].getClass())) {
                    overlayOpen = true;
                    break;
                }
            }
            menu.t30.Gj0();
        }
    }
    nf_0 fades = nf_0.zo0();
    if (this.he0 == null && !overlayOpen) {
        if ((this.KJ0 == null || this.KJ0.No0()) && fades.ik.xP != 0) {
            fades.ik.m(-1, 0, 100);
        }
    } else {
        int targetOpacity = (!dw_2.Ga0 || (tw0_0.e60 != null && tw0_0.e60.ek())) ? 255 : 180;
        if (fades.ik.xP < targetOpacity) {
            fades.ik.m(-1, targetOpacity, 500);
        }
    }
    fades.COn.r0();
    fades.TK.r0();
    fades.QQ.r0();
    fades.ik.r0();
    if (fades.COn.kl0 != 0 || fades.TK.kl0 != 0 || fades.QQ.kl0 != 0 || fades.ik.kl0 != 0) {
        this.IA.W30();
        if (fades.COn.kl0 > 0) fades.COn.r6.jN(this.IA);
        if (fades.TK.kl0 > 0) fades.TK.r6.jN(this.IA);
        if (fades.QQ.kl0 > 0) fades.QQ.r6.jN(this.IA);
        if (fades.ik.kl0 > 0) fades.ik.r6.jN(this.IA);
        this.IA.end();
    }

    if (this.VW != null) {
        this.VW.Iu();
        if (this.VW.VK0 == 4) {
            this.VW.dispose();
            this.VW = null;
        } else {
            this.VW.LK0();
        }
    }
    if (this.no0 != null) {
        this.no0.LPt1();
    }
    if (this.K10.X60.KB != 0 && this.Sc.So() != null) {
        lg_0.OH0.glClear(256);
        this.K10.jK(this.Sc.So());
        this.K10.end();
    }

    if (tw0_0.PK0 != null && this.he0 != null) {
        Ie0("BATTLE.render");
        if (tw0_0.Tl0 != null) {
            tw0_0.Tl0.Ll(false);
        }
        this.he0.update();
        if (this.he0.WT || this.d6.zK0 == null || !this.d6.zK0.eE) {
            this.he0.bL0();
        }
        Qr("BATTLE.render");
    } else if (tw0_0.Tl0 != null) {
        tw0_0.Tl0.Ll(this.v5 == null && this.no0 == null && this.VW == null && this.uc == null && this.hO == null);
    }

    if (this.nB0 != null) {
        this.nB0.end();
        lg_0.Sf0.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        lg_0.Sf0.glClear(16640);
        this.Uv0.yG = lg_0.S4.sD0();
        this.Uv0.Ui = lg_0.S4.Kr0();
        this.Uv0.R1(true);
        this.B.Po(this.Uv0.iJ);
        this.B.W30();
        Texture texture = (Texture)((lq_2)this.nB0.f1.KI());
        if (this.wo != null) {
            this.B.vv0(texture, this.wo.yJ() / 2 - this.wo.Z20.Mx, 0.0F, this.nB0.dx0.Yd0, this.nB0.dx0.JY);
        } else {
            this.B.vv0(texture, 0.0F, 0.0F, this.nB0.dx0.Yd0, this.nB0.dx0.JY);
        }
        this.B.end();
    }

    if (this.hO != null) {
        if (this.hO.Lpt1()) {
            this.hO.dispose();
            this.hO = null;
        } else {
            this.hO.LPt1();
        }
    }
    boolean canAnimateHatch = this.hO == null && this.he0 == null;
    if (this.uc != null && canAnimateHatch) {
        if (this.uc.Lpt1()) {
            this.uc.dispose();
            this.uc = null;
            if (this.m3.IR != 0) {
                this.x((VU)this.m3.zP());
            }
        } else {
            this.uc.LPt1();
        }
    } else if (this.uc == null && canAnimateHatch && this.m3.IR != 0) {
        this.x((VU)this.m3.zP());
    }
    if (this.qL0 == null && this.i20.IR != 0) {
        this.qL0 = (vj_0)this.i20.zP();
    }
    if (this.qL0 != null) {
        if (this.qL0.bb0) {
            this.qL0 = null;
        } else {
            this.qL0.LPt1();
        }
    }

    if ((this.AD0 != null && !this.AD0.gL0()) || (this.Gx0 != null && !this.Gx0.gL0())) {
        this.AN.Po(this.oL.iJ);
        this.AN.W30();
    }
    if (this.AD0 != null && !this.AD0.gL0()) {
        if (tw0_0.Tl0 != null) tw0_0.Tl0.Ll(false);
        this.AD0.nr(this.AN);
    }
    if (this.Gx0 != null && !this.Gx0.gL0()) {
        this.Gx0.nr(this.AN);
        if (tw0_0.Tl0 != null) tw0_0.Tl0.Ll(false);
    }
    if (this.AN.xq) {
        this.AN.end();
    }

    this.YL();
    this.dB();
    if (this.v5 != null) {
        this.v5.Os();
    }
    if (h50_0.Of0) {
        this.IA.W30();
        int alpha = ((int)(System.currentTimeMillis() / 120000L)) % 10;
        if (alpha > 5) alpha = 10 - alpha;
        this.Rl.Ha0(alpha / 255.0F);
        this.Rl.jN(this.IA);
        this.IA.end();
    }

    Io[GU++] = System.nanoTime() - frameStartedAt;
    if (GU >= Io.length) {
        GU = 0;
    }
    if (tw0_0.t30 != null && tw0_0.t30.t40) {
        tw0_0.t30.Ld();
    }
}

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void dB() {
    if (lg_0.lW.nI0(141) && lg_0.lW.eC0(59) && lg_0.lW.eC0(129) && tw0_0.Eu(8) && this.Sc != null) {
        if (this.wO != null) {
            this.wo.em();
            this.wo = null;
            this.Ik0.dispose();
            this.Ik0 = null;
            this.Ag = null;
            this.FC0 = null;
            this.wf.GC0.dispose();
            this.wf.CP.dispose();
            this.wf = null;
            this.wO = null;
            this.UY.CoM6();
            this.UY = null;
            tw0_0.Xl0.HV.sj0(this.TG, true);
            this.TG = null;
            tt0_0.j0 = null;
            this.aj.qj = lg_0.S4.Kr0();
            this.aj.eY = lg_0.S4.sD0();
            this.aj.df = 0;
            this.aj.gS = 0;
            this.aj.Ty = lg_0.S4.Kr0();
            this.aj.Ja = lg_0.S4.sD0();
            this.aj.kF(true);
            this.wx0.Ii();
            this.Sc.Dt0(lg_0.S4.Kr0(), lg_0.S4.sD0());
        } else {
            this.TG = new Yo0();
            this.wo = new tt0_0();
            this.Ik0 = new ui_1(250);
            this.Ag = new PC0();
            this.Ag.Ka0(lg_0.S4.Kr0(), lg_0.S4.sD0(), true);
            this.FC0 = new bj0_0(lg_0.S4.Kr0(), lg_0.S4.sD0(), this.Ag);
            this.FC0.Yw0(lg_0.S4.Kr0(), lg_0.S4.sD0());
            this.wf = new qq_0(this.j20, this.FC0);
            try {
                this.wO = new zk0_1(this.wo, this.wf, this.TG, tw0_0.Xl0, this.Ag, ok_0.kX);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            this.Sc.vT();
            if (this.wO != null) {
                this.TG.BG = this.wO;
                tw0_0.Xl0.HV.P6(0, this.TG);
                this.UY = this.cOM5(this.wf, dw_2.tG("default"));
                this.wO.pO(this.UY);
                this.wO.Bb(500);
            }
        }
    }
    if (this.wO == null) {
        return;
    }
    this.wo.yJ();
    this.mG0.qj = lg_0.S4.Kr0() - tt0_0.j0.yJ();
    this.mG0.eY = lg_0.S4.sD0();
    this.mG0.df = tt0_0.j0.d6.Mx;
    this.mG0.gS = 0;
    this.mG0.Ty = lg_0.S4.Kr0() - tt0_0.j0.yJ();
    this.mG0.Ja = lg_0.S4.sD0();
    this.wO.update();
    this.FC0.kF(false);
    this.j20.Po(this.Ag.iJ);
    this.j20.W30();
    this.wO.rH();
    this.j20.end();
}

   public final void YL() {
    Ie0("GUI.render");
    bl0_2 gui = this.u10;
    if (gui == null) {
        return;
    }
    gui.update();

    iw_1 selection = tw0_0.FL.Py0();
    if (selection != null && selection.tE()) {
        wa_1 shape = this.wl0;
        shape.H30.Dd0(this.Y9.iJ.EW);
        shape.Fe = true;
        shape.hM(ou_0.Q30);
        float x1 = this.ds0.x;
        float y1 = this.ds0.y;
        float x2 = this.EC0.x;
        float y2 = this.EC0.y;
        float x3 = this.pd0.x;
        float y3 = this.pd0.y;
        Color color = this.LpT8;
        shape.rr0(ou_0.w30, ou_0.Q30, 6);
        if (shape.rU == ou_0.w30) {
            shape.M80.eS(color.r, color.g, color.b, color.a); shape.M80.cn(x1, y1);
            shape.M80.eS(color.r, color.g, color.b, color.a); shape.M80.cn(x2, y2);
            shape.M80.eS(color.r, color.g, color.b, color.a); shape.M80.cn(x2, y2);
            shape.M80.eS(color.r, color.g, color.b, color.a); shape.M80.cn(x3, y3);
            shape.M80.eS(color.r, color.g, color.b, color.a); shape.M80.cn(x3, y3);
            shape.M80.eS(color.r, color.g, color.b, color.a); shape.M80.cn(x1, y1);
        } else {
            shape.M80.eS(color.r, color.g, color.b, color.a); shape.M80.cn(x1, y1);
            shape.M80.eS(color.r, color.g, color.b, color.a); shape.M80.cn(x2, y2);
            shape.M80.eS(color.r, color.g, color.b, color.a); shape.M80.cn(x3, y3);
        }
        shape.end();
    }

    this.tF -= lg_0.S4.uL;
    boolean renderToFramebuffer = lpt3__1.YM;
    if (!renderToFramebuffer || this.tF <= 0.0F) {
        this.tF = 0.025F;
        if (this.X3 != null && renderToFramebuffer) {
            lg_0.Sf0.glBindFramebuffer(36160, this.X3.SQ);
            this.aj.kF(true);
            lg_0.Sf0.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            lg_0.Sf0.glClear(17664);
        }
        if (this.X3 != null && renderToFramebuffer) {
            if (this.j20.Vn != 770 || this.j20.FA != 771 || this.j20.p8 != 770 || this.j20.y6 != 1) {
                this.j20.TV();
                this.j20.Vn = 770;
                this.j20.FA = 771;
                this.j20.p8 = 770;
                this.j20.y6 = 1;
            }
        }
        if (tt0_0.C7() && lg_0.S4.Kr0() > 0 && lg_0.S4.sD0() > 0) {
            this.aj.qj = lg_0.S4.Kr0() - tt0_0.j0.yJ();
            this.aj.eY = lg_0.S4.sD0() - tt0_0.j0.Dn0();
            this.aj.df = tt0_0.j0.d6.Mx;
            this.aj.gS = 0;
            this.aj.Ty = lg_0.S4.Kr0() - tt0_0.j0.yJ();
            this.aj.Ja = lg_0.S4.sD0() - tt0_0.j0.Dn0();
            this.aj.kF(true);
            ((qq_0)this.u10.AK).Ii();
        }

        this.j20.Po(this.Y9.iJ);
        this.j20.W30();
        this.u10.rH();
        this.j20.end();
        if (this.X3 != null && renderToFramebuffer) {
            this.X3.end();
        }

        if (gui.vi && gui.LA != null) {
            wa_1 shape = ((qq_0)gui.AK).CP;
            shape.H30.Dd0(gui.ps.iJ.EW);
            shape.Fe = true;
            shape.hM(ou_0.w30);
            if (shape.rU != ou_0.w30) {
                if (shape.rU == null) {
                    throw new IllegalStateException("begin must be called first.");
                }
                throw new IllegalStateException("autoShapeType must be enabled.");
            }
            ok_0 overlay = (ok_0)gui.LA;
            for (int index = 0; index < overlay.mT.KB; index++) {
                UC0 widget = (UC0)overlay.mT.get(index);
                if (!((tk0_0)widget.rA0.Op).eE) {
                    continue;
                }
                shape.bp.set(widget.Cl0);
                float left = widget.j80;
                float bottom = widget.Wm0;
                float right = left + widget.IA;
                float top = bottom + widget.Eu0;
                shape.rr0(ou_0.w30, ou_0.Q30, 8);
                float bits = shape.bp.toFloatBits();
                if (shape.rU == ou_0.w30) {
                    shape.M80.mC(bits); shape.M80.cn(left, bottom);
                    shape.M80.mC(bits); shape.M80.cn(right, bottom);
                    shape.M80.mC(bits); shape.M80.cn(right, bottom);
                    shape.M80.mC(bits); shape.M80.cn(right, top);
                    shape.M80.mC(bits); shape.M80.cn(right, top);
                    shape.M80.mC(bits); shape.M80.cn(left, top);
                    shape.M80.mC(bits); shape.M80.cn(left, top);
                    shape.M80.mC(bits); shape.M80.cn(left, bottom);
                } else {
                    shape.M80.mC(bits); shape.M80.cn(left, bottom);
                    shape.M80.mC(bits); shape.M80.cn(right, bottom);
                    shape.M80.mC(bits); shape.M80.cn(right, top);
                    shape.M80.mC(bits); shape.M80.cn(right, top);
                    shape.M80.mC(bits); shape.M80.cn(left, top);
                    shape.M80.mC(bits); shape.M80.cn(left, bottom);
                }
            }
            shape.end();
        }

        hy0_0 controls = this.sy;
        if (controls.ob0) {
            controls.AuX.Po(controls.eC0.iJ);
            controls.AuX.W30();
            ir_0 overlay = controls.pz0;
            float delta = lg_0.S4.uL;
            for (int index = 0; index < overlay.eg0.length; index++) {
                te0_0 previous = overlay.eg0[index];
                if (overlay.h10[index]) {
                    overlay.eg0[index] = overlay.Lpt3(previous, overlay.aH[index], overlay.Gi[index], index);
                } else if (previous != null) {
                    overlay.eg0[index] = null;
                    overlay.xX(previous, overlay.aH[index], overlay.Gi[index], index);
                }
            }
            overlay.a40 = overlay.Lpt3(overlay.a40, overlay.wm, overlay.Rr0, -1);
            overlay.cx0.yE0(delta);
            controls.pz0.cx0.BS(controls.AuX, 1.0F);
            controls.AuX.end();
        }
    }
    if (this.X3 != null && renderToFramebuffer) {
        this.j20.W30();
        Texture texture = (Texture)((lq_2)this.X3.f1.KI());
        this.j20.vv0(texture, 0.0F, 0.0F, this.ew0(), this.Hv0());
        this.j20.end();
    }
    Qr("GUI.render");
}

   public final int ew0() {
      return (int)this.aj.qj;
   }

   public final int Hv0() {
      return (int)this.aj.eY;
   }

   public final void js() {
        a10_0 selected = tw0_0.PK0;
        if (selected == null) {
            return;
        }
        Qy0 container = Qy0.yI0;
        ML0 current = container.ZW;
        if (current != null) {
            current.xe0();
        }
        if (selected.Sv == XA0.PRN) {
            L5 view = new L5(container, (cj_0)selected);
            container.ZW = view;
            container.F9(container.fU(), view);
            if (container.zK0 != null) {
                container.Qw0(container.zK0);
            }
            Uw0 overlay = new Uw0(selected, view);
            this.he0 = overlay;
            overlay.mg0();
            this.he0.update();
            return;
        }
        ML0 view = new ML0(container, selected);
        container.ZW = view;
        container.F9(0, view);
        vr_1 overlay = new vr_1(container.ZW, selected);
        this.he0 = overlay;
        overlay.Wi0();
        this.he0.update();
        tw0_0.lM.BO();
    }

   public final jn_2 IK(VU vU, boolean bl) {
        if (this.hO != null) {
            this.hO.dispose();
            this.hO = null;
        }
        WU view = new WU(bl);
        view.Yr = new lpt3__4(sm0_0.c0(6041), view::Nc, view);
        Qy0 container = this.d6;
        if (container.ez0 != null) {
            container.ez0.xe0();
        }
        container.ez0 = view;
        container.F9(0, view);
        this.hO = new jn_2(vU, view);
        return this.hO;
    }

   public final void x(VU pokemon) {
    if ((dw_2.aR == 1 && !pokemon.I8.I()) || dw_2.aR == 2) {
        return;
    }
    if (this.uc != null || this.he0 != null) {
        this.m3.Uk0(pokemon);
        return;
    }
    WU view = new WU(true);
    view.yR.SU(sm0_0.c0(6157));
    tk0_0 layout = new tk0_0(new A40());
    A40 panel = layout.gg0;
    panel.FU.ys0(5.0f);
    cn_0 title = new cn_0(null, 0);
    title.Sk(sm0_0.c0(6150));
    j1_0 titleCell = panel.vx0(title);
    titleCell.d80 = 2;
    titleCell.Rr0.Rg();
    X6 selector = new X6();
    selector.r30(new pg0_2(sm0_0.c0(6153), sm0_0.c0(6154), sm0_0.c0(6155)));
    selector.Bd(dw_2.aR);
    cn_0 action = new cn_0(null, 0);
    action.Sk(sm0_0.c0(6156));
    action.coM8(selector);
    panel.vx0(action).Rr0.vx0(selector);
    view.Yr = new lpt3__4(layout, () -> gi(view, selector), null, xX.Bm);
    if (this.d6.ez0 != null) {
        this.d6.ez0.xe0();
    }
    this.d6.ez0 = view;
    this.d6.F9(0, view);
    this.uc = new wf_0(pokemon, view);
}

   public final void Gg(int var1, int var2) {
      if (var1 >= 1 && var2 >= 1) {
         if (!Cr0.ED0()) {
            Cr0.qq = Thread.currentThread();
            gy0.info("Updating opengl thread info");
         }

         GG0 var3;
         if ((var3 = (GG0)tw0_0.Xl0.HV.get(0)) instanceof gz_1) {
            ((gz_1)var3).Cj0();
         }

         if (this.L7 != 1.0F) {
            ui_1 var8;
            var8 = new ui_1();
            this.B = var8;
            int var9 = (int)(lg_0.S4.Kr0() * this.L7);
            int var4 = (int)(lg_0.S4.sD0() * this.L7);
            PC0 var5;
            PC0 var10000 = var5 = new PC0();

            this.Uv0 = var5;
            var10000.Ka0(lg_0.S4.Kr0(), lg_0.S4.sD0(), true);
            this.B.Po(this.zv.iJ);
            System.out.println("Initializing GAME FBO " + var9 + " x " + var4);
            na_0 var19;
            var19 = new na_0(ix0_0.Vw, var9, var4, true);
            this.nB0 = var19;
         }

         if (this.wO != null) {
            bj0_0 var31 = this.FC0;
            bj0_0 var10001 = this.FC0;
            float var10 = lg_0.S4.sD0();
            var10001.qj = lg_0.S4.Kr0();
            var31.eY = var10;
            this.FC0.Yw0(lg_0.S4.Kr0(), lg_0.S4.sD0());
            qq_0 var32 = this.wf;
            this.wf.va = this.FC0;
            var32.Ii();
            this.Ik0.Po(this.Ag.iJ);
            up_2 var33 = this.mG0;
            up_2 var40 = this.mG0;
            float var10002 = lg_0.S4.Kr0() - tt0_0.j0.yJ();
            float var11 = lg_0.S4.sD0();
            var40.qj = var10002;
            var33.eY = var11;
            up_2 var34 = this.mG0;
            up_2 var41 = this.mG0;
            up_2 var43 = this.mG0;
            up_2 var10003 = this.mG0;
            int var10004 = tt0_0.j0.d6.Mx;
            byte var12 = 0;
            int var16 = lg_0.S4.Kr0() - tt0_0.j0.yJ();
            int var20 = lg_0.S4.sD0();
            var10003.df = var10004;
            var43.gS = var12;
            var41.Ty = var16;
            var34.Ja = var20;
            this.mG0.kF(true);
         } else {
            up_2 var35 = this.mG0;
            up_2 var42 = this.mG0;
            up_2 var44 = this.mG0;
            up_2 var45 = this.mG0;
            byte var13 = 0;
            int var17 = lg_0.S4.Kr0();
            int var21 = lg_0.S4.sD0();
            var45.df = 0;
            var44.gS = var13;
            var42.Ty = var17;
            var35.Ja = var21;
            this.mG0.Yw0(lg_0.S4.Kr0(), lg_0.S4.sD0());
         }

         if (tw0_0.hH0.K90) {
            this.Le0(tw0_0.kz0());
         }

         if (this.u10 != null) {
            this.d6.COm3();
            this.u10.COm3();
         }

         zk0_1 var14 = this.wO;
         if (this.wO != null) {
            var14.jR();
            this.wo.COm3();
         }

         BJ0 var36 = this.U1;
         float var15;
         this.U1.Ui = var15 = var1;
         float var18;
         var36.yG = var18 = var2;
         IC0 var22 = this.BK;
         if (this.BK != null) {
            var22.I30(var1, var2);
         }

         vo_2 var23 = this.Sc;
         if (this.Sc != null) {
            var23.Dt0(var1, var2);
         }

         XD var24 = this.no0;
         if (this.no0 != null) {
            var24.LPt6(var1, var2);
         }

         CX var25 = this.v5;
         if (this.v5 != null) {
            var36 = var25.GV;
            var25.GV.Ui = var15;
            var36.yG = var18;
         }

         Sr var26 = this.VW;
         if (this.VW != null) {
            var26.qL(var1, var2);
         }

         var1 = lg_0.S4.Kr0();
         var2 = lg_0.S4.sD0();
         Oz0 var27 = this.he0;
         if (this.he0 != null) {
            var27.aQ();
         }

         jn_2 var28 = this.hO;
         if (this.hO != null) {
            var28.LPt6(var1, var2);
         }

         wf_0 var29 = this.uc;
         if (this.uc != null) {
            var29.LPt6(var1, var2);
         }

         vj_0 var30 = this.qL0;
         if (this.qL0 != null) {
            var30.LPt6(var1, var2);
         }

         nf_0 var38 = nf_0.zo0();
         var38.COn.r6.An(var15, var18);
         var38.TK.r6.An(var15, var18);
         var38.QQ.r6.An(var15, var18);
         var38.ik.r6.An(var15, var18);
         this.zv.Ka0(var15, var18, false);
         this.zv.R1(true);
         this.IA.Po(this.zv.iJ);
         this.oL.Ka0(var15, var18, true);
         PC0 var39 = this.oL;
         this.oL.LH = 0.25F;
         var39.R1(true);
         this.Rl.An(var15, var18);
         tw0_0.lM.vl0();
         this.sy.oK0();
      }
   }

   public abstract void wy0();

   public final void resume() {
      this.Rg0 = true;
      if (dw_2.Sj) {
         bu_0 var1 = tw0_0.RE0;
         OE0 var2;
         if (tw0_0.RE0 != null && (var2 = var1.e00) != null) {
            var2.aw(ff0_0.Pd.wg());
            tw0_0.RE0.Jh0();
         }
      }
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void dispose() {
    if (this.nB0 != null) {
        this.nB0.dispose();
        this.nB0 = null;
    }
    if (this.X3 != null) {
        this.X3.dispose();
        this.X3 = null;
    }
    if (this.Sc != null) {
        this.Sc.dispose();
        this.Sc = null;
    }
    if (dw_2.Va) {
        dw_2.CY();
    }
    if (lpt2__0.s5) {
        lpt2__0.QE();
    }
    xs_0.bj0 = true;
    while (xs_0.YL != null && xs_0.YL.isAlive()) {
        try {
            Thread.sleep(5L);
        } catch (InterruptedException ignored) {
            Thread.currentThread().interrupt();
            break;
        }
    }
    tw0_0.lM.tA();
    z60_0 network = tw0_0.Wv0;
    if (network != null && network.HO) {
        try {
            for (Iterator iterator = network.PK.iterator(); iterator.hasNext();) {
                ((SelectionKey)iterator.next()).cancel();
            }
        } catch (Exception ignored) {
        }
        if (network.sm0 != null) {
            for (fk_1 dispatcher : network.sm0) {
                dispatcher.B0();
            }
        }
        if (network.N7 != null) {
            network.N7.B0();
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException ignored) {
            Thread.currentThread().interrupt();
        }
        if (network.sm0 != null) {
            for (fk_1 dispatcher : network.sm0) {
                for (Iterator iterator = dispatcher.ei0.keys().iterator(); iterator.hasNext();) {
                    SelectionKey key = (SelectionKey)iterator.next();
                    if (key.attachment() instanceof d50_0) {
                        ((d50_0)key.attachment()).yK0();
                    }
                }
                dispatcher.t90 = true;
                dispatcher.interrupt();
            }
        }
        if (network.N7 != null) {
            for (Iterator iterator = network.N7.ei0.keys().iterator(); iterator.hasNext();) {
                SelectionKey key = (SelectionKey)iterator.next();
                if (key.attachment() instanceof d50_0) {
                    ((d50_0)key.attachment()).yK0();
                }
            }
            network.N7.t90 = true;
            network.N7.interrupt();
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException ignored) {
            Thread.currentThread().interrupt();
        }
        z60_0.xo0.info("Networking shutdown successfully.");
    }
    try {
        lpt5__5.hL.Com4.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        lpt5__5.hL.Com4.shutdown();
        lpt5__5.hL.Com4.awaitTermination(50L, TimeUnit.MILLISECONDS);
        lpt5__5.r1.info("All ThreadPools are now stopped");
    } catch (InterruptedException exception) {
        lpt5__5.r1.error("Can't shutdown ThreadPoolManager", exception);
        Thread.currentThread().interrupt();
    }
}

   public final void Uk0(CX var1) {
      CX var2 = this.v5;
      if (this.v5 != null) {
         var2.dispose();
      }

      this.v5 = var1;
   }

   public final void S00(byte var1, byte var2, boolean var3) {
      Sr var4 = this.VW;
      if (this.VW != null) {
         var4.dispose();
         this.VW = null;
      }

      if (var3) {
         f4_0 var5;
         var5 = new f4_0(var1);
         this.VW = var5;
      } else if (var2 == 2) {
         gt_1 var6;
         var6 = new gt_1(var1);
         this.VW = var6;
      } else if (var2 == 3) {
         eg0_0 var7;
         var7 = new eg0_0(var1);
         this.VW = var7;
      } else if (var2 == 4) {
         yh0_2 var8;
         var8 = new yh0_2(var1);
         this.VW = var8;
      }
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final R40 cOM5(qq_0 resources, OX theme) {
        dl_1 log = gy0;
        log.info("Loading theme \"{}\"", theme.jH0);
        long startedAt = System.currentTimeMillis();
        float backFrameScale = (float)lg_0.S4.Kr0() / (float)lg_0.S4.cJ;
        log.info("backFrameScale: {}", Float.valueOf(backFrameScale));
        zb0_2.lPt8 = dw_2.tC0 ? this.Ew * backFrameScale : 1.0f;
        zb0_2.jM = !(LW.LH0(dw_2.Tf, 1.0f) || LW.LH0(dw_2.Tf, 0.5f));
        if (dw_2.tC0 && tw0_0.kz0()) {
            zb0_2.lPt8 = this.Ew;
        }
        HashMap<String, String> replacements = new HashMap<String, String>();
        String language = dw_2.con;
        if (language.contains("-")) {
            language = language.split("-")[0];
        }
        vs_2 defaultTheme = tw0_0.aB.r1("data/themes/default/");
        String effectivity = "res/effectivity_buttons_" + language + ".png";
        replacements.put("effectivity_buttons_lang", theme.jt.wp(effectivity).os0() || defaultTheme.R1(effectivity).os0() ? effectivity : "res/effectivity_buttons_en.png");
        String gameshop = "res/gameshop_" + language + ".png";
        replacements.put("gameshop_lang", theme.jt.wp(gameshop).os0() || defaultTheme.R1(gameshop).os0() ? gameshop : "res/gameshop_en.png");
        try {
            URL url = TwlGui.m(theme.jt.wp("theme.xml"));
            log.info("Theme url {}", url);
            R40 loaded = R40.EQ(url, resources, new cu0_0(resources), replacements);
            log.info("Loaded theme \"{}\" in {}", theme.jH0, Long.valueOf(System.currentTimeMillis() - startedAt));
            dw_2.TS(theme);
            return loaded;
        }
        catch (RuntimeException exception) {
            gy0.error("Unable to load theme \"{}\"", theme.jH0, exception);
            if (!theme.jH0.equals("android") && !theme.jH0.equals("default")) {
                tw0_0.uV.Ef0(sm0_0.c0(nf0_0.Cn0), sm0_0.wa0(nf0_0.lr0, theme.jH0), UE.nO, null, false);
                return this.cOM5(resources, dw_2.tG(tw0_0.Xy0() ? "android" : "default"));
            }
            throw new RuntimeException("Unable to load default theme", exception);
        }
    }
}
