package f;

import cn.pokemmo.graphics.model.KeyframeChannelTrack;
import java.nio.ByteBuffer;

/**
 * Shim: m50 -> KeyframeChannelTrack
 * @see cn.pokemmo.graphics.model.KeyframeChannelTrack
 */
public final class m50 extends KeyframeChannelTrack {
    public m50(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
