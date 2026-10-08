package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class PokemonAtlasSpriteProvider extends BaseSpriteFrameProvider {
    public final qa0_1 in0;
    public final int w70;
    public final int[] Pk0;
    public final int w1;

    public PokemonAtlasSpriteProvider(qa0_1 owner, int value, int[] values, int index) {
        this.in0 = owner;
        this.w70 = value;
        this.Pk0 = values;
        this.w1 = index;
    }

    @Override
    public i4_0 KN() {
        ByteBuffer buffer = this.in0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        Q20 data = new Q20(this.w70, 1, 1, XG0.hi0, buffer);
        return fp_2.F9(this.in0, data, this.Pk0[3], this.w1, 16, 256);
    }
}
