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
import f.br_2;
import f.da_0;
import f.i4_0;
import f.i8_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.xH
 */
public class MapRockClimbRidgeSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 Q10;

    public MapRockClimbRidgeSpriteProvider(qa0_1 qa0_12) {
        this.Q10 = qa0_12;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.Q10.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        i8_0 i8_02 = da_0.Ic.tv(xG0, this.Q10.EZ.V(br_2.TI0), byteBuffer, (byte)0);
        return new Q20(this.Q10.EZ.V(br_2.Q6), 16, 2, xG0, byteBuffer).MO(i8_02);
    }
}

