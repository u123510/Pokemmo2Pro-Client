package cn.pokemmo.ui.window.market;

import f.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 礼品点数商城窗口
 *
 * 原混淆类: f.LF0
 */
public class GiftShopWindow extends cx_0 implements tr_1  {
    public final LF0 asBridge() {
        return (LF0) (Object) this;
    }

   private static volatile boolean giftShopLayoutDumpWritten;
   private boolean giftShopContentMaxSizeReleased;
   public final P8 jB0;
   public P8 Oh0;
   public final xe_1 gd0;
   public HV[][] Kl0 = null;
   public le0_2 Eq;
   public final X6 Ko;
   public final cn_0 DW;
   public final cn_0 bn0;
   public boolean ip = false;

   public GiftShopWindow(BU var1) {
      super(tw0_0.kz0());
      ue0_2 var2;
      var2 = new ue0_2(var1);
      this.Pb0(var2);
      xe_1 var5 = new xe_1(sm0_0.c0(3003));
      this.gd0 = var5;
      var5.RR(new g80_0(asBridge()));
      byte var6 = 5;
      String[] var10 = new String[5];
      int[] var3;
      int[] var14 = var3 = new int[5];
      var14[0] = 3024;
      var14[1] = 3020;
      var14[2] = 3021;
      var14[3] = 3022;
      var14[4] = 3023;

      for (int var4 = 0; var4 < var6; var4++) {
         var10[var4] = sm0_0.c0(var3[var4]);
      }

      pg0_2 var7 = new pg0_2(var10);
      X6 var11 = new X6(var7);
      this.Ko = var11;
      var11.Bd(0);
      var11.Rm0(new o1(asBridge()));
      if (tw0_0.kz0()) {
         this.uf("mobile-gameshop");
      } else {
         this.uf("gameshop");
      }

      this.Hy(sm0_0.c0(3000));
      this.ff0(1);
      this.bD(true);
      P8 var8 = new P8();
      this.jB0 = var8;
      var8.I6(false);
      fy_2 var12 = new fy_2();
      var12.x40(XZ.BC0(var12.lo0(), new ya_1[]{var12.H10().qd(10).LPt3(var8)}, var12).Xq(var12.lo0().LPt3(var8)));
      cn_0 var9 = new cn_0(sm0_0.c0(3016));
      this.DW = var9;
      var9.uf("sortby");
      cn_0 var13 = new cn_0(sm0_0.c0(nf0_0.EC0));
      this.bn0 = var13;
      var13.uf("points");
      this.SL(var12);
      this.SL(this.gd0);
      this.SL(var11);
      this.SL(var9);
      this.SL(var13);
      this.Eq = null;
      this.update();
   }

   @Override
   public final boolean u3(le0_2 var1) {
      if (var1 == this.Eq) {
         this.Eq = null;
      }

      return super.u3(var1);
   }

   @Override
   public final void K8() {
      super.K8();
      if (tw0_0.kz0()) {
         this.kh0();
         this.bn0.lt0();
         this.bn0.A20(pa0_0.rr0, 20, 0);
         this.Ko.oY(200, 60);
         this.Ko.vf(pa0_0.dC0);
         this.DW.lt0();
         this.DW.E40(this.Ko.A20 - this.DW.Mx - 20, 15);
         this.gd0.lt0();
         this.gd0.A20(pa0_0.Ht0, -20, 0);
         super.Lr0.A20(pa0_0.Mk, 0, 0);
         super.r90 = 0;
      } else {
         if (!this.giftShopContentMaxSizeReleased) {
            this.jB0.g2(32767, 32767);
            this.jB0.K20.COm3();
            this.giftShopContentMaxSizeReleased = true;
         }

         if (!this.ip) {
            this.ip = true;
            this.vf(pa0_0.Ol);
         }

         this.DW.lt0();
         cn_0 var1;
         cn_0 var10000 = var1 = this.DW;
         int var10001 = super.Mx - 160 + super.A20 - var1.Mx;
         int var2 = super.SB0 + 60;
         var10000.E40(var10001, kq_0.lpT2(30, var1.OB, 2, var2));
         this.bn0.lt0();
         this.bn0.E40(super.A20 + 20, super.SB0 + 60);
         this.Ko.oY(120, 30);
         this.Ko.E40(super.Mx - 20 + super.A20 - this.Ko.Mx, super.SB0 + 58);
         this.gd0.RY(170, 32);
         this.gd0.lt0();
         this.gd0.E40(super.Mx - 10 + super.A20 - this.gd0.Mx, super.SB0 + 554);
         this.dumpGiftShopLayout();
      }
   }

