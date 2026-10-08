package cn.pokemmo.data.buffer;

import java.nio.ByteBuffer;

/**
 * ByteBuffer 读取位置追踪基类 (ByteBuffer Position Tracker)
 * 对应混淆类: f.KO
 */
public abstract class ByteBufferPositionTracker {
    public final int initialPosition;

    public ByteBufferPositionTracker(ByteBuffer buffer) {
        this.initialPosition = buffer.position();
    }
}
