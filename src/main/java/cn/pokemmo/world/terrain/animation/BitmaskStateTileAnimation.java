package cn.pokemmo.world.terrain.animation;

import f.*;

public class BitmaskStateTileAnimation extends BaseTerrainTileAnimation {
    public BitmaskStateTileAnimation(byte value, byte... values) {
        super(value, values[0], new nk_0[0]);
        if (values.length != 4) {
            throw new RuntimeException();
        }
        nk_0[] mapped = new nk_0[values.length];
        for (int i = 0; i < values.length; i++) {
            mapped[i] = nk_0.Ha(values[i], t70_0.li);
        }
        this.instanceof$(mapped);
    }

    @Override
    public final int oH0() {
        return 0;
    }

    @Override
    public final nk_0 Gs(int index, int normalCount, int specialCount) {
        if (normalCount < 1) {
            normalCount = 1;
        }
        if (specialCount < 1) {
            specialCount = 1;
        }
        int total = 0;
        for (nk_0 value : this.mH0) {
            if (value.ml0 == 1) {
                total += specialCount;
            } else if (value.ml0 != 0) {
                total += normalCount;
            }
        }
        nk_0[] expanded = new nk_0[total];
        int out = 0;
        for (nk_0 value : this.mH0) {
            int count = value.ml0 == 1 ? specialCount : (value.ml0 != 0 ? normalCount : 0);
            for (int i = 0; i < count; i++) {
                expanded[out++] = value;
            }
        }
        return expanded[index % total];
    }

    @Override
    public final boolean KR(short x1, short y1, short x2, short y2, int horizontal, int vertical) {
        if (horizontal < 1) {
            horizontal = 1;
        }
        if (vertical < 1) {
            vertical = 1;
        }
        if (x1 == x2 && y1 == y2) {
            return true;
        }
        for (nk_0 value : this.mH0) {
            switch (value.ml0) {
                case 3:
                    for (int i = 0; i < horizontal; i++) {
                        x2 = (short) (x2 + 1);
                        if (x1 == x2 && y1 == y2) {
                            return true;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < horizontal; i++) {
                        x2 = (short) (x2 - 1);
                        if (x1 == x2 && y1 == y2) {
                            return true;
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < vertical; i++) {
                        y2 = (short) (y2 + 1);
                        if (x1 == x2 && y1 == y2) {
                            return true;
                        }
                    }
                    break;
                case 0:
                    for (int i = 0; i < vertical; i++) {
                        y2 = (short) (y2 - 1);
                        if (x1 == x2 && y1 == y2) {
                            return true;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return false;
    }
}
