/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Zv
 */
public class MapAnimatedBannerSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 bA0;

    public MapAnimatedBannerSpriteProvider(FJ fJ) {
        this.bA0 = fJ;
    }

    @Override
    public final i4_0 KN() {
        i4_0 i4_03 = new i4_0(256, 168, ix0_0.Vw);
        Tt0 object = new Tt0(this.bA0.EG(0));
        Gt0 gt02 = new Gt0(this.bA0.EG(19), false);
        i4_0 i4_04 = new IA0(this.bA0.EG(22), false).dB(object, gt02);
        i4_03.NH0(i4_04, 0, 0);
        i4_04.dispose();
        i4_0 i4_05 = new IA0(this.bA0.EG(24), false).dB(object, gt02);
        i4_03.NH0(i4_05, 0, 0);
        i4_05.dispose();
        return i4_03;
    }
}
