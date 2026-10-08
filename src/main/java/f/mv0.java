package f;

import cn.pokemmo.net.packet.inbound.TargetFocusPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - TargetFocusPacket
 * 操作码: 8
 * 原始混淆类: f.mv0
 * 现代实现: cn.pokemmo.net.packet.inbound.TargetFocusPacket
 */
public class mv0 extends TargetFocusPacket {

    public mv0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
