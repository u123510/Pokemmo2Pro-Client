package cn.pokemmo.battle.calc;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.calc.BaseDamageCalculator;

import java.nio.ByteBuffer;

public class FixedDamageCalculator extends BaseDamageCalculator {
    public vo0_0 IZ;

    public FixedDamageCalculator(Ry ry, ByteBuffer byteBuffer) {
        super(byteBuffer, ry, 0);
    }

    @Override
    public final void Oj0() {
        if ((this.Rj.get() & 0xFF) != 1) {
            this.IZ = null;
            return;
        }
        byte b = this.Rj.get();
        if (b < 0 || b >= DG.bG.length) {
            DG unused = DG.Z00;
            throw new RuntimeException(yr_1.pG("Could not find ", b));
        }
        switch (be_0.cY[DG.bG[b].Ux]) {
            case 1: {
                int i2 = this.Rj.getInt();
                Integer num = Integer.valueOf(this.Rj.getInt());
                int i4 = this.Rj.getInt();
                int i5 = this.Rj.getInt();
                String str = q60();
                q60();
                boolean z = (this.Rj.get() & 0xFF) > 0;
                this.IZ = new R00(i2, num, i4, i5, str, z);
                break;
            }
            case 2: {
                int i2 = this.Rj.getInt();
                LY ly = NK();
                LY ly2 = NK();
                if (ly.pf0() != ly2.pf0()) {
                    throw new IllegalArgumentException("Version mismatch while creating ip range");
                }
                uo0_0 uo0_0Var;
                if (ly.pf0() == 4) {
                    uo0_0Var = new wv_0(ly.nw0(), ly2.nw0());
                } else {
                    uo0_0Var = new zm0_0(ly.Hg(), ly2.Hg());
                }
                int i3 = this.Rj.getInt();
                int i4 = this.Rj.getInt();
                String str = q60();
                q60();
                boolean z = (this.Rj.get() & 0xFF) > 0;
                this.IZ = new jl0_0(i2, uo0_0Var, i3, i4, str, z);
                break;
            }
            case 3: {
                int i2 = this.Rj.getInt();
                Integer num = Integer.valueOf(this.Rj.getInt());
                int i4 = this.Rj.getInt();
                int i5 = this.Rj.getInt();
                String str = q60();
                q60();
                boolean z = (this.Rj.get() & 0xFF) > 0;
                this.IZ = new fr_1(i2, num, i4, i5, str, z);
                break;
            }
            default: {
                this.IZ = null;
                break;
            }
        }
    }

    @Override
    public final void os0() {
        if (this.IZ == null) {
            return;
        }
        ((Ry) this.uk).Al0.FF0 = this.IZ;
    }
}
