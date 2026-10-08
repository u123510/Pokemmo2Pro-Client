package cn.pokemmo.world.terrain.animation;

import f.*;

public class CompositeTileAnimation extends BaseTerrainTileAnimation {
    public final dd_1[] rq;

    public CompositeTileAnimation(byte b, dd_1... dd_1s) {
        super(b);
        this.rq = new dd_1[4];
        for (int i = 0; i < dd_1s.length; i++) {
            dd_1 item = dd_1s[i];
            this.rq[item.oH()] = item;
        }
        for (int i = 0; i < 4; i++) {
            if (this.rq[i] == null) {
                throw new RuntimeException();
            }
        }
    }

    public final dd_1 Qr(byte b) {
        int idx = b;
        if (idx < 0 || idx > 3) {
            idx = 0;
        }
        return this.rq[idx];
    }
}
