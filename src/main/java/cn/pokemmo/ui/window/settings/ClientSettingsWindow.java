package cn.pokemmo.ui.window.settings;

import f.*;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import org.libarchive.Libarchive;

/**
 * 控制键位、视频与ROM导入设置窗口
 *
 * 原混淆类: f.pj0_2
 */
public class ClientSettingsWindow extends cx_0 {
    public final pj0_2 asBridge() {
        return (pj0_2) (Object) this;
    }

   public static final dl_1 wM = Cq0.E1(pj0_2.class);
   public fy_2 Lg0;
   public boolean od = false;
   public qj0_2 lM;
   public float hT;
   public boolean jJ0;
   public final in_2 i7 = new in_2(100);
   public com8__0 vH;
   public xe_1 EE0;
   public final byte[] C60 = new byte[]{2, 0, 1, 3, 4};
   public final xe_1[] P = new xe_1[5];

   public final void f10() {
      byte var1 = 0;

      while (true) {
         byte[] var2 = this.C60;
         if (var1 >= this.C60.length) {
            return;
         }

         byte var3 = var2[var1];
         if (!tw0_0.Ll0.cOM4(var3) && (var3 != 4 || tw0_0.Ll0.t1 == null)) {
            if (var3 == 2) {
               this.P[var1].SU(sm0_0.c0(1168));
            } else {
               this.P[var1].SU(sm0_0.c0(1169));
            }
         } else {
            this.P[var1].SU(sm0_0.c0(1177));
         }

         var1++;
      }
   }

   public final void sv(Dn0 var1, byte var2, Consumer var3) {
      if (this.vH == null) {
         wM.info("Using experimental libarchive build");
         this.vH = new com8__0();
      }

      String var4 = "roms";
      lg_0.I70.getClass();
      VE var5 = new VE(var4, zv_1.kE);
      var5.A20();
      Dn0 var8 = var5.wp("importing.tmp");
      var8.sf();
      String var6;
      if (N50.Fc(var2)) {
         var6 = ".nds";
      } else {
         var6 = ".gba";
      }

      Dn0 var7 = var5.wp(var2 + "_" + System.currentTimeMillis() + var6 + "_import");
      qj0_2 var9 = new qj0_2(sm0_0.c0(1091));
      this.lM = var9;
      Qy0.yI0.F9(Qy0.yI0.fU(), var9);
      this.jJ0 = true;
      lpt5__5 var10 = lpt5__5.hL;
      var10.Com4.execute(() -> this.xC(var8, var1, var6, var7, var3, var2));
   }

   public final void Zx(Dn0 var1, byte var2, boolean var3) {
      String var4 = "roms";
      lg_0.I70.getClass();
      VE var5 = new VE(var4, zv_1.kE);
      var5.A20();
      Dn0 var11 = var5.wp("importing.tmp");
      var11.sf();
      StringBuilder var6 = new StringBuilder().append(var2);
      String var7;
      if (N50.Fc(var2)) {
         var7 = ".nds";
      } else {
         var7 = ".gba";
      }

      Dn0 var8;
      (var8 = var5.wp(var6.append(var7).append("_import").toString())).sf();
      qj0_2 var9 = new qj0_2(sm0_0.c0(1142));
      this.lM = var9;
      Qy0.yI0.F9(Qy0.yI0.fU(), var9);
      lpt5__5 var10 = lpt5__5.hL;
      var10.Com4.execute(() -> this.MV(var1, var11, var8, var2, var3));
   }

