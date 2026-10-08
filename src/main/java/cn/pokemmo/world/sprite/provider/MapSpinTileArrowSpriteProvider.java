package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class MapSpinTileArrowSpriteProvider extends BaseSpriteFrameProvider {
    public final vh_1 if$;
    public final int Oq0;
    public final int wJ;

    public MapSpinTileArrowSpriteProvider(FJ v1, int i2, int i3) {
        super();
        this.if$ = v1;
        this.Oq0 = i2;
        this.wJ = i3;
    }

    public final i4_0 KN() {
        Tt0 tt = new Tt0(this.if$.EG(this.Oq0));
        Gt0 gt = new Gt0(this.if$.EG(this.wJ), false);
        return gt.NK(tt, gt.LA, gt.v4);
    }
}
