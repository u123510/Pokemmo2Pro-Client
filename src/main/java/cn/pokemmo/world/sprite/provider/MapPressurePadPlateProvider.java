/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Zg
 */
public class MapPressurePadPlateProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 Sn0;

    public MapPressurePadPlateProvider(FJ fJ) {
        this.Sn0 = fJ;
    }

    @Override
    public final i4_0 KN() {
        i4_0 i4_03 = new i4_0(256, 168, ix0_0.Vw);
        Tt0 object = new Tt0(this.Sn0.EG(0));
        Gt0 gt03 = new Gt0(this.Sn0.EG(7), false);
        i4_0 i4_04 = new IA0(this.Sn0.EG(16), false).dB(object, gt03);
        i4_03.NH0(i4_04, 0, 0);
        i4_04.dispose();
        gt03 = new Gt0(this.Sn0.EG(5), false);
        i4_0 i4_05 = new IA0(this.Sn0.EG(17), false).dB(object, gt03);
        i4_03.NH0(i4_05, 0, 0);
        i4_05.dispose();
        return i4_03;
    }
}