   public final void MV(Dn0 var1, Dn0 var2, Dn0 var3, byte var4, boolean var5) {
      InputStream in = null;
      OutputStream out = null;
      try {
         in = var1.uf0();
         out = var2.OC0();
         long total = var1.Nm0();
         byte[] buffer = new byte[1024];
         long copied = 0L;
         int count;
         while ((count = in.read(buffer)) != -1) {
            copied += count;
            this.hT = (float)copied / (float)total;
            out.write(buffer, 0, count);
         }
         in.close();
         out.close();
         if (!tw0_0.lM.dU(var2.l00())) {
            lg_0.k.lPT5(() -> G7(var2));
            return;
         }
         new Dn0(var2.l00()).jE0(var3);
         qj0_2 progress = this.lM;
         le0_2 parent = progress.K20;
         if (parent != null) {
            parent.u3(progress);
         }
         this.lM = null;
         String path = var3.l00().getAbsolutePath().replace("_import", "");
         switch (var4) {
            case 0: dw_2.COm9 = path; break;
            case 1: dw_2.e8 = path; break;
            case 2: dw_2.cx0 = path; break;
            case 3: dw_2.b1 = path; break;
            case 4: dw_2.zS = path; break;
            default: break;
         }
         dw_2.CY();
         if (var5) {
            var1.sf();
         }
      } catch (Exception ex) {
         var1.sf();
         var2.sf();
         lg_0.k.lPT5(pj0_2::LK);
      } finally {
         KT.E1(in);
         KT.E1(out);
      }
   }
   public final void EC(Dn0 var1, byte var2, W9 var3) {
      this.Zx(var1, var2, var3.ER.U20());
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public final void xC(Dn0 var1, Dn0 var2, String var3, Dn0 var4, Consumer var5, byte var6) {
      String sourcePath = var1.l00().getAbsolutePath();
      try {
         if (tw0_0.xj0() && !var2.getClass().equals(Dn0.class)) {
            this.vH.zv(sourcePath, var3);
            throw new NullPointerException();
         }
         com8__0 archive = this.vH;
         String archivePath = var2.l00().getAbsolutePath();
         com8__2 handle = Libarchive.ob();
         Libarchive.Sz0(handle);
         Libarchive.IU(handle);
         Q3 pathBuffer = new Q3("char", archivePath.length() + 1, true, true);
         pathBuffer.pN(archivePath.length());
         CHandler.setPointerAsString(pathBuffer.U9, archivePath);
         int result = Libarchive.Rp(handle, pathBuffer);
         if (result == 0) {
            result = archive.Ma(handle, sourcePath, var3);
         }
         wM.info("LibArchive extract code: {}", result);
         String error = archive.GR;
         if (error == null) {
            error = "";
         } else {
            archive.GR = null;
         }
         wM.info("Libarchive error string: {}", error);
         final int finalResult = result;
         lg_0.k.lPT5(() -> this.jP(finalResult, var2, var1, var4, var5, var6));
         this.jJ0 = false;
         this.hT = 1.0F;
         lg_0.k.lPT5(this::zb0);
      } catch (Throwable ex) {
         this.jJ0 = false;
         this.hT = 1.0F;
         lg_0.k.lPT5(this::zb0);
         throw ex;
      }
   }
   public final void zb0() {
      qj0_2 var1 = this.lM;
      le0_2 var2 = this.lM.K20;
      if (this.lM.K20 != null) {
         var2.u3(var1);
      }

      this.lM = null;
   }

   public final void jP(int var1, Dn0 var2, Dn0 var3, Dn0 var4, Consumer var5, byte var6) {
      if (var1 != 0) {
         if (var1 == 2) {
            Qy0.yI0.e80(sm0_0.wa0(1093, var2.l00().getAbsolutePath()), null);
         } else {
            Qy0 var10000 = Qy0.yI0;
            String[] var9;
            String[] var10001 = var9 = new String[2];
            var9[0] = String.valueOf(var1);
            var10001[1] = var2.l00().getAbsolutePath();
            var10000.e80(sm0_0.Bx(1090, var9), null);
         }
      } else if (!var3.os0()) {
         Qy0.yI0.e80(sm0_0.wa0(1092, var2.l00().getAbsolutePath()), null);
      } else if (!tw0_0.lM.dU(var3.l00())) {
         Qy0.yI0.e80(sm0_0.wa0(1094, var3.l00().getAbsolutePath()), null);
      } else {
         new Dn0(var3.l00()).jE0(var4);
         os0_0 var10003 = lg_0.I70;
         String var7 = var4.l00().getAbsolutePath();
         var10003.getClass();
         var5.accept(new VE(var7, zv_1.uq0));
         String var8 = var4.l00().getAbsolutePath().replace("_import", "");
         switch (var6) {
            case 0:
               dw_2.COm9 = var8;
               break;
            case 1:
               dw_2.e8 = var8;
               break;
            case 2:
               dw_2.cx0 = var8;
               break;
            case 3:
               dw_2.b1 = var8;
               break;
            case 4:
               dw_2.zS = var8;
         }

         dw_2.CY();
      }
   }

   public final void kv() {
      this.od = true;
      wi0_0.gm.getClass();
      if (tw0_0.Xy0()) {
         String var3 = "data/strings";
         lg_0.I70.getClass();
         Dn0[] var4;
         int var1 = (var4 = new VE(var3, zv_1.kE).gH0(".xml")).length;

         for (int var2 = 0; var2 < var1; var2++) {
            var4[var2].sf();
         }
      }

      Qy0.yI0.e80(sm0_0.c0(1165), null);
   }

   public final void nJ0() {
      Qy0 var10000 = Qy0.yI0;
      String var1 = sm0_0.c0(1188);
      var10000.e80(var1, () -> tw0_0.lM.mJ(this::X7));
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final boolean X7(Dn0 var1) {
      try {
         ws_0 descriptor = new ws_0(var1, 0);
         descriptor.pw(null);
         if (!var1.RL() && var1.os0() && descriptor.Vy0) {
            lg_0.I70.getClass();
            var1.WD0(new VE(new StringBuilder("data/strings/").append(descriptor.jM()).toString(), zv_1.kE));
            Qy0.yI0.e80(sm0_0.c0(1164), null);
            this.od = true;
         } else {
            Qy0.yI0.e80(sm0_0.c0(1166), null);
         }
      } catch (Exception ex) {
         Qy0.yI0.e80(sm0_0.c0(1166), null);
      }
      return false;
   }

   public final void Xz0(byte var1, String var2) {
      Qy0 var10000;
      label51: {
         if (var1 == 0 || var1 == 1) {
            qa0_1 var3;
            if ((var3 = tw0_0.Ll0.Pm0(var1)) == null) {
               var10000 = Qy0.yI0;
               break label51;
            }

            gz(var3.EZ.nu0, var3.hW);
         }

         if (var1 == 2) {
            nj0_0 var4 = tw0_0.Ll0.Qz0;
            if (tw0_0.Ll0.Qz0 == null) {
               var10000 = Qy0.yI0;
               break label51;
            }

            gz(var2, var4.lE);
         }

         if (var1 == 3) {
            Ts var5 = tw0_0.Ll0.nC0;
            if (tw0_0.Ll0.nC0 == null) {
               var10000 = Qy0.yI0;
               break label51;
            }

            gz(var2, var5.lE);
         }

         if (var1 != 4) {
            return;
         }

         UY var6 = tw0_0.Ll0.t1;
         if (tw0_0.Ll0.t1 != null) {
            gz(var2, var6.lE);
            return;
         }

         var10000 = Qy0.yI0;
      }

      var10000.e80(sm0_0.wa0(1186, var2), null);
   }

   public final boolean mh0(byte var1, Dn0 var2) {
      short var3 = 255;
      byte[] var4;
      var2.yM(var4 = new byte[255], var3);
      Iterator var5 = hr_1.GB0.iterator();

      ms_0 var6;
      label34:
      while (true) {
         if (var5.hasNext()) {
            ms_0 var10001 = var6 = (ms_0)var5.next();
            var10001.getClass();
            if (var3 < var10001.W7.length) {
               continue;
            }

            int var7 = 0;

            while (true) {
               byte[] var8 = var6.W7;
               if (var7 >= var6.W7.length) {
                  break label34;
               }

               if (var8[var7] != var4[var7]) {
                  continue label34;
               }

               var7++;
            }
         }

         var6 = null;
         break;
      }

      if (var6 != null) {
         if (!var6.Pr0) {
            Qy0.yI0.e80(sm0_0.wa0(1089, var6.Cv), null);
            return false;
         } else {
            Consumer var9 = var2x -> {
               Dn0 candidate = (Dn0)var2x;
               if (!this.Le0(candidate, var1, true)) {
                  candidate.sf();
               }
            };
            this.sv(var2, var1, var9);
            return false;
         }
      } else {
         return this.Le0(var2, var1, false);
      }
   }

   public final void uc0(String[] var1, X6 var2) {
      String var5;
      if ((var5 = var1[var2.mu0.Mw0]) != null && !dw_2.con.equalsIgnoreCase(var5) && wi0_0.gm.CP(var5)) {
         dw_2.con = var5;
         dw_2.m70 = true;
         dw_2.CY();
         this.od = true;
         this.uq();
         Qy0 var3 = Qy0.yI0;
         LPt2_ var4;
         if (Qy0.yI0 != null && (var4 = var3.G30) != null) {
            var4.Nul();
         }
      }
   }

   public final void close() {
      if (tw0_0.Ll0.Qz0 == null) {
         Qy0.yI0.e80(sm0_0.wa0(1178, sm0_0.c0(92)), null);
      } else if (this.od) {
         NR var3 = tw0_0.lM;
         tw0_0.lM.getClass();
         Qy0 var1 = Qy0.yI0;
         if (Qy0.yI0 == null) {
            var3.Pd0();
         } else {
            String var4 = sm0_0.c0(1179);
      Qu0 var2 = new Qu0(var3);
            var1.e80(var4, var2);
         }
      } else {
         this.xe0();
      }
   }

   @Override
   public final void HP(zk0_1 var1) {
      super.HP(var1);
      if (this.lM != null && this.i7.ty0()) {
         if (this.jJ0) {
            com8__0 var2;
            this.lM.Rs0((float)(var2 = this.vH).xA0 / (float)var2.f9);
         } else {
            this.lM.Rs0(this.hT);
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final boolean Le0(Dn0 var1, byte var2, boolean var3) {
      String displayName = var1.o30();
      long sizeMb = var1.Nm0() / 1048576L;
      wM.info("Possible rom {} (size: {} MB)", displayName, sizeMb);
      String kindName = sm0_0.c0(var2 + 90);
      if (N50.Aa(var2)) {
         try {
            qa0_1 rom = new qa0_1(var1);
            if (rom.EZ == null) {
               return false;
            }
            if (rom.rt0() != var2) {
               Qy0.yI0.e80(sm0_0.Bx(1183, new String[]{var1.el(), kindName}), null);
               return false;
            }
            this.od = true;
            if (var2 == 1) {
               dw_2.e8 = var1.el();
               dw_2.CY();
               tw0_0.Ll0.LPT2 = rom;
            } else {
               dw_2.COm9 = var1.el();
               dw_2.CY();
               tw0_0.Ll0.YB0 = rom;
            }
            this.hc(var1, var2, var3);
            return true;
         } catch (RD ex) {
            ex.printStackTrace();
            Qy0.yI0.e80(sm0_0.wa0(nf0_0.bC0, kindName), null);
            return false;
         } catch (Exception ex) {
            ex.printStackTrace();
            if (aa0_2.lF(ex)) {
               wM.error("OutOfMemoryError loading rom", ex);
               Qy0.yI0.e80(sm0_0.c0(nf0_0.cs0), null);
            } else {
               Qy0.yI0.e80(sm0_0.Bx(1182, new String[]{var1.o30(), kindName}), null);
            }
            return false;
         }
      }

      try {
         cp_0 rom = new cp_0(var1);
         if (var2 == 2 && Arrays.asList(nj0_0.tN).contains(rom.ie)) {
            nj0_0 nds = new nj0_0(var1);
            nds.jx();
            tw0_0.Ll0.Qz0 = nds;
            this.od = true;
            dw_2.cx0 = var1.el();
            dw_2.oN = true;
            dw_2.CY();
            this.hc(var1, var2, var3);
            return true;
         }
         if (var2 == 4 && Arrays.asList(UY.qk0).contains(rom.ie)) {
            UY gba = new UY(var1);
            gba.jx();
            tw0_0.Ll0.t1 = gba;
            this.od = true;
            dw_2.zS = var1.el();
            dw_2.CY();
            this.hc(var1, var2, var3);
            return true;
         }
         if (var2 == 3 && Arrays.asList(Ts.yi).contains(rom.ie)) {
            Ts gba = new Ts(var1);
            gba.jx();
            tw0_0.Ll0.nC0 = gba;
            this.od = true;
            dw_2.b1 = var1.el();
            dw_2.oN = true;
            dw_2.CY();
            this.hc(var1, var2, var3);
            return true;
         }
      } catch (xk0_1 ex) {
         return false;
      } catch (Exception ex) {
         wM.error("Error loading rom", ex);
         if (aa0_2.lF(ex)) {
            Qy0.yI0.e80(sm0_0.c0(nf0_0.cs0), null);
         }
         return false;
      }
      Qy0.yI0.e80(sm0_0.Bx(1183, new String[]{var1.o30(), kindName}), null);
      return false;
   }
   public final void hc(Dn0 var1, byte var2, boolean var3) {
      Qy0.yI0.dk(-1, sm0_0.wa0(1184, sm0_0.c0(var2 + 90)));
      this.f10();
      if (!tw0_0.Xy0()) {
         tw0_0.lM.getClass();
         if (NR.dy0 == com5__4.a7) {
            return;
         }
      }

      if (!var3) {
         zc0_1 var9;
         zc0_1 var10000 = var9 = new zc0_1();
         // Constructor emitted by VineFlower is folded into the allocation above.
         cn_0 var4;
         cn_0 var10003 = var4 = new cn_0(null, 0);
         String var5 = sm0_0.c0(1140);
         // Constructor emitted by VineFlower is folded into the allocation above.
         var10003.Sk(var5);
         var10000.qG0(var4);
         W9 var10;
         var10 = new W9();
         cn_0 var11;
         cn_0 var10002 = var11 = new cn_0(null, 0);
         String var6 = sm0_0.c0(1141);
         // Constructor emitted by VineFlower is folded into the allocation above.
         var10002.Sk(var6);
         var10000.L4.X20(var9.hb(var10, var11));
         var10000.pJ0.X20(new I7(var9).Ze0().Kn0(var10).qd(10).LPt3(var11).Ze0());
         Qy0 var12 = Qy0.yI0;
          Runnable var7 = () -> this.EC(var1, var2, var10);
         xX var8 = xX.Bm;
         lpt3__4 var10001 = new lpt3__4(var9, var7, null, var8);
         var10001.D80 = true;
         var12.sr0(var10001);
      }
   }

   @Override
   public final void K8() {
      if (tw0_0.kz0()) {
         this.kh0();
      }

      super.K8();
      if (tw0_0.Xy0() && tw0_0.kz0()) {
         this.EE0.lt0();
         this.EE0.A20(pa0_0.Mk, -68, 0);
      }
   }

   public final void uq() {
      fy_2 var1 = this.Lg0;
      if (this.Lg0 != null) {
         this.u3(var1);
         this.u3(this.EE0);
      }

      this.Hy(sm0_0.c0(1175));
         var1 = new fy_2();
      this.Lg0 = var1;
      xe_1 var13 = new xe_1(sm0_0.c0(65));
      xe_1 var10000 = var13;
      var10000.RR(this::close);
      xe_1 var2;
      var10000 = var2 = new xe_1(sm0_0.c0(65));
      this.EE0 = var2;
      var10000.RR(pj0_2::As);
      var10000 = var2 = new xe_1(sm0_0.c0(1174));
      var10000.yj0 = sm0_0.c0(1173);
      var10000.yB0();
      var10000.GH0 = 150;
      var10000.RR(() -> tw0_0.lM.n2(new File("roms/")));
      fy_2 var3 = new fy_2();
      fy_2 var34 = var3;
      var34.uf("dialoglayout");
      I7 var4;
      var4 = new I7(var3);
      Hm0 var5;
      var5 = new Hm0(var3);
      cn_0 var6;
      cn_0 var35 = var6 = new cn_0(null, 0);
      String var7 = sm0_0.c0(1332);
      var35.Sk(var7);
      var35.uf("label-settings-title");
      int var8;
      String[] var22;
      String[] var9 = new String[var8 = (var22 = wi0_0.gm.V4()).length];
      int var10 = -1;

      for (int var11 = 0; var11 < var8; var11++) {
         var9[var11] = wi0_0.gm.IE0(var22[var11]);
         if (dw_2.con.equalsIgnoreCase(var22[var11])) {
            var10 = var11;
         }
      }

      pg0_2 var25;
      var25 = new pg0_2((Object[])var9);
      X6 var27;
      X6 var10001 = var27 = new X6();
      var10001.r30(var25);
      if (var10 > -1) {
         var27.Bd(var10);
      }

      var27.Rm0(() -> this.uc0(var9, var27));
      var4.X20(var3.hb(var6, var27));
      var5.X20(var3.C7(var6, var27).qd(5));
      byte var21 = 0;

      while (true) {
         byte[] var23 = this.C60;
         if (var21 >= this.C60.length) {
            this.f10();
            if (!tw0_0.kz0()) {
               var4.qd(5).X20(new Hm0(var3).LPt3(var2, var13)).qd(5);
               var5.X20(var3.C7(var2).Ze0().LPt3(var13).qd(5));
            }

            if (tw0_0.Xy0()) {
                xe_1 var14 = new xe_1(sm0_0.c0(1162));
                xe_1 var10002 = var14;
               var10002.RR(this::nJ0);
                var10002 = var2 = new xe_1(sm0_0.c0(1163));
               var10002.RR(this::kv);
               var4.qd(5).X20(new Hm0(var3).LPt3(var14, var2)).qd(5);
               var5.X20(new I7(var3).Ze0().LPt3(var14, var2).qd(5));
            }

            var3.x40(var4);
            var3.WQ(var5);
            fy_2 var36 = var1 = this.Lg0;
            this.Lg0.getClass();
            var36.x40(new I7(var1).Ze0().Kn0(var3).Ze0());
            fy_2 var37 = var1 = this.Lg0;
            this.Lg0.getClass();
            var37.WQ(new I7(var1).Ze0().Kn0(var3).Ze0());
            var1 = this.Lg0;
            this.F9(this.fU(), var1);
            lg_0.k.getClass();
            if ((hb0_2.BN == hb0_2.XU || tw0_0.xj0()) && tw0_0.kz0()) {
               this.EE0.uf("mobile-gear-icon");
               this.EE0.SU("");
               xe_1 var18 = this.EE0;
               this.F9(this.fU(), var18);
            }

            return;
         }

         byte var24;
         String var26 = sm0_0.c0((var24 = var23[var21]) + 90);
         cn_0 var28;
         cn_0 var10005 = var28 = new cn_0(null, 0);
         String var29 = QA0.W0(var26, ":");
         var10005.Sk(var29);
         var10005.uf("label-settings-title");
         xe_1 var30 = new xe_1(sm0_0.c0(1176));
         xe_1 var39 = var30;
          final byte settingType = var24;
          var39.RR(() -> tw0_0.lM.mJ(file -> this.mh0(settingType, file)));
         xe_1[] var40 = this.P;
         xe_1 var31;
         var31 = new xe_1(null, false, null);
         var40[var21] = var31;
          final xe_1 settingButton = this.P[var21];
          final byte settingId = var24;
          this.P[var21].RR(() -> this.Xz0(settingId, var26));
         var4.X20(var3.hb(var28, var30, this.P[var21]));
         var5.X20(var3.C7(var28, var30, this.P[var21]).qd(5));
         var21++;
      }
   }

   public ClientSettingsWindow() {
      super(tw0_0.kz0(), false);
      this.Pb0(this::close);
      this.ff0(1);
      this.bD(false);
      this.uf("rom-panel");
      l6_0 var1 = l6_0.F0;
      if (!tw0_0.lM.rs(l6_0.F0)) {
         Qy0.Sq().dk(10000, tw0_0.lM.L60(var1));
      }

      this.uq();
   }

   public static void G7(Dn0 var0) {
      Qy0.yI0.e80(sm0_0.wa0(1094, var0.l00().getAbsolutePath()), null);
   }

   public static void As() {
      Qy0 var10000;
      String var10001;
      if (tw0_0.In0) {
         tw0_0.In0 = false;
         var10000 = Qy0.yI0;
         var10001 = sm0_0.c0(1088);
      } else {
         tw0_0.In0 = true;
         var10000 = Qy0.yI0;
         var10001 = sm0_0.c0(1087);
      }

      var10000.dk(-1, var10001);
   }

   public static void LK() {
      Qy0.yI0.dk(-1, sm0_0.c0(1143));
   }

   public static void gz(String var0, Dn0 var1) {
      String var3;
      if ((var3 = var1.toString()) != null && !var3.isEmpty()) {
         Qy0 var5 = Qy0.yI0;
         String[] var2;
         String[] var6 = var2 = new String[3];
         var6[0] = var0;
         var6[1] = var3;
         var6[2] = "--";
         var5.e80(sm0_0.Bx(1185, var2), null);
      } else {
         Qy0 var10000 = Qy0.yI0;
         String[] var4;
         String[] var10001 = var4 = new String[2];
         var10001[0] = var0;
         var10001[1] = "UNKNOWN";
         var10000.e80(sm0_0.Bx(1185, var4), null);
      }
   }
}
