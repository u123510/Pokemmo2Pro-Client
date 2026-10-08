package cn.pokemmo.rom.nds.bw;

import f.*;
public class BwMusicalPropModelLoader {
    public static final yj_0 ne0;
    public final Wr[] nC0;
    public final Wr[] oe0;

    public BwMusicalPropModelLoader() {
        this.nC0 = new Wr[3];
        this.oe0 = new Wr[3];
    }

    static {
        ne0 = new yj_0();
    }

    public final void Wm0(nj0_0 source) {
        FJ first = new FJ((Ae) source.fd0.dg.get("/a/2/0/2"));
        for (int i = 0; i < 2; i++) {
            this.nC0[i] = new Wr(new U6(first, i));
        }

        FJ second = new FJ((Ae) source.fd0.dg.get("/a/2/0/6"));
        for (int i = 0; i < 2; i++) {
            this.oe0[i] = new Wr(new fg_0(second, i));
        }
    }

    public final Wr zt(int index) {
        if (index < 0 || index > this.nC0.length) {
            index = 0;
        }
        this.nC0[index].ji0();
        return this.nC0[index];
    }

    public final Wr ZV(int index) {
        if (index < 0 || index > this.oe0.length) {
            index = 0;
        }
        return this.oe0[index];
    }
}
