package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import java.util.ArrayDeque;

public class GdxPixmapRenderQueue extends LJ0 {
    public static final ql_0 Z30 = new ql_0();
    public ArrayDeque oo;

    public GdxPixmapRenderQueue(int i1, int i2, ix0_0 ix0_0Var, int i4, boolean z) {
        this(i1, i2, ix0_0Var, i4, z, new d00_0());
    }

    public GdxPixmapRenderQueue(int i1, int i2, ix0_0 ix0_0Var, int i4, boolean z, vq0_0 vq0_0Var) {
        super(i1, i2, ix0_0Var, i4, z, vq0_0Var);
        this.oo = new ArrayDeque(1024);
    }

    public final synchronized ql_0 y9(String str, i4_0 v2) {
        if (v2 == null) {
            this.oo.add(new fn0_0());
            return Z30;
        }
        if (this.eb) {
            return null;
        }
        ql_0 ql_0Var = new ql_0(0.0f, 0.0f, (float) v2.XF.SH, (float) v2.XF.mB0);
        if (ql_0Var.IA > ((float) this.Tx) || ql_0Var.Eu0 > ((float) this.NZ)) {
            throw new nf_1("Page size too small for pixmap.");
        }
        ZO zo = this.sN.OC0(this, ql_0Var);
        int x = (int) ql_0Var.j80;
        int y = (int) ql_0Var.Wm0;
        int w = (int) ql_0Var.IA;
        int h = (int) ql_0Var.Eu0;
        if (this.WJ && !this.wp0 && zo.q5 != null && !zo.Rc0) {
            zo.q5.bind();
            lg_0.OH0.glTexSubImage2D(zo.q5.glTarget, 0, x, y, w, h, v2.Wc(), v2.t30(), v2.Rh0());
        } else {
            zo.Rc0 = true;
        }
        zo.WD0.Pa0(DF0.Ha0);
        zo.WD0.NH0(v2, x, y);
        if (this.wp0) {
            Gdx2DPixmap src = v2.XF;
            int srcW = src.SH;
            int srcH = src.mB0;
            zo.WD0.XF.Cg(src, 0, 0, 1, 1, x - 1, y - 1, 1, 1);
            zo.WD0.XF.Cg(v2.XF, srcW - 1, 0, 1, 1, x + w, y - 1, 1, 1);
            zo.WD0.XF.Cg(v2.XF, 0, srcH - 1, 1, 1, x - 1, y + h, 1, 1);
            zo.WD0.XF.Cg(v2.XF, srcW - 1, srcH - 1, 1, 1, x + w, y + h, 1, 1);
            zo.WD0.XF.Cg(v2.XF, 0, 0, srcW, 1, x, y - 1, w, 1);
            zo.WD0.XF.Cg(v2.XF, 0, srcH - 1, srcW, 1, x, y + h, w, 1);
            zo.WD0.XF.Cg(v2.XF, 0, 0, 1, srcH, x - 1, y, 1, h);
            zo.WD0.XF.Cg(v2.XF, srcW - 1, 0, 1, srcH, x + w, y, 1, h);
        }
        this.oo.add(new fn0_0(zo, x, y, w, h));
        return ql_0Var;
    }

    public final LPT6_ zV() {
        fn0_0 fn0_0Var = (fn0_0) this.oo.poll();
        if (fn0_0Var.Xl0) {
            return null;
        }
        return new LPT6_(fn0_0Var.au.q5, fn0_0Var.FE, fn0_0Var.Qt0, fn0_0Var.V, fn0_0Var.ph);
    }

    @Override
    public final synchronized void dispose() {
        super.dispose();
        I2 it = this.b6.ZD();
        while (it.hasNext()) {
            Texture texture = ((ZO) it.next()).q5;
            if (texture != null) {
                texture.dispose();
            }
        }
    }
}
