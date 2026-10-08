package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class GdxSpriteNode extends bn_0 {
    public final P9 hQ;
    public final int kR;
    public float yh0;
    public float ar0;
    public float Le;
    public float Ef0;
    public YA Cx0;

    public GdxSpriteNode() {
        this((YA) null);
    }

    public GdxSpriteNode(pb_1 pb_1Var) {
        this(new ke0_2(pb_1Var), P9.iw, 1);
    }

    public GdxSpriteNode(LPT6_ lpt6_) {
        this(new si_2(lpt6_), P9.iw, 1);
    }

    public GdxSpriteNode(Texture texture) {
        this(new LPT6_(texture));
    }

    public GdxSpriteNode(A3 a3, String str) {
        this(a3.Y8(str), P9.iw, 1);
    }

    public GdxSpriteNode(YA ya) {
        this(ya, P9.iw, 1);
    }

    public GdxSpriteNode(YA ya, P9 p9) {
        this(ya, p9, 1);
    }

    public GdxSpriteNode(YA ya, P9 p9, int i) {
        tS(ya);
        this.hQ = p9;
        this.kR = i;
        DC(uq0(), Tn0());
    }

    @Override
    public final void Od() {
        YA ya = this.Cx0;
        if (ya == null) {
            return;
        }
        float prefW = ((br_1) ya).wv;
        float prefH = ((br_1) ya).u1;
        float width = this.E20;
        float height = this.TK0;
        Bp0 za = this.hQ.ZA(prefW, prefH, width, height);
        float scaleX = za.x;
        this.Le = scaleX;
        float scaleY = za.y;
        this.Ef0 = scaleY;
        int align = this.kR;
        if ((align & 8) != 0) {
            this.yh0 = 0.0f;
        } else if ((align & 16) != 0) {
            this.yh0 = (float) ((int) (width - scaleX));
        } else {
            this.yh0 = (float) ((int) ((width / 2.0f) - (scaleX / 2.0f)));
        }
        if ((align & 2) != 0) {
            this.ar0 = (float) ((int) (height - scaleY));
        } else if ((align & 4) != 0) {
            this.ar0 = 0.0f;
        } else {
            this.ar0 = (float) ((int) ((height / 2.0f) - (scaleY / 2.0f)));
        }
    }

    @Override
    public final void BS(ui_1 v1, float f2) {
        PD0();
        Color color = this.dC;
        v1.TJ0(color.r, color.g, color.b, color.a * f2);
        float x = this.cM0;
        float y = this.iG;
        float scaleX = this.cz0;
        float scaleY = this.SE0;
        YA ya = this.Cx0;
        if (ya instanceof sj0_0) {
            float rotation = this.uf0;
            if (scaleX != 1.0f || scaleY != 1.0f || rotation != 0.0f) {
                ((sj0_0) ya).pRN(v1, x + this.yh0, y + this.ar0, -this.yh0, -this.ar0, this.Le, this.Ef0, scaleX, scaleY, rotation);
                return;
            }
        }
        if (ya != null) {
            ya.Xd(v1, x + this.yh0, y + this.ar0, this.Le * scaleX, this.Ef0 * scaleY);
        }
    }

    public final void tS(YA v1) {
        if (this.Cx0 == v1) {
            return;
        }
        if (v1 != null) {
            if (uq0() != ((br_1) v1).wv || Tn0() != ((br_1) v1).u1) {
                KE0();
            }
        } else {
            KE0();
        }
        this.Cx0 = v1;
    }

    @Override
    public final float Q70() {
        return 0.0f;
    }

    @Override
    public final float n30() {
        return 0.0f;
    }

    @Override
    public final float uq0() {
        YA ya = this.Cx0;
        if (ya != null) {
            return ((br_1) ya).wv;
        }
        return 0.0f;
    }

    @Override
    public final float Tn0() {
        YA ya = this.Cx0;
        if (ya != null) {
            return ((br_1) ya).u1;
        }
        return 0.0f;
    }

    @Override
    public final String toString() {
        String name = getClass().getName();
        int lastDot = name.lastIndexOf(46);
        if (lastDot != -1) {
            name = name.substring(lastDot + 1);
        }
        StringBuilder sb = new StringBuilder();
        String prefix = name.indexOf(36) != -1 ? "Image " : "";
        sb.append(prefix);
        sb.append(name);
        sb.append(": ");
        sb.append(this.Cx0);
        return sb.toString();
    }
}
