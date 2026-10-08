package f;

import cn.pokemmo.net.packet.system.SessionDisconnectPacket;
import java.nio.ByteBuffer;

public class uf_2 extends SessionDisconnectPacket {
    public uf_2(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
