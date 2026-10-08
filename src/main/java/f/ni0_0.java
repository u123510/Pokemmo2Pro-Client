package f;

import cn.pokemmo.net.packet.inbound.HandshakeAuthPacket;
import java.nio.ByteBuffer;

/**
 * 服务端入站协议数据包垫片 - HandshakeAuthPacket
 * 操作码: 1
 * 原始混淆类: f.ni0_0
 * 现代实现: cn.pokemmo.net.packet.inbound.HandshakeAuthPacket
 */
public class ni0_0 extends HandshakeAuthPacket {

    public ni0_0(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }
}
