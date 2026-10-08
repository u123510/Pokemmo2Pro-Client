package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.CF
 */
public class Modern_Util_Cf {

    public Modern_Util_Cf() {
        super();
    }

    public int l10 = 1;
    public int PK = 0;
    public int p80 = 0;
    public int vf0 = 0;
    public int LR = 0;
    public int qI = 0;
    public int pd0 = 0;
    public int Kc0 = 0;
    public yb0_2 J9 = new yb0_2(1, (CF)this);
    public final in_2 tw = new in_2(60000).ng0();

    public final void Tv(int n, int n2) {
        if (this.pd0 == 2) {
            n = this.LR + n;
            n2 = this.qI + n2;
            if (n < 0) {
                n = 2;
            } else if (n > 2) {
                n = 0;
            }
            if (n2 < 0) {
                n2 = 1;
            } else if (n2 > 1) {
                n2 = 0;
            }
            if (n == 2) {
                n2 = 1;
            }
            Modern_Util_Cf cF = this;
            cF.LR = n;
            cF.qI = n2;
        } else {
            Modern_Util_Cf cF = this;
            cF.zr(cF.p80 + n, this.vf0 + n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zr(int n, int n2) {
        if (this.J9.KG0()) {
            return;
        }
        if (n < 0) {
            n = 4;
        } else if (n > 4) {
            n = 0;
        }
        if (n2 < 0) {
            n2 = 5;
        } else if (n2 > 5) {
            n2 = 0;
        }
        if (n2 == 5 && (this.vf0 != 5 || this.pd0 != 0) || n2 == 5 && n > 1) {
            n = 0;
        }
        Modern_Util_Cf cF = this;
        cF.p80 = n;
        cF.vf0 = n2;
    }
}


