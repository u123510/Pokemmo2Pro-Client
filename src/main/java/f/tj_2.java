package f;

import cn.pokemmo.rom.gba.map.GbaMapConnectionEntry;
import java.nio.ByteBuffer;

/**
 * Shim: tj_2 -> GbaMapConnectionEntry
 * @see cn.pokemmo.rom.gba.map.GbaMapConnectionEntry
 */
public final class tj_2 extends GbaMapConnectionEntry {
    public tj_2(short s, ByteBuffer byteBuffer) {
        super(s, byteBuffer);
    }
}
