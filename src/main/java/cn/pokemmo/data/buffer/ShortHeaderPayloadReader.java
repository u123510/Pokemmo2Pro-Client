package cn.pokemmo.data.buffer;

import java.nio.ByteBuffer;

/**
 * 短整型头部数据载荷读取器 (Short Header Payload Reader)
 * 对应混淆类: f.c1_0
 */
public class ShortHeaderPayloadReader {
    public final short headerId;

    public ShortHeaderPayloadReader(ByteBuffer buffer) {
        this.headerId = buffer.getShort();
    }

    public short getHeaderId() {
        return this.headerId;
    }
}
