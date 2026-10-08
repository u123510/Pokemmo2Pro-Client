package f;

import cn.pokemmo.net.packet.system.LoginSessionChallengeEvent;
import java.nio.ByteBuffer;
import cn.pokemmo.net.packet.system.BaseNetworkSessionEvent;

public class fg0_0 extends LoginSessionChallengeEvent {
    public fg0_0(TX owner, ByteBuffer data) {
        super(owner, data);
    }
}
