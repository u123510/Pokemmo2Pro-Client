package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.kd_1
 */
public abstract class Modern_Battle_Kd1
extends ij0_0 {

    static final long serialVersionUID = 1L;
    public transient byte[] Ut;

    public Modern_Battle_Kd1() {
    }

    public Modern_Battle_Kd1(int n) {
        this(n, 0);
    }

    public Modern_Battle_Kd1(int n, int n2) {
        Modern_Battle_Kd1 kd_12 = this;
        int n3 = Math.max(1, n);
        kd_12.na0 = 0.5f;
        kd_12.La(JS.Hf((float)n3 / 0.5f));
    }

    public final int uT() {
        return this.Ut.length;
    }

    public void dx0(int n) {
        int n2;
        Modern_Battle_Kd1 kd_12 = this;
        kd_12.Ut[n] = 2;
        n = kd_12.Rv;
        kd_12.Rv = n2 = n - 1;
        if (kd_12.yk0 != 0.0f) {
            int n3;
            Modern_Battle_Kd1 kd_13 = this;
            kd_13.Gj = n3 = kd_13.Gj - 1;
            if (!kd_13.o00 && n3 <= 0) {
                Modern_Battle_Kd1 kd_14 = this;
                kd_14.Pl(g00_0.Ql(Math.max(n, JS.Hf((float)n2 / this.na0) + 1)));
                kd_14.Sf0(kd_14.uT());
                if (kd_14.yk0 != 0.0f) {
                    Modern_Battle_Kd1 kd_15 = this;
                    kd_15.ov0(kd_15.Rv);
                }
            }
        }
    }

    public int La(int n) {
        int n2 = g00_0.Ql(n);
        this.Sf0(n2);
        this.ov0(n);
        this.Ut = new byte[n2];
        return n2;
    }
}


