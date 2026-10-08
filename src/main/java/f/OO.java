package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode090Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode090Packet
 * 操作码: 90
 * 原始混淆类: f.OO
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode090Packet
 */
public class OO extends ServerOpcode090Packet {

    public OO(k20_0 owner, ByteBuffer buffer) {
        super(owner, buffer);
    }
}
