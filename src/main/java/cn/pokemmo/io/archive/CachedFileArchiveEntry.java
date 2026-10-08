package cn.pokemmo.io.archive;

import f.Dn0;
import f.ws_0;

/**
 * 归档文件缓存条目描述符
 */
public class CachedFileArchiveEntry {
    public final ws_0 kl;
    public final Dn0 Wi;
    public final int dg0;
    public final boolean lF;

    public CachedFileArchiveEntry(Dn0 var1, int var2, boolean var3) {
        this.Wi = var1;
        this.dg0 = var2;
        this.lF = var3;
        this.kl = new ws_0(var1);
    }

    public boolean isValid() {
        if (this.Wi.RL()) {
            return false;
        } else {
            return !this.Wi.os0() ? false : this.kl.Vy0;
        }
    }

    public final boolean NC0() {
        return isValid();
    }

    public ws_0 getHandle() {
        return this.kl;
    }

    public final ws_0 hz() {
        return getHandle();
    }
}
