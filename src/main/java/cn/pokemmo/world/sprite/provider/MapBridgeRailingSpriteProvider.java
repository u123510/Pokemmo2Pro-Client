/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

/*
 * Renamed from f.uK0
 */
public class MapBridgeRailingSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ yh_0 rv0;

    public MapBridgeRailingSpriteProvider(yh_0 yh_02) {
        this.rv0 = yh_02;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt02 = new Tt0(this.rv0.iD0.GJ(13018));
        Gt0 gt0 = new Gt0(this.rv0.iD0.GJ(13002), true);
        int n = gt0.LA;
        return gt0.NK(tt02, n, gt0.v4);
    }
}

