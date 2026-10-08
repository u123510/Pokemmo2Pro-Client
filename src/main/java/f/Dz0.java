package f;

import cn.pokemmo.rom.gba.tileset.GbaAnimatedTileData;
import java.nio.ByteBuffer;

/**
 * GBA 动态瓦片运行期帧数据垫片
 * 现代化实现: cn.pokemmo.rom.gba.tileset.GbaAnimatedTileData
 */
public final class Dz0 extends GbaAnimatedTileData {
    public Dz0(ByteBuffer buffer, int offset, i8_0 palette, int width, int format, int height, int rotation) {
        super(buffer, offset, palette, width, format, height, rotation);
    }
}
