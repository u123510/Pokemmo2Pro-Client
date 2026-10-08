package f;

import cn.pokemmo.net.packet.inbound.MonsterSummaryUpdatePacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - MonsterSummaryUpdatePacket
 * 操作码: 177
 * 原始混淆类: f.w5
 * 现代实现: cn.pokemmo.net.packet.inbound.MonsterSummaryUpdatePacket
 */
public class w5 extends MonsterSummaryUpdatePacket {

    public w5(k20_0 source, ByteBuffer data) {
        super(source, data);
    }
}
