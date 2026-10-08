package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class MapWeatherSunbeamProvider extends BaseSpriteFrameProvider {
    public final qa0_1 OC0;
    public final int kG0;
    public final int[] C00;
    public final int d2;

    public MapWeatherSunbeamProvider(qa0_1 v1, int i2, int[] v3, int i4) {
        this.OC0 = v1;
        this.kG0 = i2;
        this.C00 = v3;
        this.d2 = i4;
    }

    public final i4_0 KN() {
        ByteBuffer v1 = this.OC0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        Q20 v2 = new Q20(1, 1, this.kG0, XG0.hi0, v1);
        int i0 = this.C00[2];
        int i1 = this.d2;
        return fp_2.F9(this.OC0, v2, i0, i1, 240, 160);
    }
}
