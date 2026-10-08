package f;

import cn.pokemmo.net.packet.outbound.action.Action017OutboundPacket;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - Hg0 -> Action017OutboundPacket
 */
public class Hg0 extends Action017OutboundPacket {
    public Hg0(String username, String password, boolean useStoredCredentials, boolean rememberCredentials, RR credential) {
        super(username, password, useStoredCredentials, rememberCredentials, credential);
    }
}
