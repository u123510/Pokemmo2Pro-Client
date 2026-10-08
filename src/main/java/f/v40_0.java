package f;

import cn.pokemmo.net.packet.protocol.NetworkPacketStreamDecoder;
import java.util.ArrayList;

/**
 * Shim: v40_0 -> NetworkPacketStreamDecoder
 * @see cn.pokemmo.net.packet.protocol.NetworkPacketStreamDecoder
 */
public abstract class v40_0 extends NetworkPacketStreamDecoder {
    public static ArrayList<Mg> nc(byte[] bArr, int i) {
        return NetworkPacketStreamDecoder.nc(bArr, i);
    }

    public static byte lo0(bx_0 bx_0Var, vi_0 vi_0Var) {
        return NetworkPacketStreamDecoder.lo0(bx_0Var, vi_0Var);
    }
}
