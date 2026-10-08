package f;

import cn.pokemmo.net.packet.inbound.ServerTimestampSyncPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerTimestampSyncPacket
 * 操作码: 249
 * 原始混淆类: f.PI
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerTimestampSyncPacket
 */
public class PI extends ServerTimestampSyncPacket {

    public PI(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
