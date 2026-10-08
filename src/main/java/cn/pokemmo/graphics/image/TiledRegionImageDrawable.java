package cn.pokemmo.graphics.image;

import f.*;
import com.badlogic.gdx.graphics.Color;

public class TiledRegionImageDrawable extends GZ {
    public TiledRegionImageDrawable(xu_1 image, int x, int y, int width, int height, gn_0 color) {
        super(image, x, y, width, height, color);
    }

    public TiledRegionImageDrawable(TiledRegionImageDrawable source, gn_0 color) {
        super((GZ) source, color);
    }

    @Override
    public final void uf(rb_1 ignored, int x, int y, int width, int height) {
        this.Ph.gd.g50.VF(this.Ef);
        int columns = width / this.zb;
        int rows = height / this.iX;
        if (columns < 10 || rows < 10) {
            this.K8(x, y, columns, rows);
        }
        int remainderWidth = width - columns * this.zb;
        int remainderHeight = height - rows * this.iX;
        if (remainderWidth > 0 || remainderHeight > 0) {
            if (remainderWidth > 0 && rows > 0) {
                this.Fv(x + columns * this.zb, y, remainderWidth, this.iX, 1, rows);
            }
            if (remainderHeight > 0 && columns > 0) {
                this.Fv(x, y + rows * this.iX, this.zb, remainderHeight, columns, 1);
            }
            if (remainderWidth > 0 && remainderHeight > 0) {
                this.Fv(x + columns * this.zb, y + rows * this.iX,
                        remainderWidth, remainderHeight, 1, 1);
            }
        }
    }

    @Override
    public final wl0_2 so(gn_0 color) {
        if (color == null) {
            throw new NullPointerException("color");
        }
        gn_0 normalized = this.Ef.Uy(color);
        if (normalized.equals(this.Ef)) {
            return this;
        }
        return new TiledRegionImageDrawable(this, normalized);
    }

    public final void Fv(int x, int y, int width, int height, int columns, int rows) {
        Color.abgr8888ToColor(this.Ph.gd.zi.oH, qq_0.fe0);
        this.Ph.gd.zi.og = qq_0.fe0;
        while (rows-- > 0) {
            int cursor = x;
            int remaining = columns;
            while (remaining-- > 0) {
                this.dg.ss(cursor, y, width, height);
                this.dg.jN(this.Ph.gd.zi);
                cursor += width;
            }
            y += height;
        }
    }
}
