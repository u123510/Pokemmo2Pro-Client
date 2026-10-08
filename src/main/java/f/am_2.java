package f;

import cn.pokemmo.rom.nds.model.NitroTextureDictionary;
import java.nio.ByteBuffer;

/**
 * Shim: am_2 -> NitroTextureDictionary
 * @see cn.pokemmo.rom.nds.model.NitroTextureDictionary
 */
public final class am_2 extends NitroTextureDictionary {
    public am_2(boolean forceOpaque, ByteBuffer data) {
        super(forceOpaque, data);
    }
}
