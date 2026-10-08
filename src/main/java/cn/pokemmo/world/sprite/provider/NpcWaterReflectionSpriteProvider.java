/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.G90;
import f.Q20;
import f.XG0;
import f.au_2;
import f.da_0;
import f.i4_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.d7
 */
public class NpcWaterReflectionSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 con;
    public final /* synthetic */ int oC;
    public final /* synthetic */ int xx0;

    public NpcWaterReflectionSpriteProvider(qa0_1 qa0_12, int n, int n2) {
        this.con = qa0_12;
        this.oC = n;
        this.xx0 = n2;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.con.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position(this.oC + 392);
        int n = G90.GF0(byteBuffer.getInt());
        XG0 xG0 = XG0.hi0;
        return new Q20(n, 8, 8, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, this.xx0, byteBuffer, (byte)0));
    }
}

