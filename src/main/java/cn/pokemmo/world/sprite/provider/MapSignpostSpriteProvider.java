package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class MapSignpostSpriteProvider extends BaseSpriteFrameProvider {
    public final vh_1 m00;
    public final int OF;
    public final Rk0 nj0;
    public final int E4;

    public MapSignpostSpriteProvider(FJ v1, int i2, Rk0 v3, int i4) {
        this.m00 = v1;
        this.OF = i2;
        this.nj0 = v3;
        this.E4 = i4;
    }

    public final i4_0 KN() {
        Tt0 v1 = new Tt0(this.m00.EG(2));
        Gt0 v2 = new Gt0(this.m00.EG(16), false);
        if (this.OF == 1) {
            v1.Hs();
        }
        Bp0 v3 = new Bp0();
        Bp0 v4 = new Bp0();
        this.nj0.DX(this.E4, v3, v4);
        i4_0 v5 = new i4_0((int) v3.x, (int) v3.y, ix0_0.Vw);
        this.nj0.Q60(this.E4, v2, v1, v5, v4, (short[]) null);
        this.nj0.Lpt8();
        return v5;
    }
}
