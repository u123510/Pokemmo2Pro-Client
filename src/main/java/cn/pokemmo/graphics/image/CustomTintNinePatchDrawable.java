package cn.pokemmo.graphics.image;

import f.*;

public class CustomTintNinePatchDrawable implements wl0_2, ix_1 {
    public static final boolean W4 = !CustomTintNinePatchDrawable.class.desiredAssertionStatus();
    public final wl0_2[] Ln;
    public final ww_2 nh;
    public final ux0_0 i7;

    public CustomTintNinePatchDrawable(ww_2 layout, ux0_0 scale, wl0_2... parts) {
        super();
        if (!W4) {
            if (parts.length < layout.X30()) {
                throw new AssertionError();
            }
            if (parts.length > layout.X30() + 1) {
                throw new AssertionError();
            }
        }
        this.Ln = parts;
        this.nh = layout;
        this.i7 = scale;
    }

    @Override
    public final int Nx() {
        return this.Ln[0].Nx();
    }

    @Override
    public final int Af() {
        return this.Ln[0].Af();
    }

    @Override
    public final void GO(VT target, int x, int y) {
        this.uf(target, x, y, this.Ln[0].Nx(), this.Ln[0].Af());
    }

    @Override
    public final void uf(rb_1 target, int x, int y, int width, int height) {
        int index = this.nh.Cy(target);
        if (index < this.Ln.length) {
            this.Ln[index].uf(target, x, y, width, height);
        }
    }

    @Override
    public final ux0_0 MY() {
        return this.i7;
    }

    @Override
    public final wl0_2 so(gn_0 color) {
        wl0_2[] transformed = new wl0_2[this.Ln.length];
        for (int i = 0; i < transformed.length; ++i) {
            transformed[i] = this.Ln[i].so(color);
        }
        return new CustomTintNinePatchDrawable(this.nh, this.i7, transformed);
    }

    @Override
    public final LPT6_ LT() {
        return null;
    }
}
