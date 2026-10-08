package f;

import cn.pokemmo.rom.gba.map.GbaMapWarpEntry;
import java.nio.ByteBuffer;

/**
 * GBA 地图传送连接入口垫片
 * 现代化实现: cn.pokemmo.rom.gba.map.GbaMapWarpEntry
 */
public final class yj_2 extends GbaMapWarpEntry {
    public yj_2(byte mode, ByteBuffer buffer) {
        super(mode, buffer);
    }

    public yj_2(short id, boolean enabled) {
        super(id, enabled);
    }
}
