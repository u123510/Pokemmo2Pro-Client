package cn.pokemmo.world.entity;

import f.*;

public abstract class MapObjectPlacement extends LT implements Cloneable {
    public final XF0 zN;
    public final bm_1 ME;
    public final byte Sm;
    public float Ds0 = 0.0F;
    public short dH;
    public nt_1 WH = null;

    public MapObjectPlacement(XF0 map, bm_1 offset, short x, short y, byte layer) {
        super(x, y);
        this.zN = map;
        this.ME = offset;
        this.Sm = layer;
    }

    public static boolean HF(LT tile, bi0_1 entity, bH0 data, byte direction) {
        if (data.xX == -1) {
            return false;
        }

        nk_0 result;
        if (direction == 1) {
            result = nk_0.cOM9;
        } else if (direction == 2) {
            result = nk_0.pM;
        } else if (direction == 3) {
            result = nk_0.lpT8;
        } else {
            result = nk_0.t20;
        }

        if (data.Lm != 3 && data.Lm <= 6) {
            entity.il0.Zw(tile, true, new nk_0[] {result});
        } else {
            entity.il0.Zw(tile, true, new nk_0[] {result, result});
        }
        return true;
    }

    @Override
    public final short Tz() {
        return this.ME == null ? this.op0 : (short) (this.op0 + this.ME.OS());
    }

    @Override
    public final short HR() {
        return this.ME == null ? this.ev0 : (short) (this.ev0 + this.ME.Yl0());
    }

    @Override
    public final byte Es() {
        return this.Sm;
    }

    @Override
    public float S80() {
        return this.Ds0;
    }

    @Override
    public final void DZ(float value) {
        this.Ds0 = value;
    }

    public final void ae0(float value) {
        this.Ds0 += value;
    }

    @Override
    public final byte uj() {
        return (byte) this.dH;
    }

    @Override
    public final void HU(byte value, short ignored) {
        this.dH = value;
    }

    @Override
    public final boolean XC0(byte value) {
        return this.Sm == 0;
    }

    @Override
    public final boolean ut() {
        return this.V50((byte) 0);
    }

    @Override
    public final nt_1 u40() {
        if (this.WH != null) {
            return this.WH;
        }
        nt_1 type = lj_1.hO.fy0[this.zN.dw][this.re() & 255];
        return type != null ? type : lj_1.pF;
    }

    @Override
    public final void Mw(nt_1 value) {
        this.WH = value;
    }

    @Override
    public final boolean Wb0() {
        return true;
    }

    @Override
    public final _else F2() {
        return this.zN;
    }

    @Override
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
