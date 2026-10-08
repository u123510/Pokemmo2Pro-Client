package cn.pokemmo.util.collection;

import f.*;
import java.util.HashMap;

/**
 * 现代化重构类 - 原始混淆类: f.pk_0
 */
public class Modern_Col_pk_0 {

    public final pe_0 mn0;
    public final HashMap VJ0;
    public boolean Ov;

    public Modern_Col_pk_0(pe_0 pe_0Var) {
        this.VJ0 = new HashMap();
        this.mn0 = pe_0Var;
    }

    public final void eG0(ce0_0 ce0_0Var) {
        synchronized (this.VJ0) {
            this.VJ0.put(ce0_0Var.YX, ce0_0Var);
        }
        this.Ov = true;
    }

    public final String kP() {
        return this.mn0.lt0;
    }

    public final pe_0 VE0() {
        return this.mn0;
    }

    public final ce0_0[] UH() {
        synchronized (this.VJ0) {
            return (ce0_0[]) this.VJ0.values().toArray(new ce0_0[0]);
        }
    }

    public final ce0_0 ci(CH0 ch0) {
        synchronized (this.VJ0) {
            return (ce0_0) this.VJ0.get(ch0);
        }
    }

    public final boolean MH0(CH0 ch0) {
        synchronized (this.VJ0) {
            return this.VJ0.containsKey(ch0);
        }
    }

    public final pg0_0 hn(CH0 ch0) {
        synchronized (this.VJ0) {
            ce0_0 ce0_0Var = (ce0_0) this.VJ0.get(ch0);
            if (ce0_0Var == null) {
                return null;
            }
            return ce0_0Var.qf0;
        }
    }

    public final String Ha0(pg0_0 pg0_0Var) {
        String str = this.mn0.j7[pg0_0Var.b8];
        if (!str.isEmpty()) {
            return str;
        }
        return sm0_0.c0(pg0_0Var.r20);
    }

    public final boolean Nr0(CH0 ch0, short s) {
        ce0_0 ce0_0Var = ci(ch0);
        if (ce0_0Var == null) {
            return false;
        }
        return this.mn0.vN(ce0_0Var.qf0, s);
    }

    public final boolean gJ0() {
        if (this.Ov) {
            this.Ov = false;
            return true;
        }
        return false;
    }
}

