package f;

import cn.pokemmo.rom.nds.terrain.NdsTerrainElevationChunk;
import cn.pokemmo.rom.nds.terrain.NdsTerrainSlopeRecord;
import java.nio.ByteBuffer;

/**
 * Shim: sq_0 -> NdsTerrainSlopeRecord
 * @see cn.pokemmo.rom.nds.terrain.NdsTerrainSlopeRecord
 */
public final class sq_0 extends NdsTerrainSlopeRecord {
    public sq_0(NdsTerrainElevationChunk v1, ByteBuffer v2) {
        super(v1, v2);
    }
}
