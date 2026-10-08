package cn.pokemmo.world.tile;

import f.CH0;
import f.G40;
import f.V10;

public class CompositeTileDescriptor extends G40 {
    public final V10[] n50;

    public CompositeTileDescriptor(V10... v10s) {
        this.n50 = v10s;
    }

    @Override
    public boolean Ob0() {
        for (V10 v : this.n50) {
            if (!v.Ob0()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void jA0(byte b, CH0 ch0) {
        for (V10 v : this.n50) {
            v.jA0(b, ch0);
        }
    }

    @Override
    public byte tQ() {
        return this.n50[0].pe0;
    }
}
