package f;

import cn.pokemmo.rom.gba.map.GbaMapLocationHeaderRecord;
import java.nio.ByteBuffer;

/**
 * Shim: hw_1 -> GbaMapLocationHeaderRecord
 * @see cn.pokemmo.rom.gba.map.GbaMapLocationHeaderRecord
 */
public final class hw_1 extends GbaMapLocationHeaderRecord {
    public hw_1(byte by, ByteBuffer byteBuffer) {
        super(by, byteBuffer);
    }
}
