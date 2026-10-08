package f;

import cn.pokemmo.rom.nds.model.NitroSectionHeader;
import java.nio.ByteBuffer;

/**
 * Shim: bw_1 -> NitroSectionHeader
 * @see cn.pokemmo.rom.nds.model.NitroSectionHeader
 */
public final class bw_1 extends NitroSectionHeader {
    public bw_1(ByteBuffer buffer, int expectedId) {
        super(buffer, expectedId);
    }
}
