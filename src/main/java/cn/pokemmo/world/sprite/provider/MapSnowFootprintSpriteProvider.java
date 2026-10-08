package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class MapSnowFootprintSpriteProvider extends BaseSpriteFrameProvider {
    public final qa0_1 Ds0;
    public final int lpT5;
    public final int[] Uy;
    public final int PK0;

    public MapSnowFootprintSpriteProvider(qa0_1 v1, int i2, int[] v3, int i4) {
        this.Ds0 = v1;
        this.lpT5 = i2;
        this.Uy = v3;
        this.PK0 = i4;
    }

    public final i4_0 KN() {
        ByteBuffer v1 = this.Ds0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        Q20 v2 = new Q20(1, 1, this.lpT5, XG0.hi0, v1);
        int i0 = this.Uy[0];
        int i1 = this.PK0;
        return fp_2.F9(this.Ds0, v2, i0, i1, 96, 120);
    }
}
