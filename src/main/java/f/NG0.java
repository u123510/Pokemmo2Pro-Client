package f;

import cn.pokemmo.graphics.model.KeyframeTransformTrack;
import java.nio.ByteBuffer;

/**
 * Shim: NG0 -> KeyframeTransformTrack
 * @see cn.pokemmo.graphics.model.KeyframeTransformTrack
 */
public final class NG0 extends KeyframeTransformTrack {
    public NG0(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
