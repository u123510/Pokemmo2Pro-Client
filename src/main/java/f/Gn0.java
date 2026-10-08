package f;

import cn.pokemmo.graphics.model.KeyframeHermiteCurveChannel;
import java.nio.ByteBuffer;

/**
 * Shim: Gn0 -> KeyframeHermiteCurveChannel
 * @see cn.pokemmo.graphics.model.KeyframeHermiteCurveChannel
 */
public final class Gn0 extends KeyframeHermiteCurveChannel {
    public Gn0(ByteBuffer buffer, int baseOffset, boolean constant, int valueCount) {
        super(buffer, baseOffset, constant, valueCount);
    }
}
