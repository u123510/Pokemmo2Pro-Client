package f;

import cn.pokemmo.rom.gba.map.GbaMapHeader;
import java.nio.ByteBuffer;

/**
 * GBA 地图头垫片
 * 现代化实现: cn.pokemmo.rom.gba.map.GbaMapHeader
 */
public final class ZT extends GbaMapHeader {
    public ZT(int n, int n2, ByteBuffer byteBuffer, qa0_1 qa0_12) {
        super(n, n2, byteBuffer, qa0_12);
    }

    public ZT(int n, int n2, ByteBuffer byteBuffer) {
        super(n, n2, byteBuffer);
    }
}
