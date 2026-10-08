package f;

import cn.pokemmo.net.packet.outbound.SendChatMessageRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - SendChatMessageRequestPacket
 * 操作码: 79
 * 原始混淆类: f.dl0_0
 * 现代实现: cn.pokemmo.net.packet.outbound.SendChatMessageRequestPacket
 */
public class dl0_0 extends SendChatMessageRequestPacket {

    public dl0_0() {
        super();
    }
    public dl0_0(CH0 id, String text) {
        super(id, text);
    }
    public dl0_0(CH0 first, CH0 second) {
        super(first, second);
    }
}
