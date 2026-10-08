package f;

import cn.pokemmo.data.buffer.ByteBufferOffsetReader;
import java.nio.ByteBuffer;

public abstract class GA extends ByteBufferOffsetReader {
    public static int m1(int n, int n2, int n3, ByteBuffer byteBuffer) {
        return ByteBufferOffsetReader.readIntAtOffset(n, n2, n3, byteBuffer);
    }
}
