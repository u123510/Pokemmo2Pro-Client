package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.nio.ByteOrder;

public class MapWildGrassBladeSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ int Xa0;
    public final /* synthetic */ int Xa;
    public final /* synthetic */ qa0_1 Wz;
    public final /* synthetic */ i8_0 CA0;

    public MapWildGrassBladeSpriteProvider(int i1, int i2, qa0_1 v3, i8_0 v4) {
        super();
        this.Xa0 = i1;
        this.Xa = i2;
        this.Wz = v3;
        this.CA0 = v4;
    }

    public final i4_0 KN() {
        Q20 q20 = new Q20(this.Xa0, 2, this.Xa, XG0.hi0, this.Wz.VL0.slice().order(ByteOrder.LITTLE_ENDIAN));
        return q20.MO(this.CA0);
    }
}
