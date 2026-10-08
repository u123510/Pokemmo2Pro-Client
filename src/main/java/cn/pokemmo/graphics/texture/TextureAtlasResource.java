package cn.pokemmo.graphics.texture;

import com.badlogic.gdx.graphics.Texture;
import f.*;
import java.util.Arrays;

/**
 * 现代化重构类 - 原始类: f.D30
 */
public class TextureAtlasResource implements fy0_0 {

   public final af_1 qh;
   public final es_1 kE;

   public TextureAtlasResource() {
      this.qh = new af_1(4);
      this.kE = new es_1();
   }

   public TextureAtlasResource(String var1) {
      this(lg_0.I70.cD0(var1));
   }

   public TextureAtlasResource(Dn0 var1) {
      this(var1, var1.Br());
   }

   public TextureAtlasResource(Dn0 var1, boolean var2) {
      this(var1, var1.Br(), var2);
   }

   public TextureAtlasResource(Dn0 var1, Dn0 var2) {
      this(var1, var2, false);
   }

   public TextureAtlasResource(Dn0 var1, Dn0 var2, boolean var3) {
      this(new w80_0(var1, var2, var3));
   }

   public TextureAtlasResource(w80_0 var1) {
      this.qh = new af_1(4);
      this.kE = new es_1();
      this.TR(var1);
   }

   public final void TR(w80_0 var1) {
      af_1 var2 = this.qh;
      int var3 = af_1.NK(this.qh.g1 + var1.Ow.KB, var2.gr);
      if (var2.if$.length < var3) {
         var2.aO(var3);
      }

      I2 var4 = var1.Ow.ZD();
      while (var4.hasNext()) {
         uj_2 var5 = (uj_2)var4.next();
         if (var5.u90 == null) {
            var5.u90 = new Texture(var5.u7, var5.jA0, var5.i8);
         }

         var5.u90.setFilter(var5.mF, var5.Zy);
         var5.u90.setWrap(var5.gO, var5.Ai);
         this.qh.MG0(var5.u90);
      }

      this.kE.Bv(var1.bg0.KB);
      I2 var6 = var1.bg0.ZD();
      while (var6.hasNext()) {
         K40 var7 = (K40)var6.next();
         int var8 = var7.H ? var7.wz : var7.vQ;
         int var9 = var7.H ? var7.vQ : var7.wz;
         yo_2 var10 = new yo_2(var7.wN.u90, var7.p5, var7.N1, var8, var9);
         var10.lw = var7.Nl;
         var10.oL = var7.Ew;
         var10.Z0 = var7.gr;
         var10.JN = var7.n;
         var10.BF0 = var7.F;
         var10.Xr0 = var7.dN;
         var10.yI = var7.H;
         var10.EY = var7.FH0;
         var10.cM = var7.rK;
         if (var7.tV) {
            var10.Wu0(false, true);
         }

         this.kE.Ue0(var10);
      }
   }

   @Override
   public final void dispose() {
      YH var1 = this.qh.xA0();
      while (var1.hasNext()) {
         ((Texture)var1.next()).dispose();
      }

      af_1 var2 = this.qh;
      int var3 = af_1.NK(0, var2.gr);
      Object[] var4 = var2.if$;
      if (var4.length <= var3) {
         if (var2.g1 != 0) {
            var2.g1 = 0;
            Arrays.fill(var4, null);
         }
      } else {
         var2.g1 = 0;
         var2.aO(var3);
      }
   }
}
