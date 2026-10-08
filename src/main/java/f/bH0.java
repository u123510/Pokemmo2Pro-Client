package f;

import cn.pokemmo.entity.motion.AbstractEntityMotionState;
import java.nio.ByteBuffer;

/**
 * Shim: bH0 -> AbstractEntityMotionState
 * @see cn.pokemmo.entity.motion.AbstractEntityMotionState
 */
public abstract class bH0 extends AbstractEntityMotionState {
    public bH0(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
