package cn.pokemmo.data.buffer;

import java.nio.ByteBuffer;

/**
 * ByteBuffer 相对偏移整型读取工具 (ByteBuffer Offset Reader)
 * 对应混淆类: f.GA
 */
public abstract class ByteBufferOffsetReader {

    public static int readIntAtOffset(int base, int offset1, int offset2, ByteBuffer buffer) {
        return buffer.getInt(base + offset1 + offset2);
    }

    public static int m1(int base, int offset1, int offset2, ByteBuffer buffer) {
        return readIntAtOffset(base, offset1, offset2, buffer);
    }
}
