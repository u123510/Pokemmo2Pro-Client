package cn.pokemmo.battle.calc;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.calc.BaseDamageCalculator;

import java.nio.ByteBuffer;

public class PhysicalSpecialSplitCalculator extends BaseDamageCalculator {
    public zq_2 jn;
    public int T80;
    public byte[] jx;
    public byte Zr0;
    public byte[] KA0;
    public String Es0;
    public int kK;
    public lp_1[] HQ;

    public PhysicalSpecialSplitCalculator(Ry source, ByteBuffer data) {
        super(data, source, 3);
        this.Zr0 = 0;
        this.KA0 = null;
    }

    @Override
    public final void Oj0() {
        byte opcode = this.Rj.get();
        if (zq_2.b0.dg(opcode)) {
            this.jn = (zq_2) zq_2.b0.BM(opcode);
        } else {
            this.jn = zq_2.XG0;
        }
        if (this.jn != zq_2.qz) {
            return;
        }
        this.T80 = this.Rj.getInt();
        this.jx = new byte[this.Rj.get() & 255];
        this.Rj.get(this.jx);
        this.Zr0 = this.Rj.get();
        this.KA0 = new byte[this.Rj.get() & 255];
        this.Rj.get(this.KA0);
        this.Es0 = this.q60();
        this.kK = this.Rj.getInt();
        this.HQ = new lp_1[this.Rj.get() & 255];
        for (int index = 0; index < this.HQ.length; index++) {
            this.HQ[index] = this.uu0();
        }
    }

    @Override
    public final void pF0() {
        if (this.jn == zq_2.qz) {
            ((Ry) this.uk).gv0 = 4;
        }
    }

    @Override
    public final void os0() {
        Ry source = (Ry) this.uk;
        uc_2 state = source.Al0;
        np_0 target = null;
        for (np_0 candidate : state.w80) {
            if (candidate.rg == this.Zr0) {
                target = candidate;
                break;
            }
        }
        if (this.KA0 != null && target != null) {
            target.kF0 = this.KA0;
            target.YH = this.Es0;
            target.Lq = this.kK;
            target.ub = this.HQ;
        }
        state.Jt(this.jn, this.T80, this.jx);
    }
}
