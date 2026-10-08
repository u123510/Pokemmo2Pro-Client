package cn.pokemmo.graphics.gl;

import java.nio.ByteBuffer;

public abstract class IndexedBufferReader {
    public static int readIndexedInt(int n, int n2, int n3, ByteBuffer byteBuffer) {
        byteBuffer.position(n * n2 + n3);
        byteBuffer.getInt();
        return byteBuffer.getInt();
    }

    public static int WG0(int n, int n2, int n3, ByteBuffer byteBuffer) {
        return readIndexedInt(n, n2, n3, byteBuffer);
    }
}
