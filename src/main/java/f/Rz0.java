package f;

import cn.pokemmo.rom.nds.narc.NarcHeader;
import java.nio.ByteBuffer;

/**
 * NARC Header 兼容垫片
 * 已重构至 cn.pokemmo.rom.nds.narc.NarcHeader
 */
public final class Rz0 extends NarcHeader {
    public Rz0(ByteBuffer buffer) {
        super(buffer);
    }
}
