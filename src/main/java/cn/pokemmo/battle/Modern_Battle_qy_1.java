package cn.pokemmo.battle;

import f.*;
import java.io.Serializable;

/**
 * 现代化重构类 - 原始混淆类: f.qy_1
 */
public class Modern_Battle_qy_1
implements S1,
Serializable {

    private static final long serialVersionUID = -1034234728574286014L;
    public final S1 lc0;

    public Modern_Battle_qy_1(SQ sQ) {
        this.lc0 = sQ;
    }

    public final int size() {
        return this.lc0.size();
    }

    public final boolean COm1(int n) {
        return this.lc0.COm1(n);
    }

    public final Object get(int n) {
        return this.lc0.get(n);
    }

    public final boolean equals(Object object) {
        return object == this || this.lc0.equals(object);
    }

    public final int hashCode() {
        return this.lc0.hashCode();
    }

    public final String toString() {
        return this.lc0.toString();
    }
}


