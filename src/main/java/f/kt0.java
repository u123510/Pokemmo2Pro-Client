package f;

import cn.pokemmo.rom.gba.map.GbaMapLocationEntry;
import java.nio.ByteBuffer;

/**
 * GBA 地图位置信息垫片
 * 现代化实现: cn.pokemmo.rom.gba.map.GbaMapLocationEntry
 */
public final class kt0 extends GbaMapLocationEntry {
    public kt0(byte type, ByteBuffer buffer, short index) {
        super(type, buffer, index);
    }
}
