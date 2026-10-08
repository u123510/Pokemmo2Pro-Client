package cn.pokemmo.world.terrain.animation;

import f.*;

public class SingleFrameTileAnimation extends BaseTerrainTileAnimation {
    public SingleFrameTileAnimation(byte b, nk_0 nk_0) {
        super(b, nk_0.gO(), new nk_0[]{nk_0});
    }

    public final nk_0 Gs(int i, int j, int k) {
        return this.mH0[0];
    }

    public final int oH0() {
        return this.mH0[0].h3 + 10;
    }
}
