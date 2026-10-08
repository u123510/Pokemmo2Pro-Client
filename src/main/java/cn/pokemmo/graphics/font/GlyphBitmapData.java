package cn.pokemmo.graphics.font;

/**
 * 字体字形位图原始像素数据 (Glyph Bitmap Data)
 *
 * 原混淆类: f.Jw
 */
public class GlyphBitmapData {
    public final int v7;
    public final int UD0;
    public final byte[] js0;

    public GlyphBitmapData(byte[] byArray, int n, int n2) {
        this.v7 = n;
        this.UD0 = n2;
        this.js0 = byArray;
    }
}
