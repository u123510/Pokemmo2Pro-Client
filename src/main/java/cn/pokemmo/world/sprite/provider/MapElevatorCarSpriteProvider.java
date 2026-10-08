/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

/*
 * Renamed from f.tN
 */
public class MapElevatorCarSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ yh_0 lpT8;

    public MapElevatorCarSpriteProvider(yh_0 yh_02) {
        this.lpT8 = yh_02;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt02 = new Tt0(this.lpT8.iD0.GJ(14252));
        Gt0 gt0 = new Gt0(this.lpT8.iD0.GJ(14240), true);
        int n = gt0.LA;
        return gt0.NK(tt02, n, gt0.v4);
    }
}

