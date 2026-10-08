package cn.pokemmo.util.logging;

import f.Cq0;
import f.dl_1;
import java.io.Serializable;

public abstract class SerializableLogger implements dl_1, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    public Object readResolve() {
        return Cq0.t00("NOP");
    }
}
