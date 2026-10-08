package cn.pokemmo.net.packet;

import f.JM;
import f.Mu0;
import java.nio.ByteBuffer;

/**
 * 出站数据包抽象基类 (Serverbound Outbound Packet)
 * 原混淆类: f.bo_1
 */
public abstract class OutboundPacket extends JM {

    public OutboundPacket(int opcode) {
        super(Mu0.da0, opcode);
    }

    public OutboundPacket() {
        super(Mu0.da0, 0);
    }

    /**
     * 将 UTF-16 字符串以 null 结尾写入 ByteBuffer
     */
    public static void writeString(String string, ByteBuffer byteBuffer) {
        if (string != null) {
            int n = string.length();
            for (int j = 0; j < n; ++j) {
                byteBuffer.putChar(string.charAt(j));
            }
        }
        byteBuffer.putChar('\u0000');
    }

    public static void cK(String string, ByteBuffer byteBuffer) {
        writeString(string, byteBuffer);
    }
}
