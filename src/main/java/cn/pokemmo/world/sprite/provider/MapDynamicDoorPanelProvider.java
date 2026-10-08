package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class MapDynamicDoorPanelProvider extends BaseSpriteFrameProvider {
    public final vh_1 ka0;
    public final int FN;
    public final Rk0 V60;

    public MapDynamicDoorPanelProvider(int index, Rk0 renderer, FJ sheet) {
        this.ka0 = sheet;
        this.FN = index;
        this.V60 = renderer;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tiles = new Tt0(this.ka0.EG(14));
        Gt0 image = new Gt0(this.ka0.EG(33), false);
        if (this.FN == 2 || this.FN == 3) {
            LPT4_[] row2 = tiles.dc0[2];
            LPT4_[] row3 = tiles.dc0[3];
            tiles.dc0[2] = row3;
            tiles.dc0[3] = row2;
        }
        Bp0 min = new Bp0();
        Bp0 max = new Bp0();
        this.V60.DX(this.FN, min, max);
        if (this.FN > 3) {
            max.y -= 24.0f;
        }
        i4_0 result = new i4_0(40, 40, ix0_0.Vw);
        this.V60.Q60(this.FN, image, tiles, result, max, null);
        this.V60.Lpt8();
        return result;
    }
}
