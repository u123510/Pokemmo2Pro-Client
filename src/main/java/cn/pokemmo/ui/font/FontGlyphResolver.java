package cn.pokemmo.ui.font;

import f.KZ;

public interface FontGlyphResolver {
    KZ resolveGlyph(String name, int size, KZ fallback);

    default KZ COM3(String var1, int var2, KZ var3) {
        return resolveGlyph(var1, var2, var3);
    }
}
