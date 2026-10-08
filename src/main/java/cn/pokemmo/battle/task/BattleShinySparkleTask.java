/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.N60;
import f.NU;
import f.b30_0;
import f.fy_2;
import f.tw0_0;

public class BattleShinySparkleTask
extends N60 {
    public final b30_0 xx;

    public BattleShinySparkleTask(b30_0 b30_02) {
        this.xx = b30_02;
    }

    @Override
    public final boolean lPt1() {
        fy_2 fy_22 = tw0_0.LD0.he0.N10.TH0;
        return (fy_22 != null && fy_22.eE) ^ true;
    }

    @Override
    public final void ii() {
        tw0_0.LD0.he0.N10.Xi0();
    }

    @Override
    public final boolean NJ() {
        return false;
    }

    @Override
    public final NU gJ0() {
        return NU.bv0;
    }
}

