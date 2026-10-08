package f;

import cn.pokemmo.rom.nds.audio.SdatSymbolStringTable;
import java.nio.ByteBuffer;

/**
 * Shim: OL -> SdatSymbolStringTable
 * @see cn.pokemmo.rom.nds.audio.SdatSymbolStringTable
 */
public class OL extends SdatSymbolStringTable {
    public OL() {
        super();
    }

    public OL(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
