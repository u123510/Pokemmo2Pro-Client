package f;

import cn.pokemmo.net.packet.system.ServerAckResponsePacket;
import java.nio.ByteBuffer;

public abstract class L70 extends ServerAckResponsePacket {
    protected L70(ByteBuffer buffer, int value) {
        super(buffer, value);
    }
}
