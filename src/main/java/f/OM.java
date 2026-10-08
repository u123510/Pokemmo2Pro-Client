package f;

import cn.pokemmo.net.packet.inbound.PokedexEntryUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - PokedexEntryUpdatePacket
 * 操作码: 22
 * 原始混淆类: f.OM
 * 现代实现: cn.pokemmo.net.packet.inbound.PokedexEntryUpdatePacket
 */
public class OM extends PokedexEntryUpdatePacket {

    public OM(k20_0 owner, ByteBuffer buffer) {
        super(owner, buffer);
    }
}
