package cn.pokemmo.data.buffer;

import java.nio.ByteBuffer;

/**
 * ByteBuffer 记录头指针跳过与基址获取工具 (ByteBuffer Record Header Skipper)
 * 对应混淆类: f.ax0_0
 */
public abstract class ByteBufferRecordHeaderSkipper {

    public static int skipHeaderAndGetBase(ByteBuffer buffer) {
        int base = buffer.position();
        buffer.getInt();
        buffer.getInt();
        return base;
    }

    public static int vU(ByteBuffer buffer) {
        return skipHeaderAndGetBase(buffer);
    }
}
