package cn.pokemmo.ui.twl.renderer;

import f.*;
import cn.pokemmo.ui.twl.core.*;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.freetype.az0;
import com.badlogic.gdx.graphics.g2d.freetype.rH;
import java.util.logging.Logger;

/** FreeType-backed TWL font, reconstructed from 28887-renamed.jar bytecode. */
/**
 * FreeType 矢量字体渲染器 (TWLFont)
 */
public class TwlFont implements Y30 {
    public static float lPt8 = 1.0f;
    public static boolean jM;
    public static String vh0;
    public static boolean q3 = true;
    public qq_0 ZW;
    public final h2_0[] yv;
    public final ww_2 kq;
    public final String AUX;
    public final boolean wr;
    public final TwlFont JY;
    public final Dn0 Pr;
    public Dn0[] e4;
    public final String[] n80;
    public final int Ip0;
    public final boolean vI;
    public final s60_0 yx0;
    public M70 H30;
    public rH[] mk;
    public az0[] Da;
    public sc_0 No0;
    public sc_0[] G5;
    public lpt3__5 cM;
    public final pm_0 Zu0;
    public final Dr0[] qf;
    public boolean Yh;
    public boolean uM;
    public final boolean O60;

    public final int Fz0() {
        if (vh0 != null && this.n80.length > 1) {
            for (int index = 0; index < this.n80.length; index++) {
                if (this.n80[index].equalsIgnoreCase(vh0)) return index;
            }
        }
        return 0;
    }

    public void init(R40 renderer) {
        if (this.Yh) return;
        this.Yh = true;
        if (this.wr) {
            this.JY.init(renderer);
            this.ZW = this.JY.ZW;
            this.Da = this.JY.Da;
            this.No0 = this.JY.No0;
            this.G5 = this.JY.G5;
            return;
        }
        Logger.getLogger(TwlFont.class.getName()).info("Generating atlas for font " + this.Pr.o30());
        float scale = lPt8;
        if (scale <= 0.001f) scale = 1.0f;
        pm_0 parameter = this.Zu0;
        parameter.ru = (int)(parameter.ru / scale);
        if (parameter.ru < 3) parameter.ru = 3;
        parameter.nb = (int)(parameter.nb / scale);
        parameter.hA = (int)(parameter.hA / scale);
        parameter.oF /= scale;
        if (jM) {
            parameter.OY = eb0_1.jc0;
            parameter.LN = eb0_1.jc0;
        }
        if (parameter.fp) {
            if (this.vI) {
                parameter.HD = new LJ0(2048, 2048, ix0_0.Vw, 1, false);
            } else {
                LJ0 atlas = renderer.Wz;
                if (atlas == null) {
                    atlas = new LJ0(1024, 1024, ix0_0.Vw, 1, false, new _return());
                    renderer.Wz = atlas;
                    atlas.jZ.set(Color.WHITE);
                    atlas.jZ.a = 0.0f;
                }
                parameter.HD = atlas;
            }
        }
        this.e4 = new Dn0[0];
        if (this.Zu0.fp) {
            if (this.Pr.o30().equals("NotoSansCJK-Medium.ttc")) {
                this.e4 = new Dn0[] {this.Pr.Br().wp("NotoSans-Medium.ttf")};
            } else if (this.Pr.o30().equals("NotoSansCJK-Bold.ttc")) {
                this.e4 = new Dn0[] {this.Pr.Br().wp("NotoSans-Bold.ttf")};
            }
        }
        this.G5 = new sc_0[this.e4.length];
        this.Da = new az0[this.e4.length];
        this.mk = new rH[this.e4.length];
        for (int index = 0; index < this.G5.length; index++) {
            this.Da[index] = this.yx0.Gk0(this.e4[index], 0);
            this.mk[index] = new rH();
            this.G5[index] = this.Da[index].Ab(this.Zu0, this.mk[index]);
        }
        this.H30 = new M70((zb0_2) this);
        this.No0 = this.yx0.Gk0(this.Pr, this.Ip0).Ab(this.Zu0, this.H30);
        this.H30.oj = this.O60;
        for (int index = 0; index < this.G5.length; index++) {
            mh0_0 data = this.G5[index].U5;
            data.go = this.H30.go;
            data.g4 = this.H30.g4;
            data.sB0 = this.H30.sB0;
            data.ce = this.H30.ce;
            data.U7 = this.H30.U7;
            data.Mt = this.H30.Mt;
            data.CM = this.H30.CM;
            data.Hf = this.H30.Hf;
        }
        if (!LW.LH0(scale, 1.0f)) {
            this.No0.lg0 = false;
            this.No0.Rh.Ln0 = false;
        }
        this.H30.dK0(scale);
        this.cM = new lpt3__5();
        for (int index = 0; index < this.qf.length; index++) this.yv[index] = new h2_0(this.qf[index]);
    }

