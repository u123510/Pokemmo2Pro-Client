package f;

import cn.pokemmo.data.buffer.ByteBufferLimitHelper;
import java.nio.ByteBuffer;

public abstract class AT extends ByteBufferLimitHelper {
    public static void i20(int n, int n2, int n3, ByteBuffer byteBuffer) {
        ByteBufferLimitHelper.setSafeLimit(n, n2, n3, byteBuffer);
    }
}
