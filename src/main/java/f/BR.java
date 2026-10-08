package f;

import cn.pokemmo.net.session.GameClientNetworkHandler;

/**
 * Shim: BR -> GameClientNetworkHandler
 * @see cn.pokemmo.net.session.GameClientNetworkHandler
 */
public final class BR extends GameClientNetworkHandler {
    public BR(np_0 var1, int var2, byte[] var3) {
        super(var1, var2, var3);
    }
}
