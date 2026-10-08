package cn.pokemmo.net.packet.payload;

import f.ZF0;
import java.nio.ByteBuffer;

/**
 * 原始字节数组载荷数据包 (Raw Byte Array Payload Packet)
 * <p>
 * Opcode: 2
 * 格式: [short length] [byte... payload]
 * <p>
 * 原始混淆类: {@code f.Tw0}
 */
public class RawByteArrayPacket extends ZF0 {
    public final byte[] xD;

    public RawByteArrayPacket(byte[] data) {
        super(2);
        this.xD = data;
    }

    public byte[] getData() {
        return this.xD;
    }

    @Override
    public void writePayload(ByteBuffer buffer) {
        buffer.putShort((short) this.xD.length);
        buffer.put(this.xD);
    }

    @Override
    public void Q80(ByteBuffer byteBuffer) {
        writePayload(byteBuffer);
    }
}
