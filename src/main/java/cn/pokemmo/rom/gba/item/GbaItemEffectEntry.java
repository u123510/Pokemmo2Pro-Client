package cn.pokemmo.rom.gba.item;

import f.mz_1;
import f.qa0_1;

/**
 * GBA 道具效果条目
 */
public class GbaItemEffectEntry {
    public GbaItemEffectEntry(int offset, qa0_1 rom) {
        mz_1.Xc(offset, rom.vy0());
    }
}
