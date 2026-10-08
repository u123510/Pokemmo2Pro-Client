package f;

import cn.pokemmo.net.packet.inbound.ChatMessagePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ChatMessagePacket
 * 操作码: 9
 * 原始混淆类: f.ng_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ChatMessagePacket
 */
public class ng_0 extends ChatMessagePacket {

    public ng_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
