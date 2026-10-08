package cn.pokemmo.util.collection;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.lu_0
 */
public class Modern_Col_Lu0 {

    public Modern_Col_Lu0() {
        super();
    }

    public int jA;
    public int BY;
    public int[] Ky0;
    public int kf0;
    public int Y0;
    public int zi0;
    public int Nt;
    public int Xg;
    public int[] rl;

    public final int Em() {
        double d = this.jA;
        int n = (int)Math.floor(Math.pow(this.BY, 1.0 / d));
        while (true) {
            int n2;
            int n3 = 1;
            int n4 = 1;
            for (n2 = 0; n2 < this.jA; ++n2) {
                n3 *= n;
                n4 = (n + 1) * n4;
            }
            n2 = this.BY;
            if (n3 <= n2 && n4 > n2) {
                return n;
            }
            if (n3 > n2) {
                --n;
                continue;
            }
            ++n;
        }
    }
}


