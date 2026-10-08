package f;

import cn.pokemmo.rom.nds.model.NdsNitroBtxTextureFile;
import java.nio.ByteBuffer;

/**
 * Shim: Er0 -> NdsNitroBtxTextureFile
 * @see cn.pokemmo.rom.nds.model.NdsNitroBtxTextureFile
 */
public final class Er0 extends NdsNitroBtxTextureFile {
    public Er0(ByteBuffer buffer) {
        super(buffer);
    }

    public Er0(ByteBuffer buffer, boolean option, boolean direct) {
        super(buffer, option, direct);
    }
}
