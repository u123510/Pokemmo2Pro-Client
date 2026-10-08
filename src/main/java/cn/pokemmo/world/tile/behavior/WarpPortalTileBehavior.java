package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class WarpPortalTileBehavior extends BaseTileBehavior {
    public final byte[] ln;
    public final byte[] At0;

    public WarpPortalTileBehavior(byte... bytes) {
        super();
        this.ln = bytes;
        this.At0 = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            this.At0[i] = tx_1.Qf0(bytes[i]);
        }
    }

    @Override
    public final boolean wn0(byte b) {
        for (byte b2 : this.ln) {
            if (b == b2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean zF(LT lt, bi0_1 bi0_1, byte b, byte b2) {
        for (byte b3 : this.At0) {
            if (b == b3) {
                return true;
            }
        }
        return false;
    }
}
