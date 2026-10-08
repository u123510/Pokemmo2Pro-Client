/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics.g2d.freetype;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType;
import com.badlogic.gdx.graphics.g2d.freetype.rH;
import f.Dn0;
import f.HI0;
import f.LJ0;
import f.LW;
import f.d00_0;
import f.eb0_1;
import f.es_1;
import f.fy0_0;
import f.i4_0;
import f.ix0_0;
import f.lg_0;
import f.mh0_0;
import f.nf_1;
import f.pm_0;
import f.ql_0;
import f._return;
import f.sc_0;
import f.th_1;
import f.vq0_0;
import java.nio.ByteBuffer;

public final class az0
implements fy0_0 {
    public final FreeType.Library R9;
    public final FreeType.Face s3;
    public final String hX;
    public boolean sh = false;

    public az0(Dn0 dn0) {
        this(dn0, 0);
    }

    public az0(Dn0 dn0, int n) {
        FreeType.Library library;
        this.hX = dn0.R20();
        this.R9 = library = FreeType.JM();
        this.s3 = library.kY(dn0, n);
        if (this.D1()) {
            return;
        }
        this.ho0(15);
    }

    public final sc_0 Ab(pm_0 pm_02, rH rH2) {
        boolean hadExternalRegions = rH2.I4 == null && pm_02.HD != null;
        if (hadExternalRegions) {
            rH2.I4 = new es_1();
        }

        rH2.jo0 = this.hX + "-" + pm_02.ru;
        char[] chars = pm_02.t80.toCharArray();
        int charCount = chars.length;
        boolean incremental = pm_02.fp;
        int loadFlags = loadFlags(pm_02);

        this.ho0(pm_02.ru);
        FreeType.SizeMetrics sizeMetrics = this.s3.Jw().uA0();
        rH2.AZ = pm_02.CY;
        rH2.sB0 = FreeType.gA0(sizeMetrics.CV());
        rH2.ce = FreeType.gA0(sizeMetrics.qM());
        rH2.go = FreeType.gA0(sizeMetrics.d40());
        float baseLine = rH2.sB0;

        if (this.sh && rH2.go == 0.0f) {
            for (int code = 32; code < this.s3.xH0() + 32; ++code) {
                if (this.s3.VR(code, loadFlags)) {
                    float height = FreeType.gA0(this.s3.Bi().LA().dh0());
                    if (height > rH2.go) {
                        rH2.go = height;
                    }
                }
            }
        }

        rH2.go += (float)pm_02.gh0;
        if (!this.s3.VR(32, loadFlags) && !this.s3.VR(108, loadFlags)) {
            rH2.CM = this.s3.Oh();
        } else {
            rH2.CM = FreeType.gA0(this.s3.Bi().LA().YM());
        }

        for (char xChar : rH2.mA) {
            if (this.s3.VR(xChar, loadFlags)) {
                rH2.Hf = FreeType.gA0(this.s3.Bi().LA().dh0());
                break;
            }
        }
        if (rH2.Hf == 0.0f) {
            throw new nf_1("No x-height character found in font");
        }

        for (char capChar : rH2.Fu0) {
            if (this.s3.VR(capChar, loadFlags)) {
                rH2.g4 = Math.abs(pm_02.hA) + FreeType.gA0(this.s3.Bi().LA().dh0());
                break;
            }
        }
        if (!this.sh && rH2.g4 == 1.0f) {
            throw new nf_1("No cap character found in font");
        }

        float ascent = rH2.sB0 - rH2.g4;
        rH2.sB0 = ascent;
        float lineHeight = rH2.go;
        float down = -lineHeight;
        rH2.U7 = down;
        if (pm_02.CY) {
            rH2.sB0 = -ascent;
            rH2.U7 = -down;
        }

        boolean ownsPacker = false;
        LJ0 packer = pm_02.HD;
        if (packer == null) {
            int pageSize;
            vq0_0 strategy;
            if (incremental) {
                pageSize = 1024;
                strategy = new _return();
            } else {
                int ceilLineHeight = (int)Math.ceil(lineHeight);
                pageSize = Math.min(LW.uo0((int)Math.sqrt(ceilLineHeight * ceilLineHeight * charCount)), 1024);
                strategy = new d00_0();
            }
            ownsPacker = true;
            packer = new LJ0(pageSize, pageSize, ix0_0.Vw, 1, false, strategy);
            packer.jZ.set(pm_02.Fi0);
            packer.jZ.a = 0.0f;
            if (pm_02.oF > 0.0f) {
                packer.jZ.set(pm_02.t5);
                packer.jZ.a = 0.0f;
            }
        }

        if (incremental) {
            rH2.r8 = new es_1(charCount + 32);
        }

        FreeType.Stroker stroker = null;
        if (pm_02.oF > 0.0f) {
            stroker = this.R9.sy0();
            int borderWidth = (int)(pm_02.oF * 64.0f);
            int lineCap = pm_02.lPt3 ? 0 : 1;
            int lineJoin = pm_02.lPt3 ? 3 : 0;
            stroker.Lpt1(borderWidth, lineCap, lineJoin);
        }

        int[] heights = new int[charCount];
        for (int i = 0; i < charCount; ++i) {
            char ch = chars[i];
            int height = this.s3.VR(ch, loadFlags) ? FreeType.gA0(this.s3.Bi().LA().dh0()) : 0;
            heights[i] = height;
            if (ch == 0) {
                th_1 missing = this.dY((char)0, rH2, pm_02, stroker, baseLine, packer);
                if (missing != null && missing.k != 0 && missing.pz0 != 0) {
                    rH2.eU(0, missing);
                    rH2.Rx = missing;
                    if (incremental) {
                        rH2.r8.Ue0(missing);
                    }
                }
            }
        }

        int remaining = charCount;
        while (remaining > 0) {
            int bestIndex = 0;
            int bestHeight = heights[0];
            for (int i = 1; i < remaining; ++i) {
                int height = heights[i];
                if (height > bestHeight) {
                    bestHeight = height;
                    bestIndex = i;
                }
            }

            char ch = chars[bestIndex];
            if (rH2.jm0(ch) == null) {
                th_1 glyph = this.dY(ch, rH2, pm_02, stroker, baseLine, packer);
                if (glyph != null) {
                    rH2.eU(ch, glyph);
                    if (incremental) {
                        rH2.r8.Ue0(glyph);
                    }
                }
            }

            --remaining;
            heights[bestIndex] = heights[remaining];
            char tmp = chars[bestIndex];
            chars[bestIndex] = chars[remaining];
            chars[remaining] = tmp;
        }

        if (stroker != null && !incremental) {
            stroker.dispose();
        }
        if (incremental) {
            rH2.E0 = this;
            rH2.AS = pm_02;
            rH2.yO = stroker;
            rH2.ko0 = packer;
        }

        pm_02.ot = pm_02.ot & this.s3.NE();
        if (pm_02.ot) {
            for (int i = 0; i < charCount; ++i) {
                char first = chars[i];
                th_1 firstGlyph = rH2.jm0(first);
                if (firstGlyph == null) {
                    continue;
                }
                int firstIndex = this.s3.kf0(first);
                for (int j = i; j < charCount; ++j) {
                    char second = chars[j];
                    th_1 secondGlyph = rH2.jm0(second);
                    if (secondGlyph == null) {
                        continue;
                    }
                    int secondIndex = this.s3.kf0(second);
                    int kerning = this.s3.lI0(firstIndex, secondIndex);
                    if (kerning != 0) {
                        firstGlyph.zA(second, FreeType.gA0(kerning));
                    }
                    kerning = this.s3.lI0(secondIndex, firstIndex);
                    if (kerning != 0) {
                        secondGlyph.zA(first, FreeType.gA0(kerning));
                    }
                }
            }
        }

        if (ownsPacker) {
            rH2.I4 = new es_1();
            packer.Kr0(rH2.I4, pm_02.OY, pm_02.LN);
        }

        th_1 space = rH2.jm0(' ');
        if (space == null) {
            space = new th_1();
            space.V80 = (int)rH2.CM + pm_02.ka;
            space.cJ0 = 32;
            rH2.eU(32, space);
        }
        if (space.k == 0) {
            space.k = (int)((float)space.V80 + rH2.XT);
        }

        if (hadExternalRegions) {
            pm_02.HD.Kr0(rH2.I4, pm_02.OY, pm_02.LN);
        }
        if (!rH2.I4.isEmpty()) {
            sc_0 font = new sc_0((mh0_0)rH2, rH2.I4, true);
            font.We = pm_02.HD == null;
            return font;
        }
        throw new nf_1("Unable to create a font with no texture regions.");
    }

    private static int loadFlags(pm_0 pm_02) {
        switch (HI0.KA[pm_02.is0.ordinal()]) {
            case 7:
                return 131104;
            case 6:
                return 32;
            case 5:
                return 65568;
            case 4:
                return 131072;
            case 3:
                return 0;
            case 2:
                return 65536;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    public final void ho0(int n) {
        if (!this.sh && !this.s3.Y8(n)) {
            throw new nf_1("Couldn't set size for font");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final th_1 dY(char c, rH rH2, pm_0 pm_02, FreeType.Stroker stroker, float f, LJ0 lJ0) {
        int n;
        th_1 th_12;
        int n2;
        int n3;
        Object object2;
        FreeType.Bitmap bitmap;
        Object object = this;
        if (((az0)object).s3.kf0(c) == 0 && c != '\u0000') {
            return null;
        }
        int n4 = 0;
        switch (HI0.KA[pm_02.is0.ordinal()]) {
            default: {
                break;
            }
            case 7: {
                n4 = 131104;
                break;
            }
            case 6: {
                n4 = 32;
                break;
            }
            case 5: {
                n4 = 65568;
                break;
            }
            case 4: {
                n4 = 131072;
                break;
            }
            case 3: {
                n4 = 0;
                break;
            }
            case 2: {
                n4 = 65536;
                break;
            }
            case 1: {
                n4 = 2;
            }
        }
        if (!((az0)object).s3.VR(c, n4)) {
            return null;
        }
        Object object3 = ((az0)object).s3.Bi();
        FreeType.Glyph glyph = ((FreeType.GlyphSlot)object3).wL();
        try {
            int n5 = pm_02.i00 ? 2 : 0;
            FreeType.Glyph glyph2 = glyph;
            glyph2.L00(n5);
            bitmap = glyph2.Za0();
            object2 = ix0_0.Vw;
        }
        catch (nf_1 nf_12) {
            glyph.dispose();
            lg_0.k.k7("FreeTypeFontGenerator", "Couldn't render char: " + c);
            return null;
        }
        Object object4 = bitmap.WI((ix0_0)((Object)object2), pm_02.Fi0, pm_02.E50);
        if (bitmap.m3() != 0 && bitmap.dl0() != 0) {
            int n6;
            int n7;
            if (pm_02.oF > 0.0f) {
                FreeType.Glyph glyph3 = glyph;
                n3 = glyph3.sd();
                n2 = glyph3.Bv0();
                FreeType.Glyph glyph4 = ((FreeType.GlyphSlot)object3).wL();
                glyph4.fu0(stroker);
                int n8 = pm_02.i00 ? 2 : 0;
                FreeType.Glyph glyph5 = glyph4;
                glyph5.L00(n8);
                n8 = n2 - glyph5.Bv0();
                n3 = -(n3 - glyph4.sd());
                object2 = glyph4.Za0().WI((ix0_0)((Object)object2), pm_02.t5, pm_02.Y2);
                n7 = pm_02.a9;
                for (n2 = 0; n2 < n7; ++n2) {
                    ((i4_0)object2).NH0((i4_0)object4, n8, n3);
                }
                ((i4_0)object4).dispose();
                glyph.dispose();
                glyph = glyph4;
                object4 = object2;
            }
            if ((n6 = pm_02.nb) == 0 && pm_02.hA == 0) {
                if (pm_02.oF == 0.0f) {
                    int n9 = pm_02.a9 - 1;
                    for (n6 = 0; n6 < n9; ++n6) {
                        i4_0 i4_02 = (i4_0)object4;
                        i4_02.NH0(i4_02, 0, 0);
                    }
                }
            } else {
                int n5 = n6;
                Gdx2DPixmap gdx2DPixmap = ((i4_0)object4).XF;
                n6 = gdx2DPixmap.SH;
                int n11 = gdx2DPixmap.mB0;
                n3 = Math.max(n5, 0);
                n2 = Math.max(pm_02.hA, 0);
                int n12 = Math.abs(pm_02.nb) + n6;
                n7 = Math.abs(pm_02.hA) + n11;
                i4_0 i4_04 = new i4_0(n12, n7, ((i4_0)object4).rH0());
                Color color = pm_02.cf;
                float f2 = color.a;
                if (f2 != 0.0f) {
                    Color color2 = color;
                    byte by = (byte)(color2.r * 255.0f);
                    byte by2 = (byte)(color2.g * 255.0f);
                    byte by3 = (byte)(color2.b * 255.0f);
                    ByteBuffer byteBuffer = ((i4_0)object4).Rh0();
                    ByteBuffer byteBuffer2 = i4_04.Rh0();
                    for (int j = 0; j < n11; ++j) {
                        int n13 = (j + n2) * n12 + n3;
                        for (int k = 0; k < n6; ++k) {
                            int n14 = byteBuffer.get((n6 * j + k) * 4 + 3);
                            if (n14 == 0) continue;
                            int n8 = n14;
                            n14 = (n13 + k) * 4;
                            byteBuffer2.put(n14, by);
                            byteBuffer2.put(n14 + 1, by2);
                            byteBuffer2.put(n14 + 2, by3);
                            byteBuffer2.put(n14 += 3, (byte)((float)(n8 & 0xFF) * f2));
                        }
                    }
                }
                n11 = pm_02.a9;
                for (n6 = 0; n6 < n11; ++n6) {
                    i4_04.NH0((i4_0)object4, Math.max(-pm_02.nb, 0), Math.max(-pm_02.hA, 0));
                }
                ((i4_0)object4).dispose();
                object4 = i4_04;
            }
        }
        FreeType.GlyphMetrics glyphMetrics = ((FreeType.GlyphSlot)object3).LA();
        th_12 = new th_1();
        Object object5 = th_12;
        object3 = th_12;
        ((th_1)object3).cJ0 = c;
        Gdx2DPixmap gdx2DPixmap = ((i4_0)object4).XF;
        ((th_1)object5).k = gdx2DPixmap.SH;
        ((th_1)object5).pz0 = gdx2DPixmap.mB0;
        th_12.kJ0 = glyph.Bv0();
        ((th_1)object3).iM = pm_02.CY ? -glyph.sd() + (int)f : -(((th_1)object3).pz0 - glyph.sd()) - (int)f;
        ((th_1)object3).V80 = FreeType.gA0(glyphMetrics.YM()) + (int)pm_02.oF + pm_02.ka;
        if (((az0)object).sh) {
            Color color = Color.CLEAR;
            object = color;
            i4_0 i4_04 = (i4_0)object4;
            i4_04.bI((Color)object);
            i4_04.XF.Vd(((i4_0)object4).Je0);
            object = bitmap.C90();
            int n16 = Color.WHITE.toIntBits();
            int n17 = color.toIntBits();
            for (int j = 0; j < ((th_1)object3).pz0; ++j) {
                int n18 = bitmap.vK() * j;
                for (n3 = 0; n3 < ((th_1)object3).k + ((th_1)object3).kJ0; ++n3) {
                    n2 = (((ByteBuffer)object).get(n3 / 8 + n18) >>> 7 - n3 % 8 & 1) == 1 ? n16 : n17;
                    ((i4_0)object4).XF.XS(n3, j, n2);
                }
            }
        }
        Object object6 = object3;
        LJ0 lJ02 = lJ0;
        synchronized (lJ02) {
            object = lJ02.y9(null, (i4_0)object4);
        }
        ((th_1)object6).qc0 = n = lJ02.b6.KB - 1;
        ((th_1)object6).Pt = (int)((ql_0)object).j80;
        ((th_1)object6).wj0 = (int)((ql_0)object).Wm0;
        if (pm_02.fp && (object = rH2.I4) != null && ((es_1)object).KB <= n) {
            eb0_1 eb0_12 = pm_02.LN;
            lJ0.Kr0((es_1)object, pm_02.OY, eb0_12);
        }
        ((i4_0)object4).dispose();
        glyph.dispose();
        return (th_1)object3;
    }

    public final String toString() {
        return this.hX;
    }

    @Override
    public final void dispose() {
        az0 az02 = this;
        az02.s3.dispose();
        az02.R9.dispose();
    }

    public final boolean D1() {
        int n;
        int n2 = this.s3.vE0();
        if ((n2 & 2) == 2 && (n2 & 0x10) == 16 && this.s3.VR(n2 = 32, n = 32) && this.s3.Bi().Aw() == 1651078259) {
            this.sh = true;
        }
        return this.sh;
    }
}

