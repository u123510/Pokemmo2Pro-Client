package cn.pokemmo.audio;

import f.cq_0;
import f.gu0;
import f.mc0_1;
import f.mp_1;

public class ItemSoundBinding {
    public mc0_1 iS;
    public cq_0 hD;
    public final boolean lPT5;
    public final int ba0;

    public ItemSoundBinding(short s1, short s2, int i, boolean z) {
        if (s1 > 0) {
            this.iS = gu0.Az0().lPT6(s1);
        }
        if (s2 > 0) {
            this.hD = mp_1.vf0().W50(s2);
        }
        this.ba0 = i;
        this.lPT5 = z;
    }
}
