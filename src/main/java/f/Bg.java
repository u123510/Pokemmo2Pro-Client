package f;

import cn.pokemmo.rom.map.TilePaletteMappingRegistry;

/**
 * 兼容垫片 (Shim) - TilePaletteMappingRegistry
 * 原混淆类: f.Bg
 * 现代实现: cn.pokemmo.rom.map.TilePaletteMappingRegistry
 * @see cn.pokemmo.rom.map.TilePaletteMappingRegistry
 */
public abstract class Bg extends TilePaletteMappingRegistry {
    public static final w7_0 Li = TilePaletteMappingRegistry.Li;
    public static final w7_0 e50 = TilePaletteMappingRegistry.e50;

    public static void Iv(int n, int n2, int n3, int n4, int n5, int n6) {
        TilePaletteMappingRegistry.Iv(n, n2, n3, n4, n5, n6);
    }

    public static void Ml0(int n, int n2, int n3, int n4, int n5) {
        TilePaletteMappingRegistry.Ml0(n, n2, n3, n4, n5);
    }

    public static i8_0 C80(int n, int n2, int n3, int n4, i8_0 i8_02) {
        return TilePaletteMappingRegistry.C80(n, n2, n3, n4, i8_02);
    }

    public static short fz0(int n, int n2, int n3, int n4) {
        return TilePaletteMappingRegistry.fz0(n, n2, n3, n4);
    }
}
