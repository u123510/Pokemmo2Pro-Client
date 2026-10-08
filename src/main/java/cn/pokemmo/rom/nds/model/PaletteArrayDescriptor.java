package cn.pokemmo.rom.nds.model;

import f.CE;
import f.gc_2;
import f.rz_0;

public class PaletteArrayDescriptor {
    public final CE xh;
    public final rz_0 HP;
    public final short[] uy;

    public PaletteArrayDescriptor(CE ce, rz_0 rz_0, short[] sArr) {
        if (sArr.length == gc_2.Wp.length) {
            this.xh = ce;
            this.HP = rz_0;
            this.uy = sArr;
            return;
        }
        throw new IllegalArgumentException();
    }
}
