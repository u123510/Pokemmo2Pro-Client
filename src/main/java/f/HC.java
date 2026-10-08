package f;

import cn.pokemmo.net.packet.payload.ClientKeepAlivePacket;

/**
 * Shim: HC -> ClientKeepAlivePacket
 * @see cn.pokemmo.net.packet.payload.ClientKeepAlivePacket
 */
public final class HC extends ClientKeepAlivePacket {
    public HC() {
        super();
    }
}
