package cn.pokemmo.world.map;

import f.*;
import java.nio.ByteBuffer;

public class MapPointDataBlockHeader {
    public final int Is0;
    public final rj0_2[] M10;

    public MapPointDataBlockHeader(int i1, ByteBuffer v2) {
        this.Is0 = i1;
        this.M10 = new rj0_2[15];
        for (int i = 0; i < 15; i++) {
            this.M10[i] = new rj0_2(v2);
        }
    }

    public static int lP(int i0) {
        if (i0 < 360) {
            return 1;
        } else if (i0 < 390) {
            return 2;
        } else if (i0 < 420) {
            return 3;
        } else if (i0 < 600) {
            return 4;
        } else if (i0 < 690) {
            return 5;
        } else if (i0 < 720) {
            return 6;
        } else if (i0 < 930) {
            return 7;
        } else if (i0 < 960) {
            return 8;
        } else if (i0 < 1020) {
            return 9;
        } else if (i0 < 1080) {
            return 10;
        } else if (i0 < 1110) {
            return 11;
        } else if (i0 < 1200) {
            return 12;
        } else if (i0 < 1260) {
            return 13;
        } else if (i0 < 1380) {
            return 14;
        } else {
            return 0;
        }
    }

    public final rj0_2 bB() {
        c8_0 c8 = c8_0.JD0;
        int i0 = c8.d60() * 60 + (c8.ki0() % 3600) / 60;
        int idx = lP(i0);
        return this.M10[idx];
    }
}
