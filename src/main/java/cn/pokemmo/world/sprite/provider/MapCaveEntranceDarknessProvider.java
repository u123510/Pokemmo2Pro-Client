/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class MapCaveEntranceDarknessProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ short Ib;
    public final /* synthetic */ int T0;
    public final /* synthetic */ Ae bO;
    public final /* synthetic */ Rk0 kj0;
    public final /* synthetic */ yh_0 I80;

    public MapCaveEntranceDarknessProvider(yh_0 yh_02, short s, int n, Ae ae, Rk0 rk0) {
        this.I80 = yh_02;
        this.Ib = s;
        this.T0 = n;
        this.bO = ae;
        this.kj0 = rk0;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt02 = new Tt0(this.I80.iD0.GJ(this.Ib * 20 + 18 + this.T0));
        Gt0 gt02 = new Gt0(this.bO, true);
        int n = 96;
        int n2 = 96;
        return this.kj0.oQ(gt02, tt02, 0, n, n2, 0);
    }
}

