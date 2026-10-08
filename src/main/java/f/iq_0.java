package f;

import cn.pokemmo.net.packet.inbound.FriendRequestPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - FriendRequestPacket
 * 操作码: 218
 * 原始混淆类: f.iq_0
 * 现代实现: cn.pokemmo.net.packet.inbound.FriendRequestPacket
 */
public class iq_0 extends FriendRequestPacket {

    public iq_0(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }
}
