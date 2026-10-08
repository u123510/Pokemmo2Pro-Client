package f;

import cn.pokemmo.graphics.model.KeyframeMeshSample;
import java.nio.ByteBuffer;

/**
 * Shim: ax_1 -> KeyframeMeshSample
 * @see cn.pokemmo.graphics.model.KeyframeMeshSample
 */
public final class ax_1 extends KeyframeMeshSample {
    public ax_1(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public ax_1(int frame, short x, short y, short z, short flag) {
        super(frame, x, y, z, flag);
    }
}
