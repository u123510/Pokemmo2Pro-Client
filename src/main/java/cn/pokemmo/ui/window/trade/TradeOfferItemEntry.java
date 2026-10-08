package cn.pokemmo.ui.window.trade;

import f.*;

public class TradeOfferItemEntry extends LT {
    public short Qu;
    public byte Rk0;
    public db0_2 Z8;
    public final cn.pokemmo.world.render.GdxTileLayerRenderer Bz0;

    public TradeOfferItemEntry(short packed, cn.pokemmo.world.render.GdxTileLayerRenderer owner, short x, short y) {
        super(x, y);
        this.Qu = (short) (packed & -64513);
        this.Rk0 = (byte) (packed >> 10);
        this.Bz0 = owner;
    }

    @Override
    public final short xl0() {
        return this.Qu;
    }

    @Override
    public final byte uj() {
        return this.Rk0;
    }

    @Override
    public final db0_2 B3() {
        return this.Z8;
    }

    @Override
    public final byte Es() {
        byte result = (byte) ((this.Rk0 >> 2) - 1);
        return result == -8 ? (byte) 8 : result;
    }

    @Override
    public final boolean LPt1() {
        byte value = this.Rk0;
        return (value | 1) == value;
    }

    @Override
    public final boolean V50(byte value) {
        byte mode = this.Es();
        if (mode != 14 && mode != -2) {
            mode = this.Es();
            value = mode;
        }
        if (value == 0) {
            return true;
        }
        return this.Bz0.lm0 == gh_0.GM;
    }

    @Override
    public final boolean XC0(byte value) {
        if (this.Es() >= 3 || value >= 3) {
            return false;
        }
        nt_1 result = this.u40();
        result.getClass();
        return !(result instanceof Ir0);
    }

    @Override
    public final boolean ut() {
        return this.Es() == 0;
    }

    @Override
    public final void HU(byte mode, short slot) {
        db0_2 tile = this.Bz0.LL0.w3[slot];
        if (tile == null) {
            return;
        }
        this.Qu = slot;
        this.Rk0 = mode;
        this.Z8 = tile;
    }

    @Override
    public final byte re() {
        return this.Z8.oB;
    }

    @Override
    public final boolean Wb0() {
        return false;
    }

    @Override
    public final nt_1 u40() {
        cn.pokemmo.world.render.GdxTileLayerRenderer owner = this.Bz0;
        if (owner == null || this.Z8 == null) {
            return lj_1.pF;
        }
        int layer = owner.dw;
        nt_1 value = lj_1.hO.fy0[layer][this.Z8.oB & 255];
        return value != null ? value : lj_1.pF;
    }

    @Override
    public final _else F2() {
        return this.Bz0;
    }
}
