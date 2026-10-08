package f;

import cn.pokemmo.graphics.model.KeyframeBoneTrackHeader;
import java.nio.ByteBuffer;

/**
 * Shim: YN -> KeyframeBoneTrackHeader
 * @see cn.pokemmo.graphics.model.KeyframeBoneTrackHeader
 */
public final class YN extends KeyframeBoneTrackHeader {
    public YN(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
