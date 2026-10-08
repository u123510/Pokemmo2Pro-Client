package f;

import cn.pokemmo.rom.nds.narc.NarcAllocTable;
import java.nio.ByteBuffer;

/**
 * NARC BTAF 分配表兼容垫片
 * 已重构至 cn.pokemmo.rom.nds.narc.NarcAllocTable
 */
public final class lo_2 extends NarcAllocTable {
    public lo_2(ByteBuffer buffer) {
        super(buffer);
    }
}
