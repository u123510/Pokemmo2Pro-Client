package f;

import cn.pokemmo.net.packet.inbound.PlayerStateUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - PlayerStateUpdatePacket
 * 操作码: 12
 * 原始混淆类: f.lpt9__3
 * 现代实现: cn.pokemmo.net.packet.inbound.PlayerStateUpdatePacket
 */
public class lpt9__3 extends PlayerStateUpdatePacket {

    public lpt9__3(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
