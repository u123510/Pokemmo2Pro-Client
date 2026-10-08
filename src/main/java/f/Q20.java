package f;

import cn.pokemmo.rom.nds.graphics.NitroTileBitmapDecoder;
import java.nio.ByteBuffer;

/**
 * Shim: Q20 -> NitroTileBitmapDecoder
 * @see cn.pokemmo.rom.nds.graphics.NitroTileBitmapDecoder
 */
public final class Q20 extends NitroTileBitmapDecoder {
    public Q20(int var1, int var2, int var3, XG0 var4, ByteBuffer var5) {
        super(var1, var2, var3, var4, var5);
    }
}
