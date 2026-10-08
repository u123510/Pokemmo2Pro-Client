package f;

import cn.pokemmo.rom.nds.model.NdsModelChunkArrayRecord;
import java.nio.ByteBuffer;

/**
 * NDS 模型数据块数组门面
 * @see cn.pokemmo.rom.nds.model.NdsModelChunkArrayRecord
 */
public final class BN extends NdsModelChunkArrayRecord {
    public BN(int n, int n2, p2_0 p2_02, int n3, byte by, ByteBuffer byteBuffer) {
        super(n, n2, p2_02, n3, by, byteBuffer);
    }
}
