package cn.pokemmo.system;

import f.H40;
import f.Wr;
import f.bm0_1;

public class MemoryModelRegistry {
    public static final MemoryModelRegistry kB = new MemoryModelRegistry();
    public final bm0_1 Vp0 = new bm0_1();

    public static MemoryModelRegistry ow0() {
        return kB;
    }

    public static int ay(int i0) {
        return i0 & 255;
    }

    public void MH(byte i1, int i2, Wr v3) {
        H40 v4 = (H40) this.Vp0.BM(i1);
        if (v4 == null) {
            v4 = new H40();
            this.Vp0.gE0(i1, v4);
        }
        v4.dp0.j10(v4.dp0.yw0(i2), v3);
    }
}
