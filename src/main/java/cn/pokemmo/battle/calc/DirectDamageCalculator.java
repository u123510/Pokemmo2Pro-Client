package cn.pokemmo.battle.calc;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.calc.BaseDamageCalculator;

import java.nio.ByteBuffer;

public class DirectDamageCalculator extends BaseDamageCalculator {
    public zq_2 N5;
    public int tg0;

    public DirectDamageCalculator(Ry source, ByteBuffer data) {
        super(data, source, 0);
        this.tg0 = 0;
    }

    @Override
    public final void Oj0() {
        byte code = this.Rj.get();
        bm0_1 table = zq_2.b0;
        zq_2 value = table.dg(code) ? (zq_2) table.BM(code) : zq_2.XG0;
        this.N5 = value;
        if (value == zq_2.qz) {
            yo_1.RV = this.q60();
        } else if (value == zq_2.Z5 || value == zq_2.J2) {
            this.tg0 = this.Rj.getInt();
        }
    }

    @Override
    public final void pF0() {
        if (this.N5 == zq_2.qz) {
            ((Ry) this.uk).gv0 = 4;
        }
        if (this.N5 == zq_2.n80) {
            ((Ry) this.uk).gv0 = 3;
        }
    }

    @Override
    public final void os0() {
        ((Ry) this.uk).Al0.GG0(this.N5, this.tg0);
    }
}
