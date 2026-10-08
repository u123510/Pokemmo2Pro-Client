package cn.pokemmo.battle.calc;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.calc.BaseDamageCalculator;

import java.nio.ByteBuffer;

public class SecondaryEffectDamageCalculator extends BaseDamageCalculator {
    public CH0 MR;
    public byte[] M30;
    public np_0 AF0;

    public SecondaryEffectDamageCalculator(ByteBuffer byteBuffer, Ry ry, int n) {
        super(byteBuffer, ry, n);
    }

    @Override
    public final void Oj0() {
        this.MR = this.pE();
        byte[] m30 = new byte[this.Rj.get() & 0xFF];
        this.Rj.get(m30);
        this.M30 = m30;
        byte i1 = this.Rj.get();
        String v2 = this.q60();
        byte[] v3 = new byte[this.Rj.get() & 0xFF];
        this.Rj.get(v3);
        String v4 = this.q60();
        int i5 = this.Rj.getInt();
        int i6 = this.Rj.getShort() & 0xFFFF;
        int i7 = this.Rj.getShort() & 0xFFFF;
        boolean i8 = (this.Rj.get() & 0xFF) == 1;
        lp_1[] v9 = new lp_1[0];
        if (this.L8 == 38) {
            int count = this.Rj.get() & 0xFF;
            v9 = new lp_1[count];
            for (int i = 0; i < count; i++) {
                v9[i] = this.uu0();
            }
        }
        np_0 np0 = new np_0(i1, v2, v3, v4, i5, i6, i7, i8);
        this.AF0 = np0;
        np0.ub = v9;
    }

    @Override
    public final void os0() {
        uc_2 v1 = ((Ry) this.uk).Al0;
        CH0 mr = this.MR;
        byte[] m30 = this.M30;
        np_0 af0 = this.AF0;
        MC0 v4 = v1.RO;
        if (v4 == MC0.rY || v4 == MC0.nh || v4 == MC0.JK || v4 == MC0.zM) {
            v1.RO = MC0.Ts0;
            v1.Qp = mr;
            v1.n60 = m30;
            v1.t9 = af0;
            if ("PTS".equalsIgnoreCase(af0.sz0)) {
                Ry v2 = v1.cp0;
                if (v2 != null) {
                    MC0 v3 = v1.RO;
                    if (v3 == MC0.Ts0 || v3 == MC0.YC) {
                        v2.E8(new Hg0(v1.Ik0, v1.T2, true, v1.QO, v1.E3));
                    }
                }
            }
        }
    }
}
