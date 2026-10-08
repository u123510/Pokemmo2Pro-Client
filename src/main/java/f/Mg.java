package f;

import cn.pokemmo.net.packet.protocol.BaseNetworkPacket;

/**
 * Shim: Mg -> BaseNetworkPacket
 * @see cn.pokemmo.net.packet.protocol.BaseNetworkPacket
 */
public abstract class Mg extends BaseNetworkPacket {
    public Mg(byte by) {
        super(by);
    }
}
