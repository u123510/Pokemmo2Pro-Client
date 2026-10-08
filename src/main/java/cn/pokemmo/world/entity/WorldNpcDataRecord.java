package cn.pokemmo.world.entity;

import f.*;

public class WorldNpcDataRecord extends qj0_1 implements bm_1 {
    public final short mJ;
    public final short gp;
    public final sr0_0[][][] tI0;

    public WorldNpcDataRecord(short x, short y, XF0 map, qj0_1 source, wa0_2 data) {
        super(source);
        this.tI0 = new sr0_0[this.Jk.length][this.qB0][this.N70];
        for (byte layer = 0; layer < this.Jk.length; layer++) {
            for (short row = 0; row < this.qB0; row++) {
                for (short column = 0; column < this.N70; column++) {
                    this.tI0[layer][row][column] = new sr0_0(map, (ZQ) (Object) this, row, column, layer);
                }
            }
        }
        this.mJ = (short) (x * this.qB0 + data.Iz0);
        this.gp = (short) (y * this.N70 + data.Ig);
    }

    @Override
    public final Ll0 n5(byte layer, short row, short column) {
        sr0_0[][][] values = this.tI0;
        if (values == null) {
            throw new RuntimeException("Not properly init");
        }
        if (row < 0 || column < 0 || layer < 0 || layer >= values.length
                || row >= this.qB0 || column >= this.N70) {
            return null;
        }
        return values[layer][row][column];
    }

    @Override
    public final short OS() {
        return this.mJ;
    }

    @Override
    public final short Yl0() {
        return this.gp;
    }

    @Override
    public final ab0_2 wj0() {
        return this;
    }
}
