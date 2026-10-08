package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.dy_1
 */
public class Modern_Battle_Dy1 {

    public Modern_Battle_Dy1() {
        super();
    }

    public static final dl_1 jH0 = Cq0.E1(dy_1.class);
    public int r6 = 0;
    public boolean K50 = false;
    public int coM5 = -1;
    public int yJ0;
    public int sB0 = 0;

    public final int mi0() {
        if (this.K50) {
            int n;
            int n2 = this.r6 - ((int)(System.currentTimeMillis() / 1000L) - this.yJ0);
            if (n2 < 0) {
                n2 = 0;
            }
            if ((n = this.coM5) > 0 && n2 > n) {
                n2 = n;
            }
            return n2;
        }
        int n = this.r6;
        if (n < 0) {
            return 0;
        }
        return n;
    }
}


