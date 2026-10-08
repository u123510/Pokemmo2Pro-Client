package f;

import cn.pokemmo.rom.nds.narc.NarcArchive;
import cn.pokemmo.rom.nds.narc.NarcEntryIterator;

/**
 * NDS NARC 条目迭代器垫片
 * 现代化实现: cn.pokemmo.rom.nds.narc.NarcEntryIterator
 */
public final class np_1 extends NarcEntryIterator {
    public np_1(FJ fJ) {
        super(fJ);
    }

    public np_1(NarcArchive archive) {
        super(archive);
    }
}
