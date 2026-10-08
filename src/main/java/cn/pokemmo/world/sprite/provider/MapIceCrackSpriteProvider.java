package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class MapIceCrackSpriteProvider extends BaseSpriteFrameProvider {
    public final qa0_1 Xa0;
    public final int ba0;
    public final int[] do0;
    public final int NH;

    public MapIceCrackSpriteProvider(qa0_1 v1, int i2, int[] v3, int i4) {
        this.Xa0 = v1;
        this.ba0 = i2;
        this.do0 = v3;
        this.NH = i4;
    }

    public final i4_0 KN() {
        ByteBuffer v1 = this.Xa0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        Q20 v2 = new Q20(1, 1, this.ba0, XG0.hi0, v1);
        int i0 = this.do0[1];
        int i1 = this.NH;
        return fp_2.F9(this.Xa0, v2, i0, i1, 256, 120);
    }
}
