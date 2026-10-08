package cn.pokemmo.graphics.image;

import f.*;

public class DynamicBorderNinePatchDrawable implements wl0_2, ix_1, d9_0 {
    public static final boolean u0 = !DynamicBorderNinePatchDrawable.class.desiredAssertionStatus();
    public final wl0_2 kI0;
    public final ux0_0 F50;
    public final boolean Wi;
    public final boolean kq0;
    public final d9_0 nt;

    public DynamicBorderNinePatchDrawable(wl0_2 delegate, ux0_0 texture, boolean repeatX, boolean repeatY) {
        if (!u0 && !repeatX && !repeatY) {
            throw new AssertionError();
        }
        this.kI0 = delegate;
        this.F50 = texture;
        this.Wi = repeatX;
        this.kq0 = repeatY;
        this.nt = delegate instanceof d9_0 ? (d9_0) delegate : this;
    }

    @Override
    public final int Nx() {
        return this.kI0.Nx();
    }

    @Override
    public final int Af() {
        return this.kI0.Af();
    }

    @Override
    public final void GO(VT batch, int x, int y) {
        this.kI0.GO(batch, x, y);
    }

    @Override
    public final void uf(rb_1 batch, int x, int y, int width, int height) {
        int columns = this.Wi ? Math.max(1, width / this.kI0.Nx()) : 1;
        int rows = this.kq0 ? Math.max(1, height / this.kI0.Af()) : 1;
        this.nt.lpt4(batch, x, y, width, height, columns, rows);
    }

    @Override
    public final void lpt4(rb_1 batch, int x, int y, int width, int height, int columns, int rows) {
        while (rows > 0) {
            int tileHeight = height / rows;
            int previousX = 0;
            int column = 0;
            while (column < columns) {
                int nextX = ++column * width / columns;
                this.kI0.uf(batch, x + previousX, y, nextX - previousX, tileHeight);
                previousX = nextX;
            }
            y += tileHeight;
            height -= tileHeight;
            rows--;
        }
    }

    @Override
    public final ux0_0 MY() {
        return this.F50;
    }

    @Override
    public final wl0_2 so(gn_0 color) {
        return new DynamicBorderNinePatchDrawable(this.kI0.so(color), this.F50, this.Wi, this.kq0);
    }

    @Override
    public final LPT6_ LT() {
        return null;
    }
}
