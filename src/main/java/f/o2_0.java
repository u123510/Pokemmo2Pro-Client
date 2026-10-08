package f;

import cn.pokemmo.rom.nds.terrain.NdsTerrainElevationChunk;
import java.nio.ByteBuffer;

/**
 * Shim: o2_0 -> NdsTerrainElevationChunk
 * @see cn.pokemmo.rom.nds.terrain.NdsTerrainElevationChunk
 */
public final class o2_0 extends NdsTerrainElevationChunk {
    public o2_0(byte b, ByteBuffer byteBuffer, short s) {
        super(b, byteBuffer, s);
    }
}
