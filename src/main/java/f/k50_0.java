package f;

import cn.pokemmo.net.packet.inbound.FriendListPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - FriendListPacket
 * 操作码: 208
 * 原始混淆类: f.k50_0
 * 现代实现: cn.pokemmo.net.packet.inbound.FriendListPacket
 */
public class k50_0 extends FriendListPacket {

    public k50_0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
