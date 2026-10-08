package f;

import cn.pokemmo.net.packet.system.LoginSessionHandshakeResponseEvent;
import java.nio.ByteBuffer;
import cn.pokemmo.net.packet.system.BaseNetworkSessionEvent;

public class rv_1 extends LoginSessionHandshakeResponseEvent {
    public rv_1(TX tX, ByteBuffer byteBuffer) {
        super(tX, byteBuffer);
    }
}
