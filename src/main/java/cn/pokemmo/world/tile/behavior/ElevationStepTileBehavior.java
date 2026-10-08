package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ElevationStepTileBehavior extends BaseTileBehavior {
    public final cy0_0 Z30;
    public final boolean XB;
    public final in_2 rF;

    public ElevationStepTileBehavior(cy0_0 v1) {
        super();
        this.rF = new in_2(125);
        this.Z30 = v1;
        this.XB = false;
    }

    public ElevationStepTileBehavior() {
        super();
        this.rF = new in_2(125);
        this.Z30 = cy0_0.Kt0;
        this.XB = true;
    }

    @Override
    public final void K40(bi0_1 v1, LT v2) {
        v1.getClass();
        if (v1 instanceof KF) {
            return;
        }
        if (!v2.fV() || tw0_0.LD0.nv()) {
            return;
        }
        if (this.XB && c8_0.JD0.YG() != 3) {
            return;
        }
        _else dw = v2.F2();
        if (dw.dw == 3) {
            short tile = J4.p5(dw.Bm0, dw.case$);
            if ((tile == 311 || tile == 411) && c8_0.JD0.YG() != 3) {
                return;
            }
        }
        if (v1 instanceof E90) {
            E90 e90 = (E90) v1;
            if (e90.St == 10 && e90.LY == 285) {
                return;
            }
        }
        v2.ZD0(new il0_1(this.Z30, v1.ba0.Y30, v1.ba0.Fc0, v1.oI0()));
    }

    @Override
    public final boolean xB(LT v1, LT v2, bi0_1 v3, byte i4) {
        v3.getClass();
        if (v3 instanceof KF) {
            return false;
        }
        if (!v1.fV()) {
            return false;
        }
        if (this.XB && c8_0.JD0.YG() != 3) {
            return false;
        }
        _else v1_else = v1.F2();
        if (v1_else.dw == 3) {
            short s = J4.p5(v1_else.Bm0, v1_else.case$);
            if ((s == 311 || s == 411) && c8_0.JD0.YG() != 3) {
                return false;
            }
        }
        if (v3.ki0() == 285 || v3.ki0() == 2850) {
            return false;
        }
        if (v3.Ou() && this.rF.ty0()) {
            tw0_0.RE0.IE((byte) 2, this.Z30.KG, (short) -1, true, 0.0f, 1.0f, 0.35f, 0);
        }
        return false;
    }

    @Override
    public final boolean Xc() {
        if (this.Z30 == cy0_0.Vr0) {
            return false;
        }
        return !((Object) this instanceof e3_0);
    }

    @Override
    public final int zd0(boolean i1) {
        if (i1 && this.Z30 == cy0_0.Vr0) {
            return 600;
        }
        return 0;
    }
}
