package f;

import cn.pokemmo.net.packet.inbound.ShopOpcode035Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ShopOpcode035Packet
 * 操作码: 35
 * 原始混淆类: f.EL
 * 现代实现: cn.pokemmo.net.packet.inbound.ShopOpcode035Packet
 */
public class EL extends ShopOpcode035Packet {

    public EL(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }
}
