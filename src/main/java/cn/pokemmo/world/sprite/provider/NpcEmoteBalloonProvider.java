package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class NpcEmoteBalloonProvider extends BaseSpriteFrameProvider {
    public final vh_1 km0;
    public final Rk0 YP;
    public final int Wc0;

    public NpcEmoteBalloonProvider(FJ source, Rk0 map, int index) {
        this.km0 = source;
        this.YP = map;
        this.Wc0 = index;
    }

    public final i4_0 KN() {
        Tt0 terrain = new Tt0(this.km0.EG(2));
        Gt0 objects = new Gt0(this.km0.EG(27), false);
        Bp0 position = new Bp0();
        Bp0 offset = new Bp0();
        this.YP.DX(this.Wc0, position, offset);
        i4_0 result = new i4_0((int) position.x, (int) position.y, ix0_0.Vw);
        this.YP.Q60(this.Wc0, objects, terrain, result, offset, null);
        this.YP.Lpt8();
        return result;
    }
}
