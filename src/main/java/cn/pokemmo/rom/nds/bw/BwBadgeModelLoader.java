package cn.pokemmo.rom.nds.bw;

import f.*;
import java.util.Arrays;

public class BwBadgeModelLoader {
    public static final dl_1 fo0;
    public static ob0_0 sr;
    public final AG0[][] Zc0;
    public AG0[] lI;
    public AG0 es0;
    public Wr[][] Hw0;
    public Wr G60;
    public final Wr[] h30;

    public BwBadgeModelLoader() {
        this.Zc0 = new AG0[5][8];
        this.lI = new AG0[16];
        Arrays.fill(this.lI, AG0.HH0);
        this.h30 = new Wr[25];
        Arrays.fill(this.h30, Wr.Mk0);
    }

    public static ob0_0 Ui0() {
        if (sr == null) {
            sr = new ob0_0();
        }
        return sr;
    }

    static {
        fo0 = Cq0.E1(BwBadgeModelLoader.class);
    }

    public final void coM4(nj0_0 source) {
        FJ first = new FJ((Ae)source.fd0.dg.get("/a/0/8/3"));
        for (int index = 0; index < this.h30.length; index++) {
            this.h30[index] = new Wr(new E4(first, index));
        }
        this.es0 = new AG0(new Wr(new iv_0(first)), 0, 0, 8, 8);

        FJ second = new FJ((Ae)source.fd0.dg.get("/a/0/7/8"));
        int width = 45;
        this.Hw0 = new Wr[5][width];
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < width; column++) {
                this.Hw0[row][column] = new Wr(new H10(second, column, row));
            }
        }
    }

    public final AG0 tG0(byte row, int column) {
        AG0[] values = this.Zc0[row];
        if (values == null || values.length <= column) {
            return null;
        }
        return values[column];
    }

    public final AG0 K5() {
        return this.es0;
    }

    public final Wr lq0(int row, int column) {
        if (this.Hw0 == null || row < 0 || row >= this.Hw0.length) {
            return null;
        }
        Wr[] values = this.Hw0[row];
        if (values == null || column < 0 || column >= values.length) {
            return null;
        }
        return values[column];
    }

    public final Wr W6(byte index) {
        if (index < 0 || index >= this.h30.length) {
            index = 0;
        }
        return this.h30[index];
    }
}
