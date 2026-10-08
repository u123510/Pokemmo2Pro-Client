package f;

import cn.pokemmo.net.packet.inbound.ItemOpcode065Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ItemOpcode065Packet
 * 操作码: 65
 * 原始混淆类: f.TC
 * 现代实现: cn.pokemmo.net.packet.inbound.ItemOpcode065Packet
 */
public class TC extends ItemOpcode065Packet {

    public TC(k20_0 connection, ByteBuffer data) {
        super(connection, data);
    }
}
