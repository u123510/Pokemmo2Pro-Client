package f;

import cn.pokemmo.net.packet.inbound.PlayerWarpTeleportPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - PlayerWarpTeleportPacket
 * 操作码: 25
 * 原始混淆类: f.YS
 * 现代实现: cn.pokemmo.net.packet.inbound.PlayerWarpTeleportPacket
 */
public class YS extends PlayerWarpTeleportPacket {

    public YS(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
