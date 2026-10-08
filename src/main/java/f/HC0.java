package f;

import cn.pokemmo.net.packet.system.HandshakeKeepAlivePacket;
import cn.pokemmo.net.packet.system.BaseSecureHandshakePacket;

public class HC0 extends HandshakeKeepAlivePacket {
    public HC0(int n) {
        super(n);
    }
}
