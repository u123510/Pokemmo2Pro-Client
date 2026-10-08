/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.E90;
import f.J4;
import f.LT;
import f._else;
import f.bi0_1;
import f.nt_1;
import f.tw0_0;
import f.yt_1;
import f.zv_2;

public class LedgeJumpTileBehavior extends BaseTileBehavior {
    @Override
    public final boolean aH(LT lT, bi0_1 bi0_12, byte by, byte by2) {
        if (!(bi0_12 instanceof E90)) {
            return false;
        }
        E90 e90 = (E90)bi0_12;
        if (!e90.iz0((byte)1)) {
            return false;
        }
        yt_1 yt_12 = tw0_0.e60;
        if (yt_12 == null) {
            return false;
        }
        zv_2 zv_22 = e90.ba0;
        byte by3 = zv_22.uS;
        byte by4 = zv_22.o0;
        byte by5 = zv_22.ID0;
        Object object = (_else)yt_12.E6.get(J4.iA0(by3, by4, by5));
        if (object == null) {
            return false;
        }
        if ((object = ((_else)object).gv(lT, by, 1)) != null && !((LT)object).LPt1()) {
            if (yt_12.Vm0(((LT)object).Es(), (LT)object)) {
                return true;
            }
            if ((by2 & 1) == 0 && tw0_0.rl != null && (object = tw0_0.e60) != null && bi0_12 == ((yt_1)object).jB0) {
                tw0_0.rl.fw = true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean xx0(bi0_1 bi0_12, byte by) {
        if (!(bi0_12 instanceof E90)) {
            return false;
        }
        return ((E90)bi0_12).iz0((byte)1) ^ true;
    }
}

