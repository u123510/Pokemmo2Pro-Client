package f;

import cn.pokemmo.rom.nds.model.NitroOamDataHeader;
import java.nio.ByteBuffer;

/**
 * Shim: bc0_1 -> NitroOamDataHeader
 * @see cn.pokemmo.rom.nds.model.NitroOamDataHeader
 */
public final class bc0_1 extends NitroOamDataHeader {
    public bc0_1(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