    public String getName() { return this.AUX; }
    public boolean isMarkupEnabled() { return this.O60; }
    public Y30 clone(String name, ww_2 selector, Dr0... colors) { return new zb0_2(name, (zb0_2) this, selector, colors); }
    public sc_0 getFont() { return this.No0; }
    public rH getFreeTypeFontData() { return this.H30; }
    public ui_1 getBatch() { return this.ZW.zi; }

    public void destroy() {
        if (this.uM) return;
        this.uM = true;
        if (this.wr) return;
        this.H30.dispose();
        this.No0.dispose();
        this.yx0.G3(this.Pr, this.Ip0);
        for (int index = 0; index < this.e4.length; index++) {
            this.mk[index].dispose();
            this.G5[index].dispose();
            this.yx0.G3(this.e4[index], 0);
        }
    }

    public boolean isProportional() { return false; }
    public int getSpaceWidth() { return (int)this.No0.U5.CM; }
    public int getLineHeight() { return (int)this.No0.U5.go; }
    public float getLineHeightF() { return this.No0.U5.go; }
    public int getBaseLine() { return (int)this.No0.U5.sB0; }
    public int getEM() { return (int)this.No0.U5.go; }
    public int getEX() { return (int)this.No0.U5.Hf; }

    public int drawText(rb_1 color, int x, int y, CharSequence text) { return this.drawText(color, x, y, text, 0, text.length()); }

    public int drawText(rb_1 color, int x, int y, CharSequence text, int start, int end) {
        h2_0 colorInfo = this.yv[this.kq.Cy(color)];
        x += colorInfo.JV;
        y += colorInfo.a0;
        this.No0.Rh.pk.set(this.ZW.w70(colorInfo.Ye0));
        this.No0.Rh.xT();
        lpt3__5 layout = this.No0.Rh.hG0(text, x, y, start, end, 0.0f, 8, false, null);
        this.No0.Rh.uq(this.ZW.zi);
        return (int)layout.PRN;
    }

    public int drawMultiLineText(rb_1 color, int x, int y, CharSequence text, int width, jh_0 alignment) {
        h2_0 colorInfo = this.yv[this.kq.Cy(color)];
        x += colorInfo.JV;
        y += colorInfo.a0;
        int flags = alignment.ordinal() == 1 ? 1 : alignment.ordinal() == 2 ? 16 : 8;
        this.No0.Rh.pk.set(this.ZW.w70(colorInfo.Ye0));
        this.No0.Rh.xT();
        lpt3__5 layout = this.No0.Rh.hG0(text, x, y, 0, text.length(), width, flags, true, null);
        this.No0.Rh.uq(this.ZW.zi);
        return (int)layout.PRN;
    }

    public void drawFromCache(ft0_0 cache, rb_1 color, int x, int y) {
        h2_0 colorInfo = this.yv[this.kq.Cy(color)];
        x += colorInfo.JV;
        y += colorInfo.a0;
        float packedColor = this.ZW.w70(colorInfo.Ye0).toFloatBits();
        for (int page = 0; page < cache.mK.length; page++) {
            float[] vertices = cache.mK[page];
            for (int vertex = 2; vertex < cache.a6[page]; vertex += 5) vertices[vertex] = packedColor;
        }
        float deltaY = y - cache.EV;
        float deltaX = x - cache.so;
        if (deltaX != 0.0f || deltaY != 0.0f) {
            if (cache.Ln0) {
                deltaX = Math.round(deltaX);
                deltaY = Math.round(deltaY);
            }
            cache.so += deltaX;
            cache.EV += deltaY;
            for (int page = 0; page < cache.mK.length; page++) {
                float[] vertices = cache.mK[page];
                for (int vertex = 0; vertex < cache.a6[page]; vertex += 5) {
                    vertices[vertex] += deltaX;
                    vertices[vertex + 1] += deltaY;
                }
            }
        }
        cache.uq(this.ZW.zi);
    }

    public int computeVisibleGlpyhs(CharSequence text, int start, int end, int availableWidth) {
        int width = 0;
        th_1 previous = null;
        int index;
        for (index = start; index < end; index++) {
            char character = text.charAt(index);
            th_1 glyph = this.No0.U5.jm0(character);
            if (glyph == null) continue;
            if (previous != null) {
                byte[] kerning = previous.LS == null ? null : previous.LS[character >>> 9];
                width += kerning == null ? 0 : kerning[character & 511];
            }
            if (this.isProportional()) {
                if ((width += glyph.V80) > availableWidth) break;
            } else {
                if (width + glyph.k + glyph.kJ0 > availableWidth) break;
                width += glyph.V80;
            }
            previous = glyph;
        }
        return index - start;
    }

