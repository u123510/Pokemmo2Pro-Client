package f;

import cn.pokemmo.net.packet.payload.RawByteArrayPacket;

/**
 * Shim: Tw0 -> RawByteArrayPacket
 * @see cn.pokemmo.net.packet.payload.RawByteArrayPacket
 */
public final class Tw0 extends RawByteArrayPacket {
    public Tw0(byte[] byArray) {
        super(byArray);
    }
}
