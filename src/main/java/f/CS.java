package f;

import cn.pokemmo.rom.nds.audio.SdatAdpcmWaveChunk;
import java.nio.ByteBuffer;

/**
 * Shim: CS -> SdatAdpcmWaveChunk
 * @see cn.pokemmo.rom.nds.audio.SdatAdpcmWaveChunk
 */
public final class CS extends SdatAdpcmWaveChunk {
    public CS(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