    public int computeTextWidth(CharSequence text) {
        this.cM.oz(this.No0, text);
        return (int)Math.ceil(this.cM.PRN + 0.5f);
    }
    public int computeTextWidth(CharSequence text, int start, int end) {
        if (end >= text.length()) end = text.length();
        this.cM.cc(this.No0, text, start, end, this.No0.Rh.pk, 0.0f, 8, false, null);
        return (int)Math.ceil(this.cM.PRN + 0.5f);
    }
    public int computeMultiLineTextWidth(CharSequence text) {
        this.cM.cc(this.No0, text, 0, text.length(), this.No0.Rh.pk, 0.0f, 8, false, null);
        return (int)Math.ceil(this.cM.PRN + 0.5f);
    }
    public int computeMultiLineTextWidth(CharSequence text, int width, boolean flag) {
        this.cM.cc(this.No0, text, 0, text.length(), this.No0.Rh.pk, 0.0f, 8, flag, null);
        return (int)Math.ceil(this.cM.PRN + 0.5f);
    }

    public lpt3__5 cacheText(ft0_0 cache, CharSequence text) { return this.cacheText(cache, text, 0, text.length()); }
    public lpt3__5 cacheText(ft0_0 cache, CharSequence text, int start, int end) {
        if (cache == null) cache = new ft0_0(this.No0, this.No0.lg0);
        cache.xT();
        lpt3__5 layout = cache.hG0(text, 0.0f, 0.0f, start, end, 0.0f, 8, false, null);
        mh0_0 data = this.No0.U5;
        layout.gv0 = layout.gv0 - data.g4 + data.go;
        return layout;
    }
    public lpt3__5 cacheMultiLineText(ft0_0 cache, CharSequence text, int width, jh_0 alignment) { return this.cacheMultiLineText(cache, text, width, alignment, null); }
    public lpt3__5 cacheMultiLineText(ft0_0 cache, CharSequence text, int width, jh_0 alignment, String markup) { return this.cacheMultiLineText(cache, text, width, alignment, false, markup); }
    public lpt3__5 cacheMultiLineText(ft0_0 cache, CharSequence text, int width, jh_0 alignment, boolean flag, String markup) {
        int flags = alignment.ordinal() == 1 ? 1 : alignment.ordinal() == 2 ? 16 : 8;
        if (cache == null) cache = new ft0_0(this.No0, this.No0.lg0);
        cache.xT();
        return cache.hG0(text, 0.0f, 0.0f, 0, text.length(), width, flags, flag, markup);
    }

    public int drawText(int x, int y, C50 text) { text.length(); return 0; }
    public int drawText(int x, int y, C50 text, int start, int end) { text.length(); return 0; }
    public void drawMultiLineText(int x, int y, C50 text) { text.length(); }
    public void drawMultiLineText(int x, int y, C50 text, int width, int alignment) { }
    public hs_0 cacheText(hs_0 cache, C50 text) { text.length(); return null; }
    public hs_0 cacheText(hs_0 cache, C50 text, int start, int end) { return null; }
    public hs_0 cacheMultiLineText(hs_0 cache, C50 text) { text.length(); return null; }
    public hs_0 cacheMultiLineText(hs_0 cache, C50 text, int width, int alignment) { return null; }
    public boolean isCopy() { return this.wr; }

    public TwlFont(String name, qq_0 batch, Dn0 fontFile, pm_0 parameter, ww_2 selector, String[] fontNames, boolean individualAtlas, boolean markupEnabled, s60_0 generator, Dr0... colors) {
        this.wr = false;
        this.JY = null;
        this.Yh = false;
        this.uM = false;
        this.AUX = name;
        this.ZW = batch;
        this.Pr = fontFile;
        this.yx0 = generator;
        this.kq = selector;
        this.n80 = fontNames;
        this.Ip0 = this.Fz0();
        this.vI = individualAtlas;
        this.yv = new h2_0[colors.length];
        this.Zu0 = parameter;
        this.qf = colors;
        this.O60 = markupEnabled;
    }

    public TwlFont(String name, zb0_2 original, ww_2 selector, Dr0... colors) {
        this.wr = true;
        this.Ip0 = 0;
        this.vI = false;
        this.Yh = false;
        this.uM = false;
        this.AUX = name;
        this.JY = original;
        this.cM = new lpt3__5();
        this.kq = selector;
        this.yv = new h2_0[colors.length];
        for (int index = 0; index < colors.length; index++) this.yv[index] = new h2_0(colors[index]);
        this.Pr = null;
        this.n80 = null;
        this.yx0 = null;
        this.Zu0 = null;
        this.qf = null;
        this.O60 = false;
    }

    public static boolean bigCJKFontSizes() { return vh0 != null && q3; }
}
