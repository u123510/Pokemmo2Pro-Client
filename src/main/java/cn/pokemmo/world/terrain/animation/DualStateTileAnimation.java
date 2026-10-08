package cn.pokemmo.world.terrain.animation;

import f.*;

public class DualStateTileAnimation extends BaseTerrainTileAnimation {

    public DualStateTileAnimation(byte i1, byte i2, nk_0 v3, nk_0 v4) {
        super(i1, i2, new nk_0[0]);
        this.instanceof$(new nk_0[] { v3, v4 });
    }

    public final int oH0() {
        return 0;
    }

    public final nk_0 Gs(int i1, int i2, int i3) {
        if (i2 < 1) {
            i2 = 1;
        }
        if (i3 < 1) {
            i3 = 1;
        }
        byte i4 = this.JE;
        if (i4 != 1 && i4 != 0) {
            return this.mH0[(i1 % (i2 * 2)) / i2];
        }
        return this.mH0[(i1 % (i3 * 2)) / i3];
    }

    public final boolean KR(short i1, short i2, short i3, short i4, int i5, int i6) {
        if (i5 < 1) {
            i5 = 1;
        }
        if (i6 < 1) {
            i6 = 1;
        }
        switch (this.JE) {
            case 0:
                return i1 == i3 && i2 >= i4 && i2 <= i4 + i6;
            case 1:
                return i1 == i3 && i2 <= i4 && i2 >= i4 - i6;
            case 2:
                return i2 == i4 && i1 <= i3 && i1 >= i3 - i5;
            case 3:
                return i2 == i4 && i1 >= i3 && i1 <= i3 + i5;
            default:
                return false;
        }
    }
}
