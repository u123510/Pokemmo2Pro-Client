/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Texture;

/*
 * Renamed from f.Fm
 */
public class SwampTileBehavior extends BaseTileBehavior {
    @Override
    public final void u00(LT lT, bi0_1 bi0_12, hl0_1 hl0_12, int n, int n2, int n3, int n4) {
        Object object = QI.Py.kN((byte)0, 165, false).li0((int)((hk0_1.KG + (long)bi0_12.hashCode()) / 100L % 2L));
        if (!(bi0_12 instanceof KF)) {
            object = ((Wr)object).H8();
            float f = n3;
            float f2 = n4 + 8;
            hl0_12.CH0((Texture)object, f, f2);
        }
    }

    @Override
    public final boolean xB(LT lT, LT lT2, bi0_1 bi0_12, byte by) {
        if (bi0_12.vx0() && bi0_12.Ou()) {
            short s = 1662;
            tw0_0.RE0.d00(true, (byte)2, s, 0.0f);
        }
        return false;
    }
}

