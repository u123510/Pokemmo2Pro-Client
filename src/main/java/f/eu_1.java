package f;

import cn.pokemmo.net.packet.system.ProtocolWorldEventPacket;
import java.nio.ByteBuffer;
import cn.pokemmo.net.packet.system.BaseProtocolPacketWrapper;

public abstract class eu_1 extends ProtocolWorldEventPacket {
    public eu_1(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }
}
