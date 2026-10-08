package cn.pokemmo.net.session;

import f.OV;
import f.gn_2;
import f.kt0;

public class PlayerSessionCacheManager {
    public static final PlayerSessionCacheManager pn = new PlayerSessionCacheManager();
    public final OV[] zx0;
    public kt0 XT;

    public PlayerSessionCacheManager() {
        this.XT = null;
        this.zx0 = new OV[5];
        for (byte i = 0; i < this.zx0.length; i = (byte)(i + 1)) {
            this.zx0[i] = new OV(0);
        }
    }

    public static PlayerSessionCacheManager fj0() {
        return pn;
    }

    public gn_2 vi(byte i1, short i2) {
        return (gn_2) this.zx0[i1].xk.f5(i2);
    }

    public gn_2 l3() {
        return this.XT;
    }
}
