package f;

import cn.pokemmo.net.packet.inbound.BaseMonsterInboundPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - BaseMonsterInboundPacket
 * 抽象中间层协议基类
 * 原始混淆类: f.S20
 * 现代实现: cn.pokemmo.net.packet.inbound.BaseMonsterInboundPacket
 */
public abstract class S20 extends BaseMonsterInboundPacket {

    public S20(ByteBuffer byteBuffer, k20_0 k20_02) {
        super(byteBuffer, k20_02);
    }
}
