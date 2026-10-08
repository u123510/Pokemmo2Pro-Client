package cn.pokemmo.net.session;

import f.CH0;
import f.si_0;
import java.util.HashMap;

public class SessionMapContainer {
    public CH0 Ku0;
    public final HashMap<CH0, si_0> Wc;

    public SessionMapContainer(CH0 v1) {
        this.Wc = new HashMap<CH0, si_0>();
        this.Ku0 = v1;
    }

    public boolean W(CH0 v1) {
        return this.Wc.containsKey(v1);
    }

    public si_0 EC0(CH0 v1) {
        return this.Wc.get(v1);
    }

    public si_0[] yJ() {
        return (si_0[]) this.Wc.values().toArray(new si_0[0]);
    }
}
