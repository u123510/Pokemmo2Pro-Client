package cn.pokemmo.collection.wrapper;

import f.SQ;
import f.ht_0;

public class DualRegistryMapStore {
    public final SQ X80;
    public final SQ Zm0;

    public DualRegistryMapStore() {
        this.X80 = new SQ();
        this.Zm0 = new SQ();
    }

    public void Dp(int i, ht_0 ht_0, boolean z) {
        if (z) {
            this.Zm0.j10(this.Zm0.yw0(i), ht_0);
        } else {
            this.X80.j10(this.X80.yw0(i), ht_0);
        }
    }
}
