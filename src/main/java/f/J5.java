package f;

import cn.pokemmo.rom.nds.base.AbstractNdsRom;
import cn.pokemmo.rom.nds.fs.CompressedNitroFileEntry;

/**
 * 兼容垫片 (Shim) - CompressedNitroFileEntry
 * 职责: 压缩型 NitroFS 文件条目
 * 原始混淆类: f.J5
 * 现代实现: cn.pokemmo.rom.nds.fs.CompressedNitroFileEntry
 */
public final class J5 extends CompressedNitroFileEntry {
    public J5(AbstractNdsRom var1, String var2, int var3, int var4, short var5) {
        super(var1, var2, var3, var4, var5);
    }
}
