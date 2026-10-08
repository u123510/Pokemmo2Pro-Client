package cn.pokemmo.graphics.texture;

import f.*;

public class TextureAtlasSubregionData {
    public final byte eA;
    public byte JE;
    public byte q8;
    public boolean rh0;
    public boolean zA;
    public boolean fX;
    public nk_0[] mH0;
    public boolean Bn0;
    public boolean kJ;

    public TextureAtlasSubregionData(byte value) {
        super();
        this.JE = 0;
        this.q8 = 0;
        this.rh0 = false;
        this.zA = false;
        this.fX = false;
        this.Bn0 = false;
        this.kJ = true;
        this.eA = value;
        this.mH0 = new nk_0[0];
    }

    public TextureAtlasSubregionData(byte first, byte second, nk_0... values) {
        super();
        this.q8 = 0;
        this.rh0 = false;
        this.zA = false;
        this.fX = false;
        this.Bn0 = false;
        this.kJ = true;
        this.eA = first;
        this.JE = second;
        this.instanceof$(values);
    }

    public final void instanceof$(nk_0... values) {
        this.mH0 = values;
        for (int index = 0; index < values.length; index++) {
            nk_0 value = values[index];
            if (value == null || value.Cb0 <= 0) {
                continue;
            }
            if (value.ml0 != 1 && value.ml0 != 0) {
                this.Bn0 = true;
            } else {
                this.kJ = true;
            }
            this.q8 = (byte) (this.q8 | (1 << value.ml0));
        }
    }

    public final byte Q() {
        return this.eA;
    }

    public final void My0(byte value) {
        this.JE = value;
    }

    public final byte oH() {
        return this.JE;
    }

    public int oH0() {
        return rg0_2.j40(1000, 1500);
    }

    public nk_0 Gs(int first, int second, int third) {
        return null;
    }

    public boolean KR(short x1, short y1, short x2, short y2, int dx, int dy) {
        if (x1 == x2 && y1 == y2) {
            return true;
        }
        if (!this.Bn0) {
            dx = 0;
        } else if (this.fX && dx < 1) {
            dx = 1;
        }
        if (!this.kJ) {
            dy = 0;
        } else if (this.fX && dy < 1) {
            dy = 1;
        }
        if (Math.abs(x1 - x2) > dx) {
            return false;
        }
        return Math.abs(y1 - y2) <= dy;
    }

    public final void oQ() {
        this.rh0 = true;
    }

    public final void qC0(boolean value) {
        this.fX = value;
    }

    public boolean G9() {
        return (Object) this instanceof m8;
    }

    public dd_1 Qr(byte ignored) {
        return (dd_1) (Object) this;
    }
}
