package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.NJ0
 */
public class Modern_Util_Nj0 {

    public final boolean hW;
    public final byte LPt6;
    public final int Wn;
    public final int LB0;
    public final byte Qd0;
    public final int Er;
    public final int OD;

    public Modern_Util_Nj0(byte by, int n, int n2, boolean bl) {
        this.hW = bl;
        this.LPt6 = by;
        this.Wn = n;
        this.LB0 = n2;
        this.Qd0 = 0;
        this.Er = 0;
        this.OD = 0;
        if (!bl) {
            return;
        }
        throw new RuntimeException();
    }

    public Modern_Util_Nj0(boolean bl, byte by, byte by2, int n, int n2) {
        this.hW = bl;
        this.LPt6 = by;
        this.Qd0 = by2;
        this.Er = n;
        this.OD = n2;
        this.Wn = 0;
        this.LB0 = 0;
        if (bl) {
            return;
        }
        throw new RuntimeException();
    }
}


