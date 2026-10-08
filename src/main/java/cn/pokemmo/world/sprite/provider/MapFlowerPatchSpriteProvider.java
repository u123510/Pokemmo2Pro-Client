package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class MapFlowerPatchSpriteProvider extends BaseSpriteFrameProvider {
    public final Rk0 c60;
    public final Gt0 j2;
    public final Tt0 a;
    public final byte TG0;

    public MapFlowerPatchSpriteProvider(Rk0 rk0, Gt0 gt0, Tt0 tt0, byte b) {
        super();
        this.c60 = rk0;
        this.j2 = gt0;
        this.a = tt0;
        this.TG0 = b;
    }

    @Override
    public final i4_0 KN() {
        return this.c60.oQ(this.j2, this.a, this.TG0, 16, 32, -16);
    }
}
