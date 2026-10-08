package f;

import cn.pokemmo.rom.gba.map.GbaMapLayout;
import java.nio.ByteBuffer;

/**
 * GBA 地图布局垫片
 * 现代化实现: cn.pokemmo.rom.gba.map.GbaMapLayout
 */
public final class ng0_0 extends GbaMapLayout {
    public ng0_0(short s, ByteBuffer byteBuffer, qa0_1 qa0_12) {
        super(s, byteBuffer, qa0_12);
    }

    public ng0_0(byte by, ByteBuffer byteBuffer, short s) {
        super(by, byteBuffer, s);
    }
}
