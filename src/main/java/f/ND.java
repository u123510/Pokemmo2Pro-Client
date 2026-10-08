package f;

import cn.pokemmo.net.packet.inbound.PlayerDirectionUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - PlayerDirectionUpdatePacket
 * 操作码: 24
 * 原始混淆类: f.ND
 * 现代实现: cn.pokemmo.net.packet.inbound.PlayerDirectionUpdatePacket
 */
public class ND extends PlayerDirectionUpdatePacket {

    public ND(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
