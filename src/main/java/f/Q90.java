package f;

import cn.pokemmo.world.map.DynamicTerrainChunkRecord;
import java.nio.ByteBuffer;

/**
 * Shim: Q90 -> DynamicTerrainChunkRecord
 * @see cn.pokemmo.world.map.DynamicTerrainChunkRecord
 */
public final class Q90 extends DynamicTerrainChunkRecord {
    public Q90(int n, ByteBuffer byteBuffer) {
        super(n, byteBuffer);
    }
}
