package f;

import cn.pokemmo.net.packet.outbound.PlayerMovementRequestPacket;
import java.nio.ByteBuffer;

/**
 * 客户端出站请求数据包垫片 - PlayerMovementRequestPacket
 * 操作码: 6
 * 原始混淆类: f.bw0_0
 * 现代实现: cn.pokemmo.net.packet.outbound.PlayerMovementRequestPacket
 */
public class bw0_0 extends PlayerMovementRequestPacket {

    public bw0_0(zv_2 zv_22, boolean bl, boolean bl2) {
        super(zv_22, bl, bl2);
    }
}
