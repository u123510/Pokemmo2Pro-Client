package f;

import cn.pokemmo.data.buffer.ByteBufferRecordHeaderSkipper;
import java.nio.ByteBuffer;

public abstract class ax0_0 extends ByteBufferRecordHeaderSkipper {
    public static int vU(ByteBuffer byteBuffer) {
        return ByteBufferRecordHeaderSkipper.skipHeaderAndGetBase(byteBuffer);
    }
}
