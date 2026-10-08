package f;

import cn.pokemmo.rom.nds.fs.NitroArchiveBlock;
import java.nio.ByteBuffer;

/**
 * Shim: wm_1 -> NitroArchiveBlock
 * @see cn.pokemmo.rom.nds.fs.NitroArchiveBlock
 */
public final class wm_1 extends NitroArchiveBlock {
    public wm_1(boolean bl, ByteBuffer byteBuffer) {
        super(bl, byteBuffer);
    }
}
