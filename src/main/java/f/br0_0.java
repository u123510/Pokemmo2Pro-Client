package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode179Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode179Packet
 * 操作码: 179
 * 原始混淆类: f.br0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode179Packet
 */
public class br0_0 extends ServerOpcode179Packet {

    public br0_0(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }
}
