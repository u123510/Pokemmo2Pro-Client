package cn.pokemmo.graphics.image;

import f.LPT4_;

public abstract class GrayscalePixelGridProcessor {
    public LPT4_[][] dc0;

    public LPT4_[][] IK() {
        return this.dc0;
    }

    public void Hs() {
        for (int i1 = 0; i1 < this.dc0.length; i1++) {
            LPT4_[] row = this.dc0[i1];
            for (int i3 = 0; i3 < row.length; i3++) {
                int r = row[i3].Cc();
                int g = row[i3].TB0();
                int b = row[i3].tr();
                int avg = (g + b + r) / 3;
                int a = (row[i3].Lf0 >> 24) & 0xFF;
                row[i3] = new LPT4_(avg, avg, avg, a);
            }
        }
    }
}
