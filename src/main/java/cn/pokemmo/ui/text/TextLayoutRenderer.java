package cn.pokemmo.ui.text;

import com.badlogic.gdx.graphics.Color;
import f.*;

/**
 * 现代化重构类 - 原始类: f.Kd0
 */
public abstract class TextLayoutRenderer implements fy0_0 {

   public final jt0_0 aU;
   public final float n0;
   public final C3 Ft;
   public final ql_0 nJ;
   public final ql_0 Rx0 = new ql_0();
   public final boolean rZ;
   public final float[] G70 = new float[20];

   public TextLayoutRenderer(jt0_0 var1) {
      this(var1, 1.0F);
   }

   public TextLayoutRenderer(jt0_0 var1, float var2) {
      this.aU = var1;
      this.n0 = var2;
      this.nJ = new ql_0();
      this.Ft = new ui_1();
      this.rZ = true;
   }

   public TextLayoutRenderer(jt0_0 var1, C3 var2) {
      this(var1, 1.0F, var2);
   }

   public TextLayoutRenderer(jt0_0 var1, float var2, C3 var3) {
      this.aU = var1;
      this.n0 = var2;
      this.nJ = new ql_0();
      this.Ft = var3;
      this.rZ = false;
   }

   public final void dn(int[] var1) {
      qq_1.Oa = System.currentTimeMillis() - qq_1.D70;
      ((ui_1)this.Ft).W30();

      for (int var4 : var1) {
         this.A30((FF0)this.aU.Zl.wg.get(var4));
      }

      ((ui_1)this.Ft).end();
   }

   public final void A30(FF0 var1) {
      if (!var1.jg) {
         return;
      }
      if (var1 instanceof HF0) {
         fv_1 children = ((HF0)var1).Lc0;
         es_1 list = children.wg;
         for (int index = 0; index < list.KB; ++index) {
            FF0 child = (FF0)list.get(index);
            if (child.jg) {
               this.A30(child);
            }
         }
         return;
      }
      if (var1 instanceof X70) {
         this.R30((X70)var1);
         return;
      }
      if (!(var1 instanceof C5)) {
         I2 iterator = var1.sP.DE0.ZD();
         while (iterator.hasNext()) {
            iterator.next();
         }
         return;
      }

      C5 sprite = (C5)var1;
      Color color = ((ui_1)this.Ft).oH;
      float packedColor = Color.toFloatBits(color.r, color.g, color.b, color.a * sprite.GM);
      float[] vertices = this.G70;
      LPT6_ region = sprite.Am;
      if (region == null) {
         return;
      }
      float scale = this.n0;
      ql_0 viewport = this.nJ;
      float left = sprite.so * scale - (sprite.ep - 1.0F) * viewport.j80;
      float bottom = sprite.bk0 * scale - (sprite.OH - 1.0F) * viewport.Wm0;
      float right = region.bz * scale + left;
      float top = region.xZ * scale + bottom;
      this.Rx0.j80 = left;
      this.Rx0.Wm0 = bottom;
      this.Rx0.IA = right - left;
      this.Rx0.Eu0 = top - bottom;

      float viewportRight = viewport.j80 + viewport.IA;
      float viewportTop = viewport.Wm0 + viewport.Eu0;
      boolean fullyInside = left > viewport.j80
         && left < viewportRight
         && right > viewport.j80
         && right < viewportRight
         && bottom > viewport.Wm0
         && bottom < viewportTop
         && top > viewport.Wm0
         && top < viewportTop;
      boolean overlaps = viewport.j80 < right
         && viewportRight > left
         && viewport.Wm0 < top
         && viewportTop > bottom;
      if (!fullyInside && !overlaps) {
         return;
      }

      float u1 = region.yQ;
      float v1 = region.Ll0;
      float u2 = region.Yo;
      float v2 = region.Y60;
      vertices[0] = left;
      vertices[1] = bottom;
      vertices[2] = packedColor;
      vertices[3] = u1;
      vertices[4] = v1;
      vertices[5] = left;
      vertices[6] = top;
      vertices[7] = packedColor;
      vertices[8] = u1;
      vertices[9] = v2;
      vertices[10] = right;
      vertices[11] = top;
      vertices[12] = packedColor;
      vertices[13] = u2;
      vertices[14] = v2;
      vertices[15] = right;
      vertices[16] = bottom;
      vertices[17] = packedColor;
      vertices[18] = u2;
      vertices[19] = v1;
      this.Ft.Il0(region.OB, vertices, 20);
   }

   @Override
   public final void dispose() {
      if (this.rZ) {
         ((ui_1)this.Ft).dispose();
      }
   }

   public abstract void R30(X70 var1);
}
