package cn.pokemmo.data.buffer;

import java.nio.ByteBuffer;

/**
 * ByteBuffer 边界限制辅助工具 (ByteBuffer Limit Helper)
 * 对应混淆类: f.AT
 */
public abstract class ByteBufferLimitHelper {

    public static void setSafeLimit(int base, int length, int maxCap, ByteBuffer buffer) {
        buffer.limit(Math.min(maxCap, base + length));
    }

    public static void i20(int base, int length, int maxCap, ByteBuffer buffer) {
        setSafeLimit(base, length, maxCap, buffer);
    }
}
