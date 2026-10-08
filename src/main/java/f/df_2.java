package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode108Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode108Packet
 * 操作码: 108
 * 原始混淆类: f.df_2
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode108Packet
 */
public class df_2 extends ServerOpcode108Packet {

    public df_2(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
