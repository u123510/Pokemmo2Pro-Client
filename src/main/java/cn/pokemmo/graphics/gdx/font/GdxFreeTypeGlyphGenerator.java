package cn.pokemmo.graphics.gdx.font;

import f.*;


import com.badlogic.gdx.graphics.g2d.freetype.rH;

public class GdxFreeTypeGlyphGenerator extends rH {
    public final zb0_2 lv0;

    public GdxFreeTypeGlyphGenerator(zb0_2 owner) {
        this.lv0 = owner;
    }

    public final th_1 jm0(char character) {
        th_1 glyph = super.jm0(character);
        if (glyph != null) {
            return glyph;
        }
        for (sc_0 fallback : this.lv0.G5) {
            glyph = fallback.U5.jm0(character);
            if (glyph != null) {
                return glyph;
            }
        }
        return null;
    }
}
