package f;

import cn.pokemmo.ui.font.FontGlyphResolver;
import f.KZ;

public interface hf0_0 extends FontGlyphResolver {
    @Override
    KZ COM3(String var1, int var2, KZ var3);

    @Override
    default KZ resolveGlyph(String name, int size, KZ fallback) {
        return COM3(name, size, fallback);
    }
}
