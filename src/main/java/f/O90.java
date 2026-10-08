package f;

import cn.pokemmo.net.packet.system.LoginSessionAuthenticationEvent;
import java.nio.ByteBuffer;
import cn.pokemmo.net.packet.system.BaseNetworkSessionEvent;

public class O90 extends LoginSessionAuthenticationEvent {
    public O90(TX owner, ByteBuffer buffer) {
        super(owner, buffer);
    }
}
