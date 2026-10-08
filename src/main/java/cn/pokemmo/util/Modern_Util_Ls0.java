package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Ls0
 */
public class Modern_Util_Ls0 {
    public final String Km0;
    public final int Em0;

    public Modern_Util_Ls0(String tag) {
        this(tag, 1);
    }

    public Modern_Util_Ls0(String tag, int level) {
        this.Km0 = tag;
        this.Em0 = level;
    }

    public final void QR(String message) {
        if (this.Em0 >= 3) {
            Dt0 client = lg_0.k;
            if (client.ai >= 3) {
                client.eA.getClass();
                System.out.println("[" + this.Km0 + "] " + message);
            }
        }
    }

    public final void Lj(String message) {
        if (this.Em0 >= 2) {
            lg_0.k.k7(this.Km0, message);
        }
    }

    public final int iq0() {
        return this.Em0;
    }
}
