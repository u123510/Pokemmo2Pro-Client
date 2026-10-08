package cn.pokemmo.ui.window.trade;

import f.*;

public class TradeOfferSummaryPanel extends LT {
    public final byte vf;
    public final byte u70;
    public final byte ci;
    public float LPT6;
    public final _else bD;

    public TradeOfferSummaryPanel(_else type, byte flags, short x, short y, byte index, byte mode, float value) {
        super(x, y);
        this.bD = type;
        this.vf = flags;
        this.u70 = mode;
        this.ci = index;
        this.LPT6 = value;
    }

    @Override
    public final byte Es() {
        return this.vf;
    }

    @Override
    public final _else F2() {
        return this.bD;
    }

    @Override
    public final byte uj() {
        return this.u70;
    }

    @Override
    public final byte re() {
        return this.ci;
    }

    @Override
    public final boolean LPt1() {
        return (this.u70 & 1) != 0;
    }

    @Override
    public final nt_1 u40() {
        nt_1 value = lj_1.hO.fy0[10][this.ci & 255];
        return value != null ? value : lj_1.pF;
    }

    @Override
    public final float S80() {
        return this.LPT6;
    }

    @Override
    public final void DZ(float value) {
        if (this.LPT6 == value) {
            return;
        }
        this.LPT6 = value;
    }

    @Override
    public final boolean Wb0() {
        return true;
    }
}
