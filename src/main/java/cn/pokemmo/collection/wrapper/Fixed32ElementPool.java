package cn.pokemmo.collection.wrapper;

import f.wV;

public class Fixed32ElementPool {
    public final wV Bw;
    public final wV[] Ub;

    public Fixed32ElementPool() {
        this.Bw = new wV();
        this.Ub = new wV[32];
        for (int i = 0; i < this.Ub.length; i++) {
            this.Ub[i] = new wV();
        }
    }
}
