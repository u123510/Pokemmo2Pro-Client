package cn.pokemmo.battle;

import f.*;
import java.io.Serializable;

/**
 * 现代化重构类 - 原始混淆类: f.w0_0
 */
public class Modern_Battle_w0_0
implements Serializable {

    private static final long serialVersionUID = -4019969926331717380L;
    public int ft;
    public int t90;

    public Modern_Battle_w0_0() {
    }

    public Modern_Battle_w0_0(int n, int n2) {
        this.ft = n;
        this.t90 = n2;
    }

    public Modern_Battle_w0_0(w0_0 w0_02) {
        this.ft = w0_02.ft;
        this.t90 = w0_02.t90;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && object.getClass() == w0_0.class) {
            object = (w0_0)object;
            return this.ft == ((w0_0)object).ft && this.t90 == ((w0_0)object).t90;
        }
        return false;
    }

    public final int hashCode() {
        return (53 + this.ft) * 53 + this.t90;
    }

    public final String toString() {
        return fp0_0.uD(new StringBuilder("(").append(this.ft).append(", "), this.t90, ")");
    }
}


