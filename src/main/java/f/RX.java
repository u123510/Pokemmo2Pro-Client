package f;

import cn.pokemmo.net.packet.inbound.FriendRemovePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - FriendRemovePacket
 * 操作码: 210
 * 原始混淆类: f.RX
 * 现代实现: cn.pokemmo.net.packet.inbound.FriendRemovePacket
 */
public class RX extends FriendRemovePacket {

    public RX(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }
}
