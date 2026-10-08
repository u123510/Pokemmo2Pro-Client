/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Texture;

/*
 * Renamed from f.bv
 */
public class TallGrassTileBehavior extends BaseTileBehavior {
    public final byte vU;
    public final int iD;

    public TallGrassTileBehavior(byte by, int n) {
        this.vU = by;
        this.iD = n;
    }

    @Override
    public final boolean xB(LT lT, LT lT2, bi0_1 bi0_12, byte by) {
        int n = 150;
        if (bi0_12.oI0()) {
            n = 75;
        } else if (bi0_12.uv()) {
            n = 100;
        }
        if (bi0_12.ba0.Y30 == 1) {
            n += 50;
        }
        by = 0;
        if (bi0_12.il0.BQ) {
            by = (byte)500;
        }
        if (bi0_12.vx0() && !tw0_0.LD0.nv()) {
            com5__1 com5__12 = new com5__1(this.vU, by, n, this.iD);
            short s = bi0_12.ba0.Y30 == 0 ? (short)40 : 100;
            com5__12.kI = s;
            lT.ZD0(com5__12);
            if (bi0_12.Ou()) {
                s = 1658;
                tw0_0.RE0.d00(true, (byte)2, s, 0.0f);
            }
        }
        return false;
    }

    @Override
    public final void u00(LT lT, bi0_1 bi0_12, hl0_1 hl0_12, int n, int n2, int n3, int n4) {
        if (lT.lW()) {
            return;
        }
        byte by = bi0_12.ba0.uS;
        Object object = QI.Py.kN(by, this.iD, false).li0(0);
        if (object != null) {
            object = ((Wr)object).H8();
            float f = n;
            float f2 = n2;
            hl0_12.CH0((Texture)object, f, f2);
        }
    }
}