   private void dumpGiftShopLayout() {
      if (giftShopLayoutDumpWritten || this.Kl0 == null || this.jB0.g6.isEmpty()) {
         return;
      }

      synchronized (LF0.class) {
         if (giftShopLayoutDumpWritten || this.Kl0 == null || this.jB0.g6.isEmpty()) {
            return;
         }

         Path output = Path.of(System.getProperty("user.dir"), "build", "tmp", "gift-shop-layout-tree.txt");

         try {
            Files.createDirectories(output.getParent());
            try (BufferedWriter writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8)) {
               writer.write("LF0 gameshop layout snapshot");
               writer.newLine();
               this.writeWidgetBounds(writer, "frame", this, 0, 0);
               this.writeWidgetBounds(writer, "reward-points-button", this.gd0, 0, 0);
               this.writeWidgetBounds(writer, "content-parent", this.jB0.K20, 0, 3);
               this.writeWidgetBounds(writer, "content-tabs", this.jB0, 0, 5);
            }
         } catch (IOException ignored) {
         }

         giftShopLayoutDumpWritten = true;
      }
   }

   private void writeWidgetBounds(BufferedWriter writer, String label, le0_2 widget, int depth, int remainingDepth) throws IOException {
      writer.write("  ".repeat(depth));
      writer.write(label + " class=" + widget.getClass().getName() + " x=" + widget.A20 + " y=" + widget.SB0 + " width=" + widget.Mx + " height=" + widget.OB + " min=" + widget.m0() + "x" + widget.rm0() + " max=" + widget.S2() + "x" + widget.KC0() + " children=" + widget.fU());
      writer.newLine();
      if (remainingDepth == 0) {
         return;
      }

      for (int index = 0; index < widget.fU(); index++) {
         this.writeWidgetBounds(writer, "child[" + index + "]", widget.qA(index), depth + 1, remainingDepth - 1);
      }
   }

   public final void update() {
      lg_0.k.lPT5(new ot0_0(asBridge()));
   }

   public final void Hn() {
      cn_0 var3 = this.bn0;
      StringBuilder var1 = new StringBuilder();
      var1 = ig_0.u9(3001, var1, ": ").append(tw0_0.rl.Cl.coN);
      String var2;
      if (tw0_0.rl.Cl.LPT9 > 0) {
         var2 = fp0_0.uD(new StringBuilder(" ("), tw0_0.rl.Cl.LPT9, ")");
      } else {
         var2 = "";
      }

      var3.Sk(var1.append(var2).append(" ").append(sm0_0.c0(3002)).append(".").toString());
   }

   @Override
   public final void x00() {
      lpt6__0.v90(this);
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      if (E00.ZU(var1.zu) && var1.iT()) {
         if (Qy0.af(this)) {
            return super.nd0(var1);
         }

         int var2 = var1.finally$;
         rp_0 var3 = rp_0.I90;
         if (rp_0.I90 != null && var3.Ov(var2)) {
            this.jB0.Lb(-1);
            return true;
         }

         var3 = rp_0.Ni;
         if (rp_0.Ni != null && var3.Ov(var2)) {
            this.jB0.Lb(1);
            return true;
         }

         var3 = rp_0.nK0;
         if (rp_0.nK0 != null && var3.Ov(var2)) {
            BU.T50.cx(false);
            return true;
         }
      }

      return super.nd0(var1);
   }
}
