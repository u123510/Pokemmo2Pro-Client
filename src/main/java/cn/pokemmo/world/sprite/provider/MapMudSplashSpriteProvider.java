package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class MapMudSplashSpriteProvider extends BaseSpriteFrameProvider {
    public final vh_1 An;
    public final short IN;
    public final byte AI;
    public final Rk0 m5;
    public final zd_0[] cf;
    public final byte WK0;
    public final byte o50;
    public final int bE0;

    public MapMudSplashSpriteProvider(FJ v1, short i2, byte i3, Rk0 v4, zd_0[] v5, byte i6, byte i7, int i8) {
        this.An = v1;
        this.IN = i2;
        this.AI = i3;
        this.m5 = v4;
        this.cf = v5;
        this.WK0 = i6;
        this.o50 = i7;
        this.bE0 = i8;
      }

    public final i4_0 KN() {
        Ae v1 = this.An.EG(this.IN * 2 + 7 + this.AI);
        if (v1.Vh0 < 1 && this.AI == 1) {
            v1 = this.An.EG(this.IN * 2 + 7);
        }
        Gt0 v2 = new Gt0(v1, false);
        byte i4 = (this.AI == 0) ? this.WK0 : this.o50;
        zd_0 target_zd = this.cf[i4];
        return this.m5.oQ(v2, target_zd, this.bE0, 36, 36, 0);
    }
}
