package f;

import cn.pokemmo.graphics.model.KeyframeSplineAnimationChannel;
import java.nio.ByteBuffer;

/**
 * Shim: O20 -> KeyframeSplineAnimationChannel
 * @see cn.pokemmo.graphics.model.KeyframeSplineAnimationChannel
 */
public final class O20 extends KeyframeSplineAnimationChannel {
    public O20(ByteBuffer buffer, int offset, boolean constant, int count) {
        super(buffer, offset, constant, count);
    }
}
