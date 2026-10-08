package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class GdxMultiLayerTextureDrawable extends MD implements wl0_2, d9_0 {
    public final xu_1 Ph;
    public final gn_0 Ef;
    public final B5 dg;

    public GdxMultiLayerTextureDrawable(xu_1 v1, int i2, int i3, int i4, int i5, gn_0 v6) {
        super(i2, i3, i4, i5);
        this.Ph = v1;
        if (v6 == null) v6 = gn_0.WHITE;
        this.Ef = v6;
        Texture texture = v1.Sd;
        int offsetX = i4 > 0 ? 0 : -i4;
        i2 += offsetX;
        int offsetY = i5 > 0 ? 0 : -i5;
        i3 += offsetY;
        this.dg = new B5(texture, i2, i3, i4, i5);
        this.dg.Wu0(false, true);
    }

    public GdxMultiLayerTextureDrawable(GdxMultiLayerTextureDrawable v1, gn_0 v2) {
        super(v1);
        this.Ph = v1.Ph;
        this.Ef = v2;
        Texture texture = this.Ph.Sd;
        int width = this.zb;
        int offsetX = width > 0 ? 0 : -width;
        int x = this.Qj + offsetX;
        int height = this.iX;
        int offsetY = height > 0 ? 0 : -height;
        int y = this.gx0 + offsetY;
        this.dg = new B5(texture, x, y, width, height);
        this.dg.Wu0(false, true);
    }

    @Override
    public final void GO(VT v1, int i2, int i3) {
        uf(v1, i2, i3, this.zb, this.iX);
    }

    @Override
    public void uf(rb_1 v1, int i2, int i3, int i4, int i5) {
        ui_1 colorState = this.Ph.gd.zi;
        float color = qq_0.fe0;
        Color.abgr8888ToColor(colorState.oH, color);
        colorState.og = color;
        this.dg.Wx(this.Ph.gd.w70(this.Ef));
        this.dg.ss(i2, i3, i4, i5);
        this.dg.jN(colorState);
    }

    @Override
    public final void lpt4(rb_1 v1, int i2, int i3, int i4, int i5, int i6, int i7) {
        ui_1 colorState = this.Ph.gd.zi;
        float color = qq_0.fe0;
        Color.abgr8888ToColor(colorState.oH, color);
        colorState.og = color;
        this.dg.Wx(this.Ph.gd.w70(this.Ef));
        if (i6 * this.zb == i4 && i7 * this.iX == i5) {
            K8(i2, i3, i6, i7);
            return;
        }
        while (i7 > 0) {
            int tileHeight = i5 / i7;
            int previousX = 0;
            int tileIndex = 0;
            while (tileIndex < i6) {
                int nextX = ++tileIndex * i4 / i6;
                this.dg.ss(i2 + previousX, i3, nextX - previousX, tileHeight);
                this.dg.jN(colorState);
                previousX = nextX;
            }
            i3 += tileHeight;
            i5 -= tileHeight;
            i7--;
        }
    }

    public final void K8(int i1, int i2, int i3, int i4) {
        int tileWidth = this.zb;
        int tileHeight = this.iX;
        while (i4 > 0) {
            i4--;
            int x = i1;
            int columns = i3;
            while (columns > 0) {
                columns--;
                this.dg.ss(x, i2, tileWidth, tileHeight);
                this.dg.jN(this.Ph.gd.zi);
                x += tileWidth;
            }
            i2 += tileHeight;
        }
    }

    @Override
    public wl0_2 so(gn_0 v1) {
        if (v1 == null) throw new NullPointerException("color == null");
        gn_0 normalized = this.Ef.Uy(v1);
        if (normalized.equals(this.Ef)) return this;
        return new GdxMultiLayerTextureDrawable(this, normalized);
    }

    @Override
    public final LPT6_ LT() {
        return new LPT6_(this.dg.OB, this.dg.yQ, this.dg.Y60, this.dg.Yo, this.dg.Ll0);
    }
}
