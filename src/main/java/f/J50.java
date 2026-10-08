package f;

import cn.pokemmo.net.packet.inbound.CompressedBatchDataPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - CompressedBatchDataPacket
 * 操作码: 10
 * 原始混淆类: f.J50
 * 现代实现: cn.pokemmo.net.packet.inbound.CompressedBatchDataPacket
 */
public class J50 extends CompressedBatchDataPacket {

    public J50(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }
}
