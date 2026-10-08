package f;

import cn.pokemmo.net.packet.inbound.ServerOpcode190Packet;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - ServerOpcode190Packet
 * 操作码: 190
 * 原始混淆类: f.U50
 * 现代实现: cn.pokemmo.net.packet.inbound.ServerOpcode190Packet
 */
public class U50 extends ServerOpcode190Packet {

    public U50(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
