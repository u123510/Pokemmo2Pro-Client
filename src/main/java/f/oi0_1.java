package f;

import cn.pokemmo.net.packet.inbound.MailOpcode151Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MailOpcode151Packet
 * 操作码: 151
 * 原始混淆类: f.oi0_1
 * 现代实现: cn.pokemmo.net.packet.inbound.MailOpcode151Packet
 */
public class oi0_1 extends MailOpcode151Packet {

    public oi0_1(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
