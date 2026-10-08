package cn.pokemmo.battle;

import f.*;
import java.util.HashSet;

/**
 * 现代化重构类 - 原始混淆类: f.CG
 */
public abstract class Modern_Battle_Cg {

    public Modern_Battle_Cg() {
        super();
    }

    public long Ik = hk0_1.lQ();
    public HashSet Qw = null;

    public final void YX() {
        this.Ik = hk0_1.KG;
    }

    public long cOm2() {
        return this.Ik;
    }

    public abstract void ji0();

    public final void O50(Object object) {
        if (this.Qw == null) {
            this.Qw = new HashSet();
        }
        this.Qw.add(object);
    }

    public final void sI0(Object object) {
        HashSet hashSet = this.Qw;
        if (hashSet == null) {
            return;
        }
        hashSet.remove(object);
        if (this.Qw.isEmpty()) {
            this.Qw = null;
        }
    }

    public boolean Mt0() {
        HashSet hashSet = this.Qw;
        return hashSet != null && !hashSet.isEmpty();
    }
}


