package cn.pokemmo.graphics.font;

import com.badlogic.gdx.graphics.Texture;
import f.*;

/**
 * 现代化重构类 - 原始类: f.sc_0
 */
public class BitmapFontDisposable implements fy0_0 {

    public final mh0_0 U5;
    public final es_1 aa;
    public final ft0_0 Rh;
    public boolean lg0;
    public boolean We;

    public BitmapFontDisposable() {
        this(lg_0.I70.kv0("com/badlogic/gdx/utils/lsans-15.fnt"), lg_0.I70.kv0("com/badlogic/gdx/utils/lsans-15.png"), false, true);
    }

    public BitmapFontDisposable(boolean flip) {
        this(lg_0.I70.kv0("com/badlogic/gdx/utils/lsans-15.fnt"), lg_0.I70.kv0("com/badlogic/gdx/utils/lsans-15.png"), flip, true);
    }

    public BitmapFontDisposable(Dn0 fontFile, LPT6_ region) {
        this(fontFile, region, false);
    }

    public BitmapFontDisposable(Dn0 fontFile, LPT6_ region, boolean flip) {
        this(new mh0_0(fontFile, flip), region, true);
    }

    public BitmapFontDisposable(Dn0 fontFile) {
        this(fontFile, false);
    }

    public BitmapFontDisposable(Dn0 fontFile, boolean flip) {
        this(new mh0_0(fontFile, flip), (LPT6_) null, true);
    }

    public BitmapFontDisposable(Dn0 fontFile, Dn0 imageFile, boolean flip) {
        this(fontFile, imageFile, flip, true);
    }

    public BitmapFontDisposable(Dn0 fontFile, Dn0 imageFile, boolean flip, boolean integer) {
        this(new mh0_0(fontFile, flip), new LPT6_(new Texture(imageFile, false)), integer);
        this.We = true;
    }

    public BitmapFontDisposable(mh0_0 data, LPT6_ region, boolean integer) {
        this(data, region != null ? es_1.r30(new LPT6_[]{region}) : null, integer);
    }

    public BitmapFontDisposable(mh0_0 data, es_1 regions, boolean integer) {
        boolean unused = data.AZ;
        this.U5 = data;
        this.lg0 = integer;
        if (regions != null && regions.KB != 0) {
            this.aa = regions;
            this.We = false;
        } else {
            if (data.bs0 == null) {
                throw new IllegalArgumentException("If no regions are specified, the font data must have an images path.");
            }
            int n = data.bs0.length;
            this.aa = new es_1(n);
            for (int i = 0; i < n; i++) {
                Dn0 file = data.Ah;
                Dn0 imageFile;
                if (file == null) {
                    imageFile = lg_0.I70.cD0(data.bs0[i]);
                } else {
                    imageFile = lg_0.I70.US(data.bs0[i], file.G0());
                }
                this.aa.Ue0(new LPT6_(new Texture(imageFile, false)));
            }
            this.We = true;
        }
        this.Rh = dq();
        v20(data);
    }

    public final void v20(mh0_0 data) {
        th_1[][] glyphs = data.o70;
        int pageCount = glyphs.length;
        for (int i = 0; i < pageCount; i++) {
            th_1[] page = glyphs[i];
            if (page != null) {
                int len = page.length;
                for (int j = 0; j < len; j++) {
                    th_1 glyph = page[j];
                    if (glyph != null) {
                        LPT6_ region = (LPT6_) this.aa.get(glyph.qc0);
                        data.Zv(glyph, region);
                    }
                }
            }
        }
        th_1 missingGlyph = data.Rx;
        if (missingGlyph != null) {
            LPT6_ region = (LPT6_) this.aa.get(missingGlyph.qc0);
            data.Zv(missingGlyph, region);
        }
    }

    @Override
    public final void dispose() {
        if (this.We) {
            for (int i = 0; i < this.aa.KB; i++) {
                ((LPT6_) this.aa.get(i)).OB.dispose();
            }
        }
    }

    public final boolean yR() {
        return this.lg0;
    }

    public final ft0_0 dq() {
        return new ft0_0((sc_0) this, this.lg0);
    }

    @Override
    public final String toString() {
        String name = this.U5.jo0;
        return name != null ? name : super.toString();
    }
}
