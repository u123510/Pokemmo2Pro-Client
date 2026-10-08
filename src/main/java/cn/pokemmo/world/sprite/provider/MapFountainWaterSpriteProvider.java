package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class MapFountainWaterSpriteProvider extends BaseSpriteFrameProvider {
    public final Rk0 mk;
    public final Gt0 fJ0;
    public final zd_0 KM;

    public MapFountainWaterSpriteProvider(Rk0 rk0, Gt0 gt0, Tt0 tt0) {
        super();
        this.mk = rk0;
        this.fJ0 = gt0;
        this.KM = tt0;
    }

    @Override
    public final i4_0 KN() {
        return this.mk.oQ(this.fJ0, this.KM, 6, 16, 16, 0);
    }
}
