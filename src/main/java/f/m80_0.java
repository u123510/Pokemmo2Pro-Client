package f;

import cn.pokemmo.rom.gba.offset.GbaDirectPatternScanner;

/**
 * 兼容垫片 (Shim) - GbaDirectPatternScanner
 * 原混淆类: f.m80_0
 * 现代实现: cn.pokemmo.rom.gba.offset.GbaDirectPatternScanner
 */
public final class m80_0 extends GbaDirectPatternScanner {
    public m80_0(String pattern, int end, boolean reverse) {
        super(pattern, end, reverse);
    }

    public m80_0(boolean reverse, String pattern, int end, int start) {
        super(reverse, pattern, end, start);
    }
}
