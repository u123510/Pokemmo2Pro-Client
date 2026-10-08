/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.calc;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.calc.BaseDamageCalculator;

import f.DC0;
import f.Jw;
import f.Ry;
import f.tw0_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.jh0
 */
public class StatStageModifierCalculator extends BaseDamageCalculator {
    public Jw Ca;

    public StatStageModifierCalculator(Ry ry, ByteBuffer byteBuffer) {
        super(byteBuffer, ry, 8);
    }

    @Override
    public final void Oj0() {
        StatStageModifierCalculator jh0_12 = this;
        int n = jh0_12.Rj.getInt();
        int n2 = jh0_12.Rj.getInt();
        byte[] byArray = new byte[32];
        this.Rj.get(byArray);
        this.Ca = new Jw(byArray, n, n2);
    }

    @Override
    public final void os0() {
        tw0_0.hg = this.Ca;
    }
}

