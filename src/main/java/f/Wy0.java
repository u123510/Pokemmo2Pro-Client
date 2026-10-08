package f;

import cn.pokemmo.net.packet.inbound.FriendStatusUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - FriendStatusUpdatePacket
 * 操作码: 209
 * 原始混淆类: f.Wy0
 * 现代实现: cn.pokemmo.net.packet.inbound.FriendStatusUpdatePacket
 */
public class Wy0 extends FriendStatusUpdatePacket {

    public Wy0(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
