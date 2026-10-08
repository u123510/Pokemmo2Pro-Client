package f;

import cn.pokemmo.rom.nds.fs.NitroFileEntry;
import cn.pokemmo.rom.nds.base.AbstractNdsRom;

/**
 * NitroFS 文件条目兼容垫片
 * 已重构至 cn.pokemmo.rom.nds.fs.NitroFileEntry
 */
public class Ae extends NitroFileEntry {
    public final l50_0 h2;

    public Ae(AbstractNdsRom rom, String name, int startOffset, int length, short fileId) {
        super(rom, name, startOffset, length, fileId);
        this.h2 = (l50_0) rom;
    }

    public final l50_0 zv0() {
        return this.h2;
    }
}
