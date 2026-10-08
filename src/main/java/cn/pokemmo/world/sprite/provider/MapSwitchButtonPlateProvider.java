/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.Q20;
import f.XG0;
import f.au_2;
import f.i4_0;
import f.i8_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.z00
 */
public class MapSwitchButtonPlateProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 qG0;
    public final /* synthetic */ int Je0;
    public final /* synthetic */ ByteBuffer os;

    public MapSwitchButtonPlateProvider(int n, qa0_1 qa0_12, ByteBuffer byteBuffer) {
        this.qG0 = qa0_12;
        this.Je0 = n;
        this.os = byteBuffer;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.qG0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        return new Q20(this.Je0, 16, 16, xG0, byteBuffer).MO(new i8_0(xG0, 128, this.os));
    }
}

