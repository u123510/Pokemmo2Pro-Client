package f;

import cn.pokemmo.rom.nds.terrain.BwMapTerrainGrid;
import java.nio.ByteBuffer;

public final class dd_2 extends wa0_2 {
    public dd_2(short i1, Ae v2) {
        super();
        this.SM = i1;
        ByteBuffer v1 = v2.j90();
        int i2 = v1.getInt();
        this.It0 = v1.getShort();
        this.WH = v1.getShort();
        this.M70 = new int[this.It0][this.WH];
        for (int i3 = 0; i3 < this.WH; i3++) {
            for (int i4 = 0; i4 < this.It0; i4++) {
                this.M70[i4][i3] = v1.getInt();
            }
        }
        if (i2 == 1) {
            this.l1 = new int[this.It0][this.WH];
            for (int r = 0; r < this.WH; r++) {
                for (int c = 0; c < this.It0; c++) {
                    this.l1[c][r] = v1.getInt();
                }
            }
        }
    }
}
