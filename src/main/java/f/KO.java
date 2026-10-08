package f;

import cn.pokemmo.data.buffer.ByteBufferPositionTracker;
import java.nio.ByteBuffer;

public abstract class KO extends ByteBufferPositionTracker {
    public KO(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
