package f;

import cn.pokemmo.net.packet.inbound.TileMapCollisionPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - TileMapCollisionPacket
 * 操作码: 255
 * 原始混淆类: f.K8
 * 现代实现: cn.pokemmo.net.packet.inbound.TileMapCollisionPacket
 */
public class K8 extends TileMapCollisionPacket {

    public K8(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }
}
