package cn.pokemmo.world.entity;

import f.*;

public class WorldNpcEntityModel extends Ll0 {
    public final ZQ AH;

    public WorldNpcEntityModel(XF0 map, ZQ data, short x, short y, byte layer) {
        super(map, data, x, y, layer);
        this.AH = data;
        this.dH = this.switch$();
        this.yH0();
    }

    public final boolean rK0() { return false; }

    public final boolean LPt1() {
        short value = this.Kv();
        if (value == 105) return false;
        if (value >= 90 && value <= 94) return true;
        return ((byte)this.dH & 0x80) != 0;
    }

    public final boolean V50(byte ignored) {
        short value = this.Kv();
        return value == 21 || value == 19 || value == 16 || value == 17;
    }

    public final boolean fV() {
        byte value = this.re();
        return value == 33 || value == (byte)-88 || value == (byte)-87;
    }

    public byte re() { return (byte)this.Kv(); }

    public short Kv() {
        return this.AH.Jk[this.Sm & 0xff][0][this.op0][this.ev0];
    }

    public short switch$() {
        return this.AH.Jk[this.Sm & 0xff][1][this.op0][this.ev0];
    }

    public final void yH0() {
        XF0 map = this.zN;
        if (map.dw == 3) {
            short value = J4.p5(map.Bm0, map.case$);
            switch (value) {
                case 573: this.Ds0 = 289.0f; return;
                case 574: this.Ds0 = 257.0f; return;
                case 575: this.Ds0 = 225.0f; return;
                case 576: this.Ds0 = 193.0f; return;
                case 577: this.Ds0 = 161.0f; return;
                case 578: this.Ds0 = 129.0f; return;
                case 579: this.Ds0 = 115.0f; return;
                case 580: this.Ds0 = 65.0f; return;
                case 581: this.Ds0 = 65.0f; return;
                case 582: this.Ds0 = 1.0f; return;
                case 583: this.Ds0 = 65.0f; return;
                default: break;
            }
        }
        this.AH.nk();
        this.Ds0 = this.AH.Np.a80(this.Sm, this.op0, this.ev0);
    }
}
