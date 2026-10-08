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
import f.FI;
import f.MC0;
import f.Ry;
import f.uc_2;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/*
 * Renamed from f.ca0
 */
public class CriticalHitCalculator extends BaseDamageCalculator {
    public byte wb0;
    public String QN = "ERROR";

    public CriticalHitCalculator(Ry ry, ByteBuffer byteBuffer) {
        super(byteBuffer, ry, 20);
    }

    @Override
    public final void Oj0() {
        CriticalHitCalculator ca0_22 = this;
        ca0_22.wb0 = ca0_22.Rj.get();
        short s = ca0_22.Rj.getShort();
        byte[] byArray = new byte[s & 0xFFFF];
        this.Rj.get(byArray);
        byte[] byArray2 = FI.MH(byArray);
        try {
            ca0_22.QN = new String(byArray2, StandardCharsets.UTF_8);
        }
        catch (Exception exception) {
            this.wb0 = (byte)-1;
        }
    }

    @Override
    public final void os0() {
        CriticalHitCalculator ca0_22 = this;
        uc_2 uc_22 = ((Ry)ca0_22.uk).Al0;
        byte by = ca0_22.wb0;
        String string = ca0_22.QN;
        if (uc_22.RO == MC0.nh) {
            uc_2 uc_23 = uc_22;
            uc_22.iD = by;
            uc_23.Q8 = string;
            uc_23.RO = MC0.JK;
        }
    }
}
