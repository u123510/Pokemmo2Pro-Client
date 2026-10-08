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
import f.MC0;
import f.Ry;
import f.np_0;
import f.uc_2;
import java.nio.ByteBuffer;

public class MultiHitDamageCalculator extends BaseDamageCalculator {
    public int CoM5;
    public np_0[] HX;

    public MultiHitDamageCalculator(ByteBuffer byteBuffer, Ry ry, int n) {
        super(byteBuffer, ry, n);
    }

    @Override
    public final void Oj0() {
        MultiHitDamageCalculator gP = this;
        gP.HX = new np_0[gP.Rj.get() & 0xFF];
        gP.CoM5 = gP.Rj.get() & 0xFF;
        byte[] byArray = new byte[]{};
        String string = "";
        int n = 0;
        for (int j = 0; j < this.HX.length; ++j) {
            np_0 np_02;
            MultiHitDamageCalculator gP2 = this;
            byte by = gP2.Rj.get();
            String string2 = gP2.q60();
            int n2 = gP2.L8;
            if (n2 != 34) {
                if (n2 == 2) {
                    byArray = new byte[4];
                    this.Rj.get(byArray);
                    string = "";
                } else {
                    MultiHitDamageCalculator gP3 = this;
                    byArray = new byte[gP3.Rj.get() & 0xFF];
                    gP3.Rj.get(byArray);
                    string = gP3.q60();
                }
                n = this.Rj.getInt();
            }
            MultiHitDamageCalculator gP4 = this;
            n2 = gP4.Rj.getShort() & 0xFFFF;
            int n3 = gP4.Rj.getShort() & 0xFFFF;
            boolean bl = (gP4.Rj.get() & 0xFF) == 1;
            np_0 np_03 = new np_0(by, string2, byArray, string, n, n2, n3, bl);
            this.HX[j] = np_03;
        }
    }

    @Override
    public final void os0() {
        uc_2 uc_22 = ((Ry)this.uk).Al0;
        MultiHitDamageCalculator gP = this;
        int n = gP.CoM5;
        np_0[] np_0Array = gP.HX;
        MC0 mC0 = uc_22.RO;
        if (mC0 == MC0.nh || mC0 == MC0.JK || mC0 == MC0.zM) {
            uc_22.RO = MC0.G6;
            uc_22.JC = n;
            uc_22.w80 = np_0Array;
        }
    }
}

