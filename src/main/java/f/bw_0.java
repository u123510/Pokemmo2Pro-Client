package f;

import cn.pokemmo.rom.gba.offset.GbaPatternOffsetScanner;

/**
 * 兼容垫片 (Shim) - GbaPatternOffsetScanner
 * 原混淆类: f.bw_0
 * 现代实现: cn.pokemmo.rom.gba.offset.GbaPatternOffsetScanner
 */
public class bw_0 extends GbaPatternOffsetScanner {
    public bw_0(String pattern, int offset, boolean before) {
        super(pattern, offset, before);
    }

    public bw_0(boolean before, String pattern, int offset, int occurrences) {
        super(before, pattern, offset, occurrences);
    }
}
