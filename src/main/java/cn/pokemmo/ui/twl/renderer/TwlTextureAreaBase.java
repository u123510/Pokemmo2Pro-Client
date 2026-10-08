package cn.pokemmo.ui.twl.renderer;

/**
 * TWL 纹理区域基类 (de.matthiasmann.twl.renderer.twl.TextureAreaBase)
 * 原始混淆类: f.MD
 */
public abstract class TwlTextureAreaBase {
    public final int x;
    public final int y;
    public final int width;
    public final int height;

    // 混淆字段别名兼容
    public final int Qj;
    public final int gx0;
    public final int zb;
    public final int iX;

    public TwlTextureAreaBase(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        this.Qj = x;
        this.gx0 = y;
        this.zb = width;
        this.iX = height;
    }

    public TwlTextureAreaBase(TwlTextureAreaBase src) {
        this(src.x, src.y, src.width, src.height);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public final int Nx() {
        return this.width;
    }

    public final int Af() {
        return this.height;
    }
}
