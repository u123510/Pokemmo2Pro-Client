package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class MapRockSmashSpriteProvider extends BaseSpriteFrameProvider {
    public final vh_1 Y9;
    public final Rk0 AH;
    public final int dq0;

    public MapRockSmashSpriteProvider(FJ v1, Rk0 v2, int i3) {
        this.Y9 = v1;
        this.AH = v2;
        this.dq0 = i3;
    }


    public final i4_0 KN() {
        Tt0 v1 = new Tt0(this.Y9.EG(2));
        Gt0 v2 = new Gt0(this.Y9.EG(8), false);
        Bp0 v3 = new Bp0();
        Bp0 v4 = new Bp0();
        this.AH.DX(this.dq0, v3, v4);
        int i5 = this.dq0;
        if (i5 >= 9 && i5 <= 13) {
            v3.x = 48.0f;
            v3.y = 48.0f;
            v4.x = 24.0f;
            v4.y = 24.0f;
        }
        i4_0 v5 = new i4_0((int) v3.x, (int) v3.y, ix0_0.Vw);
        this.AH.Q60(this.dq0, v2, v1, v5, v4, (short[]) null);
        this.AH.Lpt8();
        return v5;
    }
}
