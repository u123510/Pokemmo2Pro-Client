/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import f.PO;
import f.Q20;
import f.XG0;
import f.au_2;
import f.i4_0;
import f.i8_0;
import f.ix0_0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.vj0
 */
public class MapLampGlowSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ int zq0;
    public final /* synthetic */ i8_0 S00;
    public final /* synthetic */ PO S;

    public MapLampGlowSpriteProvider(PO pO, int n, i8_0 i8_02) {
        this.S = pO;
        this.zq0 = n;
        this.S00 = i8_02;
    }

    @Override
    public final i4_0 KN() {
        MapLampGlowSpriteProvider vj0_12 = this;
        int n = vj0_12.zq0;
        PO pO = vj0_12.S;
        int n11 = pO.Db / 2 / 8;
        int n2 = pO.FZ / 4;
        XG0 xG0 = XG0.hi0;
        ByteBuffer byteBuffer = pO.on.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        i4_0 i4_03 = new Q20(n, n11, n2, xG0, byteBuffer).MO(this.S00);
        i4_0 i4_05 = i4_03;
        Gdx2DPixmap gdx2DPixmap = i4_05.XF;
        int n3 = gdx2DPixmap.SH * 2;
        int n4 = gdx2DPixmap.mB0 / 2;
        ix0_0 ix0_02 = i4_05.rH0();
        i4_0 i4_04 = new i4_0(n3, n4, ix0_02);
        n3 = 0;
        while (n3 < 4) {
            int n5 = n3++;
            n4 = n5 % 2 * 64;
            int n6 = n5 / 2 * 32;
            int n7 = 0;
            int n8 = n5 * 32;
            int n9 = 64;
            int n10 = 32;
            i4_04.XF.bJ(i4_03.XF, n7, n8, n4, n6, n9, n10);
        }
        i4_03.dispose();
        return i4_04;
    }
}
